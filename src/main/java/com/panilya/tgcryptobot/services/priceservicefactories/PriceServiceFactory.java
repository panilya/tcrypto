package com.panilya.tgcryptobot.services.priceservicefactories;

import com.panilya.tgcryptobot.services.PriceService;

public interface PriceServiceFactory {

    PriceService createBitcoinPriceService();

    PriceService createDogecoinPriceService();

    PriceService createEthereumPriceService();

    PriceService createLitecoinPriceService();

    PriceService createSolanaPriceService();

    PriceService createCardanoPriceService();

    PriceService createBNBPriceService();

    PriceService createTerraPriceService();

    PriceService createXRPPriceService();

    PriceService createAvalanchePriceService();

    PriceService createPolkadotPriceService();
}
