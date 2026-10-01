package com.kakao.sdk.user;

import com.kakao.sdk.user.model.AccessTokenInfo;
import com.kakao.sdk.user.model.ScopeInfo;
import com.kakao.sdk.user.model.UserResponse;
import com.kakao.sdk.user.model.UserRevokedServiceTerms;
import com.kakao.sdk.user.model.UserServiceTerms;
import com.kakao.sdk.user.model.UserShippingAddresses;
import kotlin.Unit;
import kotlinx.serialization.json.JsonObject;
import o.getCurCert;
import o.getIv8;
import o.getKey4;
import o.getSignPrikeyCCFBPHFilename;
import o.getUserCertOnMemory;
import o.initCertListOnMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface UserApi {
    @initCertListOnMemory(onExtraCallbackWithResult = "/v1/user/access_token_info")
    getSignPrikeyCCFBPHFilename<AccessTokenInfo> accessTokenInfo();

    @initCertListOnMemory(onExtraCallbackWithResult = "/v1/user/check_access_token")
    getSignPrikeyCCFBPHFilename<AccessTokenInfo> checkAccessToken();

    @getIv8(onExtraCallback = "/v1/user/logout")
    getSignPrikeyCCFBPHFilename<Unit> logout();

    @initCertListOnMemory(onExtraCallbackWithResult = "/v2/user/me")
    getSignPrikeyCCFBPHFilename<UserResponse> me(@getKey4(onNavigationEvent = "secure_resource") boolean z, @getKey4(onNavigationEvent = "property_keys") @Nullable String str);

    @getIv8(onExtraCallback = "/v2/user/revoke/scopes")
    @getUserCertOnMemory
    getSignPrikeyCCFBPHFilename<ScopeInfo> revokeScopes(@getCurCert(onExtraCallbackWithResult = "scopes") @NotNull String str);

    @getIv8(onExtraCallback = "/v2/user/revoke/service_terms")
    @getUserCertOnMemory
    getSignPrikeyCCFBPHFilename<UserRevokedServiceTerms> revokeServiceTerms(@getCurCert(onExtraCallbackWithResult = "tags") @NotNull String str);

    @initCertListOnMemory(onExtraCallbackWithResult = "/v2/user/scopes")
    getSignPrikeyCCFBPHFilename<ScopeInfo> scopes(@getKey4(onNavigationEvent = "scopes") @Nullable String str);

    @initCertListOnMemory(onExtraCallbackWithResult = "/v2/user/service_terms")
    getSignPrikeyCCFBPHFilename<UserServiceTerms> serviceTerms(@getKey4(onNavigationEvent = "tags") @Nullable String str, @getKey4(onNavigationEvent = "result") @Nullable String str2);

    @initCertListOnMemory(onExtraCallbackWithResult = "/v1/user/shipping_address")
    getSignPrikeyCCFBPHFilename<UserShippingAddresses> shippingAddresses(@getKey4(onNavigationEvent = "address_id") @Nullable Long l, @getKey4(onNavigationEvent = "from_updated_at") @Nullable String str, @getKey4(onNavigationEvent = "page_size") @Nullable Integer num);

    @getIv8(onExtraCallback = "/v1/user/signup")
    @getUserCertOnMemory
    getSignPrikeyCCFBPHFilename<Unit> signup(@getCurCert(onExtraCallbackWithResult = "properties") @Nullable JsonObject jsonObject);

    @getIv8(onExtraCallback = "/v1/user/unlink")
    getSignPrikeyCCFBPHFilename<Unit> unlink();

    @getIv8(onExtraCallback = "/v1/user/update_profile")
    @getUserCertOnMemory
    getSignPrikeyCCFBPHFilename<Unit> updateProfile(@getCurCert(onExtraCallbackWithResult = "properties") @NotNull JsonObject jsonObject);
}
