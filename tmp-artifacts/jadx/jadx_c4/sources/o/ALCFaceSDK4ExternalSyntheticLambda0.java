package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceSDK4ExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ALCFaceSDK4ExternalSyntheticLambda0[] $VALUES;
    public static final ALCFaceSDK4ExternalSyntheticLambda0 EVERY = new ALCFaceSDK4ExternalSyntheticLambda0("EVERY", 0);
    public static final ALCFaceSDK4ExternalSyntheticLambda0 EXACTLY = new ALCFaceSDK4ExternalSyntheticLambda0("EXACTLY", 1);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ ALCFaceSDK4ExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        ALCFaceSDK4ExternalSyntheticLambda0[] aLCFaceSDK4ExternalSyntheticLambda0Arr = {EVERY, EXACTLY};
        int i5 = i3 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return aLCFaceSDK4ExternalSyntheticLambda0Arr;
    }

    public static EnumEntries<ALCFaceSDK4ExternalSyntheticLambda0> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<ALCFaceSDK4ExternalSyntheticLambda0> enumEntries = $ENTRIES;
        int i5 = i3 + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static ALCFaceSDK4ExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0 = (ALCFaceSDK4ExternalSyntheticLambda0) Enum.valueOf(ALCFaceSDK4ExternalSyntheticLambda0.class, str);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return aLCFaceSDK4ExternalSyntheticLambda0;
    }

    public static ALCFaceSDK4ExternalSyntheticLambda0[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDK4ExternalSyntheticLambda0[] aLCFaceSDK4ExternalSyntheticLambda0Arr = (ALCFaceSDK4ExternalSyntheticLambda0[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceSDK4ExternalSyntheticLambda0Arr;
    }

    private ALCFaceSDK4ExternalSyntheticLambda0(String str, int i) {
    }

    static {
        ALCFaceSDK4ExternalSyntheticLambda0[] aLCFaceSDK4ExternalSyntheticLambda0Arr$values = $values();
        $VALUES = aLCFaceSDK4ExternalSyntheticLambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aLCFaceSDK4ExternalSyntheticLambda0Arr$values);
        int i = IAuthTabCallback + 35;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
