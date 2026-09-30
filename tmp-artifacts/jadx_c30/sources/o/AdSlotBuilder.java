package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AdSlotBuilder {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);

    @SerializedName("idCenter")
    private final String IAuthTabCallback;

    @SerializedName("vkEp")
    private final String IAuthTabCallbackDefault;

    @SerializedName("sign1")
    private final String IAuthTabCallbackStub;

    @SerializedName("algEp")
    private final String onExtraCallback;

    @SerializedName("balEp")
    private final String onExtraCallbackWithResult;

    @SerializedName("idEp")
    private final String onNavigationEvent;

    @SerializedName("ntEp")
    private final String onWarmupCompleted;

    public static final class IAuthTabCallback {
        private IAuthTabCallback() {
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AdSlotBuilder onExtraCallback(String str) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            String strSubstring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
            String strSubstring2 = str.substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, BuildConfig.FLAVOR);
            String strSubstring3 = str.substring(4, 12);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, BuildConfig.FLAVOR);
            String strSubstring4 = str.substring(12, 14);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, BuildConfig.FLAVOR);
            String strSubstring5 = str.substring(14, 30);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, BuildConfig.FLAVOR);
            String strSubstring6 = str.substring(30, 38);
            Intrinsics.checkNotNullExpressionValue(strSubstring6, BuildConfig.FLAVOR);
            String strSubstring7 = str.substring(38, 46);
            Intrinsics.checkNotNullExpressionValue(strSubstring7, BuildConfig.FLAVOR);
            return new AdSlotBuilder(strSubstring, strSubstring3, strSubstring4, strSubstring5, strSubstring6, strSubstring7, strSubstring2);
        }
    }

    public AdSlotBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str6, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str7, BuildConfig.FLAVOR);
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.IAuthTabCallback = str3;
        this.onNavigationEvent = str4;
        this.onWarmupCompleted = str5;
        this.IAuthTabCallbackStub = str6;
        this.IAuthTabCallbackDefault = str7;
    }

    public final String IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public final String asBinder() {
        return this.IAuthTabCallbackDefault;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSlotBuilder)) {
            return false;
        }
        AdSlotBuilder adSlotBuilder = (AdSlotBuilder) obj;
        return Intrinsics.areEqual(this.onExtraCallback, adSlotBuilder.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, adSlotBuilder.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, adSlotBuilder.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, adSlotBuilder.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, adSlotBuilder.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallbackStub, adSlotBuilder.IAuthTabCallbackStub) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, adSlotBuilder.IAuthTabCallbackDefault);
    }

    public int hashCode() {
        return this.IAuthTabCallbackDefault.hashCode() + getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.IAuthTabCallbackStub, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.onWarmupCompleted, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.onNavigationEvent, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.IAuthTabCallback, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.onExtraCallbackWithResult, this.onExtraCallback.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String onExtraCallback() {
        return this.onExtraCallback;
    }

    public final String onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final String onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final String onTransact() {
        return this.IAuthTabCallbackStub;
    }

    public final String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "InitializeCardResponse(algEp=" + this.onExtraCallback + ", balEp=" + this.onExtraCallbackWithResult + ", idCenter=" + this.IAuthTabCallback + ", idEp=" + this.onNavigationEvent + ", ntEp=" + this.onWarmupCompleted + ", sign1=" + this.IAuthTabCallbackStub + ", vkEp=" + this.IAuthTabCallbackDefault + ')';
    }
}
