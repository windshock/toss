package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class priorityUpload {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[priorityUploadRate.values().length];
            try {
                iArr[priorityUploadRate.PM.ordinal()] = 1;
                int i = onExtraCallback + 103;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 / 3;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[priorityUploadRate.AM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r3 = o.priorityUpload.onWarmupCompleted + 93;
        o.priorityUpload.IAuthTabCallback = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        return o.AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(im.toss.feature.credit.ui.main.R.string.credit_consulting_am);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        return o.AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(im.toss.feature.credit.ui.main.R.string.credit_consulting_pm);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r3 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r3 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r3 != 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onNavigationEvent(@NotNull priorityUploadRate priorityuploadrate) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(priorityuploadrate, "");
            i = onWarmupCompleted.onExtraCallbackWithResult[priorityuploadrate.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(priorityuploadrate, "");
            i = onWarmupCompleted.onExtraCallbackWithResult[priorityuploadrate.ordinal()];
        }
    }
}
