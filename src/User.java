public abstract class User {
    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Abstract methods to view project data
    public abstract void viewProjectResources(Project project);
    public abstract void viewTeams(Project project);

    // Common methods
    protected void sendEmail(Employee employee, String subject, String message) {
        EmailNotification.sendEmail(employee, subject, message);
    }
}




