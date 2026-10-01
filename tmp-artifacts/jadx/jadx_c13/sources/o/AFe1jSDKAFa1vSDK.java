package o;

import im.toss.tosssecurities.network.domain.SecuritiesApiError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1jSDKAFa1vSDK {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static final boolean IAuthTabCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Object obj = null;
        SecuritiesApiError securitiesApiError = th instanceof SecuritiesApiError ? (SecuritiesApiError) th : null;
        if (securitiesApiError == null) {
            int i2 = onExtraCallback + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (securitiesApiError.onNavigationEvent() == 400) {
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            String strOnWarmupCompleted = securitiesApiError.onWarmupCompleted();
            if (i5 == 0) {
                strOnWarmupCompleted.length();
                obj.hashCode();
                throw null;
            }
            if (strOnWarmupCompleted.length() == 0) {
                int i6 = onExtraCallback + 21;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        int i8 = IAuthTabCallback + 97;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }
}
