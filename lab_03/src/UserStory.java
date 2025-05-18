import java.util.Arrays;

public class UserStory extends Ticket {
    private UserStory[] dependencies;

    public UserStory(int id, String name, int estimate, UserStory[] dependencies) {
        super(id, name, estimate);
        // Захист від null
        this.dependencies = (dependencies == null) ? new UserStory[0] : dependencies.clone();
    }

    @Override
    public void complete() {
        for (UserStory dep : dependencies) {
            if (!dep.isCompleted()) {
                return; // Якщо є незавершені залежності — не завершувати
            }
        }
        super.complete();
    }

    public UserStory[] getDependencies() {
        return dependencies.clone(); // Захищена копія
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}
