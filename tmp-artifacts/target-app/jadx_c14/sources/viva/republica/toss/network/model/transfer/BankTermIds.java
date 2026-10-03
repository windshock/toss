package viva.republica.toss.network.model.transfer;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
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
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BankTermIds {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int bankCode;
    private final List<String> termIds;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.BankTermIds$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = BankTermIds.onNavigationEvent();
            if (i3 != 0) {
                int i4 = 18 / 0;
            }
            return kSerializerOnNavigationEvent;
        }
    })};

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 97;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(!(obj instanceof BankTermIds))) {
            if (this.bankCode != ((BankTermIds) obj).bankCode) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.termIds, r6.termIds))) {
                return true;
            }
            int i3 = onWarmupCompleted + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.bankCode) * 31) + this.termIds.hashCode();
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankTermIds(bankCode=" + this.bankCode + ", termIds=" + this.termIds + ")";
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BankTermIds> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            BankTermIds$$serializer bankTermIds$$serializer = BankTermIds$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return bankTermIds$$serializer;
        }
    }

    static {
        int i = IAuthTabCallback + 81;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ BankTermIds(int i, int i2, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i3 = onExtraCallback + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 1, BankTermIds$$serializer.INSTANCE.getDescriptor());
            int i5 = onWarmupCompleted + 59;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 3;
            } else {
                int i7 = 2 % 2;
            }
        }
        this.bankCode = i2;
        if ((i & 2) == 0) {
            this.termIds = CollectionsKt.emptyList();
        } else {
            this.termIds = list;
        }
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(BankTermIds bankTermIds, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, bankTermIds.bankCode);
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || (!Intrinsics.areEqual(bankTermIds.termIds, CollectionsKt.emptyList()))) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), bankTermIds.termIds);
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.bankCode;
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return i4;
    }

    public final List<String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.termIds;
        }
        throw null;
    }
}
