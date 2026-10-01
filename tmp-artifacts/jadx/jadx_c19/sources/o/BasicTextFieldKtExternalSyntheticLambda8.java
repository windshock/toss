package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicTextFieldKtExternalSyntheticLambda8 {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final int IAuthTabCallback = IAuthTabCallback(0);
    private static final int onWarmupCompleted = IAuthTabCallback(1);
    private final int onExtraCallbackWithResult;

    private static int IAuthTabCallback(int i2) {
        return i2;
    }

    public static int onExtraCallbackWithResult(int i2) {
        return Integer.hashCode(i2);
    }

    public static final boolean onNavigationEvent(int i2, int i3) {
        return i2 == i3;
    }

    public static boolean onNavigationEvent(int i2, Object obj) {
        return (obj instanceof BasicTextFieldKtExternalSyntheticLambda8) && i2 == ((BasicTextFieldKtExternalSyntheticLambda8) obj).IAuthTabCallback();
    }

    public final /* synthetic */ int IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(Object obj) {
        return onNavigationEvent(this.onExtraCallbackWithResult, obj);
    }

    public int hashCode() {
        return onExtraCallbackWithResult(this.onExtraCallbackWithResult);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final int onExtraCallback() {
            return BasicTextFieldKtExternalSyntheticLambda8.onWarmupCompleted;
        }
    }

    public String toString() {
        return onExtraCallback(this.onExtraCallbackWithResult);
    }

    public static String onExtraCallback(int i2) {
        return onNavigationEvent(i2, IAuthTabCallback) ? "Normal" : onNavigationEvent(i2, onWarmupCompleted) ? "Italic" : "Invalid";
    }
}
