package viva.republica.toss.common.eventbus;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class Reason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Reason[] $VALUES;
    public static final Reason USER_ACTION = new Reason("USER_ACTION", 0);
    public static final Reason TERMS_DISAGREED = new Reason("TERMS_DISAGREED", 1);
    public static final Reason MISSING_PIECE_PUT_ERROR = new Reason("MISSING_PIECE_PUT_ERROR", 2);
    public static final Reason CERT_EXPIRED = new Reason("CERT_EXPIRED", 3);
    public static final Reason CERT_INVALID = new Reason("CERT_INVALID", 4);
    public static final Reason PERMISSION_DENIED = new Reason("PERMISSION_DENIED", 5);
    public static final Reason FAILED_MANUAL_LOGIN = new Reason("FAILED_MANUAL_LOGIN", 6);
    public static final Reason FAILED_AUTO_LOGIN = new Reason("FAILED_AUTO_LOGIN", 7);
    public static final Reason SAVE_ID_LOGIN = new Reason("SAVE_ID_LOGIN", 8);
    public static final Reason SAVE_CERT_LOGIN = new Reason("SAVE_CERT_LOGIN", 9);
    public static final Reason SCRAPING_ERROR = new Reason("SCRAPING_ERROR", 10);
    public static final Reason SCRAPING_TERMINATION = new Reason("SCRAPING_TERMINATION", 11);

    private static final /* synthetic */ Reason[] $values() {
        return new Reason[]{USER_ACTION, TERMS_DISAGREED, MISSING_PIECE_PUT_ERROR, CERT_EXPIRED, CERT_INVALID, PERMISSION_DENIED, FAILED_MANUAL_LOGIN, FAILED_AUTO_LOGIN, SAVE_ID_LOGIN, SAVE_CERT_LOGIN, SCRAPING_ERROR, SCRAPING_TERMINATION};
    }

    public static EnumEntries<Reason> getEntries() {
        return $ENTRIES;
    }

    public static Reason valueOf(String str) {
        return (Reason) Enum.valueOf(Reason.class, str);
    }

    public static Reason[] values() {
        return (Reason[]) $VALUES.clone();
    }

    private Reason(String str, int i) {
    }

    static {
        Reason[] reasonArr$values = $values();
        $VALUES = reasonArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(reasonArr$values);
    }
}
