package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    public static final int SSA_BORDER_STYLE_BOX = 3;
    public static final int SSA_BORDER_STYLE_OUTLINE = 1;
    public static final int SSA_BORDER_STYLE_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    public final Integer outlineColor;
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    private static boolean isValidAlignment(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean isValidBorderStyle(int i2) {
        return i2 == 1 || i2 == 3;
    }

    static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;
        private static final byte[] $$a = {77, -67, -125, 9};
        private static final int $$b = OggPageHeader.MAX_SEGMENT_COUNT;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int IAuthTabCallback = 478309102;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, byte b2) {
            int i2;
            int i3 = 105 - (b2 * 3);
            byte[] bArr = $$a;
            int i4 = b + 4;
            int i5 = s * 2;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i6 = i5;
                i2 = 0;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                i4++;
                if (i2 == i5) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i4];
                i2++;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                i4++;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                i4++;
                if (i2 == i5) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
            int i5;
            long j;
            Throwable cause;
            int i6 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i7 = $11 + 41;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (true) {
                i5 = 2083011369;
                j = 0;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - Drawable.resolveOpacity(0, 0)), 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.resolveSize(0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 55, 2167 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i3 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 12843), ExpandableListView.getPackedPositionGroup(j) + 55, View.getDefaultSize(0, 0) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i5 = 2083011369;
                    j = 0;
                }
                cArr2 = cArr4;
            }
            String str = new String(cArr2);
            int i10 = $11 + 13;
            $10 = i10 % 128;
            if (i10 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i11 = 52 / 0;
                objArr[0] = str;
            }
        }

        private Format(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.nameIndex = i2;
            this.alignmentIndex = i3;
            this.primaryColorIndex = i4;
            this.outlineColorIndex = i5;
            this.fontSizeIndex = i6;
            this.boldIndex = i7;
            this.italicIndex = i8;
            this.underlineIndex = i9;
            this.strikeoutIndex = i10;
            this.borderStyleIndex = i11;
            this.length = i12;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Format fromFormatLine(String str) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i4 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            while (i6 < strArrSplit.length) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[i6].trim());
                char c = '\b';
                switch (lowerCase.hashCode()) {
                    case -1178781136:
                        if (!lowerCase.equals(TtmlNode.ITALIC)) {
                            c = 65535;
                            break;
                        } else {
                            c = 0;
                            break;
                        }
                    case -1026963764:
                        if (lowerCase.equals(TtmlNode.UNDERLINE)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -192095652:
                        if (lowerCase.equals("strikeout")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -70925746:
                        if (lowerCase.equals("primarycolour")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3029637:
                        if (!(!lowerCase.equals(TtmlNode.BOLD))) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        Object[] objArr = new Object[1];
                        a(4 - (ViewConfiguration.getScrollBarSize() >> 8), 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{65533, 6, 65529, 5}, false, 303 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                        if (lowerCase.equals(((String) objArr[0]).intern())) {
                            c = 5;
                            break;
                        }
                        break;
                    case 366554320:
                        if (lowerCase.equals("fontsize")) {
                            int i17 = onExtraCallbackWithResult + 71;
                            onNavigationEvent = i17 % 128;
                            int i18 = i17 % i2;
                            c = 6;
                            break;
                        }
                        break;
                    case 767321349:
                        if (lowerCase.equals("borderstyle")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1767875043:
                        if (!lowerCase.equals("alignment")) {
                        }
                        break;
                    case 1988365454:
                        if (lowerCase.equals("outlinecolour")) {
                            int i19 = onExtraCallbackWithResult + 17;
                            onNavigationEvent = i19 % 128;
                            if (i19 % i2 == 0) {
                                c = '\t';
                                break;
                            } else {
                                c = '\r';
                                break;
                            }
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        i13 = i6;
                        break;
                    case 1:
                        i14 = i6;
                        break;
                    case 2:
                        i15 = i6;
                        break;
                    case 3:
                        i9 = i6;
                        break;
                    case 4:
                        i12 = i6;
                        break;
                    case 5:
                        i7 = i6;
                        break;
                    case 6:
                        i11 = i6;
                        break;
                    case 7:
                        i16 = i6;
                        break;
                    case '\b':
                        i8 = i6;
                        break;
                    case '\t':
                        i10 = i6;
                        break;
                }
                i6++;
                i2 = 2;
            }
            if (i7 != -1) {
                return new Format(i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, strArrSplit.length);
            }
            return null;
        }
    }

    private SsaStyle(String str, int i2, @Nullable Integer num, @Nullable Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        this.name = str;
        this.alignment = i2;
        this.primaryColor = num;
        this.outlineColor = num2;
        this.fontSize = f;
        this.bold = z;
        this.italic = z2;
        this.underline = z3;
        this.strikeout = z4;
        this.borderStyle = i3;
    }

    public static SsaStyle fromStyleLine(String str, Format format) {
        Assertions.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = format.length;
        if (length != i2) {
            Log.w(TAG, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", new Object[]{Integer.valueOf(i2), Integer.valueOf(strArrSplit.length), str}));
            return null;
        }
        try {
            String strTrim = strArrSplit[format.nameIndex].trim();
            int i3 = format.alignmentIndex;
            int alignment = i3 != -1 ? parseAlignment(strArrSplit[i3].trim()) : -1;
            int i4 = format.primaryColorIndex;
            Integer color = i4 != -1 ? parseColor(strArrSplit[i4].trim()) : null;
            int i5 = format.outlineColorIndex;
            Integer color2 = i5 != -1 ? parseColor(strArrSplit[i5].trim()) : null;
            int i6 = format.fontSizeIndex;
            float fontSize = i6 != -1 ? parseFontSize(strArrSplit[i6].trim()) : -3.4028235E38f;
            int i7 = format.boldIndex;
            boolean z = i7 != -1 && parseBooleanValue(strArrSplit[i7].trim());
            int i8 = format.italicIndex;
            boolean z2 = i8 != -1 && parseBooleanValue(strArrSplit[i8].trim());
            int i9 = format.underlineIndex;
            boolean z3 = i9 != -1 && parseBooleanValue(strArrSplit[i9].trim());
            int i10 = format.strikeoutIndex;
            boolean z4 = i10 != -1 && parseBooleanValue(strArrSplit[i10].trim());
            int i11 = format.borderStyleIndex;
            return new SsaStyle(strTrim, alignment, color, color2, fontSize, z, z2, z3, z4, i11 != -1 ? parseBorderStyle(strArrSplit[i11].trim()) : -1);
        } catch (RuntimeException e) {
            Log.w(TAG, "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(String str) throws NumberFormatException {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (isValidAlignment(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w(TAG, "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static int parseBorderStyle(String str) throws NumberFormatException {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (isValidBorderStyle(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w(TAG, "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer parseColor(String str) throws NumberFormatException {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            Assertions.checkArgument(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j >> 24) & 255) ^ 255), Ints.checkedCast(j & 255), Ints.checkedCast((j >> 8) & 255), Ints.checkedCast((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            Log.w(TAG, "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    private static boolean parseBooleanValue(String str) throws NumberFormatException {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e) {
            Log.w(TAG, "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    static final class Overrides {
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;
        public final PointF position;
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", new Object[]{PADDED_DECIMAL_PATTERN}));
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[]{PADDED_DECIMAL_PATTERN}));
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");

        private Overrides(int i2, @Nullable PointF pointF) {
            this.alignment = i2;
            this.position = pointF;
        }

        public static Overrides parseFromDialogue(String str) {
            Matcher matcher = BRACES_PATTERN.matcher(str);
            PointF pointF = null;
            int i2 = -1;
            while (matcher.find()) {
                String str2 = (String) Assertions.checkNotNull(matcher.group(1));
                try {
                    PointF position = parsePosition(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int alignmentOverride = parseAlignmentOverride(str2);
                    if (alignmentOverride != -1) {
                        i2 = alignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new Overrides(i2, pointF);
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }

        private static PointF parsePosition(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    Log.i(TAG, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.checkNotNull(strGroup)).trim()), Float.parseFloat(((String) Assertions.checkNotNull(strGroup2)).trim()));
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return SsaStyle.parseAlignment((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }
    }
}
