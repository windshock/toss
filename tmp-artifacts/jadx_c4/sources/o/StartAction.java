package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StartAction {
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;
    private static final byte[] $$a = {93, 49, 76, -114};
    private static final int $$b = 209;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static long onExtraCallbackWithResult = 7798559133331975163L;
    private static int IAuthTabCallbackStub = -1776194565;
    private static char asBinder = 10032;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        int i4 = i2 * 4;
        int i5 = (i * 2) + 4;
        int i6 = s + 109;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            int i10 = i5;
            int i11 = i5 + i8;
            int i12 = i10 + 1;
            i3 = i9;
            i6 = i11;
            i5 = i12;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i6;
            i10 = i5;
            i5 = bArr[i5];
            i9 = i3 + 1;
            i8 = i13;
            int i112 = i5 + i8;
            int i122 = i10 + 1;
            i3 = i9;
            i6 = i112;
            i5 = i122;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartAction)) {
            int i2 = IAuthTabCallbackDefault + 101;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        StartAction startAction = (StartAction) obj;
        if (this.IAuthTabCallback != startAction.IAuthTabCallback) {
            int i4 = IAuthTabCallbackDefault + 55;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.onNavigationEvent != startAction.onNavigationEvent) {
            return false;
        }
        if (this.onWarmupCompleted != startAction.onWarmupCompleted) {
            int i5 = IAuthTabCallbackDefault + 125;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.onExtraCallback == startAction.onExtraCallback) {
            return true;
        }
        int i7 = onTransact + 13;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((((Integer.hashCode(this.IAuthTabCallback) << 42) + Integer.hashCode(this.onNavigationEvent)) / 18) + Integer.hashCode(this.onWarmupCompleted)) % 81) << Integer.hashCode(this.onExtraCallback) : (((((Integer.hashCode(this.IAuthTabCallback) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.onExtraCallback);
        int i3 = IAuthTabCallbackDefault + 45;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.IAuthTabCallback;
        int i3 = this.onNavigationEvent;
        int i4 = this.onWarmupCompleted;
        int i5 = this.onExtraCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf("", "", 0) - 1241334144, new char[]{40171, 55016, 62908, 64161, 15051, 21469, 17287, 47786, 36639}, new char[]{0, 0, 0, 0}, new char[]{33006, 702, 39094, 17454}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a((char) KeyEvent.getDeadChar(0, 0), 1176823639 - TextUtils.getTrimmedLength(""), new char[]{52104, 50058, 9635, 12025, 33127, 14723, 36383}, new char[]{0, 0, 0, 0}, new char[]{22341, 9447, 3654, 25676}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(i3);
        Object[] objArr3 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Process.myTid() >> 22, new char[]{33241, 14152, 4916, 34579, 41831, 41255, 5755, 40608}, new char[]{0, 0, 0, 0}, new char[]{54544, 63244, 45070, 33150}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(i4);
        Object[] objArr4 = new Object[1];
        a((char) (KeyEvent.getMaxKeyCode() >> 16), Gravity.getAbsoluteGravity(0, 0) + 725683044, new char[]{22299, 11455, 24862, 64407, 65286, 63823, 3789, 5827, 58119}, new char[]{0, 0, 0, 0}, new char[]{25731, 16651, 43051, 59485}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(i5);
        Object[] objArr5 = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 34733), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 854512071, new char[]{46402}, new char[]{0, 0, 0, 0}, new char[]{51447, 61137, 44082, 24711}, objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i6 = onTransact + 121;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }

    public StartAction(int i, int i2, int i3, int i4) {
        this.IAuthTabCallback = i;
        this.onNavigationEvent = i2;
        this.onWarmupCompleted = i3;
        this.onExtraCallback = i4;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i3 + 33;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 31;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.onWarmupCompleted;
        int i5 = i2 + 53;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.IAuthTabCallback;
        if (i3 == 0) {
            int i5 = 36 / 0;
        }
        return i4;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 81;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.onNavigationEvent;
        int i5 = i2 + 65;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2 == 0 ? this.onWarmupCompleted << this.onExtraCallback : this.onWarmupCompleted * this.onExtraCallback;
        int i5 = i3 + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        double d = this.IAuthTabCallback + (this.onWarmupCompleted / 2.0d);
        int i5 = i3 + 77;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onNavigationEvent;
        return i3 == 0 ? i4 % (this.onExtraCallback - 2.0d) : i4 + (this.onExtraCallback / 2.0d);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
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
        int i3 = $10 + 27;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 47;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 43, 1451 - TextUtils.indexOf("", "", 0), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 45, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 23972), 50 - (ViewConfiguration.getEdgeSlop() >> 16), View.getDefaultSize(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                c2 = 2;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - MotionEvent.axisFromString("")), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.resolveSize(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                c2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
