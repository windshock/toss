package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r5 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final r2ExternalSyntheticLambda2 onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r2ExternalSyntheticLambda2 r2externalsyntheticlambda2IAuthTabCallback = r2ExternalSyntheticLambda2.Companion.IAuthTabCallback(str);
        int i4 = IAuthTabCallback + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return r2externalsyntheticlambda2IAuthTabCallback;
    }
}
