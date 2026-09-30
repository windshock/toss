package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCurrentInvertColorsState {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final long id;
    private final String slug;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentInvertColorsState)) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        getCurrentInvertColorsState getcurrentinvertcolorsstate = (getCurrentInvertColorsState) obj;
        if (this.id != getcurrentinvertcolorsstate.id) {
            return false;
        }
        if (Intrinsics.areEqual(this.slug, getcurrentinvertcolorsstate.slug)) {
            return true;
        }
        int i7 = IAuthTabCallback + 19;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.id) * 31) + this.slug.hashCode();
        int i4 = onNavigationEvent + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShortenResp(id=" + this.id + ", slug=" + this.slug + ")";
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
        return str;
    }
}
