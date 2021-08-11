package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.OrdersModel;

public interface OrdersRepository extends CrudRepository<OrdersModel,Integer>{

}
