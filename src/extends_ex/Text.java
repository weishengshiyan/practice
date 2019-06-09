package extends_ex;

import java.util.Set;

public class Text {
	public static void main(String args[]) {
//		String g="zhangshan";
//		String j="lisi";
		String jingli;
		String gongren;
		int gongrengongzi;
		int jingligongzi;
		jingli="wang";
		gongren="li";
		gongrengongzi=6;
		jingligongzi=3;
		
		Jingli jl =new Jingli(jingligongzi, jingli, gongren, gongrengongzi);
		
		
		Gongren gr=new Gongren(jingligongzi, jingli, gongren, gongrengongzi);
//		Gongren gr= new Gongren();//new一个对象可以用父类也可以直接用子类方法经行new一个新的
//		gr.setGongrengongzi(3000);//通过set来设置值
//		gr.setGongren(g);
//		Yuangong jl=new Jingli();
//		jl.setJingligongzi(5000);
//		jl.setJingli(j);
		System.out.print("工人："+gr.getGongren()+"     工资:"+gr.getGongrengongzi()+"\n经理:"+jl.getJingli()+"      经理工资:"+jl.getJingligongzi());
		//通过get来获得set中的值。
		
	
	gr.dagong();
	gr.day();
	jl.dagong();
	jl.day();
		
		
		
	}

}
