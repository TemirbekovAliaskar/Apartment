import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Student {

   private String fullName ;
  private   String number;
   private String adress2;
   private int bankAcount;



    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAdress2(String adress) {
        this.adress2 = adress;
    }

    public void setBankAcount(int bankAcount) {
        this.bankAcount = bankAcount;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNumber() {
        return number;
    }

    public String getAdress2() {
        return adress2;
    }

    public int getBankAcount() {
        return bankAcount;
    }

    public void liveln(Apartment [] apartments,Student [] students){

        System.out.println("Atyndy jaz  :  ");
        String scan = new Scanner(System.in).nextLine();

        int cash = 0;
        String add = "";

        for (Student stud : students){
            if (stud.getFullName().equals(scan)){
                System.out.println(STR."""
                                STUDENTS INFO:
                        Name : \{stud.getFullName()}
                        SUMMA BANK : \{stud.getBankAcount()}

                        """);
                cash = stud.getBankAcount();
                add = stud.getAdress2();
            }
        }
        for (Apartment apart : apartments){
            if (apart.getAddress().equals(add)){
                int month = apart.getPrice() / 3;

                System.out.println(STR."""
                                  INFO APART:
                        Name Apart  :   \{apart.getNameApart()}
                        Price   :   \{apart.getPrice()}
                        Address  : \{apart.getAddress()}
                        Kancha jashai alasyn : \{cash / month}

                        """);
            }
        }

    }
    public  void changeInfo(Student [] students){

        System.out.println("Atyndy jaz :");
        String name  = new Scanner(System.in).nextLine();
        String pust = "";
        boolean istrue = false;



        for (Student stud : students){
            if (stud.getFullName().equals(name)){
                pust = stud.getFullName();
                istrue= true;
                break;
            }
            if (!istrue){
                System.out.println("Ne naiden name !");
                return;
            }
        }


        System.out.println(STR."""
                
                1. Name : 
                2. Number :
                3. Adress :
                4. Bank  :
                
                 Emneni ozgortosun ! 
                 San menen tanda !
                                """);

        int dannyi = new Scanner(System.in).nextInt();

        switch (dannyi){
            case 1 :
                System.out.println("New Name :");
                String scan = new Scanner(System.in).nextLine();
                for (Student st : students){
                    if (st.getFullName().equals(pust)){
                        st.setFullName(scan);
                        System.out.println(STR."""
                                1. Name : \{st.getFullName()}
                                2. Nummber : \{st.getNumber()}
                                3. Address : \{st.getAdress2()}
                                4. Bank cash : \{st.getBankAcount()}
                                """);
                    }
                }
                break;
            case 2 :
                System.out.println("New number :");
                String scan1 = new Scanner(System.in).nextLine();
                for (Student st : students){
                    if (st.getFullName().equals(pust)){
                        st.setNumber(scan1);
                        System.out.println(STR."""
                                1. Name : \{st.getFullName()}
                                2. Nummber : \{st.getNumber()}
                                3. Address : \{st.getAdress2()}
                                4. Bank cash : \{st.getBankAcount()}
                                """);
                    }
                }
                break;
            case 3 :
                System.out.println("New Address :");
                String scan2 = new Scanner(System.in).nextLine();
                for (Student st : students){
                    if (st.getFullName().equals(pust)){
                        st.setAdress2(scan2);
                        System.out.println(STR."""
                                1. Name : \{st.getFullName()}
                                2. Nummber : \{st.getNumber()}
                                3. Address : \{st.getAdress2()}
                                4. Bank cash : \{st.getBankAcount()}
                                """);
                    }
                }
                break;
            case 4 :
                System.out.println("New Bank : ");
                int scan3 = new Scanner(System.in).nextInt();
                for (Student st : students){
                    if (st.getFullName().equals(pust)){
                        st.setBankAcount(scan3);
                        System.out.println(STR."""
                                1. Name : \{st.getFullName()}
                                2. Nummber : \{st.getNumber()}
                                3. Address : \{st.getAdress2()}
                                4. Bank cash : \{st.getBankAcount()}
                                """);
                    }
                }
                break;
            default:
                System.err.println("Error");
        }



    }

}
