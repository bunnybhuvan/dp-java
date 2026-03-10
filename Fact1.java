import java.util.Scanner;
class Fact1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter n value:");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n){
			fact=fact*i;
			i++;
			
		}
		System.out.println(n+" Factorial is "+fact);
	}
}