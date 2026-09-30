package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r2ExternalSyntheticLambda1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r2ExternalSyntheticLambda1[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final r2ExternalSyntheticLambda1 MATURITY = new r2ExternalSyntheticLambda1("MATURITY", 0);
    public static final r2ExternalSyntheticLambda1 CURRENT = new r2ExternalSyntheticLambda1("CURRENT", 1);

    private static final /* synthetic */ r2ExternalSyntheticLambda1[] $values() {
        r2ExternalSyntheticLambda1[] r2externalsyntheticlambda1Arr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            r2ExternalSyntheticLambda1 r2externalsyntheticlambda1 = MATURITY;
            r2ExternalSyntheticLambda1 r2externalsyntheticlambda12 = CURRENT;
            r2externalsyntheticlambda1Arr = new r2ExternalSyntheticLambda1[4];
            r2externalsyntheticlambda1Arr[1] = r2externalsyntheticlambda1;
            r2externalsyntheticlambda1Arr[0] = r2externalsyntheticlambda12;
        } else {
            r2externalsyntheticlambda1Arr = new r2ExternalSyntheticLambda1[]{MATURITY, CURRENT};
        }
        int i4 = i2 + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return r2externalsyntheticlambda1Arr;
        }
        throw null;
    }

    public static EnumEntries<r2ExternalSyntheticLambda1> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<r2ExternalSyntheticLambda1> enumEntries = $ENTRIES;
        int i5 = i2 + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static r2ExternalSyntheticLambda1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r2ExternalSyntheticLambda1 r2externalsyntheticlambda1 = (r2ExternalSyntheticLambda1) Enum.valueOf(r2ExternalSyntheticLambda1.class, str);
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return r2externalsyntheticlambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r2ExternalSyntheticLambda1[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        r2ExternalSyntheticLambda1[] r2externalsyntheticlambda1Arr = (r2ExternalSyntheticLambda1[]) $VALUES.clone();
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return r2externalsyntheticlambda1Arr;
    }

    private r2ExternalSyntheticLambda1(String str, int i) {
    }

    static {
        r2ExternalSyntheticLambda1[] r2externalsyntheticlambda1Arr$values = $values();
        $VALUES = r2externalsyntheticlambda1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r2externalsyntheticlambda1Arr$values);
        int i = onWarmupCompleted + 29;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
    }
}
