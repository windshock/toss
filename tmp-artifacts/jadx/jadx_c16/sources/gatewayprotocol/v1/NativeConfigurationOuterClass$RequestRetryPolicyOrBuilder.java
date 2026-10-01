package gatewayprotocol.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder extends MessageLiteOrBuilder {
    int getMaxDuration();

    float getRetryJitterPct();

    int getRetryMaxInterval();

    float getRetryScalingFactor();

    int getRetryWaitBase();

    boolean getShouldStoreLocally();
}
