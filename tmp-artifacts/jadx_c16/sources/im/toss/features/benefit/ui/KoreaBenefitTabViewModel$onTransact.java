package im.toss.features.benefit.ui;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class KoreaBenefitTabViewModel$onTransact {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KoreaBenefitTabViewModel$onTransact[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final KoreaBenefitTabViewModel$onTransact ALARM_ON = new KoreaBenefitTabViewModel$onTransact("ALARM_ON", 0);
    public static final KoreaBenefitTabViewModel$onTransact ALARM_OFF = new KoreaBenefitTabViewModel$onTransact("ALARM_OFF", 1);

    private static final /* synthetic */ KoreaBenefitTabViewModel$onTransact[] $values() {
        KoreaBenefitTabViewModel$onTransact[] koreaBenefitTabViewModel$onTransactArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            KoreaBenefitTabViewModel$onTransact koreaBenefitTabViewModel$onTransact = ALARM_ON;
            KoreaBenefitTabViewModel$onTransact koreaBenefitTabViewModel$onTransact2 = ALARM_OFF;
            koreaBenefitTabViewModel$onTransactArr = new KoreaBenefitTabViewModel$onTransact[4];
            koreaBenefitTabViewModel$onTransactArr[1] = koreaBenefitTabViewModel$onTransact;
            koreaBenefitTabViewModel$onTransactArr[0] = koreaBenefitTabViewModel$onTransact2;
        } else {
            koreaBenefitTabViewModel$onTransactArr = new KoreaBenefitTabViewModel$onTransact[]{ALARM_ON, ALARM_OFF};
        }
        int i4 = i2 + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return koreaBenefitTabViewModel$onTransactArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<KoreaBenefitTabViewModel$onTransact> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<KoreaBenefitTabViewModel$onTransact> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return enumEntries;
    }

    public static KoreaBenefitTabViewModel$onTransact valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KoreaBenefitTabViewModel$onTransact koreaBenefitTabViewModel$onTransact = (KoreaBenefitTabViewModel$onTransact) Enum.valueOf(KoreaBenefitTabViewModel$onTransact.class, str);
        int i4 = onExtraCallback + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return koreaBenefitTabViewModel$onTransact;
        }
        throw null;
    }

    public static KoreaBenefitTabViewModel$onTransact[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KoreaBenefitTabViewModel$onTransact[] koreaBenefitTabViewModel$onTransactArr = (KoreaBenefitTabViewModel$onTransact[]) $VALUES.clone();
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return koreaBenefitTabViewModel$onTransactArr;
    }

    private KoreaBenefitTabViewModel$onTransact(String str, int i) {
    }

    static {
        KoreaBenefitTabViewModel$onTransact[] koreaBenefitTabViewModel$onTransactArr$values = $values();
        $VALUES = koreaBenefitTabViewModel$onTransactArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(koreaBenefitTabViewModel$onTransactArr$values);
        int i = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
