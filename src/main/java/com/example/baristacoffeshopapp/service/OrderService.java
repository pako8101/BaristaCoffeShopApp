package com.example.baristacoffeshopapp.service;

import com.example.baristacoffeshopapp.model.service.OrderServiceModel;
import com.example.baristacoffeshopapp.model.view.OrderViewModel;

import java.util.List;

public interface OrderService {

    void addOrder(OrderServiceModel orderServiceModel);

    List<OrderViewModel> findAllOrderOrderByPriceDesc();

    void readyOrder(Long id);
}
