package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class enqueueFrameCallback {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ enqueueFrameCallback[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("BANK")
    public static final enqueueFrameCallback BANK = new enqueueFrameCallback("BANK", 0);

    @SerializedName("SECURITIES")
    public static final enqueueFrameCallback SECURITIES = new enqueueFrameCallback("SECURITIES", 1);

    private static final /* synthetic */ enqueueFrameCallback[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        enqueueFrameCallback[] enqueueframecallbackArr = {BANK, SECURITIES};
        int i5 = i3 + 45;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enqueueframecallbackArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<enqueueFrameCallback> getEntries() {
        EnumEntries<enqueueFrameCallback> enumEntries;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 19 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static enqueueFrameCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        enqueueFrameCallback enqueueframecallback = (enqueueFrameCallback) Enum.valueOf(enqueueFrameCallback.class, str);
        int i4 = onNavigationEvent + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return enqueueframecallback;
    }

    public static enqueueFrameCallback[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        enqueueFrameCallback[] enqueueframecallbackArr = (enqueueFrameCallback[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return enqueueframecallbackArr;
    }

    private enqueueFrameCallback(String str, int i) {
    }

    static {
        enqueueFrameCallback[] enqueueframecallbackArr$values = $values();
        $VALUES = enqueueframecallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(enqueueframecallbackArr$values);
        int i = onExtraCallback + 35;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 17 / 0;
        }
    }
}
