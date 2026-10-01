package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSubmitTimestamp implements CharSequence {
    private final char[] IAuthTabCallback;
    private int onWarmupCompleted;

    public getSubmitTimestamp(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        this.IAuthTabCallback = cArr;
        this.onWarmupCompleted = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return onExtraCallback(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return onNavigationEvent();
    }

    public final char[] onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public void onExtraCallbackWithResult(int i) {
        this.onWarmupCompleted = i;
    }

    public int onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public char onExtraCallback(int i) {
        return this.IAuthTabCallback[i];
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return StringsKt__StringsJVMKt.concatToString(this.IAuthTabCallback, i, Math.min(i2, length()));
    }

    public final String IAuthTabCallback(int i, int i2) {
        return StringsKt__StringsJVMKt.concatToString(this.IAuthTabCallback, i, Math.min(i2, length()));
    }

    public final void IAuthTabCallback(int i) {
        onExtraCallbackWithResult(Math.min(this.IAuthTabCallback.length, i));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return IAuthTabCallback(0, length());
    }
}
