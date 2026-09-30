package o;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectableGroupKtExternalSyntheticLambda0 implements BasicTextKtExternalSyntheticLambda11 {
    private final long IAuthTabCallback;
    private final long onExtraCallback;

    public /* synthetic */ SelectableGroupKtExternalSyntheticLambda0(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableGroupKtExternalSyntheticLambda0)) {
            return false;
        }
        SelectableGroupKtExternalSyntheticLambda0 selectableGroupKtExternalSyntheticLambda0 = (SelectableGroupKtExternalSyntheticLambda0) obj;
        return setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, selectableGroupKtExternalSyntheticLambda0.onExtraCallback) && setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallback, selectableGroupKtExternalSyntheticLambda0.IAuthTabCallback);
    }

    public int hashCode() {
        return (setByteOrder.onTransact(this.onExtraCallback) * 31) + setByteOrder.onTransact(this.IAuthTabCallback);
    }

    public String toString() {
        return "DayNightColorProvider(day=" + ((Object) setByteOrder.IAuthTabCallbackDefault(this.onExtraCallback)) + ", night=" + ((Object) setByteOrder.IAuthTabCallbackDefault(this.IAuthTabCallback)) + ')';
    }

    private SelectableGroupKtExternalSyntheticLambda0(long j, long j2) {
        this.onExtraCallback = j;
        this.IAuthTabCallback = j2;
    }

    public final long onExtraCallback() {
        return this.onExtraCallback;
    }

    public final long onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.BasicTextKtExternalSyntheticLambda11
    public long IAuthTabCallback(@NotNull Context context) {
        return onExtraCallback(ToggleableKtExternalSyntheticLambda0.onWarmupCompleted(context));
    }

    public final long onExtraCallback(boolean z) {
        return z ? this.IAuthTabCallback : this.onExtraCallback;
    }
}
