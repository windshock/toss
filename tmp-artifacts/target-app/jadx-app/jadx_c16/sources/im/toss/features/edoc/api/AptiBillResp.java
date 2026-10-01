package im.toss.features.edoc.api;

import im.toss.features.edoc.api.AptiMenu$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AptiBillResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final AptiMenu menu;
    private final String url;

    static {
        int i = onExtraCallback + 83;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AptiBillResp() {
        this((String) null, (AptiMenu) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 101;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof AptiBillResp)) {
            int i6 = IAuthTabCallback + 55;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        AptiBillResp aptiBillResp = (AptiBillResp) obj;
        if (Intrinsics.areEqual(this.url, aptiBillResp.url)) {
            return Intrinsics.areEqual(this.menu, aptiBillResp.menu);
        }
        int i8 = IAuthTabCallback + 1;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.url.hashCode();
        AptiMenu aptiMenu = this.menu;
        if (aptiMenu == null) {
            int i4 = IAuthTabCallback + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = aptiMenu.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AptiBillResp(url=" + this.url + ", menu=" + this.menu + ")";
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ AptiBillResp(int i, String str, AptiMenu aptiMenu, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            str = "";
        }
        this.url = str;
        if ((i & 2) != 0) {
            this.menu = aptiMenu;
            return;
        }
        int i3 = IAuthTabCallback + 49;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.menu = null;
        int i6 = i4 + 15;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public AptiBillResp(@NotNull String str, @Nullable AptiMenu aptiMenu) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
        this.menu = aptiMenu;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(AptiBillResp aptiBillResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallback(serialDescriptor, 0, aptiBillResp.url);
        } else if (!Intrinsics.areEqual(aptiBillResp.url, "")) {
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = IAuthTabCallback + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            AptiMenu aptiMenu = aptiBillResp.menu;
            if (i4 == 0) {
                int i5 = 6 / 0;
                if (aptiMenu == null) {
                    return;
                }
            } else if (aptiMenu == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, AptiMenu$.serializer.INSTANCE, aptiBillResp.menu);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AptiBillResp(String str, AptiMenu aptiMenu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 113;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                str = "";
                int i4 = i3 + 23;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 3;
                } else {
                    int i6 = 2 % 2;
                }
            } else {
                throw null;
            }
        }
        if ((i & 2) != 0) {
            int i7 = IAuthTabCallback + 33;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 5;
            } else {
                int i9 = 2 % 2;
            }
            aptiMenu = null;
        }
        this(str, aptiMenu);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AptiMenu onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        AptiMenu aptiMenu = this.menu;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return aptiMenu;
    }
}
