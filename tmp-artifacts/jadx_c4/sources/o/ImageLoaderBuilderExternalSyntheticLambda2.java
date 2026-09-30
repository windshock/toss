package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.internal.ads.zzgc;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ImageLoaderBuilderExternalSyntheticLambda2;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageLoaderBuilderExternalSyntheticLambda2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Unit onExtraCallbackWithResult(ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(imageLoaderBuilderExternalSyntheticLambda6, function0);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(imageLoaderBuilderExternalSyntheticLambda6, function0);
        int i3 = onExtraCallback + 37;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 43 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(long j, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z, boolean z2, boolean z3, boolean z4, String str, Role role, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(j, getconfiguration, getcachingexecutorservice, z, z2, z3, z4, str, role, function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(j, getconfiguration, getcachingexecutorservice, z, z2, z3, z4, str, role, function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z) {
        float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if (z) {
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onCaptureSessionStart.onExtraCallback(quirksExternalSyntheticBackport0, f);
        int i4 = onExtraCallbackWithResult + 117;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z, boolean z2, boolean z3, boolean z4, String str, Role role, long j, Function0 function0, int i, Object obj) {
        getConfiguration getconfiguration2;
        getCachingExecutorService getcachingexecutorserviceOnExtraCallback;
        boolean z5;
        boolean z6;
        Role role2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 5;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            getconfiguration2 = (getConfiguration) configureReward.onExtraCallback(zzgc.onExtraCallbackWithResult(), -1629622331, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[0], 1629622338, zzgc.onExtraCallbackWithResult());
        } else {
            getconfiguration2 = getconfiguration;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 111;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                configureReward.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            getcachingexecutorserviceOnExtraCallback = configureReward.onExtraCallback();
        } else {
            getcachingexecutorserviceOnExtraCallback = getcachingexecutorservice;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 13;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i & 8) != 0) {
            int i8 = onExtraCallbackWithResult + 41;
            onExtraCallback = i8 % 128;
            z6 = i8 % 2 == 0;
        } else {
            z6 = z2;
        }
        boolean z7 = (i & 16) != 0 ? false : z3;
        boolean z8 = (i & 32) != 0 ? false : z4;
        String str2 = (i & 64) != 0 ? null : str;
        if ((i & 128) != 0) {
            int i9 = onExtraCallbackWithResult + 7;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            role2 = null;
        } else {
            role2 = role;
        }
        return onNavigationEvent(quirksExternalSyntheticBackport0, getconfiguration2, getcachingexecutorserviceOnExtraCallback, z5, z6, z7, z8, str2, role2, (i & 256) != 0 ? 500L : j, function0);
    }

    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final getConfiguration<Float> getconfiguration, @NotNull final getCachingExecutorService getcachingexecutorservice, final boolean z, final boolean z2, final boolean z3, final boolean z4, @Nullable final String str, @Nullable final Role role, final long j, @NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        Intrinsics.checkNotNullParameter(function0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.components.compose.extensions.ModifierKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 13;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda2.onWarmupCompleted(j, getconfiguration, getcachingexecutorservice, z, z2, z3, z4, str, role, function0, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i5 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 29 / 0;
                }
                return quirksExternalSyntheticBackport0OnWarmupCompleted;
            }
        }, 1, (Object) null);
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static final Unit onWarmupCompleted(ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        imageLoaderBuilderExternalSyntheticLambda6.onWarmupCompleted(function0);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(long j, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z, boolean z2, boolean z3, boolean z4, String str, Role role, final Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1421169334);
        Object obj2 = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallbackWithResult + 55;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1421169334, i, -1, "im.toss.components.compose.extensions.clickableSingle.<anonymous> (Modifier.kt:52)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1421169334, i, -1, "im.toss.components.compose.extensions.clickableSingle.<anonymous> (Modifier.kt:52)");
        }
        boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnWarmupCompleted || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new ImageLoaderBuilderExternalSyntheticLambda6(j);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            int i4 = onExtraCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        final ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6 = (ImageLoaderBuilderExternalSyntheticLambda6) objOnMinimized;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(imageLoaderBuilderExternalSyntheticLambda6);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | zOnNavigationEvent)) {
            int i6 = onExtraCallback + 87;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            obj = objOnMinimized2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Function0 function02 = new Function0() { // from class: im.toss.components.compose.extensions.ModifierKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 9;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult(imageLoaderBuilderExternalSyntheticLambda6, function0);
                        int i10 = onNavigationEvent + 7;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                obj = function02;
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(configureReward.onWarmupCompleted(onextracallback, getconfiguration, getcachingexecutorservice, z, z2, z3, z4, str, role, (Function0) obj));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    static final class onExtraCallbackWithResult implements PointerInputEventHandler {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 5;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 71 / 0;
            }
        }

        onExtraCallbackWithResult() {
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new AnonymousClass2(highPriorityExecutor, null), access13800Var);
            if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
                Unit unit = Unit.INSTANCE;
                int i2 = onExtraCallback + 5;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }
            int i4 = onWarmupCompleted;
            int i5 = i4 + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 47;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return objOnExtraCallbackWithResult;
        }

        /* renamed from: o.ImageLoaderBuilderExternalSyntheticLambda2$onExtraCallbackWithResult$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ HighPriorityExecutor $this_pointerInput;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HighPriorityExecutor highPriorityExecutor, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$this_pointerInput = highPriorityExecutor;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_pointerInput, access13800Var);
                int i2 = IAuthTabCallback + 125;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 21;
                IAuthTabCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onExtraCallback(findresandmsg, access13800Var);
                }
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    anonymousClass2Create.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass2Create.invokeSuspend(unit);
                int i4 = onExtraCallback + 85;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: o.ImageLoaderBuilderExternalSyntheticLambda2$onExtraCallbackWithResult$2$2, reason: invalid class name and collision with other inner class name */
            static final class C00142 extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ Ref.LongRef $currentId;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00142(Ref.LongRef longRef, access13800<? super C00142> access13800Var) {
                    super(2, access13800Var);
                    this.$currentId = longRef;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    C00142 c00142 = new C00142(this.$currentId, access13800Var);
                    c00142.L$0 = obj;
                    int i2 = onWarmupCompleted + 49;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return c00142;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 93;
                    onExtraCallback = i2 % 128;
                    AudioExecutor1 audioExecutor1 = (AudioExecutor1) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i2 % 2 == 0) {
                        return onExtraCallbackWithResult(audioExecutor1, access13800Var);
                    }
                    onExtraCallbackWithResult(audioExecutor1, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                public final Object onExtraCallbackWithResult(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 107;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(audioExecutor1, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onExtraCallback + 123;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[PHI: r6
                  0x0090: PHI (r6v7 o.HandlerScheduledExecutorService2) = (r6v5 o.HandlerScheduledExecutorService2), (r6v10 o.HandlerScheduledExecutorService2) binds: [B:27:0x008e, B:24:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0040 -> B:18:0x0052). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = o.ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult.AnonymousClass2.C00142.onExtraCallback
                        int r1 = r1 + 105
                        int r2 = r1 % 128
                        o.ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult.AnonymousClass2.C00142.onWarmupCompleted = r2
                        int r1 = r1 % r0
                        r2 = 0
                        if (r1 == 0) goto Lc2
                        java.lang.Object r1 = r13.L$0
                        o.AudioExecutor1 r1 = (o.AudioExecutor1) r1
                        java.lang.Object r3 = o.access14300.onWarmupCompleted()
                        int r4 = r13.label
                        r5 = 1
                        if (r4 == 0) goto L33
                        if (r4 != r5) goto L2b
                        int r4 = o.ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult.AnonymousClass2.C00142.onWarmupCompleted
                        int r4 = r4 + 51
                        int r6 = r4 % 128
                        o.ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult.AnonymousClass2.C00142.onExtraCallback = r6
                        int r4 = r4 % r0
                        kotlin.ResultKt.onNavigationEvent(r14)
                        goto L52
                    L2b:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r14.<init>(r0)
                        throw r14
                    L33:
                        kotlin.ResultKt.onNavigationEvent(r14)
                    L36:
                        o.createPostFailedException r14 = o.createPostFailedException.Initial
                        r13.L$0 = r1
                        r13.label = r5
                        java.lang.Object r14 = r1.IAuthTabCallback(r14, r13)
                        if (r14 != r3) goto L52
                        int r14 = o.ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult.AnonymousClass2.C00142.onExtraCallback
                        int r14 = r14 + 75
                        int r1 = r14 % 128
                        o.ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult.AnonymousClass2.C00142.onWarmupCompleted = r1
                        int r14 = r14 % r0
                        if (r14 == 0) goto L4e
                        return r3
                    L4e:
                        r2.hashCode()
                        throw r2
                    L52:
                        o.newHandlerExecutor r14 = (o.newHandlerExecutor) r14
                        java.util.List r14 = r14.onExtraCallbackWithResult()
                        java.lang.Iterable r14 = (java.lang.Iterable) r14
                        kotlin.jvm.internal.Ref$LongRef r4 = r13.$currentId
                        java.util.Iterator r14 = r14.iterator()
                    L60:
                        boolean r6 = r14.hasNext()
                        if (r6 == 0) goto L36
                        int r6 = o.ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult.AnonymousClass2.C00142.onWarmupCompleted
                        int r6 = r6 + 43
                        int r7 = r6 % 128
                        o.ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult.AnonymousClass2.C00142.onExtraCallback = r7
                        int r6 = r6 % r0
                        r7 = -1
                        if (r6 == 0) goto L84
                        java.lang.Object r6 = r14.next()
                        o.HandlerScheduledExecutorService2 r6 = (o.HandlerScheduledExecutorService2) r6
                        boolean r9 = r6.IAuthTabCallbackStub()
                        r10 = 21
                        int r10 = r10 / 0
                        if (r9 == 0) goto L9d
                        goto L90
                    L84:
                        java.lang.Object r6 = r14.next()
                        o.HandlerScheduledExecutorService2 r6 = (o.HandlerScheduledExecutorService2) r6
                        boolean r9 = r6.IAuthTabCallbackStub()
                        if (r9 == 0) goto L9d
                    L90:
                        long r9 = r4.element
                        int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                        if (r9 != 0) goto L9d
                        long r6 = r6.onNavigationEvent()
                        r4.element = r6
                        goto L60
                    L9d:
                        boolean r9 = r6.IAuthTabCallbackStub()
                        if (r9 != 0) goto Lb0
                        long r9 = r4.element
                        long r11 = r6.onNavigationEvent()
                        int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                        if (r9 != 0) goto Lb0
                        r4.element = r7
                        goto L60
                    Lb0:
                        long r9 = r6.onNavigationEvent()
                        long r11 = r4.element
                        int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                        if (r9 == 0) goto L60
                        int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                        if (r7 == 0) goto L60
                        r6.onExtraCallback()
                        goto L60
                    Lc2:
                        java.lang.Object r14 = r13.L$0
                        o.AudioExecutor1 r14 = (o.AudioExecutor1) r14
                        o.access14300.onWarmupCompleted()
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.ImageLoaderBuilderExternalSyntheticLambda2.onExtraCallbackWithResult.AnonymousClass2.C00142.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallback + 77;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i5 = IAuthTabCallback + 35;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Ref.LongRef longRef = new Ref.LongRef();
                    longRef.element = -1L;
                    HighPriorityExecutor highPriorityExecutor = this.$this_pointerInput;
                    C00142 c00142 = new C00142(longRef, null);
                    this.L$0 = access15400.onNavigationEvent(longRef);
                    this.label = 1;
                    if (highPriorityExecutor.onExtraCallback(c00142, this) == objOnWarmupCompleted) {
                        int i7 = IAuthTabCallback + 21;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0, Unit.INSTANCE, onExtraCallbackWithResult.onExtraCallbackWithResult);
        int i4 = onExtraCallbackWithResult + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }
}
