package okhttp3.internal;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import o.TTAppOpenAdTransActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IsProbablyUtf8Kt {
    public static /* synthetic */ boolean isProbablyUtf8$default(TTAppOpenAdTransActivity tTAppOpenAdTransActivity, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = LongCompanionObject.MAX_VALUE;
        }
        return isProbablyUtf8(tTAppOpenAdTransActivity, j);
    }

    public static final boolean isProbablyUtf8(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        try {
            TTAppOpenAdTransActivity interfaceDescriptor = tTAppOpenAdTransActivity.getInterfaceDescriptor();
            for (long j2 = 0; j2 < j; j2++) {
                if (interfaceDescriptor.IAuthTabCallback_Parcel()) {
                    return true;
                }
                int iICustomTabsCallbackStub = interfaceDescriptor.ICustomTabsCallbackStub();
                if (Character.isISOControl(iICustomTabsCallbackStub) && !Character.isWhitespace(iICustomTabsCallbackStub)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
