package com.kakao.sdk.user.model;

import com.kakao.sdk.user.model.AccessTokenInfo$;
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
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AccessTokenInfo {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private final int appId;
    private final long expiresIn;
    private final Long expiresInMillis;
    private final Long id;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessTokenInfo)) {
            return false;
        }
        AccessTokenInfo accessTokenInfo = (AccessTokenInfo) obj;
        return Intrinsics.areEqual(this.id, accessTokenInfo.id) && this.expiresIn == accessTokenInfo.expiresIn && this.appId == accessTokenInfo.appId && Intrinsics.areEqual(this.expiresInMillis, accessTokenInfo.expiresInMillis);
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = Long.hashCode(this.expiresIn);
        int iHashCode3 = Integer.hashCode(this.appId);
        Long l2 = this.expiresInMillis;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "AccessTokenInfo(id=" + this.id + ", expiresIn=" + this.expiresIn + ", appId=" + this.appId + ", expiresInMillis=" + this.expiresInMillis + ")";
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final KSerializer<AccessTokenInfo> serializer() {
            return AccessTokenInfo$.serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ AccessTokenInfo(int i2, Long l, @nc(IAuthTabCallback = "expires_in") long j, @nc(IAuthTabCallback = "app_id") int i3, @Deprecated @nc(IAuthTabCallback = "expiresInMillis") Long l2, okycx okycxVar) {
        if (15 != (i2 & 15)) {
            htf31.onExtraCallbackWithResult(i2, 15, AccessTokenInfo$.serializer.INSTANCE.getDescriptor());
        }
        this.id = l;
        this.expiresIn = j;
        this.appId = i3;
        this.expiresInMillis = l2;
    }

    @JvmStatic
    public static final void IAuthTabCallback(@NotNull AccessTokenInfo accessTokenInfo, @NotNull vyl vylVar, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(accessTokenInfo, "");
        Intrinsics.checkNotNullParameter(vylVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        oty1 oty1Var = oty1.onExtraCallback;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, accessTokenInfo.id);
        vylVar.onExtraCallback(serialDescriptor, 1, accessTokenInfo.expiresIn);
        vylVar.onExtraCallback(serialDescriptor, 2, accessTokenInfo.appId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1Var, accessTokenInfo.expiresInMillis);
    }
}
