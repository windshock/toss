package o;

import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import o._string;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setReferrerUID {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:3:0x0003, B:6:0x001a, B:8:0x0040, B:12:0x0055, B:18:0x006e, B:20:0x0078, B:16:0x0064, B:21:0x0080), top: B:31:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Date onNavigationEvent(@Nullable String str) {
        Object objM31constructorimpl;
        CommonModule_closeView commonModule_closeView;
        Date dateOnWarmupCompleted;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            commonModule_closeView = CommonModule_closeView.onWarmupCompleted;
            dateOnWarmupCompleted = setCampaign.onWarmupCompleted(commonModule_closeView.access100(), str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (dateOnWarmupCompleted == null) {
            int i2 = IAuthTabCallback + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            dateOnWarmupCompleted = setCampaign.onWarmupCompleted((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1967451168, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{commonModule_closeView}, _string.onNavigationEvent.IAuthTabCallback()), str);
            if (dateOnWarmupCompleted == null && (dateOnWarmupCompleted = setCampaign.onWarmupCompleted(commonModule_closeView.onNavigationEvent(), str)) == null) {
                int i4 = IAuthTabCallback + 69;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    dateOnWarmupCompleted = setCampaign.onWarmupCompleted(commonModule_closeView.asInterface(), str);
                    int i5 = 87 / 0;
                    if (dateOnWarmupCompleted == null) {
                        dateOnWarmupCompleted = setCampaign.onWarmupCompleted(commonModule_closeView.onTransact(), str);
                        if (dateOnWarmupCompleted == null) {
                            dateOnWarmupCompleted = setCampaign.onWarmupCompleted(commonModule_closeView.getInterfaceDescriptor(), str);
                        }
                    }
                } else {
                    dateOnWarmupCompleted = setCampaign.onWarmupCompleted(commonModule_closeView.asInterface(), str);
                    if (dateOnWarmupCompleted == null) {
                    }
                }
                if (!(!Result.onExtraCallback(objM31constructorimpl))) {
                    objM31constructorimpl = null;
                }
                return (Date) objM31constructorimpl;
            }
        }
        objM31constructorimpl = Result.m31constructorimpl(dateOnWarmupCompleted);
        if (!(!Result.onExtraCallback(objM31constructorimpl))) {
        }
        return (Date) objM31constructorimpl;
    }
}
