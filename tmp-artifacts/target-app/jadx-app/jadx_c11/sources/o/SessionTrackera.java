package o;

import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class SessionTrackera extends IEngagementSignalsCallback_Parcel<Intent> {
    public static final onExtraCallbackWithResult Companion;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final int onNavigationEvent = 8;
    private static int onWarmupCompleted;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallback;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 63;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public SessionTrackera(@NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel) {
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
        this.IAuthTabCallback = iEngagementSignalsCallback_Parcel;
    }

    public /* synthetic */ void onExtraCallback(Object obj, MediaStoreVideoCannotWrite mediaStoreVideoCannotWrite) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((Intent) obj, mediaStoreVideoCannotWrite);
        int i4 = asBinder + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull Intent intent, @Nullable MediaStoreVideoCannotWrite mediaStoreVideoCannotWrite) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            this.IAuthTabCallback.onExtraCallback(intent, mediaStoreVideoCannotWrite);
        } else {
            Intrinsics.checkNotNullParameter(intent, "");
            this.IAuthTabCallback.onExtraCallback(intent, mediaStoreVideoCannotWrite);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onWarmupCompleted();
        int i4 = asBinder + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final SessionTrackera onExtraCallback(@NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
            SessionTrackera sessionTrackera = new SessionTrackera(iEngagementSignalsCallback_Parcel);
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 41 / 0;
            }
            return sessionTrackera;
        }
    }
}
