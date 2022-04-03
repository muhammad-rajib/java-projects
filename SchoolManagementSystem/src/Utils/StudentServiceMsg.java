package Utils;


public class StudentServiceMsg extends SystemServices{

    // Greetings message
    @Override
    public void greeting_msg()
    {
        System.out.println("\nWelcome to our Student Services !!!");
    }

    // Ending message
    @Override
    public void terminate_msg()
    {
        System.out.println("Terminating Student Services");
    }

    // Student Services
    @Override
    public void service_info()
    {
        System.out.println(
                "\nStudent Services: \n" +
                "# 1 Create\n" +
                "# 2 Read\n" +
                "# 3 Update\n" +
                "# 4 Delete\n" +
                "# 0 Terminate\n"
        );
    }
}
