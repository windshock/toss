package im.toss.features.home.core.remote.request.consumption.category;

import im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategoryDeleteParameterRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ConsumptionCategoryDeleteParameterRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String categoryNo;

    static {
        Object obj = null;
        int i = onNavigationEvent + 83;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
            return true;
        }
        if (!(obj instanceof ConsumptionCategoryDeleteParameterRequest)) {
            return false;
        }
        if (Intrinsics.areEqual(this.categoryNo, ((ConsumptionCategoryDeleteParameterRequest) obj).categoryNo)) {
            return true;
        }
        int i4 = onExtraCallback + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.categoryNo.hashCode();
        int i4 = onWarmupCompleted + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCategoryDeleteParameterRequest(categoryNo=" + this.categoryNo + ")";
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ ConsumptionCategoryDeleteParameterRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, ConsumptionCategoryDeleteParameterRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.categoryNo = str;
    }

    public ConsumptionCategoryDeleteParameterRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.categoryNo = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(ConsumptionCategoryDeleteParameterRequest consumptionCategoryDeleteParameterRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, consumptionCategoryDeleteParameterRequest.categoryNo);
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
