
public class ArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] original = {1, 2, 3, 4};
		
		int[] newArr = getprodcut(original);
		
		for (int i : newArr) {
			System.out.println(i);
		}
		
		

	}
	
	public static int[] getprodcut(int[] iArr) {
		
		int[] oArr = new int[iArr.length];
		
		for (int i = 0; i < iArr.length; i++) {
			
			int prod = 1;
			for (int j = 0; j < iArr.length; j++) {
				
				if(i != j) {
					prod *= iArr[j];
				}
				
			}
			
			oArr[i] = prod;
			
		}
		
		
		return oArr;
	}

}
