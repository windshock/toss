package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AudienceNetworkRemoteServiceApiHorizonWorldUrlLauncher implements getOther {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final String iconUrl;
    private final Function0<Unit> onClick;
    private final String title;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudienceNetworkRemoteServiceApiHorizonWorldUrlLauncher)) {
            int i5 = i3 + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        AudienceNetworkRemoteServiceApiHorizonWorldUrlLauncher audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher = (AudienceNetworkRemoteServiceApiHorizonWorldUrlLauncher) obj;
        if (!Intrinsics.areEqual(this.iconUrl, audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher.iconUrl)) {
            int i7 = onExtraCallback + 13;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher.title)) {
            int i9 = onExtraCallback + 55;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onClick, audienceNetworkRemoteServiceApiHorizonWorldUrlLauncher.onClick)) {
            return false;
        }
        int i11 = onWarmupCompleted + 55;
        onExtraCallback = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.iconUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.onClick.hashCode();
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccNoticeItem(iconUrl=" + this.iconUrl + ", title=" + this.title + ", onClick=" + this.onClick + ")";
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public AudienceNetworkRemoteServiceApiHorizonWorldUrlLauncher(@NotNull String str, @NotNull String str2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.iconUrl = str;
        this.title = str2;
        this.onClick = function0;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.title;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function0<Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function0<Unit> function0 = this.onClick;
        int i4 = i3 + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return function0;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        toASN1EncodableVector toasn1encodablevector = toASN1EncodableVector.PLCC_NOTICE;
        int i4 = onWarmupCompleted + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return toasn1encodablevector;
    }
}
