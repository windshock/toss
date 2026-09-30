package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setUserIdentifier extends isCreativeDebuggerEnabled {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setUserIdentifier(@NotNull getVersionCode getversioncode, @NotNull getVersionCode getversioncode2) {
        super(Float.valueOf(getversioncode.getValue()), Float.valueOf(getversioncode2.getValue()), null);
        Intrinsics.checkNotNullParameter(getversioncode, "");
        Intrinsics.checkNotNullParameter(getversioncode2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setUserIdentifier(@NotNull getVersionCode getversioncode) {
        this(getversioncode, getversioncode);
        Intrinsics.checkNotNullParameter(getversioncode, "");
    }

    @Override // o.isCreativeDebuggerEnabled
    public setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback() {
        setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled setshouldfailaddisplayifdontkeepactivitiesisenabled;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Perspective;
            int i3 = 96 / 0;
        } else {
            setshouldfailaddisplayifdontkeepactivitiesisenabled = setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Perspective;
        }
        int i4 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return setshouldfailaddisplayifdontkeepactivitiesisenabled;
    }

    @Override // o.isCreativeDebuggerEnabled
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 83;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i2 + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }
}
