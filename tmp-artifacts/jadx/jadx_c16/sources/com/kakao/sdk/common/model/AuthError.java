package com.kakao.sdk.common.model;

import com.kakao.sdk.common.model.AuthError$;
import com.kakao.sdk.common.model.AuthErrorResponse$;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.nc;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AuthError extends KakaoSdkError {
    public static final onExtraCallback Companion = new onExtraCallback((DefaultConstructorMarker) null);
    private final AuthErrorCause reason;
    private final AuthErrorResponse response;
    private final int statusCode;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthError)) {
            return false;
        }
        AuthError authError = (AuthError) obj;
        return this.statusCode == authError.statusCode && this.reason == authError.reason && Intrinsics.areEqual(this.response, authError.response);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.statusCode) * 31) + this.reason.hashCode()) * 31) + this.response.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AuthError(statusCode=" + this.statusCode + ", reason=" + this.reason + ", response=" + this.response + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ AuthError(int i, String str, @nc(IAuthTabCallback = "status_code") int i2, AuthErrorCause authErrorCause, AuthErrorResponse authErrorResponse, okycx okycxVar) {
        super(i, str, okycxVar);
        if (15 != (i & 15)) {
            htf31.onExtraCallbackWithResult(i, 15, AuthError$.serializer.INSTANCE.getDescriptor());
        }
        this.statusCode = i2;
        this.reason = authErrorCause;
        this.response = authErrorResponse;
    }

    @JvmStatic
    public static final void onNavigationEvent(@NotNull AuthError authError, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(authError, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        KakaoSdkError.onWarmupCompleted(authError, vylVar, serialDescriptor);
        vylVar.onExtraCallback(serialDescriptor, 1, authError.statusCode);
        vylVar.onNavigationEvent(serialDescriptor, 2, AuthErrorCauseSerializer.INSTANCE, authError.reason);
        vylVar.onNavigationEvent(serialDescriptor, 3, AuthErrorResponse$.serializer.INSTANCE, authError.response);
    }

    public final AuthErrorResponse onNavigationEvent() {
        return this.response;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthError(int i, @NotNull AuthErrorCause authErrorCause, @NotNull AuthErrorResponse authErrorResponse) {
        Intrinsics.checkNotNullParameter(authErrorCause, "");
        Intrinsics.checkNotNullParameter(authErrorResponse, "");
        String strIAuthTabCallback = authErrorResponse.IAuthTabCallback();
        super(strIAuthTabCallback == null ? authErrorResponse.onExtraCallbackWithResult() : strIAuthTabCallback, null);
        this.statusCode = i;
        this.reason = authErrorCause;
        this.response = authErrorResponse;
    }
}
