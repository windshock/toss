package o;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Bugsnag {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    public static final Bugsnag onNavigationEvent = new Bugsnag();
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 47;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private Bugsnag() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c A[PHI: r12
      0x005c: PHI (r12v5 java.lang.String) = (r12v1 java.lang.String), (r12v6 java.lang.String) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[PHI: r1 r12
      0x0040: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v6 java.lang.String) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BreadcrumbType onNavigationEvent(@NotNull String str) {
        String strSubstringBefore$default;
        int iIndexOf$default;
        String strSubstring;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (i3 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(str, 'G', (String) null, 3, (Object) null);
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstringBefore$default, 'H', 0, false, 11, (Object) null);
            if (iIndexOf$default >= 0) {
                strSubstring = strSubstringBefore$default.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String strSubstring2 = strSubstringBefore$default.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                int i4 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                str2 = strSubstring2;
            } else {
                int i6 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                strSubstring = strSubstringBefore$default;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(str, '#', (String) null, 2, (Object) null);
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstringBefore$default, '?', 0, false, 6, (Object) null);
            if (iIndexOf$default >= 0) {
            }
        }
        return new BreadcrumbType(onExtraCallbackWithResult(strSubstring), onExtraCallback(str2));
    }

    private final String onExtraCallbackWithResult(String str) {
        int length;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, "://", 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            int i4 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
        Integer numValueOf = Integer.valueOf(StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', iIndexOf$default + 3, false, 4, (Object) null));
        if (numValueOf.intValue() < 0) {
            int i6 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i7 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            length = numValueOf.intValue();
        } else {
            length = str.length();
        }
        String strSubstring = str.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring2 = str.substring(length);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return lowerCase + strSubstring2;
    }

    private final Map<String, String> onExtraCallback(String str) throws UnsupportedEncodingException {
        String strIAuthTabCallback;
        int i = 2 % 2;
        if (str.length() == 0) {
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return access8000.IAuthTabCallback();
            }
            access8000.IAuthTabCallback();
            throw null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'&'}, false, 0, 6, (Object) null)) {
            if (str2.length() != 0) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, '=', 0, false, 6, (Object) null);
                String strIAuthTabCallback2 = _UrlKt.FRAGMENT_ENCODE_SET;
                if (iIndexOf$default >= 0) {
                    int i3 = onWarmupCompleted + 1;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    String strSubstring = str2.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    strIAuthTabCallback = IAuthTabCallback(strSubstring);
                    String strSubstring2 = str2.substring(iIndexOf$default + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    strIAuthTabCallback2 = IAuthTabCallback(strSubstring2);
                } else {
                    strIAuthTabCallback = IAuthTabCallback(str2);
                }
                linkedHashMap.put(strIAuthTabCallback, strIAuthTabCallback2);
            }
        }
        return linkedHashMap;
    }

    private final String IAuthTabCallback(String str) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNull(URLDecoder.decode(str, "UTF-8"));
                throw null;
            }
            String strDecode = URLDecoder.decode(str, "UTF-8");
            Intrinsics.checkNotNull(strDecode);
            int i3 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return strDecode;
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }
}
