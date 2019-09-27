
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder
{
    private int height;
    private String name;
    private Double radius;
    
    public Cylinder(String name, Double radius, int height){
        this.name = name;
        this.radius = radius;
        this.height = height;
    }
    
    public Double computerVolume(){
        return radius*radius*height*Math.PI;
    }
    
    public String toString(){
        return name +" " + height+ " " + radius;
    }
    
}
