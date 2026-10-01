package o;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.trackCheckout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface trackCheckout {
    public static final IAuthTabCallback Companion = IAuthTabCallback.IAuthTabCallback;

    public interface onExtraCallbackWithResult {
        trackCheckout Rlayout();
    }

    void IAuthTabCallback(@NotNull Context context);

    void asBinder(@NotNull Context context);

    int onExtraCallback();

    void onExtraCallback(@Nullable String str, int i);

    boolean onExtraCallback(@NotNull Context context);

    Intent onNavigationEvent(@NotNull Context context);

    AtomicInteger onNavigationEvent();

    String onWarmupCompleted(@NotNull Context context, boolean z);

    void onWarmupCompleted(@Nullable String str, int i, @NotNull Function1<? super trackEventSynchronously, Unit> function1);

    boolean onWarmupCompleted(@NotNull Context context);

    static /* synthetic */ void IAuthTabCallback(trackCheckout trackcheckout, String str, int i, Function1 function1, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNotification");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = trackcheckout.onNavigationEvent().getAndIncrement();
        }
        trackcheckout.onWarmupCompleted(str, i, function1);
    }

    public static final class IAuthTabCallback {
        static final /* synthetic */ IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
        private static final Lazy<trackCheckout> onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.notification.NotificationHelper$Companion$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                trackCheckout trackcheckoutIAuthTabCallback = trackCheckout.IAuthTabCallback.IAuthTabCallback();
                int i4 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 0 / 0;
                }
                return trackcheckoutIAuthTabCallback;
            }
        });
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onTransact = 1;
        private static int onWarmupCompleted;

        public static /* synthetic */ trackCheckout IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            trackCheckout trackcheckoutOnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return trackcheckoutOnWarmupCompleted;
            }
            throw null;
        }

        private IAuthTabCallback() {
        }

        static {
            int i = onWarmupCompleted + 65;
            onTransact = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final trackCheckout onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            trackCheckout trackcheckout = (trackCheckout) onExtraCallback.getValue();
            if (i3 == 0) {
                return trackcheckout;
            }
            throw null;
        }

        private static final trackCheckout onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            trackCheckout trackcheckoutRlayout = ((onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onExtraCallbackWithResult.class)).Rlayout();
            int i4 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return trackcheckoutRlayout;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
