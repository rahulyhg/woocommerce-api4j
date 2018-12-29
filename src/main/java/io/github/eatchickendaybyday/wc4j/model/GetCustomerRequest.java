package io.github.eatchickendaybyday.wc4j.model;

/**
 * <p>
 * The input for the GetCustomer operation.
 * </p>
 *
 * @author brandonbai
 * @since 2018/12/23
 */
public class GetCustomerRequest {

    private Long customerId;

    public GetCustomerRequest(Long customerId) {
        this.customerId = customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerId() {
        return customerId;
    }
}
