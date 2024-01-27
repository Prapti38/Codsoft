import java.util.Scanner;

class ATM 
{
    public static double balance = 1000;
    public static int age=0;

    public static void main(String[] args) 
    {
        int  accno = 0, depo, wid, pin, k,a,age=0;
        String name = null;
        boolean running=true;
        Scanner sc = new Scanner(System.in);
        ATM atm=new ATM();
        Account ab = new Account();

        
        while(running)
        {
            
            System.out.println("Enter 1 to add an account.");
            System.out.println("Enter 2 to delete an account.");
            System.out.println("Enter 3 to deposit.");
            System.out.println("Enter 4 to withdraw.");
            System.out.println("Enter 5 to Show details.");
            System.out.println("Enter 6 to Exit.");
            a = sc.nextInt();
            switch (a) 
            {
               
                case 1:
                    System.out.println("Enter your name: ");
                    name = sc.next();
                    System.out.println("Enter your age: ");
                    age = sc.nextInt();
                    if (name.equals("")) 
                    {
                        System.out.println("Enter something!!!");
                    } 
                    else if (age < 18) 
                    {
                        System.out.println("Invalid age");
                    } 
                    else 
                    {
                        atm.add(name, accno);
                        
                    }
                    break;

                case 2:
                    System.out.println("Enter your account number: ");
                    accno = sc.nextInt();

                    if(accno == 15)
                    {
                        System.out.println("Enter 15 digits!!!");
                    }
                    else
                    {
                        atm.remove(accno);
                    }
                    break;
                case 3:
                    System.out.println("Enter your account number: ");
                    accno = sc.nextInt();
                    System.out.println("Enter your pin: ");
                    pin = sc.nextInt();
                    System.out.println("Enter the amount to be deposited: ");
                    depo = sc.nextInt();

                    if(depo>100000)
                    {
                        System.out.println("Can deposit only 1,00,000 at a time");
                    }
                    else
                    {
                        atm.deposit(depo); 
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.out.println("Enter your account number: ");
                    accno = sc.nextInt();
                    System.out.println("Enter your amount to be withdrawn: ");
                    wid = sc.nextInt();
                    if(wid>10000)
                    {
                        System.out.println("You can withdraw only 10,000 INR at a time !!!");
                    }
                    else
                    {
                        atm.withdraw(accno,wid);
                        
                    }
                    break;
                case 5:
                    ab.account1(accno,name,age);
                    ab.display();
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("You have chosen to exit");
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    System.out.println(" ");
            }
            
        }
        
        
        
        sc.close();
    }

    public static void add(String name, int addh) 
    {
        System.out.println("Thank you your account has been created under the name of " + name);
        System.out.println(" ");
    }

    public static void remove(int acc) 
    {
        System.out.println("Your account " +acc+ " has been removed.!!!");
        System.out.println(" ");
    }

    public static void deposit(int dep)
    {
        balance += dep;
        System.out.println("The amount deposited :" + dep + "\nBalance is :" + balance);
        
    }
     public static void withdraw(int acc1, int amt) {
        balance -= amt;
        System.out.println("Please collect your cash:");
        System.out.println("Account no :" + acc1 + " has balance left " + balance);
        System.out.println(" ");
    }
}

class Account extends ATM 
{
    private int acc_no;
    private String name;
    private int age;

    public void account1(int n, String na, int age) {
        this.acc_no = n;
        this.name = na;
        this.age = age;
    }

    public void display() 
    {
        System.out.println("Account holder: " + name);
        System.out.println("Age: " + age);
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance : " + balance);
    }
}