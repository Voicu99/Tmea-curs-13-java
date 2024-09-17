public class Employee {
    private int id;
    private String name;
    private String email;
    private Role role;
    private boolean isTeamLead;

    // Constructor
    public Employee(int id, String name, String email, Role role, boolean isTeamLead) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.isTeamLead = isTeamLead;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Role getRole() { return role; }
    public boolean isTeamLead() { return isTeamLead; }
    public void setTeamLead(boolean isTeamLead) { this.isTeamLead = isTeamLead; }

    // Method to check if the employee is an admin
    public boolean isAdmin() {
        return role == Role.ADMIN;
    }
}


