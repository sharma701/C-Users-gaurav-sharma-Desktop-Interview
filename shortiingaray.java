package arrray_27_06;

import java.util.Arrays;

public class shortiingaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {2,34,45,12,21,28};
for(int i =0;i<a.length;i++) {
	
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}//Arrays.sort(a); predfnd mthod
//System.out.println(Arrays.toString(a));

		
	}

}
