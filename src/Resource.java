class Resource {
    private int resourceId;
    private String resourceName;
    private int quantity;

    public Resource(int resourceId, String resourceName, int quantity) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getResourceId() { return resourceId; }
    public String getResourceName() { return resourceName; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}

