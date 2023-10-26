package be.bstorm.controllers;

import be.bstorm.models.entities.Animal;
import be.bstorm.services.FakeDB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AnimalController {

    private final FakeDB fakeDB;

    public AnimalController() {
        this.fakeDB = new FakeDB();
    }

    @GetMapping
    public String home(Model model){
        List<Animal> animals = fakeDB.getAll();
        model.addAttribute("animals",animals);
        model.addAttribute("animalForm",new Animal());
        return "home.html";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Animal animalForm,Model model){
        fakeDB.create(animalForm);
        List<Animal> animals = fakeDB.getAll();
        model.addAttribute("animals",animals);
        model.addAttribute("animalForm",new Animal());
        return "home.html";
    }
}
