package Encapsulation;

class Type{

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class Cars {
    public static void main(String[] args) {
Type type = new Type();
type.setPrice(20);
type.setName("Robin");

        System.out.println(type.getPrice());
        System.out.println(type.getName());
        System.out.println("We will continue!");
    }
}
