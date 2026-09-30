package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicTextFieldKtExternalSyntheticLambda6 {
    private final int asInterface;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final int IAuthTabCallback = onNavigationEvent(1);
    private static final int onExtraCallback = onNavigationEvent(2);
    private static final int onWarmupCompleted = onNavigationEvent(3);
    private static final int onNavigationEvent = onNavigationEvent(4);
    private static final int onExtraCallbackWithResult = onNavigationEvent(5);

    public static int IAuthTabCallback(int i2) {
        return Integer.hashCode(i2);
    }

    public static final /* synthetic */ BasicTextFieldKtExternalSyntheticLambda6 onExtraCallback(int i2) {
        return new BasicTextFieldKtExternalSyntheticLambda6(i2);
    }

    public static final boolean onExtraCallback(int i2, int i3) {
        return i2 == i3;
    }

    public static int onNavigationEvent(int i2) {
        return i2;
    }

    public static boolean onNavigationEvent(int i2, Object obj) {
        return (obj instanceof BasicTextFieldKtExternalSyntheticLambda6) && i2 == ((BasicTextFieldKtExternalSyntheticLambda6) obj).asBinder();
    }

    public final /* synthetic */ int asBinder() {
        return this.asInterface;
    }

    public boolean equals(Object obj) {
        return onNavigationEvent(this.asInterface, obj);
    }

    public int hashCode() {
        return IAuthTabCallback(this.asInterface);
    }

    private /* synthetic */ BasicTextFieldKtExternalSyntheticLambda6(int i2) {
        this.asInterface = i2;
    }

    public String toString() {
        return onExtraCallbackWithResult(this.asInterface);
    }

    public static String onExtraCallbackWithResult(int i2) {
        return onExtraCallback(i2, IAuthTabCallback) ? "Left" : onExtraCallback(i2, onExtraCallback) ? "Right" : onExtraCallback(i2, onWarmupCompleted) ? "Center" : onExtraCallback(i2, onNavigationEvent) ? "Start" : onExtraCallback(i2, onExtraCallbackWithResult) ? "End" : "Invalid";
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final int onWarmupCompleted() {
            return BasicTextFieldKtExternalSyntheticLambda6.IAuthTabCallback;
        }

        public final int onExtraCallback() {
            return BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback;
        }

        public final int IAuthTabCallback() {
            return BasicTextFieldKtExternalSyntheticLambda6.onWarmupCompleted;
        }

        public final int onExtraCallbackWithResult() {
            return BasicTextFieldKtExternalSyntheticLambda6.onNavigationEvent;
        }

        public final int onNavigationEvent() {
            return BasicTextFieldKtExternalSyntheticLambda6.onExtraCallbackWithResult;
        }
    }
}
