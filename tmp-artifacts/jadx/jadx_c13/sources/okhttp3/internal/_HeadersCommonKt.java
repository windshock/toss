package okhttp3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.access15800;
import o.getWrite;
import okhttp3.Headers;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class _HeadersCommonKt {
    public static final String commonName(@NotNull Headers headers, int i) {
        Intrinsics.checkNotNullParameter(headers, "");
        String str = (String) ArraysKt___ArraysKt.getOrNull(headers.getNamesAndValues$okhttp(), i << 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public static final String commonValue(@NotNull Headers headers, int i) {
        Intrinsics.checkNotNullParameter(headers, "");
        String str = (String) ArraysKt___ArraysKt.getOrNull(headers.getNamesAndValues$okhttp(), (i << 1) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public static final List<String> commonValues(@NotNull Headers headers, @NotNull String str) {
        Intrinsics.checkNotNullParameter(headers, "");
        Intrinsics.checkNotNullParameter(str, "");
        int size = headers.size();
        List<String> listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (StringsKt__StringsJVMKt.equals(str, headers.name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.value(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
        }
        return listUnmodifiableList == null ? CollectionsKt__CollectionsKt.emptyList() : listUnmodifiableList;
    }

    public static final Iterator<Pair<String, String>> commonIterator(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "");
        int size = headers.size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = getWrite.IAuthTabCallback(headers.name(i), headers.value(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public static final Headers.Builder commonNewBuilder(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "");
        Headers.Builder builder = new Headers.Builder();
        CollectionsKt__MutableCollectionsKt.addAll(builder.getNamesAndValues$okhttp(), headers.getNamesAndValues$okhttp());
        return builder;
    }

    public static final boolean commonEquals(@NotNull Headers headers, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(headers, "");
        return (obj instanceof Headers) && Arrays.equals(headers.getNamesAndValues$okhttp(), ((Headers) obj).getNamesAndValues$okhttp());
    }

    public static final int commonHashCode(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "");
        return Arrays.hashCode(headers.getNamesAndValues$okhttp());
    }

    public static final String commonToString(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "");
        StringBuilder sb = new StringBuilder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String strName = headers.name(i);
            String strValue = headers.value(i);
            sb.append(strName);
            sb.append(": ");
            if (_UtilCommonKt.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static final String commonHeadersGet(@NotNull String[] strArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        int length = strArr.length - 2;
        int iOnExtraCallbackWithResult = access15800.onExtraCallbackWithResult(length, 0, -2);
        if (iOnExtraCallbackWithResult > length) {
            return null;
        }
        while (!StringsKt__StringsJVMKt.equals(str, strArr[length], true)) {
            if (length == iOnExtraCallbackWithResult) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public static final Headers.Builder commonAdd(@NotNull Headers.Builder builder, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        headersCheckName(str);
        headersCheckValue(str2, str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final Headers.Builder commonAddAll(@NotNull Headers.Builder builder, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(headers, "");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            commonAddLenient(builder, headers.name(i), headers.value(i));
        }
        return builder;
    }

    public static final Headers.Builder commonAddLenient(@NotNull Headers.Builder builder, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        builder.getNamesAndValues$okhttp().add(str);
        builder.getNamesAndValues$okhttp().add(StringsKt__StringsKt.trim((CharSequence) str2).toString());
        return builder;
    }

    public static final Headers.Builder commonRemoveAll(@NotNull Headers.Builder builder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        while (i < builder.getNamesAndValues$okhttp().size()) {
            if (StringsKt__StringsJVMKt.equals(str, builder.getNamesAndValues$okhttp().get(i), true)) {
                builder.getNamesAndValues$okhttp().remove(i);
                builder.getNamesAndValues$okhttp().remove(i);
                i -= 2;
            }
            i += 2;
        }
        return builder;
    }

    public static final Headers.Builder commonSet(@NotNull Headers.Builder builder, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        headersCheckName(str);
        headersCheckValue(str2, str);
        builder.removeAll(str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final String commonGet(@NotNull Headers.Builder builder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        int size = builder.getNamesAndValues$okhttp().size() - 2;
        int iOnExtraCallbackWithResult = access15800.onExtraCallbackWithResult(size, 0, -2);
        if (iOnExtraCallbackWithResult > size) {
            return null;
        }
        while (!StringsKt__StringsJVMKt.equals(str, builder.getNamesAndValues$okhttp().get(size), true)) {
            if (size == iOnExtraCallbackWithResult) {
                return null;
            }
            size -= 2;
        }
        return builder.getNamesAndValues$okhttp().get(size + 1);
    }

    public static final Headers commonBuild(@NotNull Headers.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        return new Headers((String[]) builder.getNamesAndValues$okhttp().toArray(new String[0]));
    }

    public static final void headersCheckName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + charCode(cCharAt) + " at " + i + " in header name: " + str).toString());
            }
        }
    }

    public static final void headersCheckValue(@NotNull String str, @NotNull String str2) {
        String str3 = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected char 0x");
                sb.append(charCode(cCharAt));
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                if (!_UtilCommonKt.isSensitiveHeader(str2)) {
                    str3 = ": " + str;
                }
                sb.append(str3);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    private static final String charCode(char c) {
        String string = Integer.toString(c, CharsKt__CharJVMKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    public static final Headers commonHeadersOf(@NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = StringsKt__StringsKt.trim((CharSequence) strArr[i2]).toString();
        }
        int iOnExtraCallbackWithResult = access15800.onExtraCallbackWithResult(0, strArr2.length - 1, 2);
        if (iOnExtraCallbackWithResult >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                headersCheckName(str);
                headersCheckValue(str2, str);
                if (i == iOnExtraCallbackWithResult) {
                    break;
                }
                i += 2;
            }
        }
        return new Headers(strArr2);
    }

    public static final Headers commonToHeaders(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String[] strArr = new String[map.size() << 1];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String string = StringsKt__StringsKt.trim((CharSequence) key).toString();
            String string2 = StringsKt__StringsKt.trim((CharSequence) value).toString();
            headersCheckName(string);
            headersCheckValue(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        return new Headers(strArr);
    }
}
