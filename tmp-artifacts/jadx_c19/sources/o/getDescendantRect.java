package o;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AdapterView;
import com.facebook.appevents.asInterface;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getDescendantRect {
    private static final byte[] $$a = {25, 43, 92, -56};
    private static final int $$b = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -1776194565;
    private static char onNavigationEvent = 36443;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i2;
        int i3;
        int i4 = (b * 2) + 4;
        int i5 = 110 - s;
        byte[] bArr = $$a;
        int i6 = s2 * 3;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            i3 = i4;
            int i7 = i6;
            i2 = 0;
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i3];
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4 = i5;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    static /* synthetic */ void onExtraCallbackWithResult(isPointInChildBounds ispointinchildbounds, View view, View view2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            convertResponseToCredentialManager.onExtraCallback(getDescendantRect.class);
            throw null;
        }
        if (convertResponseToCredentialManager.onExtraCallback(getDescendantRect.class)) {
            return;
        }
        try {
            IAuthTabCallback(ispointinchildbounds, view, view2);
            int i4 = IAuthTabCallback + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getDescendantRect.class);
        }
    }

    public static onExtraCallback onWarmupCompleted(isPointInChildBounds ispointinchildbounds, View view, View view2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(getDescendantRect.class)) {
            return null;
        }
        try {
            onExtraCallback onextracallback = new onExtraCallback(ispointinchildbounds, view, view2);
            int i5 = IAuthTabCallback + 125;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getDescendantRect.class);
            return null;
        }
    }

    public static onWarmupCompleted onExtraCallbackWithResult(isPointInChildBounds ispointinchildbounds, View view, AdapterView adapterView) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 91;
        IAuthTabCallback = i3 % 128;
        AnonymousClass3 anonymousClass3 = null;
        if (i3 % 2 != 0) {
            convertResponseToCredentialManager.onExtraCallback(getDescendantRect.class);
            anonymousClass3.hashCode();
            throw null;
        }
        if (convertResponseToCredentialManager.onExtraCallback(getDescendantRect.class)) {
            int i4 = IAuthTabCallback + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        try {
            return new onWarmupCompleted(ispointinchildbounds, view, adapterView);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getDescendantRect.class);
            return null;
        }
    }

    private static void IAuthTabCallback(isPointInChildBounds ispointinchildbounds, View view, View view2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            convertResponseToCredentialManager.onExtraCallback(getDescendantRect.class);
            throw null;
        }
        if (convertResponseToCredentialManager.onExtraCallback(getDescendantRect.class)) {
            return;
        }
        try {
            final String strOnNavigationEvent = ispointinchildbounds.onNavigationEvent();
            final Bundle bundleIAuthTabCallback = getSuggestedMinimumWidth.IAuthTabCallback(ispointinchildbounds, view, view2);
            onWarmupCompleted(bundleIAuthTabCallback);
            performIntercept.IAuthTabCallbackStubProxy().execute(new Runnable() { // from class: o.getDescendantRect.3
                @Override // java.lang.Runnable
                public void run() {
                    if (convertResponseToCredentialManager.onExtraCallback(this)) {
                        return;
                    }
                    try {
                        asInterface.onNavigationEvent(performIntercept.onExtraCallbackWithResult()).onExtraCallback(strOnNavigationEvent, bundleIAuthTabCallback);
                    } catch (Throwable th) {
                        convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                    }
                }
            });
            int i4 = IAuthTabCallback + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getDescendantRect.class);
        }
    }

    protected static void onWarmupCompleted(Bundle bundle) {
        int i2 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(getDescendantRect.class)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                int i3 = onExtraCallback + 107;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                bundle.putDouble("_valueToSum", setStatusBarBackground.IAuthTabCallback(string));
                int i5 = onExtraCallback + 45;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            Object[] objArr = new Object[1];
            a((char) (52912 - Color.blue(0)), (-610637561) - (Process.myTid() >> 22), new char[]{6355}, new char[]{0, 0, 0, 0}, new char[]{2041, 39529, 45275, 62670}, objArr);
            bundle.putString("_is_fb_codeless", ((String) objArr[0]).intern());
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getDescendantRect.class);
        }
    }

    public static class onExtraCallback implements View.OnClickListener {
        private isPointInChildBounds IAuthTabCallback;
        private boolean onExtraCallback;
        private WeakReference<View> onExtraCallbackWithResult;
        private WeakReference<View> onNavigationEvent;
        private View.OnClickListener onWarmupCompleted;

        private onExtraCallback(isPointInChildBounds ispointinchildbounds, View view, View view2) {
            this.onExtraCallback = false;
            if (ispointinchildbounds == null || view == null || view2 == null) {
                return;
            }
            this.onWarmupCompleted = onLayoutChild.onWarmupCompleted(view2);
            this.IAuthTabCallback = ispointinchildbounds;
            this.onExtraCallbackWithResult = new WeakReference<>(view2);
            this.onNavigationEvent = new WeakReference<>(view);
            this.onExtraCallback = true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (convertResponseToCredentialManager.onExtraCallback(this)) {
                return;
            }
            try {
                View.OnClickListener onClickListener = this.onWarmupCompleted;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (this.onNavigationEvent.get() == null || this.onExtraCallbackWithResult.get() == null) {
                    return;
                }
                getDescendantRect.onExtraCallbackWithResult(this.IAuthTabCallback, this.onNavigationEvent.get(), this.onExtraCallbackWithResult.get());
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
            }
        }

        public boolean onWarmupCompleted() {
            return this.onExtraCallback;
        }
    }

    public static class onWarmupCompleted implements AdapterView.OnItemClickListener {
        private boolean IAuthTabCallback;
        private WeakReference<View> onExtraCallback;
        private isPointInChildBounds onExtraCallbackWithResult;
        private AdapterView.OnItemClickListener onNavigationEvent;
        private WeakReference<AdapterView> onWarmupCompleted;

        private onWarmupCompleted(isPointInChildBounds ispointinchildbounds, View view, AdapterView adapterView) {
            this.IAuthTabCallback = false;
            if (ispointinchildbounds == null || view == null || adapterView == null) {
                return;
            }
            this.onNavigationEvent = adapterView.getOnItemClickListener();
            this.onExtraCallbackWithResult = ispointinchildbounds;
            this.onWarmupCompleted = new WeakReference<>(adapterView);
            this.onExtraCallback = new WeakReference<>(view);
            this.IAuthTabCallback = true;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
            AdapterView.OnItemClickListener onItemClickListener = this.onNavigationEvent;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i2, j);
            }
            if (this.onExtraCallback.get() == null || this.onWarmupCompleted.get() == null) {
                return;
            }
            getDescendantRect.onExtraCallbackWithResult(this.onExtraCallbackWithResult, this.onExtraCallback.get(), (View) this.onWarmupCompleted.get());
        }

        public boolean IAuthTabCallback() {
            return this.IAuthTabCallback;
        }
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 125;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "") + 43, 1451 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char mode = (char) (49123 - View.MeasureSpec.getMode(0));
                        int iRgb = Color.rgb(0, 0, 0) + 16777260;
                        int scrollBarFadeDuration = 1494 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b3 = (byte) ($$b & 1);
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, iRgb, scrollBarFadeDuration, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.getTrimmedLength("")), TextUtils.indexOf((CharSequence) "", '0') + 51, 22939 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i7 = $11 + 65;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            i3 = 2;
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
