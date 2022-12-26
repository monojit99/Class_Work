package basicprograms;
class HumanBody
{
	public void displayHuman()
	{
		System.out.println("This is human body");
	}
}
interface Male
{
	public void show();
}
interface Female
{
	public void show();
}
class Child1 extends HumanBody implements Male,Female
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is show method");
	}
	public void displayChild()
	{
		System.out.println("This is child");
	}
	
}
public class HybridInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c=new Child1();
		c.displayHuman();
		c.show();
		c.displayChild();
	}

}
