package develop.telegram;

import java.time.LocalDateTime;

public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String bio;
    private LocalDateTime created_at;
    public User(String username, String password,String name, String phone, String email, String bio) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.bio = bio;
        this.created_at = created_at;
    }
    public User(int id, String username, String password, String phone, String email, String bio) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.bio = bio;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public LocalDateTime getCreated_at(){
        return created_at;
    }
    public String getBio(){
        return bio;
    }



}
