package org.tensorflow.lite.acceleration;

import org.tensorflow.lite.InterpreterApi;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ValidatedAccelerationConfig {
    void apply(InterpreterApi.Options options);

    byte[] serialize();
}
