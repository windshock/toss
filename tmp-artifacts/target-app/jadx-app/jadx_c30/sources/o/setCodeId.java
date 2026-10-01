package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setCodeId {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);

    @SerializedName("idEp")
    private final String IAuthTabCallback;

    @SerializedName("statusWord")
    private final String IAuthTabCallbackDefault;

    @SerializedName("pvNew")
    private final String IAuthTabCallbackStub;

    @SerializedName("par")
    private final String asBinder;

    @SerializedName("pvOld")
    private final String asInterface;

    @SerializedName("idSamCenter")
    private final String onExtraCallback;

    @SerializedName("ntEp")
    private final String onExtraCallbackWithResult;

    @SerializedName("idSam")
    private final String onNavigationEvent;

    @SerializedName("trt")
    private final String onTransact;

    @SerializedName("idCenter")
    private final String onWarmupCompleted;

    public static final class onWarmupCompleted {
        private onWarmupCompleted() {
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCodeId)) {
            return false;
        }
        setCodeId setcodeid = (setCodeId) obj;
        return Intrinsics.areEqual(this.onTransact, setcodeid.onTransact) && Intrinsics.areEqual(this.onWarmupCompleted, setcodeid.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, setcodeid.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, setcodeid.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, setcodeid.onExtraCallback) && Intrinsics.areEqual(this.onNavigationEvent, setcodeid.onNavigationEvent) && Intrinsics.areEqual(this.asBinder, setcodeid.asBinder) && Intrinsics.areEqual(this.asInterface, setcodeid.asInterface) && Intrinsics.areEqual(this.IAuthTabCallbackStub, setcodeid.IAuthTabCallbackStub) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, setcodeid.IAuthTabCallbackDefault);
    }

    public int hashCode() {
        return this.IAuthTabCallbackDefault.hashCode() + getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.IAuthTabCallbackStub, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.asInterface, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.asBinder, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.onNavigationEvent, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.onExtraCallback, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.onExtraCallbackWithResult, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.IAuthTabCallback, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.onWarmupCompleted, this.onTransact.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "KorailUpdateParameterResponse(trt=" + this.onTransact + ", idCenter=" + this.onWarmupCompleted + ", idEp=" + this.IAuthTabCallback + ", ntEp=" + this.onExtraCallbackWithResult + ", idSamCenter=" + this.onExtraCallback + ", idSam=" + this.onNavigationEvent + ", par=" + this.asBinder + ", pvOld=" + this.asInterface + ", pvNew=" + this.IAuthTabCallbackStub + ", statusWord=" + this.IAuthTabCallbackDefault + ')';
    }
}
