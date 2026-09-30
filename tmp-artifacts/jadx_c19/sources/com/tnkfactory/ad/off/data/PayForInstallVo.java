package com.tnkfactory.ad.off.data;

import com.tnkfactory.ad.a.a0;
import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PayForInstallVo {
    public final long a;
    public final int b;
    public final String c;
    public final long d;
    public final int e;

    public PayForInstallVo() {
        this(0L, 0, null, 0L, 0, 31, null);
    }

    public final long component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final long component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final PayForInstallVo copy(long j, int i2, @NotNull String str, long j2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PayForInstallVo(j, i2, str, j2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayForInstallVo)) {
            return false;
        }
        PayForInstallVo payForInstallVo = (PayForInstallVo) obj;
        return this.a == payForInstallVo.a && this.b == payForInstallVo.b && Intrinsics.areEqual(this.c, payForInstallVo.c) && this.d == payForInstallVo.d && this.e == payForInstallVo.e;
    }

    public final int getActn_id() {
        return this.b;
    }

    public final long getAdv_app_id() {
        return this.d;
    }

    public final long getPay_pnt() {
        return this.a;
    }

    public final String getPay_yn() {
        return this.c;
    }

    public final int getRet_cd() {
        return this.e;
    }

    public int hashCode() {
        return Integer.hashCode(this.e) + a0.a(this.d, b0.a(this.c, z.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public String toString() {
        return "PayForInstallVo(pay_pnt=" + this.a + ", actn_id=" + this.b + ", pay_yn=" + this.c + ", adv_app_id=" + this.d + ", ret_cd=" + this.e + ")";
    }

    public PayForInstallVo(long j, int i2, @NotNull String str, long j2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.a = j;
        this.b = i2;
        this.c = str;
        this.d = j2;
        this.e = i3;
    }

    public /* synthetic */ PayForInstallVo(long j, int i2, String str, long j2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) == 0 ? j2 : 0L, (i4 & 16) != 0 ? 0 : i3);
    }
}
