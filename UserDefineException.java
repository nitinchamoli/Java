class UnableToRunException extends Exception{
   private int steps;
   
   UnableToRunException(int steps){
       super("Few steps");
       this.steps = steps;
   }
   public String toString(){
       return "Few steps";
   }
   int getSteps(){
       return steps;
   }
    
}

public class UserDefineException
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		try{
		    run(21);
		}catch(UnableToRunException ex){
		    System.out.println(ex.toString()+" Steps = "+ex.getSteps());		
		}
	}
	
	public static void run(int steps) throws UnableToRunException{
	    if(steps<20){
	        throw new UnableToRunException(80);
	    }
	    for(int i=10;i<steps;i++){
	        System.out.println("Iam running..");
	    }
	    
	}
}
