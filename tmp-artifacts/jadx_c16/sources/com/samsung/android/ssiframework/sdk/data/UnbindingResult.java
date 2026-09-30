package com.samsung.android.ssiframework.sdk.data;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class UnbindingResult {
    private final int count;
    private final boolean isWalletDeleted;

    public UnbindingResult(int i, boolean z) {
        this.count = i;
        this.isWalletDeleted = z;
    }

    public static /* synthetic */ UnbindingResult copy$default(UnbindingResult unbindingResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = unbindingResult.count;
        }
        if ((i2 & 2) != 0) {
            z = unbindingResult.isWalletDeleted;
        }
        return unbindingResult.copy(i, z);
    }

    public final int component1() {
        return this.count;
    }

    public final boolean component2() {
        return this.isWalletDeleted;
    }

    public final UnbindingResult copy(int i, boolean z) {
        return new UnbindingResult(i, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnbindingResult)) {
            return false;
        }
        UnbindingResult unbindingResult = (UnbindingResult) obj;
        return this.count == unbindingResult.count && this.isWalletDeleted == unbindingResult.isWalletDeleted;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isWalletDeleted) + (Integer.hashCode(this.count) * 31);
    }

    public final boolean isWalletDeleted() {
        return this.isWalletDeleted;
    }

    public String toString() {
        return "UnbindingResult(count=" + this.count + ", isWalletDeleted=" + this.isWalletDeleted + ")";
    }
}
