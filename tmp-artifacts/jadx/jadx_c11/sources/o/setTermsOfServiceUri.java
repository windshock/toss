package o;

import im.toss.securities.core.router.spec.TossSecRoute;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setTermsOfServiceUri {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback;
    private final String IAuthTabCallback;
    private final TossSecRoute onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final List<Pair<String, String>> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof setTermsOfServiceUri))) {
            setTermsOfServiceUri settermsofserviceuri = (setTermsOfServiceUri) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, settermsofserviceuri.onExtraCallbackWithResult)) {
                int i4 = IAuthTabCallbackDefault + 39;
                onExtraCallback = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, settermsofserviceuri.IAuthTabCallback)) {
                int i5 = IAuthTabCallbackDefault + 117;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onWarmupCompleted, settermsofserviceuri.onWarmupCompleted)) {
                if (Intrinsics.areEqual(this.onNavigationEvent, settermsofserviceuri.onNavigationEvent)) {
                    return true;
                }
                int i7 = IAuthTabCallbackDefault + 91;
                onExtraCallback = i7 % 128;
                return i7 % 2 != 0;
            }
            int i8 = onExtraCallback + 7;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? ((((this.onExtraCallbackWithResult.hashCode() << 113) >>> this.IAuthTabCallback.hashCode()) % 37) << this.onWarmupCompleted.hashCode()) + 82 : ((((this.onExtraCallbackWithResult.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onNavigationEvent.hashCode();
        int i3 = onExtraCallback + 41;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossSecBackStackEntry(route=" + this.onExtraCallbackWithResult + ", id=" + this.IAuthTabCallback + ", feedExtras=" + this.onWarmupCompleted + ", landingId=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallback + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public setTermsOfServiceUri(@NotNull TossSecRoute tossSecRoute, @NotNull String str, @NotNull List<Pair<String, String>> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(tossSecRoute, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult = tossSecRoute;
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = list;
        this.onNavigationEvent = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setTermsOfServiceUri(TossSecRoute tossSecRoute, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "");
            int i2 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallbackDefault + 5;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i4 = 34 / 0;
            } else {
                list = CollectionsKt.emptyList();
            }
        }
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallbackDefault + 61;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            str2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "");
            int i7 = 2 % 2;
        }
        this(tossSecRoute, str, list, str2);
    }

    public final TossSecRoute IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        TossSecRoute tossSecRoute = this.onExtraCallbackWithResult;
        int i5 = i2 + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return tossSecRoute;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 25;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Pair<String, String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<Pair<String, String>> list = this.onWarmupCompleted;
        int i5 = i2 + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return str;
    }
}
