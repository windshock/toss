package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinSdkUtilsSize extends isCreativeDebuggerEnabled {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private Integer IAuthTabCallback;
    private Integer onExtraCallback;

    public AppLovinSdkUtilsSize(@Nullable Integer num, @Nullable Integer num2) {
        super(Float.valueOf(0.0f), Float.valueOf(1.0f), null);
        this.onExtraCallback = num;
        this.IAuthTabCallback = num2;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.onExtraCallback = num;
        int i5 = i3 + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Integer num = this.IAuthTabCallback;
        int i5 = i3 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void onNavigationEvent(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = num;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.isCreativeDebuggerEnabled
    public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.TextColor;
        int i4 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setshouldfailaddisplayifdontkeepactivitiesisenabled;
    }
}
