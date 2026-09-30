package o;

import android.content.Context;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class contentLength implements CacheCacheResponseBody {
    private static WeakReference<Context> IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static Context onExtraCallback = null;
    public static final contentLength onExtraCallbackWithResult = new contentLength();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 71;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 54 / 0;
        }
    }

    private contentLength() {
    }

    @Override // o.CacheCacheResponseBody
    public /* bridge */ Resources IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Resources resourcesIAuthTabCallbackDefault = super.IAuthTabCallbackDefault();
        int i4 = IAuthTabCallbackDefault + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return resourcesIAuthTabCallbackDefault;
    }

    @Override // o.CacheCacheResponseBody
    public /* bridge */ Context IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Context contextIAuthTabCallbackStubProxy = super.IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return contextIAuthTabCallbackStubProxy;
    }

    @Override // o.CacheCacheResponseBody
    public /* bridge */ Resources IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Resources resourcesIAuthTabCallback_Parcel = super.IAuthTabCallback_Parcel();
        int i4 = IAuthTabCallbackStub + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return resourcesIAuthTabCallback_Parcel;
        }
        throw null;
    }

    @Override // o.CacheCacheResponseBody
    public Context onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 29;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        WeakReference<Context> weakReference = IAuthTabCallback;
        if (weakReference != null) {
            int i4 = i2 + 25;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            Context context = weakReference.get();
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            if (context != null) {
                return context;
            }
        }
        return onExtraCallback;
    }

    public final void onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            onExtraCallback = context.getApplicationContext();
            onNavigationEvent(context);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            onExtraCallback = context.getApplicationContext();
            onNavigationEvent(context);
            int i3 = 73 / 0;
        }
    }

    public final void onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        IAuthTabCallback = new WeakReference<>(context);
        int i2 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
