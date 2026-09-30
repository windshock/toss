package com.krc.pl_card.model.dto.info;

import com.krc.pl_card.model.card.KorailCardType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class KorailCardInfo {
    private final int balance;
    private final String cardNumber;
    private final KorailCardType korailCardType;
    private final int tradeCounter;

    public KorailCardInfo(@NotNull String str, @NotNull KorailCardType korailCardType, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(korailCardType, "");
        this.cardNumber = str;
        this.korailCardType = korailCardType;
        this.balance = i2;
        this.tradeCounter = i3;
    }

    public static /* synthetic */ KorailCardInfo copy$default(KorailCardInfo korailCardInfo, String str, KorailCardType korailCardType, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = korailCardInfo.cardNumber;
        }
        if ((i4 & 2) != 0) {
            korailCardType = korailCardInfo.korailCardType;
        }
        if ((i4 & 4) != 0) {
            i2 = korailCardInfo.balance;
        }
        if ((i4 & 8) != 0) {
            i3 = korailCardInfo.tradeCounter;
        }
        return korailCardInfo.copy(str, korailCardType, i2, i3);
    }

    public final String component1() {
        return this.cardNumber;
    }

    public final KorailCardType component2() {
        return this.korailCardType;
    }

    public final int component3() {
        return this.balance;
    }

    public final int component4() {
        return this.tradeCounter;
    }

    public final KorailCardInfo copy(@NotNull String str, @NotNull KorailCardType korailCardType, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(korailCardType, "");
        return new KorailCardInfo(str, korailCardType, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KorailCardInfo)) {
            return false;
        }
        KorailCardInfo korailCardInfo = (KorailCardInfo) obj;
        return Intrinsics.areEqual(this.cardNumber, korailCardInfo.cardNumber) && this.korailCardType == korailCardInfo.korailCardType && this.balance == korailCardInfo.balance && this.tradeCounter == korailCardInfo.tradeCounter;
    }

    public final int getBalance() {
        return this.balance;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final KorailCardType getKorailCardType() {
        return this.korailCardType;
    }

    public final int getTradeCounter() {
        return this.tradeCounter;
    }

    public int hashCode() {
        return (((((this.cardNumber.hashCode() * 31) + this.korailCardType.hashCode()) * 31) + Integer.hashCode(this.balance)) * 31) + Integer.hashCode(this.tradeCounter);
    }

    public String toString() {
        return "KorailCardInfo(cardNumber=" + this.cardNumber + ", korailCardType=" + this.korailCardType + ", balance=" + this.balance + ", tradeCounter=" + this.tradeCounter + ')';
    }
}
