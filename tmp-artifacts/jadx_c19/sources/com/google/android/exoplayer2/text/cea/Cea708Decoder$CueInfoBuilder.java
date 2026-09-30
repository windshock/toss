package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Cea708Decoder$CueInfoBuilder {
    private static final int BORDER_AND_EDGE_TYPE_NONE = 0;
    private static final int BORDER_AND_EDGE_TYPE_UNIFORM = 3;
    public static final int COLOR_SOLID_BLACK;
    public static final int COLOR_SOLID_WHITE = getArgbColorFromCeaColor(2, 2, 2, 0);
    public static final int COLOR_TRANSPARENT;
    private static final int DEFAULT_PRIORITY = 4;
    private static final int DIRECTION_BOTTOM_TO_TOP = 3;
    private static final int DIRECTION_LEFT_TO_RIGHT = 0;
    private static final int DIRECTION_RIGHT_TO_LEFT = 1;
    private static final int DIRECTION_TOP_TO_BOTTOM = 2;
    private static final int HORIZONTAL_SIZE = 209;
    private static final int JUSTIFICATION_CENTER = 2;
    private static final int JUSTIFICATION_FULL = 3;
    private static final int JUSTIFICATION_LEFT = 0;
    private static final int JUSTIFICATION_RIGHT = 1;
    private static final int MAXIMUM_ROW_COUNT = 15;
    private static final int PEN_FONT_STYLE_DEFAULT = 0;
    private static final int PEN_FONT_STYLE_MONOSPACED_WITHOUT_SERIFS = 3;
    private static final int PEN_FONT_STYLE_MONOSPACED_WITH_SERIFS = 1;
    private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITHOUT_SERIFS = 4;
    private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITH_SERIFS = 2;
    private static final int PEN_OFFSET_NORMAL = 1;
    private static final int PEN_SIZE_STANDARD = 1;
    private static final int[] PEN_STYLE_BACKGROUND;
    private static final int[] PEN_STYLE_EDGE_TYPE;
    private static final int[] PEN_STYLE_FONT_STYLE;
    private static final int RELATIVE_CUE_SIZE = 99;
    private static final int VERTICAL_SIZE = 74;
    private static final int[] WINDOW_STYLE_FILL;
    private static final int[] WINDOW_STYLE_JUSTIFICATION;
    private static final int[] WINDOW_STYLE_PRINT_DIRECTION;
    private static final int[] WINDOW_STYLE_SCROLL_DIRECTION;
    private static final boolean[] WINDOW_STYLE_WORD_WRAP;
    private int anchorId;
    private int backgroundColor;
    private int backgroundColorStartPosition;
    private boolean defined;
    private int foregroundColor;
    private int foregroundColorStartPosition;
    private int horizontalAnchor;
    private int italicsStartPosition;
    private int justification;
    private int penStyleId;
    private int priority;
    private boolean relativePositioning;
    private int row;
    private int rowCount;
    private boolean rowLock;
    private int underlineStartPosition;
    private int verticalAnchor;
    private boolean visible;
    private int windowFillColor;
    private int windowStyleId;
    private final List<SpannableString> rolledUpCaptions = new ArrayList();
    private final SpannableStringBuilder captionStringBuilder = new SpannableStringBuilder();

    static {
        int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
        COLOR_SOLID_BLACK = argbColorFromCeaColor;
        int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
        COLOR_TRANSPARENT = argbColorFromCeaColor2;
        WINDOW_STYLE_JUSTIFICATION = new int[]{0, 0, 0, 0, 0, 2, 0};
        WINDOW_STYLE_PRINT_DIRECTION = new int[]{0, 0, 0, 0, 0, 0, 2};
        WINDOW_STYLE_SCROLL_DIRECTION = new int[]{3, 3, 3, 3, 3, 3, 1};
        WINDOW_STYLE_WORD_WRAP = new boolean[]{false, false, false, true, true, true, false};
        WINDOW_STYLE_FILL = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
        PEN_STYLE_FONT_STYLE = new int[]{0, 1, 2, 3, 4, 3, 4};
        PEN_STYLE_EDGE_TYPE = new int[]{0, 0, 0, 0, 0, 3, 3};
        PEN_STYLE_BACKGROUND = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
    }

    public Cea708Decoder$CueInfoBuilder() {
        reset();
    }

    public boolean isEmpty() {
        if (isDefined()) {
            return this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }
        return true;
    }

    public void reset() {
        clear();
        this.defined = false;
        this.visible = false;
        this.priority = 4;
        this.relativePositioning = false;
        this.verticalAnchor = 0;
        this.horizontalAnchor = 0;
        this.anchorId = 0;
        this.rowCount = MAXIMUM_ROW_COUNT;
        this.rowLock = true;
        this.justification = 0;
        this.windowStyleId = 0;
        this.penStyleId = 0;
        int i2 = COLOR_SOLID_BLACK;
        this.windowFillColor = i2;
        this.foregroundColor = COLOR_SOLID_WHITE;
        this.backgroundColor = i2;
    }

    public void clear() {
        this.rolledUpCaptions.clear();
        this.captionStringBuilder.clear();
        this.italicsStartPosition = -1;
        this.underlineStartPosition = -1;
        this.foregroundColorStartPosition = -1;
        this.backgroundColorStartPosition = -1;
        this.row = 0;
    }

    public boolean isDefined() {
        return this.defined;
    }

    public void setVisibility(boolean z) {
        this.visible = z;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void defineWindow(boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.defined = true;
        this.visible = z;
        this.rowLock = z2;
        this.priority = i2;
        this.relativePositioning = z4;
        this.verticalAnchor = i3;
        this.horizontalAnchor = i4;
        this.anchorId = i7;
        int i10 = i5 + 1;
        if (this.rowCount != i10) {
            this.rowCount = i10;
            while (true) {
                if ((!z2 || this.rolledUpCaptions.size() < this.rowCount) && this.rolledUpCaptions.size() < MAXIMUM_ROW_COUNT) {
                    break;
                } else {
                    this.rolledUpCaptions.remove(0);
                }
            }
        }
        if (i8 != 0 && this.windowStyleId != i8) {
            this.windowStyleId = i8;
            int i11 = i8 - 1;
            setWindowAttributes(WINDOW_STYLE_FILL[i11], COLOR_TRANSPARENT, WINDOW_STYLE_WORD_WRAP[i11], 0, WINDOW_STYLE_PRINT_DIRECTION[i11], WINDOW_STYLE_SCROLL_DIRECTION[i11], WINDOW_STYLE_JUSTIFICATION[i11]);
        }
        if (i9 == 0 || this.penStyleId == i9) {
            return;
        }
        this.penStyleId = i9;
        int i12 = i9 - 1;
        setPenAttributes(0, 1, 1, false, false, PEN_STYLE_EDGE_TYPE[i12], PEN_STYLE_FONT_STYLE[i12]);
        setPenColor(COLOR_SOLID_WHITE, PEN_STYLE_BACKGROUND[i12], COLOR_SOLID_BLACK);
    }

    public void setWindowAttributes(int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        this.windowFillColor = i2;
        this.justification = i7;
    }

    public void setPenAttributes(int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6) {
        if (this.italicsStartPosition != -1) {
            if (!z) {
                this.captionStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, this.captionStringBuilder.length(), 33);
                this.italicsStartPosition = -1;
            }
        } else if (z) {
            this.italicsStartPosition = this.captionStringBuilder.length();
        }
        if (this.underlineStartPosition == -1) {
            if (z2) {
                this.underlineStartPosition = this.captionStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            this.captionStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, this.captionStringBuilder.length(), 33);
            this.underlineStartPosition = -1;
        }
    }

    public void setPenColor(int i2, int i3, int i4) {
        if (this.foregroundColorStartPosition != -1 && this.foregroundColor != i2) {
            this.captionStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, this.captionStringBuilder.length(), 33);
        }
        if (i2 != COLOR_SOLID_WHITE) {
            this.foregroundColorStartPosition = this.captionStringBuilder.length();
            this.foregroundColor = i2;
        }
        if (this.backgroundColorStartPosition != -1 && this.backgroundColor != i3) {
            this.captionStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, this.captionStringBuilder.length(), 33);
        }
        if (i3 != COLOR_SOLID_BLACK) {
            this.backgroundColorStartPosition = this.captionStringBuilder.length();
            this.backgroundColor = i3;
        }
    }

    public void setPenLocation(int i2, int i3) {
        if (this.row != i2) {
            append('\n');
        }
        this.row = i2;
    }

    public void backspace() {
        int length = this.captionStringBuilder.length();
        if (length > 0) {
            this.captionStringBuilder.delete(length - 1, length);
        }
    }

    public void append(char c) {
        if (c == '\n') {
            this.rolledUpCaptions.add(buildSpannableString());
            this.captionStringBuilder.clear();
            if (this.italicsStartPosition != -1) {
                this.italicsStartPosition = 0;
            }
            if (this.underlineStartPosition != -1) {
                this.underlineStartPosition = 0;
            }
            if (this.foregroundColorStartPosition != -1) {
                this.foregroundColorStartPosition = 0;
            }
            if (this.backgroundColorStartPosition != -1) {
                this.backgroundColorStartPosition = 0;
            }
            while (true) {
                if ((!this.rowLock || this.rolledUpCaptions.size() < this.rowCount) && this.rolledUpCaptions.size() < MAXIMUM_ROW_COUNT) {
                    return;
                } else {
                    this.rolledUpCaptions.remove(0);
                }
            }
        } else {
            this.captionStringBuilder.append(c);
        }
    }

    public SpannableString buildSpannableString() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.italicsStartPosition != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, length, 33);
            }
            if (this.underlineStartPosition != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, length, 33);
            }
            if (this.foregroundColorStartPosition != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, length, 33);
            }
            if (this.backgroundColorStartPosition != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public Cea708Decoder$Cea708CueInfo build() {
        Layout.Alignment alignment;
        float f;
        float f2;
        if (isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i2 = 0; i2 < this.rolledUpCaptions.size(); i2++) {
            spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i2));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) buildSpannableString());
        int i3 = this.justification;
        if (i3 == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalArgumentException("Unexpected justification value: " + this.justification);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        if (this.relativePositioning) {
            f = this.horizontalAnchor / 99.0f;
            f2 = this.verticalAnchor / 99.0f;
        } else {
            f = this.horizontalAnchor / 209.0f;
            f2 = this.verticalAnchor / 74.0f;
        }
        float f3 = (f * 0.9f) + 0.05f;
        int i4 = this.anchorId;
        int i5 = i4 / 3;
        int i6 = i4 % 3;
        return new Cea708Decoder$Cea708CueInfo(spannableStringBuilder, alignment2, (f2 * 0.9f) + 0.05f, 0, i5 == 0 ? 0 : i5 == 1 ? 1 : 2, f3, i6 == 0 ? 0 : i6 == 1 ? 1 : 2, -3.4028235E38f, this.windowFillColor != COLOR_SOLID_BLACK, this.windowFillColor, this.priority);
    }

    public static int getArgbColorFromCeaColor(int i2, int i3, int i4) {
        return getArgbColorFromCeaColor(i2, i3, i4, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getArgbColorFromCeaColor(int i2, int i3, int i4, int i5) {
        int i6;
        Assertions.checkIndex(i2, 0, 4);
        Assertions.checkIndex(i3, 0, 4);
        Assertions.checkIndex(i4, 0, 4);
        Assertions.checkIndex(i5, 0, 4);
        if (i5 == 0 || i5 == 1) {
            i6 = 255;
        } else if (i5 == 2) {
            i6 = 127;
        } else if (i5 == 3) {
            i6 = 0;
        }
        return Color.argb(i6, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0, i4 > 1 ? 255 : 0);
    }
}
