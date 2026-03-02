package btvn.bt04;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority;
    private long arrivalOrder;

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.arrivalOrder = Long.MAX_VALUE;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    public long getArrivalOrder() { return arrivalOrder; }
    public void setArrivalOrder(long arrivalOrder) { this.arrivalOrder = arrivalOrder; }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " (priority=" + priority + ")";
    }
}