package WallArea;

public class Wall {
    private double width, height;

    public Wall(){
        this.width = 0.0;
        this.height = 0.0;
    }

    public Wall(double width, double height){
        setHeight(height);
        setWidth(width);        
    }

    public double getArea(){
        return this.height * this.width;
    }

    public void setWidth(double width){
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public void setHeight(double height){
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight(){
        return this.height;
    }
}
