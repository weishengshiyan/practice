package demo01;

public class Question3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int i;
		int t = 0;
		double sum = 0;
		
		a= new int[10];
		for(i=0;i<10;i++) {
		int a1=(int) (Math.random()*100);
		a[i]=a1;
		System.out.print(a[i]+" ");
		sum+=a[i];
		}
		
		double avg;
		avg=sum/10;
		System.out.print("\n avg="+avg);
		
		for(i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			
			}
		}
		System.out.print("\n max="+t);
		
		for(i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			
			}
		}
		System.out.print("\n min="+t);
		
		
	
	}

}
