package com.squareup.wire;

import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import j$.time.Duration;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.TTAppOpenAdActivity9;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTHistoryActivity4;
import o.access8100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProtoAdapterKt {
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;

    public static final <E> int commonEncodedSizeWithTag(@NotNull ProtoAdapter<E> protoAdapter, int i2, @Nullable E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        if (e == null) {
            return 0;
        }
        int iEncodedSize = protoAdapter.encodedSize(e);
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.Companion.varint32Size$wire_runtime(iEncodedSize);
        }
        return iEncodedSize + ProtoWriter.Companion.tagSize$wire_runtime(i2);
    }

    public static final <E> void delegateEncode(@NotNull final ProtoAdapter<E> protoAdapter, @NotNull ReverseProtoWriter reverseProtoWriter, final E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        reverseProtoWriter.writeForward$wire_runtime(new Function1<ProtoWriter, Unit>() { // from class: com.squareup.wire.ProtoAdapterKt.delegateEncode.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ProtoWriter) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(ProtoWriter protoWriter) {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoAdapter.encode(protoWriter, e);
            }
        });
    }

    public static final <E> void commonEncodeWithTag(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ProtoWriter protoWriter, int i2, @Nullable E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(protoWriter, "");
        if (e == null) {
            return;
        }
        protoWriter.writeTag(i2, protoAdapter.getFieldEncoding$wire_runtime());
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(protoAdapter.encodedSize(e));
        }
        protoAdapter.encode(protoWriter, e);
    }

    public static final <E> void commonEncodeWithTag(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ReverseProtoWriter reverseProtoWriter, int i2, @Nullable E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (e == null) {
            return;
        }
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = reverseProtoWriter.getByteCount();
            protoAdapter.encode(reverseProtoWriter, e);
            reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        } else {
            protoAdapter.encode(reverseProtoWriter, e);
        }
        reverseProtoWriter.writeTag(i2, protoAdapter.getFieldEncoding$wire_runtime());
    }

    public static final <E> void commonEncode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9, E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        protoAdapter.encode(reverseProtoWriter, e);
        reverseProtoWriter.writeTo(tTAppOpenAdActivity9);
    }

    public static final <E> byte[] commonEncode(@NotNull ProtoAdapter<E> protoAdapter, E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        protoAdapter.encode(tTBaseActivity, e);
        return tTBaseActivity.extraCallback();
    }

    public static final <E> TTBaseLandingPageActivity commonEncodeByteString(@NotNull ProtoAdapter<E> protoAdapter, E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        protoAdapter.encode(tTBaseActivity, e);
        return tTBaseActivity.writeTypedObject();
    }

    public static final <E> E commonDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        return (E) protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(bArr, 0, 0, 6, (Object) null));
    }

    public static final <E> E commonDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return (E) protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(tTBaseLandingPageActivity, 0, 0, 6, (Object) null));
    }

    public static final <E> E commonDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        return (E) protoAdapter.decode(new ProtoReader(tTAppOpenAdTransActivity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> void commonTryDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ProtoReader protoReader, @NotNull List<E> list) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(protoReader, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (protoReader.beforePossiblyPackedScalar$wire_runtime()) {
            list.add(protoAdapter.decode(protoReader));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> void commonTryDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ProtoReader32 protoReader32, @NotNull List<E> list) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(protoReader32, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (protoReader32.beforePossiblyPackedScalar()) {
            list.add(protoAdapter.decode(protoReader32));
        }
    }

    public static final <E> String commonToString(E e) {
        return String.valueOf(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> ProtoAdapter<?> commonWithLabel(@NotNull ProtoAdapter<E> protoAdapter, @NotNull WireField.Label label) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(label, "");
        return label.isRepeated() ? label.isPacked() ? protoAdapter.asPacked() : protoAdapter.asRepeated() : protoAdapter;
    }

    public static final <E> ProtoAdapter<List<E>> commonCreatePacked(@NotNull ProtoAdapter<E> protoAdapter) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.");
        }
        return new PackedProtoAdapter(protoAdapter);
    }

    public static final <E> ProtoAdapter<List<E>> commonCreateRepeated(@NotNull ProtoAdapter<E> protoAdapter) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        return new RepeatedProtoAdapter(protoAdapter);
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> commonNewMapAdapter(@NotNull ProtoAdapter<K> protoAdapter, @NotNull ProtoAdapter<V> protoAdapter2) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(protoAdapter2, "");
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public static final ProtoAdapter<Boolean> commonBool() {
        return new ProtoAdapter<Boolean>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Boolean.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonBool.1
            public int encodedSize(boolean z) {
                return 1;
            }

            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
                encode(protoWriter, ((Boolean) obj).booleanValue());
            }

            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                encode(reverseProtoWriter, ((Boolean) obj).booleanValue());
            }

            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize(((Boolean) obj).booleanValue());
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact(((Boolean) obj).booleanValue());
            }

            {
                Boolean bool = Boolean.FALSE;
            }

            public void encode(ProtoWriter protoWriter, boolean z) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeVarint32(z ? 1 : 0);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, boolean z) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeVarint32(z ? 1 : 0);
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Boolean m92decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return Boolean.valueOf(protoReader.readVarint32() != 0);
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Boolean m91decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return Boolean.valueOf(protoReader32.readVarint32() != 0);
            }

            public Boolean redact(boolean z) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonInt32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonInt32.1
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
                encode(protoWriter, ((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                encode(reverseProtoWriter, ((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize(((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact(((Number) obj).intValue());
            }

            public int encodedSize(int i2) {
                return ProtoWriter.Companion.int32Size$wire_runtime(i2);
            }

            public void encode(ProtoWriter protoWriter, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeSignedVarint32$wire_runtime(i2);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, int i2) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeSignedVarint32$wire_runtime(i2);
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Integer m106decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return Integer.valueOf(protoReader.readVarint32());
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Integer m105decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return Integer.valueOf(protoReader32.readVarint32());
            }

            public Integer redact(int i2) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonUint32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonUint32.1
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
                encode(protoWriter, ((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                encode(reverseProtoWriter, ((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize(((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact(((Number) obj).intValue());
            }

            public int encodedSize(int i2) {
                return ProtoWriter.Companion.varint32Size$wire_runtime(i2);
            }

            public void encode(ProtoWriter protoWriter, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeVarint32(i2);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, int i2) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeVarint32(i2);
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Integer m122decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return Integer.valueOf(protoReader.readVarint32());
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Integer m121decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return Integer.valueOf(protoReader32.readVarint32());
            }

            public Integer redact(int i2) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonSint32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonSint32.1
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
                encode(protoWriter, ((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                encode(reverseProtoWriter, ((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize(((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact(((Number) obj).intValue());
            }

            public int encodedSize(int i2) {
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint32Size$wire_runtime(companion.encodeZigZag32$wire_runtime(i2));
            }

            public void encode(ProtoWriter protoWriter, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(i2));
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, int i2) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(i2));
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Integer m110decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return Integer.valueOf(ProtoWriter.Companion.decodeZigZag32$wire_runtime(protoReader.readVarint32()));
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Integer m109decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return Integer.valueOf(ProtoWriter.Companion.decodeZigZag32$wire_runtime(protoReader32.readVarint32()));
            }

            public Integer redact(int i2) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonFixed32() {
        return new ProtoAdapter<Integer>(FieldEncoding.FIXED32, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonFixed32.1
            public int encodedSize(int i2) {
                return 4;
            }

            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
                encode(protoWriter, ((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                encode(reverseProtoWriter, ((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize(((Number) obj).intValue());
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact(((Number) obj).intValue());
            }

            public void encode(ProtoWriter protoWriter, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeFixed32(i2);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, int i2) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeFixed32(i2);
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Integer m100decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return Integer.valueOf(protoReader.readFixed32());
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Integer m99decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return Integer.valueOf(protoReader32.readFixed32());
            }

            public Integer redact(int i2) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Integer> commonSfixed32() {
        return commonFixed32();
    }

    public static final ProtoAdapter<Long> commonInt64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonInt64.1
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
                encode(protoWriter, ((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                encode(reverseProtoWriter, ((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize(((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact(((Number) obj).longValue());
            }

            public int encodedSize(long j) {
                return ProtoWriter.Companion.varint64Size$wire_runtime(j);
            }

            public void encode(ProtoWriter protoWriter, long j) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeVarint64(j);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, long j) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeVarint64(j);
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Long m108decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return Long.valueOf(protoReader.readVarint64());
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Long m107decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return Long.valueOf(protoReader32.readVarint64());
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Long> commonUint64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonUint64.1
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
                encode(protoWriter, ((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                encode(reverseProtoWriter, ((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize(((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact(((Number) obj).longValue());
            }

            public int encodedSize(long j) {
                return ProtoWriter.Companion.varint64Size$wire_runtime(j);
            }

            public void encode(ProtoWriter protoWriter, long j) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeVarint64(j);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, long j) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeVarint64(j);
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Long m124decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return Long.valueOf(protoReader.readVarint64());
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Long m123decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return Long.valueOf(protoReader32.readVarint64());
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Long> commonSint64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonSint64.1
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
                encode(protoWriter, ((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                encode(reverseProtoWriter, ((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize(((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact(((Number) obj).longValue());
            }

            public int encodedSize(long j) {
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint64Size$wire_runtime(companion.encodeZigZag64$wire_runtime(j));
            }

            public void encode(ProtoWriter protoWriter, long j) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(j));
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, long j) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(j));
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Long m112decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return Long.valueOf(ProtoWriter.Companion.decodeZigZag64$wire_runtime(protoReader.readVarint64()));
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Long m111decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return Long.valueOf(ProtoWriter.Companion.decodeZigZag64$wire_runtime(protoReader32.readVarint64()));
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Long> commonFixed64() {
        return new ProtoAdapter<Long>(FieldEncoding.FIXED64, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonFixed64.1
            public int encodedSize(long j) {
                return 8;
            }

            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
                encode(protoWriter, ((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                encode(reverseProtoWriter, ((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize(((Number) obj).longValue());
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact(((Number) obj).longValue());
            }

            public void encode(ProtoWriter protoWriter, long j) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeFixed64(j);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, long j) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeFixed64(j);
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Long m102decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return Long.valueOf(protoReader.readFixed64());
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Long m101decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return Long.valueOf(protoReader32.readFixed64());
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Long> commonSfixed64() {
        return commonFixed64();
    }

    public static final FloatProtoAdapter commonFloat() {
        return new FloatProtoAdapter();
    }

    public static final DoubleProtoAdapter commonDouble() {
        return new DoubleProtoAdapter();
    }

    public static final ProtoAdapter<String> commonString() {
        return new ProtoAdapter<String>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(String.class), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonString.1
            public int encodedSize(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return (int) TTHistoryActivity4.onNavigationEvent(str, 0, 0, 3, (Object) null);
            }

            public void encode(ProtoWriter protoWriter, String str) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                Intrinsics.checkNotNullParameter(str, "");
                protoWriter.writeString(str);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, String str) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                Intrinsics.checkNotNullParameter(str, "");
                reverseProtoWriter.writeString(str);
            }

            public String decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return protoReader.readString();
            }

            public String decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return protoReader32.readString();
            }

            public String redact(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<TTBaseLandingPageActivity> commonBytes() {
        return new ProtoAdapter<TTBaseLandingPageActivity>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(TTBaseLandingPageActivity.class), Syntax.PROTO_2, TTBaseLandingPageActivity.EMPTY) { // from class: com.squareup.wire.ProtoAdapterKt.commonBytes.1
            public int encodedSize(TTBaseLandingPageActivity tTBaseLandingPageActivity) {
                Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
                return tTBaseLandingPageActivity.access100();
            }

            public void encode(ProtoWriter protoWriter, TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
                protoWriter.writeBytes(tTBaseLandingPageActivity);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, TTBaseLandingPageActivity tTBaseLandingPageActivity) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
                reverseProtoWriter.writeBytes(tTBaseLandingPageActivity);
            }

            public TTBaseLandingPageActivity decode(ProtoReader protoReader) {
                Intrinsics.checkNotNullParameter(protoReader, "");
                return protoReader.readBytes();
            }

            public TTBaseLandingPageActivity decode(ProtoReader32 protoReader32) {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                return protoReader32.readBytes();
            }

            public TTBaseLandingPageActivity redact(TTBaseLandingPageActivity tTBaseLandingPageActivity) {
                Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<Duration> commonDuration() {
        return new ProtoAdapter<Duration>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Duration.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonDuration.1
            public Duration redact(Duration duration) {
                Intrinsics.checkNotNullParameter(duration, "");
                return duration;
            }

            public int encodedSize(Duration duration) {
                Intrinsics.checkNotNullParameter(duration, "");
                long sameSignSeconds = getSameSignSeconds(duration);
                int iEncodedSizeWithTag = sameSignSeconds != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(sameSignSeconds)) : 0;
                int sameSignNanos = getSameSignNanos(duration);
                return sameSignNanos != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(sameSignNanos)) : iEncodedSizeWithTag;
            }

            public void encode(ProtoWriter protoWriter, Duration duration) {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                Intrinsics.checkNotNullParameter(duration, "");
                long sameSignSeconds = getSameSignSeconds(duration);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, Long.valueOf(sameSignSeconds));
                }
                int sameSignNanos = getSameSignNanos(duration);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, Integer.valueOf(sameSignNanos));
                }
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, Duration duration) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                Intrinsics.checkNotNullParameter(duration, "");
                int sameSignNanos = getSameSignNanos(duration);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, Integer.valueOf(sameSignNanos));
                }
                long sameSignSeconds = getSameSignSeconds(duration);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, Long.valueOf(sameSignSeconds));
                }
            }

            private final long getSameSignSeconds(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
            }

            private final int getSameSignNanos(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Duration m96decode(ProtoReader protoReader) throws NoWhenBranchMatchedException, IOException {
                Intrinsics.checkNotNullParameter(protoReader, "");
                long jBeginMessage = protoReader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(jBeginMessage);
                        Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "");
                        return durationOfSeconds;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ((Number) ProtoAdapter.INT64.decode(protoReader)).longValue();
                    } else if (iNextTag == 2) {
                        iIntValue = ((Number) ProtoAdapter.INT32.decode(protoReader)).intValue();
                    } else {
                        protoReader.readUnknownField(iNextTag);
                    }
                }
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Duration m95decode(ProtoReader32 protoReader32) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                int iBeginMessage = protoReader32.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = protoReader32.nextTag();
                    if (iNextTag == -1) {
                        protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
                        Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "");
                        return durationOfSeconds;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ((Number) ProtoAdapter.INT64.decode(protoReader32)).longValue();
                    } else if (iNextTag == 2) {
                        iIntValue = ((Number) ProtoAdapter.INT32.decode(protoReader32)).intValue();
                    } else {
                        protoReader32.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Instant> commonInstant() {
        return new ProtoAdapter<Instant>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Instant.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonInstant.1
            public Instant redact(Instant instant) {
                Intrinsics.checkNotNullParameter(instant, "");
                return instant;
            }

            public int encodedSize(Instant instant) {
                Intrinsics.checkNotNullParameter(instant, "");
                long epochSecond = instant.getEpochSecond();
                int iEncodedSizeWithTag = epochSecond != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                int nano = instant.getNano();
                return nano != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) : iEncodedSizeWithTag;
            }

            public void encode(ProtoWriter protoWriter, Instant instant) {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                Intrinsics.checkNotNullParameter(instant, "");
                long epochSecond = instant.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, Long.valueOf(epochSecond));
                }
                int nano = instant.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, Integer.valueOf(nano));
                }
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, Instant instant) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                Intrinsics.checkNotNullParameter(instant, "");
                int nano = instant.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, Integer.valueOf(nano));
                }
                long epochSecond = instant.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, Long.valueOf(epochSecond));
                }
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Instant m104decode(ProtoReader protoReader) throws NoWhenBranchMatchedException, IOException {
                Intrinsics.checkNotNullParameter(protoReader, "");
                long jBeginMessage = protoReader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(jBeginMessage);
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "");
                        return instantOfEpochSecond;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ((Number) ProtoAdapter.INT64.decode(protoReader)).longValue();
                    } else if (iNextTag == 2) {
                        iIntValue = ((Number) ProtoAdapter.INT32.decode(protoReader)).intValue();
                    } else {
                        protoReader.readUnknownField(iNextTag);
                    }
                }
            }

            /* renamed from: decode, reason: merged with bridge method [inline-methods] */
            public Instant m103decode(ProtoReader32 protoReader32) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                int iBeginMessage = protoReader32.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = protoReader32.nextTag();
                    if (iNextTag == -1) {
                        protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "");
                        return instantOfEpochSecond;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ((Number) ProtoAdapter.INT64.decode(protoReader32)).longValue();
                    } else if (iNextTag == 2) {
                        iIntValue = ((Number) ProtoAdapter.INT32.decode(protoReader32)).intValue();
                    } else {
                        protoReader32.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Unit> commonEmpty() {
        return new ProtoAdapter<Unit>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Unit.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonEmpty.1
            public void encode(ProtoWriter protoWriter, Unit unit) {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                Intrinsics.checkNotNullParameter(unit, "");
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, Unit unit) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                Intrinsics.checkNotNullParameter(unit, "");
            }

            public int encodedSize(Unit unit) {
                Intrinsics.checkNotNullParameter(unit, "");
                return 0;
            }

            public void redact(Unit unit) {
                Intrinsics.checkNotNullParameter(unit, "");
            }

            public /* bridge */ /* synthetic */ Object decode(ProtoReader32 protoReader32) throws IOException {
                m97decode(protoReader32);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object decode(ProtoReader protoReader) throws NoWhenBranchMatchedException, IOException {
                m98decode(protoReader);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                redact((Unit) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: decode, reason: collision with other method in class */
            public void m98decode(ProtoReader protoReader) throws NoWhenBranchMatchedException, IOException {
                Intrinsics.checkNotNullParameter(protoReader, "");
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        protoReader.readUnknownField(iNextTag);
                    } else {
                        protoReader.endMessageAndGetUnknownFields(jBeginMessage);
                        return;
                    }
                }
            }

            /* renamed from: decode, reason: collision with other method in class */
            public void m97decode(ProtoReader32 protoReader32) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                int iBeginMessage = protoReader32.beginMessage();
                while (true) {
                    int iNextTag = protoReader32.nextTag();
                    if (iNextTag != -1) {
                        protoReader32.readUnknownField(iNextTag);
                    } else {
                        protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
                        return;
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Map<String, ?>> commonStructMap() {
        return new ProtoAdapter<Map<String, ?>>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Map.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructMap.1
            public int encodedSize(Map<String, ?> map) {
                int iTagSize$wire_runtime = 0;
                if (map == null) {
                    return 0;
                }
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, entry.getKey()) + ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, entry.getValue());
                    ProtoWriter.Companion companion = ProtoWriter.Companion;
                    iTagSize$wire_runtime += companion.tagSize$wire_runtime(1) + companion.varint32Size$wire_runtime(iEncodedSizeWithTag) + iEncodedSizeWithTag;
                }
                return iTagSize$wire_runtime;
            }

            public void encode(ProtoWriter protoWriter, Map<String, ?> map) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                if (map != null) {
                    for (Map.Entry<String, ?> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, key);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
                        int iEncodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value);
                        protoWriter.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                        protoWriter.writeVarint32(iEncodedSizeWithTag + iEncodedSizeWithTag2);
                        protoAdapter.encodeWithTag(protoWriter, 1, key);
                        protoAdapter2.encodeWithTag(protoWriter, 2, value);
                    }
                }
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, Map<String, ?> map) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                if (map != null) {
                    Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
                    ArraysKt.reverse(entryArr);
                    for (Map.Entry entry : entryArr) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        int byteCount = reverseProtoWriter.getByteCount();
                        ProtoAdapter.STRUCT_VALUE.encodeWithTag(reverseProtoWriter, 2, value);
                        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
                        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
                        reverseProtoWriter.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    }
                }
            }

            public Map<String, ?> decode(ProtoReader protoReader) throws NoWhenBranchMatchedException, IOException {
                Intrinsics.checkNotNullParameter(protoReader, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(jBeginMessage);
                        return linkedHashMap;
                    }
                    if (iNextTag != 1) {
                        protoReader.skip();
                    } else {
                        long jBeginMessage2 = protoReader.beginMessage();
                        Object objDecode = null;
                        Object objDecode2 = null;
                        while (true) {
                            int iNextTag2 = protoReader.nextTag();
                            if (iNextTag2 == -1) {
                                break;
                            }
                            if (iNextTag2 == 1) {
                                objDecode = ProtoAdapter.STRING.decode(protoReader);
                            } else if (iNextTag2 == 2) {
                                objDecode2 = ProtoAdapter.STRUCT_VALUE.decode(protoReader);
                            } else {
                                protoReader.readUnknownField(iNextTag2);
                            }
                        }
                        protoReader.endMessageAndGetUnknownFields(jBeginMessage2);
                        if (objDecode != null) {
                            linkedHashMap.put(objDecode, objDecode2);
                        }
                    }
                }
            }

            public Map<String, ?> decode(ProtoReader32 protoReader32) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int iBeginMessage = protoReader32.beginMessage();
                while (true) {
                    int iNextTag = protoReader32.nextTag();
                    if (iNextTag == -1) {
                        protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
                        return linkedHashMap;
                    }
                    if (iNextTag != 1) {
                        protoReader32.skip();
                    } else {
                        int iBeginMessage2 = protoReader32.beginMessage();
                        Object objDecode = null;
                        Object objDecode2 = null;
                        while (true) {
                            int iNextTag2 = protoReader32.nextTag();
                            if (iNextTag2 == -1) {
                                break;
                            }
                            if (iNextTag2 == 1) {
                                objDecode = ProtoAdapter.STRING.decode(protoReader32);
                            } else if (iNextTag2 == 2) {
                                objDecode2 = ProtoAdapter.STRUCT_VALUE.decode(protoReader32);
                            } else {
                                protoReader32.readUnknownField(iNextTag2);
                            }
                        }
                        protoReader32.endMessageAndGetUnknownFields(iBeginMessage2);
                        if (objDecode != null) {
                            linkedHashMap.put(objDecode, objDecode2);
                        }
                    }
                }
            }

            public Map<String, Object> redact(Map<String, ?> map) {
                if (map == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            }
        };
    }

    public static final ProtoAdapter<List<?>> commonStructList() {
        return new ProtoAdapter<List<?>>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Map.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructList.1
            public int encodedSize(List<?> list) {
                int iEncodedSizeWithTag = 0;
                if (list == null) {
                    return 0;
                }
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    iEncodedSizeWithTag += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                }
                return iEncodedSizeWithTag;
            }

            public void encode(ProtoWriter protoWriter, List<?> list) {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                if (list != null) {
                    Iterator<?> it = list.iterator();
                    while (it.hasNext()) {
                        ProtoAdapter.STRUCT_VALUE.encodeWithTag(protoWriter, 1, it.next());
                    }
                }
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, List<?> list) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        ProtoAdapter.STRUCT_VALUE.encodeWithTag(reverseProtoWriter, 1, list.get(size));
                    }
                }
            }

            public List<?> decode(ProtoReader protoReader) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader, "");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(jBeginMessage);
                        return arrayList;
                    }
                    if (iNextTag != 1) {
                        protoReader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(protoReader));
                    }
                }
            }

            public List<?> decode(ProtoReader32 protoReader32) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                ArrayList arrayList = new ArrayList();
                int iBeginMessage = protoReader32.beginMessage();
                while (true) {
                    int iNextTag = protoReader32.nextTag();
                    if (iNextTag == -1) {
                        protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
                        return arrayList;
                    }
                    if (iNextTag != 1) {
                        protoReader32.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(protoReader32));
                    }
                }
            }

            public List<Object> redact(List<?> list) {
                if (list == null) {
                    return null;
                }
                List<?> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
                }
                return arrayList;
            }
        };
    }

    public static final ProtoAdapter commonStructNull() {
        return new ProtoAdapter(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Void.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructNull.1
            public Void redact(Void r1) {
                return null;
            }

            public int encodedSize(Void r2) {
                return ProtoWriter.Companion.varint32Size$wire_runtime(0);
            }

            public int encodedSizeWithTag(int i2, Void r3) {
                int iEncodedSize = encodedSize(r3);
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.tagSize$wire_runtime(i2) + companion.varint32Size$wire_runtime(iEncodedSize);
            }

            public void encode(ProtoWriter protoWriter, Void r2) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeVarint32(0);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, Void r2) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                reverseProtoWriter.writeVarint32(0);
            }

            public void encodeWithTag(ProtoWriter protoWriter, int i2, Void r4) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                protoWriter.writeTag(i2, getFieldEncoding$wire_runtime());
                encode(protoWriter, r4);
            }

            public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i2, Void r4) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                encode(reverseProtoWriter, r4);
                reverseProtoWriter.writeTag(i2, getFieldEncoding$wire_runtime());
            }

            public Void decode(ProtoReader protoReader) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader, "");
                int varint32 = protoReader.readVarint32();
                if (varint32 == 0) {
                    return null;
                }
                throw new IOException("expected 0 but was " + varint32);
            }

            public Void decode(ProtoReader32 protoReader32) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                int varint32 = protoReader32.readVarint32();
                if (varint32 == 0) {
                    return null;
                }
                throw new IOException("expected 0 but was " + varint32);
            }
        };
    }

    public static final ProtoAdapter<Object> commonStructValue() {
        return new ProtoAdapter<Object>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Object.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructValue.1
            public int encodedSize(Object obj) {
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, obj);
                }
                if (obj instanceof Number) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, obj);
                }
                if (obj instanceof Boolean) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, obj);
                }
                if (obj instanceof Map) {
                    ProtoAdapter protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(obj, "");
                    return protoAdapter.encodedSizeWithTag(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, obj);
                }
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            }

            public int encodedSizeWithTag(int i2, Object obj) {
                if (obj == null) {
                    int iEncodedSize = encodedSize(obj);
                    ProtoWriter.Companion companion = ProtoWriter.Companion;
                    return companion.tagSize$wire_runtime(i2) + companion.varint32Size$wire_runtime(iEncodedSize) + iEncodedSize;
                }
                return super.encodedSizeWithTag(i2, obj);
            }

            public void encode(ProtoWriter protoWriter, Object obj) {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(protoWriter, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    ProtoAdapter protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(obj, "");
                    protoAdapter.encodeWithTag(protoWriter, 5, (Map) obj);
                } else {
                    if (obj instanceof List) {
                        ProtoAdapter.STRUCT_LIST.encodeWithTag(protoWriter, 6, obj);
                        return;
                    }
                    throw new IllegalArgumentException("unexpected struct value: " + obj);
                }
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(reverseProtoWriter, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    ProtoAdapter protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(obj, "");
                    protoAdapter.encodeWithTag(reverseProtoWriter, 5, (Map) obj);
                } else {
                    if (obj instanceof List) {
                        ProtoAdapter.STRUCT_LIST.encodeWithTag(reverseProtoWriter, 6, obj);
                        return;
                    }
                    throw new IllegalArgumentException("unexpected struct value: " + obj);
                }
            }

            public void encodeWithTag(ProtoWriter protoWriter, int i2, Object obj) throws IOException {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                if (obj == null) {
                    protoWriter.writeTag(i2, getFieldEncoding$wire_runtime());
                    protoWriter.writeVarint32(encodedSize(obj));
                    encode(protoWriter, obj);
                    return;
                }
                super.encodeWithTag(protoWriter, i2, obj);
            }

            public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i2, Object obj) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                if (obj == null) {
                    int byteCount = reverseProtoWriter.getByteCount();
                    encode(reverseProtoWriter, obj);
                    reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
                    reverseProtoWriter.writeTag(i2, getFieldEncoding$wire_runtime());
                    return;
                }
                super.encodeWithTag(reverseProtoWriter, i2, obj);
            }

            public Object redact(Object obj) {
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.redact(obj);
                }
                if (obj instanceof Number) {
                    return obj;
                }
                if (obj instanceof String) {
                    return null;
                }
                if (obj instanceof Boolean) {
                    return obj;
                }
                if (obj instanceof Map) {
                    ProtoAdapter protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(obj, "");
                    return protoAdapter.redact((Map) obj);
                }
                if (obj instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.redact(obj);
                }
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            }

            public Object decode(ProtoReader protoReader) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader, "");
                long jBeginMessage = protoReader.beginMessage();
                Object objDecode = null;
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                objDecode = ProtoAdapter.STRUCT_NULL.decode(protoReader);
                                break;
                            case 2:
                                objDecode = ProtoAdapter.DOUBLE.decode(protoReader);
                                break;
                            case 3:
                                objDecode = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                objDecode = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                objDecode = ProtoAdapter.STRUCT_MAP.decode(protoReader);
                                break;
                            case 6:
                                objDecode = ProtoAdapter.STRUCT_LIST.decode(protoReader);
                                break;
                            default:
                                protoReader.skip();
                                break;
                        }
                    } else {
                        protoReader.endMessageAndGetUnknownFields(jBeginMessage);
                        return objDecode;
                    }
                }
            }

            public Object decode(ProtoReader32 protoReader32) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                int iBeginMessage = protoReader32.beginMessage();
                Object objDecode = null;
                while (true) {
                    int iNextTag = protoReader32.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                objDecode = ProtoAdapter.STRUCT_NULL.decode(protoReader32);
                                break;
                            case 2:
                                objDecode = ProtoAdapter.DOUBLE.decode(protoReader32);
                                break;
                            case 3:
                                objDecode = ProtoAdapter.STRING.decode(protoReader32);
                                break;
                            case 4:
                                objDecode = ProtoAdapter.BOOL.decode(protoReader32);
                                break;
                            case 5:
                                objDecode = ProtoAdapter.STRUCT_MAP.decode(protoReader32);
                                break;
                            case 6:
                                objDecode = ProtoAdapter.STRUCT_LIST.decode(protoReader32);
                                break;
                            default:
                                protoReader32.skip();
                                break;
                        }
                    } else {
                        protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
                        return objDecode;
                    }
                }
            }
        };
    }

    public static final <T> ProtoAdapter<T> commonWrapper(@NotNull final ProtoAdapter<T> protoAdapter, @NotNull String str) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ProtoAdapter<T>(str, FieldEncoding.LENGTH_DELIMITED, protoAdapter.getType(), Syntax.PROTO_3, protoAdapter.getIdentity()) { // from class: com.squareup.wire.ProtoAdapterKt.commonWrapper.1
            public int encodedSize(T t) {
                if (t == null || Intrinsics.areEqual(t, protoAdapter.getIdentity())) {
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(1, t);
            }

            public void encode(ProtoWriter protoWriter, T t) {
                Intrinsics.checkNotNullParameter(protoWriter, "");
                if (t == null || Intrinsics.areEqual(t, protoAdapter.getIdentity())) {
                    return;
                }
                protoAdapter.encodeWithTag(protoWriter, 1, t);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, T t) {
                Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
                if (t == null || Intrinsics.areEqual(t, protoAdapter.getIdentity())) {
                    return;
                }
                protoAdapter.encodeWithTag(reverseProtoWriter, 1, t);
            }

            public T decode(ProtoReader protoReader) throws NoWhenBranchMatchedException, IOException {
                Intrinsics.checkNotNullParameter(protoReader, "");
                T t = (T) protoAdapter.getIdentity();
                ProtoAdapter<T> protoAdapter2 = protoAdapter;
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(jBeginMessage);
                        return t;
                    }
                    if (iNextTag == 1) {
                        t = (T) protoAdapter2.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(iNextTag);
                    }
                }
            }

            public T decode(ProtoReader32 protoReader32) throws IOException {
                Intrinsics.checkNotNullParameter(protoReader32, "");
                T t = (T) protoAdapter.getIdentity();
                ProtoAdapter<T> protoAdapter2 = protoAdapter;
                int iBeginMessage = protoReader32.beginMessage();
                while (true) {
                    int iNextTag = protoReader32.nextTag();
                    if (iNextTag == -1) {
                        protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
                        return t;
                    }
                    if (iNextTag == 1) {
                        t = (T) protoAdapter2.decode(protoReader32);
                    } else {
                        protoReader32.readUnknownField(iNextTag);
                    }
                }
            }

            public T redact(T t) {
                if (t == null) {
                    return null;
                }
                return (T) protoAdapter.redact(t);
            }
        };
    }
}
