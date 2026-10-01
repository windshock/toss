package im.toss.rn.toss.core.legacy.bundle.v2;

import android.content.Context;
import im.toss.rn.spec.ReactAuBundleVerificationKey;
import im.toss.rn.spec.ReactBankBundleVerificationKey;
import im.toss.rn.spec.ReactBundleVerificationKey;
import java.security.PublicKey;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactBuiltInBundleSourceImpl implements ReactBuiltInBundleSource {
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent;
    private final PublicKey IAuthTabCallback;
    private final PublicKey onExtraCallback;
    private final PublicKey onExtraCallbackWithResult;
    private final Context onWarmupCompleted;

    @Inject
    public ReactBuiltInBundleSourceImpl(@NotNull Context context, @ReactBundleVerificationKey @NotNull PublicKey publicKey, @ReactBankBundleVerificationKey @NotNull PublicKey publicKey2, @ReactAuBundleVerificationKey @NotNull PublicKey publicKey3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(publicKey, "");
        Intrinsics.checkNotNullParameter(publicKey2, "");
        Intrinsics.checkNotNullParameter(publicKey3, "");
        this.onWarmupCompleted = context;
        this.onExtraCallback = publicKey;
        this.IAuthTabCallback = publicKey2;
        this.onExtraCallbackWithResult = publicKey3;
    }

    public static final /* synthetic */ Context IAuthTabCallback(ReactBuiltInBundleSourceImpl reactBuiltInBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Context context = reactBuiltInBundleSourceImpl.onWarmupCompleted;
        if (i4 != 0) {
            int i5 = 47 / 0;
        }
        int i6 = i2 + 61;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return context;
        }
        throw null;
    }

    @Override // im.toss.rn.toss.core.legacy.bundle.v2.ReactBuiltInBundleSource
    public Object onExtraCallback(@NotNull String str, @Nullable Date date, @NotNull String str2, @NotNull String str3, @NotNull access13800<? super ReactBundle> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new ReactBuiltInBundleSourceImpl$getBundle$2(str2, str3, str, this, date, null), access13800Var);
        int i2 = IAuthTabCallbackDefault + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
