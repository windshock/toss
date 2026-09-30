package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReadableMapBuffer {

    @SerializedName("serviceTermsGroupTitle")
    private String IAuthTabCallback;

    @SerializedName("title")
    private final String IAuthTabCallbackDefault;

    @SerializedName("termsId")
    private final long asBinder;

    @SerializedName("contentUrl")
    private final String onExtraCallback;

    @SerializedName("isChecked")
    private boolean onExtraCallbackWithResult;

    @SerializedName("optional")
    private final boolean onNavigationEvent;

    @SerializedName("serviceTermsGroupId")
    private Long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ReadableMapBuffer readableMapBuffer = (ReadableMapBuffer) obj;
        return this.asBinder == readableMapBuffer.asBinder && Intrinsics.areEqual(this.IAuthTabCallbackDefault, readableMapBuffer.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.onExtraCallback, readableMapBuffer.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, readableMapBuffer.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, readableMapBuffer.IAuthTabCallback) && this.onNavigationEvent == readableMapBuffer.onNavigationEvent && this.onExtraCallbackWithResult == readableMapBuffer.onExtraCallbackWithResult;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.asBinder);
        int iHashCode2 = this.IAuthTabCallbackDefault.hashCode();
        String str = this.onExtraCallback;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Long l = this.onWarmupCompleted;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str2 = this.IAuthTabCallback;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return "TeensServiceAgreementTerm(termsId=" + this.asBinder + ", title=" + this.IAuthTabCallbackDefault + ", contentUrl=" + this.onExtraCallback + ", serviceTermsGroupId=" + this.onWarmupCompleted + ", serviceTermsGroupTitle=" + this.IAuthTabCallback + ", optional=" + this.onNavigationEvent + ", isChecked=" + this.onExtraCallbackWithResult + ")";
    }
}
