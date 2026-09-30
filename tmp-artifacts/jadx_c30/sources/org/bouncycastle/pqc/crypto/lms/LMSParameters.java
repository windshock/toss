package org.bouncycastle.pqc.crypto.lms;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class LMSParameters {
    private final LMOtsParameters lmOTSParam;
    private final LMSigParameters lmSigParam;

    public LMSParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters) {
        this.lmSigParam = lMSigParameters;
        this.lmOTSParam = lMOtsParameters;
    }

    public LMOtsParameters getLMOTSParam() {
        return this.lmOTSParam;
    }

    public LMSigParameters getLMSigParam() {
        return this.lmSigParam;
    }
}
