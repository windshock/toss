package o;

import im.toss.components.tuba.variable.v2.spec.DefaultVar;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFe1vSDKAFa1tSDK extends setCompositionTask {
    @Deprecated
    static /* synthetic */ Object onNavigationEvent(AFe1vSDKAFa1tSDK aFe1vSDKAFa1tSDK, String str, access13800<? super String> access13800Var) {
        int i = 2 % 2;
        return null;
    }

    Object onExtraCallbackWithResult(@NotNull getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr, @NotNull access13800<? super Map<String, String>> access13800Var);

    List<DefaultVar> onExtraCallbackWithResult();

    @Deprecated
    default Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super String> access13800Var) {
        int i = 2 % 2;
        return onNavigationEvent(this, str, access13800Var);
    }

    Object onNavigationEvent(@NotNull getAdvertisingId.IAuthTabCallback iAuthTabCallback, @NotNull access13800<? super String> access13800Var);

    @Deprecated
    default Object onNavigationEvent(@NotNull String[] strArr, @NotNull access13800<? super Map<String, String>> access13800Var) {
        int i = 2 % 2;
        return onExtraCallbackWithResult(this, strArr, access13800Var);
    }

    @Deprecated
    static /* synthetic */ Object onExtraCallbackWithResult(AFe1vSDKAFa1tSDK aFe1vSDKAFa1tSDK, String[] strArr, access13800<? super Map<String, String>> access13800Var) {
        int i = 2 % 2;
        return access8000.IAuthTabCallback();
    }
}
