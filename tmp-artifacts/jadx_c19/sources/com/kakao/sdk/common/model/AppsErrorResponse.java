package com.kakao.sdk.common.model;

import java.io.Serializable;
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
public final class AppsErrorResponse implements Serializable {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private final String errorCode;
    private final String errorMessage;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsErrorResponse)) {
            return false;
        }
        AppsErrorResponse appsErrorResponse = (AppsErrorResponse) obj;
        return Intrinsics.areEqual(this.errorCode, appsErrorResponse.errorCode) && Intrinsics.areEqual(this.errorMessage, appsErrorResponse.errorMessage);
    }

    public int hashCode() {
        return (this.errorCode.hashCode() * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "AppsErrorResponse(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final KSerializer<AppsErrorResponse> serializer() {
            return AppsErrorResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ AppsErrorResponse(int i2, @nc(IAuthTabCallback = "error_code") String str, @nc(IAuthTabCallback = "error_message") String str2, okycx okycxVar) {
        if (3 != (i2 & 3)) {
            htf31.onExtraCallbackWithResult(i2, 3, AppsErrorResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.errorCode = str;
        this.errorMessage = str2;
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult(@NotNull AppsErrorResponse appsErrorResponse, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(appsErrorResponse, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vylVar.onExtraCallback(serialDescriptor, 0, appsErrorResponse.errorCode);
        vylVar.onExtraCallback(serialDescriptor, 1, appsErrorResponse.errorMessage);
    }
}
