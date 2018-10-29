package practice1;

public class Ball {

        private double size;
        private String color;


        public Ball(){ //1st constructor
            size = 2.0;
            color = "blue";
        }

        public Ball(double s){ //2nd constructor
            size = s;
            color = "red";
        }

        public Ball(double s, String c){ //3d constructor
            size = s;
            color = c;
        }

        public void setSize(double size){
            this.size = size;
        }

        public void setColor(String color){
            this.color = color;
        }

        public double getSize(){ //1st method
            return size;
        }

        public String getColor(){ //2nd method
            return color;
        }
}
