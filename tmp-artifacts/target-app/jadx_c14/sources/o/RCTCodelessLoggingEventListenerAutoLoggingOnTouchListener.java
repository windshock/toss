package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String funnelId;
    private final Map<String, Object> logParam;

    public static final class onNavigationEvent implements Parcelable.Creator<RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener rCTCodelessLoggingEventListenerAutoLoggingOnTouchListenerOnExtraCallback = onExtraCallback(parcel);
            if (i3 != 0) {
                int i4 = 81 / 0;
            }
            int i5 = IAuthTabCallback + 21;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return rCTCodelessLoggingEventListenerAutoLoggingOnTouchListenerOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 95;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener[] rCTCodelessLoggingEventListenerAutoLoggingOnTouchListenerArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = IAuthTabCallback + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return rCTCodelessLoggingEventListenerAutoLoggingOnTouchListenerArrOnNavigationEvent;
        }

        public final RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener = new RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener(parcel.readString(), Preconditions.INSTANCE.onNavigationEvent(parcel));
            int i2 = IAuthTabCallback + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 23;
            IAuthTabCallback = i3 % 128;
            RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener[] rCTCodelessLoggingEventListenerAutoLoggingOnTouchListenerArr = new RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener[i];
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
            }
            return rCTCodelessLoggingEventListenerAutoLoggingOnTouchListenerArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 82 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.funnelId);
            Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
            throw null;
        }
        parcel.writeString(this.funnelId);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        int i5 = onWarmupCompleted + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener(@NotNull String str, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        this.funnelId = str;
        this.logParam = map;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 1;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.funnelId;
        int i4 = i2 + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 45;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }
}
