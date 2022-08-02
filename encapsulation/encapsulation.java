package encapsulation;

//it is used for data hiding and data protection
//encapsule some properties
//to build this concept we need to use packages and acces modifiers

public class encapsulation{
    public static void main(String[] args){

    }
    //this function is also available out this package
    public  void doWork(){
        System.out.println("working !!");
    }
    //this function is available only inside this classs
    private void doJob(){
        System.out.println("lol!");
    }
    // this function is available inside the package but not outside this package
    void doPlay(){
        System.out.println("play");
    }
}