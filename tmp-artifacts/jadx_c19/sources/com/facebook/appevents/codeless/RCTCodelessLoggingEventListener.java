package com.facebook.appevents.codeless;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.appevents.asInterface;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.convertResponseToCredentialManager;
import o.getSuggestedMinimumWidth;
import o.isPointInChildBounds;
import o.onLayoutChild;
import o.performIntercept;
import o.setStatusBarBackground;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RCTCodelessLoggingEventListener {
    public static AutoLoggingOnTouchListener onExtraCallbackWithResult(isPointInChildBounds ispointinchildbounds, View view, View view2) {
        if (convertResponseToCredentialManager.onExtraCallback(RCTCodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            return new AutoLoggingOnTouchListener(ispointinchildbounds, view, view2);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, RCTCodelessLoggingEventListener.class);
            return null;
        }
    }

    public static class AutoLoggingOnTouchListener implements View.OnTouchListener {
        private WeakReference<View> IAuthTabCallback;
        private isPointInChildBounds onExtraCallback;
        private View.OnTouchListener onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        private WeakReference<View> onWarmupCompleted;
        private static final byte[] $$a = {20, 103, 109, 52};
        private static final int $$b = 125;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int onTransact = 1;
        private static long IAuthTabCallbackDefault = 2337660129597187252L;
        private static int asInterface = -1776194565;
        private static char IAuthTabCallbackStub = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, int i2, short s) {
            int i3;
            int i4;
            int i5 = (s * 2) + 1;
            byte[] bArr = $$a;
            int i6 = b + 4;
            int i7 = i2 + 109;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i8 = i6;
                int i9 = i5;
                int i10 = 0;
                int i11 = i6 + i9;
                i3 = i10;
                int i12 = i8;
                i7 = i11;
                i6 = i12;
                bArr2[i3] = (byte) i7;
                i4 = i3 + 1;
                if (i4 == i5) {
                    return new String(bArr2, 0);
                }
                int i13 = i6 + 1;
                int i14 = i7;
                i8 = i13;
                i6 = bArr[i13];
                i10 = i4;
                i9 = i14;
                int i112 = i6 + i9;
                i3 = i10;
                int i122 = i8;
                i7 = i112;
                i6 = i122;
                bArr2[i3] = (byte) i7;
                i4 = i3 + 1;
                if (i4 == i5) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i7;
                i4 = i3 + 1;
                if (i4 == i5) {
                }
            }
        }

        public AutoLoggingOnTouchListener(isPointInChildBounds ispointinchildbounds, View view, View view2) {
            this.onNavigationEvent = false;
            if (ispointinchildbounds != null && view != null && view2 != null) {
                this.onExtraCallbackWithResult = onLayoutChild.asBinder(view2);
                this.onExtraCallback = ispointinchildbounds;
                this.IAuthTabCallback = new WeakReference<>(view2);
                this.onWarmupCompleted = new WeakReference<>(view);
                this.onNavigationEvent = true;
                int i2 = asBinder + 19;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            int i5 = asBinder + 91;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 99 / 0;
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) throws Throwable {
            int i2 = 2 % 2;
            if (motionEvent.getAction() == 1) {
                onNavigationEvent();
            }
            View.OnTouchListener onTouchListener = this.onExtraCallbackWithResult;
            if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
                int i3 = asBinder + 5;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            int i5 = onTransact + 11;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }

        private void onNavigationEvent() throws Throwable {
            int i2 = 2 % 2;
            int i3 = asBinder + 47;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            isPointInChildBounds ispointinchildbounds = this.onExtraCallback;
            if (ispointinchildbounds == null) {
                return;
            }
            final String strOnNavigationEvent = ispointinchildbounds.onNavigationEvent();
            final Bundle bundleIAuthTabCallback = getSuggestedMinimumWidth.IAuthTabCallback(this.onExtraCallback, this.onWarmupCompleted.get(), this.IAuthTabCallback.get());
            if (bundleIAuthTabCallback.containsKey("_valueToSum")) {
                bundleIAuthTabCallback.putDouble("_valueToSum", setStatusBarBackground.IAuthTabCallback(bundleIAuthTabCallback.getString("_valueToSum")));
                int i5 = onTransact + 69;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
            Object[] objArr = new Object[1];
            a((char) (21471 - AndroidCharacter.getMirror('0')), TextUtils.getOffsetAfter("", 0) - 1211869687, new char[]{54268}, new char[]{36687, 2074, 1462, 19531}, new char[]{2514, 50262, 44983, 4691}, objArr);
            bundleIAuthTabCallback.putString("_is_fb_codeless", ((String) objArr[0]).intern());
            performIntercept.IAuthTabCallbackStubProxy().execute(new Runnable() { // from class: com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener.1
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
        }

        public boolean onExtraCallbackWithResult() {
            int i2 = 2 % 2;
            int i3 = asBinder;
            int i4 = i3 + 71;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            boolean z = this.onNavigationEvent;
            int i6 = i3 + 67;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 17 / 0;
            }
            return z;
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
                int i5 = $10 + 123;
                $11 = i5 % 128;
                int i6 = i5 % i3;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (-b);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 43 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1451 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49123), 43 - TextUtils.lastIndexOf("", '0', 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 23972), TextUtils.indexOf((CharSequence) "", '0', 0) + 51, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45848), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, 12577 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackDefault ^ 7798559133331975163L)) ^ ((int) (asInterface ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackStub ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i7 = $10 + 43;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }
}
