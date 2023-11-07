import java.util.Scanner;

public class Apartment {
    private String nameApart;

    private int price;
    private String address;

    public void setNameApart(String nameApart) {
        this.nameApart = nameApart;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameApart() {
        return nameApart;
    }

    public int getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }


    public void payPal(Student[] students, Apartment[] apartments) {
        System.out.println("Adressdi jazynyz :");
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        int counter = 0;
        int kvart = 0;
        for (Student st : students) {
            if (st.getAdress2().equals(scan)) {
                counter++;
            }
        }

        for (Apartment apart : apartments) {
            if (apart.getAddress().equals(scan)) {
                System.out.println(STR. """
                               INFO APART:
                        Name Apart : \{ apart.getNameApart() }
                        Price  : \{ apart.getPrice() }
                        Apart address  : \{ apart.getAddress() }

                        """ );
                kvart = apart.getPrice() / counter;
            }

        }


        for (Student stud : students) {
            if (stud.getAdress2().equals(scan)) {
                System.out.println(STR. """
                                 INFO STUDENTS:
                        Name students : \{ stud.getFullName() }
                        Price : \{ kvart }
                        Address : \{ stud.getAdress2() }

                        """ );
            }
        }
    }
}