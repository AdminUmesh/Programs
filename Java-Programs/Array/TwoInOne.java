//Two sorted array store in one array(in sorted array From).

import java.util.Arrays;

public class TwoInOne {
	public static void main(String[] args) {
		int a1[] = { 11, 34, 66, 75 };
		int a2[] = { 1, 5, 19, 50, 89, 100 };
		int lena1=a1.length;
		int lena2=a2.length;
		int b[]=new int[lena1+lena2];
		int count1=0, count2=0;

		// Merge both arrays in a single array
		for(int i=0; i<lena1+lena2-1; i++){
			if(i<lena1){
				b[i+count2]=a1[i];
				count1++;
			}

			if(i<lena2){
				b[i+count1]=a2[i];
				count2++;
			}
		}

		// sorting merged array

		for(int i=0; i<b.length; i++){
			for(int j=0+i; j<b.length; j++){
				if(b[i]>b[j]){
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(b));
	}
}
