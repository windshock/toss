package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.isInVideoUsage;
import o.p0a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class p0a {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent = onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ pExternalSyntheticLambda1 onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6);
        }
        onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6);
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(pExternalSyntheticLambda1 pexternalsyntheticlambda1, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(pexternalsyntheticlambda1, textFieldScrollKtExternalSyntheticLambda0, cameraPresenceProviderExternalSyntheticLambda6, z, cameraPresenceProviderExternalSyntheticLambda62, isinvideousage);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return decrementvideousageIAuthTabCallback;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<CameraPresenceProviderExternalSyntheticLambda6<Boolean>> $currentIsCurrentPage$delegate;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<pExternalSyntheticLambda1> $currentScreenTracker$delegate;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $lifecycleOwner;
        final /* synthetic */ boolean $trackView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, CameraPresenceProviderExternalSyntheticLambda6<? extends CameraPresenceProviderExternalSyntheticLambda6<Boolean>> cameraPresenceProviderExternalSyntheticLambda6, boolean z, CameraPresenceProviderExternalSyntheticLambda6<pExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda62, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$lifecycleOwner = textFieldScrollKtExternalSyntheticLambda0;
            this.$currentIsCurrentPage$delegate = cameraPresenceProviderExternalSyntheticLambda6;
            this.$trackView = z;
            this.$currentScreenTracker$delegate = cameraPresenceProviderExternalSyntheticLambda62;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$lifecycleOwner, this.$currentIsCurrentPage$delegate, this.$trackView, this.$currentScreenTracker$delegate, access13800Var);
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        /* renamed from: o.p0a$onWarmupCompleted$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<pExternalSyntheticLambda1> $currentScreenTracker$delegate;
            final /* synthetic */ boolean $trackView;
            /* synthetic */ boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(boolean z, CameraPresenceProviderExternalSyntheticLambda6<pExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$trackView = z;
                this.$currentScreenTracker$delegate = cameraPresenceProviderExternalSyntheticLambda6;
            }

            public final Object IAuthTabCallback(boolean z, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(Boolean.valueOf(z), access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 101;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                }
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$trackView, this.$currentScreenTracker$delegate, access13800Var);
                anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                int i2 = onNavigationEvent + 89;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass3;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i3 != 0) {
                    IAuthTabCallback(zBooleanValue, access13800Var);
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(zBooleanValue, access13800Var);
                int i4 = onExtraCallback + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 61;
                onNavigationEvent = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                if (!z) {
                    p0a.onExtraCallbackWithResult(this.$currentScreenTracker$delegate).asInterface();
                } else if (this.$trackView) {
                    int i3 = onNavigationEvent + 13;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        p0a.onExtraCallbackWithResult(this.$currentScreenTracker$delegate).IAuthTabCallbackStub();
                        throw null;
                    }
                    p0a.onExtraCallbackWithResult(this.$currentScreenTracker$delegate).IAuthTabCallbackStub();
                } else {
                    p0a.onExtraCallbackWithResult(this.$currentScreenTracker$delegate).IAuthTabCallbackDefault();
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 47;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 113;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                IAnimation<Boolean> iAnimationOnExtraCallback = pExternalSyntheticLambda1.Companion.onExtraCallback(p0a.IAuthTabCallback(this.$currentIsCurrentPage$delegate), this.$lifecycleOwner);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$trackView, this.$currentScreenTracker$delegate, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnExtraCallback, anonymousClass3, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[PHI: r1
      0x003d: PHI (r1v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1
      0x0032: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        final boolean z2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1483796064);
            if ((i & 100) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1483796064);
            if ((i & 6) == 0) {
            }
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                int i7 = IAuthTabCallback + 75;
                int i8 = i7 % 128;
                onExtraCallbackWithResult = i8;
                if (i7 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i6 != 0) {
                    int i9 = i8 + 89;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    z2 = true;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = IAuthTabCallback + 89;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1483796064, i3, -1, "im.toss.securities.core.exposure.ScreenTrackSessionEffect (ScreenTrackSessionEffect.kt:28)");
                }
                final pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(pExternalSyntheticLambda2.onExtraCallback());
                final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 14);
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(pexternalsyntheticlambda1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(pexternalsyntheticlambda1);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                boolean z3 = (i3 & 112) == 32;
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent3 | zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback | z3) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    final boolean z4 = z2;
                    objOnMinimized = new Function1() { // from class: im.toss.securities.core.exposure.ScreenTrackSessionEffectKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i13 = 2 % 2;
                            int i14 = IAuthTabCallback + 73;
                            onNavigationEvent = i14 % 128;
                            if (i14 % 2 == 0) {
                                return p0a.onWarmupCompleted(pexternalsyntheticlambda1, textFieldScrollKtExternalSyntheticLambda0, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, z4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, (isInVideoUsage) obj2);
                            }
                            int i15 = 5 / 0;
                            return p0a.onWarmupCompleted(pexternalsyntheticlambda1, textFieldScrollKtExternalSyntheticLambda0, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, z4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, (isInVideoUsage) obj2);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.securities.core.exposure.ScreenTrackSessionEffectKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i13 = 2 % 2;
                        int i14 = onExtraCallbackWithResult + 119;
                        IAuthTabCallback = i14 % 128;
                        int i15 = i14 % 2;
                        Unit unitOnExtraCallback = p0a.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, z2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i16 = onExtraCallbackWithResult + 105;
                        IAuthTabCallback = i16 % 128;
                        int i17 = i16 % 2;
                        return unitOnExtraCallback;
                    }
                });
                return;
            }
            return;
        }
        int i13 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i13 % 128;
        i3 = i13 % 2 != 0 ? i3 | 77 : i3 | 48;
        z2 = z;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static final class IAuthTabCallback implements decrementVideoUsage {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ findResAndMsg IAuthTabCallback;
        final /* synthetic */ pExternalSyntheticLambda1 onExtraCallback;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 onExtraCallbackWithResult;

        public IAuthTabCallback(pExternalSyntheticLambda1 pexternalsyntheticlambda1, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            this.onExtraCallback = pexternalsyntheticlambda1;
            this.IAuthTabCallback = findresandmsg;
            this.onExtraCallbackWithResult = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {this.onExtraCallback, true};
                pExternalSyntheticLambda1.IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, 2092920312, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2092920309, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                p0a.onExtraCallbackWithResult(this.onExtraCallbackWithResult).asInterface();
                findRes.onExtraCallbackWithResult(this.IAuthTabCallback, (CancellationException) null, 0, (Object) null);
                return;
            }
            Object[] objArr2 = {this.onExtraCallback, false};
            pExternalSyntheticLambda1.IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr2, 2092920312, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2092920309, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
            p0a.onExtraCallbackWithResult(this.onExtraCallbackWithResult).asInterface();
            findRes.onExtraCallbackWithResult(this.IAuthTabCallback, (CancellationException) null, 1, (Object) null);
        }
    }

    private static final decrementVideoUsage IAuthTabCallback(pExternalSyntheticLambda1 pexternalsyntheticlambda1, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        pExternalSyntheticLambda1.IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{pexternalsyntheticlambda1, true}, 2092920312, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2092920309, iOnExtraCallbackWithResult2);
        findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        maybeUpdateAnimatable.onNavigationEvent(findresandmsgOnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0, cameraPresenceProviderExternalSyntheticLambda6, z, cameraPresenceProviderExternalSyntheticLambda62, null), 3, (Object) null);
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(pexternalsyntheticlambda1, findresandmsgOnWarmupCompleted, cameraPresenceProviderExternalSyntheticLambda62);
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final CameraPresenceProviderExternalSyntheticLambda6<Boolean> onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends CameraPresenceProviderExternalSyntheticLambda6<Boolean>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return cameraPresenceProviderExternalSyntheticLambda62;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final pExternalSyntheticLambda1 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<pExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return pexternalsyntheticlambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
