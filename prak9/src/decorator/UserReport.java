package decorator;

public class UserReport implements IReport {
    @Override
    public String generate() {
        return "User Report Data";
    }
}

