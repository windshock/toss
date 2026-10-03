package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdSDKNotificationListener {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdSDKNotificationListener[] $VALUES;
    public static final AdSDKNotificationListener Internal = new AdSDKNotificationListener("Internal", 0);
    public static final AdSDKNotificationListener External = new AdSDKNotificationListener("External", 1);

    private static final /* synthetic */ AdSDKNotificationListener[] $values() {
        return new AdSDKNotificationListener[]{Internal, External};
    }

    public static EnumEntries<AdSDKNotificationListener> getEntries() {
        return $ENTRIES;
    }

    public static AdSDKNotificationListener valueOf(String str) {
        return (AdSDKNotificationListener) Enum.valueOf(AdSDKNotificationListener.class, str);
    }

    public static AdSDKNotificationListener[] values() {
        return (AdSDKNotificationListener[]) $VALUES.clone();
    }

    private AdSDKNotificationListener(String str, int i) {
    }

    static {
        AdSDKNotificationListener[] adSDKNotificationListenerArr$values = $values();
        $VALUES = adSDKNotificationListenerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(adSDKNotificationListenerArr$values);
    }
}
