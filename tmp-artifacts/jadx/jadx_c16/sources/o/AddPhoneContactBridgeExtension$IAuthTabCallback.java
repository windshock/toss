package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AddPhoneContactBridgeExtension$IAuthTabCallback {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AddPhoneContactBridgeExtension$IAuthTabCallback[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final AddPhoneContactBridgeExtension$IAuthTabCallback SHOW = new AddPhoneContactBridgeExtension$IAuthTabCallback("SHOW", 0, "SHOW");
    public static final AddPhoneContactBridgeExtension$IAuthTabCallback USER_EARNED_REWARD = new AddPhoneContactBridgeExtension$IAuthTabCallback("USER_EARNED_REWARD", 1, "USER_EARNED_REWARD");
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String value;

    private static final /* synthetic */ AddPhoneContactBridgeExtension$IAuthTabCallback[] $values() {
        AddPhoneContactBridgeExtension$IAuthTabCallback[] addPhoneContactBridgeExtension$IAuthTabCallbackArr;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 43;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            AddPhoneContactBridgeExtension$IAuthTabCallback addPhoneContactBridgeExtension$IAuthTabCallback = SHOW;
            AddPhoneContactBridgeExtension$IAuthTabCallback addPhoneContactBridgeExtension$IAuthTabCallback2 = USER_EARNED_REWARD;
            addPhoneContactBridgeExtension$IAuthTabCallbackArr = new AddPhoneContactBridgeExtension$IAuthTabCallback[3];
            addPhoneContactBridgeExtension$IAuthTabCallbackArr[1] = addPhoneContactBridgeExtension$IAuthTabCallback;
            addPhoneContactBridgeExtension$IAuthTabCallbackArr[0] = addPhoneContactBridgeExtension$IAuthTabCallback2;
        } else {
            addPhoneContactBridgeExtension$IAuthTabCallbackArr = new AddPhoneContactBridgeExtension$IAuthTabCallback[]{SHOW, USER_EARNED_REWARD};
        }
        int i4 = i2 + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return addPhoneContactBridgeExtension$IAuthTabCallbackArr;
    }

    public static EnumEntries<AddPhoneContactBridgeExtension$IAuthTabCallback> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AddPhoneContactBridgeExtension$IAuthTabCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactBridgeExtension$IAuthTabCallback addPhoneContactBridgeExtension$IAuthTabCallback = (AddPhoneContactBridgeExtension$IAuthTabCallback) Enum.valueOf(AddPhoneContactBridgeExtension$IAuthTabCallback.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return addPhoneContactBridgeExtension$IAuthTabCallback;
    }

    public static AddPhoneContactBridgeExtension$IAuthTabCallback[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AddPhoneContactBridgeExtension$IAuthTabCallback[] addPhoneContactBridgeExtension$IAuthTabCallbackArr = (AddPhoneContactBridgeExtension$IAuthTabCallback[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return addPhoneContactBridgeExtension$IAuthTabCallbackArr;
    }

    private AddPhoneContactBridgeExtension$IAuthTabCallback(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        AddPhoneContactBridgeExtension$IAuthTabCallback[] addPhoneContactBridgeExtension$IAuthTabCallbackArr$values = $values();
        $VALUES = addPhoneContactBridgeExtension$IAuthTabCallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(addPhoneContactBridgeExtension$IAuthTabCallbackArr$values);
        int i = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
