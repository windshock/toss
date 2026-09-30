package o;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class EventServiceImpl {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Bundle onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final Intent onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventServiceImpl)) {
            int i4 = i3 + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        EventServiceImpl eventServiceImpl = (EventServiceImpl) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, eventServiceImpl.onNavigationEvent)) {
            int i6 = onWarmupCompleted + 5;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, eventServiceImpl.onExtraCallbackWithResult)) {
            return Intrinsics.areEqual(this.onExtraCallback, eventServiceImpl.onExtraCallback);
        }
        int i7 = onWarmupCompleted + 45;
        IAuthTabCallback = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onNavigationEvent.hashCode();
        Integer num = this.onExtraCallbackWithResult;
        if (num == null) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 79;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Bundle bundle = this.onExtraCallback;
        return (((iHashCode2 * 31) + iHashCode) * 31) + (bundle != null ? bundle.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ActivityResultData(intent=" + this.onNavigationEvent + ", requestCode=" + this.onExtraCallbackWithResult + ", options=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public EventServiceImpl(@NotNull Intent intent, @Nullable Integer num, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.onNavigationEvent = intent;
        this.onExtraCallbackWithResult = num;
        this.onExtraCallback = bundle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EventServiceImpl(Intent intent, Integer num, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 1;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            num = null;
        }
        this(intent, num, bundle);
    }

    public final Intent IAuthTabCallback() {
        Intent intent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            intent = this.onNavigationEvent;
            int i4 = 30 / 0;
        } else {
            intent = this.onNavigationEvent;
        }
        int i5 = i3 + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return intent;
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallbackWithResult;
        int i5 = i3 + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Bundle onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Bundle bundle = this.onExtraCallback;
        int i5 = i3 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return bundle;
    }
}
