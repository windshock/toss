package com.kakao.sdk.common.model;

import com.kakao.sdk.common.model.ApiErrorResponse$;
import java.io.Serializable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.checkCanOpenLandingPage;
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
public final class ApiErrorResponse implements Serializable {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private final List<String> allowedScopes;
    private final String apiType;
    private final int code;
    private final String msg;
    private final List<String> requiredScopes;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiErrorResponse)) {
            return false;
        }
        ApiErrorResponse apiErrorResponse = (ApiErrorResponse) obj;
        return this.code == apiErrorResponse.code && Intrinsics.areEqual(this.msg, apiErrorResponse.msg) && Intrinsics.areEqual(this.apiType, apiErrorResponse.apiType) && Intrinsics.areEqual(this.requiredScopes, apiErrorResponse.requiredScopes) && Intrinsics.areEqual(this.allowedScopes, apiErrorResponse.allowedScopes);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code);
        int iHashCode2 = this.msg.hashCode();
        String str = this.apiType;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<String> list = this.requiredScopes;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.allowedScopes;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "ApiErrorResponse(code=" + this.code + ", msg=" + this.msg + ", apiType=" + this.apiType + ", requiredScopes=" + this.requiredScopes + ", allowedScopes=" + this.allowedScopes + ")";
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final KSerializer<ApiErrorResponse> serializer() {
            return ApiErrorResponse$.serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ApiErrorResponse(int i, int i2, String str, @nc(IAuthTabCallback = "api_type") String str2, @nc(IAuthTabCallback = "required_scopes") List list, @nc(IAuthTabCallback = "allowed_scopes") List list2, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, ApiErrorResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.code = i2;
        this.msg = str;
        if ((i & 4) == 0) {
            this.apiType = null;
        } else {
            this.apiType = str2;
        }
        if ((i & 8) == 0) {
            this.requiredScopes = null;
        } else {
            this.requiredScopes = list;
        }
        if ((i & 16) == 0) {
            this.allowedScopes = null;
        } else {
            this.allowedScopes = list2;
        }
    }

    public ApiErrorResponse(int i, @NotNull String str, @Nullable String str2, @Nullable List<String> list, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.msg = str;
        this.apiType = str2;
        this.requiredScopes = list;
        this.allowedScopes = list2;
    }

    @JvmStatic
    public static final void onWarmupCompleted(@NotNull ApiErrorResponse apiErrorResponse, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(apiErrorResponse, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vylVar.onExtraCallback(serialDescriptor, 0, apiErrorResponse.code);
        vylVar.onExtraCallback(serialDescriptor, 1, apiErrorResponse.msg);
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || apiErrorResponse.apiType != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, apiErrorResponse.apiType);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || apiErrorResponse.requiredScopes != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent), apiErrorResponse.requiredScopes);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || apiErrorResponse.allowedScopes != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent), apiErrorResponse.allowedScopes);
        }
    }

    public /* synthetic */ ApiErrorResponse(int i, String str, String str2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2);
    }

    public final int IAuthTabCallback() {
        return this.code;
    }

    public final String onNavigationEvent() {
        return this.msg;
    }

    public final List<String> onExtraCallback() {
        return this.requiredScopes;
    }

    public final List<String> onWarmupCompleted() {
        return this.allowedScopes;
    }
}
