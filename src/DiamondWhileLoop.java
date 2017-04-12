/**
 * Created by dominicmassimo on 4/12/17.
 */
public class DiamondWhileLoop {
    public static String  drawDiamond(int y){
        String result = "";
        int i = 1;
            while (i < y + 1) {
                int spaces = 0;
                while (spaces < y - i) {
                    spaces++;
                    System.out.print(" ");
                }
                int j = i;
                while (j > 0) {
                    j--;
                    System.out.print("* ");
                }
                System.out.println();
                i++;
            }
            i = y - 1;
            while (i > 0) {
                int spaces = 0;
                while (spaces < y - i) {
                    spaces++;
                    System.out.print(" ");
                }
                int j = i;
                while (j > 0) {
                    System.out.print("* ");
                    j--;
                }
                System.out.println();
                i--;
        }
        return result;
    }

}
