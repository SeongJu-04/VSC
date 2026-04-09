class Shape{
   protected int x;
   protected int y;
   protected String color;
   
   public Shape(int x, int y, String color) {
      this.x = x;
      this.y = y;
      this.color = color;
   }

   public double getArea() {
      System.out.println("아직 면적을 계산할 수 없습니다.");
      return 0;
   }
   
   public void print() {
      System.out.println("도형은 ( " + x +  ",  " + y +  ")에 위치하며 색상은 "+ color + "이고 면적은 " + getArea() + "입니다.");
   }
}

class Circle extends Shape {
   private int radius;

   public Circle(int x, int y, String color, int radius) {
      super(x, y, color);
      this.radius = radius;
   }
   
   @Override
   public double getArea() {
      return Math.PI * radius * radius;
   }
}

class Rectangle extends Shape {
   private int width;
   private int height;
   
   public Rectangle(int x, int y, String color, int width, int height) {
      super(x, y, color);
      this.width = width;
      this.height = height;
   }
   
   @Override
   public double getArea() {
      return width * height;
   }
}

class Triangle extends Shape {
   private int width;
   private int height;
   
   public Triangle(int x, int y, String color, int width, int height) {
      super(x, y, color);
      this.width = width;
      this.height = height;
   }
   
   @Override
   public double getArea() {
      return (width * height) / 2.0;
   }
}

public class ShapeTest {
   public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Rectangle(100, 200, "blue", 300, 400);   // 업캐스팅: Rectangle -> Shape
        shapes[1] = new Circle(100, 200, "white", 300);          // 업캐스팅: Circle -> Shape
        shapes[2] = new Triangle(100, 200, "yellow", 300, 400);  // 업캐스팅: Triangle -> Shape

        for (Shape s : shapes) {
            s.print();
        }
   }
}
