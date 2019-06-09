package javaquestion;

import java.util.Scanner;

/*���ʵ�֣����������㷨
 * 
 * 
 * 
 */
public class SearchTest {
	/** ���������ݵĴ�С */
	private static final int size = 5000000;

	public static void main(String[] args) {
		long[] data = new long[size];
// ��Ӳ�������
		for (int k = 0; k < data.length; k++) {
			data[k] = k;
		}

// Ҫ���ҵ�����
		
		Scanner sc=new Scanner(System.in);
	
		
		long target =sc.nextInt();

		binaryFindTest(data, target);

	}


	public static int binaryFind(long[] data, long target) {
		int start = 0;
		int end = data.length - 1;
		
		//���Ķ�����������������������������������
		while (start <= end) {
			int middleIndex = (start + end) / 2;
			if (target == data[middleIndex]) {
				return middleIndex;
			}
			if (target >= data[middleIndex]) {
				start = middleIndex + 1;
			} else {
				end = middleIndex - 1;
			}
		}
		return -1;
	}

	public static void binaryFindTest(long[] data, long target) {
		long start = System.nanoTime();
		int result = binaryFind(data, target);
		long end = System.nanoTime();
		System.out.println("binary search position��" + result);

		System.out.println("binary search time��" + (end - start));

	}

}