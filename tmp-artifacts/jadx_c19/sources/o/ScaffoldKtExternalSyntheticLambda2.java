package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ScaffoldKtExternalSyntheticLambda2 {
    public final boolean IAuthTabCallback;
    public final boolean IAuthTabCallbackDefault;
    public final Integer IAuthTabCallbackStub;
    public final String asBinder;
    public final Integer asInterface;
    public final boolean onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final float onNavigationEvent;
    public final boolean onTransact;
    public final int onWarmupCompleted;

    private static boolean IAuthTabCallback(int i2) {
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

    private static boolean onExtraCallback(int i2) {
        return i2 == 1 || i2 == 3;
    }

    static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallbackStubProxy = 14877;
        private static int ICustomTabsCallback = 0;
        private static char access000 = 54720;
        private static char access100 = 35987;
        private static int extraCallbackWithResult = 1;
        private static char getInterfaceDescriptor = 38994;
        public final int IAuthTabCallback;
        public final int IAuthTabCallbackDefault;
        public final int IAuthTabCallbackStub;
        public final int IAuthTabCallback_Parcel;
        public final int asBinder;
        public final int asInterface;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onTransact;
        public final int onWarmupCompleted;

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i4 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i5 = $11 + 19;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i7 = $11 + 21;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 / 3;
                }
                int i9 = 58224;
                int i10 = i4;
                while (i10 < 16) {
                    int i11 = $10 + 83;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i4];
                    int i13 = (c2 + i9) ^ ((c2 << 4) + ((char) (getInterfaceDescriptor ^ 1094535280733222934L)));
                    int i14 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(IAuthTabCallbackStubProxy);
                        objArr2[2] = Integer.valueOf(i14);
                        objArr2[1] = Integer.valueOf(i13);
                        objArr2[i4] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i4] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(edgeSlop, maxKeyCode, windowTouchSlop, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (access100 ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(access000)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i9 -= 40503;
                        i10++;
                        cArr3 = cArr4;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, 19901 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i4 = 0;
            }
            String str = new String(cArr2, 0, i2);
            int i15 = $11 + 65;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            objArr[0] = str;
        }

        private IAuthTabCallback(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.IAuthTabCallbackDefault = i2;
            this.onExtraCallbackWithResult = i3;
            this.asBinder = i4;
            this.asInterface = i5;
            this.onWarmupCompleted = i6;
            this.IAuthTabCallback = i7;
            this.onExtraCallback = i8;
            this.IAuthTabCallback_Parcel = i9;
            this.onTransact = i10;
            this.onNavigationEvent = i11;
            this.IAuthTabCallbackStub = i12;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[PHI: r6
          0x00da: PHI (r6v14 char) = (r6v6 char), (r6v7 char), (r6v8 char), (r6v9 char), (r6v15 char) binds: [B:39:0x00cc, B:36:0x00c1, B:33:0x00b6, B:30:0x00ab, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static IAuthTabCallback IAuthTabCallback(String str) throws Throwable {
            char c;
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i5 = 0;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (true) {
                Object obj = null;
                if (i5 >= strArrSplit.length) {
                    if (i6 != -1) {
                        return new IAuthTabCallback(i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, strArrSplit.length);
                    }
                    return null;
                }
                int i16 = extraCallbackWithResult + 115;
                ICustomTabsCallback = i16 % 128;
                if (i16 % i3 != 0) {
                    Ascii.toLowerCase(strArrSplit[i5].trim()).hashCode();
                    obj.hashCode();
                    throw null;
                }
                String lowerCase = Ascii.toLowerCase(strArrSplit[i5].trim());
                char c2 = 4;
                switch (lowerCase.hashCode()) {
                    case -1178781136:
                        c = 7;
                        if (!lowerCase.equals(TtmlNode.ITALIC)) {
                            c2 = 65535;
                            break;
                        } else {
                            int i17 = ICustomTabsCallback + 27;
                            extraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            c2 = 0;
                            break;
                        }
                    case -1026963764:
                        c = 7;
                        if (lowerCase.equals(TtmlNode.UNDERLINE)) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -192095652:
                        c = 7;
                        if (lowerCase.equals("strikeout")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -70925746:
                        c = 7;
                        if (lowerCase.equals("primarycolour")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3029637:
                        if (lowerCase.equals(TtmlNode.BOLD)) {
                            c = 7;
                            int i19 = ICustomTabsCallback + 7;
                            extraCallbackWithResult = i19 % 128;
                            int i20 = i19 % 2;
                            break;
                        }
                        c = 7;
                        c2 = 65535;
                        break;
                    case 3373707:
                        Object[] objArr = new Object[1];
                        a(new char[]{51631, 16611, 2888, 62735}, (Process.myTid() >> 22) + 4, objArr);
                        if (lowerCase.equals(((String) objArr[0]).intern())) {
                            c2 = 5;
                            c = 7;
                            break;
                        }
                        c = 7;
                        c2 = 65535;
                        break;
                    case 366554320:
                        if (!(!lowerCase.equals("fontsize"))) {
                            c2 = 6;
                            c = 7;
                            break;
                        }
                        c = 7;
                        c2 = 65535;
                        break;
                    case 767321349:
                        if (lowerCase.equals("borderstyle")) {
                            c2 = 7;
                            c = 7;
                            break;
                        }
                        c = 7;
                        c2 = 65535;
                        break;
                    case 1767875043:
                        if (lowerCase.equals("alignment")) {
                            c2 = '\b';
                            c = 7;
                            break;
                        }
                        c = 7;
                        c2 = 65535;
                        break;
                    case 1988365454:
                        if (lowerCase.equals("outlinecolour")) {
                            c2 = '\t';
                            c = 7;
                            break;
                        }
                        c = 7;
                        c2 = 65535;
                        break;
                    default:
                        c = 7;
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        i2 = 2;
                        i12 = i5;
                        continue;
                        i5++;
                        i3 = i2;
                    case 1:
                        int i21 = ICustomTabsCallback + 99;
                        extraCallbackWithResult = i21 % 128;
                        i2 = 2;
                        int i22 = i21 % 2;
                        i13 = i5;
                        continue;
                        i5++;
                        i3 = i2;
                    case 2:
                        i14 = i5;
                        break;
                    case 3:
                        i8 = i5;
                        break;
                    case 4:
                        i11 = i5;
                        break;
                    case 5:
                        i6 = i5;
                        break;
                    case 6:
                        i10 = i5;
                        break;
                    case 7:
                        i15 = i5;
                        break;
                    case '\b':
                        i7 = i5;
                        break;
                    case '\t':
                        i9 = i5;
                        break;
                }
                i2 = 2;
                i5++;
                i3 = i2;
            }
        }
    }

    private ScaffoldKtExternalSyntheticLambda2(String str, int i2, @Nullable Integer num, @Nullable Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        this.asBinder = str;
        this.onExtraCallbackWithResult = i2;
        this.asInterface = num;
        this.IAuthTabCallbackStub = num2;
        this.onNavigationEvent = f;
        this.IAuthTabCallback = z;
        this.onExtraCallback = z2;
        this.onTransact = z3;
        this.IAuthTabCallbackDefault = z4;
        this.onWarmupCompleted = i3;
    }

    public static ScaffoldKtExternalSyntheticLambda2 onNavigationEvent(String str, IAuthTabCallback iAuthTabCallback) {
        RecordingInputConnection_androidKt.onNavigationEvent(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = iAuthTabCallback.IAuthTabCallbackStub;
        if (length != i2) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaStyle", TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", new Object[]{Integer.valueOf(i2), Integer.valueOf(strArrSplit.length), str}));
            return null;
        }
        try {
            String strTrim = strArrSplit[iAuthTabCallback.IAuthTabCallbackDefault].trim();
            int i3 = iAuthTabCallback.onExtraCallbackWithResult;
            int iOnWarmupCompleted = i3 != -1 ? onWarmupCompleted(strArrSplit[i3].trim()) : -1;
            int i4 = iAuthTabCallback.asBinder;
            Integer numOnExtraCallbackWithResult = i4 != -1 ? onExtraCallbackWithResult(strArrSplit[i4].trim()) : null;
            int i5 = iAuthTabCallback.asInterface;
            Integer numOnExtraCallbackWithResult2 = i5 != -1 ? onExtraCallbackWithResult(strArrSplit[i5].trim()) : null;
            int i6 = iAuthTabCallback.onWarmupCompleted;
            float fAsBinder = i6 != -1 ? asBinder(strArrSplit[i6].trim()) : -3.4028235E38f;
            int i7 = iAuthTabCallback.IAuthTabCallback;
            boolean z = i7 != -1 && onNavigationEvent(strArrSplit[i7].trim());
            int i8 = iAuthTabCallback.onExtraCallback;
            boolean z2 = i8 != -1 && onNavigationEvent(strArrSplit[i8].trim());
            int i9 = iAuthTabCallback.IAuthTabCallback_Parcel;
            boolean z3 = i9 != -1 && onNavigationEvent(strArrSplit[i9].trim());
            int i10 = iAuthTabCallback.onTransact;
            boolean z4 = i10 != -1 && onNavigationEvent(strArrSplit[i10].trim());
            int i11 = iAuthTabCallback.onNavigationEvent;
            return new ScaffoldKtExternalSyntheticLambda2(strTrim, iOnWarmupCompleted, numOnExtraCallbackWithResult, numOnExtraCallbackWithResult2, fAsBinder, z, z2, z3, z4, i11 != -1 ? onExtraCallback(strArrSplit[i11].trim()) : -1);
        } catch (RuntimeException e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onWarmupCompleted(String str) throws NumberFormatException {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (IAuthTabCallback(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static int onExtraCallback(String str) throws NumberFormatException {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (onExtraCallback(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer onExtraCallbackWithResult(String str) throws NumberFormatException {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            RecordingInputConnection_androidKt.onNavigationEvent(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j >> 24) & 255) ^ 255), Ints.checkedCast(j & 255), Ints.checkedCast((j >> 8) & 255), Ints.checkedCast((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float asBinder(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    private static boolean onNavigationEvent(String str) throws NumberFormatException {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    static final class onExtraCallback {
        public final PointF onExtraCallbackWithResult;
        public final int onNavigationEvent;
        private static final Pattern IAuthTabCallback = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern asBinder = Pattern.compile(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("\\\\pos\\((%1$s),(%1$s)\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
        private static final Pattern onWarmupCompleted = Pattern.compile(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
        private static final Pattern onExtraCallback = Pattern.compile("\\\\an(\\d+)");

        private onExtraCallback(int i2, @Nullable PointF pointF) {
            this.onNavigationEvent = i2;
            this.onExtraCallbackWithResult = pointF;
        }

        public static onExtraCallback IAuthTabCallback(String str) {
            Matcher matcher = IAuthTabCallback.matcher(str);
            PointF pointF = null;
            int i2 = -1;
            while (matcher.find()) {
                String str2 = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1));
                try {
                    PointF pointFOnExtraCallback = onExtraCallback(str2);
                    if (pointFOnExtraCallback != null) {
                        pointF = pointFOnExtraCallback;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iOnNavigationEvent = onNavigationEvent(str2);
                    if (iOnNavigationEvent != -1) {
                        i2 = iOnNavigationEvent;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new onExtraCallback(i2, pointF);
        }

        public static String onWarmupCompleted(String str) {
            return IAuthTabCallback.matcher(str).replaceAll("");
        }

        private static PointF onExtraCallback(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = asBinder.matcher(str);
            Matcher matcher2 = onWarmupCompleted.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            return new PointF(Float.parseFloat(((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(strGroup)).trim()), Float.parseFloat(((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(strGroup2)).trim()));
        }

        private static int onNavigationEvent(String str) {
            Matcher matcher = onExtraCallback.matcher(str);
            if (matcher.find()) {
                return ScaffoldKtExternalSyntheticLambda2.onWarmupCompleted((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1)));
            }
            return -1;
        }
    }
}
