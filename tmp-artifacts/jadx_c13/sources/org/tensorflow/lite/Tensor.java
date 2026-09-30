package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Tensor {
    ByteBuffer asReadOnlyBuffer();

    DataType dataType();

    int index();

    String name();

    int numBytes();

    int numDimensions();

    int numElements();

    QuantizationParams quantizationParams();

    int[] shape();

    int[] shapeSignature();

    public static class QuantizationParams {
        private final float scale;
        private final int zeroPoint;

        public QuantizationParams(float f, int i) {
            this.scale = f;
            this.zeroPoint = i;
        }

        public float getScale() {
            return this.scale;
        }

        public int getZeroPoint() {
            return this.zeroPoint;
        }
    }
}
