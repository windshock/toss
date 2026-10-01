package o;

import android.content.Context;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.trackEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface trackEvent {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onExtraCallbackWithResult;

    public interface onExtraCallback {
        trackEvent setNegativeButtonIcon();
    }

    void IAuthTabCallback(int i);

    void IAuthTabCallback(@NotNull Context context, @Nullable String str);

    void onExtraCallbackWithResult(@NotNull trackInAppPurchase trackinapppurchase);

    void onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Date date, int i);

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int asInterface = 1;
        private static int onExtraCallback;
        static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static final Lazy<trackEvent> onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.notification.ScheduledNotificationUtil$Companion$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 11;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                trackEvent trackeventIAuthTabCallback = trackEvent.onExtraCallbackWithResult.IAuthTabCallback();
                int i4 = onExtraCallback + 83;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return trackeventIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        private static int onWarmupCompleted;

        public static /* synthetic */ trackEvent IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent();
                throw null;
            }
            trackEvent trackeventOnNavigationEvent = onNavigationEvent();
            int i3 = IAuthTabCallback + 53;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 67 / 0;
            }
            return trackeventOnNavigationEvent;
        }

        private onExtraCallbackWithResult() {
        }

        static {
            int i = asInterface + 9;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public final trackEvent onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object value = onNavigationEvent.getValue();
            if (i3 != 0) {
                return (trackEvent) value;
            }
            int i4 = 67 / 0;
            return (trackEvent) value;
        }

        private static final trackEvent onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
            if (i3 != 0) {
                return ((onExtraCallback) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), onExtraCallback.class)).setNegativeButtonIcon();
            }
            ((onExtraCallback) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), onExtraCallback.class)).setNegativeButtonIcon();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
