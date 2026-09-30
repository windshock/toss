package o;

import im.toss.network.model.BaseApiResponse;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface AppContext {
    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @GetLicenseInfo
    @getIv8(onExtraCallback = "https://payapi-public.toss.im/api-public/v3/offpay/signature/image/upload")
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "Authorization") @Nullable String str, @assets @NotNull MultipartBody.Part part, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @initCertListOnMemory(onExtraCallbackWithResult = "https://payapi-public.toss.im/api-public/v3/offpay/signature/image/download")
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "Authorization") @Nullable String str, @NotNull access13800<? super ResponseBody> access13800Var);
}
