package simple;

public abstract class Sweet {
     String name;
     double price=-1;
     double weight=0;

     public Sweet(String name){
         this.name=name;
     }

     public Sweet(String name, double price, double weight){
         this.name=name;
         this.price=price;
         this.weight=weight;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public abstract String description();

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) throws Exception {
         if (price<0){
             throw new Exception("Цена не может быть отрицательной");
         }
         this.price = price;
     }
}