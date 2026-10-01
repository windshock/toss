package o;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1jSDKAFa1uSDK extends AFe1cSDK {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final AFe1qSDK onExtraCallback;
    private final AFe1mSDK onExtraCallbackWithResult;

    static final class IAuthTabCallback<T> extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = AFe1jSDKAFa1uSDK.this.onExtraCallback(null, null, null, this);
            int i4 = onNavigationEvent + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
    }

    static final class onWarmupCompleted<T> extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            AFe1jSDKAFa1uSDK aFe1jSDKAFa1uSDK = AFe1jSDKAFa1uSDK.this;
            if (i3 == 0) {
                return aFe1jSDKAFa1uSDK.IAuthTabCallback(null, null, null, this);
            }
            aFe1jSDKAFa1uSDK.IAuthTabCallback(null, null, null, this);
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public AFe1jSDKAFa1uSDK(@NotNull AFe1mSDK aFe1mSDK, @NotNull AFe1qSDK aFe1qSDK) {
        Intrinsics.checkNotNullParameter(aFe1mSDK, "");
        Intrinsics.checkNotNullParameter(aFe1qSDK, "");
        this.onExtraCallbackWithResult = aFe1mSDK;
        this.onExtraCallback = aFe1qSDK;
    }

    @Override // o.AFe1cSDK
    public Object onNavigationEvent(boolean z, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(z, access13800Var);
        if (objIAuthTabCallback != access14100.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        int i2 = IAuthTabCallback;
        int i3 = i2 + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r10 != r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (r10 == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // o.AFe1cSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object onExtraCallback(@NotNull getAdvertisingId getadvertisingid, @NotNull Class<T> cls, T t, @NotNull access13800<? super T> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (!(access13800Var instanceof IAuthTabCallback)) {
            iAuthTabCallback = new IAuthTabCallback(access13800Var);
        } else {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IAuthTabCallback + 63;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                iAuthTabCallback.label = i2 - 2147483648;
            }
        }
        Object objOnExtraCallbackWithResult = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = iAuthTabCallback.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            if (!(!(getadvertisingid instanceof getAdvertisingId.IAuthTabCallback))) {
                iAuthTabCallback.L$0 = access15400.onNavigationEvent(getadvertisingid);
                iAuthTabCallback.L$1 = access15400.onNavigationEvent(cls);
                iAuthTabCallback.L$2 = t;
                iAuthTabCallback.label = 1;
                objOnExtraCallbackWithResult = this.onExtraCallback.IAuthTabCallback((getAdvertisingId.IAuthTabCallback) getadvertisingid, cls, t, iAuthTabCallback);
            } else {
                if (!(getadvertisingid instanceof getAdvertisingId.onExtraCallbackWithResult)) {
                    return t;
                }
                int i6 = onWarmupCompleted + 69;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                iAuthTabCallback.L$0 = access15400.onNavigationEvent(getadvertisingid);
                iAuthTabCallback.L$1 = access15400.onNavigationEvent(cls);
                iAuthTabCallback.L$2 = t;
                iAuthTabCallback.label = 2;
                objOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult((getAdvertisingId.onExtraCallbackWithResult) getadvertisingid, cls, iAuthTabCallback);
            }
            int i8 = IAuthTabCallback + 31;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return objOnExtraCallback;
        }
        if (i5 == 1) {
            t = (T) iAuthTabCallback.L$2;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            return objOnExtraCallbackWithResult == null ? t : objOnExtraCallbackWithResult;
        }
        int i10 = onWarmupCompleted + 67;
        int i11 = i10 % 128;
        IAuthTabCallback = i11;
        int i12 = i10 % 2;
        if (i5 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i13 = i11 + 71;
        onWarmupCompleted = i13 % 128;
        int i14 = i13 % 2;
        t = (T) iAuthTabCallback.L$2;
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        if (objOnExtraCallbackWithResult != null) {
            return objOnExtraCallbackWithResult;
        }
        int i15 = IAuthTabCallback + 69;
        onWarmupCompleted = i15 % 128;
        int i16 = i15 % 2;
        return t;
    }

    @Override // o.AFe1cSDK
    public Object onWarmupCompleted(@NotNull access13800<? super JsonObject> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(access13800Var);
        int i4 = onWarmupCompleted + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r2 = r2 + 61;
        o.AFe1jSDKAFa1uSDK.onWarmupCompleted = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r4 == o.access14100.onExtraCallback()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r4 == o.access14100.onExtraCallback()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = o.AFe1jSDKAFa1uSDK.onWarmupCompleted + 29;
        r2 = r1 % 128;
        o.AFe1jSDKAFa1uSDK.IAuthTabCallback = r2;
     */
    @Override // o.AFe1cSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            objOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(access13800Var);
            int i3 = 57 / 0;
        } else {
            objOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(access13800Var);
        }
    }

    @Override // o.AFe1cSDK
    public List<Pair<String, String>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<Pair<String, String>> listOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.AFe1cSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object IAuthTabCallback(@NotNull String str, @NotNull Class<T> cls, T t, @NotNull access13800<? super T> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objIAuthTabCallback = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i3 = onwarmupcompleted.label;
        if (i3 != 0) {
            int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t = (T) onwarmupcompleted.L$2;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        } else {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            AFe1mSDK aFe1mSDK = this.onExtraCallbackWithResult;
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(str);
            onwarmupcompleted.L$1 = access15400.onNavigationEvent(cls);
            onwarmupcompleted.L$2 = t;
            onwarmupcompleted.label = 1;
            objIAuthTabCallback = aFe1mSDK.IAuthTabCallback(str, cls, onwarmupcompleted);
            if (objIAuthTabCallback == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        }
        if (objIAuthTabCallback != null) {
            return objIAuthTabCallback;
        }
        int i5 = IAuthTabCallback + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AFe1cSDK
    public Object onWarmupCompleted(@NotNull getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr, @NotNull access13800<? super Map<String, String>> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AFe1qSDK aFe1qSDK = this.onExtraCallback;
        if (i3 == 0) {
            return aFe1qSDK.onNavigationEvent((getAdvertisingId.IAuthTabCallback[]) Arrays.copyOf(iAuthTabCallbackArr, iAuthTabCallbackArr.length), access13800Var);
        }
        aFe1qSDK.onNavigationEvent((getAdvertisingId.IAuthTabCallback[]) Arrays.copyOf(iAuthTabCallbackArr, iAuthTabCallbackArr.length), access13800Var);
        throw null;
    }
}
