package thread;
class Acc
{
	int accBalance=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("start withdrawing");
		if(this.accBalance<amount)
		{
			System.out.println("less balance:waiting for deposit");
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.accBalance=accBalance-amount;
		System.out.println(amount+" is withdraw successfully");
		System.out.println("Now your ac balance is: "+this.accBalance);
	}
	synchronized void deposit(int amount)
	{
		System.out.println("start deposit");
		this.accBalance=accBalance+amount;
		System.out.println("Now your acc balance is:"+this.accBalance);
		System.out.println(amount+" deposit successful");
		notify();
		//notifyAll();
	}
}
public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acc ac=new Acc();
		new Thread() {
			public void run()
			{
				ac.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				ac.deposit(10000);
			}
		}.start();
	}

}
