package Pakage_GitHub;

public class GitHub 
{
  int x;
  public void sum(int a, int b)
  {
	  int c;
	  c=a+b;
	  System.out.println("Sum is "+c);
  }
  
  public static void main(String[] args) 
  {
	GitHub swati=new GitHub();
	swati.x=3425;
	System.out.println("Value of X "+swati.x);
	swati.sum(2,6);
}
}
