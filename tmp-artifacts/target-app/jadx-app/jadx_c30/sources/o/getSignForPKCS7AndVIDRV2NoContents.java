package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getSignForPKCS7AndVIDRV2NoContents {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getSignForPKCS7AndVIDRV2NoContents[] $VALUES;
    public static final getSignForPKCS7AndVIDRV2NoContents NONE = new getSignForPKCS7AndVIDRV2NoContents("NONE", 0);
    public static final getSignForPKCS7AndVIDRV2NoContents WIDEVINE = new getSignForPKCS7AndVIDRV2NoContents("WIDEVINE", 1);
    public static final getSignForPKCS7AndVIDRV2NoContents PLAYREADY = new getSignForPKCS7AndVIDRV2NoContents("PLAYREADY", 2);
    public static final getSignForPKCS7AndVIDRV2NoContents CLEARKEY = new getSignForPKCS7AndVIDRV2NoContents("CLEARKEY", 3);

    private static final /* synthetic */ getSignForPKCS7AndVIDRV2NoContents[] $values() {
        return new getSignForPKCS7AndVIDRV2NoContents[]{NONE, WIDEVINE, PLAYREADY, CLEARKEY};
    }

    public static EnumEntries<getSignForPKCS7AndVIDRV2NoContents> getEntries() {
        return $ENTRIES;
    }

    public static getSignForPKCS7AndVIDRV2NoContents valueOf(String str) {
        return (getSignForPKCS7AndVIDRV2NoContents) Enum.valueOf(getSignForPKCS7AndVIDRV2NoContents.class, str);
    }

    public static getSignForPKCS7AndVIDRV2NoContents[] values() {
        return (getSignForPKCS7AndVIDRV2NoContents[]) $VALUES.clone();
    }

    private getSignForPKCS7AndVIDRV2NoContents(String str, int i) {
    }

    static {
        getSignForPKCS7AndVIDRV2NoContents[] getsignforpkcs7andvidrv2nocontentsArr$values = $values();
        $VALUES = getsignforpkcs7andvidrv2nocontentsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getsignforpkcs7andvidrv2nocontentsArr$values);
    }
}
