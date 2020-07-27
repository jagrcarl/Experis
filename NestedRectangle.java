import java.util.Scanner;
public class NestedRectangle {
    private static Scanner scan;

    public static void main(String[] args) {
        int width, height, i, j;
        scan = new Scanner(System.in);

        System.out.print("How wide should the rectangle be?: "); //lets the user decide the width of the rectangle
        width = scan.nextInt();

        System.out.print("How high should the rectangle to be?: "); //lets the user decide the height of the rectangle
        height = scan.nextInt();

        for (i = 0; i < height; i++)
        {
            for (j = 0; j < width; j++)
            {
                if (i == 0 || i == height -1 || j == 0 || j == width-1) {
                    System.out.print("#");    //  i == 0 is the first row. j == 0 is the left vertical row. i == height - 1 is the the last row. j == width - 1 is the right vertical row
                }
                else if ((width >= 6 && height >=6) && ((i==2 && j>=2 && j < width-2) || i==height-3 && j>=2 && j < width-2 //the width and height must be 6 or bigger. after that, I used the coordinates and intervals to draw out the inner rectangle
                    || j==2 && i>2 && i<height-3 || j==width-3 && i>2 && i < height-3)) {
                    System.out.print("#");
                }
              else {
                    System.out.print(" "); //everywhere else in the nested forloop, it will print a " "
                }

            }
            System.out.println(); //for each height, it jumps down one row
        }
    }
}
