package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onSdkInitialized extends isCreativeDebuggerEnabled {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private boolean onExtraCallback;

    public onSdkInitialized(@Nullable Float f, @Nullable Float f2) {
        super(f, f2, null);
    }

    @Override // o.isCreativeDebuggerEnabled
    public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.BlurEffect;
        int i4 = onNavigationEvent + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return setshouldfailaddisplayifdontkeepactivitiesisenabled;
        }
        throw null;
    }

    @Override // o.isCreativeDebuggerEnabled
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onExtraCallback;
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return z;
    }
}
