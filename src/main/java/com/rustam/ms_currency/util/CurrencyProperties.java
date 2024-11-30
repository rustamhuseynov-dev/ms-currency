package com.rustam.ms_currency.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "currency")
public class CurrencyProperties {
    private String apiKey;
    private String currencies;
}
