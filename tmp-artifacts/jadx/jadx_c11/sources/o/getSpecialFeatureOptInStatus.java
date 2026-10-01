package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getSpecialFeatureOptInStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getSpecialFeatureOptInStatus[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final getSpecialFeatureOptInStatus Light = new getSpecialFeatureOptInStatus("Light", 0);
    public static final getSpecialFeatureOptInStatus Dark = new getSpecialFeatureOptInStatus("Dark", 1);

    private static final /* synthetic */ getSpecialFeatureOptInStatus[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        getSpecialFeatureOptInStatus[] getspecialfeatureoptinstatusArr = {Light, Dark};
        int i5 = i2 + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return getspecialfeatureoptinstatusArr;
    }

    public static EnumEntries<getSpecialFeatureOptInStatus> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<getSpecialFeatureOptInStatus> enumEntries = $ENTRIES;
        int i5 = i3 + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return enumEntries;
    }

    public static getSpecialFeatureOptInStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = (getSpecialFeatureOptInStatus) Enum.valueOf(getSpecialFeatureOptInStatus.class, str);
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getspecialfeatureoptinstatus;
    }

    public static getSpecialFeatureOptInStatus[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getSpecialFeatureOptInStatus[] getspecialfeatureoptinstatusArr = (getSpecialFeatureOptInStatus[]) $VALUES.clone();
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return getspecialfeatureoptinstatusArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getSpecialFeatureOptInStatus(String str, int i) {
    }

    static {
        getSpecialFeatureOptInStatus[] getspecialfeatureoptinstatusArr$values = $values();
        $VALUES = getspecialfeatureoptinstatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getspecialfeatureoptinstatusArr$values);
        Companion = new onWarmupCompleted(null);
        int i = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
