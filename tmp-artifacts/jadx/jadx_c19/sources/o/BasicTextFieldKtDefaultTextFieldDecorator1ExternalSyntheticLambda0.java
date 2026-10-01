package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 {
    private final int onExtraCallback;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final int onWarmupCompleted = onWarmupCompleted(400);
    private static final int onNavigationEvent = onWarmupCompleted(500);
    private static final int onExtraCallbackWithResult = onWarmupCompleted(700);

    public static final /* synthetic */ BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 IAuthTabCallback(int i2) {
        return new BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0(i2);
    }

    public static final boolean IAuthTabCallback(int i2, int i3) {
        return i2 == i3;
    }

    public static int onExtraCallback(int i2) {
        return Integer.hashCode(i2);
    }

    public static String onNavigationEvent(int i2) {
        return "FontWeight(value=" + i2 + ')';
    }

    private static int onWarmupCompleted(int i2) {
        return i2;
    }

    public static boolean onWarmupCompleted(int i2, Object obj) {
        return (obj instanceof BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0) && i2 == ((BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0) obj).onExtraCallback();
    }

    public boolean equals(Object obj) {
        return onWarmupCompleted(this.onExtraCallback, obj);
    }

    public int hashCode() {
        return onExtraCallback(this.onExtraCallback);
    }

    public final /* synthetic */ int onExtraCallback() {
        return this.onExtraCallback;
    }

    public String toString() {
        return onNavigationEvent(this.onExtraCallback);
    }

    private /* synthetic */ BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0(int i2) {
        this.onExtraCallback = i2;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final int onWarmupCompleted() {
            return BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0.onWarmupCompleted;
        }

        public final int onExtraCallback() {
            return BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0.onNavigationEvent;
        }

        public final int onNavigationEvent() {
            return BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0.onExtraCallbackWithResult;
        }
    }
}
