package simple;
public class GiftBox {
     //начальный массив (пустой) с размерностю 0
     Sweet[] mSweets = new Sweet[0];
    private double totalWeight = 0;
     private double totalPrice = 0;

     public void addSweet(Sweet sweet) {
         //сохраняем размер массива в переменную
         int oldItem = mSweets.length;
         //создаем массив с размерностью на один больше чем старый
         Sweet[] newSweets = new Sweet[oldItem + 1];

         //сохраняем значения из старого массива в новый
         for (int i = 0; i < oldItem; i++) {
             newSweets[i] = mSweets[i];
                }
        //добавляем на последнее место новый элемент
        // 23         newSweets[oldItem] = sweet;

         //обновляем ссылку, и связываем с ней новый массив
         mSweets = newSweets;

         //обновляем веса и цену
         totalWeight += sweet.weight;
         totalPrice += sweet.price;
         printItems();
     }

     void deleteSweet(int index) {
       int oldItemSize = mSweets.length;
         //создаем массив с размерностью на один больше чем старый
         Sweet[] newSweets = new Sweet[oldItemSize - 1];
        //копируем значения из старого массива, когда дошли до удаляемого элемента - выходим из цикла
         for (int i = 0; i < index; i++) {
             newSweets[i] = mSweets[i];
         }
        //копируем значения из старого массива, пропускаем удаляемый элемент, не забывая про смещение
         for (int i = index; i < oldItemSize-1; i++) {
             newSweets[i] = mSweets[i + 1];
         }
         //обновляем веса и цену
        totalWeight -= mSweets[index].weight;
         totalPrice -= mSweets[index].price;
       //обновляем ссылку, и связываем с ней новый массив
         mSweets = newSweets;
        printItems();
     }

     void printItems() {
         for (int i = 0; i < mSweets.length; i++) {
             System.out.println(i+". "+mSweets[i].description());
         }
     }

    public double getTotalWeight() {
         return totalWeight;
     }

     public double getTotalPrice() {
         return totalPrice;
     }

     public int getNumOfSweets() {
         return mSweets.length;
}

     public static GiftBox generateGiftBox(){
       return new GiftBox();
 //       return null;
    }
}