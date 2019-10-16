package com.iafnstudios.tacocloud.data;

import com.iafnstudios.tacocloud.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco,Long> {
}
