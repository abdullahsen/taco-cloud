package com.iafnstudios.tacocloud.data;

import com.iafnstudios.tacocloud.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
