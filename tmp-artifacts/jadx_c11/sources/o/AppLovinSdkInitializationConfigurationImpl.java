package o;

import android.content.Context;
import android.view.View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.AppLovinSdkInitializationConfigurationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface AppLovinSdkInitializationConfigurationImpl {
    public static final onWarmupCompleted Companion = onWarmupCompleted.IAuthTabCallback;

    public interface onExtraCallbackWithResult {
        AppLovinSdkInitializationConfigurationImpl RestrictTo();
    }

    drawProgress<Integer> IAuthTabCallback();

    void IAuthTabCallback(@Nullable View view, @Nullable View view2, boolean z);

    void onExtraCallback(@Nullable View view, @Nullable View view2, int i, boolean z);

    void onExtraCallback(@NotNull String str);

    void onExtraCallback(@Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02);

    void onExtraCallbackWithResult(@Nullable Context context, @Nullable Integer num);

    void onExtraCallbackWithResult(@NotNull String str);

    void onWarmupCompleted(@NotNull String str);

    static /* synthetic */ void onNavigationEvent(AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl, Context context, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInboxClick");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        appLovinSdkInitializationConfigurationImpl.onExtraCallbackWithResult(context, num);
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        static final /* synthetic */ onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static final Lazy<AppLovinSdkInitializationConfigurationImpl> onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.feed.Inbox$Companion$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 73;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImplOnNavigationEvent = AppLovinSdkInitializationConfigurationImpl.onWarmupCompleted.onNavigationEvent();
                int i4 = onNavigationEvent + 125;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkInitializationConfigurationImplOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });

        public static /* synthetic */ AppLovinSdkInitializationConfigurationImpl onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImplOnExtraCallback = onExtraCallback();
            int i3 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return appLovinSdkInitializationConfigurationImplOnExtraCallback;
        }

        private onWarmupCompleted() {
        }

        static {
            int i = onExtraCallback + 73;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                int i2 = 88 / 0;
            }
        }

        public final AppLovinSdkInitializationConfigurationImpl onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl = (AppLovinSdkInitializationConfigurationImpl) onNavigationEvent.getValue();
            int i4 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
            return appLovinSdkInitializationConfigurationImpl;
        }

        private static final AppLovinSdkInitializationConfigurationImpl onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImplRestrictTo = ((onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onExtraCallbackWithResult.class)).RestrictTo();
            int i4 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
            return appLovinSdkInitializationConfigurationImplRestrictTo;
        }
    }
}
