/**
 * User:DELL
 * Date:2021-03-19
 * Time:11:02
 */
public class User {
    private int id;
    private String user;
    private String password;

//    public User(int id, String user, String password) {
//        this.id = id;
//        this.user = user;
//        this.password = password;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
