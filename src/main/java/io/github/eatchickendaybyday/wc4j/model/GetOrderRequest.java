package io.github.eatchickendaybyday.wc4j.model;

/**
 * <p>
 * The input for the GetOrder operation.
 * </p>
 *
 * @author brandonbai
 * @since 2018/12/23
 */
public class GetOrderRequest {

    private Long orderId;

    public GetOrderRequest(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
