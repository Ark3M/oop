package practice;

public class Ball {

    private double size;
    private String color;


    public Ball(){ //1st constructor
        size = 2.0;
        color = "blue";
    }

    public Ball(double s){ //2nd constructor
        size = s;
        color = "blue";
    }

    public Ball(double s, String c){ //3d constructor
        size = s;
        color = c;
    }

    public double getSize(){ //1st method
        return size;
    }

    public String getColor(){ //2nd method
        return color;
    }


}
