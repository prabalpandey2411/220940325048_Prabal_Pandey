class Shape
{
    void draw()
    {
        System.out.println("I'm Drawing.");
    }
    void erase()
    {
        System.out.println("I'm erasing.");
    }
}

class Circle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("I'm Drawing Circle.");
    }

    @Override
    void erase() {
        System.out.println("I'm erasing circle.");
    }
}

class Triangle extends Shape
{ @Override
    void draw()
    {
        System.out.println("I'm Drawing Triangle.");
    }
    @Override
    void erase()
    {
        System.out.println("I'm erasing  Triangle.");
    }
}

class Square extends Shape
{
    @Override
    void draw()
    {
        System.out.println("I'm Drawing Square.");
    }
    @Override
    void erase()
    {
        System.out.println("I'm erasing  Square.");
    }

}
public class Ques3
{
    public static void main(String[] args)
    {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape  square = new Square();


        circle.draw();
        circle.erase();

        triangle.draw();
        triangle.erase();

        square.draw();
        square.erase();
    }
}
