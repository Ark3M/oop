public interface Priceable {

    double getPrice();
}

class FoodShop implements Priceable{

    protected String milk;

    public FoodShop(String milk){
        this.milk = milk;
    }

    public String toString(){
        return ""+this.milk+"";
    }

    public double getPrice(){
        return 60;
    }
}

class SportShop implements Priceable{

    protected String ball;

    public SportShop(String ball){
        this.ball = ball;
    }

    public String toString(){
        return ""+this.ball+"";
    }

    public double getPrice(){
        return 90;
    }
}
