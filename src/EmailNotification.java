class EmailNotification {
    public static void sendEmail(Employee employee, String subject, String message) {
        System.out.println("Sending email to: " + employee.getEmail());
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
        // Logic for sending an email (dummy implementation)
    }
}

