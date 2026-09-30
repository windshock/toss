package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PglCryptUtils {
    private static final String[] IAuthTabCallback;
    private static final byte[] onWarmupCompleted;

    private static final char onExtraCallbackWithResult(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }

    public static final String[] onNavigationEvent() {
        return IAuthTabCallback;
    }

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + onExtraCallbackWithResult(i >> 12) + onExtraCallbackWithResult(i >> 8) + onExtraCallbackWithResult(i >> 4) + onExtraCallbackWithResult(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        IAuthTabCallback = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        onWarmupCompleted = bArr;
    }

    public static final byte[] onExtraCallback() {
        return onWarmupCompleted;
    }

    public static final void onNavigationEvent(@NotNull StringBuilder sb, @NotNull String str) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(str, "");
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            String[] strArr = IAuthTabCallback;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) str, i, i2);
                sb.append(strArr[cCharAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final Boolean IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsJVMKt.equals(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (StringsKt__StringsJVMKt.equals(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }
}
