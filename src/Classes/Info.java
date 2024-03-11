package Classes;

public abstract class Info {

    public String name;
    public int id;

    public Info(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
