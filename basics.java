import encapsulation.*;

public class basics{
    public static void main(String[] args){
        encapsulation obj=new encapsulation();
        obj.doWork();
        //this do work function is visible because we have set the access modifier as public for this function
        //in default access specifier this function will not be visible
        
    }

}