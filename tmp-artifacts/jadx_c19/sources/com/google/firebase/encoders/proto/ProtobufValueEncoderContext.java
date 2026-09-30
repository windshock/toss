package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ProtobufValueEncoderContext implements ValueEncoderContext {
    private FieldDescriptor field;
    private final ProtobufDataEncoderContext objEncoderCtx;
    private boolean encoded = false;
    private boolean skipDefault = false;

    ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.objEncoderCtx = protobufDataEncoderContext;
    }

    void resetContext(FieldDescriptor fieldDescriptor, boolean z) {
        this.encoded = false;
        this.field = fieldDescriptor;
        this.skipDefault = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    private void checkNotUsed() throws EncodingException {
        if (this.encoded) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.encoded = true;
    }

    public ValueEncoderContext add(@Nullable String str) throws EncodingException, IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, str, this.skipDefault);
        return this;
    }

    public ValueEncoderContext add(float f) throws EncodingException, IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, f, this.skipDefault);
        return this;
    }

    public ValueEncoderContext add(double d) throws EncodingException, IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, d, this.skipDefault);
        return this;
    }

    public ValueEncoderContext add(int i2) throws EncodingException, IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, i2, this.skipDefault);
        return this;
    }

    public ValueEncoderContext add(long j) throws EncodingException, IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, j, this.skipDefault);
        return this;
    }

    public ValueEncoderContext add(boolean z) throws EncodingException, IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, z, this.skipDefault);
        return this;
    }

    public ValueEncoderContext add(@NonNull byte[] bArr) throws EncodingException, IOException {
        checkNotUsed();
        this.objEncoderCtx.add(this.field, bArr, this.skipDefault);
        return this;
    }
}
