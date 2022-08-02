package encapsulation;

//it is used for data hiding and data protection
//encapsule some properties
//to build this concept we need to use packages and acces modifiers

public class encapsulation{
    public static void main(String[] args){
        Laptop l1 =new Laptop();
        //here we use set price method to set the private variable beacuse in this funtion we can put some checks to make sure the data is valid
        l1.setPrice(31);
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

    static class Laptop{
        int ram;
        private int price;

        //this function is used to check if the data that is being set to price is valid or not
        public void setPrice(int price){
            boolean isAdmin=false;
            if(!isAdmin){
                System.out.println("Cant!");
                return;
            }
            this.price=price;
        }
    }
}

//this also data hiding
//private is not inherited
//protected and public is inherited 
