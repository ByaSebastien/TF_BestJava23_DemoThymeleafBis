package be.bstorm.services;

import be.bstorm.models.entities.Animal;

import java.util.ArrayList;
import java.util.List;

public class FakeDB {

    List<Animal> animals;


    public FakeDB() {
        animals = new ArrayList<>();
        animals.add(new Animal("Zara"));
        animals.add(new Animal("Pitchoune"));
        animals.add(new Animal("Luna"));
        animals.add(new Animal("Molly"));
        animals.add(new Animal("Mr Leblanc"));
    }

    public List<Animal> getAll(){
        return this.animals;
    }

    public Animal getOne(Long id){
        return animals.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst().orElseThrow();
    }

    public void create(Animal a){
        this.animals.add(a);
    }

}
