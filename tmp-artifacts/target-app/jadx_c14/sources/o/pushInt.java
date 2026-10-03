package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class pushInt {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackDefault;
    private static char asBinder;
    private static int asInterface;
    public static final int onExtraCallback;
    private static long onTransact;
    public static final String onWarmupCompleted;
    private boolean IAuthTabCallback;
    private final setAdUnitIds onExtraCallbackWithResult;
    private onExtraCallback onNavigationEvent;
    private static final byte[] $$a = {94, -53, 28, -60};
    private static final int $$b = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 1;
    private static int IAuthTabCallbackStub = 0;

    public interface onExtraCallback {
        void onEnabledChanged(boolean z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r8 = r8 + 109
            int r6 = r6 + 4
            byte[] r0 = o.pushInt.$$a
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pushInt.$$c(int, int, byte):java.lang.String");
    }

    static {
        asInterface = 1;
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a((char) TextUtils.getTrimmedLength(""), Process.myPid() >> 22, new char[]{388, 47153, 38673, 24040, 16062, 32925, 64767, 6179, 36039, 65128, 28332, 8289, 37999, 52362, 8097, 35338, 7105, 40597, 1666, 58055, 57612, 52899, 21774, 51315, 55518, 18516, 32300, 47549, 13879, 18387, 52934, 41346, 16566, 35032, 42810, 28325}, new char[]{0, 0, 0, 0}, new char[]{47485, 46536, 58460, 33784}, objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallback = 8;
        int i = IAuthTabCallbackStub + 109;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public pushInt(@NotNull setAdUnitIds setadunitids) {
        Intrinsics.checkNotNullParameter(setadunitids, "");
        this.onExtraCallbackWithResult = setadunitids;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 69;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = z;
        int i5 = i2 + 95;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 97;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i2 + 99;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onExtraCallback() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.pushInt.access000
            int r1 = r1 + 117
            int r2 = r1 % 128
            o.pushInt.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1b
            o.setAdUnitIds r1 = r4.onExtraCallbackWithResult
            boolean r1 = r1.IAuthTabCallback()
            r3 = 65
            int r3 = r3 / r2
            if (r1 == 0) goto L3a
            goto L23
        L1b:
            o.setAdUnitIds r1 = r4.onExtraCallbackWithResult
            boolean r1 = r1.IAuthTabCallback()
            if (r1 == 0) goto L3a
        L23:
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.getSmallIconBitmap()
            java.lang.String r3 = "pref_qr_pass_shake_on"
            boolean r1 = r1.onExtraCallback(r3, r2)
            if (r1 == 0) goto L3a
            int r1 = o.pushInt.getInterfaceDescriptor
            int r1 = r1 + 13
            int r2 = r1 % 128
            o.pushInt.access000 = r2
            int r1 = r1 % r0
            r0 = 1
            return r0
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pushInt.onExtraCallback():boolean");
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        addPolicy.getSmallIconBitmap().onNavigationEvent("pref_qr_pass_shake_on", z);
        onExtraCallback onextracallback = this.onNavigationEvent;
        if (onextracallback != null) {
            onextracallback.onEnabledChanged(z);
            int i2 = getInterfaceDescriptor + 115;
            access000 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = getInterfaceDescriptor + 1;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = access000 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onNavigationEvent = onextracallback;
        int i4 = access000 + 119;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $11 + 63;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $11 + 31;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i5, i5));
                    int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42;
                    int iAlpha = 1451 - Color.alpha(i5);
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i10, iAlpha, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(i5) + 20) >> 6) + 49123), (ViewConfiguration.getLongPressTimeout() >> 16) + 44, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23972), KeyEvent.getDeadChar(0, 0) + 50, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                i2 = 2;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 45848), 28 - TextUtils.lastIndexOf("", '0'), 12577 - (KeyEvent.getMaxKeyCode() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onTransact ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackDefault ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i3 = i2;
                            i5 = 0;
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

    static void onExtraCallbackWithResult() {
        onTransact = 7798559133331975163L;
        IAuthTabCallbackDefault = -1776194565;
        asBinder = (char) 51260;
    }
}
