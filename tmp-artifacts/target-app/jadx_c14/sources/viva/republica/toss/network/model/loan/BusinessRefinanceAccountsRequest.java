package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.BusinessRefinanceAccountsRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BusinessRefinanceAccountsRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final JsonObject preScreenData;
    private final String preScreenType;

    static {
        int i = IAuthTabCallback + 65;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof BusinessRefinanceAccountsRequest)) {
            return false;
        }
        BusinessRefinanceAccountsRequest businessRefinanceAccountsRequest = (BusinessRefinanceAccountsRequest) obj;
        if (!Intrinsics.areEqual(this.preScreenType, businessRefinanceAccountsRequest.preScreenType)) {
            int i4 = onExtraCallbackWithResult + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.preScreenData, businessRefinanceAccountsRequest.preScreenData)) {
            return false;
        }
        int i6 = onExtraCallback + 75;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 1 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.preScreenType.hashCode();
        JsonObject jsonObject = this.preScreenData;
        if (jsonObject == null) {
            int i3 = onExtraCallback + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = jsonObject.hashCode();
            int i5 = onExtraCallbackWithResult + 35;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BusinessRefinanceAccountsRequest(preScreenType=" + this.preScreenType + ", preScreenData=" + this.preScreenData + ")";
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BusinessRefinanceAccountsRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            BusinessRefinanceAccountsRequest$.serializer serializerVar = BusinessRefinanceAccountsRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ BusinessRefinanceAccountsRequest(int i, String str, JsonObject jsonObject, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 1, (i2 % 2 == 0 ? BusinessRefinanceAccountsRequest$.serializer.INSTANCE : BusinessRefinanceAccountsRequest$.serializer.INSTANCE).getDescriptor());
            int i3 = 2 % 2;
        }
        this.preScreenType = str;
        if ((i & 2) != 0) {
            this.preScreenData = jsonObject;
            return;
        }
        this.preScreenData = null;
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public BusinessRefinanceAccountsRequest(@NotNull String str, @Nullable JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        this.preScreenType = str;
        this.preScreenData = jsonObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.BusinessRefinanceAccountsRequest r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.BusinessRefinanceAccountsRequest.onExtraCallbackWithResult
            int r1 = r1 + 65
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.BusinessRefinanceAccountsRequest.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1d
            java.lang.String r1 = r4.preScreenType
            r5.onExtraCallback(r6, r3, r1)
            boolean r1 = r5.onWarmupCompleted(r6, r2)
            r1 = r1 ^ r3
            if (r1 == r3) goto L28
            goto L2c
        L1d:
            java.lang.String r1 = r4.preScreenType
            r5.onExtraCallback(r6, r2, r1)
            boolean r1 = r5.onWarmupCompleted(r6, r3)
            if (r1 != 0) goto L2c
        L28:
            kotlinx.serialization.json.JsonObject r1 = r4.preScreenData
            if (r1 == 0) goto L3c
        L2c:
            o.encryptType4 r1 = o.encryptType4.IAuthTabCallback
            kotlinx.serialization.json.JsonObject r4 = r4.preScreenData
            r5.onExtraCallbackWithResult(r6, r3, r1, r4)
            int r4 = viva.republica.toss.network.model.loan.BusinessRefinanceAccountsRequest.onExtraCallback
            int r4 = r4 + 125
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.BusinessRefinanceAccountsRequest.onExtraCallbackWithResult = r5
            int r4 = r4 % r0
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.BusinessRefinanceAccountsRequest.IAuthTabCallback(viva.republica.toss.network.model.loan.BusinessRefinanceAccountsRequest, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }
}
