import java.util.*;
class ATM{
  static int Amount=0;
  static int ID=123;
  static String Pass= "@shre123";
  static Scanner scan =new Scanner(System.in);
  
  public void diposit()
  {
    System.out.print("How much amount do you want to deposit.\n=");
    int c=scan.nextInt();
    this.Amount+=c;
    System.out.println("Amount Deposited Sucessfully");
  }

  public void Withdraw()
  {
    System.out.print("How Much amount do you want to withdraw.\n=");
    int c=scan.nextInt();
    if(this.Amount<c)
    {
      System.out.println("Insufficent Balance!!");
      
    }
    else
    {
      this.Amount-=c;
      System.out.println("Withdraw Sucessfully");
    }
    
  }

  public void Balance()
  {
    System.out.printf("Amount in your Account is Rs.%d",this.Amount).println();

  }
  public static void main(String [] args)
  {
    ATM a =new ATM();
    
   char choice='Y';
    System.out.print("Enter Your ID\n=");
    int c=scan.nextInt();
    System.out.print("Enter your Password\n=");
    String z=scan.next();
    if(c==ID && z.equals(Pass))
    
    {
      do{
        System.out.print("Which Operation do you want to perform\n1.Deposit\n2.Withdraw\n3.Balance\n=");
        int d=scan.nextInt();
        switch(d)
        {
          case 1:
          {
            a.diposit();
            break;
          }
          case 2:
          {
            a.Withdraw();
            break;
          }
          case 3:
          {
            a.Balance();
            break;
          }
        }
        System.out.print("Do you want to do the Operations Again?\n(Y/N)\n=");
        char t=scan.next().charAt(0);
        if(t=='Y')
        {
          choice='Y';
        }
        else
        {
          choice='N';
        }


    }while(choice=='Y');
  }
  else{
    System.out.println("Invalid User Name Or Password");
  }

  System.out.println("Thank-You");
  
}
}

