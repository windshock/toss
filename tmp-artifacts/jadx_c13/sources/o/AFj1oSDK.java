package o;

import im.toss.core.tracker.entry.TrackLog;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1oSDK {
    private static int asInterface = 1;
    private static int onExtraCallback = 1;
    private static int onTransact;
    private static int onWarmupCompleted;
    public static final AFj1oSDK onExtraCallbackWithResult = new AFj1oSDK();
    private static String IAuthTabCallback = _UrlKt.FRAGMENT_ENCODE_SET;
    private static final ConcurrentHashMap<String, Boolean> onNavigationEvent = new ConcurrentHashMap<>();

    private AFj1oSDK() {
    }

    static {
        int i = onExtraCallback + 67;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull AFj1oSDKAFa1ySDK aFj1oSDKAFa1ySDK) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFj1oSDKAFa1ySDK, "");
            String screenHash = aFj1oSDKAFa1ySDK.getScreenHash();
            Intrinsics.checkNotNullExpressionValue(screenHash, "");
            IAuthTabCallback = screenHash;
            return;
        }
        Intrinsics.checkNotNullParameter(aFj1oSDKAFa1ySDK, "");
        String screenHash2 = aFj1oSDKAFa1ySDK.getScreenHash();
        Intrinsics.checkNotNullExpressionValue(screenHash2, "");
        IAuthTabCallback = screenHash2;
        throw null;
    }

    public final Boolean onExtraCallbackWithResult(@NotNull downloadZip downloadzip) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(downloadzip, "");
        if (!((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 1045380358, new Object[]{GetFeatureExtension.onWarmupCompleted, downloadzip}, -1045380351, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue() || !(downloadzip instanceof TrackLog)) {
            int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        String str = IAuthTabCallback + "#" + ((TrackLog) downloadzip).getInterfaceDescriptor();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = onNavigationEvent;
        boolean zContainsKey = concurrentHashMap.containsKey(str);
        concurrentHashMap.put(str, Boolean.TRUE);
        return Boolean.valueOf(!zContainsKey);
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent.clear();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
