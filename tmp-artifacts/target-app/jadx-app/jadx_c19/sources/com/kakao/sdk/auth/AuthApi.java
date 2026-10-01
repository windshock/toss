package com.kakao.sdk.auth;

import com.kakao.sdk.auth.model.AccessTokenResponse;
import com.kakao.sdk.auth.model.AgtResponse;
import com.kakao.sdk.auth.model.PrepareResponse;
import o.getCurCert;
import o.getIv8;
import o.getSignPrikeyCCFBPHFilename;
import o.getUserCertOnMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AuthApi {
    @getIv8(onExtraCallback = "api/agt")
    @getUserCertOnMemory
    getSignPrikeyCCFBPHFilename<AgtResponse> agt(@getCurCert(onExtraCallbackWithResult = "client_id") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "access_token") @NotNull String str2);

    @getIv8(onExtraCallback = "oauth/token")
    @getUserCertOnMemory
    getSignPrikeyCCFBPHFilename<AccessTokenResponse> issueAccessToken(@getCurCert(onExtraCallbackWithResult = "client_id") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "android_key_hash") @NotNull String str2, @getCurCert(onExtraCallbackWithResult = "code") @NotNull String str3, @getCurCert(onExtraCallbackWithResult = "redirect_uri") @NotNull String str4, @getCurCert(onExtraCallbackWithResult = "code_verifier") @Nullable String str5, @getCurCert(onExtraCallbackWithResult = "approval_type") @Nullable String str6, @getCurCert(onExtraCallbackWithResult = "grant_type") @NotNull String str7);

    @getIv8(onExtraCallback = "oauth/authorize/prepare")
    @getUserCertOnMemory
    getSignPrikeyCCFBPHFilename<PrepareResponse> prepare(@getCurCert(onExtraCallbackWithResult = "client_id") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "settle_id") @Nullable String str2, @getCurCert(onExtraCallbackWithResult = "sign_identify_items") @Nullable String str3, @getCurCert(onExtraCallbackWithResult = "sign_data") @Nullable String str4, @getCurCert(onExtraCallbackWithResult = "tx_id") @Nullable String str5, @getCurCert(onExtraCallbackWithResult = "cert_type") @NotNull String str6);

    @getIv8(onExtraCallback = "oauth/token")
    @getUserCertOnMemory
    getSignPrikeyCCFBPHFilename<AccessTokenResponse> refreshToken(@getCurCert(onExtraCallbackWithResult = "client_id") @NotNull String str, @getCurCert(onExtraCallbackWithResult = "android_key_hash") @NotNull String str2, @getCurCert(onExtraCallbackWithResult = "refresh_token") @NotNull String str3, @getCurCert(onExtraCallbackWithResult = "approval_type") @Nullable String str4, @getCurCert(onExtraCallbackWithResult = "grant_type") @NotNull String str5);

    public static final class onExtraCallback {
        public static /* synthetic */ getSignPrikeyCCFBPHFilename onNavigationEvent(AuthApi authApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
            if (obj == null) {
                return authApi.issueAccessToken(str, str2, str3, str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? "authorization_code" : str7);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: issueAccessToken");
        }

        public static /* synthetic */ getSignPrikeyCCFBPHFilename onWarmupCompleted(AuthApi authApi, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshToken");
            }
            if ((i2 & 8) != 0) {
                str4 = null;
            }
            String str6 = str4;
            if ((i2 & 16) != 0) {
                str5 = "refresh_token";
            }
            return authApi.refreshToken(str, str2, str3, str6, str5);
        }
    }
}
