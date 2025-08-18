public class Casting {
    public static void main(Stringex[] args) {
        
        float f = 5.6f;
        int x = (int)f; // it gives f in int format
        System.out.println(x);

        int a= 257;
        byte b = (byte)a; // it will perform modulus operation from a%range of byte
        System.out.println(b);//1

        //Type promotions
        byte a1=10;
        byte a2=30;
        int res = a1*a2; // it is out of range of byte that's why it allows to store in int this is called as type promotion
        System.out.println(res); 
        

    }
}
