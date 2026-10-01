package im.toss.securities.widget.data.model.overview;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getBgColor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewNotice {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final OverviewNoticeAlert alert;
    private final Boolean earningsAnnouncement;
    private final OverviewNoticeMessage message;
    private final Boolean splitMerge;

    static {
        int i = IAuthTabCallback + 25;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public OverviewNotice() {
        this((Boolean) null, (Boolean) null, (OverviewNoticeMessage) null, (OverviewNoticeAlert) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof OverviewNotice)) {
            return false;
        }
        OverviewNotice overviewNotice = (OverviewNotice) obj;
        if ((!Intrinsics.areEqual(this.splitMerge, overviewNotice.splitMerge)) || !Intrinsics.areEqual(this.earningsAnnouncement, overviewNotice.earningsAnnouncement)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.message, overviewNotice.message)) {
            int i3 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.alert, overviewNotice.alert)) {
            return true;
        }
        int i5 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Boolean bool = this.splitMerge;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.earningsAnnouncement;
        if (bool2 == null) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 105;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool2.hashCode();
        }
        OverviewNoticeMessage overviewNoticeMessage = this.message;
        int iHashCode3 = overviewNoticeMessage == null ? 0 : overviewNoticeMessage.hashCode();
        OverviewNoticeAlert overviewNoticeAlert = this.alert;
        int iHashCode4 = (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + (overviewNoticeAlert != null ? overviewNoticeAlert.hashCode() : 0);
        int i7 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return iHashCode4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverviewNotice(splitMerge=" + this.splitMerge + ", earningsAnnouncement=" + this.earningsAnnouncement + ", message=" + this.message + ", alert=" + this.alert + ")";
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OverviewNotice> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            OverviewNotice$$serializer overviewNotice$$serializer = OverviewNotice$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            return overviewNotice$$serializer;
        }
    }

    public /* synthetic */ OverviewNotice(int i, Boolean bool, Boolean bool2, OverviewNoticeMessage overviewNoticeMessage, OverviewNoticeAlert overviewNoticeAlert, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.splitMerge = null;
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.splitMerge = bool;
        }
        if ((i & 2) == 0) {
            int i5 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            this.earningsAnnouncement = null;
            if (i6 == 0) {
                throw null;
            }
        } else {
            this.earningsAnnouncement = bool2;
            int i7 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i8 = onExtraCallbackWithResult;
            int i9 = i8 + 41;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            this.message = null;
            int i11 = i8 + 89;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 4 / 4;
            } else {
                int i13 = 2 % 2;
            }
        } else {
            this.message = overviewNoticeMessage;
        }
        if ((i & 8) == 0) {
            this.alert = null;
        } else {
            this.alert = overviewNoticeAlert;
        }
    }

    public OverviewNotice(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable OverviewNoticeMessage overviewNoticeMessage, @Nullable OverviewNoticeAlert overviewNoticeAlert) {
        this.splitMerge = bool;
        this.earningsAnnouncement = bool2;
        this.message = overviewNoticeMessage;
        this.alert = overviewNoticeAlert;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(OverviewNotice overviewNotice, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0 ? (!vylVar.onWarmupCompleted(serialDescriptor, 0)) : !vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            if (overviewNotice.splitMerge != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getBgColor.IAuthTabCallback, overviewNotice.splitMerge);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1)) || overviewNotice.earningsAnnouncement != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, overviewNotice.earningsAnnouncement);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || overviewNotice.message != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, OverviewNoticeMessage$$serializer.INSTANCE, overviewNotice.message);
            int i3 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || overviewNotice.alert != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, OverviewNoticeAlert$$serializer.INSTANCE, overviewNotice.alert);
            int i5 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OverviewNotice(Boolean bool, Boolean bool2, OverviewNoticeMessage overviewNoticeMessage, OverviewNoticeAlert overviewNoticeAlert, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            bool = null;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            bool2 = null;
        }
        overviewNoticeMessage = (i & 4) != 0 ? null : overviewNoticeMessage;
        if ((i & 8) != 0) {
            int i6 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            overviewNoticeAlert = null;
        }
        this(bool, bool2, overviewNoticeMessage, overviewNoticeAlert);
    }

    public final OverviewNoticeAlert onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        OverviewNoticeAlert overviewNoticeAlert = this.alert;
        int i5 = i2 + 35;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return overviewNoticeAlert;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        Boolean bool = this.splitMerge;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual(bool, bool2) && !Intrinsics.areEqual(this.earningsAnnouncement, bool2)) {
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
