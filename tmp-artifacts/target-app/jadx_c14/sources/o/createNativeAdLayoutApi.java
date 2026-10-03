package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeAdLayoutApi {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ createNativeAdLayoutApi[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final createNativeAdLayoutApi DEFAULT = new createNativeAdLayoutApi("DEFAULT", 0);
    public static final createNativeAdLayoutApi NUMBER = new createNativeAdLayoutApi(then.NUMBER, 1);
    public static final createNativeAdLayoutApi ENGLISH = new createNativeAdLayoutApi("ENGLISH", 2);
    public static final createNativeAdLayoutApi EMAIL = new createNativeAdLayoutApi("EMAIL", 3);

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[createNativeAdLayoutApi.values().length];
            try {
                iArr[createNativeAdLayoutApi.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[createNativeAdLayoutApi.NUMBER.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[createNativeAdLayoutApi.ENGLISH.ordinal()] = 3;
                int i2 = onWarmupCompleted + 75;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[createNativeAdLayoutApi.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int i4 = IAuthTabCallback + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final /* synthetic */ createNativeAdLayoutApi[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        createNativeAdLayoutApi createnativeadlayoutapi = DEFAULT;
        if (i3 != 0) {
            return new createNativeAdLayoutApi[]{createnativeadlayoutapi, NUMBER, ENGLISH, EMAIL};
        }
        createNativeAdLayoutApi createnativeadlayoutapi2 = NUMBER;
        createNativeAdLayoutApi createnativeadlayoutapi3 = ENGLISH;
        createNativeAdLayoutApi createnativeadlayoutapi4 = EMAIL;
        createNativeAdLayoutApi[] createnativeadlayoutapiArr = new createNativeAdLayoutApi[4];
        createnativeadlayoutapiArr[0] = createnativeadlayoutapi;
        createnativeadlayoutapiArr[1] = createnativeadlayoutapi2;
        createnativeadlayoutapiArr[3] = createnativeadlayoutapi3;
        createnativeadlayoutapiArr[5] = createnativeadlayoutapi4;
        return createnativeadlayoutapiArr;
    }

    public static EnumEntries<createNativeAdLayoutApi> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        EnumEntries<createNativeAdLayoutApi> enumEntries = $ENTRIES;
        int i4 = i3 + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static createNativeAdLayoutApi valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        createNativeAdLayoutApi createnativeadlayoutapi = (createNativeAdLayoutApi) Enum.valueOf(createNativeAdLayoutApi.class, str);
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return createnativeadlayoutapi;
    }

    public static createNativeAdLayoutApi[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        createNativeAdLayoutApi[] createnativeadlayoutapiArr = (createNativeAdLayoutApi[]) $VALUES.clone();
        int i3 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return createnativeadlayoutapiArr;
        }
        obj.hashCode();
        throw null;
    }

    private createNativeAdLayoutApi(String str, int i) {
    }

    static {
        createNativeAdLayoutApi[] createnativeadlayoutapiArr$values = $values();
        $VALUES = createnativeadlayoutapiArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(createnativeadlayoutapiArr$values);
        int i = IAuthTabCallback + 1;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int getInputType() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return 1;
        }
        int i3 = onWarmupCompleted + 73;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 == 0) {
            if (i2 == 3) {
                return 3;
            }
        } else if (i2 == 2) {
            return 2;
        }
        int i5 = i4 + 77;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        if (i5 % 2 != 0) {
            if (i2 == 3) {
                return 33;
            }
        } else if (i2 == 3) {
            return 33;
        }
        int i7 = i6 + 57;
        int i8 = i7 % 128;
        onExtraCallbackWithResult = i8;
        int i9 = i7 % 2;
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = i8 + 113;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 == 0) {
            return 32;
        }
        throw null;
    }
}
