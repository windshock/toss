package com.google.android.exoplayer2.text.cea;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Cea708Decoder$DtvCcPacket {
    int currentIndex = 0;
    public final byte[] packetData;
    public final int packetSize;
    public final int sequenceNumber;

    public Cea708Decoder$DtvCcPacket(int i2, int i3) {
        this.sequenceNumber = i2;
        this.packetSize = i3;
        this.packetData = new byte[(i3 << 1) - 1];
    }
}
