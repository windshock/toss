package viva.republica.toss.network.model.account.notification;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.account.notification.AccountNotificationGetCiResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountNotificationGetCiResp {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String ci;

    static {
        int i = IAuthTabCallback + 9;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccountNotificationGetCiResp() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountNotificationGetCiResp) || !Intrinsics.areEqual(this.ci, ((AccountNotificationGetCiResp) obj).ci)) {
            return false;
        }
        int i3 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ci;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i3 + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountNotificationGetCiResp(ci=" + this.ci + ")";
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountNotificationGetCiResp> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AccountNotificationGetCiResp$.serializer serializerVar = AccountNotificationGetCiResp$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ AccountNotificationGetCiResp(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.ci = null;
            int i2 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.ci = str;
        int i3 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 23 / 0;
        }
    }

    public AccountNotificationGetCiResp(@Nullable String str) {
        this.ci = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(AccountNotificationGetCiResp accountNotificationGetCiResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (accountNotificationGetCiResp.ci == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, accountNotificationGetCiResp.ci);
        int i4 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AccountNotificationGetCiResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.ci;
        int i4 = i3 + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
