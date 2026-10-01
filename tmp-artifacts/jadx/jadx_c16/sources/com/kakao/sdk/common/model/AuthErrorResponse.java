package com.kakao.sdk.common.model;

import com.kakao.sdk.common.model.AuthErrorResponse$;
import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.nc;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AuthErrorResponse implements Serializable {
    public static final onNavigationEvent Companion = new onNavigationEvent((DefaultConstructorMarker) null);
    private final String error;
    private final String errorDescription;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthErrorResponse)) {
            return false;
        }
        AuthErrorResponse authErrorResponse = (AuthErrorResponse) obj;
        return Intrinsics.areEqual(this.error, authErrorResponse.error) && Intrinsics.areEqual(this.errorDescription, authErrorResponse.errorDescription);
    }

    public int hashCode() {
        int iHashCode = this.error.hashCode();
        String str = this.errorDescription;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AuthErrorResponse(error=" + this.error + ", errorDescription=" + this.errorDescription + ")";
    }

    @Deprecated
    public /* synthetic */ AuthErrorResponse(int i, String str, @nc(IAuthTabCallback = "error_description") String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, AuthErrorResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.error = str;
        this.errorDescription = str2;
    }

    public AuthErrorResponse(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.error = str;
        this.errorDescription = str2;
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult(@NotNull AuthErrorResponse authErrorResponse, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(authErrorResponse, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vylVar.onExtraCallback(serialDescriptor, 0, authErrorResponse.error);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, authErrorResponse.errorDescription);
    }

    public final String onExtraCallbackWithResult() {
        return this.error;
    }

    public final String IAuthTabCallback() {
        return this.errorDescription;
    }
}
