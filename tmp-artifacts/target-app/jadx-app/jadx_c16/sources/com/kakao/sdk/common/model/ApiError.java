package com.kakao.sdk.common.model;

import com.kakao.sdk.common.model.ApiError$;
import com.kakao.sdk.common.model.ApiErrorResponse$;
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
public final class ApiError extends KakaoSdkError {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
    private final ApiErrorCause reason;
    private final ApiErrorResponse response;
    private final int statusCode;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiError)) {
            return false;
        }
        ApiError apiError = (ApiError) obj;
        return this.statusCode == apiError.statusCode && this.reason == apiError.reason && Intrinsics.areEqual(this.response, apiError.response);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.statusCode) * 31) + this.reason.hashCode()) * 31) + this.response.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ApiError(statusCode=" + this.statusCode + ", reason=" + this.reason + ", response=" + this.response + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ ApiError(int i, String str, @nc(IAuthTabCallback = "status_code") int i2, ApiErrorCause apiErrorCause, ApiErrorResponse apiErrorResponse, okycx okycxVar) {
        super(i, str, okycxVar);
        if (15 != (i & 15)) {
            htf31.onExtraCallbackWithResult(i, 15, ApiError$.serializer.INSTANCE.getDescriptor());
        }
        this.statusCode = i2;
        this.reason = apiErrorCause;
        this.response = apiErrorResponse;
    }

    @JvmStatic
    public static final void IAuthTabCallback(@NotNull ApiError apiError, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(apiError, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        KakaoSdkError.onWarmupCompleted(apiError, vylVar, serialDescriptor);
        vylVar.onExtraCallback(serialDescriptor, 1, apiError.statusCode);
        vylVar.onNavigationEvent(serialDescriptor, 2, ApiErrorCauseSerializer.INSTANCE, apiError.reason);
        vylVar.onNavigationEvent(serialDescriptor, 3, ApiErrorResponse$.serializer.INSTANCE, apiError.response);
    }

    public final int onNavigationEvent() {
        return this.statusCode;
    }

    public final ApiErrorCause onWarmupCompleted() {
        return this.reason;
    }

    public final ApiErrorResponse onExtraCallbackWithResult() {
        return this.response;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiError(int i, @NotNull ApiErrorCause apiErrorCause, @NotNull ApiErrorResponse apiErrorResponse) {
        super(apiErrorResponse.onNavigationEvent(), null);
        Intrinsics.checkNotNullParameter(apiErrorCause, "");
        Intrinsics.checkNotNullParameter(apiErrorResponse, "");
        this.statusCode = i;
        this.reason = apiErrorCause;
        this.response = apiErrorResponse;
    }
}
