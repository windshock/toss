package o;

import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.components.tuba.variable.v2.spec.DefaultVar;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFe1rSDK;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1rSDK implements AFe1vSDKAFa1tSDK {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private final AFe1qSDK5 IAuthTabCallbackStub;
    private final AFe1vSDKAFa1uSDK asBinder;
    private final fromRawRes onExtraCallback;
    private List<DefaultVar> onNavigationEvent;
    private final addAnimatorUpdateListener onTransact;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = AFe1rSDK.this.onExtraCallbackWithResult(this);
            int i4 = onNavigationEvent + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            AFe1rSDK aFe1rSDK = AFe1rSDK.this;
            if (i3 == 0) {
                return aFe1rSDK.onNavigationEvent((getAdvertisingId.IAuthTabCallback) null, this);
            }
            aFe1rSDK.onNavigationEvent((getAdvertisingId.IAuthTabCallback) null, this);
            obj2.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            AFe1rSDK aFe1rSDK = AFe1rSDK.this;
            if (i3 == 0) {
                aFe1rSDK.onExtraCallbackWithResult((getAdvertisingId.IAuthTabCallback[]) null, this);
                throw null;
            }
            Object objOnExtraCallbackWithResult = aFe1rSDK.onExtraCallbackWithResult((getAdvertisingId.IAuthTabCallback[]) null, this);
            int i4 = onExtraCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i3 | i2);
        int i12 = (~(i2 | i3)) | (~(i7 | i9)) | i8;
        int i13 = i3 + i5 + i6 + ((-1422066268) * i) + ((-2108786386) * i4);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i3) + 967573504 + (322476998 * i5) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i6) + ((-1298137088) * i) + (1722810368 * i4) + (518782976 * i14);
        int i16 = (i3 * 793895740) + 1353643607 + (i5 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i6 * 793896001) + (i * 692483748) + (i4 * (-1016611666)) + (i14 * 166461440);
        return i15 + ((i16 * i16) * 1997799424) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ boolean IAuthTabCallback(Map map, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = asBinder(map, iAuthTabCallback);
        int i4 = asInterface + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zAsBinder;
    }

    public static /* synthetic */ boolean onExtraCallback(Map map, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(map, iAuthTabCallback);
        int i4 = IAuthTabCallbackDefault + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Map map = (Map) objArr[0];
        getAdvertisingId.IAuthTabCallback iAuthTabCallback = (getAdvertisingId.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(map, iAuthTabCallback);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return Boolean.valueOf(zOnExtraCallbackWithResult);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AFe1rSDK aFe1rSDK = (AFe1rSDK) objArr[0];
        getAdvertisingId.IAuthTabCallback iAuthTabCallback = (getAdvertisingId.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(aFe1rSDK, iAuthTabCallback);
        int i4 = asInterface + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zOnNavigationEvent);
        }
        int i5 = 71 / 0;
        return Boolean.valueOf(zOnNavigationEvent);
    }

    public static /* synthetic */ boolean onWarmupCompleted(Map map, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = asInterface(map, iAuthTabCallback);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 37;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return zAsInterface;
    }

    @Inject
    public AFe1rSDK(@NotNull fromRawRes fromrawres, @NotNull addAnimatorUpdateListener addanimatorupdatelistener, @NotNull AFe1vSDKAFa1uSDK aFe1vSDKAFa1uSDK, @NotNull AFe1qSDK5 aFe1qSDK5) {
        Intrinsics.checkNotNullParameter(fromrawres, "");
        Intrinsics.checkNotNullParameter(addanimatorupdatelistener, "");
        Intrinsics.checkNotNullParameter(aFe1vSDKAFa1uSDK, "");
        Intrinsics.checkNotNullParameter(aFe1qSDK5, "");
        this.onExtraCallback = fromrawres;
        this.onTransact = addanimatorupdatelistener;
        this.asBinder = aFe1vSDKAFa1uSDK;
        this.IAuthTabCallbackStub = aFe1qSDK5;
    }

    public static final /* synthetic */ fromRawRes onNavigationEvent(AFe1rSDK aFe1rSDK) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        fromRawRes fromrawres = aFe1rSDK.onExtraCallback;
        if (i3 != 0) {
            return fromrawres;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ addAnimatorUpdateListener onWarmupCompleted(AFe1rSDK aFe1rSDK) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        addAnimatorUpdateListener addanimatorupdatelistener = aFe1rSDK.onTransact;
        int i5 = i3 + 55;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return addanimatorupdatelistener;
        }
        throw null;
    }

    public /* bridge */ Object onExtraCallback(@NotNull String str, @NotNull access13800<? super setProgressInternal> access13800Var) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = super.onExtraCallback(str, access13800Var);
        int i4 = asInterface + 107;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return objOnExtraCallback;
    }

    public /* bridge */ Object onExtraCallback(@NotNull String[] strArr, @NotNull access13800<? super Map<String, setProgressInternal>> access13800Var) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onExtraCallback(strArr, access13800Var);
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = super.onExtraCallback(strArr, access13800Var);
        int i3 = IAuthTabCallbackDefault + 115;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AFe1vSDKAFa1tSDK
    @Deprecated
    public /* bridge */ Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super String> access13800Var) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = super.onNavigationEvent(str, access13800Var);
        int i4 = IAuthTabCallbackDefault + 13;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    @Override // o.AFe1vSDKAFa1tSDK
    @Deprecated
    public /* bridge */ Object onNavigationEvent(@NotNull String[] strArr, @NotNull access13800<? super Map<String, String>> access13800Var) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = super.onNavigationEvent(strArr, access13800Var);
        int i4 = asInterface + 25;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r3
      0x002b: PHI (r1v12 o.AFe1rSDK$IAuthTabCallback) = (r1v11 o.AFe1rSDK$IAuthTabCallback), (r1v14 o.AFe1rSDK$IAuthTabCallback) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r3v2 int) = (r3v1 int), (r3v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i3 = asInterface + 49;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i = iAuthTabCallback.label;
                int i4 = 86 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i5 = asInterface + 115;
                    IAuthTabCallbackDefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        iAuthTabCallback.label = i % Integer.MIN_VALUE;
                    } else {
                        iAuthTabCallback.label = i - 2147483648;
                    }
                } else {
                    iAuthTabCallback = new IAuthTabCallback(access13800Var);
                }
            } else {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i = iAuthTabCallback.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object objOnExtraCallbackWithResult = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i6 = iAuthTabCallback.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            this.onNavigationEvent = this.onExtraCallback.IAuthTabCallback();
            AFe1vSDKAFa1uSDK aFe1vSDKAFa1uSDK = this.asBinder;
            iAuthTabCallback.label = 1;
            objOnExtraCallbackWithResult = aFe1vSDKAFa1uSDK.onExtraCallbackWithResult(iAuthTabCallback);
            if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            int i7 = IAuthTabCallbackDefault + 73;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
        List<DefaultVar> list = (List) objOnExtraCallbackWithResult;
        if (list != null) {
            this.onNavigationEvent = list;
            this.onExtraCallback.IAuthTabCallback(list);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AFe1vSDKAFa1tSDK
    public List<DefaultVar> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        List<DefaultVar> listEmptyList = this.onNavigationEvent;
        if (listEmptyList == null) {
            int i5 = i3 + 57;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            if (i6 != 0) {
                int i7 = 11 / 0;
            }
        }
        int i8 = asInterface + 77;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return listEmptyList;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super getPackageType>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getAdvertisingId.IAuthTabCallback $key;
        final /* synthetic */ String $this_run;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(getAdvertisingId.IAuthTabCallback iAuthTabCallback, String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$key = iAuthTabCallback;
            this.$this_run = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = AFe1rSDK.this.new onWarmupCompleted(this.$key, this.$this_run, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super getPackageType> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onNavigationEvent + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super getPackageType> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.AFe1rSDK$onWarmupCompleted$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ getAdvertisingId.IAuthTabCallback $key;
            final /* synthetic */ String $this_run;
            int label;
            final /* synthetic */ AFe1rSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(AFe1rSDK aFe1rSDK, getAdvertisingId.IAuthTabCallback iAuthTabCallback, String str, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.this$0 = aFe1rSDK;
                this.$key = iAuthTabCallback;
                this.$this_run = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$key, this.$this_run, access13800Var);
                int i2 = onWarmupCompleted + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 33;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                findResAndMsg findresandmsg2 = findresandmsg;
                access13800<? super Unit> access13800Var2 = access13800Var;
                if (i2 % 2 == 0) {
                    onNavigationEvent(findresandmsg2, access13800Var2);
                    obj.hashCode();
                    throw null;
                }
                Object objOnNavigationEvent = onNavigationEvent(findresandmsg2, access13800Var2);
                int i3 = IAuthTabCallback + 15;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return objOnNavigationEvent;
                }
                throw null;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 89;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 31;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i2 + 57;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                AFe1rSDK.onWarmupCompleted(this.this$0).onNavigationEvent(this.$key.getKey(), this.$this_run);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            onLoadStarted.onExtraCallback(findresandmsg, null, null, new AnonymousClass5(AFe1rSDK.this, this.$key, this.$this_run, null), 3, null);
            getPackageType getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback(findresandmsg, null, null, new AnonymousClass1(AFe1rSDK.this, this.$key, this.$this_run, null), 3, null);
            int i3 = IAuthTabCallback + 13;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 30 / 0;
            }
            return getpackagetypeOnExtraCallback;
        }

        /* renamed from: o.AFe1rSDK$onWarmupCompleted$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ getAdvertisingId.IAuthTabCallback $key;
            final /* synthetic */ String $this_run;
            int label;
            final /* synthetic */ AFe1rSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AFe1rSDK aFe1rSDK, getAdvertisingId.IAuthTabCallback iAuthTabCallback, String str, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = aFe1rSDK;
                this.$key = iAuthTabCallback;
                this.$this_run = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$key, this.$this_run, access13800Var);
                int i2 = onWarmupCompleted + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i4 = onWarmupCompleted + 49;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 119;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 123;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 41;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i6 != 0) {
                    AFe1rSDK.onNavigationEvent(this.this$0).onExtraCallback(this.$key.getKey(), this.$this_run);
                    return Unit.INSTANCE;
                }
                AFe1rSDK.onNavigationEvent(this.this$0).onExtraCallback(this.$key.getKey(), this.$this_run);
                Unit unit = Unit.INSTANCE;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.String] */
    @Override // o.AFe1vSDKAFa1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull getAdvertisingId.IAuthTabCallback iAuthTabCallback, @NotNull access13800<? super String> access13800Var) {
        onExtraCallback onextracallback;
        Ref.ObjectRef objectRef;
        boolean zOnExtraCallback;
        getAdvertisingId.IAuthTabCallback iAuthTabCallback2;
        Iterator it;
        Object next;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i2 = asInterface + 43;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((onExtraCallback) access13800Var).label;
                throw null;
            }
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i4 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objIAuthTabCallback = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = onextracallback.label;
        boolean z = true;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            objectRef = new Ref.ObjectRef();
            List<DefaultVar> list = this.onNavigationEvent;
            if (list != null) {
                int i6 = asInterface + 95;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    it = list.iterator();
                    int i7 = 99 / 0;
                } else {
                    it = list.iterator();
                }
                while (it.hasNext()) {
                    int i8 = IAuthTabCallbackDefault + 41;
                    asInterface = i8 % 128;
                    if (i8 % 2 != 0) {
                        next = it.next();
                        int i9 = 30 / 0;
                        if (Intrinsics.areEqual(((DefaultVar) next).onExtraCallbackWithResult(), iAuthTabCallback.getKey())) {
                            int i10 = IAuthTabCallbackDefault + 41;
                            asInterface = i10 % 128;
                            int i11 = i10 % 2;
                            break;
                        }
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((DefaultVar) next).onExtraCallbackWithResult(), iAuthTabCallback.getKey())) {
                            int i102 = IAuthTabCallbackDefault + 41;
                            asInterface = i102 % 128;
                            int i112 = i102 % 2;
                            break;
                        }
                    }
                }
                next = null;
                DefaultVar defaultVar = (DefaultVar) next;
                if (defaultVar != null) {
                    objectRef.element = (String) DefaultVar.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar}, 1280857246, -1280857245, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
                    if (!defaultVar.onExtraCallback() || iAuthTabCallback.getTargetKey() == getAdvertisingId.onExtraCallback.CDN) {
                        this.onExtraCallback.onExtraCallbackWithResult(iAuthTabCallback.getKey());
                        return objectRef.element;
                    }
                }
            }
            String strOnExtraCallbackWithResult = this.onTransact.onExtraCallbackWithResult(iAuthTabCallback.getKey());
            if (strOnExtraCallbackWithResult != null) {
                return strOnExtraCallbackWithResult;
            }
            zOnExtraCallback = onExtraCallback();
            if (zOnExtraCallback && !(!this.IAuthTabCallbackStub.onExtraCallback(iAuthTabCallback.getKey()))) {
                T t = objectRef.element;
                int i12 = IAuthTabCallbackDefault + 35;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                return t;
            }
            onextracallback.L$0 = iAuthTabCallback;
            onextracallback.L$1 = objectRef;
            onextracallback.Z$0 = zOnExtraCallback;
            onextracallback.label = 1;
            objIAuthTabCallback = this.asBinder.IAuthTabCallback(new getAdvertisingId.IAuthTabCallback[]{iAuthTabCallback}, onextracallback);
            if (objIAuthTabCallback != objOnExtraCallback) {
                iAuthTabCallback2 = iAuthTabCallback;
            }
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = IAuthTabCallbackDefault + 47;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            String str = (String) onextracallback.L$3;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            return str;
        }
        zOnExtraCallback = onextracallback.Z$0;
        objectRef = (Ref.ObjectRef) onextracallback.L$1;
        iAuthTabCallback2 = (getAdvertisingId.IAuthTabCallback) onextracallback.L$0;
        ResultKt.onNavigationEvent(objIAuthTabCallback);
        AFe1vSDK aFe1vSDK = (AFe1vSDK) objIAuthTabCallback;
        String str2 = aFe1vSDK.onWarmupCompleted().get(iAuthTabCallback2.getKey());
        if (str2 != null) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(iAuthTabCallback2, str2, null);
            onextracallback.L$0 = access15400.onNavigationEvent(iAuthTabCallback2);
            onextracallback.L$1 = access15400.onNavigationEvent(objectRef);
            onextracallback.L$2 = access15400.onNavigationEvent(aFe1vSDK);
            onextracallback.L$3 = str2;
            onextracallback.Z$0 = zOnExtraCallback;
            onextracallback.I$0 = 0;
            onextracallback.label = 2;
            return findRes.onExtraCallbackWithResult(onwarmupcompleted, onextracallback) == objOnExtraCallback ? objOnExtraCallback : str2;
        }
        if (zOnExtraCallback && aFe1vSDK.onExtraCallback().contains(iAuthTabCallback2.getKey())) {
            int i16 = IAuthTabCallbackDefault + 25;
            asInterface = i16 % 128;
            if (i16 % 2 != 0) {
                onNavigationEvent(iAuthTabCallback2.getKey());
            } else if (!onNavigationEvent(iAuthTabCallback2.getKey())) {
            }
        } else {
            z = false;
        }
        if (z) {
            this.IAuthTabCallbackStub.onExtraCallbackWithResult(iAuthTabCallback2.getKey());
        }
        String strOnNavigationEvent = this.onExtraCallback.onNavigationEvent(iAuthTabCallback2.getKey());
        if (strOnNavigationEvent == null) {
            return objectRef.element;
        }
        if (z) {
            this.onTransact.onNavigationEvent(iAuthTabCallback2.getKey(), strOnNavigationEvent);
        }
        return strOnNavigationEvent;
    }

    private static final boolean asInterface(Map map, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        boolean zContainsKey;
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            zContainsKey = map.containsKey(iAuthTabCallback.getKey());
            int i3 = 8 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            zContainsKey = map.containsKey(iAuthTabCallback.getKey());
        }
        int i4 = asInterface + 99;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zContainsKey;
    }

    private static final boolean asBinder(Map map, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        boolean zContainsKey = map.containsKey(iAuthTabCallback.getKey());
        int i4 = IAuthTabCallbackDefault + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zContainsKey;
    }

    private static final boolean onNavigationEvent(AFe1rSDK aFe1rSDK, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            return aFe1rSDK.IAuthTabCallbackStub.onExtraCallback(iAuthTabCallback.getKey());
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        aFe1rSDK.IAuthTabCallbackStub.onExtraCallback(iAuthTabCallback.getKey());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallbackDefault(Map map, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        boolean zContainsKey;
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            zContainsKey = map.containsKey(iAuthTabCallback.getKey());
            int i3 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            zContainsKey = map.containsKey(iAuthTabCallback.getKey());
        }
        int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return zContainsKey;
        }
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(Map map, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            return map.containsKey(iAuthTabCallback.getKey());
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        boolean zContainsKey = map.containsKey(iAuthTabCallback.getKey());
        int i3 = 67 / 0;
        return zContainsKey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d1, code lost:
    
        if (r6.isEmpty() != false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    @Override // o.AFe1vSDKAFa1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr, @NotNull access13800<? super Map<String, String>> access13800Var) {
        onNavigationEvent onnavigationevent;
        Set mutableSet;
        Map map;
        boolean z;
        Set setOnNavigationEvent;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IAuthTabCallbackDefault + 9;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    onnavigationevent.label = i2 / Integer.MIN_VALUE;
                } else {
                    onnavigationevent.label = i2 - 2147483648;
                }
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i4 = onnavigationevent.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            mutableSet = ArraysKt___ArraysKt.toMutableSet(iAuthTabCallbackArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(access8200.onNavigationEvent(iAuthTabCallbackArr.length), 16));
            int length = iAuthTabCallbackArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = asInterface + 69;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    getAdvertisingId.IAuthTabCallback iAuthTabCallback = iAuthTabCallbackArr[i5];
                    linkedHashMap2.put(iAuthTabCallback.getKey(), iAuthTabCallback);
                    i5 += 21;
                } else {
                    getAdvertisingId.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallbackArr[i5];
                    linkedHashMap2.put(iAuthTabCallback2.getKey(), iAuthTabCallback2);
                    i5++;
                }
            }
            List<DefaultVar> list = this.onNavigationEvent;
            if (list != null) {
                ArrayList<DefaultVar> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    DefaultVar defaultVar = (DefaultVar) obj2;
                    if (linkedHashMap2.containsKey(defaultVar.onExtraCallbackWithResult())) {
                        if (defaultVar.onExtraCallback()) {
                            getAdvertisingId.IAuthTabCallback iAuthTabCallback3 = (getAdvertisingId.IAuthTabCallback) linkedHashMap2.get(defaultVar.onExtraCallbackWithResult());
                            if ((iAuthTabCallback3 != null ? iAuthTabCallback3.getTargetKey() : null) == getAdvertisingId.onExtraCallback.CDN) {
                            }
                        } else {
                            arrayList.add(obj2);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.onExtraCallback.onExtraCallbackWithResult(((DefaultVar) it.next()).onExtraCallbackWithResult());
                }
                final LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(access8200.onNavigationEvent(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
                for (DefaultVar defaultVar2 : arrayList) {
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(defaultVar2.onExtraCallbackWithResult(), (String) DefaultVar.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar2}, 1280857246, -1280857245, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()));
                    linkedHashMap3.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
                }
                linkedHashMap.putAll(linkedHashMap3);
                CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, new Function1() { // from class: im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableRepositoryImpl$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 125;
                        onNavigationEvent = i8 % 128;
                        Object obj4 = null;
                        if (i8 % 2 == 0) {
                            Boolean.valueOf(AFe1rSDK.onWarmupCompleted(linkedHashMap3, (getAdvertisingId.IAuthTabCallback) obj3));
                            throw null;
                        }
                        Boolean boolValueOf = Boolean.valueOf(AFe1rSDK.onWarmupCompleted(linkedHashMap3, (getAdvertisingId.IAuthTabCallback) obj3));
                        int i9 = onNavigationEvent + 111;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            return boolValueOf;
                        }
                        obj4.hashCode();
                        throw null;
                    }
                });
                if (!mutableSet.isEmpty()) {
                }
                return linkedHashMap;
            }
            addAnimatorUpdateListener addanimatorupdatelistener = this.onTransact;
            Set set = mutableSet;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((getAdvertisingId) it2.next()).getKey());
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
            final Map mapOnExtraCallbackWithResult = addanimatorupdatelistener.onExtraCallbackWithResult((String[]) Arrays.copyOf(strArr, strArr.length));
            linkedHashMap.putAll(mapOnExtraCallbackWithResult);
            CollectionsKt__MutableCollectionsKt.removeAll(set, new Function1() { // from class: im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableRepositoryImpl$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 5;
                    onNavigationEvent = i8 % 128;
                    Object obj4 = null;
                    if (i8 % 2 == 0) {
                        Boolean.valueOf(AFe1rSDK.IAuthTabCallback(mapOnExtraCallbackWithResult, (getAdvertisingId.IAuthTabCallback) obj3));
                        obj4.hashCode();
                        throw null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(AFe1rSDK.IAuthTabCallback(mapOnExtraCallbackWithResult, (getAdvertisingId.IAuthTabCallback) obj3));
                    int i9 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 == 0) {
                        return boolValueOf;
                    }
                    throw null;
                }
            });
            if (!mutableSet.isEmpty()) {
                boolean zOnExtraCallback = onExtraCallback();
                if (zOnExtraCallback) {
                    CollectionsKt__MutableCollectionsKt.removeAll(set, new Function1() { // from class: im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableRepositoryImpl$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            Boolean boolValueOf;
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 9;
                            IAuthTabCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                Object[] objArr = {this.f$0, (getAdvertisingId.IAuthTabCallback) obj3};
                                boolValueOf = Boolean.valueOf(((Boolean) AFe1rSDK.IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr, -1600557762, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1600557763, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue());
                                int i9 = 98 / 0;
                            } else {
                                Object[] objArr2 = {this.f$0, (getAdvertisingId.IAuthTabCallback) obj3};
                                boolValueOf = Boolean.valueOf(((Boolean) AFe1rSDK.IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr2, -1600557762, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1600557763, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue());
                            }
                            int i10 = onNavigationEvent + 29;
                            IAuthTabCallback = i10 % 128;
                            if (i10 % 2 != 0) {
                                return boolValueOf;
                            }
                            throw null;
                        }
                    });
                }
                AFe1vSDKAFa1uSDK aFe1vSDKAFa1uSDK = this.asBinder;
                getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr2 = (getAdvertisingId.IAuthTabCallback[]) mutableSet.toArray(new getAdvertisingId.IAuthTabCallback[0]);
                getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr3 = (getAdvertisingId.IAuthTabCallback[]) Arrays.copyOf(iAuthTabCallbackArr2, iAuthTabCallbackArr2.length);
                onnavigationevent.L$0 = access15400.onNavigationEvent(iAuthTabCallbackArr);
                onnavigationevent.L$1 = mutableSet;
                onnavigationevent.L$2 = linkedHashMap;
                onnavigationevent.L$3 = access15400.onNavigationEvent(linkedHashMap2);
                onnavigationevent.Z$0 = zOnExtraCallback;
                onnavigationevent.label = 1;
                Object objIAuthTabCallback = aFe1vSDKAFa1uSDK.IAuthTabCallback(iAuthTabCallbackArr3, onnavigationevent);
                if (objIAuthTabCallback == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                map = linkedHashMap;
                obj = objIAuthTabCallback;
                z = zOnExtraCallback;
            }
            return linkedHashMap;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = onnavigationevent.Z$0;
        map = (Map) onnavigationevent.L$2;
        mutableSet = (Set) onnavigationevent.L$1;
        ResultKt.onNavigationEvent(obj);
        int i7 = IAuthTabCallbackDefault + 111;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        AFe1vSDK aFe1vSDK = (AFe1vSDK) obj;
        final Map<String, String> mapOnWarmupCompleted = aFe1vSDK.onWarmupCompleted();
        map.putAll(mapOnWarmupCompleted);
        Set set2 = mutableSet;
        CollectionsKt__MutableCollectionsKt.removeAll(set2, new Function1() { // from class: im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableRepositoryImpl$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 85;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                Boolean boolValueOf = Boolean.valueOf(AFe1rSDK.onExtraCallback(mapOnWarmupCompleted, (getAdvertisingId.IAuthTabCallback) obj3));
                int i12 = onNavigationEvent + 105;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    return boolValueOf;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        this.onTransact.IAuthTabCallback(mapOnWarmupCompleted);
        this.onExtraCallback.onExtraCallbackWithResult(mapOnWarmupCompleted);
        if (mutableSet.isEmpty()) {
            int i9 = asInterface + 3;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 != 0) {
                return map;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = set2.iterator();
            while (!(!it3.hasNext())) {
                Object next = it3.next();
                getAdvertisingId.IAuthTabCallback iAuthTabCallback4 = (getAdvertisingId.IAuthTabCallback) next;
                if (aFe1vSDK.onExtraCallback().contains(iAuthTabCallback4.getKey())) {
                    int i10 = IAuthTabCallbackDefault + 95;
                    asInterface = i10 % 128;
                    int i11 = i10 % 2;
                    if (onNavigationEvent(iAuthTabCallback4.getKey())) {
                        int i12 = IAuthTabCallbackDefault + 111;
                        asInterface = i12 % 128;
                        int i13 = i12 % 2;
                        arrayList3.add(next);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                int i14 = IAuthTabCallbackDefault + 49;
                asInterface = i14 % 128;
                if (i14 % 2 != 0) {
                    arrayList4.add(((getAdvertisingId) it4.next()).getKey());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                arrayList4.add(((getAdvertisingId) it4.next()).getKey());
            }
            setOnNavigationEvent = CollectionsKt___CollectionsKt.toSet(arrayList4);
        } else {
            setOnNavigationEvent = clearNumber.onNavigationEvent();
        }
        Iterator it5 = setOnNavigationEvent.iterator();
        while (it5.hasNext()) {
            this.IAuthTabCallbackStub.onExtraCallbackWithResult((String) it5.next());
        }
        fromRawRes fromrawres = this.onExtraCallback;
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
        Iterator it6 = set2.iterator();
        while (it6.hasNext()) {
            arrayList5.add(((getAdvertisingId) it6.next()).getKey());
        }
        String[] strArr2 = (String[]) arrayList5.toArray(new String[0]);
        final Map mapOnNavigationEvent = fromrawres.onNavigationEvent((String[]) Arrays.copyOf(strArr2, strArr2.length));
        map.putAll(mapOnNavigationEvent);
        CollectionsKt__MutableCollectionsKt.removeAll(set2, new Function1() { // from class: im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableRepositoryImpl$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj5) {
                int i15 = 2 % 2;
                int i16 = onNavigationEvent + 65;
                onWarmupCompleted = i16 % 128;
                if (i16 % 2 == 0) {
                    Object[] objArr = {mapOnNavigationEvent, (getAdvertisingId.IAuthTabCallback) obj5};
                    Boolean.valueOf(((Boolean) AFe1rSDK.IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr, -2025544078, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 2025544078, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue());
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
                Object[] objArr2 = {mapOnNavigationEvent, (getAdvertisingId.IAuthTabCallback) obj5};
                Boolean boolValueOf = Boolean.valueOf(((Boolean) AFe1rSDK.IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr2, -2025544078, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 2025544078, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue());
                int i17 = onNavigationEvent + 5;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                return boolValueOf;
            }
        });
        addAnimatorUpdateListener addanimatorupdatelistener2 = this.onTransact;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry : mapOnNavigationEvent.entrySet()) {
            if (setOnNavigationEvent.contains((String) entry.getKey())) {
                linkedHashMap4.put(entry.getKey(), entry.getValue());
            }
        }
        addanimatorupdatelistener2.IAuthTabCallback(linkedHashMap4);
        return map;
    }

    public void onExtraCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onTransact.onNavigationEvent(str, str2);
            this.onExtraCallback.onExtraCallback(str, str2);
            int i3 = 63 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onTransact.onNavigationEvent(str, str2);
            this.onExtraCallback.onExtraCallback(str, str2);
        }
        int i4 = asInterface + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public String onExtraCallback(@NotNull String str) {
        DefaultVar defaultVar;
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        List<DefaultVar> list = this.onNavigationEvent;
        if (list != null) {
            int i2 = asInterface + 85;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Iterator<T> it = list.iterator();
            int i4 = IAuthTabCallbackDefault + 119;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DefaultVar defaultVar2 = (DefaultVar) next;
                if (Intrinsics.areEqual(defaultVar2.onExtraCallbackWithResult(), str)) {
                    int i6 = IAuthTabCallbackDefault + 119;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    if (!defaultVar2.onExtraCallback()) {
                        break;
                    }
                }
            }
            defaultVar = (DefaultVar) next;
        } else {
            defaultVar = null;
        }
        if (defaultVar != null) {
            String str2 = (String) DefaultVar.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar}, 1280857246, -1280857245, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
            if (str2 != null) {
                int i8 = IAuthTabCallbackDefault + 51;
                asInterface = i8 % 128;
                if (i8 % 2 == 0) {
                    return str2;
                }
                throw null;
            }
        }
        return this.onTransact.onExtraCallbackWithResult(str);
    }

    private final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4261);
        int i4 = IAuthTabCallbackDefault + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    private final boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            List<DefaultVar> list = this.onNavigationEvent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<DefaultVar> list2 = this.onNavigationEvent;
        List<DefaultVar> list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            return false;
        }
        List<DefaultVar> list4 = list2;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it = list4.iterator();
            int i3 = asInterface + 13;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((DefaultVar) it.next()).onExtraCallbackWithResult(), str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean onNavigationEvent(Map map, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Boolean) IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, new Object[]{map, iAuthTabCallback}, -2025544078, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 2025544078, iOnExtraCallback2)).booleanValue();
    }

    public static /* synthetic */ boolean onWarmupCompleted(AFe1rSDK aFe1rSDK, getAdvertisingId.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Boolean) IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, new Object[]{aFe1rSDK, iAuthTabCallback}, -1600557762, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1600557763, iOnExtraCallback2)).booleanValue();
    }
}
