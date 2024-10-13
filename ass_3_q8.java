import java.util.Scanner;

public class ass_3_q8
{
  public static String hex(int n,String k)
  {
	  if(n==0)
		  return k;
	  else
	  {
		  int r=n%16;
	      n=n/16;
	      switch(r)
	      {
	      case(0):
	    	  k="0"+k; break;
	      case(1):
	    	  k="1"+k; break;
	      case(2):
	    	  k="2"+k; break;
	      case(3):
	    	  k="3"+k; break;
	      case(4):
	    	  k="4"+k; break;
	      case(5):
	    	  k="5"+k; break;
	      case(6):
	    	  k="6"+k; break;
	      case(7):
	    	  k="7"+k; break;
	      case(8):
	    	  k="8"+k; break;
	      case(9):
	    	  k="9"+k; break;
	      case(10):
	    	  k="A"+k; break;
	      case(11):
	    	  k="B"+k; break;
	      case(12):
	    	  k="C"+k; break;
	      case(13):
	    	  k="D"+k; break;
	      case(14):
	    	  k="E"+k; break;
	      case(15):
	    	  k="F"+k; break;
	     default:
	    	 System.out.println("try again");
	    	  
	      }
		  return hex(n,k);
	  }
  }
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the decimal number:");
		int n= sc.nextInt();
		System .out.println("hexal of number is "+hex(n," "));

	}

}
