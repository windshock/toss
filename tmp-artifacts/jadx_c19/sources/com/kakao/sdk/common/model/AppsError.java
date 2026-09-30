package com.kakao.sdk.common.model;

import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.nc;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsError extends KakaoSdkError {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private final AppsErrorCause reason;
    private final AppsErrorResponse response;
    private final int statusCode;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsError)) {
            return false;
        }
        AppsError appsError = (AppsError) obj;
        return this.statusCode == appsError.statusCode && this.reason == appsError.reason && Intrinsics.areEqual(this.response, appsError.response);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.statusCode) * 31) + this.reason.hashCode()) * 31) + this.response.hashCode();
    }

    public String toString() {
        return "AppsError(statusCode=" + this.statusCode + ", reason=" + this.reason + ", response=" + this.response + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ AppsError(int i2, String str, @nc(IAuthTabCallback = "status_code") int i3, AppsErrorCause appsErrorCause, AppsErrorResponse appsErrorResponse, okycx okycxVar) {
        super(i2, str, okycxVar);
        if (15 != (i2 & 15)) {
            htf31.onExtraCallbackWithResult(i2, 15, AppsError$$serializer.INSTANCE.getDescriptor());
        }
        this.statusCode = i3;
        this.reason = appsErrorCause;
        this.response = appsErrorResponse;
    }

    @JvmStatic
    public static final void onExtraCallback(@NotNull AppsError appsError, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(appsError, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        KakaoSdkError.onWarmupCompleted(appsError, vylVar, serialDescriptor);
        vylVar.onExtraCallback(serialDescriptor, 1, appsError.statusCode);
        vylVar.onNavigationEvent(serialDescriptor, 2, AppsErrorCauseSerializer.INSTANCE, appsError.reason);
        vylVar.onNavigationEvent(serialDescriptor, 3, AppsErrorResponse$$serializer.INSTANCE, appsError.response);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final KSerializer<AppsError> serializer() {
            return AppsError$$serializer.INSTANCE;
        }
    }
}
