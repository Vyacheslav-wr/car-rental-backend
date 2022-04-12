package by.salei.rental.service;

import by.salei.rental.entity.Order;
import by.salei.rental.repo.OrderRepository;
import by.salei.rental.service.api.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order, OrderRepository> implements OrderService {
}
