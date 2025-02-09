import java.util.Scanner;

public class TestBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Box dimensions : (width,depth,height) ");
        Box box1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

        System.out.println(box1.getBoxDimensions()+" volume of box: "+ box1.getBoxVolume());
    }
}
