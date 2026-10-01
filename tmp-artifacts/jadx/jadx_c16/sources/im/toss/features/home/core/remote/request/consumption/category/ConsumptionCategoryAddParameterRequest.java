package im.toss.features.home.core.remote.request.consumption.category;

import im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategoryAddParameterRequest$;
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
public final class ConsumptionCategoryAddParameterRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String categoryIconNo;
    private final String categoryName;

    static {
        int i = onExtraCallback + 3;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ConsumptionCategoryAddParameterRequest)) {
            int i4 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ConsumptionCategoryAddParameterRequest consumptionCategoryAddParameterRequest = (ConsumptionCategoryAddParameterRequest) obj;
        if (!Intrinsics.areEqual(this.categoryName, consumptionCategoryAddParameterRequest.categoryName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.categoryIconNo, consumptionCategoryAddParameterRequest.categoryIconNo)) {
            return true;
        }
        int i6 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.categoryName.hashCode() * 31) + this.categoryIconNo.hashCode();
        int i4 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCategoryAddParameterRequest(categoryName=" + this.categoryName + ", categoryIconNo=" + this.categoryIconNo + ")";
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ ConsumptionCategoryAddParameterRequest(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, ConsumptionCategoryAddParameterRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.categoryName = str;
        this.categoryIconNo = str2;
    }

    public ConsumptionCategoryAddParameterRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.categoryName = str;
        this.categoryIconNo = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(ConsumptionCategoryAddParameterRequest consumptionCategoryAddParameterRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, consumptionCategoryAddParameterRequest.categoryName);
        vylVar.onExtraCallback(serialDescriptor, 1, consumptionCategoryAddParameterRequest.categoryIconNo);
        int i4 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
