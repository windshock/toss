package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WorkerWrapperExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[WorkerParameters.values().length];
            try {
                iArr[WorkerParameters.FACE_PAY_SILENT_PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerParameters.USER_GROWTH_SILENT_PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerParameters.APP_STATE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerParameters.WEB_BRIDGE.ordinal()] = 4;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerParameters.UNKNOWN.ordinal()] = 5;
                int i2 = onNavigationEvent + 65;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            IAuthTabCallback = iArr;
            int i4 = onNavigationEvent + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r1 = o.WorkerWrapperExternalSyntheticLambda0.onExtraCallback + 51;
        o.WorkerWrapperExternalSyntheticLambda0.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r7 == 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r7 == 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r7 != 5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r1 = new java.lang.Object[]{o.DERSet.onExtraCallback};
        r6 = o.getKekid.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        return ((java.lang.Boolean) o.DERSet.onExtraCallback(-1673623967, r1, 1673623983, o.getKekid.onExtraCallback(), o.getKekid.onExtraCallback(), o.getKekid.onExtraCallback(), r6)).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r7 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r7 == 2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onNavigationEvent(@NotNull WorkerParameters workerParameters) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(workerParameters, "");
            i = IAuthTabCallback.IAuthTabCallback[workerParameters.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(workerParameters, "");
            i = IAuthTabCallback.IAuthTabCallback[workerParameters.ordinal()];
        }
    }
}
