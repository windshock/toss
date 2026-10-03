package o;

import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.ApiServerError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class didScheduleMountItems extends BaseApiResponse<onExtraCallback> {
    public static final onNavigationEvent Companion;
    public static final String ERROR_CODE_DELAYED_TRANSFER = "4100";
    public static final String ERROR_CODE_NOT_FOUND = "1026";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = onExtraCallback + 23;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface();
            throw null;
        }
        ApiServerError apiServerErrorAsInterface = asInterface();
        boolean zAreEqual = Intrinsics.areEqual(apiServerErrorAsInterface != null ? apiServerErrorAsInterface.onExtraCallbackWithResult() : null, ERROR_CODE_DELAYED_TRANSFER);
        int i3 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return zAreEqual;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @SerializedName("isVirtualAccount")
        private final boolean isVirtualAccount;

        @SerializedName("memberPhone")
        private final String memberPhone;

        @SerializedName("name")
        private final String name;

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.name;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
