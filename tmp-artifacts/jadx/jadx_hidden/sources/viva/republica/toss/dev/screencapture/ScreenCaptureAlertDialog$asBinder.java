package viva.republica.toss.dev.screencapture;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda1;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access14600;
import o.bindContext;
import o.findResAndMsg;
import o.maybeRemoveAttachStateListener;
import o.s3;
import o.setResourceInternal;

/* loaded from: classes.dex */
final class ScreenCaptureAlertDialog$asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 7719798543685762405L;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ WebView $webView;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenCaptureAlertDialog$asBinder(WebView webView, access13800<? super ScreenCaptureAlertDialog$asBinder> access13800Var) {
        super(2, access13800Var);
        this.$webView = webView;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onWarmupCompleted + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ScreenCaptureAlertDialog$asBinder screenCaptureAlertDialog$asBinder = new ScreenCaptureAlertDialog$asBinder(this.$webView, access13800Var);
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return screenCaptureAlertDialog$asBinder;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return objIAuthTabCallback;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 59;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) % (5407414049857832247L | IAuthTabCallback);
            } else {
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (5407414049857832247L ^ IAuthTabCallback) ^ s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            int i4 = $10 + 11;
            $11 = i4 % 128;
            int i5 = i4 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    static final class onExtraCallback<T> implements ValueCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 478308989;
        private static int onWarmupCompleted;
        final /* synthetic */ maybeRemoveAttachStateListener<String> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(maybeRemoveAttachStateListener<? super String> mayberemoveattachstatelistener) {
            this.onNavigationEvent = mayberemoveattachstatelistener;
        }

        @Override // android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((String) obj);
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
        }

        public final void onExtraCallback(String str) {
            String strTrim;
            int i = 2 % 2;
            String str2 = null;
            if (str != null) {
                int i2 = IAuthTabCallback + 47;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0 ? (strTrim = StringsKt.trim(str, new char[]{'\"'})) != null : (strTrim = StringsKt.trim(str, new char[]{'G'})) != null) {
                    Object[] objArr = new Object[1];
                    a(3 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getEdgeSlop() >> 16) + 4, new char[]{0, 7, 65534, 65534}, false, 194 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                    if (!Intrinsics.areEqual(strTrim, ((String) objArr[0]).intern()) && strTrim.length() > 0) {
                        str2 = strTrim;
                    }
                }
            }
            if (this.onNavigationEvent.onNavigationEvent()) {
                int i3 = IAuthTabCallback + 83;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                maybeRemoveAttachStateListener<String> mayberemoveattachstatelistener = this.onNavigationEvent;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(str2));
            }
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i5 = $11 + 31;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                cArr2[i7] = bindContext.access000.g(cArr2[i7], onExtraCallbackWithResult);
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                int i8 = $11 + 95;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            if (i2 > 0) {
                int i10 = $10 + 89;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (!(!z)) {
                int i12 = $11 + 53;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                }
                cArr2 = cArr4;
            }
            String str = new String(cArr2);
            int i14 = $11 + 17;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            objArr[0] = str;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{14385, 5340, 25056, 48883, 35790, 55437, 13735, 763, 24333, 44103, 63841, 54884, 8979, 28700, 19749, 39540, 63106, 50159, 4345, 28041, 47761, 38843, 58557, 12555, 3613, 23404, 43130, 34065, 53785, 12074, 31797, 18564, 42386, 62186, 53125, 7307, 27046, 18169, 37707, 57428, 15736, 2682, 26385, 46083, 33071, 56895, 10949}, Color.blue(0) + 11503, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i5 = onWarmupCompleted + 25;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ResultKt.onNavigationEvent(obj);
        WebView webView = this.$webView;
        this.L$0 = webView;
        this.I$0 = 0;
        this.label = 1;
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(this), 1);
        setresourceinternal.onTransact();
        Object[] objArr2 = new Object[1];
        a(new char[]{14373, 33192, 19226, 5263, 56945, 43002, 24846, 11016, 62613, 48670, 1929, 49527, 35553, 21568, 7738, 59278, 41234, 27361, 13394, 64990, 18268, 302, 51865, 37896, 24052, 10017, 57493}, 47508 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        webView.evaluateJavascript(((String) objArr2[0]).intern(), new onExtraCallback(setresourceinternal));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            int i6 = onWarmupCompleted + 87;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            access14600.IAuthTabCallback(this);
        }
        if (objIAuthTabCallbackDefault != objOnWarmupCompleted) {
            int i8 = onNavigationEvent + 31;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return objIAuthTabCallbackDefault;
        }
        int i10 = onNavigationEvent + 91;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 20 / 0;
        }
        return objOnWarmupCompleted;
    }
}
