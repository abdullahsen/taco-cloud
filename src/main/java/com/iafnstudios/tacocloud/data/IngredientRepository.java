package com.iafnstudios.tacocloud.data;

import com.iafnstudios.tacocloud.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
