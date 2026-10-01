package im.toss.features.home.core.model;

import im.toss.features.home.core.model.SaveHomeAssetEditV2ReqDto$;
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
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SaveHomeAssetEditV2ReqDto {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final onWarmupCompleted type;
    private final List<String> visibleAssets;

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.home.core.model.SaveHomeAssetEditV2ReqDto.Type", onWarmupCompleted.values());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.home.core.model.SaveHomeAssetEditV2ReqDto.Type", onWarmupCompleted.values());
        int i3 = IAuthTabCallback + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof SaveHomeAssetEditV2ReqDto)) {
            int i3 = onExtraCallback + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        SaveHomeAssetEditV2ReqDto saveHomeAssetEditV2ReqDto = (SaveHomeAssetEditV2ReqDto) obj;
        if (this.type != saveHomeAssetEditV2ReqDto.type) {
            return false;
        }
        if (Intrinsics.areEqual(this.visibleAssets, saveHomeAssetEditV2ReqDto.visibleAssets)) {
            return true;
        }
        int i5 = onExtraCallback + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r1 r3
      0x0031: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r3v4 java.util.List<java.lang.String>) = (r3v0 java.util.List<java.lang.String>), (r3v5 java.util.List<java.lang.String>) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        List<String> list;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.type.hashCode();
            list = this.visibleAssets;
            int i3 = 25 / 0;
            if (list == null) {
                int i4 = IAuthTabCallback + 105;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode2 = list.hashCode();
            }
        } else {
            iHashCode = this.type.hashCode();
            list = this.visibleAssets;
            if (list == null) {
            }
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SaveHomeAssetEditV2ReqDto(type=" + this.type + ", visibleAssets=" + this.visibleAssets + ")";
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new SaveHomeAssetEditV2ReqDto$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new SaveHomeAssetEditV2ReqDto$.ExternalSyntheticLambda1())};
        int i = onWarmupCompleted + 33;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ SaveHomeAssetEditV2ReqDto(int i, onWarmupCompleted onwarmupcompleted, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, SaveHomeAssetEditV2ReqDto$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.type = onwarmupcompleted;
        if ((i & 2) == 0) {
            this.visibleAssets = null;
            return;
        }
        this.visibleAssets = list;
        int i6 = IAuthTabCallback + 123;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public SaveHomeAssetEditV2ReqDto(@NotNull onWarmupCompleted onwarmupcompleted, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.type = onwarmupcompleted;
        this.visibleAssets = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(SaveHomeAssetEditV2ReqDto saveHomeAssetEditV2ReqDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), saveHomeAssetEditV2ReqDto.type);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallback + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (saveHomeAssetEditV2ReqDto.visibleAssets == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), saveHomeAssetEditV2ReqDto.visibleAssets);
        int i6 = onExtraCallback + 117;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SaveHomeAssetEditV2ReqDto(onWarmupCompleted onwarmupcompleted, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            list = null;
        }
        this(onwarmupcompleted, list);
    }
}
