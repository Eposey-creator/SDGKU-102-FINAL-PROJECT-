public class Main{
    public static void main(String[]args){

          // student class (starts)
      
            Student celeste = new Student();
            celeste.name="Celeste";
            celeste.age="25 years old";
            celeste.introduce();

            Student nina=new Student();
            nina.name="Nina";
            nina.age= "28 years old";
            nina.introduce();

            // student class (ends)

           
           // user class (starts)
           User lupita= new User();
           lupita.user="Lupita";
           lupita.name="FSDI 101 & 102 : Introductory HTML & CSS";
           lupita.assign();
           
           User tina= new User();
           tina.user="Tina";
           tina.name="FSDI 101 & 102 :Intermidiate HTML & CSS";
           tina.assign();
           

           User ashely= new User();
           ashely.user="Ashely";
           ashely.name= "FSDI 101 & 102 : Programming Robots";
           ashely.assign();
           

           //user class (ends)

           //add teacher class (starts)
           Teacher smith = new Teacher("Ms.", "Smith");
           smith.printteacher();

           Teacher enzo= new Teacher("Enzo ","The A.I. Robot");
           enzo.printteacher();

           // teacher class (end)

           // teaching action(starts)

           smith.        teaches      (lupita);
           smith.        teaches       (tina);
           enzo.         teaches       (ashely);


           // teaching action (ends)
           
          
            



          
           



        }
    }
       
    



    


