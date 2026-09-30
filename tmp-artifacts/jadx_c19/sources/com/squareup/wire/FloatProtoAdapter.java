package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FloatProtoAdapter extends ProtoAdapter<Float> {
    public int encodedSize(float f) {
        return 4;
    }

    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        encode(protoWriter, ((Number) obj).floatValue());
    }

    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        encode(reverseProtoWriter, ((Number) obj).floatValue());
    }

    public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
        return encodedSize(((Number) obj).floatValue());
    }

    public /* bridge */ /* synthetic */ Object redact(Object obj) {
        return redact(((Number) obj).floatValue());
    }

    public FloatProtoAdapter() {
        super(FieldEncoding.FIXED32, Reflection.getOrCreateKotlinClass(Float.TYPE), (String) null, Syntax.PROTO_2, Float.valueOf(0.0f), (String) null, 32, (DefaultConstructorMarker) null);
    }

    public void encode(@NotNull ProtoWriter protoWriter, float f) throws IOException {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        protoWriter.writeFixed32(Float.floatToIntBits(f));
    }

    public void encode(@NotNull ReverseProtoWriter reverseProtoWriter, float f) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        reverseProtoWriter.writeFixed32(Float.floatToIntBits(f));
    }

    /* renamed from: decode, reason: merged with bridge method [inline-methods] */
    public Float m82decode(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
    }

    /* renamed from: decode, reason: merged with bridge method [inline-methods] */
    public Float m81decode(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.valueOf(Float.intBitsToFloat(protoReader32.readFixed32()));
    }

    public Float redact(float f) {
        throw new UnsupportedOperationException();
    }
}
