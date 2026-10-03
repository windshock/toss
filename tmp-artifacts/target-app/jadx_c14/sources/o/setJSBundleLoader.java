package o;

import com.google.android.gms.internal.ads.zzgc;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CatalystInstanceImplNativeExceptionHandler;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setJSBundleLoader {
    private static boolean IAuthTabCallback;
    public static final int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    public static final setJSBundleLoader onNavigationEvent = new setJSBundleLoader();
    private static final AppSetIdAndScope1 IAuthTabCallbackDefault = ea10.onExtraCallbackWithResult("NetSpikeLogger");

    private setJSBundleLoader() {
    }

    static {
        DERSet dERSet = DERSet.onExtraCallback;
        onWarmupCompleted = dERSet.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        onExtraCallbackWithResult = dERSet.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        onExtraCallback = 8;
    }

    private final String onExtraCallbackWithResult() {
        return "NetSpike_" + onExtraCallbackWithResult + "mb_" + onWarmupCompleted + "sec";
    }

    public final void onExtraCallback(int i, int i2) {
        if (onWarmupCompleted != i || onExtraCallbackWithResult != i2) {
            if (IAuthTabCallback) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onExtraCallbackWithResult(), "completed", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            }
            onWarmupCompleted = i;
            onExtraCallbackWithResult = i2;
            IAuthTabCallback();
            return;
        }
        if (IAuthTabCallback) {
            return;
        }
        IAuthTabCallback();
    }

    public final void onExtraCallback() {
        if (IAuthTabCallback) {
            return;
        }
        IAuthTabCallback();
    }

    private final void IAuthTabCallback() {
        Pair<Boolean, String> pairOnWarmupCompleted = onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) pairOnWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
        if (zBooleanValue) {
            CatalystInstanceImplNativeExceptionHandler.onExtraCallbackWithResult.onExtraCallback("netspike-log");
            IAuthTabCallback = false;
            return;
        }
        CatalystInstanceImplNativeExceptionHandler.onExtraCallbackWithResult.onExtraCallback(new CatalystInstanceImplNativeExceptionHandler.onNavigationEvent("netspike-log", RangesKt.coerceAtLeast(onWarmupCompleted / 60, 1), 1000000 * onExtraCallbackWithResult, new onExtraCallbackWithResult(this)));
        IAuthTabCallback = true;
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onExtraCallbackWithResult(), "starting", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<CatalystInstanceImplNativeExceptionHandler.onExtraCallback, Unit> {
        onExtraCallbackWithResult(Object obj) {
            super(1, obj, setJSBundleLoader.class, "logSpike", "logSpike(Lviva/republica/toss/network/stats/TrafficStatsWatcher$Spike;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((CatalystInstanceImplNativeExceptionHandler.onExtraCallback) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(CatalystInstanceImplNativeExceptionHandler.onExtraCallback onextracallback) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            ((setJSBundleLoader) ((CallableReference) this).receiver).onExtraCallbackWithResult(onextracallback);
        }
    }

    private final Pair<Boolean, String> onWarmupCompleted() {
        int i = onWarmupCompleted;
        if (i < 10) {
            return getWrite.IAuthTabCallback(Boolean.TRUE, "Check failed. windowSeconds >= MIN_WINDOW_SEC (" + i + "/10)");
        }
        int i2 = onExtraCallbackWithResult;
        if (i2 < 10) {
            return getWrite.IAuthTabCallback(Boolean.TRUE, "Check failed. thresholdMb >= MIN_THRESHOLD_MB (" + i2 + "/10)");
        }
        return getWrite.IAuthTabCallback(Boolean.FALSE, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallbackWithResult(CatalystInstanceImplNativeExceptionHandler.onExtraCallback onextracallback) {
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onExtraCallbackWithResult(), String.valueOf(onextracallback.onWarmupCompleted() / 1000000), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("windowSec", Integer.valueOf(onWarmupCompleted)), getWrite.IAuthTabCallback("thresholdMb", Integer.valueOf(onExtraCallbackWithResult)), getWrite.IAuthTabCallback("spikeMb", Long.valueOf(onextracallback.onWarmupCompleted() / 1000000)), getWrite.IAuthTabCallback("totalMbSinceBoot", Long.valueOf(onextracallback.IAuthTabCallbackDefault() / 1000000)), getWrite.IAuthTabCallback("rxMbSinceStart", Long.valueOf(onextracallback.asBinder() / 1000000)), getWrite.IAuthTabCallback("txMbSinceStart", Long.valueOf(onextracallback.onTransact() / 1000000)), getWrite.IAuthTabCallback("startTime", Long.valueOf(onextracallback.IAuthTabCallbackStub())), getWrite.IAuthTabCallback("endTime", Long.valueOf(onextracallback.IAuthTabCallback())), getWrite.IAuthTabCallback("timeDiff", Long.valueOf(onextracallback.IAuthTabCallback() - onextracallback.IAuthTabCallbackStub())), getWrite.IAuthTabCallback("numberOfEntities", Integer.valueOf(onextracallback.onExtraCallback())), getWrite.IAuthTabCallback("rateMbPerMin", Long.valueOf(onextracallback.onNavigationEvent() / 1000000)), getWrite.IAuthTabCallback("activeNetThreads", onextracallback.onExtraCallbackWithResult())}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }
}
