import java.util.List;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void viewProjectResources(Project project) {
        System.out.println("Admin view - Available Resources: ");
        for (Resource resource : project.getAvailableResources()) {
            System.out.println(resource.getResourceName() + ": " + resource.getQuantity());
        }

        System.out.println("Admin view - Needed Resources: ");
        for (Resource resource : project.getNeededResources()) {
            System.out.println(resource.getResourceName());
        }
    }

    @Override
    public void viewTeams(Project project) {
        System.out.println("Admin view - Teams in Project: " + project.getTeams().size());
        for (Team team : project.getTeams()) {
            System.out.println("Team Lead: " + team.getTeamLead().getName());
            System.out.println("Members: ");
            for (Employee member : team.getMembers()) {
                System.out.println("- " + member.getName());
            }
        }
    }

    // Admin-specific methods for managing projects
    public void addTeam(Project project, Team team) {
        project.addTeam(team);
        System.out.println("Team added to project.");
    }

    public void removeTeam(Project project, Team team) {
        project.removeTeam(team);
        System.out.println("Team removed from project.");
    }

    public void addResource(Project project, Resource resource) {
        project.addAvailableResource(resource);
        System.out.println("Resource added to project.");
    }

    public void removeResource(Project project, Resource resource) {
        project.getAvailableResources().remove(resource);
        System.out.println("Resource removed from project.");
    }

    public void manageProject(Project project) {
        System.out.println("Admin managing project: " + project.getProjectName());
        // Admin-specific project management logic
    }
}



