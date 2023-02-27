package com.springbootproject.Course.services;

import com.springbootproject.Course.entities.Order;
import com.springbootproject.Course.entities.User;
import com.springbootproject.Course.repositories.OrderRepository;
import com.springbootproject.Course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private OrderRepository userRepository;

    public List<Order> findAll() {
        return userRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = userRepository.findById(id);
        return obj.get();
    }
}
