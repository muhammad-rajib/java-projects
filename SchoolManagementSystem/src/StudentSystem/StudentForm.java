package StudentSystem;


public class StudentForm
{
    public int id;
    public String name;
    public String department;
    public int age;
    public int admissionYear;
    private String contact;
    private String address;

    // constructor
    public StudentForm(
            int id,
            String name,
            String department,
            int age,
            int admissionYear,
            String contact
    )
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.admissionYear = admissionYear;
        this.contact = setContact(contact);
    }

    public String setContact(String contact) {
        if (String.valueOf(contact).length() == 6) {
            return contact;
        }
        else {
            return "Invalid Contact";
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
