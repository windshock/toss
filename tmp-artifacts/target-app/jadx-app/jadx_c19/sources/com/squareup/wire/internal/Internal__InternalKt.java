package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import o.access15800;
import o.access8100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final /* synthetic */ class Internal__InternalKt {
    private static final String ESCAPED_CHARS = ",[]{}\\";

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 == null ? 0 : 1);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 == null ? 0 : 1);
    }

    public static final <T> List<T> newMutableList() {
        return (List<T>) new MutableOnWriteList(CollectionsKt.emptyList());
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    @Deprecated
    public static final <T> List<T> copyOf(@NotNull String str, @Nullable List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNull(list);
        return Internal.copyOf(list);
    }

    public static final <T> List<T> copyOf(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list == CollectionsKt.emptyList() || (list instanceof ImmutableList)) {
            return (List<T>) new MutableOnWriteList(list);
        }
        return new ArrayList(list);
    }

    @Deprecated
    public static final <K, V> Map<K, V> copyOf(@NotNull String str, @Nullable Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNull(map);
        return Internal.copyOf(map);
    }

    public static final <K, V> Map<K, V> copyOf(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new LinkedHashMap(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> immutableCopyOf(@NotNull String str, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = list instanceof MutableOnWriteList;
        List<T> mutableList$wire_runtime = list;
        if (z) {
            mutableList$wire_runtime = ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (mutableList$wire_runtime == CollectionsKt.emptyList() || (mutableList$wire_runtime instanceof ImmutableList)) {
            return mutableList$wire_runtime;
        }
        AbstractCollection abstractCollection = (List<T>) new ImmutableList(mutableList$wire_runtime);
        if (!abstractCollection.contains((Object) null)) {
            return abstractCollection;
        }
        throw new IllegalArgumentException((str + ".contains(null)").toString());
    }

    public static final <K, V> Map<K, V> immutableCopyOf(@NotNull String str, @NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (map.isEmpty()) {
            return access8100.onNavigationEvent();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> setKeySet = linkedHashMap.keySet();
        Intrinsics.checkNotNull(setKeySet, "");
        if (setKeySet.contains(null)) {
            throw new IllegalArgumentException((str + ".containsKey(null)").toString());
        }
        Collection<V> collectionValues = linkedHashMap.values();
        Intrinsics.checkNotNull(collectionValues, "");
        if (collectionValues.contains(null)) {
            throw new IllegalArgumentException((str + ".containsValue(null)").toString());
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(@NotNull String str, @NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null) {
                throw new IllegalArgumentException((str + ".containsKey(null)").toString());
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(str, value));
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
        Intrinsics.checkNotNull(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    public static final <T> T immutableCopyOfStruct(@NotNull String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        if (t == null || (t instanceof Boolean) || (t instanceof Double) || (t instanceof String)) {
            return t;
        }
        if (t instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(str, it.next()));
            }
            T t2 = (T) Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(t2, "");
            return t2;
        }
        if (t instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                linkedHashMap.put(Internal.immutableCopyOfStruct(str, entry.getKey()), Internal.immutableCopyOfStruct(str, entry.getValue()));
            }
            T t3 = (T) Collections.unmodifiableMap(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(t3, "");
            return t3;
        }
        throw new IllegalArgumentException("struct value " + str + " must be a JSON type (null, Boolean, Double, String, List, or Map) but was " + getTypeName$Internal__InternalKt(t) + ": " + t);
    }

    private static final KClass<? extends Object> getTypeName$Internal__InternalKt(Object obj) {
        return Reflection.getOrCreateKotlinClass(obj.getClass());
    }

    /* renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m129redactElements(@NotNull List<? extends T> list, @NotNull ProtoAdapter<T> protoAdapter) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(protoAdapter.redact(it.next()));
        }
        return arrayList;
    }

    public static final boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && Intrinsics.areEqual(obj, obj2);
        }
        return true;
    }

    public static final IllegalStateException missingRequiredFields(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int iOnExtraCallbackWithResult = access15800.onExtraCallbackWithResult(0, objArr.length - 1, 2);
        String str = "";
        if (iOnExtraCallbackWithResult >= 0) {
            while (true) {
                if (objArr[i2] == null) {
                    if (sb.length() > 0) {
                        str = "s";
                    }
                    sb.append("\n  ");
                    sb.append(objArr[i2 + 1]);
                }
                if (i2 == iOnExtraCallbackWithResult) {
                    break;
                }
                i2 += 2;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        throw new IllegalStateException("Required field" + str + " not set:" + string);
    }

    public static final void checkElementsNotNull(@NotNull List<?> list) {
        Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == null) {
                throw new NullPointerException("Element at index " + i2 + " is null");
            }
        }
    }

    public static final void checkElementsNotNull(@NotNull Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new NullPointerException("map.containsKey(null)");
            }
            if (value == null) {
                throw new NullPointerException("Value for key " + key + " is null");
            }
        }
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        int i2 = obj != null ? 1 : 0;
        if (obj2 != null) {
            i2++;
        }
        if (obj3 != null) {
            i2++;
        }
        if (obj4 != null) {
            i2++;
        }
        for (Object obj5 : objArr) {
            if (obj5 != null) {
                i2++;
            }
        }
        return i2;
    }

    public static final String sanitize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (StringsKt.contains$default(ESCAPED_CHARS, cCharAt, false, 2, (Object) null)) {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* renamed from: com.squareup.wire.internal.Internal__InternalKt$sanitize$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<String, String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1, Internal__InternalKt.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        public final String invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Internal.sanitize(str);
        }
    }

    public static final String sanitize(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return CollectionsKt.joinToString$default(list, (CharSequence) null, "[", "]", 0, (CharSequence) null, AnonymousClass2.INSTANCE, 25, (Object) null);
    }

    public static final String boxedOneOfClassName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) CharsKt.onNavigationEvent(str.charAt(0)));
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static final String boxedOneOfKeyFieldName(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String upperCase = (str + '_' + str2).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final String boxedOneOfKeysFieldName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String upperCase = (str + "_keys").toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final void encodeArray_int32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeSignedVarint32$wire_runtime(iArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeVarint32(iArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sint32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(iArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeFixed32(iArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        Internal.encodeArray_fixed32(iArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_int64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (jArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = jArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeVarint64(jArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        Internal.encodeArray_int64(jArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_sint64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (jArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = jArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(jArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (jArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = jArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeFixed64(jArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        Internal.encodeArray_fixed64(jArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_float(@NotNull float[] fArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (fArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = fArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeFixed32(Float.floatToIntBits(fArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_double(@NotNull double[] dArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (dArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = dArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeFixed64(Double.doubleToLongBits(dArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i2, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final double decodePrimitive_double(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(protoReader32.readFixed64());
    }

    public static final double decodePrimitive_double(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(protoReader.readFixed64());
    }

    public static final int decodePrimitive_fixed32(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return protoReader32.readFixed32();
    }

    public static final int decodePrimitive_fixed32(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return protoReader.readFixed32();
    }

    public static final long decodePrimitive_fixed64(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return protoReader32.readFixed64();
    }

    public static final long decodePrimitive_fixed64(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return protoReader.readFixed64();
    }

    public static final float decodePrimitive_float(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(protoReader32.readFixed32());
    }

    public static final float decodePrimitive_float(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(protoReader.readFixed32());
    }

    public static final int decodePrimitive_int32(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return protoReader32.readVarint32();
    }

    public static final int decodePrimitive_int32(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return protoReader.readVarint32();
    }

    public static final long decodePrimitive_int64(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return protoReader32.readVarint64();
    }

    public static final long decodePrimitive_int64(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return protoReader.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return protoReader32.readFixed32();
    }

    public static final int decodePrimitive_sfixed32(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return protoReader.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return protoReader32.readFixed64();
    }

    public static final long decodePrimitive_sfixed64(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return protoReader.readFixed64();
    }

    public static final int decodePrimitive_sint32(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return ProtoWriter.Companion.decodeZigZag32$wire_runtime(protoReader32.readVarint32());
    }

    public static final int decodePrimitive_sint32(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return ProtoWriter.Companion.decodeZigZag32$wire_runtime(protoReader.readVarint32());
    }

    public static final long decodePrimitive_sint64(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return ProtoWriter.Companion.decodeZigZag64$wire_runtime(protoReader32.readVarint64());
    }

    public static final long decodePrimitive_sint64(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return ProtoWriter.Companion.decodeZigZag64$wire_runtime(protoReader.readVarint64());
    }

    public static final int decodePrimitive_uint32(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return protoReader32.readVarint32();
    }

    public static final int decodePrimitive_uint32(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return protoReader.readVarint32();
    }

    public static final long decodePrimitive_uint64(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return protoReader32.readVarint64();
    }

    public static final long decodePrimitive_uint64(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return protoReader.readVarint64();
    }

    public static final boolean commonEquals(@NotNull Instant instant, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(instant, "");
        if (instant == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Instant)) {
            return false;
        }
        Instant instant2 = (Instant) obj;
        return instant.getEpochSecond() == instant2.getEpochSecond() && instant.getNano() == instant2.getNano();
    }

    public static final int commonHashCode(@NotNull Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "");
        return (Long.hashCode(instant.getEpochSecond()) * 31) + Integer.hashCode(instant.getNano());
    }

    public static final boolean commonEquals(@NotNull Duration duration, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(duration, "");
        if (duration == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Duration)) {
            return false;
        }
        Duration duration2 = (Duration) obj;
        return duration.getSeconds() == duration2.getSeconds() && duration.getNano() == duration2.getNano();
    }

    public static final int commonHashCode(@NotNull Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "");
        return (Long.hashCode(duration.getSeconds()) * 31) + Integer.hashCode(duration.getNano());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m130redactElements(@NotNull Map<K, ? extends V> map, @NotNull ProtoAdapter<V> protoAdapter) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), protoAdapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }
}
