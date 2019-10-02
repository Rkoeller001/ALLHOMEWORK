package learnerlab;

public class Person {
    final long id;
    public String name;

    public Person(long id, String name){
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
