package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNameFromAnnotation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getNameFromAnnotation[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("BEFORE_REQUEST")
    public static final getNameFromAnnotation BEFORE_REQUEST = new getNameFromAnnotation("BEFORE_REQUEST", 0);

    @SerializedName("IN_PROGRESS")
    public static final getNameFromAnnotation IN_PROGRESS = new getNameFromAnnotation("IN_PROGRESS", 1);

    @SerializedName("ISSUANCE")
    public static final getNameFromAnnotation ISSUANCE = new getNameFromAnnotation("ISSUANCE", 2);

    @SerializedName("RESET_PASSWORD")
    public static final getNameFromAnnotation RESET_PASSWORD = new getNameFromAnnotation("RESET_PASSWORD", 3);

    private static final /* synthetic */ getNameFromAnnotation[] $values() {
        getNameFromAnnotation[] getnamefromannotationArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            getNameFromAnnotation getnamefromannotation = BEFORE_REQUEST;
            getNameFromAnnotation getnamefromannotation2 = IN_PROGRESS;
            getNameFromAnnotation getnamefromannotation3 = ISSUANCE;
            getNameFromAnnotation getnamefromannotation4 = RESET_PASSWORD;
            getnamefromannotationArr = new getNameFromAnnotation[5];
            getnamefromannotationArr[0] = getnamefromannotation;
            getnamefromannotationArr[1] = getnamefromannotation2;
            getnamefromannotationArr[2] = getnamefromannotation3;
            getnamefromannotationArr[3] = getnamefromannotation4;
        } else {
            getnamefromannotationArr = new getNameFromAnnotation[]{BEFORE_REQUEST, IN_PROGRESS, ISSUANCE, RESET_PASSWORD};
        }
        int i4 = i2 + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return getnamefromannotationArr;
    }

    public static EnumEntries<getNameFromAnnotation> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getNameFromAnnotation> enumEntries = $ENTRIES;
        int i5 = i2 + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return enumEntries;
    }

    public static getNameFromAnnotation valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getNameFromAnnotation getnamefromannotation = (getNameFromAnnotation) Enum.valueOf(getNameFromAnnotation.class, str);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return getnamefromannotation;
    }

    public static getNameFromAnnotation[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        getNameFromAnnotation[] getnamefromannotationArr = (getNameFromAnnotation[]) $VALUES.clone();
        int i3 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return getnamefromannotationArr;
    }

    private getNameFromAnnotation(String str, int i) {
    }

    static {
        getNameFromAnnotation[] getnamefromannotationArr$values = $values();
        $VALUES = getnamefromannotationArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getnamefromannotationArr$values);
        int i = onExtraCallback + 61;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
