package be.bstorm.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Animal {

    private static Long currentID = 1L;

    private Long id;

    private String name;

    public Animal(String name) {
        this.id = currentID++;
        this.name = name;
    }
}
