package useException;

        import java.util.Scanner;
        import java.util.regex.*;
class InvalidPasswordException extends Throwable {
    public InvalidPasswordException()
    {
        System.out.println("Enter a valid password");
    }
}
public class login {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter login id : ");
        String id=sc.next();
        System.out.print("Enter Password : ");
        String pass=sc.next();
        String regex = "(?=.*?[a-zA-Z])(?=.*?\\d)(?=.*?[^\\w]).{8,}";
        try {
            if(!pass.matches(regex)){
                throw new InvalidPasswordException();
            }
            System.out.println("Password is valid\n Login Succesful");
        }catch (InvalidPasswordException in){
            System.out.println("invalid password");
        }
    }
}