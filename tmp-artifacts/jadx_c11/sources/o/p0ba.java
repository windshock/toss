package o;

import androidx.compose.ui.geometry.Rect;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class p0ba extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements ImmutableZoomState, StreamSpecQueryResult {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private readBomAsCharset IAuthTabCallback;
    private volatile boolean IAuthTabCallbackStub;
    private Function0<Unit> onExtraCallback;
    private getPackageType onExtraCallbackWithResult;
    private getPackageType onNavigationEvent;
    private getPackageType onTransact;
    private Futures3 onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i3 = IAuthTabCallbackDefault + 85;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public abstract void onNavigationEvent(@NotNull pExternalSyntheticLambda1 pexternalsyntheticlambda1);

    public p0ba(@NotNull readBomAsCharset readbomascharset, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = readbomascharset;
        this.onExtraCallback = function0;
    }

    protected readBomAsCharset access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 73;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        readBomAsCharset readbomascharset = this.IAuthTabCallback;
        int i5 = i2 + 79;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return readbomascharset;
    }

    protected void onWarmupCompleted(@NotNull readBomAsCharset readbomascharset) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        this.IAuthTabCallback = readbomascharset;
        int i4 = asInterface + 17;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 33;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
        return unit2;
    }

    protected Function0<Unit> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Function0<Unit> function0 = this.onExtraCallback;
        int i5 = i3 + 61;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return function0;
    }

    protected void onNavigationEvent(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.onExtraCallback = function0;
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
            this.onExtraCallback = function0;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    protected final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub = z;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = p0ba.this.new onWarmupCompleted(access13800Var);
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws setWrite {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws setWrite {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        public final Object invokeSuspend(Object obj) throws setWrite {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onWarmupCompleted + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {(pExternalSyntheticLambda1) isVideoSurface.onExtraCallbackWithResult(p0ba.this, pExternalSyntheticLambda2.onExtraCallback())};
                getTileModeX gettilemodex = (getTileModeX) pExternalSyntheticLambda1.IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, 2046480637, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2046480635, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                final p0ba p0baVar = p0ba.this;
                setRipple setripple = new setRipple() { // from class: o.p0ba.onWarmupCompleted.1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 85;
                        onNavigationEvent = i7 % 128;
                        Object obj3 = null;
                        Unit unit = (Unit) obj2;
                        if (i7 % 2 != 0) {
                            onExtraCallbackWithResult(unit, access13800Var);
                            obj3.hashCode();
                            throw null;
                        }
                        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(unit, access13800Var);
                        int i8 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            return objOnExtraCallbackWithResult;
                        }
                        throw null;
                    }

                    public final Object onExtraCallbackWithResult(Unit unit, access13800<? super Unit> access13800Var) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 61;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 != 0) {
                            p0baVar.access100();
                            int i8 = 46 / 0;
                            return Unit.INSTANCE;
                        }
                        p0baVar.access100();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (gettilemodex.collect(setripple, this) == objOnWarmupCompleted) {
                    int i6 = onWarmupCompleted + 75;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            }
            throw new setWrite();
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 65 / 0;
            return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = p0ba.this.new onNavigationEvent(access13800Var);
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 54 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        public final Object invokeSuspend(Object obj) throws setWrite {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                getTileModeX<readBomAsCharset> gettilemodexOnTransact = ((pExternalSyntheticLambda1) isVideoSurface.onExtraCallbackWithResult(p0ba.this, pExternalSyntheticLambda2.onExtraCallback())).onTransact();
                final p0ba p0baVar = p0ba.this;
                setRipple setripple = new setRipple() { // from class: o.p0ba.onNavigationEvent.2
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public /* synthetic */ Object emit(Object obj3, access13800 access13800Var) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 115;
                        onExtraCallbackWithResult = i5 % 128;
                        readBomAsCharset readbomascharset = (readBomAsCharset) obj3;
                        if (i5 % 2 != 0) {
                            onExtraCallbackWithResult(readbomascharset, access13800Var);
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(readbomascharset, access13800Var);
                        int i6 = onExtraCallbackWithResult + 45;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return objOnExtraCallbackWithResult;
                    }

                    public final Object onExtraCallbackWithResult(readBomAsCharset readbomascharset, access13800<? super Unit> access13800Var) {
                        int i4 = 2 % 2;
                        Object obj3 = null;
                        if (Intrinsics.areEqual(readbomascharset, p0baVar.access000())) {
                            int i5 = onExtraCallbackWithResult + 81;
                            onExtraCallback = i5 % 128;
                            if (i5 % 2 != 0) {
                                p0baVar.access100();
                            } else {
                                p0baVar.access100();
                                obj3.hashCode();
                                throw null;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        int i6 = onExtraCallbackWithResult + 43;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            return unit;
                        }
                        throw null;
                    }
                };
                this.label = 1;
                if (gettilemodexOnTransact.collect(setripple, this) == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 35;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            throw new setWrite();
        }
    }

    public void O_() {
        int i = 2 % 2;
        this.onExtraCallbackWithResult = maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        this.onTransact = maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
        int i2 = IAuthTabCallbackDefault + 11;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
    }

    public void asInterface() {
        int i = 2 % 2;
        getPackageType getpackagetype = this.onNavigationEvent;
        if (getpackagetype != null) {
            int i2 = IAuthTabCallbackDefault + 33;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
            } else {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        getPackageType getpackagetype2 = this.onExtraCallbackWithResult;
        if (getpackagetype2 != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
        }
        getPackageType getpackagetype3 = this.onTransact;
        if (getpackagetype3 != null) {
            int i3 = asInterface + 75;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype3, (CancellationException) null, 1, (Object) null);
        }
        this.onWarmupCompleted = null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ pExternalSyntheticLambda1 $screenTracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(pExternalSyntheticLambda1 pexternalsyntheticlambda1, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$screenTracker = pexternalsyntheticlambda1;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = p0ba.this.new onExtraCallbackWithResult(this.$screenTracker, access13800Var);
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 81;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallback + 93;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(500L, this) == objOnWarmupCompleted) {
                    int i7 = onWarmupCompleted;
                    int i8 = i7 + 117;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i9 = i7 + 105;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnWarmupCompleted;
                }
            }
            p0ba.this.onNavigationEvent(this.$screenTracker);
            p0ba.this.getInterfaceDescriptor().invoke();
            p0ba.this.IAuthTabCallback(true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[PHI: r1
      0x0052: PHI (r1v13 androidx.compose.ui.geometry.Rect) = (r1v12 androidx.compose.ui.geometry.Rect), (r1v20 androidx.compose.ui.geometry.Rect) binds: [B:17:0x0050, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@NotNull Futures3 futures3) {
        Rect rectOnWarmupCompleted;
        getPackageType getpackagetype;
        getPackageType getpackagetype2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        if (ICustomTabsCallbackStub()) {
            int i2 = IAuthTabCallbackDefault + 101;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (futures3.IAuthTabCallbackStub()) {
                this.onWarmupCompleted = futures3;
                if (this.IAuthTabCallbackStub) {
                    return;
                }
                int i4 = IAuthTabCallbackDefault + 63;
                asInterface = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        rectOnWarmupCompleted = FuturesCallbackListener.onWarmupCompleted(futures3, true, 1, (Object) null);
                        if (!Intrinsics.areEqual(rectOnWarmupCompleted, Rect.Companion.onWarmupCompleted())) {
                            boolean zIAuthTabCallback = new r8lambdapFKbNKyon4l81OnW_FNUfA36qI(rectOnWarmupCompleted.extraCallback(), rectOnWarmupCompleted.IAuthTabCallbackDefault(), (int) FuturesCallbackListener.onNavigationEvent(futures3).asBinder()).IAuthTabCallback();
                            if (zIAuthTabCallback && ((getpackagetype2 = this.onNavigationEvent) == null || !getpackagetype2.onExtraCallback())) {
                                pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) isVideoSurface.onExtraCallbackWithResult(this, pExternalSyntheticLambda2.onExtraCallback());
                                this.onNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (GeckoHubImp) pExternalSyntheticLambda1.IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{pexternalsyntheticlambda1}, -1636102543, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1636102544, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult()), (setRandomHost) null, new onExtraCallbackWithResult(pexternalsyntheticlambda1, null), 2, (Object) null);
                                return;
                            }
                            if ((!zIAuthTabCallback) && (getpackagetype = this.onNavigationEvent) != null) {
                                int i5 = IAuthTabCallbackDefault + 119;
                                asInterface = i5 % 128;
                                int i6 = i5 % 2;
                                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                            }
                        }
                    } else {
                        rectOnWarmupCompleted = FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null);
                        if (!Intrinsics.areEqual(rectOnWarmupCompleted, Rect.Companion.onWarmupCompleted())) {
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    protected final void access100() {
        Futures3 futures3;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub = false;
        getPackageType getpackagetype = this.onNavigationEvent;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        if (ICustomTabsCallbackStub() && (futures3 = this.onWarmupCompleted) != null && futures3.IAuthTabCallbackStub()) {
            int i4 = asInterface + 13;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback(futures3);
            int i6 = asInterface + 43;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }
    }
}
