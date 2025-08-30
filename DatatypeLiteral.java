public class DatatypeLiteral {
        public static void main(Strings a[]) {
            // These are the different datatypes
            int num1= 25;
            short sh = 32676;
            long lg = 10_00_00_00; // for better readibility of zeroes we can use underscore it won't affect
            byte by= 127;

            float ft = 6.5f;
            double db = 6.5;

            char ch = 's';
            boolean bool = true;
            System.out.println(num1);

            //literals
            double dob = 12e10; // works for binary and hexadecimals as well
            System.out.println(dob);

            char c = 'a';
            c++;
            System.out.println(c);
        }

}
