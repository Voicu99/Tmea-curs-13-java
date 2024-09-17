import java.util.List;

public class Manager extends User {
    public Manager(String username, String password) {
        super(username, password);
    }

    @Override
    public void viewProjectResources(Project project) {
        System.out.println("Available Resources: ");
        for (Resource resource : project.getAvailableResources()) {
            System.out.println(resource.getResourceName() + ": " + resource.getQuantity());
        }

        System.out.println("Needed Resources: ");
        for (Resource resource : project.getNeededResources()) {
            System.out.println(resource.getResourceName());
        }
    }

    @Override
    public void viewTeams(Project project) {
        System.out.println("Teams in Project: " + project.getTeams().size());
        for (Team team : project.getTeams()) {
            System.out.println("Team Lead: " + team.getTeamLead().getName());
            System.out.println("Members: ");
            for (Employee member : team.getMembers()) {
                System.out.println("- " + member.getName());
            }
        }
    }

    public void changeTeamLead(Team team, Employee newLead) {
        team.changeTeamLead(newLead);
        System.out.println("Team leader changed to: " + newLead.getName());
    }

    public void sendAnnouncement(String message, List<Employee> employees) {
        for (Employee employee : employees) {
            sendEmail(employee, "Company Announcement", message);
        }
    }
}



