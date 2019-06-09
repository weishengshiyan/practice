package qunsuo;

public class Sumall {
	public static void main(String[] args) {
//	double n1=1;//用来保存循环，和再次调用。
//	double n2=1;
//	double fraction =n1/n2;
//	double sn=0;
//	for(int i=0;i<20;i++) {
//		double t1=n1;
//		double t2=n2;
//		n1=t1+t2;
//		n2=t1;
//	fraction =n1/n2;
//	sn+=fraction;
//	}
//	System.out.println(sn);
		
	float fm=1f;
	float fz=1f;
	float temp;
	float sum=0f;
	for (int  i = 0;  i <20;  i++) {
		temp =fm;
		fm=fz;
		fz=fz+temp;
		sum+=fz/fm;
	}
		System.out.println(sum);
}
}
