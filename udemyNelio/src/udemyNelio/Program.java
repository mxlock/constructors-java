package udemyNelio;
import accountInfo.Accounts;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Accounts informations = new Accounts();
		
		System.out.println("Enter account number: ");
		informations.setAccountNumber(sc.nextInt());
		
		System.out.println("Enter accounter holder: ");
		sc.nextLine();
		informations.setName(sc.nextLine());
		
		System.out.println("Is there na initial deposit (y/n) ?");
		informations.setOptionChoose(sc.next());
		
		if (informations.getOptionChoose().equals("y")) {
		System.out.println("Enter initial deposit value");
		informations.setBalance(sc.nextDouble());
		
		}
		
		System.out.println(informations);
		 
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double balance = sc.nextDouble();
		informations.addAccount(balance);
		
		System.out.println(informations);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		balance = sc.nextDouble();
		informations.withdrawAccount(balance);
		
		System.out.println(informations);
	}
}
