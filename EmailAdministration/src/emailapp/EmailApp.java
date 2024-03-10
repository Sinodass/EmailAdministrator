package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("Sinodas", "Tekeste");
        System.out.println(em1.showInfo());

        em1.setAlternateEmail("SG@gmail.com");
        System.out.println("You're alternate email is: " + em1.getAlternateEmail());
        em1.changePassword("newpassword123");
        System.out.println("You're new password is: " + em1.getPassword());
    }
}
