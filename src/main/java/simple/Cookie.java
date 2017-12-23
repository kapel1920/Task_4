package simple;

public class Cookie extends Sweet {
     public Cookie(String name) {
         super(name);
     }
     public Cookie(String name, double price, double weight) {
         super(name,price,weight);
                     }

     public String description() {
         return "Вкусненькое печенье с шоколадом "+name+" весом "+weight +" г. по цене "+price+" р. за шт.";
     }
 }

