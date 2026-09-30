package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.getAntiSpoofingExtension, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EnumC0061getAntiSpoofingExtension {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC0061getAntiSpoofingExtension[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    public static final EnumC0061getAntiSpoofingExtension EVENT = new EnumC0061getAntiSpoofingExtension("EVENT", 0);
    public static final EnumC0061getAntiSpoofingExtension STATE = new EnumC0061getAntiSpoofingExtension("STATE", 1);
    public static final EnumC0061getAntiSpoofingExtension SCHEMA_ID = new EnumC0061getAntiSpoofingExtension("SCHEMA_ID", 2);
    public static final EnumC0061getAntiSpoofingExtension SCREEN = new EnumC0061getAntiSpoofingExtension("SCREEN", 3);
    public static final EnumC0061getAntiSpoofingExtension POPUP = new EnumC0061getAntiSpoofingExtension("POPUP", 4);

    private static final /* synthetic */ EnumC0061getAntiSpoofingExtension[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumC0061getAntiSpoofingExtension[] enumC0061getAntiSpoofingExtensionArr = {EVENT, STATE, SCHEMA_ID, SCREEN, POPUP};
        int i5 = i2 + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumC0061getAntiSpoofingExtensionArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<EnumC0061getAntiSpoofingExtension> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<EnumC0061getAntiSpoofingExtension> enumEntries = $ENTRIES;
        int i5 = i2 + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static EnumC0061getAntiSpoofingExtension valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension = (EnumC0061getAntiSpoofingExtension) Enum.valueOf(EnumC0061getAntiSpoofingExtension.class, str);
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return enumC0061getAntiSpoofingExtension;
    }

    public static EnumC0061getAntiSpoofingExtension[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumC0061getAntiSpoofingExtension[] enumC0061getAntiSpoofingExtensionArr = (EnumC0061getAntiSpoofingExtension[]) $VALUES.clone();
        int i4 = onExtraCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return enumC0061getAntiSpoofingExtensionArr;
    }

    private EnumC0061getAntiSpoofingExtension(String str, int i) {
    }

    static {
        EnumC0061getAntiSpoofingExtension[] enumC0061getAntiSpoofingExtensionArr$values = $values();
        $VALUES = enumC0061getAntiSpoofingExtensionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(enumC0061getAntiSpoofingExtensionArr$values);
        int i = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
    }
}
