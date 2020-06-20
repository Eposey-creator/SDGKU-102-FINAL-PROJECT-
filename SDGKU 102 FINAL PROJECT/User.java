public class User{
    

    //attribute
    public String name;
    public String user;
    boolean cohortcomplete=true;
    
    
    // constructor not required to execute this code. (less is more)
    
        
    //method
    
       
   public void assign(){

     System.out.println("WELCOME! " + user);  
     System.out.println("This student is assigned to " + name);
     System.out.println("The Student has completed this Cohort"); 
     if(cohortcomplete==true){
     System.out.println("WELL DONE! you've made it pass FSDI 101 and FSDI 102");
     }
     else{
     System.out.println("TRY AGAIN! you need to complete ALL of FSDI101 AND 102");
     }
     }
     
   
 
  
  }







  