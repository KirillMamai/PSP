package kirill.mamay.FirstApp;

public class Book {
    private String name;
    private Boolean illustration;
    private int price;

    Book(String name,Boolean illustration, int price){
        this.name = name;
        this.illustration = Boolean.FALSE;
        this.price = price;
    }
    Book(String name, int price){
        this.name = name;
        this.illustration = Boolean.TRUE;
        this.price = price;
    }
    Book(String name, Boolean illustration){
        this.name = name;
        this.illustration = Boolean.FALSE;
        this.price = (int) (Math.random() * 1000);
    }

    public void printAllInfo(){
        System.out.println("Название:" + name);
        System.out.println("Наличие иллюстраций:" + illustration);
        System.out.println("Цена:" + price);
    }

}

