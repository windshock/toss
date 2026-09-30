package o;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.CallFactory;
import o.CertificatePinner;
import o.CertificatePinnercheck1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface CertificatePinner {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onNavigationEvent;

    CertificatePinnercheck1 build(@NotNull Context context, @NotNull CallFactory callFactory);

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onTransact = 1;
        private static int onWarmupCompleted = 1;
        static final /* synthetic */ IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static final CertificatePinner onExtraCallbackWithResult = new CertificatePinner() { // from class: im.toss.tds.foundation.html.VerticalPaddingSpanBuilder$Companion$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // o.CertificatePinner
            public final CertificatePinnercheck1 build(Context context, CallFactory callFactory) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                CertificatePinnercheck1 certificatePinnercheck1OnExtraCallbackWithResult = CertificatePinner.IAuthTabCallback.onExtraCallbackWithResult(context, callFactory);
                int i4 = onNavigationEvent + 41;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 32 / 0;
                }
                return certificatePinnercheck1OnExtraCallbackWithResult;
            }
        };

        public static /* synthetic */ CertificatePinnercheck1 onExtraCallbackWithResult(Context context, CallFactory callFactory) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CertificatePinnercheck1 certificatePinnercheck1OnNavigationEvent = onNavigationEvent(context, callFactory);
            int i4 = onWarmupCompleted + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return certificatePinnercheck1OnNavigationEvent;
        }

        private IAuthTabCallback() {
        }

        static {
            int i = onExtraCallback + 89;
            onTransact = i % 128;
            int i2 = i % 2;
        }

        public final CertificatePinner onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            CertificatePinner certificatePinner = onExtraCallbackWithResult;
            int i4 = i3 + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 34 / 0;
            }
            return certificatePinner;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
        
            return new o.findMatchingPins(r4, ((o.CallFactory.onExtraCallback) r5).onExtraCallbackWithResult());
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5, o.CallFactory.onExtraCallbackWithResult.IAuthTabCallback) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        
            r4 = o.CertificatePinner.IAuthTabCallback.IAuthTabCallback + 87;
            o.CertificatePinner.IAuthTabCallback.onWarmupCompleted = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if ((r4 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            return o.checkokhttp.onWarmupCompleted(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
            o.checkokhttp.onWarmupCompleted(r1);
            r4 = null;
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5, o.CallFactory.onWarmupCompleted.onExtraCallback) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        
            r4 = o.CertificatePinner.IAuthTabCallback.IAuthTabCallback + 79;
            o.CertificatePinner.IAuthTabCallback.onWarmupCompleted = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        
            if ((r4 % 2) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
        
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
            r5 = 93 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        
            return o.checkokhttp.onWarmupCompleted(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
        
            return o.checkokhttp.onWarmupCompleted(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
        
            throw new kotlin.NoWhenBranchMatchedException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
        
            if ((r5 instanceof o.CallFactory.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
        
            if ((r5 instanceof o.CallFactory.onExtraCallback) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final CertificatePinnercheck1 onNavigationEvent(Context context, CallFactory callFactory) throws NoWhenBranchMatchedException {
            DisplayMetrics displayMetrics;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(callFactory, "");
                displayMetrics = context.getResources().getDisplayMetrics();
                int i3 = 6 / 0;
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(callFactory, "");
                displayMetrics = context.getResources().getDisplayMetrics();
            }
        }
    }
}
