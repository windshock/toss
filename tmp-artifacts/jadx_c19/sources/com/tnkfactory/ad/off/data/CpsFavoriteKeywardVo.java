package com.tnkfactory.ad.off.data;

import com.tnkfactory.ad.a.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CpsFavoriteKeywardVo {
    public final int a;
    public final String b;
    public final int c;

    public CpsFavoriteKeywardVo() {
        this(0, null, 0, 7, null);
    }

    public static /* synthetic */ CpsFavoriteKeywardVo copy$default(CpsFavoriteKeywardVo cpsFavoriteKeywardVo, int i2, String str, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = cpsFavoriteKeywardVo.a;
        }
        if ((i4 & 2) != 0) {
            str = cpsFavoriteKeywardVo.b;
        }
        if ((i4 & 4) != 0) {
            i3 = cpsFavoriteKeywardVo.c;
        }
        return cpsFavoriteKeywardVo.copy(i2, str, i3);
    }

    public final int component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final CpsFavoriteKeywardVo copy(int i2, @NotNull String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CpsFavoriteKeywardVo(i2, str, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpsFavoriteKeywardVo)) {
            return false;
        }
        CpsFavoriteKeywardVo cpsFavoriteKeywardVo = (CpsFavoriteKeywardVo) obj;
        return this.a == cpsFavoriteKeywardVo.a && Intrinsics.areEqual(this.b, cpsFavoriteKeywardVo.b) && this.c == cpsFavoriteKeywardVo.c;
    }

    public final String getKeyword() {
        return this.b;
    }

    public final int getLabel() {
        return this.c;
    }

    public final int getRank() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.c) + b0.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public String toString() {
        return "CpsFavoriteKeywardVo(rank=" + this.a + ", keyword=" + this.b + ", label=" + this.c + ")";
    }

    public CpsFavoriteKeywardVo(int i2, @NotNull String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.a = i2;
        this.b = str;
        this.c = i3;
    }

    public /* synthetic */ CpsFavoriteKeywardVo(int i2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i3);
    }
}
