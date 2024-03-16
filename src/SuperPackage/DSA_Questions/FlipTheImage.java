package SuperPackage.DSA_Questions;

public class FlipTheImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

//        for (int[] rows : image) {
//            System.out.println(rows + " ");
//        }
        image = fliptheimage(image);
        for(int [] rows : image){
            for(int element : rows){
                System.out.print(element + ",");
            }
            System.out.println();
        }

    }

    static int[][] fliptheimage(int[][] image) {
        for (int[] rows : image) {
            for (int i = 0; i <= (image[0].length + 1) / 2; i++) {
                int temp = rows[i] ^ 1;
                rows[i] = (rows[image[0].length - i - 1]) ^ 1;
                (rows[image[0].length - i - 1]) = temp;
            }


        }
        return image;
    }
}