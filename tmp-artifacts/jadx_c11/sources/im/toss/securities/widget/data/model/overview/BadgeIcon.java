package im.toss.securities.widget.data.model.overview;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class BadgeIcon {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String imageUrl;
    private final boolean isRectangle;

    static {
        int i = onNavigationEvent + 85;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 107;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 63;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof BadgeIcon)) {
            int i7 = i4 + 93;
            IAuthTabCallback = i7 % 128;
            return i7 % 2 == 0;
        }
        BadgeIcon badgeIcon = (BadgeIcon) obj;
        if (Intrinsics.areEqual(this.imageUrl, badgeIcon.imageUrl)) {
            if (this.isRectangle == badgeIcon.isRectangle) {
                return true;
            }
            int i8 = IAuthTabCallback + 63;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i9 = onWarmupCompleted;
        int i10 = i9 + 117;
        IAuthTabCallback = i10 % 128;
        boolean z = i10 % 2 == 0;
        int i11 = i9 + 119;
        IAuthTabCallback = i11 % 128;
        if (i11 % 2 != 0) {
            return z;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.imageUrl.hashCode() * 31) + Boolean.hashCode(this.isRectangle);
        int i4 = onWarmupCompleted + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BadgeIcon(imageUrl=" + this.imageUrl + ", isRectangle=" + this.isRectangle + ")";
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BadgeIcon> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            BadgeIcon$$serializer badgeIcon$$serializer = BadgeIcon$$serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 71 / 0;
            }
            return badgeIcon$$serializer;
        }
    }

    public /* synthetic */ BadgeIcon(int i, String str, boolean z, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, BadgeIcon$$serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.imageUrl = str;
        this.isRectangle = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(BadgeIcon badgeIcon, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, badgeIcon.imageUrl);
        vylVar.onNavigationEvent(serialDescriptor, 1, badgeIcon.isRectangle);
        int i4 = onWarmupCompleted + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.imageUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isRectangle;
        int i4 = i3 + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }
}
