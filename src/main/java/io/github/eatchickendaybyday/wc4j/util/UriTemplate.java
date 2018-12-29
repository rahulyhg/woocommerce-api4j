package io.github.eatchickendaybyday.wc4j.util;

/**
 * uri template
 *
 * @author brandonbai
 * @since 2018/12/30
 */
public class UriTemplate {

    private UriTemplate() {
    }

    private interface UriConstants {

        String URI_CUSTOMERS = "/customers";

        String URI_ORDERS = "/orders";

        String URI_PRODUCTS = "/products";

        String URI_PRODUCTS_VARIATIONS = "/products/%d/variations";

    }

    public static String getCustomer(Long customerId) {
        return String.format("%s/%d", UriConstants.URI_CUSTOMERS, customerId);
    }

    public static String listCustomers() {
        return UriConstants.URI_CUSTOMERS;
    }

    public static String getOrder(Long orderId) {
        return String.format("%s/%d", UriConstants.URI_ORDERS, orderId);
    }

    public static String listOrders() {
        return UriConstants.URI_ORDERS;
    }

    public static String getProduct(Long productId) {
        return String.format("%s/%d", UriConstants.URI_PRODUCTS, productId);
    }

    public static String listProducts() {
        return UriConstants.URI_PRODUCTS;
    }

    public static String getProductVariation(Long productId, Long variationId) {
        return String.format("%s/%d", String.format(UriConstants.URI_PRODUCTS_VARIATIONS, productId), variationId);
    }

    public static String listProductVariations(Long productId) {
        return String.format(UriConstants.URI_PRODUCTS_VARIATIONS, productId);
    }

}
