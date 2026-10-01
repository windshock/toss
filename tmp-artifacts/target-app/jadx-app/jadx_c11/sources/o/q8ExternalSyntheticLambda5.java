package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q8ExternalSyntheticLambda5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q8ExternalSyntheticLambda5[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final q8ExternalSyntheticLambda5 myAsset = new q8ExternalSyntheticLambda5("myAsset", 0);
    public static final q8ExternalSyntheticLambda5 calendar = new q8ExternalSyntheticLambda5("calendar", 1);
    public static final q8ExternalSyntheticLambda5 stocks = new q8ExternalSyntheticLambda5("stocks", 2);

    private static final /* synthetic */ q8ExternalSyntheticLambda5[] $values() {
        q8ExternalSyntheticLambda5[] q8externalsyntheticlambda5Arr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            q8ExternalSyntheticLambda5 q8externalsyntheticlambda5 = myAsset;
            q8ExternalSyntheticLambda5 q8externalsyntheticlambda52 = calendar;
            q8ExternalSyntheticLambda5 q8externalsyntheticlambda53 = stocks;
            q8externalsyntheticlambda5Arr = new q8ExternalSyntheticLambda5[3];
            q8externalsyntheticlambda5Arr[0] = q8externalsyntheticlambda5;
            q8externalsyntheticlambda5Arr[1] = q8externalsyntheticlambda52;
            q8externalsyntheticlambda5Arr[5] = q8externalsyntheticlambda53;
        } else {
            q8externalsyntheticlambda5Arr = new q8ExternalSyntheticLambda5[]{myAsset, calendar, stocks};
        }
        int i4 = i3 + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return q8externalsyntheticlambda5Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<q8ExternalSyntheticLambda5> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<q8ExternalSyntheticLambda5> enumEntries = $ENTRIES;
        int i5 = i2 + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return enumEntries;
    }

    public static q8ExternalSyntheticLambda5 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        q8ExternalSyntheticLambda5 q8externalsyntheticlambda5 = (q8ExternalSyntheticLambda5) Enum.valueOf(q8ExternalSyntheticLambda5.class, str);
        if (i3 != 0) {
            return q8externalsyntheticlambda5;
        }
        throw null;
    }

    public static q8ExternalSyntheticLambda5[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        q8ExternalSyntheticLambda5[] q8externalsyntheticlambda5Arr = $VALUES;
        if (i3 == 0) {
            return (q8ExternalSyntheticLambda5[]) q8externalsyntheticlambda5Arr.clone();
        }
        throw null;
    }

    private q8ExternalSyntheticLambda5(String str, int i) {
    }

    static {
        q8ExternalSyntheticLambda5[] q8externalsyntheticlambda5Arr$values = $values();
        $VALUES = q8externalsyntheticlambda5Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(q8externalsyntheticlambda5Arr$values);
        int i = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
