package io.github.eatchickendaybyday.wc4j;


import io.github.eatchickendaybyday.wc4j.model.*;
import io.github.eatchickendaybyday.wc4j.util.UriTemplate;

/**
 * Client for accessing WooCommerce. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 *
 * @author brandonbai
 * @since 2018/12/23
 */
public class WooCommerceClient implements WooCommerce {

    public GetOrderResponse getOrder(GetOrderRequest request) {

        String uri = UriTemplate.getOrder(request.getOrderId());

        return null;
    }

    public ListOrderResponse listOrder(ListOrderRequest request) {

        String uri = UriTemplate.listOrders();

        return null;
    }

    public GetCustomerResponse getCustomer(GetCustomerRequest request) {

        String uri = UriTemplate.getCustomer(request.getCustomerId());

        return null;
    }

    public ListCustomerResponse listCustomer(ListCustomerRequest request) {

        String uri = UriTemplate.listCustomers();

        return null;
    }
}
