package o;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto;
import im.toss.tosssecurities.network.data.SecuritiesApiErrorResponse;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import im.toss.tosssecurities.network.domain.SecuritiesApiError;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.CmpServiceImpl;
import o.CmpServiceImpla;
import o.getPackageType;
import o.getTileModeY;
import o.onFlowLoadFailed;
import o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA;
import o.r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CmpServiceImpl implements CmpServiceImpld {
    private static int ICustomTabsCallbackDefault = 0;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static int onActivityLayout = 0;
    private static int onRelationshipValidationResult = 1;
    private final setRubIn<r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA> IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final CoroutineExceptionHandler IAuthTabCallbackStub;
    private final setRubIn<CmpServiceImplf> IAuthTabCallbackStubProxy;
    private final setRubIn<r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted> IAuthTabCallback_Parcel;
    private final hasSupportedCmp ICustomTabsCallback;
    private final showCmpForExistingUser access000;
    private getPackageType access100;
    private volatile int asBinder;
    private getPackageType asInterface;
    private final setRubIn<CmpServiceImple> extraCallback;
    private final setRubIn<r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult> extraCallbackWithResult;
    private volatile long getInterfaceDescriptor;
    private final setRubIn<r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk> onActivityResized;
    private final getCornerRadius<IntegratedTradingHoursDto> onExtraCallback;
    private final findResAndMsg onExtraCallbackWithResult;
    private final deprecated_address onMessageChannelReady;
    private final zzag onMinimized;
    private final setRubIn<Object> onNavigationEvent;
    private final setRubIn<CmpServiceImpla> onPostMessage;
    private final onFlowHidden onTransact;
    private final getCornerRadius<Long> readTypedObject;
    private final ConcurrentHashMap<CmpServiceImplc, getBorderRadius<CmpServiceImplc>> writeTypedObject;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final long[] onWarmupCompleted = {1000, 2000, 5000, 10000, 30000, 60000};

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = CmpServiceImpl.onExtraCallbackWithResult(CmpServiceImpl.this, this);
            int i4 = onExtraCallbackWithResult + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    public static final /* synthetic */ class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[socketAddress.values().length];
            try {
                iArr[socketAddress.KRX.ordinal()] = 1;
                int i = IAuthTabCallback + 1;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[socketAddress.INTEGRATED.ordinal()] = 2;
                int i3 = IAuthTabCallback + 43;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[socketAddress.NXT.ordinal()] = 3;
                int i6 = onExtraCallback + 33;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static /* synthetic */ r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk IAuthTabCallback(CmpServiceImpl cmpServiceImpl, CmpServiceImpla cmpServiceImpla, long j) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 79;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk r8lambdagvtxtysb8zvmqusi5yavb9giukAsInterface = asInterface(cmpServiceImpl, cmpServiceImpla, j);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = onActivityLayout + 35;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdagvtxtysb8zvmqusi5yavb9giukAsInterface;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~i5) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i6)) | i9;
        int i11 = (~(i7 | (~i6) | i5)) | (~(i8 | i6)) | (~(i | i6 | i5));
        int i12 = (~(i5 | i)) | i6 | i9;
        int i13 = i + i6 + i2 + (5090439 * i4) + ((-1076018391) * i3);
        int i14 = i13 * i13;
        int i15 = ((1425068070 * i) - 1475346432) + (1088368604 * i6) + (i10 * (-168349733)) + ((-168349733) * i11) + (168349733 * i12) + (1256718336 * i2) + (1616379904 * i4) + ((-1222115328) * i3) + (1028194304 * i14);
        int i16 = (i * (-1092730454)) + 799718796 + (i6 * (-1092731068)) + (i10 * (-307)) + (i11 * (-307)) + (i12 * 307) + (i2 * (-1092730761)) + (i4 * 1582232257) + (i3 * 741505039) + (i14 * (-1125187584));
        int i17 = i15 + (i16 * i16 * (-410583040));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CmpServiceImpl cmpServiceImpl = (CmpServiceImpl) objArr[0];
        IntegratedTradingHoursDto integratedTradingHoursDto = (IntegratedTradingHoursDto) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 63;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        CmpServiceImpla cmpServiceImplaOnExtraCallback = onExtraCallback(cmpServiceImpl, integratedTradingHoursDto);
        int i4 = ICustomTabsCallbackStubProxy + 85;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return cmpServiceImplaOnExtraCallback;
    }

    public static /* synthetic */ r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult onExtraCallbackWithResult(CmpServiceImpl cmpServiceImpl, CmpServiceImpla cmpServiceImpla, long j) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 123;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onNavigationEvent(cmpServiceImpl, cmpServiceImpla, j);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return onextracallbackwithresultOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CmpServiceImpl cmpServiceImpl = (CmpServiceImpl) objArr[0];
        String str = (String) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cmpServiceImpl, str, th);
        int i4 = ICustomTabsCallbackStubProxy + 15;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted onWarmupCompleted(CmpServiceImpl cmpServiceImpl, CmpServiceImpla cmpServiceImpla, long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 113;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback(cmpServiceImpl, cmpServiceImpla, j);
        int i4 = onActivityLayout + 31;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnExtraCallback;
    }

    public static final class IAuthTabCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ CmpServiceImpl IAuthTabCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, CmpServiceImpl cmpServiceImpl) {
            super(onwarmupcompleted);
            this.IAuthTabCallback = cmpServiceImpl;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.IAuthTabCallback, th};
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            CmpServiceImpl.onExtraCallbackWithResult(-1135892113, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, 1135892113);
            int i4 = onWarmupCompleted + 17;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements IAnimation<CmpServiceImplf> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ IAnimation onExtraCallback;

        /* renamed from: o.CmpServiceImpl$IAuthTabCallbackDefault$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements setRipple {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ setRipple onNavigationEvent;

            /* renamed from: o.CmpServiceImpl$IAuthTabCallbackDefault$4$4, reason: invalid class name and collision with other inner class name */
            public static final class C00064 extends ContinuationImpl {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public C00064(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 115;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass4.this.emit(null, this);
                    int i4 = onNavigationEvent + 111;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 50 / 0;
                    }
                    return objEmit;
                }
            }

            public AnonymousClass4(setRipple setripple) {
                this.onNavigationEvent = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                C00064 c00064;
                CmpServiceImplf cmpServiceImplfOnNavigationEvent;
                r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallback;
                r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback;
                int i = 2 % 2;
                if (access13800Var instanceof C00064) {
                    c00064 = (C00064) access13800Var;
                    int i2 = c00064.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c00064.label = i2 - 2147483648;
                        int i3 = IAuthTabCallback + 59;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        c00064 = new C00064(access13800Var);
                    }
                }
                Object obj2 = c00064.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = c00064.label;
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.onNavigationEvent;
                    CmpServiceImpla cmpServiceImpla = (CmpServiceImpla) obj;
                    if (cmpServiceImpla == null || (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallback = cmpServiceImpla.IAuthTabCallback()) == null || (r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallback.IAuthTabCallback()) == null) {
                        int i6 = onExtraCallbackWithResult + 21;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 3 / 4;
                        }
                        cmpServiceImplfOnNavigationEvent = null;
                    } else {
                        cmpServiceImplfOnNavigationEvent = r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback.onNavigationEvent();
                    }
                    c00064.L$0 = access15400.onNavigationEvent(obj);
                    c00064.L$1 = access15400.onNavigationEvent(c00064);
                    c00064.L$2 = access15400.onNavigationEvent(obj);
                    c00064.L$3 = access15400.onNavigationEvent(setripple);
                    c00064.I$0 = 0;
                    c00064.label = 1;
                    if (setripple.emit(cmpServiceImplfOnNavigationEvent, c00064) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj2);
                    int i8 = onExtraCallbackWithResult + 75;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                }
                return Unit.INSTANCE;
            }
        }

        public IAuthTabCallbackDefault(IAnimation iAnimation) {
            this.onExtraCallback = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onExtraCallback.collect(new AnonymousClass4(setripple), access13800Var);
            if (objCollect != access14300.onWarmupCompleted()) {
                Unit unit = Unit.INSTANCE;
                int i2 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }
            int i4 = IAuthTabCallback + 93;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            if (i4 % 2 == 0) {
                int i6 = 59 / 0;
            }
            int i7 = i5 + 49;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return objCollect;
        }
    }

    public static final class asInterface implements IAnimation<CmpServiceImple> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ IAnimation onExtraCallback;

        /* renamed from: o.CmpServiceImpl$asInterface$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements setRipple {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ setRipple onExtraCallback;

            /* renamed from: o.CmpServiceImpl$asInterface$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl {
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass3(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 119;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (i3 != 0) {
                        return anonymousClass1.emit(null, this);
                    }
                    anonymousClass1.emit(null, this);
                    throw null;
                }
            }

            public AnonymousClass1(setRipple setripple) {
                this.onExtraCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass3 anonymousClass3;
                CmpServiceImple cmpServiceImpleOnWarmupCompleted;
                r8lambda2j9liPp92mA1c2mCW_pCDV6p7wI<r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I> r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallback;
                r8lambda33yZb1Yb9XyIB5h4msmQWceHb7I r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (access13800Var instanceof AnonymousClass3) {
                    anonymousClass3 = (AnonymousClass3) access13800Var;
                    int i4 = anonymousClass3.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        anonymousClass3.label = i4 - 2147483648;
                    } else {
                        anonymousClass3 = new AnonymousClass3(access13800Var);
                    }
                }
                Object obj2 = anonymousClass3.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = anonymousClass3.label;
                if (i5 != 0) {
                    int i6 = onNavigationEvent;
                    int i7 = i6 + 119;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0 ? i5 != 1 : i5 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = i6 + 115;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj2);
                        int i9 = 94 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj2);
                    }
                } else {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.onExtraCallback;
                    CmpServiceImpla cmpServiceImpla = (CmpServiceImpla) obj;
                    Object obj3 = null;
                    if (cmpServiceImpla == null || (r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallback = cmpServiceImpla.IAuthTabCallback()) == null || (r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback = r8lambda2j9lipp92ma1c2mcw_pcdv6p7wiIAuthTabCallback.IAuthTabCallback()) == null) {
                        cmpServiceImpleOnWarmupCompleted = null;
                    } else {
                        cmpServiceImpleOnWarmupCompleted = r8lambda33yzb1yb9xyib5h4msmqwcehb7iIAuthTabCallback.onWarmupCompleted();
                        int i10 = IAuthTabCallback + 77;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    anonymousClass3.L$0 = access15400.onNavigationEvent(obj);
                    anonymousClass3.L$1 = access15400.onNavigationEvent(anonymousClass3);
                    anonymousClass3.L$2 = access15400.onNavigationEvent(obj);
                    anonymousClass3.L$3 = access15400.onNavigationEvent(setripple);
                    anonymousClass3.I$0 = 0;
                    anonymousClass3.label = 1;
                    if (setripple.emit(cmpServiceImpleOnWarmupCompleted, anonymousClass3) == objOnWarmupCompleted) {
                        int i12 = IAuthTabCallback + 67;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public asInterface(IAnimation iAnimation) {
            this.onExtraCallback = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onExtraCallback.collect(new AnonymousClass1(setripple), access13800Var);
            if (objCollect == access14300.onWarmupCompleted()) {
                int i2 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return objCollect;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super getPackageType>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private /* synthetic */ Object L$0;
        int label;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = CmpServiceImpl.this.new IAuthTabCallback_Parcel(access13800Var);
            iAuthTabCallback_Parcel.L$0 = obj;
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 85 / 0;
            }
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 56 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super getPackageType> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_ParcelCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: o.CmpServiceImpl$IAuthTabCallback_Parcel$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            int I$0;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ CmpServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CmpServiceImpl cmpServiceImpl, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = cmpServiceImpl;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, access13800Var);
                int i2 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: o.CmpServiceImpl$IAuthTabCallback_Parcel$4$onWarmupCompleted */
            public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends IntegratedTradingHoursDto>>, Object> {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;
                int I$0;
                int I$1;
                int I$2;
                Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ CmpServiceImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public onWarmupCompleted(access13800 access13800Var, CmpServiceImpl cmpServiceImpl) {
                    super(2, access13800Var);
                    this.this$0 = cmpServiceImpl;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var, this.this$0);
                    int i2 = onExtraCallback + 7;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return onwarmupcompleted;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 17;
                    IAuthTabCallback = i2 % 128;
                    Object obj3 = null;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Result<? extends IntegratedTradingHoursDto>> access13800Var = (access13800) obj2;
                    if (i2 % 2 == 0) {
                        onNavigationEvent(findresandmsg, access13800Var);
                        obj3.hashCode();
                        throw null;
                    }
                    Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                    int i3 = IAuthTabCallback + 75;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnNavigationEvent;
                    }
                    throw null;
                }

                public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Result<? extends IntegratedTradingHoursDto>> access13800Var) throws Exception {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 89;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onExtraCallback + 67;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
                public final Object invokeSuspend(Object obj) throws Exception {
                    Object obj2;
                    SecuritiesApiError securitiesApiErrorOnWarmupCompleted;
                    IntegratedTradingHoursDto integratedTradingHoursDto;
                    Object objOnExtraCallbackWithResult;
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 51;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i4 = this.label;
                    try {
                        if (i4 != 0) {
                            int i5 = onExtraCallback + 51;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj);
                        } else {
                            ResultKt.onNavigationEvent(obj);
                            Result.Companion companion = Result.Companion;
                            showCmpForExistingUser showcmpforexistinguserOnWarmupCompleted = CmpServiceImpl.onWarmupCompleted(this.this$0);
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.I$2 = 0;
                            this.label = 1;
                            obj = showcmpforexistinguserOnWarmupCompleted.onNavigationEvent(this);
                            if (obj == objOnWarmupCompleted) {
                                int i7 = onExtraCallback + 87;
                                IAuthTabCallback = i7 % 128;
                                if (i7 % 2 != 0) {
                                    return objOnWarmupCompleted;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        }
                        try {
                            objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                        } catch (NullPointerException e) {
                            if (!Intrinsics.areEqual(IntegratedTradingHoursDto.class, Object.class) && !Intrinsics.areEqual(IntegratedTradingHoursDto.class, Unit.class)) {
                                throw e;
                            }
                            integratedTradingHoursDto = Unit.INSTANCE;
                        } catch (Exception e2) {
                            throw e2;
                        }
                    } catch (CancellationException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(e4));
                    } catch (WebResourceResponseModel e5) {
                        Result.Companion companion3 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(e5));
                    }
                    if (objOnExtraCallbackWithResult == null) {
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto");
                    }
                    int i8 = IAuthTabCallback + 113;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    integratedTradingHoursDto = (IntegratedTradingHoursDto) objOnExtraCallbackWithResult;
                    obj2 = Result.constructor-impl(integratedTradingHoursDto);
                    HttpException httpException = Result.exceptionOrNull-impl(obj2);
                    if (httpException != null) {
                        try {
                            Result.Companion companion4 = Result.Companion;
                            if (!(httpException instanceof HttpException) || (securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted(httpException)) == null) {
                                throw httpException;
                            }
                            int i10 = onExtraCallback + 79;
                            IAuthTabCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 61 / 0;
                            }
                            throw securitiesApiErrorOnWarmupCompleted;
                        } catch (Throwable th) {
                            Result.Companion companion5 = Result.Companion;
                            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                    }
                    return Result.IAuthTabCallback(obj2);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnNavigationEvent;
                Object obj2;
                Throwable th;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    CmpServiceImpl cmpServiceImpl = this.this$0;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null, cmpServiceImpl);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onwarmupcompleted, this);
                    if (obj != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
                if (i2 != 1) {
                    int i3 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 2 : i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = obj2;
                    CmpServiceImpl cmpServiceImpl2 = this.this$0;
                    th = Result.exceptionOrNull-impl(objOnNavigationEvent);
                    if (th != null) {
                        int i4 = onNavigationEvent + 99;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 == 0) {
                            Intrinsics.areEqual(preloadCmp.onNavigationEvent(th), onFlowLoadFailed.IAuthTabCallback.onExtraCallback);
                            throw null;
                        }
                        if (Intrinsics.areEqual(preloadCmp.onNavigationEvent(th), onFlowLoadFailed.IAuthTabCallback.onExtraCallback)) {
                            CmpServiceImpl.IAuthTabCallback(cmpServiceImpl2, true);
                        }
                        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                        CmpServiceImpl.onExtraCallbackWithResult(-1135892113, new Object[]{cmpServiceImpl2, th}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, 1135892113);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                CmpServiceImpl cmpServiceImpl3 = this.this$0;
                if (Result.onNavigationEvent(objOnNavigationEvent)) {
                    IntegratedTradingHoursDto integratedTradingHoursDto = (IntegratedTradingHoursDto) objOnNavigationEvent;
                    CmpServiceImpl.IAuthTabCallback(cmpServiceImpl3, false);
                    getCornerRadius getcornerradiusAsInterface = CmpServiceImpl.asInterface(cmpServiceImpl3);
                    this.L$0 = objOnNavigationEvent;
                    this.L$1 = access15400.onNavigationEvent(integratedTradingHoursDto);
                    this.I$0 = 0;
                    this.label = 2;
                    if (getcornerradiusAsInterface.emit(integratedTradingHoursDto, this) != objOnWarmupCompleted) {
                        obj2 = objOnNavigationEvent;
                        objOnNavigationEvent = obj2;
                    }
                    return objOnWarmupCompleted;
                }
                CmpServiceImpl cmpServiceImpl22 = this.this$0;
                th = Result.exceptionOrNull-impl(objOnNavigationEvent);
                if (th != null) {
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        
            if ((r2 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r9.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r9.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r10);
            r10 = o.maybeUpdateAnimatable.onNavigationEvent(r1, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.CmpServiceImpl.IAuthTabCallback_Parcel.AnonymousClass4(r9.this$0, null), 3, (java.lang.Object) null);
            r2 = o.CmpServiceImpl.IAuthTabCallback_Parcel.onWarmupCompleted + 125;
            o.CmpServiceImpl.IAuthTabCallback_Parcel.onExtraCallback = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            findResAndMsg findresandmsg;
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                findresandmsg = (findResAndMsg) this.L$0;
                int i3 = 58 / 0;
            } else {
                findresandmsg = (findResAndMsg) this.L$0;
            }
        }
    }

    @Inject
    public CmpServiceImpl(@NotNull showCmpForExistingUser showcmpforexistinguser, @NotNull zzag zzagVar, @NotNull deprecated_address deprecated_addressVar, @NotNull hasSupportedCmp hassupportedcmp, @NotNull onFlowHidden onflowhidden) {
        Intrinsics.checkNotNullParameter(showcmpforexistinguser, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(deprecated_addressVar, "");
        Intrinsics.checkNotNullParameter(hassupportedcmp, "");
        Intrinsics.checkNotNullParameter(onflowhidden, "");
        this.access000 = showcmpforexistinguser;
        this.onMinimized = zzagVar;
        this.onMessageChannelReady = deprecated_addressVar;
        this.ICustomTabsCallback = hassupportedcmp;
        this.onTransact = onflowhidden;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(CoroutineExceptionHandler.extraCallbackWithResult, this);
        this.IAuthTabCallbackStub = iAuthTabCallback;
        findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(putChannelInfo.onWarmupCompleted().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)).plus(iAuthTabCallback));
        this.onExtraCallbackWithResult = findresandmsgOnWarmupCompleted;
        getCornerRadius<Long> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(0L);
        this.readTypedObject = getcornerradiusOnNavigationEvent;
        getCornerRadius<IntegratedTradingHoursDto> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent((Object) null);
        this.onExtraCallback = getcornerradiusOnNavigationEvent2;
        this.onPostMessage = CacheStrategyCompanion.onWarmupCompleted(getcornerradiusOnNavigationEvent2, findresandmsgOnWarmupCompleted, new Function1() { // from class: im.toss.securities.core.markettime.data.MarketStatusImpl$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    Object[] objArr = {this.f$0, (IntegratedTradingHoursDto) obj};
                    int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                    throw null;
                }
                Object[] objArr2 = {this.f$0, (IntegratedTradingHoursDto) obj};
                int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                CmpServiceImpla cmpServiceImpla = (CmpServiceImpla) CmpServiceImpl.onExtraCallbackWithResult(2115498015, objArr2, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, -2115498013);
                int i3 = onExtraCallback + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return cmpServiceImpla;
            }
        });
        IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(IAuthTabCallback_Parcel());
        getTileModeY.onWarmupCompleted onwarmupcompleted = getTileModeY.Companion;
        this.IAuthTabCallbackStubProxy = ycxycx.IAuthTabCallback(iAuthTabCallbackDefault, findresandmsgOnWarmupCompleted, onwarmupcompleted.onNavigationEvent(), (Object) null);
        this.extraCallback = ycxycx.IAuthTabCallback(new asInterface(IAuthTabCallback_Parcel()), findresandmsgOnWarmupCompleted, onwarmupcompleted.onNavigationEvent(), (Object) null);
        this.onNavigationEvent = ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(deprecated_addressVar.IAuthTabCallback(), new onWarmupCompleted(null, this)), findresandmsgOnWarmupCompleted, onwarmupcompleted.onNavigationEvent(), (Object) null);
        this.IAuthTabCallback_Parcel = CacheStrategyCompanion.onNavigationEvent(IAuthTabCallback_Parcel(), getcornerradiusOnNavigationEvent, findresandmsgOnWarmupCompleted, new Function2() { // from class: im.toss.securities.core.markettime.data.MarketStatusImpl$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted onWarmupCompleted2 = CmpServiceImpl.onWarmupCompleted(this.f$0, (CmpServiceImpla) obj, ((Long) obj2).longValue());
                int i4 = onExtraCallback + 71;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return onWarmupCompleted2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        this.extraCallbackWithResult = CacheStrategyCompanion.onNavigationEvent(IAuthTabCallback_Parcel(), getcornerradiusOnNavigationEvent, findresandmsgOnWarmupCompleted, new Function2() { // from class: im.toss.securities.core.markettime.data.MarketStatusImpl$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult onExtraCallbackWithResult2;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    onExtraCallbackWithResult2 = CmpServiceImpl.onExtraCallbackWithResult(this.f$0, (CmpServiceImpla) obj, ((Long) obj2).longValue());
                    int i3 = 70 / 0;
                } else {
                    onExtraCallbackWithResult2 = CmpServiceImpl.onExtraCallbackWithResult(this.f$0, (CmpServiceImpla) obj, ((Long) obj2).longValue());
                }
                int i4 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return onExtraCallbackWithResult2;
            }
        });
        this.onActivityResized = CacheStrategyCompanion.onNavigationEvent(IAuthTabCallback_Parcel(), getcornerradiusOnNavigationEvent, findresandmsgOnWarmupCompleted, new Function2() { // from class: im.toss.securities.core.markettime.data.MarketStatusImpl$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk r8lambdagvtxtysb8zvmqusi5yavb9giukIAuthTabCallback = CmpServiceImpl.IAuthTabCallback(this.f$0, (CmpServiceImpla) obj, ((Long) obj2).longValue());
                int i4 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return r8lambdagvtxtysb8zvmqusi5yavb9giukIAuthTabCallback;
            }
        });
        this.IAuthTabCallback = ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(deprecated_addressVar.IAuthTabCallback(), new onTransact(null, this)), findresandmsgOnWarmupCompleted, onwarmupcompleted.onNavigationEvent(), (Object) null);
        this.writeTypedObject = new ConcurrentHashMap<>();
    }

    public static final /* synthetic */ Object IAuthTabCallback(CmpServiceImpl cmpServiceImpl, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 61;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            cmpServiceImpl.onExtraCallbackWithResult((access13800<? super Unit>) access13800Var);
            throw null;
        }
        Object objOnExtraCallbackWithResult = cmpServiceImpl.onExtraCallbackWithResult((access13800<? super Unit>) access13800Var);
        int i3 = onActivityLayout + 89;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallback(CmpServiceImpl cmpServiceImpl) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 33;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<Long> getcornerradius = cmpServiceImpl.readTypedObject;
        if (i4 == 0) {
            int i5 = 64 / 0;
        }
        int i6 = i2 + 121;
        ICustomTabsCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ void IAuthTabCallback(CmpServiceImpl cmpServiceImpl, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 69;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        cmpServiceImpl.IAuthTabCallbackDefault = z;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
    }

    public static final /* synthetic */ getCornerRadius asInterface(CmpServiceImpl cmpServiceImpl) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 65;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<IntegratedTradingHoursDto> getcornerradius = cmpServiceImpl.onExtraCallback;
        int i5 = i2 + 7;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        CmpServiceImpl cmpServiceImpl = (CmpServiceImpl) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 47;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        cmpServiceImpl.onExtraCallback(th);
        int i4 = ICustomTabsCallbackStubProxy + 45;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ hasSupportedCmp onExtraCallback(CmpServiceImpl cmpServiceImpl) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 37;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        hasSupportedCmp hassupportedcmp = cmpServiceImpl.ICustomTabsCallback;
        int i5 = i3 + 13;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return hassupportedcmp;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(CmpServiceImpl cmpServiceImpl, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 119;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return onExtraCallbackWithResult(1494075526, new Object[]{cmpServiceImpl, access13800Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, -1494075525);
        }
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onExtraCallbackWithResult(1494075526, new Object[]{cmpServiceImpl, access13800Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, -1494075525);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ zzag onExtraCallbackWithResult(CmpServiceImpl cmpServiceImpl) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 31;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Object obj = null;
        zzag zzagVar = cmpServiceImpl.onMinimized;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 73;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return zzagVar;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 99;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long[] jArr = onWarmupCompleted;
        int i4 = i2 + 27;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return jArr;
    }

    public static final /* synthetic */ Object onNavigationEvent(CmpServiceImpl cmpServiceImpl, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 45;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = cmpServiceImpl.onWarmupCompleted((access13800<? super Unit>) access13800Var);
        int i4 = ICustomTabsCallbackStubProxy + 13;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CmpServiceImpl cmpServiceImpl = (CmpServiceImpl) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 9;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        boolean z = cmpServiceImpl.IAuthTabCallbackDefault;
        int i5 = i3 + 11;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ConcurrentHashMap onNavigationEvent(CmpServiceImpl cmpServiceImpl) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 27;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        ConcurrentHashMap<CmpServiceImplc, getBorderRadius<CmpServiceImplc>> concurrentHashMap = cmpServiceImpl.writeTypedObject;
        int i5 = i3 + 11;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return concurrentHashMap;
    }

    public static final /* synthetic */ showCmpForExistingUser onWarmupCompleted(CmpServiceImpl cmpServiceImpl) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 65;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        showCmpForExistingUser showcmpforexistinguser = cmpServiceImpl.access000;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return showcmpforexistinguser;
    }

    @Override // o.CmpServiceImpld
    public /* bridge */ CmpServiceImpla IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 65;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        CmpServiceImpla cmpServiceImplaIAuthTabCallbackDefault = super.IAuthTabCallbackDefault();
        int i4 = onActivityLayout + 103;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return cmpServiceImplaIAuthTabCallbackDefault;
    }

    @Override // o.CmpServiceImpld
    public setRubIn<CmpServiceImpla> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 75;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<CmpServiceImpla> setrubin = this.onPostMessage;
        int i5 = i2 + 33;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    private static final Unit onExtraCallback(CmpServiceImpl cmpServiceImpl, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 101;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        try {
            Result.Companion companion = Result.Companion;
            AFd1mSDK.onExtraCallbackWithResult("TradingHoursParsingError", th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("market", str)), false, (Function1) null, 24, (Object) null);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 49;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CmpServiceImpla onExtraCallback(final CmpServiceImpl cmpServiceImpl, IntegratedTradingHoursDto integratedTradingHoursDto) {
        Object obj;
        CmpServiceImpla cmpServiceImplaOnNavigationEvent;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 19;
        onActivityLayout = i2 % 128;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 != 0) {
            Result.Companion companion2 = Result.Companion;
            cmpServiceImpl.onTransact.onExtraCallback();
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        if (cmpServiceImpl.onTransact.onExtraCallback()) {
            if (integratedTradingHoursDto != null) {
                cmpServiceImplaOnNavigationEvent = integratedTradingHoursDto.onNavigationEvent(new Function2() { // from class: im.toss.securities.core.markettime.data.MarketStatusImpl$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i3 = 2 % 2;
                        int i4 = IAuthTabCallback + 101;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        Object[] objArr = {this.f$0, (String) obj3, (Throwable) obj4};
                        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                        Unit unit = (Unit) CmpServiceImpl.onExtraCallbackWithResult(90417031, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, -90417027);
                        int i6 = onNavigationEvent + 17;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return unit;
                    }
                });
            }
            obj = Result.constructor-impl(cmpServiceImplaOnNavigationEvent);
        } else {
            if (integratedTradingHoursDto != null) {
                cmpServiceImplaOnNavigationEvent = integratedTradingHoursDto.onNavigationEvent();
            } else {
                int i3 = ICustomTabsCallbackStubProxy + 113;
                onActivityLayout = i3 % 128;
                int i4 = i3 % 2;
                cmpServiceImplaOnNavigationEvent = null;
            }
            obj = Result.constructor-impl(cmpServiceImplaOnNavigationEvent);
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i5 = onActivityLayout + 27;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            AFd1mSDK.onExtraCallbackWithResult("TradingHoursParsingError", th2, (Map) null, false, (Function1) null, 28, (Object) null);
        }
        if (Result.onExtraCallback(obj)) {
            int i7 = ICustomTabsCallbackStubProxy + 33;
            onActivityLayout = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        } else {
            obj2 = obj;
        }
        return (CmpServiceImpla) obj2;
    }

    @Override // o.CmpServiceImpld
    public r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 105;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        CmpServiceImpla cmpServiceImplaIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        Object obj = null;
        if (cmpServiceImplaIAuthTabCallbackDefault == null) {
            return null;
        }
        int i4 = ICustomTabsCallbackStubProxy + 97;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            cmpServiceImplaIAuthTabCallbackDefault.IAuthTabCallback(isCivilized.onWarmupCompleted.onNavigationEvent(this.onMinimized));
            throw null;
        }
        r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk r8lambdagvtxtysb8zvmqusi5yavb9giukIAuthTabCallback = cmpServiceImplaIAuthTabCallbackDefault.IAuthTabCallback(isCivilized.onWarmupCompleted.onNavigationEvent(this.onMinimized));
        int i5 = ICustomTabsCallbackStubProxy + 87;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return r8lambdagvtxtysb8zvmqusi5yavb9giukIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return r1.onNavigationEvent(o.isCivilized.onWarmupCompleted.onNavigationEvent(r4.onMinimized));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r1 = o.CmpServiceImpl.onActivityLayout + 9;
        o.CmpServiceImpl.ICustomTabsCallbackStubProxy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r2 = o.CmpServiceImpl.ICustomTabsCallbackStubProxy + 41;
        o.CmpServiceImpl.onActivityLayout = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted onNavigationEvent() {
        CmpServiceImpla cmpServiceImplaIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 23;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            cmpServiceImplaIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i3 = 36 / 0;
        } else {
            cmpServiceImplaIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        }
    }

    public r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult onTransact() {
        int i = 2 % 2;
        CmpServiceImpla cmpServiceImplaIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (cmpServiceImplaIAuthTabCallbackDefault == null) {
            return null;
        }
        int i2 = ICustomTabsCallbackStubProxy + 123;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = cmpServiceImplaIAuthTabCallbackDefault.onExtraCallback(isCivilized.onWarmupCompleted.onNavigationEvent(this.onMinimized));
        int i4 = ICustomTabsCallbackStubProxy + 69;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresultOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.CmpServiceImpld
    public r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA onWarmupCompleted() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback.onExtraCallbackWithResult[((Enum) this.onMessageChannelReady.IAuthTabCallback().IAuthTabCallback()).ordinal()];
        if (i2 == 1) {
            r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent();
            int i3 = onActivityLayout + 5;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return onwarmupcompletedOnNavigationEvent;
            }
            throw null;
        }
        if (i2 != 2) {
            int i4 = ICustomTabsCallbackStubProxy + 75;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return onTransact();
    }

    public setRubIn<CmpServiceImplf> asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 101;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<CmpServiceImplf> setrubin = this.IAuthTabCallbackStubProxy;
        int i4 = i3 + 119;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return setrubin;
    }

    public setRubIn<CmpServiceImple> asInterface() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 93;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<CmpServiceImple> setrubin = this.extraCallback;
        int i4 = i3 + 29;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return setrubin;
    }

    @Override // o.CmpServiceImpld
    public setRubIn<r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted> onExtraCallback() {
        setRubIn<r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted> setrubin;
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 99;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            setrubin = this.IAuthTabCallback_Parcel;
            int i4 = 34 / 0;
        } else {
            setrubin = this.IAuthTabCallback_Parcel;
        }
        int i5 = i2 + 45;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    private static final r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted onExtraCallback(CmpServiceImpl cmpServiceImpl, CmpServiceImpla cmpServiceImpla, long j) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 79;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted onwarmupcompletedOnNavigationEvent = cmpServiceImpl.onNavigationEvent();
        int i4 = ICustomTabsCallbackStubProxy + 9;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }

    public setRubIn<r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult> IAuthTabCallbackStub() {
        setRubIn<r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult> setrubin;
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 57;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            setrubin = this.extraCallbackWithResult;
            int i4 = 42 / 0;
        } else {
            setrubin = this.extraCallbackWithResult;
        }
        int i5 = i2 + 115;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        throw null;
    }

    private static final r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult onNavigationEvent(CmpServiceImpl cmpServiceImpl, CmpServiceImpla cmpServiceImpla, long j) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 1;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return cmpServiceImpl.onTransact();
        }
        cmpServiceImpl.onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.CmpServiceImpld
    public setRubIn<r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 25;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        setRubIn<r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk> setrubin = this.onActivityResized;
        int i5 = i3 + 121;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    private static final r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk asInterface(CmpServiceImpl cmpServiceImpl, CmpServiceImpla cmpServiceImpla, long j) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 25;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk r8lambdagvtxtysb8zvmqusi5yavb9giukAccess100 = cmpServiceImpl.access100();
        int i4 = onActivityLayout + 113;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdagvtxtysb8zvmqusi5yavb9giukAccess100;
    }

    @Override // o.CmpServiceImpld
    public setRubIn<r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 61;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA> setrubin = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return setrubin;
    }

    public static final class onTransact extends SuspendLambda implements getBacktraceNote<setRipple<? super r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA>, socketAddress, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ CmpServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(access13800 access13800Var, CmpServiceImpl cmpServiceImpl) {
            super(3, access13800Var);
            this.this$0 = cmpServiceImpl;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((setRipple) obj, obj2, (access13800) obj3);
            if (i3 == 0) {
                int i4 = 24 / 0;
            }
            int i5 = onNavigationEvent + 101;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }

        public final Object onExtraCallback(setRipple<? super r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA> setripple, socketAddress socketaddress, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(access13800Var, this.this$0);
            ontransact.L$0 = setripple;
            ontransact.L$1 = socketaddress;
            Object objInvokeSuspend = ontransact.invokeSuspend(Unit.INSTANCE);
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            IAnimation iAnimationOnExtraCallback;
            int i;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 != 0) {
                int i6 = onWarmupCompleted + 63;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple = (setRipple) this.L$0;
                Object obj2 = this.L$1;
                int i7 = onExtraCallback.onExtraCallbackWithResult[((Enum) obj2).ordinal()];
                if (i7 == 1) {
                    iAnimationOnExtraCallback = this.this$0.onExtraCallback();
                    i = onNavigationEvent + 29;
                    onWarmupCompleted = i % 128;
                } else {
                    if (i7 != 2 && i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iAnimationOnExtraCallback = this.this$0.IAuthTabCallbackStub();
                    i = onWarmupCompleted + 73;
                    onNavigationEvent = i % 128;
                }
                int i8 = i % 2;
                this.L$0 = access15400.onNavigationEvent(setripple);
                this.L$1 = access15400.onNavigationEvent(obj2);
                this.label = 1;
                if (ycxycx.onNavigationEvent(setripple, iAnimationOnExtraCallback, this) == objOnWarmupCompleted) {
                    int i9 = onWarmupCompleted + 27;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onWarmupCompleted extends SuspendLambda implements getBacktraceNote<setRipple<? super Object>, socketAddress, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ CmpServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(access13800 access13800Var, CmpServiceImpl cmpServiceImpl) {
            super(3, access13800Var);
            this.this$0 = cmpServiceImpl;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((setRipple) obj, obj2, (access13800) obj3);
            int i4 = IAuthTabCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(setRipple<? super Object> setripple, socketAddress socketaddress, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var, this.this$0);
            onwarmupcompleted.L$0 = setripple;
            onwarmupcompleted.L$1 = socketaddress;
            Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(Unit.INSTANCE);
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            IAnimation iAnimationAsBinder;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = IAuthTabCallback + 17;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple = (setRipple) this.L$0;
                Object obj2 = this.L$1;
                int i5 = onExtraCallback.onExtraCallbackWithResult[((Enum) obj2).ordinal()];
                if (i5 != 1) {
                    int i6 = onNavigationEvent + 79;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (i5 != 2 && i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iAnimationAsBinder = this.this$0.asInterface();
                } else {
                    iAnimationAsBinder = this.this$0.asBinder();
                    int i8 = IAuthTabCallback + 107;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
                this.L$0 = access15400.onNavigationEvent(setripple);
                this.L$1 = access15400.onNavigationEvent(obj2);
                this.label = 1;
                if (ycxycx.onNavigationEvent(setripple, iAnimationAsBinder, this) == objOnWarmupCompleted) {
                    int i10 = IAuthTabCallback + 33;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r10 != null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        getPackageType getpackagetype;
        int i;
        Object obj;
        CmpServiceImpl cmpServiceImpl = (CmpServiceImpl) objArr[0];
        IAuthTabCallbackStub iAuthTabCallbackStub2 = (access13800) objArr[1];
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 75;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if (iAuthTabCallbackStub2 instanceof IAuthTabCallbackStub) {
            iAuthTabCallbackStub = iAuthTabCallbackStub2;
            int i5 = iAuthTabCallbackStub.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStub.label = i5 - 2147483648;
            } else {
                iAuthTabCallbackStub = cmpServiceImpl.new IAuthTabCallbackStub(iAuthTabCallbackStub2);
            }
        }
        Object objOnExtraCallbackWithResult = iAuthTabCallbackStub.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallbackStub.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            getpackagetype = cmpServiceImpl.asInterface;
            if (getpackagetype != null) {
                if (!getpackagetype.onExtraCallback()) {
                    getpackagetype = null;
                }
            }
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = cmpServiceImpl.new IAuthTabCallback_Parcel(null);
            iAuthTabCallbackStub.L$0 = cmpServiceImpl;
            iAuthTabCallbackStub.label = 1;
            objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(iAuthTabCallback_Parcel, iAuthTabCallbackStub);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                int i7 = ICustomTabsCallbackStubProxy + 11;
                onActivityLayout = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 37 / 0;
                }
            }
            i = ICustomTabsCallbackStubProxy + 113;
            onActivityLayout = i % 128;
            if (i % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
        int i9 = onActivityLayout;
        int i10 = i9 + 109;
        ICustomTabsCallbackStubProxy = i10 % 128;
        int i11 = i10 % 2;
        if (i6 != 1) {
            int i12 = i9 + 15;
            int i13 = i12 % 128;
            ICustomTabsCallbackStubProxy = i13;
            if (i12 % 2 != 0 ? i6 != 2 : i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = i13 + 35;
            onActivityLayout = i14 % 128;
            if (i14 % 2 != 0) {
                cmpServiceImpl = (CmpServiceImpl) iAuthTabCallbackStub.L$2;
                obj = iAuthTabCallbackStub.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                int i15 = 65 / 0;
            } else {
                CmpServiceImpl cmpServiceImpl2 = (CmpServiceImpl) iAuthTabCallbackStub.L$2;
                obj = iAuthTabCallbackStub.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                cmpServiceImpl = cmpServiceImpl2;
            }
            getpackagetype = (getPackageType) obj;
            cmpServiceImpl.asInterface = getpackagetype;
            return Unit.INSTANCE;
        }
        cmpServiceImpl = (CmpServiceImpl) iAuthTabCallbackStub.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        getPackageType getpackagetype2 = (getPackageType) objOnExtraCallbackWithResult;
        iAuthTabCallbackStub.L$0 = objOnExtraCallbackWithResult;
        iAuthTabCallbackStub.L$1 = access15400.onNavigationEvent(getpackagetype2);
        iAuthTabCallbackStub.L$2 = cmpServiceImpl;
        iAuthTabCallbackStub.I$0 = 0;
        iAuthTabCallbackStub.label = 2;
        if (getpackagetype2.onNavigationEvent(iAuthTabCallbackStub) != objOnWarmupCompleted) {
            obj = objOnExtraCallbackWithResult;
            getpackagetype = (getPackageType) obj;
            cmpServiceImpl.asInterface = getpackagetype;
            return Unit.INSTANCE;
        }
        i = ICustomTabsCallbackStubProxy + 113;
        onActivityLayout = i % 128;
        if (i % 2 != 0) {
        }
    }

    @Override // o.CmpServiceImpld
    public void getInterfaceDescriptor() {
        synchronized (this) {
            getPackageType getpackagetype = this.access100;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
            this.access100 = maybeUpdateAnimatable.onNavigationEvent(this.onExtraCallbackWithResult, (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
            Unit unit = Unit.INSTANCE;
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private /* synthetic */ Object L$0;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return asbinderCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 72 / 0;
            return asbinderCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = CmpServiceImpl.this.new asBinder(access13800Var);
            asbinder.L$0 = obj;
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00cb -> B:17:0x0054). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            getCornerRadius getcornerradiusIAuthTabCallback;
            Long lOnExtraCallback;
            CmpServiceImpl cmpServiceImpl;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 101;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    int i6 = onExtraCallback;
                    int i7 = i6 + 73;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (i5 != 2) {
                        int i9 = i6 + 39;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        if (i5 == 3) {
                            ResultKt.onNavigationEvent(obj);
                            hasSupportedCmp hassupportedcmpOnExtraCallback = CmpServiceImpl.onExtraCallback(CmpServiceImpl.this);
                            Object[] objArr = {CmpServiceImpl.this};
                            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                            long jOnExtraCallback = hassupportedcmpOnExtraCallback.onExtraCallback(((Boolean) CmpServiceImpl.onExtraCallbackWithResult(1208938305, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, -1208938302)).booleanValue());
                            this.L$0 = findresandmsg;
                            this.label = 4;
                            if (formatMsgs.IAuthTabCallback(jOnExtraCallback, this) != objOnWarmupCompleted) {
                                if (findRes.onWarmupCompleted(findresandmsg)) {
                                    return Unit.INSTANCE;
                                }
                                int i11 = IAuthTabCallback + 93;
                                onExtraCallback = i11 % 128;
                                int i12 = i11 % 2;
                                CmpServiceImpl cmpServiceImpl2 = CmpServiceImpl.this;
                                this.L$0 = findresandmsg;
                                this.label = 1;
                                if (CmpServiceImpl.onNavigationEvent(cmpServiceImpl2, (access13800) this) != objOnWarmupCompleted) {
                                    cmpServiceImpl = CmpServiceImpl.this;
                                    this.L$0 = findresandmsg;
                                    this.label = 2;
                                    if (CmpServiceImpl.IAuthTabCallback(cmpServiceImpl, (access13800) this) != objOnWarmupCompleted) {
                                        getcornerradiusIAuthTabCallback = CmpServiceImpl.IAuthTabCallback(CmpServiceImpl.this);
                                        lOnExtraCallback = access14000.onExtraCallback(System.currentTimeMillis());
                                        this.L$0 = findresandmsg;
                                        this.label = 3;
                                        if (getcornerradiusIAuthTabCallback.emit(lOnExtraCallback, this) != objOnWarmupCompleted) {
                                            hasSupportedCmp hassupportedcmpOnExtraCallback2 = CmpServiceImpl.onExtraCallback(CmpServiceImpl.this);
                                            Object[] objArr2 = {CmpServiceImpl.this};
                                            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                                            long jOnExtraCallback2 = hassupportedcmpOnExtraCallback2.onExtraCallback(((Boolean) CmpServiceImpl.onExtraCallbackWithResult(1208938305, objArr2, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, -1208938302)).booleanValue());
                                            this.L$0 = findresandmsg;
                                            this.label = 4;
                                            if (formatMsgs.IAuthTabCallback(jOnExtraCallback2, this) != objOnWarmupCompleted) {
                                            }
                                        }
                                    }
                                }
                            }
                            i = onExtraCallback + 93;
                            IAuthTabCallback = i % 128;
                            if (i % 2 != 0) {
                                return objOnWarmupCompleted;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (i5 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        getcornerradiusIAuthTabCallback = CmpServiceImpl.IAuthTabCallback(CmpServiceImpl.this);
                        lOnExtraCallback = access14000.onExtraCallback(System.currentTimeMillis());
                        this.L$0 = findresandmsg;
                        this.label = 3;
                        if (getcornerradiusIAuthTabCallback.emit(lOnExtraCallback, this) != objOnWarmupCompleted) {
                        }
                        i = onExtraCallback + 93;
                        IAuthTabCallback = i % 128;
                        if (i % 2 != 0) {
                        }
                    }
                } else {
                    ResultKt.onNavigationEvent(obj);
                    cmpServiceImpl = CmpServiceImpl.this;
                    this.L$0 = findresandmsg;
                    this.label = 2;
                    if (CmpServiceImpl.IAuthTabCallback(cmpServiceImpl, (access13800) this) != objOnWarmupCompleted) {
                    }
                    i = onExtraCallback + 93;
                    IAuthTabCallback = i % 128;
                    if (i % 2 != 0) {
                    }
                }
            }
            ResultKt.onNavigationEvent(obj);
            int i13 = IAuthTabCallback + 49;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            if (findRes.onWarmupCompleted(findresandmsg)) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        CmpServiceImpla cmpServiceImplaIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        Object obj = null;
        if (cmpServiceImplaIAuthTabCallbackDefault != null) {
            int i2 = onActivityLayout + 85;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                if (!cmpServiceImplaIAuthTabCallbackDefault.onWarmupCompleted().isEmpty()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis < this.getInterfaceDescriptor) {
                        return Unit.INSTANCE;
                    }
                    this.getInterfaceDescriptor = jCurrentTimeMillis + Companion.onExtraCallback(this.asBinder);
                    this.asBinder++;
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(1494075526, new Object[]{this, access13800Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1494075525);
                    return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
                }
            } else {
                cmpServiceImplaIAuthTabCallbackDefault.onWarmupCompleted().isEmpty();
                obj.hashCode();
                throw null;
            }
        }
        this.asBinder = 0;
        this.getInterfaceDescriptor = 0L;
        if (cmpServiceImplaIAuthTabCallbackDefault != null) {
            int i3 = ICustomTabsCallbackStubProxy + 99;
            onActivityLayout = i3 % 128;
            if (i3 % 2 != 0) {
                cmpServiceImplaIAuthTabCallbackDefault.onExtraCallbackWithResult(isCivilized.onWarmupCompleted.onNavigationEvent(this.onMinimized));
                throw null;
            }
            if (cmpServiceImplaIAuthTabCallbackDefault.onExtraCallbackWithResult(isCivilized.onWarmupCompleted.onNavigationEvent(this.onMinimized))) {
                Object objOnExtraCallbackWithResult2 = onExtraCallbackWithResult(1494075526, new Object[]{this, access13800Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1494075525);
                if (objOnExtraCallbackWithResult2 == access14300.onWarmupCompleted()) {
                    return objOnExtraCallbackWithResult2;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onNavigationEvent(null), access13800Var);
        if (objOnExtraCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 59;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = CmpServiceImpl.this.new onNavigationEvent(access13800Var);
            int i2 = onWarmupCompleted + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 83 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            CmpServiceImpla cmpServiceImplaIAuthTabCallbackDefault;
            long jLongValue;
            Map mapOnNavigationEvent;
            Iterator it;
            int i;
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onWarmupCompleted + 79;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                jLongValue = this.J$0;
                it = (Iterator) this.L$2;
                mapOnNavigationEvent = (Map) this.L$1;
                cmpServiceImplaIAuthTabCallbackDefault = (CmpServiceImpla) this.L$0;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                cmpServiceImplaIAuthTabCallbackDefault = CmpServiceImpl.this.IAuthTabCallbackDefault();
                if (cmpServiceImplaIAuthTabCallbackDefault == null) {
                    Unit unit = Unit.INSTANCE;
                    int i5 = onWarmupCompleted + 95;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
                isCivilized iscivilized = isCivilized.onWarmupCompleted;
                jLongValue = ((Long) isCivilized.onNavigationEvent(new Object[]{iscivilized, iscivilized.onNavigationEvent(CmpServiceImpl.onExtraCallbackWithResult(CmpServiceImpl.this))}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1369965004, -1369965003)).longValue();
                mapOnNavigationEvent = CmpServiceImpl.onNavigationEvent(CmpServiceImpl.this);
                it = mapOnNavigationEvent.entrySet().iterator();
                int i6 = IAuthTabCallback + 117;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                i = 0;
            }
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                CmpServiceImplc cmpServiceImplc = (CmpServiceImplc) entry.getKey();
                getBorderRadius getborderradius = (getBorderRadius) entry.getValue();
                if (cmpServiceImplc.onNavigationEvent(jLongValue, cmpServiceImplaIAuthTabCallbackDefault)) {
                    this.L$0 = cmpServiceImplaIAuthTabCallbackDefault;
                    this.L$1 = access15400.onNavigationEvent(mapOnNavigationEvent);
                    this.L$2 = it;
                    this.L$3 = access15400.onNavigationEvent(entry);
                    this.L$4 = access15400.onNavigationEvent(cmpServiceImplc);
                    this.L$5 = access15400.onNavigationEvent(getborderradius);
                    this.J$0 = jLongValue;
                    this.I$0 = i;
                    this.I$1 = 0;
                    this.label = 1;
                    if (getborderradius.emit(cmpServiceImplc, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.CmpServiceImpld
    public void extraCallbackWithResult() {
        synchronized (this) {
            getPackageType getpackagetype = this.access100;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
            this.access100 = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.CmpServiceImpld
    public IAnimation<CmpServiceImplc> onWarmupCompleted(@NotNull CmpServiceImplc cmpServiceImplc) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 97;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cmpServiceImplc, "");
        getBorderRadius<CmpServiceImplc> getborderradius = this.writeTypedObject.get(cmpServiceImplc);
        if (getborderradius == null) {
            getBorderRadius<CmpServiceImplc> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
            this.writeTypedObject.put(cmpServiceImplc, getborderradiusOnWarmupCompleted);
            return getborderradiusOnWarmupCompleted;
        }
        int i4 = ICustomTabsCallbackStubProxy + 45;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return getborderradius;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallback(Throwable th) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        onFlowLoadFailed onflowloadfailedOnNavigationEvent = preloadCmp.onNavigationEvent(th);
        if (!(onflowloadfailedOnNavigationEvent instanceof onFlowLoadFailed.onExtraCallback)) {
            int i2 = onActivityLayout;
            int i3 = i2 + 33;
            ICustomTabsCallbackStubProxy = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                if (onflowloadfailedOnNavigationEvent instanceof onFlowLoadFailed.IAuthTabCallback) {
                    return;
                }
                if (!(onflowloadfailedOnNavigationEvent instanceof onFlowLoadFailed.onWarmupCompleted)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i4 = i2 + 93;
                ICustomTabsCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                AFd1mSDK.onExtraCallbackWithResult("ANDROID_NATIVE_ERROR_MarketTimeRepository", th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("stackTrace", RawQueries.onNavigationEvent(th, 0, 0, 3, (Object) null))), false, (Function1) null, 24, (Object) null);
                return;
            }
            boolean z = onflowloadfailedOnNavigationEvent instanceof onFlowLoadFailed.IAuthTabCallback;
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.CmpServiceImpld
    public void access000() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 81;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            extraCallbackWithResult();
            this.onExtraCallback.onWarmupCompleted((Object) null);
            getInterfaceDescriptor();
            int i3 = 73 / 0;
            return;
        }
        extraCallbackWithResult();
        this.onExtraCallback.onWarmupCompleted((Object) null);
        getInterfaceDescriptor();
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final long onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i3 % 128;
            long j = i3 % 2 == 0 ? onExtraCallback()[RangesKt.coerceIn(i, 0, ArraysKt.getLastIndex(onExtraCallback()))] : onExtraCallback()[RangesKt.coerceIn(i, 0, ArraysKt.getLastIndex(onExtraCallback()))];
            int i4 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final long[] onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            long[] jArrOnExtraCallbackWithResult = CmpServiceImpl.onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return jArrOnExtraCallbackWithResult;
        }
    }

    static {
        int i = ICustomTabsCallbackDefault + 13;
        onRelationshipValidationResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ CmpServiceImpla onNavigationEvent(CmpServiceImpl cmpServiceImpl, IntegratedTradingHoursDto integratedTradingHoursDto) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (CmpServiceImpla) onExtraCallbackWithResult(2115498015, new Object[]{cmpServiceImpl, integratedTradingHoursDto}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, -2115498013);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CmpServiceImpl cmpServiceImpl, String str, Throwable th) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(90417031, new Object[]{cmpServiceImpl, str, th}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, -90417027);
    }

    public static final /* synthetic */ void onWarmupCompleted(CmpServiceImpl cmpServiceImpl, Throwable th) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onExtraCallbackWithResult(-1135892113, new Object[]{cmpServiceImpl, th}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, 1135892113);
    }

    public static final /* synthetic */ boolean onTransact(CmpServiceImpl cmpServiceImpl) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Boolean) onExtraCallbackWithResult(1208938305, new Object[]{cmpServiceImpl}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, -1208938302)).booleanValue();
    }

    private final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return onExtraCallbackWithResult(1494075526, new Object[]{this, access13800Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, -1494075525);
    }
}
