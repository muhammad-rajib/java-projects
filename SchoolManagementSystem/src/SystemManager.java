import java.util.Scanner;
import java.util.ArrayList;

import CalculatorSystem.AdvancedCalculator;
import StudentSystem.StudentForm;
import Utils.PrepareForm;
import Utils.CalculatorServiceMsg;
import Utils.StudentServiceMsg;
import Utils.CRUDServices;
import Utils.SystemServices;


public class SystemManager {
    // main function
    public static void main(String[] args) {

        ArrayList<StudentForm> Database = new ArrayList<>();
        int option;
        int operation;

        SystemServices ss;
        ss = new StudentServiceMsg();

        SystemServices cs;
        cs = new CalculatorServiceMsg();

        while(true)
        {
            System.out.println("\n\nWelcome to our School Management System !!!\n");
            System.out.println("1. Student Services");
            System.out.println("2. Calculator Services");
            System.out.println("0. Terminate\n");

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Option: ");
            option = scan.nextInt();

            if (option == 0)
                break;

            if (option == 1)
            {
                ss.greeting_msg();
                while (true)
                {
                    ss.service_info();
                    System.out.print("Enter Operation: ");
                    operation = scan.nextInt();

                    if (operation == 0)
                        break;

                    // create | read | update | delete
                    switch (operation)
                    {
                        case 1:
                        { // create
                            StudentForm std = PrepareForm.fillUp();
                            CRUDServices.create(std, Database);
                            break;
                        }
                        case 2:
                        { // read
                            System.out.print("Search Id: ");
                            int search_id = scan.nextInt();
                            CRUDServices.filterById(search_id, Database);
                            break;
                        }
                        case 3:
                        { // update
                            System.out.print("Update through id: ");
                            StudentForm update_std = PrepareForm.fillUp();
                            CRUDServices.update(update_std, Database);
                            break;
                        }
                        case 4:
                        { // delete
                            System.out.print("Delete Id: ");
                            int delete_id = scan.nextInt();
                            CRUDServices.delete(delete_id, Database);
                            break;
                        }
                        default:
                            System.out.println("Invalid Operation");
                    }
                }
                ss.terminate_msg();
            }
            else if (option == 2)
            {
                cs.greeting_msg();
                while (true)
                {
                    double num1, num2;
                    int a, b, c;

                    cs.service_info();
                    System.out.print("Enter Operation: ");
                    operation = scan.nextInt();

                    if (operation == 0)
                        break;

                    // addition | subtraction | multiplication | division
                    switch (operation)
                    {
                        case 1:
                        { // addition
                            System.out.print("Enter your 1st value: ");
                            a = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            b = scan.nextInt();
                            System.out.print("Enter your 3rd value: ");
                            c = scan.nextInt();
                            AdvancedCalculator.add(a, b, c);
                            break;
                        }
                        case 2:
                        { // subtraction
                            System.out.print("Enter your 1st value: ");
                            a = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            b = scan.nextInt();
                            AdvancedCalculator.sub(a, b);
                            break;
                        }
                        case 3:
                        { // multiplication
                            System.out.print("Enter your 1st value: ");
                            a = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            b = scan.nextInt();
                            AdvancedCalculator.multiply(a, b);
                            break;
                        }
                        case 4:
                        { // division
                            System.out.print("Enter your 1st value: ");
                            num1 = scan.nextInt();
                            System.out.print("Enter your 2nd value: ");
                            num2 = scan.nextInt();
                            AdvancedCalculator.div(num1, num2);
                            break;
                        }
                        default:
                            System.out.println("Invalid Operation");
                    }
                }
                cs.terminate_msg();
            }
            else {
                System.out.println("Invalid Options");
            }
        }
    }
}
