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
//		Gongren gr= new Gongren();//newһ����������ø���Ҳ����ֱ�������෽������newһ���µ�
//		gr.setGongrengongzi(3000);//ͨ��set������ֵ
//		gr.setGongren(g);
//		Yuangong jl=new Jingli();
//		jl.setJingligongzi(5000);
//		jl.setJingli(j);
		System.out.print("���ˣ�"+gr.getGongren()+"     ����:"+gr.getGongrengongzi()+"\n����:"+jl.getJingli()+"      ������:"+jl.getJingligongzi());
		//ͨ��get�����set�е�ֵ��
		
	
	gr.dagong();
	gr.day();
	jl.dagong();
	jl.day();
		
		
		
	}

}
