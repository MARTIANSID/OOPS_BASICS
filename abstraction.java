
//we want to reduce the complexity
//you want to hide the complexity of the system from the user
//we use abstract and interface keywords
public class abstraction {
    public static void main(String[] args){

    }

    class Audi extends car{
        void start(){
            System.out.println("Audi is starting");
        }
    }
    class BMW extends car{
        void start(){
            System.out.println("BMW is starting");
        }
    }

    interface l1{
        void show();
    }
    class t implements l1{
        //mehtod overriding
        public void show(){
            System.out.println(1);
        }
    }

    //car is a concept so making object of car will not make sense
    //we use abstract keyword it does not allow to make object of this class


    //abstract is just used to make concept
    //we cant make object of abstract class

    abstract class car{
        String brand;
        String name;
        int price;
        
       abstract void start();
    }
}
