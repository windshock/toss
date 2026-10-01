package im.toss.features.home.core.remote.request.consumption.category;

import im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategorySaveParameterRequest$;
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
import o.getBgColor;
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
public final class ConsumptionCategorySaveParameterRequest {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String brand;
    private final String categoryNo;
    private final Boolean override;
    private final List<String> sourceIds;
    private final String timelineTime;
    private final String type;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new ConsumptionCategorySaveParameterRequest$.ExternalSyntheticLambda0()), null, null, null, null, null};

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = IAuthTabCallback + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnExtraCallback;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumptionCategorySaveParameterRequest)) {
            return false;
        }
        ConsumptionCategorySaveParameterRequest consumptionCategorySaveParameterRequest = (ConsumptionCategorySaveParameterRequest) obj;
        if (!Intrinsics.areEqual(this.sourceIds, consumptionCategorySaveParameterRequest.sourceIds)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.timelineTime, consumptionCategorySaveParameterRequest.timelineTime)) {
            int i2 = IAuthTabCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.categoryNo, consumptionCategorySaveParameterRequest.categoryNo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.override, consumptionCategorySaveParameterRequest.override)) {
            int i4 = IAuthTabCallback + 119;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.brand, consumptionCategorySaveParameterRequest.brand)) {
            int i5 = onNavigationEvent + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.type, consumptionCategorySaveParameterRequest.type)) {
            return false;
        }
        int i7 = IAuthTabCallback + 93;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.sourceIds.hashCode();
        int iHashCode4 = this.timelineTime.hashCode();
        int iHashCode5 = this.categoryNo.hashCode();
        Boolean bool = this.override;
        if (bool == null) {
            int i4 = IAuthTabCallback + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        String str = this.brand;
        if (str == null) {
            int i6 = onNavigationEvent + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        String str2 = this.type;
        return (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCategorySaveParameterRequest(sourceIds=" + this.sourceIds + ", timelineTime=" + this.timelineTime + ", categoryNo=" + this.categoryNo + ", override=" + this.override + ", brand=" + this.brand + ", type=" + this.type + ")";
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        Object obj = null;
        int i = onExtraCallbackWithResult + 107;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ConsumptionCategorySaveParameterRequest(int i, List list, String str, String str2, Boolean bool, String str3, String str4, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 63;
        if (63 != (i & 63)) {
            int i3 = IAuthTabCallback + 39;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = ConsumptionCategorySaveParameterRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 81;
            } else {
                descriptor = ConsumptionCategorySaveParameterRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = IAuthTabCallback + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.sourceIds = list;
        this.timelineTime = str;
        this.categoryNo = str2;
        this.override = bool;
        this.brand = str3;
        this.type = str4;
    }

    public ConsumptionCategorySaveParameterRequest(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sourceIds = list;
        this.timelineTime = str;
        this.categoryNo = str2;
        this.override = bool;
        this.brand = str3;
        this.type = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(ConsumptionCategorySaveParameterRequest consumptionCategorySaveParameterRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), consumptionCategorySaveParameterRequest.sourceIds);
        vylVar.onExtraCallback(serialDescriptor, 1, consumptionCategorySaveParameterRequest.timelineTime);
        vylVar.onExtraCallback(serialDescriptor, 2, consumptionCategorySaveParameterRequest.categoryNo);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getBgColor.IAuthTabCallback, consumptionCategorySaveParameterRequest.override);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, consumptionCategorySaveParameterRequest.brand);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, consumptionCategorySaveParameterRequest.type);
        int i4 = onNavigationEvent + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }
}
