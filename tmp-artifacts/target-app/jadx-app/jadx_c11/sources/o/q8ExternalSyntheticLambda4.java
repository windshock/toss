package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q8ExternalSyntheticLambda4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q8ExternalSyntheticLambda4[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final q8ExternalSyntheticLambda4 small = new q8ExternalSyntheticLambda4("small", 0);
    public static final q8ExternalSyntheticLambda4 medium = new q8ExternalSyntheticLambda4("medium", 1);
    public static final q8ExternalSyntheticLambda4 large = new q8ExternalSyntheticLambda4("large", 2);

    private static final /* synthetic */ q8ExternalSyntheticLambda4[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda4 = small;
        if (i3 != 0) {
            return new q8ExternalSyntheticLambda4[]{q8externalsyntheticlambda4, medium, large};
        }
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda42 = medium;
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda43 = large;
        q8ExternalSyntheticLambda4[] q8externalsyntheticlambda4Arr = new q8ExternalSyntheticLambda4[3];
        q8externalsyntheticlambda4Arr[0] = q8externalsyntheticlambda4;
        q8externalsyntheticlambda4Arr[0] = q8externalsyntheticlambda42;
        q8externalsyntheticlambda4Arr[4] = q8externalsyntheticlambda43;
        return q8externalsyntheticlambda4Arr;
    }

    public static EnumEntries<q8ExternalSyntheticLambda4> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<q8ExternalSyntheticLambda4> enumEntries = $ENTRIES;
        int i4 = i3 + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return enumEntries;
    }

    public static q8ExternalSyntheticLambda4 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda4 = (q8ExternalSyntheticLambda4) Enum.valueOf(q8ExternalSyntheticLambda4.class, str);
        int i4 = onExtraCallbackWithResult + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return q8externalsyntheticlambda4;
    }

    public static q8ExternalSyntheticLambda4[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        q8ExternalSyntheticLambda4[] q8externalsyntheticlambda4Arr = $VALUES;
        if (i3 != 0) {
            return (q8ExternalSyntheticLambda4[]) q8externalsyntheticlambda4Arr.clone();
        }
        throw null;
    }

    private q8ExternalSyntheticLambda4(String str, int i) {
    }

    static {
        q8ExternalSyntheticLambda4[] q8externalsyntheticlambda4Arr$values = $values();
        $VALUES = q8externalsyntheticlambda4Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(q8externalsyntheticlambda4Arr$values);
        int i = IAuthTabCallback + 109;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
