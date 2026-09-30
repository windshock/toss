package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AudienceNetworkRemoteServiceApi {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudienceNetworkRemoteServiceApi[] $VALUES;
    public static final AudienceNetworkRemoteServiceApi INQUIRY = new AudienceNetworkRemoteServiceApi("INQUIRY", 0);
    public static final AudienceNetworkRemoteServiceApi PAYMENT = new AudienceNetworkRemoteServiceApi("PAYMENT", 1);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ AudienceNetworkRemoteServiceApi[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        AudienceNetworkRemoteServiceApi[] audienceNetworkRemoteServiceApiArr = {INQUIRY, PAYMENT};
        int i5 = i2 + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return audienceNetworkRemoteServiceApiArr;
    }

    public static EnumEntries<AudienceNetworkRemoteServiceApi> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<AudienceNetworkRemoteServiceApi> enumEntries = $ENTRIES;
        int i4 = i2 + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static AudienceNetworkRemoteServiceApi valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AudienceNetworkRemoteServiceApi audienceNetworkRemoteServiceApi = (AudienceNetworkRemoteServiceApi) Enum.valueOf(AudienceNetworkRemoteServiceApi.class, str);
        int i4 = onWarmupCompleted + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return audienceNetworkRemoteServiceApi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AudienceNetworkRemoteServiceApi[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AudienceNetworkRemoteServiceApi[] audienceNetworkRemoteServiceApiArr = $VALUES;
        if (i3 == 0) {
            return (AudienceNetworkRemoteServiceApi[]) audienceNetworkRemoteServiceApiArr.clone();
        }
        throw null;
    }

    private AudienceNetworkRemoteServiceApi(String str, int i) {
    }

    static {
        AudienceNetworkRemoteServiceApi[] audienceNetworkRemoteServiceApiArr$values = $values();
        $VALUES = audienceNetworkRemoteServiceApiArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(audienceNetworkRemoteServiceApiArr$values);
        int i = onExtraCallbackWithResult + 29;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
