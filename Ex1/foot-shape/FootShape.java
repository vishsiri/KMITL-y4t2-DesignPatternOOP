import java.util.Scanner;

public class FootShape {
    Foot footShape;
    public String drawAsEllipse() {
        return footShape.draw();
    }
    
    public String drawAsRectangle() {
        return footShape.draw();
    }
    
    public FootShape(Foot footShape) {
        this.footShape = footShape;
    }
    
    public static void main(String[] args) {
        Foot footShape = null;
        FootShape app = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose foot shape 1. Ellipse, 2. Rectangle");
        int type = sc.nextInt();
        switch (type) {
            case 1:
                footShape = new Ellipse();
                app = new FootShape(footShape);
                System.out.println(app.drawAsEllipse());
                break;
            case 2:
                footShape = new Rectangle();
                app = new FootShape(footShape);
                System.out.println(app.drawAsRectangle());
                break;
        }
        sc.close();
    }
}
