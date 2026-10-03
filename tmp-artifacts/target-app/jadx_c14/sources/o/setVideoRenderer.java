package o;

import im.toss.network.model.BaseApiResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest;
import viva.republica.toss.network.model.login.GlobalCoreResetPasswordResponse;
import viva.republica.toss.network.model.login.ResetPasswordResp;
import viva.republica.toss.network.model.user.LogoutReq;
import viva.republica.toss.network.model.user.PasswordMatchLogReq;
import viva.republica.toss.network.model.user.PasswordMatchLogRes;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface setVideoRenderer {
    @getIv8(onExtraCallback = "v3/core/device/web-key/issue")
    @getUserCertOnMemory
    @gf
    Object IAuthTabCallback(@getCurCert(onExtraCallbackWithResult = "timestamp") @NotNull String str, @NotNull access13800<? super BaseApiResponse<showActionSheetWithOptions>> access13800Var);

    @getIv8(onExtraCallback = "v3/core/device/web-key/verify")
    @gf
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/core/users/identifier")
    @getUserCertOnMemory
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getCurCert(onExtraCallbackWithResult = "androidAdId") @NotNull String str);

    @getIv8(onExtraCallback = "v3/core/users-auth/delete/forced-new-password-format")
    @getUserCertOnMemory
    @gf
    Object onExtraCallback(@getCurCert(onExtraCallbackWithResult = "userNo") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "rawDeviceId") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/core/users/password/reset")
    writeRaw<BaseApiResponse<GlobalCoreResetPasswordResponse>> onExtraCallback(@getUserCertList @NotNull GlobalCoreResetPasswordRequest globalCoreResetPasswordRequest);

    @getIv8(onExtraCallback = "v3/core/users/timezone/sync")
    @getUserCertOnMemory
    Object onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "timezone") @NotNull String str, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/core/users-auth/update/forced-new-password-format")
    @getUserCertOnMemory
    @gf
    Object onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "passwordFormat") @NotNull nativeReadByte nativereadbyte, @getCurCert(onExtraCallbackWithResult = "userNo") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "rawDeviceId") @NotNull String str2, @NotNull access13800<? super BaseApiResponse<Boolean>> access13800Var);

    @getIv8(onExtraCallback = "v3/core/users/password/reset")
    @getUserCertOnMemory
    @gf
    writeRaw<ResetPasswordResp> onExtraCallbackWithResult(@getCurCert(onExtraCallbackWithResult = "type") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "password") @NotNull String str2, @getCurCert(onExtraCallbackWithResult = "passwordFormat") @NotNull nativeReadByte nativereadbyte, @getCurCert(onExtraCallbackWithResult = "currentPassword") @Nullable String str3, @getCurCert(onExtraCallbackWithResult = "currentPasswordFormat") @NotNull nativeReadByte nativereadbyte2, @getUserCert @NotNull Map<String, String> map);

    @getIv8(onExtraCallback = "v3/core/users-auth/logout")
    writeRaw<BaseApiResponse<Object>> onExtraCallbackWithResult(@getUserCertList @NotNull LogoutReq logoutReq);

    @getIv8(onExtraCallback = "v3/core/users-auth/biometric/add-match-log")
    writeRaw<BaseApiResponse<PasswordMatchLogRes>> onNavigationEvent(@getUserCertList @NotNull PasswordMatchLogReq passwordMatchLogReq);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/core/users/push-token/update")
    @getUserCertOnMemory
    Object onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "pushToken") @Nullable String str, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "v3/core/users-auth/password/add-match-log")
    writeRaw<BaseApiResponse<PasswordMatchLogRes>> onWarmupCompleted(@getUserCertList @NotNull PasswordMatchLogReq passwordMatchLogReq);

    static /* synthetic */ Object onWarmupCompleted(setVideoRenderer setvideorenderer, String str, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: issueWebKeys");
        }
        if ((i & 1) != 0) {
            str = String.valueOf(zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        }
        return setvideorenderer.IAuthTabCallback(str, access13800Var);
    }

    static /* synthetic */ Object onExtraCallbackWithResult(setVideoRenderer setvideorenderer, nativeReadByte nativereadbyte, String str, String str2, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changePasswordFormat");
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return setvideorenderer.onExtraCallbackWithResult(nativereadbyte, str, str2, access13800Var);
    }

    static /* synthetic */ writeRaw IAuthTabCallback(setVideoRenderer setvideorenderer, String str, String str2, nativeReadByte nativereadbyte, String str3, nativeReadByte nativereadbyte2, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetPassword");
        }
        if ((i & 32) != 0) {
            map = access8100.onNavigationEvent();
        }
        return setvideorenderer.onExtraCallbackWithResult(str, str2, nativereadbyte, str3, nativereadbyte2, map);
    }
}
