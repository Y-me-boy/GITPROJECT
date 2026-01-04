package GITPROEJCT;


public class reversearray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int[] temp=new int[n];
			for(int i=0;i<n;i++) {
				temp[i]=arr[n-i-1];
			}
				for(int i=0;i<n;i++){
					
                   arr[i]=temp[i];	
                   System.out.println(arr[i]);

	}
			

}
}
