package spring.core.order;

import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void order(Long memberId, String itemName, int itemPrice) {
        orderService.createOrder(memberId, itemName, itemPrice);
    }
}
