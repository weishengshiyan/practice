package demo04;

public class Turnvarchar {


 
	    public static void main(String[] args){
	    	String s="abcd sdada dsa";
	    	String s2 = "";
	    	for(int i=s.length()-1; i>=0; i--){//����һ
	    		s2 = s2+s.charAt(i);
	    	}
	    	System.out.println(s2);
//	    	System.out.println(new StringBuffer(s).reverse());//������
	    }
}


