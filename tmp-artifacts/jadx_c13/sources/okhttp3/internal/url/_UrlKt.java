package okhttp3.internal.url;

import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.TTBaseActivity;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class _UrlKt {
    public static final String FORM_ENCODE_SET = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    public static final char[] getHEX_DIGITS() {
        return HEX_DIGITS;
    }

    public static final void writeCanonicalized(@NotNull TTBaseActivity tTBaseActivity, @NotNull String str, int i, int i2, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iCharCount = i;
        TTBaseActivity tTBaseActivity2 = null;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (z && (iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13)) {
                Unit unit = Unit.INSTANCE;
            } else {
                String str3 = "+";
                if (iCodePointAt == 32 && str2 == FORM_ENCODE_SET) {
                    tTBaseActivity.onExtraCallback("+");
                } else if (iCodePointAt == 43 && z3) {
                    if (!z) {
                        str3 = "%2B";
                    }
                    tTBaseActivity.onExtraCallback(str3);
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt__StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null) || (iCodePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, iCharCount, i2)))))) {
                    if (tTBaseActivity2 == null) {
                        tTBaseActivity2 = new TTBaseActivity();
                    }
                    if (charset == null || Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                        tTBaseActivity2.access100(iCodePointAt);
                    } else {
                        tTBaseActivity2.onWarmupCompleted(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                    }
                    while (!tTBaseActivity2.IAuthTabCallback_Parcel()) {
                        byte bICustomTabsCallback = tTBaseActivity2.ICustomTabsCallback();
                        tTBaseActivity.onExtraCallbackWithResult(37);
                        char[] cArr = HEX_DIGITS;
                        tTBaseActivity.onExtraCallbackWithResult((int) cArr[((bICustomTabsCallback & 255) >> 4) & 15]);
                        tTBaseActivity.onExtraCallbackWithResult((int) cArr[bICustomTabsCallback & 15]);
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    tTBaseActivity.access100(iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public static /* synthetic */ String canonicalizeWithCharset$default(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
        return canonicalizeWithCharset(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
    }

    public static final String canonicalizeWithCharset(@NotNull String str, int i, int i2, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt__StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null) || ((iCodePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                TTBaseActivity tTBaseActivity = new TTBaseActivity();
                tTBaseActivity.onNavigationEvent(str, i, iCharCount);
                writeCanonicalized(tTBaseActivity, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return tTBaseActivity.onRelationshipValidationResult();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static final void writePercentDecoded(@NotNull TTBaseActivity tTBaseActivity, @NotNull String str, int i, int i2, boolean z) {
        int i3;
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int hexDigit = _UtilCommonKt.parseHexDigit(str.charAt(i + 1));
                int hexDigit2 = _UtilCommonKt.parseHexDigit(str.charAt(i3));
                if (hexDigit != -1 && hexDigit2 != -1) {
                    tTBaseActivity.onExtraCallbackWithResult((hexDigit << 4) + hexDigit2);
                    i = Character.charCount(iCodePointAt) + i3;
                } else {
                    tTBaseActivity.access100(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z) {
                tTBaseActivity.onExtraCallbackWithResult(32);
                i++;
            } else {
                tTBaseActivity.access100(iCodePointAt);
                i += Character.charCount(iCodePointAt);
            }
        }
    }

    public static final String canonicalize(@NotNull String str, int i, int i2, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return canonicalizeWithCharset$default(str, i, i2, str2, z, z2, z3, z4, null, 128, null);
    }

    public static /* synthetic */ String percentDecode$default(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return percentDecode(str, i, i2, z);
    }

    public static final String percentDecode(@NotNull String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                TTBaseActivity tTBaseActivity = new TTBaseActivity();
                tTBaseActivity.onNavigationEvent(str, i, i3);
                writePercentDecoded(tTBaseActivity, str, i3, i2, z);
                return tTBaseActivity.onRelationshipValidationResult();
            }
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static final boolean isPercentEncoded(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && _UtilCommonKt.parseHexDigit(str.charAt(i + 1)) != -1 && _UtilCommonKt.parseHexDigit(str.charAt(i3)) != -1;
    }
}
