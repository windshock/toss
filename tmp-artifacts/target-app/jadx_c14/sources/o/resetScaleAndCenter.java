package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class resetScaleAndCenter {
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new MutablePropertyReference1Impl<>(resetScaleAndCenter.class, "teensFourteenOnboardingEnabled", "getTeensFourteenOnboardingEnabled()Z", 0), new MutablePropertyReference1Impl<>(resetScaleAndCenter.class, "isNeedShowCardBillAmountTopFullTooltip", "isNeedShowCardBillAmountTopFullTooltip()Z", 0)};
    public static final resetScaleAndCenter onNavigationEvent = new resetScaleAndCenter();
    private static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult("home.teens.birthday.onboarding.enabled", Boolean.FALSE);
    private static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult("card-bill.detail.top.tooltip", Boolean.TRUE);

    private resetScaleAndCenter() {
    }

    public final void onExtraCallback(boolean z) {
        onExtraCallback.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0], Boolean.valueOf(z));
    }

    public final boolean onWarmupCompleted() {
        return ((Boolean) onExtraCallback.onNavigationEvent(this, onExtraCallbackWithResult[0])).booleanValue();
    }

    public final boolean onExtraCallback(int i) {
        return (addPolicy.areNotificationsEnabled().onNavigationEvent("home.consumption.card.register.bottom.sheet") && addPolicy.areNotificationsEnabled().onWarmupCompleted("home.consumption.card.register.bottom.sheet", 0) == i) ? false : true;
    }

    public final void onWarmupCompleted(int i) {
        addPolicy.areNotificationsEnabled().onExtraCallbackWithResult("home.consumption.card.register.bottom.sheet", i);
    }

    public final boolean onExtraCallbackWithResult() {
        return addPolicy.areNotificationsEnabled().onExtraCallback("home.consumption.list.calendar.collapsed", false);
    }

    public final void IAuthTabCallback(boolean z) {
        IAuthTabCallback.onExtraCallbackWithResult(this, onExtraCallbackWithResult[1], Boolean.valueOf(z));
    }

    public final boolean IAuthTabCallback() {
        return ((Boolean) IAuthTabCallback.onNavigationEvent(this, onExtraCallbackWithResult[1])).booleanValue();
    }

    public final void onWarmupCompleted(boolean z) {
        addPolicy.areNotificationsEnabled().onNavigationEvent("start_teens_onboarding", z);
    }

    public final boolean onExtraCallback() {
        return addPolicy.areNotificationsEnabled().onExtraCallback("start_teens_onboarding", false);
    }

    static final class onExtraCallbackWithResult<T> {
        private final T onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull String str, @NotNull T t) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(t, "");
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = t;
        }

        public final T onNavigationEvent(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline) {
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            return (T) addPolicy.areNotificationsEnabled().onExtraCallback(this.onWarmupCompleted, this.onExtraCallbackWithResult);
        }

        public final void onExtraCallbackWithResult(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline, @NotNull T t) {
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            Intrinsics.checkNotNullParameter(t, "");
            addPolicy.areNotificationsEnabled().IAuthTabCallback(this.onWarmupCompleted, t);
        }
    }
}
