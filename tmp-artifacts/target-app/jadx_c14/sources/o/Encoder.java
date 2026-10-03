package o;

import kotlin.enums.EnumEntries;
import viva.republica.toss.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Encoder {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Encoder[] $VALUES;
    public static final Encoder GLOBAL;
    public static final Encoder KR;
    private final int messageRes;
    private final int negativeRes;
    private final int positiveRes;
    private final Integer titleRes;

    private static final /* synthetic */ Encoder[] $values() {
        return new Encoder[]{KR, GLOBAL};
    }

    public static EnumEntries<Encoder> getEntries() {
        return $ENTRIES;
    }

    public static Encoder valueOf(String str) {
        return (Encoder) Enum.valueOf(Encoder.class, str);
    }

    public static Encoder[] values() {
        return (Encoder[]) $VALUES.clone();
    }

    private Encoder(String str, int i, Integer num, int i2, int i3, int i4) {
        this.titleRes = num;
        this.messageRes = i2;
        this.positiveRes = i3;
        this.negativeRes = i4;
    }

    public final Integer getTitleRes() {
        return this.titleRes;
    }

    public final int getMessageRes() {
        return this.messageRes;
    }

    public final int getPositiveRes() {
        return this.positiveRes;
    }

    public final int getNegativeRes() {
        return this.negativeRes;
    }

    static {
        int i = R.string.app_create_cert_password_dialog_title;
        KR = new Encoder("KR", 0, Integer.valueOf(i), R.string.app_create_cert_password_dialog_message, R.string.app_create_cert_password_dialog_positive, R.string.app_create_cert_password_dialog_negative);
        GLOBAL = new Encoder("GLOBAL", 1, null, R.string.global_password_ask_stop_message, R.string.global_password_ask_stop_leave, R.string.global_password_ask_stop_stay);
        Encoder[] encoderArr$values = $values();
        $VALUES = encoderArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(encoderArr$values);
    }
}
