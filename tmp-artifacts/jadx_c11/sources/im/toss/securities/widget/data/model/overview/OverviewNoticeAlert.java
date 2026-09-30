package im.toss.securities.widget.data.model.overview;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewNoticeAlert {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String message;
    private final OverviewNoticeAlertButton primaryButton;
    private final String secondaryButton;
    private final String title;

    static {
        int i = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof OverviewNoticeAlert)) {
            return false;
        }
        OverviewNoticeAlert overviewNoticeAlert = (OverviewNoticeAlert) obj;
        if (!Intrinsics.areEqual(this.title, overviewNoticeAlert.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.message, overviewNoticeAlert.message)) {
            int i3 = IAuthTabCallback + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.primaryButton, overviewNoticeAlert.primaryButton) || !Intrinsics.areEqual(this.secondaryButton, overviewNoticeAlert.secondaryButton)) {
            return false;
        }
        int i5 = onNavigationEvent + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int iHashCode2 = 0;
        if (str == null) {
            int i5 = i2 + 89;
            IAuthTabCallback = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode3 = this.message.hashCode();
        int iHashCode4 = this.primaryButton.hashCode();
        String str2 = this.secondaryButton;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
            int i6 = IAuthTabCallback + 97;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverviewNoticeAlert(title=" + this.title + ", message=" + this.message + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OverviewNoticeAlert> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            OverviewNoticeAlert$$serializer overviewNoticeAlert$$serializer = OverviewNoticeAlert$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return overviewNoticeAlert$$serializer;
        }
    }

    public /* synthetic */ OverviewNoticeAlert(int i, String str, String str2, OverviewNoticeAlertButton overviewNoticeAlertButton, String str3, okycx okycxVar) {
        if (6 != (i & 6)) {
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 6, OverviewNoticeAlert$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.title = null;
            int i4 = 2 % 2;
        } else {
            this.title = str;
        }
        this.message = str2;
        this.primaryButton = overviewNoticeAlertButton;
        if ((i & 8) == 0) {
            this.secondaryButton = null;
            int i5 = onNavigationEvent + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.secondaryButton = str3;
        int i7 = IAuthTabCallback + 21;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(OverviewNoticeAlert overviewNoticeAlert, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0 ? (!vylVar.onWarmupCompleted(serialDescriptor, 0)) : !vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = IAuthTabCallback + 37;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                String str = overviewNoticeAlert.title;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (overviewNoticeAlert.title != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, overviewNoticeAlert.title);
                int i4 = IAuthTabCallback + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, overviewNoticeAlert.message);
        vylVar.onNavigationEvent(serialDescriptor, 2, OverviewNoticeAlertButton$$serializer.INSTANCE, overviewNoticeAlert.primaryButton);
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || overviewNoticeAlert.secondaryButton != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, overviewNoticeAlert.secondaryButton);
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 35;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.message;
        int i4 = i3 + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final OverviewNoticeAlertButton onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        OverviewNoticeAlertButton overviewNoticeAlertButton = this.primaryButton;
        int i5 = i3 + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return overviewNoticeAlertButton;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.secondaryButton;
        }
        throw null;
    }
}
