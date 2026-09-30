package im.toss.tds.compose.component.atom.image;

import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplb;
import o.immediateFailedFuture;
import o.setViewableVideo50Requests;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ResourceSizeKt {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final AppLovinNativeAdImplb onExtraCallbackWithResult = new AppLovinNativeAdImplb(0.7f);
    private static final AppLovinNativeAdImplb onExtraCallback = new AppLovinNativeAdImplb(0.55f);
    private static final setViewableVideo50Requests IAuthTabCallback = new setViewableVideo50Requests(0.7f);
    private static final setViewableVideo50Requests onNavigationEvent = new setViewableVideo50Requests(0.55f);

    public static final immediateFailedFuture onWarmupCompleted(@NotNull immediateFailedFuture.IAuthTabCallback iAuthTabCallback) {
        AppLovinNativeAdImplb appLovinNativeAdImplb;
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            appLovinNativeAdImplb = onExtraCallbackWithResult;
            int i3 = 55 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            appLovinNativeAdImplb = onExtraCallbackWithResult;
        }
        int i4 = onTransact + 1;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return appLovinNativeAdImplb;
    }

    public static final immediateFailedFuture onNavigationEvent(@NotNull immediateFailedFuture.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        AppLovinNativeAdImplb appLovinNativeAdImplb = onExtraCallback;
        int i4 = onTransact + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return appLovinNativeAdImplb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return new o.AppLovinNativeAdImplb(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r4 == 2.0f) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 == 1.0f) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r3 = r3.IAuthTabCallback();
        r4 = im.toss.tds.compose.component.atom.image.ResourceSizeKt.onTransact + 53;
        im.toss.tds.compose.component.atom.image.ResourceSizeKt.asBinder = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final immediateFailedFuture onNavigationEvent(@NotNull immediateFailedFuture.IAuthTabCallback iAuthTabCallback, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        }
    }

    public static final immediateFailedFuture onWarmupCompleted(@NotNull immediateFailedFuture.IAuthTabCallback iAuthTabCallback, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (f != 1.0f) {
            return new setViewableVideo50Requests(f);
        }
        int i4 = asBinder + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        immediateFailedFuture immediatefailedfutureOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
        int i6 = onTransact + 115;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
        return immediatefailedfutureOnWarmupCompleted;
    }

    static {
        int i = onWarmupCompleted + 99;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }
}
