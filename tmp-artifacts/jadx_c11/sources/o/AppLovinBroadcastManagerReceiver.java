package o;

import im.toss.core.tracker.entry.TrackState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.AppLovinBroadcastManagerReceiver;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface AppLovinBroadcastManagerReceiver {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onNavigationEvent;

    public interface IAuthTabCallback {
        AppLovinBroadcastManagerReceiver supportShouldUpRecreateTask();
    }

    TrackState onWarmupCompleted();

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int asBinder = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        static final /* synthetic */ onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static final Lazy<AppLovinBroadcastManagerReceiver> onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.analytics.toss.TrackerContainer$Companion$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 33;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AppLovinBroadcastManagerReceiver appLovinBroadcastManagerReceiverOnExtraCallbackWithResult = AppLovinBroadcastManagerReceiver.onWarmupCompleted.onExtraCallbackWithResult();
                int i4 = IAuthTabCallback + 95;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return appLovinBroadcastManagerReceiverOnExtraCallbackWithResult;
            }
        });

        public static /* synthetic */ AppLovinBroadcastManagerReceiver onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AppLovinBroadcastManagerReceiver appLovinBroadcastManagerReceiverOnExtraCallback = onExtraCallback();
            if (i3 != 0) {
                int i4 = 33 / 0;
            }
            return appLovinBroadcastManagerReceiverOnExtraCallback;
        }

        private onWarmupCompleted() {
        }

        static {
            int i = asBinder + 35;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public final AppLovinBroadcastManagerReceiver IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AppLovinBroadcastManagerReceiver appLovinBroadcastManagerReceiver = (AppLovinBroadcastManagerReceiver) onExtraCallback.getValue();
            int i4 = IAuthTabCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return appLovinBroadcastManagerReceiver;
        }

        private static final AppLovinBroadcastManagerReceiver onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
            if (i3 != 0) {
                return ((IAuthTabCallback) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), IAuthTabCallback.class)).supportShouldUpRecreateTask();
            }
            ((IAuthTabCallback) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), IAuthTabCallback.class)).supportShouldUpRecreateTask();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
