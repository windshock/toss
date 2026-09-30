package com.krc.pl_card.model.dto.result;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ChargeResult {
    private final Integer afterBalance;
    private final Integer afterTradeCounter;
    private final Integer beforeBalance;
    private final String cardNumber;
    private final int chargingAmount;
    private final Exception exception;
    private final boolean isCharged;
    private final boolean isNotMissingChargeStatus;
    private final String tradeUid;

    public ChargeResult(boolean z, boolean z2, @Nullable Exception exc, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, int i2, @Nullable String str2) {
        this.isCharged = z;
        this.isNotMissingChargeStatus = z2;
        this.exception = exc;
        this.cardNumber = str;
        this.afterTradeCounter = num;
        this.beforeBalance = num2;
        this.afterBalance = num3;
        this.chargingAmount = i2;
        this.tradeUid = str2;
    }

    public final boolean component1() {
        return this.isCharged;
    }

    public final boolean component2() {
        return this.isNotMissingChargeStatus;
    }

    public final Exception component3() {
        return this.exception;
    }

    public final String component4() {
        return this.cardNumber;
    }

    public final Integer component5() {
        return this.afterTradeCounter;
    }

    public final Integer component6() {
        return this.beforeBalance;
    }

    public final Integer component7() {
        return this.afterBalance;
    }

    public final int component8() {
        return this.chargingAmount;
    }

    public final String component9() {
        return this.tradeUid;
    }

    public final ChargeResult copy(boolean z, boolean z2, @Nullable Exception exc, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, int i2, @Nullable String str2) {
        return new ChargeResult(z, z2, exc, str, num, num2, num3, i2, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargeResult)) {
            return false;
        }
        ChargeResult chargeResult = (ChargeResult) obj;
        return this.isCharged == chargeResult.isCharged && this.isNotMissingChargeStatus == chargeResult.isNotMissingChargeStatus && Intrinsics.areEqual(this.exception, chargeResult.exception) && Intrinsics.areEqual(this.cardNumber, chargeResult.cardNumber) && Intrinsics.areEqual(this.afterTradeCounter, chargeResult.afterTradeCounter) && Intrinsics.areEqual(this.beforeBalance, chargeResult.beforeBalance) && Intrinsics.areEqual(this.afterBalance, chargeResult.afterBalance) && this.chargingAmount == chargeResult.chargingAmount && Intrinsics.areEqual(this.tradeUid, chargeResult.tradeUid);
    }

    public final Integer getAfterBalance() {
        return this.afterBalance;
    }

    public final Integer getAfterTradeCounter() {
        return this.afterTradeCounter;
    }

    public final Integer getBeforeBalance() {
        return this.beforeBalance;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final int getChargingAmount() {
        return this.chargingAmount;
    }

    public final Exception getException() {
        return this.exception;
    }

    public final String getTradeUid() {
        return this.tradeUid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    public int hashCode() {
        boolean z = this.isCharged;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.isNotMissingChargeStatus;
        int i2 = z2 ? 1 : z2 ? 1 : 0;
        Exception exc = this.exception;
        int iHashCode = exc == null ? 0 : exc.hashCode();
        String str = this.cardNumber;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.afterTradeCounter;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.beforeBalance;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.afterBalance;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        int iHashCode6 = Integer.hashCode(this.chargingAmount);
        String str2 = this.tradeUid;
        return (((((((((((((((r0 * 31) + i2) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isCharged() {
        return this.isCharged;
    }

    public final boolean isNotMissingChargeStatus() {
        return this.isNotMissingChargeStatus;
    }

    public String toString() {
        return "ChargeResult(isCharged=" + this.isCharged + ", isNotMissingChargeStatus=" + this.isNotMissingChargeStatus + ", exception=" + this.exception + ", cardNumber=" + this.cardNumber + ", afterTradeCounter=" + this.afterTradeCounter + ", beforeBalance=" + this.beforeBalance + ", afterBalance=" + this.afterBalance + ", chargingAmount=" + this.chargingAmount + ", tradeUid=" + this.tradeUid + ')';
    }
}
