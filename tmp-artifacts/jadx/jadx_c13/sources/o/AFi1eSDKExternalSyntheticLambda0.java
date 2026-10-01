package o;

import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tosssecurities.webview.composable.RecoverableWebViewState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1eSDKExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function0<Unit> $onRecovery;
        final /* synthetic */ RecoverableWebViewState $state;
        final /* synthetic */ lambdaonInstallReferrerSetupFinished0 $webId;
        final /* synthetic */ w_ $webViewHolder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(w_ w_Var, lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, RecoverableWebViewState recoverableWebViewState, Function0<Unit> function0, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$webViewHolder = w_Var;
            this.$webId = lambdaoninstallreferrersetupfinished0;
            this.$state = recoverableWebViewState;
            this.$onRecovery = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$webViewHolder, this.$webId, this.$state, this.$onRecovery, access13800Var);
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i4 = IAuthTabCallback + 65;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 84 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.AFi1eSDKExternalSyntheticLambda0$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0017onExtraCallback implements IAnimation<lambdaonInstallReferrerSetupFinished0> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ lambdaonInstallReferrerSetupFinished0 onExtraCallback;
            final /* synthetic */ IAnimation onExtraCallbackWithResult;

            /* renamed from: o.AFi1eSDKExternalSyntheticLambda0$onExtraCallback$onExtraCallback$1, reason: invalid class name */
            public static final class AnonymousClass1<T> implements setRipple {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ setRipple IAuthTabCallback;
                final /* synthetic */ lambdaonInstallReferrerSetupFinished0 onWarmupCompleted;

                /* renamed from: o.AFi1eSDKExternalSyntheticLambda0$onExtraCallback$onExtraCallback$1$2, reason: invalid class name */
                public static final class AnonymousClass2 extends ContinuationImpl {
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass2(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 59;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object obj2 = null;
                        Object objEmit = AnonymousClass1.this.emit(null, this);
                        int i4 = IAuthTabCallback + 97;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objEmit;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }

                public AnonymousClass1(setRipple setripple, lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) {
                    this.IAuthTabCallback = setripple;
                    this.onWarmupCompleted = lambdaoninstallreferrersetupfinished0;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
                @Override // o.setRipple
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    AnonymousClass2 anonymousClass2;
                    int i = 2 % 2;
                    if (access13800Var instanceof AnonymousClass2) {
                        anonymousClass2 = (AnonymousClass2) access13800Var;
                        int i2 = anonymousClass2.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass2.label = i2 - 2147483648;
                        } else {
                            anonymousClass2 = new AnonymousClass2(access13800Var);
                            int i3 = onNavigationEvent + 17;
                            onExtraCallbackWithResult = i3 % 128;
                            int i4 = i3 % 2;
                        }
                    }
                    Object obj2 = anonymousClass2.result;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i5 = anonymousClass2.label;
                    if (i5 != 0) {
                        int i6 = onExtraCallbackWithResult + 111;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj2);
                    } else {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.IAuthTabCallback;
                        if (!(!Intrinsics.areEqual((lambdaonInstallReferrerSetupFinished0) obj, this.onWarmupCompleted))) {
                            anonymousClass2.L$0 = access15400.onNavigationEvent(obj);
                            anonymousClass2.L$1 = access15400.onNavigationEvent(anonymousClass2);
                            anonymousClass2.L$2 = access15400.onNavigationEvent(obj);
                            anonymousClass2.L$3 = access15400.onNavigationEvent(setripple);
                            anonymousClass2.I$0 = 0;
                            anonymousClass2.label = 1;
                            if (setripple.emit(obj, anonymousClass2) == objOnExtraCallback) {
                                int i7 = onExtraCallbackWithResult + 55;
                                onNavigationEvent = i7 % 128;
                                int i8 = i7 % 2;
                                return objOnExtraCallback;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            public C0017onExtraCallback(IAnimation iAnimation, lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) {
                this.onExtraCallbackWithResult = iAnimation;
                this.onExtraCallback = lambdaoninstallreferrersetupfinished0;
            }

            @Override // o.IAnimation
            public Object collect(setRipple<? super lambdaonInstallReferrerSetupFinished0> setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallbackWithResult.collect(new AnonymousClass1(setripple, this.onExtraCallback), access13800Var);
                if (objCollect != access14100.onExtraCallback()) {
                    Unit unit = Unit.INSTANCE;
                    int i2 = IAuthTabCallback + 95;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return unit;
                }
                int i4 = onNavigationEvent + 95;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objCollect;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$webViewHolder.onNavigationEvent(this.$webId)) {
                    this.$webViewHolder.IAuthTabCallback(this.$webId);
                    this.$state.onExtraCallback();
                    Function0<Unit> function0 = this.$onRecovery;
                    if (function0 != null) {
                        int i3 = onExtraCallback + 93;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        function0.invoke();
                        int i5 = onExtraCallback + 59;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                Object[] objArr = {this.$webViewHolder};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                C0017onExtraCallback c0017onExtraCallback = new C0017onExtraCallback((getTileModeX) w_.onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1157222595, -1157222594, iOnNavigationEvent2), this.$webId);
                final w_ w_Var = this.$webViewHolder;
                final lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0 = this.$webId;
                final RecoverableWebViewState recoverableWebViewState = this.$state;
                final Function0<Unit> function02 = this.$onRecovery;
                setRipple setripple = new setRipple() { // from class: o.AFi1eSDKExternalSyntheticLambda0.onExtraCallback.1
                    private static int asInterface = 1;
                    private static int onExtraCallback;

                    @Override // o.setRipple
                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = asInterface + 99;
                        onExtraCallback = i8 % 128;
                        lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished02 = (lambdaonInstallReferrerSetupFinished0) obj2;
                        if (i8 % 2 == 0) {
                            return onExtraCallback(lambdaoninstallreferrersetupfinished02, access13800Var);
                        }
                        onExtraCallback(lambdaoninstallreferrersetupfinished02, access13800Var);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final Object onExtraCallback(lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished02, access13800<? super Unit> access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = asInterface + 59;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        w_Var.IAuthTabCallback(lambdaoninstallreferrersetupfinished0);
                        recoverableWebViewState.onExtraCallback();
                        Function0<Unit> function03 = function02;
                        if (function03 != null) {
                            function03.invoke();
                            int i10 = asInterface + 79;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c0017onExtraCallback.collect(setripple, this) == objOnExtraCallback) {
                    int i7 = IAuthTabCallback + 103;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return objOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RecoverableWebViewState onWarmupCompleted(@NotNull w_ w_Var, @NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, @Nullable String str, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(w_Var, "");
        Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                lambdaoninstallreferrersetupfinished0.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            String strIAuthTabCallback = lambdaoninstallreferrersetupfinished0.IAuthTabCallback();
            if (strIAuthTabCallback == null) {
                int i5 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            } else {
                str2 = strIAuthTabCallback;
            }
        } else {
            str2 = str;
        }
        Function0<Unit> function02 = (i2 & 8) != 0 ? null : function0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1775655510, i, -1, "im.toss.tosssecurities.webview.composable.rememberRecoverableWebView (WebViewRecoveryHooks.kt:47)");
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w_Var);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        boolean z = true;
        if (!zOnNavigationEvent) {
            int i7 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 93 / 0;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new RecoverableWebViewState(w_Var.onNavigationEvent(lambdaoninstallreferrersetupfinished0, str2), notifyPublicListeners.onWarmupCompleted(0));
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
            } else if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        RecoverableWebViewState recoverableWebViewState = (RecoverableWebViewState) objOnMinimized;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(w_Var);
        boolean z2 = (((i & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(lambdaoninstallreferrersetupfinished0)) || (i & 48) == 32;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(recoverableWebViewState);
        if ((((i & 7168) ^ 3072) <= 2048 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02)) && (i & 3072) != 2048) {
            z = false;
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | z2 | zOnNavigationEvent2 | z)) {
            int i9 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 51 / 0;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    onExtraCallback onextracallback = new onExtraCallback(w_Var, lambdaoninstallreferrersetupfinished0, recoverableWebViewState, function02, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onextracallback);
                    objOnMinimized2 = onextracallback;
                }
            } else if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(w_Var, lambdaoninstallreferrersetupfinished0, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, i & 126);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = 32 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return recoverableWebViewState;
    }
}
