package io.github.eatchickendaybyday.wc4j;


import io.github.eatchickendaybyday.wc4j.callback.WooCommerceCallback;
import io.github.eatchickendaybyday.wc4j.model.*;
import io.github.eatchickendaybyday.wc4j.util.UriTemplate;

/**
 * Client for accessing WooCommerce asynchronously.
 *
 * @author brandonbai
 * @since 2018/12/23
 */
public class WooCommerceAsyncClient implements WooCommerceAsync {

    public void getOrder(GetOrderRequest request, WooCommerceCallback<GetOrderResponse> callback) {

        String uri = UriTemplate.getOrder(request.getOrderId());

    }

    public void listOrder(ListOrderRequest request, WooCommerceCallback<ListOrderResponse> callback) {

        String uri = UriTemplate.listOrders();

    }

    public void getCustomer(GetCustomerRequest request, WooCommerceCallback<GetCustomerResponse> callback) {

        String uri = UriTemplate.getCustomer(request.getCustomerId());

    }

    public void listCustomer(ListCustomerRequest request, WooCommerceCallback<ListCustomerResponse> callback) {

        String uri = UriTemplate.listOrders();

    }
}
