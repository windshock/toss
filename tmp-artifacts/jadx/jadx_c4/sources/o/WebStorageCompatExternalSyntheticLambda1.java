package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.ads_sdk.remote.model.SdkTemplateHeader;
import im.toss.ads_sdk.remote.model.SdkTemplateItem;
import im.toss.ads_sdk.remote.model.SdkTemplateReviewed;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RearDisplayPresentationSessionPresenterImpl;
import o.WebStorageCompatExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebStorageCompatExternalSyntheticLambda1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    private static final Unit IAuthTabCallback(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 74 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallbackWithResult(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        onExtraCallbackWithResult(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 9 / 0;
        }
        int i7 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 11 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static final void onExtraCallbackWithResult(@NotNull final onPageScrollStateChanged onpagescrollstatechanged, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        String strOnExtraCallbackWithResult;
        String str;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onpagescrollstatechanged, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(690046472);
        int i3 = (i & 6) == 0 ? (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged) ? 4 : 2) | i : i;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 3) != 2, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(690046472, i3, -1, "im.toss.ads_sdk.ui.compose.BpsMultiImageTemplate (NativeAdsBpsShapeTemplates.kt:23)");
            }
            SdkTemplate sdkTemplateIAuthTabCallbackStub = onpagescrollstatechanged.IAuthTabCallbackStub();
            String strOnWarmupCompleted = null;
            SdkTemplate.onNavigationEvent onnavigationevent = sdkTemplateIAuthTabCallbackStub instanceof SdkTemplate.onNavigationEvent ? (SdkTemplate.onNavigationEvent) sdkTemplateIAuthTabCallbackStub : null;
            if (onnavigationevent == null) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsBpsShapeTemplatesKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = 2 % 2;
                            int i5 = onWarmupCompleted + 125;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            Unit unitOnExtraCallback = WebStorageCompatExternalSyntheticLambda1.onExtraCallback(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i7 = onWarmupCompleted + 45;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                }
                return;
            }
            SdkTemplateHeader sdkTemplateHeaderOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
            String strOnExtraCallback = sdkTemplateHeaderOnExtraCallbackWithResult != null ? sdkTemplateHeaderOnExtraCallbackWithResult.onExtraCallback() : null;
            String str2 = strOnExtraCallback != null ? strOnExtraCallback : "";
            List<SdkTemplateItem> listAsBinder = onnavigationevent.asBinder();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsBinder, 10));
            int i4 = 0;
            for (Object obj : listAsBinder) {
                int i5 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (i4 < 0) {
                    int i7 = onExtraCallbackWithResult + 29;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        CollectionsKt.throwIndexOverflow();
                        int i8 = 97 / 0;
                    } else {
                        CollectionsKt.throwIndexOverflow();
                    }
                }
                SdkTemplateItem sdkTemplateItem = (SdkTemplateItem) obj;
                String strOnWarmupCompleted2 = sdkTemplateItem.onWarmupCompleted();
                String strIAuthTabCallback = sdkTemplateItem.IAuthTabCallback();
                if (i4 == 0) {
                    str = "최근 본";
                } else {
                    int i9 = onWarmupCompleted + 19;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    str = null;
                }
                arrayList.add(new RearDisplayPresentationSessionPresenterImpl.onNavigationEvent(strOnWarmupCompleted2, strIAuthTabCallback, str, null, 8, null));
                i4++;
            }
            SdkTemplateReviewed sdkTemplateReviewedIAuthTabCallbackStub = onnavigationevent.IAuthTabCallbackStub();
            if (sdkTemplateReviewedIAuthTabCallbackStub != null) {
                int i11 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    strOnExtraCallbackWithResult = sdkTemplateReviewedIAuthTabCallbackStub.onExtraCallbackWithResult();
                    int i12 = 55 / 0;
                } else {
                    strOnExtraCallbackWithResult = sdkTemplateReviewedIAuthTabCallbackStub.onExtraCallbackWithResult();
                }
            } else {
                strOnExtraCallbackWithResult = null;
            }
            SdkTemplateHeader sdkTemplateHeaderOnExtraCallbackWithResult2 = onnavigationevent.onExtraCallbackWithResult();
            if (sdkTemplateHeaderOnExtraCallbackWithResult2 != null) {
                int i13 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 != 0) {
                    sdkTemplateHeaderOnExtraCallbackWithResult2.onWarmupCompleted();
                    strOnWarmupCompleted.hashCode();
                    throw null;
                }
                strOnWarmupCompleted = sdkTemplateHeaderOnExtraCallbackWithResult2.onWarmupCompleted();
            }
            WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(new RearDisplayPresentationSessionPresenterImpl.onWarmupCompleted(str2, arrayList, strOnExtraCallbackWithResult, strOnWarmupCompleted), null, onpagescrollstatechanged.onNavigationEvent(), null, null, onpagescrollstatechanged.onExtraCallback(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 90);
            if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsBpsShapeTemplatesKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i14 = 2 % 2;
                    int i15 = onWarmupCompleted + 77;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    Unit unitOnNavigationEvent = WebStorageCompatExternalSyntheticLambda1.onNavigationEvent(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i17 = onExtraCallback + 17;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    return unitOnNavigationEvent;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
    }
}
