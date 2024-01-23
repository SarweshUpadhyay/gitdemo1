 class Bird
{
   void fly()
   {
	   System.out.println(" i am bird , i can fly");
   }
}

 class Parrot extends Bird
{
   void color()
   {
	   System.out.println(" i am parrot , i am green ");
   }
}

 class Sing extends Parrot
 {
    void SingaSong()
    {
 	   System.out.println(" i am parrot ,  i can sing a song");
    }
 }

public class GitClass 

{

	public static void main(String[] args)
	
	{
		
		Parrot par= new Parrot();
		Sing sin= new Sing();
		sin.SingaSong();
		par.color();
		par.fly();
		
		
	}

}
