package im.toss.standardtermsv2.model;

import im.toss.standardtermsv2.model.GetAffiliateTermsAgreed$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class GetAffiliateTermsAgreed {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final boolean isBankAccountMember;
    private final boolean isSecuritiesAccountMember;
    private final boolean isSecuritiesAssociateMember;

    static {
        int i = onExtraCallback + 49;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAffiliateTermsAgreed)) {
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        GetAffiliateTermsAgreed getAffiliateTermsAgreed = (GetAffiliateTermsAgreed) obj;
        if (this.isSecuritiesAssociateMember != getAffiliateTermsAgreed.isSecuritiesAssociateMember) {
            int i4 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.isSecuritiesAccountMember != getAffiliateTermsAgreed.isSecuritiesAccountMember) {
            int i6 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.isBankAccountMember == getAffiliateTermsAgreed.isBankAccountMember) {
            return true;
        }
        int i7 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Boolean.hashCode(this.isSecuritiesAssociateMember) >>> 32) >>> Boolean.hashCode(this.isSecuritiesAccountMember)) >>> 14) % Boolean.hashCode(this.isBankAccountMember) : (((Boolean.hashCode(this.isSecuritiesAssociateMember) * 31) + Boolean.hashCode(this.isSecuritiesAccountMember)) * 31) + Boolean.hashCode(this.isBankAccountMember);
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetAffiliateTermsAgreed(isSecuritiesAssociateMember=" + this.isSecuritiesAssociateMember + ", isSecuritiesAccountMember=" + this.isSecuritiesAccountMember + ", isBankAccountMember=" + this.isBankAccountMember + ")";
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAffiliateTermsAgreed> serializer() {
            GetAffiliateTermsAgreed$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = GetAffiliateTermsAgreed$.serializer.INSTANCE;
                int i3 = 53 / 0;
            } else {
                serializerVar = GetAffiliateTermsAgreed$.serializer.INSTANCE;
            }
            int i4 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 56 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ GetAffiliateTermsAgreed(int i, boolean z, boolean z2, boolean z3, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, GetAffiliateTermsAgreed$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.isSecuritiesAssociateMember = z;
        this.isSecuritiesAccountMember = z2;
        this.isBankAccountMember = z3;
    }

    public GetAffiliateTermsAgreed(boolean z, boolean z2, boolean z3) {
        this.isSecuritiesAssociateMember = z;
        this.isSecuritiesAccountMember = z2;
        this.isBankAccountMember = z3;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(GetAffiliateTermsAgreed getAffiliateTermsAgreed, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onNavigationEvent(serialDescriptor, 0, getAffiliateTermsAgreed.isSecuritiesAssociateMember);
            vylVar.onNavigationEvent(serialDescriptor, 1, getAffiliateTermsAgreed.isSecuritiesAccountMember);
        } else {
            vylVar.onNavigationEvent(serialDescriptor, 0, getAffiliateTermsAgreed.isSecuritiesAssociateMember);
            vylVar.onNavigationEvent(serialDescriptor, 1, getAffiliateTermsAgreed.isSecuritiesAccountMember);
        }
        vylVar.onNavigationEvent(serialDescriptor, 2, getAffiliateTermsAgreed.isBankAccountMember);
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSecuritiesAssociateMember;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSecuritiesAccountMember;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
