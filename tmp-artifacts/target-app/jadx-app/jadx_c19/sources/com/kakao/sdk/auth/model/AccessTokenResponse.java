package com.kakao.sdk.auth.model;

import com.kakao.sdk.auth.model.AccessTokenResponse$;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.nc;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AccessTokenResponse {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private final String accessToken;
    private final long accessTokenExpiresIn;
    private final String idToken;
    private final String refreshToken;
    private final Long refreshTokenExpiresIn;
    private final String scope;
    private final String scopes;
    private final String tokenType;
    private final String txId;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessTokenResponse)) {
            return false;
        }
        AccessTokenResponse accessTokenResponse = (AccessTokenResponse) obj;
        return Intrinsics.areEqual(this.accessToken, accessTokenResponse.accessToken) && Intrinsics.areEqual(this.refreshToken, accessTokenResponse.refreshToken) && this.accessTokenExpiresIn == accessTokenResponse.accessTokenExpiresIn && Intrinsics.areEqual(this.refreshTokenExpiresIn, accessTokenResponse.refreshTokenExpiresIn) && Intrinsics.areEqual(this.idToken, accessTokenResponse.idToken) && Intrinsics.areEqual(this.tokenType, accessTokenResponse.tokenType) && Intrinsics.areEqual(this.scope, accessTokenResponse.scope) && Intrinsics.areEqual(this.scopes, accessTokenResponse.scopes) && Intrinsics.areEqual(this.txId, accessTokenResponse.txId);
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode();
        String str = this.refreshToken;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Long.hashCode(this.accessTokenExpiresIn);
        Long l = this.refreshTokenExpiresIn;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str2 = this.idToken;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.tokenType.hashCode();
        String str3 = this.scope;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.scopes;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.txId;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "AccessTokenResponse(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", accessTokenExpiresIn=" + this.accessTokenExpiresIn + ", refreshTokenExpiresIn=" + this.refreshTokenExpiresIn + ", idToken=" + this.idToken + ", tokenType=" + this.tokenType + ", scope=" + this.scope + ", scopes=" + this.scopes + ", txId=" + this.txId + ")";
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final KSerializer<AccessTokenResponse> serializer() {
            return AccessTokenResponse$.serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ AccessTokenResponse(int i2, @nc(IAuthTabCallback = "access_token") String str, @nc(IAuthTabCallback = "refresh_token") String str2, @nc(IAuthTabCallback = "expires_in") long j, @nc(IAuthTabCallback = "refresh_token_expires_in") Long l, @nc(IAuthTabCallback = "id_token") String str3, @nc(IAuthTabCallback = "token_type") String str4, String str5, @Deprecated String str6, @nc(IAuthTabCallback = "tx_id") String str7, okycx okycxVar) {
        if (37 != (i2 & 37)) {
            htf31.onExtraCallbackWithResult(i2, 37, AccessTokenResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.accessToken = str;
        if ((i2 & 2) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str2;
        }
        this.accessTokenExpiresIn = j;
        if ((i2 & 8) == 0) {
            this.refreshTokenExpiresIn = null;
        } else {
            this.refreshTokenExpiresIn = l;
        }
        if ((i2 & 16) == 0) {
            this.idToken = null;
        } else {
            this.idToken = str3;
        }
        this.tokenType = str4;
        if ((i2 & 64) == 0) {
            this.scope = null;
        } else {
            this.scope = str5;
        }
        if ((i2 & 128) == 0) {
            this.scopes = null;
        } else {
            this.scopes = str6;
        }
        if ((i2 & 256) == 0) {
            this.txId = null;
        } else {
            this.txId = str7;
        }
    }

    @JvmStatic
    public static final void onWarmupCompleted(@NotNull AccessTokenResponse accessTokenResponse, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(accessTokenResponse, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vylVar.onExtraCallback(serialDescriptor, 0, accessTokenResponse.accessToken);
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || accessTokenResponse.refreshToken != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, accessTokenResponse.refreshToken);
        }
        vylVar.onExtraCallback(serialDescriptor, 2, accessTokenResponse.accessTokenExpiresIn);
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || accessTokenResponse.refreshTokenExpiresIn != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, accessTokenResponse.refreshTokenExpiresIn);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || accessTokenResponse.idToken != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, accessTokenResponse.idToken);
        }
        vylVar.onExtraCallback(serialDescriptor, 5, accessTokenResponse.tokenType);
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || accessTokenResponse.scope != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, accessTokenResponse.scope);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || accessTokenResponse.scopes != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, accessTokenResponse.scopes);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || accessTokenResponse.txId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, accessTokenResponse.txId);
        }
    }

    public final String onExtraCallback() {
        return this.accessToken;
    }

    public final String onNavigationEvent() {
        return this.refreshToken;
    }

    public final long IAuthTabCallback() {
        return this.accessTokenExpiresIn;
    }

    public final Long onExtraCallbackWithResult() {
        return this.refreshTokenExpiresIn;
    }

    public final String onWarmupCompleted() {
        return this.idToken;
    }

    public final String asBinder() {
        return this.scope;
    }
}
