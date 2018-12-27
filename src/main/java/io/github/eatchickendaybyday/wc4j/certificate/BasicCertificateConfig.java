package io.github.eatchickendaybyday.wc4j.certificate;

import com.sun.org.apache.xml.internal.security.utils.Base64;

/**
 * Basic certificate config
 *
 * @author brandonbai
 * @since 2018/12/27
 */
public class BasicCertificateConfig implements CertificateConfig {

    private String username;

    private String password;

    public BasicCertificateConfig(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getCertificate() {

        return Base64.encode((username + ":" + password).getBytes());
    }
}
