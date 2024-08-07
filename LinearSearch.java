public class LinearSearch {
	public static void main(String[]args){
		int[]array = {1,2,3,4,5};
		int target = 3;
		boolean found = false;
		
	for(int i=0;i<array.length;i++){
		if(array[i]==target){
			System.out.println("Element found at index:"+i);
			found=true;
			break;
		}
	}
 }
}
