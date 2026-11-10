package dsa.warmup.variables;

/**
 * Lesson: Area and Perimeter of Shapes – https://algomaster.io/learn/dsa/area-and-perimeter-of-shapes – Easy
 * Pattern: Warmup
 * Understand: input = String shape ("rectangle" | "square" | "circle" | "triangle"), double[] dims, output = [area, perimeter], each rounded to 2 decimals (PI = 3.14159)
 * Test cases:
 *   - example: ("rectangle", [4, 3]) -> [12.0, 14.0]
 * Approach 1: Apply Formulas – O(1) time, O(1) space
 * Note:
 */
public class AreaAndPerimeterOfShapes {

    public static double[] areaAndPerimeter(String shape, double[] dims) {
        double area = 0, perimeter = 0;
        switch (shape) {
            case "triangle": {
                double a = dims[0], b = dims[1], c = dims[2];
                perimeter = a + b + c;
                double s = perimeter / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            }
            case "rectangle": {
                double length = dims[0], width = dims[1];
                perimeter = 2 * (length + width);
                area = length * width;
                break;
            }
            case "square": {
                double side = dims[0];
                perimeter = side * 4;
                area = side * side;
                break;
            }
            case "circle": {
                double radius = dims[0];
                double PI = 3.14159;
                perimeter = PI * 2 * radius;
                area = PI * radius * radius;
                break;
            }
        }
        return new double[] {Math.round(area*100)/100.0, Math.round(perimeter*100)/100.0};
    }


    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(areaAndPerimeter("triangle", new double[]{1, 1, 1.9999999})));
        // add your normal and edge cases here
    }
}
