package im.toss.securities.widget.data.model.overview;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class OverviewNoticeMessage {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String icon;
    private final String text;

    static {
        int i = onExtraCallbackWithResult + 67;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof im.toss.securities.widget.data.model.overview.OverviewNoticeMessage) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (im.toss.securities.widget.data.model.overview.OverviewNoticeMessage) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.icon, r6.icon) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.text, r6.text) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r6 = im.toss.securities.widget.data.model.overview.OverviewNoticeMessage.onWarmupCompleted + 99;
        im.toss.securities.widget.data.model.overview.OverviewNoticeMessage.onExtraCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r6 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 15;
        im.toss.securities.widget.data.model.overview.OverviewNoticeMessage.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            int i4 = 78 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.icon;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i3 = onWarmupCompleted + 97;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        int iHashCode2 = (iHashCode * 31) + this.text.hashCode();
        int i5 = onWarmupCompleted + 57;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverviewNoticeMessage(icon=" + this.icon + ", text=" + this.text + ")";
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OverviewNoticeMessage> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            OverviewNoticeMessage$$serializer overviewNoticeMessage$$serializer = OverviewNoticeMessage$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewNoticeMessage$$serializer;
        }
    }

    public /* synthetic */ OverviewNoticeMessage(int i, String str, String str2, okycx okycxVar) {
        if (2 != (i & 2)) {
            int i2 = onExtraCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 2, OverviewNoticeMessage$$serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        if ((i & 1) == 0) {
            this.icon = null;
            int i7 = onWarmupCompleted + 31;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            this.icon = str;
        }
        this.text = str2;
        int i9 = onWarmupCompleted + 61;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(OverviewNoticeMessage overviewNoticeMessage, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onWarmupCompleted + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
                if (overviewNoticeMessage.icon != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, overviewNoticeMessage.icon);
                    int i6 = onWarmupCompleted + 19;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else if (overviewNoticeMessage.icon != null) {
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, overviewNoticeMessage.text);
    }
}
