package com.google.android.exoplayer2.util;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static int IAuthTabCallback = 0;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA;
    private static final Pattern RGBA_PATTERN_INT_ALPHA;
    private static final Pattern RGB_PATTERN;
    private static int asInterface;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {65, -53, 110, -39};
    private static final int $$b = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, byte b, int i3) {
        int i4;
        int i5 = i2 + 4;
        int i6 = (i3 * 2) + 115;
        byte[] bArr = $$a;
        int i7 = b * 2;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i8;
            int i10 = 0;
            i6 += -i9;
            i4 = i10;
            bArr2[i4] = (byte) i6;
            i5++;
            i10 = i4 + 1;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i5];
            i6 += -i9;
            i4 = i10;
            bArr2[i4] = (byte) i6;
            i5++;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            i5++;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    static {
        asInterface = 0;
        onWarmupCompleted();
        RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
        HashMap map = new HashMap();
        COLOR_MAP = map;
        map.put("aliceblue", -984833);
        map.put("antiquewhite", -332841);
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        map.put("azure", -983041);
        map.put("beige", -657956);
        map.put("bisque", -6972);
        map.put("black", -16777216);
        map.put("blanchedalmond", -5171);
        map.put("blue", -16776961);
        map.put("blueviolet", -7722014);
        map.put("brown", -5952982);
        map.put("burlywood", -2180985);
        map.put("cadetblue", -10510688);
        map.put("chartreuse", -8388864);
        map.put("chocolate", -2987746);
        map.put("coral", -32944);
        map.put("cornflowerblue", -10185235);
        map.put("cornsilk", -1828);
        map.put("crimson", -2354116);
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        map.put("darkcyan", -16741493);
        map.put("darkgoldenrod", -4684277);
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        map.put("darkmagenta", -7667573);
        map.put("darkolivegreen", -11179217);
        map.put("darkorange", -29696);
        map.put("darkorchid", -6737204);
        map.put("darkred", -7667712);
        map.put("darksalmon", -1468806);
        map.put("darkseagreen", -7357297);
        map.put("darkslateblue", -12042869);
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        map.put("deeppink", -60269);
        map.put("deepskyblue", -16728065);
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        map.put("floralwhite", -1296);
        map.put("forestgreen", -14513374);
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        map.put("ghostwhite", -460545);
        map.put("gold", -10496);
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        map.put("green", -16744448);
        map.put("greenyellow", -5374161);
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        map.put("hotpink", -38476);
        map.put("indianred", -3318692);
        map.put("indigo", -11861886);
        map.put("ivory", -16);
        map.put("khaki", -989556);
        map.put("lavender", -1644806);
        map.put("lavenderblush", -3851);
        map.put("lawngreen", -8586240);
        map.put("lemonchiffon", -1331);
        map.put("lightblue", -5383962);
        map.put("lightcoral", -1015680);
        map.put("lightcyan", -2031617);
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        map.put("lightpink", -18751);
        map.put("lightsalmon", -24454);
        map.put("lightseagreen", -14634326);
        map.put("lightskyblue", -7876870);
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        map.put("lime", -16711936);
        map.put("limegreen", -13447886);
        map.put("linen", -331546);
        map.put("magenta", -65281);
        map.put("maroon", -8388608);
        map.put("mediumaquamarine", -10039894);
        map.put("mediumblue", -16777011);
        map.put("mediumorchid", -4565549);
        map.put("mediumpurple", -7114533);
        map.put("mediumseagreen", -12799119);
        map.put("mediumslateblue", -8689426);
        map.put("mediumspringgreen", -16713062);
        map.put("mediumturquoise", -12004916);
        map.put("mediumvioletred", -3730043);
        map.put("midnightblue", -15132304);
        map.put("mintcream", -655366);
        map.put("mistyrose", -6943);
        map.put("moccasin", -6987);
        map.put("navajowhite", -8531);
        map.put("navy", -16777088);
        map.put("oldlace", -133658);
        map.put("olive", -8355840);
        map.put("olivedrab", -9728477);
        map.put("orange", -23296);
        map.put("orangered", -47872);
        map.put("orchid", -2461482);
        map.put("palegoldenrod", -1120086);
        map.put("palegreen", -6751336);
        map.put("paleturquoise", -5247250);
        map.put("palevioletred", -2396013);
        map.put("papayawhip", -4139);
        map.put("peachpuff", -9543);
        map.put("peru", -3308225);
        map.put("pink", -16181);
        map.put("plum", -2252579);
        map.put("powderblue", -5185306);
        map.put("purple", -8388480);
        map.put("rebeccapurple", -10079335);
        map.put("red", -65536);
        map.put("rosybrown", -4419697);
        map.put("royalblue", -12490271);
        map.put("saddlebrown", -7650029);
        map.put("salmon", -360334);
        map.put("sandybrown", -744352);
        map.put("seagreen", -13726889);
        map.put("seashell", -2578);
        map.put("sienna", -6270419);
        map.put("silver", -4144960);
        map.put("skyblue", -7876885);
        map.put("slateblue", -9807155);
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        map.put("steelblue", -12156236);
        map.put("tan", -2968436);
        map.put("teal", -16744320);
        map.put("thistle", -2572328);
        map.put("tomato", -40121);
        Object[] objArr = new Object[1];
        a((short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) Color.alpha(0), (-786865806) + (ViewConfiguration.getJumpTapTimeout() >> 16), 1746655156 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getEdgeSlop() >> 16) - 23, objArr);
        map.put(((String) objArr[0]).intern(), 0);
        map.put("turquoise", -12525360);
        map.put("violet", -1146130);
        map.put("wheat", -663885);
        map.put("white", -1);
        map.put("whitesmoke", -657931);
        map.put("yellow", -256);
        map.put("yellowgreen", -6632142);
        int i2 = onTransact + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public static int parseTtmlColor(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 31;
        asBinder = i3 % 128;
        int colorInternal = i3 % 2 == 0 ? parseColorInternal(str, true) : parseColorInternal(str, false);
        int i4 = asBinder + 111;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return colorInternal;
    }

    public static int parseCssColor(String str) {
        int i2 = 2 % 2;
        int i3 = asBinder + 123;
        IAuthTabCallbackDefault = i3 % 128;
        return parseColorInternal(str, i3 % 2 == 0);
    }

    private static int parseColorInternal(String str, boolean z) throws NumberFormatException {
        int i2;
        int i3 = 2 % 2;
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i4 = asBinder + 95;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i6;
            }
            if (strReplace.length() != 9) {
                throw new IllegalArgumentException();
            }
            int i7 = asBinder + 63;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            return ((i6 & OggPageHeader.MAX_SEGMENT_COUNT) << 24) | (i6 >>> 8);
        }
        if (strReplace.startsWith(RGBA)) {
            int i9 = IAuthTabCallbackDefault + 83;
            asBinder = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            Matcher matcher = (z ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(strReplace);
            if (matcher.matches()) {
                int i10 = IAuthTabCallbackDefault;
                int i11 = i10 + 125;
                asBinder = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                if (z) {
                    int i12 = i10 + 13;
                    asBinder = i12 % 128;
                    i2 = (int) (i12 % 2 == 0 ? Float.parseFloat((String) Assertions.checkNotNull(matcher.group(5))) / 255.0f : Float.parseFloat((String) Assertions.checkNotNull(matcher.group(4))) * 255.0f);
                } else {
                    i2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4)), 10);
                }
                return Color.argb(i2, Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(3)), 10));
            }
        } else if (strReplace.startsWith(RGB)) {
            int i13 = IAuthTabCallbackDefault + 29;
            asBinder = i13 % 128;
            int i14 = i13 % 2;
            Matcher matcher2 = RGB_PATTERN.matcher(strReplace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(3)), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(Ascii.toLowerCase(strReplace));
            if (num != null) {
                int i15 = asBinder + 83;
                IAuthTabCallbackDefault = i15 % 128;
                int i16 = i15 % 2;
                int iIntValue = num.intValue();
                int i17 = IAuthTabCallbackDefault + 125;
                asBinder = i17 % 128;
                int i18 = i17 % 2;
                return iIntValue;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 43424), Color.green(0) + 42, 22439 - View.MeasureSpec.getMode(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = -1;
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $11 + 123;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = onWarmupCompleted;
                float f = 0.0f;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char gidForName = (char) (Process.getGidForName("") + 12844);
                            int i10 = 55 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                            int i11 = 2167 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, i10, i11, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i6 = -1;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.red(0)), 42 - KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i2 + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i2 + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i7;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 86 - View.MeasureSpec.getMode(0), 9567 - KeyEvent.keyCodeFromString(""), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i12 = 0;
                    while (i12 < length2) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                        i12++;
                        int i13 = $11 + 49;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $11 + 23;
                    $10 = i15 % 128;
                    boolean z = i15 % 2 == 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i16 = $10 + 71;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private ColorParser() {
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = -1969142138;
        onNavigationEvent = -1538795490;
        IAuthTabCallback = 866382024;
        onWarmupCompleted = new byte[]{-3, 14, 1, -5, 25, -7, -11, 13, 5, -25, -10};
    }
}
