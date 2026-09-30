package o;

import im.toss.components.tuba.variable.v2.spec.DefaultVar;
import im.toss.components.tuba.variable.v2.spec.VarsResult;
import im.toss.tosssecurities.network.data.SecuritiesApiErrorResponse;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import im.toss.tosssecurities.network.domain.SecuritiesApiError;
import im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import o.AFe1qSDK3;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1qSDK3 implements AFe1vSDKAFa1uSDK {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final TubaVariableService IAuthTabCallback;
    private final AFe1oSDK onExtraCallbackWithResult;
    private final decodeIpv6 onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
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
            AFe1qSDK3 aFe1qSDK3 = AFe1qSDK3.this;
            if (i3 != 0) {
                return aFe1qSDK3.IAuthTabCallback(null, this);
            }
            aFe1qSDK3.IAuthTabCallback(null, this);
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = AFe1qSDK3.this.onExtraCallbackWithResult(this);
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    @Inject
    public AFe1qSDK3(@NotNull TubaVariableService tubaVariableService, @NotNull AFe1oSDK aFe1oSDK, @NotNull decodeIpv6 decodeipv6) {
        Intrinsics.checkNotNullParameter(tubaVariableService, "");
        Intrinsics.checkNotNullParameter(aFe1oSDK, "");
        Intrinsics.checkNotNullParameter(decodeipv6, "");
        this.IAuthTabCallback = tubaVariableService;
        this.onExtraCallbackWithResult = aFe1oSDK;
        this.onWarmupCompleted = decodeipv6;
    }

    public static final /* synthetic */ TubaVariableService IAuthTabCallback(AFe1qSDK3 aFe1qSDK3) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TubaVariableService tubaVariableService = aFe1qSDK3.IAuthTabCallback;
        int i5 = i2 + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return tubaVariableService;
    }

    public static final /* synthetic */ AFe1oSDK onExtraCallbackWithResult(AFe1qSDK3 aFe1qSDK3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        AFe1oSDK aFe1oSDK = aFe1qSDK3.onExtraCallbackWithResult;
        int i5 = i3 + 99;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return aFe1oSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // o.AFe1vSDKAFa1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull access13800<? super List<DefaultVar>> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        Object objM31constructorimpl;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            int i2 = onNavigationEvent + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onExtraCallback + 125;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    onextracallbackwithresult.label = i4 % Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i4 - 2147483648;
                }
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnNavigationEvent = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i6 = onextracallbackwithresult.label;
        Object obj = null;
        try {
            if (i6 == 0) {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                Result.Companion companion = Result.Companion;
                AFe1oSDK aFe1oSDKOnExtraCallbackWithResult = onExtraCallbackWithResult(this);
                onextracallbackwithresult.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                onextracallbackwithresult.I$0 = 0;
                onextracallbackwithresult.I$1 = 0;
                onextracallbackwithresult.label = 1;
                objOnNavigationEvent = aFe1oSDKOnExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult);
                if (objOnNavigationEvent == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = onExtraCallback + 125;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    obj.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(objOnNavigationEvent);
            }
            objM31constructorimpl = Result.m31constructorimpl(objOnNavigationEvent);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
        if (!Result.onExtraCallback(objM31constructorimpl)) {
            return objM31constructorimpl;
        }
        int i8 = onExtraCallback + 45;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.util.ArrayList, java.util.Collection] */
    @Override // o.AFe1vSDKAFa1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(@NotNull getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr, @NotNull access13800<? super AFe1vSDK> access13800Var) {
        onExtraCallback onextracallback;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        int i;
        Object objOnExtraCallbackWithResult;
        getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr2 = iAuthTabCallbackArr;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if (!(access13800Var instanceof onExtraCallback)) {
            onextracallback = new onExtraCallback(access13800Var);
        } else {
            int i6 = i3 + 47;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            onextracallback = (onExtraCallback) access13800Var;
            int i8 = onextracallback.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i8 - 2147483648;
            }
        }
        Object obj = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i9 = onextracallback.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(obj);
            objectRef = new Ref.ObjectRef();
            ArrayList arrayList = new ArrayList();
            for (getAdvertisingId.IAuthTabCallback iAuthTabCallback : iAuthTabCallbackArr2) {
                int i10 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                if (iAuthTabCallback.getTargetKey() == getAdvertisingId.onExtraCallback.DEVICE_ID_AND_GA) {
                    arrayList.add(iAuthTabCallback);
                }
            }
            ?? arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((getAdvertisingId.IAuthTabCallback) it.next()).getKey());
                int i12 = onExtraCallback + 21;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 4 % 5;
                }
            }
            objectRef.element = arrayList2;
            objectRef2 = new Ref.ObjectRef();
            ArrayList arrayList3 = new ArrayList();
            for (getAdvertisingId.IAuthTabCallback iAuthTabCallback2 : iAuthTabCallbackArr2) {
                if (iAuthTabCallback2.getTargetKey() == getAdvertisingId.onExtraCallback.DEVICE_ID_ONLY) {
                    arrayList3.add(iAuthTabCallback2);
                }
            }
            ?? arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                int i14 = onExtraCallback + 19;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 != 0) {
                    arrayList4.add(((getAdvertisingId.IAuthTabCallback) it2.next()).getKey());
                    int i15 = 56 / 0;
                } else {
                    arrayList4.add(((getAdvertisingId.IAuthTabCallback) it2.next()).getKey());
                }
            }
            objectRef2.element = arrayList4;
            if (((Collection) objectRef.element).isEmpty()) {
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(objectRef, this, objectRef2, null);
                onextracallback.L$0 = access15400.onNavigationEvent(iAuthTabCallbackArr2);
                onextracallback.L$1 = access15400.onNavigationEvent(objectRef);
                onextracallback.L$2 = access15400.onNavigationEvent(objectRef2);
                onextracallback.label = 2;
                objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(onwarmupcompleted, onextracallback);
                if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                    return objOnExtraCallbackWithResult;
                }
            } else {
                decodeIpv6 decodeipv6 = this.onWarmupCompleted;
                onextracallback.L$0 = access15400.onNavigationEvent(iAuthTabCallbackArr);
                onextracallback.L$1 = objectRef;
                onextracallback.L$2 = objectRef2;
                onextracallback.label = 1;
                Object objOnNavigationEvent = decodeipv6.onNavigationEvent(onextracallback);
                if (objOnNavigationEvent != objOnExtraCallback) {
                    objectRef3 = objectRef;
                    obj = objOnNavigationEvent;
                }
            }
            i = onExtraCallback + 15;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i16 = 32 / 0;
            }
            return objOnExtraCallback;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i17 = onExtraCallback + 71;
            onNavigationEvent = i17 % 128;
            if (i17 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            int i18 = 34 / 0;
            return obj;
        }
        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) onextracallback.L$2;
        objectRef3 = (Ref.ObjectRef) onextracallback.L$1;
        getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr3 = (getAdvertisingId.IAuthTabCallback[]) onextracallback.L$0;
        ResultKt.onNavigationEvent(obj);
        objectRef2 = objectRef4;
        iAuthTabCallbackArr2 = iAuthTabCallbackArr3;
        if (!((Boolean) obj).booleanValue()) {
            objectRef2.element = CollectionsKt___CollectionsKt.plus((Collection) objectRef2.element, (Iterable) objectRef3.element);
            objectRef3.element = CollectionsKt__CollectionsKt.emptyList();
        }
        objectRef = objectRef3;
        onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted(objectRef, this, objectRef2, null);
        onextracallback.L$0 = access15400.onNavigationEvent(iAuthTabCallbackArr2);
        onextracallback.L$1 = access15400.onNavigationEvent(objectRef);
        onextracallback.L$2 = access15400.onNavigationEvent(objectRef2);
        onextracallback.label = 2;
        objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(onwarmupcompleted2, onextracallback);
        if (objOnExtraCallbackWithResult != objOnExtraCallback) {
        }
        i = onExtraCallback + 15;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
        }
        return objOnExtraCallback;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super AFe1vSDK>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Ref.ObjectRef<List<String>> $guestKeys;
        final /* synthetic */ Ref.ObjectRef<List<String>> $memberKeys;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ AFe1qSDK3 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Ref.ObjectRef<List<String>> objectRef, AFe1qSDK3 aFe1qSDK3, Ref.ObjectRef<List<String>> objectRef2, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$memberKeys = objectRef;
            this.this$0 = aFe1qSDK3;
            this.$guestKeys = objectRef2;
        }

        public static /* synthetic */ Iterable onExtraCallback(VarsResult varsResult) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Iterable iterableOnNavigationEvent = onNavigationEvent(varsResult);
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return iterableOnNavigationEvent;
        }

        public static /* synthetic */ VarsResult onExtraCallbackWithResult(Result result) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback(result);
            }
            onExtraCallback(result);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$memberKeys, this.this$0, this.$guestKeys, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 13 / 0;
            }
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super AFe1vSDK> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onExtraCallbackWithResult + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super AFe1vSDK> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onwarmupcompleted.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
            }
            return objInvokeSuspend;
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends VarsResult>>, Object> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ Ref.ObjectRef<List<String>> $memberKeys;
            int I$0;
            int label;
            final /* synthetic */ AFe1qSDK3 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(Ref.ObjectRef<List<String>> objectRef, AFe1qSDK3 aFe1qSDK3, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.$memberKeys = objectRef;
                this.this$0 = aFe1qSDK3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(this.$memberKeys, this.this$0, access13800Var);
                int i2 = onExtraCallback + 115;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return onnavigationevent;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends VarsResult>> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                onExtraCallback = i2 % 128;
                findResAndMsg findresandmsg2 = findresandmsg;
                access13800<? super Result<? extends VarsResult>> access13800Var2 = access13800Var;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(findresandmsg2, access13800Var2);
                }
                onWarmupCompleted(findresandmsg2, access13800Var2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Result<VarsResult>> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 1;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 89 / 0;
                }
                return objInvokeSuspend;
            }

            public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends VarsResult>>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                final /* synthetic */ Ref.ObjectRef $memberKeys$inlined;
                int I$0;
                int I$1;
                int I$2;
                Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ AFe1qSDK3 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public onExtraCallbackWithResult(access13800 access13800Var, AFe1qSDK3 aFe1qSDK3, Ref.ObjectRef objectRef) {
                    super(2, access13800Var);
                    this.this$0 = aFe1qSDK3;
                    this.$memberKeys$inlined = objectRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.this$0, this.$memberKeys$inlined);
                    int i2 = onExtraCallbackWithResult + 85;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return onextracallbackwithresult;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends VarsResult>> access13800Var) throws Exception {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 29;
                    onExtraCallbackWithResult = i2 % 128;
                    findResAndMsg findresandmsg2 = findresandmsg;
                    access13800<? super Result<? extends VarsResult>> access13800Var2 = access13800Var;
                    if (i2 % 2 != 0) {
                        return onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                    }
                    onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                    throw null;
                }

                public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Result<? extends VarsResult>> access13800Var) throws Exception {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 57;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                    int i4 = IAuthTabCallback + 5;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Exception {
                    Object objM31constructorimpl;
                    SecuritiesApiError securitiesApiErrorOnWarmupCompleted;
                    VarsResult varsResult;
                    Object objOnExtraCallbackWithResult;
                    int i = 2 % 2;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i2 = this.label;
                    Object obj2 = null;
                    try {
                        if (i2 != 0) {
                            int i3 = onExtraCallbackWithResult;
                            int i4 = i3 + 69;
                            IAuthTabCallback = i4 % 128;
                            int i5 = i4 % 2;
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i6 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
                            IAuthTabCallback = i6 % 128;
                            int i7 = i6 % 2;
                            ResultKt.onNavigationEvent(obj);
                        } else {
                            ResultKt.onNavigationEvent(obj);
                            Result.Companion companion = Result.Companion;
                            TubaVariableService tubaVariableServiceIAuthTabCallback = AFe1qSDK3.IAuthTabCallback(this.this$0);
                            TubaVariableService.RequestParams requestParams = new TubaVariableService.RequestParams((String[]) ((Collection) this.$memberKeys$inlined.element).toArray(new String[0]));
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.I$2 = 0;
                            this.label = 1;
                            obj = tubaVariableServiceIAuthTabCallback.IAuthTabCallback(requestParams, this);
                            if (obj == objOnExtraCallback) {
                                int i8 = IAuthTabCallback + 27;
                                onExtraCallbackWithResult = i8 % 128;
                                int i9 = i8 % 2;
                                return objOnExtraCallback;
                            }
                        }
                        try {
                            objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                        } catch (NullPointerException e) {
                            if (!Intrinsics.areEqual(VarsResult.class, Object.class)) {
                                int i10 = IAuthTabCallback + 77;
                                onExtraCallbackWithResult = i10 % 128;
                                if (i10 % 2 == 0) {
                                    Intrinsics.areEqual(VarsResult.class, Unit.class);
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (!Intrinsics.areEqual(VarsResult.class, Unit.class)) {
                                    throw e;
                                }
                                int i11 = onExtraCallbackWithResult + 93;
                                IAuthTabCallback = i11 % 128;
                                int i12 = i11 % 2;
                            }
                            varsResult = Unit.INSTANCE;
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
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.components.tuba.variable.v2.spec.VarsResult");
                    }
                    varsResult = (VarsResult) objOnExtraCallbackWithResult;
                    objM31constructorimpl = Result.m31constructorimpl(varsResult);
                    Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                    if (thM32exceptionOrNullimpl != null) {
                        int i13 = IAuthTabCallback + 97;
                        onExtraCallbackWithResult = i13 % 128;
                        try {
                            if (i13 % 2 == 0) {
                                Result.Companion companion4 = Result.Companion;
                                boolean z = thM32exceptionOrNullimpl instanceof retrofit2.HttpException;
                                obj2.hashCode();
                                throw null;
                            }
                            Result.Companion companion5 = Result.Companion;
                            if (!(thM32exceptionOrNullimpl instanceof retrofit2.HttpException) || (securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted((retrofit2.HttpException) thM32exceptionOrNullimpl)) == null) {
                                throw thM32exceptionOrNullimpl;
                            }
                            int i14 = IAuthTabCallback + 5;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            throw securitiesApiErrorOnWarmupCompleted;
                        } catch (Throwable th) {
                            Result.Companion companion6 = Result.Companion;
                            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                    return Result.IAuthTabCallback(objM31constructorimpl);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 69;
                onNavigationEvent = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 != 0) {
                    access14100.onExtraCallback();
                    obj2.hashCode();
                    throw null;
                }
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (this.$memberKeys.element.isEmpty()) {
                        int i4 = onExtraCallback + 53;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            return null;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                    AFe1qSDK3 aFe1qSDK3 = this.this$0;
                    Ref.ObjectRef<List<String>> objectRef = this.$memberKeys;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, aFe1qSDK3, objectRef);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onExtraCallback + 11;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                }
                return Result.IAuthTabCallback(((Result) obj).onNavigationEvent());
            }
        }

        /* renamed from: o.AFe1qSDK3$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        static final class C0014onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends VarsResult>>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ Ref.ObjectRef<List<String>> $guestKeys;
            int I$0;
            int label;
            final /* synthetic */ AFe1qSDK3 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0014onWarmupCompleted(Ref.ObjectRef<List<String>> objectRef, AFe1qSDK3 aFe1qSDK3, access13800<? super C0014onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.$guestKeys = objectRef;
                this.this$0 = aFe1qSDK3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0014onWarmupCompleted c0014onWarmupCompleted = new C0014onWarmupCompleted(this.$guestKeys, this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 33;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 26 / 0;
                }
                return c0014onWarmupCompleted;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends VarsResult>> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i4 = IAuthTabCallback + 125;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Result<VarsResult>> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((C0014onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: o.AFe1qSDK3$onWarmupCompleted$onWarmupCompleted$onExtraCallbackWithResult */
            public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends VarsResult>>, Object> {
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ Ref.ObjectRef $guestKeys$inlined;
                int I$0;
                int I$1;
                int I$2;
                Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ AFe1qSDK3 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public onExtraCallbackWithResult(access13800 access13800Var, AFe1qSDK3 aFe1qSDK3, Ref.ObjectRef objectRef) {
                    super(2, access13800Var);
                    this.this$0 = aFe1qSDK3;
                    this.$guestKeys$inlined = objectRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.this$0, this.$guestKeys$inlined);
                    int i2 = onExtraCallback + 77;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        return onextracallbackwithresult;
                    }
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends VarsResult>> access13800Var) throws Exception {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 109;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                    int i4 = onExtraCallback + 111;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnExtraCallback;
                }

                public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Result<? extends VarsResult>> access13800Var) throws Exception {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 55;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) create(findresandmsg, access13800Var);
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        return onextracallbackwithresult.invokeSuspend(unit);
                    }
                    onextracallbackwithresult.invokeSuspend(unit);
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Exception {
                    Object objM31constructorimpl;
                    SecuritiesApiError securitiesApiErrorOnWarmupCompleted;
                    VarsResult varsResult;
                    Object objOnExtraCallbackWithResult;
                    int i = 2 % 2;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i2 = this.label;
                    try {
                        if (i2 == 0) {
                            ResultKt.onNavigationEvent(obj);
                            Result.Companion companion = Result.Companion;
                            TubaVariableService tubaVariableServiceIAuthTabCallback = AFe1qSDK3.IAuthTabCallback(this.this$0);
                            TubaVariableService.RequestParams requestParams = new TubaVariableService.RequestParams((String[]) ((Collection) this.$guestKeys$inlined.element).toArray(new String[0]));
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.I$2 = 0;
                            this.label = 1;
                            obj = tubaVariableServiceIAuthTabCallback.onWarmupCompleted(requestParams, this);
                            if (obj == objOnExtraCallback) {
                                return objOnExtraCallback;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj);
                            int i3 = onExtraCallback + 29;
                            onWarmupCompleted = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i4 = 5 / 3;
                            }
                        }
                        try {
                            objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                        } catch (NullPointerException e) {
                            if (!Intrinsics.areEqual(VarsResult.class, Object.class)) {
                                int i5 = onExtraCallback + 81;
                                onWarmupCompleted = i5 % 128;
                                if (i5 % 2 != 0) {
                                    Intrinsics.areEqual(VarsResult.class, Unit.class);
                                    throw null;
                                }
                                if (!Intrinsics.areEqual(VarsResult.class, Unit.class)) {
                                    throw e;
                                }
                            }
                            varsResult = Unit.INSTANCE;
                            int i6 = onExtraCallback + 31;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
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
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.components.tuba.variable.v2.spec.VarsResult");
                    }
                    varsResult = (VarsResult) objOnExtraCallbackWithResult;
                    objM31constructorimpl = Result.m31constructorimpl(varsResult);
                    Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                    if (thM32exceptionOrNullimpl != null) {
                        int i8 = onWarmupCompleted + 21;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        try {
                            Result.Companion companion4 = Result.Companion;
                            if (!(thM32exceptionOrNullimpl instanceof retrofit2.HttpException) || (securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted((retrofit2.HttpException) thM32exceptionOrNullimpl)) == null) {
                                throw thM32exceptionOrNullimpl;
                            }
                            throw securitiesApiErrorOnWarmupCompleted;
                        } catch (Throwable th) {
                            Result.Companion companion5 = Result.Companion;
                            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                    return Result.IAuthTabCallback(objM31constructorimpl);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (this.$guestKeys.element.isEmpty()) {
                        int i3 = onNavigationEvent + 19;
                        IAuthTabCallback = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = 13 / 0;
                        }
                        return null;
                    }
                    AFe1qSDK3 aFe1qSDK3 = this.this$0;
                    Ref.ObjectRef<List<String>> objectRef = this.$guestKeys;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, aFe1qSDK3, objectRef);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                    if (obj == objOnExtraCallback) {
                        int i5 = IAuthTabCallback + 57;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnExtraCallback;
                        }
                        throw null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i6 = IAuthTabCallback + 95;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                }
                return Result.IAuthTabCallback(((Result) obj).onNavigationEvent());
            }
        }

        private static final VarsResult onExtraCallback(Result result) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Result.onExtraCallback(result.onNavigationEvent());
                obj.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = result.onNavigationEvent();
            if (Result.onExtraCallback(objOnNavigationEvent)) {
                int i3 = onExtraCallbackWithResult + 45;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                obj = objOnNavigationEvent;
            }
            return (VarsResult) obj;
        }

        private static final Iterable onNavigationEvent(VarsResult varsResult) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Set<Map.Entry<String, JsonElement>> setEntrySet = varsResult.onNavigationEvent().entrySet();
            int i4 = onExtraCallbackWithResult + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return setEntrySet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0225  */
        /* JADX WARN: Type inference failed for: r8v13, types: [java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            GeckoHubImp1 geckoHubImp1;
            GeckoHubImp1 geckoHubImp12;
            Set setIAuthTabCallback;
            Object objIAuthTabCallback;
            GeckoHubImp1 geckoHubImp13;
            GeckoHubImp1 geckoHubImp14;
            List list;
            Ref.ObjectRef<List<String>> objectRef;
            LinkedHashMap linkedHashMap;
            Set set;
            Ref.ObjectRef<List<String>> objectRef2;
            int i;
            JsonPrimitive jsonPrimitive;
            Map map;
            Ref.ObjectRef<List<String>> objectRef3;
            Object objIAuthTabCallback2;
            Set set2;
            Result result;
            Result result2;
            int i2 = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback2 = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new onNavigationEvent(this.$memberKeys, this.this$0, null), 3, null);
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted2 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new C0014onWarmupCompleted(this.$guestKeys, this.this$0, null), 3, null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = geckoHubImp1OnWarmupCompleted;
                this.L$2 = geckoHubImp1OnWarmupCompleted2;
                this.label = 1;
                objOnExtraCallback = ResourceCallback.onExtraCallback(new GeckoHubImp1[]{geckoHubImp1OnWarmupCompleted, geckoHubImp1OnWarmupCompleted2}, this);
                if (objOnExtraCallback != objOnExtraCallback2) {
                    geckoHubImp1 = geckoHubImp1OnWarmupCompleted2;
                    geckoHubImp12 = geckoHubImp1OnWarmupCompleted;
                }
                int i4 = onExtraCallbackWithResult + 11;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback2;
            }
            int i6 = onExtraCallback;
            int i7 = i6 + 37;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (i3 != 1) {
                int i9 = i6 + 7;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0 ? i3 != 2 : i3 != 5) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set2 = (Set) this.L$7;
                    Set set3 = (Set) this.L$6;
                    objectRef3 = (Ref.ObjectRef) this.L$5;
                    map = (Map) this.L$4;
                    ResultKt.onNavigationEvent(obj);
                    setIAuthTabCallback = set3;
                    objIAuthTabCallback2 = obj;
                    result = (Result) objIAuthTabCallback2;
                    if (result != null) {
                        set2.addAll(objectRef3.element);
                    }
                    return new AFe1vSDK(map, clearFaultAddress.onExtraCallback(setIAuthTabCallback));
                }
                i = this.I$0;
                set = (Set) this.L$8;
                setIAuthTabCallback = (Set) this.L$7;
                objectRef2 = (Ref.ObjectRef) this.L$6;
                Ref.ObjectRef<List<String>> objectRef4 = (Ref.ObjectRef) this.L$5;
                ?? r8 = (Map) this.L$4;
                List list2 = (List) this.L$3;
                GeckoHubImp1 geckoHubImp15 = (GeckoHubImp1) this.L$2;
                GeckoHubImp1 geckoHubImp16 = (GeckoHubImp1) this.L$1;
                ResultKt.onNavigationEvent(obj);
                geckoHubImp13 = geckoHubImp16;
                geckoHubImp14 = geckoHubImp15;
                list = list2;
                objectRef = objectRef4;
                linkedHashMap = r8;
                objIAuthTabCallback = obj;
                result2 = (Result) objIAuthTabCallback;
                if (result2 != null && Result.onNavigationEvent(result2.onNavigationEvent())) {
                    int i10 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    set.addAll(objectRef.element);
                }
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp13);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp14);
                this.L$3 = access15400.onNavigationEvent(list);
                this.L$4 = linkedHashMap;
                this.L$5 = objectRef2;
                this.L$6 = setIAuthTabCallback;
                this.L$7 = set;
                this.L$8 = null;
                this.I$0 = i;
                this.label = 3;
                objIAuthTabCallback2 = geckoHubImp14.IAuthTabCallback(this);
                if (objIAuthTabCallback2 != objOnExtraCallback2) {
                    set2 = set;
                    objectRef3 = objectRef2;
                    map = linkedHashMap;
                    result = (Result) objIAuthTabCallback2;
                    if (result != null && Result.onNavigationEvent(result.onNavigationEvent())) {
                        set2.addAll(objectRef3.element);
                    }
                    return new AFe1vSDK(map, clearFaultAddress.onExtraCallback(setIAuthTabCallback));
                }
                int i42 = onExtraCallbackWithResult + 11;
                onExtraCallback = i42 % 128;
                int i52 = i42 % 2;
                return objOnExtraCallback2;
            }
            GeckoHubImp1 geckoHubImp17 = (GeckoHubImp1) this.L$2;
            GeckoHubImp1 geckoHubImp18 = (GeckoHubImp1) this.L$1;
            ResultKt.onNavigationEvent(obj);
            geckoHubImp1 = geckoHubImp17;
            geckoHubImp12 = geckoHubImp18;
            objOnExtraCallback = obj;
            List list3 = (List) objOnExtraCallback;
            Sequence sequenceAccess000 = ensureCausesIsMutable.access000(ensureCausesIsMutable.extraCallbackWithResult(ensureCausesIsMutable.onActivityResized(CollectionsKt___CollectionsKt.asSequence(list3)), new Function1() { // from class: im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableRemoteDataSourceImpl$getVariables$2$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = IAuthTabCallback + 81;
                    onNavigationEvent = i13 % 128;
                    Result result3 = (Result) obj2;
                    if (i13 % 2 == 0) {
                        return AFe1qSDK3.onWarmupCompleted.onExtraCallbackWithResult(result3);
                    }
                    AFe1qSDK3.onWarmupCompleted.onExtraCallbackWithResult(result3);
                    throw null;
                }
            }), new Function1() { // from class: im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableRemoteDataSourceImpl$getVariables$2$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                    onExtraCallback = i13 % 128;
                    VarsResult varsResult = (VarsResult) obj2;
                    if (i13 % 2 != 0) {
                        return AFe1qSDK3.onWarmupCompleted.onExtraCallback(varsResult);
                    }
                    AFe1qSDK3.onWarmupCompleted.onExtraCallback(varsResult);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator itIAuthTabCallback = sequenceAccess000.IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                Map.Entry entry = (Map.Entry) itIAuthTabCallback.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JsonPrimitive) {
                    jsonPrimitive = (JsonPrimitive) value;
                    int i12 = onExtraCallback + 1;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    jsonPrimitive = null;
                }
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(key, jsonPrimitive != null ? initRenderFinish.onNavigationEvent(jsonPrimitive) : null);
                linkedHashMap2.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (((String) entry2.getValue()) != null) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(access8200.onNavigationEvent(linkedHashMap3.size()));
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                Object key2 = entry3.getKey();
                Object value2 = entry3.getValue();
                Intrinsics.checkNotNull(value2);
                linkedHashMap4.put(key2, (String) value2);
            }
            Ref.ObjectRef<List<String>> objectRef5 = this.$memberKeys;
            Ref.ObjectRef<List<String>> objectRef6 = this.$guestKeys;
            setIAuthTabCallback = clearFaultAddress.IAuthTabCallback();
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(geckoHubImp12);
            this.L$2 = geckoHubImp1;
            this.L$3 = access15400.onNavigationEvent(list3);
            this.L$4 = linkedHashMap4;
            this.L$5 = objectRef5;
            this.L$6 = objectRef6;
            this.L$7 = setIAuthTabCallback;
            this.L$8 = setIAuthTabCallback;
            this.I$0 = 0;
            this.label = 2;
            objIAuthTabCallback = geckoHubImp12.IAuthTabCallback(this);
            if (objIAuthTabCallback != objOnExtraCallback2) {
                geckoHubImp13 = geckoHubImp12;
                geckoHubImp14 = geckoHubImp1;
                list = list3;
                objectRef = objectRef5;
                linkedHashMap = linkedHashMap4;
                set = setIAuthTabCallback;
                objectRef2 = objectRef6;
                i = 0;
                result2 = (Result) objIAuthTabCallback;
                if (result2 != null) {
                    int i102 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i102 % 128;
                    int i112 = i102 % 2;
                    set.addAll(objectRef.element);
                }
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp13);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp14);
                this.L$3 = access15400.onNavigationEvent(list);
                this.L$4 = linkedHashMap;
                this.L$5 = objectRef2;
                this.L$6 = setIAuthTabCallback;
                this.L$7 = set;
                this.L$8 = null;
                this.I$0 = i;
                this.label = 3;
                objIAuthTabCallback2 = geckoHubImp14.IAuthTabCallback(this);
                if (objIAuthTabCallback2 != objOnExtraCallback2) {
                }
            }
            int i422 = onExtraCallbackWithResult + 11;
            onExtraCallback = i422 % 128;
            int i522 = i422 % 2;
            return objOnExtraCallback2;
        }
    }
}
