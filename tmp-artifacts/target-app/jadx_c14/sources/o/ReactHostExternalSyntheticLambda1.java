package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactHostExternalSyntheticLambda1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReactHostExternalSyntheticLambda1[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("TOSS_MONEY")
    public static final ReactHostExternalSyntheticLambda1 TOSS_MONEY = new ReactHostExternalSyntheticLambda1("TOSS_MONEY", 0);

    @SerializedName("SAVING_BOX")
    public static final ReactHostExternalSyntheticLambda1 SAVING_BOX = new ReactHostExternalSyntheticLambda1("SAVING_BOX", 1);

    @SerializedName("HENEM_BOX")
    public static final ReactHostExternalSyntheticLambda1 HENEM_BOX = new ReactHostExternalSyntheticLambda1("HENEM_BOX", 2);

    @SerializedName("JOINT_ACCOUNT")
    public static final ReactHostExternalSyntheticLambda1 JOINT_ACCOUNT = new ReactHostExternalSyntheticLambda1("JOINT_ACCOUNT", 3);

    private static final /* synthetic */ ReactHostExternalSyntheticLambda1[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new ReactHostExternalSyntheticLambda1[]{TOSS_MONEY, SAVING_BOX, HENEM_BOX, JOINT_ACCOUNT};
        }
        ReactHostExternalSyntheticLambda1 reactHostExternalSyntheticLambda1 = TOSS_MONEY;
        ReactHostExternalSyntheticLambda1 reactHostExternalSyntheticLambda12 = SAVING_BOX;
        ReactHostExternalSyntheticLambda1 reactHostExternalSyntheticLambda13 = HENEM_BOX;
        ReactHostExternalSyntheticLambda1 reactHostExternalSyntheticLambda14 = JOINT_ACCOUNT;
        ReactHostExternalSyntheticLambda1[] reactHostExternalSyntheticLambda1Arr = new ReactHostExternalSyntheticLambda1[3];
        reactHostExternalSyntheticLambda1Arr[0] = reactHostExternalSyntheticLambda1;
        reactHostExternalSyntheticLambda1Arr[1] = reactHostExternalSyntheticLambda12;
        reactHostExternalSyntheticLambda1Arr[4] = reactHostExternalSyntheticLambda13;
        reactHostExternalSyntheticLambda1Arr[2] = reactHostExternalSyntheticLambda14;
        return reactHostExternalSyntheticLambda1Arr;
    }

    public static EnumEntries<ReactHostExternalSyntheticLambda1> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<ReactHostExternalSyntheticLambda1> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return enumEntries;
    }

    public static ReactHostExternalSyntheticLambda1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactHostExternalSyntheticLambda1 reactHostExternalSyntheticLambda1 = (ReactHostExternalSyntheticLambda1) Enum.valueOf(ReactHostExternalSyntheticLambda1.class, str);
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return reactHostExternalSyntheticLambda1;
    }

    public static ReactHostExternalSyntheticLambda1[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ReactHostExternalSyntheticLambda1[] reactHostExternalSyntheticLambda1Arr = $VALUES;
        if (i3 != 0) {
            return (ReactHostExternalSyntheticLambda1[]) reactHostExternalSyntheticLambda1Arr.clone();
        }
        int i4 = 16 / 0;
        return (ReactHostExternalSyntheticLambda1[]) reactHostExternalSyntheticLambda1Arr.clone();
    }

    private ReactHostExternalSyntheticLambda1(String str, int i) {
    }

    static {
        ReactHostExternalSyntheticLambda1[] reactHostExternalSyntheticLambda1Arr$values = $values();
        $VALUES = reactHostExternalSyntheticLambda1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(reactHostExternalSyntheticLambda1Arr$values);
        int i = onExtraCallback + 83;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
