package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProtoReader32AsProtoReader extends ProtoReader {
    private final ProtoReader32 delegate;

    public final ProtoReader32 getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtoReader32AsProtoReader(@NotNull ProtoReader32 protoReader32) {
        super(new TTBaseActivity());
        Intrinsics.checkNotNullParameter(protoReader32, "");
        this.delegate = protoReader32;
    }

    @Override // com.squareup.wire.ProtoReader
    public long beginMessage() {
        return this.delegate.beginMessage();
    }

    @Override // com.squareup.wire.ProtoReader
    public TTBaseLandingPageActivity endMessageAndGetUnknownFields(long j) {
        return this.delegate.endMessageAndGetUnknownFields((int) j);
    }

    @Override // com.squareup.wire.ProtoReader
    public int nextLengthDelimited() {
        return this.delegate.nextLengthDelimited();
    }

    @Override // com.squareup.wire.ProtoReader
    public int nextTag() {
        return this.delegate.nextTag();
    }

    @Override // com.squareup.wire.ProtoReader
    public FieldEncoding peekFieldEncoding() {
        return this.delegate.peekFieldEncoding();
    }

    @Override // com.squareup.wire.ProtoReader
    public void skip() throws IOException {
        this.delegate.skip();
    }

    @Override // com.squareup.wire.ProtoReader
    public TTBaseLandingPageActivity readBytes() {
        return this.delegate.readBytes();
    }

    @Override // com.squareup.wire.ProtoReader
    public boolean beforePossiblyPackedScalar$wire_runtime() {
        return this.delegate.beforePossiblyPackedScalar();
    }

    @Override // com.squareup.wire.ProtoReader
    public String readString() {
        return this.delegate.readString();
    }

    @Override // com.squareup.wire.ProtoReader
    public int readVarint32() {
        return this.delegate.readVarint32();
    }

    @Override // com.squareup.wire.ProtoReader
    public long readVarint64() {
        return this.delegate.readVarint64();
    }

    @Override // com.squareup.wire.ProtoReader
    public int readFixed32() {
        return this.delegate.readFixed32();
    }

    @Override // com.squareup.wire.ProtoReader
    public long readFixed64() {
        return this.delegate.readFixed64();
    }

    @Override // com.squareup.wire.ProtoReader
    public void readUnknownField(int i2) {
        this.delegate.readUnknownField(i2);
    }

    @Override // com.squareup.wire.ProtoReader
    public void addUnknownField(int i2, @NotNull FieldEncoding fieldEncoding, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "");
        this.delegate.addUnknownField(i2, fieldEncoding, obj);
    }

    @Override // com.squareup.wire.ProtoReader
    public long nextFieldMinLengthInBytes() {
        return this.delegate.nextFieldMinLengthInBytes();
    }
}
