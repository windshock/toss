package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Cea608Decoder$CueBuilder {
    private static final int BASE_ROW = 15;
    private static final int SCREEN_CHARWIDTH = 32;
    private int captionMode;
    private int captionRowCount;
    private int indent;
    private int row;
    private int tabOffset;
    private final List<CueStyle> cueStyles = new ArrayList();
    private final List<SpannableString> rolledUpCaptions = new ArrayList();
    private final StringBuilder captionStringBuilder = new StringBuilder();

    public Cea608Decoder$CueBuilder(int i2, int i3) {
        reset(i2);
        this.captionRowCount = i3;
    }

    public void reset(int i2) {
        this.captionMode = i2;
        this.cueStyles.clear();
        this.rolledUpCaptions.clear();
        this.captionStringBuilder.setLength(0);
        this.row = BASE_ROW;
        this.indent = 0;
        this.tabOffset = 0;
    }

    public boolean isEmpty() {
        return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
    }

    public void setCaptionMode(int i2) {
        this.captionMode = i2;
    }

    public void setCaptionRowCount(int i2) {
        this.captionRowCount = i2;
    }

    public void setStyle(int i2, boolean z) {
        this.cueStyles.add(new CueStyle(i2, z, this.captionStringBuilder.length()));
    }

    public void backspace() {
        int length = this.captionStringBuilder.length();
        if (length > 0) {
            this.captionStringBuilder.delete(length - 1, length);
            for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                CueStyle cueStyle = this.cueStyles.get(size);
                int i2 = cueStyle.start;
                if (i2 != length) {
                    return;
                }
                cueStyle.start = i2 - 1;
            }
        }
    }

    public void append(char c) {
        if (this.captionStringBuilder.length() < 32) {
            this.captionStringBuilder.append(c);
        }
    }

    public void rollUp() {
        this.rolledUpCaptions.add(buildCurrentLine());
        this.captionStringBuilder.setLength(0);
        this.cueStyles.clear();
        int iMin = Math.min(this.captionRowCount, this.row);
        while (this.rolledUpCaptions.size() >= iMin) {
            this.rolledUpCaptions.remove(0);
        }
    }

    public Cue build(int i2) {
        float f;
        int i3 = this.indent + this.tabOffset;
        int i4 = 32 - i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i5 = 0; i5 < this.rolledUpCaptions.size(); i5++) {
            spannableStringBuilder.append(Util.truncateAscii(this.rolledUpCaptions.get(i5), i4));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(Util.truncateAscii(buildCurrentLine(), i4));
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length = i4 - spannableStringBuilder.length();
        int i6 = i3 - length;
        if (i2 == Integer.MIN_VALUE) {
            if (this.captionMode != 2 || (Math.abs(i6) >= 3 && length >= 0)) {
                i2 = (this.captionMode != 2 || i6 <= 0) ? 0 : 2;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i7 = this.row;
        if (i7 > 7) {
            i7 -= 17;
        } else if (this.captionMode == 1) {
            i7 -= this.captionRowCount - 1;
        }
        return new Cue.Builder().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i7, 1).setPosition(f).setPositionAnchor(i2).build();
    }

    private SpannableString buildCurrentLine() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
        int length = spannableStringBuilder.length();
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        while (i6 < this.cueStyles.size()) {
            CueStyle cueStyle = this.cueStyles.get(i6);
            boolean z2 = cueStyle.underline;
            int i8 = cueStyle.style;
            if (i8 != 8) {
                boolean z3 = i8 == 7;
                if (i8 != 7) {
                    i3 = Cea608Decoder.access$300()[i8];
                }
                z = z3;
            }
            int i9 = cueStyle.start;
            i6++;
            if (i9 != (i6 < this.cueStyles.size() ? this.cueStyles.get(i6).start : length)) {
                if (i2 != -1 && !z2) {
                    setUnderlineSpan(spannableStringBuilder, i2, i9);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i9;
                }
                if (i4 != -1 && !z) {
                    setItalicSpan(spannableStringBuilder, i4, i9);
                    i4 = -1;
                } else if (i4 == -1 && z) {
                    i4 = i9;
                }
                if (i3 != i5) {
                    setColorSpan(spannableStringBuilder, i7, i9, i5);
                    i5 = i3;
                    i7 = i9;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            setUnderlineSpan(spannableStringBuilder, i2, length);
        }
        if (i4 != -1 && i4 != length) {
            setItalicSpan(spannableStringBuilder, i4, length);
        }
        if (i7 != length) {
            setColorSpan(spannableStringBuilder, i7, length, i5);
        }
        return new SpannableString(spannableStringBuilder);
    }

    private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
    }

    private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i2, i3, 33);
    }

    private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
        if (i4 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, i3, 33);
    }

    static class CueStyle {
        public int start;
        public final int style;
        public final boolean underline;

        public CueStyle(int i2, boolean z, int i3) {
            this.style = i2;
            this.underline = z;
            this.start = i3;
        }
    }
}
