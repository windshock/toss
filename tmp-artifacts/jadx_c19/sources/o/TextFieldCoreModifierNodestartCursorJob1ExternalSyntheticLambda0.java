package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldCoreModifierNodestartCursorJob1ExternalSyntheticLambda0 {
    private static final Map<String, Integer> IAuthTabCallback;
    private static int asBinder;
    private static final Pattern onExtraCallback;
    private static final Pattern onExtraCallbackWithResult;
    private static final Pattern onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {79, -25, -14, 102};
    private static final int $$b = 137;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, byte b, int i3) {
        int i4;
        int i5 = 105 - (i3 * 2);
        int i6 = 3 - (b * 2);
        byte[] bArr = $$a;
        int i7 = i2 * 3;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i8;
            int i10 = i6;
            i4 = 0;
            int i11 = i10;
            i5 = i6 + (-i9);
            i6 = i11;
            int i12 = i6 + 1;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i4++;
            i9 = bArr[i12];
            int i13 = i5;
            i10 = i12;
            i6 = i13;
            int i112 = i10;
            i5 = i6 + (-i9);
            i6 = i112;
            int i122 = i6 + 1;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            int i1222 = i6 + 1;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        }
    }

    static {
        asBinder = 1;
        onExtraCallbackWithResult();
        onExtraCallback = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        onExtraCallbackWithResult = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        onNavigationEvent = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
        HashMap map = new HashMap();
        IAuthTabCallback = map;
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
        a(11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{65528, 1, 7, 7, 5, 65524, 1, 6, 3, 65524, 5}, false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 264, objArr);
        map.put(((String) objArr[0]).intern(), 0);
        map.put("turquoise", -12525360);
        map.put("violet", -1146130);
        map.put("wheat", -663885);
        map.put("white", -1);
        map.put("whitesmoke", -657931);
        map.put("yellow", -256);
        map.put("yellowgreen", -6632142);
        int i2 = asInterface + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    public static int onExtraCallback(String str) throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = onTransact + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int iIAuthTabCallback = IAuthTabCallback(str, false);
        int i5 = onTransact + 7;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return iIAuthTabCallback;
    }

    public static int onWarmupCompleted(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 7;
        onTransact = i3 % 128;
        int iIAuthTabCallback = i3 % 2 != 0 ? IAuthTabCallback(str, false) : IAuthTabCallback(str, true);
        int i4 = onTransact + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return iIAuthTabCallback;
    }

    private static int IAuthTabCallback(String str, boolean z) throws NumberFormatException {
        Pattern pattern;
        int i2;
        int i3 = 2 % 2;
        RecordingInputConnection_androidKt.onNavigationEvent(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i4 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() != 7) {
                if (strReplace.length() == 9) {
                    return ((i4 & OggPageHeader.MAX_SEGMENT_COUNT) << 24) | (i4 >>> 8);
                }
                throw new IllegalArgumentException();
            }
            int i5 = IAuthTabCallbackDefault + 107;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return (-16777216) | i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (strReplace.startsWith("rgba")) {
            if (z) {
                int i6 = IAuthTabCallbackDefault + 5;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                pattern = onNavigationEvent;
            } else {
                pattern = onExtraCallbackWithResult;
            }
            Matcher matcher = pattern.matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    int i8 = IAuthTabCallbackDefault + 29;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = (int) (Float.parseFloat((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(4))) * 255.0f);
                } else {
                    i2 = Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(4)), 10);
                }
                return Color.argb(i2, Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1)), 10), Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2)), 10), Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(3)), 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            int i10 = IAuthTabCallbackDefault + 33;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            Matcher matcher2 = onExtraCallback.matcher(strReplace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher2.group(1)), 10), Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher2.group(2)), 10), Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher2.group(3)), 10));
            }
        } else {
            Integer num = IAuthTabCallback.get(Ascii.toLowerCase(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        char c;
        char[] cArr2;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            c = '0';
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i7 = $11 + 115;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i9]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.lastIndexOf("", '0', 0) + 56, 2167 - (ViewConfiguration.getLongPressTimeout() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i10 = $11 + 65;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i11 = $10 + 1;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0) + 12844), 55 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i5 = 2083011369;
                    c = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = 478309045;
    }
}
