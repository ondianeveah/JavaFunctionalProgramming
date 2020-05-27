package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

//Represents a supplier of results = takes no arguments
//returns any values you want like: custom classes/objects, array, a List
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println("//Using Supplier Functional Interface");
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlsSupplierList.get());
    }

    //point of function is to return the value
    static String getDBConnectionUrl(){
        return "jdbc://localhost:8080/greeting";
    }

    static Supplier<String> getDBConnectionUrlSupplier = ()
            -> "jdbc://localhost:8080/greeting";

    static Supplier<List<String>> getDBConnectionUrlsSupplierList = ()
            -> List.of(
                    "jdbc://localhost:8080/greeting",
            "jdbc://localhost:8080/customer");
}
