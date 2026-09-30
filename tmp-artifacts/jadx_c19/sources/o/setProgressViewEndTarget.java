package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setProgressViewEndTarget {
    public static final onNavigationEvent onNavigationEvent = new onNavigationEvent(null);
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onTransact;
    private final String onWarmupCompleted;

    public static final class onNavigationEvent {
        private onNavigationEvent() {
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setProgressViewEndTarget onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String strSubstring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = str.substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            String strSubstring3 = str.substring(4, 12);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            String strSubstring4 = str.substring(12, 20);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
            String strSubstring5 = str.substring(20, 28);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
            String strSubstring6 = str.substring(28, 30);
            Intrinsics.checkNotNullExpressionValue(strSubstring6, "");
            String strSubstring7 = str.substring(30, 46);
            Intrinsics.checkNotNullExpressionValue(strSubstring7, "");
            String strSubstring8 = str.substring(46, 54);
            Intrinsics.checkNotNullExpressionValue(strSubstring8, "");
            return new setProgressViewEndTarget(strSubstring, strSubstring2, strSubstring3, strSubstring4, strSubstring5, strSubstring6, strSubstring7, strSubstring8);
        }
    }

    public setProgressViewEndTarget(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.onExtraCallbackWithResult = str;
        this.onExtraCallback = str2;
        this.IAuthTabCallback = str3;
        this.onWarmupCompleted = str4;
        this.onTransact = str5;
        this.IAuthTabCallbackDefault = str6;
        this.asBinder = str7;
        this.asInterface = str8;
    }

    public final String IAuthTabCallback() {
        return this.onTransact;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setProgressViewEndTarget)) {
            return false;
        }
        setProgressViewEndTarget setprogressviewendtarget = (setProgressViewEndTarget) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, setprogressviewendtarget.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, setprogressviewendtarget.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallback, setprogressviewendtarget.IAuthTabCallback) && Intrinsics.areEqual(this.onWarmupCompleted, setprogressviewendtarget.onWarmupCompleted) && Intrinsics.areEqual(this.onTransact, setprogressviewendtarget.onTransact) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, setprogressviewendtarget.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.asBinder, setprogressviewendtarget.asBinder) && Intrinsics.areEqual(this.asInterface, setprogressviewendtarget.asInterface);
    }

    public int hashCode() {
        return (((((((((((((this.onExtraCallbackWithResult.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.asInterface.hashCode();
    }

    public final String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final String onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return "KorailEpTradeLog(TRT=" + this.onExtraCallbackWithResult + ", LEN=" + this.onExtraCallback + ", BAL_EP=" + this.IAuthTabCallback + ", NT_EP=" + this.onWarmupCompleted + ", M=" + this.onTransact + ", ID_SAM_CENTER=" + this.IAuthTabCallbackDefault + ", ID_SAM=" + this.asBinder + ", NT_SAM=" + this.asInterface + ')';
    }
}
