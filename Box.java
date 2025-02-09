public class Box {
//  tight encapsulation is achieved as members declared as private and
//  can only be accessed via public method from other classes
    private double width, depth, height ;

//  paramterized constructor to create object
    Box( double width, double depth, double height ){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    String getBoxDimensions(){
        return "Box dimensions: width = "+width+ " depth = "+depth+" height = "+height;
    }
    double getBoxVolume(){
        return width * height * width;
    }
}
