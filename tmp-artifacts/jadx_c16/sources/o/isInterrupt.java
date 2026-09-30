package o;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.BarGraphVerticalLocal;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isInterrupt extends onReceiveCdp<BarGraphVerticalLocal.ZeroLineStyle> {
    private static char IAuthTabCallback;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final isInterrupt onWarmupCompleted;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 249;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = 110 - i2;
        int i6 = i * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            int i10 = i4;
            int i11 = i4 + i8;
            i3 = i9;
            int i12 = i10;
            i5 = i11;
            i4 = i12;
            int i13 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i14 = i5;
            i10 = i13;
            i4 = bArr[i13];
            i8 = i14;
            int i112 = i4 + i8;
            i3 = i9;
            int i122 = i10;
            i5 = i112;
            i4 = i122;
            int i132 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1322 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    static {
        onExtraCallbackWithResult = 0;
        onWarmupCompleted();
        onWarmupCompleted = new isInterrupt();
        int i = asBinder + 7;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private isInterrupt() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BarGraphVerticalLocal.ZeroLineStyle.class);
        Pair[] pairArr = {getWrite.IAuthTabCallback("SOLID", Reflection.getOrCreateKotlinClass(BarGraphVerticalLocal.ZeroLineStyle.Solid.class)), getWrite.IAuthTabCallback("DASH_DOTTED", Reflection.getOrCreateKotlinClass(BarGraphVerticalLocal.ZeroLineStyle.DashDotted.class))};
        Object[] objArr = new Object[1];
        a((char) (5096 - TextUtils.lastIndexOf("", '0')), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, new char[]{6414, 14809, 18155, 3495}, new char[]{0, 0, 0, 0}, new char[]{14132, 27632, 59668, 48659}, objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), access8100.onWarmupCompleted(pairArr), (String) null, 8, (DefaultConstructorMarker) null);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 105;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 2;
        }
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 63;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 44 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1450 - ExpandableListView.getPackedPositionChild(0L), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 49123), AndroidCharacter.getMirror('0') - 4, 1493 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 51, AndroidCharacter.getMirror('0') + 22891, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getEdgeSlop() >> 16) + 29, 12577 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i8 = $10 + 93;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i10 = $10 + 81;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallback = 7798559133331975163L;
        onNavigationEvent = -1776194565;
        IAuthTabCallback = (char) 11708;
    }
}
