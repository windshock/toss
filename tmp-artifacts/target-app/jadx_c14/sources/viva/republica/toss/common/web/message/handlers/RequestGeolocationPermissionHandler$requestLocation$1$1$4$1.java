package viva.republica.toss.common.web.message.handlers;

import android.graphics.Color;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.jni_YGNodeStyleGetMaxWidthJNI;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RequestGeolocationPermissionHandler$requestLocation$1$1$4$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Location>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 50969;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 3062;
    private static char onExtraCallbackWithResult = 47173;
    private static char onNavigationEvent = 46201;
    private static int onWarmupCompleted;
    final /* synthetic */ FusedLocationProviderClient $locationClient;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RequestGeolocationPermissionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestGeolocationPermissionHandler$requestLocation$1$1$4$1(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, FusedLocationProviderClient fusedLocationProviderClient, access13800<? super RequestGeolocationPermissionHandler$requestLocation$1$1$4$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = requestGeolocationPermissionHandler;
        this.$locationClient = fusedLocationProviderClient;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RequestGeolocationPermissionHandler$requestLocation$1$1$4$1 requestGeolocationPermissionHandler$requestLocation$1$1$4$1 = new RequestGeolocationPermissionHandler$requestLocation$1$1$4$1(this.this$0, this.$locationClient, access13800Var);
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return requestGeolocationPermissionHandler$requestLocation$1$1$4$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 23;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Location> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        RequestGeolocationPermissionHandler$requestLocation$1$1$4$1 requestGeolocationPermissionHandler$requestLocation$1$1$4$1Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            requestGeolocationPermissionHandler$requestLocation$1$1$4$1Create.invokeSuspend(unit);
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = requestGeolocationPermissionHandler$requestLocation$1$1$4$1Create.invokeSuspend(unit);
        int i4 = IAuthTabCallbackDefault + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 65;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent << 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $11 + 19;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", i4);
                        int offsetAfter = 10 - TextUtils.getOffsetAfter("", i4);
                        int i11 = 12435 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, offsetAfter, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    int i12 = $11 + 35;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 14, Color.rgb(0, 0, 0) + 16797117, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            CurrentLocationRequest currentLocationRequestBuild = new CurrentLocationRequest.Builder().setPriority(RequestGeolocationPermissionHandler.onExtraCallbackWithResult(this.this$0).getPriority()).setDurationMillis(3000L).build();
            Intrinsics.checkNotNullExpressionValue(currentLocationRequestBuild, "");
            Task currentLocation = this.$locationClient.getCurrentLocation(currentLocationRequestBuild, cancellationTokenSource.getToken());
            Intrinsics.checkNotNullExpressionValue(currentLocation, "");
            this.L$0 = access15400.onNavigationEvent(cancellationTokenSource);
            this.L$1 = access15400.onNavigationEvent(currentLocationRequestBuild);
            this.label = 1;
            obj = jni_YGNodeStyleGetMaxWidthJNI.onNavigationEvent(currentLocation, cancellationTokenSource, this);
            if (obj == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i4 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{7064, 25647, 13023, 6905, 21033, 22148, 18085, 34168, 22273, 5921, 14768, 6235, 13845, 41395, 47537, 29560, 11918, 17533, 58178, 42857, 50773, 51677, 11897, 3335, 45622, 62007, 60168, 9362, 5891, 17605, 47537, 29560, 37283, 25043, 62632, 23227, 40359, 22951, 3542, 44327, 19763, 19243, 36294, 12340, 37206, 2804, 38595, 41865}, 47 - Color.red(0), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i5 = IAuthTabCallbackDefault + 93;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
        }
        Intrinsics.checkNotNull(obj);
        return obj;
    }
}
