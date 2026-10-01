package com.samsung.android.ssiframework.sdk.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TermsAndConditions {
    private final AgreeState agree;
    private final String caAppId;
    private final String code;

    public TermsAndConditions(@NotNull String str, @NotNull AgreeState agreeState, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(agreeState, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.code = str;
        this.agree = agreeState;
        this.caAppId = str2;
    }

    public static /* synthetic */ TermsAndConditions copy$default(TermsAndConditions termsAndConditions, String str, AgreeState agreeState, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = termsAndConditions.code;
        }
        if ((i & 2) != 0) {
            agreeState = termsAndConditions.agree;
        }
        if ((i & 4) != 0) {
            str2 = termsAndConditions.caAppId;
        }
        return termsAndConditions.copy(str, agreeState, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final AgreeState component2() {
        return this.agree;
    }

    public final String component3() {
        return this.caAppId;
    }

    public final TermsAndConditions copy(@NotNull String str, @NotNull AgreeState agreeState, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(agreeState, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TermsAndConditions(str, agreeState, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsAndConditions)) {
            return false;
        }
        TermsAndConditions termsAndConditions = (TermsAndConditions) obj;
        return Intrinsics.areEqual(this.code, termsAndConditions.code) && this.agree == termsAndConditions.agree && Intrinsics.areEqual(this.caAppId, termsAndConditions.caAppId);
    }

    public final AgreeState getAgree() {
        return this.agree;
    }

    public final String getCaAppId() {
        return this.caAppId;
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode();
        return this.caAppId.hashCode() + ((this.agree.hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        return "TermsAndConditions(code=" + this.code + ", agree=" + this.agree + ", caAppId=" + this.caAppId + ")";
    }
}
