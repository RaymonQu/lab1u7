public class cats {
    private String name;

    public cats(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String toString(){
        return name;
    }
}