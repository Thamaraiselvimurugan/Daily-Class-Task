package area;

public class area1 {
	public void square(int a)
	{
		System.out.println("Srea of Square="+(a*a));
	}
public void rect(int l,int b)
{
	System.out.println("Area of rectangle="+(l*b));
}
}


//class area2
package p;
import area.*;
public class area2 {
	public static void main(String ar[])
	{
		area1 n=new area1();
		n.square(5);
		n.rect(12, 32);
	}

}
