package o;

import android.app.Activity;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.AppLovinAdServiceImplc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface AppLovinAdServiceImplc {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onExtraCallback;

    public interface onNavigationEvent {
        AppLovinAdServiceImplc PredictiveBackHandlerKtExternalSyntheticLambda1();
    }

    void IAuthTabCallback(int i, @NotNull String str, @NotNull String str2);

    void IAuthTabCallback(@NotNull String str);

    void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    @Deprecated
    void onExtraCallback(@Nullable Activity activity, @NotNull String str, @Nullable Map<String, Object> map);

    void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, Object> map);

    void onExtraCallback(@NotNull String str, @Nullable Map<String, String> map);

    void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, ? extends Object> map);

    void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable Map<String, Object> map);

    void onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, ? extends Object> map);

    void onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends Object> map);

    void onWarmupCompleted();

    void onWarmupCompleted(@NotNull String str, @NotNull String str2, int i);

    void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6);

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int asInterface = 1;
        static final /* synthetic */ IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static final Lazy<AppLovinAdServiceImplc> onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.analytics.AnalyticsHelper$Companion$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    AppLovinAdServiceImplc.IAuthTabCallback.onWarmupCompleted();
                    obj.hashCode();
                    throw null;
                }
                AppLovinAdServiceImplc appLovinAdServiceImplcOnWarmupCompleted = AppLovinAdServiceImplc.IAuthTabCallback.onWarmupCompleted();
                int i3 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return appLovinAdServiceImplcOnWarmupCompleted;
                }
                throw null;
            }
        });
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        public static /* synthetic */ AppLovinAdServiceImplc onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AppLovinAdServiceImplc appLovinAdServiceImplcOnNavigationEvent = onNavigationEvent();
            int i4 = IAuthTabCallback + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return appLovinAdServiceImplcOnNavigationEvent;
            }
            throw null;
        }

        private IAuthTabCallback() {
        }

        static {
            int i = asInterface + 45;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public final AppLovinAdServiceImplc onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object value = onExtraCallbackWithResult.getValue();
            if (i3 == 0) {
                return (AppLovinAdServiceImplc) value;
            }
            int i4 = 67 / 0;
            return (AppLovinAdServiceImplc) value;
        }

        private static final AppLovinAdServiceImplc onNavigationEvent() {
            AppLovinAdServiceImplc appLovinAdServiceImplcPredictiveBackHandlerKtExternalSyntheticLambda1;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Response response = Response.onNavigationEvent;
                appLovinAdServiceImplcPredictiveBackHandlerKtExternalSyntheticLambda1 = ((onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onNavigationEvent.class)).PredictiveBackHandlerKtExternalSyntheticLambda1();
                int i3 = 49 / 0;
            } else {
                Response response2 = Response.onNavigationEvent;
                appLovinAdServiceImplcPredictiveBackHandlerKtExternalSyntheticLambda1 = ((onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onNavigationEvent.class)).PredictiveBackHandlerKtExternalSyntheticLambda1();
            }
            int i4 = IAuthTabCallback + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return appLovinAdServiceImplcPredictiveBackHandlerKtExternalSyntheticLambda1;
        }
    }
}
