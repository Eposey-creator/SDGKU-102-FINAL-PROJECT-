public class Teacher {
    //attributes
    String name;
    String type;

    //constructor

    public Teacher(String name,String type){
        this.name=name;
        this.type=type;
    }

    //print teacher
    public void printteacher(){
        System.out.println("---------New Teacher-------");
        System.out.println(this.name + ""+ this.type);
        System.out.println("");
    }

    //method
    public void teaches(User obj){
      System.out.println(this.name + "" + this.type + "teaches"+ obj.name);  
    }

}