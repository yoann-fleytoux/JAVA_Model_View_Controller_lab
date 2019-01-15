package singleton;

public class SingleObject {

	   //create an object of SingleObject
	   private static SingleObject instance = new SingleObject();
	   private static String lol="standard";
	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
	      return instance;
	   }
	   
	   public static void setString(String in){
		   lol=in;
	   }

	   public void showMessage(){
	      System.out.println(lol);
	   }
	}