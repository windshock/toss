package viva.republica.toss.password;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.PathMotion;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.accessgetPoolcp;
import o.animate;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PasswordFragment extends BaseFragment implements captureEndValues {
    private volatile captureHierarchy IAuthTabCallback;
    private boolean onExtraCallback;
    private ContextWrapper onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final Object onWarmupCompleted;
    private static final byte[] $$a = {93, 49, 76, -114};
    private static final int $$b = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static long onTransact = 7798559133331975163L;
    private static int asBinder = -1776194565;
    private static char IAuthTabCallbackStub = 40749;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, short r7) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 + 109
            int r5 = r5 * 4
            int r5 = 3 - r5
            byte[] r1 = viva.republica.toss.password.Hilt_PasswordFragment.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r3 = r1[r5]
        L27:
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Hilt_PasswordFragment.$$c(byte, int, short):java.lang.String");
    }

    Hilt_PasswordFragment() {
        this.onWarmupCompleted = new Object();
        this.onExtraCallback = false;
    }

    Hilt_PasswordFragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.onExtraCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        onExtraCallbackWithResult();
        onWarmupCompleted();
        int i4 = asInterface + 93;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttach(android.app.Activity r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            super/*androidx.fragment.app.Fragment*/.onAttach(r11)
            android.content.ContextWrapper r1 = r10.onExtraCallbackWithResult
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L29
            int r4 = viva.republica.toss.password.Hilt_PasswordFragment.IAuthTabCallbackDefault
            int r4 = r4 + 37
            int r5 = r4 % 128
            viva.republica.toss.password.Hilt_PasswordFragment.asInterface = r5
            int r4 = r4 % r0
            android.content.Context r1 = o.captureHierarchy.onWarmupCompleted(r1)
            if (r1 == r11) goto L29
            int r11 = viva.republica.toss.password.Hilt_PasswordFragment.asInterface
            int r11 = r11 + 13
            int r1 = r11 % 128
            viva.republica.toss.password.Hilt_PasswordFragment.IAuthTabCallbackDefault = r1
            int r11 = r11 % r0
            if (r11 == 0) goto L27
            goto L29
        L27:
            r11 = r3
            goto L2a
        L29:
            r11 = r2
        L2a:
            int r0 = android.graphics.Color.argb(r3, r3, r3, r3)
            int r0 = r0 + 30896
            char r4 = (char) r0
            r0 = -482772308(0xffffffffe3397aac, float:-3.421487E21)
            int r1 = android.view.Gravity.getAbsoluteGravity(r3, r3)
            int r5 = r1 + r0
            r0 = 93
            char[] r6 = new char[r0]
            r6 = {x0066: FILL_ARRAY_DATA , data: [-24553, 2614, 17057, 18526, -5365, 6662, 131, 20346, 16903, 9112, -9193, 28309, -18725, 29934, -4213, 19087, 3679, -22213, 7984, 32498, -19810, 1346, -31587, -28005, -29762, 1984, 17228, 28610, -10259, -9906, 7560, 29059, 6171, 7999, -21503, 18011, -14372, 14747, -25157, -12593, 23077, -17060, 25187, -30986, 15123, -9950, -426, 22225, -22478, 9819, 23318, -11216, -3740, 17246, -4554, -12936, -1977, 8705, -8946, 32658, -7419, 778, -31756, -3637, -27143, -30583, -26569, -26218, 2505, 17956, -11065, -16095, 22142, -12497, -29113, -7645, 25553, -519, -19435, 30620, 13766, 16019, 20667, 12717, 24183, 23669, 20239, 15681, 13474, 32648, -19527, 17219, -29175} // fill-array
            r0 = 4
            char[] r7 = new char[r0]
            r7 = {x00c8: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            char[] r8 = new char[r0]
            r8 = {x00d0: FILL_ARRAY_DATA , data: [-21378, 14714, -20253, 14200} // fill-array
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r9 = r0
            a(r4, r5, r6, r7, r8, r9)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            o.runAnimator.IAuthTabCallback(r11, r0, r1)
            r10.onExtraCallbackWithResult()
            r10.onWarmupCompleted()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Hilt_PasswordFragment.onAttach(android.app.Activity):void");
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onNavigationEvent = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i3 = asInterface + 101;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (super/*androidx.fragment.app.Fragment*/.getContext() != null || this.onNavigationEvent) {
            onExtraCallbackWithResult();
            return this.onExtraCallbackWithResult;
        }
        int i4 = asInterface + 99;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
            return layoutInflaterOnGetLayoutInflater.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater, this));
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater2 = super/*androidx.fragment.app.Fragment*/.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater2.cloneInContext(captureHierarchy.IAuthTabCallback(layoutInflaterOnGetLayoutInflater2, this));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = onNavigationEvent().generatedComponent();
        int i4 = IAuthTabCallbackDefault + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected captureHierarchy onExtraCallback() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = IAuthTabCallbackDefault + 47;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
        return capturehierarchy;
    }

    public final captureHierarchy onNavigationEvent() {
        if (this.IAuthTabCallback == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.IAuthTabCallback == null) {
                    this.IAuthTabCallback = onExtraCallback();
                }
            }
        }
        return this.IAuthTabCallback;
    }

    protected void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.onExtraCallback) {
            return;
        }
        this.onExtraCallback = true;
        ((accessgetPoolcp) generatedComponent()).onNavigationEvent((PasswordFragment) animate.onExtraCallbackWithResult(this));
        int i3 = IAuthTabCallbackDefault + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
            obj.hashCode();
            throw null;
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i3 = asInterface + 17;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 31;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cRgb = (char) ((-16777216) - Color.rgb(i4, i4, i4));
                    int jumpTapTimeout = 43 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1451;
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, jumpTapTimeout, iKeyCodeFromString, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 49123), 44 - Color.green(i4), (KeyEvent.getMaxKeyCode() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 50 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 45848), 29 - KeyEvent.keyCodeFromString(""), 12577 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onTransact ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackStub ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i7 = $10 + 59;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2;
                i4 = 0;
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
