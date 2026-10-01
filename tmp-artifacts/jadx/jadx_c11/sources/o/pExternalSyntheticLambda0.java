package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import com.tmoney.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.Camera2CameraMetadataExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.Request;
import o.getPackageType;
import o.isInVideoUsage;
import o.pExternalSyntheticLambda0;
import o.readBomAsCharset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class pExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.values().length];
            try {
                iArr[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.Body.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.Header.ordinal()] = 2;
                int i = onExtraCallback + 69;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.Footer.ordinal()] = 3;
                int i4 = IAuthTabCallback + 7;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.Whole.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onWarmupCompleted = iArr;
        }
    }

    private static final Unit IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), -1973722171, a.3.onWarmupCompleted(), objArr, iOnWarmupCompleted, 1973722172);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        HashMap map = (HashMap) objArr[2];
        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(objectRef, findresandmsg, map, pexternalsyntheticlambda1);
        if (i3 == 0) {
            return null;
        }
        int i4 = 35 / 0;
        return null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i5);
        int i10 = (~i5) | (~((~i3) | i6));
        int i11 = (~(i5 | i3)) | (~(i7 | i5)) | (~i8);
        int i12 = i6 + i3 + i2 + ((-953487067) * i) + ((-1992133889) * i4);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i6) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i2) + ((-1703411712) * i) + (1961361408 * i4) + (907935744 * i13);
        int i15 = ((i6 * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i2 * 272662391) + (i * 2077717299) + (i4 * 1957688713) + (i13 * 166854656);
        return i14 + ((i15 * i15) * (-213778432)) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, pExternalSyntheticLambda1 pexternalsyntheticlambda1, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6, textFieldScrollKtExternalSyntheticLambda0, pexternalsyntheticlambda1, isinvideousage);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6, textFieldScrollKtExternalSyntheticLambda0, pexternalsyntheticlambda1, isinvideousage);
        int i3 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return decrementvideousageIAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ HashMap<readBomAsCharset, Long> $firstSeenMap;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Boolean> $isCurrentPage;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $lifecycleOwner;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        final /* synthetic */ Ref.ObjectRef<getPackageType> $pollJob;
        final /* synthetic */ findResAndMsg $scope;
        final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
        final /* synthetic */ HashMap<readBomAsCharset, p3> $visibilityScratch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, HashMap<readBomAsCharset, Long> map, Ref.ObjectRef<getPackageType> objectRef, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, HashMap<readBomAsCharset, p3> map2, findResAndMsg findresandmsg, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$isCurrentPage = cameraPresenceProviderExternalSyntheticLambda6;
            this.$lifecycleOwner = textFieldScrollKtExternalSyntheticLambda0;
            this.$firstSeenMap = map;
            this.$pollJob = objectRef;
            this.$screenTracker = pexternalsyntheticlambda1;
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$visibilityScratch = map2;
            this.$scope = findresandmsg;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$isCurrentPage, this.$lifecycleOwner, this.$firstSeenMap, this.$pollJob, this.$screenTracker, this.$listState, this.$visibilityScratch, this.$scope, access13800Var);
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = 43 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.pExternalSyntheticLambda0$onExtraCallbackWithResult$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ HashMap<readBomAsCharset, Long> $firstSeenMap;
            final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
            final /* synthetic */ Ref.ObjectRef<getPackageType> $pollJob;
            final /* synthetic */ findResAndMsg $scope;
            final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
            final /* synthetic */ HashMap<readBomAsCharset, p3> $visibilityScratch;
            Object L$0;
            Object L$1;
            /* synthetic */ boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(HashMap<readBomAsCharset, Long> map, Ref.ObjectRef<getPackageType> objectRef, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, HashMap<readBomAsCharset, p3> map2, findResAndMsg findresandmsg, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$firstSeenMap = map;
                this.$pollJob = objectRef;
                this.$screenTracker = pexternalsyntheticlambda1;
                this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
                this.$visibilityScratch = map2;
                this.$scope = findresandmsg;
            }

            public static /* synthetic */ Set onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, pExternalSyntheticLambda1 pexternalsyntheticlambda1, HashMap map) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 5;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, pexternalsyntheticlambda1, map);
                }
                onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, pexternalsyntheticlambda1, map);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$firstSeenMap, this.$pollJob, this.$screenTracker, this.$listState, this.$visibilityScratch, this.$scope, access13800Var);
                anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                int i2 = onNavigationEvent + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 85;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i3 == 0) {
                    return onExtraCallbackWithResult(zBooleanValue, access13800Var);
                }
                onExtraCallbackWithResult(zBooleanValue, access13800Var);
                throw null;
            }

            public final Object onExtraCallbackWithResult(boolean z, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(Boolean.valueOf(z), access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 123;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* renamed from: o.pExternalSyntheticLambda0$onExtraCallbackWithResult$3$onWarmupCompleted */
            public static final class onWarmupCompleted implements IAnimation<Set<? extends readBomAsCharset>> {
                private static int asInterface = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ IAnimation IAuthTabCallback;
                final /* synthetic */ pExternalSyntheticLambda1 onExtraCallback;
                final /* synthetic */ HashMap onExtraCallbackWithResult;
                final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 onNavigationEvent;

                /* renamed from: o.pExternalSyntheticLambda0$onExtraCallbackWithResult$3$onWarmupCompleted$3, reason: invalid class name and collision with other inner class name */
                public static final class C00473<T> implements setRipple {
                    private static int IAuthTabCallback = 0;
                    private static int onTransact = 1;
                    final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 onExtraCallback;
                    final /* synthetic */ setRipple onExtraCallbackWithResult;
                    final /* synthetic */ pExternalSyntheticLambda1 onNavigationEvent;
                    final /* synthetic */ HashMap onWarmupCompleted;

                    /* renamed from: o.pExternalSyntheticLambda0$onExtraCallbackWithResult$3$onWarmupCompleted$3$3, reason: invalid class name and collision with other inner class name */
                    public static final class C00483 extends ContinuationImpl {
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public C00483(access13800 access13800Var) {
                            super(access13800Var);
                        }

                        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                            int i = 2 % 2;
                            int i2 = onWarmupCompleted + 27;
                            onNavigationEvent = i2 % 128;
                            int i3 = i2 % 2;
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            Object objEmit = C00473.this.emit(null, this);
                            int i4 = onNavigationEvent + 65;
                            onWarmupCompleted = i4 % 128;
                            int i5 = i4 % 2;
                            return objEmit;
                        }
                    }

                    public C00473(setRipple setripple, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, pExternalSyntheticLambda1 pexternalsyntheticlambda1, HashMap map) {
                        this.onExtraCallbackWithResult = setripple;
                        this.onExtraCallback = camera2CameraMetadataExternalSyntheticLambda1;
                        this.onNavigationEvent = pexternalsyntheticlambda1;
                        this.onWarmupCompleted = map;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, access13800 access13800Var) throws NoWhenBranchMatchedException {
                        C00483 c00483;
                        int i = 2 % 2;
                        int i2 = onTransact + 33;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 98 / 0;
                            if (access13800Var instanceof C00483) {
                                c00483 = (C00483) access13800Var;
                                int i4 = c00483.label;
                                if ((i4 & Integer.MIN_VALUE) != 0) {
                                    int i5 = IAuthTabCallback + 103;
                                    onTransact = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        c00483.label = i4 / Integer.MIN_VALUE;
                                    } else {
                                        c00483.label = i4 - 2147483648;
                                    }
                                } else {
                                    c00483 = new C00483(access13800Var);
                                }
                            }
                        } else if (access13800Var instanceof C00483) {
                        }
                        Object obj2 = c00483.result;
                        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                        int i6 = c00483.label;
                        if (i6 != 0) {
                            int i7 = IAuthTabCallback + 73;
                            onTransact = i7 % 128;
                            int i8 = i7 % 2;
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj2);
                        } else {
                            ResultKt.onNavigationEvent(obj2);
                            setRipple setripple = this.onExtraCallbackWithResult;
                            Set<readBomAsCharset> setIAuthTabCallback = pExternalSyntheticLambda0.IAuthTabCallback(this.onExtraCallback.IAuthTabCallback_Parcel(), this.onNavigationEvent, this.onWarmupCompleted);
                            c00483.L$0 = access15400.onNavigationEvent(obj);
                            c00483.L$1 = access15400.onNavigationEvent(c00483);
                            c00483.L$2 = access15400.onNavigationEvent(obj);
                            c00483.L$3 = access15400.onNavigationEvent(setripple);
                            c00483.I$0 = 0;
                            c00483.label = 1;
                            if (setripple.emit(setIAuthTabCallback, c00483) == objOnWarmupCompleted) {
                                int i9 = IAuthTabCallback + 79;
                                onTransact = i9 % 128;
                                if (i9 % 2 != 0) {
                                    return objOnWarmupCompleted;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        int i10 = IAuthTabCallback + 57;
                        onTransact = i10 % 128;
                        int i11 = i10 % 2;
                        return unit;
                    }
                }

                public onWarmupCompleted(IAnimation iAnimation, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, pExternalSyntheticLambda1 pexternalsyntheticlambda1, HashMap map) {
                    this.IAuthTabCallback = iAnimation;
                    this.onNavigationEvent = camera2CameraMetadataExternalSyntheticLambda1;
                    this.onExtraCallback = pexternalsyntheticlambda1;
                    this.onExtraCallbackWithResult = map;
                }

                public Object collect(setRipple setripple, access13800 access13800Var) {
                    int i = 2 % 2;
                    Object objCollect = this.IAuthTabCallback.collect(new C00473(setripple, this.onNavigationEvent, this.onExtraCallback, this.onExtraCallbackWithResult), access13800Var);
                    Object obj = null;
                    if (objCollect == access14300.onWarmupCompleted()) {
                        int i2 = asInterface + 31;
                        onWarmupCompleted = i2 % 128;
                        if (i2 % 2 == 0) {
                            return objCollect;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    Unit unit = Unit.INSTANCE;
                    int i3 = onWarmupCompleted + 53;
                    asInterface = i3 % 128;
                    if (i3 % 2 != 0) {
                        return unit;
                    }
                    obj.hashCode();
                    throw null;
                }
            }

            private static final Set onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, pExternalSyntheticLambda1 pexternalsyntheticlambda1, HashMap map) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Set<readBomAsCharset> setIAuthTabCallback = pExternalSyntheticLambda0.IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel(), pexternalsyntheticlambda1, map);
                int i4 = onNavigationEvent + 115;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return setIAuthTabCallback;
            }

            /* renamed from: o.pExternalSyntheticLambda0$onExtraCallbackWithResult$3$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Set<? extends readBomAsCharset>, access13800<? super Unit>, Object> {
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                final /* synthetic */ HashMap<readBomAsCharset, Long> $firstSeenMap;
                final /* synthetic */ Ref.ObjectRef<getPackageType> $pollJob;
                final /* synthetic */ findResAndMsg $scope;
                final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
                /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HashMap<readBomAsCharset, Long> map, Ref.ObjectRef<getPackageType> objectRef, findResAndMsg findresandmsg, pExternalSyntheticLambda1 pexternalsyntheticlambda1, access13800<? super AnonymousClass1> access13800Var) {
                    super(2, access13800Var);
                    this.$firstSeenMap = map;
                    this.$pollJob = objectRef;
                    this.$scope = findresandmsg;
                    this.$screenTracker = pexternalsyntheticlambda1;
                }

                public static /* synthetic */ Unit onExtraCallback(Ref.ObjectRef objectRef, findResAndMsg findresandmsg, HashMap map, pExternalSyntheticLambda1 pexternalsyntheticlambda1) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 45;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnWarmupCompleted = onWarmupCompleted(objectRef, findresandmsg, map, pexternalsyntheticlambda1);
                    int i4 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static /* synthetic */ Unit onExtraCallback(pExternalSyntheticLambda1 pexternalsyntheticlambda1, readBomAsCharset readbomascharset) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 109;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitIAuthTabCallback = IAuthTabCallback(pexternalsyntheticlambda1, readbomascharset);
                    int i4 = onNavigationEvent + 67;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$firstSeenMap, this.$pollJob, this.$scope, this.$screenTracker, access13800Var);
                    anonymousClass1.L$0 = obj;
                    int i2 = onExtraCallbackWithResult + 59;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 48 / 0;
                    }
                    return anonymousClass1;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 71;
                    onExtraCallbackWithResult = i2 % 128;
                    Set<? extends readBomAsCharset> set = (Set) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i2 % 2 == 0) {
                        onNavigationEvent(set, access13800Var);
                        throw null;
                    }
                    Object objOnNavigationEvent = onNavigationEvent(set, access13800Var);
                    int i3 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnNavigationEvent;
                }

                public final Object onNavigationEvent(Set<? extends readBomAsCharset> set, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 57;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(set, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onExtraCallbackWithResult + 37;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Set set = (Set) this.L$0;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    final HashMap<readBomAsCharset, Long> map = this.$firstSeenMap;
                    final Ref.ObjectRef<getPackageType> objectRef = this.$pollJob;
                    final findResAndMsg findresandmsg = this.$scope;
                    final pExternalSyntheticLambda1 pexternalsyntheticlambda1 = this.$screenTracker;
                    Function0 function0 = new Function0() { // from class: im.toss.securities.core.exposure.LazyListImpressionEffectKt$runOptimizedImpressionTracking$1$1$1$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke() {
                            Unit unitOnExtraCallback;
                            int i4 = 2 % 2;
                            int i5 = onExtraCallbackWithResult + 25;
                            IAuthTabCallback = i5 % 128;
                            if (i5 % 2 != 0) {
                                unitOnExtraCallback = pExternalSyntheticLambda0.onExtraCallbackWithResult.AnonymousClass3.AnonymousClass1.onExtraCallback(objectRef, findresandmsg, map, pexternalsyntheticlambda1);
                                int i6 = 35 / 0;
                            } else {
                                unitOnExtraCallback = pExternalSyntheticLambda0.onExtraCallbackWithResult.AnonymousClass3.AnonymousClass1.onExtraCallback(objectRef, findresandmsg, map, pexternalsyntheticlambda1);
                            }
                            int i7 = onExtraCallbackWithResult + 67;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    final pExternalSyntheticLambda1 pexternalsyntheticlambda12 = this.$screenTracker;
                    pExternalSyntheticLambda0.onExtraCallbackWithResult(set, map, function0, new Function1() { // from class: im.toss.securities.core.exposure.LazyListImpressionEffectKt$runOptimizedImpressionTracking$1$1$1$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i4 = 2 % 2;
                            int i5 = onWarmupCompleted + 79;
                            onExtraCallbackWithResult = i5 % 128;
                            int i6 = i5 % 2;
                            Unit unitOnExtraCallback = pExternalSyntheticLambda0.onExtraCallbackWithResult.AnonymousClass3.AnonymousClass1.onExtraCallback(pexternalsyntheticlambda12, (readBomAsCharset) obj2);
                            int i7 = onExtraCallbackWithResult + 55;
                            onWarmupCompleted = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 12 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    });
                    Unit unit = Unit.INSTANCE;
                    int i4 = onNavigationEvent + 87;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }

                private static final Unit onWarmupCompleted(Ref.ObjectRef objectRef, findResAndMsg findresandmsg, HashMap map, pExternalSyntheticLambda1 pexternalsyntheticlambda1) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 47;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int iOnWarmupCompleted = a.3.onWarmupCompleted();
                        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                        pExternalSyntheticLambda0.onWarmupCompleted(a.3.onWarmupCompleted(), iOnWarmupCompleted2, -645312207, a.3.onWarmupCompleted(), new Object[]{objectRef, findresandmsg, map, pexternalsyntheticlambda1}, iOnWarmupCompleted, 645312207);
                        return Unit.INSTANCE;
                    }
                    int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                    int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
                    pExternalSyntheticLambda0.onWarmupCompleted(a.3.onWarmupCompleted(), iOnWarmupCompleted4, -645312207, a.3.onWarmupCompleted(), new Object[]{objectRef, findresandmsg, map, pexternalsyntheticlambda1}, iOnWarmupCompleted3, 645312207);
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }

                private static final Unit IAuthTabCallback(pExternalSyntheticLambda1 pexternalsyntheticlambda1, readBomAsCharset readbomascharset) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 29;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        pExternalSyntheticLambda1.onExtraCallback(pexternalsyntheticlambda1, readbomascharset, null, 5, null);
                    } else {
                        pExternalSyntheticLambda1.onExtraCallback(pexternalsyntheticlambda1, readbomascharset, null, 2, null);
                    }
                    Unit unit = Unit.INSTANCE;
                    int i3 = onNavigationEvent + 63;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return unit;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[PHI: r1
              0x0065: PHI (r1v5 o.getPackageType) = (r1v4 o.getPackageType), (r1v10 o.getPackageType) binds: [B:20:0x0063, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                getPackageType getpackagetype;
                int i = 2 % 2;
                boolean z = this.Z$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 1;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    if (!z) {
                        int i4 = onNavigationEvent + 57;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            this.$firstSeenMap.clear();
                            getpackagetype = (getPackageType) this.$pollJob.element;
                            int i5 = 7 / 0;
                            if (getpackagetype != null) {
                                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                            }
                        } else {
                            this.$firstSeenMap.clear();
                            getpackagetype = (getPackageType) this.$pollJob.element;
                            if (getpackagetype != null) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                    final pExternalSyntheticLambda1 pexternalsyntheticlambda1 = this.$screenTracker;
                    final HashMap<readBomAsCharset, p3> map = this.$visibilityScratch;
                    IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.securities.core.exposure.LazyListImpressionEffectKt$runOptimizedImpressionTracking$1$1$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() throws NoWhenBranchMatchedException {
                            int i6 = 2 % 2;
                            int i7 = onExtraCallback + 99;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            Set setOnExtraCallbackWithResult = pExternalSyntheticLambda0.onExtraCallbackWithResult.AnonymousClass3.onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1, pexternalsyntheticlambda1, map);
                            int i9 = onExtraCallback + 73;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            return setOnExtraCallbackWithResult;
                        }
                    }));
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(ycxycx.onExtraCallbackWithResult(new IAnimation[]{(getTileModeX) pExternalSyntheticLambda1.IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this.$screenTracker}, 2046480637, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2046480635, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult()), this.$screenTracker.onTransact()}), this.$listState, this.$screenTracker, this.$visibilityScratch);
                    IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(new IAnimation[]{iAnimationOnNavigationEvent, onwarmupcompleted});
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$firstSeenMap, this.$pollJob, this.$scope, this.$screenTracker, null);
                    this.L$0 = access15400.onNavigationEvent(iAnimationOnNavigationEvent);
                    this.L$1 = access15400.onNavigationEvent(onwarmupcompleted);
                    this.Z$0 = z;
                    this.label = 1;
                    if (ycxycx.onWarmupCompleted(iAnimationOnExtraCallbackWithResult, anonymousClass1, this) == objOnWarmupCompleted) {
                        int i6 = onWarmupCompleted + 63;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation<Boolean> iAnimationOnExtraCallback = pExternalSyntheticLambda1.Companion.onExtraCallback(this.$isCurrentPage, this.$lifecycleOwner);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$firstSeenMap, this.$pollJob, this.$screenTracker, this.$listState, this.$visibilityScratch, this.$scope, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnExtraCallback, anonymousClass3, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallback implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ findResAndMsg IAuthTabCallback;

        public IAuthTabCallback(findResAndMsg findresandmsg) {
            this.IAuthTabCallback = findresandmsg;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            findRes.onExtraCallbackWithResult(this.IAuthTabCallback, (CancellationException) null, 1, (Object) null);
            int i4 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        boolean z;
        int i2;
        int i3;
        final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        boolean z2 = true;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        final int iIntValue = ((Number) objArr[3]).intValue();
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1168784993);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1)) {
                int i5 = IAuthTabCallback + 99;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6)) {
                int i7 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i9 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i11 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1168784993, i, -1, "im.toss.securities.core.exposure.LazyListImpressionEffect (LazyListImpressionEffect.kt:50)");
            }
            final pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(pExternalSyntheticLambda2.onExtraCallback());
            final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            boolean z3 = (i & 14) == 4;
            if ((i & 112) == 32) {
                int i12 = onExtraCallbackWithResult + 67;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
            } else {
                int i14 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                z2 = false;
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(pexternalsyntheticlambda1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z2 | z3 | zOnExtraCallback | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.securities.core.exposure.LazyListImpressionEffectKt$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i16 = 2 % 2;
                        int i17 = onExtraCallbackWithResult + 61;
                        onNavigationEvent = i17 % 128;
                        int i18 = i17 % 2;
                        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda1;
                        if (i18 == 0) {
                            return pExternalSyntheticLambda0.onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda12, cameraPresenceProviderExternalSyntheticLambda6, textFieldScrollKtExternalSyntheticLambda0, pexternalsyntheticlambda1, (isInVideoUsage) obj2);
                        }
                        pExternalSyntheticLambda0.onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda12, cameraPresenceProviderExternalSyntheticLambda6, textFieldScrollKtExternalSyntheticLambda0, pexternalsyntheticlambda1, (isInVideoUsage) obj2);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i16 % 128;
                if (i16 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.securities.core.exposure.LazyListImpressionEffectKt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = onNavigationEvent + 23;
                    onExtraCallbackWithResult = i18 % 128;
                    int i19 = i18 % 2;
                    Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda1;
                    if (i19 == 0) {
                        return pExternalSyntheticLambda0.onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda12, cameraPresenceProviderExternalSyntheticLambda6, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    pExternalSyntheticLambda0.onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda12, cameraPresenceProviderExternalSyntheticLambda6, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
        return null;
    }

    private static final void IAuthTabCallback(Ref.ObjectRef<getPackageType> objectRef, findResAndMsg findresandmsg, HashMap<readBomAsCharset, Long> map, pExternalSyntheticLambda1 pexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = (getPackageType) objectRef.element;
        if (getpackagetype == null || !getpackagetype.onExtraCallback()) {
            objectRef.element = maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onTransact(map, pexternalsyntheticlambda1, null), 3, (Object) null);
            int i4 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ HashMap<readBomAsCharset, Long> $firstSeenMap;
        final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(HashMap<readBomAsCharset, Long> map, pExternalSyntheticLambda1 pexternalsyntheticlambda1, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$firstSeenMap = map;
            this.$screenTracker = pexternalsyntheticlambda1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$firstSeenMap, this.$screenTracker, access13800Var);
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return ontransactCreate.invokeSuspend(unit);
            }
            ontransactCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0040 -> B:18:0x004c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!this.$firstSeenMap.isEmpty()) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = IAuthTabCallback + 3;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i4 = 8 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<Map.Entry<readBomAsCharset, Long>> it = this.$firstSeenMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<readBomAsCharset, Long> next = it.next();
                    readBomAsCharset key = next.getKey();
                    if (jCurrentTimeMillis - next.getValue().longValue() >= 500) {
                        it.remove();
                        pExternalSyntheticLambda1.onExtraCallback(this.$screenTracker, key, null, 2, null);
                    }
                }
                if (!this.$firstSeenMap.isEmpty()) {
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                        int i5 = IAuthTabCallback + 81;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    Iterator<Map.Entry<readBomAsCharset, Long>> it2 = this.$firstSeenMap.entrySet().iterator();
                    while (it2.hasNext()) {
                    }
                    if (!this.$firstSeenMap.isEmpty()) {
                        Unit unit = Unit.INSTANCE;
                        int i7 = IAuthTabCallback + 59;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return unit;
                    }
                }
            }
        }
    }

    public static final void onNavigationEvent(@NotNull findResAndMsg findresandmsg, @NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull pExternalSyntheticLambda1 pexternalsyntheticlambda1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(pexternalsyntheticlambda1, "");
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, textFieldScrollKtExternalSyntheticLambda0, new HashMap(), new Ref.ObjectRef(), pexternalsyntheticlambda1, camera2CameraMetadataExternalSyntheticLambda1, new HashMap(), findresandmsg, null), 3, (Object) null);
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Set<readBomAsCharset> IAuthTabCallback(@NotNull Request request, @NotNull pExternalSyntheticLambda1 pexternalsyntheticlambda1, @NotNull Map<readBomAsCharset, p3> map) throws NoWhenBranchMatchedException {
        readBomAsCharset key;
        p3 value;
        r8lambdapFKbNKyon4l81OnW_FNUfA36qI r8lambdapfkbnkyon4l81onw_fnufa36qi;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(pexternalsyntheticlambda1, "");
        Intrinsics.checkNotNullParameter(map, "");
        float fAsBinder = (int) request.asBinder();
        if (fAsBinder <= 0.0f) {
            return clearFaultAdjacentMetadata.onExtraCallback();
        }
        map.clear();
        Iterator it = request.onTransact().iterator();
        while (true) {
            p1ExternalSyntheticLambda0 p1externalsyntheticlambda0 = null;
            if (!it.hasNext()) {
                if (map.isEmpty()) {
                    int i2 = onExtraCallbackWithResult + 109;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return clearFaultAdjacentMetadata.onExtraCallback();
                    }
                    int i3 = 13 / 0;
                    return clearFaultAdjacentMetadata.onExtraCallback();
                }
                Iterator<Map.Entry<readBomAsCharset, p3>> it2 = map.entrySet().iterator();
                HashSet hashSet = null;
                while (it2.hasNext()) {
                    int i4 = IAuthTabCallback + 103;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        Map.Entry<readBomAsCharset, p3> next = it2.next();
                        key = next.getKey();
                        value = next.getValue();
                        int i5 = 7 / 0;
                        if (value.onExtraCallbackWithResult() != Float.MAX_VALUE) {
                            r8lambdapfkbnkyon4l81onw_fnufa36qi = new r8lambdapFKbNKyon4l81OnW_FNUfA36qI(value.onExtraCallbackWithResult(), value.IAuthTabCallback(), fAsBinder);
                            if (!r8lambdapfkbnkyon4l81onw_fnufa36qi.onExtraCallback()) {
                                if (!(!value.onWarmupCompleted()) && value.onExtraCallback()) {
                                    int i6 = onExtraCallbackWithResult + 25;
                                    IAuthTabCallback = i6 % 128;
                                    int i7 = i6 % 2;
                                    if (r8lambdapfkbnkyon4l81onw_fnufa36qi.onNavigationEvent()) {
                                    }
                                }
                            }
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.add(key);
                        }
                    } else {
                        Map.Entry<readBomAsCharset, p3> next2 = it2.next();
                        key = next2.getKey();
                        value = next2.getValue();
                        if (value.onExtraCallbackWithResult() != Float.MAX_VALUE) {
                            r8lambdapfkbnkyon4l81onw_fnufa36qi = new r8lambdapFKbNKyon4l81OnW_FNUfA36qI(value.onExtraCallbackWithResult(), value.IAuthTabCallback(), fAsBinder);
                            if (!r8lambdapfkbnkyon4l81onw_fnufa36qi.onExtraCallback()) {
                            }
                            if (hashSet == null) {
                            }
                            hashSet.add(key);
                        }
                    }
                }
                if (hashSet != null) {
                    return hashSet;
                }
                int i8 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    return clearFaultAdjacentMetadata.onExtraCallback();
                }
                clearFaultAdjacentMetadata.onExtraCallback();
                throw null;
            }
            int i9 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7 = (Camera2CameraControlExternalSyntheticLambda7) it.next();
            Object objIAuthTabCallback = camera2CameraControlExternalSyntheticLambda7.IAuthTabCallback();
            if (objIAuthTabCallback instanceof p1ExternalSyntheticLambda0) {
                int i11 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                p1externalsyntheticlambda0 = (p1ExternalSyntheticLambda0) objIAuthTabCallback;
            }
            if (p1externalsyntheticlambda0 != null) {
                readBomAsCharset section = p1externalsyntheticlambda0.getSection();
                if (pexternalsyntheticlambda1.onNavigationEvent(section)) {
                    continue;
                } else {
                    int i13 = onExtraCallbackWithResult + 49;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    p3 p3Var = map.get(section);
                    if (p3Var == null) {
                        p3Var = new p3();
                        map.put(section, p3Var);
                    }
                    p3 p3Var2 = p3Var;
                    float fOnWarmupCompleted = camera2CameraControlExternalSyntheticLambda7.onWarmupCompleted();
                    float fOnWarmupCompleted2 = camera2CameraControlExternalSyntheticLambda7.onWarmupCompleted() + camera2CameraControlExternalSyntheticLambda7.onNavigationEvent();
                    p3Var2.IAuthTabCallback(Math.min(p3Var2.onExtraCallbackWithResult(), fOnWarmupCompleted));
                    p3Var2.onExtraCallbackWithResult(Math.max(p3Var2.IAuthTabCallback(), fOnWarmupCompleted2));
                    int i15 = onWarmupCompleted.onWarmupCompleted[p1externalsyntheticlambda0.getBoundType().ordinal()];
                    if (i15 != 1) {
                        int i16 = IAuthTabCallback + 11;
                        onExtraCallbackWithResult = i16 % 128;
                        int i17 = i16 % 2;
                        if (i15 == 2) {
                            p3Var2.onExtraCallbackWithResult(true);
                            int i18 = IAuthTabCallback + 125;
                            onExtraCallbackWithResult = i18 % 128;
                            int i19 = i18 % 2;
                        } else if (i15 == 3) {
                            p3Var2.IAuthTabCallback(true);
                        } else {
                            if (i15 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            p3Var2.onExtraCallbackWithResult(true);
                            p3Var2.IAuthTabCallback(true);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull Set<? extends readBomAsCharset> set, @NotNull Map<readBomAsCharset, Long> map, @NotNull Function0<Unit> function0, @NotNull Function1<? super readBomAsCharset, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean z = false;
        for (readBomAsCharset readbomascharset : set) {
            int i2 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (map.get(readbomascharset) == null) {
                map.put(readbomascharset, Long.valueOf(System.currentTimeMillis()));
                z = true;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<readBomAsCharset, Long>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<readBomAsCharset, Long> next = it.next();
            readBomAsCharset key = next.getKey();
            long jLongValue = next.getValue().longValue();
            if (!set.contains(key)) {
                if (jCurrentTimeMillis - jLongValue >= 500) {
                    function1.invoke(key);
                }
                it.remove();
            }
        }
        if (z) {
            int i4 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            function0.invoke();
            if (i5 != 0) {
                int i6 = 69 / 0;
            }
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull findResAndMsg findresandmsg, @NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull pExternalSyntheticLambda1 pexternalsyntheticlambda1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(pexternalsyntheticlambda1, "");
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, textFieldScrollKtExternalSyntheticLambda0, new ConcurrentHashMap(), pexternalsyntheticlambda1, camera2CameraMetadataExternalSyntheticLambda1, findresandmsg, null), 3, (Object) null);
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ConcurrentHashMap<readBomAsCharset, getPackageType> $delayJobs;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Boolean> $isCurrentPage;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $lifecycleOwner;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        final /* synthetic */ findResAndMsg $scope;
        final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, ConcurrentHashMap<readBomAsCharset, getPackageType> concurrentHashMap, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, findResAndMsg findresandmsg, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$isCurrentPage = cameraPresenceProviderExternalSyntheticLambda6;
            this.$lifecycleOwner = textFieldScrollKtExternalSyntheticLambda0;
            this.$delayJobs = concurrentHashMap;
            this.$screenTracker = pexternalsyntheticlambda1;
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$scope = findresandmsg;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$isCurrentPage, this.$lifecycleOwner, this.$delayJobs, this.$screenTracker, this.$listState, this.$scope, access13800Var);
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 97;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.pExternalSyntheticLambda0$onExtraCallback$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ ConcurrentHashMap<readBomAsCharset, getPackageType> $delayJobs;
            final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
            final /* synthetic */ findResAndMsg $scope;
            final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
            /* synthetic */ boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ConcurrentHashMap<readBomAsCharset, getPackageType> concurrentHashMap, pExternalSyntheticLambda1 pexternalsyntheticlambda1, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, findResAndMsg findresandmsg, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$delayJobs = concurrentHashMap;
                this.$screenTracker = pexternalsyntheticlambda1;
                this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
                this.$scope = findresandmsg;
            }

            public static /* synthetic */ Request onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 53;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Request requestOnExtraCallbackWithResult = onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1);
                int i4 = onExtraCallback + 81;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return requestOnExtraCallbackWithResult;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$delayJobs, this.$screenTracker, this.$listState, this.$scope, access13800Var);
                anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
                int i2 = onExtraCallback + 15;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 68 / 0;
                }
                return anonymousClass4;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 73;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i3 == 0) {
                    return onExtraCallbackWithResult(zBooleanValue, access13800Var);
                }
                onExtraCallbackWithResult(zBooleanValue, access13800Var);
                throw null;
            }

            public final Object onExtraCallbackWithResult(boolean z, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(Boolean.valueOf(z), access13800Var);
                if (i3 != 0) {
                    return anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            private static final Request onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 41;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Request requestIAuthTabCallback_Parcel = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel();
                int i4 = onWarmupCompleted + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return requestIAuthTabCallback_Parcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* renamed from: o.pExternalSyntheticLambda0$onExtraCallback$4$5, reason: invalid class name */
            static final class AnonymousClass5 extends SuspendLambda implements Function2<Object, access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;
                final /* synthetic */ ConcurrentHashMap<readBomAsCharset, getPackageType> $delayJobs;
                final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
                final /* synthetic */ findResAndMsg $scope;
                final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, pExternalSyntheticLambda1 pexternalsyntheticlambda1, ConcurrentHashMap<readBomAsCharset, getPackageType> concurrentHashMap, findResAndMsg findresandmsg, access13800<? super AnonymousClass5> access13800Var) {
                    super(2, access13800Var);
                    this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
                    this.$screenTracker = pexternalsyntheticlambda1;
                    this.$delayJobs = concurrentHashMap;
                    this.$scope = findresandmsg;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$listState, this.$screenTracker, this.$delayJobs, this.$scope, access13800Var);
                    int i2 = onNavigationEvent + 47;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 35 / 0;
                    }
                    return anonymousClass5;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 99;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnWarmupCompleted = onWarmupCompleted(obj, (access13800) obj2);
                    int i4 = IAuthTabCallback + 7;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }

                public final Object onWarmupCompleted(Object obj, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 27;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(obj, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onNavigationEvent + 7;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        Request requestIAuthTabCallback_Parcel = this.$listState.IAuthTabCallback_Parcel();
                        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = this.$screenTracker;
                        ConcurrentHashMap<readBomAsCharset, getPackageType> concurrentHashMap = this.$delayJobs;
                        findResAndMsg findresandmsg = this.$scope;
                        this.label = 1;
                        if (pExternalSyntheticLambda0.onNavigationEvent(requestIAuthTabCallback_Parcel, pexternalsyntheticlambda1, concurrentHashMap, findresandmsg, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                            int i3 = IAuthTabCallback + 77;
                            onNavigationEvent = i3 % 128;
                            int i4 = i3 % 2;
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    Unit unit = Unit.INSTANCE;
                    int i5 = IAuthTabCallback + 55;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                boolean z = this.Z$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (!z) {
                        int i3 = onWarmupCompleted + 105;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Collection<getPackageType> collectionValues = this.$delayJobs.values();
                        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                        for (getPackageType getpackagetype : collectionValues) {
                            int i5 = onExtraCallback + 51;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            Intrinsics.checkNotNull(getpackagetype);
                            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                            int i7 = onExtraCallback + 23;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        this.$delayJobs.clear();
                        return Unit.INSTANCE;
                    }
                    final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                    IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(new IAnimation[]{CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.securities.core.exposure.LazyListImpressionEffectKt$runLegacyImpressionTracking$1$1$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i9 = 2 % 2;
                            int i10 = onNavigationEvent + 45;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            Request requestOnExtraCallback = pExternalSyntheticLambda0.onExtraCallback.AnonymousClass4.onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1);
                            int i12 = onNavigationEvent + 107;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            return requestOnExtraCallback;
                        }
                    }), (getTileModeX) pExternalSyntheticLambda1.IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this.$screenTracker}, 2046480637, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2046480635, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult()), this.$screenTracker.onTransact()});
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$listState, this.$screenTracker, this.$delayJobs, this.$scope, null);
                    this.Z$0 = z;
                    this.label = 1;
                    if (ycxycx.onWarmupCompleted(iAnimationOnExtraCallbackWithResult, anonymousClass5, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
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

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation<Boolean> iAnimationOnExtraCallback = pExternalSyntheticLambda1.Companion.onExtraCallback(this.$isCurrentPage, this.$lifecycleOwner);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$delayJobs, this.$screenTracker, this.$listState, this.$scope, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnExtraCallback, anonymousClass4, this) == objOnWarmupCompleted) {
                    int i3 = onExtraCallback + 57;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 59 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallbackWithResult + 17;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Map<readBomAsCharset, getPackageType> $delayJobs;
        final /* synthetic */ Request $layoutInfo;
        final /* synthetic */ findResAndMsg $scope;
        final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
        final /* synthetic */ float $viewportHeight;
        int label;

        /* renamed from: o.pExternalSyntheticLambda0$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final /* synthetic */ class C0049onNavigationEvent {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            public static final /* synthetic */ int[] onNavigationEvent;

            static {
                int[] iArr = new int[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.values().length];
                try {
                    iArr[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.Body.ordinal()] = 1;
                    int i = IAuthTabCallback + 39;
                    onExtraCallback = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 3 % 4;
                    } else {
                        int i3 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.Header.ordinal()] = 2;
                    int i4 = onExtraCallback + 107;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.Footer.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[r8lambdalLFfNkAUsyAZXqx0p6sDgBDY.Whole.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                onNavigationEvent = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Request request, pExternalSyntheticLambda1 pexternalsyntheticlambda1, float f, Map<readBomAsCharset, getPackageType> map, findResAndMsg findresandmsg, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$layoutInfo = request;
            this.$screenTracker = pexternalsyntheticlambda1;
            this.$viewportHeight = f;
            this.$delayJobs = map;
            this.$scope = findresandmsg;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$layoutInfo, this.$screenTracker, this.$viewportHeight, this.$delayJobs, this.$scope, access13800Var);
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 111;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 54 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0183 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00bc A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0181 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = this.$layoutInfo.onTransact().iterator();
            while (true) {
                if (!it.hasNext()) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        int i4 = IAuthTabCallback + 7;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        readBomAsCharset readbomascharset = (readBomAsCharset) entry.getKey();
                        p3 p3Var = (p3) entry.getValue();
                        if (p3Var.onExtraCallbackWithResult() != Float.MAX_VALUE) {
                            r8lambdapFKbNKyon4l81OnW_FNUfA36qI r8lambdapfkbnkyon4l81onw_fnufa36qi = new r8lambdapFKbNKyon4l81OnW_FNUfA36qI(p3Var.onExtraCallbackWithResult(), p3Var.IAuthTabCallback(), this.$viewportHeight);
                            if (!r8lambdapfkbnkyon4l81onw_fnufa36qi.onExtraCallback()) {
                                int i6 = onWarmupCompleted + 125;
                                IAuthTabCallback = i6 % 128;
                                int i7 = i6 % 2;
                                if (p3Var.onWarmupCompleted() && p3Var.onExtraCallback()) {
                                    int i8 = onWarmupCompleted + 57;
                                    IAuthTabCallback = i8 % 128;
                                    int i9 = i8 % 2;
                                    if (r8lambdapfkbnkyon4l81onw_fnufa36qi.onNavigationEvent()) {
                                        z = true;
                                    }
                                    if (z) {
                                        getPackageType getpackagetype = this.$delayJobs.get(readbomascharset);
                                        if (getpackagetype != null) {
                                            int i10 = onWarmupCompleted + 65;
                                            IAuthTabCallback = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                if (getpackagetype.onExtraCallback()) {
                                                }
                                            } else if (!getpackagetype.onExtraCallback()) {
                                            }
                                        }
                                        this.$delayJobs.put(readbomascharset, maybeUpdateAnimatable.onNavigationEvent(this.$scope, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(this.$screenTracker, readbomascharset, null), 3, (Object) null));
                                    }
                                    if (z) {
                                        int i11 = IAuthTabCallback + 35;
                                        onWarmupCompleted = i11 % 128;
                                        int i12 = i11 % 2;
                                        getPackageType getpackagetype2 = this.$delayJobs.get(readbomascharset);
                                        if (getpackagetype2 != null) {
                                            int i13 = onWarmupCompleted + 95;
                                            IAuthTabCallback = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
                                            } else {
                                                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
                                            }
                                        }
                                        this.$delayJobs.remove(readbomascharset);
                                    }
                                }
                                int i14 = IAuthTabCallback + 75;
                                onWarmupCompleted = i14 % 128;
                                int i15 = i14 % 2;
                                z = false;
                                if (z) {
                                }
                                if (z) {
                                }
                            }
                        }
                    }
                    Iterator<Map.Entry<readBomAsCharset, getPackageType>> it2 = this.$delayJobs.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<readBomAsCharset, getPackageType> next = it2.next();
                        readBomAsCharset key = next.getKey();
                        getPackageType value = next.getValue();
                        if (!linkedHashSet.contains(key)) {
                            getPackageType.onWarmupCompleted.onWarmupCompleted(value, (CancellationException) null, 1, (Object) null);
                            it2.remove();
                        }
                    }
                    return Unit.INSTANCE;
                }
                int i16 = IAuthTabCallback + 7;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7 = (Camera2CameraControlExternalSyntheticLambda7) it.next();
                Object objIAuthTabCallback = camera2CameraControlExternalSyntheticLambda7.IAuthTabCallback();
                p1ExternalSyntheticLambda0 p1externalsyntheticlambda0 = !((objIAuthTabCallback instanceof p1ExternalSyntheticLambda0) ^ true) ? (p1ExternalSyntheticLambda0) objIAuthTabCallback : null;
                if (p1externalsyntheticlambda0 != null) {
                    readBomAsCharset section = p1externalsyntheticlambda0.getSection();
                    if (this.$screenTracker.onNavigationEvent(section)) {
                        continue;
                    } else {
                        linkedHashSet.add(section);
                        Object p3Var2 = linkedHashMap.get(section);
                        if (p3Var2 == null) {
                            p3Var2 = new p3();
                            linkedHashMap.put(section, p3Var2);
                        }
                        p3 p3Var3 = (p3) p3Var2;
                        float fOnWarmupCompleted = camera2CameraControlExternalSyntheticLambda7.onWarmupCompleted();
                        float fOnWarmupCompleted2 = camera2CameraControlExternalSyntheticLambda7.onWarmupCompleted() + camera2CameraControlExternalSyntheticLambda7.onNavigationEvent();
                        p3Var3.IAuthTabCallback(Math.min(p3Var3.onExtraCallbackWithResult(), fOnWarmupCompleted));
                        p3Var3.onExtraCallbackWithResult(Math.max(p3Var3.IAuthTabCallback(), fOnWarmupCompleted2));
                        int i18 = C0049onNavigationEvent.onNavigationEvent[p1externalsyntheticlambda0.getBoundType().ordinal()];
                        if (i18 == 1) {
                            continue;
                        } else if (i18 != 2) {
                            int i19 = onWarmupCompleted + 77;
                            IAuthTabCallback = i19 % 128;
                            if (i19 % 2 != 0) {
                                if (i18 == 2) {
                                    p3Var3.IAuthTabCallback(true);
                                } else {
                                    if (i18 == 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    p3Var3.onExtraCallbackWithResult(true);
                                    p3Var3.IAuthTabCallback(true);
                                }
                            } else if (i18 == 3) {
                                p3Var3.IAuthTabCallback(true);
                            } else if (i18 == 4) {
                            }
                        } else {
                            p3Var3.onExtraCallbackWithResult(true);
                        }
                    }
                }
            }
        }

        /* renamed from: o.pExternalSyntheticLambda0$onNavigationEvent$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
            final /* synthetic */ readBomAsCharset $section;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(pExternalSyntheticLambda1 pexternalsyntheticlambda1, readBomAsCharset readbomascharset, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$screenTracker = pexternalsyntheticlambda1;
                this.$section = readbomascharset;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$screenTracker, this.$section, access13800Var);
                int i2 = IAuthTabCallback + 61;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass4;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 123;
                onExtraCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    onExtraCallback(findresandmsg, access13800Var);
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = IAuthTabCallback + 89;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass4Create.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass4Create.invokeSuspend(unit);
                int i4 = IAuthTabCallback + 115;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallback + 83;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i4 = IAuthTabCallback + 79;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(500L, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                pExternalSyntheticLambda1.onExtraCallback(this.$screenTracker, this.$section, null, 2, null);
                Unit unit = Unit.INSTANCE;
                int i6 = onExtraCallback + 53;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 78 / 0;
                }
                return unit;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v11 float, still in use, count: 2, list:
          (r1v11 float) from 0x003b: PHI (r1v7 float) = (r1v6 float), (r1v11 float) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
          (r1v11 float) from 0x0016: CMP_G (r1v11 float), (2.0f float) A[WRAPPED]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull o.Request r9, @org.jetbrains.annotations.NotNull o.pExternalSyntheticLambda1 r10, @org.jetbrains.annotations.NotNull java.util.Map<o.readBomAsCharset, o.getPackageType> r11, @org.jetbrains.annotations.NotNull o.findResAndMsg r12, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.pExternalSyntheticLambda0.IAuthTabCallback
            int r1 = r1 + 87
            int r2 = r1 % 128
            o.pExternalSyntheticLambda0.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            long r1 = r9.asBinder()
            int r1 = (int) r1
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L3b
            goto L26
        L1b:
            long r1 = r9.asBinder()
            int r1 = (int) r1
            float r1 = (float) r1
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L3b
        L26:
            int r9 = o.pExternalSyntheticLambda0.IAuthTabCallback
            int r9 = r9 + 77
            int r10 = r9 % 128
            o.pExternalSyntheticLambda0.onExtraCallbackWithResult = r10
            int r9 = r9 % r0
            if (r9 == 0) goto L34
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L34:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            r9 = 0
            r9.hashCode()
            throw r9
        L3b:
            r3 = r1
            o.GeckoHubImp r7 = o.putChannelInfo.onWarmupCompleted()
            o.pExternalSyntheticLambda0$onNavigationEvent r8 = new o.pExternalSyntheticLambda0$onNavigationEvent
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r9 = o.maybeUpdateAnimatable.onExtraCallback(r7, r8, r13)
            java.lang.Object r10 = o.access14300.onWarmupCompleted()
            if (r9 != r10) goto L56
            return r9
        L56:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pExternalSyntheticLambda0.onNavigationEvent(o.Request, o.pExternalSyntheticLambda1, java.util.Map, o.findResAndMsg, o.access13800):java.lang.Object");
    }

    private static final decrementVideoUsage IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, pExternalSyntheticLambda1 pexternalsyntheticlambda1, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        if (newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4159)) {
            onNavigationEvent(findresandmsgOnWarmupCompleted, camera2CameraMetadataExternalSyntheticLambda1, (CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6, textFieldScrollKtExternalSyntheticLambda0, pexternalsyntheticlambda1);
            int i4 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            onExtraCallbackWithResult(findresandmsgOnWarmupCompleted, camera2CameraMetadataExternalSyntheticLambda1, (CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6, textFieldScrollKtExternalSyntheticLambda0, pexternalsyntheticlambda1);
            int i6 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 5;
            }
        }
        return new IAuthTabCallback(findresandmsgOnWarmupCompleted);
    }

    public static final void onNavigationEvent(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), -1973722171, a.3.onWarmupCompleted(), objArr, iOnWarmupCompleted, 1973722172);
    }

    public static final /* synthetic */ void onWarmupCompleted(Ref.ObjectRef objectRef, findResAndMsg findresandmsg, HashMap map, pExternalSyntheticLambda1 pexternalsyntheticlambda1) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        onWarmupCompleted(a.3.onWarmupCompleted(), iOnWarmupCompleted2, -645312207, a.3.onWarmupCompleted(), new Object[]{objectRef, findresandmsg, map, pexternalsyntheticlambda1}, iOnWarmupCompleted, 645312207);
    }
}
