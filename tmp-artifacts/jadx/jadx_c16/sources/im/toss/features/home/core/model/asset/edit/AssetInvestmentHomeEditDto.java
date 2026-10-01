package im.toss.features.home.core.model.asset.edit;

import im.toss.features.home.core.model.asset.edit.AssetInvestmentHomeEditDto$;
import im.toss.features.home.core.model.asset.edit.AssetInvestmentHomeEditDto$Investment$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetInvestmentHomeEditDto {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<Investment> investments;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AssetInvestmentHomeEditDto$.ExternalSyntheticLambda0())};

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AssetInvestmentHomeEditDto$Investment$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    static {
        int i = onExtraCallback + 81;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
    }

    public /* synthetic */ AssetInvestmentHomeEditDto(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AssetInvestmentHomeEditDto$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.investments = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AssetInvestmentHomeEditDto assetInvestmentHomeEditDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        vylVar.onNavigationEvent(serialDescriptor, 0, i2 % 2 != 0 ? (py) $childSerializers[0].getValue() : (py) $childSerializers[0].getValue(), assetInvestmentHomeEditDto.investments);
    }

    public final List<Investment> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.investments;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
