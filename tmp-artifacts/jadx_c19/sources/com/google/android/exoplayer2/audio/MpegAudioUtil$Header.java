package com.google.android.exoplayer2.audio;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MpegAudioUtil$Header {
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;

    public boolean setForHeaderData(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!MpegAudioUtil.access$000(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        this.version = i3;
        this.mimeType = MpegAudioUtil.access$100()[3 - i4];
        int i7 = MpegAudioUtil.access$200()[i6];
        this.sampleRate = i7;
        if (i3 == 2) {
            this.sampleRate = i7 / 2;
        } else if (i3 == 0) {
            this.sampleRate = i7 / 4;
        }
        int i8 = (i2 >>> 9) & 1;
        this.samplesPerFrame = MpegAudioUtil.access$300(i3, i4);
        if (i4 == 3) {
            int i9 = i3 == 3 ? MpegAudioUtil.access$400()[i5 - 1] : MpegAudioUtil.access$500()[i5 - 1];
            this.bitrate = i9;
            this.frameSize = (((i9 * 12) / this.sampleRate) + i8) << 2;
        } else {
            if (i3 == 3) {
                int i10 = i4 == 2 ? MpegAudioUtil.access$600()[i5 - 1] : MpegAudioUtil.access$700()[i5 - 1];
                this.bitrate = i10;
                this.frameSize = ((i10 * 144) / this.sampleRate) + i8;
            } else {
                int i11 = MpegAudioUtil.access$800()[i5 - 1];
                this.bitrate = i11;
                this.frameSize = (((i4 == 1 ? 72 : 144) * i11) / this.sampleRate) + i8;
            }
        }
        this.channels = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
