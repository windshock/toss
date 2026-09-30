package com.squareup.wire;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class IntArrayProtoAdapter extends ProtoAdapter<int[]> {
    private final ProtoAdapter<Integer> originalAdapter;

    public int[] redact(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return new int[0];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntArrayProtoAdapter(@NotNull ProtoAdapter<Integer> protoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(int[].class), (String) null, protoAdapter.getSyntax(), new int[0], (String) null, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        this.originalAdapter = protoAdapter;
    }

    public void encodeWithTag(@NotNull ProtoWriter protoWriter, int i2, @Nullable int[] iArr) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        if (iArr == null || iArr.length == 0) {
            return;
        }
        super.encodeWithTag(protoWriter, i2, iArr);
    }

    public void encodeWithTag(@NotNull ReverseProtoWriter reverseProtoWriter, int i2, @Nullable int[] iArr) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (iArr == null || iArr.length == 0) {
            return;
        }
        super.encodeWithTag(reverseProtoWriter, i2, iArr);
    }

    public int encodedSize(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int iEncodedSize = 0;
        for (int i2 : iArr) {
            iEncodedSize += this.originalAdapter.encodedSize(Integer.valueOf(i2));
        }
        return iEncodedSize;
    }

    public int encodedSizeWithTag(int i2, @Nullable int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i2, iArr);
    }

    public void encode(@NotNull ProtoWriter protoWriter, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 : iArr) {
            this.originalAdapter.encode(protoWriter, Integer.valueOf(i2));
        }
    }

    public void encode(@NotNull ReverseProtoWriter reverseProtoWriter, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int length = iArr.length - 1; length >= 0; length--) {
            this.originalAdapter.encode(reverseProtoWriter, Integer.valueOf(iArr[length]));
        }
    }

    public int[] decode(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return new int[]{((Number) this.originalAdapter.decode(protoReader)).intValue()};
    }

    public int[] decode(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return new int[]{((Number) this.originalAdapter.decode(protoReader32)).intValue()};
    }
}
