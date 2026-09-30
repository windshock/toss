package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setActualImageResource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setActualImageResource[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String statusName;

    @SerializedName("ACTIVATE")
    public static final setActualImageResource ACTIVATE = new setActualImageResource("ACTIVATE", 0, "ACTIVATE");

    @SerializedName("DEACTIVATE")
    public static final setActualImageResource DEACTIVATE = new setActualImageResource("DEACTIVATE", 1, "DEACTIVATE");

    @SerializedName(getUniqueNativeAdCount.UNDEFINED)
    public static final setActualImageResource UNDEFINED = new setActualImageResource(getUniqueNativeAdCount.UNDEFINED, 2, getUniqueNativeAdCount.UNDEFINED);

    private static final /* synthetic */ setActualImageResource[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        setActualImageResource[] setactualimageresourceArr = {ACTIVATE, DEACTIVATE, UNDEFINED};
        int i5 = i2 + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return setactualimageresourceArr;
    }

    public static EnumEntries<setActualImageResource> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setActualImageResource valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setActualImageResource setactualimageresource = (setActualImageResource) Enum.valueOf(setActualImageResource.class, str);
        int i4 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return setactualimageresource;
    }

    public static setActualImageResource[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setActualImageResource[] setactualimageresourceArr = (setActualImageResource[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setactualimageresourceArr;
    }

    private setActualImageResource(String str, int i, String str2) {
        this.statusName = str2;
    }

    public static final /* synthetic */ String access$getStatusName$p(setActualImageResource setactualimageresource) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = setactualimageresource.statusName;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        setActualImageResource[] setactualimageresourceArr$values = $values();
        $VALUES = setactualimageresourceArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setactualimageresourceArr$values);
        Companion = new onWarmupCompleted(null);
        int i = IAuthTabCallback + 101;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 54 / 0;
        }
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusName;
        int i5 = i2 + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
