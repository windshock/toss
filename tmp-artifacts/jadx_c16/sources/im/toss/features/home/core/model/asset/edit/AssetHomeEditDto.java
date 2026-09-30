package im.toss.features.home.core.model.asset.edit;

import im.toss.features.home.core.model.asset.edit.AssetHomeEditDto$;
import im.toss.features.home.core.model.asset.edit.AssetHomeEditDto$Asset$;
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
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetHomeEditDto {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<Asset> assets;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AssetHomeEditDto$.ExternalSyntheticLambda0())};

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AssetHomeEditDto$Asset$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AssetHomeEditDto) {
            return Intrinsics.areEqual(this.assets, ((AssetHomeEditDto) obj).assets);
        }
        int i5 = i2 + 25;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 97;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List<Asset> list = this.assets;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AssetHomeEditDto(assets=" + this.assets + ")";
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AssetHomeEditDto(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AssetHomeEditDto$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.assets = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(AssetHomeEditDto assetHomeEditDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), assetHomeEditDto.assets);
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    public final List<Asset> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<Asset> list = this.assets;
        int i5 = i2 + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
