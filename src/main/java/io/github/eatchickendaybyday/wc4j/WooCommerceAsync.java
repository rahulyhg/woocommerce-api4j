package io.github.eatchickendaybyday.wc4j;


import io.github.eatchickendaybyday.wc4j.callback.WooCommerceCallback;
import io.github.eatchickendaybyday.wc4j.model.*;

/**
 * Interface for accessing WooCommerce asynchronously.
 *
 * @author brandonbai
 * @since 2018/12/23
 */
public interface WooCommerceAsync {

    void getOrder(GetOrderRequest request, WooCommerceCallback<GetOrderResponse> callback);

    void listOrder(ListOrderRequest request, WooCommerceCallback<ListOrderResponse> callback);

    void getCustomer(GetCustomerRequest request, WooCommerceCallback<GetCustomerResponse> callback);

    void listCustomer(ListCustomerRequest request, WooCommerceCallback<ListCustomerResponse> callback);

}
