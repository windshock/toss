package o;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setReactQueueConfigurationSpec {
    private final NetworkStatsManager IAuthTabCallback;
    private final int onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public setReactQueueConfigurationSpec(@NotNull Context context, long j, long j2) {
        ApplicationInfo applicationInfo;
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = context;
        this.onNavigationEvent = j;
        this.onWarmupCompleted = j2;
        Object systemService = context.getSystemService("netstats");
        Intrinsics.checkNotNull(systemService, "");
        this.IAuthTabCallback = (NetworkStatsManager) systemService;
        PackageInfo packageInfoOnNavigationEvent = PageExitListener.onNavigationEvent(context);
        this.onExtraCallback = (packageInfoOnNavigationEvent == null || (applicationInfo = packageInfoOnNavigationEvent.applicationInfo) == null) ? 0 : applicationInfo.uid;
    }

    public final long IAuthTabCallback() {
        return onWarmupCompleted(1, "");
    }

    public final long onExtraCallback() {
        return onWarmupCompleted(0, onNavigationEvent(this.onExtraCallbackWithResult));
    }

    private final long onWarmupCompleted(int i, String str) throws SecurityException {
        try {
            NetworkStats networkStatsQueryDetailsForUid = this.IAuthTabCallback.queryDetailsForUid(i, str, this.onNavigationEvent, this.onWarmupCompleted, this.onExtraCallback);
            Intrinsics.checkNotNull(networkStatsQueryDetailsForUid);
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            long rxBytes = 0;
            while (networkStatsQueryDetailsForUid.hasNextBucket()) {
                networkStatsQueryDetailsForUid.getNextBucket(bucket);
                if (bucket.getTag() == 0) {
                    rxBytes += bucket.getRxBytes() + bucket.getTxBytes();
                }
            }
            networkStatsQueryDetailsForUid.close();
            return rxBytes;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private final String onNavigationEvent(Context context) {
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "");
        String subscriberId = ((TelephonyManager) systemService).getSubscriberId();
        Intrinsics.checkNotNullExpressionValue(subscriberId, "");
        return subscriberId;
    }
}
