package arrray_27_06;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,34,45,12,21,28,45,2,34};
		int n=a.length;
		int min=a[0],max=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(min+"---"+max);
	}

}
