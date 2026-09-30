package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PrepareCallbackImpl {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final List<String> onNavigationEvent;
    private final String onTransact;
    private final Boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepareCallbackImpl)) {
            return false;
        }
        PrepareCallbackImpl prepareCallbackImpl = (PrepareCallbackImpl) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, prepareCallbackImpl.onNavigationEvent) || (!Intrinsics.areEqual(this.IAuthTabCallback, prepareCallbackImpl.IAuthTabCallback)) || (!Intrinsics.areEqual(this.onExtraCallback, prepareCallbackImpl.onExtraCallback)) || !Intrinsics.areEqual(this.onWarmupCompleted, prepareCallbackImpl.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, prepareCallbackImpl.onExtraCallbackWithResult)) {
            return Intrinsics.areEqual(this.onTransact, prepareCallbackImpl.onTransact);
        }
        int i2 = asInterface + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        int iHashCode3 = this.onExtraCallback.hashCode();
        Boolean bool = this.onWarmupCompleted;
        int iHashCode4 = 0;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str = this.onExtraCallbackWithResult;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.onTransact;
        if (str2 != null) {
            iHashCode4 = str2.hashCode();
            int i4 = asInterface + 75;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode4;
        int i7 = asInterface + 19;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCategorySaveParameterDto(sourceIds=" + this.onNavigationEvent + ", timelineTime=" + this.IAuthTabCallback + ", categoryNo=" + this.onExtraCallback + ", override=" + this.onWarmupCompleted + ", brand=" + this.onExtraCallbackWithResult + ", type=" + this.onTransact + ")";
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public PrepareCallbackImpl(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onNavigationEvent = list;
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
        this.onWarmupCompleted = bool;
        this.onExtraCallbackWithResult = str3;
        this.onTransact = str4;
    }

    public final List<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        List<String> list = this.onNavigationEvent;
        int i5 = i3 + 107;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 25;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onExtraCallback;
            int i4 = 40 / 0;
        } else {
            str = this.onExtraCallback;
        }
        int i5 = i2 + 109;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 3;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 87;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.onTransact;
        int i4 = i2 + 105;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
