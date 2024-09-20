import java.util.Scanner;

public class Replace3With7 {

	public static void main(String[] args) {
		//3367
		int num,r,p=1,newNo=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		num = sc.nextInt();
				
		while(true) {
			r = num % 10;// 7 6 5 4
			if(r == 3) r = 7;
			newNo = newNo + r *p;
			p= p* 10;
			num =  num / 10;// 456
			if(num == 0) break;
			
		}
		System.out.println("new No---->"+newNo);
		
	}

}

