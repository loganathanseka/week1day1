package mobile;

public class findintersection {

	public static void main(String[] args) {
	
		int[] num = {15,16,23,17};
		int[] num2 = {24,30,16,23};
			
		for(int i=0; i<num.length; i++) {
			for(int j=i; j<num2.length; j++) {
				if(num[i] == num2[j]) {
					System.out.println("intersection value = "+num2[j]);
						
				}
					
			}
				
		}
	}

}


