package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProtoWriter {
    public static final Companion Companion = new Companion(null);
    private final TTAppOpenAdActivity9 sink;

    public ProtoWriter(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        this.sink = tTAppOpenAdActivity9;
    }

    public final void writeBytes(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        this.sink.onExtraCallback(tTBaseLandingPageActivity);
    }

    public final void writeString(@NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        this.sink.onExtraCallback(str);
    }

    public final void writeTag(int i2, @NotNull FieldEncoding fieldEncoding) throws IOException {
        Intrinsics.checkNotNullParameter(fieldEncoding, "");
        writeVarint32(Companion.makeTag$wire_runtime(i2, fieldEncoding));
    }

    public final void writeSignedVarint32$wire_runtime(int i2) throws IOException {
        if (i2 >= 0) {
            writeVarint32(i2);
        } else {
            writeVarint64(i2);
        }
    }

    public final void writeVarint32(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.sink.onExtraCallbackWithResult((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.sink.onExtraCallbackWithResult(i2);
    }

    public final void writeVarint64(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.sink.onExtraCallbackWithResult((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.sink.onExtraCallbackWithResult((int) j);
    }

    public final void writeFixed32(int i2) throws IOException {
        this.sink.IAuthTabCallbackStub(i2);
    }

    public final void writeFixed64(long j) throws IOException {
        this.sink.writeTypedObject(j);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int decodeZigZag32$wire_runtime(int i2) {
            return (i2 >>> 1) ^ (-(i2 & 1));
        }

        public final long decodeZigZag64$wire_runtime(long j) {
            return (j >>> 1) ^ (-(1 & j));
        }

        public final int encodeZigZag32$wire_runtime(int i2) {
            return (i2 << 1) ^ (i2 >> 31);
        }

        public final long encodeZigZag64$wire_runtime(long j) {
            return (j << 1) ^ (j >> 63);
        }

        public final int varint32Size$wire_runtime(int i2) {
            if ((i2 & (-128)) == 0) {
                return 1;
            }
            if ((i2 & (-16384)) == 0) {
                return 2;
            }
            if (((-2097152) & i2) == 0) {
                return 3;
            }
            return (i2 & (-268435456)) == 0 ? 4 : 5;
        }

        public final int varint64Size$wire_runtime(long j) {
            if (((-128) & j) == 0) {
                return 1;
            }
            if (((-16384) & j) == 0) {
                return 2;
            }
            if (((-2097152) & j) == 0) {
                return 3;
            }
            if (((-268435456) & j) == 0) {
                return 4;
            }
            if (((-34359738368L) & j) == 0) {
                return 5;
            }
            if (((-4398046511104L) & j) == 0) {
                return 6;
            }
            if (((-562949953421312L) & j) == 0) {
                return 7;
            }
            if (((-72057594037927936L) & j) == 0) {
                return 8;
            }
            return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
        }

        private Companion() {
        }

        public final int makeTag$wire_runtime(int i2, @NotNull FieldEncoding fieldEncoding) {
            Intrinsics.checkNotNullParameter(fieldEncoding, "");
            return (i2 << 3) | fieldEncoding.getValue$wire_runtime();
        }

        public final int tagSize$wire_runtime(int i2) {
            return varint32Size$wire_runtime(makeTag$wire_runtime(i2, FieldEncoding.VARINT));
        }

        public final int int32Size$wire_runtime(int i2) {
            if (i2 >= 0) {
                return varint32Size$wire_runtime(i2);
            }
            return 10;
        }
    }
}
