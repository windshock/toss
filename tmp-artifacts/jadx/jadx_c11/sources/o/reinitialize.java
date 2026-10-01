package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class reinitialize extends isCreativeDebuggerEnabled {
    private static int asInterface = 1;
    private static int onExtraCallback;
    private Integer IAuthTabCallback;
    private boolean onExtraCallbackWithResult;
    private setHasUserConsent onNavigationEvent;
    private Integer onWarmupCompleted;

    public reinitialize(@Nullable Integer num, @Nullable Integer num2) {
        int iIntValue;
        super(Float.valueOf(0.0f), Float.valueOf(1.0f), null);
        this.IAuthTabCallback = num;
        this.onWarmupCompleted = num2;
        int i = 0;
        if (num != null) {
            iIntValue = num.intValue();
            int i2 = onExtraCallback + 9;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            iIntValue = 0;
        }
        if (num2 != null) {
            int i5 = onExtraCallback + 21;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int iIntValue2 = num2.intValue();
            if (i6 == 0) {
                int i7 = 40 / 0;
            }
            i = iIntValue2;
            int i8 = 2 % 2;
        }
        this.onNavigationEvent = new setHasUserConsent(iIntValue, i);
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Integer num = this.IAuthTabCallback;
        int i5 = i3 + 37;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void onExtraCallbackWithResult(@Nullable Integer num) {
        int i = 2 % 2;
        this.IAuthTabCallback = num;
        int i2 = 0;
        if (num != null) {
            int i3 = asInterface + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int iIntValue = num.intValue();
            if (i4 != 0) {
                int i5 = 5 / 0;
            }
            i2 = iIntValue;
            int i6 = asInterface + 71;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 2;
            }
        }
        this.onNavigationEvent = new setHasUserConsent(i2, this.onNavigationEvent.onWarmupCompleted().intValue());
    }

    public final Integer onExtraCallback() {
        Integer num;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 57;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.onWarmupCompleted;
            int i4 = 50 / 0;
        } else {
            num = this.onWarmupCompleted;
        }
        int i5 = i2 + 5;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void onWarmupCompleted(@Nullable Integer num) {
        int i = 2 % 2;
        this.onWarmupCompleted = num;
        int iIntValue = this.onNavigationEvent.onExtraCallback().intValue();
        int i2 = 0;
        if (num != null) {
            int i3 = asInterface + 123;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int iIntValue2 = num.intValue();
            if (i4 != 0) {
                int i5 = 5 / 0;
            }
            i2 = iIntValue2;
        } else {
            int i6 = onExtraCallback + 35;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        }
        this.onNavigationEvent = new setHasUserConsent(iIntValue, i2);
        int i8 = onExtraCallback + 87;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // o.isCreativeDebuggerEnabled
    public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.BackgroundColor;
        int i4 = onExtraCallback + 61;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return setshouldfailaddisplayifdontkeepactivitiesisenabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isCreativeDebuggerEnabled
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i2 + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final int onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = this.onNavigationEvent.IAuthTabCallback(f).intValue();
        int i4 = asInterface + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }
}
