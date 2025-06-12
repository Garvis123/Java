public class New{
  public static void main(String args[])
  {
    BankAccount b=new BankAccount();
    b.Deposit();
    b.checkBalane();
    b.withdraw();
  }
}

class BankAccount{

  void Deposit()
   {
     System.out.println("It is been deposited");
   }
   void withdraw()
    {
      System.out.println("It is been withdrawed");
    }

    void checkBalane()
    {
      System.out.println("It is been checkBalaneed");
    }
}
    




