package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final String sameSite;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4, str5);
    }

    @JvmStatic
    public static final Cookie parse(@NotNull HttpUrl httpUrl, @NotNull String str) {
        return Companion.parse(httpUrl, str);
    }

    @JvmStatic
    public static final List<Cookie> parseAll(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
        this.sameSite = str5;
    }

    public final String name() {
        return this.name;
    }

    public final String value() {
        return this.value;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public final String domain() {
        return this.domain;
    }

    public final String path() {
        return this.path;
    }

    public final boolean secure() {
        return this.secure;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final String sameSite() {
        return this.sameSite;
    }

    public final boolean matches(@NotNull HttpUrl httpUrl) {
        boolean zDomainMatch;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        if (this.hostOnly) {
            zDomainMatch = Intrinsics.areEqual(httpUrl.host(), this.domain);
        } else {
            zDomainMatch = Companion.domainMatch(httpUrl.host(), this.domain);
        }
        if (zDomainMatch && Companion.pathMatch(httpUrl, this.path)) {
            return !this.secure || httpUrl.isHttps();
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return Intrinsics.areEqual(cookie.name, this.name) && Intrinsics.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && Intrinsics.areEqual(cookie.domain, this.domain) && Intrinsics.areEqual(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly && Intrinsics.areEqual(cookie.sameSite, this.sameSite);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.value.hashCode();
        int iHashCode3 = Long.hashCode(this.expiresAt);
        int iHashCode4 = this.domain.hashCode();
        int iHashCode5 = this.path.hashCode();
        int iHashCode6 = Boolean.hashCode(this.secure);
        int iHashCode7 = Boolean.hashCode(this.httpOnly);
        int iHashCode8 = Boolean.hashCode(this.persistent);
        int iHashCode9 = Boolean.hashCode(this.hostOnly);
        String str = this.sameSite;
        return ((((((((((((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return toString$okhttp(false);
    }

    @Deprecated
    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m198deprecated_name() {
        return this.name;
    }

    @Deprecated
    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m202deprecated_value() {
        return this.value;
    }

    @Deprecated
    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m200deprecated_persistent() {
        return this.persistent;
    }

    @Deprecated
    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m195deprecated_expiresAt() {
        return this.expiresAt;
    }

    @Deprecated
    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m196deprecated_hostOnly() {
        return this.hostOnly;
    }

    @Deprecated
    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m194deprecated_domain() {
        return this.domain;
    }

    @Deprecated
    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m199deprecated_path() {
        return this.path;
    }

    @Deprecated
    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m197deprecated_httpOnly() {
        return this.httpOnly;
    }

    @Deprecated
    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m201deprecated_secure() {
        return this.secure;
    }

    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DateFormattingKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        if (this.sameSite != null) {
            sb.append("; samesite=");
            sb.append(this.sameSite);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public static final class Builder {
        private String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private String path;
        private boolean persistent;
        private String sameSite;
        private boolean secure;
        private String value;

        public Builder() {
            this.expiresAt = DateFormattingKt.MAX_DATE;
            this.path = "/";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Cookie cookie) {
            this();
            Intrinsics.checkNotNullParameter(cookie, "");
            this.name = cookie.name();
            this.value = cookie.value();
            this.expiresAt = cookie.expiresAt();
            this.domain = cookie.domain();
            this.path = cookie.path();
            this.secure = cookie.secure();
            this.httpOnly = cookie.httpOnly();
            this.persistent = cookie.persistent();
            this.hostOnly = cookie.hostOnly();
            this.sameSite = cookie.sameSite();
        }

        public final Builder name(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) str).toString(), str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.name = str;
            return this;
        }

        public final Builder value(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) str).toString(), str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.value = str;
            return this;
        }

        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > DateFormattingKt.MAX_DATE) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public final Builder domain(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return domain(str, false);
        }

        public final Builder hostOnlyDomain(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return domain(str, true);
        }

        private final Builder domain(String str, boolean z) {
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected domain: " + str);
            }
            this.domain = canonicalHost;
            this.hostOnly = z;
            return this;
        }

        public final Builder path(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!StringsKt__StringsJVMKt.startsWith$default(str, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.path = str;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder sameSite(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) str).toString(), str)) {
                throw new IllegalArgumentException("sameSite is not trimmed");
            }
            this.sameSite = str;
            return this;
        }

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, this.sameSite, null);
            }
            throw new NullPointerException("builder.domain == null");
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !_HostnamesCommonKt.canParseAsIpAddress(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String strEncodedPath = httpUrl.encodedPath();
            if (Intrinsics.areEqual(strEncodedPath, str)) {
                return true;
            }
            return StringsKt__StringsJVMKt.startsWith$default(strEncodedPath, str, false, 2, null) && (StringsKt__StringsJVMKt.endsWith$default(str, "/", false, 2, null) || strEncodedPath.charAt(str.length()) == '/');
        }

        @JvmStatic
        public final Cookie parse(@NotNull HttpUrl httpUrl, @NotNull String str) {
            Intrinsics.checkNotNullParameter(httpUrl, "");
            Intrinsics.checkNotNullParameter(str, "");
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        public final Cookie parse$okhttp(long j, @NotNull HttpUrl httpUrl, @NotNull String str) throws NumberFormatException {
            long j2;
            Cookie cookie;
            String str2;
            String str3;
            Intrinsics.checkNotNullParameter(httpUrl, "");
            Intrinsics.checkNotNullParameter(str, "");
            int iDelimiterOffset$default = _UtilCommonKt.delimiterOffset$default(str, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = _UtilCommonKt.delimiterOffset$default(str, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            String strTrimSubstring$default = _UtilCommonKt.trimSubstring$default(str, 0, iDelimiterOffset$default2, 1, null);
            if (strTrimSubstring$default.length() == 0 || _UtilCommonKt.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            String strTrimSubstring = _UtilCommonKt.trimSubstring(str, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (_UtilCommonKt.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i = iDelimiterOffset$default + 1;
            int length = str.length();
            String domain = null;
            String str4 = null;
            String str5 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long maxAge = -1;
            long expires = DateFormattingKt.MAX_DATE;
            while (i < length) {
                int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, ';', i, length);
                int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(str, '=', i, iDelimiterOffset);
                String strTrimSubstring2 = _UtilCommonKt.trimSubstring(str, i, iDelimiterOffset2);
                String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? _UtilCommonKt.trimSubstring(str, iDelimiterOffset2 + 1, iDelimiterOffset) : _UrlKt.FRAGMENT_ENCODE_SET;
                if (StringsKt__StringsJVMKt.equals(strTrimSubstring2, "expires", true)) {
                    try {
                        expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                        z3 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt__StringsJVMKt.equals(strTrimSubstring2, "max-age", true)) {
                    maxAge = parseMaxAge(strTrimSubstring3);
                    z3 = true;
                } else if (StringsKt__StringsJVMKt.equals(strTrimSubstring2, "domain", true)) {
                    domain = parseDomain(strTrimSubstring3);
                    z4 = false;
                } else if (StringsKt__StringsJVMKt.equals(strTrimSubstring2, "path", true)) {
                    str5 = strTrimSubstring3;
                } else if (StringsKt__StringsJVMKt.equals(strTrimSubstring2, "secure", true)) {
                    z = true;
                } else if (StringsKt__StringsJVMKt.equals(strTrimSubstring2, "httponly", true)) {
                    z2 = true;
                } else if (StringsKt__StringsJVMKt.equals(strTrimSubstring2, "samesite", true)) {
                    str4 = strTrimSubstring3;
                }
                i = iDelimiterOffset + 1;
            }
            long j3 = Long.MIN_VALUE;
            if (maxAge != Long.MIN_VALUE) {
                if (maxAge != -1) {
                    expires = j + (maxAge <= 9223372036854775L ? maxAge * 1000 : LongCompanionObject.MAX_VALUE);
                    if (expires >= j) {
                        j3 = DateFormattingKt.MAX_DATE;
                        if (expires > DateFormattingKt.MAX_DATE) {
                        }
                    } else {
                        j3 = DateFormattingKt.MAX_DATE;
                    }
                    j2 = j3;
                }
                j2 = expires;
            } else {
                j2 = j3;
            }
            String strHost = httpUrl.host();
            if (domain == null) {
                str2 = strHost;
                cookie = null;
            } else {
                if (!domainMatch(strHost, domain)) {
                    return null;
                }
                cookie = null;
                str2 = domain;
            }
            if (strHost.length() != str2.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(str2) == null) {
                return cookie;
            }
            String strSubstring = "/";
            String str6 = str5;
            if (str6 == null || !StringsKt__StringsJVMKt.startsWith$default(str6, "/", false, 2, cookie)) {
                String strEncodedPath = httpUrl.encodedPath();
                int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) strEncodedPath, '/', 0, false, 6, (Object) null);
                if (iLastIndexOf$default != 0) {
                    strSubstring = strEncodedPath.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                }
                str3 = strSubstring;
            } else {
                str3 = str6;
            }
            return new Cookie(strTrimSubstring$default, strTrimSubstring, j2, str2, str3, z, z2, z3, z4, str4, null);
        }

        private final long parseExpires(String str, int i, int i2) throws NumberFormatException {
            int iDateCharacterOffset = dateCharacterOffset(str, i, i2, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int iIndexOf$default = -1;
            int i6 = -1;
            int i7 = -1;
            while (iDateCharacterOffset < i2) {
                int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i2, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i4 != -1 || !matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    if (i5 != -1 || !matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                        if (iIndexOf$default != -1 || !matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                            if (i3 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                                String strGroup = matcher.group(1);
                                Intrinsics.checkNotNullExpressionValue(strGroup, "");
                                i3 = Integer.parseInt(strGroup);
                            }
                        } else {
                            String strGroup2 = matcher.group(1);
                            Intrinsics.checkNotNullExpressionValue(strGroup2, "");
                            Locale locale = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(locale, "");
                            String lowerCase = strGroup2.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            String strPattern = Cookie.MONTH_PATTERN.pattern();
                            Intrinsics.checkNotNullExpressionValue(strPattern, "");
                            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                        }
                    } else {
                        String strGroup3 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(strGroup3, "");
                        i5 = Integer.parseInt(strGroup3);
                    }
                } else {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "");
                    i4 = Integer.parseInt(strGroup4);
                    String strGroup5 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "");
                    i6 = Integer.parseInt(strGroup5);
                    String strGroup6 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "");
                    i7 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i2, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (i3 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i5 <= 0 || i5 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i4 < 0 || i4 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i6 < 0 || i6 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i7 < 0 || i7 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final int dateCharacterOffset(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        private final long parseMaxAge(String str) throws NumberFormatException {
            try {
                long j = Long.parseLong(str);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (NumberFormatException e) {
                if (new Regex("-?\\d+").onExtraCallbackWithResult(str)) {
                    if (StringsKt__StringsJVMKt.startsWith$default(str, "-", false, 2, null)) {
                        return Long.MIN_VALUE;
                    }
                    return LongCompanionObject.MAX_VALUE;
                }
                throw e;
            }
        }

        private final String parseDomain(String str) {
            if (StringsKt__StringsJVMKt.endsWith$default(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(StringsKt__StringsKt.removePrefix(str, (CharSequence) "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        @JvmStatic
        public final List<Cookie> parseAll(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
            Intrinsics.checkNotNullParameter(httpUrl, "");
            Intrinsics.checkNotNullParameter(headers, "");
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            List<Cookie> listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie cookie = parse(httpUrl, listValues.get(i));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
            }
            return listUnmodifiableList == null ? CollectionsKt__CollectionsKt.emptyList() : listUnmodifiableList;
        }
    }
}
