package viva.republica.toss.network.model.cardsales.funnel;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertResultRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueTossCertResultRequest {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String purpose;
    private final String txId;

    static {
        int i = onWarmupCompleted + 83;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardIssueTossCertResultRequest)) {
            return false;
        }
        CardIssueTossCertResultRequest cardIssueTossCertResultRequest = (CardIssueTossCertResultRequest) obj;
        if (Intrinsics.areEqual(this.txId, cardIssueTossCertResultRequest.txId)) {
            return Intrinsics.areEqual(this.purpose, cardIssueTossCertResultRequest.purpose);
        }
        int i3 = onExtraCallbackWithResult + 97;
        onExtraCallback = i3 % 128;
        return i3 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.txId.hashCode();
        return i3 != 0 ? (iHashCode >> 81) * this.purpose.hashCode() : (iHashCode * 31) + this.purpose.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueTossCertResultRequest(txId=" + this.txId + ", purpose=" + this.purpose + ")";
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardIssueTossCertResultRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CardIssueTossCertResultRequest$.serializer serializerVar = CardIssueTossCertResultRequest$.serializer.INSTANCE;
            int i4 = onExtraCallback + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ CardIssueTossCertResultRequest(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, CardIssueTossCertResultRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.txId = str;
        this.purpose = str2;
    }

    public CardIssueTossCertResultRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.txId = str;
        this.purpose = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(CardIssueTossCertResultRequest cardIssueTossCertResultRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, cardIssueTossCertResultRequest.txId);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, cardIssueTossCertResultRequest.txId);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, cardIssueTossCertResultRequest.purpose);
    }
}
