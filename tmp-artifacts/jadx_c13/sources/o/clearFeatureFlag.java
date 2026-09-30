package o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import im.toss.verify.account.impl.AccountVerificationFragment;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearFeatureFlag implements setGridCheckStatus {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @Inject
    public clearFeatureFlag() {
    }

    public Fragment onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AccountVerificationFragment accountVerificationFragment = new AccountVerificationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_REFERRER", str);
        bundle.putString("EXTRA_SERVICE_REFERRER", str2);
        bundle.putString("EXTRA_REQUEST_CODE", str3);
        bundle.putSerializable("EXTRA_BANK_LIST_FILTER_TYPE", checkDeviceBrand.Companion.onWarmupCompleted(i));
        bundle.putBoolean("EXTRA_START_AUTO_YN", z);
        bundle.putBoolean("EXTRA_CONNECT_CUSTOMER_SERVICE", z2);
        accountVerificationFragment.setArguments(bundle);
        int i3 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return accountVerificationFragment;
    }
}
