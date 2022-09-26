package day40_inheritance.discord;

public class Discord {
    String role;
    String name;
    String id;

    public Discord(String role, String name, String id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Discord{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
