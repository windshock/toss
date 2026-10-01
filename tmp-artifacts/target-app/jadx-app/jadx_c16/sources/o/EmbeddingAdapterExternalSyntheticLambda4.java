package o;

import im.toss.appsintoss.data.remote.model.AppsInTossProductInfoResponse;
import im.toss.appsintoss.manager.model.AppsInTossProduct;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EmbeddingAdapterExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static final WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 onExtraCallbackWithResult(@NotNull AppsInTossProductInfoResponse appsInTossProductInfoResponse, @NotNull String str) {
        String str2;
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appsInTossProductInfoResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        String strIAuthTabCallbackStubProxy = appsInTossProductInfoResponse.IAuthTabCallbackStubProxy();
        String str4 = strIAuthTabCallbackStubProxy == null ? "" : strIAuthTabCallbackStubProxy;
        String strOnExtraCallback = appsInTossProductInfoResponse.onExtraCallback();
        String str5 = strOnExtraCallback == null ? "" : strOnExtraCallback;
        String str6 = (String) AppsInTossProductInfoResponse.onNavigationEvent(-436421472, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{appsInTossProductInfoResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 436421473, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        String str7 = str6 == null ? "" : str6;
        String strAsInterface = appsInTossProductInfoResponse.asInterface();
        if (strAsInterface == null) {
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            str2 = "";
        } else {
            str2 = strAsInterface;
        }
        String strIAuthTabCallbackStub = appsInTossProductInfoResponse.IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub == null) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 105;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 103;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 2;
            }
            str3 = "";
        } else {
            str3 = strIAuthTabCallbackStub;
        }
        Long l = (Long) AppsInTossProductInfoResponse.onNavigationEvent(-167435334, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{appsInTossProductInfoResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 167435334, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer interfaceDescriptor = appsInTossProductInfoResponse.getInterfaceDescriptor();
        WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = new WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0(str4, str5, new AppsInTossProduct(str, str7, str2, str3, jLongValue, interfaceDescriptor != null ? interfaceDescriptor.intValue() : 0), appsInTossProductInfoResponse.onTransact(), appsInTossProductInfoResponse.access100(), appsInTossProductInfoResponse.onNavigationEvent(), appsInTossProductInfoResponse.IAuthTabCallbackDefault(), appsInTossProductInfoResponse.IAuthTabCallback_Parcel(), appsInTossProductInfoResponse.access000());
        int i9 = IAuthTabCallback + 41;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            return windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
