package com.squareup.wire;

import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TombstoneProtosMemoryMappingBuilder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ReverseProtoWriter {
    private static final Companion Companion = new Companion(null);
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private int arrayLimit;
    private final Lazy forwardBuffer$delegate;
    private final Lazy forwardWriter$delegate;
    private TTBaseActivity tail = new TTBaseActivity();
    private TTBaseActivity head = new TTBaseActivity();
    private final TTBaseActivity.onNavigationEvent cursor = new TTBaseActivity.onNavigationEvent();
    private byte[] array = EMPTY_ARRAY;

    public ReverseProtoWriter() {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.NONE;
        this.forwardBuffer$delegate = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: com.squareup.wire.ReverseProtoWriter$$ExternalSyntheticLambda0
            public final Object invoke() {
                return ReverseProtoWriter.forwardBuffer_delegate$lambda$0();
            }
        });
        this.forwardWriter$delegate = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: com.squareup.wire.ReverseProtoWriter$$ExternalSyntheticLambda1
            public final Object invoke() {
                return ReverseProtoWriter.forwardWriter_delegate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TTBaseActivity forwardBuffer_delegate$lambda$0() {
        return new TTBaseActivity();
    }

    private final TTBaseActivity getForwardBuffer() {
        return (TTBaseActivity) this.forwardBuffer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoWriter forwardWriter_delegate$lambda$1(ReverseProtoWriter reverseProtoWriter) {
        return new ProtoWriter(reverseProtoWriter.getForwardBuffer());
    }

    private final ProtoWriter getForwardWriter() {
        return (ProtoWriter) this.forwardWriter$delegate.getValue();
    }

    public final int getByteCount() {
        return ((int) this.tail.ICustomTabsCallbackDefault()) + (this.array.length - this.arrayLimit);
    }

    public final void writeTo(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        emitCurrentSegment();
        tTAppOpenAdActivity9.onExtraCallbackWithResult(this.tail);
    }

    private final void require(int i2) {
        if (this.arrayLimit >= i2) {
            return;
        }
        emitCurrentSegment();
        this.head.onExtraCallback(this.cursor);
        this.cursor.onExtraCallbackWithResult(i2);
        TTBaseActivity.onNavigationEvent onnavigationevent = this.cursor;
        if (onnavigationevent.onExtraCallbackWithResult == 0) {
            int i3 = onnavigationevent.onNavigationEvent;
            byte[] bArr = onnavigationevent.IAuthTabCallback;
            Intrinsics.checkNotNull(bArr);
            if (i3 == bArr.length) {
                byte[] bArr2 = this.cursor.IAuthTabCallback;
                Intrinsics.checkNotNull(bArr2);
                this.array = bArr2;
                this.arrayLimit = this.cursor.onNavigationEvent;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    private final void emitCurrentSegment() {
        byte[] bArr = this.array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.IAuthTabCallbackDefault(this.arrayLimit);
        this.head.onExtraCallbackWithResult(this.tail);
        TTBaseActivity tTBaseActivity = this.tail;
        this.tail = this.head;
        this.head = tTBaseActivity;
        this.array = bArr2;
        this.arrayLimit = 0;
    }

    public final void writeForward$wire_runtime(@NotNull Function1<? super ProtoWriter, Unit> function1) throws IOException {
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(getForwardWriter());
        writeBytes(getForwardBuffer().writeTypedObject());
    }

    public final void writeBytes(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        int iAccess100 = tTBaseLandingPageActivity.access100();
        while (iAccess100 != 0) {
            require(1);
            int iMin = Math.min(this.arrayLimit, iAccess100);
            int i2 = this.arrayLimit - iMin;
            this.arrayLimit = i2;
            iAccess100 -= iMin;
            tTBaseLandingPageActivity.onNavigationEvent(iAccess100, this.array, i2, iMin);
        }
    }

    public final void writeString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length() - 1;
        while (length >= 0) {
            int i2 = length - 1;
            char cCharAt = str.charAt(length);
            if (cCharAt < 128) {
                require(1);
                int i3 = this.arrayLimit;
                byte[] bArr = this.array;
                int i4 = i3 - 1;
                bArr[i4] = (byte) cCharAt;
                int iMax = Math.max(-1, i2 - i4);
                int i5 = i4;
                length = i2;
                while (length > iMax) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    length--;
                    i5--;
                    bArr[i5] = (byte) cCharAt2;
                }
                this.arrayLimit = i5;
            } else {
                if (cCharAt < 2048) {
                    require(2);
                    byte[] bArr2 = this.array;
                    int i6 = this.arrayLimit;
                    bArr2[i6 - 1] = (byte) (128 | (cCharAt & '?'));
                    int i7 = i6 - 2;
                    this.arrayLimit = i7;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    require(3);
                    byte[] bArr3 = this.array;
                    int i8 = this.arrayLimit;
                    bArr3[i8 - 1] = (byte) ((cCharAt & '?') | 128);
                    bArr3[i8 - 2] = (byte) (128 | (63 & (cCharAt >> 6)));
                    int i9 = i8 - 3;
                    this.arrayLimit = i9;
                    bArr3[i9] = (byte) ((cCharAt >> '\f') | 224);
                } else {
                    char cCharAt3 = i2 >= 0 ? str.charAt(i2) : (char) 65535;
                    if (cCharAt3 > 56319 || 56320 > cCharAt || cCharAt >= 57344) {
                        require(1);
                        byte[] bArr4 = this.array;
                        int i10 = this.arrayLimit - 1;
                        this.arrayLimit = i10;
                        bArr4[i10] = 63;
                    } else {
                        length -= 2;
                        int i11 = (((cCharAt3 & 1023) << 10) | (cCharAt & 1023)) + 65536;
                        require(4);
                        byte[] bArr5 = this.array;
                        int i12 = this.arrayLimit;
                        bArr5[i12 - 1] = (byte) ((i11 & 63) | 128);
                        bArr5[i12 - 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr5[i12 - 3] = (byte) (128 | (63 & (i11 >> 12)));
                        int i13 = i12 - 4;
                        this.arrayLimit = i13;
                        bArr5[i13] = (byte) ((i11 >> 18) | 240);
                    }
                }
                length = i2;
            }
        }
    }

    public final void writeTag(int i2, @NotNull FieldEncoding fieldEncoding) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "");
        writeVarint32(ProtoWriter.Companion.makeTag$wire_runtime(i2, fieldEncoding));
    }

    public final void writeSignedVarint32$wire_runtime(int i2) {
        if (i2 >= 0) {
            writeVarint32(i2);
        } else {
            writeVarint64(i2);
        }
    }

    public final void writeVarint32(int i2) {
        int iVarint32Size$wire_runtime = ProtoWriter.Companion.varint32Size$wire_runtime(i2);
        require(iVarint32Size$wire_runtime);
        int i3 = this.arrayLimit - iVarint32Size$wire_runtime;
        this.arrayLimit = i3;
        while ((i2 & (-128)) != 0) {
            this.array[i3] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
            i3++;
        }
        this.array[i3] = (byte) i2;
    }

    public final void writeVarint64(long j) {
        int iVarint64Size$wire_runtime = ProtoWriter.Companion.varint64Size$wire_runtime(j);
        require(iVarint64Size$wire_runtime);
        int i2 = this.arrayLimit - iVarint64Size$wire_runtime;
        this.arrayLimit = i2;
        while (((-128) & j) != 0) {
            this.array[i2] = (byte) ((127 & j) | 128);
            j >>>= 7;
            i2++;
        }
        this.array[i2] = (byte) j;
    }

    public final void writeFixed32(int i2) {
        require(4);
        int i3 = this.arrayLimit;
        int i4 = i3 - 4;
        this.arrayLimit = i4;
        byte[] bArr = this.array;
        bArr[i4] = (byte) i2;
        bArr[i3 - 3] = (byte) (i2 >>> 8);
        bArr[i3 - 2] = (byte) (i2 >>> 16);
        bArr[i3 - 1] = (byte) (i2 >>> 24);
    }

    public final void writeFixed64(long j) {
        require(8);
        int i2 = this.arrayLimit;
        int i3 = i2 - 8;
        this.arrayLimit = i3;
        byte[] bArr = this.array;
        bArr[i3] = (byte) (j & 255);
        bArr[i2 - 7] = (byte) ((j >>> 8) & 255);
        bArr[i2 - 6] = (byte) ((j >>> 16) & 255);
        bArr[i2 - 5] = (byte) ((j >>> 24) & 255);
        bArr[i2 - 4] = (byte) ((j >>> 32) & 255);
        bArr[i2 - 3] = (byte) ((j >>> 40) & 255);
        bArr[i2 - 2] = (byte) ((j >>> 48) & 255);
        bArr[i2 - 1] = (byte) ((j >>> 56) & 255);
    }

    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
