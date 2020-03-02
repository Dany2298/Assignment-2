import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import javax.swing.JOptionPane;
public class CS1701Finch_Detect_Object {

	
	private static Finch myf1 = null;
	
	public static void main(String args[])
{

	myf1 = new Finch();
	
	
	if(myf1.isFinchLevel()==true) //Finch has to be level to start
	{
		String fn = JOptionPane.showInputDialog("Please Select your ideal Mode");
	System.out.println("Please	select	your ideal mode (Curious,Scaredy or Any)"); //Displays modes for user
	myf1.setWheelVelocities(50,50);//wanders around at low speed
	curiousFinch();
	}
	else
	{
		System.out.println("I am not level on the floor!");
		myf1.quit();
		System.exit(0);
	}

}
	
	public static void curiousFinch() 
	{
		int objectcounter = 0;
		System.out.println("Welcome to Curious Mode!");
		if(myf1.isObstacle()==true)	//Detects for an object. If Object has been encountered the beak will light up red for 3 seconds
			myf1.buzz(440,2000) ;
			++objectcounter;
	
		if(myf1.isObstacle()==true);
		myf1.setLED(0,0,255,6000);
		if(myf1.isObstacle()==true)
			myf1.stopWheels();
		System.out.println(objectcounter);
		
	}
				
		
	public static void followobject()
	{
	if (myf1.isObstacleRightSide() == false && myf1.isObstacleLeftSide() == false) { 
	        myf1.sleep(1);
	        myf1.setWheelVelocities(50,50,5000);
	        } else if (myf1.isObstacleRightSide() == false && myf1.isObstacleLeftSide() == true) { 
	         // Hidari();
	        } else if (myf1.isObstacleRightSide() == true && myf1.isObstacleLeftSide() == false) { 
	       //   Migi();
	        } else if (myf1.isObstacleRightSide() == true && myf1.isObstacleLeftSide() == true) { 
	       //  CEASE();
	        	
	        	myf1.quit();
	        	System.exit(0);
	        }
	    }
		
		
	
	public static void scaredyFinch() {
		if(myf1.isObstacle()==true)
			myf1.buzz(440,3000);
		myf1.setLED(250,0,0);
			
		myf1.setLED(0, 250,0);
			myf1.setWheelVelocities(-200,-200,3000);
		myf1.setWheelVelocities(-50,-50,3000);
		
	}
	
public static void anyFinch() 
{

curiousFinch();


}
}
	