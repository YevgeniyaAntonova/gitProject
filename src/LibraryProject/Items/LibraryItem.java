package LibraryProject;

public abstract class LibraryItem {
    int id;
    String name;
    boolean isAvailable;

    public LibraryItem(int id, String name, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    public  abstract void displayDetails();
}
