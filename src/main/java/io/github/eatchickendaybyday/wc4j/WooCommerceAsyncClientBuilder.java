package io.github.eatchickendaybyday.wc4j;


import io.github.eatchickendaybyday.wc4j.certificate.CertificateConfig;

/**
 * Fluent builder for {@link io.github.eatchickendaybyday.wc4j.WooCommerceAsync}.
 *
 * @author brandonbai
 * @since 2018/12/23
 */
public class WooCommerceAsyncClientBuilder {

    private CertificateConfig certificateConfig;

    private String baseUrl;

    private WooCommerceAsyncClientBuilder() {
    }

    public static WooCommerceAsyncClientBuilder standard() {
        return new WooCommerceAsyncClientBuilder();
    }

    public WooCommerceAsyncClient build() {

        return new WooCommerceAsyncClient();
    }

    public WooCommerceAsyncClientBuilder withCertificate(CertificateConfig certificateConfig) {
        this.certificateConfig = certificateConfig;
        return this;
    }

    public WooCommerceAsyncClientBuilder withBaseUrl(String baseUrl) {
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
