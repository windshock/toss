package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AdSettingsApi {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdSettingsApi[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private String status;

    @SerializedName("Y")
    public static final AdSettingsApi COMPLETE = new AdSettingsApi("COMPLETE", 0, "Y");

    @SerializedName("W")
    public static final AdSettingsApi WAITING = new AdSettingsApi("WAITING", 1, "W");
    public static final AdSettingsApi UNDEFINED = new AdSettingsApi(getUniqueNativeAdCount.UNDEFINED, 2, "U");

    private static final /* synthetic */ AdSettingsApi[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AdSettingsApi adSettingsApi = COMPLETE;
        return i3 == 0 ? new AdSettingsApi[]{WAITING, adSettingsApi, UNDEFINED} : new AdSettingsApi[]{adSettingsApi, WAITING, UNDEFINED};
    }

    public static EnumEntries<AdSettingsApi> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<AdSettingsApi> enumEntries = $ENTRIES;
        int i5 = i3 + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static AdSettingsApi valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AdSettingsApi adSettingsApi = (AdSettingsApi) Enum.valueOf(AdSettingsApi.class, str);
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return adSettingsApi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AdSettingsApi[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AdSettingsApi[] adSettingsApiArr = (AdSettingsApi[]) $VALUES.clone();
        int i4 = onNavigationEvent + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return adSettingsApiArr;
    }

    private AdSettingsApi(String str, int i, String str2) {
        this.status = str2;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 69;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setStatus(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            this.status = str;
            int i3 = 88 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            this.status = str;
        }
        int i4 = onNavigationEvent + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AdSettingsApi[] adSettingsApiArr$values = $values();
        $VALUES = adSettingsApiArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(adSettingsApiArr$values);
        Companion = new onExtraCallbackWithResult(null);
        int i = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
