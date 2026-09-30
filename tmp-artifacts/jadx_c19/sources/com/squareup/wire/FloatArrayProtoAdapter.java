package com.squareup.wire;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FloatArrayProtoAdapter extends ProtoAdapter<float[]> {
    private final ProtoAdapter<Float> originalAdapter;

    public float[] redact(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return new float[0];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatArrayProtoAdapter(@NotNull ProtoAdapter<Float> protoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(float[].class), (String) null, protoAdapter.getSyntax(), new float[0], (String) null, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        this.originalAdapter = protoAdapter;
    }

    public void encodeWithTag(@NotNull ProtoWriter protoWriter, int i2, @Nullable float[] fArr) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        if (fArr == null || fArr.length == 0) {
            return;
        }
        super.encodeWithTag(protoWriter, i2, fArr);
    }

    public void encodeWithTag(@NotNull ReverseProtoWriter reverseProtoWriter, int i2, @Nullable float[] fArr) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (fArr == null || fArr.length == 0) {
            return;
        }
        super.encodeWithTag(reverseProtoWriter, i2, fArr);
    }

    public int encodedSize(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        int iEncodedSize = 0;
        for (float f : fArr) {
            iEncodedSize += this.originalAdapter.encodedSize(Float.valueOf(f));
        }
        return iEncodedSize;
    }

    public int encodedSizeWithTag(int i2, @Nullable float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i2, fArr);
    }

    public void encode(@NotNull ProtoWriter protoWriter, @NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        for (float f : fArr) {
            this.originalAdapter.encode(protoWriter, Float.valueOf(f));
        }
    }

    public void encode(@NotNull ReverseProtoWriter reverseProtoWriter, @NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        for (int length = fArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeFixed32(Float.floatToIntBits(fArr[length]));
        }
    }

    public float[] decode(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return new float[]{Float.intBitsToFloat(protoReader.readFixed32())};
    }

    public float[] decode(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return new float[]{Float.intBitsToFloat(protoReader32.readFixed32())};
    }
}
