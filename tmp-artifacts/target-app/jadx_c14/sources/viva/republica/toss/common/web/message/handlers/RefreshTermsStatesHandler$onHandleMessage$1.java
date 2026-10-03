package viva.republica.toss.common.web.message.handlers;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.onFirstFrameRendered;
import o.r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RefreshTermsStatesHandler$onHandleMessage$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    int label;
    private static char[] onExtraCallback = {32499, 32509, 32490, 32446, 32482, 32495, 32439, 32492, 32497, 32483, 32481, 32489, 32508, 32496, 32501, 32488, 32480, 32491, 32487, 32502};
    private static int IAuthTabCallback = -1184334178;
    private static boolean onExtraCallbackWithResult = true;
    private static boolean onNavigationEvent = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshTermsStatesHandler$onHandleMessage$1(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super RefreshTermsStatesHandler$onHandleMessage$1> access13800Var) {
        super(2, access13800Var);
        this.$callbackProxy = setonoutofmemeryerrorcallback;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = IAuthTabCallbackDefault + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RefreshTermsStatesHandler$onHandleMessage$1 refreshTermsStatesHandler$onHandleMessage$1 = new RefreshTermsStatesHandler$onHandleMessage$1(this.$callbackProxy, access13800Var);
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return refreshTermsStatesHandler$onHandleMessage$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = IAuthTabCallbackDefault + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A r8lambdar_kd5j2ktjkq2tqcokmlhfuqu6aOnExtraCallback = r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A.Companion.onExtraCallback();
            this.label = 1;
            objOnWarmupCompleted = r8lambdar_kd5j2ktjkq2tqcokmlhfuqu6aOnExtraCallback.onWarmupCompleted(this);
            if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                return objOnWarmupCompleted2;
            }
        } else {
            if (i4 != 1) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, 126 - MotionEvent.axisFromString(""), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i5 = IAuthTabCallbackDefault + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            objOnWarmupCompleted = ((Result) obj).onNavigationEvent();
        }
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
        if (Result.onNavigationEvent(objOnWarmupCompleted)) {
            int i7 = IAuthTabCallbackDefault + 65;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            onFirstFrameRendered.Companion.onWarmupCompleted().onExtraCallbackWithResult();
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
            int i9 = onWarmupCompleted + 95;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
        }
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
        Throwable th = Result.exceptionOrNull-impl(objOnWarmupCompleted);
        if (th != null) {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback2, th.getMessage(), (String) null, (Map) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallback;
        float f = 0.0f;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = $10 + 123;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 77, 20952 - TextUtils.getOffsetAfter("", 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 75 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 16037 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (onNavigationEvent) {
            int i7 = $10 + 75;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (Process.myTid() >> 22) + 63, View.MeasureSpec.getMode(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $11 + 29;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
            ((Method) (objOnExtraCallback4 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63, 12214 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class}) : objOnExtraCallback4)).invoke(null, objArr5);
            i6 = 1052772399;
        }
        objArr[0] = new String(cArr2);
    }
}
