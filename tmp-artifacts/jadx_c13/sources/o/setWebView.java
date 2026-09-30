package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.uu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setWebView {
    private int onExtraCallbackWithResult;
    private Object[] onNavigationEvent = new Object[8];
    private int[] onWarmupCompleted;

    public setWebView() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.onWarmupCompleted = iArr;
        this.onExtraCallbackWithResult = -1;
    }

    static final class onExtraCallback {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();

        private onExtraCallback() {
        }
    }

    public final void onExtraCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        int i = this.onExtraCallbackWithResult + 1;
        this.onExtraCallbackWithResult = i;
        if (i == this.onNavigationEvent.length) {
            onWarmupCompleted();
        }
        this.onNavigationEvent[i] = serialDescriptor;
    }

    public final void onExtraCallback(int i) {
        this.onWarmupCompleted[this.onExtraCallbackWithResult] = i;
    }

    public final void onWarmupCompleted(@Nullable Object obj) {
        int[] iArr = this.onWarmupCompleted;
        int i = this.onExtraCallbackWithResult;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.onExtraCallbackWithResult = i2;
            if (i2 == this.onNavigationEvent.length) {
                onWarmupCompleted();
            }
        }
        Object[] objArr = this.onNavigationEvent;
        int i3 = this.onExtraCallbackWithResult;
        objArr[i3] = obj;
        this.onWarmupCompleted[i3] = -2;
    }

    public final void onNavigationEvent() {
        int[] iArr = this.onWarmupCompleted;
        int i = this.onExtraCallbackWithResult;
        if (iArr[i] == -2) {
            this.onNavigationEvent[i] = onExtraCallback.IAuthTabCallback;
        }
    }

    public final void onExtraCallbackWithResult() {
        int i = this.onExtraCallbackWithResult;
        int[] iArr = this.onWarmupCompleted;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.onExtraCallbackWithResult = i - 1;
        }
        int i2 = this.onExtraCallbackWithResult;
        if (i2 != -1) {
            this.onExtraCallbackWithResult = i2 - 1;
        }
    }

    public final String onExtraCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.onExtraCallbackWithResult;
        for (int i2 = 0; i2 < i + 1; i2++) {
            Object obj = this.onNavigationEvent[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(serialDescriptor.IAuthTabCallback(), uu.onNavigationEvent.onExtraCallbackWithResult)) {
                    if (this.onWarmupCompleted[i2] != -1) {
                        sb.append("[");
                        sb.append(this.onWarmupCompleted[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = this.onWarmupCompleted[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.onWarmupCompleted(i3));
                    }
                }
            } else if (obj != onExtraCallback.IAuthTabCallback) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        return sb.toString();
    }

    private final void onWarmupCompleted() {
        int i = this.onExtraCallbackWithResult << 1;
        Object[] objArrCopyOf = Arrays.copyOf(this.onNavigationEvent, i);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        this.onNavigationEvent = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.onWarmupCompleted, i);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
        this.onWarmupCompleted = iArrCopyOf;
    }

    public String toString() {
        return onExtraCallback();
    }
}
