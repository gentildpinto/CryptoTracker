package com.plcoding.cryptotracker.crypto.data.networking.mappers

import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinDto
import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinPriceDto
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = this.id,
        rank = this.rank,
        name = this.name,
        symbol = this.symbol,
        marketCapUsd = this.marketCapUsd,
        priceUsd = this.priceUsd,
        changePercent24Hr = this.changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = this.priceUsd,
        dateTime = Instant.ofEpochSecond(this.time).atZone(ZoneId.of("UTC"))
    )
}