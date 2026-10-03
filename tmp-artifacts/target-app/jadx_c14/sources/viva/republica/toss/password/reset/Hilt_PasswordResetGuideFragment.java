package viva.republica.toss.password.reset;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.PathMotion;
import o.captureEndValues;
import o.captureHierarchy;
import o.nativeRegisterWithPerfetto;
import o.runAnimator;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_PasswordResetGuideFragment extends BaseFragment implements captureEndValues {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackDefault = 60856;
    private static char IAuthTabCallbackStub = 8323;
    private static int access000 = 1;
    private static char asBinder = 42948;
    private static int asInterface = 0;
    private static char onTransact = 34430;
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private volatile captureHierarchy onExtraCallbackWithResult;
    private ContextWrapper onNavigationEvent;
    private final Object onWarmupCompleted;

    Hilt_PasswordResetGuideFragment() {
        this.onWarmupCompleted = new Object();
        this.IAuthTabCallback = false;
    }

    Hilt_PasswordResetGuideFragment(int i) {
        super(i);
        this.onWarmupCompleted = new Object();
        this.IAuthTabCallback = false;
    }

    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 61;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super.onAttach(context);
            IAuthTabCallback();
            onNavigationEvent();
            int i3 = asInterface + 85;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        super.onAttach(context);
        IAuthTabCallback();
        onNavigationEvent();
        throw null;
    }

    public void onAttach(Activity activity) throws Throwable {
        boolean z;
        int i = 2 % 2;
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        ContextWrapper contextWrapper = this.onNavigationEvent;
        if (contextWrapper == null || captureHierarchy.onWarmupCompleted(contextWrapper) == activity) {
            int i2 = access000 + 29;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = access000 + 27;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        Object[] objArr = new Object[1];
        a(new char[]{28222, 16051, 28685, 51123, 56846, 25684, 32307, 14981, 26251, 21732, 12634, 42926, 39270, 34143, 61610, 31394, 961, 21986, 14658, 20137, 7988, 47238, 39270, 34143, 61519, 4714, 23616, 33418, 38334, 33174, 3518, 22602, 29880, 8106, 14340, 11981, 55265, 22184, 54778, 45755, 64484, 17442, 12221, 21372, 42270, 51739, 10546, 12196, 9302, 36257, 31132, 31843, 7725, 5029, 33545, 64059, 62246, 44610, 42270, 51739, 19576, 38137, 45775, 26298, 38715, 63894, 9302, 36257, 29581, 40866, 32268, 50403, 33337, 53813, 35061, 36132, 60448, 55777, 41473, 49717, 9673, 38633, 18149, 55558, 28680, 1122, 56846, 25684, 27390, 6277, 51276, 39720, 12821, 27776}, KeyEvent.getDeadChar(0, 0) + 93, objArr);
        runAnimator.IAuthTabCallback(z, ((String) objArr[0]).intern(), new Object[0]);
        IAuthTabCallback();
        onNavigationEvent();
    }

    private void IAuthTabCallback() {
        int i = 2 % 2;
        if (this.onNavigationEvent == null) {
            int i2 = access000 + 119;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent = captureHierarchy.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.onExtraCallback = nativeRegisterWithPerfetto.onWarmupCompleted(super/*androidx.fragment.app.Fragment*/.getContext());
        }
        int i4 = asInterface + 13;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((!r4.onExtraCallback) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r2 = r2 + 41;
        viva.republica.toss.password.reset.Hilt_PasswordResetGuideFragment.access000 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r4.onExtraCallback == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Context getContext() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.reset.Hilt_PasswordResetGuideFragment.access000
            int r1 = r1 + 45
            int r2 = r1 % 128
            viva.republica.toss.password.reset.Hilt_PasswordResetGuideFragment.asInterface = r2
            int r1 = r1 % r0
            android.content.Context r1 = super/*androidx.fragment.app.Fragment*/.getContext()
            if (r1 != 0) goto L36
            int r1 = viva.republica.toss.password.reset.Hilt_PasswordResetGuideFragment.access000
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.password.reset.Hilt_PasswordResetGuideFragment.asInterface = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            boolean r1 = r4.onExtraCallback
            r3 = 19
            int r3 = r3 / 0
            if (r1 != 0) goto L36
            goto L2d
        L26:
            boolean r1 = r4.onExtraCallback
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == r3) goto L2d
            goto L36
        L2d:
            int r2 = r2 + 41
            int r1 = r2 % 128
            viva.republica.toss.password.reset.Hilt_PasswordResetGuideFragment.access000 = r1
            int r2 = r2 % r0
            r0 = 0
            return r0
        L36:
            r4.IAuthTabCallback()
            android.content.ContextWrapper r0 = r4.onNavigationEvent
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.Hilt_PasswordResetGuideFragment.getContext():android.content.Context");
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
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
        int i2 = access000 + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        captureHierarchy capturehierarchyOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (i3 == 0) {
            return capturehierarchyOnExtraCallbackWithResult.generatedComponent();
        }
        capturehierarchyOnExtraCallbackWithResult.generatedComponent();
        throw null;
    }

    protected captureHierarchy onWarmupCompleted() {
        int i = 2 % 2;
        captureHierarchy capturehierarchy = new captureHierarchy(this);
        int i2 = asInterface + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return capturehierarchy;
    }

    public final captureHierarchy onExtraCallbackWithResult() {
        if (this.onExtraCallbackWithResult == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onWarmupCompleted();
                }
            }
        }
        return this.onExtraCallbackWithResult;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 19;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cResolveSize = (char) View.resolveSize(i3, i3);
                        int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, tapTimeout, packedPositionType, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 10 - TextUtils.getCapsMode("", 0, 0), View.combineMeasuredStates(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 16014), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, TextUtils.getCapsMode("", 0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i10 = $11 + 47;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    protected void onNavigationEvent() {
        int i = 2 % 2;
        if (this.IAuthTabCallback) {
            return;
        }
        int i2 = access000 + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = true;
        int i4 = asInterface + 79;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 % 4;
        }
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = access000 + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = PathMotion.onNavigationEvent(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
        int i4 = asInterface + 115;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        throw null;
    }
}
