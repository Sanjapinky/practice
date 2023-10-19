package final_section;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("Sanja", null, value -> {
            System.out.println("Last name not provided " + value);
        });
        hello2("Sanja", null, () -> {
            System.out.println("Last name not provided ");
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
   /* functiom hello(firstName, lastName, calback){
        console.log(fistName);
        if(lastName){
            console.log(lastName)
        }else{
            calback();
        }
    }*/
}
