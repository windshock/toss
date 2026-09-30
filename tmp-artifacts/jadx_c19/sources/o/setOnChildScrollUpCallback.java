package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setOnChildScrollUpCallback {

    @SerializedName("SIGN3")
    private final String IAuthTabCallback;

    @SerializedName("tradeUid")
    private final String asBinder;

    @SerializedName("respCode")
    private final String asInterface;

    @SerializedName("ID_EP")
    private final String onExtraCallback;

    @SerializedName("NT_EP")
    private final String onExtraCallbackWithResult;

    @SerializedName("cardStCode")
    private final String onNavigationEvent;

    @SerializedName("R_EP")
    private final String onWarmupCompleted;

    public setOnChildScrollUpCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.onWarmupCompleted = str3;
        this.IAuthTabCallback = str4;
        this.onNavigationEvent = str5;
        this.asInterface = str6;
        this.asBinder = str7;
    }

    public final String IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public final String IAuthTabCallbackStub() {
        return this.IAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnChildScrollUpCallback)) {
            return false;
        }
        setOnChildScrollUpCallback setonchildscrollupcallback = (setOnChildScrollUpCallback) obj;
        return Intrinsics.areEqual(this.onExtraCallback, setonchildscrollupcallback.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, setonchildscrollupcallback.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onWarmupCompleted, setonchildscrollupcallback.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, setonchildscrollupcallback.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, setonchildscrollupcallback.onNavigationEvent) && Intrinsics.areEqual(this.asInterface, setonchildscrollupcallback.asInterface) && Intrinsics.areEqual(this.asBinder, setonchildscrollupcallback.asBinder);
    }

    public int hashCode() {
        return (((((((((((this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.asBinder.hashCode();
    }

    public final String onExtraCallback() {
        return this.asInterface;
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final String onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final String onTransact() {
        return this.asBinder;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return "ConfirmLSAMRequest(ID_EP=" + this.onExtraCallback + ", NT_EP=" + this.onExtraCallbackWithResult + ", R_EP=" + this.onWarmupCompleted + ", SIGN3=" + this.IAuthTabCallback + ", cardStCode=" + this.onNavigationEvent + ", respCode=" + this.asInterface + ", tradeUid=" + this.asBinder + ')';
    }
}
