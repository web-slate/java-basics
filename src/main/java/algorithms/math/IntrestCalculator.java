package algorithms.math;

import java.util.Scanner;

public class IntrestCalculator {
  public static void main(String args[]) throws Exception {
    int a;
    double b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Account ID");
    a = sc.nextInt();
    System.out.println("Enter the Balance");
    b = sc.nextDouble();
    System.out.println("Enter the Intrest Rate");
    c = sc.nextDouble();
    Account account = new Account(a, b, c);
    System.out.println("Enter the Year");
    int noOfYear;
    noOfYear = sc.nextInt();
    double answer = calculateInterest(account, noOfYear);
    System.out.format("%.3f", answer);
  }

  public static double calculateInterest(Account account, int noOfYear) {
    double temp = noOfYear * account.getInterestRate() / 100;
    return (account.getBalance() * (account.getInterestRate() + temp) / 100);
  }
}

class Account {
  private int id;
  private double balance;
  private double interestRate;

  Account(int id, double balance, double interestRate) {
    this.id = id;
    this.balance = balance;
    this.interestRate = interestRate;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getInterestRate() {
    return this.interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
}

// Compile and Run the below command.
// javac algorithms/math/IntrestCalculator.java && java algorithms.math.IntrestCalculator