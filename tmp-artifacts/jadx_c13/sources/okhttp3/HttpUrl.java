package okhttp3;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import o.access15800;
import o.clearNumber;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HttpUrl {
    public static final Companion Companion = new Companion(null);
    private final String fragment;
    private final String host;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    public /* synthetic */ HttpUrl(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, list, list2, str5, str6);
    }

    @JvmStatic
    public static final int defaultPort(@NotNull String str) {
        return Companion.defaultPort(str);
    }

    @JvmStatic
    public static final HttpUrl get(@NotNull String str) {
        return Companion.get(str);
    }

    @JvmStatic
    public static final HttpUrl get(@NotNull URI uri) {
        return Companion.get(uri);
    }

    @JvmStatic
    public static final HttpUrl get(@NotNull URL url) {
        return Companion.get(url);
    }

    @JvmStatic
    public static final HttpUrl parse(@NotNull String str) {
        return Companion.parse(str);
    }

    private HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
    }

    public final String scheme() {
        return this.scheme;
    }

    public final String username() {
        return this.username;
    }

    public final String password() {
        return this.password;
    }

    public final String host() {
        return this.host;
    }

    public final int port() {
        return this.port;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final String fragment() {
        return this.fragment;
    }

    public final boolean isHttps() {
        return Intrinsics.areEqual(this.scheme, "https");
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, _UrlKt.FRAGMENT_ENCODE_SET));
                Intrinsics.checkNotNull(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, _UtilCommonKt.delimiterOffset(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, ':', this.scheme.length() + 3, false, 4, (Object) null);
        String strSubstring = this.url.substring(iIndexOf$default + 1, StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final String encodedPath() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        String strSubstring = this.url.substring(iIndexOf$default, _UtilCommonKt.delimiterOffset(str, "?#", iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iDelimiterOffset) {
            int i = iIndexOf$default + 1;
            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(this.url, '/', i, iDelimiterOffset);
            String strSubstring = this.url.substring(i, iDelimiterOffset2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            arrayList.add(strSubstring);
            iIndexOf$default = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iIndexOf$default, _UtilCommonKt.delimiterOffset(str, '#', iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String queryParameter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(str, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return clearNumber.onNavigationEvent();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.queryNamesAndValues.size() / 2, 1.0f);
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                String str = this.queryNamesAndValues.get(first);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "");
        return setUnmodifiableSet;
    }

    public final List<String> queryParameterValues(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.queryNamesAndValues == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(4);
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(str, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
        return listUnmodifiableList;
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i << 1);
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get((i << 1) + 1);
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder.username(_UrlKt.FRAGMENT_ENCODE_SET).password(_UrlKt.FRAGMENT_ENCODE_SET).build().toString();
    }

    public final HttpUrl resolve(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Builder builderNewBuilder = newBuilder(str);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final Builder newBuilder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) obj).url, this.url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (_HostnamesCommonKt.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    @Deprecated
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m233deprecated_url() {
        return url();
    }

    @Deprecated
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m232deprecated_uri() {
        return uri();
    }

    @Deprecated
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m231deprecated_scheme() {
        return this.scheme;
    }

    @Deprecated
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m221deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Deprecated
    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m234deprecated_username() {
        return this.username;
    }

    @Deprecated
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m217deprecated_encodedPassword() {
        return encodedPassword();
    }

    @Deprecated
    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m224deprecated_password() {
        return this.password;
    }

    @Deprecated
    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m223deprecated_host() {
        return this.host;
    }

    @Deprecated
    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m227deprecated_port() {
        return this.port;
    }

    @Deprecated
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m226deprecated_pathSize() {
        return pathSize();
    }

    @Deprecated
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m218deprecated_encodedPath() {
        return encodedPath();
    }

    @Deprecated
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m219deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Deprecated
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m225deprecated_pathSegments() {
        return this.pathSegments;
    }

    @Deprecated
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m220deprecated_encodedQuery() {
        return encodedQuery();
    }

    @Deprecated
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m228deprecated_query() {
        return query();
    }

    @Deprecated
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m230deprecated_querySize() {
        return querySize();
    }

    @Deprecated
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m229deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @Deprecated
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m216deprecated_encodedFragment() {
        return encodedFragment();
    }

    @Deprecated
    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m222deprecated_fragment() {
        return this.fragment;
    }

    public static final class Builder {
        private String encodedFragment;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = _UrlKt.FRAGMENT_ENCODE_SET;
        private String encodedPassword = _UrlKt.FRAGMENT_ENCODE_SET;
        private int port = -1;
        private final List<String> encodedPathSegments = CollectionsKt__CollectionsKt.mutableListOf(_UrlKt.FRAGMENT_ENCODE_SET);

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.encodedUsername = str;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.encodedPassword = str;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final Builder scheme(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt__StringsJVMKt.equals(str, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (StringsKt__StringsJVMKt.equals(str, "https", true)) {
                this.scheme = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        public final Builder username(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.encodedUsername = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (120 & 8) != 0 ? false : false, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
            return this;
        }

        public final Builder encodedUsername(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.encodedUsername = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
            return this;
        }

        public final Builder password(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.encodedPassword = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (120 & 8) != 0 ? false : false, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
            return this;
        }

        public final Builder encodedPassword(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.encodedPassword = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
            return this;
        }

        public final Builder host(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            this.host = canonicalHost;
            return this;
        }

        public final Builder port(int i) {
            if (i <= 0 || i >= 65536) {
                throw new IllegalArgumentException(("unexpected port: " + i).toString());
            }
            this.port = i;
            return this;
        }

        public final Builder addPathSegment(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return addPathSegments(str, false);
        }

        public final Builder addEncodedPathSegment(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return addPathSegments(str, true);
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "/\\", i, str.length());
                push(str, i, iDelimiterOffset, iDelimiterOffset < str.length(), z);
                i = iDelimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }

        public final Builder setPathSegment(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String strCanonicalize = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, (120 & 8) != 0 ? false : false, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
            if (isDot(strCanonicalize) || isDotDot(strCanonicalize)) {
                throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
            }
            this.encodedPathSegments.set(i, strCanonicalize);
            return this;
        }

        public final Builder setEncodedPathSegment(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String strCanonicalize = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
            this.encodedPathSegments.set(i, strCanonicalize);
            if (!isDot(strCanonicalize) && !isDotDot(strCanonicalize)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            return this;
        }

        public final Builder encodedPath(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!StringsKt__StringsJVMKt.startsWith$default(str, "/", false, 2, null)) {
                throw new IllegalArgumentException(("unexpected encodedPath: " + str).toString());
            }
            resolvePath(str, 0, str.length());
            return this;
        }

        public final Builder query(@Nullable String str) {
            String strCanonicalize;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.QUERY_ENCODE_SET, (120 & 8) != 0 ? false : false, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false)) == null) ? null : toQueryNamesAndValues(strCanonicalize);
            return this;
        }

        public final Builder encodedQuery(@Nullable String str) {
            String strCanonicalize;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.QUERY_ENCODE_SET, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false)) == null) ? null : toQueryNamesAndValues(strCanonicalize);
            return this;
        }

        public final Builder addQueryParameter(@NotNull String str, @Nullable String str2) {
            String strCanonicalize;
            Intrinsics.checkNotNullParameter(str, "");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(_UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, (120 & 8) != 0 ? false : false, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            if (str2 != null) {
                strCanonicalize = _UrlKt.canonicalize(str2, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str2.length() : 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, (120 & 8) != 0 ? false : false, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false);
            } else {
                strCanonicalize = null;
            }
            list2.add(strCanonicalize);
            return this;
        }

        public final Builder addEncodedQueryParameter(@NotNull String str, @Nullable String str2) {
            String strCanonicalize;
            Intrinsics.checkNotNullParameter(str, "");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(_UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            if (str2 != null) {
                strCanonicalize = _UrlKt.canonicalize(str2, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str2.length() : 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false);
            } else {
                strCanonicalize = null;
            }
            list2.add(strCanonicalize);
            return this;
        }

        public final Builder setQueryParameter(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final Builder setEncodedQueryParameter(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final Builder removeAllQueryParameters(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, (120 & 8) != 0 ? false : false, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false));
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false));
            return this;
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int iOnExtraCallbackWithResult = access15800.onExtraCallbackWithResult(size, 0, -2);
            if (iOnExtraCallbackWithResult > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list2);
                if (Intrinsics.areEqual(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iOnExtraCallbackWithResult) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public final Builder fragment(@Nullable String str) {
            String strCanonicalize;
            if (str != null) {
                strCanonicalize = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.FRAGMENT_ENCODE_SET, (120 & 8) != 0 ? false : false, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : true);
            } else {
                strCanonicalize = null;
            }
            this.encodedFragment = strCanonicalize;
            return this;
        }

        public final Builder encodedFragment(@Nullable String str) {
            String strCanonicalize;
            if (str != null) {
                strCanonicalize = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str.length() : 0, _UrlKt.FRAGMENT_ENCODE_SET, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : true);
            } else {
                strCanonicalize = null;
            }
            this.encodedFragment = strCanonicalize;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String strCanonicalize;
            String str = this.host;
            String strCanonicalize2 = null;
            this.host = str != null ? new Regex("[\"<>^`{|}]").replace(str, _UrlKt.FRAGMENT_ENCODE_SET) : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                String str2 = list.get(i);
                list.set(i, _UrlKt.canonicalize(str2, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str2.length() : 0, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : true, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = list2.get(i2);
                    if (str3 != null) {
                        strCanonicalize = _UrlKt.canonicalize(str3, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str3.length() : 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : true, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false);
                    } else {
                        strCanonicalize = null;
                    }
                    list2.set(i2, strCanonicalize);
                }
            }
            String str4 = this.encodedFragment;
            if (str4 != null) {
                strCanonicalize2 = _UrlKt.canonicalize(str4, (120 & 1) != 0 ? 0 : 0, (120 & 2) != 0 ? str4.length() : 0, _UrlKt.FRAGMENT_ENCODE_SET_URI, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : true, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : true);
            }
            this.encodedFragment = strCanonicalize2;
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strPercentDecode$default = _UrlKt.percentDecode$default(this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$default2 = _UrlKt.percentDecode$default(this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(_UrlKt.percentDecode$default((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? _UrlKt.percentDecode$default(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$default, strPercentDecode$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? _UrlKt.percentDecode$default(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            Intrinsics.checkNotNull(str);
            return companion.defaultPort(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, ':', false, 2, (Object) null)) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iEffectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 != null) {
                    Companion companion = HttpUrl.Companion;
                    Intrinsics.checkNotNull(str3);
                    if (iEffectivePort != companion.defaultPort(str3)) {
                        sb.append(':');
                        sb.append(iEffectivePort);
                    }
                }
            }
            toPathString(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                Companion companion2 = HttpUrl.Companion;
                List<String> list = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list);
                companion2.toQueryString(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        private final void toPathString(List<String> list, StringBuilder sb) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final Builder parse$okhttp(@Nullable HttpUrl httpUrl, @NotNull String str) throws NumberFormatException {
            String str2;
            int iDelimiterOffset;
            int i;
            char c;
            Intrinsics.checkNotNullParameter(str, "");
            int iIndexOfFirstNonAsciiWhitespace$default = _UtilCommonKt.indexOfFirstNonAsciiWhitespace$default(str, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = _UtilCommonKt.indexOfLastNonAsciiWhitespace$default(str, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            int iSchemeDelimiterOffset = schemeDelimiterOffset(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c2 = 65535;
            if (iSchemeDelimiterOffset != -1) {
                if (StringsKt__StringsJVMKt.startsWith(str, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else if (StringsKt__StringsJVMKt.startsWith(str, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = str.substring(0, iSchemeDelimiterOffset);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                if (str.length() > 6) {
                    str2 = StringsKt___StringsKt.take(str, 6) + "...";
                } else {
                    str2 = str;
                }
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
            }
            int iSlashCount = slashCount(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c3 = '?';
            char c4 = '#';
            if (iSlashCount >= 2 || httpUrl == null || !Intrinsics.areEqual(httpUrl.scheme(), this.scheme)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                while (true) {
                    iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "@/\\?#", i2, iIndexOfLastNonAsciiWhitespace$default);
                    char cCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str.charAt(iDelimiterOffset) : c2;
                    if (cCharAt == c2 || cCharAt == c4 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c3) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (!z) {
                            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(str, ':', i2, iDelimiterOffset);
                            String strCanonicalize = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : i2, (120 & 2) != 0 ? str.length() : iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
                            if (z2) {
                                strCanonicalize = this.encodedUsername + "%40" + strCanonicalize;
                            }
                            this.encodedUsername = strCanonicalize;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                this.encodedPassword = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : iDelimiterOffset2 + 1, (120 & 2) != 0 ? str.length() : iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
                                z = true;
                            }
                            i = iDelimiterOffset;
                            z2 = true;
                        } else {
                            i = iDelimiterOffset;
                            this.encodedPassword += "%40" + _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : i2, (120 & 2) != 0 ? str.length() : i, " \"':;<=>@[]^`{}|/\\?#", (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
                        }
                        i2 = i + 1;
                        c4 = '#';
                        c3 = '?';
                        c2 = 65535;
                    }
                }
                int iPortColonOffset = portColonOffset(str, i2, iDelimiterOffset);
                int i3 = iPortColonOffset + 1;
                if (i3 < iDelimiterOffset) {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str, i2, iPortColonOffset, false, 4, null));
                    int port = parsePort(str, i3, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid URL port: \"");
                        String strSubstring2 = str.substring(i3, iDelimiterOffset);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                        sb2.append(strSubstring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                } else {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str, i2, iPortColonOffset, false, 4, null));
                    Companion companion = HttpUrl.Companion;
                    String str3 = this.scheme;
                    Intrinsics.checkNotNull(str3);
                    this.port = companion.defaultPort(str3);
                }
                if (this.host == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid URL host: \"");
                    String strSubstring3 = str.substring(i2, iPortColonOffset);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    sb3.append(strSubstring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int iDelimiterOffset3 = _UtilCommonKt.delimiterOffset(str, "?#", iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            resolvePath(str, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 >= iIndexOfLastNonAsciiWhitespace$default || str.charAt(iDelimiterOffset3) != '?') {
                c = '#';
            } else {
                c = '#';
                int iDelimiterOffset4 = _UtilCommonKt.delimiterOffset(str, '#', iDelimiterOffset3, iIndexOfLastNonAsciiWhitespace$default);
                this.encodedQueryNamesAndValues = toQueryNamesAndValues(_UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : iDelimiterOffset3 + 1, (120 & 2) != 0 ? str.length() : iDelimiterOffset4, _UrlKt.QUERY_ENCODE_SET, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : true, (120 & 64) != 0 ? false : false));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < iIndexOfLastNonAsciiWhitespace$default && str.charAt(iDelimiterOffset3) == c) {
                this.encodedFragment = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : 1 + iDelimiterOffset3, (120 & 2) != 0 ? str.length() : iIndexOfLastNonAsciiWhitespace$default, _UrlKt.FRAGMENT_ENCODE_SET, (120 & 8) != 0 ? false : true, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : true);
            }
            return this;
        }

        private final void resolvePath(String str, int i, int i2) {
            if (i != i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '/' || cCharAt == '\\') {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add(_UrlKt.FRAGMENT_ENCODE_SET);
                    i++;
                } else {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, _UrlKt.FRAGMENT_ENCODE_SET);
                }
                while (true) {
                    int i3 = i;
                    while (i3 < i2) {
                        i = _UtilCommonKt.delimiterOffset(str, "/\\", i3, i2);
                        boolean z = i < i2;
                        push(str, i3, i, z, true);
                        if (z) {
                            i3 = i + 1;
                        }
                    }
                    return;
                }
            }
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String strCanonicalize = _UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : i, (120 & 2) != 0 ? str.length() : i2, _UrlKt.PATH_SEGMENT_ENCODE_SET, (120 & 8) != 0 ? false : z2, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
            if (isDot(strCanonicalize)) {
                return;
            }
            if (isDotDot(strCanonicalize)) {
                pop();
                return;
            }
            if (this.encodedPathSegments.get(r12.size() - 1).length() == 0) {
                this.encodedPathSegments.set(r12.size() - 1, strCanonicalize);
            } else {
                this.encodedPathSegments.add(strCanonicalize);
            }
            if (z) {
                this.encodedPathSegments.add(_UrlKt.FRAGMENT_ENCODE_SET);
            }
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r0.size() - 1, _UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                this.encodedPathSegments.add(_UrlKt.FRAGMENT_ENCODE_SET);
            }
        }

        private final boolean isDot(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt__StringsJVMKt.equals(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt__StringsJVMKt.equals(str, "%2e.", true) || StringsKt__StringsJVMKt.equals(str, ".%2e", true) || StringsKt__StringsJVMKt.equals(str, "%2e%2e", true);
        }

        private final List<String> toQueryNamesAndValues(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '&', i, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str.length();
                }
                int i2 = iIndexOf$default;
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > i2) {
                    String strSubstring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iIndexOf$default2 + 1, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    arrayList.add(strSubstring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        private final int schemeDelimiterOffset(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((Intrinsics.compare((int) cCharAt, 97) >= 0 && Intrinsics.compare((int) cCharAt, Imgproc.COLOR_YUV2BGRA_YVYU) <= 0) || (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 90) <= 0)) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private final int slashCount(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '/' && cCharAt != '\\') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private final int portColonOffset(String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    return i;
                }
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private final int parsePort(String str, int i, int i2) throws NumberFormatException {
            try {
                int i3 = Integer.parseInt(_UrlKt.canonicalize(str, (120 & 1) != 0 ? 0 : i, (120 & 2) != 0 ? str.length() : i2, _UrlKt.FRAGMENT_ENCODE_SET, (120 & 8) != 0 ? false : false, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false));
                if (i3 <= 0 || i3 >= 65536) {
                    return -1;
                }
                return i3;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final int defaultPort(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.areEqual(str, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(str, "https") ? 443 : -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void toQueryString(List<String> list, StringBuilder sb) {
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, list.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        @JvmStatic
        public final HttpUrl get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Builder().parse$okhttp(null, str).build();
        }

        @JvmStatic
        public final HttpUrl parse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @JvmStatic
        public final HttpUrl get(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "");
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return parse(string);
        }

        @JvmStatic
        public final HttpUrl get(@NotNull URI uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return parse(string);
        }

        @Deprecated
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m235deprecated_get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return get(str);
        }

        @Deprecated
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m238deprecated_parse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return parse(str);
        }

        @Deprecated
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m237deprecated_get(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "");
            return get(url);
        }

        @Deprecated
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m236deprecated_get(@NotNull URI uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            return get(uri);
        }
    }
}
