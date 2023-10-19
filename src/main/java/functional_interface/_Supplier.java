package functional_interface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getConnectionUrl());
        System.out.println(getDBConnectionSupplier.get());

    }
    static String getConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
    static Supplier<String> getDBConnectionSupplier = () ->
            "jdbc://localhost:5432/users";

}
