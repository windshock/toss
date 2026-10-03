package viva.republica.toss.network.model.cardsales.funnel;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueSingleDigitArsResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueSingleDigitArsResp {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String arsRequestId;

    static {
        int i = onNavigationEvent + 39;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardIssueSingleDigitArsResp() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            return (obj instanceof CardIssueSingleDigitArsResp) && Intrinsics.areEqual(this.arsRequestId, ((CardIssueSingleDigitArsResp) obj).arsRequestId);
        }
        int i5 = i2 + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.arsRequestId.hashCode();
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueSingleDigitArsResp(arsRequestId=" + this.arsRequestId + ")";
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardIssueSingleDigitArsResp> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            CardIssueSingleDigitArsResp$.serializer serializerVar = CardIssueSingleDigitArsResp$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ CardIssueSingleDigitArsResp(int i, String str, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.arsRequestId = "";
            int i2 = onExtraCallback + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.arsRequestId = str;
        int i3 = onWarmupCompleted + 13;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public CardIssueSingleDigitArsResp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arsRequestId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(CardIssueSingleDigitArsResp cardIssueSingleDigitArsResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(cardIssueSingleDigitArsResp.arsRequestId, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 0, cardIssueSingleDigitArsResp.arsRequestId);
        int i6 = onWarmupCompleted + 79;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardIssueSingleDigitArsResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 11;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 4;
            } else {
                int i7 = 2 % 2;
            }
            str = "";
        }
        this(str);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.arsRequestId;
        int i5 = i3 + 117;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
