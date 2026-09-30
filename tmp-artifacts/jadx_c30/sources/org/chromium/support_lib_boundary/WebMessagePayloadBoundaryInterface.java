package org.chromium.support_lib_boundary;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    byte[] getAsArrayBuffer();

    String getAsString();

    int getType();
}
