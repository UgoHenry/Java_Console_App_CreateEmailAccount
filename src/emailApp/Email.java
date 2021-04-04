package emailApp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLenght = 10;
    private int mailboxcapacity = 500;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";


    // Constructor to receive the first name and last name
    public Email (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        //System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname); redundancy


        //Call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println("Department:" + this.department); redundancy2


        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLenght);
        //System.out.println("Your password is:" + this.password); redundancy3

        //combine elements to generate email
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your email is:" + email);redundancy4

    }
    // Ask for the department
    private String setDepartment() {
        System.out.print("New worker:" + firstname + ". Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code " );
        Scanner in = new Scanner(System.in);
        int depchoice = in.nextInt();
        if (depchoice==1) {return "sales";}
        else if (depchoice==2) {return "dev";}
        else if (depchoice==3) {return "acct";}
        else {return "";}

    }
    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random()*passwordSet.length());
            password[i]= passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxcapacity= capacity;
    }
    //Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    //Change the password
    public void changePassword(String password) {
        this.password= password;
    }

    public int getMailboxCapacity() {return mailboxcapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getpassword() {return password;}

    public String showinfo() {
        return "DISPLAY NAME: " + firstname + " " + lastname +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxcapacity + "mb";

    }


}
