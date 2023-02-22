import java.util.Scanner;

public class B {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int r;
	int temp=n;
	int sum=0;
	while (n>0) {
		r= n%10;
		sum = (sum*10)+r;
		n= n/10;
	}
	if (temp==sum) {
		System.out.println("panlindeome");
	}else {	
	System.out.println("not");}
}

	
}
