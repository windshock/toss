package o;

import im.toss.appsintoss.data.remote.model.ProductDetailDisclaimer;
import im.toss.appsintoss.data.remote.model.ProductDetailHeader;
import im.toss.appsintoss.manager.model.AppsInTossProduct;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda4 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41 IAuthTabCallback(@NotNull WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, "");
        if (Intrinsics.areEqual(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.IAuthTabCallbackDefault(), "SDUI_V0")) {
            ProductDetailHeader productDetailHeaderOnNavigationEvent = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.onNavigationEvent();
            List listOnWarmupCompleted = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.onWarmupCompleted();
            ProductDetailDisclaimer productDetailDisclaimerOnExtraCallback = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.onExtraCallback();
            if (productDetailHeaderOnNavigationEvent != null && productDetailDisclaimerOnExtraCallback != null) {
                int i5 = onWarmupCompleted + 33;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.asInterface();
                    windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.IAuthTabCallbackStub();
                    throw null;
                }
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent safeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.asInterface(), windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.IAuthTabCallbackStub(), productDetailHeaderOnNavigationEvent, listOnWarmupCompleted == null ? CollectionsKt.emptyList() : listOnWarmupCompleted, productDetailDisclaimerOnExtraCallback);
                int i6 = onWarmupCompleted + 61;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return safeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent;
            }
        }
        final AppsInTossProduct appsInTossProductAsInterface = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.asInterface();
        final String strIAuthTabCallbackStub = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.IAuthTabCallbackStub();
        return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41(appsInTossProductAsInterface, strIAuthTabCallbackStub) { // from class: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onExtraCallback
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private final AppsInTossProduct onExtraCallback;
            private final String onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback;
                int i10 = i9 + 115;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onExtraCallback)) {
                    int i12 = i9 + 13;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    return false;
                }
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onExtraCallback safeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onExtraCallback = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onExtraCallback) obj;
                if (!Intrinsics.areEqual(this.onExtraCallback, safeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onExtraCallback.onExtraCallback)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.onNavigationEvent, safeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onExtraCallback.onNavigationEvent)) {
                    return true;
                }
                int i14 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                return false;
            }

            public int hashCode() {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                int iHashCode = (this.onExtraCallback.hashCode() * 31) + this.onNavigationEvent.hashCode();
                int i11 = onExtraCallbackWithResult + 31;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return iHashCode;
            }

            public String toString() {
                int i8 = 2 % 2;
                String str = "Legacy(product=" + this.onExtraCallback + ", miniAppIconUrl=" + this.onNavigationEvent + ")";
                int i9 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(appsInTossProductAsInterface, "");
                Intrinsics.checkNotNullParameter(strIAuthTabCallbackStub, "");
                this.onExtraCallback = appsInTossProductAsInterface;
                this.onNavigationEvent = strIAuthTabCallbackStub;
            }
        };
    }
}
