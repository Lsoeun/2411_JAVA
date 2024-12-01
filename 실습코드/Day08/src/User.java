public class User {
    private int id;
    protected String account;
    public String password;

    public User(int id, String account, String password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    public User(int id) {
        this(id, "a", "b");
    }

    public void printId() {
        System.out.println(this.id);
    }

    public void printAll() {
        this.printId();
        System.out.println(this.account);
        System.out.println(this.password);
    }

    public static void main(String[] args) {
        User user = new User(123);
        user.printAll();
    }
}
