package org.example.TaskObjective;

public class RegistrationClass {
    private String email;
    private String userName;
    private String password;

    protected void usersEmail(String email){
        this.email=email;
        System.out.println("Email: "+email);
    }
    protected void usersName(String userName){
        this.userName=userName;
        System.out.println("Username: "+userName);
    }
    protected void usersPassword(String password){
        this.password=password;
        System.out.println("Password: "+password);
    }

    public static void main(String[] args) {
        RegistrationClass re=new RegistrationClass();
        re.usersEmail("MrSmith11@yahoo.com");
        re.usersName("John Smith");
        re.usersPassword("Superman123");
    }
}
