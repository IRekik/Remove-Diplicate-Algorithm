import java.util.Stack;

public class question4 {
	
	public static void sort(int [] arr) {
		for (int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while (j >= 0 && temp < arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	public static int[] doubleDetector(int [] A) {
		sort(A);
		Stack <Integer> s1= new Stack <Integer>();
		s1.push(A[0]);
		for (int i = 1; i<A.length;i++) {
			if (A[i] == s1.peek()) {
				s1.pop();
				s1.push(A[i]);
			}
			else {
				s1.push(A[i]);
			}
		}
		int [] B = new int [s1.size()];
		for (int j=0;j<B.length;j++) {
			B[j]=s1.pop();
		}
		return B;
		
	}

	public static void main(String[] args) {
		int [] arr1 = {22, 61, -10, 61, 10, 9, 9, 21, 35, 22, -10, 19, 5, 77, 5, 92, 85, 21, 35, 12, 9, 61};
		int [] arr2=doubleDetector(arr1);
		for (int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}