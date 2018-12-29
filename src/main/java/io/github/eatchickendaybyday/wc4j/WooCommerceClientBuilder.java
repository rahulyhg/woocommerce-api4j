package io.github.eatchickendaybyday.wc4j;


import io.github.eatchickendaybyday.wc4j.certificate.CertificateConfig;

/**
 * Fluent builder for {@link io.github.eatchickendaybyday.wc4j.WooCommerce}.
 *
 * @author brandonbai
 * @since 2018/12/23
 */
public class WooCommerceClientBuilder {

    private CertificateConfig certificateConfig;

    private String baseUrl;

    private WooCommerceClientBuilder() {
    }

    public static WooCommerceClientBuilder standard() {
        return new WooCommerceClientBuilder();
    }

    public WooCommerceClient build() {

        return new WooCommerceClient();
    }

    public WooCommerceClientBuilder withCertificate(CertificateConfig certificateConfig) {
        this.certificateConfig = certificateConfig;
        return this;
    }

    public WooCommerceClientBuilder withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public CertificateConfig getCertificateConfig() {
        return certificateConfig;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
