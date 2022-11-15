/******************************************************************************
 * Copyright (c) Farhad Towfighian 2022.                                      *
 * https://github.com/far-tow                                                 *
 ******************************************************************************/

package se.lexicon;


public class App {
    public static void main( String[] args ) {

        BankAccount cust1 = new BankAccount(10000,"Erik Svensson","erik@test.se","0707232323");
        BankAccount cust2 = new BankAccount(3000,"Anders Andersson","anders@test.se","0702333333");
        System.out.println(cust1.toString());
        System.out.println(cust2.toString());
        System.out.println();
        System.out.println("#>>>>>>>>>>>>>> After Deposit & Withdraw <<<<<<<<<<<<<<<#");
        System.out.println();
        cust1.deposit(100);
        cust2.withDraw(200);

        System.out.println(cust1.toString());
        System.out.println(cust2.toString());
    }

}
