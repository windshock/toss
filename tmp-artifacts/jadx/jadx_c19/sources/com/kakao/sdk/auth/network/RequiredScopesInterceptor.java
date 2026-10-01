package com.kakao.sdk.auth.network;

import android.content.Context;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.model.ApplicationContextInfo;
import com.kakao.sdk.network.ExceptionWrapper;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.GridLayoutManager;
import o.findPartiallyOrCompletelyInvisibleChildClosestToStart;
import o.fixLayoutStartGap;
import o.getOldListSize;
import o.updateLayoutStateToFillEnd;
import o.wie2;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RequiredScopesInterceptor implements Interceptor {
    private final ApplicationContextInfo onNavigationEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    public RequiredScopesInterceptor() {
        ApplicationContextInfo applicationContextInfo = null;
        this(applicationContextInfo, 1, applicationContextInfo);
    }

    public RequiredScopesInterceptor(@NotNull ApplicationContextInfo applicationContextInfo) {
        Intrinsics.checkNotNullParameter(applicationContextInfo, "");
        this.onNavigationEvent = applicationContextInfo;
    }

    public /* synthetic */ RequiredScopesInterceptor(ApplicationContextInfo applicationContextInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? fixLayoutStartGap.onNavigationEvent.onExtraCallbackWithResult() : applicationContextInfo);
    }

    public Response intercept(@NotNull Interceptor.Chain chain) throws InterruptedException, ExceptionWrapper {
        ApiErrorResponse apiErrorResponse;
        String strOnWarmupCompleted;
        Response responseProceed;
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseProceed2 = chain.proceed(chain.request());
        ResponseBody responseBodyBody = responseProceed2.body();
        ApiErrorCause apiErrorCause = null;
        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
        Response responseBuild = responseProceed2.newBuilder().body(strString != null ? ResponseBody.Companion.create(strString, responseBodyBody.contentType()) : null).build();
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
            }
            if (apiErrorCause != null) {
                ApiError apiError = new ApiError(responseBuild.code(), apiErrorCause, apiErrorResponse);
                final List listOnExtraCallback = apiError.onExtraCallbackWithResult().onExtraCallback();
                if (apiError.onWarmupCompleted() == ApiErrorCause.InsufficientScope) {
                    List list = listOnExtraCallback;
                    if (list == null || list.isEmpty()) {
                        ApiErrorCause apiErrorCause2 = ApiErrorCause.Unknown;
                        throw new ExceptionWrapper(new ApiError(apiError.onNavigationEvent(), apiErrorCause2, new ApiErrorResponse(apiErrorCause2.getErrorCode(), "requiredScopes not exist", (String) null, apiError.onExtraCallbackWithResult().onExtraCallback(), apiError.onExtraCallbackWithResult().onWarmupCompleted(), 4, (DefaultConstructorMarker) null)));
                    }
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    getOldListSize.Companion.onExtraCallbackWithResult().IAuthTabCallback(new Function2<String, Throwable, Unit>() { // from class: com.kakao.sdk.auth.network.RequiredScopesInterceptor$intercept$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                            onExtraCallbackWithResult((String) obj, (Throwable) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void onExtraCallbackWithResult(@Nullable String str, @Nullable Throwable th) throws Throwable {
                            if (th != null) {
                                objectRef2.element = th;
                                countDownLatch.countDown();
                                return;
                            }
                            GridLayoutManager.onNavigationEvent onnavigationevent = GridLayoutManager.Companion;
                            final String strOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
                            GridLayoutManager gridLayoutManagerOnNavigationEvent = onnavigationevent.onNavigationEvent();
                            Context contextIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback();
                            List<String> list2 = listOnExtraCallback;
                            final Ref.ObjectRef<Throwable> objectRef3 = objectRef2;
                            final CountDownLatch countDownLatch2 = countDownLatch;
                            final Ref.ObjectRef<OAuthToken> objectRef4 = objectRef;
                            GridLayoutManager.onNavigationEvent(gridLayoutManagerOnNavigationEvent, contextIAuthTabCallback, null, list2, null, str, null, null, null, strOnExtraCallbackWithResult, null, new Function2<String, Throwable, Unit>() { // from class: com.kakao.sdk.auth.network.RequiredScopesInterceptor$intercept$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    onWarmupCompleted((String) obj, (Throwable) obj2);
                                    return Unit.INSTANCE;
                                }

                                public final void onWarmupCompleted(@Nullable String str2, @Nullable Throwable th2) {
                                    if (th2 != null) {
                                        objectRef3.element = th2;
                                        countDownLatch2.countDown();
                                        return;
                                    }
                                    getOldListSize getoldlistsizeOnExtraCallbackWithResult = getOldListSize.Companion.onExtraCallbackWithResult();
                                    Intrinsics.checkNotNull(str2);
                                    String str3 = strOnExtraCallbackWithResult;
                                    final Ref.ObjectRef<OAuthToken> objectRef5 = objectRef4;
                                    final Ref.ObjectRef<Throwable> objectRef6 = objectRef3;
                                    final CountDownLatch countDownLatch3 = countDownLatch2;
                                    getoldlistsizeOnExtraCallbackWithResult.onExtraCallbackWithResult(str2, str3, new Function2<OAuthToken, Throwable, Unit>() { // from class: com.kakao.sdk.auth.network.RequiredScopesInterceptor.intercept.1.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            onNavigationEvent((OAuthToken) obj, (Throwable) obj2);
                                            return Unit.INSTANCE;
                                        }

                                        public final void onNavigationEvent(@Nullable OAuthToken oAuthToken, @Nullable Throwable th3) {
                                            objectRef5.element = oAuthToken;
                                            objectRef6.element = th3;
                                            countDownLatch3.countDown();
                                        }
                                    });
                                }
                            }, 746, null);
                        }
                    });
                    countDownLatch.await();
                    OAuthToken oAuthToken = (OAuthToken) objectRef.element;
                    if (oAuthToken != null && (strOnWarmupCompleted = oAuthToken.onWarmupCompleted()) != null && (responseProceed = chain.proceed(findPartiallyOrCompletelyInvisibleChildClosestToStart.IAuthTabCallback(responseBuild.request(), strOnWarmupCompleted))) != null) {
                        return responseProceed;
                    }
                    Object obj = objectRef2.element;
                    Intrinsics.checkNotNull(obj);
                    throw new ExceptionWrapper((Throwable) obj);
                }
            }
        }
        return responseBuild;
    }
}
