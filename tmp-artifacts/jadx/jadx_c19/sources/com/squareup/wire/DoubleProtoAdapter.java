package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DoubleProtoAdapter extends ProtoAdapter<Double> {
    public int encodedSize(double d) {
        return 8;
    }

    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        encode(protoWriter, ((Number) obj).doubleValue());
    }

    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        encode(reverseProtoWriter, ((Number) obj).doubleValue());
    }

    public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
        return encodedSize(((Number) obj).doubleValue());
    }

    public /* bridge */ /* synthetic */ Object redact(Object obj) {
        return redact(((Number) obj).doubleValue());
    }

    public DoubleProtoAdapter() {
        super(FieldEncoding.FIXED64, Reflection.getOrCreateKotlinClass(Double.TYPE), (String) null, Syntax.PROTO_2, Double.valueOf(0.0d), (String) null, 32, (DefaultConstructorMarker) null);
    }

    public void encode(@NotNull ProtoWriter protoWriter, double d) throws IOException {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        protoWriter.writeFixed64(Double.doubleToLongBits(d));
    }

    public void encode(@NotNull ReverseProtoWriter reverseProtoWriter, double d) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        reverseProtoWriter.writeFixed64(Double.doubleToLongBits(d));
    }

    /* renamed from: decode, reason: merged with bridge method [inline-methods] */
    public Double m76decode(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
    }

    /* renamed from: decode, reason: merged with bridge method [inline-methods] */
    public Double m75decode(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.valueOf(Double.longBitsToDouble(protoReader32.readFixed64()));
    }

    public Double redact(double d) {
        throw new UnsupportedOperationException();
    }
}
