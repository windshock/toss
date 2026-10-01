package o;

import kotlin.jvm.internal.Intrinsics;
import o.r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaI_riJwGSTfIBpj9mrqkT4n4SVDY {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ CharSequence IAuthTabCallback(r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = onExtraCallbackWithResult + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return charSequenceOnExtraCallbackWithResult;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(onextracallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent(onextracallback);
        int i3 = onExtraCallback + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
        }
        return charSequenceOnNavigationEvent;
    }

    private static final CharSequence onExtraCallbackWithResult(r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e, "");
        String str = r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e.onExtraCallback().name() + " " + setLogBuffers.onPostMessage(r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e.IAuthTabCallback());
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return str;
    }

    private static final CharSequence onNavigationEvent(r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        String strOnExtraCallback = onextracallback.onExtraCallback();
        String strOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null) {
            strOnExtraCallbackWithResult = onextracallback.IAuthTabCallback() + "-" + onextracallback.onNavigationEvent();
        }
        String str = strOnExtraCallback + "=" + strOnExtraCallbackWithResult;
        int i4 = onExtraCallbackWithResult + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        return r12.IAuthTabCallback() + " " + kotlin.collections.CollectionsKt.joinToString$default(r12.onExtraCallback(), (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new im.toss.securities.libs.performance.tracker.domain.PerformanceTracingDataKt$$ExternalSyntheticLambda0(), 31, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if ((r12 instanceof o.r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        r12 = (o.r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks) r12;
        r12 = r12.onExtraCallback() + " " + kotlin.collections.CollectionsKt.joinToString$default(r12.onWarmupCompleted(), (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new im.toss.securities.libs.performance.tracker.domain.PerformanceTracingDataKt$$ExternalSyntheticLambda1(), 31, (java.lang.Object) null);
        r1 = o.r8lambdaI_riJwGSTfIBpj9mrqkT4n4SVDY.onExtraCallback + 53;
        o.r8lambdaI_riJwGSTfIBpj9mrqkT4n4SVDY.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        return r12.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if ((r12 instanceof o.r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r12 instanceof o.r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r12 = (o.r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg) r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onNavigationEvent(@NotNull r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, "");
            int i3 = 56 / 0;
        } else {
            Intrinsics.checkNotNullParameter(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, "");
        }
    }
}
