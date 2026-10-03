package o;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class updateAnimatedNodeConfig implements Serializable {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private String from;
    private getCurrentAppState marketing;
    private getConstants teensAccount;
    private String type;
    private NativeAnimatedTurboModuleSpec ussCard;

    public updateAnimatedNodeConfig() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updateAnimatedNodeConfig)) {
            return false;
        }
        updateAnimatedNodeConfig updateanimatednodeconfig = (updateAnimatedNodeConfig) obj;
        if (!Intrinsics.areEqual(this.ussCard, updateanimatednodeconfig.ussCard) || !Intrinsics.areEqual(this.teensAccount, updateanimatednodeconfig.teensAccount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.marketing, updateanimatednodeconfig.marketing)) {
            int i4 = onNavigationEvent + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IAuthTabCallback + 67;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        NativeAnimatedTurboModuleSpec nativeAnimatedTurboModuleSpec = this.ussCard;
        int iHashCode3 = 0;
        if (nativeAnimatedTurboModuleSpec == null) {
            int i5 = i2 + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = nativeAnimatedTurboModuleSpec.hashCode();
        }
        getConstants getconstants = this.teensAccount;
        if (getconstants == null) {
            int i7 = IAuthTabCallback + 11;
            onNavigationEvent = i7 % 128;
            iHashCode2 = i7 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = getconstants.hashCode();
        }
        getCurrentAppState getcurrentappstate = this.marketing;
        if (getcurrentappstate != null) {
            iHashCode3 = getcurrentappstate.hashCode();
            int i8 = IAuthTabCallback + 55;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OnboardingTutorial(ussCard=" + this.ussCard + ", teensAccount=" + this.teensAccount + ", marketing=" + this.marketing + ")";
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public updateAnimatedNodeConfig(@Nullable NativeAnimatedTurboModuleSpec nativeAnimatedTurboModuleSpec, @Nullable getConstants getconstants, @Nullable getCurrentAppState getcurrentappstate) {
        this.ussCard = nativeAnimatedTurboModuleSpec;
        this.teensAccount = getconstants;
        this.marketing = getcurrentappstate;
        this.from = "";
        this.type = "";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ updateAnimatedNodeConfig(NativeAnimatedTurboModuleSpec nativeAnimatedTurboModuleSpec, getConstants getconstants, getCurrentAppState getcurrentappstate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            nativeAnimatedTurboModuleSpec = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 59;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 4;
            } else {
                int i9 = 2 % 2;
            }
            getconstants = null;
        }
        if ((i & 4) != 0) {
            int i10 = onNavigationEvent + 63;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i11 = 2 % 2;
            getcurrentappstate = null;
        }
        this(nativeAnimatedTurboModuleSpec, getconstants, getcurrentappstate);
    }

    public final void onNavigationEvent(@Nullable NativeAnimatedTurboModuleSpec nativeAnimatedTurboModuleSpec) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.ussCard = nativeAnimatedTurboModuleSpec;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
    }

    public final NativeAnimatedTurboModuleSpec onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        NativeAnimatedTurboModuleSpec nativeAnimatedTurboModuleSpec = this.ussCard;
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return nativeAnimatedTurboModuleSpec;
    }

    public final getConstants onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        getConstants getconstants = this.teensAccount;
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return getconstants;
        }
        throw null;
    }

    public final void onNavigationEvent(@Nullable getConstants getconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.teensAccount = getconstants;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final getCurrentAppState IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        getCurrentAppState getcurrentappstate = this.marketing;
        int i5 = i3 + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return getcurrentappstate;
        }
        throw null;
    }

    public final void onExtraCallback(@Nullable getCurrentAppState getcurrentappstate) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.marketing = getcurrentappstate;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.from = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.from = str;
            throw null;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        int i4 = onNavigationEvent + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
