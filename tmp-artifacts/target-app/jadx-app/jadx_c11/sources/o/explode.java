package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class explode implements putStringIfValid {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public /* synthetic */ explode(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private explode(long j, long j2, long j3) {
        this.onNavigationEvent = j;
        this.onExtraCallback = j2;
        this.IAuthTabCallback = j3;
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.putStringIfValid
    public long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 113;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 55;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.putStringIfValid
    public long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.putStringIfValid
    public long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 119;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i2 + 33;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    @Override // o.putStringIfValid
    public Float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Float fIAuthTabCallback = IAuthTabCallback();
        int i3 = asInterface + 67;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
        }
        return fIAuthTabCallback;
    }

    @Override // o.putStringIfValid
    public void onWarmupCompleted(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(f);
        int i4 = IAuthTabCallbackStub + 101;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    private final Float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return (Float) this.onWarmupCompleted.onExtraCallbackWithResult();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(Float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.IAuthTabCallback(f);
        int i4 = asInterface + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }
}
