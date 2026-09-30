package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer$Owner;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class CeaDecoder$$ExternalSyntheticLambda0 implements DecoderOutputBuffer$Owner {
    public final /* synthetic */ CeaDecoder f$0;

    @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer$Owner
    public final void releaseOutputBuffer(DecoderOutputBuffer decoderOutputBuffer) {
        this.f$0.releaseOutputBuffer((CeaDecoder$CeaOutputBuffer) decoderOutputBuffer);
    }
}
