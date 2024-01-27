import java.util.*;
class Converter
{
    public int amount=0;
    public int currency;
    public double ans=0;
    
    public static void main(String args[])
    {
        int currency;
        int amount=0;
        double ans=0;
        
        
        Scanner sc =new Scanner(System.in);
        Converter c = new Converter();

        System.out.println("Select the currency in which you want to enter the amount:");
        System.out.println("1.Ruppee");
        System.out.println("2.Euro");
        System.out.println("3.Pound");
        System.out.println("4.Dirham");
        System.out.println("5.Dollar");
        System.out.println("6.Japanese Yen");
        System.out.println("7.Chinese Yuan");
        int b=sc.nextInt();

        System.out.print("Select the currency in which you want to convert into:");
        currency=sc.nextInt();
        System.out.println("\n");
        System.out.print("Enter the amount :");
        amount=sc.nextInt();
        System.out.println("\n");
        
        
        switch(b)//curreny in which you enter the amount 
        {
            case 1:
                 c.Ruppeeto( b, currency,amount);
                break;
            case 2:
                c.Euroto(b,currency,amount);
                break; 
            case 3:
                c.Poundto(b,currency,amount);
                break; 
            case 4:
                c.Dirhamto(b,currency,amount);
                break;
            case 5:
                c.Dollarto(b,currency,amount);
                break;
            case 6:
                c.Yento(b,currency,amount);
                break;
            case 7:
                c.Yuanto (b,currency,amount);
                break;  
            default:
                System.out.println("Invalid Base Input");
        }
        
    }

    public void Ruppeeto(int b,int currency, int amount)
        { 
            ans=0;
            switch(currency)
            {
                case 1:
                    ans+=amount;
                    break;
                case 2:
                    
                    
                    ans+=(amount*0.011);
                    break;

                case 3:
                    
                    
                    ans+=(amount*0.0094);
                    break;

                case 4:
                    
                    
                    ans+=(amount*0.044);
                    break;

                case 5:
                    
                    ans+=(amount*0.012);
                    break;

                case 6:
                    
                     
                    ans+=(amount*1.78);
                    break;

                case 7:
                    
                     
                    ans+=(amount*11.7);
                    break;

                default:
                    System.out.println("Inavalid Target Input!!!!!!!!");
            } 
            System.out.println("Base Currency: " + b + "\nTarget currency: " + currency + "\nConverted Amount: " + ans);
        }

     public void Euroto(int b,int currency, int amount)
        { 
            ans=0;
            switch(currency)
            {
                case 1:
                    
                    ans+=(amount*90.26);
                    break;
                    
                case 2:
                    ans+=amount;
                    break;

                case 3:
                    
                    ans+=(amount*0.85);
                    break;

                case 4:
                    
                    ans+=(amount*3.99);
                    break;

                case 5:
                    
                    ans+=(amount*1.09);
                    break;

                case 6:
                    
                    ans+=(amount*160.88);
                    break;

                case 7:
                    
                    ans+=(amount*0.13);
                    break;

                default:
                    System.out.println("Inavalid Target Input!!!!!!!!");
            } 
            System.out.println("Base Currency: " + b + "\nTarget currency: " + currency + "\nConverted Amount: " + ans);
        }  
        public void Poundto(int b,int currency, int amount)
        { 
            ans=0;
            switch(currency)
            {
                case 1:
                    
                    ans+=(amount*0.01);
                    break;
                    
                case 2:
                    ans+=amount;
                    break;

                case 3:
                    
                    ans+=amount;
                    break;

                case 4:
                    
                    ans+=(amount*4.67);
                    break;

                case 5:
                    
                    ans+=(amount*1.27);
                    break;

                case 6:
                    
                    ans+=(amount*188.47);
                    break;

                case 7:
                    
                    ans+=(amount*0.13);
                    break;

                default:
                    System.out.println("Inavalid Target Input!!!!!!!!");
            } 
            System.out.println("Base Currency: " + b + "\nTarget currency: " + currency + "\nConverted Amount: " + ans);
        } 
        public void Dirhamto(int b,int currency, int amount)
        { 
            ans=0;
            switch(currency)
            {
                case 1:
                    
                    ans+=(amount*0.01);
                    break;
                    
                case 2:
                    ans+=amount;
                    break;

                case 3:
                    
                    ans+=(amount*0.21);
                    break;

                case 4:
                    
                    ans+=amount;
                    break;

                case 5:
                    
                    ans+=(amount*0.27);
                    break;

                case 6:
                    
                    ans+=(amount*40.26);
                    break;

                case 7:
                    
                    ans+=(amount*0.13);
                    break;

                default:
                    System.out.println("Inavalid Target Input!!!!!!!!");
            } 
            System.out.println("Base Currency: " + b + "\nTarget currency: " + currency + "\nConverted Amount: " + ans);
        } 
        public void Dollarto(int b,int currency, int amount)
        { 
            ans=0;
            switch(currency)
            {
                case 1:
                    
                    ans+=(amount*0.01);
                    break;
                    
                case 2:
                    ans+=amount;
                    break;

                case 3:
                    
                    ans+=(amount*0.78);
                    break;

                case 4:
                    
                    ans+=(amount*3.67);
                    break;

                case 5:
                    
                    ans+=amount;
                    break;

                case 6:
                    
                    ans+=(amount*148.02);
                    break;

                case 7:
                    
                    ans+=(amount*0.13);
                    break;

                default:
                    System.out.println("Inavalid Target Input!!!!!!!!");
            } 
            System.out.println("Base Currency: " + b + "\nTarget currency: " + currency + "\nConverted Amount: " + ans);
        } 
        public void Yento(int b,int currency, int amount)
        { 
            ans=0;
            switch(currency)
            {
                case 1:
                    
                    ans+=(amount*0.01);
                    break;
                    
                case 2:
                    ans+=amount;
                    break;

                case 3:
                    
                    ans+=(amount*0.0053);
                    break;

                case 4:
                    
                    ans+=(amount*0.025);
                    break;

                case 5:
                    
                    ans+=(amount*0.0068);
                    break;

                case 6:
                    
                    ans+=amount;
                    break;

                case 7:
                    
                    ans+=(amount*0.13);
                    break;

                default:
                    System.out.println("Inavalid Target Input!!!!!!!!");
            } 
            System.out.println("Base Currency: " + b + "\nTarget currency: " + currency + "\nConverted Amount: " + ans);
        }  
        public void Yuanto(int b,int currency, int amount)
        { 
            ans=0;
            switch(currency)
            {
                case 1:
                    
                    ans+=(amount*0.01);
                    break;
                    
                case 2:
                    ans+=amount;
                    break;

                case 3:
                    
                    ans+=(amount*0.11);
                    break;

                case 4:
                    
                    ans+=(amount*0.52);
                    break;

                case 5:
                    
                    ans+=(amount*0.14);
                    break;

                case 6:
                    
                    ans+=(amount*0.0062);
                    break;

                case 7:
                    
                    ans+=amount;
                    break;

                default:
                    System.out.println("Inavalid Target Input!!!!!!!!");
            } 
            System.out.println("Base Currency: " + b + "\nTarget currency: " + currency + "\nConverted Amount: " + ans);
        }     
}
