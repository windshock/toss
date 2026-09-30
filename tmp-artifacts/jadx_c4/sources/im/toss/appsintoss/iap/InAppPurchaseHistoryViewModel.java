package im.toss.appsintoss.iap;

import androidx.lifecycle.ViewModel;
import im.toss.appsintoss.iap.model.AppsInTossPurchaseHistoryInfo;
import im.toss.appsintoss.iap.model.AppsInTossPurchasedHistoryItem;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.IAnimation;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda26;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda29;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda32;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda39;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.WebResourceResponseModel;
import o.WindowInfoTrackerCompanionExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.findResAndMsg;
import o.getCornerRadius;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.setRipple;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InAppPurchaseHistoryViewModel extends ViewModel {
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult;
    private final String IAuthTabCallback;
    private final SimpleDateFormat IAuthTabCallbackDefault;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8 IAuthTabCallbackStub;
    private final IAnimation<Boolean> IAuthTabCallbackStubProxy;
    private final setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15> access100;
    private final SimpleDateFormat asBinder;
    private final IAnimation<Boolean> asInterface;
    private final String getInterfaceDescriptor;
    private final getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15> onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final getCornerRadius<String> onNavigationEvent;
    private final SimpleDateFormat onTransact;
    private static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onWarmupCompleted = 8;

    static {
        int i = access000 + 113;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i4 | i3);
        int i8 = ~(i3 | i6);
        int i9 = i7 | i8;
        int i10 = ~i4;
        int i11 = ~i3;
        int i12 = (~(i10 | i6)) | (~(i10 | i11)) | (~(i11 | i6));
        int i13 = ~i6;
        int i14 = i12 | (~(i13 | i4 | i3));
        int i15 = (~(i13 | i11)) | i4 | i8;
        int i16 = i4 + i3 + i2 + (1962400304 * i5) + (1167700406 * i);
        int i17 = i16 * i16;
        int i18 = ((i4 * (-1019457937)) - 559939584) + ((-1019457937) * i3) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i2) + ((-1660944384) * i5) + ((-325058560) * i) + (867827712 * i17);
        int i19 = ((i4 * (-1629562239)) - 1134582380) + (i3 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i2 * (-1629561329)) + (i5 * (-1621399344)) + (i * (-873382486)) + (i17 * 1407582208);
        int i20 = i18 + (i19 * i19 * (-1895432192));
        return i20 != 1 ? i20 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    @Inject
    public InAppPurchaseHistoryViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8 safeActivityEmbeddingComponentProviderExternalSyntheticLambda8) throws Throwable {
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda8, "");
        this.IAuthTabCallbackStub = safeActivityEmbeddingComponentProviderExternalSyntheticLambda8;
        getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15(true, null, null, 6, null));
        this.onExtraCallback = getcornerradiusOnNavigationEvent;
        setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15> setrubinOnExtraCallback = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        this.access100 = setrubinOnExtraCallback;
        this.IAuthTabCallbackStubProxy = new onExtraCallbackWithResult(setrubinOnExtraCallback);
        String str = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("miniAppName");
        this.getInterfaceDescriptor = str;
        String str2 = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("category");
        this.IAuthTabCallback = str2;
        String str3 = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("deploymentId");
        this.onExtraCallbackWithResult = str3;
        getCornerRadius<String> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent((Object) null);
        this.onNavigationEvent = getcornerradiusOnNavigationEvent2;
        this.asInterface = new onExtraCallback(ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent2));
        this.IAuthTabCallbackDefault = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.onTransact = new SimpleDateFormat("yyyy년 M월 d일");
        this.asBinder = new SimpleDateFormat("M월 d일");
        IAuthTabCallback("init", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("mini_app_name", str), getWrite.IAuthTabCallback("category", str2), getWrite.IAuthTabCallback("deployment_id", str3), getWrite.IAuthTabCallback("initial_page_key", getcornerradiusOnNavigationEvent2.IAuthTabCallback())}));
        onWarmupCompleted();
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallback(InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15> getcornerradius = inAppPurchaseHistoryViewModel.onExtraCallback;
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return getcornerradius;
    }

    public static final /* synthetic */ getCornerRadius onExtraCallback(InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 75;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<String> getcornerradius = inAppPurchaseHistoryViewModel.onNavigationEvent;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 39;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel = (InAppPurchaseHistoryViewModel) objArr[0];
        List<AppsInTossPurchasedHistoryItem> list = (List) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return inAppPurchaseHistoryViewModel.IAuthTabCallback(list, str, zBooleanValue);
        }
        inAppPurchaseHistoryViewModel.IAuthTabCallback(list, str, zBooleanValue);
        throw null;
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8 onNavigationEvent(InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8 safeActivityEmbeddingComponentProviderExternalSyntheticLambda8 = inAppPurchaseHistoryViewModel.IAuthTabCallbackStub;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 111;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda8;
    }

    public static final /* synthetic */ void onNavigationEvent(InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, String str, Map map) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryViewModel.IAuthTabCallback(str, (Map<String, ? extends Object>) map);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
    }

    public final setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15> setrubin = this.access100;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return setrubin;
    }

    public final IAnimation<Boolean> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAnimation<Boolean> iAnimation = this.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return iAnimation;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getInterfaceDescriptor;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel = (InAppPurchaseHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 121;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String str = inAppPurchaseHistoryViewModel.IAuthTabCallback;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 77;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class onExtraCallback implements IAnimation<Boolean> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ IAnimation onWarmupCompleted;

        /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryViewModel$onExtraCallback$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements setRipple {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ setRipple IAuthTabCallback;

            /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryViewModel$onExtraCallback$2$4, reason: invalid class name */
            public static final class AnonymousClass4 extends ContinuationImpl {
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass4(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 35;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass2.this.emit(null, this);
                    int i4 = onNavigationEvent + 17;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return objEmit;
                }
            }

            public AnonymousClass2(setRipple setripple) {
                this.IAuthTabCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass4 anonymousClass4;
                int i = 2 % 2;
                if (access13800Var instanceof AnonymousClass4) {
                    anonymousClass4 = (AnonymousClass4) access13800Var;
                    int i2 = anonymousClass4.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        int i3 = onExtraCallbackWithResult + 29;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        anonymousClass4.label = i2 - 2147483648;
                    } else {
                        anonymousClass4 = new AnonymousClass4(access13800Var);
                    }
                }
                Object obj2 = anonymousClass4.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = anonymousClass4.label;
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.IAuthTabCallback;
                    Boolean boolOnNavigationEvent = access14000.onNavigationEvent(((String) obj) != null);
                    anonymousClass4.L$0 = access15400.onNavigationEvent(obj);
                    anonymousClass4.L$1 = access15400.onNavigationEvent(anonymousClass4);
                    anonymousClass4.L$2 = access15400.onNavigationEvent(obj);
                    anonymousClass4.L$3 = access15400.onNavigationEvent(setripple);
                    anonymousClass4.I$0 = 0;
                    anonymousClass4.label = 1;
                    if (setripple.emit(boolOnNavigationEvent, anonymousClass4) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj2);
                    int i6 = onExtraCallbackWithResult + 3;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
                return Unit.INSTANCE;
            }
        }

        public onExtraCallback(IAnimation iAnimation) {
            this.onWarmupCompleted = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onWarmupCompleted.collect(new AnonymousClass2(setripple), access13800Var);
            if (objCollect != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = onNavigationEvent;
            int i3 = i2 + 107;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objCollect;
        }
    }

    public static final class onExtraCallbackWithResult implements IAnimation<Boolean> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ IAnimation IAuthTabCallback;

        /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryViewModel$onExtraCallbackWithResult$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements setRipple {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ setRipple onExtraCallbackWithResult;

            /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryViewModel$onExtraCallbackWithResult$4$1, reason: invalid class name */
            public static final class AnonymousClass1 extends ContinuationImpl {
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass1(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 97;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass4.this.emit(null, this);
                    int i4 = IAuthTabCallback + 67;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objEmit;
                    }
                    throw null;
                }
            }

            public AnonymousClass4(setRipple setripple) {
                this.onExtraCallbackWithResult = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass1 anonymousClass1;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 60 / 0;
                    if (access13800Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) access13800Var;
                        int i4 = anonymousClass1.label;
                        if ((i4 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i4 - 2147483648;
                        } else {
                            anonymousClass1 = new AnonymousClass1(access13800Var);
                        }
                    }
                } else if (!(access13800Var instanceof AnonymousClass1)) {
                }
                Object obj2 = anonymousClass1.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = anonymousClass1.label;
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.onExtraCallbackWithResult;
                    Boolean boolOnNavigationEvent = access14000.onNavigationEvent(((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) obj).onNavigationEvent());
                    anonymousClass1.L$0 = access15400.onNavigationEvent(obj);
                    anonymousClass1.L$1 = access15400.onNavigationEvent(anonymousClass1);
                    anonymousClass1.L$2 = access15400.onNavigationEvent(obj);
                    anonymousClass1.L$3 = access15400.onNavigationEvent(setripple);
                    anonymousClass1.I$0 = 0;
                    anonymousClass1.label = 1;
                    if (setripple.emit(boolOnNavigationEvent, anonymousClass1) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = IAuthTabCallback + 27;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj2);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public onExtraCallbackWithResult(IAnimation iAnimation) {
            this.IAuthTabCallback = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.IAuthTabCallback.collect(new AnonymousClass4(setripple), access13800Var);
            if (objCollect != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = onNavigationEvent;
            int i3 = i2 + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 123;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objCollect;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        IAuthTabCallback("fetch_start", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("page_key", this.onNavigationEvent.IAuthTabCallback()), getWrite.IAuthTabCallback("mini_app_name", this.getInterfaceDescriptor), getWrite.IAuthTabCallback("category", this.IAuthTabCallback), getWrite.IAuthTabCallback("deployment_id", this.onExtraCallbackWithResult)}));
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i2 = extraCallback + 71;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = InAppPurchaseHistoryViewModel.this.new onWarmupCompleted(access13800Var);
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            boolean z;
            AppsInTossPurchaseHistoryInfo appsInTossPurchaseHistoryInfo;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 107;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel = InAppPurchaseHistoryViewModel.this;
                    Result.Companion companion = Result.Companion;
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8 safeActivityEmbeddingComponentProviderExternalSyntheticLambda8OnNavigationEvent = InAppPurchaseHistoryViewModel.onNavigationEvent(inAppPurchaseHistoryViewModel);
                    String str = (String) InAppPurchaseHistoryViewModel.onExtraCallback(inAppPurchaseHistoryViewModel).IAuthTabCallback();
                    String strOnExtraCallback = inAppPurchaseHistoryViewModel.onExtraCallback();
                    String str2 = (String) InAppPurchaseHistoryViewModel.onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{inAppPurchaseHistoryViewModel}, 824788007, -824788007, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = safeActivityEmbeddingComponentProviderExternalSyntheticLambda8OnNavigationEvent.onExtraCallback(str, strOnExtraCallback, str2, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                appsInTossPurchaseHistoryInfo = (AppsInTossPurchaseHistoryInfo) obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (appsInTossPurchaseHistoryInfo == null) {
                throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda26.onExtraCallbackWithResult;
            }
            obj2 = Result.constructor-impl(appsInTossPurchaseHistoryInfo);
            InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel2 = InAppPurchaseHistoryViewModel.this;
            if (Result.onNavigationEvent(obj2)) {
                int i4 = onNavigationEvent + 85;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                AppsInTossPurchaseHistoryInfo appsInTossPurchaseHistoryInfo2 = (AppsInTossPurchaseHistoryInfo) obj2;
                InAppPurchaseHistoryViewModel.onNavigationEvent(inAppPurchaseHistoryViewModel2, "fetch_success", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("fetched_orders_count", access14000.onNavigationEvent(appsInTossPurchaseHistoryInfo2.onNavigationEvent().size())), getWrite.IAuthTabCallback("next_page_key", appsInTossPurchaseHistoryInfo2.onExtraCallback()), getWrite.IAuthTabCallback("current_items_count", access14000.onNavigationEvent(((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) inAppPurchaseHistoryViewModel2.onNavigationEvent().IAuthTabCallback()).IAuthTabCallback().size()))}));
                InAppPurchaseHistoryViewModel.onExtraCallback(inAppPurchaseHistoryViewModel2).onWarmupCompleted(appsInTossPurchaseHistoryInfo2.onExtraCallback());
                getCornerRadius getcornerradiusIAuthTabCallback = InAppPurchaseHistoryViewModel.IAuthTabCallback(inAppPurchaseHistoryViewModel2);
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 safeActivityEmbeddingComponentProviderExternalSyntheticLambda15 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) inAppPurchaseHistoryViewModel2.onNavigationEvent().IAuthTabCallback();
                List<AppsInTossPurchasedHistoryItem> listOnNavigationEvent = appsInTossPurchaseHistoryInfo2.onNavigationEvent();
                if (appsInTossPurchaseHistoryInfo2.onExtraCallback() != null) {
                    int i6 = onNavigationEvent + 31;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                } else {
                    int i8 = onWarmupCompleted + 63;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                }
                getcornerradiusIAuthTabCallback.onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.onExtraCallbackWithResult(false, InAppPurchaseHistoryViewModel.onWarmupCompleted(inAppPurchaseHistoryViewModel2, listOnNavigationEvent, null, z, 1, null), null));
            }
            InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel3 = InAppPurchaseHistoryViewModel.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                InAppPurchaseHistoryViewModel.onNavigationEvent(inAppPurchaseHistoryViewModel3, "fetch_failure", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("page_key", InAppPurchaseHistoryViewModel.onExtraCallback(inAppPurchaseHistoryViewModel3).IAuthTabCallback()), getWrite.IAuthTabCallback("mini_app_name", inAppPurchaseHistoryViewModel3.onExtraCallback()), getWrite.IAuthTabCallback("category", (String) InAppPurchaseHistoryViewModel.onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{inAppPurchaseHistoryViewModel3}, 824788007, -824788007, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())), getWrite.IAuthTabCallback("error", th.toString()), getWrite.IAuthTabCallback("error_message", th.getMessage())}));
                getCornerRadius getcornerradiusIAuthTabCallback2 = InAppPurchaseHistoryViewModel.IAuthTabCallback(inAppPurchaseHistoryViewModel3);
                do {
                } while (!getcornerradiusIAuthTabCallback2.onWarmupCompleted(r0, new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15(false, null, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17.PageLoadError, 3, null)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallbackWithResult() throws Throwable {
        Object objIAuthTabCallback;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 safeActivityEmbeddingComponentProviderExternalSyntheticLambda15;
        ArrayList arrayList;
        int i = 2 % 2;
        if (((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) this.access100.IAuthTabCallback()).onNavigationEvent()) {
            int i2 = extraCallbackWithResult + 91;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback("fetch_more_skipped", access8100.onNavigationEvent(getWrite.IAuthTabCallback("is_loading", Boolean.TRUE)));
            return;
        }
        IAuthTabCallback("fetch_more_start", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("page_key", this.onNavigationEvent.IAuthTabCallback()), getWrite.IAuthTabCallback("mini_app_info", new WindowInfoTrackerCompanionExternalSyntheticLambda0(this.onExtraCallbackWithResult, this.getInterfaceDescriptor, null, 4, null).toString()), getWrite.IAuthTabCallback("current_items_count", Integer.valueOf(((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) this.access100.IAuthTabCallback()).IAuthTabCallback().size()))}));
        getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15> getcornerradius = this.onExtraCallback;
        do {
            objIAuthTabCallback = getcornerradius.IAuthTabCallback();
            safeActivityEmbeddingComponentProviderExternalSyntheticLambda15 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) objIAuthTabCallback;
            List<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30> listIAuthTabCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.IAuthTabCallback();
            arrayList = new ArrayList();
            for (Object obj : listIAuthTabCallback) {
                if (!(((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30) obj) instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda39)) {
                    int i4 = extraCallback + 43;
                    extraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        arrayList.add(obj);
                        throw null;
                    }
                    arrayList.add(obj);
                }
            }
        } while (!getcornerradius.onWarmupCompleted(objIAuthTabCallback, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15.IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda15, false, arrayList, null, 5, null)));
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = InAppPurchaseHistoryViewModel.this.new IAuthTabCallback(access13800Var);
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 80 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 3;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object objIAuthTabCallback;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 safeActivityEmbeddingComponentProviderExternalSyntheticLambda15;
            Object objIAuthTabCallback2;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 safeActivityEmbeddingComponentProviderExternalSyntheticLambda152;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38 safeActivityEmbeddingComponentProviderExternalSyntheticLambda38;
            String strAsBinder;
            List<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30> listIAuthTabCallback;
            List<AppsInTossPurchasedHistoryItem> listOnNavigationEvent;
            boolean z;
            AppsInTossPurchasedHistoryItem appsInTossPurchasedHistoryItemOnExtraCallback;
            Object objOnExtraCallback;
            AppsInTossPurchaseHistoryInfo appsInTossPurchaseHistoryInfo;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel = InAppPurchaseHistoryViewModel.this;
                    Result.Companion companion = Result.Companion;
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8 safeActivityEmbeddingComponentProviderExternalSyntheticLambda8OnNavigationEvent = InAppPurchaseHistoryViewModel.onNavigationEvent(inAppPurchaseHistoryViewModel);
                    String str = (String) InAppPurchaseHistoryViewModel.onExtraCallback(inAppPurchaseHistoryViewModel).IAuthTabCallback();
                    String strOnExtraCallback = inAppPurchaseHistoryViewModel.onExtraCallback();
                    String str2 = (String) InAppPurchaseHistoryViewModel.onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{inAppPurchaseHistoryViewModel}, 824788007, -824788007, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objOnExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda8OnNavigationEvent.onExtraCallback(str, strOnExtraCallback, str2, this);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = obj;
                }
                appsInTossPurchaseHistoryInfo = (AppsInTossPurchaseHistoryInfo) objOnExtraCallback;
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (appsInTossPurchaseHistoryInfo == null) {
                throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda26.onExtraCallbackWithResult;
            }
            obj2 = Result.constructor-impl(appsInTossPurchaseHistoryInfo);
            InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel2 = InAppPurchaseHistoryViewModel.this;
            if (Result.onNavigationEvent(obj2)) {
                int i3 = onWarmupCompleted + 83;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AppsInTossPurchaseHistoryInfo appsInTossPurchaseHistoryInfo2 = (AppsInTossPurchaseHistoryInfo) obj2;
                InAppPurchaseHistoryViewModel.onNavigationEvent(inAppPurchaseHistoryViewModel2, "fetch_more_success", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("fetched_orders_count", access14000.onNavigationEvent(appsInTossPurchaseHistoryInfo2.onNavigationEvent().size())), getWrite.IAuthTabCallback("next_page_key", appsInTossPurchaseHistoryInfo2.onExtraCallback()), getWrite.IAuthTabCallback("previous_page_key", InAppPurchaseHistoryViewModel.onExtraCallback(inAppPurchaseHistoryViewModel2).IAuthTabCallback())}));
                InAppPurchaseHistoryViewModel.onExtraCallback(inAppPurchaseHistoryViewModel2).onWarmupCompleted(appsInTossPurchaseHistoryInfo2.onExtraCallback());
                getCornerRadius getcornerradiusIAuthTabCallback = InAppPurchaseHistoryViewModel.IAuthTabCallback(inAppPurchaseHistoryViewModel2);
                do {
                    objIAuthTabCallback2 = getcornerradiusIAuthTabCallback.IAuthTabCallback();
                    safeActivityEmbeddingComponentProviderExternalSyntheticLambda152 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) objIAuthTabCallback2;
                    Object objLast = CollectionsKt.last(safeActivityEmbeddingComponentProviderExternalSyntheticLambda152.IAuthTabCallback());
                    if (!(objLast instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38)) {
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda38 = null;
                    } else {
                        int i5 = onNavigationEvent + 75;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda38 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38) objLast;
                    }
                    if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda38 == null || (appsInTossPurchasedHistoryItemOnExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda38.onExtraCallback()) == null) {
                        strAsBinder = null;
                    } else {
                        int i7 = onNavigationEvent + 67;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 != 0) {
                            appsInTossPurchasedHistoryItemOnExtraCallback.asBinder();
                            throw null;
                        }
                        strAsBinder = appsInTossPurchasedHistoryItemOnExtraCallback.asBinder();
                    }
                    listIAuthTabCallback = ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) inAppPurchaseHistoryViewModel2.onNavigationEvent().IAuthTabCallback()).IAuthTabCallback();
                    listOnNavigationEvent = appsInTossPurchaseHistoryInfo2.onNavigationEvent();
                    if (appsInTossPurchaseHistoryInfo2.onExtraCallback() != null) {
                        int i8 = onWarmupCompleted + 105;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                } while (!getcornerradiusIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda152.onExtraCallbackWithResult(false, CollectionsKt.plus(listIAuthTabCallback, (List) InAppPurchaseHistoryViewModel.onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{inAppPurchaseHistoryViewModel2, listOnNavigationEvent, strAsBinder, Boolean.valueOf(z)}, 1648536677, -1648536676, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())), null)));
            }
            InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel3 = InAppPurchaseHistoryViewModel.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                InAppPurchaseHistoryViewModel.onNavigationEvent(inAppPurchaseHistoryViewModel3, "fetch_more_failure", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("page_key", InAppPurchaseHistoryViewModel.onExtraCallback(inAppPurchaseHistoryViewModel3).IAuthTabCallback()), getWrite.IAuthTabCallback("error", th.toString()), getWrite.IAuthTabCallback("error_message", th.getMessage())}));
                getCornerRadius getcornerradiusIAuthTabCallback2 = InAppPurchaseHistoryViewModel.IAuthTabCallback(inAppPurchaseHistoryViewModel3);
                do {
                    objIAuthTabCallback = getcornerradiusIAuthTabCallback2.IAuthTabCallback();
                    safeActivityEmbeddingComponentProviderExternalSyntheticLambda15 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) objIAuthTabCallback;
                } while (!getcornerradiusIAuthTabCallback2.onWarmupCompleted(objIAuthTabCallback, safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.onExtraCallbackWithResult(false, CollectionsKt.plus(safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.IAuthTabCallback(), SafeActivityEmbeddingComponentProviderExternalSyntheticLambda39.onWarmupCompleted), SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17.FetchMoreError)));
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ List onWarmupCompleted(InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, List list, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = extraCallbackWithResult + 13;
            extraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 38 / 0;
            }
            str = null;
        }
        List<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30> listIAuthTabCallback = inAppPurchaseHistoryViewModel.IAuthTabCallback(list, str, z);
        int i5 = extraCallback + 15;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return listIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30> IAuthTabCallback(List<AppsInTossPurchasedHistoryItem> list, String str, boolean z) {
        Object obj;
        String str2;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            AppsInTossPurchasedHistoryItem appsInTossPurchasedHistoryItem = (AppsInTossPurchasedHistoryItem) it.next();
            if (str != null) {
                int i2 = extraCallbackWithResult + 35;
                extraCallback = i2 % 128;
                int i3 = i2 % 2;
                if (!((Boolean) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, str, appsInTossPurchasedHistoryItem.asBinder()}, 892297170, -892297168, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).booleanValue()) {
                    try {
                        Result.Companion companion = Result.Companion;
                        Date date = this.IAuthTabCallbackDefault.parse(appsInTossPurchasedHistoryItem.asBinder());
                        if (date != null) {
                            int i4 = Calendar.getInstance().get(1);
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(date);
                            Unit unit = Unit.INSTANCE;
                            if (i4 == calendar.get(1)) {
                                str2 = this.asBinder.format(date);
                            } else {
                                str2 = this.onTransact.format(date);
                                int i5 = extraCallback + 49;
                                extraCallbackWithResult = i5 % 128;
                                int i6 = i5 % 2;
                            }
                        } else {
                            str2 = null;
                        }
                        obj = Result.constructor-impl(str2);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (!(!Result.onExtraCallback(obj))) {
                        int i7 = extraCallback + 33;
                        extraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        obj2 = obj;
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        arrayList.add(new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda32(str3));
                    }
                }
            }
            str = appsInTossPurchasedHistoryItem.asBinder();
            arrayList.add(new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38(appsInTossPurchasedHistoryItem));
        }
        if (z && ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) this.access100.IAuthTabCallback()).onExtraCallback() == SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17.FetchMoreError) {
            int i9 = extraCallback + 69;
            extraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                arrayList.add(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda39.onWarmupCompleted);
                throw null;
            }
            arrayList.add(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda39.onWarmupCompleted);
        } else if (z) {
            int i10 = extraCallbackWithResult + 51;
            extraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                arrayList.add(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda29.IAuthTabCallback);
                throw null;
            }
            arrayList.add(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda29.IAuthTabCallback);
        }
        return CollectionsKt.toList(arrayList);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String strSubstring;
        String strSubstring2;
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallback + 77;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            strSubstring = str.substring(0, 87);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            strSubstring2 = str2.substring(0, 69);
        } else {
            strSubstring = str.substring(0, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            strSubstring2 = str2.substring(0, 10);
        }
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return Boolean.valueOf(Intrinsics.areEqual(strSubstring, strSubstring2));
    }

    private final void IAuthTabCallback(String str, Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "apps_in_toss_purchase_history", (String) null, access8100.onWarmupCompleted(access8100.onNavigationEvent(getWrite.IAuthTabCallback("event", str)), map), (String) null, false, (String) null, 58, (Object) null);
        int i4 = extraCallback + 17;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static final /* synthetic */ List onExtraCallbackWithResult(InAppPurchaseHistoryViewModel inAppPurchaseHistoryViewModel, List list, String str, boolean z) {
        Object[] objArr = {inAppPurchaseHistoryViewModel, list, str, Boolean.valueOf(z)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (List) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, 1648536677, -1648536676, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback);
    }

    private final boolean IAuthTabCallback(String str, String str2) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return ((Boolean) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback2, new Object[]{this, str, str2}, 892297170, -892297168, iOnExtraCallback3, iOnExtraCallback)).booleanValue();
    }

    public final String IAuthTabCallback() {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (String) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback2, new Object[]{this}, 824788007, -824788007, iOnExtraCallback3, iOnExtraCallback);
    }
}
