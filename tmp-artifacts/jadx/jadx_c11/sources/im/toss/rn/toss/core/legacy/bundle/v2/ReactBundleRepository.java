package im.toss.rn.toss.core.legacy.bundle.v2;

import java.util.Date;
import kotlin.Deprecated;
import kotlin.Unit;
import o.access13800;
import o.hExternalSyntheticLambda8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface ReactBundleRepository {

    @Deprecated
    public interface EntryPoint {
        ReactBundleRepository ComponentActivityExternalSyntheticLambda1();
    }

    void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3);

    Object onNavigationEvent(@NotNull String str, boolean z, @Nullable Long l, @Nullable Date date, @NotNull String str2, @NotNull String str3, @NotNull access13800<? super hExternalSyntheticLambda8> access13800Var);

    Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var);

    static /* synthetic */ Object onNavigationEvent(ReactBundleRepository reactBundleRepository, String str, boolean z, Long l, Date date, String str2, String str3, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj == null) {
            return reactBundleRepository.onNavigationEvent(str, z, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : date, str2, str3, access13800Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBundle");
    }
}
