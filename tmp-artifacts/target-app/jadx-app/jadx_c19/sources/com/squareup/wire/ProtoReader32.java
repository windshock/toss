package com.squareup.wire;

import java.io.IOException;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ProtoReader32 {
    void addUnknownField(int i2, @NotNull FieldEncoding fieldEncoding, @Nullable Object obj);

    ProtoReader asProtoReader();

    boolean beforePossiblyPackedScalar() throws IOException;

    int beginMessage() throws IOException;

    TTBaseLandingPageActivity endMessageAndGetUnknownFields(int i2) throws IOException;

    int nextFieldMinLengthInBytes();

    int nextLengthDelimited() throws IOException;

    int nextTag() throws IOException;

    FieldEncoding peekFieldEncoding();

    TTBaseLandingPageActivity readBytes() throws IOException;

    int readFixed32() throws IOException;

    long readFixed64() throws IOException;

    String readString() throws IOException;

    void readUnknownField(int i2);

    int readVarint32() throws IOException;

    long readVarint64() throws IOException;

    void skip() throws IOException;
}
