public class staticKeyWord {
    class person{
        String name;
        int age;
        static int count=0;
         person(){
            count++;
        }

        person(int newAge,String n){
            this(); //it will call another constructor from this constructor
            name=n;
            age=newAge;
        }

    }

    public static void main(String[] args){
            person.count++; //count is constant so it can accessed just by class name
            
    }
}
