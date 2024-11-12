class Multi extends Thread
{
	public void run()
	{
		try{
			System.out.println("Thread "+currentThread().getId()+" is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
class MultiThread_1 
{
	public static void main(String[] s)
	{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		int n=5;
		for(int i=0;i<5;i++)
		{
			Multi m=new Multi();
			m.start();
		}
	}
}