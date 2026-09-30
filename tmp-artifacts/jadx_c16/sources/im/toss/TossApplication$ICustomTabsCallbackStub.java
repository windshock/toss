package im.toss;

import dagger.Lazy;
import im.toss.core.tracker.RemoteProcessLogDrainCoordinator;
import im.toss.core.tracker.RemoteProcessLogEnvelope;
import im.toss.core.tracker.RemoteProcessLogIngressStore;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ComputeDistances;
import o.DetectFaceInSingleImage;
import o.ExtractFeature;
import o.FeatureExtension;
import o.GeckoHubImp1;
import o.GetFeatureExtension;
import o.GetInputImageFromPathAsGrayScale;
import o.RetrofitService;
import o.RootDetectorCompanion;
import o.access13800;
import o.access14300;
import o.access15400;
import o.clearFaultAdjacentMetadata;
import o.findResAndMsg;
import o.getErrorTypesbugsnag_android_core_release;
import o.getTextProgressSize;
import o.getUnhandled;
import o.maybeUpdateAnimatable;
import o.normalizeStackframeErrorTypesbugsnag_android_core_release;
import o.setUserImplbugsnag_android_core_release;
import o.trimMetadataStringsTo;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class TossApplication$ICustomTabsCallbackStub extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    final /* synthetic */ TossApplication $appContext;
    final /* synthetic */ GeckoHubImp1<Unit> $deferredTossLibInit;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ TossApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TossApplication$ICustomTabsCallbackStub(TossApplication tossApplication, GeckoHubImp1<Unit> geckoHubImp1, TossApplication tossApplication2, access13800<? super TossApplication$ICustomTabsCallbackStub> access13800Var) {
        super(1, access13800Var);
        this.this$0 = tossApplication;
        this.$deferredTossLibInit = geckoHubImp1;
        this.$appContext = tossApplication2;
    }

    public final access13800<Unit> create(access13800<?> access13800Var) {
        int i = 2 % 2;
        TossApplication$ICustomTabsCallbackStub tossApplication$ICustomTabsCallbackStub = new TossApplication$ICustomTabsCallbackStub(this.this$0, this.$deferredTossLibInit, this.$appContext, access13800Var);
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return tossApplication$ICustomTabsCallbackStub;
    }

    public /* synthetic */ Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        access13800<? super Unit> access13800Var = (access13800) obj;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(access13800Var);
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(access13800Var);
        int i3 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        obj2.hashCode();
        throw null;
    }

    public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ GeckoHubImp1 $deferredTossLibInit$inlined;
        final /* synthetic */ getUnhandled $span;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(getUnhandled getunhandled, access13800 access13800Var, GeckoHubImp1 geckoHubImp1) {
            super(2, access13800Var);
            this.$span = getunhandled;
            this.$deferredTossLibInit$inlined = geckoHubImp1;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$span, access13800Var, this.$deferredTossLibInit$inlined);
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 121;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 123;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                getUnhandled getunhandled = this.$span;
                Intrinsics.checkNotNull(getunhandled);
                GeckoHubImp1 geckoHubImp1 = this.$deferredTossLibInit$inlined;
                this.L$0 = access15400.onNavigationEvent(this);
                this.L$1 = access15400.onNavigationEvent(getunhandled);
                this.I$0 = 0;
                this.label = 1;
                if (geckoHubImp1.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: im.toss.TossApplication$ICustomTabsCallbackStub$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<RemoteProcessLogEnvelope, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(access13800Var);
            anonymousClass1.L$0 = obj;
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass1;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((RemoteProcessLogEnvelope) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 20 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(RemoteProcessLogEnvelope remoteProcessLogEnvelope, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(remoteProcessLogEnvelope, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            RemoteProcessLogEnvelope remoteProcessLogEnvelope = (RemoteProcessLogEnvelope) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
                this.L$0 = access15400.onNavigationEvent(remoteProcessLogEnvelope);
                this.label = 1;
                if (getFeatureExtension.onExtraCallback(remoteProcessLogEnvelope, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: im.toss.TossApplication$ICustomTabsCallbackStub$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<GetInputImageFromPathAsGrayScale> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        AnonymousClass2(Object obj) {
            super(0, obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScaleOnExtraCallback = onExtraCallback();
            if (i3 != 0) {
                int i4 = 20 / 0;
            }
            return getInputImageFromPathAsGrayScaleOnExtraCallback;
        }

        public final GetInputImageFromPathAsGrayScale onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScale = (GetInputImageFromPathAsGrayScale) ((Lazy) ((CallableReference) this).receiver).get();
            int i4 = onNavigationEvent + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getInputImageFromPathAsGrayScale;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010b, code lost:
    
        if (r0.IAuthTabCallback(r21) == r3) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [o.getUnhandled] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, o.getErrorTypesbugsnag_android_core_release, o.getUnhandled] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? IAuthTabCallback2;
        getUnhandled getunhandled;
        String message;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        try {
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                setUserImplbugsnag_android_core_release setuserimplbugsnag_android_core_releaseIAuthTabCallback = ((getTextProgressSize) this.this$0.updateVisuals().get()).IAuthTabCallback("TracedParallelLoad");
                if (setuserimplbugsnag_android_core_releaseIAuthTabCallback != null) {
                    getUnhandled getunhandledOnExtraCallbackWithResult = getUnhandled.onExtraCallbackWithResult();
                    Intrinsics.checkNotNullExpressionValue(getunhandledOnExtraCallbackWithResult, "");
                    GeckoHubImp1<Unit> geckoHubImp1 = this.$deferredTossLibInit;
                    trimMetadataStringsTo trimmetadatastringstoIAuthTabCallback = trimMetadataStringsTo.onExtraCallback().IAuthTabCallback(getunhandledOnExtraCallbackWithResult);
                    IAuthTabCallback2 = setuserimplbugsnag_android_core_releaseIAuthTabCallback.onNavigationEvent("deferredTossLibInit.await").onExtraCallback(trimmetadatastringstoIAuthTabCallback).IAuthTabCallback();
                    trimMetadataStringsTo trimmetadatastringstoIAuthTabCallback2 = trimmetadatastringstoIAuthTabCallback.IAuthTabCallback((getErrorTypesbugsnag_android_core_release) IAuthTabCallback2);
                    try {
                        Intrinsics.checkNotNull(trimmetadatastringstoIAuthTabCallback2);
                        CoroutineContext coroutineContextIAuthTabCallback = RootDetectorCompanion.IAuthTabCallback(trimmetadatastringstoIAuthTabCallback2);
                        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(IAuthTabCallback2, null, geckoHubImp1);
                        this.L$0 = access15400.onNavigationEvent(setuserimplbugsnag_android_core_releaseIAuthTabCallback);
                        this.L$1 = access15400.onNavigationEvent(setuserimplbugsnag_android_core_releaseIAuthTabCallback);
                        this.L$2 = access15400.onNavigationEvent("deferredTossLibInit.await");
                        this.L$3 = access15400.onNavigationEvent(getunhandledOnExtraCallbackWithResult);
                        this.L$4 = access15400.onNavigationEvent(trimmetadatastringstoIAuthTabCallback);
                        this.L$5 = IAuthTabCallback2;
                        this.L$6 = access15400.onNavigationEvent(trimmetadatastringstoIAuthTabCallback2);
                        this.I$0 = 0;
                        this.label = 1;
                        if (maybeUpdateAnimatable.onExtraCallback(coroutineContextIAuthTabCallback, onextracallbackwithresult, this) != objOnWarmupCompleted) {
                            getunhandled = IAuthTabCallback2;
                            getunhandled.onWarmupCompleted(normalizeStackframeErrorTypesbugsnag_android_core_release.OK);
                            getunhandled.onWarmupCompleted();
                        }
                    } catch (Exception e) {
                        e = e;
                        getunhandled = IAuthTabCallback2;
                        normalizeStackframeErrorTypesbugsnag_android_core_release normalizestackframeerrortypesbugsnag_android_core_release = normalizeStackframeErrorTypesbugsnag_android_core_release.ERROR;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        getunhandled.onWarmupCompleted(normalizestackframeerrortypesbugsnag_android_core_release, message);
                        getunhandled.onExtraCallback(e);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        IAuthTabCallback2.onWarmupCompleted();
                        throw th;
                    }
                } else {
                    GeckoHubImp1<Unit> geckoHubImp12 = this.$deferredTossLibInit;
                    this.L$0 = access15400.onNavigationEvent(setuserimplbugsnag_android_core_releaseIAuthTabCallback);
                    this.label = 2;
                }
                return objOnWarmupCompleted;
            }
            int i4 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (i3 == 1) {
                getunhandled = (getUnhandled) this.L$5;
                try {
                    ResultKt.onNavigationEvent(obj);
                    getunhandled.onWarmupCompleted(normalizeStackframeErrorTypesbugsnag_android_core_release.OK);
                    getunhandled.onWarmupCompleted();
                } catch (Exception e2) {
                    e = e2;
                    normalizeStackframeErrorTypesbugsnag_android_core_release normalizestackframeerrortypesbugsnag_android_core_release2 = normalizeStackframeErrorTypesbugsnag_android_core_release.ERROR;
                    message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    getunhandled.onWarmupCompleted(normalizestackframeerrortypesbugsnag_android_core_release2, message);
                    getunhandled.onExtraCallback(e);
                    throw e;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Set setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"securities-logs", "bank-logs"});
            Object obj2 = this.this$0.onActivityResized().get();
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            TossApplication tossApplication = this.this$0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj2).entrySet()) {
                if (setOnExtraCallback.contains(((ComputeDistances) entry.getValue()).onExtraCallback())) {
                    int i6 = IAuthTabCallback + 57;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    if (!tossApplication.extraCallback().AudioAttributesImplApi21Parcelizer()) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            TossApplication tossApplication2 = this.$appContext;
            Object obj3 = this.this$0.access200().get();
            Intrinsics.checkNotNullExpressionValue(obj3, "");
            RetrofitService retrofitService = (RetrofitService) obj3;
            Object obj4 = this.this$0.ICustomTabsCallbackStubProxy().get();
            Intrinsics.checkNotNullExpressionValue(obj4, "");
            GetFeatureExtension.onNavigationEvent(getFeatureExtension, tossApplication2, (String) null, retrofitService, (DetectFaceInSingleImage) obj4, linkedHashMap, 0, (File) null, new RemoteProcessLogDrainCoordinator(RemoteProcessLogIngressStore.Companion.onWarmupCompleted(this.$appContext), new AnonymousClass1(null)), (ExtractFeature) null, (FeatureExtension) null, 866, (Object) null);
            getFeatureExtension.IAuthTabCallback(new AnonymousClass2(this.this$0.onActivityLayout()));
            TossApplication.writeTypedObject(this.this$0);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            IAuthTabCallback2 = objOnWarmupCompleted;
        }
    }
}
