package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ByteArrayProtoReader32 implements ProtoReader32 {
    private final List<TTBaseActivity> bufferStack;
    private int limit;
    private FieldEncoding nextFieldEncoding;
    private int pos;
    private ProtoReader32AsProtoReader protoReader;
    private int pushedLimit;
    private int recursionDepth;
    private final byte[] source;
    private int state;
    private int tag;

    public ByteArrayProtoReader32(@NotNull byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.source = bArr;
        this.pos = i2;
        this.limit = i3;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1;
        this.bufferStack = new ArrayList();
    }

    public /* synthetic */ ByteArrayProtoReader32(byte[] bArr, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? bArr.length : i3);
    }

    @Override // com.squareup.wire.ProtoReader32
    public ProtoReader asProtoReader() {
        ProtoReader32AsProtoReader protoReader32AsProtoReader = this.protoReader;
        if (protoReader32AsProtoReader != null) {
            return protoReader32AsProtoReader;
        }
        ProtoReader32AsProtoReader protoReader32AsProtoReader2 = new ProtoReader32AsProtoReader(this);
        this.protoReader = protoReader32AsProtoReader2;
        return protoReader32AsProtoReader2;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int beginMessage() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i2 = this.recursionDepth + 1;
        this.recursionDepth = i2;
        if (i2 > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        if (i2 > this.bufferStack.size()) {
            this.bufferStack.add(new TTBaseActivity());
        }
        int i3 = this.pushedLimit;
        this.pushedLimit = -1;
        this.state = 6;
        return i3;
    }

    @Override // com.squareup.wire.ProtoReader32
    public TTBaseLandingPageActivity endMessageAndGetUnknownFields(int i2) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i3 = this.recursionDepth - 1;
        this.recursionDepth = i3;
        if (i3 < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos != this.limit && i3 != 0) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        this.limit = i2;
        TTBaseActivity tTBaseActivity = this.bufferStack.get(i3);
        if (tTBaseActivity.ICustomTabsCallbackDefault() > 0) {
            return tTBaseActivity.writeTypedObject();
        }
        return TTBaseLandingPageActivity.EMPTY;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextLengthDelimited() {
        int i2 = this.state;
        if (i2 == 6 || i2 == 2) {
            return internalNextLengthDelimited();
        }
        throw new IllegalStateException("Unexpected call to nextDelimited()");
    }

    private final int internalNextLengthDelimited() throws ProtocolException, EOFException {
        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        this.state = 2;
        int iInternalReadVarint32 = internalReadVarint32();
        if (iInternalReadVarint32 < 0) {
            throw new ProtocolException("Negative length: " + iInternalReadVarint32);
        }
        if (this.pushedLimit != -1) {
            throw new IllegalStateException();
        }
        int i2 = this.limit;
        this.pushedLimit = i2;
        int i3 = this.pos + iInternalReadVarint32;
        this.limit = i3;
        if (i3 <= i2) {
            return iInternalReadVarint32;
        }
        throw new EOFException();
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextTag() throws IOException {
        int i2 = this.state;
        if (i2 == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i2 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = iInternalReadVarint32 >> 3;
            this.tag = i3;
            int i4 = iInternalReadVarint32 & 7;
            if (i4 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i3;
            }
            if (i4 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i3;
            }
            if (i4 == 2) {
                internalNextLengthDelimited();
                return this.tag;
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i4 == 5) {
                    this.nextFieldEncoding = FieldEncoding.FIXED32;
                    this.state = 5;
                    return i3;
                }
                throw new ProtocolException("Unexpected field encoding: " + i4);
            }
            skipGroup(i3);
        }
        return -1;
    }

    @Override // com.squareup.wire.ProtoReader32
    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    @Override // com.squareup.wire.ProtoReader32
    public void skip() throws IOException {
        int i2 = this.state;
        if (i2 == 0) {
            readVarint64();
            return;
        }
        if (i2 == 1) {
            readFixed64();
        } else if (i2 == 2) {
            skip(beforeLengthDelimitedScalar());
        } else {
            if (i2 == 5) {
                readFixed32();
                return;
            }
            throw new IllegalStateException("Unexpected call to skip()");
        }
    }

    private final void skipGroup(int i2) throws IOException {
        while (this.pos < this.limit) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = iInternalReadVarint32 >> 3;
            int i4 = iInternalReadVarint32 & 7;
            if (i4 != 0) {
                if (i4 == 1) {
                    this.state = 1;
                    readFixed64();
                } else if (i4 == 2) {
                    skip(internalReadVarint32());
                } else {
                    if (i4 == 3) {
                        int i5 = this.recursionDepth + 1;
                        this.recursionDepth = i5;
                        if (i5 > 100) {
                            throw new IOException("Wire recursion limit exceeded");
                        }
                        try {
                            skipGroup(i3);
                        } finally {
                        }
                        this.recursionDepth--;
                    }
                    if (i4 == 4) {
                        if (i3 != i2) {
                            throw new ProtocolException("Unexpected end group");
                        }
                        return;
                    } else if (i4 == 5) {
                        this.state = 5;
                        readFixed32();
                    } else {
                        throw new ProtocolException("Unexpected field encoding: " + i4);
                    }
                }
            } else {
                this.state = 0;
                readVarint64();
            }
        }
        throw new EOFException();
    }

    @Override // com.squareup.wire.ProtoReader32
    public TTBaseLandingPageActivity readBytes() {
        return readByteString(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public boolean beforePossiblyPackedScalar() throws ProtocolException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1;
                this.state = 6;
                return false;
            }
            if (i2 != 5) {
                throw new ProtocolException("unexpected state: " + this.state);
            }
        }
        return true;
    }

    @Override // com.squareup.wire.ProtoReader32
    public String readString() {
        return readUtf8(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readVarint32() throws IOException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        int iInternalReadVarint32 = internalReadVarint32();
        afterPackableScalar(0);
        return iInternalReadVarint32;
    }

    private final int internalReadVarint32() throws ProtocolException, EOFException {
        int i2;
        byte b = readByte();
        if (b >= 0) {
            return b;
        }
        int i3 = b & Byte.MAX_VALUE;
        byte b2 = readByte();
        if (b2 >= 0) {
            i2 = b2 << 7;
        } else {
            i3 |= (b2 & Byte.MAX_VALUE) << 7;
            byte b3 = readByte();
            if (b3 >= 0) {
                i2 = b3 << 14;
            } else {
                i3 |= (b3 & Byte.MAX_VALUE) << 14;
                byte b4 = readByte();
                if (b4 < 0) {
                    byte b5 = readByte();
                    if (b5 < 0) {
                        for (int i4 = 0; i4 < 5; i4++) {
                            if (readByte() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i3 | ((b4 & Byte.MAX_VALUE) << 21) | (b5 << 28);
                }
                i2 = b4 << 21;
            }
        }
        return i3 | i2;
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readVarint64() throws IOException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            j |= (r4 & Byte.MAX_VALUE) << i3;
            if ((readByte() & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readFixed32() throws IOException {
        int i2 = this.state;
        if (i2 != 5 && i2 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        int intLe = readIntLe();
        afterPackableScalar(5);
        return intLe;
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readFixed64() throws IOException {
        int i2 = this.state;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        long longLe = readLongLe();
        afterPackableScalar(1);
        return longLe;
    }

    private final void afterPackableScalar(int i2) throws IOException {
        if (this.state == i2) {
            this.state = 6;
            return;
        }
        int i3 = this.pos;
        int i4 = this.limit;
        if (i3 > i4) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (i3 == i4) {
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            this.state = 6;
            return;
        }
        this.state = 7;
    }

    private final int beforeLengthDelimitedScalar() throws ProtocolException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        int i2 = this.limit;
        int i3 = this.pos;
        this.state = 6;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1;
        return i2 - i3;
    }

    @Override // com.squareup.wire.ProtoReader32
    public void readUnknownField(int i2) throws NoWhenBranchMatchedException {
        FieldEncoding fieldEncodingPeekFieldEncoding = peekFieldEncoding();
        Intrinsics.checkNotNull(fieldEncodingPeekFieldEncoding);
        addUnknownField(i2, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(this));
    }

    @Override // com.squareup.wire.ProtoReader32
    public void addUnknownField(int i2, @NotNull FieldEncoding fieldEncoding, @Nullable Object obj) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(fieldEncoding, "");
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
        Intrinsics.checkNotNull(protoAdapterRawProtoAdapter, "");
        protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, i2, obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.squareup.wire.ProtoReader32
    public int nextFieldMinLengthInBytes() throws NoWhenBranchMatchedException {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i2 = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i2 == -1) {
            throw new IllegalStateException("nextFieldEncoding is not set");
        }
        if (i2 == 1) {
            return this.limit - this.pos;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3) {
            return 8;
        }
        if (i2 == 4) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void skip(int i2) throws EOFException {
        int i3 = this.pos + i2;
        if (i3 > this.limit) {
            throw new EOFException();
        }
        this.pos = i3;
    }

    private final TTBaseLandingPageActivity readByteString(int i2) throws EOFException {
        int i3 = this.pos;
        int i4 = i3 + i2;
        if (i4 > this.limit) {
            throw new EOFException();
        }
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnWarmupCompleted = TTBaseLandingPageActivity.Companion.onWarmupCompleted(this.source, i3, i2);
        this.pos = i4;
        return tTBaseLandingPageActivityOnWarmupCompleted;
    }

    private final String readUtf8(int i2) throws EOFException {
        int i3 = this.pos;
        int i4 = i2 + i3;
        if (i4 > this.limit) {
            throw new EOFException();
        }
        String strDecodeToString$default = StringsKt.decodeToString$default(this.source, i3, i4, false, 4, (Object) null);
        this.pos = i4;
        return strDecodeToString$default;
    }

    private final byte readByte() throws EOFException {
        int i2 = this.pos;
        if (i2 == this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        this.pos = i2 + 1;
        return bArr[i2];
    }

    private final int readIntLe() throws EOFException {
        int i2 = this.pos;
        int i3 = i2 + 4;
        if (i3 > this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        byte b = bArr[i2];
        byte b2 = bArr[i2 + 1];
        byte b3 = bArr[i2 + 2];
        this.pos = i3;
        return ((bArr[i2 + 3] & 255) << 24) | ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16);
    }

    private final long readLongLe() throws EOFException {
        int i2 = this.pos;
        int i3 = i2 + 8;
        if (i3 > this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        long j = bArr[i2];
        long j2 = bArr[i2 + 1];
        long j3 = bArr[i2 + 2];
        long j4 = bArr[i2 + 3];
        long j5 = bArr[i2 + 4];
        long j6 = bArr[i2 + 5];
        long j7 = bArr[i2 + 6];
        this.pos = i3;
        return ((bArr[i2 + 7] & 255) << 56) | ((255 & j7) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }
}
