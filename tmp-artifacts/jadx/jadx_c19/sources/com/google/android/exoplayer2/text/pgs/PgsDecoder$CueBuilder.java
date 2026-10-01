package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class PgsDecoder$CueBuilder {
    private int bitmapHeight;
    private int bitmapWidth;
    private int bitmapX;
    private int bitmapY;
    private boolean colorsSet;
    private int planeHeight;
    private int planeWidth;
    private final ParsableByteArray bitmapData = new ParsableByteArray();
    private final int[] colors = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void parsePaletteSection(ParsableByteArray parsableByteArray, int i2) {
        if (i2 % 5 != 2) {
            return;
        }
        parsableByteArray.skipBytes(2);
        Arrays.fill(this.colors, 0);
        int i3 = i2 / 5;
        for (int i4 = 0; i4 < i3; i4++) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            int unsignedByte4 = parsableByteArray.readUnsignedByte();
            double d = unsignedByte2;
            double d2 = unsignedByte3 - 128;
            double d3 = unsignedByte4 - 128;
            int[] iArr = this.colors;
            iArr[unsignedByte] = (Util.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, OggPageHeader.MAX_SEGMENT_COUNT) << 8) | (parsableByteArray.readUnsignedByte() << 24) | (Util.constrainValue((int) ((1.402d * d2) + d), 0, OggPageHeader.MAX_SEGMENT_COUNT) << 16) | Util.constrainValue((int) (d + (d3 * 1.772d)), 0, OggPageHeader.MAX_SEGMENT_COUNT);
        }
        this.colorsSet = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseBitmapSection(ParsableByteArray parsableByteArray, int i2) {
        int unsignedInt24;
        if (i2 >= 4) {
            parsableByteArray.skipBytes(3);
            int i3 = i2 - 4;
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                if (i3 < 7 || (unsignedInt24 = parsableByteArray.readUnsignedInt24()) < 4) {
                    return;
                }
                this.bitmapWidth = parsableByteArray.readUnsignedShort();
                this.bitmapHeight = parsableByteArray.readUnsignedShort();
                this.bitmapData.reset(unsignedInt24 - 4);
                i3 = i2 - 11;
            }
            int position = this.bitmapData.getPosition();
            int iLimit = this.bitmapData.limit();
            if (position >= iLimit || i3 <= 0) {
                return;
            }
            int iMin = Math.min(i3, iLimit - position);
            parsableByteArray.readBytes(this.bitmapData.getData(), position, iMin);
            this.bitmapData.setPosition(position + iMin);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseIdentifierSection(ParsableByteArray parsableByteArray, int i2) {
        if (i2 < 19) {
            return;
        }
        this.planeWidth = parsableByteArray.readUnsignedShort();
        this.planeHeight = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(11);
        this.bitmapX = parsableByteArray.readUnsignedShort();
        this.bitmapY = parsableByteArray.readUnsignedShort();
    }

    public Cue build() {
        int unsignedByte;
        if (this.planeWidth == 0 || this.planeHeight == 0 || this.bitmapWidth == 0 || this.bitmapHeight == 0 || this.bitmapData.limit() == 0 || this.bitmapData.getPosition() != this.bitmapData.limit() || !this.colorsSet) {
            return null;
        }
        this.bitmapData.setPosition(0);
        int i2 = this.bitmapWidth * this.bitmapHeight;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int unsignedByte2 = this.bitmapData.readUnsignedByte();
            if (unsignedByte2 != 0) {
                unsignedByte = i3 + 1;
                iArr[i3] = this.colors[unsignedByte2];
            } else {
                int unsignedByte3 = this.bitmapData.readUnsignedByte();
                if (unsignedByte3 != 0) {
                    unsignedByte = ((unsignedByte3 & 64) == 0 ? unsignedByte3 & 63 : ((unsignedByte3 & 63) << 8) | this.bitmapData.readUnsignedByte()) + i3;
                    Arrays.fill(iArr, i3, unsignedByte, (unsignedByte3 & 128) == 0 ? 0 : this.colors[this.bitmapData.readUnsignedByte()]);
                }
            }
            i3 = unsignedByte;
        }
        return new Cue.Builder().setBitmap(Bitmap.createBitmap(iArr, this.bitmapWidth, this.bitmapHeight, Bitmap.Config.ARGB_8888)).setPosition(this.bitmapX / this.planeWidth).setPositionAnchor(0).setLine(this.bitmapY / this.planeHeight, 0).setLineAnchor(0).setSize(this.bitmapWidth / this.planeWidth).setBitmapHeight(this.bitmapHeight / this.planeHeight).build();
    }

    public void reset() {
        this.planeWidth = 0;
        this.planeHeight = 0;
        this.bitmapX = 0;
        this.bitmapY = 0;
        this.bitmapWidth = 0;
        this.bitmapHeight = 0;
        this.bitmapData.reset(0);
        this.colorsSet = false;
    }
}
