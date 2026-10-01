package im.toss.features.home.core.remote.request.consumption.category;

import im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategoryUpdateParameterRequest$;
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
public final class ConsumptionCategoryUpdateParameterRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String categoryIconNo;
    private final String categoryName;
    private final String categoryNo;

    static {
        int i = onNavigationEvent + 91;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r7 = 93 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if ((r7 instanceof im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategoryUpdateParameterRequest) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r1 = r1 + 5;
        im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategoryUpdateParameterRequest.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r7 = (im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategoryUpdateParameterRequest) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.categoryNo, r7.categoryNo) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.categoryName, r7.categoryName) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.categoryIconNo, r7.categoryIconNo) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        r7 = im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategoryUpdateParameterRequest.IAuthTabCallback + 39;
        im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategoryUpdateParameterRequest.onExtraCallbackWithResult = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if ((r7 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3 = r3 + 113;
        im.toss.features.home.core.remote.request.consumption.category.ConsumptionCategoryUpdateParameterRequest.IAuthTabCallback = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r3 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.categoryNo.hashCode();
        return i3 == 0 ? (((iHashCode - 54) >> this.categoryName.hashCode()) % 77) % this.categoryIconNo.hashCode() : (((iHashCode * 31) + this.categoryName.hashCode()) * 31) + this.categoryIconNo.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCategoryUpdateParameterRequest(categoryNo=" + this.categoryNo + ", categoryName=" + this.categoryName + ", categoryIconNo=" + this.categoryIconNo + ")";
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ ConsumptionCategoryUpdateParameterRequest(int i, String str, String str2, String str3, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = ConsumptionCategoryUpdateParameterRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 31;
            } else {
                descriptor = ConsumptionCategoryUpdateParameterRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.categoryNo = str;
        this.categoryName = str2;
        this.categoryIconNo = str3;
    }

    public ConsumptionCategoryUpdateParameterRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.categoryNo = str;
        this.categoryName = str2;
        this.categoryIconNo = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(ConsumptionCategoryUpdateParameterRequest consumptionCategoryUpdateParameterRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        String str;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, consumptionCategoryUpdateParameterRequest.categoryNo);
            vylVar.onExtraCallback(serialDescriptor, 1, consumptionCategoryUpdateParameterRequest.categoryName);
            str = consumptionCategoryUpdateParameterRequest.categoryIconNo;
            i = 4;
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, consumptionCategoryUpdateParameterRequest.categoryNo);
            vylVar.onExtraCallback(serialDescriptor, 1, consumptionCategoryUpdateParameterRequest.categoryName);
            str = consumptionCategoryUpdateParameterRequest.categoryIconNo;
        }
        vylVar.onExtraCallback(serialDescriptor, i, str);
    }
}
