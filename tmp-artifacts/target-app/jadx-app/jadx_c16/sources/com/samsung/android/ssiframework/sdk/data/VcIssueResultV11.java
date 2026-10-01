package com.samsung.android.ssiframework.sdk.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class VcIssueResultV11 {
    private final String cmd;
    private final String txId;
    private final VcMetaV11 vcMeta;

    public VcIssueResultV11(@NotNull String str, @Nullable String str2, @NotNull VcMetaV11 vcMetaV11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(vcMetaV11, "");
        this.cmd = str;
        this.txId = str2;
        this.vcMeta = vcMetaV11;
    }

    public static /* synthetic */ VcIssueResultV11 copy$default(VcIssueResultV11 vcIssueResultV11, String str, String str2, VcMetaV11 vcMetaV11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vcIssueResultV11.cmd;
        }
        if ((i & 2) != 0) {
            str2 = vcIssueResultV11.txId;
        }
        if ((i & 4) != 0) {
            vcMetaV11 = vcIssueResultV11.vcMeta;
        }
        return vcIssueResultV11.copy(str, str2, vcMetaV11);
    }

    public final String component1() {
        return this.cmd;
    }

    public final String component2() {
        return this.txId;
    }

    public final VcMetaV11 component3() {
        return this.vcMeta;
    }

    public final VcIssueResultV11 copy(@NotNull String str, @Nullable String str2, @NotNull VcMetaV11 vcMetaV11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(vcMetaV11, "");
        return new VcIssueResultV11(str, str2, vcMetaV11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VcIssueResultV11)) {
            return false;
        }
        VcIssueResultV11 vcIssueResultV11 = (VcIssueResultV11) obj;
        return Intrinsics.areEqual(this.cmd, vcIssueResultV11.cmd) && Intrinsics.areEqual(this.txId, vcIssueResultV11.txId) && Intrinsics.areEqual(this.vcMeta, vcIssueResultV11.vcMeta);
    }

    public final String getCmd() {
        return this.cmd;
    }

    public final String getTxId() {
        return this.txId;
    }

    public final VcMetaV11 getVcMeta() {
        return this.vcMeta;
    }

    public int hashCode() {
        int iHashCode = this.cmd.hashCode();
        String str = this.txId;
        return this.vcMeta.hashCode() + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "VcIssueResultV11(cmd=" + this.cmd + ", txId=" + this.txId + ", vcMeta=" + this.vcMeta + ")";
    }

    public /* synthetic */ VcIssueResultV11(String str, String str2, VcMetaV11 vcMetaV11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, vcMetaV11);
    }
}
