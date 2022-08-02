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
    public static void main(String[] args){

    }
    
}
