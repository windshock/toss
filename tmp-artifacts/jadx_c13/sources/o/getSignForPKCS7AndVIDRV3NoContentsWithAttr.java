package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignForPKCS7AndVIDRV3NoContentsWithAttr {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getSignForPKCS7AndVIDRV3NoContentsWithAttr[] $VALUES;
    public static final getSignForPKCS7AndVIDRV3NoContentsWithAttr CONTAIN = new getSignForPKCS7AndVIDRV3NoContentsWithAttr("CONTAIN", 0);
    public static final getSignForPKCS7AndVIDRV3NoContentsWithAttr COVER = new getSignForPKCS7AndVIDRV3NoContentsWithAttr("COVER", 1);
    public static final getSignForPKCS7AndVIDRV3NoContentsWithAttr STRETCH = new getSignForPKCS7AndVIDRV3NoContentsWithAttr("STRETCH", 2);
    public static final getSignForPKCS7AndVIDRV3NoContentsWithAttr NONE = new getSignForPKCS7AndVIDRV3NoContentsWithAttr("NONE", 3);

    private static final /* synthetic */ getSignForPKCS7AndVIDRV3NoContentsWithAttr[] $values() {
        return new getSignForPKCS7AndVIDRV3NoContentsWithAttr[]{CONTAIN, COVER, STRETCH, NONE};
    }

    public static EnumEntries<getSignForPKCS7AndVIDRV3NoContentsWithAttr> getEntries() {
        return $ENTRIES;
    }

    public static getSignForPKCS7AndVIDRV3NoContentsWithAttr valueOf(String str) {
        return (getSignForPKCS7AndVIDRV3NoContentsWithAttr) Enum.valueOf(getSignForPKCS7AndVIDRV3NoContentsWithAttr.class, str);
    }

    public static getSignForPKCS7AndVIDRV3NoContentsWithAttr[] values() {
        return (getSignForPKCS7AndVIDRV3NoContentsWithAttr[]) $VALUES.clone();
    }

    private getSignForPKCS7AndVIDRV3NoContentsWithAttr(String str, int i) {
    }

    static {
        getSignForPKCS7AndVIDRV3NoContentsWithAttr[] getsignforpkcs7andvidrv3nocontentswithattrArr$values = $values();
        $VALUES = getsignforpkcs7andvidrv3nocontentswithattrArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getsignforpkcs7andvidrv3nocontentswithattrArr$values);
    }
}
