package im.toss.feature.credit.overview.network.response;

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

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Link {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String href;
    private final String text;

    static {
        int i = onExtraCallback + 113;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Link() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 33;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof Link)) {
            int i7 = onWarmupCompleted + 17;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        Link link = (Link) obj;
        if (!Intrinsics.areEqual(this.text, link.text)) {
            int i9 = onWarmupCompleted + 125;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.href, link.href)) {
            return true;
        }
        int i11 = onWarmupCompleted + 43;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.text;
        if (str == null) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 63;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.href;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Link(text=" + this.text + ", href=" + this.href + ")";
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Link> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Link$$serializer link$$serializer = Link$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return link$$serializer;
        }
    }

    public /* synthetic */ Link(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            this.href = str2;
            return;
        }
        int i4 = IAuthTabCallback + 1;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.href = null;
        if (i6 != 0) {
            int i7 = 99 / 0;
        }
        int i8 = i5 + 9;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    public Link(@Nullable String str, @Nullable String str2) {
        this.text = str;
        this.href = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(Link link, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onWarmupCompleted + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (link.text != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, link.text);
                int i4 = onWarmupCompleted + 97;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || link.href != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, link.href);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Link(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 41;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i8 = IAuthTabCallback + 75;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.href;
        int i4 = i2 + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return str;
    }
}
