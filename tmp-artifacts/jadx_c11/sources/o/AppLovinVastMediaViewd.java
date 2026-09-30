package o;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.hasProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinVastMediaViewd {
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted;
    private final hasProvider.onExtraCallbackWithResult<String> IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final Function0<Unit> onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 39;
            IAuthTabCallbackStub = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof AppLovinVastMediaViewd)) {
            return false;
        }
        AppLovinVastMediaViewd appLovinVastMediaViewd = (AppLovinVastMediaViewd) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, appLovinVastMediaViewd.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, appLovinVastMediaViewd.onNavigationEvent)) {
            return true;
        }
        int i6 = IAuthTabCallbackStub + 13;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        return i3 != 0 ? (iHashCode << 48) >>> this.onNavigationEvent.hashCode() : (iHashCode * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ClickableStringData(range=" + this.IAuthTabCallback + ", onClick=" + this.onNavigationEvent + ")";
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public AppLovinVastMediaViewd(@NotNull hasProvider.onExtraCallbackWithResult<String> onextracallbackwithresult, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = onextracallbackwithresult;
        this.onNavigationEvent = function0;
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(CollectionsKt.emptyList(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public final hasProvider.onExtraCallbackWithResult<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        hasProvider.onExtraCallbackWithResult<String> onextracallbackwithresult = this.IAuthTabCallback;
        int i5 = i3 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return onextracallbackwithresult;
    }

    public final Function0<Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Function0<Unit> function0 = this.onNavigationEvent;
        int i4 = i3 + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return function0;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallbackStub + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallbackStub + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<removeTimestamp> onExtraCallbackWithResult() {
        List<removeTimestamp> list;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            list = (List) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            int i3 = 68 / 0;
        } else {
            list = (List) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        int i4 = onWarmupCompleted + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull List<? extends removeTimestamp> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult.IAuthTabCallback(list);
        int i4 = IAuthTabCallbackStub + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }
}
