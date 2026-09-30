package com.squareup.wire;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LongArrayProtoAdapter extends ProtoAdapter<long[]> {
    private final ProtoAdapter<Long> originalAdapter;

    public long[] redact(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return new long[0];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongArrayProtoAdapter(@NotNull ProtoAdapter<Long> protoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(long[].class), (String) null, protoAdapter.getSyntax(), new long[0], (String) null, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        this.originalAdapter = protoAdapter;
    }

    public void encodeWithTag(@NotNull ProtoWriter protoWriter, int i2, @Nullable long[] jArr) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        if (jArr == null || jArr.length == 0) {
            return;
        }
        super.encodeWithTag(protoWriter, i2, jArr);
    }

    public void encodeWithTag(@NotNull ReverseProtoWriter reverseProtoWriter, int i2, @Nullable long[] jArr) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (jArr == null || jArr.length == 0) {
            return;
        }
        super.encodeWithTag(reverseProtoWriter, i2, jArr);
    }

    public int encodedSize(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int iEncodedSize = 0;
        for (long j : jArr) {
            iEncodedSize += this.originalAdapter.encodedSize(Long.valueOf(j));
        }
        return iEncodedSize;
    }

    public int encodedSizeWithTag(int i2, @Nullable long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i2, jArr);
    }

    public void encode(@NotNull ProtoWriter protoWriter, @NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        Intrinsics.checkNotNullParameter(jArr, "");
        for (long j : jArr) {
            this.originalAdapter.encode(protoWriter, Long.valueOf(j));
        }
    }

    public void encode(@NotNull ReverseProtoWriter reverseProtoWriter, @NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        Intrinsics.checkNotNullParameter(jArr, "");
        for (int length = jArr.length - 1; length >= 0; length--) {
            this.originalAdapter.encode(reverseProtoWriter, Long.valueOf(jArr[length]));
        }
    }

    public long[] decode(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return new long[]{((Number) this.originalAdapter.decode(protoReader)).longValue()};
    }

    public long[] decode(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return new long[]{((Number) this.originalAdapter.decode(protoReader32)).longValue()};
    }
}
