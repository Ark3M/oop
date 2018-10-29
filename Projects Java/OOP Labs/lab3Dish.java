public abstract class Dish {

    private String material;

    public String getMaterial(){
        return material;
    }

    public Dish(String material) {
        this.material = material;
    }

    public abstract void displayInfo();
}

class Fork extends Dish{

    private String facility;

    public Fork(String material, String building){

        super(material);
        this.facility = building;
    }

    public void displayInfo(){

        System.out.println("Fork can be made of " + super.getMaterial() + " and can be used in " + facility);
    }
}

class Spoon extends Dish{

    private String facility;

    public Spoon(String material, String building){

        super(material);
        this.facility = building;
    }

    public void displayInfo(){

        System.out.println("Spoon can be made of " + super.getMaterial() + " and can be used in " + facility);
    }
}

class Plate extends Dish{

    private String facility;

    public Plate(String material, String building){

        super(material);
        this.facility = building;
    }

    public void displayInfo(){

        System.out.println("Plate can be made of " + super.getMaterial() + " and can be used in " + facility);
    }
}
