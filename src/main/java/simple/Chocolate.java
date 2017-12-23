package simple;

public class Chocolate extends Sweet {

    public Chocolate(String name) {
         super(name);
     }
     public Chocolate(String name, double price, double weight) {
         super(name,price,weight);
     }

     public String description() {
         return "Молочная шоколадка с орешками "+name+" весом "+weight +" г. по цене "+price+" р. за шт.";
     }
 }

