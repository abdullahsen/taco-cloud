package com.iafnstudios.tacocloud.data;

import com.iafnstudios.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient,String> {
}
