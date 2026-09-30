package o;

import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.ads_sdk.remote.model.SdkTemplateItem;
import im.toss.ads_sdk.remote.model.SspSdkEventTracker;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPageMarginDrawable {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onExtraCallback(@NotNull SdkTemplate sdkTemplate, int i) {
        SdkTemplate.onNavigationEvent onnavigationevent;
        String strOnNavigationEvent;
        SspSdkEventTracker sspSdkEventTrackerOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sdkTemplate, "");
            int i4 = 87 / 0;
            onnavigationevent = sdkTemplate instanceof SdkTemplate.onNavigationEvent ? (SdkTemplate.onNavigationEvent) sdkTemplate : null;
        } else {
            Intrinsics.checkNotNullParameter(sdkTemplate, "");
            if (sdkTemplate instanceof SdkTemplate.onNavigationEvent) {
            }
        }
        List<SdkTemplateItem> listAsBinder = onnavigationevent != null ? onnavigationevent.asBinder() : null;
        if (listAsBinder != null) {
            int i5 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            SdkTemplateItem sdkTemplateItem = (SdkTemplateItem) CollectionsKt.getOrNull(listAsBinder, i);
            if (sdkTemplateItem == null || (sspSdkEventTrackerOnExtraCallbackWithResult = sdkTemplateItem.onExtraCallbackWithResult()) == null) {
                strOnNavigationEvent = null;
            } else {
                int i6 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                strOnNavigationEvent = sspSdkEventTrackerOnExtraCallbackWithResult.onNavigationEvent();
            }
        }
        if (strOnNavigationEvent != null) {
            return strOnNavigationEvent + "@" + i;
        }
        String strValueOf = String.valueOf(i);
        int i8 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            return strValueOf;
        }
        throw null;
    }
}
