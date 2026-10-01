package com.krc.pl_card.model;

import com.krc.pl_card.model.card.KorailTradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import o.setProgressViewEndTarget;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class KorailTradeLog {
    public static final a Companion = new a(null);
    private final int balance;
    private final int tradeAmount;
    private final int tradeCount;
    private final KorailTradeType tradeType;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KorailTradeLog a(@NotNull setProgressViewEndTarget setprogressviewendtarget) throws NumberFormatException {
            Intrinsics.checkNotNullParameter(setprogressviewendtarget, "");
            return new KorailTradeLog(KorailTradeType.Companion.a(setprogressviewendtarget.onWarmupCompleted()), Integer.parseInt(setprogressviewendtarget.onNavigationEvent(), CharsKt.IAuthTabCallback(16)), Integer.parseInt(setprogressviewendtarget.onExtraCallbackWithResult(), CharsKt.IAuthTabCallback(16)), Integer.parseInt(setprogressviewendtarget.IAuthTabCallback(), CharsKt.IAuthTabCallback(16)));
        }
    }

    public KorailTradeLog(@NotNull KorailTradeType korailTradeType, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(korailTradeType, "");
        this.tradeType = korailTradeType;
        this.balance = i2;
        this.tradeCount = i3;
        this.tradeAmount = i4;
    }

    public static /* synthetic */ KorailTradeLog copy$default(KorailTradeLog korailTradeLog, KorailTradeType korailTradeType, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            korailTradeType = korailTradeLog.tradeType;
        }
        if ((i5 & 2) != 0) {
            i2 = korailTradeLog.balance;
        }
        if ((i5 & 4) != 0) {
            i3 = korailTradeLog.tradeCount;
        }
        if ((i5 & 8) != 0) {
            i4 = korailTradeLog.tradeAmount;
        }
        return korailTradeLog.copy(korailTradeType, i2, i3, i4);
    }

    public final KorailTradeType component1() {
        return this.tradeType;
    }

    public final int component2() {
        return this.balance;
    }

    public final int component3() {
        return this.tradeCount;
    }

    public final int component4() {
        return this.tradeAmount;
    }

    public final KorailTradeLog copy(@NotNull KorailTradeType korailTradeType, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(korailTradeType, "");
        return new KorailTradeLog(korailTradeType, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KorailTradeLog)) {
            return false;
        }
        KorailTradeLog korailTradeLog = (KorailTradeLog) obj;
        return this.tradeType == korailTradeLog.tradeType && this.balance == korailTradeLog.balance && this.tradeCount == korailTradeLog.tradeCount && this.tradeAmount == korailTradeLog.tradeAmount;
    }

    public final int getBalance() {
        return this.balance;
    }

    public final int getTradeAmount() {
        return this.tradeAmount;
    }

    public final int getTradeCount() {
        return this.tradeCount;
    }

    public final KorailTradeType getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        return (((((this.tradeType.hashCode() * 31) + Integer.hashCode(this.balance)) * 31) + Integer.hashCode(this.tradeCount)) * 31) + Integer.hashCode(this.tradeAmount);
    }

    public String toString() {
        return "KorailTradeLog(tradeType=" + this.tradeType + ", balance=" + this.balance + ", tradeCount=" + this.tradeCount + ", tradeAmount=" + this.tradeAmount + ')';
    }
}
