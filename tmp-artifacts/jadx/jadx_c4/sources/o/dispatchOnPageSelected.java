package o;

import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.ads_sdk.remote.model.SdkTemplateCta;
import im.toss.ads_sdk.remote.model.SdkTemplateItem;
import im.toss.ads_sdk.remote.model.SspSdkEventTracker;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnPageScrolled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class dispatchOnPageSelected {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final Map<String, ? extends List<? extends String>> IAuthTabCallback(@Nullable SspSdkEventTracker sspSdkEventTracker) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (sspSdkEventTracker == null) {
            int i5 = i3 + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return dispatchOnPageScrolled.onNavigationEvent.onWarmupCompleted((Map<String, ? extends List<String>>) access8100.onNavigationEvent());
            }
            int i6 = 1 / 0;
            return dispatchOnPageScrolled.onNavigationEvent.onWarmupCompleted((Map<String, ? extends List<String>>) access8100.onNavigationEvent());
        }
        return dispatchOnPageScrolled.onNavigationEvent.onWarmupCompleted((Map<String, ? extends List<String>>) access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("IMP_1PX", sspSdkEventTracker.onTransact()), getWrite.IAuthTabCallback("VIMP", (List) SspSdkEventTracker.onNavigationEvent(185011600, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{sspSdkEventTracker}, -185011600, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("CLICK", sspSdkEventTracker.IAuthTabCallbackDefault())}));
    }

    public static final Map<String, ? extends List<? extends String>> onExtraCallback(@NotNull SdkTemplate sdkTemplate) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sdkTemplate, "");
            return IAuthTabCallback(sdkTemplate.IAuthTabCallback());
        }
        Intrinsics.checkNotNullParameter(sdkTemplate, "");
        IAuthTabCallback(sdkTemplate.IAuthTabCallback());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Map<String, ? extends List<? extends String>> onExtraCallback(@NotNull SdkTemplate sdkTemplate, int i) {
        SdkTemplate.onNavigationEvent onnavigationevent;
        SdkTemplateItem sdkTemplateItem;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sdkTemplate, "");
        SspSdkEventTracker sspSdkEventTrackerOnExtraCallbackWithResult = null;
        if (sdkTemplate instanceof SdkTemplate.onNavigationEvent) {
            onnavigationevent = (SdkTemplate.onNavigationEvent) sdkTemplate;
            int i3 = onExtraCallback + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = onExtraCallback + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
            onnavigationevent = null;
        }
        if (onnavigationevent != null) {
            int i7 = onNavigationEvent + 109;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            List<SdkTemplateItem> listAsBinder = onnavigationevent.asBinder();
            if (listAsBinder != null && (sdkTemplateItem = (SdkTemplateItem) CollectionsKt.getOrNull(listAsBinder, i)) != null) {
                int i9 = onNavigationEvent + 59;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                sspSdkEventTrackerOnExtraCallbackWithResult = sdkTemplateItem.onExtraCallbackWithResult();
                int i11 = onExtraCallback + 125;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        return IAuthTabCallback(sspSdkEventTrackerOnExtraCallbackWithResult);
    }

    public static final String onExtraCallbackWithResult(@NotNull SdkTemplate sdkTemplate, int i) {
        SdkTemplate.onNavigationEvent onnavigationevent;
        String strIAuthTabCallback;
        List<SdkTemplateItem> listAsBinder;
        SdkTemplateItem sdkTemplateItem;
        SdkTemplateCta sdkTemplateCtaOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sdkTemplate, "");
        Object obj = null;
        if (!(!(sdkTemplate instanceof SdkTemplate.onNavigationEvent))) {
            int i3 = onNavigationEvent + 27;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onnavigationevent = (SdkTemplate.onNavigationEvent) sdkTemplate;
        } else {
            onnavigationevent = null;
        }
        if (onnavigationevent == null || (listAsBinder = onnavigationevent.asBinder()) == null || (sdkTemplateItem = (SdkTemplateItem) CollectionsKt.getOrNull(listAsBinder, i)) == null || (sdkTemplateCtaOnNavigationEvent = sdkTemplateItem.onNavigationEvent()) == null) {
            strIAuthTabCallback = null;
        } else {
            int i5 = onNavigationEvent + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            strIAuthTabCallback = sdkTemplateCtaOnNavigationEvent.IAuthTabCallback();
            if (i6 != 0) {
                int i7 = 0 / 0;
            }
        }
        if (strIAuthTabCallback == null) {
            return "";
        }
        int i8 = onExtraCallback + 93;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return strIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final String IAuthTabCallback(@NotNull SdkTemplate sdkTemplate, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sdkTemplate, "");
        String strOnExtraCallback = setPageMarginDrawable.onExtraCallback(sdkTemplate, i);
        int i5 = onNavigationEvent + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return strOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
