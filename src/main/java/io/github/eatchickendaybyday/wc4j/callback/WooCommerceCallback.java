package io.github.eatchickendaybyday.wc4j.callback;

/**
 *
 * @param <T>
 */
public interface WooCommerceCallback<T> {

    void onError(Throwable t);

    void onSuccess(T t);
}
