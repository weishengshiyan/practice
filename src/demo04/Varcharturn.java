package demo04;
public class Varcharturn {
	public static String Str(String s) {
		// TODO Auto-generated method stub	
	
			char[] c=	s.toCharArray();	
			System.out.println(c);
			int start=0;
			int end= c.length-1;
		while(start<end) {
			char temp=c[start];
			c[start]=c[end];
			c[end]=temp;
			start++;
			end--;
				
			     }
		return new String(c).toString();

		}
			public static void main(String[] args) {
				
				 System.out.println(new Varcharturn().Str("how are you"));
				
			}

	}






