package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number:");
		Integer account = sc.nextInt();
		
		System.out.print("Enter account holder:");
		sc.nextLine();
		String name = sc.nextLine();
		
		Bank bank = new Bank(account, name);
		
		System.out.print("Is there an initial deposit(y/n)?");
		char option = sc.next().charAt(0);
		
			if (option == 'y'){
				System.out.print("Enter initial deposit value: ");
				bank.deposit(sc.nextDouble());
				}
		
		System.out.println(bank.toString());
		System.out.print("Enter a deposit value:");
		bank.deposit(sc.nextDouble());
		System.out.println("\nUpdated" + bank.toString());
	
		System.out.print("Enter a withdraw value:");
		bank.withdraw(sc.nextDouble());
		System.out.println("\nUpdated " + bank.toString());
		
		sc.close();
	}

}
