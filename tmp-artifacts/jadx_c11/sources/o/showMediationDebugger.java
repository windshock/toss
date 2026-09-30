package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class showMediationDebugger extends isCreativeDebuggerEnabled {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private boolean IAuthTabCallback;

    public showMediationDebugger(@Nullable Float f, @Nullable Float f2) {
        super(f, f2, null);
    }

    @Override // o.isCreativeDebuggerEnabled
    public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Blur;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return setshouldfailaddisplayifdontkeepactivitiesisenabled;
    }

    @Override // o.isCreativeDebuggerEnabled
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i3 + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
