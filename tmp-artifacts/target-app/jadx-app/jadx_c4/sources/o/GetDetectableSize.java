package o;

import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.core.tracker.payload.AppEventPayloadV1;
import im.toss.core.tracker.payload.AppEventPayloadV2;
import im.toss.core.tracker.payload.AppEventPayloadV3;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetDetectableSize {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final GetAttributeExtension onExtraCallback(@NotNull InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        if (interfaceC0059deInitialize instanceof AppEventPayloadV1) {
            AppEventPayloadV1 appEventPayloadV1 = (AppEventPayloadV1) interfaceC0059deInitialize;
            String strIAuthTabCallbackStubProxy = appEventPayloadV1.IAuthTabCallbackStubProxy();
            AFj1nSDK4 aFj1nSDK4 = AFj1nSDK4.V1;
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
            return new GetAttributeExtension(strIAuthTabCallbackStubProxy, aFj1nSDK4, Intrinsics.areEqual((String) AppEventPayloadV1.onWarmupCompleted(613465596, ICustomTabsCallbackStubProxy.onExtraCallback(), -613465594, iOnExtraCallback, iOnExtraCallback2, new Object[]{appEventPayloadV1}, iOnExtraCallback3), "state"), appEventPayloadV1.extraCallbackWithResult());
        }
        if (!(interfaceC0059deInitialize instanceof AppEventPayloadV2)) {
            if (!(interfaceC0059deInitialize instanceof AppEventPayloadV3)) {
                return new GetAttributeExtension("", AFj1nSDK4.UNDEFINED, false, null, 8, null);
            }
            AppEventPayloadV3 appEventPayloadV3 = (AppEventPayloadV3) interfaceC0059deInitialize;
            GetAttributeExtension getAttributeExtension = new GetAttributeExtension(String.valueOf(appEventPayloadV3.writeTypedObject()), AFj1nSDK4.V3, onExtraCallbackWithResult(appEventPayloadV3.extraCallbackWithResult(), appEventPayloadV3.writeTypedObject()), appEventPayloadV3.extraCallbackWithResult());
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getAttributeExtension;
        }
        AppEventPayloadV2 appEventPayloadV2 = (AppEventPayloadV2) interfaceC0059deInitialize;
        long jICustomTabsCallback = appEventPayloadV2.ICustomTabsCallback();
        GetAttributeExtension getAttributeExtension2 = new GetAttributeExtension(String.valueOf(jICustomTabsCallback), AFj1nSDK4.V2, onExtraCallbackWithResult(appEventPayloadV2.extraCallbackWithResult(), Long.valueOf(appEventPayloadV2.ICustomTabsCallback())), appEventPayloadV2.extraCallbackWithResult());
        int i6 = onExtraCallback + 9;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 11 / 0;
        }
        return getAttributeExtension2;
    }

    private static final boolean onExtraCallbackWithResult(Map<String, ? extends Object> map, Long l) {
        Object obj;
        long jLongValue;
        int i = 2 % 2;
        if (map != null) {
            int i2 = onExtraCallback + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            obj = map.get("action_type");
        } else {
            obj = null;
        }
        if (!Intrinsics.areEqual(obj, "screen")) {
            GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            if (l != null) {
                int i4 = onExtraCallback + 83;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            if (!((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1045380358, new Object[]{getFeatureExtension, new TrackLog(jLongValue, (Map) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null)}, -1045380351, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue()) {
                int i6 = IAuthTabCallback;
                int i7 = i6 + 29;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 69;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 42 / 0;
                }
                return false;
            }
        }
        return true;
    }
}
