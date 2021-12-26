package mobile;

public class week1day1assignment {
	
	public void fact() 
	{
		int n = 1;
		for(int i=1;i<=5;i++) {
			
			n = i*n;
			
			
		}
		System.out.println("Factorial");
		System.out.println(n);
		

	}
	private void odd() {
		System.out.println("ODD numbers");
		for(int i=1;i<=10;i++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
		}
		

	}
	private void fibonacci() {
		int n=5;
		int t1=0;
		int t2=1;
		int i,sum;
		System.out.println("fibonacci");
		for(i=1;i<=n;i++) {
		
		System.out.println(t1);
		
		sum=t1+t2;	
		t1=t2;
		t2=sum;
		}

	}
	

	public static void main(String[] args) {
		week1day1assignment f = new week1day1assignment();
		f.fact();
		f.odd();
		f.fibonacci();
		
		

	}

}
