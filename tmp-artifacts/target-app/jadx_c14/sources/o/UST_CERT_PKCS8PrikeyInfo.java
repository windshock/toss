package o;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.app.usage.StorageStats;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import androidx.core.content.ContextCompat;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.splittarget.spec.fsm.AppState;
import java.io.IOException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Liveness;
import viva.republica.toss.core.PerformanceMetricHelper$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_PKCS8PrikeyInfo {
    public static final UST_CERT_PKCS8PrikeyInfo onExtraCallback = new UST_CERT_PKCS8PrikeyInfo();
    private static final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new PerformanceMetricHelper$.ExternalSyntheticLambda2());
    public static final int onExtraCallbackWithResult = 8;

    private UST_CERT_PKCS8PrikeyInfo() {
    }

    private final Context onExtraCallback() {
        return UserChoiceBillingListener.onExtraCallback.onExtraCallback();
    }

    private final boolean IAuthTabCallbackDefault() {
        return ((Boolean) IAuthTabCallback.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean access100() {
        return SegmentedButtonKtExternalSyntheticLambda5.IAuthTabCallback("DEFAULT_TRAFFICSTATS_TAGGING");
    }

    private final long IAuthTabCallbackStub() {
        return addPolicy.getSmallIconBitmap().onExtraCallback("METRIC_LAST_USAGE_RX_BYTE", -1L);
    }

    private final void IAuthTabCallback(long j) {
        addPolicy.getSmallIconBitmap().onNavigationEvent("METRIC_LAST_USAGE_RX_BYTE", j);
    }

    private final long onTransact() {
        return addPolicy.getSmallIconBitmap().onExtraCallback("METRIC_LAST_USAGE_DOWNLOAD_BYTE", -1L);
    }

    private final void onNavigationEvent(long j) {
        addPolicy.getSmallIconBitmap().onNavigationEvent("METRIC_LAST_USAGE_DOWNLOAD_BYTE", j);
    }

    private final long asBinder() {
        return addPolicy.getSmallIconBitmap().onExtraCallback("METRIC_LAST_USAGE_UPLOAD_BYTE", -1L);
    }

    private final void onTransact(long j) {
        addPolicy.getSmallIconBitmap().onNavigationEvent("METRIC_LAST_USAGE_UPLOAD_BYTE", j);
    }

    private final long asInterface() {
        return addPolicy.getSmallIconBitmap().onExtraCallback("METRIC_LAST_NET_STATS_BOUNDARY", -1L);
    }

    private final void onExtraCallbackWithResult(long j) {
        addPolicy.getSmallIconBitmap().onNavigationEvent("METRIC_LAST_NET_STATS_BOUNDARY", j);
    }

    public final void onExtraCallbackWithResult() {
        if (onNavigationEvent()) {
            AppState.Companion.onExtraCallbackWithResult().onNavigationEvent(true).onWarmupCompleted(clearTid.onExtraCallback()).onWarmupCompleted(new PerformanceMetricHelper$.ExternalSyntheticLambda4(new PerformanceMetricHelper$.ExternalSyntheticLambda3()), new PerformanceMetricHelper$.ExternalSyntheticLambda6(new PerformanceMetricHelper$.ExternalSyntheticLambda5()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Boolean bool) throws PackageManager.NameNotFoundException, IOException {
        onExtraCallback.access000();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Throwable th) {
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PerformanceMetricHelper", "observeVisibleState stream error", th, (Map) null, 8, (Object) null);
        return Unit.INSTANCE;
    }

    public final boolean onNavigationEvent() {
        if (zzaj.onNavigationEvent().onActivityLayout()) {
            return true;
        }
        return ((Boolean) DERSet.onExtraCallback(-1451032, new Object[]{DERSet.onExtraCallback}, 1451055, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).booleanValue();
    }

    public final void IAuthTabCallback() {
        Object obj;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        if (((Boolean) DERSet.onExtraCallback(-401613159, objArr, 401613171, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).booleanValue() && IAuthTabCallbackDefault()) {
            try {
                Result.Companion companion = Result.Companion;
                SegmentedButtonKtExternalSyntheticLambda6.onWarmupCompleted(1414987777);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PerformanceMetricHelper", "error in applyWebViewTrafficStatsTag", th2, (Map) null, 8, (Object) null);
            }
        }
    }

    private final void access000() throws PackageManager.NameNotFoundException, IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (IAuthTabCallbackStub() > jCurrentTimeMillis) {
            IAuthTabCallback(-1L);
        }
        if (asInterface() > jCurrentTimeMillis) {
            onExtraCallbackWithResult(-1L);
        }
        if (jCurrentTimeMillis - 21600000 < IAuthTabCallbackStub()) {
            return;
        }
        onExtraCallback(jCurrentTimeMillis);
        onWarmupCompleted(jCurrentTimeMillis);
        IAuthTabCallback(jCurrentTimeMillis);
    }

    private final void onExtraCallback(long j) throws PackageManager.NameNotFoundException, IOException {
        try {
            if (Build.VERSION.SDK_INT <= 26) {
                return;
            }
            Object systemService = onExtraCallback().getSystemService("storagestats");
            Intrinsics.checkNotNull(systemService, "");
            StorageStats storageStatsQueryStatsForPackage = UST_CERT_Init.tQ_(systemService).queryStatsForPackage(UST_CERT_GetVIDRandomWithPKCS8Prikey.onExtraCallback(), onExtraCallback().getPackageName(), Process.myUserHandle());
            Intrinsics.checkNotNullExpressionValue(storageStatsQueryStatsForPackage, "");
            Liveness.onExtraCallback onextracallback = Liveness.Companion;
            CommonModule_closeView commonModule_closeView = CommonModule_closeView.onWarmupCompleted;
            String str = commonModule_closeView.getInterfaceDescriptor().format(Long.valueOf(IAuthTabCallbackStub()));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = commonModule_closeView.getInterfaceDescriptor().format(Long.valueOf(j));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            Object[] objArr = {onextracallback.onExtraCallback(str, str2, storageStatsQueryStatsForPackage.getDataBytes())};
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PerformanceMetricHelper", "failed to report storage usage", e, (Map) null, 8, (Object) null);
        }
    }

    private final void onWarmupCompleted(long j) {
        boolean z;
        long j2;
        long j3;
        onNavigationEvent onNavigationEvent;
        onNavigationEvent onNavigationEvent2;
        onNavigationEvent onnavigationeventOnExtraCallback;
        onNavigationEvent onnavigationeventOnExtraCallback2;
        try {
            int iMyUid = Process.myUid();
            long uidRxBytes = TrafficStats.getUidRxBytes(iMyUid);
            long uidTxBytes = TrafficStats.getUidTxBytes(iMyUid);
            boolean zBooleanValue = ((Boolean) DERSet.onExtraCallback(-401613159, new Object[]{DERSet.onExtraCallback}, 401613171, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).booleanValue();
            long jAsInterface = asInterface() > 0 ? asInterface() : IAuthTabCallbackStub() > 0 ? IAuthTabCallbackStub() : j - 21600000;
            onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = zBooleanValue ? onWarmupCompleted(iMyUid, jAsInterface, j) : null;
            boolean z2 = asBinder() == -1 || onTransact() == -1;
            if (z2 && onextracallbackwithresultOnWarmupCompleted == null) {
                onTransact(uidTxBytes);
                onNavigationEvent(uidRxBytes);
                return;
            }
            if (z2) {
                j3 = -1;
                j2 = -1;
                z = false;
            } else {
                long jOnTransact = onTransact() < uidRxBytes ? uidRxBytes - onTransact() : uidRxBytes;
                long jAsBinder = asBinder() < uidTxBytes ? uidTxBytes - asBinder() : uidTxBytes;
                z = asBinder() > uidTxBytes || onTransact() > uidRxBytes;
                j2 = jOnTransact;
                j3 = jAsBinder;
            }
            boolean z3 = zBooleanValue && IAuthTabCallbackDefault();
            long jIAuthTabCallbackStub = IAuthTabCallbackStub() > 0 ? IAuthTabCallbackStub() : jAsInterface;
            onTransact(uidTxBytes);
            onNavigationEvent(uidRxBytes);
            if (onextracallbackwithresultOnWarmupCompleted != null) {
                onExtraCallback.onExtraCallbackWithResult(onextracallbackwithresultOnWarmupCompleted.IAuthTabCallback());
            }
            Liveness.onExtraCallback onextracallback = Liveness.Companion;
            CommonModule_closeView commonModule_closeView = CommonModule_closeView.onWarmupCompleted;
            String str = commonModule_closeView.getInterfaceDescriptor().format(Long.valueOf(jIAuthTabCallbackStub));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = commonModule_closeView.getInterfaceDescriptor().format(Long.valueOf(j));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -870178991, new Object[]{onextracallback.onExtraCallbackWithResult(str, str2, j3, j2, onextracallbackwithresultOnWarmupCompleted != null ? commonModule_closeView.getInterfaceDescriptor().format(Long.valueOf(jAsInterface)) : null, onextracallbackwithresultOnWarmupCompleted != null ? commonModule_closeView.getInterfaceDescriptor().format(Long.valueOf(onextracallbackwithresultOnWarmupCompleted.IAuthTabCallback())) : null, onextracallbackwithresultOnWarmupCompleted != null ? Long.valueOf(asBinder(onextracallbackwithresultOnWarmupCompleted.IAuthTabCallbackStub())) : null, onextracallbackwithresultOnWarmupCompleted != null ? Long.valueOf(asBinder(onextracallbackwithresultOnWarmupCompleted.IAuthTabCallbackDefault())) : null, onextracallbackwithresultOnWarmupCompleted != null ? Long.valueOf(asBinder(onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted())) : null, onextracallbackwithresultOnWarmupCompleted != null ? Long.valueOf(asBinder(onextracallbackwithresultOnWarmupCompleted.onExtraCallbackWithResult())) : null, (onextracallbackwithresultOnWarmupCompleted == null || (onnavigationeventOnExtraCallback2 = onextracallbackwithresultOnWarmupCompleted.onExtraCallback()) == null) ? null : Long.valueOf(asBinder(onnavigationeventOnExtraCallback2.IAuthTabCallback())), (onextracallbackwithresultOnWarmupCompleted == null || (onnavigationeventOnExtraCallback = onextracallbackwithresultOnWarmupCompleted.onExtraCallback()) == null) ? null : Long.valueOf(asBinder(onnavigationeventOnExtraCallback.onExtraCallbackWithResult())), (onextracallbackwithresultOnWarmupCompleted == null || (onNavigationEvent2 = onextracallbackwithresultOnWarmupCompleted.onNavigationEvent()) == null) ? null : Long.valueOf(asBinder(onNavigationEvent2.IAuthTabCallback())), (onextracallbackwithresultOnWarmupCompleted == null || (onNavigationEvent = onextracallbackwithresultOnWarmupCompleted.onNavigationEvent()) == null) ? null : Long.valueOf(asBinder(onNavigationEvent.onExtraCallbackWithResult())), onextracallbackwithresultOnWarmupCompleted != null ? Long.valueOf(onExtraCallback.asBinder(onextracallbackwithresultOnWarmupCompleted.IAuthTabCallbackStub() + onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted())) : null, onextracallbackwithresultOnWarmupCompleted != null ? Long.valueOf(onExtraCallback.asBinder(onextracallbackwithresultOnWarmupCompleted.IAuthTabCallbackDefault() + onextracallbackwithresultOnWarmupCompleted.onExtraCallbackWithResult())) : null, z3, z)}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PerformanceMetricHelper", "failed to report network usage", e, (Map) null, 8, (Object) null);
        }
    }

    private final onExtraCallbackWithResult onWarmupCompleted(int i, long j, long j2) {
        onNavigationEvent onNavigationEvent;
        onNavigationEvent onNavigationEvent2;
        NetworkStatsManager networkStatsManager = (NetworkStatsManager) ContextCompat.getSystemService(onExtraCallback(), NetworkStatsManager.class);
        if (networkStatsManager == null || (onNavigationEvent = onNavigationEvent(networkStatsManager, i, j, j2, 1, 0)) == null || (onNavigationEvent2 = onNavigationEvent(networkStatsManager, i, j, j2, 0, 0)) == null) {
            return null;
        }
        return new onExtraCallbackWithResult(onNavigationEvent.onExtraCallbackWithResult(), onNavigationEvent.IAuthTabCallback(), onNavigationEvent2.onExtraCallbackWithResult(), onNavigationEvent2.IAuthTabCallback(), IAuthTabCallbackDefault() ? onNavigationEvent(networkStatsManager, i, j, j2, 1, 1414987777) : null, IAuthTabCallbackDefault() ? onNavigationEvent(networkStatsManager, i, j, j2, 0, 1414987777) : null, Math.max(onNavigationEvent.onNavigationEvent(), onNavigationEvent2.onNavigationEvent()));
    }

    private static final onNavigationEvent onNavigationEvent(NetworkStatsManager networkStatsManager, int i, long j, long j2, int i2, int i3) {
        return onExtraCallback.onExtraCallback(networkStatsManager, i2, i3, i, j, j2);
    }

    private final onNavigationEvent onExtraCallback(NetworkStatsManager networkStatsManager, int i, int i2, int i3, long j, long j2) throws SecurityException {
        try {
            NetworkStats networkStatsQueryDetailsForUidTag = networkStatsManager.queryDetailsForUidTag(i, null, j, j2, i3, i2);
            Intrinsics.checkNotNull(networkStatsQueryDetailsForUidTag);
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            long rxBytes = 0;
            long txBytes = 0;
            long endTimeStamp = j;
            while (networkStatsQueryDetailsForUidTag.hasNextBucket()) {
                try {
                    networkStatsQueryDetailsForUidTag.getNextBucket(bucket);
                    rxBytes += bucket.getRxBytes();
                    txBytes += bucket.getTxBytes();
                    if (bucket.getEndTimeStamp() > endTimeStamp) {
                        endTimeStamp = bucket.getEndTimeStamp();
                    }
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            ensureBacktraceNoteIsMutable.IAuthTabCallback(networkStatsQueryDetailsForUidTag, (Throwable) null);
            return new onNavigationEvent(rxBytes, txBytes, endTimeStamp);
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PerformanceMetricHelper", "NetworkStatsManager query failed (networkType=" + i + ", tag=" + i2 + ")", e, (Map) null, 8, (Object) null);
            return null;
        }
    }

    private final long asBinder(long j) {
        return j / 1048576;
    }
}
