import java.util.*;
import java.io.*;
import static java.lang.StrictMath.pow;

class mini
{
    public static void main(String[] args)
    {
        int c;
        do
        {
        System.out.println("Press 1 for Binary to Gray\nPress 2 for Binary to BCD\nPress 3 for Binary to XS3\nPress 4 to exit");
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        switch(c)
        {   case 1: B b1=new B();
		    b1.Binary_Gray();
                    break;
            case 2: C c1=new C();
                    c1.BinaryToDecimal();
                    break;
            case 3: D d1=new D();
                    d1.BTD();
                    break;
        }
        }while(c!=4);
    }
}
class B
{
   void Binary_Gray()
  {       
        int n, result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number:");
        n = sc.nextInt();
        result = GrayCode(n,0);
        System.out.println("Gray Code:"+result);
  }
  int GrayCode(int x,int i)
  {
       int a, b, result = 0;
       if(x!=0)
        {
            a = x % 10;
            x = x / 10;
            b = x % 10;
            if((a & ~ b) == 1 || (~ a & b) == 1)
            {
                result=(int)(result+pow(10,i));
            }
            return GrayCode(x,++i)+result;
        }
return 0;     
}
}

class C
{
  void BinaryToDecimal()
  {    int num;
       Scanner input = new Scanner( System.in );
       System.out.print("Enter a binary number: ");
       String binaryString =input.nextLine();
       num=Integer.parseInt(binaryString,2);
       BCD(num);
  }
  void BCD(int num)
    {
        String BCD="";
        while(num!=0)
        {
        int t=num%10;
        String tBCD=Integer.toBinaryString(t);
        while(tBCD.length()<4)
            {
            tBCD="0"+tBCD;
            }
        BCD=tBCD+BCD;
        num/=10;
        }
        System.out.println(" BCD=  "+BCD);
    }
}
class D
{
  void BTD()
  {    int num;
       Scanner input = new Scanner( System.in );
       System.out.print("Enter a binary number: ");
       String binaryString =input.nextLine();
       num=Integer.parseInt(binaryString,2);
       XS3(num);
  }
void XS3(int num)
{ 
        num=num+3;
        int a;
        String x = "";
        while(num > 0)
        {
            a = num % 2;
            x = x + "" + a;
            num = num / 2;
        }
        StringBuffer s1=new StringBuffer(x);
        s1.reverse();
        System.out.println("XS3 : "+s1);
}
}
