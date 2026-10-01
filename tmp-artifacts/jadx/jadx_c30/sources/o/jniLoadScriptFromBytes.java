package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jniLoadScriptFromBytes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jniLoadScriptFromBytes[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("HOUSEHOLD_REGISTER")
    public static final jniLoadScriptFromBytes HOUSEHOLD_REGISTER = new jniLoadScriptFromBytes("HOUSEHOLD_REGISTER", 0);

    @SerializedName("CERTIFICATE_OF_FAMILY_RELATIONS")
    public static final jniLoadScriptFromBytes CERTIFICATE_OF_FAMILY_RELATIONS = new jniLoadScriptFromBytes("CERTIFICATE_OF_FAMILY_RELATIONS", 1);

    @SerializedName("SIGN_IN")
    public static final jniLoadScriptFromBytes SIGN_IN = new jniLoadScriptFromBytes("SIGN_IN", 2);

    @SerializedName("INVALID_PASSWORD_SIGN_IN")
    public static final jniLoadScriptFromBytes INVALID_PASSWORD_SIGN_IN = new jniLoadScriptFromBytes("INVALID_PASSWORD_SIGN_IN", 3);

    @SerializedName("RECEIPT_OF_CERTIFICATE")
    public static final jniLoadScriptFromBytes RECEIPT_OF_CERTIFICATE = new jniLoadScriptFromBytes("RECEIPT_OF_CERTIFICATE", 4);

    private static final /* synthetic */ jniLoadScriptFromBytes[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        jniLoadScriptFromBytes[] jniloadscriptfrombytesArr = {HOUSEHOLD_REGISTER, CERTIFICATE_OF_FAMILY_RELATIONS, SIGN_IN, INVALID_PASSWORD_SIGN_IN, RECEIPT_OF_CERTIFICATE};
        int i5 = i2 + 19;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return jniloadscriptfrombytesArr;
        }
        throw null;
    }

    public static EnumEntries<jniLoadScriptFromBytes> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<jniLoadScriptFromBytes> enumEntries = $ENTRIES;
        int i5 = i2 + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static jniLoadScriptFromBytes valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        jniLoadScriptFromBytes jniloadscriptfrombytes = (jniLoadScriptFromBytes) Enum.valueOf(jniLoadScriptFromBytes.class, str);
        int i4 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jniloadscriptfrombytes;
    }

    public static jniLoadScriptFromBytes[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        jniLoadScriptFromBytes[] jniloadscriptfrombytesArr = (jniLoadScriptFromBytes[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return jniloadscriptfrombytesArr;
        }
        obj.hashCode();
        throw null;
    }

    private jniLoadScriptFromBytes(String str, int i) {
    }

    static {
        jniLoadScriptFromBytes[] jniloadscriptfrombytesArr$values = $values();
        $VALUES = jniloadscriptfrombytesArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(jniloadscriptfrombytesArr$values);
        int i = onWarmupCompleted + 1;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
    }
}
