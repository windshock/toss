package o;

import im.toss.components.tuba.variable.v2.spec.DefaultVar;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1qSDK1 implements AFe1qSDK {
    private static int asBinder = 1;
    private static int onTransact;
    private final addAnimatorPauseListener IAuthTabCallback;
    private boolean onExtraCallback;
    private final jni_YGNodeStyleGetFlexBasisJNI onExtraCallbackWithResult;
    private final AFe1vSDKAFa1tSDK onNavigationEvent;
    private final addLottieOnCompositionLoadedListener onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AFe1qSDK1.this.IAuthTabCallback(false, this);
        }
    }

    @Inject
    public AFe1qSDK1(@NotNull AFe1vSDKAFa1tSDK aFe1vSDKAFa1tSDK, @NotNull addLottieOnCompositionLoadedListener addlottieoncompositionloadedlistener, @NotNull addAnimatorPauseListener addanimatorpauselistener) {
        Intrinsics.checkNotNullParameter(aFe1vSDKAFa1tSDK, "");
        Intrinsics.checkNotNullParameter(addlottieoncompositionloadedlistener, "");
        Intrinsics.checkNotNullParameter(addanimatorpauselistener, "");
        this.onNavigationEvent = aFe1vSDKAFa1tSDK;
        this.onWarmupCompleted = addlottieoncompositionloadedlistener;
        this.IAuthTabCallback = addanimatorpauselistener;
        this.onExtraCallbackWithResult = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, null);
    }

    public static final /* synthetic */ addLottieOnCompositionLoadedListener onExtraCallback(AFe1qSDK1 aFe1qSDK1) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        addLottieOnCompositionLoadedListener addlottieoncompositionloadedlistener = aFe1qSDK1.onWarmupCompleted;
        int i5 = i2 + 49;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return addlottieoncompositionloadedlistener;
    }

    public static final /* synthetic */ AFe1vSDKAFa1tSDK onExtraCallbackWithResult(AFe1qSDK1 aFe1qSDK1) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        AFe1vSDKAFa1tSDK aFe1vSDKAFa1tSDK = aFe1qSDK1.onNavigationEvent;
        int i5 = i2 + 27;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return aFe1vSDKAFa1tSDK;
    }

    public static final /* synthetic */ addAnimatorPauseListener onNavigationEvent(AFe1qSDK1 aFe1qSDK1) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        addAnimatorPauseListener addanimatorpauselistener = aFe1qSDK1.IAuthTabCallback;
        int i5 = i3 + 105;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return addanimatorpauselistener;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(AFe1qSDK1 aFe1qSDK1) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 51;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean z = aFe1qSDK1.onExtraCallback;
        int i5 = i2 + 55;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // o.AFe1qSDK
    public <T> Object IAuthTabCallback(@NotNull getAdvertisingId.IAuthTabCallback iAuthTabCallback, @NotNull Class<T> cls, @Nullable T t, @NotNull access13800<? super T> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onWarmupCompleted(iAuthTabCallback, t, cls, null), access13800Var);
        int i2 = asBinder + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onWarmupCompleted<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ T $defaultValue;
        final /* synthetic */ getAdvertisingId.IAuthTabCallback $key;
        final /* synthetic */ Class<T> $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(getAdvertisingId.IAuthTabCallback iAuthTabCallback, T t, Class<T> cls, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$key = iAuthTabCallback;
            this.$defaultValue = t;
            this.$type = cls;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = AFe1qSDK1.this.new onWarmupCompleted(this.$key, this.$defaultValue, this.$type, access13800Var);
            int i2 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super T> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg2, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg2, access13800Var);
            int i3 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 57 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onwarmupcompleted.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            if (r13 == r1) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v14 */
        /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r13v20 */
        /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r13v35 */
        /* JADX WARN: Type inference failed for: r13v36 */
        /* JADX WARN: Type inference failed for: r13v37 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!AFe1qSDK1.onWarmupCompleted(AFe1qSDK1.this)) {
                    AFe1qSDK1 aFe1qSDK1 = AFe1qSDK1.this;
                    this.label = 1;
                    if (aFe1qSDK1.IAuthTabCallback(false, this) != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    String str = (String) obj;
                    ?? OnExtraCallback = str;
                    if (AFe1qSDK1.onExtraCallback(AFe1qSDK1.this).onWarmupCompleted()) {
                        OnExtraCallback = str;
                        if (AFe1qSDK1.onNavigationEvent(AFe1qSDK1.this).onExtraCallback(this.$key.getKey())) {
                            int i3 = onWarmupCompleted + 97;
                            onExtraCallbackWithResult = i3 % 128;
                            int i4 = i3 % 2;
                            OnExtraCallback = AFe1qSDK1.onNavigationEvent(AFe1qSDK1.this).onNavigationEvent(this.$key.getKey());
                        }
                    }
                    if (OnExtraCallback != 0) {
                        Class<T> cls = this.$type;
                        T t = this.$defaultValue;
                        getAdvertisingId.IAuthTabCallback iAuthTabCallback = this.$key;
                        try {
                            if (!Intrinsics.areEqual(cls, String.class)) {
                                if (Intrinsics.areEqual(cls, Integer.class)) {
                                    OnExtraCallback = access14000.onNavigationEvent(Integer.parseInt(OnExtraCallback));
                                } else if (Intrinsics.areEqual(cls, Long.class)) {
                                    OnExtraCallback = access14000.onExtraCallback(Long.parseLong(OnExtraCallback));
                                } else if (Intrinsics.areEqual(cls, Double.class)) {
                                    int i5 = onExtraCallbackWithResult + 111;
                                    onWarmupCompleted = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        OnExtraCallback = access14000.onNavigationEvent(Double.parseDouble(OnExtraCallback));
                                        int i6 = 96 / 0;
                                    } else {
                                        OnExtraCallback = access14000.onNavigationEvent(Double.parseDouble(OnExtraCallback));
                                    }
                                } else if (Intrinsics.areEqual(cls, Boolean.class)) {
                                    OnExtraCallback = access14000.onNavigationEvent(Boolean.parseBoolean(OnExtraCallback));
                                } else {
                                    int i7 = onWarmupCompleted + 67;
                                    onExtraCallbackWithResult = i7 % 128;
                                    int i8 = i7 % 2;
                                    OnExtraCallback = t;
                                }
                            }
                        } catch (Exception e) {
                            auth.onExtraCallback(auth.onNavigationEvent, "VarsV2", "Failed to parse variable for key : " + iAuthTabCallback + ", return defaultValue : " + t + ", " + e.getMessage(), (Map) null, 4, (Object) null);
                            OnExtraCallback = t;
                        }
                        if (OnExtraCallback != 0) {
                            return OnExtraCallback;
                        }
                    }
                    return this.$defaultValue;
                }
                ResultKt.onNavigationEvent(obj);
            }
            AFe1vSDKAFa1tSDK aFe1vSDKAFa1tSDKOnExtraCallbackWithResult = AFe1qSDK1.onExtraCallbackWithResult(AFe1qSDK1.this);
            getAdvertisingId.IAuthTabCallback iAuthTabCallback2 = this.$key;
            this.label = 2;
            obj = aFe1vSDKAFa1tSDKOnExtraCallbackWithResult.onNavigationEvent(iAuthTabCallback2, this);
        }
    }

    @Override // o.AFe1qSDK
    public Object onNavigationEvent(@NotNull getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr, @NotNull access13800<? super Map<String, String>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onNavigationEvent(iAuthTabCallbackArr, null), access13800Var);
        int i2 = onTransact + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends String>>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getAdvertisingId.IAuthTabCallback[] $keys;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$keys = iAuthTabCallbackArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = AFe1qSDK1.this.new onNavigationEvent(this.$keys, access13800Var);
            int i2 = IAuthTabCallback + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Map<String, ? extends String>> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            int i5 = IAuthTabCallback + 125;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Map<String, String>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            if (r8 == r1) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!AFe1qSDK1.onWarmupCompleted(AFe1qSDK1.this)) {
                    int i3 = IAuthTabCallback + 35;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    AFe1qSDK1 aFe1qSDK1 = AFe1qSDK1.this;
                    this.label = 1;
                    if (aFe1qSDK1.IAuthTabCallback(false, this) != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onWarmupCompleted + 57;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    Map map = (Map) obj;
                    if (!AFe1qSDK1.onExtraCallback(AFe1qSDK1.this).onWarmupCompleted()) {
                        return map;
                    }
                    AFe1qSDK1 aFe1qSDK12 = AFe1qSDK1.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(access8200.onNavigationEvent(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        String strOnNavigationEvent = AFe1qSDK1.onNavigationEvent(aFe1qSDK12).onNavigationEvent((String) entry.getKey());
                        if (strOnNavigationEvent == null) {
                            strOnNavigationEvent = (String) entry.getValue();
                            int i7 = IAuthTabCallback + 73;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        linkedHashMap.put(key, strOnNavigationEvent);
                    }
                    return linkedHashMap;
                }
                ResultKt.onNavigationEvent(obj);
            }
            AFe1vSDKAFa1tSDK aFe1vSDKAFa1tSDKOnExtraCallbackWithResult = AFe1qSDK1.onExtraCallbackWithResult(AFe1qSDK1.this);
            getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr = this.$keys;
            getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr2 = (getAdvertisingId.IAuthTabCallback[]) Arrays.copyOf(iAuthTabCallbackArr, iAuthTabCallbackArr.length);
            this.label = 2;
            obj = aFe1vSDKAFa1tSDKOnExtraCallbackWithResult.onExtraCallbackWithResult(iAuthTabCallbackArr2, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // o.AFe1qSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(boolean z, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        boolean z2;
        int i2 = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i3 = onextracallbackwithresult.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = onTransact + 39;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    onextracallbackwithresult.label = i3 >>> Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i3 - 2147483648;
                }
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = onextracallbackwithresult.label;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            th = th;
            jni_ygnodestylegetflexbasisjni = z;
        }
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                jni_ygnodestylegetflexbasisjni = this.onExtraCallbackWithResult;
                onextracallbackwithresult.L$0 = jni_ygnodestylegetflexbasisjni;
                onextracallbackwithresult.Z$0 = z;
                onextracallbackwithresult.I$0 = 0;
                onextracallbackwithresult.label = 1;
                if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback(null, onextracallbackwithresult) != objOnExtraCallback) {
                    int i6 = asBinder + 33;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    i = 0;
                    z2 = z;
                }
                return objOnExtraCallback;
            }
            int i8 = asBinder + 35;
            int i9 = i8 % 128;
            onTransact = i9;
            if (i8 % 2 == 0 ? i5 != 1 : i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = i9 + 125;
                asBinder = i10 % 128;
                if (i10 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) onextracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(obj);
                this.onExtraCallback = true;
                Unit unit = Unit.INSTANCE;
                jni_ygnodestylegetflexbasisjni2.onWarmupCompleted(null);
                return unit;
            }
            int i11 = onextracallbackwithresult.I$0;
            boolean z3 = onextracallbackwithresult.Z$0;
            jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) onextracallbackwithresult.L$0;
            ResultKt.onNavigationEvent(obj);
            i = i11;
            z2 = z3;
            if (this.onExtraCallback) {
                int i12 = asBinder + 87;
                onTransact = i12 % 128;
                int i13 = i12 % 2;
                if (!z2) {
                    jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
                    Unit unit2 = Unit.INSTANCE;
                    jni_ygnodestylegetflexbasisjni2.onWarmupCompleted(null);
                    return unit2;
                }
            }
            AFe1vSDKAFa1tSDK aFe1vSDKAFa1tSDK = this.onNavigationEvent;
            onextracallbackwithresult.L$0 = jni_ygnodestylegetflexbasisjni;
            onextracallbackwithresult.Z$0 = z2;
            onextracallbackwithresult.I$0 = i;
            onextracallbackwithresult.I$1 = 0;
            onextracallbackwithresult.label = 2;
            if (aFe1vSDKAFa1tSDK.onExtraCallbackWithResult(onextracallbackwithresult) != objOnExtraCallback) {
                jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
                this.onExtraCallback = true;
                Unit unit22 = Unit.INSTANCE;
                jni_ygnodestylegetflexbasisjni2.onWarmupCompleted(null);
                return unit22;
            }
            return objOnExtraCallback;
        } catch (Throwable th2) {
            th = th2;
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted(null);
            throw th;
        }
    }

    @Override // o.AFe1qSDK
    public List<Pair<String, String>> onExtraCallbackWithResult() {
        int i = 2 % 2;
        List<DefaultVar> listOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnExtraCallbackWithResult, 10));
        for (DefaultVar defaultVar : listOnExtraCallbackWithResult) {
            String strOnExtraCallbackWithResult = defaultVar.onExtraCallbackWithResult();
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            arrayList.add(getWrite.IAuthTabCallback(strOnExtraCallbackWithResult, (String) DefaultVar.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar}, 1280857246, -1280857245, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback)));
            int i2 = asBinder + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = asBinder + 15;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
