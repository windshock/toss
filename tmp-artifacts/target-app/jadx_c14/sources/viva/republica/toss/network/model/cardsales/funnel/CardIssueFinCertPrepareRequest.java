package viva.republica.toss.network.model.cardsales.funnel;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueFinCertPrepareRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String purpose;
    private final String sessionId;

    static {
        int i = onExtraCallbackWithResult + 35;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 13;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof CardIssueFinCertPrepareRequest)) {
            int i8 = i2 + 89;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        CardIssueFinCertPrepareRequest cardIssueFinCertPrepareRequest = (CardIssueFinCertPrepareRequest) obj;
        if (Intrinsics.areEqual(this.sessionId, cardIssueFinCertPrepareRequest.sessionId)) {
            return Intrinsics.areEqual(this.purpose, cardIssueFinCertPrepareRequest.purpose);
        }
        int i10 = onExtraCallback + 73;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        String str = this.sessionId;
        if (str == null) {
            int i6 = i3 + 103;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i8 = IAuthTabCallback + 53;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            i = iHashCode;
        }
        return (i * 31) + this.purpose.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueFinCertPrepareRequest(sessionId=" + this.sessionId + ", purpose=" + this.purpose + ")";
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardIssueFinCertPrepareRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            CardIssueFinCertPrepareRequest$.serializer serializerVar = CardIssueFinCertPrepareRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ CardIssueFinCertPrepareRequest(int i, String str, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onExtraCallback + 51;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = CardIssueFinCertPrepareRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 5;
            } else {
                descriptor = CardIssueFinCertPrepareRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.sessionId = str;
        this.purpose = str2;
    }

    public CardIssueFinCertPrepareRequest(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.sessionId = str;
        this.purpose = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(CardIssueFinCertPrepareRequest cardIssueFinCertPrepareRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, cardIssueFinCertPrepareRequest.sessionId);
        vylVar.onExtraCallback(serialDescriptor, 1, cardIssueFinCertPrepareRequest.purpose);
    }
}
