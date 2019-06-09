package demo04;

import java.io.UnsupportedEncodingException;

import javax.sound.sampled.ReverbType;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Varcharturn2 {

	public void swap(char[] arr,int begin ,int end) {
		
		while(begin<end) {
			char temp=arr[begin];
			arr[begin]=arr[end];
			arr[end]=temp;
			begin++;
			end--;
			
			
		}
		
		
	}
	public String revword(String str) {
		char[] arr=str.toCharArray();
		swap(arr,0,arr.length-1);
		int begin=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==' ') {
				
					swap (arr,begin,i-1);
					begin=i+1;
				
			
			}
			}
		return new String(arr);
				
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		
//		String str="how are you sdad";
//		System.out.println(new Varcharturn2().revword(str));
//		String s1 = "ÄãºÃ";
//		String s2 = new String(s1.getBytes("GB2312"), "UTF-8");
//		System.out.println(s2);
//		
	}

}
