package simple;

public class App {
    public static void main(String[] args) {
        GiftBox box = GiftBox.generateGiftBox();
        box.addSweet(new Chocolate("Milka", 20, 80));
        box.addSweet(new Cookie("OREO", 50, 150));
        box.addSweet(new Cookie("Alpen gold", 50, 150));
        box.printItems();
        box.deleteSweet(1);
        System.out.println("***************");
        box.printItems();
        box.deleteSweet(0);
        System.out.println("***************");
        box.printItems();
        box.deleteSweet(0);
        System.out.println("***************");
        box.printItems();
    }
}
