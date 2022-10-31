package se.lexicon;


public class App 
{
    public static void main( String[] args ) {

        BankAccount cust1 = new BankAccount("Erik", "Svensson", "erik.svensson@gmail.com", "0707007007");
        BankAccount cust2 = new BankAccount("Åsa","Lundberg");
        BankAccount cust3 = new BankAccount("Erika", "Hansson", "erika@gmail.com", "07007007");
        BankAccount cust4 = new BankAccount("Farhad","Towfighian", "fartow@gmaili.com","0702112113");
        System.out.println(cust1.getCustomerInformationL());
        System.out.println(cust2.getCustomerInformation());
        System.out.println(cust3.getCustomerInformationL());
        System.out.println(cust4.getCustomerInformationL());
    }

}
