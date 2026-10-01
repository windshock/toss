package okhttp3;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.access8000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(@NotNull String str, @NotNull Map<String, String> map) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                lowerCase = key.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
        this.authParams = mapUnmodifiableMap;
    }

    public final String scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return Charsets.ISO_8859_1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Map mapSingletonMap = Collections.singletonMap("realm", str2);
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "");
        this(str, (Map<String, String>) mapSingletonMap);
    }

    public final Challenge withCharset(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "");
        Map mapAccess100 = access8000.access100(this.authParams);
        mapAccess100.put("charset", charset.name());
        return new Challenge(this.scheme, (Map<String, String>) mapAccess100);
    }

    @Deprecated
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m189deprecated_scheme() {
        return this.scheme;
    }

    @Deprecated
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m186deprecated_authParams() {
        return this.authParams;
    }

    @Deprecated
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m188deprecated_realm() {
        return realm();
    }

    @Deprecated
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m187deprecated_charset() {
        return charset();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return Intrinsics.areEqual(challenge.scheme, this.scheme) && Intrinsics.areEqual(challenge.authParams, this.authParams);
    }

    public int hashCode() {
        return ((this.scheme.hashCode() + 899) * 31) + this.authParams.hashCode();
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }
}
