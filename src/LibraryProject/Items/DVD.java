package LibraryProject;

public class DVD extends LibraryItem implements BorrowableItem {
    int runtime;

    public DVD(int id, String name, boolean isAvailable, int runtime) {
        super(id, name, isAvailable);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[DVD: %s, %d]", name, runtime);
    }

    @Override
    public void borrow() {

    }
}
