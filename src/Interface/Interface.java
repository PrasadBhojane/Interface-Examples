package Interface;

interface Interf
{
	void m1();
	void m2();
}
abstract class ServiceProvider implements Interf
{
	public void m1()
	{
	}
}
class SubServiceProvider extends ServiceProvider
{
	public void m2()
	{
		
	}
}