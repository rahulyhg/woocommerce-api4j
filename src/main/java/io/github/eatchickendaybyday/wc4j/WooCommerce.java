package io.github.eatchickendaybyday.wc4j;

import io.github.eatchickendaybyday.wc4j.callback.WooCommerceCallback;
import io.github.eatchickendaybyday.wc4j.model.*;

/**
 * Interface for accessing WooCommerce.
 *
 * @author brandonbai
 * @since 2018/12/23
 */
public interface WooCommerce {

    GetOrderResponse getOrder(GetOrderRequest request);

    ListOrderResponse listOrder(ListOrderRequest request);

    GetCustomerResponse getCustomer(GetCustomerRequest request);

    ListCustomerResponse listCustomer(ListCustomerRequest request);


}
