package o;

import im.toss.appsintoss.data.remote.model.AppsInTossAvailableProductListResponse;
import im.toss.appsintoss.data.remote.model.AppsInTossProductResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import o.EmbeddingAdapterExternalSyntheticLambda6;
import o.adInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class EmbeddingAdapterExternalSyntheticLambda6 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final wie2 onWarmupCompleted = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.appsintoss.data.remote.model.AppsInTossProductResponseKt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i3 % 128;
            adInfo adinfo = (adInfo) obj;
            if (i3 % 2 != 0) {
                EmbeddingAdapterExternalSyntheticLambda6.IAuthTabCallback(adinfo);
                throw null;
            }
            Unit unitIAuthTabCallback = EmbeddingAdapterExternalSyntheticLambda6.IAuthTabCallback(adinfo);
            int i4 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }
    }, 1, (Object) null);

    public static /* synthetic */ Unit IAuthTabCallback(adInfo adinfo) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(adinfo);
        if (i4 != 0) {
            int i5 = 33 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static final WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1 onExtraCallback(@NotNull AppsInTossProductResponse appsInTossProductResponse) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appsInTossProductResponse, "");
        String strOnExtraCallbackWithResult = appsInTossProductResponse.onExtraCallbackWithResult();
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1 = new WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1((String) AppsInTossProductResponse.onExtraCallback(-1426019944, 1426019944, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, new Object[]{appsInTossProductResponse}, iOnNavigationEvent3, iOnNavigationEvent), strOnExtraCallbackWithResult, appsInTossProductResponse.IAuthTabCallback(), appsInTossProductResponse.onNavigationEvent(), appsInTossProductResponse.IAuthTabCallbackStub(), appsInTossProductResponse.asInterface(), appsInTossProductResponse.IAuthTabCallbackStubProxy(), appsInTossProductResponse.onTransact(), appsInTossProductResponse.IAuthTabCallbackDefault());
        int i3 = IAuthTabCallback + 31;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1;
        }
        throw null;
    }

    static {
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1> IAuthTabCallback(@NotNull JsonObject jsonObject) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        List<AppsInTossProductResponse> listOnWarmupCompleted = ((AppsInTossAvailableProductListResponse) onWarmupCompleted.onExtraCallbackWithResult(AppsInTossAvailableProductListResponse.Companion.serializer(), jsonObject)).onWarmupCompleted();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        Iterator<T> it = listOnWarmupCompleted.iterator();
        int i3 = IAuthTabCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = IAuthTabCallback + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                arrayList.add(onExtraCallback((AppsInTossProductResponse) it.next()));
                throw null;
            }
            arrayList.add(onExtraCallback((AppsInTossProductResponse) it.next()));
        }
        return arrayList;
    }
}
