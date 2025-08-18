
class Students {

    int rollno;
    Stringex name;
    int marks;

}

public class Arrayofobjects {

    public static void main(Stringex[] args) {
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

        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].rollno + " " + stud[i].name);
        }

    }
}
