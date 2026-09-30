package com.samsung.android.ssiframework.sdk.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AddressVcIssueResult {
    private final String cmd;
    private final String txId;

    public AddressVcIssueResult(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cmd = str;
        this.txId = str2;
    }

    public static /* synthetic */ AddressVcIssueResult copy$default(AddressVcIssueResult addressVcIssueResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressVcIssueResult.cmd;
        }
        if ((i & 2) != 0) {
            str2 = addressVcIssueResult.txId;
        }
        return addressVcIssueResult.copy(str, str2);
    }

    public final String component1() {
        return this.cmd;
    }

    public final String component2() {
        return this.txId;
    }

    public final AddressVcIssueResult copy(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AddressVcIssueResult(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressVcIssueResult)) {
            return false;
        }
        AddressVcIssueResult addressVcIssueResult = (AddressVcIssueResult) obj;
        return Intrinsics.areEqual(this.cmd, addressVcIssueResult.cmd) && Intrinsics.areEqual(this.txId, addressVcIssueResult.txId);
    }

    public final String getCmd() {
        return this.cmd;
    }

    public final String getTxId() {
        return this.txId;
    }

    public int hashCode() {
        int iHashCode = this.cmd.hashCode();
        String str = this.txId;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AddressVcIssueResult(cmd=" + this.cmd + ", txId=" + this.txId + ")";
    }

    public /* synthetic */ AddressVcIssueResult(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
