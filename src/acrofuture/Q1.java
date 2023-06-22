package acrofuture;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1 {
	
	List<Logdata> datalist = new ArrayList<Logdata>();
	
	public Q1(){
		String inputstring = "1622025201 REQUEST 10001 192.168.0.1\r\n"
				+ "1622025202 REQUEST 10002 192.168.0.2\r\n"
				+ "1622025203 REQUEST 10003 192.168.0.1\r\n"
				+ "1622025211 RESPONSE 10003\r\n"
				+ "1622025212 RESPONSE 10002\r\n"
				+ "1622025213 RESPONSE 10001\r\n"
				+ "1622025221 REQUEST 10004 192.168.0.2\r\n"
				+ "1622025223 REQUEST 10005 192.168.0.2\r\n"
				+ "1622025230 RESPONSE 10004\r\n"
				+ "1622025231 REQUEST 10006 192.168.0.3\r\n"
				+ "1622025236 RESPONSE 10006";

			String[] inputarray = inputstring.split("\r\n") ;
			
			for(String eachdata : inputarray) {
				String[] elements = eachdata.split(" ");
				if(elements.length==4) {
					datalist.add(new Logdata(new Timestamp(Long.parseLong(elements[0])),elements[1],elements[2],elements[3]));
				}else {
					datalist.add(new Logdata(new Timestamp(Long.parseLong(elements[0])),elements[1],elements[2]));
				}
			}
		
				
	}

	public void task01() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(Logdata lg : datalist) {
			if(lg.getType().equals("REQUEST")) {
				if(map.get(lg.getIp())!=null) {
					map.put(lg.getIp(), map.get(lg.getIp())+1);
				}else {
					map.put(lg.getIp(),1);
				}
			}
		}
		for(String ip : map.keySet()) {
			System.out.println(ip + " ("+ map.get(ip) + ")");
		}
	}
	
	public List<Logdata> task02() {
		List<Logdata> datalist2=datalist;
		List<Logdata> result=new ArrayList<Logdata>();
		
		for(int i=0;i<datalist2.size();) {
			Logdata req = null;
			Logdata res = null;
			if(datalist2.get(i).getType().equals("REQUEST"))  {
				req = datalist2.remove(i);
				for(int j=i;j<datalist2.size();j++) {
					if(datalist2.get(j).getId().equals(req.getId())) {
						res = datalist2.remove(j);
						long leadTimeInMillis = res.getTime().getTime() - req.getTime().getTime();
		                req.setLeadTime((leadTimeInMillis ) + "sec");
						break;
						}
				}
				result.add(req);
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Q1 q1= new Q1();
		q1.task01();
		for(Logdata lg :q1.task02()) {
			System.out.println(lg.getId() + " "+lg.getTime().getTime()+ " "+lg.getLeadTime());
		}
		
	}
	
}

class Logdata {
	Timestamp time;
	String type;
	String id;
	String ip;
	String leadTime ="FAIL";
	
	public Logdata() {
		super();
	}
	
	public Logdata(Timestamp time, String type, String id) {
		super();
		this.time = time;
		this.type = type;
		this.id = id;
	}
	public Logdata(Timestamp time, String type, String id, String ip) {
		super();
		this.time = time;
		this.type = type;
		this.id = id;
		this.ip = ip;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLeadTime() {
		return leadTime;
	}

	public void setLeadTime(String leadTime) {
		this.leadTime = leadTime;
	}


}