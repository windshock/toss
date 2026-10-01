package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class sendBroadcastSyncWithPendingBroadcasts {
    public static final sendBroadcastSyncWithPendingBroadcasts IAuthTabCallback = new sendBroadcastSyncWithPendingBroadcasts();
    private static final String IAuthTabCallbackDefault;
    private static final onExtraCallback IAuthTabCallbackStub;
    private static final onExtraCallback IAuthTabCallbackStubProxy;
    private static final onExtraCallback IAuthTabCallback_Parcel;
    private static final String ICustomTabsCallback;
    private static final String access000;
    private static final onExtraCallback access100;
    private static final String asBinder;
    private static final String asInterface;
    private static int extraCallback = 1;
    private static final onExtraCallback extraCallbackWithResult;
    private static final String getInterfaceDescriptor;
    private static final onExtraCallback onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static int onMinimized = 0;
    private static final String onNavigationEvent;
    private static int onPostMessage = 1;
    private static final String onTransact;
    private static final onExtraCallback onWarmupCompleted;
    private static final String readTypedObject;
    private static int writeTypedObject;

    private sendBroadcastSyncWithPendingBroadcasts() {
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final String onWarmupCompleted;

        public onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        public final String onNavigationEvent(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String str2 = this.onWarmupCompleted + "_" + str;
            int i2 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str2;
        }
    }

    static {
        onExtraCallback onextracallback = new onExtraCallback("tossMember");
        IAuthTabCallbackStubProxy = onextracallback;
        IAuthTabCallbackDefault = onextracallback.onNavigationEvent("find_toss_member_agreement_yes");
        onTransact = onextracallback.onNavigationEvent("find_toss_member_agreement_no");
        onExtraCallback onextracallback2 = new onExtraCallback("bank_account");
        onExtraCallback = onextracallback2;
        onExtraCallbackWithResult = onextracallback2.onNavigationEvent("cms_agreement");
        onExtraCallback onextracallback3 = new onExtraCallback("account");
        onWarmupCompleted = onextracallback3;
        asInterface = onextracallback3.onNavigationEvent("delete_toss_account");
        onNavigationEvent = onextracallback3.onNavigationEvent("click_button");
        onExtraCallback onextracallback4 = new onExtraCallback("transaction");
        extraCallbackWithResult = onextracallback4;
        access000 = onextracallback4.onNavigationEvent("message_send_complete");
        onExtraCallback onextracallback5 = new onExtraCallback("credit");
        IAuthTabCallbackStub = onextracallback5;
        asBinder = onextracallback5.onNavigationEvent("signout");
        onExtraCallback onextracallback6 = new onExtraCallback("service");
        IAuthTabCallback_Parcel = onextracallback6;
        getInterfaceDescriptor = onextracallback6.onNavigationEvent("impression");
        onExtraCallback onextracallback7 = new onExtraCallback("plus");
        access100 = onextracallback7;
        ICustomTabsCallback = onextracallback7.onNavigationEvent("transfer_toss_account");
        readTypedObject = onextracallback7.onNavigationEvent("charge_toss_account");
        int i = extraCallback + 47;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 77;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = asInterface;
        int i4 = i2 + 49;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        String str = onNavigationEvent;
        int i5 = i3 + 1;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 61;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        String str = access000;
        int i5 = i2 + 21;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMinimized + 63;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return getInterfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onPostMessage + 3;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String str = ICustomTabsCallback;
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        String str = readTypedObject;
        int i5 = i3 + 121;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
