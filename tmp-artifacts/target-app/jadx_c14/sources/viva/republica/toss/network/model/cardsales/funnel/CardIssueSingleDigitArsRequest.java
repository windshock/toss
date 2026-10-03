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
import viva.republica.toss.network.model.cardsales.funnel.CardIssueSingleDigitArsRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueSingleDigitArsRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String accountNumber;
    private final String bankCode;

    static {
        int i = onExtraCallback + 37;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardIssueSingleDigitArsRequest)) {
            return false;
        }
        CardIssueSingleDigitArsRequest cardIssueSingleDigitArsRequest = (CardIssueSingleDigitArsRequest) obj;
        if (!Intrinsics.areEqual(this.accountNumber, cardIssueSingleDigitArsRequest.accountNumber)) {
            int i4 = IAuthTabCallback + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.bankCode, cardIssueSingleDigitArsRequest.bankCode)) {
            return true;
        }
        int i6 = onNavigationEvent + 125;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.accountNumber.hashCode() * 31) + this.bankCode.hashCode();
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueSingleDigitArsRequest(accountNumber=" + this.accountNumber + ", bankCode=" + this.bankCode + ")";
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
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

        public final KSerializer<CardIssueSingleDigitArsRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CardIssueSingleDigitArsRequest$.serializer serializerVar = CardIssueSingleDigitArsRequest$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ CardIssueSingleDigitArsRequest(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, CardIssueSingleDigitArsRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.accountNumber = str;
        this.bankCode = str2;
    }

    public CardIssueSingleDigitArsRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountNumber = str;
        this.bankCode = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(CardIssueSingleDigitArsRequest cardIssueSingleDigitArsRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, cardIssueSingleDigitArsRequest.accountNumber);
        vylVar.onExtraCallback(serialDescriptor, 1, cardIssueSingleDigitArsRequest.bankCode);
        int i4 = onNavigationEvent + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
