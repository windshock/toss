package com.google.protobuf;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
enum WireFormat$Utf8Validation {
    LOOSE { // from class: com.google.protobuf.WireFormat$Utf8Validation.1
        @Override // com.google.protobuf.WireFormat$Utf8Validation
        Object readString(CodedInputStream codedInputStream) throws IOException {
            return codedInputStream.readString();
        }
    },
    STRICT { // from class: com.google.protobuf.WireFormat$Utf8Validation.2
        @Override // com.google.protobuf.WireFormat$Utf8Validation
        Object readString(CodedInputStream codedInputStream) throws IOException {
            return codedInputStream.readStringRequireUtf8();
        }
    },
    LAZY { // from class: com.google.protobuf.WireFormat$Utf8Validation.3
        @Override // com.google.protobuf.WireFormat$Utf8Validation
        Object readString(CodedInputStream codedInputStream) throws IOException {
            return codedInputStream.readBytes();
        }
    };

    abstract Object readString(CodedInputStream codedInputStream) throws IOException;
}
