package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import o.internalGetMutableThreads;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    private static final int nativeIndexOf(String str, char c, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.indexOf(c, i);
    }

    private static final int nativeIndexOf(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str.indexOf(str2, i);
    }

    private static final int nativeLastIndexOf(String str, char c, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.lastIndexOf(c, i);
    }

    private static final int nativeLastIndexOf(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str.lastIndexOf(str2, i);
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return equals(str, str2, z);
    }

    public static boolean equals(@Nullable String str, @Nullable String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ String replace$default(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replace(str, c, c2, z);
    }

    public static final String replace(@NotNull String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            String strReplace = str.replace(c, c2);
            Intrinsics.checkNotNullExpressionValue(strReplace, "");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (internalGetMutableThreads.onNavigationEvent(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replace(str, str2, str3, z);
    }

    public static String replace(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i = 0;
        int iIndexOf = StringsKt__StringsKt.indexOf(str, str2, 0, z);
        if (iIndexOf < 0) {
            return str;
        }
        int length = str2.length();
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iIndexOf);
            sb.append(str3);
            i = iIndexOf + length;
            if (iIndexOf >= str.length()) {
                break;
            }
            iIndexOf = StringsKt__StringsKt.indexOf(str, str2, iIndexOf + iCoerceAtLeast, z);
        } while (iIndexOf > 0);
        sb.append((CharSequence) str, i, str.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replaceFirst(str, c, c2, z);
    }

    public static final String replaceFirst(@NotNull String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, c, 0, z, 2, (Object) null);
        return iIndexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange((CharSequence) str, iIndexOf$default, iIndexOf$default + 1, (CharSequence) String.valueOf(c2)).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replaceFirst(str, str2, str3, z);
    }

    public static final String replaceFirst(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, str2, 0, z, 2, (Object) null);
        return iIndexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange((CharSequence) str, iIndexOf$default, str2.length() + iIndexOf$default, (CharSequence) str3).toString();
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final String toUpperCase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    private static final String uppercase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final String toLowerCase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private static final String lowercase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static String concatToString(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return new String(cArr);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return concatToString(cArr, i, i2);
    }

    public static String concatToString(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        AbstractList.Companion.onWarmupCompleted(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return toCharArray(str, i, i2);
    }

    public static final char[] toCharArray(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractList.Companion.onWarmupCompleted(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    public static String decodeToString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new String(bArr, Charsets.UTF_8);
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return decodeToString(bArr, i, i2, z);
    }

    public static final String decodeToString(@NotNull byte[] bArr, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "");
        AbstractList.Companion.onWarmupCompleted(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, Charsets.UTF_8);
        }
        CharsetDecoder charsetDecoderNewDecoder = Charsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static byte[] encodeToByteArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return encodeToByteArray(str, i, i2, z);
    }

    public static final byte[] encodeToByteArray(@NotNull String str, int i, int i2, boolean z) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractList.Companion.onWarmupCompleted(i, i2, str.length());
        if (!z) {
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Charset charset = Charsets.UTF_8;
            Intrinsics.checkNotNull(strSubstring, "");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i, i2));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            Intrinsics.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                Intrinsics.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    private static final char[] toCharArray(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        return charArray;
    }

    static /* synthetic */ char[] toCharArray$default(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    private static final char[] toCharArray(String str, char[] cArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    private static final String format(String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String str2 = String.format(str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    private static final String format(StringCompanionObject stringCompanionObject, String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String str2 = String.format(str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    private static final String format(String str, Locale locale, Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String str2 = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    private static final String format(StringCompanionObject stringCompanionObject, Locale locale, String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String str2 = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return split(charSequence, pattern, i);
    }

    public static final List<String> split(@NotNull CharSequence charSequence, @NotNull Pattern pattern, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(pattern, "");
        StringsKt__StringsKt.requireNonNegativeLimit(i);
        if (i == 0) {
            i = -1;
        }
        String[] strArrSplit = pattern.split(charSequence, i);
        Intrinsics.checkNotNullExpressionValue(strArrSplit, "");
        return ArraysKt___ArraysJvmKt.asList(strArrSplit);
    }

    private static final String substring(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        String strSubstring = str.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    private static final String substring(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(str, str2, z);
    }

    public static boolean startsWith(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return regionMatches(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return startsWith(str, str2, i, z);
    }

    public static boolean startsWith(@NotNull String str, @NotNull String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return regionMatches(str, i, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(str, str2, z);
    }

    public static boolean endsWith(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.endsWith(str2);
        }
        return regionMatches(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    private static final String String(byte[] bArr, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new String(bArr, i, i2, charset);
    }

    private static final String String(byte[] bArr, Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new String(bArr, charset);
    }

    private static final String String(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new String(bArr, i, i2, Charsets.UTF_8);
    }

    private static final String String(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new String(bArr, Charsets.UTF_8);
    }

    private static final String String(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return new String(cArr);
    }

    private static final String String(char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return new String(cArr, i, i2);
    }

    private static final String String(int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return new String(iArr, i, i2);
    }

    private static final String String(StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(stringBuffer, "");
        return new String(stringBuffer);
    }

    private static final String String(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "");
        return new String(sb);
    }

    private static final int codePointAt(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.codePointAt(i);
    }

    private static final int codePointBefore(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.codePointBefore(i);
    }

    private static final int codePointCount(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.codePointCount(i, i2);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return compareTo(str, str2, z);
    }

    public static final int compareTo(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    private static final boolean contentEquals(String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        return str.contentEquals(charSequence);
    }

    private static final boolean contentEquals(String str, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stringBuffer, "");
        return str.contentEquals(stringBuffer);
    }

    public static boolean contentEquals(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return StringsKt__StringsKt.contentEqualsImpl(charSequence, charSequence2);
    }

    public static boolean contentEquals(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z) {
        if (z) {
            return StringsKt__StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return contentEquals(charSequence, charSequence2);
    }

    private static final String intern(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strIntern = str.intern();
        Intrinsics.checkNotNullExpressionValue(strIntern, "");
        return strIntern;
    }

    private static final int offsetByCodePoints(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.offsetByCodePoints(i, i2);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return regionMatches(charSequence, i, charSequence2, i2, i3, z);
    }

    public static final boolean regionMatches(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return regionMatches((String) charSequence, i, (String) charSequence2, i2, i3, z);
        }
        return StringsKt__StringsKt.regionMatchesImpl(charSequence, i, charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean regionMatches$default(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return regionMatches(str, i, str2, i2, i3, z);
    }

    public static boolean regionMatches(@NotNull String str, int i, @NotNull String str2, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final String toLowerCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private static final String lowercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final String toUpperCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    private static final String uppercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    private static final byte[] toByteArray(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    static /* synthetic */ Pattern toPattern$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Pattern patternCompile = Pattern.compile(str, i);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        return patternCompile;
    }

    private static final Pattern toPattern(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Pattern patternCompile = Pattern.compile(str, i);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        return patternCompile;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final String capitalize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return capitalize(str, locale);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final String capitalize(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Intrinsics.checkNotNull(strSubstring, "");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            sb.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final String decapitalize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Intrinsics.checkNotNull(strSubstring, "");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final String decapitalize(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        Intrinsics.checkNotNull(strSubstring, "");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public static String repeat(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i);
        if (i > 0) {
            while (true) {
                sb.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static Comparator<String> getCASE_INSENSITIVE_ORDER(@NotNull StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(comparator, "");
        return comparator;
    }
}
