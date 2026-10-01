package im.toss.features.home.core.model.asset.edit;

import im.toss.features.home.core.model.asset.edit.UpdateAssetForEditV2Dto$;
import im.toss.features.home.core.model.asset.edit.UpdateAssetForEditV2Dto$Category$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class UpdateAssetForEditV2Dto {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<Category> categories;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new UpdateAssetForEditV2Dto$.ExternalSyntheticLambda0())};

    /* JADX WARN: Illegal instructions before constructor call */
    public UpdateAssetForEditV2Dto() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(UpdateAssetForEditV2Dto$Category$.serializer.INSTANCE);
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onWarmupCompleted = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 41;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(obj instanceof UpdateAssetForEditV2Dto)) {
            int i5 = i2 + 47;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.categories, ((UpdateAssetForEditV2Dto) obj).categories)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.categories.hashCode();
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateAssetForEditV2Dto(categories=" + this.categories + ")";
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = IAuthTabCallback + 125;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ UpdateAssetForEditV2Dto(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.categories = CollectionsKt.emptyList();
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.categories = list;
        int i4 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public UpdateAssetForEditV2Dto(@NotNull List<Category> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.categories = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(UpdateAssetForEditV2Dto updateAssetForEditV2Dto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(updateAssetForEditV2Dto.categories, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), updateAssetForEditV2Dto.categories);
        }
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 65;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UpdateAssetForEditV2Dto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(list);
    }
}
