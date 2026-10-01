package o;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface CacheCacheResponseBody {
    Context onWarmupCompleted();

    default Resources IAuthTabCallbackDefault() {
        int i = 2 % 2;
        Context contextOnWarmupCompleted = onWarmupCompleted();
        if (contextOnWarmupCompleted != null) {
            return contextOnWarmupCompleted.getResources();
        }
        return null;
    }

    default Context IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        Context contextOnWarmupCompleted = onWarmupCompleted();
        Intrinsics.checkNotNull(contextOnWarmupCompleted);
        return contextOnWarmupCompleted;
    }

    default Resources IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        Resources resources = IAuthTabCallbackStubProxy().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return resources;
    }
}
