package com.rustam.ms_currency.util;

import com.rustam.ms_currency.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CurrencyScheduler {

    private final CurrencyService currencyService;

    @Scheduled(fixedRate = 60000) // Hər 1 dəqiqədən bir
    public void scheduleCurrencyUpdate() {
        currencyService.save();
    }
}
