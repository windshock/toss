package org.tensorflow.lite.support.common;

import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface TensorOperator extends Operator<TensorBuffer> {
    @Override // org.tensorflow.lite.support.common.Operator
    TensorBuffer apply(TensorBuffer tensorBuffer);
}
