package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import gatewayprotocol.v1.ErrorOuterClass;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface ErrorOuterClass$ErrorOrBuilder extends MessageLiteOrBuilder {
    ErrorOuterClass.PublicErrorCode getErrorCode();

    int getErrorCodeValue();

    String getErrorText();

    ByteString getErrorTextBytes();

    ByteString getErrorToken();
}
