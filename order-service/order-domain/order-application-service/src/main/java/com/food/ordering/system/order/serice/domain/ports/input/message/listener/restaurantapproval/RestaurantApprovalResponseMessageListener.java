package com.food.ordering.system.order.serice.domain.ports.input.message.listener.restaurantapproval;

import com.food.ordering.system.order.serice.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {
    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);
    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
