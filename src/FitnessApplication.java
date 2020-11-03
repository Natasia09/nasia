
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class FitnessApplication {

    public static void main(String[] args) {
        int select;
        int count = 0;
        Member member1 = null, member2 = null, member3 = null, member4 = null, member5 = null;
        double memberWeight1 = 0, memberWeight2 = 0, memberWeight3 = 0, memberWeight4 = 0, memberWeight5 = 0;
        double memberHeight1 = 0, memberHeight2 = 0, memberHeight3 = 0, memberHeight4 = 0, memberHeight5 = 0;
        String menuStr = "add member \n"
                + "2. edit member \n"
                + "3. show all members\n"
                + "0. exit";
        Scanner scn = new Scanner(System.in);

        System.out.println(menuStr);

        do {
            System.out.println("Select menu: ");
            select = scn.nextInt();
            switch (select) {
                case 1:

//-----------------------------------------------------------
                    switch (count) {
                        case 0:
                            count++;
                            member1 = new Member (getNameFromKeyboard(scn),getWeightFromKeyboard(scn),getHeightFromKeyboard(scn));
                           
                            break;
                        case 1:
                            count++;
                            member2 = new Member (getNameFromKeyboard(scn),getWeightFromKeyboard(scn),getHeightFromKeyboard(scn));
                  
                            break;
                         case 2:
                            count++;
                            member3 = new Member (getNameFromKeyboard(scn),getWeightFromKeyboard(scn),getHeightFromKeyboard(scn));
                  
                            break;
                    }
                    System.out.println(select);

                    break;

                case 2:

                    break;
                case 3:
                    if (member1 !=null) {
                        System.out.println(member1.toString());
                    }
                    if (member2 !=null) {
                        System.out.println(member2.toString());
                    }
                    if (member3 !=null) {
                        System.out.println(member3.toString());
                    }
                    break;
            }
            System.out.println(select);
        } while (select != 0);
    }

    public static String getNameFromKeyboard(Scanner input) {
        System.out.println("Input member name: ");
        return input.nextLine();
    }

    public static double getWeightFromKeyboard(Scanner input) {
        System.out.println("Input Weight ");
        return input.nextDouble();
    }

    public static double getHeightFromKeyboard(Scanner input) {
        System.out.println("Input Hright ");
        return input.nextDouble();
    }
}
