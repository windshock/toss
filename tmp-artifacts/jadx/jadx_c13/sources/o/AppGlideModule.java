package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AppGlideModule {
    private int IAuthTabCallback;

    public AppGlideModule() {
        this(0, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppGlideModule) && this.IAuthTabCallback == ((AppGlideModule) obj).IAuthTabCallback;
    }

    public int hashCode() {
        return Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.IAuthTabCallback + ')';
    }

    public AppGlideModule(int i) {
        this.IAuthTabCallback = i;
    }

    public /* synthetic */ AppGlideModule(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final void IAuthTabCallback(int i) {
        this.IAuthTabCallback = i;
    }

    public final void onExtraCallbackWithResult(int i) {
        this.IAuthTabCallback += i;
    }
}
