package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.shopping.BubbleNextAvailableResponse;
import viva.republica.toss.network.model.shopping.GlobalToastV2Response;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface withRewardedAdListener {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/shopping-growth/nnpu/bubble")
    Object IAuthTabCallback(@getKey4(onNavigationEvent = "from") @Nullable String str, @NotNull access13800<? super BaseApiResponse<GlobalToastV2Response>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/shopping-growth/toast/close")
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/shopping-growth/global-toast/bubble/type-override")
    Object onExtraCallback(@getKey4(onNavigationEvent = "type") @NotNull String str, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/shopping-growth/global-toast/bubble/type-override/delete")
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/shopping-growth/global-toast/bubble/next-available")
    Object onNavigationEvent(@NotNull access13800<? super BaseApiResponse<BubbleNextAvailableResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/shopping-growth/global-toast/bubble/reset")
    Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<Object>> access13800Var);
}
