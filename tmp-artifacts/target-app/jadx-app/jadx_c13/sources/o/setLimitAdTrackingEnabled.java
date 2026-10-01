package o;

import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.getAdvertisingId;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setLimitAdTrackingEnabled implements AFe1mSDK {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final getAdvertisingIdWithGps onExtraCallbackWithResult;

    static final class onExtraCallback<T> extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = setLimitAdTrackingEnabled.this.IAuthTabCallback(null, null, this);
            int i4 = onExtraCallbackWithResult + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    @Inject
    public setLimitAdTrackingEnabled(@NotNull getAdvertisingIdWithGps getadvertisingidwithgps) {
        Intrinsics.checkNotNullParameter(getadvertisingidwithgps, "");
        this.onExtraCallbackWithResult = getadvertisingidwithgps;
    }

    public static final /* synthetic */ getAdvertisingIdWithGps onExtraCallbackWithResult(setLimitAdTrackingEnabled setlimitadtrackingenabled) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        getAdvertisingIdWithGps getadvertisingidwithgps = setlimitadtrackingenabled.onExtraCallbackWithResult;
        int i5 = i2 + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getadvertisingidwithgps;
    }

    @Override // o.AFe1mSDK
    public <T> Object onExtraCallbackWithResult(@NotNull getAdvertisingId.onExtraCallbackWithResult onextracallbackwithresult, @NotNull Class<T> cls, @NotNull access13800<? super T> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult.getKey(), cls, access13800Var);
        int i4 = onExtraCallback + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // o.AFe1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object IAuthTabCallback(@NotNull String str, @NotNull Class<T> cls, @NotNull access13800<? super T> access13800Var) {
        onExtraCallback onextracallback;
        Object objM31constructorimpl;
        Object objM31constructorimpl2;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i4 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = onextracallback.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                Result.Companion companion = Result.Companion;
                getAdvertisingIdWithGps getadvertisingidwithgpsOnExtraCallbackWithResult = onExtraCallbackWithResult(this);
                onextracallback.L$0 = str;
                onextracallback.L$1 = cls;
                onextracallback.L$2 = access15400.onNavigationEvent(onextracallback);
                onextracallback.I$0 = 0;
                onextracallback.I$1 = 0;
                onextracallback.label = 1;
                objOnExtraCallbackWithResult = getadvertisingidwithgpsOnExtraCallbackWithResult.onExtraCallbackWithResult(str, onextracallback);
                if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cls = (Class) onextracallback.L$1;
                str = (String) onextracallback.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                int i6 = onNavigationEvent + 113;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 2;
                }
            }
            objM31constructorimpl = Result.m31constructorimpl(objOnExtraCallbackWithResult);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
        Object obj = null;
        if (Result.onExtraCallback(objM31constructorimpl)) {
            int i8 = onNavigationEvent + 55;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            objM31constructorimpl = null;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) objM31constructorimpl;
        if (jsonPrimitive == null) {
            return null;
        }
        int i10 = onExtraCallback + 105;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        try {
            Result.Companion companion4 = Result.Companion;
            objM31constructorimpl2 = Result.m31constructorimpl(setAdvertisingIdWithGps.onExtraCallbackWithResult(jsonPrimitive, cls));
        } catch (Throwable th) {
            Result.Companion companion5 = Result.Companion;
            objM31constructorimpl2 = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.onNavigationEvent(objM31constructorimpl2) && objM31constructorimpl2 == null) {
            onWarmupCompleted(this, str, null, 2, null);
        }
        Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl2);
        if (thM32exceptionOrNullimpl != null) {
            onExtraCallbackWithResult(str, thM32exceptionOrNullimpl);
            int i12 = onExtraCallback + 13;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        }
        if (!Result.onExtraCallback(objM31constructorimpl2)) {
            return objM31constructorimpl2;
        }
        int i14 = onNavigationEvent + 47;
        onExtraCallback = i14 % 128;
        if (i14 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onWarmupCompleted(setLimitAdTrackingEnabled setlimitadtrackingenabled, String str, Throwable th, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 0;
            }
            th = null;
        }
        setlimitadtrackingenabled.onExtraCallbackWithResult(str, th);
        int i5 = onExtraCallback + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(String str, Throwable th) {
        String message;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
            if (th != null) {
                int i5 = i2 + 23;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    message = th.getMessage();
                    int i6 = 55 / 0;
                    if (message == null) {
                        message = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                } else {
                    message = th.getMessage();
                    if (message == null) {
                    }
                }
            }
        } else if (th != null) {
        }
        auth.onExtraCallback(auth.onNavigationEvent, "SecuritiesVars", "Failed to parse variable for key : " + str + ", return null, " + message, (Map) null, 4, (Object) null);
        int i7 = onNavigationEvent + 113;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 96 / 0;
        }
    }

    @Override // o.AFe1mSDK
    public Object onNavigationEvent(@NotNull access13800<? super JsonObject> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getAdvertisingIdWithGps getadvertisingidwithgps = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            return getadvertisingidwithgps.onExtraCallback(access13800Var);
        }
        getadvertisingidwithgps.onExtraCallback(access13800Var);
        throw null;
    }

    @Override // o.AFe1mSDK
    public Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult.onNavigationEvent(access13800Var);
            access14100.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(access13800Var);
        if (objOnNavigationEvent != access14100.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        int i3 = onNavigationEvent + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return objOnNavigationEvent;
    }
}
