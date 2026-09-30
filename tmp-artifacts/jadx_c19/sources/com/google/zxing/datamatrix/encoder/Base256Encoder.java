package com.google.zxing.datamatrix.encoder;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Base256Encoder implements Encoder {
    public int getEncodingMode() {
        return 5;
    }

    Base256Encoder() {
    }

    public void encode(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            sb.append(encoderContext.getCurrentChar());
            encoderContext.pos++;
            if (HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                encoderContext.signalEncoderChange(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int codewordCount = encoderContext.getCodewordCount() + length + 1;
        encoderContext.updateSymbolInfo(codewordCount);
        boolean z = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount > 0;
        if (encoderContext.hasMoreCharacters() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: " + length);
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i2 = 0; i2 < length2; i2++) {
            encoderContext.writeCodeword(randomize255State(sb.charAt(i2), encoderContext.getCodewordCount() + 1));
        }
    }

    private static char randomize255State(char c, int i2) {
        int i3 = c + ((i2 * 149) % OggPageHeader.MAX_SEGMENT_COUNT) + 1;
        return i3 <= 255 ? (char) i3 : (char) (i3 - 256);
    }
}
