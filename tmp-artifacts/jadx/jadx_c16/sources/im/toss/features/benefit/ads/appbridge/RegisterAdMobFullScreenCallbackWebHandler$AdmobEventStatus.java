package im.toss.features.benefit.ads.appbridge;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String value;
    public static final RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus REGISTERED = new RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus("REGISTERED", 0, "REGISTERED");
    public static final RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus CLICKED = new RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus("CLICKED", 1, "CLICKED");
    public static final RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus DISMISSED = new RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus("DISMISSED", 2, "DISMISSED");
    public static final RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus FAILED_TO_SHOW = new RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus("FAILED_TO_SHOW", 3, "FAILED_TO_SHOW");
    public static final RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus IMPRESSION = new RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus("IMPRESSION", 4, "IMPRESSION");
    public static final RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus SHOW = new RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus("SHOW", 5, "SHOW");

    private static final /* synthetic */ RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus[] registerAdMobFullScreenCallbackWebHandler$AdmobEventStatusArr = {REGISTERED, CLICKED, DISMISSED, FAILED_TO_SHOW, IMPRESSION, SHOW};
        int i5 = i2 + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return registerAdMobFullScreenCallbackWebHandler$AdmobEventStatusArr;
    }

    public static EnumEntries<RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus> enumEntries = $ENTRIES;
        int i5 = i3 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return enumEntries;
    }

    public static RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus registerAdMobFullScreenCallbackWebHandler$AdmobEventStatus = (RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus) Enum.valueOf(RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus.class, str);
        if (i3 == 0) {
            return registerAdMobFullScreenCallbackWebHandler$AdmobEventStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus[] registerAdMobFullScreenCallbackWebHandler$AdmobEventStatusArr = (RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return registerAdMobFullScreenCallbackWebHandler$AdmobEventStatusArr;
        }
        throw null;
    }

    private RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    static {
        RegisterAdMobFullScreenCallbackWebHandler$AdmobEventStatus[] registerAdMobFullScreenCallbackWebHandler$AdmobEventStatusArr$values = $values();
        $VALUES = registerAdMobFullScreenCallbackWebHandler$AdmobEventStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(registerAdMobFullScreenCallbackWebHandler$AdmobEventStatusArr$values);
        int i = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
