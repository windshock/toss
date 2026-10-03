package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getKeyIdentifier implements getOther {
    public static final int $stable = 8;
    private String lastSyncTime;
    private final boolean showBorder;
    private final boolean showRefreshLayout;
    private setSignatureKey taskStatus;
    private final String title;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getKeyIdentifier)) {
            return false;
        }
        getKeyIdentifier getkeyidentifier = (getKeyIdentifier) obj;
        return Intrinsics.areEqual(this.title, getkeyidentifier.title) && this.showBorder == getkeyidentifier.showBorder && this.showRefreshLayout == getkeyidentifier.showRefreshLayout && this.taskStatus == getkeyidentifier.taskStatus && Intrinsics.areEqual(this.lastSyncTime, getkeyidentifier.lastSyncTime);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + Boolean.hashCode(this.showBorder)) * 31) + Boolean.hashCode(this.showRefreshLayout)) * 31) + this.taskStatus.hashCode()) * 31) + this.lastSyncTime.hashCode();
    }

    public String toString() {
        return "TransactionSummary(title=" + this.title + ", showBorder=" + this.showBorder + ", showRefreshLayout=" + this.showRefreshLayout + ", taskStatus=" + this.taskStatus + ", lastSyncTime=" + this.lastSyncTime + ")";
    }

    public getKeyIdentifier(@NotNull String str, boolean z, boolean z2, @NotNull setSignatureKey setsignaturekey, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(setsignaturekey, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.showBorder = z;
        this.showRefreshLayout = z2;
        this.taskStatus = setsignaturekey;
        this.lastSyncTime = str2;
    }

    public final String onWarmupCompleted() {
        return this.title;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.showBorder;
    }

    public final boolean IAuthTabCallback() {
        return this.showRefreshLayout;
    }

    public /* synthetic */ getKeyIdentifier(String str, boolean z, boolean z2, setSignatureKey setsignaturekey, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? setSignatureKey.NONE : setsignaturekey, (i & 16) != 0 ? "" : str2);
    }

    public final setSignatureKey onExtraCallback() {
        return this.taskStatus;
    }

    public final void onExtraCallback(@NotNull setSignatureKey setsignaturekey) {
        Intrinsics.checkNotNullParameter(setsignaturekey, "");
        this.taskStatus = setsignaturekey;
    }

    public final String onNavigationEvent() {
        return this.lastSyncTime;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.TRANSACTION_SUMMARY;
    }
}
