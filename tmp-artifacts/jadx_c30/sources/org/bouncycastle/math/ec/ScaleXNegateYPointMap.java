package org.bouncycastle.math.ec;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ScaleXNegateYPointMap implements ECPointMap {
    protected final ECFieldElement scale;

    public ScaleXNegateYPointMap(ECFieldElement eCFieldElement) {
        this.scale = eCFieldElement;
    }

    public ECPoint map(ECPoint eCPoint) {
        return eCPoint.scaleXNegateY(this.scale);
    }
}
