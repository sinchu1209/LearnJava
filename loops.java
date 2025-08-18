public class loops {
    public static void main(Stringex[] args) {
        //loops = while, do while and for loop
        int i=0;
        while(i<=5){
            System.out.println("Hello"+i);
            i++;
        }
        System.out.println(i); // 6 because in while loop it is already incremented and then came out of the loop becoz of the condition
        
        int j=1;
        while(j<=4) {
            System.out.println("Hiiii"+j);
            int k=1;
            while(k<=3) {
                System.out.println("Hello"+k);
                k++;
            }
            j++;
        }
    //  Do While loop -- it will execute the code atleast once
        int i1=5;
        do {
            System.out.println("Do it"+i1);
            i1++;
        } while(i1<=4); // Do it5
    }

}
