package REFECTOR;
public class student {


    private int id;
    private String name;
    private String username;
    private String password;
    private String capchar;

    public student(int id, String name, String username, String password, String capchar) {
        this.id = id;
        this.name = name;
        this.setUsername(username);
        this.password = password;
        this.capchar = capchar;
    }


     public void createNewUser() {
        System.out.println(id + " " + name+""+username+""+password+""+capchar);
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
	public String getpassword() {
		return  password;
	}
	public void setpassword(String password) {
		this.password= password;
	}
	
	public void setcapchar(String capchar) {
		this.capchar=capchar;
	}
	public String getcapchar() {
		return capchar;
		
	}
		
	public static void main(String[] args) {
		student student1 = new student(11, "Yen", "Pyen", "123", "ABCD");
		student1.createNewUser();
        
        System.out.println("ID:"+student1.getId());
        System.out.println("name:"+student1.getName());
        System.out.println("Username: " + student1.getUsername());
        System.out.println("Password: " + student1.getpassword());
        System.out.println("Captcha: " + student1.getcapchar());
        

        
	}   
    }


}
