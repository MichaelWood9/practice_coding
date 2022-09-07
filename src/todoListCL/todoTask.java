package todoListCL;

public class todoTask {
    String taskName;
    int priority;
    String deadline;

    public todoTask(String taskName, int priority, String deadline) {
        this.taskName = taskName;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "todoTask{" +
                "taskName='" + taskName + '\'' +
                ", priority=" + priority +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}
