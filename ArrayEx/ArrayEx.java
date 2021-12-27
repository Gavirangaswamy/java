import java.util.Arrays;
import java.util.Random;

public class ArrayEx {

	public static void main(String[] args) {
		
		int [] arr1 = new int[5];
		
		for(int i =0;i<arr1.length;i++) {
			arr1[i]=i+2;
		}
		for(int i =0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}
		
		System.out.println();
		
		Random r = new Random();
        int [] arr2 = new int[10];
		
		for(int i =0;i<arr2.length;i++) {
			
			arr2[i]=r.nextInt(50);
		}
		for(int i =0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+"\t");
		}
		
		System.out.println();
		
		int [] arr = {98,78,85,152,489,4563};
		
		for(int array:arr) {
			System.out.print(array+"\t");
		}
		System.out.println("\n"+Arrays.toString(arr));
		
		int b[][]= {
				
				{1,2,3,4,5},
				{7,8,9,4,5},
				{9,5,1,2,3} 	
		};
		for(int i=0;i<b.length;i++) {
			
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int c []:b) {
			for(int d : c) {
				System.out.print(d+"\t");
			}
			System.out.println();
		}
		
	}

}
