package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNativeAdViewTypeApi {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getNativeAdViewTypeApi[] $VALUES;

    @SerializedName("AVAILABLE")
    public static final getNativeAdViewTypeApi AVAILABLE = new getNativeAdViewTypeApi("AVAILABLE", 0);

    @SerializedName("BNPL_DELINQUENT_ACCOUNT")
    public static final getNativeAdViewTypeApi BNPL_DELINQUENT_ACCOUNT = new getNativeAdViewTypeApi("BNPL_DELINQUENT_ACCOUNT", 1);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ getNativeAdViewTypeApi[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getNativeAdViewTypeApi[] getnativeadviewtypeapiArr = {AVAILABLE, BNPL_DELINQUENT_ACCOUNT};
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getnativeadviewtypeapiArr;
    }

    public static EnumEntries<getNativeAdViewTypeApi> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<getNativeAdViewTypeApi> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return enumEntries;
    }

    public static getNativeAdViewTypeApi valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getNativeAdViewTypeApi getnativeadviewtypeapi = (getNativeAdViewTypeApi) Enum.valueOf(getNativeAdViewTypeApi.class, str);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return getnativeadviewtypeapi;
    }

    public static getNativeAdViewTypeApi[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getNativeAdViewTypeApi[] getnativeadviewtypeapiArr = (getNativeAdViewTypeApi[]) $VALUES.clone();
        int i3 = onExtraCallback + 29;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return getnativeadviewtypeapiArr;
        }
        obj.hashCode();
        throw null;
    }

    private getNativeAdViewTypeApi(String str, int i) {
    }

    static {
        getNativeAdViewTypeApi[] getnativeadviewtypeapiArr$values = $values();
        $VALUES = getnativeadviewtypeapiArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getnativeadviewtypeapiArr$values);
        int i = onWarmupCompleted + 19;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
