package com.kakao.sdk.auth.model;

import com.kakao.sdk.auth.model.OAuthToken$;
import java.util.Date;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.checkCanOpenLandingPage;
import o.ff;
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
public final class OAuthToken {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
    private final String accessToken;
    private final Date accessTokenExpiresAt;
    private final String idToken;
    private final String refreshToken;
    private final Date refreshTokenExpiresAt;
    private final List<String> scopes;

    public static /* synthetic */ OAuthToken onWarmupCompleted(OAuthToken oAuthToken, String str, Date date, String str2, Date date2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oAuthToken.accessToken;
        }
        if ((i & 2) != 0) {
            date = oAuthToken.accessTokenExpiresAt;
        }
        Date date3 = date;
        if ((i & 4) != 0) {
            str2 = oAuthToken.refreshToken;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            date2 = oAuthToken.refreshTokenExpiresAt;
        }
        Date date4 = date2;
        if ((i & 16) != 0) {
            str3 = oAuthToken.idToken;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            list = oAuthToken.scopes;
        }
        return oAuthToken.onWarmupCompleted(str, date3, str4, date4, str5, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthToken)) {
            return false;
        }
        OAuthToken oAuthToken = (OAuthToken) obj;
        return Intrinsics.areEqual(this.accessToken, oAuthToken.accessToken) && Intrinsics.areEqual(this.accessTokenExpiresAt, oAuthToken.accessTokenExpiresAt) && Intrinsics.areEqual(this.refreshToken, oAuthToken.refreshToken) && Intrinsics.areEqual(this.refreshTokenExpiresAt, oAuthToken.refreshTokenExpiresAt) && Intrinsics.areEqual(this.idToken, oAuthToken.idToken) && Intrinsics.areEqual(this.scopes, oAuthToken.scopes);
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode();
        int iHashCode2 = this.accessTokenExpiresAt.hashCode();
        int iHashCode3 = this.refreshToken.hashCode();
        int iHashCode4 = this.refreshTokenExpiresAt.hashCode();
        String str = this.idToken;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        List<String> list = this.scopes;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final OAuthToken onWarmupCompleted(@NotNull String str, @NotNull Date date, @NotNull String str2, @NotNull Date date2, @Nullable String str3, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(date2, "");
        return new OAuthToken(str, date, str2, date2, str3, list);
    }

    public String toString() {
        return "OAuthToken(accessToken=" + this.accessToken + ", accessTokenExpiresAt=" + this.accessTokenExpiresAt + ", refreshToken=" + this.refreshToken + ", refreshTokenExpiresAt=" + this.refreshTokenExpiresAt + ", idToken=" + this.idToken + ", scopes=" + this.scopes + ")";
    }

    @Deprecated
    public /* synthetic */ OAuthToken(int i, @nc(IAuthTabCallback = "access_token") String str, @nc(IAuthTabCallback = "access_token_expires_at") Date date, @nc(IAuthTabCallback = "refresh_token") String str2, @nc(IAuthTabCallback = "refresh_token_expires_at") Date date2, @nc(IAuthTabCallback = "id_token") String str3, List list, okycx okycxVar) {
        if (15 != (i & 15)) {
            htf31.onExtraCallbackWithResult(i, 15, OAuthToken$.serializer.INSTANCE.getDescriptor());
        }
        this.accessToken = str;
        this.accessTokenExpiresAt = date;
        this.refreshToken = str2;
        this.refreshTokenExpiresAt = date2;
        if ((i & 16) == 0) {
            this.idToken = null;
        } else {
            this.idToken = str3;
        }
        if ((i & 32) == 0) {
            this.scopes = null;
        } else {
            this.scopes = list;
        }
    }

    public OAuthToken(@NotNull String str, @NotNull Date date, @NotNull String str2, @NotNull Date date2, @Nullable String str3, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(date2, "");
        this.accessToken = str;
        this.accessTokenExpiresAt = date;
        this.refreshToken = str2;
        this.refreshTokenExpiresAt = date2;
        this.idToken = str3;
        this.scopes = list;
    }

    @JvmStatic
    public static final void onNavigationEvent(@NotNull OAuthToken oAuthToken, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(oAuthToken, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vylVar.onExtraCallback(serialDescriptor, 0, oAuthToken.accessToken);
        vylVar.onNavigationEvent(serialDescriptor, 1, new ff(Reflection.getOrCreateKotlinClass(Date.class), (KSerializer) null, new KSerializer[0]), oAuthToken.accessTokenExpiresAt);
        vylVar.onExtraCallback(serialDescriptor, 2, oAuthToken.refreshToken);
        vylVar.onNavigationEvent(serialDescriptor, 3, new ff(Reflection.getOrCreateKotlinClass(Date.class), (KSerializer) null, new KSerializer[0]), oAuthToken.refreshTokenExpiresAt);
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || oAuthToken.idToken != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, oAuthToken.idToken);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || oAuthToken.scopes != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent), oAuthToken.scopes);
        }
    }

    public /* synthetic */ OAuthToken(String str, Date date, String str2, Date date2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, date2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : list);
    }

    public final String onWarmupCompleted() {
        return this.accessToken;
    }

    public final String onNavigationEvent() {
        return this.refreshToken;
    }

    public final Date onExtraCallback() {
        return this.refreshTokenExpiresAt;
    }

    public final List<String> onExtraCallbackWithResult() {
        return this.scopes;
    }
}
