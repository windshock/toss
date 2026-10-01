package o;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import o.getShowingListenerWrappers;
import o.isQueryRefinementEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getShowingListenerWrappers extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements flipY {
    private static int ICustomTabsCallback = 0;
    private static int writeTypedObject = 1;
    private boolean IAuthTabCallback;
    private Function1<? super isAdaptiveAdViewFormat, Unit> IAuthTabCallbackDefault;
    private noStore IAuthTabCallbackStub;
    private getReward IAuthTabCallbackStubProxy;
    private String IAuthTabCallback_Parcel;
    private getConfiguration<Float> access000;
    private boolean access100;
    private Function0<Unit> asInterface;
    private getCachingExecutorService extraCallbackWithResult;
    private long getInterfaceDescriptor;
    private Context onExtraCallback;
    private List<isQueryRefinementEnabled<Float, onSuggestionsKey>> onExtraCallbackWithResult;
    private HandlerScheduledExecutorServiceHandlerScheduledFuture onNavigationEvent;
    private final isQueryRefinementEnabled<Float, onSuggestionsKey> onTransact;
    private long onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = ~i6;
        int i10 = ~i3;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i5 | i3)) | (~(i7 | i9 | i10));
        int i13 = i6 + i3 + i + ((-1136091917) * i2) + (376669458 * i4);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i6) + 1718550528 + ((-1748215485) * i3) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i) + ((-2044854272) * i2) + (41156608 * i4) + (1721171968 * i14);
        int i16 = ((i6 * (-924404593)) - 1636593565) + (i3 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i * (-924404175)) + (i2 * (-2083730301)) + (i4 * 182666354) + (i14 * (-51970048));
        int i17 = i15 + (i16 * i16 * (-653721600));
        return i17 != 1 ? i17 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public boolean I_() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return true;
    }

    public getShowingListenerWrappers(@NotNull Context context, @NotNull getReward getreward, @NotNull getConfiguration<Float> getconfiguration, @NotNull getCachingExecutorService getcachingexecutorservice, @NotNull List<isQueryRefinementEnabled<Float, onSuggestionsKey>> list, boolean z, @NotNull noStore nostore, boolean z2, long j, @Nullable String str, @NotNull Function0<Unit> function0, @Nullable Function1<? super isAdaptiveAdViewFormat, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getreward, "");
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(nostore, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback = context;
        this.IAuthTabCallbackStubProxy = getreward;
        this.access000 = getconfiguration;
        this.extraCallbackWithResult = getcachingexecutorservice;
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallback = z;
        this.IAuthTabCallbackStub = nostore;
        this.access100 = z2;
        this.getInterfaceDescriptor = j;
        this.IAuthTabCallback_Parcel = str;
        this.asInterface = function0;
        this.IAuthTabCallbackDefault = function1;
        this.onTransact = isIconified.onWarmupCompleted(getconfiguration.onExtraCallback().floatValue(), 0.0f, 2, (Object) null);
        this.onWarmupCompleted = setUseCaseAttached.Companion.IAuthTabCallback();
    }

    public static final /* synthetic */ isQueryRefinementEnabled onExtraCallbackWithResult(getShowingListenerWrappers getshowinglistenerwrappers) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = getshowinglistenerwrappers.onTransact;
        int i5 = i3 + 85;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return isqueryrefinementenabled;
        }
        throw null;
    }

    public final void IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            this.onExtraCallback = context;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            this.onExtraCallback = context;
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getShowingListenerWrappers getshowinglistenerwrappers = (getShowingListenerWrappers) objArr[0];
        getReward getreward = (getReward) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getreward, "");
            getshowinglistenerwrappers.IAuthTabCallbackStubProxy = getreward;
            return null;
        }
        Intrinsics.checkNotNullParameter(getreward, "");
        getshowinglistenerwrappers.IAuthTabCallbackStubProxy = getreward;
        int i3 = 64 / 0;
        return null;
    }

    public final getReward asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        getReward getreward = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 9;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return getreward;
    }

    public final void onExtraCallback(@NotNull getConfiguration<Float> getconfiguration) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        this.access000 = getconfiguration;
        int i4 = ICustomTabsCallback + 89;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(@NotNull getCachingExecutorService getcachingexecutorservice) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        this.extraCallbackWithResult = getcachingexecutorservice;
        int i4 = ICustomTabsCallback + 29;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@NotNull List<isQueryRefinementEnabled<Float, onSuggestionsKey>> list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = list;
        int i4 = ICustomTabsCallback + 31;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull noStore nostore) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nostore, "");
        this.IAuthTabCallbackStub = nostore;
        int i4 = writeTypedObject + 25;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getShowingListenerWrappers getshowinglistenerwrappers = (getShowingListenerWrappers) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getshowinglistenerwrappers.access100 = zBooleanValue;
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public final void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 41;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.getInterfaceDescriptor = j;
        int i5 = i2 + 3;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback_Parcel = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.asInterface = function0;
        int i4 = writeTypedObject + 125;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@Nullable Function1<? super isAdaptiveAdViewFormat, Unit> function1) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 17;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = function1;
        int i5 = i2 + 11;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallbackStub() {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            fFloatValue = this.access000.onExtraCallback().floatValue();
            int i3 = 77 / 0;
            if (((Number) this.onTransact.IAuthTabCallback()).floatValue() == fFloatValue) {
                return;
            }
        } else {
            fFloatValue = this.access000.onExtraCallback().floatValue();
            if (((Number) this.onTransact.IAuthTabCallback()).floatValue() == fFloatValue) {
                return;
            }
        }
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(fFloatValue, null), 3, (Object) null);
        int i4 = ICustomTabsCallback + 99;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ float $previousScale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(float f, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$previousScale = f;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = getShowingListenerWrappers.this.new IAuthTabCallback(this.$previousScale, access13800Var);
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 95;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 9;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 31;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled isqueryrefinementenabledOnExtraCallbackWithResult = getShowingListenerWrappers.onExtraCallbackWithResult(getShowingListenerWrappers.this);
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$previousScale);
                this.label = 1;
                if (isqueryrefinementenabledOnExtraCallbackWithResult.onWarmupCompleted(fOnExtraCallbackWithResult, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            getShowingListenerWrappers.this.asBinder().onExtraCallbackWithResult(this.$previousScale);
            Unit unit = Unit.INSTANCE;
            int i6 = onNavigationEvent + 31;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(@NotNull newHandlerExecutor newhandlerexecutor, @NotNull createPostFailedException createpostfailedexception, long j) {
        boolean z;
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(newhandlerexecutor, "");
        Intrinsics.checkNotNullParameter(createpostfailedexception, "");
        if (createpostfailedexception == createPostFailedException.Initial && this.IAuthTabCallback) {
            for (HandlerScheduledExecutorService2 handlerScheduledExecutorService2 : newhandlerexecutor.onExtraCallbackWithResult()) {
                int i4 = ICustomTabsCallback + 13;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                if (handlerScheduledExecutorService2.IAuthTabCallbackStub()) {
                    int i6 = ICustomTabsCallback + 7;
                    writeTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                    if (!handlerScheduledExecutorService2.asInterface()) {
                        int i8 = writeTypedObject + 29;
                        ICustomTabsCallback = i8 % 128;
                        z = i8 % 2 == 0;
                    }
                }
                boolean z2 = !handlerScheduledExecutorService2.IAuthTabCallbackStub() && handlerScheduledExecutorService2.asInterface();
                HandlerScheduledExecutorServiceHandlerScheduledFuture handlerScheduledExecutorServiceHandlerScheduledFuture = this.onNavigationEvent;
                if (handlerScheduledExecutorServiceHandlerScheduledFuture == null) {
                    int i9 = writeTypedObject + 29;
                    ICustomTabsCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z) {
                        onWarmupCompleted(handlerScheduledExecutorService2);
                    }
                }
                long jOnNavigationEvent = handlerScheduledExecutorService2.onNavigationEvent();
                if (handlerScheduledExecutorServiceHandlerScheduledFuture != null) {
                    int i10 = ICustomTabsCallback + 99;
                    writeTypedObject = i10 % 128;
                    if (i10 % 2 == 0) {
                        zOnExtraCallbackWithResult = HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(handlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(), jOnNavigationEvent);
                        int i11 = 85 / 0;
                    } else {
                        zOnExtraCallbackWithResult = HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(handlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(), jOnNavigationEvent);
                    }
                    if (zOnExtraCallbackWithResult) {
                        int i12 = writeTypedObject;
                        int i13 = i12 + 41;
                        ICustomTabsCallback = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = 37 / 0;
                            if (z2) {
                                int i15 = i12 + 101;
                                ICustomTabsCallback = i15 % 128;
                                int i16 = i15 % 2;
                                onExtraCallbackWithResult(handlerScheduledExecutorService2, j);
                                int i17 = writeTypedObject + 65;
                                ICustomTabsCallback = i17 % 128;
                                int i18 = i17 % 2;
                            }
                        } else if (z2) {
                            int i152 = i12 + 101;
                            ICustomTabsCallback = i152 % 128;
                            int i162 = i152 % 2;
                            onExtraCallbackWithResult(handlerScheduledExecutorService2, j);
                            int i172 = writeTypedObject + 65;
                            ICustomTabsCallback = i172 % 128;
                            int i182 = i172 % 2;
                        }
                    }
                }
            }
        }
    }

    public void access000() {
        int i = 2 % 2;
        if (this.onNavigationEvent != null) {
            int i2 = writeTypedObject + 103;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            this.onNavigationEvent = null;
            if (!this.access100) {
                int i5 = i3 + 57;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this, Float.valueOf(this.access000.onExtraCallback().floatValue()), false}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1182908372, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1182908374);
            }
            Function1<? super isAdaptiveAdViewFormat, Unit> function1 = this.IAuthTabCallbackDefault;
            if (function1 != null) {
                getWrappingSdk getwrappingsdk = getWrappingSdk.Cancel;
                long j = this.onWarmupCompleted;
                function1.invoke(new isAdaptiveAdViewFormat(getwrappingsdk, j, j, null));
                int i7 = ICustomTabsCallback + 13;
                writeTypedObject = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    private final void onWarmupCompleted(HandlerScheduledExecutorService2 handlerScheduledExecutorService2) {
        long jLongValue;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Function0<Unit> function0 = this.IAuthTabCallback_Parcel;
        if (function0 == null) {
            function0 = this.asInterface;
        }
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        synchronized (((WeakHashMap) configureReward.onExtraCallback(zzgc.onExtraCallbackWithResult(), -893754090, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[0], 893754091, iOnExtraCallbackWithResult))) {
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            Long l = (Long) ((WeakHashMap) configureReward.onExtraCallback(zzgc.onExtraCallbackWithResult(), -893754090, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[0], 893754091, iOnExtraCallbackWithResult2)).get(function0);
            jLongValue = l != null ? l.longValue() : 0L;
        }
        long j = this.getInterfaceDescriptor;
        if (j <= 0 || jElapsedRealtime - jLongValue >= j) {
            int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
            synchronized (((WeakHashMap) configureReward.onExtraCallback(zzgc.onExtraCallbackWithResult(), -893754090, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[0], 893754091, iOnExtraCallbackWithResult3))) {
                int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
                ((WeakHashMap) configureReward.onExtraCallback(zzgc.onExtraCallbackWithResult(), -893754090, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[0], 893754091, iOnExtraCallbackWithResult4)).put(function0, Long.valueOf(jElapsedRealtime));
                Unit unit = Unit.INSTANCE;
            }
            this.onNavigationEvent = HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallback(handlerScheduledExecutorService2.onNavigationEvent());
            this.onWarmupCompleted = handlerScheduledExecutorService2.IAuthTabCallback();
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, noStore.Companion.onExtraCallbackWithResult())) {
                minFresh.onNavigationEvent(this.onExtraCallback, this.IAuthTabCallbackStub);
            }
            onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this, Float.valueOf(this.access000.onWarmupCompleted().floatValue()), true}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1182908372, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1182908374);
            Function1<? super isAdaptiveAdViewFormat, Unit> function1 = this.IAuthTabCallbackDefault;
            if (function1 != null) {
                getWrappingSdk getwrappingsdk = getWrappingSdk.Down;
                long j2 = this.onWarmupCompleted;
                function1.invoke(new isAdaptiveAdViewFormat(getwrappingsdk, j2, j2, null));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(HandlerScheduledExecutorService2 handlerScheduledExecutorService2, long j) {
        boolean z;
        int i = 2 % 2;
        long jIAuthTabCallback = handlerScheduledExecutorService2.IAuthTabCallback();
        float f = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jIAuthTabCallback >> 32));
        if (0.0f > fIntBitsToFloat || fIntBitsToFloat > f) {
            int i2 = ICustomTabsCallback + 1;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        } else {
            float f2 = (int) j;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) jIAuthTabCallback);
            if (0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f2) {
                z = true;
            }
        }
        if (!this.access100) {
            onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this, Float.valueOf(this.access000.onExtraCallback().floatValue()), false}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1182908372, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1182908374);
        }
        if (!(!z)) {
            this.asInterface.invoke();
        }
        Function1<? super isAdaptiveAdViewFormat, Unit> function1 = this.IAuthTabCallbackDefault;
        if (function1 != null) {
            function1.invoke(new isAdaptiveAdViewFormat(getWrappingSdk.Up, jIAuthTabCallback, this.onWarmupCompleted, null));
        }
        this.onNavigationEvent = null;
        int i4 = writeTypedObject + 45;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ onItemClicked<Float> $animationSpec;
        final /* synthetic */ float $target;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(float f, onItemClicked<Float> onitemclicked, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$target = f;
            this.$animationSpec = onitemclicked;
        }

        public static /* synthetic */ Unit onExtraCallback(getShowingListenerWrappers getshowinglistenerwrappers, isQueryRefinementEnabled isqueryrefinementenabled) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(getshowinglistenerwrappers, isqueryrefinementenabled);
            }
            onWarmupCompleted(getshowinglistenerwrappers, isqueryrefinementenabled);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = getShowingListenerWrappers.this.new onWarmupCompleted(this.$target, this.$animationSpec, access13800Var);
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            throw null;
        }

        private static final Unit onWarmupCompleted(getShowingListenerWrappers getshowinglistenerwrappers, isQueryRefinementEnabled isqueryrefinementenabled) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getshowinglistenerwrappers.asBinder().onExtraCallbackWithResult(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled isqueryrefinementenabledOnExtraCallbackWithResult = getShowingListenerWrappers.onExtraCallbackWithResult(getShowingListenerWrappers.this);
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$target);
                onItemClicked<Float> onitemclicked = this.$animationSpec;
                final getShowingListenerWrappers getshowinglistenerwrappers = getShowingListenerWrappers.this;
                Function1 function1 = new Function1() { // from class: im.toss.tds.compose.foundation.TdsClickableModifierNode$animateTo$1$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 105;
                        onNavigationEvent = i5 % 128;
                        Object obj3 = null;
                        if (i5 % 2 == 0) {
                            getShowingListenerWrappers.onWarmupCompleted.onExtraCallback(getshowinglistenerwrappers, (isQueryRefinementEnabled) obj2);
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallback = getShowingListenerWrappers.onWarmupCompleted.onExtraCallback(getshowinglistenerwrappers, (isQueryRefinementEnabled) obj2);
                        int i6 = onWarmupCompleted + 125;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                };
                this.label = 1;
                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabledOnExtraCallbackWithResult, fOnExtraCallbackWithResult, onitemclicked, (Object) null, function1, this, 4, (Object) null) == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 103;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallback + 109;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i6 != 0) {
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $anim;
        final /* synthetic */ onItemClicked<Float> $animationSpec;
        final /* synthetic */ float $target;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, float f, onItemClicked<Float> onitemclicked, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$anim = isqueryrefinementenabled;
            this.$target = f;
            this.$animationSpec = onitemclicked;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$anim, this.$target, this.$animationSpec, access13800Var);
            int i2 = onWarmupCompleted + 121;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 40 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = onWarmupCompleted + 17;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 5;
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$anim;
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$target);
                onItemClicked<Float> onitemclicked = this.$animationSpec;
                this.label = 1;
                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, onitemclicked, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                    int i9 = onWarmupCompleted + 33;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getShowingListenerWrappers getshowinglistenerwrappers = (getShowingListenerWrappers) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        onItemClicked<Float> onitemclickedProduce = getshowinglistenerwrappers.extraCallbackWithResult.produce(((Boolean) objArr[2]).booleanValue());
        maybeUpdateAnimatable.onNavigationEvent(getshowinglistenerwrappers.onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, getshowinglistenerwrappers.new onWarmupCompleted(fFloatValue, onitemclickedProduce, null), 3, (Object) null);
        Iterator<T> it = getshowinglistenerwrappers.onExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            maybeUpdateAnimatable.onNavigationEvent(getshowinglistenerwrappers.onMessageChannelReady(), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult((isQueryRefinementEnabled) it.next(), fFloatValue, onitemclickedProduce, null), 3, (Object) null);
        }
        int i2 = ICustomTabsCallback + 15;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private final void onExtraCallback(float f, boolean z) {
        onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this, Float.valueOf(f), Boolean.valueOf(z)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1182908372, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1182908374);
    }

    public final void onExtraCallbackWithResult(@NotNull getReward getreward) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this, getreward}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 198604226, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -198604225);
    }

    public final void onWarmupCompleted(boolean z) {
        onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this, Boolean.valueOf(z)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1192709816, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1192709816);
    }
}
