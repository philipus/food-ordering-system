package com.food.ordering.system.order.serice.domain.ports.input.message.listener.payment;

import com.food.ordering.system.order.serice.domain.dto.message.PaymentResponse;

public interface PaymentResponseMessageListener {
    void paymentComplete(PaymentResponse paymentResponse);
    void paymentCancelled(PaymentResponse paymentResponse);
}
