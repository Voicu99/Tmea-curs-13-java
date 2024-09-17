import java.util.ArrayList;
import java.util.List;

public class Project {
    private int projectId;
    private String projectName;
    private String location;
    private List<Team> teams;
    private List<Resource> availableResources;
    private List<Resource> neededResources;

    public Project(int projectId, String projectName, String location) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.location = location;
        this.teams = new ArrayList<>();
        this.availableResources = new ArrayList<>();
        this.neededResources = new ArrayList<>();
    }

    // Manage teams
    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(Team team) {
        teams.remove(team);
    }

    // Manage resources
    public void addAvailableResource(Resource resource) {
        availableResources.add(resource);
    }

    public void addNeededResource(Resource resource) {
        neededResources.add(resource);
    }

    // Getters
    public int getProjectId() { return projectId; }
    public String getProjectName() { return projectName; }  // Add this method
    public String getLocation() { return location; }
    public List<Team> getTeams() { return teams; }
    public List<Resource> getAvailableResources() { return availableResources; }
    public List<Resource> getNeededResources() { return neededResources; }
}


