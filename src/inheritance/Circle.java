package inheritance;

public class Circle extends Shapes{

    @Override
    public int calculateArea(){
        System.out.println("Area of circle is");
        return areaOfShape;
    }
}
