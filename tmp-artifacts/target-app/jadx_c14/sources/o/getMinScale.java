package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getMinScale {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallback = 8;
    private final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult = addPolicy.ITrustedWebActivityCallbackStubProxy();

    public final Integer onNavigationEvent() {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult("SIM_COUNT");
    }

    public final void IAuthTabCallback(@Nullable Integer num) {
        if (num != null) {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult("SIM_COUNT", num.intValue());
        }
    }

    public final Boolean onExtraCallback() {
        return this.onExtraCallbackWithResult.onExtraCallback("IS_SAME_PHONE_NUMBER");
    }

    public final void onExtraCallbackWithResult(@Nullable Boolean bool) {
        if (bool != null) {
            this.onExtraCallbackWithResult.onNavigationEvent("IS_SAME_PHONE_NUMBER", bool.booleanValue());
        }
    }

    public final Boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult.onExtraCallback("IS_MANUAL_INPUT");
    }

    public final void IAuthTabCallback(@Nullable Boolean bool) {
        if (bool != null) {
            this.onExtraCallbackWithResult.onNavigationEvent("IS_MANUAL_INPUT", bool.booleanValue());
        }
    }

    public final Boolean onWarmupCompleted() {
        return this.onExtraCallbackWithResult.onExtraCallback("IS_SIM_COUNT_PERMISSION_GRANTED");
    }

    public final void onWarmupCompleted(@Nullable Boolean bool) {
        if (bool != null) {
            this.onExtraCallbackWithResult.onNavigationEvent("IS_SIM_COUNT_PERMISSION_GRANTED", bool.booleanValue());
        }
    }

    public final Boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult.onExtraCallback("IS_PHONE_NUMBER_PERMISSION_GRANTED");
    }

    public final void onExtraCallback(@Nullable Boolean bool) {
        if (bool != null) {
            this.onExtraCallbackWithResult.onNavigationEvent("IS_PHONE_NUMBER_PERMISSION_GRANTED", bool.booleanValue());
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
