package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<T> {

    @SerializedName("timestamp")
    private String a;

    @SerializedName("uniqueCode")
    private String b;

    @SerializedName("code")
    private String c;

    @SerializedName("additionalCode")
    private String d;

    @SerializedName("message")
    private String e;

    @SerializedName("path")
    private String f;

    @SerializedName(TtmlNode.TAG_DATA)
    private T g;

    public final String IAuthTabCallback() {
        return this.d;
    }

    public final String asBinder() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1)) {
            return false;
        }
        TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 = (TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) obj;
        return Intrinsics.areEqual(this.a, twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.a) && Intrinsics.areEqual(this.b, twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.b) && Intrinsics.areEqual(this.c, twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.c) && Intrinsics.areEqual(this.d, twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.d) && Intrinsics.areEqual(this.e, twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.e) && Intrinsics.areEqual(this.f, twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.f) && Intrinsics.areEqual(this.g, twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.g);
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode();
        int iHashCode2 = this.b.hashCode();
        int iHashCode3 = this.c.hashCode();
        String str = this.d;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.e.hashCode();
        int iHashCode6 = this.f.hashCode();
        T t = this.g;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (t != null ? t.hashCode() : 0);
    }

    public final String onExtraCallback() {
        return this.a;
    }

    public final String onExtraCallbackWithResult() {
        return this.c;
    }

    public final String onNavigationEvent() {
        return this.e;
    }

    public final T onWarmupCompleted() {
        return this.g;
    }

    public String toString() {
        return "APIResult(timestamp=" + this.a + ", uniqueCode=" + this.b + ", code=" + this.c + ", additionalCode=" + this.d + ", message=" + this.e + ", path=" + this.f + ", data=" + this.g + ')';
    }
}
