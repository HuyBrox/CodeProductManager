public class student {
    private int id;
    private String name;
    private String username;
    private String password;
    private String captcha;

    public student() {
    }

    public student(int id, String name, String username, String password, String captcha) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.captcha = captcha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public void printStudentInfo() {
        System.out.println(String.format("ID: %d, Name: %s, Username: %s, Password: %s, Captcha: %s",
                id, name, username, password, captcha));
    }
}
