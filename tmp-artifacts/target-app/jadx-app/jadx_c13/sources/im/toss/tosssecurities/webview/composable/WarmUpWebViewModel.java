package im.toss.tosssecurities.webview.composable;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.internal.ads.zziea;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.securities.core.router.spec.TossSecRoute;
import im.toss.tosssecurities.webview.TossSecuritiesWebView;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFi1kSDK;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.IAnimation;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.access8000;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getShine;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTileModeX;
import o.lambdaonInstallReferrerSetupFinished0;
import o.mergeParams;
import o.nSetPosition;
import o.onLoadStarted;
import o.setRipple;
import o.w_;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WarmUpWebViewModel extends ViewModel {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private final getBorderRadius<Unit> IAuthTabCallback;
    private final w_ IAuthTabCallbackDefault;
    private final TossSecRoute.Web IAuthTabCallbackStub;
    private WeakReference<ViewGroup> asBinder;
    private Map<String, String> asInterface;
    private boolean onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor<Boolean> onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor<TossSecuritiesWebView> onNavigationEvent;
    private final getTileModeX<Unit> onTransact;
    private final lambdaonInstallReferrerSetupFinished0 onWarmupCompleted;

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(zBooleanValue, zBooleanValue2);
        int i4 = IAuthTabCallbackStubProxy + 91;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        int i5 = 54 / 0;
        return Boolean.valueOf(zOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~i3;
        int i10 = (~(i7 | i8 | i9)) | (~(i | i3));
        int i11 = ~(i7 | i9);
        int i12 = i | i11;
        int i13 = (~(i3 | i5)) | i11 | (~(i8 | i5));
        int i14 = i5 + i + i2 + (296844165 * i4) + (1729652556 * i6);
        int i15 = i14 * i14;
        int i16 = ((i5 * 599922083) - 580124672) + (599922083 * i) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i2) + ((-279707648) * i4) + ((-265289728) * i6) + (2117271552 * i15);
        int i17 = (i5 * (-1181628991)) + 1322814002 + (i * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * Imgproc.COLOR_YUV2BGR_YVYU) + (i2 * (-1181629109)) + (i4 * (-698251017)) + (i6 * 1773125444) + (i15 * 938541056);
        int i18 = i16 + (i17 * i17 * (-109772800));
        return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    public WarmUpWebViewModel(@NotNull w_ w_Var, @NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, @NotNull TossSecRoute.Web web) {
        Intrinsics.checkNotNullParameter(w_Var, "");
        Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
        Intrinsics.checkNotNullParameter(web, "");
        this.IAuthTabCallbackDefault = w_Var;
        this.onWarmupCompleted = lambdaoninstallreferrersetupfinished0;
        this.IAuthTabCallbackStub = web;
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        getBorderRadius<Unit> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 1, null, 5, null);
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted;
        this.onTransact = ycxycx.onExtraCallbackWithResult((getBorderRadius) getborderradiusOnWarmupCompleted);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(w_Var.onNavigationEvent(lambdaoninstallreferrersetupfinished0, web.onWarmupCompleted()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asInterface = access8000.IAuthTabCallback();
        onLoadStarted.onExtraCallback(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        WarmUpWebViewModel warmUpWebViewModel = (WarmUpWebViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 7;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = warmUpWebViewModel.onExtraCallbackWithResult;
        if (i4 != 0) {
            int i5 = 89 / 0;
        }
        int i6 = i2 + 45;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    public static final /* synthetic */ lambdaonInstallReferrerSetupFinished0 IAuthTabCallback(WarmUpWebViewModel warmUpWebViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 67;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0 = warmUpWebViewModel.onWarmupCompleted;
        int i5 = i2 + 77;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return lambdaoninstallreferrersetupfinished0;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        WarmUpWebViewModel warmUpWebViewModel = (WarmUpWebViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        getBorderRadius<Unit> getborderradius = warmUpWebViewModel.IAuthTabCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return getborderradius;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(WarmUpWebViewModel warmUpWebViewModel, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 63;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        warmUpWebViewModel.onExtraCallback = z;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 51;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final w_ onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        w_ w_Var = this.IAuthTabCallbackDefault;
        int i5 = i3 + 31;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return w_Var;
    }

    public final TossSecRoute.Web onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        int i3 = i2 % 128;
        access000 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        TossSecRoute.Web web = this.IAuthTabCallbackStub;
        int i4 = i3 + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return web;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.tosssecurities.webview.composable.WarmUpWebViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass1 anonymousClass1 = WarmUpWebViewModel.this.new AnonymousClass1(access13800Var);
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 65 / 0;
            }
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(findresandmsg, access13800Var);
            if (i3 == 0) {
                anonymousClass1.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = anonymousClass1.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: im.toss.tosssecurities.webview.composable.WarmUpWebViewModel$1$onExtraCallback */
        public static final class onExtraCallback implements IAnimation<lambdaonInstallReferrerSetupFinished0> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ WarmUpWebViewModel IAuthTabCallback;
            final /* synthetic */ IAnimation onExtraCallback;

            /* renamed from: im.toss.tosssecurities.webview.composable.WarmUpWebViewModel$1$onExtraCallback$5, reason: invalid class name */
            public static final class AnonymousClass5<T> implements setRipple {
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;
                final /* synthetic */ WarmUpWebViewModel onExtraCallbackWithResult;
                final /* synthetic */ setRipple onWarmupCompleted;

                /* renamed from: im.toss.tosssecurities.webview.composable.WarmUpWebViewModel$1$onExtraCallback$5$1, reason: invalid class name and collision with other inner class name */
                public static final class C00021 extends ContinuationImpl {
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public C00021(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 21;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass5.this.emit(null, this);
                        if (i3 == 0) {
                            int i4 = 99 / 0;
                        }
                        int i5 = IAuthTabCallback + 37;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return objEmit;
                    }
                }

                public AnonymousClass5(setRipple setripple, WarmUpWebViewModel warmUpWebViewModel) {
                    this.onWarmupCompleted = setripple;
                    this.onExtraCallbackWithResult = warmUpWebViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r5
                  0x002b: PHI (r1v10 im.toss.tosssecurities.webview.composable.WarmUpWebViewModel$1$onExtraCallback$5$1) = 
                  (r1v9 im.toss.tosssecurities.webview.composable.WarmUpWebViewModel$1$onExtraCallback$5$1)
                  (r1v12 im.toss.tosssecurities.webview.composable.WarmUpWebViewModel$1$onExtraCallback$5$1)
                 binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
                  0x002b: PHI (r5v9 int) = (r5v8 int), (r5v11 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
                @Override // o.setRipple
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    C00021 c00021;
                    int i;
                    int i2 = 2 % 2;
                    if (access13800Var instanceof C00021) {
                        int i3 = onNavigationEvent + 1;
                        IAuthTabCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            c00021 = (C00021) access13800Var;
                            i = c00021.label;
                            int i4 = 84 / 0;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                c00021.label = i - 2147483648;
                            } else {
                                c00021 = new C00021(access13800Var);
                            }
                        } else {
                            c00021 = (C00021) access13800Var;
                            i = c00021.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                            }
                        }
                    }
                    Object obj2 = c00021.result;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i5 = c00021.label;
                    if (i5 != 0) {
                        int i6 = IAuthTabCallback + 77;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj2);
                    } else {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.onWarmupCompleted;
                        if (Intrinsics.areEqual((lambdaonInstallReferrerSetupFinished0) obj, WarmUpWebViewModel.IAuthTabCallback(this.onExtraCallbackWithResult))) {
                            c00021.L$0 = access15400.onNavigationEvent(obj);
                            c00021.L$1 = access15400.onNavigationEvent(c00021);
                            c00021.L$2 = access15400.onNavigationEvent(obj);
                            c00021.L$3 = access15400.onNavigationEvent(setripple);
                            c00021.I$0 = 0;
                            c00021.label = 1;
                            if (setripple.emit(obj, c00021) == objOnExtraCallback) {
                                return objOnExtraCallback;
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    int i7 = onNavigationEvent + 27;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return unit;
                }
            }

            public onExtraCallback(IAnimation iAnimation, WarmUpWebViewModel warmUpWebViewModel) {
                this.onExtraCallback = iAnimation;
                this.IAuthTabCallback = warmUpWebViewModel;
            }

            @Override // o.IAnimation
            public Object collect(setRipple<? super lambdaonInstallReferrerSetupFinished0> setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallback.collect(new AnonymousClass5(setripple, this.IAuthTabCallback), access13800Var);
                Object obj = null;
                if (objCollect != access14100.onExtraCallback()) {
                    Unit unit = Unit.INSTANCE;
                    int i2 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        return unit;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 57;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 59;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    return objCollect;
                }
                obj.hashCode();
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14100.onExtraCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {WarmUpWebViewModel.this.onExtraCallbackWithResult()};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                onExtraCallback onextracallback = new onExtraCallback((getTileModeX) w_.onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1157222595, -1157222594, iOnNavigationEvent2), WarmUpWebViewModel.this);
                final WarmUpWebViewModel warmUpWebViewModel = WarmUpWebViewModel.this;
                setRipple setripple = new setRipple() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewModel.1.3
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // o.setRipple
                    public /* synthetic */ Object emit(Object obj3, access13800 access13800Var) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 19;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((lambdaonInstallReferrerSetupFinished0) obj3, access13800Var);
                        int i7 = onNavigationEvent + 39;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 10 / 0;
                        }
                        return objOnExtraCallbackWithResult;
                    }

                    public final Object onExtraCallbackWithResult(lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, access13800<? super Unit> access13800Var) {
                        Object objOnWarmupCompleted;
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 21;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            Object[] objArr2 = {warmUpWebViewModel};
                            ((getSupportedHighSpeedResolutionsFor) WarmUpWebViewModel.onWarmupCompleted(-1356213840, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1356213841, objArr2, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).IAuthTabCallback(access14000.onNavigationEvent(true));
                            WarmUpWebViewModel.onExtraCallbackWithResult(warmUpWebViewModel, true);
                            Object[] objArr3 = {warmUpWebViewModel};
                            objOnWarmupCompleted = WarmUpWebViewModel.onWarmupCompleted(187483646, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -187483646, objArr3, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                        } else {
                            Object[] objArr4 = {warmUpWebViewModel};
                            ((getSupportedHighSpeedResolutionsFor) WarmUpWebViewModel.onWarmupCompleted(-1356213840, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1356213841, objArr4, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).IAuthTabCallback(access14000.onNavigationEvent(false));
                            WarmUpWebViewModel.onExtraCallbackWithResult(warmUpWebViewModel, false);
                            Object[] objArr5 = {warmUpWebViewModel};
                            objOnWarmupCompleted = WarmUpWebViewModel.onWarmupCompleted(187483646, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -187483646, objArr5, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                        }
                        Unit unit = Unit.INSTANCE;
                        ((getBorderRadius) objOnWarmupCompleted).onNavigationEvent(unit);
                        return unit;
                    }
                };
                this.label = 1;
                if (onextracallback.collect(setripple, this) == objOnExtraCallback) {
                    int i4 = IAuthTabCallback;
                    int i5 = i4 + 7;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 3;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i9 = onWarmupCompleted + 105;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<Boolean> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 35;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = this.onExtraCallbackWithResult;
        int i5 = i2 + 5;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    public final getTileModeX<Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getTileModeX<Unit> gettilemodex = this.onTransact;
        int i4 = i3 + 7;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return gettilemodex;
    }

    public final TossSecuritiesWebView IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) this.onNavigationEvent.onExtraCallbackWithResult();
        int i4 = access000 + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return tossSecuritiesWebView;
    }

    public void onCleared() throws Throwable {
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onCleared();
        w_ w_Var = this.IAuthTabCallbackDefault;
        lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0 = this.onWarmupCompleted;
        WeakReference<ViewGroup> weakReference = this.asBinder;
        if (weakReference != null) {
            int i4 = access000 + 77;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            viewGroup = weakReference.get();
            int i6 = access000 + 7;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        } else {
            viewGroup = null;
        }
        w_Var.onWarmupCompleted(lambdaoninstallreferrersetupfinished0, viewGroup);
        this.asBinder = null;
    }

    public final void onWarmupCompleted(@NotNull Map<String, String> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        onExtraCallback(map, new Function2() { // from class: im.toss.tosssecurities.webview.composable.WarmUpWebViewModel$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 75;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (i4 != 0) {
                    return Boolean.valueOf(((Boolean) WarmUpWebViewModel.onWarmupCompleted(-1806792132, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1806792134, new Object[]{Boolean.valueOf(zBooleanValue), Boolean.valueOf(((Boolean) obj2).booleanValue())}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue());
                }
                Boolean.valueOf(((Boolean) WarmUpWebViewModel.onWarmupCompleted(-1806792132, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1806792134, new Object[]{Boolean.valueOf(zBooleanValue), Boolean.valueOf(((Boolean) obj2).booleanValue())}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue());
                throw null;
            }
        });
        int i2 = access000 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return AFi1kSDK.onNavigationEvent(z2);
        }
        AFi1kSDK.onNavigationEvent(z2);
        throw null;
    }

    public static final class onExtraCallbackWithResult extends WebView.VisualStateCallback {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ long onExtraCallback;
        final /* synthetic */ TossSecuritiesWebView onExtraCallbackWithResult;
        final /* synthetic */ WarmUpWebViewModel onWarmupCompleted;

        onExtraCallbackWithResult(long j, WarmUpWebViewModel warmUpWebViewModel, TossSecuritiesWebView tossSecuritiesWebView) {
            this.onExtraCallback = j;
            this.onWarmupCompleted = warmUpWebViewModel;
            this.onExtraCallbackWithResult = tossSecuritiesWebView;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j) {
            int i = 2 % 2;
            if (this.onExtraCallback == j) {
                int i2 = IAuthTabCallback + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {this.onWarmupCompleted};
                ((getSupportedHighSpeedResolutionsFor) WarmUpWebViewModel.onWarmupCompleted(-1356213840, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1356213841, objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).IAuthTabCallback(Boolean.TRUE);
                WarmUpWebViewModel.onExtraCallbackWithResult(this.onWarmupCompleted, false);
                Object[] objArr2 = {this.onExtraCallbackWithResult, false, 1, null};
                TossSecuritiesWebView.onNavigationEvent(zziea.IAuthTabCallback(), -1855222746, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr2, 1855222747);
                int i4 = IAuthTabCallback + 71;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    public static final class onWarmupCompleted implements View.OnAttachStateChangeListener {
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ long onExtraCallback;
        final /* synthetic */ WarmUpWebViewModel onExtraCallbackWithResult;
        final /* synthetic */ TossSecuritiesWebView onNavigationEvent;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onTransact + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        public onWarmupCompleted(View view, TossSecuritiesWebView tossSecuritiesWebView, long j, WarmUpWebViewModel warmUpWebViewModel) {
            this.IAuthTabCallback = view;
            this.onNavigationEvent = tossSecuritiesWebView;
            this.onExtraCallback = j;
            this.onExtraCallbackWithResult = warmUpWebViewModel;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.removeOnAttachStateChangeListener(this);
            if (this.onNavigationEvent.getWindowToken() == null || !this.onNavigationEvent.isAttachedToWindow()) {
                WarmUpWebViewModel.onExtraCallbackWithResult(this.onExtraCallbackWithResult, false);
                return;
            }
            this.onNavigationEvent.postVisualStateCallback(this.onExtraCallback, new onExtraCallbackWithResult(this.onExtraCallback, this.onExtraCallbackWithResult, this.onNavigationEvent));
            int i4 = onWarmupCompleted + 89;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055 A[PHI: r0 r1
      0x0055: PHI (r0v32 im.toss.core.webkit.TossCoreWebView) = (r0v35 im.toss.core.webkit.TossCoreWebView), (r0v36 im.toss.core.webkit.TossCoreWebView) binds: [B:10:0x0053, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r1v12 long) = (r1v3 long), (r1v14 long) binds: [B:10:0x0053, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[PHI: r0 r1
      0x0065: PHI (r0v10 ??) = (r0v37 ??), (r0v38 ??) binds: [B:10:0x0053, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r1v4 long) = (r1v3 long), (r1v14 long) binds: [B:10:0x0053, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View, android.webkit.WebView, im.toss.tosssecurities.webview.TossSecuritiesWebView] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View, im.toss.tosssecurities.webview.TossSecuritiesWebView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(Map<String, String> map, Function2<? super Boolean, ? super Boolean, Boolean> function2) throws Throwable {
        long jCurrentTimeMillis;
        ?? r0;
        TossSecuritiesWebView tossSecuritiesWebView;
        Uri.Builder builderBuildUpon;
        String strOnWarmupCompleted;
        Uri uriBuild;
        TossCoreWebView tossCoreWebView;
        int i = 2 % 2;
        this.asInterface = map;
        if (function2.invoke(onWarmupCompleted().onExtraCallbackWithResult(), Boolean.valueOf(this.onExtraCallback)).booleanValue()) {
            int i2 = IAuthTabCallbackStubProxy + 59;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback = false;
                TossCoreWebView tossCoreWebViewIAuthTabCallback = IAuthTabCallback();
                jCurrentTimeMillis = System.currentTimeMillis();
                boolean z = !tossCoreWebViewIAuthTabCallback.isAttachedToWindow();
                tossCoreWebView = tossCoreWebViewIAuthTabCallback;
                r0 = tossCoreWebViewIAuthTabCallback;
                if (!z) {
                    int i3 = access000 + 71;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    if (r0.getWindowToken() == null || !r0.isAttachedToWindow()) {
                        onExtraCallbackWithResult(this, false);
                        int i5 = access000 + 35;
                        IAuthTabCallbackStubProxy = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        r0.postVisualStateCallback(jCurrentTimeMillis, new onExtraCallbackWithResult(jCurrentTimeMillis, this, r0));
                    }
                    tossSecuritiesWebView = r0;
                } else {
                    ?? r11 = tossCoreWebView;
                    r11.addOnAttachStateChangeListener(new onWarmupCompleted(r11, r11, jCurrentTimeMillis, this));
                    tossSecuritiesWebView = r11;
                }
            } else {
                this.onExtraCallback = true;
                TossCoreWebView tossCoreWebViewIAuthTabCallback2 = IAuthTabCallback();
                jCurrentTimeMillis = System.currentTimeMillis();
                boolean z2 = !tossCoreWebViewIAuthTabCallback2.isAttachedToWindow();
                tossCoreWebView = tossCoreWebViewIAuthTabCallback2;
                r0 = tossCoreWebViewIAuthTabCallback2;
                if (z2) {
                }
            }
            if (((Boolean) onWarmupCompleted().onExtraCallbackWithResult()).booleanValue()) {
                return;
            }
            Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{this.IAuthTabCallbackStub.onWarmupCompleted()});
            if (uri != null) {
                builderBuildUpon = uri.buildUpon();
            } else {
                int i7 = access000 + 29;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                builderBuildUpon = null;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int i9 = access000 + 41;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                String key = entry.getKey();
                String value = entry.getValue();
                if (builderBuildUpon != null) {
                    builderBuildUpon.appendQueryParameter(key, value);
                    int i11 = access000 + 57;
                    IAuthTabCallbackStubProxy = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            if (builderBuildUpon == null || (uriBuild = builderBuildUpon.build()) == null) {
                strOnWarmupCompleted = this.IAuthTabCallbackStub.onWarmupCompleted();
            } else {
                int i13 = access000 + 37;
                IAuthTabCallbackStubProxy = i13 % 128;
                int i14 = i13 % 2;
                strOnWarmupCompleted = uriBuild.toString();
                if (strOnWarmupCompleted == null) {
                }
            }
            String str = strOnWarmupCompleted;
            Uri uri2 = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{str});
            TossSecuritiesWebView.onExtraCallbackWithResult(tossSecuritiesWebView, str, false, (uri2 != null ? uri2.getQueryParameter("has-back") : null) != null, 2, null);
        }
    }

    public final void onNavigationEvent(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.asBinder = new WeakReference<>(viewGroup);
        int i2 = access000 + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
    }

    public final void onNavigationEvent(@NotNull Map<String, String> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            IAuthTabCallback().onResume();
            onWarmupCompleted(map);
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            IAuthTabCallback().onResume();
            onWarmupCompleted(map);
            int i3 = 10 / 0;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(boolean z, boolean z2) {
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2)};
        return ((Boolean) onWarmupCompleted(-1806792132, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1806792134, objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue();
    }

    public static final /* synthetic */ getSupportedHighSpeedResolutionsFor onNavigationEvent(WarmUpWebViewModel warmUpWebViewModel) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (getSupportedHighSpeedResolutionsFor) onWarmupCompleted(-1356213840, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1356213841, new Object[]{warmUpWebViewModel}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static final /* synthetic */ getBorderRadius onExtraCallback(WarmUpWebViewModel warmUpWebViewModel) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (getBorderRadius) onWarmupCompleted(187483646, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -187483646, new Object[]{warmUpWebViewModel}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }
}
