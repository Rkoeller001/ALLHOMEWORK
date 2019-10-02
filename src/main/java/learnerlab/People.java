package learnerlab;

import java.util.Iterator;
import java.util.List;

public class People {
    List personList = (List) new Person(34576484," dan");

    public void findUser(){
        String name = "   ";
        if (name.contains("person")){
            System.out.println(personList);
        }else {
            System.out.println("try again");
        }
    }
    public boolean contains(Person person){
        if (personList.contains(person)){
            return true;
        }else {
            return false;
        }
    }

    public void add(Person person){
        personList.add(person);
    }
    public Person findById(int id){

        return (Person) personList.get(id);
    }
    public boolean remove(Person person){

        return personList.remove(person);

    }
    public void removeAll(){
        personList.clear();

    }
    public Object[] toArray(){

      return personList.toArray();
    }
    public int count(){

        return personList.size();
    }
    public Iterator iterator(){

       return personList.iterator();
    }
}
