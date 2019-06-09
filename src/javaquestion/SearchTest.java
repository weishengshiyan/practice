package javaquestion;

import java.util.Scanner;

/*编程实现：二分搜索算法
 * 
 * 
 * 
 */
public class SearchTest {
	/** 被搜索数据的大小 */
	private static final int size = 5000000;

	public static void main(String[] args) {
		long[] data = new long[size];
// 添加测试数据
		for (int k = 0; k < data.length; k++) {
			data[k] = k;
		}

// 要查找的数据
		
		Scanner sc=new Scanner(System.in);
	
		
		long target =sc.nextInt();

		binaryFindTest(data, target);

	}


	public static int binaryFind(long[] data, long target) {
		int start = 0;
		int end = data.length - 1;
		
		//核心二分搜索！！！！！！！！！！！！！！
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
		System.out.println("binary search position：" + result);

		System.out.println("binary search time：" + (end - start));

	}

}