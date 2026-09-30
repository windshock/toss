package com.tnkfactory.ad.off.data;

import com.tnkfactory.ad.a.a0;
import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PayForAttendVo {
    public final long a;
    public final int b;
    public final String c;
    public final int d;
    public final long e;
    public final int f;

    public PayForAttendVo() {
        this(0L, 0, null, 0, 0L, 0, 63, null);
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

    public final int component4() {
        return this.d;
    }

    public final long component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final PayForAttendVo copy(long j, int i2, @NotNull String str, int i3, long j2, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PayForAttendVo(j, i2, str, i3, j2, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayForAttendVo)) {
            return false;
        }
        PayForAttendVo payForAttendVo = (PayForAttendVo) obj;
        return this.a == payForAttendVo.a && this.b == payForAttendVo.b && Intrinsics.areEqual(this.c, payForAttendVo.c) && this.d == payForAttendVo.d && this.e == payForAttendVo.e && this.f == payForAttendVo.f;
    }

    public final int getActn_id() {
        return this.b;
    }

    public final long getAdv_app_id() {
        return this.e;
    }

    public final int getLeft_hour() {
        return this.d;
    }

    public final long getPay_pnt() {
        return this.a;
    }

    public final String getPay_yn() {
        return this.c;
    }

    public final int getRet_cd() {
        return this.f;
    }

    public int hashCode() {
        return Integer.hashCode(this.f) + a0.a(this.e, z.a(this.d, b0.a(this.c, z.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        return "PayForAttendVo(pay_pnt=" + this.a + ", actn_id=" + this.b + ", pay_yn=" + this.c + ", left_hour=" + this.d + ", adv_app_id=" + this.e + ", ret_cd=" + this.f + ")";
    }

    public PayForAttendVo(long j, int i2, @NotNull String str, int i3, long j2, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.a = j;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = j2;
        this.f = i4;
    }

    public /* synthetic */ PayForAttendVo(long j, int i2, String str, int i3, long j2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) == 0 ? j2 : 0L, (i5 & 32) == 0 ? i4 : 0);
    }
}
