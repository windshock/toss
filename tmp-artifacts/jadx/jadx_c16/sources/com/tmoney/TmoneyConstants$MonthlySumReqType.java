package com.tmoney;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Total' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TmoneyConstants$MonthlySumReqType {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ TmoneyConstants$MonthlySumReqType[] $VALUES;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final TmoneyConstants$MonthlySumReqType Total;
    public static final TmoneyConstants$MonthlySumReqType UsedPlace;
    private static int asInterface = 0;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;
    private String a;
    private String b;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        c(new char[]{40808, 38204}, 1 - Color.red(0), objArr);
        TmoneyConstants$MonthlySumReqType tmoneyConstants$MonthlySumReqType = new TmoneyConstants$MonthlySumReqType("Total", 0, ((String) objArr[0]).intern(), "사용종합 집계");
        Total = tmoneyConstants$MonthlySumReqType;
        Object[] objArr2 = new Object[1];
        c(new char[]{33705, 6056}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
        TmoneyConstants$MonthlySumReqType tmoneyConstants$MonthlySumReqType2 = new TmoneyConstants$MonthlySumReqType("UsedPlace", 1, ((String) objArr2[0]).intern(), "사용처별 집계");
        UsedPlace = tmoneyConstants$MonthlySumReqType2;
        $VALUES = new TmoneyConstants$MonthlySumReqType[]{tmoneyConstants$MonthlySumReqType, tmoneyConstants$MonthlySumReqType2};
        int i = onTransact + 93;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
    }

    private TmoneyConstants$MonthlySumReqType(String str, int i, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static TmoneyConstants$MonthlySumReqType valueOf(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TmoneyConstants$MonthlySumReqType tmoneyConstants$MonthlySumReqType = (TmoneyConstants$MonthlySumReqType) Enum.valueOf(TmoneyConstants$MonthlySumReqType.class, str);
        int i4 = asInterface + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return tmoneyConstants$MonthlySumReqType;
    }

    public static TmoneyConstants$MonthlySumReqType[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TmoneyConstants$MonthlySumReqType[] tmoneyConstants$MonthlySumReqTypeArr = (TmoneyConstants$MonthlySumReqType[]) $VALUES.clone();
        int i3 = IAuthTabCallbackDefault + 63;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 14 / 0;
        }
        return tmoneyConstants$MonthlySumReqTypeArr;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.a;
        int i5 = i3 + 85;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 47;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.b;
        int i4 = i2 + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 123;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $10 + 101;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i3) + 11;
                        int deadChar = 12434 - KeyEvent.getDeadChar(i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, bitsPerPixel, deadChar, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 10 - (ViewConfiguration.getPressedStateDuration() >> 16), 12434 - TextUtils.getCapsMode("", 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.indexOf("", "")), 14 - (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i14 = $11 + 87;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = (char) 20086;
        onWarmupCompleted = (char) 62540;
        IAuthTabCallback = (char) 16598;
        onExtraCallback = (char) 38156;
    }
}
