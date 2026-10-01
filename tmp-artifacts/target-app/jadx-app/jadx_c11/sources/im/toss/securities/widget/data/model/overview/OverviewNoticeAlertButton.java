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
public final class OverviewNoticeAlertButton {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String landingUrl;
    private final String text;

    static {
        int i = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 107;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 1;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof OverviewNoticeAlertButton)) {
            int i8 = i2 + 109;
            onNavigationEvent = i8 % 128;
            return i8 % 2 != 0;
        }
        OverviewNoticeAlertButton overviewNoticeAlertButton = (OverviewNoticeAlertButton) obj;
        if (Intrinsics.areEqual(this.landingUrl, overviewNoticeAlertButton.landingUrl)) {
            if (Intrinsics.areEqual(this.text, overviewNoticeAlertButton.text)) {
                return true;
            }
            int i9 = onNavigationEvent + 31;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = onExtraCallback + 17;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        String str = this.landingUrl;
        if (str == null) {
            int i3 = onExtraCallback + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i5 = onExtraCallback + 17;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return (i * 31) + this.text.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverviewNoticeAlertButton(landingUrl=" + this.landingUrl + ", text=" + this.text + ")";
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
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

        public final KSerializer<OverviewNoticeAlertButton> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            OverviewNoticeAlertButton$$serializer overviewNoticeAlertButton$$serializer = OverviewNoticeAlertButton$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewNoticeAlertButton$$serializer;
        }
    }

    public /* synthetic */ OverviewNoticeAlertButton(int i, String str, String str2, okycx okycxVar) {
        if (2 != (i & 2)) {
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 4, OverviewNoticeAlertButton$$serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 2, OverviewNoticeAlertButton$$serializer.INSTANCE.getDescriptor());
            }
            int i3 = onExtraCallback + 101;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        }
        if ((i & 1) == 0) {
            this.landingUrl = null;
            int i5 = 2 % 2;
        } else {
            this.landingUrl = str;
        }
        this.text = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(OverviewNoticeAlertButton overviewNoticeAlertButton, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 92 / 0;
                if (overviewNoticeAlertButton.landingUrl != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, overviewNoticeAlertButton.landingUrl);
                    int i4 = onNavigationEvent + 5;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 3 / 4;
                    }
                }
            } else if (overviewNoticeAlertButton.landingUrl != null) {
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, overviewNoticeAlertButton.text);
        int i6 = onExtraCallback + 57;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.landingUrl;
        int i5 = i3 + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.text;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return str;
    }
}
