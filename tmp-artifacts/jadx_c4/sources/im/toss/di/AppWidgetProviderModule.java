package im.toss.di;

import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.getPricingPhaseList;
import o.setUsed;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppWidgetProviderModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        static {
            int[] iArr = new int[getPricingPhaseList.values().length];
            try {
                iArr[getPricingPhaseList.KR.ordinal()] = 1;
                int i = onExtraCallback + 97;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPricingPhaseList.AU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getPricingPhaseList.EU.ordinal()] = 3;
                int i3 = onExtraCallback + 63;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getPricingPhaseList.JP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
            int i6 = onExtraCallbackWithResult + 71;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r4 == 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r1 = im.toss.di.AppWidgetProviderModule.IAuthTabCallback + 9;
        im.toss.di.AppWidgetProviderModule.onExtraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r4 != 5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r4 != 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        return new o.setProductId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        return new o.getIncludeSuspendedSubscriptions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r4 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r4 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r4 == 2) goto L22;
     */
    @Singleton
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final setUsed onWarmupCompleted(@NotNull getPricingPhaseList getpricingphaselist) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getpricingphaselist, "");
            i = onExtraCallbackWithResult.IAuthTabCallback[getpricingphaselist.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(getpricingphaselist, "");
            i = onExtraCallbackWithResult.IAuthTabCallback[getpricingphaselist.ordinal()];
        }
    }
}
