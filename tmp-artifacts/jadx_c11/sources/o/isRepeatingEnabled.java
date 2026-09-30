package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isRepeatingEnabled {
    private static final GraphicDeviceInfo IAuthTabCallback;
    private static final GraphicDeviceInfo IAuthTabCallbackDefault;
    private static final GraphicDeviceInfo IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static final List<GraphicDeviceInfo> access100;
    private static final GraphicDeviceInfo asBinder;
    private static final GraphicDeviceInfo asInterface;
    private static int getInterfaceDescriptor = 1;
    public static final isRepeatingEnabled onExtraCallback = new isRepeatingEnabled();
    private static final GraphicDeviceInfo onExtraCallbackWithResult;
    private static final GraphicDeviceInfo onNavigationEvent;
    private static final GraphicDeviceInfo onTransact;
    private static final GraphicDeviceInfo onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9 | (~(i8 | i5));
        int i11 = ~i5;
        int i12 = (~(i11 | i8 | i4)) | (~(i7 | i11 | i6));
        int i13 = i4 + i6 + i + ((-195996979) * i3) + ((-904719387) * i2);
        int i14 = i13 * i13;
        int i15 = (i4 * 1886715248) + 940376064 + (1886715248 * i6) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i) + ((-1389494272) * i3) + (1623064576 * i2) + (1510801408 * i14);
        int i16 = (i4 * 1590984816) + 1398186415 + (i6 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i * 1590985553) + (i3 * (-1025631779)) + (i2 * 1121679989) + (i14 * 622657536);
        if (i15 + (i16 * i16 * (-1928134656)) != 1) {
            return onNavigationEvent(objArr);
        }
        int i17 = 2 % 2;
        int i18 = IAuthTabCallback_Parcel + 71;
        int i19 = i18 % 128;
        access000 = i19;
        int i20 = i18 % 2;
        GraphicDeviceInfo graphicDeviceInfo = onWarmupCompleted;
        int i21 = i19 + 91;
        IAuthTabCallback_Parcel = i21 % 128;
        int i22 = i21 % 2;
        return graphicDeviceInfo;
    }

    private isRepeatingEnabled() {
    }

    static {
        GraphicDeviceInfo graphicDeviceInfo = new GraphicDeviceInfo(CacheEntry.Light.getWeight());
        asBinder = graphicDeviceInfo;
        GraphicDeviceInfo graphicDeviceInfo2 = new GraphicDeviceInfo(CacheEntry.Regular.getWeight());
        IAuthTabCallbackDefault = graphicDeviceInfo2;
        GraphicDeviceInfo graphicDeviceInfo3 = new GraphicDeviceInfo(CacheEntry.Medium.getWeight());
        IAuthTabCallbackStub = graphicDeviceInfo3;
        GraphicDeviceInfo graphicDeviceInfo4 = new GraphicDeviceInfo(CacheEntry.SemiBold.getWeight());
        onTransact = graphicDeviceInfo4;
        GraphicDeviceInfo graphicDeviceInfo5 = new GraphicDeviceInfo(CacheEntry.Bold.getWeight());
        onExtraCallbackWithResult = graphicDeviceInfo5;
        GraphicDeviceInfo graphicDeviceInfo6 = new GraphicDeviceInfo(CacheEntry.ExtraBold.getWeight());
        IAuthTabCallback = graphicDeviceInfo6;
        GraphicDeviceInfo graphicDeviceInfo7 = new GraphicDeviceInfo(CacheEntry.Heavy.getWeight());
        asInterface = graphicDeviceInfo7;
        GraphicDeviceInfo graphicDeviceInfo8 = new GraphicDeviceInfo(CacheEntry.Black.getWeight());
        onNavigationEvent = graphicDeviceInfo8;
        onWarmupCompleted = graphicDeviceInfo2;
        access100 = CollectionsKt.listOf(new GraphicDeviceInfo[]{graphicDeviceInfo, graphicDeviceInfo2, graphicDeviceInfo3, graphicDeviceInfo4, graphicDeviceInfo5, graphicDeviceInfo6, graphicDeviceInfo7, graphicDeviceInfo8});
        int i = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final GraphicDeviceInfo IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder;
        }
        throw null;
    }

    public final GraphicDeviceInfo asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = IAuthTabCallbackDefault;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return graphicDeviceInfo;
    }

    public final GraphicDeviceInfo onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = IAuthTabCallbackStub;
        int i5 = i3 + 65;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return graphicDeviceInfo;
    }

    public final GraphicDeviceInfo IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = onTransact;
        int i5 = i3 + 103;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return graphicDeviceInfo;
    }

    public final GraphicDeviceInfo onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        GraphicDeviceInfo graphicDeviceInfo = onExtraCallbackWithResult;
        int i4 = i3 + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return graphicDeviceInfo;
    }

    public final GraphicDeviceInfo onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = IAuthTabCallback;
        int i5 = i3 + 97;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return graphicDeviceInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GraphicDeviceInfo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 95;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = asInterface;
        int i5 = i3 + 75;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return graphicDeviceInfo;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access000 + 1;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        GraphicDeviceInfo graphicDeviceInfo = onNavigationEvent;
        int i5 = i3 + 117;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return graphicDeviceInfo;
        }
        throw null;
    }

    public final List<GraphicDeviceInfo> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return access100;
        }
        throw null;
    }

    public final GraphicDeviceInfo onExtraCallback(@NotNull CacheEntry cacheEntry) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cacheEntry, "");
        GraphicDeviceInfo graphicDeviceInfo = new GraphicDeviceInfo(cacheEntry.getWeight());
        int i2 = access000 + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return graphicDeviceInfo;
    }

    public final GraphicDeviceInfo IAuthTabCallback() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (GraphicDeviceInfo) IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1916068508, iOnNavigationEvent, 1916068508);
    }

    public final GraphicDeviceInfo onExtraCallback() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (GraphicDeviceInfo) IAuthTabCallback(new Object[]{this}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1863337886, iOnNavigationEvent, 1863337887);
    }
}
