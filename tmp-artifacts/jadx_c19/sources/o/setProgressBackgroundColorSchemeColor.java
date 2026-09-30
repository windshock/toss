package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setProgressBackgroundColorSchemeColor {

    @SerializedName("BAL_EP")
    private final String IAuthTabCallback;

    @SerializedName("NT_EP")
    private final String IAuthTabCallbackDefault;

    @SerializedName("VK_EP")
    private final String IAuthTabCallbackStub;

    @SerializedName("franchiseDivCode")
    private final String IAuthTabCallbackStubProxy;

    @SerializedName("payType")
    private final String access000;

    @SerializedName("serviceCode")
    private final String access100;

    @SerializedName("SIGN1")
    private final String asBinder;

    @SerializedName("R_EP")
    private final String asInterface;

    @SerializedName("franchiseId")
    private final String getInterfaceDescriptor;

    @SerializedName("ID_CENTER")
    private final String onExtraCallback;

    @SerializedName("ALG_EP")
    private final String onExtraCallbackWithResult;

    @SerializedName("M_LDA")
    private final String onNavigationEvent;

    @SerializedName("cardType")
    private final String onTransact;

    @SerializedName("ID_EP")
    private final String onWarmupCompleted;

    public setProgressBackgroundColorSchemeColor(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = str2;
        this.onExtraCallback = str3;
        this.onWarmupCompleted = str4;
        this.onNavigationEvent = str5;
        this.IAuthTabCallbackDefault = str6;
        this.asInterface = str7;
        this.asBinder = str8;
        this.IAuthTabCallbackStub = str9;
        this.onTransact = str10;
        this.IAuthTabCallbackStubProxy = str11;
        this.getInterfaceDescriptor = str12;
        this.access000 = str13;
        this.access100 = str14;
    }

    public final String IAuthTabCallback() {
        return this.getInterfaceDescriptor;
    }

    public final String IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    public final String IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    public final String IAuthTabCallbackStubProxy() {
        return this.IAuthTabCallbackStub;
    }

    public final String access000() {
        return this.asBinder;
    }

    public final String access100() {
        return this.asInterface;
    }

    public final String asBinder() {
        return this.access000;
    }

    public final String asInterface() {
        return this.IAuthTabCallbackDefault;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setProgressBackgroundColorSchemeColor)) {
            return false;
        }
        setProgressBackgroundColorSchemeColor setprogressbackgroundcolorschemecolor = (setProgressBackgroundColorSchemeColor) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, setprogressbackgroundcolorschemecolor.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, setprogressbackgroundcolorschemecolor.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, setprogressbackgroundcolorschemecolor.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, setprogressbackgroundcolorschemecolor.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, setprogressbackgroundcolorschemecolor.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, setprogressbackgroundcolorschemecolor.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.asInterface, setprogressbackgroundcolorschemecolor.asInterface) && Intrinsics.areEqual(this.asBinder, setprogressbackgroundcolorschemecolor.asBinder) && Intrinsics.areEqual(this.IAuthTabCallbackStub, setprogressbackgroundcolorschemecolor.IAuthTabCallbackStub) && Intrinsics.areEqual(this.onTransact, setprogressbackgroundcolorschemecolor.onTransact) && Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, setprogressbackgroundcolorschemecolor.IAuthTabCallbackStubProxy) && Intrinsics.areEqual(this.getInterfaceDescriptor, setprogressbackgroundcolorschemecolor.getInterfaceDescriptor) && Intrinsics.areEqual(this.access000, setprogressbackgroundcolorschemecolor.access000) && Intrinsics.areEqual(this.access100, setprogressbackgroundcolorschemecolor.access100);
    }

    public final String getInterfaceDescriptor() {
        return this.access100;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.onExtraCallbackWithResult.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.IAuthTabCallbackStubProxy.hashCode()) * 31) + this.getInterfaceDescriptor.hashCode()) * 31) + this.access000.hashCode()) * 31) + this.access100.hashCode();
    }

    public final String onExtraCallback() {
        return this.onTransact;
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onTransact() {
        return this.onWarmupCompleted;
    }

    public final String onWarmupCompleted() {
        return this.IAuthTabCallbackStubProxy;
    }

    public String toString() {
        return "DebitLSAMRequest(ALG_EP=" + this.onExtraCallbackWithResult + ", BAL_EP=" + this.IAuthTabCallback + ", ID_CENTER=" + this.onExtraCallback + ", ID_EP=" + this.onWarmupCompleted + ", M_LDA=" + this.onNavigationEvent + ", NT_EP=" + this.IAuthTabCallbackDefault + ", R_EP=" + this.asInterface + ", SIGN1=" + this.asBinder + ", VK_EP=" + this.IAuthTabCallbackStub + ", cardType=" + this.onTransact + ", franchiseDivCode=" + this.IAuthTabCallbackStubProxy + ", franchiseId=" + this.getInterfaceDescriptor + ", payType=" + this.access000 + ", serviceCode=" + this.access100 + ')';
    }
}
