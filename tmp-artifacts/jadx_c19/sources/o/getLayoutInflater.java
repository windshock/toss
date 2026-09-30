package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FAIL' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getLayoutInflater {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ getLayoutInflater[] $VALUES;
    public static final getLayoutInflater AS_EMPTY;
    public static final getLayoutInflater DEFAULT;
    public static final getLayoutInflater FAIL;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    public static final getLayoutInflater SET;
    public static final getLayoutInflater SKIP;
    private static int asInterface = 1;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    private getLayoutInflater(String str, int i2) {
    }

    public static getLayoutInflater valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        getLayoutInflater getlayoutinflater = (getLayoutInflater) Enum.valueOf(getLayoutInflater.class, str);
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        return getlayoutinflater;
    }

    public static getLayoutInflater[] values() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 33;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        getLayoutInflater[] getlayoutinflaterArr = $VALUES;
        if (i4 != 0) {
            return (getLayoutInflater[]) getlayoutinflaterArr.clone();
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        getLayoutInflater getlayoutinflater = new getLayoutInflater("SET", 0);
        SET = getlayoutinflater;
        getLayoutInflater getlayoutinflater2 = new getLayoutInflater("SKIP", 1);
        SKIP = getlayoutinflater2;
        Object[] objArr = new Object[1];
        a(new char[]{23262, 63825, 46325, 33211}, 4 - Gravity.getAbsoluteGravity(0, 0), objArr);
        getLayoutInflater getlayoutinflater3 = new getLayoutInflater(((String) objArr[0]).intern(), 2);
        FAIL = getlayoutinflater3;
        getLayoutInflater getlayoutinflater4 = new getLayoutInflater("AS_EMPTY", 3);
        AS_EMPTY = getlayoutinflater4;
        getLayoutInflater getlayoutinflater5 = new getLayoutInflater("DEFAULT", 4);
        DEFAULT = getlayoutinflater5;
        $VALUES = new getLayoutInflater[]{getlayoutinflater, getlayoutinflater2, getlayoutinflater3, getlayoutinflater4, getlayoutinflater5};
        int i2 = onExtraCallbackWithResult + 49;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 33;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                int i9 = $11 + 91;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cRed = (char) Color.red(i4);
                        int i13 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iRed = 12434 - Color.red(i4);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, i13, iRed, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 12434 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 16014), 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19901 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onWarmupCompleted() {
        onExtraCallback = (char) 8076;
        onNavigationEvent = (char) 53538;
        IAuthTabCallback = (char) 23439;
        onWarmupCompleted = (char) 17477;
    }
}
