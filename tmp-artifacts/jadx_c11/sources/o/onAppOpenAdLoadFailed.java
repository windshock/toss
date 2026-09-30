package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.swmansion.rnscreens.ScreenContentWrapper;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAppOpenAdLoadFailed {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final onAppOpenAdLoadFailed onWarmupCompleted;

    static {
        onExtraCallback();
        onWarmupCompleted = new onAppOpenAdLoadFailed();
        int i = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface;
        private static int[] onTransact = {768341670, -1219009561, -829576738, -656670201, -478728359, -405553081, 783299003, 595884271, 1604882509, -1768614710, 1159975216, 1546780733, -2041961052, 1285969836, 821680968, 700913410, 802482510, -960415916};
        private final int IAuthTabCallback;
        private final int IAuthTabCallbackStub;
        private final boolean asBinder;
        private final int onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 121;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i5 = i2 + 93;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (this.IAuthTabCallbackStub != onwarmupcompleted.IAuthTabCallbackStub || !Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) || this.onExtraCallback != onwarmupcompleted.onExtraCallback || this.IAuthTabCallback != onwarmupcompleted.IAuthTabCallback) {
                return false;
            }
            if (this.asBinder != onwarmupcompleted.asBinder) {
                int i7 = IAuthTabCallbackDefault + 5;
                asInterface = i7 % 128;
                return i7 % 2 != 0;
            }
            if (this.onExtraCallbackWithResult != onwarmupcompleted.onExtraCallbackWithResult) {
                return false;
            }
            if (this.onNavigationEvent == onwarmupcompleted.onNavigationEvent) {
                return true;
            }
            int i8 = IAuthTabCallbackDefault + 57;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 125;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((Integer.hashCode(this.IAuthTabCallbackStub) * 31) + this.onWarmupCompleted.hashCode()) * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.asBinder)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult)) * 31) + Boolean.hashCode(this.onNavigationEvent);
            int i4 = asInterface + 5;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Diagnosis(preDrawCount=" + this.IAuthTabCallbackStub + ", hostState=" + this.onWarmupCompleted + ", hostChildCount=" + this.onExtraCallback + ", contentWrapperCount=" + this.IAuthTabCallback + ", wrapperBranch=" + this.asBinder + ", bandBranch=" + this.onExtraCallbackWithResult + ", hasAnyLeaf=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallbackDefault + 37;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2 = 2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onTransact;
            int i4 = -1469660336;
            if (iArr3 != null) {
                int i5 = $10 + 115;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 31;
                    $10 = i7 % 128;
                    if (i7 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 71, 8848 - Color.argb(0, 0, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i6--;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.normalizeMetaState(0) + 72, 8848 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i6++;
                    }
                    int i8 = $11 + 67;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 2;
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onTransact;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 73, KeyEvent.normalizeMetaState(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i10++;
                    i4 = -1469660336;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i11 = $11 + 95;
                $10 = i11 % 128;
                int i12 = 2;
                int i13 = i11 % 2;
                int i14 = 0;
                while (i14 < 16) {
                    int i15 = $10 + 21;
                    $11 = i15 % 128;
                    if (i15 % i12 == 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - MotionEvent.axisFromString("")), 39 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i14 += 98;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                        Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf("", '0', 0)), KeyEvent.getDeadChar(0, 0) + 39, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i14++;
                    }
                    i12 = 2;
                }
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - Process.getGidForName("")), 78 - ExpandableListView.getPackedPositionGroup(0L), Color.red(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public onWarmupCompleted(int i, @NotNull String str, int i2, int i3, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallbackStub = i;
            this.onWarmupCompleted = str;
            this.onExtraCallback = i2;
            this.IAuthTabCallback = i3;
            this.asBinder = z;
            this.onExtraCallbackWithResult = z2;
            this.onNavigationEvent = z3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(int i, String str, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            int i5;
            boolean z4;
            int i6 = (i4 & 4) != 0 ? 0 : i2;
            if ((i4 & 8) != 0) {
                int i7 = IAuthTabCallbackDefault + 69;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
                i5 = 0;
            } else {
                i5 = i3;
            }
            boolean z5 = (i4 & 16) != 0 ? false : z;
            boolean z6 = (i4 & 32) != 0 ? false : z2;
            if ((i4 & 64) != 0) {
                int i9 = asInterface;
                int i10 = i9 + 11;
                IAuthTabCallbackDefault = i10 % 128;
                boolean z7 = i10 % 2 == 0;
                int i11 = i9 + 75;
                IAuthTabCallbackDefault = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 2 % 2;
                }
                z4 = z7;
            } else {
                z4 = z3;
            }
            this(i, str, i6, i5, z5, z6, z4);
        }

        public final String onWarmupCompleted() throws Throwable {
            int i = 2 % 2;
            boolean z = this.asBinder;
            if (z && this.onExtraCallbackWithResult) {
                int i2 = asInterface + 45;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return "both";
            }
            if (z) {
                return "wrapper";
            }
            if (this.onExtraCallbackWithResult) {
                return "band";
            }
            Object[] objArr = new Object[1];
            a(new int[]{109211818, -190907893}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i4 = asInterface + 93;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
            return strIntern;
        }

        public final String onNavigationEvent() throws Throwable {
            int i = 2 % 2;
            if (this.IAuthTabCallbackStub == 0) {
                return "not_drawn";
            }
            String str = this.onWarmupCompleted;
            Object[] objArr = new Object[1];
            a(new int[]{109211818, -190907893}, 3 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
            if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
                return "no_host";
            }
            Object obj = null;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, "ready")) {
                int i2 = asInterface + 41;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return "host_not_ready";
                }
                throw null;
            }
            if (!this.asBinder && !this.onExtraCallbackWithResult) {
                return this.onExtraCallback == 0 ? "no_children" : !this.onNavigationEvent ? "empty_content" : "leaf_outside_gate";
            }
            int i3 = asInterface + 27;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return "gate_missed";
            }
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            String str = "preDraws=" + this.IAuthTabCallbackStub + " host=" + this.onWarmupCompleted + " children=" + this.onExtraCallback + " wrappers=" + this.IAuthTabCallback + " wrapper=" + this.asBinder + " band=" + this.onExtraCallbackWithResult + " leaf=" + this.onNavigationEvent;
            int i2 = asInterface + 81;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i4 = -1469660336;
        int i5 = 16;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> i5), Color.blue(0) + 72, 8848 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    int i8 = $10 + 91;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = -1469660336;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i10]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", i6, i6), Color.green(i6) + 72, (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i10++;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        int i11 = $11 + 83;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $10 + 105;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 22252), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 38, 10300 - TextUtils.lastIndexOf("", '0', 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i15++;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 78 - Color.argb(0, 0, 0, 0), 7398 - View.MeasureSpec.getMode(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private onAppOpenAdLoadFailed() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final onWarmupCompleted onExtraCallbackWithResult(@Nullable ViewGroup viewGroup, int i) throws Throwable {
        String str;
        String str2;
        boolean zAreEqual;
        boolean z;
        boolean z2;
        int i2 = 2 % 2;
        if (viewGroup == null) {
            Object[] objArr = new Object[1];
            a(new int[]{737552881, 1763100263}, 4 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
            return new onWarmupCompleted(i, ((String) objArr[0]).intern(), 0, 0, false, false, false, 124, null);
        }
        if (!viewGroup.isLaidOut()) {
            int i3 = onNavigationEvent + 53;
            onTransact = i3 % 128;
            str2 = "not_laid_out";
            if (i3 % 2 == 0) {
                int i4 = 21 / 0;
            }
        } else {
            if (viewGroup.getHeight() > 0) {
                str = "ready";
                zAreEqual = Intrinsics.areEqual(str, "ready");
                int childCount = viewGroup.getChildCount();
                int iOnExtraCallback = onExtraCallback(viewGroup);
                if (!zAreEqual) {
                    int i5 = onTransact + 79;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        r8lambdayDPuBF8wSyjklQIWh1vEa1fyo.IAuthTabCallback.onExtraCallback((View) viewGroup);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (r8lambdayDPuBF8wSyjklQIWh1vEa1fyo.IAuthTabCallback.onExtraCallback((View) viewGroup)) {
                        z = true;
                    } else {
                        int i6 = onNavigationEvent + 117;
                        onTransact = i6 % 128;
                        int i7 = i6 % 2;
                        z = false;
                    }
                }
                if (!zAreEqual) {
                    int i8 = onNavigationEvent + 79;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    z2 = r8lambdayDPuBF8wSyjklQIWh1vEa1fyo.IAuthTabCallback.onWarmupCompleted(viewGroup);
                }
                return new onWarmupCompleted(i, str, childCount, iOnExtraCallback, z, z2, r8lambdayDPuBF8wSyjklQIWh1vEa1fyo.IAuthTabCallback.onExtraCallbackWithResult(viewGroup));
            }
            int i10 = onTransact + 81;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            str2 = "zero_height";
        }
        str = str2;
        zAreEqual = Intrinsics.areEqual(str, "ready");
        int childCount2 = viewGroup.getChildCount();
        int iOnExtraCallback2 = onExtraCallback(viewGroup);
        if (!zAreEqual) {
        }
        if (!zAreEqual) {
        }
        return new onWarmupCompleted(i, str, childCount2, iOnExtraCallback2, z, z2, r8lambdayDPuBF8wSyjklQIWh1vEa1fyo.IAuthTabCallback.onExtraCallbackWithResult(viewGroup));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    private final int onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            ?? r1 = view instanceof ScreenContentWrapper;
            if (!(view instanceof ViewGroup)) {
                return r1;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i3 = onTransact + 123;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 3;
            }
            int i5 = 0;
            int iOnExtraCallback = r1;
            while (i5 < childCount) {
                View childAt = viewGroup.getChildAt(i5);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                i5++;
                iOnExtraCallback += onExtraCallback(childAt);
            }
            return iOnExtraCallback;
        }
        boolean z = view instanceof ScreenContentWrapper;
        boolean z2 = view instanceof ViewGroup;
        throw null;
    }

    static void onExtraCallback() {
        onExtraCallback = new int[]{-1607149112, 1336732659, -1066200525, 790187156, 1695380960, 253430084, 1029897558, -1012231075, 14155447, -1803489542, 711668146, 377507010, -188962691, -1879181224, -828732831, 1877981243, -1121936414, 1100292609};
    }
}
