class Operators {
   public static void main(Strings a[])
   {
    int num1 = 8;
    int num2 = 10;
    int num3= num1+num2; // similarly we can use -,*./,% any of the operators
    System.out.println(num3); //18
    num1=num1+1; 
    System.out.println(num1); //9
    num1++;
    System.out.println(num1); //10
    num1--;
    System.out.println(num1); //9
    ++num1;
    System.out.println(num1); //10
    --num1;
    System.out.println(num1); //9
    int num = 9;
    int result = num++;
    System.out.println("res1 - "+result); // so for post-increement the result is 9
    int result2 = ++num;
    System.out.println("res2 - "+result2); // so for pre-increement the result is 11 because res1 is now incrremented and increments again

    //Relational Operators
    int n1 = 6;
    int n2=7;
    boolean bo1= n1<n2; // you can try and use other symbols too like <=,>=,==,!=,<,>
    System.out.println(bo1);

    //Logical Operators
    int x= 7;
    int y=5;
    int a1= 5;
    int b = 9;
    boolean ret= x>y && a1<b; // you can try using other operators like  || , !
    System.out.println(!ret); //negates the result

    //Ternary Operators
    if(x%2==0) {
       y=5;
       System.out.println(y);
    }
   else {
       y=10;
       System.out.println(y);
   }
   //we cann write this entire code in one line using ternary operator
   y=x%2==0?5:10;
   System.out.println(y); // works the same as above
   }
}