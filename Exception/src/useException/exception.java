package useException;
public class exception {
}

interface vehicle{
    public void wheels();
    public void seats();
    public void petrol();
}
class bicycle implements vehicle{
    int wheel=2,seat=1,petrol=0;
    public void wheels(){
        System.out.println("No of wheels "+wheel);
    }
    public void seats(){
        System.out.println("No of seats "+seat);
    }
    public void petrol(){
        System.out.println("petrol used "+petrol);
    }
}
class bike implements vehicle{
    int wheel=2,seat=2,petrol=4;
    public void wheels(){
        System.out.println("No of wheels "+wheel);
    }
    public void seats(){
        System.out.println("No of seats "+seat);
    }
    public void petrol(){
        System.out.println("petrol used "+petrol);
    }
}
class car implements vehicle{
    int wheel=4,seat=4,petrol=10;
    public void wheels(){
        System.out.println("No of wheels "+wheel);
    }
    public void seats(){
        System.out.println("No of seats "+seat);
    }
    public void petrol(){
        System.out.println("petrol used "+petrol);
    }
}
 class exp1 {
    public static void main(String[] args){
        bicycle v1 = new bicycle();
        bike v2 = new bike();
        car v3 = new car();
        System.out.println("Bicycle");
        v1.wheels();v1.seats();v1.petrol();
        System.out.println("Bike");
        v2.wheels();v2.seats();v2.petrol();
        System.out.println("Car");
        v3.wheels();v3.seats();v3.petrol();
    }
}
