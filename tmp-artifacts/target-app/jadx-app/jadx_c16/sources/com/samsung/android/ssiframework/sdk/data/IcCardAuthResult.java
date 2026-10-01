package com.samsung.android.ssiframework.sdk.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class IcCardAuthResult {
    private final String cmd;
    private final String failCause;
    private final Integer remainingTry;
    private final Integer resultCode;
    private final String txId;

    public IcCardAuthResult(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2, @Nullable String str3) {
        this.cmd = str;
        this.remainingTry = num;
        this.txId = str2;
        this.resultCode = num2;
        this.failCause = str3;
    }

    public static /* synthetic */ IcCardAuthResult copy$default(IcCardAuthResult icCardAuthResult, String str, Integer num, String str2, Integer num2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = icCardAuthResult.cmd;
        }
        if ((i & 2) != 0) {
            num = icCardAuthResult.remainingTry;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            str2 = icCardAuthResult.txId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num2 = icCardAuthResult.resultCode;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            str3 = icCardAuthResult.failCause;
        }
        return icCardAuthResult.copy(str, num3, str4, num4, str3);
    }

    public final String component1() {
        return this.cmd;
    }

    public final Integer component2() {
        return this.remainingTry;
    }

    public final String component3() {
        return this.txId;
    }

    public final Integer component4() {
        return this.resultCode;
    }

    public final String component5() {
        return this.failCause;
    }

    public final IcCardAuthResult copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2, @Nullable String str3) {
        return new IcCardAuthResult(str, num, str2, num2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IcCardAuthResult)) {
            return false;
        }
        IcCardAuthResult icCardAuthResult = (IcCardAuthResult) obj;
        return Intrinsics.areEqual(this.cmd, icCardAuthResult.cmd) && Intrinsics.areEqual(this.remainingTry, icCardAuthResult.remainingTry) && Intrinsics.areEqual(this.txId, icCardAuthResult.txId) && Intrinsics.areEqual(this.resultCode, icCardAuthResult.resultCode) && Intrinsics.areEqual(this.failCause, icCardAuthResult.failCause);
    }

    public final String getCmd() {
        return this.cmd;
    }

    public final String getFailCause() {
        return this.failCause;
    }

    public final Integer getRemainingTry() {
        return this.remainingTry;
    }

    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final String getTxId() {
        return this.txId;
    }

    public int hashCode() {
        String str = this.cmd;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.remainingTry;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.txId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.resultCode;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.failCause;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "IcCardAuthResult(cmd=" + this.cmd + ", remainingTry=" + this.remainingTry + ", txId=" + this.txId + ", resultCode=" + this.resultCode + ", failCause=" + this.failCause + ")";
    }

    public /* synthetic */ IcCardAuthResult(String str, Integer num, String str2, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3);
    }
}
