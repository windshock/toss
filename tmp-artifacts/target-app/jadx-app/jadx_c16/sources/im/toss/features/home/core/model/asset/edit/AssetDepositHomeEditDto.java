package im.toss.features.home.core.model.asset.edit;

import im.toss.features.home.core.model.asset.edit.AssetDepositHomeEditDto$;
import im.toss.features.home.core.model.asset.edit.AssetDepositHomeEditDto$Deposit$;
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
public final class AssetDepositHomeEditDto {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<Deposit> deposits;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AssetDepositHomeEditDto$.ExternalSyntheticLambda0())};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AssetDepositHomeEditDto$Deposit$.serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetDepositHomeEditDto)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.deposits, ((AssetDepositHomeEditDto) obj).deposits))) {
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<Deposit> list = this.deposits;
        if (i3 == 0) {
            return list.hashCode();
        }
        list.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AssetDepositHomeEditDto(deposits=" + this.deposits + ")";
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = onExtraCallback + 11;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ AssetDepositHomeEditDto(int i, List list, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = AssetDepositHomeEditDto$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = AssetDepositHomeEditDto$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.deposits = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(AssetDepositHomeEditDto assetDepositHomeEditDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        py pyVar;
        List<Deposit> list;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            pyVar = (py) $childSerializers[0].getValue();
            list = assetDepositHomeEditDto.deposits;
            i3 = 1;
        } else {
            pyVar = (py) $childSerializers[0].getValue();
            list = assetDepositHomeEditDto.deposits;
        }
        vylVar.onNavigationEvent(serialDescriptor, i3, pyVar, list);
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Deposit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.deposits;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
