package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setExtraData extends onReceiveCdp<BaseListRowLocal.Left.Image.Corner> {
    private static long IAuthTabCallback;
    private static char onExtraCallback;
    public static final setExtraData onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {79, 7, -80, -125};
    private static final int $$b = 148;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4;
        int i5;
        byte[] bArr = $$a;
        int i6 = i + 4;
        int i7 = i2 + 109;
        int i8 = (b * 4) + 1;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            i4 = i6;
            int i9 = i8;
            i5 = 0;
            i6 += i9;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i5 == i8) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i4];
            i6 += i9;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i5 == i8) {
            }
        } else {
            i3 = 0;
            i4 = i6;
            i6 = i7;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i5 == i8) {
            }
        }
    }

    static {
        onWarmupCompleted = 0;
        onNavigationEvent();
        onExtraCallbackWithResult = new setExtraData();
        int i = IAuthTabCallbackStub + 123;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private setExtraData() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BaseListRowLocal.Left.Image.Corner.class);
        Pair[] pairArr = {getWrite.IAuthTabCallback("CIRCULAR", Reflection.getOrCreateKotlinClass(BaseListRowLocal.Left.Image.Corner.Circular.class)), getWrite.IAuthTabCallback("BEZIER", Reflection.getOrCreateKotlinClass(BaseListRowLocal.Left.Image.Corner.Bezier.class))};
        Object[] objArr = new Object[1];
        a((char) (27055 - ImageFormat.getBitsPerPixel(0)), View.MeasureSpec.getSize(0), new char[]{36912, 10801, 26171, 4776}, new char[]{56783, 8249, 49767, 38712}, new char[]{42430, 39713, 45233, 60777}, objArr);
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 79;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), MotionEvent.axisFromString("") + 44, 1452 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.MeasureSpec.getMode(0)), 44 - TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionChild(0L) + 1495, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 23972), (ViewConfiguration.getPressedStateDuration() >> 16) + 50, Color.rgb(0, 0, 0) + 16800155, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getTouchSlop() >> 8) + 29, 12578 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 47;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = -359498169893472716L;
        onNavigationEvent = -1776194565;
        onExtraCallback = (char) 27643;
    }
}
