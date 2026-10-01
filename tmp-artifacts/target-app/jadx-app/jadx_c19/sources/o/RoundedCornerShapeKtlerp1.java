package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RoundedCornerShapeKtlerp1 {
    private final int onExtraCallbackWithResult;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final int onNavigationEvent = onWarmupCompleted(0);
    private static final int IAuthTabCallback = onWarmupCompleted(1);
    private static final int onWarmupCompleted = onWarmupCompleted(2);

    public static final /* synthetic */ RoundedCornerShapeKtlerp1 IAuthTabCallback(int i2) {
        return new RoundedCornerShapeKtlerp1(i2);
    }

    public static int onExtraCallback(int i2) {
        return Integer.hashCode(i2);
    }

    public static String onExtraCallbackWithResult(int i2) {
        return "ContentScale(value=" + i2 + ')';
    }

    public static boolean onExtraCallbackWithResult(int i2, Object obj) {
        return (obj instanceof RoundedCornerShapeKtlerp1) && i2 == ((RoundedCornerShapeKtlerp1) obj).IAuthTabCallback();
    }

    public static final boolean onNavigationEvent(int i2, int i3) {
        return i2 == i3;
    }

    public static int onWarmupCompleted(int i2) {
        return i2;
    }

    public final /* synthetic */ int IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(Object obj) {
        return onExtraCallbackWithResult(this.onExtraCallbackWithResult, obj);
    }

    public int hashCode() {
        return onExtraCallback(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return onExtraCallbackWithResult(this.onExtraCallbackWithResult);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final int onExtraCallback() {
            return RoundedCornerShapeKtlerp1.onNavigationEvent;
        }

        public final int onNavigationEvent() {
            return RoundedCornerShapeKtlerp1.IAuthTabCallback;
        }

        public final int onWarmupCompleted() {
            return RoundedCornerShapeKtlerp1.onWarmupCompleted;
        }
    }

    private /* synthetic */ RoundedCornerShapeKtlerp1(int i2) {
        this.onExtraCallbackWithResult = i2;
    }
}
