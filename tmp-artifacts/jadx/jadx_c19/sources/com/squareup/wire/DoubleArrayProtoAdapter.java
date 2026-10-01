package com.squareup.wire;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DoubleArrayProtoAdapter extends ProtoAdapter<double[]> {
    private final ProtoAdapter<Double> originalAdapter;

    public double[] redact(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        return new double[0];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleArrayProtoAdapter(@NotNull ProtoAdapter<Double> protoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(double[].class), (String) null, protoAdapter.getSyntax(), new double[0], (String) null, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        this.originalAdapter = protoAdapter;
    }

    public void encodeWithTag(@NotNull ProtoWriter protoWriter, int i2, @Nullable double[] dArr) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        if (dArr == null || dArr.length == 0) {
            return;
        }
        super.encodeWithTag(protoWriter, i2, dArr);
    }

    public void encodeWithTag(@NotNull ReverseProtoWriter reverseProtoWriter, int i2, @Nullable double[] dArr) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (dArr == null || dArr.length == 0) {
            return;
        }
        super.encodeWithTag(reverseProtoWriter, i2, dArr);
    }

    public int encodedSize(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        int iEncodedSize = 0;
        for (double d : dArr) {
            iEncodedSize += this.originalAdapter.encodedSize(Double.valueOf(d));
        }
        return iEncodedSize;
    }

    public int encodedSizeWithTag(int i2, @Nullable double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i2, dArr);
    }

    public void encode(@NotNull ProtoWriter protoWriter, @NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        Intrinsics.checkNotNullParameter(dArr, "");
        for (double d : dArr) {
            this.originalAdapter.encode(protoWriter, Double.valueOf(d));
        }
    }

    public void encode(@NotNull ReverseProtoWriter reverseProtoWriter, @NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        Intrinsics.checkNotNullParameter(dArr, "");
        for (int length = dArr.length - 1; length >= 0; length--) {
            reverseProtoWriter.writeFixed64(Double.doubleToLongBits(dArr[length]));
        }
    }

    public double[] decode(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return new double[]{Double.longBitsToDouble(protoReader.readFixed64())};
    }

    public double[] decode(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return new double[]{Double.longBitsToDouble(protoReader32.readFixed64())};
    }
}
