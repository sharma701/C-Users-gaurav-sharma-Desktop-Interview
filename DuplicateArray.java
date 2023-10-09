package arrray_27_06;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,34,45,12,21,28,45,2,34};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j < a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
			
		}
	}

}
