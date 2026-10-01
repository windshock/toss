package o;

import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.network.ExceptionWrapper;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class computeScrollRange implements Interceptor {
    private final LinearLayoutManager IAuthTabCallback;
    private final findFirstPartiallyOrCompletelyInvisibleChild onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public computeScrollRange() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public computeScrollRange(@NotNull findFirstPartiallyOrCompletelyInvisibleChild findfirstpartiallyorcompletelyinvisiblechild, @NotNull LinearLayoutManager linearLayoutManager) {
        Intrinsics.checkNotNullParameter(findfirstpartiallyorcompletelyinvisiblechild, "");
        Intrinsics.checkNotNullParameter(linearLayoutManager, "");
        this.onExtraCallback = findfirstpartiallyorcompletelyinvisiblechild;
        this.IAuthTabCallback = linearLayoutManager;
    }

    public /* synthetic */ computeScrollRange(findFirstPartiallyOrCompletelyInvisibleChild findfirstpartiallyorcompletelyinvisiblechild, LinearLayoutManager linearLayoutManager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? findFirstPartiallyOrCompletelyInvisibleChild.Companion.onExtraCallbackWithResult() : findfirstpartiallyorcompletelyinvisiblechild, (i2 & 2) != 0 ? LinearLayoutManager.Companion.onWarmupCompleted() : linearLayoutManager);
    }

    public Response intercept(@NotNull Interceptor.Chain chain) throws ExceptionWrapper {
        Request requestIAuthTabCallback;
        ApiErrorResponse apiErrorResponse;
        ApiErrorCause apiErrorCause;
        String strOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(chain, "");
        OAuthToken oAuthTokenOnNavigationEvent = this.onExtraCallback.onExtraCallback().onNavigationEvent();
        String strOnWarmupCompleted2 = oAuthTokenOnNavigationEvent != null ? oAuthTokenOnNavigationEvent.onWarmupCompleted() : null;
        if (strOnWarmupCompleted2 == null || (requestIAuthTabCallback = findPartiallyOrCompletelyInvisibleChildClosestToStart.IAuthTabCallback(chain.request(), strOnWarmupCompleted2)) == null) {
            throw new ExceptionWrapper(new ClientError(ClientErrorCause.TokenNotFound, (String) null, 2, (DefaultConstructorMarker) null));
        }
        Response responseProceed = chain.proceed(requestIAuthTabCallback);
        ResponseBody responseBodyBody = responseProceed.body();
        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
        Response responseBuild = responseProceed.newBuilder().body(strString != null ? ResponseBody.Companion.create(strString, responseBodyBody.contentType()) : null).build();
        if (strString != null) {
            ResponseBody.Companion.create(strString, responseBodyBody.contentType());
        }
        if (!responseBuild.isSuccessful()) {
            if (strString != null) {
                wie2 wie2VarIAuthTabCallback = updateLayoutStateToFillEnd.onWarmupCompleted.IAuthTabCallback();
                wie2VarIAuthTabCallback.onExtraCallback();
                apiErrorResponse = (ApiErrorResponse) wie2VarIAuthTabCallback.onExtraCallback(ApiErrorResponse.Companion.serializer(), strString);
            } else {
                apiErrorResponse = null;
            }
            if (apiErrorResponse != null) {
                updateLayoutStateToFillEnd updatelayoutstatetofillend = updateLayoutStateToFillEnd.onWarmupCompleted;
                int iIAuthTabCallback = apiErrorResponse.IAuthTabCallback();
                wie2 wie2VarIAuthTabCallback2 = updatelayoutstatetofillend.IAuthTabCallback();
                wie2VarIAuthTabCallback2.onExtraCallback();
                apiErrorCause = (ApiErrorCause) wie2VarIAuthTabCallback2.onExtraCallback(ApiErrorCause.Companion.serializer(), String.valueOf(iIAuthTabCallback));
            } else {
                apiErrorCause = null;
            }
            if (apiErrorCause != null && new ApiError(responseBuild.code(), apiErrorCause, apiErrorResponse).onWarmupCompleted() == ApiErrorCause.InvalidToken) {
                synchronized (this) {
                    OAuthToken oAuthTokenOnNavigationEvent2 = this.onExtraCallback.onExtraCallback().onNavigationEvent();
                    if (oAuthTokenOnNavigationEvent2 != null) {
                        if (Intrinsics.areEqual(oAuthTokenOnNavigationEvent2.onWarmupCompleted(), strOnWarmupCompleted2)) {
                            try {
                                strOnWarmupCompleted = this.IAuthTabCallback.onNavigationEvent(oAuthTokenOnNavigationEvent2).onWarmupCompleted();
                            } catch (Throwable th) {
                                throw new ExceptionWrapper(th);
                            }
                        } else {
                            strOnWarmupCompleted = oAuthTokenOnNavigationEvent2.onWarmupCompleted();
                        }
                        if (!StringsKt.contains$default(requestIAuthTabCallback.url().toString(), "/v1/user/check_access_token", false, 2, (Object) null)) {
                            return chain.proceed(findPartiallyOrCompletelyInvisibleChildClosestToStart.IAuthTabCallback(requestIAuthTabCallback, strOnWarmupCompleted));
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    return responseBuild;
                }
            }
        }
        return responseBuild;
    }
}
