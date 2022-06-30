package week3.day1.assignment5;

public class Automation extends MultipleLanaguage implements Language,TestTool{
       //Automation----------------Execution purpose
	@Override
	public void Selenium() {
		System.out.println("Learning Selenium");
		
	}

	@Override
	public void Java() {
		System.out.println("Learning java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Learning ruby");
		
	}
	public static void main(String[] args) {
		
	
	Automation auto=new Automation();
	auto.Selenium();
	auto.Java();
	auto.ruby();
	auto.python();
	

}}
