package im.toss.features.edoc.api;

import im.toss.features.edoc.api.AptiMenu$;
import im.toss.features.edoc.api.AptiMenuTerms$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AptiMenu {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final AptiMenuTerms menuTerms;
    private final String schemeUrl;
    private final String title;

    static {
        int i = onExtraCallback + 55;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 107;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof AptiMenu)) {
            int i6 = i2 + 9;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        AptiMenu aptiMenu = (AptiMenu) obj;
        if (!Intrinsics.areEqual(this.title, aptiMenu.title)) {
            int i8 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.schemeUrl, aptiMenu.schemeUrl)) {
            int i10 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.menuTerms, aptiMenu.menuTerms)) {
            return true;
        }
        int i12 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 == 0 ? (((r0 / 108) / this.schemeUrl.hashCode()) - 101) / this.menuTerms.hashCode() : (((this.title.hashCode() * 31) + this.schemeUrl.hashCode()) * 31) + this.menuTerms.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AptiMenu(title=" + this.title + ", schemeUrl=" + this.schemeUrl + ", menuTerms=" + this.menuTerms + ")";
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ AptiMenu(int i, String str, String str2, AptiMenuTerms aptiMenuTerms, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = AptiMenu$.serializer.INSTANCE.getDescriptor();
                i2 = 55;
            } else {
                descriptor = AptiMenu$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.title = str;
        this.schemeUrl = str2;
        this.menuTerms = aptiMenuTerms;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AptiMenu aptiMenu, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, aptiMenu.title);
            vylVar.onExtraCallback(serialDescriptor, 0, aptiMenu.schemeUrl);
            vylVar.onNavigationEvent(serialDescriptor, 4, AptiMenuTerms$.serializer.INSTANCE, aptiMenu.menuTerms);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, aptiMenu.title);
            vylVar.onExtraCallback(serialDescriptor, 1, aptiMenu.schemeUrl);
            vylVar.onNavigationEvent(serialDescriptor, 2, AptiMenuTerms$.serializer.INSTANCE, aptiMenu.menuTerms);
        }
        int i3 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.schemeUrl;
        int i5 = i3 + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
