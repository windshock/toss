package im.toss.features.home.core.remote.request.category;

import im.toss.features.home.core.remote.request.category.AssetCategoryFilterIdReq$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetCategoryFilterIdReq {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final List<String> ids;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AssetCategoryFilterIdReq$.ExternalSyntheticLambda0())};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof AssetCategoryFilterIdReq) {
            return Intrinsics.areEqual(this.ids, ((AssetCategoryFilterIdReq) obj).ids);
        }
        int i4 = onWarmupCompleted;
        int i5 = i4 + 95;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 9;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 10 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.ids.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.ids.hashCode();
        int i3 = onWarmupCompleted + 71;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AssetCategoryFilterIdReq(ids=" + this.ids + ")";
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = onExtraCallback + 85;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AssetCategoryFilterIdReq(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onWarmupCompleted + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AssetCategoryFilterIdReq$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.ids = list;
    }

    public AssetCategoryFilterIdReq(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ids = list;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AssetCategoryFilterIdReq assetCategoryFilterIdReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), assetCategoryFilterIdReq.ids);
        int i4 = onWarmupCompleted + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            int i4 = 59 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }
}
