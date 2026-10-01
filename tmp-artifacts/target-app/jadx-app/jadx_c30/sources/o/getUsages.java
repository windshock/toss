package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
abstract class getUsages {
    public /* synthetic */ getUsages(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private getUsages() {
    }

    public static final class IAuthTabCallback extends getUsages {
        private final String onWarmupCompleted;
        private static final byte[] $$a = {25, 43, 92, -56};
        private static final int $$b = 91;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int IAuthTabCallback = 478308971;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, byte b) {
            int i;
            byte[] bArr = $$a;
            int i2 = 105 - (b * 2);
            int i3 = (s * 4) + 1;
            int i4 = 3 - (s2 * 4);
            byte[] bArr2 = new byte[i3];
            if (bArr == null) {
                int i5 = i2;
                i = 0;
                i2 = i3;
                i2 += i5;
                bArr2[i] = (byte) i2;
                i++;
                i4++;
                if (i == i3) {
                    return new String(bArr2, 0);
                }
                i5 = bArr[i4];
                i2 += i5;
                bArr2[i] = (byte) i2;
                i++;
                i4++;
                if (i == i3) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i2;
                i++;
                i4++;
                if (i == i3) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 1;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, ((IAuthTabCallback) obj).onWarmupCompleted)) {
                return false;
            }
            int i6 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.onWarmupCompleted;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, new char[]{0, 1, '\n', 16, 5, 2, 5, 1, 14, 65497, 65519, 17, 65535, 65535, 1, 15, 15, 65476, 1, 18, 1, '\n', 16, 65509}, false, 166 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{0}, false, 108 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 90 / 0;
            }
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            this.onWarmupCompleted = str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 83;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 117;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x016f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i6 = $10 + 109;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 3;
            }
            while (true) {
                j = 0;
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 24, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 55 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                int i9 = $11 + 101;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 12843);
                        int deadChar = 55 - KeyEvent.getDeadChar(0, 0);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j) + 2167;
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, deadChar, packedPositionGroup, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i11 = $11 + 5;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    j = 0;
                    i4 = 2083011369;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    public static final class onExtraCallback extends getUsages {
        private final String onExtraCallback;
        private static final byte[] $$a = {57, 22, -21, -92};
        private static final int $$b = 26;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        private static long onWarmupCompleted = 7798559133331975163L;
        private static int onNavigationEvent = -1776194565;
        private static char onExtraCallbackWithResult = 56928;

        private static String $$c(short s, short s2, int i) {
            int i2 = i * 2;
            int i3 = 110 - s;
            byte[] bArr = $$a;
            int i4 = 3 - (s2 * 2);
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 += -i4;
                i4 = i4;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i3;
                int i7 = i4 + 1;
                if (i6 == i2) {
                    return new String(bArr2, 0);
                }
                i3 += -bArr[i7];
                i4 = i7;
                i5 = i6;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 113;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 31;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, ((onExtraCallback) obj).onExtraCallback)) {
                return true;
            }
            int i5 = IAuthTabCallbackStub + 43;
            IAuthTabCallback = i5 % 128;
            return i5 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallback.hashCode();
            int i4 = IAuthTabCallbackStub + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.onExtraCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((char) (Process.myTid() >> 22), (-527168666) - View.resolveSize(0, 0), new char[]{34626, 23344, 42632, 13633, 51030, 27725, 41438, 60508, 44165, 58898, 41838}, new char[]{0, 0, 0, 0}, new char[]{26276, 37899, 17376, 7738}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a((char) (39786 - MotionEvent.axisFromString(BuildConfig.FLAVOR)), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 286586862, new char[]{35774}, new char[]{0, 0, 0, 0}, new char[]{61155, 5367, 27409, 44699}, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallbackStub + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 0 / 0;
            }
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            this.onExtraCallback = str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            char c2;
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i3 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i4 = $10 + 73;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i6 = $11 + 97;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 43;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1451;
                        byte b = (byte) i3;
                        byte b2 = b;
                        String str$$c = $$c(b, b2, b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i3] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, pressedStateDuration, windowTouchSlop, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char cIndexOf = (char) (49122 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i3, i3));
                        int defaultSize = View.getDefaultSize(i3, i3) + 44;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1495;
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        String str$$c2 = $$c(b3, b4, b4);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i3] = Object.class;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, defaultSize, modifierMetaStateMask, 1533236389, false, str$$c2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    int i8 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i8);
                    objArr4[i3] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        char c3 = (char) (23972 - (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1)));
                        int iMyPid = 50 - (Process.myPid() >> 22);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22939;
                        Class[] clsArr3 = new Class[3];
                        clsArr3[i3] = Object.class;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[2] = Integer.TYPE;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iMyPid, keyRepeatDelay, 1872485556, false, "k", clsArr3);
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i9 = cArr4[iIntValue2] * 32718;
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                    objArr5[i3] = Integer.valueOf(i9);
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 45848);
                        int mirror = 'M' - AndroidCharacter.getMirror('0');
                        int iResolveSize = 12577 - View.resolveSize(i3, i3);
                        c2 = 2;
                        Class[] clsArr4 = new Class[2];
                        clsArr4[i3] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, mirror, iResolveSize, 1401536470, false, "l", clsArr4);
                    } else {
                        c2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onNavigationEvent ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i3 = 0;
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
    }
}
