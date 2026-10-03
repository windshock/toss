package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanDisclaimer$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanDisclaimer {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String disclaimer;

    static {
        int i = onNavigationEvent + 17;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanDisclaimer)) {
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.disclaimer, ((LoanDisclaimer) obj).disclaimer))) {
            int i4 = onExtraCallback + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onExtraCallback + 61;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.disclaimer.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.disclaimer.hashCode();
        int i3 = onWarmupCompleted + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanDisclaimer(disclaimer=" + this.disclaimer + ")";
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanDisclaimer> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanDisclaimer$.serializer serializerVar = LoanDisclaimer$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ LoanDisclaimer(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, LoanDisclaimer$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.disclaimer = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(LoanDisclaimer loanDisclaimer, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, loanDisclaimer.disclaimer);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.disclaimer;
        int i5 = i2 + 53;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
