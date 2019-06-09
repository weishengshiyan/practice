package extends_ex;

import java.util.jar.Attributes.Name;

abstract class Yuangong {
	
	private  int  jingligongzi;
	private  String  jingli;
	private  String  gongren;
	private  int  gongrengongzi;
	public Yuangong() {}
	
		
	public int getJingligongzi() {
		return jingligongzi;
	}
	public void setJingligongzi(int jingligongzi) {
		this.jingligongzi = jingligongzi;
	}
	public String getJingli() {
		return jingli;
	}
	public void setJingli(String jingli) {
		this.jingli = jingli;
	}
	public String getGongren() {
		return gongren;
	}
	public void setGongren(String gongren) {
		this.gongren = gongren;
	}
	public int getGongrengongzi() {
		return gongrengongzi;
	}
	public void setGongrengongzi(int i) {
		this.gongrengongzi = i;
	}
	
public Yuangong(int ingligongzi, String jingli,String gongren,int gongrengongzi ) {

	
	this.jingligongzi=jingligongzi;
	this.jingli=jingli;
	this.gongren=gongren;
	this.gongrengongzi=gongrengongzi;
	
}
abstract void dagong();//抽象的类，在子类中进行覆盖，在子类中进行加工覆盖。
public void day() { //成员方法，在父类中填写，可以直接调用的。
	System.out.print("\n一天工作八个小时");
	
}
}

	
	
	
	
	

