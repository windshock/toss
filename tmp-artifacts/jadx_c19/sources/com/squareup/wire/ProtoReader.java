package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ProtoReader {
    public static final Companion Companion = new Companion(null);
    public static final int FIELD_ENCODING_MASK = 7;
    public static final int RECURSION_LIMIT = 100;
    public static final int STATE_END_GROUP = 4;
    public static final int STATE_FIXED32 = 5;
    public static final int STATE_FIXED64 = 1;
    public static final int STATE_LENGTH_DELIMITED = 2;
    public static final int STATE_PACKED_TAG = 7;
    public static final int STATE_START_GROUP = 3;
    public static final int STATE_TAG = 6;
    public static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;
    private final List<TTBaseActivity> bufferStack;
    private long limit;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit;
    private int recursionDepth;
    private final TTAppOpenAdTransActivity source;
    private int state;
    private int tag;

    public ProtoReader(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        this.source = tTAppOpenAdTransActivity;
        this.limit = Long.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    public long beginMessage() throws IOException {
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
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    public TTBaseLandingPageActivity endMessageAndGetUnknownFields(long j) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i2 = this.recursionDepth - 1;
        this.recursionDepth = i2;
        if (i2 < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos != this.limit && i2 != 0) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        this.limit = j;
        TTBaseActivity tTBaseActivity = this.bufferStack.get(i2);
        if (tTBaseActivity.ICustomTabsCallbackDefault() > 0) {
            return tTBaseActivity.writeTypedObject();
        }
        return TTBaseLandingPageActivity.EMPTY;
    }

    @Deprecated
    public final void endMessage(long j) throws IOException {
        endMessageAndGetUnknownFields(j);
    }

    public int nextLengthDelimited() throws IOException {
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
        long j = this.limit;
        this.pushedLimit = j;
        long j2 = this.pos + iInternalReadVarint32;
        this.limit = j2;
        if (j2 <= j) {
            return iInternalReadVarint32;
        }
        throw new EOFException();
    }

    public int nextTag() throws IOException {
        int i2 = this.state;
        if (i2 == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i2 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.IAuthTabCallback_Parcel()) {
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

    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public void skip() throws IOException {
        int i2 = this.state;
        if (i2 == 0) {
            readVarint64();
            return;
        }
        if (i2 == 1) {
            readFixed64();
            return;
        }
        if (i2 == 2) {
            this.source.IAuthTabCallbackDefault(beforeLengthDelimitedScalar());
        } else {
            if (i2 == 5) {
                readFixed32();
                return;
            }
            throw new IllegalStateException("Unexpected call to skip()");
        }
    }

    private final void skipGroup(int i2) throws IOException {
        while (this.pos < this.limit && !this.source.IAuthTabCallback_Parcel()) {
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
                    long jInternalReadVarint32 = internalReadVarint32();
                    this.pos += jInternalReadVarint32;
                    this.source.IAuthTabCallbackDefault(jInternalReadVarint32);
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

    public TTBaseLandingPageActivity readBytes() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.IAuthTabCallbackStub(jBeforeLengthDelimitedScalar);
        return this.source.onNavigationEvent(jBeforeLengthDelimitedScalar);
    }

    public boolean beforePossiblyPackedScalar$wire_runtime() throws ProtocolException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1L;
                this.state = 6;
                return false;
            }
            if (i2 != 5) {
                throw new ProtocolException("unexpected state: " + this.state);
            }
        }
        return true;
    }

    public String readString() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.IAuthTabCallbackStub(jBeforeLengthDelimitedScalar);
        return this.source.IAuthTabCallback(jBeforeLengthDelimitedScalar);
    }

    public int readVarint32() throws IOException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        int iInternalReadVarint32 = internalReadVarint32();
        afterPackableScalar(0);
        return iInternalReadVarint32;
    }

    private final int internalReadVarint32() throws ProtocolException {
        int i2;
        this.source.IAuthTabCallbackStub(1L);
        this.pos++;
        byte bICustomTabsCallback = this.source.ICustomTabsCallback();
        if (bICustomTabsCallback >= 0) {
            return bICustomTabsCallback;
        }
        int i3 = bICustomTabsCallback & Byte.MAX_VALUE;
        this.source.IAuthTabCallbackStub(1L);
        this.pos++;
        byte bICustomTabsCallback2 = this.source.ICustomTabsCallback();
        if (bICustomTabsCallback2 >= 0) {
            i2 = bICustomTabsCallback2 << 7;
        } else {
            i3 |= (bICustomTabsCallback2 & Byte.MAX_VALUE) << 7;
            this.source.IAuthTabCallbackStub(1L);
            this.pos++;
            byte bICustomTabsCallback3 = this.source.ICustomTabsCallback();
            if (bICustomTabsCallback3 >= 0) {
                i2 = bICustomTabsCallback3 << 14;
            } else {
                i3 |= (bICustomTabsCallback3 & Byte.MAX_VALUE) << 14;
                this.source.IAuthTabCallbackStub(1L);
                this.pos++;
                byte bICustomTabsCallback4 = this.source.ICustomTabsCallback();
                if (bICustomTabsCallback4 < 0) {
                    this.source.IAuthTabCallbackStub(1L);
                    this.pos++;
                    byte bICustomTabsCallback5 = this.source.ICustomTabsCallback();
                    if (bICustomTabsCallback5 < 0) {
                        for (int i4 = 0; i4 < 5; i4++) {
                            this.source.IAuthTabCallbackStub(1L);
                            this.pos++;
                            if (this.source.ICustomTabsCallback() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i3 | ((bICustomTabsCallback4 & Byte.MAX_VALUE) << 21) | (bICustomTabsCallback5 << 28);
                }
                i2 = bICustomTabsCallback4 << 21;
            }
        }
        return i3 | i2;
    }

    public long readVarint64() throws IOException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            this.source.IAuthTabCallbackStub(1L);
            this.pos++;
            j |= (r4 & Byte.MAX_VALUE) << i3;
            if ((this.source.ICustomTabsCallback() & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public int readFixed32() throws IOException {
        int i2 = this.state;
        if (i2 != 5 && i2 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.IAuthTabCallbackStub(4L);
        this.pos += 4;
        int iOnActivityLayout = this.source.onActivityLayout();
        afterPackableScalar(5);
        return iOnActivityLayout;
    }

    public long readFixed64() throws IOException {
        int i2 = this.state;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.IAuthTabCallbackStub(8L);
        this.pos += 8;
        long jOnMinimized = this.source.onMinimized();
        afterPackableScalar(1);
        return jOnMinimized;
    }

    private final void afterPackableScalar(int i2) throws IOException {
        if (this.state == i2) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j == j2) {
            this.limit = this.pushedLimit;
            this.pushedLimit = -1L;
            this.state = 6;
            return;
        }
        this.state = 7;
    }

    private final long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        long j = this.limit - this.pos;
        this.source.IAuthTabCallbackStub(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
    }

    /* renamed from: -forEachTag, reason: not valid java name */
    public final TTBaseLandingPageActivity m125forEachTag(@NotNull Function1<? super Integer, ? extends Object> function1) throws IOException {
        Intrinsics.checkNotNullParameter(function1, "");
        long jBeginMessage = beginMessage();
        while (true) {
            int iNextTag = nextTag();
            if (iNextTag != -1) {
                function1.invoke(Integer.valueOf(iNextTag));
            } else {
                return endMessageAndGetUnknownFields(jBeginMessage);
            }
        }
    }

    public void readUnknownField(int i2) throws NoWhenBranchMatchedException {
        FieldEncoding fieldEncodingPeekFieldEncoding = peekFieldEncoding();
        Intrinsics.checkNotNull(fieldEncodingPeekFieldEncoding);
        addUnknownField(i2, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(this));
    }

    public void addUnknownField(int i2, @NotNull FieldEncoding fieldEncoding, @Nullable Object obj) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(fieldEncoding, "");
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
        Intrinsics.checkNotNull(protoAdapterRawProtoAdapter, "");
        protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, i2, obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public long nextFieldMinLengthInBytes() throws NoWhenBranchMatchedException {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i2 = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i2 == -1) {
            throw new IllegalStateException("nextFieldEncoding is not set");
        }
        if (i2 == 1) {
            return this.limit - this.pos;
        }
        if (i2 == 2) {
            return 4L;
        }
        if (i2 == 3) {
            return 8L;
        }
        if (i2 == 4) {
            return 1L;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
