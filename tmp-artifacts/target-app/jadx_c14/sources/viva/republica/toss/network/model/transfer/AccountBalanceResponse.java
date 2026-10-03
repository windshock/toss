package viva.republica.toss.network.model.transfer;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
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
import viva.republica.toss.network.model.transfer.AccountBalanceResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountBalanceResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<AccountBalanceInfo> balances;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.AccountBalanceResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = AccountBalanceResponse.onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    })};

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AccountBalanceInfo$$serializer.INSTANCE);
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountBalanceResponse)) {
            return false;
        }
        if (Intrinsics.areEqual(this.balances, ((AccountBalanceResponse) obj).balances)) {
            return true;
        }
        int i3 = IAuthTabCallback + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.balances.hashCode();
            int i3 = 71 / 0;
        } else {
            iHashCode = this.balances.hashCode();
        }
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountBalanceResponse(balances=" + this.balances + ")";
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountBalanceResponse> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AccountBalanceResponse$.serializer serializerVar = AccountBalanceResponse$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ AccountBalanceResponse(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AccountBalanceResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 31;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.balances = list;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AccountBalanceResponse accountBalanceResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), accountBalanceResponse.balances);
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return lazyArr;
    }

    public final List<AccountBalanceInfo> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<AccountBalanceInfo> list = this.balances;
        int i5 = i3 + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
