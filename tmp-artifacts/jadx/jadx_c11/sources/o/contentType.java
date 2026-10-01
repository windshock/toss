package o;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class contentType implements CacheCacheResponseBody {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final contentType onExtraCallback = new contentType();
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final /* synthetic */ contentLength onWarmupCompleted = contentLength.onExtraCallbackWithResult;

    static {
        int i = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // o.CacheCacheResponseBody
    public Resources IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.IAuthTabCallbackDefault();
            throw null;
        }
        Resources resourcesIAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
        int i3 = onNavigationEvent + 119;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        return resourcesIAuthTabCallbackDefault;
    }

    @Override // o.CacheCacheResponseBody
    public Context IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.IAuthTabCallbackStubProxy();
            throw null;
        }
        Context contextIAuthTabCallbackStubProxy = this.onWarmupCompleted.IAuthTabCallbackStubProxy();
        int i3 = IAuthTabCallbackStub + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return contextIAuthTabCallbackStubProxy;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.CacheCacheResponseBody
    public Resources IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.IAuthTabCallback_Parcel();
            throw null;
        }
        Resources resourcesIAuthTabCallback_Parcel = this.onWarmupCompleted.IAuthTabCallback_Parcel();
        int i3 = IAuthTabCallbackStub + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return resourcesIAuthTabCallback_Parcel;
    }

    @Override // o.CacheCacheResponseBody
    public Context onWarmupCompleted() {
        Context contextOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            contextOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
            int i3 = 39 / 0;
        } else {
            contextOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        }
        int i4 = IAuthTabCallbackStub + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return contextOnWarmupCompleted;
    }

    private contentType() {
    }

    public final void onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            contentLength.onExtraCallbackWithResult.onExtraCallback(context);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            contentLength.onExtraCallbackWithResult.onExtraCallback(context);
            throw null;
        }
    }

    public final void onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        contentLength.onExtraCallbackWithResult.onNavigationEvent(context);
        int i4 = IAuthTabCallbackStub + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
