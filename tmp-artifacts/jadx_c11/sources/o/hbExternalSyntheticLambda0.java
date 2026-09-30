package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hbExternalSyntheticLambda0[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final hbExternalSyntheticLambda0 None = new hbExternalSyntheticLambda0("None", 0);
    public static final hbExternalSyntheticLambda0 GraniteDefaultLoadingView = new hbExternalSyntheticLambda0("GraniteDefaultLoadingView", 1);

    private static final /* synthetic */ hbExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        hbExternalSyntheticLambda0 hbexternalsyntheticlambda0 = None;
        if (i3 == 0) {
            return new hbExternalSyntheticLambda0[]{hbexternalsyntheticlambda0, GraniteDefaultLoadingView};
        }
        hbExternalSyntheticLambda0 hbexternalsyntheticlambda02 = GraniteDefaultLoadingView;
        hbExternalSyntheticLambda0[] hbexternalsyntheticlambda0Arr = new hbExternalSyntheticLambda0[3];
        hbexternalsyntheticlambda0Arr[0] = hbexternalsyntheticlambda0;
        hbexternalsyntheticlambda0Arr[0] = hbexternalsyntheticlambda02;
        return hbexternalsyntheticlambda0Arr;
    }

    public static EnumEntries<hbExternalSyntheticLambda0> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static hbExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        hbExternalSyntheticLambda0 hbexternalsyntheticlambda0 = (hbExternalSyntheticLambda0) Enum.valueOf(hbExternalSyntheticLambda0.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return hbexternalsyntheticlambda0;
    }

    public static hbExternalSyntheticLambda0[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        hbExternalSyntheticLambda0[] hbexternalsyntheticlambda0Arr = $VALUES;
        if (i3 == 0) {
            return (hbExternalSyntheticLambda0[]) hbexternalsyntheticlambda0Arr.clone();
        }
        throw null;
    }

    private hbExternalSyntheticLambda0(String str, int i) {
    }

    static {
        hbExternalSyntheticLambda0[] hbexternalsyntheticlambda0Arr$values = $values();
        $VALUES = hbexternalsyntheticlambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(hbexternalsyntheticlambda0Arr$values);
        int i = onExtraCallbackWithResult + 111;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
