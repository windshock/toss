package o;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setSecondaryProgressColor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setSecondaryProgressColor[] $VALUES;
    public static final setSecondaryProgressColor AES;
    private static int IAuthTabCallback;
    public static final setSecondaryProgressColor RSA;
    private static int onNavigationEvent;
    private static final byte[] $$a = {52, -58, -85, 74};
    private static final int $$b = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = (s * 4) + 4;
        int i4 = 105 - (b * 4);
        int i5 = i * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            int i8 = i6;
            i2 = i3;
            i3 += i8;
            i2++;
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i2];
            i3 += i8;
            i2++;
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
            }
        } else {
            i3 = i4;
            i2 = i3;
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
            }
        }
    }

    private static final /* synthetic */ setSecondaryProgressColor[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new setSecondaryProgressColor[]{RSA, AES};
        }
        setSecondaryProgressColor setsecondaryprogresscolor = RSA;
        setSecondaryProgressColor setsecondaryprogresscolor2 = AES;
        setSecondaryProgressColor[] setsecondaryprogresscolorArr = new setSecondaryProgressColor[2];
        setsecondaryprogresscolorArr[0] = setsecondaryprogresscolor;
        setsecondaryprogresscolorArr[0] = setsecondaryprogresscolor2;
        return setsecondaryprogresscolorArr;
    }

    public static EnumEntries<setSecondaryProgressColor> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<setSecondaryProgressColor> enumEntries = $ENTRIES;
        int i5 = i3 + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static setSecondaryProgressColor valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setSecondaryProgressColor setsecondaryprogresscolor = (setSecondaryProgressColor) Enum.valueOf(setSecondaryProgressColor.class, str);
        int i4 = onExtraCallback + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return setsecondaryprogresscolor;
        }
        throw null;
    }

    public static setSecondaryProgressColor[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setSecondaryProgressColor[] setsecondaryprogresscolorArr = (setSecondaryProgressColor[]) $VALUES.clone();
        int i4 = onExtraCallback + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return setsecondaryprogresscolorArr;
    }

    private setSecondaryProgressColor(String str, int i) {
    }

    static {
        IAuthTabCallback = 1;
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0) + 3, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, new char[]{6, 7, 65525}, false, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 94, objArr);
        RSA = new setSecondaryProgressColor(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, View.resolveSizeAndState(0, 0, 0) + 3, new char[]{65529, 65533, 11}, false, 90 - TextUtils.indexOf("", "", 0, 0), objArr2);
        AES = new setSecondaryProgressColor(((String) objArr2[0]).intern(), 1);
        setSecondaryProgressColor[] setsecondaryprogresscolorArr$values = $values();
        $VALUES = setsecondaryprogresscolorArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setsecondaryprogresscolorArr$values);
        int i = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 27;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 22 - TextUtils.indexOf((CharSequence) "", '0'), 10277 - ExpandableListView.getPackedPositionChild(0L), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12842), 55 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2166 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), 55 - TextUtils.indexOf("", ""), 2166 - MotionEvent.axisFromString(""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = $11 + 113;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 478308923;
    }
}
