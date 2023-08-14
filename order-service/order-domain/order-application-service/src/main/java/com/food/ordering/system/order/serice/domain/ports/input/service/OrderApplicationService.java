package com.food.ordering.system.order.serice.domain.ports.input.service;

import com.food.ordering.system.order.serice.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.serice.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.serice.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.serice.domain.dto.track.TrackOrderResponse;
import jakarta.validation.Valid;

public interface OrderApplicationService {
    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid  TrackOrderQuery trackOrderQuery);

}
