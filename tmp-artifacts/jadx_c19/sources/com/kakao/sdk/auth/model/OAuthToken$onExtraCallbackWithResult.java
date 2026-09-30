package com.kakao.sdk.auth.model;

import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OAuthToken$onExtraCallbackWithResult {
    public /* synthetic */ OAuthToken$onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OAuthToken$onExtraCallbackWithResult() {
    }

    public final KSerializer<OAuthToken> serializer() {
        return OAuthToken$$serializer.INSTANCE;
    }

    public static /* synthetic */ OAuthToken onExtraCallback(OAuthToken$onExtraCallbackWithResult oAuthToken$onExtraCallbackWithResult, AccessTokenResponse accessTokenResponse, OAuthToken oAuthToken, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            oAuthToken = null;
        }
        return oAuthToken$onExtraCallbackWithResult.onNavigationEvent(accessTokenResponse, oAuthToken);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.kakao.sdk.common.model.ClientError */
    public final OAuthToken onNavigationEvent(@NotNull AccessTokenResponse accessTokenResponse, @Nullable OAuthToken oAuthToken) throws ClientError {
        Date dateOnExtraCallback;
        List listOnExtraCallbackWithResult;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(accessTokenResponse, "");
        String strOnExtraCallback = accessTokenResponse.onExtraCallback();
        Date date = new Date(new Date().getTime() + (accessTokenResponse.IAuthTabCallback() * 1000));
        String strOnNavigationEvent = accessTokenResponse.onNavigationEvent();
        if (strOnNavigationEvent == null) {
            strOnNavigationEvent = oAuthToken != null ? oAuthToken.onNavigationEvent() : null;
            if (strOnNavigationEvent == null) {
                throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found in the response.");
            }
        }
        String str = strOnNavigationEvent;
        if (accessTokenResponse.onNavigationEvent() != null) {
            Long lOnExtraCallbackWithResult = accessTokenResponse.onExtraCallbackWithResult();
            dateOnExtraCallback = lOnExtraCallbackWithResult != null ? new Date(new Date().getTime() + (lOnExtraCallbackWithResult.longValue() * 1000)) : new Date();
        } else {
            dateOnExtraCallback = oAuthToken != null ? oAuthToken.onExtraCallback() : null;
            Intrinsics.checkNotNull(dateOnExtraCallback);
        }
        Date date2 = dateOnExtraCallback;
        String strAsBinder = accessTokenResponse.asBinder();
        if (strAsBinder == null || (listSplit$default = StringsKt.split$default(strAsBinder, new String[]{" "}, false, 0, 6, (Object) null)) == null) {
            listOnExtraCallbackWithResult = oAuthToken != null ? oAuthToken.onExtraCallbackWithResult() : null;
        } else {
            listOnExtraCallbackWithResult = listSplit$default;
        }
        return new OAuthToken(strOnExtraCallback, date, str, date2, accessTokenResponse.onWarmupCompleted(), listOnExtraCallbackWithResult);
    }
}
