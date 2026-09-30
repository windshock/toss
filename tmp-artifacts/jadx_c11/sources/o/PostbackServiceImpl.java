package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.hasProvider;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class PostbackServiceImpl {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final hasProvider.onExtraCallbackWithResult<String> onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ PostbackServiceImpl(hasProvider.onExtraCallbackWithResult onextracallbackwithresult, float f, long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(onextracallbackwithresult, f, j, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 73;
            asBinder = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof PostbackServiceImpl)) {
            return false;
        }
        PostbackServiceImpl postbackServiceImpl = (PostbackServiceImpl) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, postbackServiceImpl.onExtraCallbackWithResult) || Float.compare(this.onNavigationEvent, postbackServiceImpl.onNavigationEvent) != 0) {
            return false;
        }
        if (setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, postbackServiceImpl.onExtraCallback)) {
            return setUseCaseAttached.onWarmupCompleted(this.IAuthTabCallback, postbackServiceImpl.IAuthTabCallback) && setUseCaseAttached.onWarmupCompleted(this.onWarmupCompleted, postbackServiceImpl.onWarmupCompleted);
        }
        int i6 = asBinder + 71;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.onExtraCallbackWithResult.hashCode() * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + setByteOrder.onTransact(this.onExtraCallback)) * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.IAuthTabCallback)) * 31) + setUseCaseAttached.IAuthTabCallbackStub(this.onWarmupCompleted);
        int i4 = IAuthTabCallbackDefault + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnderlineStringData(range=" + this.onExtraCallbackWithResult + ", size=" + this.onNavigationEvent + ", color=" + setByteOrder.IAuthTabCallbackDefault(this.onExtraCallback) + ", start=" + setUseCaseAttached.IAuthTabCallbackDefault(this.IAuthTabCallback) + ", end=" + setUseCaseAttached.IAuthTabCallbackDefault(this.onWarmupCompleted) + ")";
        int i2 = IAuthTabCallbackDefault + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private PostbackServiceImpl(hasProvider.onExtraCallbackWithResult<String> onextracallbackwithresult, float f, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallbackWithResult = onextracallbackwithresult;
        this.onNavigationEvent = f;
        this.onExtraCallback = j;
        this.IAuthTabCallback = j2;
        this.onWarmupCompleted = j3;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 1;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = this.onNavigationEvent;
        int i4 = i2 + 93;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        long j;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 35;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.onExtraCallback;
            int i4 = 45 / 0;
        } else {
            j = this.onExtraCallback;
        }
        int i5 = i2 + 79;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.IAuthTabCallback;
        int i4 = i3 + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 117;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 35;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
