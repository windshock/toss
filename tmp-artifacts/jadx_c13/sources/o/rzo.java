package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import o.oq;
import o.szb;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
enum rzo {
    Initial { // from class: o.rzo.5
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (rzo.isWhitespace(szbVar)) {
                return true;
            }
            if (szbVar.IAuthTabCallbackStub()) {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
            } else if (szbVar.asInterface()) {
                szb.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = szbVar.onExtraCallbackWithResult();
                qh qhVar = new qh(rcVar.IAuthTabCallbackStubProxy.IAuthTabCallback(onnavigationeventOnExtraCallbackWithResult.access000()), onnavigationeventOnExtraCallbackWithResult.extraCallbackWithResult(), onnavigationeventOnExtraCallbackWithResult.ICustomTabsCallback());
                qhVar.IAuthTabCallback(onnavigationeventOnExtraCallbackWithResult.readTypedObject());
                rcVar.asInterface().onExtraCallback(qhVar);
                if (onnavigationeventOnExtraCallbackWithResult.extraCallback()) {
                    rcVar.asInterface().onExtraCallbackWithResult(oq.onWarmupCompleted.quirks);
                }
                rcVar.onNavigationEvent(rzo.BeforeHtml);
            } else {
                rcVar.onNavigationEvent(rzo.BeforeHtml);
                return rcVar.IAuthTabCallback(szbVar);
            }
            return true;
        }
    },
    BeforeHtml { // from class: o.rzo.13
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.asInterface()) {
                rcVar.onExtraCallback(this);
                return false;
            }
            if (!szbVar.IAuthTabCallbackStub()) {
                if (rzo.isWhitespace(szbVar)) {
                    rcVar.IAuthTabCallback(szbVar.onExtraCallback());
                    return true;
                }
                if (szbVar.IAuthTabCallbackStubProxy() && szbVar.onNavigationEvent().onActivityLayout().equals("html")) {
                    rcVar.onNavigationEvent(szbVar.onNavigationEvent());
                    rcVar.onNavigationEvent(rzo.BeforeHead);
                    return true;
                }
                if (szbVar.getInterfaceDescriptor() && nfe.onExtraCallbackWithResult(szbVar.IAuthTabCallback().onActivityLayout(), onExtraCallback.onWarmupCompleted)) {
                    return anythingElse(szbVar, rcVar);
                }
                if (szbVar.getInterfaceDescriptor()) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                return anythingElse(szbVar, rcVar);
            }
            rcVar.onExtraCallback(szbVar.onWarmupCompleted());
            return true;
        }

        private boolean anythingElse(szb szbVar, rc rcVar) {
            rcVar.asInterface("html");
            rcVar.onNavigationEvent(rzo.BeforeHead);
            return rcVar.IAuthTabCallback(szbVar);
        }
    },
    BeforeHead { // from class: o.rzo.18
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (rzo.isWhitespace(szbVar)) {
                rcVar.IAuthTabCallback(szbVar.onExtraCallback());
                return true;
            }
            if (szbVar.IAuthTabCallbackStub()) {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
                return true;
            }
            if (szbVar.asInterface()) {
                rcVar.onExtraCallback(this);
                return false;
            }
            if (szbVar.IAuthTabCallbackStubProxy() && szbVar.onNavigationEvent().onActivityLayout().equals("html")) {
                return rzo.InBody.process(szbVar, rcVar);
            }
            if (szbVar.IAuthTabCallbackStubProxy() && szbVar.onNavigationEvent().onActivityLayout().equals("head")) {
                rcVar.access100(rcVar.onNavigationEvent(szbVar.onNavigationEvent()));
                rcVar.onNavigationEvent(rzo.InHead);
                return true;
            }
            if (szbVar.getInterfaceDescriptor() && nfe.onExtraCallbackWithResult(szbVar.IAuthTabCallback().onActivityLayout(), onExtraCallback.onWarmupCompleted)) {
                rcVar.extraCallbackWithResult("head");
                return rcVar.IAuthTabCallback(szbVar);
            }
            if (szbVar.getInterfaceDescriptor()) {
                rcVar.onExtraCallback(this);
                return false;
            }
            rcVar.extraCallbackWithResult("head");
            return rcVar.IAuthTabCallback(szbVar);
        }
    },
    InHead { // from class: o.rzo.20
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onWarmupCompleted;
        private static char[] onExtraCallback = {32591, 32594, 32599, 32606};
        private static int IAuthTabCallback = -1184333829;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onNavigationEvent = true;

        /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
        @Override // o.rzo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        boolean process(szb szbVar, rc rcVar) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (rzo.isWhitespace(szbVar)) {
                rcVar.IAuthTabCallback(szbVar.onExtraCallback());
                return true;
            }
            int i4 = AnonymousClass17.onExtraCallback[szbVar.onExtraCallbackWithResult.ordinal()];
            if (i4 != 1) {
                int i5 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (i4 == 2) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                if (i4 == 3) {
                    szb.asBinder asbinderOnNavigationEvent = szbVar.onNavigationEvent();
                    String strOnActivityLayout = asbinderOnNavigationEvent.onActivityLayout();
                    if (strOnActivityLayout.equals("html")) {
                        int i7 = onWarmupCompleted + 85;
                        IAuthTabCallbackStub = i7 % 128;
                        if (i7 % 2 != 0) {
                            return rzo.InBody.process(szbVar, rcVar);
                        }
                        rzo.InBody.process(szbVar, rcVar);
                        throw null;
                    }
                    if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.onMessageChannelReady)) {
                        qgr qgrVarOnExtraCallback = rcVar.onExtraCallback(asbinderOnNavigationEvent);
                        if (strOnActivityLayout.equals("base") && qgrVarOnExtraCallback.onExtraCallbackWithResult("href")) {
                            rcVar.IAuthTabCallbackStub(qgrVarOnExtraCallback);
                        }
                    } else if (strOnActivityLayout.equals("meta")) {
                        int i8 = onWarmupCompleted + 105;
                        IAuthTabCallbackStub = i8 % 128;
                        int i9 = i8 % 2;
                        rcVar.onExtraCallback(asbinderOnNavigationEvent);
                    } else {
                        Object[] objArr = new Object[1];
                        a(null, null, new byte[]{-124, -125, -127, -126, -127}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, objArr);
                        if (strOnActivityLayout.equals(((String) objArr[0]).intern())) {
                            rzo.handleRcData(asbinderOnNavigationEvent, rcVar);
                            int i10 = onWarmupCompleted + 55;
                            IAuthTabCallbackStub = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 3 % 5;
                            }
                        } else if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.onRelationshipValidationResult)) {
                            int i12 = onWarmupCompleted + 109;
                            IAuthTabCallbackStub = i12 % 128;
                            if (i12 % 2 == 0) {
                                rzo.handleRawtext(asbinderOnNavigationEvent, rcVar);
                                int i13 = 63 / 0;
                            } else {
                                rzo.handleRawtext(asbinderOnNavigationEvent, rcVar);
                            }
                        } else if (!(!strOnActivityLayout.equals("noscript"))) {
                            rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                            rcVar.onNavigationEvent(rzo.InHeadNoscript);
                        } else if (strOnActivityLayout.equals("script")) {
                            rcVar.ICustomTabsCallback.IAuthTabCallback(uc.ScriptData);
                            rcVar.extraCallback();
                            rcVar.onNavigationEvent(rzo.Text);
                            rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                        } else {
                            if (strOnActivityLayout.equals("head")) {
                                int i14 = IAuthTabCallbackStub + 47;
                                onWarmupCompleted = i14 % 128;
                                int i15 = i14 % 2;
                                rcVar.onExtraCallback(this);
                                int i16 = IAuthTabCallbackStub + 99;
                                onWarmupCompleted = i16 % 128;
                                int i17 = i16 % 2;
                                return false;
                            }
                            if (!strOnActivityLayout.equals("template")) {
                                return anythingElse(szbVar, rcVar);
                            }
                            rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                            rcVar.access000();
                            rcVar.IAuthTabCallback(false);
                            rzo rzoVar = rzo.InTemplate;
                            rcVar.onNavigationEvent(rzoVar);
                            rcVar.onExtraCallbackWithResult(rzoVar);
                        }
                    }
                } else {
                    if (i4 != 4) {
                        return anythingElse(szbVar, rcVar);
                    }
                    String strOnActivityLayout2 = szbVar.IAuthTabCallback().onActivityLayout();
                    if (strOnActivityLayout2.equals("head")) {
                        rcVar.onActivityLayout();
                        rcVar.onNavigationEvent(rzo.AfterHead);
                    } else {
                        if (!(!nfe.onExtraCallbackWithResult(strOnActivityLayout2, onExtraCallback.onPostMessage))) {
                            return anythingElse(szbVar, rcVar);
                        }
                        if (!strOnActivityLayout2.equals("template")) {
                            rcVar.onExtraCallback(this);
                            return false;
                        }
                        int i18 = onWarmupCompleted + 63;
                        IAuthTabCallbackStub = i18 % 128;
                        if (i18 % 2 == 0) {
                            int i19 = 5 / 0;
                            if (rcVar.getInterfaceDescriptor(strOnActivityLayout2)) {
                                rcVar.onWarmupCompleted(true);
                                if (!strOnActivityLayout2.equals(rcVar.ICustomTabsCallbackDefault().onMinimized())) {
                                    int i20 = onWarmupCompleted + 97;
                                    IAuthTabCallbackStub = i20 % 128;
                                    int i21 = i20 % 2;
                                    rcVar.onExtraCallback(this);
                                }
                                rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout2);
                                rcVar.onExtraCallbackWithResult();
                                rcVar.onMessageChannelReady();
                                rcVar.onUnminimized();
                            } else {
                                rcVar.onExtraCallback(this);
                            }
                        } else if (!rcVar.getInterfaceDescriptor(strOnActivityLayout2)) {
                        }
                    }
                }
            } else {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
            }
            return true;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3;
            int i4 = 2;
            int i5 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallback;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 79;
                    $10 = i7 % 128;
                    if (i7 % i4 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), 76 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), 20952 - Gravity.getAbsoluteGravity(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i6 >>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 77, 20952 - Color.argb(0, 0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i6++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i4 = 2;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 76 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 16037 - (ViewConfiguration.getTapTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            int i8 = 1052772399;
            if (onNavigationEvent) {
                int i9 = $11 + Imgproc.COLOR_YUV2RGBA_YVYU;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), (ViewConfiguration.getTapTimeout() >> 16) + 63, 12214 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    i8 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i11 = $10 + 113;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] * iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                }
                String str = new String(cArr5);
                int i12 = $10 + 103;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                objArr[0] = str;
                return;
            }
            int i14 = $11 + 11;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            }
            char[] cArr6 = new char[i3];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i15 = $11 + 1;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] * iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 63 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12214 - (ViewConfiguration.getScrollBarSize() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionChild(0L) + 64, 12214 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            objArr[0] = new String(cArr6);
        }

        private boolean anythingElse(szb szbVar, ulm ulmVar) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ulmVar.readTypedObject("head");
            boolean zIAuthTabCallback = ulmVar.IAuthTabCallback(szbVar);
            int i4 = onWarmupCompleted + 99;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return zIAuthTabCallback;
        }
    },
    InHeadNoscript { // from class: o.rzo.23
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.asInterface()) {
                rcVar.onExtraCallback(this);
                return true;
            }
            if (szbVar.IAuthTabCallbackStubProxy() && szbVar.onNavigationEvent().onActivityLayout().equals("html")) {
                return rcVar.onNavigationEvent(szbVar, rzo.InBody);
            }
            if (!szbVar.getInterfaceDescriptor() || !szbVar.IAuthTabCallback().onActivityLayout().equals("noscript")) {
                if (rzo.isWhitespace(szbVar) || szbVar.IAuthTabCallbackStub() || (szbVar.IAuthTabCallbackStubProxy() && nfe.onExtraCallbackWithResult(szbVar.onNavigationEvent().onActivityLayout(), onExtraCallback.onActivityLayout))) {
                    return rcVar.onNavigationEvent(szbVar, rzo.InHead);
                }
                if (szbVar.getInterfaceDescriptor() && szbVar.IAuthTabCallback().onActivityLayout().equals("br")) {
                    return anythingElse(szbVar, rcVar);
                }
                if ((szbVar.IAuthTabCallbackStubProxy() && nfe.onExtraCallbackWithResult(szbVar.onNavigationEvent().onActivityLayout(), onExtraCallback.onActivityResized)) || szbVar.getInterfaceDescriptor()) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                return anythingElse(szbVar, rcVar);
            }
            rcVar.onActivityLayout();
            rcVar.onNavigationEvent(rzo.InHead);
            return true;
        }

        private boolean anythingElse(szb szbVar, rc rcVar) {
            rcVar.onExtraCallback(this);
            rcVar.IAuthTabCallback(new szb.onExtraCallback().onWarmupCompleted(szbVar.toString()));
            return true;
        }
    },
    AfterHead { // from class: o.rzo.22
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (rzo.isWhitespace(szbVar)) {
                rcVar.IAuthTabCallback(szbVar.onExtraCallback());
                return true;
            }
            if (szbVar.IAuthTabCallbackStub()) {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
                return true;
            }
            if (szbVar.asInterface()) {
                rcVar.onExtraCallback(this);
                return true;
            }
            if (szbVar.IAuthTabCallbackStubProxy()) {
                szb.asBinder asbinderOnNavigationEvent = szbVar.onNavigationEvent();
                String strOnActivityLayout = asbinderOnNavigationEvent.onActivityLayout();
                if (strOnActivityLayout.equals("html")) {
                    return rcVar.onNavigationEvent(szbVar, rzo.InBody);
                }
                if (strOnActivityLayout.equals("body")) {
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.IAuthTabCallback(false);
                    rcVar.onNavigationEvent(rzo.InBody);
                    return true;
                }
                if (strOnActivityLayout.equals("frameset")) {
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.onNavigationEvent(rzo.InFrameset);
                    return true;
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.extraCallbackWithResult)) {
                    rcVar.onExtraCallback(this);
                    qgr interfaceDescriptor = rcVar.getInterfaceDescriptor();
                    rcVar.asInterface(interfaceDescriptor);
                    rcVar.onNavigationEvent(szbVar, rzo.InHead);
                    rcVar.IAuthTabCallbackStubProxy(interfaceDescriptor);
                    return true;
                }
                if (strOnActivityLayout.equals("head")) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                anythingElse(szbVar, rcVar);
                return true;
            }
            if (szbVar.getInterfaceDescriptor()) {
                String strOnActivityLayout2 = szbVar.IAuthTabCallback().onActivityLayout();
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout2, onExtraCallback.onNavigationEvent)) {
                    anythingElse(szbVar, rcVar);
                    return true;
                }
                if (strOnActivityLayout2.equals("template")) {
                    rcVar.onNavigationEvent(szbVar, rzo.InHead);
                    return true;
                }
                rcVar.onExtraCallback(this);
                return false;
            }
            anythingElse(szbVar, rcVar);
            return true;
        }

        private boolean anythingElse(szb szbVar, rc rcVar) {
            rcVar.extraCallbackWithResult("body");
            rcVar.IAuthTabCallback(true);
            return rcVar.IAuthTabCallback(szbVar);
        }
    },
    InBody { // from class: o.rzo.25
        private static int $10 = 0;
        private static int $11 = 1;
        private static final int MaxStackScan = 24;
        private static long onExtraCallback = -5308619089472714638L;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 55;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 24, View.MeasureSpec.makeMeasureSpec(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 60 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 6383 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $10 + 89;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 59 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (Process.myPid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            switch (AnonymousClass17.onExtraCallback[szbVar.onExtraCallbackWithResult.ordinal()]) {
                case 1:
                    rcVar.onExtraCallback(szbVar.onWarmupCompleted());
                    return true;
                case 2:
                    rcVar.onExtraCallback(this);
                    return false;
                case 3:
                    return inBodyStartTag(szbVar, rcVar);
                case 4:
                    return inBodyEndTag(szbVar, rcVar);
                case 5:
                    szb.onExtraCallback onExtraCallback2 = szbVar.onExtraCallback();
                    if (onExtraCallback2.access000().equals(rzo.nullString)) {
                        int i4 = onExtraCallbackWithResult + 105;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    if (!rcVar.IAuthTabCallbackStub() || (!rzo.isWhitespace(onExtraCallback2))) {
                        rcVar.onActivityResized();
                        rcVar.IAuthTabCallback(onExtraCallback2);
                        rcVar.IAuthTabCallback(false);
                    } else {
                        int i6 = onExtraCallbackWithResult + 123;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            rcVar.onActivityResized();
                            rcVar.IAuthTabCallback(onExtraCallback2);
                            int i7 = 56 / 0;
                        } else {
                            rcVar.onActivityResized();
                            rcVar.IAuthTabCallback(onExtraCallback2);
                        }
                    }
                    return true;
                case 6:
                    if (rcVar.onRelationshipValidationResult() > 0) {
                        return rcVar.onNavigationEvent(szbVar, rzo.InTemplate);
                    }
                    return true;
                default:
                    return true;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:114:0x020c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean inBodyStartTag(szb szbVar, rc rcVar) throws Throwable {
            char c;
            pu puVarIAuthTabCallback_Parcel;
            int i = 2 % 2;
            szb.asBinder asbinderOnNavigationEvent = szbVar.onNavigationEvent();
            String strOnActivityLayout = asbinderOnNavigationEvent.onActivityLayout();
            int iHashCode = strOnActivityLayout.hashCode();
            switch (iHashCode) {
                case -1644953643:
                    if (!strOnActivityLayout.equals("frameset")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -1377687758:
                    Object[] objArr = new Object[1];
                    a(new char[]{36135, 35963, 36775, 36560, 34822, 35676}, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 331, objArr);
                    if (strOnActivityLayout.equals(((String) objArr[0]).intern())) {
                        int i2 = onWarmupCompleted + 101;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        c = 1;
                        break;
                    }
                    break;
                case -1191214428:
                    if (strOnActivityLayout.equals("iframe")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1010136971:
                    if (strOnActivityLayout.equals("option")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1003243718:
                    if (strOnActivityLayout.equals("textarea")) {
                        c = 4;
                        break;
                    }
                    break;
                case -906021636:
                    if (strOnActivityLayout.equals("select")) {
                        int i4 = onWarmupCompleted + 49;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        c = 5;
                        break;
                    }
                    break;
                case -80773204:
                    if (strOnActivityLayout.equals("optgroup")) {
                        c = 6;
                        break;
                    }
                    break;
                case 97:
                    if (strOnActivityLayout.equals("a")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3200:
                    if (strOnActivityLayout.equals("dd")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3216:
                    if (strOnActivityLayout.equals("dt")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3338:
                    if (strOnActivityLayout.equals("hr")) {
                        c = 16;
                        break;
                    }
                    break;
                case 3453:
                    if (strOnActivityLayout.equals("li")) {
                        c = 17;
                        break;
                    }
                    break;
                case 3646:
                    if (strOnActivityLayout.equals("rp")) {
                        c = 18;
                        break;
                    }
                    break;
                case 3650:
                    if (strOnActivityLayout.equals("rt")) {
                        c = 19;
                        break;
                    }
                    break;
                case 111267:
                    if (strOnActivityLayout.equals("pre")) {
                        c = 20;
                        break;
                    }
                    break;
                case 114276:
                    if (strOnActivityLayout.equals("svg")) {
                        c = 21;
                        break;
                    }
                    break;
                case 118811:
                    if (strOnActivityLayout.equals("xmp")) {
                        c = 22;
                        break;
                    }
                    break;
                case 3029410:
                    if (strOnActivityLayout.equals("body")) {
                        c = 23;
                        break;
                    }
                    break;
                case 3148996:
                    if (strOnActivityLayout.equals("form")) {
                        c = 24;
                        break;
                    }
                    break;
                case 3213227:
                    if (strOnActivityLayout.equals("html")) {
                        c = 25;
                        break;
                    }
                    break;
                case 3344136:
                    if (strOnActivityLayout.equals("math")) {
                        c = 26;
                        break;
                    }
                    break;
                case 3386833:
                    if (strOnActivityLayout.equals("nobr")) {
                        c = 27;
                        break;
                    }
                    break;
                case 3536714:
                    if (strOnActivityLayout.equals("span")) {
                        c = 28;
                        break;
                    }
                    break;
                case 100313435:
                    if (strOnActivityLayout.equals("image")) {
                        c = 29;
                        break;
                    }
                    break;
                case 100358090:
                    Object[] objArr2 = new Object[1];
                    a(new char[]{36140, 20204, 2747, 50789, 33325}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 50118, objArr2);
                    if (strOnActivityLayout.equals(((String) objArr2[0]).intern())) {
                        c = 30;
                        break;
                    }
                    break;
                case 110115790:
                    if (strOnActivityLayout.equals("table")) {
                        c = 31;
                        break;
                    }
                    break;
                case 181975684:
                    if (strOnActivityLayout.equals("listing")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 1973234167:
                    if (strOnActivityLayout.equals("plaintext")) {
                        c = '!';
                        break;
                    }
                    break;
                case 2091304424:
                    if (strOnActivityLayout.equals("isindex")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 2115613112:
                    if (strOnActivityLayout.equals("noembed")) {
                        c = '#';
                        break;
                    }
                    break;
                default:
                    switch (iHashCode) {
                        case 3273:
                            if (strOnActivityLayout.equals("h1")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case 3274:
                            if (strOnActivityLayout.equals("h2")) {
                                c = 11;
                                break;
                            }
                            break;
                        case 3275:
                            if (strOnActivityLayout.equals("h3")) {
                                int i6 = onWarmupCompleted + 17;
                                onExtraCallbackWithResult = i6 % 128;
                                int i7 = i6 % 2;
                                c = '\f';
                                break;
                            }
                            break;
                        case 3276:
                            if (strOnActivityLayout.equals("h4")) {
                                c = '\r';
                                break;
                            }
                            break;
                        case 3277:
                            if (strOnActivityLayout.equals("h5")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 3278:
                            if (strOnActivityLayout.equals("h6")) {
                                c = 15;
                                break;
                            }
                            break;
                    }
            }
            Object obj = null;
            switch (c) {
                case 0:
                    rcVar.onExtraCallback(this);
                    ArrayList<qgr> arrayListAccess100 = rcVar.access100();
                    if (arrayListAccess100.size() == 1 || ((arrayListAccess100.size() > 2 && !arrayListAccess100.get(1).onMinimized().equals("body")) || !rcVar.IAuthTabCallbackStub())) {
                        return false;
                    }
                    qgr qgrVar = arrayListAccess100.get(1);
                    if (qgrVar.ICustomTabsCallbackDefault() != null) {
                        qgrVar.prefetchWithMultipleUrls();
                    }
                    while (arrayListAccess100.size() > 1) {
                        arrayListAccess100.remove(arrayListAccess100.size() - 1);
                    }
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.onNavigationEvent(rzo.InFrameset);
                    return true;
                case 1:
                    Object[] objArr3 = new Object[1];
                    a(new char[]{36135, 35963, 36775, 36560, 34822, 35676}, 330 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), objArr3);
                    if (rcVar.onExtraCallback(((String) objArr3[0]).intern())) {
                        rcVar.onExtraCallback(this);
                        Object[] objArr4 = new Object[1];
                        a(new char[]{36135, 35963, 36775, 36560, 34822, 35676}, Color.blue(0) + 331, objArr4);
                        rcVar.readTypedObject(((String) objArr4[0]).intern());
                        rcVar.IAuthTabCallback(asbinderOnNavigationEvent);
                    } else {
                        rcVar.onActivityResized();
                        rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                        rcVar.IAuthTabCallback(false);
                    }
                    return true;
                case 2:
                    rcVar.IAuthTabCallback(false);
                    rzo.handleRawtext(asbinderOnNavigationEvent, rcVar);
                    return true;
                case 3:
                case 6:
                    if (rcVar.access100("option")) {
                        rcVar.readTypedObject("option");
                    }
                    rcVar.onActivityResized();
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    return true;
                case 4:
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    if (!asbinderOnNavigationEvent.writeTypedObject()) {
                        rcVar.ICustomTabsCallback.IAuthTabCallback(uc.Rcdata);
                        rcVar.extraCallback();
                        rcVar.IAuthTabCallback(false);
                        rcVar.onNavigationEvent(rzo.Text);
                    }
                    return true;
                case 5:
                    rcVar.onActivityResized();
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.IAuthTabCallback(false);
                    if (!asbinderOnNavigationEvent.onWarmupCompleted) {
                        rzo rzoVarICustomTabsCallbackStubProxy = rcVar.ICustomTabsCallbackStubProxy();
                        if (rzoVarICustomTabsCallbackStubProxy.equals(rzo.InTable) || rzoVarICustomTabsCallbackStubProxy.equals(rzo.InCaption) || rzoVarICustomTabsCallbackStubProxy.equals(rzo.InTableBody) || rzoVarICustomTabsCallbackStubProxy.equals(rzo.InRow) || rzoVarICustomTabsCallbackStubProxy.equals(rzo.InCell)) {
                            rcVar.onNavigationEvent(rzo.InSelectInTable);
                        } else {
                            rcVar.onNavigationEvent(rzo.InSelect);
                        }
                    }
                    return true;
                case 7:
                    if (rcVar.IAuthTabCallback("a") != null) {
                        rcVar.onExtraCallback(this);
                        rcVar.readTypedObject("a");
                        qgr qgrVarOnExtraCallbackWithResult = rcVar.onExtraCallbackWithResult("a");
                        if (qgrVarOnExtraCallbackWithResult != null) {
                            int i8 = onWarmupCompleted + 59;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 == 0) {
                                rcVar.access000(qgrVarOnExtraCallbackWithResult);
                                rcVar.IAuthTabCallbackStubProxy(qgrVarOnExtraCallbackWithResult);
                                obj.hashCode();
                                throw null;
                            }
                            rcVar.access000(qgrVarOnExtraCallbackWithResult);
                            rcVar.IAuthTabCallbackStubProxy(qgrVarOnExtraCallbackWithResult);
                        }
                    }
                    rcVar.onActivityResized();
                    rcVar.IAuthTabCallbackDefault(rcVar.onNavigationEvent(asbinderOnNavigationEvent));
                    return true;
                case '\b':
                case '\t':
                    rcVar.IAuthTabCallback(false);
                    ArrayList<qgr> arrayListAccess1002 = rcVar.access100();
                    int size = arrayListAccess1002.size();
                    int i9 = size - 1;
                    int i10 = i9 >= 24 ? size - 25 : 0;
                    while (true) {
                        if (i9 >= i10) {
                            int i11 = onWarmupCompleted + 45;
                            onExtraCallbackWithResult = i11 % 128;
                            if (i11 % 2 == 0) {
                                nfe.onExtraCallbackWithResult(arrayListAccess1002.get(i9).onMinimized(), onExtraCallback.onExtraCallback);
                                obj.hashCode();
                                throw null;
                            }
                            qgr qgrVar2 = arrayListAccess1002.get(i9);
                            if (nfe.onExtraCallbackWithResult(qgrVar2.onMinimized(), onExtraCallback.onExtraCallback)) {
                                int i12 = onExtraCallbackWithResult + 91;
                                onWarmupCompleted = i12 % 128;
                                int i13 = i12 % 2;
                                rcVar.readTypedObject(qgrVar2.onMinimized());
                            } else {
                                if (rcVar.onExtraCallbackWithResult(qgrVar2)) {
                                    int i14 = onWarmupCompleted + 59;
                                    onExtraCallbackWithResult = i14 % 128;
                                    int i15 = i14 % 2;
                                    if (nfe.onExtraCallbackWithResult(qgrVar2.onMinimized(), onExtraCallback.access000)) {
                                    }
                                }
                                i9--;
                            }
                        }
                    }
                    if (rcVar.onExtraCallback("p")) {
                        rcVar.readTypedObject("p");
                    }
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    return true;
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                    if (rcVar.onExtraCallback("p")) {
                        rcVar.readTypedObject("p");
                    }
                    if (nfe.onExtraCallbackWithResult(rcVar.ICustomTabsCallbackDefault().onMinimized(), onExtraCallback.IAuthTabCallback)) {
                        rcVar.onExtraCallback(this);
                        rcVar.onActivityLayout();
                    }
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    return true;
                case 16:
                    if (rcVar.onExtraCallback("p")) {
                        rcVar.readTypedObject("p");
                    }
                    rcVar.onExtraCallback(asbinderOnNavigationEvent);
                    rcVar.IAuthTabCallback(false);
                    return true;
                case 17:
                    rcVar.IAuthTabCallback(false);
                    ArrayList<qgr> arrayListAccess1003 = rcVar.access100();
                    int size2 = arrayListAccess1003.size() - 1;
                    while (true) {
                        if (size2 > 0) {
                            qgr qgrVar3 = arrayListAccess1003.get(size2);
                            if (qgrVar3.onMinimized().equals("li")) {
                                rcVar.readTypedObject("li");
                            } else if (!rcVar.onExtraCallbackWithResult(qgrVar3) || nfe.onExtraCallbackWithResult(qgrVar3.onMinimized(), onExtraCallback.access000)) {
                                size2--;
                            }
                        }
                    }
                    if (rcVar.onExtraCallback("p")) {
                        rcVar.readTypedObject("p");
                    }
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    return true;
                case 18:
                case 19:
                    if (rcVar.onTransact("ruby")) {
                        int i16 = onExtraCallbackWithResult + 107;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                        rcVar.onTransact();
                        if (!rcVar.access100("ruby")) {
                            rcVar.onExtraCallback(this);
                            rcVar.access000("ruby");
                        }
                        rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    }
                    return true;
                case 20:
                case ' ':
                    if (rcVar.onExtraCallback("p")) {
                        rcVar.readTypedObject("p");
                    }
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.access100.onWarmupCompleted("\n");
                    rcVar.IAuthTabCallback(false);
                    return true;
                case 21:
                    rcVar.onActivityResized();
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    return true;
                case 22:
                    if (rcVar.onExtraCallback("p")) {
                        rcVar.readTypedObject("p");
                    }
                    rcVar.onActivityResized();
                    rcVar.IAuthTabCallback(false);
                    rzo.handleRawtext(asbinderOnNavigationEvent, rcVar);
                    return true;
                case 23:
                    rcVar.onExtraCallback(this);
                    ArrayList<qgr> arrayListAccess1004 = rcVar.access100();
                    if (arrayListAccess1004.size() == 1 || ((arrayListAccess1004.size() > 2 && !arrayListAccess1004.get(1).onMinimized().equals("body")) || rcVar.getInterfaceDescriptor("template"))) {
                        return false;
                    }
                    rcVar.IAuthTabCallback(false);
                    qgr qgrVar4 = arrayListAccess1004.get(1);
                    if (asbinderOnNavigationEvent.extraCallback()) {
                        Iterator<oi> it = asbinderOnNavigationEvent.onExtraCallback.iterator();
                        while (it.hasNext()) {
                            oi next = it.next();
                            if (!qgrVar4.onExtraCallbackWithResult(next.getKey())) {
                                qgrVar4.access000().onNavigationEvent(next);
                            }
                        }
                    }
                    return true;
                case 24:
                    if (rcVar.IAuthTabCallback_Parcel() == null || rcVar.getInterfaceDescriptor("template")) {
                        if (rcVar.onExtraCallback("p")) {
                            rcVar.onNavigationEvent("p");
                        }
                        rcVar.onWarmupCompleted(asbinderOnNavigationEvent, true, true);
                        return true;
                    }
                    int i18 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    rcVar.onExtraCallback(this);
                    return false;
                case 25:
                    rcVar.onExtraCallback(this);
                    if (rcVar.getInterfaceDescriptor("template")) {
                        return false;
                    }
                    if (rcVar.access100().size() > 0) {
                        qgr qgrVar5 = rcVar.access100().get(0);
                        if (asbinderOnNavigationEvent.extraCallback()) {
                            Iterator<oi> it2 = asbinderOnNavigationEvent.onExtraCallback.iterator();
                            while (it2.hasNext()) {
                                oi next2 = it2.next();
                                if (!qgrVar5.onExtraCallbackWithResult(next2.getKey())) {
                                    qgrVar5.access000().onNavigationEvent(next2);
                                }
                            }
                        }
                    }
                    return true;
                case 26:
                    rcVar.onActivityResized();
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    return true;
                case 27:
                    rcVar.onActivityResized();
                    if (rcVar.onTransact("nobr")) {
                        rcVar.onExtraCallback(this);
                        rcVar.readTypedObject("nobr");
                        rcVar.onActivityResized();
                    }
                    rcVar.IAuthTabCallbackDefault(rcVar.onNavigationEvent(asbinderOnNavigationEvent));
                    return true;
                case 28:
                    rcVar.onActivityResized();
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    return true;
                case 29:
                    if (rcVar.onExtraCallbackWithResult("svg") == null) {
                        return rcVar.IAuthTabCallback(asbinderOnNavigationEvent.onWarmupCompleted("img"));
                    }
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    return true;
                case 30:
                    rcVar.onActivityResized();
                    qgr qgrVarOnExtraCallback = rcVar.onExtraCallback(asbinderOnNavigationEvent);
                    a(new char[]{36145, 2379, 34267, 'E'}, 33911 - KeyEvent.normalizeMetaState(0), new Object[1]);
                    if (!qgrVarOnExtraCallback.onExtraCallback(((String) r2[0]).intern()).equalsIgnoreCase("hidden")) {
                        rcVar.IAuthTabCallback(false);
                    }
                    return true;
                case 31:
                    if (rcVar.asInterface().IAuthTabCallback_Parcel() != oq.onWarmupCompleted.quirks && rcVar.onExtraCallback("p")) {
                        rcVar.readTypedObject("p");
                    }
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.IAuthTabCallback(false);
                    rcVar.onNavigationEvent(rzo.InTable);
                    return true;
                case '!':
                    if (rcVar.onExtraCallback("p")) {
                        rcVar.readTypedObject("p");
                    }
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.ICustomTabsCallback.IAuthTabCallback(uc.PLAINTEXT);
                    return true;
                case '\"':
                    rcVar.onExtraCallback(this);
                    if (rcVar.IAuthTabCallback_Parcel() != null) {
                        return false;
                    }
                    rcVar.extraCallbackWithResult("form");
                    Object[] objArr5 = new Object[1];
                    a(new char[]{36132, 2977, 32831, 7865, 38710, 11656}, (ViewConfiguration.getLongPressTimeout() >> 16) + 34439, objArr5);
                    if (asbinderOnNavigationEvent.onExtraCallbackWithResult(((String) objArr5[0]).intern()) && (puVarIAuthTabCallback_Parcel = rcVar.IAuthTabCallback_Parcel()) != null) {
                        a(new char[]{36132, 2977, 32831, 7865, 38710, 11656}, View.combineMeasuredStates(0, 0) + 34439, new Object[1]);
                        if (!(!asbinderOnNavigationEvent.onExtraCallbackWithResult(((String) r3[0]).intern()))) {
                            om omVar = asbinderOnNavigationEvent.onExtraCallback;
                            Object[] objArr6 = new Object[1];
                            a(new char[]{36132, 2977, 32831, 7865, 38710, 11656}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34439, objArr6);
                            String strOnExtraCallback = omVar.onExtraCallback(((String) objArr6[0]).intern());
                            om omVarAccess000 = puVarIAuthTabCallback_Parcel.access000();
                            Object[] objArr7 = new Object[1];
                            a(new char[]{36132, 2977, 32831, 7865, 38710, 11656}, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 34440, objArr7);
                            omVarAccess000.onExtraCallbackWithResult(((String) objArr7[0]).intern(), strOnExtraCallback);
                        }
                    }
                    rcVar.extraCallbackWithResult("hr");
                    rcVar.extraCallbackWithResult("label");
                    rcVar.IAuthTabCallback((szb) new szb.onExtraCallback().onWarmupCompleted(asbinderOnNavigationEvent.onExtraCallbackWithResult("prompt") ? asbinderOnNavigationEvent.onExtraCallback.onExtraCallback("prompt") : "This is a searchable index. Enter search keywords: "));
                    om omVar2 = new om();
                    if (asbinderOnNavigationEvent.extraCallback()) {
                        Iterator<oi> it3 = asbinderOnNavigationEvent.onExtraCallback.iterator();
                        while (it3.hasNext()) {
                            int i20 = onExtraCallbackWithResult + 11;
                            onWarmupCompleted = i20 % 128;
                            int i21 = i20 % 2;
                            oi next3 = it3.next();
                            if (!nfe.onExtraCallbackWithResult(next3.getKey(), onExtraCallback.getInterfaceDescriptor)) {
                                omVar2.onNavigationEvent(next3);
                            }
                        }
                    }
                    Object[] objArr8 = new Object[1];
                    a(new char[]{36139, 28237, 19450, 10011}, 58217 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr8);
                    omVar2.onExtraCallbackWithResult(((String) objArr8[0]).intern(), "isindex");
                    Object[] objArr9 = new Object[1];
                    a(new char[]{36140, 20204, 2747, 50789, 33325}, 50119 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), objArr9);
                    rcVar.onNavigationEvent(((String) objArr9[0]).intern(), omVar2);
                    rcVar.readTypedObject("label");
                    rcVar.extraCallbackWithResult("hr");
                    rcVar.readTypedObject("form");
                    return true;
                case '#':
                    rzo.handleRawtext(asbinderOnNavigationEvent, rcVar);
                    return true;
                default:
                    if (!sl.onWarmupCompleted(strOnActivityLayout)) {
                        rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    } else if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.access100)) {
                        rcVar.onActivityResized();
                        rcVar.onExtraCallback(asbinderOnNavigationEvent);
                        rcVar.IAuthTabCallback(false);
                    } else if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.IAuthTabCallbackStubProxy)) {
                        if (rcVar.onExtraCallback("p")) {
                            rcVar.readTypedObject("p");
                        }
                        rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    } else {
                        if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.extraCallbackWithResult)) {
                            return rcVar.onNavigationEvent(szbVar, rzo.InHead);
                        }
                        if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.onExtraCallbackWithResult)) {
                            rcVar.onActivityResized();
                            rcVar.IAuthTabCallbackDefault(rcVar.onNavigationEvent(asbinderOnNavigationEvent));
                        } else if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.IAuthTabCallbackDefault)) {
                            rcVar.onActivityResized();
                            rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                            rcVar.access000();
                            rcVar.IAuthTabCallback(false);
                        } else if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.IAuthTabCallback_Parcel)) {
                            rcVar.onExtraCallback(asbinderOnNavigationEvent);
                        } else {
                            if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.asBinder)) {
                                rcVar.onExtraCallback(this);
                                return false;
                            }
                            rcVar.onActivityResized();
                            rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                        }
                    }
                    return true;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean inBodyEndTag(szb szbVar, rc rcVar) throws Throwable {
            int i = 2 % 2;
            szb.IAuthTabCallbackDefault iAuthTabCallbackDefaultIAuthTabCallback = szbVar.IAuthTabCallback();
            String strOnActivityLayout = iAuthTabCallbackDefaultIAuthTabCallback.onActivityLayout();
            int iHashCode = strOnActivityLayout.hashCode();
            char c = 14;
            switch (iHashCode) {
                case -1321546630:
                    if (!strOnActivityLayout.equals("template")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case 112:
                    if (strOnActivityLayout.equals("p")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3152:
                    if (strOnActivityLayout.equals("br")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3200:
                    if (strOnActivityLayout.equals("dd")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3216:
                    if (strOnActivityLayout.equals("dt")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3453:
                    if (strOnActivityLayout.equals("li")) {
                        int i2 = onExtraCallbackWithResult + 45;
                        onWarmupCompleted = i2 % 128;
                        if (i2 % 2 == 0) {
                            c = 11;
                            break;
                        }
                    }
                    break;
                case 3029410:
                    if (strOnActivityLayout.equals("body")) {
                        int i3 = onWarmupCompleted + 51;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 != 0) {
                            c = '\f';
                            break;
                        } else {
                            c = '$';
                            break;
                        }
                    }
                    break;
                case 3148996:
                    if (strOnActivityLayout.equals("form")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 3213227:
                    if (!strOnActivityLayout.equals("html")) {
                    }
                    break;
                case 3536714:
                    if (strOnActivityLayout.equals("span")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1869063452:
                    if (strOnActivityLayout.equals("sarcasm")) {
                        c = 16;
                        break;
                    }
                    break;
                default:
                    switch (iHashCode) {
                        case 3273:
                            if (strOnActivityLayout.equals("h1")) {
                                int i4 = onExtraCallbackWithResult + 29;
                                onWarmupCompleted = i4 % 128;
                                if (i4 % 2 == 0) {
                                    c = 5;
                                    break;
                                }
                            }
                            break;
                        case 3274:
                            if (strOnActivityLayout.equals("h2")) {
                                int i5 = onWarmupCompleted + 59;
                                onExtraCallbackWithResult = i5 % 128;
                                if (i5 % 2 != 0) {
                                    c = 6;
                                    break;
                                } else {
                                    c = 'a';
                                    break;
                                }
                            }
                            break;
                        case 3275:
                            if (strOnActivityLayout.equals("h3")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 3276:
                            if (strOnActivityLayout.equals("h4")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case 3277:
                            if (strOnActivityLayout.equals("h5")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 3278:
                            if (!(!strOnActivityLayout.equals("h6"))) {
                                c = '\n';
                                break;
                            }
                            break;
                    }
            }
            switch (c) {
                case 0:
                    rcVar.onNavigationEvent(szbVar, rzo.InHead);
                    return true;
                case 1:
                    if (!rcVar.onExtraCallback(strOnActivityLayout)) {
                        rcVar.onExtraCallback(this);
                        rcVar.extraCallbackWithResult(strOnActivityLayout);
                        return rcVar.IAuthTabCallback(iAuthTabCallbackDefaultIAuthTabCallback);
                    }
                    rcVar.onWarmupCompleted(strOnActivityLayout);
                    if (!rcVar.access100(strOnActivityLayout)) {
                        int i6 = onExtraCallbackWithResult + 27;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            rcVar.onExtraCallback(this);
                            throw null;
                        }
                        rcVar.onExtraCallback(this);
                    }
                    rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout);
                    return true;
                case 2:
                    rcVar.onExtraCallback(this);
                    rcVar.extraCallbackWithResult("br");
                    return false;
                case 3:
                case 4:
                    if (!rcVar.onTransact(strOnActivityLayout)) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    rcVar.onWarmupCompleted(strOnActivityLayout);
                    if (!rcVar.access100(strOnActivityLayout)) {
                        rcVar.onExtraCallback(this);
                    }
                    rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout);
                    return true;
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                    String[] strArr = onExtraCallback.IAuthTabCallback;
                    if (!rcVar.IAuthTabCallback(strArr)) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    rcVar.onWarmupCompleted(strOnActivityLayout);
                    if (!rcVar.access100(strOnActivityLayout)) {
                        rcVar.onExtraCallback(this);
                    }
                    rcVar.onExtraCallback(strArr);
                    return true;
                case 11:
                    if (!rcVar.IAuthTabCallbackStub(strOnActivityLayout)) {
                        int i7 = onExtraCallbackWithResult + 59;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 != 0) {
                            rcVar.onExtraCallback(this);
                            return false;
                        }
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    rcVar.onWarmupCompleted(strOnActivityLayout);
                    if (!rcVar.access100(strOnActivityLayout)) {
                        int i8 = onWarmupCompleted + 75;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        rcVar.onExtraCallback(this);
                    }
                    rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout);
                    return true;
                case '\f':
                    if (rcVar.onTransact("body")) {
                        rcVar.onNavigationEvent(rzo.AfterBody);
                        return true;
                    }
                    rcVar.onExtraCallback(this);
                    return false;
                case '\r':
                    if (!rcVar.getInterfaceDescriptor("template")) {
                        pu puVarIAuthTabCallback_Parcel = rcVar.IAuthTabCallback_Parcel();
                        rcVar.onWarmupCompleted((pu) null);
                        if (puVarIAuthTabCallback_Parcel == null || !rcVar.onTransact(strOnActivityLayout)) {
                            rcVar.onExtraCallback(this);
                            return false;
                        }
                        rcVar.onTransact();
                        if (!rcVar.access100(strOnActivityLayout)) {
                            int i10 = onExtraCallbackWithResult + 17;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 != 0) {
                                rcVar.onExtraCallback(this);
                                int i11 = 76 / 0;
                            } else {
                                rcVar.onExtraCallback(this);
                            }
                        }
                        rcVar.IAuthTabCallbackStubProxy(puVarIAuthTabCallback_Parcel);
                    } else {
                        if (!rcVar.onTransact(strOnActivityLayout)) {
                            rcVar.onExtraCallback(this);
                            return false;
                        }
                        rcVar.onTransact();
                        if (!rcVar.access100(strOnActivityLayout)) {
                            int i12 = onExtraCallbackWithResult + 61;
                            onWarmupCompleted = i12 % 128;
                            if (i12 % 2 != 0) {
                                rcVar.onExtraCallback(this);
                                throw null;
                            }
                            rcVar.onExtraCallback(this);
                        }
                        rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout);
                    }
                    return true;
                case 14:
                    if (rcVar.readTypedObject("body")) {
                        return rcVar.IAuthTabCallback(iAuthTabCallbackDefaultIAuthTabCallback);
                    }
                    return true;
                case 15:
                case 16:
                    return anyOtherEndTag(szbVar, rcVar);
                default:
                    if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.IAuthTabCallbackStub)) {
                        return inBodyEndTagAdoption(szbVar, rcVar);
                    }
                    if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.onTransact)) {
                        if (!rcVar.onTransact(strOnActivityLayout)) {
                            int i13 = onExtraCallbackWithResult + 93;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                            rcVar.onExtraCallback(this);
                            return false;
                        }
                        rcVar.onTransact();
                        if (!rcVar.access100(strOnActivityLayout)) {
                            rcVar.onExtraCallback(this);
                        }
                        rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout);
                    } else {
                        if (!nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.IAuthTabCallbackDefault)) {
                            return anyOtherEndTag(szbVar, rcVar);
                        }
                        Object[] objArr = new Object[1];
                        a(new char[]{36139, 28237, 19450, 10011}, View.combineMeasuredStates(0, 0) + 58217, objArr);
                        if (!rcVar.onTransact(((String) objArr[0]).intern())) {
                            if (!rcVar.onTransact(strOnActivityLayout)) {
                                rcVar.onExtraCallback(this);
                                return false;
                            }
                            rcVar.onTransact();
                            if (!rcVar.access100(strOnActivityLayout)) {
                                rcVar.onExtraCallback(this);
                            }
                            rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout);
                            rcVar.onExtraCallbackWithResult();
                        }
                    }
                    return true;
            }
        }

        boolean anyOtherEndTag(szb szbVar, rc rcVar) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                String str = szbVar.IAuthTabCallback().IAuthTabCallback;
                rcVar.access100();
                rcVar.onExtraCallbackWithResult(str);
                throw null;
            }
            String str2 = szbVar.IAuthTabCallback().IAuthTabCallback;
            ArrayList<qgr> arrayListAccess100 = rcVar.access100();
            if (rcVar.onExtraCallbackWithResult(str2) == null) {
                rcVar.onExtraCallback(this);
                return false;
            }
            int size = arrayListAccess100.size() - 1;
            int i3 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            while (true) {
                if (size < 0) {
                    break;
                }
                qgr qgrVar = arrayListAccess100.get(size);
                if (qgrVar.onMinimized().equals(str2)) {
                    rcVar.onWarmupCompleted(str2);
                    if (!rcVar.access100(str2)) {
                        int i5 = onExtraCallbackWithResult + 31;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 != 0) {
                            rcVar.onExtraCallback(this);
                            int i6 = 68 / 0;
                        } else {
                            rcVar.onExtraCallback(this);
                        }
                    }
                    rcVar.IAuthTabCallbackStubProxy(str2);
                } else {
                    if (rcVar.onExtraCallbackWithResult(qgrVar)) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    size--;
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v6, types: [int] */
        private boolean inBodyEndTagAdoption(szb szbVar, rc rcVar) {
            int i;
            int i2 = 2;
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            boolean z = false;
            String strOnActivityLayout = szbVar.IAuthTabCallback().onActivityLayout();
            ArrayList<qgr> arrayListAccess100 = rcVar.access100();
            int i6 = 0;
            while (i6 < 8) {
                qgr qgrVarIAuthTabCallback = rcVar.IAuthTabCallback(strOnActivityLayout);
                if (qgrVarIAuthTabCallback == null) {
                    return anyOtherEndTag(szbVar, rcVar);
                }
                if (!rcVar.onTransact(qgrVarIAuthTabCallback)) {
                    rcVar.onExtraCallback(this);
                    rcVar.access000(qgrVarIAuthTabCallback);
                    return true;
                }
                if (!rcVar.onTransact(qgrVarIAuthTabCallback.onMinimized())) {
                    int i7 = onExtraCallbackWithResult + 5;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % i2;
                    rcVar.onExtraCallback(this);
                    return z;
                }
                qgr qgrVar = null;
                if (rcVar.ICustomTabsCallbackDefault() != qgrVarIAuthTabCallback) {
                    int i9 = onExtraCallbackWithResult + 17;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % i2 != 0) {
                        rcVar.onExtraCallback(this);
                        qgrVar.hashCode();
                        throw null;
                    }
                    rcVar.onExtraCallback(this);
                }
                int size = arrayListAccess100.size();
                int iAsBinder = -1;
                boolean z2 = z;
                int i10 = 1;
                qgr qgrVar2 = null;
                while (true) {
                    if (i10 >= size || i10 >= 64) {
                        break;
                    }
                    qgr qgrVar3 = arrayListAccess100.get(i10);
                    if (qgrVar3 != qgrVarIAuthTabCallback) {
                        if (z2 && rcVar.onExtraCallbackWithResult(qgrVar3)) {
                            qgrVar = qgrVar3;
                            break;
                        }
                    } else {
                        qgrVar2 = arrayListAccess100.get(i10 - 1);
                        iAsBinder = rcVar.asBinder(qgrVar3);
                        z2 = true;
                    }
                    i10++;
                }
                if (qgrVar == null) {
                    rcVar.IAuthTabCallbackStubProxy(qgrVarIAuthTabCallback.onMinimized());
                    rcVar.access000(qgrVarIAuthTabCallback);
                    return true;
                }
                qgr qgrVarOnWarmupCompleted = qgrVar;
                qgr qgrVar4 = qgrVarOnWarmupCompleted;
                for (?? r9 = z; r9 < 3; r9++) {
                    if (rcVar.onTransact(qgrVarOnWarmupCompleted)) {
                        qgrVarOnWarmupCompleted = rcVar.onWarmupCompleted(qgrVarOnWarmupCompleted);
                    }
                    if (!rcVar.IAuthTabCallback(qgrVarOnWarmupCompleted)) {
                        int i11 = onWarmupCompleted + 89;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % i2;
                        rcVar.IAuthTabCallbackStubProxy(qgrVarOnWarmupCompleted);
                    } else {
                        if (qgrVarOnWarmupCompleted == qgrVarIAuthTabCallback) {
                            break;
                        }
                        qgr qgrVar5 = new qgr(rcVar.onExtraCallbackWithResult(qgrVarOnWarmupCompleted.onNavigationEvent(), sjd.onExtraCallbackWithResult), rcVar.IAuthTabCallbackDefault());
                        rcVar.onExtraCallback(qgrVarOnWarmupCompleted, qgrVar5);
                        rcVar.onWarmupCompleted(qgrVarOnWarmupCompleted, qgrVar5);
                        if (qgrVar4 == qgrVar) {
                            iAsBinder = rcVar.asBinder(qgrVar5) + 1;
                        }
                        if (qgrVar4.ICustomTabsCallbackDefault() != null) {
                            qgrVar4.prefetchWithMultipleUrls();
                        }
                        qgrVar5.onExtraCallback(qgrVar4);
                        qgrVarOnWarmupCompleted = qgrVar5;
                        qgrVar4 = qgrVarOnWarmupCompleted;
                    }
                    i2 = 2;
                }
                if (qgrVar2 == null) {
                    i = 2;
                } else if (nfe.onExtraCallbackWithResult(qgrVar2.onMinimized(), onExtraCallback.asInterface)) {
                    if (qgrVar4.ICustomTabsCallbackDefault() != null) {
                        qgrVar4.prefetchWithMultipleUrls();
                        int i13 = onExtraCallbackWithResult + 107;
                        onWarmupCompleted = i13 % 128;
                        i = 2;
                        int i14 = i13 % 2;
                    } else {
                        i = 2;
                    }
                    rcVar.onExtraCallbackWithResult(qgrVar4);
                } else {
                    i = 2;
                    if (qgrVar4.ICustomTabsCallbackDefault() != null) {
                        qgrVar4.prefetchWithMultipleUrls();
                    }
                    qgrVar2.onExtraCallback(qgrVar4);
                }
                qgr qgrVar6 = new qgr(qgrVarIAuthTabCallback.ICustomTabsCallback_Parcel(), rcVar.IAuthTabCallbackDefault());
                qgrVar6.access000().IAuthTabCallback(qgrVarIAuthTabCallback.access000());
                qgrVar6.onWarmupCompleted(qgrVar.newSession());
                qgrVar.onExtraCallback(qgrVar6);
                rcVar.access000(qgrVarIAuthTabCallback);
                rcVar.IAuthTabCallback(qgrVar6, iAsBinder);
                rcVar.IAuthTabCallbackStubProxy(qgrVarIAuthTabCallback);
                rcVar.IAuthTabCallback(qgrVar, qgrVar6);
                i6++;
                i2 = i;
                z = false;
            }
            return true;
        }
    },
    Text { // from class: o.rzo.24
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.IAuthTabCallbackDefault()) {
                rcVar.IAuthTabCallback(szbVar.onExtraCallback());
                return true;
            }
            if (szbVar.asBinder()) {
                rcVar.onExtraCallback(this);
                rcVar.onActivityLayout();
                rcVar.onNavigationEvent(rcVar.onMinimized());
                return rcVar.IAuthTabCallback(szbVar);
            }
            if (!szbVar.getInterfaceDescriptor()) {
                return true;
            }
            rcVar.onActivityLayout();
            rcVar.onNavigationEvent(rcVar.onMinimized());
            return true;
        }
    },
    InTable { // from class: o.rzo.21
        private static final byte[] $$a = {23, -38, -83, 70};
        private static final int $$b = 61;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 478308970;

        private static String $$c(byte b, short s, byte b2) {
            int i = s * 4;
            int i2 = (b * 4) + 105;
            byte[] bArr = $$a;
            int i3 = b2 + 4;
            byte[] bArr2 = new byte[i + 1];
            int i4 = -1;
            if (bArr == null) {
                i2 = i + (-i3);
                i3 = i3;
                i4 = -1;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i2;
                if (i5 == i) {
                    return new String(bArr2, 0);
                }
                int i6 = i3 + 1;
                i2 += -bArr[i6];
                i3 = i6;
                i4 = i5;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01c3  */
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
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET)), 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 12843), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 54, ExpandableListView.getPackedPositionGroup(0L) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
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
                int i7 = $10 + 67;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    int i9 = $11 + 107;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) % 1];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 12844), Color.red(0) + 55, Color.red(0) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12842), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 55, 2167 - (Process.myPid() >> 22), 1298711993, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    i4 = 2083011369;
                }
                cArr2 = cArr4;
            }
            String str = new String(cArr2);
            int i10 = $10 + 107;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str;
        }

        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) throws Throwable {
            int i = 2 % 2;
            if (szbVar.IAuthTabCallbackDefault() && !(!nfe.onExtraCallbackWithResult(rcVar.ICustomTabsCallbackDefault().onMinimized(), onExtraCallback.newAuthTabSession))) {
                rcVar.ICustomTabsCallback();
                rcVar.extraCallback();
                rcVar.onNavigationEvent(rzo.InTableText);
                return rcVar.IAuthTabCallback(szbVar);
            }
            if (szbVar.IAuthTabCallbackStub()) {
                int i2 = onExtraCallback + 103;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
                return true;
            }
            if (szbVar.asInterface()) {
                rcVar.onExtraCallback(this);
                return false;
            }
            Object obj = null;
            if (!szbVar.IAuthTabCallbackStubProxy()) {
                if (!szbVar.getInterfaceDescriptor()) {
                    if (szbVar.asBinder()) {
                        if (rcVar.access100("html")) {
                            rcVar.onExtraCallback(this);
                            int i4 = onNavigationEvent + 73;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        return true;
                    }
                    boolean zAnythingElse = anythingElse(szbVar, rcVar);
                    int i6 = onNavigationEvent + 53;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return zAnythingElse;
                    }
                    obj.hashCode();
                    throw null;
                }
                String strOnActivityLayout = szbVar.IAuthTabCallback().onActivityLayout();
                if (strOnActivityLayout.equals("table")) {
                    int i7 = onExtraCallback + 75;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        rcVar.asBinder(strOnActivityLayout);
                        obj.hashCode();
                        throw null;
                    }
                    if (!rcVar.asBinder(strOnActivityLayout)) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    rcVar.IAuthTabCallbackStubProxy("table");
                    rcVar.onUnminimized();
                } else {
                    if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.mayLaunchUrl)) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    if (!strOnActivityLayout.equals("template")) {
                        return anythingElse(szbVar, rcVar);
                    }
                    rcVar.onNavigationEvent(szbVar, rzo.InHead);
                }
                return true;
            }
            int i8 = onExtraCallback + 107;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            szb.asBinder asbinderOnNavigationEvent = szbVar.onNavigationEvent();
            String strOnActivityLayout2 = asbinderOnNavigationEvent.onActivityLayout();
            if (strOnActivityLayout2.equals("caption")) {
                int i10 = onExtraCallback + 15;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    rcVar.onNavigationEvent();
                    rcVar.access000();
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.onNavigationEvent(rzo.InCaption);
                    obj.hashCode();
                    throw null;
                }
                rcVar.onNavigationEvent();
                rcVar.access000();
                rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                rcVar.onNavigationEvent(rzo.InCaption);
            } else if (strOnActivityLayout2.equals("colgroup")) {
                rcVar.onNavigationEvent();
                rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                rcVar.onNavigationEvent(rzo.InColumnGroup);
            } else {
                if (strOnActivityLayout2.equals("col")) {
                    rcVar.onNavigationEvent();
                    rcVar.extraCallbackWithResult("colgroup");
                    boolean zIAuthTabCallback = rcVar.IAuthTabCallback(szbVar);
                    int i11 = onNavigationEvent + 51;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    return zIAuthTabCallback;
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout2, onExtraCallback.newSessionWithExtras)) {
                    int i13 = onNavigationEvent + 31;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    rcVar.onNavigationEvent();
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.onNavigationEvent(rzo.InTableBody);
                } else {
                    if (nfe.onExtraCallbackWithResult(strOnActivityLayout2, onExtraCallback.ICustomTabsService)) {
                        rcVar.onNavigationEvent();
                        rcVar.extraCallbackWithResult("tbody");
                        return rcVar.IAuthTabCallback(szbVar);
                    }
                    if (strOnActivityLayout2.equals("table")) {
                        rcVar.onExtraCallback(this);
                        if (!rcVar.asBinder(strOnActivityLayout2)) {
                            return false;
                        }
                        rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout2);
                        rcVar.onUnminimized();
                        if (rcVar.ICustomTabsCallbackStubProxy() != rzo.InTable) {
                            return rcVar.IAuthTabCallback(szbVar);
                        }
                        rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                        return true;
                    }
                    if (nfe.onExtraCallbackWithResult(strOnActivityLayout2, onExtraCallback.newSession)) {
                        return rcVar.onNavigationEvent(szbVar, rzo.InHead);
                    }
                    Object[] objArr = new Object[1];
                    a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, 2 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{65534, 65529, 4, 5, 0}, true, (ViewConfiguration.getPressedStateDuration() >> 16) + 179, objArr);
                    if (strOnActivityLayout2.equals(((String) objArr[0]).intern())) {
                        int i15 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                        onExtraCallback = i15 % 128;
                        if (i15 % 2 != 0) {
                            asbinderOnNavigationEvent.extraCallback();
                            throw null;
                        }
                        if (asbinderOnNavigationEvent.extraCallback()) {
                            om omVar = asbinderOnNavigationEvent.onExtraCallback;
                            Object[] objArr2 = new Object[1];
                            a(3 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), -((byte) KeyEvent.getModifierMetaStateMask()), new char[]{65525, 4, '\t', 0}, false, (KeyEvent.getMaxKeyCode() >> 16) + 179, objArr2);
                            if (omVar.onExtraCallback(((String) objArr2[0]).intern()).equalsIgnoreCase("hidden")) {
                                int i16 = onNavigationEvent + 35;
                                onExtraCallback = i16 % 128;
                                if (i16 % 2 != 0) {
                                    rcVar.onExtraCallback(asbinderOnNavigationEvent);
                                    throw null;
                                }
                                rcVar.onExtraCallback(asbinderOnNavigationEvent);
                            }
                        }
                        return anythingElse(szbVar, rcVar);
                    }
                    if (!strOnActivityLayout2.equals("form")) {
                        return anythingElse(szbVar, rcVar);
                    }
                    rcVar.onExtraCallback(this);
                    if (rcVar.IAuthTabCallback_Parcel() != null || rcVar.getInterfaceDescriptor("template")) {
                        return false;
                    }
                    rcVar.onWarmupCompleted(asbinderOnNavigationEvent, false, false);
                }
            }
            return true;
        }

        boolean anythingElse(szb szbVar, rc rcVar) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            rcVar.onExtraCallback(this);
            rcVar.onNavigationEvent(true);
            rcVar.onNavigationEvent(szbVar, rzo.InBody);
            rcVar.onNavigationEvent(false);
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    },
    InTableText { // from class: o.rzo.4
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.onExtraCallbackWithResult == szb.onTransact.Character) {
                szb.onExtraCallback onExtraCallback = szbVar.onExtraCallback();
                if (onExtraCallback.access000().equals(rzo.nullString)) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                rcVar.IAuthTabCallbackStubProxy().add(onExtraCallback.access000());
                return true;
            }
            if (rcVar.IAuthTabCallbackStubProxy().size() > 0) {
                for (String str : rcVar.IAuthTabCallbackStubProxy()) {
                    if (!rzo.isWhitespace(str)) {
                        rcVar.onExtraCallback(this);
                        if (nfe.onExtraCallbackWithResult(rcVar.ICustomTabsCallbackDefault().onMinimized(), onExtraCallback.newAuthTabSession)) {
                            rcVar.onNavigationEvent(true);
                            rcVar.onNavigationEvent(new szb.onExtraCallback().onWarmupCompleted(str), rzo.InBody);
                            rcVar.onNavigationEvent(false);
                        } else {
                            rcVar.onNavigationEvent(new szb.onExtraCallback().onWarmupCompleted(str), rzo.InBody);
                        }
                    } else {
                        rcVar.IAuthTabCallback(new szb.onExtraCallback().onWarmupCompleted(str));
                    }
                }
                rcVar.ICustomTabsCallback();
            }
            rcVar.onNavigationEvent(rcVar.onMinimized());
            return rcVar.IAuthTabCallback(szbVar);
        }
    },
    InCaption { // from class: o.rzo.2
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.getInterfaceDescriptor() && szbVar.IAuthTabCallback().onActivityLayout().equals("caption")) {
                if (!rcVar.asBinder(szbVar.IAuthTabCallback().onActivityLayout())) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                rcVar.onTransact();
                if (!rcVar.access100("caption")) {
                    rcVar.onExtraCallback(this);
                }
                rcVar.IAuthTabCallbackStubProxy("caption");
                rcVar.onExtraCallbackWithResult();
                rcVar.onNavigationEvent(rzo.InTable);
                return true;
            }
            if ((szbVar.IAuthTabCallbackStubProxy() && nfe.onExtraCallbackWithResult(szbVar.onNavigationEvent().onActivityLayout(), onExtraCallback.writeTypedObject)) || (szbVar.getInterfaceDescriptor() && szbVar.IAuthTabCallback().onActivityLayout().equals("table"))) {
                rcVar.onExtraCallback(this);
                if (rcVar.readTypedObject("caption")) {
                    return rcVar.IAuthTabCallback(szbVar);
                }
                return true;
            }
            if (szbVar.getInterfaceDescriptor() && nfe.onExtraCallbackWithResult(szbVar.IAuthTabCallback().onActivityLayout(), onExtraCallback.ICustomTabsCallback)) {
                rcVar.onExtraCallback(this);
                return false;
            }
            return rcVar.onNavigationEvent(szbVar, rzo.InBody);
        }
    },
    InColumnGroup { // from class: o.rzo.1
        /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
        @Override // o.rzo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        boolean process(szb szbVar, rc rcVar) {
            if (rzo.isWhitespace(szbVar)) {
                rcVar.IAuthTabCallback(szbVar.onExtraCallback());
                return true;
            }
            int i = AnonymousClass17.onExtraCallback[szbVar.onExtraCallbackWithResult.ordinal()];
            if (i == 1) {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
            } else if (i != 2) {
                char c = 0;
                if (i == 3) {
                    szb.asBinder asbinderOnNavigationEvent = szbVar.onNavigationEvent();
                    String strOnActivityLayout = asbinderOnNavigationEvent.onActivityLayout();
                    int iHashCode = strOnActivityLayout.hashCode();
                    if (iHashCode == -1321546630) {
                        if (!strOnActivityLayout.equals("template")) {
                        }
                        if (c == 0) {
                        }
                    } else if (iHashCode != 98688) {
                        c = (iHashCode == 3213227 && strOnActivityLayout.equals("html")) ? (char) 2 : (char) 65535;
                        if (c == 0) {
                            rcVar.onNavigationEvent(szbVar, rzo.InHead);
                        } else {
                            if (c != 1) {
                                if (c == 2) {
                                    return rcVar.onNavigationEvent(szbVar, rzo.InBody);
                                }
                                return anythingElse(szbVar, rcVar);
                            }
                            rcVar.onExtraCallback(asbinderOnNavigationEvent);
                        }
                    } else {
                        if (strOnActivityLayout.equals("col")) {
                            c = 1;
                        }
                        if (c == 0) {
                        }
                    }
                } else {
                    if (i != 4) {
                        if (i == 6) {
                            if (rcVar.access100("html")) {
                                return true;
                            }
                            return anythingElse(szbVar, rcVar);
                        }
                        return anythingElse(szbVar, rcVar);
                    }
                    String strOnActivityLayout2 = szbVar.IAuthTabCallback().onActivityLayout();
                    if (strOnActivityLayout2.equals("template")) {
                        rcVar.onNavigationEvent(szbVar, rzo.InHead);
                    } else if (strOnActivityLayout2.equals("colgroup")) {
                        if (!rcVar.access100(strOnActivityLayout2)) {
                            rcVar.onExtraCallback(this);
                            return false;
                        }
                        rcVar.onActivityLayout();
                        rcVar.onNavigationEvent(rzo.InTable);
                    } else {
                        return anythingElse(szbVar, rcVar);
                    }
                }
            } else {
                rcVar.onExtraCallback(this);
            }
            return true;
        }

        private boolean anythingElse(szb szbVar, rc rcVar) {
            if (!rcVar.access100("colgroup")) {
                rcVar.onExtraCallback(this);
                return false;
            }
            rcVar.onActivityLayout();
            rcVar.onNavigationEvent(rzo.InTable);
            rcVar.IAuthTabCallback(szbVar);
            return true;
        }
    },
    InTableBody { // from class: o.rzo.3
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            int i = AnonymousClass17.onExtraCallback[szbVar.onExtraCallbackWithResult.ordinal()];
            if (i == 3) {
                szb.asBinder asbinderOnNavigationEvent = szbVar.onNavigationEvent();
                String strOnActivityLayout = asbinderOnNavigationEvent.onActivityLayout();
                if (strOnActivityLayout.equals("tr")) {
                    rcVar.onWarmupCompleted();
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.onNavigationEvent(rzo.InRow);
                    return true;
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.readTypedObject)) {
                    rcVar.onExtraCallback(this);
                    rcVar.extraCallbackWithResult("tr");
                    return rcVar.IAuthTabCallback(asbinderOnNavigationEvent);
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.ICustomTabsCallback_Parcel)) {
                    return exitTableBody(szbVar, rcVar);
                }
                return anythingElse(szbVar, rcVar);
            }
            if (i == 4) {
                String strOnActivityLayout2 = szbVar.IAuthTabCallback().onActivityLayout();
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout2, onExtraCallback.extraCommand)) {
                    if (!rcVar.asBinder(strOnActivityLayout2)) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    rcVar.onWarmupCompleted();
                    rcVar.onActivityLayout();
                    rcVar.onNavigationEvent(rzo.InTable);
                    return true;
                }
                if (strOnActivityLayout2.equals("table")) {
                    return exitTableBody(szbVar, rcVar);
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout2, onExtraCallback.isEngagementSignalsApiAvailable)) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                return anythingElse(szbVar, rcVar);
            }
            return anythingElse(szbVar, rcVar);
        }

        private boolean exitTableBody(szb szbVar, rc rcVar) {
            if (!rcVar.asBinder("tbody") && !rcVar.asBinder("thead") && !rcVar.onTransact("tfoot")) {
                rcVar.onExtraCallback(this);
                return false;
            }
            rcVar.onWarmupCompleted();
            rcVar.readTypedObject(rcVar.ICustomTabsCallbackDefault().onMinimized());
            return rcVar.IAuthTabCallback(szbVar);
        }

        private boolean anythingElse(szb szbVar, rc rcVar) {
            return rcVar.onNavigationEvent(szbVar, rzo.InTable);
        }
    },
    InRow { // from class: o.rzo.9
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.IAuthTabCallbackStubProxy()) {
                szb.asBinder asbinderOnNavigationEvent = szbVar.onNavigationEvent();
                String strOnActivityLayout = asbinderOnNavigationEvent.onActivityLayout();
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.readTypedObject)) {
                    rcVar.IAuthTabCallback();
                    rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    rcVar.onNavigationEvent(rzo.InCell);
                    rcVar.access000();
                    return true;
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.ICustomTabsCallbackStubProxy)) {
                    return handleMissingTr(szbVar, rcVar);
                }
                return anythingElse(szbVar, rcVar);
            }
            if (szbVar.getInterfaceDescriptor()) {
                String strOnActivityLayout2 = szbVar.IAuthTabCallback().onActivityLayout();
                if (strOnActivityLayout2.equals("tr")) {
                    if (!rcVar.asBinder(strOnActivityLayout2)) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    rcVar.IAuthTabCallback();
                    rcVar.onActivityLayout();
                    rcVar.onNavigationEvent(rzo.InTableBody);
                    return true;
                }
                if (strOnActivityLayout2.equals("table")) {
                    return handleMissingTr(szbVar, rcVar);
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout2, onExtraCallback.newSessionWithExtras)) {
                    if (!rcVar.asBinder(strOnActivityLayout2) || !rcVar.asBinder("tr")) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    rcVar.IAuthTabCallback();
                    rcVar.onActivityLayout();
                    rcVar.onNavigationEvent(rzo.InTableBody);
                    return true;
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout2, onExtraCallback.ICustomTabsCallbackStub)) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                return anythingElse(szbVar, rcVar);
            }
            return anythingElse(szbVar, rcVar);
        }

        private boolean anythingElse(szb szbVar, rc rcVar) {
            return rcVar.onNavigationEvent(szbVar, rzo.InTable);
        }

        private boolean handleMissingTr(szb szbVar, ulm ulmVar) {
            if (ulmVar.readTypedObject("tr")) {
                return ulmVar.IAuthTabCallback(szbVar);
            }
            return false;
        }
    },
    InCell { // from class: o.rzo.7
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.getInterfaceDescriptor()) {
                String strOnActivityLayout = szbVar.IAuthTabCallback().onActivityLayout();
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.readTypedObject)) {
                    if (!rcVar.asBinder(strOnActivityLayout)) {
                        rcVar.onExtraCallback(this);
                        rcVar.onNavigationEvent(rzo.InRow);
                        return false;
                    }
                    rcVar.onTransact();
                    if (!rcVar.access100(strOnActivityLayout)) {
                        rcVar.onExtraCallback(this);
                    }
                    rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout);
                    rcVar.onExtraCallbackWithResult();
                    rcVar.onNavigationEvent(rzo.InRow);
                    return true;
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.extraCallback)) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.onMinimized)) {
                    if (!rcVar.asBinder(strOnActivityLayout)) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    closeCell(rcVar);
                    return rcVar.IAuthTabCallback(szbVar);
                }
                return anythingElse(szbVar, rcVar);
            }
            if (szbVar.IAuthTabCallbackStubProxy() && nfe.onExtraCallbackWithResult(szbVar.onNavigationEvent().onActivityLayout(), onExtraCallback.writeTypedObject)) {
                if (!rcVar.asBinder("td") && !rcVar.asBinder("th")) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                closeCell(rcVar);
                return rcVar.IAuthTabCallback(szbVar);
            }
            return anythingElse(szbVar, rcVar);
        }

        private boolean anythingElse(szb szbVar, rc rcVar) {
            return rcVar.onNavigationEvent(szbVar, rzo.InBody);
        }

        private void closeCell(rc rcVar) {
            if (rcVar.asBinder("td")) {
                rcVar.readTypedObject("td");
            } else {
                rcVar.readTypedObject("th");
            }
        }
    },
    InSelect { // from class: o.rzo.8
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
        @Override // o.rzo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        boolean process(szb szbVar, rc rcVar) {
            char c;
            switch (AnonymousClass17.onExtraCallback[szbVar.onExtraCallbackWithResult.ordinal()]) {
                case 1:
                    rcVar.onExtraCallback(szbVar.onWarmupCompleted());
                    return true;
                case 2:
                    rcVar.onExtraCallback(this);
                    return false;
                case 3:
                    szb.asBinder asbinderOnNavigationEvent = szbVar.onNavigationEvent();
                    String strOnActivityLayout = asbinderOnNavigationEvent.onActivityLayout();
                    if (strOnActivityLayout.equals("html")) {
                        return rcVar.onNavigationEvent(asbinderOnNavigationEvent, rzo.InBody);
                    }
                    if (strOnActivityLayout.equals("option")) {
                        if (rcVar.access100("option")) {
                            rcVar.readTypedObject("option");
                        }
                        rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    } else if (strOnActivityLayout.equals("optgroup")) {
                        if (rcVar.access100("option")) {
                            rcVar.readTypedObject("option");
                        }
                        if (rcVar.access100("optgroup")) {
                            rcVar.readTypedObject("optgroup");
                        }
                        rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    } else {
                        if (strOnActivityLayout.equals("select")) {
                            rcVar.onExtraCallback(this);
                            return rcVar.readTypedObject("select");
                        }
                        if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.onUnminimized)) {
                            rcVar.onExtraCallback(this);
                            if (!rcVar.IAuthTabCallbackDefault("select")) {
                                return false;
                            }
                            rcVar.readTypedObject("select");
                            return rcVar.IAuthTabCallback(asbinderOnNavigationEvent);
                        }
                        if (strOnActivityLayout.equals("script") || strOnActivityLayout.equals("template")) {
                            return rcVar.onNavigationEvent(szbVar, rzo.InHead);
                        }
                        return anythingElse(szbVar, rcVar);
                    }
                    return true;
                case 4:
                    String strOnActivityLayout2 = szbVar.IAuthTabCallback().onActivityLayout();
                    switch (strOnActivityLayout2.hashCode()) {
                        case -1321546630:
                            if (!strOnActivityLayout2.equals("template")) {
                                c = 65535;
                                break;
                            } else {
                                c = 0;
                                break;
                            }
                        case -1010136971:
                            if (strOnActivityLayout2.equals("option")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (strOnActivityLayout2.equals("select")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -80773204:
                            if (strOnActivityLayout2.equals("optgroup")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        return rcVar.onNavigationEvent(szbVar, rzo.InHead);
                    }
                    if (c != 1) {
                        if (c != 2) {
                            if (c == 3) {
                                if (rcVar.access100("option") && rcVar.onWarmupCompleted(rcVar.ICustomTabsCallbackDefault()) != null && rcVar.onWarmupCompleted(rcVar.ICustomTabsCallbackDefault()).onMinimized().equals("optgroup")) {
                                    rcVar.readTypedObject("option");
                                }
                                if (rcVar.access100("optgroup")) {
                                    rcVar.onActivityLayout();
                                } else {
                                    rcVar.onExtraCallback(this);
                                }
                            } else {
                                return anythingElse(szbVar, rcVar);
                            }
                        } else {
                            if (!rcVar.IAuthTabCallbackDefault(strOnActivityLayout2)) {
                                rcVar.onExtraCallback(this);
                                return false;
                            }
                            rcVar.IAuthTabCallbackStubProxy(strOnActivityLayout2);
                            rcVar.onUnminimized();
                        }
                    } else if (rcVar.access100("option")) {
                        rcVar.onActivityLayout();
                    } else {
                        rcVar.onExtraCallback(this);
                    }
                    return true;
                case 5:
                    szb.onExtraCallback onExtraCallback = szbVar.onExtraCallback();
                    if (onExtraCallback.access000().equals(rzo.nullString)) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    rcVar.IAuthTabCallback(onExtraCallback);
                    return true;
                case 6:
                    if (!rcVar.access100("html")) {
                        rcVar.onExtraCallback(this);
                    }
                    return true;
                default:
                    return anythingElse(szbVar, rcVar);
            }
        }

        private boolean anythingElse(szb szbVar, rc rcVar) {
            rcVar.onExtraCallback(this);
            return false;
        }
    },
    InSelectInTable { // from class: o.rzo.10
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.IAuthTabCallbackStubProxy() && nfe.onExtraCallbackWithResult(szbVar.onNavigationEvent().onActivityLayout(), onExtraCallback.ICustomTabsCallbackDefault)) {
                rcVar.onExtraCallback(this);
                rcVar.IAuthTabCallbackStubProxy("select");
                rcVar.onUnminimized();
                return rcVar.IAuthTabCallback(szbVar);
            }
            if (szbVar.getInterfaceDescriptor() && nfe.onExtraCallbackWithResult(szbVar.IAuthTabCallback().onActivityLayout(), onExtraCallback.ICustomTabsCallbackDefault)) {
                rcVar.onExtraCallback(this);
                if (!rcVar.asBinder(szbVar.IAuthTabCallback().onActivityLayout())) {
                    return false;
                }
                rcVar.IAuthTabCallbackStubProxy("select");
                rcVar.onUnminimized();
                return rcVar.IAuthTabCallback(szbVar);
            }
            return rcVar.onNavigationEvent(szbVar, rzo.InSelect);
        }
    },
    InTemplate { // from class: o.rzo.6
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            switch (AnonymousClass17.onExtraCallback[szbVar.onExtraCallbackWithResult.ordinal()]) {
                case 1:
                case 2:
                case 5:
                    rcVar.onNavigationEvent(szbVar, rzo.InBody);
                    return true;
                case 3:
                    String strOnActivityLayout = szbVar.onNavigationEvent().onActivityLayout();
                    if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.prefetch)) {
                        rcVar.onNavigationEvent(szbVar, rzo.InHead);
                        return true;
                    }
                    if (nfe.onExtraCallbackWithResult(strOnActivityLayout, onExtraCallback.postMessage)) {
                        rcVar.onMessageChannelReady();
                        rzo rzoVar = rzo.InTable;
                        rcVar.onExtraCallbackWithResult(rzoVar);
                        rcVar.onNavigationEvent(rzoVar);
                        return rcVar.IAuthTabCallback(szbVar);
                    }
                    if (strOnActivityLayout.equals("col")) {
                        rcVar.onMessageChannelReady();
                        rzo rzoVar2 = rzo.InColumnGroup;
                        rcVar.onExtraCallbackWithResult(rzoVar2);
                        rcVar.onNavigationEvent(rzoVar2);
                        return rcVar.IAuthTabCallback(szbVar);
                    }
                    if (strOnActivityLayout.equals("tr")) {
                        rcVar.onMessageChannelReady();
                        rzo rzoVar3 = rzo.InTableBody;
                        rcVar.onExtraCallbackWithResult(rzoVar3);
                        rcVar.onNavigationEvent(rzoVar3);
                        return rcVar.IAuthTabCallback(szbVar);
                    }
                    if (strOnActivityLayout.equals("td") || strOnActivityLayout.equals("th")) {
                        rcVar.onMessageChannelReady();
                        rzo rzoVar4 = rzo.InRow;
                        rcVar.onExtraCallbackWithResult(rzoVar4);
                        rcVar.onNavigationEvent(rzoVar4);
                        return rcVar.IAuthTabCallback(szbVar);
                    }
                    rcVar.onMessageChannelReady();
                    rzo rzoVar5 = rzo.InBody;
                    rcVar.onExtraCallbackWithResult(rzoVar5);
                    rcVar.onNavigationEvent(rzoVar5);
                    return rcVar.IAuthTabCallback(szbVar);
                case 4:
                    if (szbVar.IAuthTabCallback().onActivityLayout().equals("template")) {
                        rcVar.onNavigationEvent(szbVar, rzo.InHead);
                        return true;
                    }
                    rcVar.onExtraCallback(this);
                    return false;
                case 6:
                    if (!rcVar.getInterfaceDescriptor("template")) {
                        return true;
                    }
                    rcVar.onExtraCallback(this);
                    rcVar.IAuthTabCallbackStubProxy("template");
                    rcVar.onExtraCallbackWithResult();
                    rcVar.onMessageChannelReady();
                    rcVar.onUnminimized();
                    if (rcVar.ICustomTabsCallbackStubProxy() == rzo.InTemplate || rcVar.onRelationshipValidationResult() >= 12) {
                        return true;
                    }
                    return rcVar.IAuthTabCallback(szbVar);
                default:
                    return true;
            }
        }
    },
    AfterBody { // from class: o.rzo.11
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (rzo.isWhitespace(szbVar)) {
                rcVar.IAuthTabCallback(szbVar.onExtraCallback());
                return true;
            }
            if (szbVar.IAuthTabCallbackStub()) {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
                return true;
            }
            if (szbVar.asInterface()) {
                rcVar.onExtraCallback(this);
                return false;
            }
            if (szbVar.IAuthTabCallbackStubProxy() && szbVar.onNavigationEvent().onActivityLayout().equals("html")) {
                return rcVar.onNavigationEvent(szbVar, rzo.InBody);
            }
            if (szbVar.getInterfaceDescriptor() && szbVar.IAuthTabCallback().onActivityLayout().equals("html")) {
                if (rcVar.readTypedObject()) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                rcVar.onNavigationEvent(rzo.AfterAfterBody);
                return true;
            }
            if (szbVar.asBinder()) {
                return true;
            }
            rcVar.onExtraCallback(this);
            rcVar.onNavigationEvent(rzo.InBody);
            return rcVar.IAuthTabCallback(szbVar);
        }
    },
    InFrameset { // from class: o.rzo.12
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
        @Override // o.rzo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        boolean process(szb szbVar, rc rcVar) {
            char c;
            if (rzo.isWhitespace(szbVar)) {
                rcVar.IAuthTabCallback(szbVar.onExtraCallback());
            } else if (szbVar.IAuthTabCallbackStub()) {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
            } else {
                if (szbVar.asInterface()) {
                    rcVar.onExtraCallback(this);
                    return false;
                }
                if (szbVar.IAuthTabCallbackStubProxy()) {
                    szb.asBinder asbinderOnNavigationEvent = szbVar.onNavigationEvent();
                    String strOnActivityLayout = asbinderOnNavigationEvent.onActivityLayout();
                    switch (strOnActivityLayout.hashCode()) {
                        case -1644953643:
                            if (!strOnActivityLayout.equals("frameset")) {
                                c = 65535;
                                break;
                            } else {
                                c = 0;
                                break;
                            }
                        case 3213227:
                            if (strOnActivityLayout.equals("html")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 97692013:
                            if (strOnActivityLayout.equals("frame")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1192721831:
                            if (strOnActivityLayout.equals("noframes")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        rcVar.onNavigationEvent(asbinderOnNavigationEvent);
                    } else {
                        if (c == 1) {
                            return rcVar.onNavigationEvent(asbinderOnNavigationEvent, rzo.InBody);
                        }
                        if (c != 2) {
                            if (c == 3) {
                                return rcVar.onNavigationEvent(asbinderOnNavigationEvent, rzo.InHead);
                            }
                            rcVar.onExtraCallback(this);
                            return false;
                        }
                        rcVar.onExtraCallback(asbinderOnNavigationEvent);
                    }
                } else if (szbVar.getInterfaceDescriptor() && szbVar.IAuthTabCallback().onActivityLayout().equals("frameset")) {
                    if (rcVar.access100("html")) {
                        rcVar.onExtraCallback(this);
                        return false;
                    }
                    rcVar.onActivityLayout();
                    if (!rcVar.readTypedObject() && !rcVar.access100("frameset")) {
                        rcVar.onNavigationEvent(rzo.AfterFrameset);
                    }
                } else if (szbVar.asBinder()) {
                    if (!rcVar.access100("html")) {
                        rcVar.onExtraCallback(this);
                    }
                } else {
                    rcVar.onExtraCallback(this);
                    return false;
                }
            }
            return true;
        }
    },
    AfterFrameset { // from class: o.rzo.15
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (rzo.isWhitespace(szbVar)) {
                rcVar.IAuthTabCallback(szbVar.onExtraCallback());
                return true;
            }
            if (szbVar.IAuthTabCallbackStub()) {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
                return true;
            }
            if (szbVar.asInterface()) {
                rcVar.onExtraCallback(this);
                return false;
            }
            if (szbVar.IAuthTabCallbackStubProxy() && szbVar.onNavigationEvent().onActivityLayout().equals("html")) {
                return rcVar.onNavigationEvent(szbVar, rzo.InBody);
            }
            if (szbVar.getInterfaceDescriptor() && szbVar.IAuthTabCallback().onActivityLayout().equals("html")) {
                rcVar.onNavigationEvent(rzo.AfterAfterFrameset);
                return true;
            }
            if (szbVar.IAuthTabCallbackStubProxy() && szbVar.onNavigationEvent().onActivityLayout().equals("noframes")) {
                return rcVar.onNavigationEvent(szbVar, rzo.InHead);
            }
            if (szbVar.asBinder()) {
                return true;
            }
            rcVar.onExtraCallback(this);
            return false;
        }
    },
    AfterAfterBody { // from class: o.rzo.14
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.IAuthTabCallbackStub()) {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
                return true;
            }
            if (!szbVar.asInterface() && (!szbVar.IAuthTabCallbackStubProxy() || !szbVar.onNavigationEvent().onActivityLayout().equals("html"))) {
                if (rzo.isWhitespace(szbVar)) {
                    qgr qgrVarIAuthTabCallbackStubProxy = rcVar.IAuthTabCallbackStubProxy("html");
                    rcVar.IAuthTabCallback(szbVar.onExtraCallback());
                    if (qgrVarIAuthTabCallbackStubProxy == null) {
                        return true;
                    }
                    rcVar.extraCallback.add(qgrVarIAuthTabCallbackStubProxy);
                    qgr qgrVarIAuthTabCallbackDefault = qgrVarIAuthTabCallbackStubProxy.IAuthTabCallbackDefault("body");
                    if (qgrVarIAuthTabCallbackDefault == null) {
                        return true;
                    }
                    rcVar.extraCallback.add(qgrVarIAuthTabCallbackDefault);
                    return true;
                }
                if (szbVar.asBinder()) {
                    return true;
                }
                rcVar.onExtraCallback(this);
                rcVar.onNavigationEvent(rzo.InBody);
                return rcVar.IAuthTabCallback(szbVar);
            }
            return rcVar.onNavigationEvent(szbVar, rzo.InBody);
        }
    },
    AfterAfterFrameset { // from class: o.rzo.19
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            if (szbVar.IAuthTabCallbackStub()) {
                rcVar.onExtraCallback(szbVar.onWarmupCompleted());
                return true;
            }
            if (szbVar.asInterface() || rzo.isWhitespace(szbVar) || (szbVar.IAuthTabCallbackStubProxy() && szbVar.onNavigationEvent().onActivityLayout().equals("html"))) {
                return rcVar.onNavigationEvent(szbVar, rzo.InBody);
            }
            if (szbVar.asBinder()) {
                return true;
            }
            if (szbVar.IAuthTabCallbackStubProxy() && szbVar.onNavigationEvent().onActivityLayout().equals("noframes")) {
                return rcVar.onNavigationEvent(szbVar, rzo.InHead);
            }
            rcVar.onExtraCallback(this);
            return false;
        }
    },
    ForeignContent { // from class: o.rzo.16
        @Override // o.rzo
        boolean process(szb szbVar, rc rcVar) {
            return true;
        }
    };

    private static final String nullString = "\u0000";

    abstract boolean process(szb szbVar, rc rcVar);

    /* renamed from: o.rzo$17, reason: invalid class name */
    static /* synthetic */ class AnonymousClass17 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[szb.onTransact.values().length];
            onExtraCallback = iArr;
            try {
                iArr[szb.onTransact.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[szb.onTransact.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[szb.onTransact.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[szb.onTransact.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallback[szb.onTransact.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onExtraCallback[szb.onTransact.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        static final String[] IAuthTabCallback;
        static final String[] IAuthTabCallbackDefault;
        static final String[] IAuthTabCallbackStub;
        static final String[] IAuthTabCallbackStubProxy;
        static final String[] IAuthTabCallback_Parcel;
        static final String[] ICustomTabsCallback;
        static final String[] ICustomTabsCallbackDefault;
        static final String[] ICustomTabsCallbackStub;
        static final String[] ICustomTabsCallbackStubProxy;
        static final String[] ICustomTabsCallback_Parcel;
        static final String[] ICustomTabsService;
        static final String[] access000;
        static final String[] access100;
        static final String[] asBinder;
        static final String[] asInterface;
        static final String[] extraCallback;
        static final String[] extraCallbackWithResult;
        static final String[] extraCommand;
        static final String[] getInterfaceDescriptor;
        static final String[] isEngagementSignalsApiAvailable;
        static final String[] mayLaunchUrl;
        static final String[] newAuthTabSession;
        static final String[] newSession;
        static final String[] newSessionWithExtras;
        static final String[] onActivityLayout;
        static final String[] onActivityResized;
        static final String[] onExtraCallback;
        static final String[] onExtraCallbackWithResult;
        static final String[] onMessageChannelReady;
        static final String[] onMinimized;
        static final String[] onNavigationEvent;
        static final String[] onPostMessage;
        static final String[] onRelationshipValidationResult;
        static final String[] onTransact;
        static final String[] onUnminimized;
        static final String[] onWarmupCompleted;
        static final String[] postMessage;
        static final String[] prefetch;
        private static int prefetchWithMultipleUrls = 1;
        static final String[] readTypedObject;
        private static char[] receiveFile;
        private static int requestPostMessageChannel;
        static final String[] writeTypedObject;

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr = receiveFile;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $11 + 105;
                    $10 = i10 % 128;
                    int i11 = i10 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 35, 14238 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i9++;
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i6];
            System.arraycopy(cArr, i5, cArr3, 0, i6);
            if (bArr != null) {
                char[] cArr4 = new char[i6];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 10935), 65 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), 16718 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.resolveSize(0, 0)), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 70, TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                int i14 = $10 + 17;
                $11 = i14 % 128;
                i = 2;
                int i15 = i14 % 2;
                cArr3 = cArr4;
            } else {
                i = 2;
            }
            if (i8 > 0) {
                int i16 = $10 + 115;
                $11 = i16 % 128;
                int i17 = i16 % i;
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                int i18 = i6 - i8;
                System.arraycopy(cArr5, 0, cArr3, i18, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i18);
            }
            if (z) {
                int i19 = $11 + 107;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                char[] cArr6 = new char[i6];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                    int i21 = $10 + 99;
                    $11 = i21 % 128;
                    if (i21 % 2 == 0) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(trackGroupExternalSyntheticLambda0.onNavigationEvent + i6) % 1];
                        i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
                }
                cArr3 = cArr6;
            }
            if (i7 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        onExtraCallback() {
        }

        static {
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a(new int[]{0, 5, 0, 0}, false, new byte[]{1, 1, 1, 1, 1}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            onMessageChannelReady = new String[]{"base", "basefont", "bgsound", "command", "link"};
            onRelationshipValidationResult = new String[]{"noframes", strIntern};
            onPostMessage = new String[]{"body", "br", "html"};
            onNavigationEvent = new String[]{"body", "br", "html"};
            onWarmupCompleted = new String[]{"body", "br", "head", "html"};
            onActivityLayout = new String[]{"basefont", "bgsound", "link", "meta", "noframes", strIntern};
            Object[] objArr2 = new Object[1];
            a(new int[]{5, 5, 144, 0}, false, new byte[]{0, 1, 1, 0, 1}, objArr2);
            extraCallbackWithResult = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", strIntern, "template", ((String) objArr2[0]).intern()};
            IAuthTabCallbackStubProxy = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
            IAuthTabCallback = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            access000 = new String[]{"address", "div", "p"};
            onExtraCallback = new String[]{"dd", "dt"};
            onExtraCallbackWithResult = new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
            IAuthTabCallbackDefault = new String[]{"applet", "marquee", "object"};
            access100 = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
            IAuthTabCallback_Parcel = new String[]{"param", "source", "track"};
            Object[] objArr3 = new Object[1];
            a(new int[]{10, 6, 0, 0}, false, new byte[]{1, 0, 1, 1, 0, 1}, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new int[]{16, 4, 114, 4}, true, new byte[]{1, 0, 0, 1}, objArr4);
            getInterfaceDescriptor = new String[]{strIntern2, ((String) objArr4[0]).intern(), "prompt"};
            asBinder = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            Object[] objArr5 = new Object[1];
            a(new int[]{20, 6, 0, 0}, false, new byte[]{0, 1, 1, 0, 1, 1}, objArr5);
            onTransact = new String[]{"address", "article", "aside", "blockquote", ((String) objArr5[0]).intern(), "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
            IAuthTabCallbackStub = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
            asInterface = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            newSessionWithExtras = new String[]{"tbody", "tfoot", "thead"};
            ICustomTabsService = new String[]{"td", "th", "tr"};
            newSession = new String[]{"script", strIntern, "template"};
            readTypedObject = new String[]{"td", "th"};
            extraCallback = new String[]{"body", "caption", "col", "colgroup", "html"};
            onMinimized = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            writeTypedObject = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
            mayLaunchUrl = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            newAuthTabSession = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            ICustomTabsCallback_Parcel = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
            isEngagementSignalsApiAvailable = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
            ICustomTabsCallbackStubProxy = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
            ICustomTabsCallbackStub = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
            Object[] objArr6 = new Object[1];
            a(new int[]{26, 5, 0, 2}, true, new byte[]{0, 1, 1, 1, 1}, objArr6);
            onUnminimized = new String[]{((String) objArr6[0]).intern(), "keygen", "textarea"};
            ICustomTabsCallbackDefault = new String[]{"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
            extraCommand = new String[]{"tbody", "tfoot", "thead"};
            onActivityResized = new String[]{"head", "noscript"};
            ICustomTabsCallback = new String[]{"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            Object[] objArr7 = new Object[1];
            a(new int[]{5, 5, 144, 0}, false, new byte[]{0, 1, 1, 0, 1}, objArr7);
            prefetch = new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", strIntern, "template", ((String) objArr7[0]).intern()};
            postMessage = new String[]{"caption", "colgroup", "tbody", "tfoot", "thead"};
            int i = requestPostMessageChannel + 103;
            prefetchWithMultipleUrls = i % 128;
            int i2 = i % 2;
        }

        static void onNavigationEvent() {
            receiveFile = new char[]{27255, 27197, 27192, 27196, 27174, 27340, 27312, 27312, 27470, 27318, 27262, 27180, 27173, 27168, 27170, 27168, 27173, 27285, 27287, 27287, 27263, 27173, 27194, 27194, 27199, 27168, 27257, 27173, 27168, 27194, 27196};
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(szb szbVar) {
        if (szbVar.IAuthTabCallbackDefault()) {
            return nfe.onNavigationEvent(szbVar.onExtraCallback().access000());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(String str) {
        return nfe.onNavigationEvent(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRcData(szb.asBinder asbinder, rc rcVar) {
        rcVar.ICustomTabsCallback.IAuthTabCallback(uc.Rcdata);
        rcVar.extraCallback();
        rcVar.onNavigationEvent(Text);
        rcVar.onNavigationEvent(asbinder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRawtext(szb.asBinder asbinder, rc rcVar) {
        rcVar.ICustomTabsCallback.IAuthTabCallback(uc.Rawtext);
        rcVar.extraCallback();
        rcVar.onNavigationEvent(Text);
        rcVar.onNavigationEvent(asbinder);
    }
}
