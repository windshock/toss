package gatewayprotocol.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder extends MessageLiteOrBuilder {
    int getConnectTimeoutMs();

    int getOverallTimeoutMs();

    int getReadTimeoutMs();

    int getWriteTimeoutMs();
}
