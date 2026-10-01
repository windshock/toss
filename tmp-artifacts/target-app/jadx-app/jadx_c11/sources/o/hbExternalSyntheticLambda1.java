package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hbExternalSyntheticLambda1[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final hbExternalSyntheticLambda1 Ready = new hbExternalSyntheticLambda1("Ready", 0);
    public static final hbExternalSyntheticLambda1 Waiting = new hbExternalSyntheticLambda1("Waiting", 1);
    public static final hbExternalSyntheticLambda1 Fallback = new hbExternalSyntheticLambda1("Fallback", 2);

    private static final /* synthetic */ hbExternalSyntheticLambda1[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda1 = Ready;
        if (i3 != 0) {
            return new hbExternalSyntheticLambda1[]{hbexternalsyntheticlambda1, Waiting, Fallback};
        }
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda12 = Waiting;
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda13 = Fallback;
        hbExternalSyntheticLambda1[] hbexternalsyntheticlambda1Arr = new hbExternalSyntheticLambda1[3];
        hbexternalsyntheticlambda1Arr[0] = hbexternalsyntheticlambda1;
        hbexternalsyntheticlambda1Arr[1] = hbexternalsyntheticlambda12;
        hbexternalsyntheticlambda1Arr[5] = hbexternalsyntheticlambda13;
        return hbexternalsyntheticlambda1Arr;
    }

    public static EnumEntries<hbExternalSyntheticLambda1> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<hbExternalSyntheticLambda1> enumEntries = $ENTRIES;
        int i5 = i3 + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static hbExternalSyntheticLambda1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda1 = (hbExternalSyntheticLambda1) Enum.valueOf(hbExternalSyntheticLambda1.class, str);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        int i5 = IAuthTabCallback + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return hbexternalsyntheticlambda1;
    }

    public static hbExternalSyntheticLambda1[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hbExternalSyntheticLambda1[] hbexternalsyntheticlambda1Arr = (hbExternalSyntheticLambda1[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
        return hbexternalsyntheticlambda1Arr;
    }

    private hbExternalSyntheticLambda1(String str, int i) {
    }

    static {
        hbExternalSyntheticLambda1[] hbexternalsyntheticlambda1Arr$values = $values();
        $VALUES = hbexternalsyntheticlambda1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(hbexternalsyntheticlambda1Arr$values);
        int i = onWarmupCompleted + 91;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
