package o;

import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CHECK_UNISIGN extends toRealPath {
    private final NativeJSCHeapCaptureSpec onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UST_CHECK_UNISIGN) && Intrinsics.areEqual(this.onNavigationEvent, ((UST_CHECK_UNISIGN) obj).onNavigationEvent);
    }

    public int hashCode() {
        return this.onNavigationEvent.hashCode();
    }

    public String toString() {
        return "TransactionItemViewModel(filteredTransaction=" + this.onNavigationEvent + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CHECK_UNISIGN(@NotNull NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec) {
        super(toRealPath.onNavigationEvent.TRANSACTION_V2_ITEM);
        Intrinsics.checkNotNullParameter(nativeJSCHeapCaptureSpec, "");
        this.onNavigationEvent = nativeJSCHeapCaptureSpec;
    }

    public final NativeJSCHeapCaptureSpec onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public long onWarmupCompleted() {
        return hashCode();
    }
}
