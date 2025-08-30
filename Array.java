
public class Array {

    public static void main(Strings[] args) {

        int num[] = {1, 2, 3};
        System.out.println(num[1]); //2
        int num1[] = new int[5];
        System.out.println(num1[0]);  //0 by default all the values will be zero
        num1[0] = 10;
        num1[1] = 15;
        num1[2] = 20;
        num1[3] = 34;
        num1[4] = 90;
        System.out.println(num1[2] + num1[3]); // it adds
        // if u want to print all the numbers jus use for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(num1[i]);
        }
        //Multi-dimensional array
        int nums[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        //Jagged Array
        int nums1[][] = new int[3][];
        nums1[0] = new int[4];
        nums1[1] = new int[3];
        nums1[2] = new int[6];

        for (int i = 0; i < nums1.length; i++) {     //nums/length=3
            for (int j = 0; j < nums1[i].length; j++) {   //4,3,6
                nums1[i][j] = (int) (Math.random() * 100);
                System.out.print(nums1[i][j] + " ");
            }
            System.out.println();
        }

        //3-D array
        int nums2[][][] = new int[3][2][1];

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
