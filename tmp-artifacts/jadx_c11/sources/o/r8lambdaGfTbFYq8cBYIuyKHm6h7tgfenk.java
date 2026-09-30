package o;

import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.securities.libs.performance.tracker.data.model.MetricRequestBody;
import im.toss.securities.libs.performance.tracker.data.model.MetricV1LogBody;
import im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogBody;
import im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogRequestBody;
import im.toss.securities.libs.performance.tracker.data.model.v1.MetricBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaGfTbFYq8cBYIuyKHm6h7tgfenk {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final SecuritiesPerformanceLogRequestBody onNavigationEvent(@NotNull SecuritiesPerformanceLogBody securitiesPerformanceLogBody) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(securitiesPerformanceLogBody, "");
        if (!(securitiesPerformanceLogBody instanceof MetricV1LogBody)) {
            throw new NoWhenBranchMatchedException();
        }
        MetricV1LogBody metricV1LogBody = (MetricV1LogBody) securitiesPerformanceLogBody;
        List<MetricBody> listAsBinder = metricV1LogBody.asBinder();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listAsBinder.iterator();
        while (it.hasNext()) {
            MetricRequestBody metricRequestBodyIAuthTabCallback = IAuthTabCallback((MetricBody) it.next());
            if (metricRequestBodyIAuthTabCallback != null) {
                int i2 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(metricRequestBodyIAuthTabCallback);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        Map map = (Map) MetricV1LogBody.onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{metricV1LogBody}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1343709777, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1343709777);
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            int i4 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return new SecuritiesPerformanceLogRequestBody("metric_v1", arrayList, linkedHashMap, metricV1LogBody.IAuthTabCallbackStub(), metricV1LogBody.IAuthTabCallbackDefault(), metricV1LogBody.onTransact());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final MetricRequestBody IAuthTabCallback(MetricBody metricBody) {
        String strOnExtraCallback;
        Double doubleOrNull;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            strOnExtraCallback = metricBody.onExtraCallback();
            int i3 = 24 / 0;
            if (strOnExtraCallback != null) {
                doubleOrNull = StringsKt.toDoubleOrNull(strOnExtraCallback);
            } else {
                int i4 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                doubleOrNull = null;
            }
        } else {
            strOnExtraCallback = metricBody.onExtraCallback();
            if (strOnExtraCallback != null) {
            }
        }
        if (metricBody.onExtraCallback() != null && doubleOrNull == null && metricBody.onExtraCallbackWithResult() == null) {
            int i6 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (metricBody.IAuthTabCallback() == null) {
                int i8 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return null;
            }
        }
        return new MetricRequestBody(metricBody.onWarmupCompleted(), metricBody.onExtraCallbackWithResult(), metricBody.IAuthTabCallback(), doubleOrNull);
    }
}
