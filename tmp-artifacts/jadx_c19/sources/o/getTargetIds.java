package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getTargetIds {
    public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent(null);
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final String onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    public static final class onNavigationEvent {
        private onNavigationEvent() {
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final getTargetIds onExtraCallbackWithResult(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String strSubstring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = str.substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            String strSubstring3 = str.substring(4, 12);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            String strSubstring4 = str.substring(12, 14);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
            String strSubstring5 = str.substring(14, 30);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
            String strSubstring6 = str.substring(30, 38);
            Intrinsics.checkNotNullExpressionValue(strSubstring6, "");
            String strSubstring7 = str.substring(38, 54);
            Intrinsics.checkNotNullExpressionValue(strSubstring7, "");
            String strSubstring8 = str.substring(54, 62);
            Intrinsics.checkNotNullExpressionValue(strSubstring8, "");
            return new getTargetIds(strSubstring, strSubstring2, strSubstring3, strSubstring4, strSubstring5, strSubstring6, strSubstring7, strSubstring8);
        }
    }

    public getTargetIds(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.onNavigationEvent = str;
        this.IAuthTabCallback = str2;
        this.onExtraCallback = str3;
        this.onWarmupCompleted = str4;
        this.asBinder = str5;
        this.IAuthTabCallbackDefault = str6;
        this.onTransact = str7;
        this.asInterface = str8;
    }

    public final String IAuthTabCallback() {
        return this.IAuthTabCallbackDefault;
    }

    public final String IAuthTabCallbackDefault() {
        return this.asInterface;
    }

    public final String IAuthTabCallbackStub() {
        return this.onTransact;
    }

    public final String asBinder() {
        return this.IAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTargetIds)) {
            return false;
        }
        getTargetIds gettargetids = (getTargetIds) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, gettargetids.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, gettargetids.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, gettargetids.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, gettargetids.onWarmupCompleted) && Intrinsics.areEqual(this.asBinder, gettargetids.asBinder) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, gettargetids.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.onTransact, gettargetids.onTransact) && Intrinsics.areEqual(this.asInterface, gettargetids.asInterface);
    }

    public int hashCode() {
        return (((((((((((((this.onNavigationEvent.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.asInterface.hashCode();
    }

    public final String onExtraCallback() {
        return this.asBinder;
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final String onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "KorailInitializeEpResponse(ALG_EP=" + this.onNavigationEvent + ", VK_EP=" + this.IAuthTabCallback + ", BAL_EP=" + this.onExtraCallback + ", ID_CENTER=" + this.onWarmupCompleted + ", ID_EP=" + this.asBinder + ", NT_EP=" + this.IAuthTabCallbackDefault + ", R_EP=" + this.onTransact + ", SIGN1=" + this.asInterface + ')';
    }
}
