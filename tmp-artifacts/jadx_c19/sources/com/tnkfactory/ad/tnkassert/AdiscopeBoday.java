package com.tnkfactory.ad.tnkassert;

import com.tnkfactory.ad.a.b0;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdiscopeBoday {
    public long a;
    public String b;
    public ArrayList c;

    public AdiscopeBoday() {
        this(0L, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdiscopeBoday copy$default(AdiscopeBoday adiscopeBoday, long j, String str, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = adiscopeBoday.a;
        }
        if ((i2 & 2) != 0) {
            str = adiscopeBoday.b;
        }
        if ((i2 & 4) != 0) {
            arrayList = adiscopeBoday.c;
        }
        return adiscopeBoday.copy(j, str, arrayList);
    }

    public final long component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final ArrayList<AssertData> component3() {
        return this.c;
    }

    public final AdiscopeBoday copy(long j, @NotNull String str, @NotNull ArrayList<AssertData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new AdiscopeBoday(j, str, arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdiscopeBoday)) {
            return false;
        }
        AdiscopeBoday adiscopeBoday = (AdiscopeBoday) obj;
        return this.a == adiscopeBoday.a && Intrinsics.areEqual(this.b, adiscopeBoday.b) && Intrinsics.areEqual(this.c, adiscopeBoday.c);
    }

    public final long getClientTime() {
        return this.a;
    }

    public final ArrayList<AssertData> getDatas() {
        return this.c;
    }

    public final String getMediaId() {
        return this.b;
    }

    public int hashCode() {
        return this.c.hashCode() + b0.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final void setClientTime(long j) {
        this.a = j;
    }

    public final void setDatas(@NotNull ArrayList<AssertData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.c = arrayList;
    }

    public final void setMediaId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.b = str;
    }

    public String toString() {
        return "AdiscopeBoday(clientTime=" + this.a + ", mediaId=" + this.b + ", datas=" + this.c + ")";
    }

    public AdiscopeBoday(long j, @NotNull String str, @NotNull ArrayList<AssertData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.a = j;
        this.b = str;
        this.c = arrayList;
    }

    public /* synthetic */ AdiscopeBoday(long j, String str, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
