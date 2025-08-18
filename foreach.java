
class Students {

    int rollno;
    String name;
    int marks;
    

}

public class foreach {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.rollno = 12;
        s1.name = "spoorthi";
        s1.marks = 25;

        Students s2 = new Students();
        s2.rollno = 12;
        s2.name = "roops";
        s2.marks = 23;

        Students s3 = new Students();
        s3.rollno = 12;
        s3.name = "sinch";
        s3.marks = 24;

        Students stud[] = new Students[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        for (Students student : stud) {
            System.out.println(student.rollno + " " + student.name);
        }

        int nums[] = new int[4];
        nums[0] = 2;
        nums[1] = 10;
        nums[2] = 34;
        nums[3] = 8;
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
