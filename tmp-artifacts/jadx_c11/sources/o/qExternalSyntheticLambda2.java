package o;

import android.net.Uri;
import im.toss.securities.core.router.spec.TossSecRoute;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class qExternalSyntheticLambda2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final class onWarmupCompleted implements r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
        public boolean IAuthTabCallback(Uri uri, boolean z, boolean z2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 63;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
        public boolean onExtraCallback(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            boolean z = i3 == 0;
            int i4 = onWarmupCompleted + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
        public boolean onExtraCallbackWithResult(Uri uri) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(uri, "");
            return false;
        }

        @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
        public void onWarmupCompleted(TossSecRoute tossSecRoute) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tossSecRoute, "");
            int i4 = onWarmupCompleted + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        onWarmupCompleted() {
        }

        @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
        public /* bridge */ boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 125;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return zOnExtraCallbackWithResult;
        }
    }

    public static final r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU onNavigationEvent(@NotNull r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }
}
