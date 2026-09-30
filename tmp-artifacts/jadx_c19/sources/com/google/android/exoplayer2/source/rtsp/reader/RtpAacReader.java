package com.google.android.exoplayer2.source.rtsp.reader;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtpAacReader implements RtpPayloadReader {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String AAC_HIGH_BITRATE_MODE = "AAC-hbr";
    private static final String AAC_LOW_BITRATE_MODE = "AAC-lbr";
    private static int IAuthTabCallback = 1;
    private static final String TAG = "RtpAacReader";
    private static int onExtraCallbackWithResult = 0;
    private static long onWarmupCompleted = -5631556627244905383L;
    private final ParsableBitArray auHeaderScratchBit = new ParsableBitArray();
    private final int auIndexFieldBitSize;
    private final int auSizeFieldBitSize;
    private long firstReceivedTimestamp;
    private final int numBitsInAuHeader;
    private final RtpPayloadFormat payloadFormat;
    private final int sampleRate;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;

    public RtpAacReader(RtpPayloadFormat rtpPayloadFormat) throws Throwable {
        this.payloadFormat = rtpPayloadFormat;
        this.sampleRate = rtpPayloadFormat.clockRate;
        ImmutableMap<String, String> immutableMap = rtpPayloadFormat.fmtpParameters;
        Object[] objArr = new Object[1];
        a(new char[]{7104, 7085, 15859, 19145, 44686, 16448, 59693, 36023}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        String str = (String) Assertions.checkNotNull((String) immutableMap.get(((String) objArr[0]).intern()));
        if (Ascii.equalsIgnoreCase(str, AAC_HIGH_BITRATE_MODE)) {
            this.auSizeFieldBitSize = 13;
            this.auIndexFieldBitSize = 3;
        } else {
            if (!Ascii.equalsIgnoreCase(str, AAC_LOW_BITRATE_MODE)) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.auSizeFieldBitSize = 6;
            this.auIndexFieldBitSize = 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.numBitsInAuHeader = this.auIndexFieldBitSize + this.auSizeFieldBitSize;
        int i4 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $10 + 121;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $10 + 69;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45812), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 83, ((byte) KeyEvent.getModifierMetaStateMask()) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14185), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, 8808 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        TrackOutput trackOutputTrack = extractorOutput.track(i2, 1);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
        int i6 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 45;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        int i6 = i4 % 2;
        this.firstReceivedTimestamp = j;
        if (i6 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i5 + 87;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j, int i2, boolean z) {
        int i3 = 2 % 2;
        Assertions.checkNotNull(this.trackOutput);
        short s = parsableByteArray.readShort();
        int i4 = s / this.numBitsInAuHeader;
        long sampleTimeUs = toSampleTimeUs(this.startTimeOffsetUs, j, this.firstReceivedTimestamp, this.sampleRate);
        this.auHeaderScratchBit.reset(parsableByteArray);
        int i5 = 0;
        if (i4 == 1) {
            int bits = this.auHeaderScratchBit.readBits(this.auSizeFieldBitSize);
            this.auHeaderScratchBit.skipBits(this.auIndexFieldBitSize);
            this.trackOutput.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
            if (z) {
                int i6 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    outputSampleMetadata(this.trackOutput, sampleTimeUs, bits);
                    return;
                } else {
                    outputSampleMetadata(this.trackOutput, sampleTimeUs, bits);
                    int i7 = 37 / 0;
                    return;
                }
            }
            return;
        }
        parsableByteArray.skipBytes((s + 7) / 8);
        while (i5 < i4) {
            int bits2 = this.auHeaderScratchBit.readBits(this.auSizeFieldBitSize);
            this.auHeaderScratchBit.skipBits(this.auIndexFieldBitSize);
            this.trackOutput.sampleData(parsableByteArray, bits2);
            outputSampleMetadata(this.trackOutput, sampleTimeUs, bits2);
            sampleTimeUs += Util.scaleLargeTimestamp(i4, 1000000L, this.sampleRate);
            i5++;
            int i8 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j, long j2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        this.firstReceivedTimestamp = j;
        this.startTimeOffsetUs = j2;
        int i6 = i4 + 81;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void outputSampleMetadata(TrackOutput trackOutput, long j, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        trackOutput.sampleMetadata(j, 1, i2, 0, (TrackOutput.CryptoData) null);
        int i6 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    private static long toSampleTimeUs(long j, long j2, long j3, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        long jScaleLargeTimestamp = j + Util.scaleLargeTimestamp(j2 - j3, 1000000L, i2);
        int i6 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return jScaleLargeTimestamp;
    }
}
