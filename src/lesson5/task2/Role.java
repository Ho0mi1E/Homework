package lesson5.task2;

public enum Role {
    DIRECTOR("директор"),
    EMPLOYEE("работник"),
    HR("Мэнеджер отдела кадров");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
