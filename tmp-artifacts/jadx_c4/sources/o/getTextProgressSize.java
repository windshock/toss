package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface getTextProgressSize {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onNavigationEvent;

    drawTextProgress IAuthTabCallback();

    setUserImplbugsnag_android_core_release IAuthTabCallback(@NotNull String str);

    void IAuthTabCallback(@NotNull drawTextProgress drawtextprogress, @NotNull String str);

    void IAuthTabCallbackDefault();

    boolean IAuthTabCallbackStub();

    void asInterface();

    Double onExtraCallback();

    Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var);

    updateSeverityReason onExtraCallbackWithResult(@NotNull String str);

    boolean onExtraCallbackWithResult();

    Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var);

    trimMetadataStringsTo onNavigationEvent();

    <C> void onNavigationEvent(@NotNull trimMetadataStringsTo trimmetadatastringsto, C c, @NotNull accessgetConfigp<C> accessgetconfigp);

    trimMetadataStringsTo onWarmupCompleted(@Nullable Map<String, String> map);

    void onWarmupCompleted();

    static /* synthetic */ void IAuthTabCallback(getTextProgressSize gettextprogresssize, trimMetadataStringsTo trimmetadatastringsto, Object obj, accessgetConfigp accessgetconfigp, int i, Object obj2) {
        int i2 = 2 % 2;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: injectTraceContext");
        }
        if ((i & 1) != 0) {
            trimmetadatastringsto = trimMetadataStringsTo.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(trimmetadatastringsto, "");
        }
        gettextprogresssize.onNavigationEvent(trimmetadatastringsto, obj, accessgetconfigp);
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        static final /* synthetic */ IAuthTabCallback onNavigationEvent = new IAuthTabCallback();

        static {
            int i = onExtraCallback + 61;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
        }
    }
}
