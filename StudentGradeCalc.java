import java.util.*;
class StudentGradeCalc
{
    public static void main(String args[])
    {
        int m[] = new int[10]; 
        int n,age=0,stand=0;
        String name=null;
        String grade=null;
        float avg = 0, total = 0; 
        float per=0;
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter your name:");
        name=sc.next();
        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("Enter the standard in which you are studying:");
        stand=sc.nextInt();
        System.out.println(" ");
        System.out.print("Enter number of subjects:");
        n=sc.nextInt();
        System.out.println(" ");
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter marks (out of 100) of subject "+i+":");
            m[i]=sc.nextInt();
            total+=m[i];
        }
        
        avg=(total)/n;
        per = (total / (n * 100)) * 100;      
        System.out.println("\n");
        
        switch((int)avg/10)
        {
           case 10:
            case 9:
                grade="A\n                :) Excellent :)";
                break;
            case 8:
                grade="B\n               :) Very Good :)";
                break;
            case 7:
                grade="C\n                 :) Good :)";
                break;
            case 6:
                grade="D\n                :) Can do better :)";
                break;
            case 5:
                grade="E\n                :) Work Hard :)";
                break;
            default:
                grade="  Fail :("; 
        }
        Display d=new Display(stand,name,grade,age,total,per);
        d.display();         
    }
}
class Display extends StudentGradeCalc
{
    private int stand;
    private String name;
    private String grade;
    private int age;
    private float total;
    private float per;


    Display(int standd , String namee ,String gradee, int agee, float totall, float perr)
    {
        this.stand=standd;
        this.age=agee;
        this.name=namee;
        this.grade=gradee;
        this.total=totall;
        this.per=perr;

    }
    void display()
    {
       System.out.println("Student's name:"+name); 
       System.out.println("Student's age:"+age); 
       System.out.println("Student's standard:"+stand);  
       System.out.println("Student's Total marks:"+total); 
       System.out.println("Student's percentage:"+per);
       System.out.println("Student's grade:"+grade);


    }
}
    
