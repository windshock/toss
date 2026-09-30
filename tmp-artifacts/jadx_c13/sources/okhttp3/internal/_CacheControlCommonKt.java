package okhttp3.internal;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.setCommandLine;
import o.setLogBuffers;
import o.setRevision;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class _CacheControlCommonKt {
    public static final int commonClampToInt(long j) {
        return j > 2147483647L ? IntCompanionObject.MAX_VALUE : (int) j;
    }

    public static final String commonToString(@NotNull CacheControl cacheControl) {
        Intrinsics.checkNotNullParameter(cacheControl, "");
        String headerValue$okhttp = cacheControl.getHeaderValue$okhttp();
        if (headerValue$okhttp != null) {
            return headerValue$okhttp;
        }
        StringBuilder sb = new StringBuilder();
        if (cacheControl.noCache()) {
            sb.append("no-cache, ");
        }
        if (cacheControl.noStore()) {
            sb.append("no-store, ");
        }
        if (cacheControl.maxAgeSeconds() != -1) {
            sb.append("max-age=");
            sb.append(cacheControl.maxAgeSeconds());
            sb.append(", ");
        }
        if (cacheControl.sMaxAgeSeconds() != -1) {
            sb.append("s-maxage=");
            sb.append(cacheControl.sMaxAgeSeconds());
            sb.append(", ");
        }
        if (cacheControl.isPrivate()) {
            sb.append("private, ");
        }
        if (cacheControl.isPublic()) {
            sb.append("public, ");
        }
        if (cacheControl.mustRevalidate()) {
            sb.append("must-revalidate, ");
        }
        if (cacheControl.maxStaleSeconds() != -1) {
            sb.append("max-stale=");
            sb.append(cacheControl.maxStaleSeconds());
            sb.append(", ");
        }
        if (cacheControl.minFreshSeconds() != -1) {
            sb.append("min-fresh=");
            sb.append(cacheControl.minFreshSeconds());
            sb.append(", ");
        }
        if (cacheControl.onlyIfCached()) {
            sb.append("only-if-cached, ");
        }
        if (cacheControl.noTransform()) {
            sb.append("no-transform, ");
        }
        if (cacheControl.immutable()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        Intrinsics.checkNotNullExpressionValue(sb.delete(sb.length() - 2, sb.length()), "");
        String string = sb.toString();
        cacheControl.setHeaderValue$okhttp(string);
        return string;
    }

    public static final CacheControl commonForceNetwork(@NotNull CacheControl.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "");
        return new CacheControl.Builder().noCache().build();
    }

    public static final CacheControl commonForceCache(@NotNull CacheControl.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "");
        CacheControl.Builder builderOnlyIfCached = new CacheControl.Builder().onlyIfCached();
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        return builderOnlyIfCached.m184maxStaleLRDsOJo(setCommandLine.onWarmupCompleted(IntCompanionObject.MAX_VALUE, setRevision.SECONDS)).build();
    }

    public static final CacheControl commonBuild(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        return new CacheControl(builder.getNoCache$okhttp(), builder.getNoStore$okhttp(), builder.getMaxAgeSeconds$okhttp(), -1, false, false, false, builder.getMaxStaleSeconds$okhttp(), builder.getMinFreshSeconds$okhttp(), builder.getOnlyIfCached$okhttp(), builder.getNoTransform$okhttp(), builder.getImmutable$okhttp(), null);
    }

    public static final CacheControl.Builder commonNoCache(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        builder.setNoCache$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoStore(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        builder.setNoStore$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonOnlyIfCached(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        builder.setOnlyIfCached$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoTransform(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        builder.setNoTransform$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonImmutable(@NotNull CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        builder.setImmutable$okhttp(true);
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CacheControl commonParse(@NotNull CacheControl.Companion companion, @NotNull Headers headers) throws NumberFormatException {
        int i;
        int iIndexOfElement;
        String string;
        Headers headers2 = headers;
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(headers2, "");
        int size = headers.size();
        boolean z = true;
        boolean z2 = true;
        int i2 = 0;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int nonNegativeInt = -1;
        int nonNegativeInt2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int nonNegativeInt3 = -1;
        int nonNegativeInt4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i2 < size) {
            String strName = headers2.name(i2);
            String strValue = headers2.value(i2);
            if (!StringsKt__StringsJVMKt.equals(strName, "Cache-Control", z)) {
                if (!StringsKt__StringsJVMKt.equals(strName, "Pragma", z)) {
                    i2++;
                    z = z;
                    headers2 = headers;
                }
            } else {
                if (str == null) {
                    str = strValue;
                }
                for (i = 0; i < strValue.length(); i = iIndexOfElement) {
                    int iIndexOfElement2 = indexOfElement(strValue, "=,;", i);
                    String strSubstring = strValue.substring(i, iIndexOfElement2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    String string2 = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
                    if (iIndexOfElement2 == strValue.length() || strValue.charAt(iIndexOfElement2) == ',' || strValue.charAt(iIndexOfElement2) == ';') {
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string = null;
                    } else {
                        int iIndexOfNonWhitespace = _UtilCommonKt.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                        if (iIndexOfNonWhitespace < strValue.length() && strValue.charAt(iIndexOfNonWhitespace) == '\"') {
                            int i3 = iIndexOfNonWhitespace + 1;
                            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strValue, '\"', i3, false, 4, (Object) null);
                            string = strValue.substring(i3, iIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            iIndexOfElement = iIndexOf$default + 1;
                        } else {
                            iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                            String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, iIndexOfElement);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                            string = StringsKt__StringsKt.trim((CharSequence) strSubstring2).toString();
                        }
                    }
                    if (StringsKt__StringsJVMKt.equals("no-cache", string2, true)) {
                        z3 = true;
                    } else if (StringsKt__StringsJVMKt.equals("no-store", string2, true)) {
                        z4 = true;
                    } else {
                        if (StringsKt__StringsJVMKt.equals("max-age", string2, true)) {
                            nonNegativeInt = _UtilCommonKt.toNonNegativeInt(string, -1);
                        } else if (StringsKt__StringsJVMKt.equals("s-maxage", string2, true)) {
                            nonNegativeInt2 = _UtilCommonKt.toNonNegativeInt(string, -1);
                        } else if (StringsKt__StringsJVMKt.equals("private", string2, true)) {
                            z5 = true;
                        } else if (StringsKt__StringsJVMKt.equals("public", string2, true)) {
                            z6 = true;
                        } else if (StringsKt__StringsJVMKt.equals("must-revalidate", string2, true)) {
                            z7 = true;
                        } else if (StringsKt__StringsJVMKt.equals("max-stale", string2, true)) {
                            nonNegativeInt3 = _UtilCommonKt.toNonNegativeInt(string, IntCompanionObject.MAX_VALUE);
                        } else if (StringsKt__StringsJVMKt.equals("min-fresh", string2, true)) {
                            nonNegativeInt4 = _UtilCommonKt.toNonNegativeInt(string, -1);
                        } else if (StringsKt__StringsJVMKt.equals("only-if-cached", string2, true)) {
                            z8 = true;
                        } else if (StringsKt__StringsJVMKt.equals("no-transform", string2, true)) {
                            z9 = true;
                        } else if (StringsKt__StringsJVMKt.equals("immutable", string2, true)) {
                            z10 = true;
                        }
                        z = true;
                    }
                    z = true;
                }
                i2++;
                z = z;
                headers2 = headers;
            }
            z2 = false;
            while (i < strValue.length()) {
            }
            i2++;
            z = z;
            headers2 = headers;
        }
        return new CacheControl(z3, z4, nonNegativeInt, nonNegativeInt2, z5, z6, z7, nonNegativeInt3, nonNegativeInt4, z8, z9, z10, !z2 ? null : str);
    }

    static /* synthetic */ int indexOfElement$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOfElement(str, str2, i);
    }

    private static final int indexOfElement(String str, String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
