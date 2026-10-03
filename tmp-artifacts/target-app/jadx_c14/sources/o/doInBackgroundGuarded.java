package o;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zzgc;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.pedometer.PedometerDebugLogCircuitBreaker$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class doInBackgroundGuarded {
    private static int $10 = 0;
    private static int $11 = 1;
    private static volatile long IAuthTabCallback = 0;
    private static final findResAndMsg IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private static long asBinder = 0;
    private static final AtomicLong asInterface;
    public static final int onExtraCallback;
    private static final ConcurrentHashMap<String, getPackageType> onExtraCallbackWithResult;
    private static final ConcurrentHashMap<String, AtomicLong> onNavigationEvent;
    private static int onTransact = 1;
    public static final doInBackgroundGuarded onWarmupCompleted;

    public static /* synthetic */ Unit onNavigationEvent(long j, Map map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(j, map);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(j, map);
        int i3 = onTransact + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private doInBackgroundGuarded() {
    }

    static {
        onNavigationEvent();
        onWarmupCompleted = new doInBackgroundGuarded();
        asInterface = new AtomicLong();
        IAuthTabCallbackDefault = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onWarmupCompleted()));
        onNavigationEvent = new ConcurrentHashMap<>();
        onExtraCallbackWithResult = new ConcurrentHashMap<>();
        onExtraCallback = 8;
        int i = access100 + 115;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $emit;
        final /* synthetic */ long $scheduled;
        final /* synthetic */ AtomicLong $sequence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(long j, AtomicLong atomicLong, Function0<Unit> function0, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$scheduled = j;
            this.$sequence = atomicLong;
            this.$emit = function0;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(this.$scheduled, this.$sequence, this.$emit, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (this.$scheduled == this.$sequence.get()) {
                this.$emit.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull Function0<Unit> function0) {
        AtomicLong atomicLongPutIfAbsent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            onNavigationEvent.get(str);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ConcurrentHashMap<String, AtomicLong> concurrentHashMap = onNavigationEvent;
        AtomicLong atomicLong = concurrentHashMap.get(str);
        if (atomicLong == null && (atomicLongPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicLong = new AtomicLong()))) != null) {
            int i3 = IAuthTabCallbackStub + 9;
            int i4 = i3 % 128;
            onTransact = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 13;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            atomicLong = atomicLongPutIfAbsent;
        }
        AtomicLong atomicLong2 = atomicLong;
        long jIncrementAndGet = atomicLong2.incrementAndGet();
        ConcurrentHashMap<String, getPackageType> concurrentHashMap2 = onExtraCallbackWithResult;
        getPackageType getpackagetype = concurrentHashMap2.get(str);
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        concurrentHashMap2.put(str, maybeUpdateAnimatable.onNavigationEvent(IAuthTabCallbackDefault, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(jIncrementAndGet, atomicLong2, function0, null), 3, (Object) null));
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        long jIncrementAndGet = asInterface.incrementAndGet();
        IAuthTabCallback = jIncrementAndGet;
        int i4 = IAuthTabCallbackStub + 79;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return jIncrementAndGet;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asBinder ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 79;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 45813), 84 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 21233 - (ViewConfiguration.getTapTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14184), (ViewConfiguration.getLongPressTimeout() >> 16) + 19, 8809 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 25;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 72 / 0;
            objArr[0] = str;
        }
    }

    public final void onNavigationEvent(long j, @NotNull String str, int i, @NotNull String str2, @Nullable String str3) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 63;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (j != IAuthTabCallback) {
            return;
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("appBridgeName", str);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("stepCount", Integer.valueOf(i));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("syncReq", str2);
        if (str3 == null) {
            int i4 = IAuthTabCallbackStub + 23;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str3 = "";
        }
        Object[] objArr = new Object[1];
        a(new char[]{26427, 10275, 2409, 58492, 26441, 52217, 52854, 20274, 59816, 23286}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        onNavigationEvent("failed_sync_in_app_bridge", (Function0<Unit>) new PedometerDebugLogCircuitBreaker$.ExternalSyntheticLambda0(j, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str3)})));
    }

    private static final Unit onExtraCallbackWithResult(long j, Map map) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (j != IAuthTabCallback) {
            return Unit.INSTANCE;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "failed_sync_in_app_bridge", map, null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static void onNavigationEvent() {
        asBinder = -3612426844440651597L;
    }
}
