package okhttp3;

import j$.time.Instant;
import j$.util.DateRetargetClass;
import j$.util.DesugarDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    public static final Headers EMPTY = new Headers(new String[0]);
    private final String[] namesAndValues;

    @JvmStatic
    public static final Headers of(@NotNull Map<String, String> map) {
        return Companion.of(map);
    }

    @JvmStatic
    public static final Headers of(@NotNull String... strArr) {
        return Companion.of(strArr);
    }

    public Headers(@NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        this.namesAndValues = strArr;
    }

    public final String[] getNamesAndValues$okhttp() {
        return this.namesAndValues;
    }

    public final String get(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return _HeadersCommonKt.commonHeadersGet(this.namesAndValues, str);
    }

    public final Date getDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = get(str);
        if (str2 != null) {
            return DateFormattingKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    public final Instant getInstant(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Date date = getDate(str);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @Deprecated
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m213deprecated_size() {
        return size();
    }

    public final String name(int i) {
        return _HeadersCommonKt.commonName(this, i);
    }

    public final String value(int i) {
        return _HeadersCommonKt.commonValue(this, i);
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(StringsKt__StringsJVMKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "");
        return setUnmodifiableSet;
    }

    public final List<String> values(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return _HeadersCommonKt.commonValues(this, str);
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length << 1;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        return _HeadersCommonKt.commonIterator(this);
    }

    public final Builder newBuilder() {
        return _HeadersCommonKt.commonNewBuilder(this);
    }

    public boolean equals(@Nullable Object obj) {
        return _HeadersCommonKt.commonEquals(this, obj);
    }

    public int hashCode() {
        return _HeadersCommonKt.commonHashCode(this);
    }

    public String toString() {
        return _HeadersCommonKt.commonToString(this);
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(StringsKt__StringsJVMKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i = 0; i < size; i++) {
            String strName = name(i);
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i));
        }
        return treeMap;
    }

    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder addLenient$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = str.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String strSubstring2 = str.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (str.charAt(0) == ':') {
                String strSubstring3 = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                addLenient$okhttp(_UrlKt.FRAGMENT_ENCODE_SET, strSubstring3);
                return this;
            }
            addLenient$okhttp(_UrlKt.FRAGMENT_ENCODE_SET, str);
            return this;
        }

        public final Builder add(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + str).toString());
            }
            String strSubstring = str.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            String strSubstring2 = str.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            add(string, strSubstring2);
            return this;
        }

        public final Builder add(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return _HeadersCommonKt.commonAdd(this, str, str2);
        }

        public final Builder addUnsafeNonAscii(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            _HeadersCommonKt.headersCheckName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder addAll(@NotNull Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "");
            return _HeadersCommonKt.commonAddAll(this, headers);
        }

        public final Builder add(@NotNull String str, @NotNull Date date) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(date, "");
            return add(str, DateFormattingKt.toHttpDateString(date));
        }

        public final Builder add(@NotNull String str, @NotNull Instant instant) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(instant, "");
            Date dateFrom = DesugarDate.from(instant);
            Intrinsics.checkNotNullExpressionValue(dateFrom, "");
            return add(str, dateFrom);
        }

        public final Builder set(@NotNull String str, @NotNull Date date) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(date, "");
            return set(str, DateFormattingKt.toHttpDateString(date));
        }

        public final Builder set(@NotNull String str, @NotNull Instant instant) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(instant, "");
            Date dateFrom = DesugarDate.from(instant);
            Intrinsics.checkNotNullExpressionValue(dateFrom, "");
            return set(str, dateFrom);
        }

        public final Builder addLenient$okhttp(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return _HeadersCommonKt.commonAddLenient(this, str, str2);
        }

        public final Builder removeAll(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return _HeadersCommonKt.commonRemoveAll(this, str);
        }

        public final Builder set(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return _HeadersCommonKt.commonSet(this, str, str2);
        }

        public final String get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return _HeadersCommonKt.commonGet(this, str);
        }

        public final Headers build() {
            return _HeadersCommonKt.commonBuild(this);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Headers of(@NotNull String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "");
            return _HeadersCommonKt.commonHeadersOf((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Deprecated
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m215deprecated_of(@NotNull String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @JvmStatic
        public final Headers of(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return _HeadersCommonKt.commonToHeaders(map);
        }

        @Deprecated
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m214deprecated_of(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return of(map);
        }
    }
}
