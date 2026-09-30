package o;

import im.toss.tosssecurities.network.data.SecuritiesApiErrorResponse;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import im.toss.tosssecurities.network.domain.SecuritiesApiError;
import im.toss.tosssecurities.tuba.variable.v1.VarsResult;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getGaidError implements getAdvertisingIdWithGps {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private final AtomicReference<JsonObject> onExtraCallback;
    private final isLimitAdTrackingEnabled onExtraCallbackWithResult;
    private final AtomicReference<JsonObject> onNavigationEvent;
    private final decodeIpv6 onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[getAdvertisingId.onExtraCallback.values().length];
            try {
                iArr[getAdvertisingId.onExtraCallback.DEVICE_ID_AND_GA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getAdvertisingId.onExtraCallback.DEVICE_ID_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getAdvertisingId.onExtraCallback.CDN.ordinal()] = 3;
                int i = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
            int i4 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = getGaidError.this.onExtraCallbackWithResult(null, this);
            if (i3 == 0) {
                int i4 = 93 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
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
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            getGaidError getgaiderror = getGaidError.this;
            if (i3 == 0) {
                return getGaidError.onExtraCallbackWithResult(getgaiderror, null, this);
            }
            getGaidError.onExtraCallbackWithResult(getgaiderror, null, this);
            throw null;
        }
    }

    @Inject
    public getGaidError(@NotNull isLimitAdTrackingEnabled islimitadtrackingenabled, @NotNull decodeIpv6 decodeipv6) {
        Intrinsics.checkNotNullParameter(islimitadtrackingenabled, "");
        Intrinsics.checkNotNullParameter(decodeipv6, "");
        this.onExtraCallbackWithResult = islimitadtrackingenabled;
        this.onWarmupCompleted = decodeipv6;
        this.onExtraCallback = new AtomicReference<>();
        this.onNavigationEvent = new AtomicReference<>();
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(getGaidError getgaiderror, getAdvertisingId.onExtraCallback onextracallback, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = getgaiderror.IAuthTabCallback(onextracallback, access13800Var);
        int i4 = asInterface + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ isLimitAdTrackingEnabled onNavigationEvent(getGaidError getgaiderror) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        isLimitAdTrackingEnabled islimitadtrackingenabled = getgaiderror.onExtraCallbackWithResult;
        int i5 = i2 + 75;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return islimitadtrackingenabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r15 != r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r15 == r2) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r3
      0x002b: PHI (r1v26 o.getGaidError$onExtraCallback) = (r1v25 o.getGaidError$onExtraCallback), (r1v28 o.getGaidError$onExtraCallback) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r3v5 int) = (r3v4 int), (r3v7 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116 A[PHI: r1
      0x0116: PHI (r1v13 java.lang.String) = (r1v12 java.lang.String), (r1v17 java.lang.String) binds: [B:56:0x0114, B:53:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122 A[PHI: r1
      0x0122: PHI (r1v15 java.lang.String) = (r1v12 java.lang.String), (r1v17 java.lang.String) binds: [B:56:0x0114, B:53:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135 A[RETURN] */
    @Override // o.getAdvertisingIdWithGps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull String str, @NotNull access13800<? super JsonPrimitive> access13800Var) {
        onExtraCallback onextracallback;
        JsonElement jsonElement;
        Iterator it;
        String str2;
        JsonObject jsonObject;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i3 = asInterface + 93;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onextracallback = (onExtraCallback) access13800Var;
                i = onextracallback.label;
                int i4 = 47 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onextracallback.label = i - 2147483648;
                } else {
                    onextracallback = new onExtraCallback(access13800Var);
                }
            } else {
                onextracallback = (onExtraCallback) access13800Var;
                i = onextracallback.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object objOnNavigationEvent = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = onextracallback.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            decodeIpv6 decodeipv6 = this.onWarmupCompleted;
            onextracallback.L$0 = str;
            onextracallback.label = 1;
            objOnNavigationEvent = decodeipv6.onNavigationEvent(onextracallback);
            if (objOnNavigationEvent != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        if (i5 != 1) {
            int i6 = asInterface;
            int i7 = i6 + 109;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (i5 != 2) {
                int i9 = i6 + 49;
                int i10 = i9 % 128;
                IAuthTabCallback = i10;
                int i11 = i9 % 2;
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i12 = i10 + 15;
                asInterface = i12 % 128;
                if (i12 % 2 == 0) {
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    throw null;
                }
                str = (String) onextracallback.L$0;
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                jsonElement = (JsonObject) objOnNavigationEvent;
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
                if (jsonElement == null) {
                    int i13 = IAuthTabCallback + 31;
                    asInterface = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                } else {
                    jsonElement = null;
                }
                it = listSplit$default.iterator();
                while (it.hasNext()) {
                    int i14 = IAuthTabCallback + 29;
                    asInterface = i14 % 128;
                    if (i14 % 2 == 0) {
                        str2 = (String) it.next();
                        int i15 = 38 / 0;
                        if (jsonElement instanceof JsonObject) {
                            int i16 = IAuthTabCallback + 91;
                            asInterface = i16 % 128;
                            int i17 = i16 % 2;
                            jsonObject = (JsonObject) jsonElement;
                        } else {
                            jsonObject = null;
                        }
                    } else {
                        str2 = (String) it.next();
                        if (jsonElement instanceof JsonObject) {
                        }
                    }
                    jsonElement = jsonObject != null ? (JsonElement) jsonObject.get(str2) : null;
                }
                if (jsonElement instanceof JsonPrimitive) {
                    return null;
                }
                return (JsonPrimitive) jsonElement;
            }
            str = (String) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            jsonElement = (JsonObject) objOnNavigationEvent;
            int i18 = IAuthTabCallback + 69;
            asInterface = i18 % 128;
            int i19 = i18 % 2;
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
            if (jsonElement == null) {
            }
            it = listSplit$default2.iterator();
            while (it.hasNext()) {
            }
            if (jsonElement instanceof JsonPrimitive) {
            }
        } else {
            str = (String) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
        }
        if (((Boolean) objOnNavigationEvent).booleanValue()) {
            getAdvertisingId.onExtraCallback onextracallback2 = getAdvertisingId.onExtraCallback.DEVICE_ID_AND_GA;
            onextracallback.L$0 = str;
            onextracallback.label = 2;
            objOnNavigationEvent = IAuthTabCallback(onextracallback2, onextracallback);
        } else {
            getAdvertisingId.onExtraCallback onextracallback3 = getAdvertisingId.onExtraCallback.DEVICE_ID_ONLY;
            onextracallback.L$0 = str;
            onextracallback.label = 3;
            objOnNavigationEvent = IAuthTabCallback(onextracallback3, onextracallback);
        }
        return objOnExtraCallback;
    }

    @Override // o.getAdvertisingIdWithGps
    public Object onExtraCallback(@NotNull access13800<? super JsonObject> access13800Var) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(getAdvertisingId.onExtraCallback.DEVICE_ID_AND_GA, access13800Var);
        int i4 = IAuthTabCallback + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    @Override // o.getAdvertisingIdWithGps
    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object obj = null;
        this.onExtraCallback.set(null);
        this.onNavigationEvent.set(null);
        Object objOnExtraCallback = onExtraCallback(access13800Var);
        if (objOnExtraCallback == access14100.onExtraCallback()) {
            int i2 = IAuthTabCallback + 67;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return objOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 71;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends VarsResult>>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function1 $apiCall;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Function1 function1, access13800 access13800Var) {
            super(2, access13800Var);
            this.$apiCall = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$apiCall, access13800Var);
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends VarsResult>> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Result<? extends VarsResult>> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            }
            onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Result<? extends VarsResult>> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objM31constructorimpl;
            SecuritiesApiError securitiesApiErrorOnWarmupCompleted;
            VarsResult varsResult;
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                access14100.onExtraCallback();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            try {
                if (i3 != 0) {
                    int i4 = onNavigationEvent + 119;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i6 = onNavigationEvent + 27;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Function1 function1 = this.$apiCall;
                    Result.Companion companion = Result.Companion;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = function1.invoke(this);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                }
                try {
                    objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(VarsResult.class, Object.class) && !Intrinsics.areEqual(VarsResult.class, Unit.class)) {
                        throw e;
                    }
                    varsResult = (VarsResult) Unit.INSTANCE;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            } catch (CancellationException e4) {
                throw e4;
            } catch (Exception e5) {
                Result.Companion companion3 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e5));
            }
            if (objOnExtraCallbackWithResult == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.tosssecurities.tuba.variable.v1.VarsResult");
            }
            varsResult = (VarsResult) objOnExtraCallbackWithResult;
            objM31constructorimpl = Result.m31constructorimpl(varsResult);
            Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
                try {
                    Result.Companion companion4 = Result.Companion;
                    if (!(thM32exceptionOrNullimpl instanceof retrofit2.HttpException) || (securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted((retrofit2.HttpException) thM32exceptionOrNullimpl)) == null) {
                        throw thM32exceptionOrNullimpl;
                    }
                    int i8 = onWarmupCompleted + 15;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    throw securitiesApiErrorOnWarmupCompleted;
                } catch (Throwable th) {
                    Result.Companion companion5 = Result.Companion;
                    objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
                }
            }
            return Result.IAuthTabCallback(objM31constructorimpl);
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function1<access13800<? super SecuritiesBaseApiResponse<VarsResult>>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(1, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = getGaidError.this.new onNavigationEvent(access13800Var);
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(access13800Var2);
            }
            onWarmupCompleted(access13800Var2);
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                isLimitAdTrackingEnabled islimitadtrackingenabledOnNavigationEvent = getGaidError.onNavigationEvent(getGaidError.this);
                this.label = 1;
                Object objOnWarmupCompleted = islimitadtrackingenabledOnNavigationEvent.onWarmupCompleted(this);
                return objOnWarmupCompleted == objOnExtraCallback ? objOnExtraCallback : objOnWarmupCompleted;
            }
            int i3 = onWarmupCompleted;
            int i4 = i3 + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i3 + 13;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i7 == 0) {
                return obj;
            }
            throw null;
        }
    }

    static final class asBinder extends SuspendLambda implements Function1<access13800<? super SecuritiesBaseApiResponse<VarsResult>>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(1, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = getGaidError.this.new asBinder(access13800Var);
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return asbinder;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(access13800Var2);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(access13800Var2);
            int i3 = IAuthTabCallback + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((asBinder) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i3 = onExtraCallback + 95;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            isLimitAdTrackingEnabled islimitadtrackingenabledOnNavigationEvent = getGaidError.onNavigationEvent(getGaidError.this);
            this.label = 1;
            Object objOnExtraCallbackWithResult = islimitadtrackingenabledOnNavigationEvent.onExtraCallbackWithResult(this);
            if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                return objOnExtraCallbackWithResult;
            }
            int i5 = onExtraCallback + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(getAdvertisingId.onExtraCallback onextracallback, access13800<? super JsonObject> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Pair pairIAuthTabCallback;
        AtomicReference atomicReference;
        JsonObject jsonObjectOnWarmupCompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i2 = asInterface + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i4 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objOnExtraCallback = onwarmupcompleted.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i5 = onwarmupcompleted.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            int i6 = IAuthTabCallback.onNavigationEvent[onextracallback.ordinal()];
            if (i6 != 1) {
                int i7 = asInterface + 87;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0 ? i6 != 2 : i6 != 5) {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                pairIAuthTabCallback = getWrite.IAuthTabCallback(this.onNavigationEvent, new asBinder(null));
            } else {
                pairIAuthTabCallback = getWrite.IAuthTabCallback(this.onExtraCallback, new onNavigationEvent(null));
            }
            AtomicReference atomicReference2 = (AtomicReference) pairIAuthTabCallback.onExtraCallbackWithResult();
            Function1 function1 = (Function1) pairIAuthTabCallback.IAuthTabCallback();
            JsonObject jsonObject = (JsonObject) atomicReference2.get();
            if (jsonObject != null) {
                return jsonObject;
            }
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(function1, null);
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(onextracallback);
            onwarmupcompleted.L$1 = atomicReference2;
            onwarmupcompleted.L$2 = access15400.onNavigationEvent(function1);
            onwarmupcompleted.I$0 = 0;
            onwarmupcompleted.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, onwarmupcompleted);
            if (objOnExtraCallback == objOnExtraCallback2) {
                return objOnExtraCallback2;
            }
            atomicReference = atomicReference2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atomicReference = (AtomicReference) onwarmupcompleted.L$1;
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        Object objOnNavigationEvent = ((Result) objOnExtraCallback).onNavigationEvent();
        if (Result.onExtraCallback(objOnNavigationEvent)) {
            objOnNavigationEvent = null;
        }
        VarsResult varsResult = (VarsResult) objOnNavigationEvent;
        if (varsResult != null && (jsonObjectOnWarmupCompleted = varsResult.onWarmupCompleted()) != null) {
            atomicReference.set(jsonObjectOnWarmupCompleted);
            return jsonObjectOnWarmupCompleted;
        }
        int i8 = asInterface + 23;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }
}
