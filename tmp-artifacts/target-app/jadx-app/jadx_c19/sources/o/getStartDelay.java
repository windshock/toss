package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getStartDelay {

    @SerializedName("id_LSAM_CENTER")
    private String a;

    @SerializedName("id_LSAM")
    private String b;

    @SerializedName("nt_LSAM")
    private String c;

    @SerializedName("sign2")
    private String d;

    @SerializedName("card_ST_CODE")
    private String e;

    @SerializedName("resp_CODE")
    private String f;

    @SerializedName("req_UUID")
    private String g;

    public final String IAuthTabCallback() {
        return this.e;
    }

    public final String IAuthTabCallbackDefault() {
        return this.d;
    }

    public final String IAuthTabCallbackStub() {
        return this.f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStartDelay)) {
            return false;
        }
        getStartDelay getstartdelay = (getStartDelay) obj;
        return Intrinsics.areEqual(this.a, getstartdelay.a) && Intrinsics.areEqual(this.b, getstartdelay.b) && Intrinsics.areEqual(this.c, getstartdelay.c) && Intrinsics.areEqual(this.d, getstartdelay.d) && Intrinsics.areEqual(this.e, getstartdelay.e) && Intrinsics.areEqual(this.f, getstartdelay.f) && Intrinsics.areEqual(this.g, getstartdelay.g);
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String onExtraCallback() {
        return this.b;
    }

    public final String onExtraCallbackWithResult() {
        return this.a;
    }

    public final String onNavigationEvent() {
        return this.c;
    }

    public final String onWarmupCompleted() {
        return this.g;
    }

    public String toString() {
        return "KorailDebitLsamResponse(ID_LSAM_CENTER=" + this.a + ", ID_LSAM=" + this.b + ", NT_LSAM=" + this.c + ", SIGN2=" + this.d + ", card_ST_CODE=" + this.e + ", resp_CODE=" + this.f + ", req_UUID=" + this.g + ')';
    }
}
