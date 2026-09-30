package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.isBaseLayerReady;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isBaseLayerReady {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(IAnimation iAnimation, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        onNavigationEvent(iAnimation, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static final void onNavigationEvent(@NotNull final IAnimation<? extends initialiseBaseLayer> iAnimation, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(iAnimation, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1186882170);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAnimation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1186882170, i2, -1, "viva.republica.toss.guest.certify.event.OnboardingUserInfoEventEffect (OnboardingUserInfoEventEffect.kt:15)");
            }
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAnimation);
            boolean z = (i2 & 112) == 32;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnExtraCallback | zOnExtraCallback2 | z) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, iAnimation, function0, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(iAnimation, lifecycle, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.guest.certify.event.OnboardingUserInfoEventEffectKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return isBaseLayerReady.onWarmupCompleted(iAnimation, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ IAnimation<initialiseBaseLayer> $eventFlow;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $lifecycleOwner;
        final /* synthetic */ Function0<Unit> $showOverseasKoreanNfcBlockSheet;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, IAnimation<? extends initialiseBaseLayer> iAnimation, Function0<Unit> function0, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$lifecycleOwner = textFieldScrollKtExternalSyntheticLambda0;
            this.$eventFlow = iAnimation;
            this.$showOverseasKoreanNfcBlockSheet = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(this.$lifecycleOwner, this.$eventFlow, this.$showOverseasKoreanNfcBlockSheet, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: o.isBaseLayerReady$IAuthTabCallback$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ IAnimation<initialiseBaseLayer> $eventFlow;
            final /* synthetic */ Function0<Unit> $showOverseasKoreanNfcBlockSheet;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IAnimation<? extends initialiseBaseLayer> iAnimation, Function0<Unit> function0, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$eventFlow = iAnimation;
                this.$showOverseasKoreanNfcBlockSheet = function0;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass1(this.$eventFlow, this.$showOverseasKoreanNfcBlockSheet, access13800Var);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* renamed from: o.isBaseLayerReady$IAuthTabCallback$1$5, reason: invalid class name */
            static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                final /* synthetic */ IAnimation<initialiseBaseLayer> $eventFlow;
                final /* synthetic */ Function0<Unit> $showOverseasKoreanNfcBlockSheet;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(IAnimation<? extends initialiseBaseLayer> iAnimation, Function0<Unit> function0, access13800<? super AnonymousClass5> access13800Var) {
                    super(2, access13800Var);
                    this.$eventFlow = iAnimation;
                    this.$showOverseasKoreanNfcBlockSheet = function0;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new AnonymousClass5(this.$eventFlow, this.$showOverseasKoreanNfcBlockSheet, access13800Var);
                }

                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        IAnimation<initialiseBaseLayer> iAnimation = this.$eventFlow;
                        final Function0<Unit> function0 = this.$showOverseasKoreanNfcBlockSheet;
                        setRipple setripple = new setRipple() { // from class: o.isBaseLayerReady.IAuthTabCallback.1.5.5
                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                            public final Object emit(initialiseBaseLayer initialisebaselayer, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
                                if (!(initialisebaselayer instanceof initialiseBaseLayer$onWarmupCompleted)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                function0.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (iAnimation.collect(setripple, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$eventFlow, this.$showOverseasKoreanNfcBlockSheet, null);
                    this.label = 1;
                    if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass5, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.$lifecycleOwner;
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$eventFlow, this.$showOverseasKoreanNfcBlockSheet, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, onextracallback, anonymousClass1, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
