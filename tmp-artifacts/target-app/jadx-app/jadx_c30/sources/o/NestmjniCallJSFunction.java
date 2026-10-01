package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NestmjniCallJSFunction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NestmjniCallJSFunction[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final NestmjniCallJSFunction FEMALE = new NestmjniCallJSFunction("FEMALE", 0);
    public static final NestmjniCallJSFunction MALE = new NestmjniCallJSFunction("MALE", 1);

    private static final /* synthetic */ NestmjniCallJSFunction[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        NestmjniCallJSFunction[] nestmjniCallJSFunctionArr = {FEMALE, MALE};
        int i5 = i2 + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return nestmjniCallJSFunctionArr;
    }

    public static EnumEntries<NestmjniCallJSFunction> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<NestmjniCallJSFunction> enumEntries = $ENTRIES;
        int i4 = i2 + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static NestmjniCallJSFunction valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NestmjniCallJSFunction nestmjniCallJSFunction = (NestmjniCallJSFunction) Enum.valueOf(NestmjniCallJSFunction.class, str);
        if (i3 != 0) {
            return nestmjniCallJSFunction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static NestmjniCallJSFunction[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        NestmjniCallJSFunction[] nestmjniCallJSFunctionArr = (NestmjniCallJSFunction[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 99;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 19 / 0;
        }
        return nestmjniCallJSFunctionArr;
    }

    private NestmjniCallJSFunction(String str, int i) {
    }

    static {
        NestmjniCallJSFunction[] nestmjniCallJSFunctionArr$values = $values();
        $VALUES = nestmjniCallJSFunctionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nestmjniCallJSFunctionArr$values);
        int i = onExtraCallbackWithResult + 53;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
