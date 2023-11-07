import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Apartment apartment = new Apartment();
        Apartment apartment1 = new Apartment();

        Apartment apartmentName = new Apartment();

        Student studentPerson = new Student();
        Student studentPerson1 = new Student();

        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        apartment.setNameApart("Park Hotel");
        apartment.setPrice(20000);
        apartment.setAddress("Orozbekova 87");


        apartment1.setNameApart("Sheraton");
        apartment1.setPrice(80000);
        apartment1.setAddress("Manas 34");

        student.setFullName("Ali");
        student.setNumber("05000389438");
        student.setAdress2("Manas 34");
        student.setBankAcount(100000);

        student1.setFullName("Jigit");
        student1.setNumber("0500039238");
        student1.setAdress2("Manas 34");
        student1.setBankAcount(15000);

        student2.setFullName("Nur");
        student2.setNumber("05000389458");
        student2.setAdress2("Orozbekova 87");
        student2.setBankAcount(12000);

        student3.setFullName("Salim");
        student3.setNumber("0500324438");
        student3.setAdress2("Manas 34");
        student3.setBankAcount(10500);

        student4.setFullName("Jakub");
        student4.setNumber("0700037538");
        student4.setAdress2("Orozbekova 87");
        student4.setBankAcount(20020);

        student5.setFullName("Aslan");
        student5.setNumber("0500021438");
        student5.setAdress2("Orozbekova 87");
        student5.setBankAcount(300000);

        Apartment[] apartments = {apartment, apartment1};
        Student[] students = {student, student1, student2, student3, student4, student5};

        getInfoApart(apartments,students);
        apartmentName.payPal(students,apartments);
        studentPerson.liveln(apartments,students);
        studentPerson1.changeInfo(students);


    }
    public static void getInfoApart(Apartment [] apartments, Student [] students){
        System.out.println("Adressti toltur :\n");
        String string = new Scanner(System.in).nextLine();
        System.out.println("ADDRESS :" + string);


        for (Apartment apart : apartments){
            if (apart.getAddress().equals(string)){
                System.out.println(STR."""

                                 INFO APART

                        Name Apart : \{apart.getNameApart()}
                        Price  : \{apart.getPrice()}
                        Adsress  : \{apart.getAddress()}
                        """);


            }
        }
        for (Student stud : students){
            if (stud.getAdress2().equals(string)){
                System.out.println(STR."""
                                     STUDENTS INFO:

                        Students : \{stud.getFullName()}
                        Students address : \{stud.getAdress2()}
                        """);
            }
        }



    }
}