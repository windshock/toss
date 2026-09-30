package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class setCalculationMethod {
    public final setPreProgressHundred IAuthTabCallback;
    private boolean onExtraCallback;

    public void asInterface() {
    }

    public void onNavigationEvent() {
    }

    public setCalculationMethod(@NotNull setPreProgressHundred setpreprogresshundred) {
        Intrinsics.checkNotNullParameter(setpreprogresshundred, "");
        this.IAuthTabCallback = setpreprogresshundred;
        this.onExtraCallback = true;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    protected final void onExtraCallbackWithResult(boolean z) {
        this.onExtraCallback = z;
    }

    public void onWarmupCompleted() {
        this.onExtraCallback = true;
    }

    public void onExtraCallback() {
        this.onExtraCallback = false;
    }

    public void IAuthTabCallback() {
        this.onExtraCallback = false;
    }

    public final void onExtraCallback(char c) {
        this.IAuthTabCallback.onExtraCallback(c);
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback.onNavigationEvent(str);
    }

    public void onWarmupCompleted(float f) {
        this.IAuthTabCallback.onNavigationEvent(String.valueOf(f));
    }

    public void onExtraCallbackWithResult(double d) {
        this.IAuthTabCallback.onNavigationEvent(String.valueOf(d));
    }

    public void onExtraCallback(byte b) {
        this.IAuthTabCallback.onExtraCallback(b);
    }

    public void onNavigationEvent(short s) {
        this.IAuthTabCallback.onExtraCallback(s);
    }

    public void onExtraCallback(int i) {
        this.IAuthTabCallback.onExtraCallback(i);
    }

    public void onExtraCallbackWithResult(long j) {
        this.IAuthTabCallback.onExtraCallback(j);
    }

    public void onNavigationEvent(boolean z) {
        this.IAuthTabCallback.onNavigationEvent(String.valueOf(z));
    }

    public void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback.onExtraCallback(str);
    }
}
