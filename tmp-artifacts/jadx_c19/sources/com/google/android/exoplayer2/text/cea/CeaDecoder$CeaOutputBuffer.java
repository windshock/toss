package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.decoder.DecoderOutputBuffer$Owner;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class CeaDecoder$CeaOutputBuffer extends SubtitleOutputBuffer {
    private DecoderOutputBuffer$Owner<CeaDecoder$CeaOutputBuffer> owner;

    public CeaDecoder$CeaOutputBuffer(DecoderOutputBuffer$Owner<CeaDecoder$CeaOutputBuffer> decoderOutputBuffer$Owner) {
        this.owner = decoderOutputBuffer$Owner;
    }

    public final void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
