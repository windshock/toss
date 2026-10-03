package viva.republica.toss.network.model.transfer;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.AccountBalanceRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountBalanceRequest {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<AccountBalanceInfo> accounts;
    private final String referrer;
    private final String sessionKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.AccountBalanceRequest$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return AccountBalanceRequest.IAuthTabCallback();
            }
            AccountBalanceRequest.IAuthTabCallback();
            throw null;
        }
    }), null, null};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i3 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallback;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AccountBalanceInfo$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AccountBalanceRequest)) {
            return false;
        }
        AccountBalanceRequest accountBalanceRequest = (AccountBalanceRequest) obj;
        if (!Intrinsics.areEqual(this.accounts, accountBalanceRequest.accounts)) {
            int i4 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.referrer, accountBalanceRequest.referrer) || !Intrinsics.areEqual(this.sessionKey, accountBalanceRequest.sessionKey)) {
            return false;
        }
        int i6 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 54 / 0;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.accounts.hashCode();
            str = this.referrer;
            iHashCode2 = 1;
            if (str != null) {
                iHashCode3 = 1;
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
        } else {
            iHashCode = this.accounts.hashCode();
            str = this.referrer;
            if (str == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
        }
        String str2 = this.sessionKey;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
            int i3 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountBalanceRequest(accounts=" + this.accounts + ", referrer=" + this.referrer + ", sessionKey=" + this.sessionKey + ")";
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountBalanceRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AccountBalanceRequest$.serializer serializerVar = AccountBalanceRequest$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 33;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ AccountBalanceRequest(int i, List list, String str, String str2, okycx okycxVar) {
        int i2;
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, AccountBalanceRequest$.serializer.INSTANCE.getDescriptor());
            int i3 = 2 % 2;
        }
        this.accounts = list;
        if ((i & 2) == 0) {
            this.referrer = null;
            i2 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i2 % 128;
        } else {
            this.referrer = str;
            i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
        }
        int i4 = i2 % 2;
        int i5 = 2 % 2;
        if ((i & 4) != 0) {
            this.sessionKey = str2;
            return;
        }
        int i6 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        this.sessionKey = null;
    }

    public AccountBalanceRequest(@NotNull List<AccountBalanceInfo> list, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accounts = list;
        this.referrer = str;
        this.sessionKey = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.AccountBalanceRequest r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.AccountBalanceRequest.onWarmupCompleted
            int r1 = r1 + 33
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.AccountBalanceRequest.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.AccountBalanceRequest.$childSerializers
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.transfer.AccountBalanceInfo> r3 = r5.accounts
            r6.onNavigationEvent(r7, r2, r1, r3)
            r1 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r1)
            if (r3 != 0) goto L27
            java.lang.String r3 = r5.referrer
            if (r3 == 0) goto L2e
        L27:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.referrer
            r6.onExtraCallbackWithResult(r7, r1, r3, r4)
        L2e:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L4b
            int r1 = viva.republica.toss.network.model.transfer.AccountBalanceRequest.onWarmupCompleted
            int r1 = r1 + 51
            int r3 = r1 % 128
            viva.republica.toss.network.model.transfer.AccountBalanceRequest.onExtraCallbackWithResult = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L47
            java.lang.String r1 = r5.sessionKey
            r3 = 8
            int r3 = r3 / r2
            if (r1 == 0) goto L52
            goto L4b
        L47:
            java.lang.String r1 = r5.sessionKey
            if (r1 == 0) goto L52
        L4b:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.sessionKey
            r6.onExtraCallbackWithResult(r7, r0, r1, r5)
        L52:
            int r5 = viva.republica.toss.network.model.transfer.AccountBalanceRequest.onWarmupCompleted
            int r5 = r5 + 115
            int r6 = r5 % 128
            viva.republica.toss.network.model.transfer.AccountBalanceRequest.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L5e
            return
        L5e:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.AccountBalanceRequest.onWarmupCompleted(viva.republica.toss.network.model.transfer.AccountBalanceRequest, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
