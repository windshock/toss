package com.samsung.android.ssiframework.sdk.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class VcStartResult {
    private final String cmd;
    private final String txId;
    private final String vcId;
    private final Integer vcTypeNumber;

    public VcStartResult(@NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.cmd = str;
        this.vcId = str2;
        this.vcTypeNumber = num;
        this.txId = str3;
    }

    public static /* synthetic */ VcStartResult copy$default(VcStartResult vcStartResult, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vcStartResult.cmd;
        }
        if ((i & 2) != 0) {
            str2 = vcStartResult.vcId;
        }
        if ((i & 4) != 0) {
            num = vcStartResult.vcTypeNumber;
        }
        if ((i & 8) != 0) {
            str3 = vcStartResult.txId;
        }
        return vcStartResult.copy(str, str2, num, str3);
    }

    public final String component1() {
        return this.cmd;
    }

    public final String component2() {
        return this.vcId;
    }

    public final Integer component3() {
        return this.vcTypeNumber;
    }

    public final String component4() {
        return this.txId;
    }

    public final VcStartResult copy(@NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new VcStartResult(str, str2, num, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VcStartResult)) {
            return false;
        }
        VcStartResult vcStartResult = (VcStartResult) obj;
        return Intrinsics.areEqual(this.cmd, vcStartResult.cmd) && Intrinsics.areEqual(this.vcId, vcStartResult.vcId) && Intrinsics.areEqual(this.vcTypeNumber, vcStartResult.vcTypeNumber) && Intrinsics.areEqual(this.txId, vcStartResult.txId);
    }

    public final String getCmd() {
        return this.cmd;
    }

    public final String getTxId() {
        return this.txId;
    }

    public final String getVcId() {
        return this.vcId;
    }

    public final Integer getVcTypeNumber() {
        return this.vcTypeNumber;
    }

    public int hashCode() {
        int iHashCode = this.cmd.hashCode();
        String str = this.vcId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.vcTypeNumber;
        return this.txId.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "VcStartResult(cmd=" + this.cmd + ", vcId=" + this.vcId + ", vcTypeNumber=" + this.vcTypeNumber + ", txId=" + this.txId + ")";
    }

    public /* synthetic */ VcStartResult(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, str3);
    }
}
