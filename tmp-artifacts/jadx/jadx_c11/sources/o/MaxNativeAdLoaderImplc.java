package o;

import im.toss.rn.toss.core.bundle.model.RemoteBundleResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxNativeAdLoaderImplc {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r2.length() > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r2 = r0.onExtraCallbackWithResult();
        r0 = java.lang.Long.valueOf(r0.onExtraCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r0.longValue() > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        return new o.r8lambda4jipudH4a44aIGrlvbWbk0rzTp4(new im.toss.observability.instrumentation.rn.RnBundleInfo(r1, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r24, r6, java.lang.Integer.valueOf(r2), r8, (java.lang.Long) null, (im.toss.observability.instrumentation.rn.RnCause) null, (im.toss.observability.instrumentation.rn.RnBundleInfo.Role) null, (java.util.List) null, (java.lang.Double) null, 7950, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if ((r23 instanceof im.toss.rn.toss.core.bundle.model.RemoteBundleResult.Error) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r16 = (im.toss.rn.toss.core.bundle.model.RemoteBundleResult.Error) r23;
        r1 = new o.r8lambda4jipudH4a44aIGrlvbWbk0rzTp4(new im.toss.observability.instrumentation.rn.RnBundleInfo(im.toss.observability.instrumentation.rn.RnBundleInfo.Source.NETWORK, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r24, (java.lang.String) null, r16.IAuthTabCallback(), (java.lang.Long) null, (java.lang.Long) null, (im.toss.observability.instrumentation.rn.RnCause) null, (im.toss.observability.instrumentation.rn.RnBundleInfo.Role) null, (java.util.List) null, (java.lang.Double) null, 8110, (kotlin.jvm.internal.DefaultConstructorMarker) null), r16.onWarmupCompleted().getClass().getSimpleName());
        r0 = o.MaxNativeAdLoaderImplc.onNavigationEvent + 21;
        o.MaxNativeAdLoaderImplc.onExtraCallbackWithResult = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e4, code lost:
    
        if ((r0 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if ((r23 instanceof im.toss.rn.toss.core.bundle.model.RemoteBundleResult.Success) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if ((r23 instanceof im.toss.rn.toss.core.bundle.model.RemoteBundleResult.Success) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r1 = im.toss.observability.instrumentation.rn.RnBundleInfo.Source.NETWORK;
        r0 = (im.toss.rn.toss.core.bundle.model.RemoteBundleResult.Success) r23;
        r2 = r0.IAuthTabCallback().onExtraCallback();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 onNavigationEvent(@NotNull RemoteBundleResult remoteBundleResult, @NotNull String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(remoteBundleResult, "");
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 32 / 0;
        } else {
            Intrinsics.checkNotNullParameter(remoteBundleResult, "");
            Intrinsics.checkNotNullParameter(str, "");
        }
    }
}
