public class polymorphism {

    // at compile time it is decided which walk function will be called this is called compile time polymorphism
    class person{
        String name;
        String age;
        
        void walk(){
            System.out.println("Walking");
        }
        void walk(int steps){
            System.out.println(steps);
        }
    }
    class Test{
        void show(String a,String b){
            System.out.println("Hello");
        }
    }
    class xyz extends Test{
        //this is called method overriding
        //this is also called runtime polymorphism
        //the function has the same number,type,order of arguments
        //final method cannot be override
        //static method cannot be override
        //private method cannot be override
        

        void show(String a,String b){
            System.out.println("bye");
        }
    }
    public static void main(String[] args){

    }
    
}
