package o;

import com.kakao.sdk.auth.AuthApi;
import com.kakao.sdk.auth.model.AccessTokenResponse;
import com.kakao.sdk.auth.model.AgtResponse;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.auth.model.OAuthToken$onExtraCallbackWithResult;
import com.kakao.sdk.common.model.ApprovalType;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.AuthErrorCause;
import com.kakao.sdk.common.model.AuthErrorResponse;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import retrofit2.Response;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LinearLayoutManager {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final Lazy<LinearLayoutManager> onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(onWarmupCompleted.onNavigationEvent);
    private final layoutForPredictiveAnimations IAuthTabCallback;
    private final logChildren onExtraCallback;
    private final AuthApi onNavigationEvent;
    private final findFirstPartiallyOrCompletelyInvisibleChild onTransact;
    private final ApprovalType onWarmupCompleted;

    public LinearLayoutManager() {
        this(null, null, null, null, null, 31, null);
    }

    public LinearLayoutManager(@NotNull AuthApi authApi, @NotNull findFirstPartiallyOrCompletelyInvisibleChild findfirstpartiallyorcompletelyinvisiblechild, @NotNull layoutForPredictiveAnimations layoutforpredictiveanimations, @NotNull logChildren logchildren, @NotNull ApprovalType approvalType) {
        Intrinsics.checkNotNullParameter(authApi, "");
        Intrinsics.checkNotNullParameter(findfirstpartiallyorcompletelyinvisiblechild, "");
        Intrinsics.checkNotNullParameter(layoutforpredictiveanimations, "");
        Intrinsics.checkNotNullParameter(logchildren, "");
        Intrinsics.checkNotNullParameter(approvalType, "");
        this.onNavigationEvent = authApi;
        this.onTransact = findfirstpartiallyorcompletelyinvisiblechild;
        this.IAuthTabCallback = layoutforpredictiveanimations;
        this.onExtraCallback = logchildren;
        this.onWarmupCompleted = approvalType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LinearLayoutManager(AuthApi authApi, findFirstPartiallyOrCompletelyInvisibleChild findfirstpartiallyorcompletelyinvisiblechild, layoutForPredictiveAnimations layoutforpredictiveanimations, logChildren logchildren, ApprovalType approvalType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            Object objOnNavigationEvent = getChildClosestToEnd.onNavigationEvent(canScrollHorizontally.onExtraCallback).onNavigationEvent(AuthApi.class);
            Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, "");
            authApi = (AuthApi) objOnNavigationEvent;
        }
        this(authApi, (i2 & 2) != 0 ? findFirstPartiallyOrCompletelyInvisibleChild.Companion.onExtraCallbackWithResult() : findfirstpartiallyorcompletelyinvisiblechild, (i2 & 4) != 0 ? fixLayoutStartGap.onNavigationEvent.onExtraCallbackWithResult() : layoutforpredictiveanimations, (i2 & 8) != 0 ? fixLayoutStartGap.onNavigationEvent.onExtraCallbackWithResult() : logchildren, (i2 & 16) != 0 ? fixLayoutStartGap.onNavigationEvent.onExtraCallback() : approvalType);
    }

    public final findFirstPartiallyOrCompletelyInvisibleChild IAuthTabCallback() {
        return this.onTransact;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable String str2, @NotNull Function2<? super OAuthToken, ? super Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        AuthApi.onExtraCallback.onNavigationEvent(this.onNavigationEvent, this.IAuthTabCallback.onExtraCallbackWithResult(), this.onExtraCallback.IAuthTabCallbackStub(), str, this.IAuthTabCallback.IAuthTabCallbackDefault(), str2, this.onWarmupCompleted.onExtraCallbackWithResult(), null, 64, null).enqueue(new onExtraCallbackWithResult(function2, this));
    }

    public static final class onExtraCallbackWithResult implements getSignPrikeyCCFPHFilename<AccessTokenResponse> {
        final /* synthetic */ LinearLayoutManager onNavigationEvent;
        final /* synthetic */ Function2<OAuthToken, Throwable, Unit> onWarmupCompleted;

        onExtraCallbackWithResult(Function2<? super OAuthToken, ? super Throwable, Unit> function2, LinearLayoutManager linearLayoutManager) {
            this.onWarmupCompleted = function2;
            this.onNavigationEvent = linearLayoutManager;
        }

        public void onFailure(@NotNull getSignPrikeyCCFBPHFilename<AccessTokenResponse> getsignprikeyccfbphfilename, @NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(getsignprikeyccfbphfilename, "");
            Intrinsics.checkNotNullParameter(th, "");
            this.onWarmupCompleted.invoke((Object) null, th);
        }

        public void onResponse(@NotNull getSignPrikeyCCFBPHFilename<AccessTokenResponse> getsignprikeyccfbphfilename, @NotNull Response<AccessTokenResponse> response) {
            Intrinsics.checkNotNullParameter(getsignprikeyccfbphfilename, "");
            Intrinsics.checkNotNullParameter(response, "");
            if (response.onExtraCallbackWithResult()) {
                AccessTokenResponse accessTokenResponse = (AccessTokenResponse) response.onExtraCallback();
                if (accessTokenResponse != null) {
                    LinearLayoutManager linearLayoutManager = this.onNavigationEvent;
                    Function2<OAuthToken, Throwable, Unit> function2 = this.onWarmupCompleted;
                    OAuthToken oAuthTokenOnExtraCallback = OAuthToken$onExtraCallbackWithResult.onExtraCallback(OAuthToken.Companion, accessTokenResponse, null, 2, null);
                    linearLayoutManager.IAuthTabCallback().onExtraCallback().onExtraCallback(oAuthTokenOnExtraCallback);
                    function2.invoke(oAuthTokenOnExtraCallback, (Object) null);
                    return;
                }
                this.onWarmupCompleted.invoke((Object) null, new ClientError(ClientErrorCause.Unknown, "No body"));
                return;
            }
            this.onWarmupCompleted.invoke((Object) null, LinearLayoutManager.Companion.onExtraCallbackWithResult(new HttpException(response)));
        }
    }

    public final void IAuthTabCallback(@NotNull Function2<? super String, ? super Throwable, Unit> function2) {
        Unit unit;
        String strOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(function2, "");
        OAuthToken oAuthTokenOnNavigationEvent = this.onTransact.onExtraCallback().onNavigationEvent();
        if (oAuthTokenOnNavigationEvent == null || (strOnWarmupCompleted = oAuthTokenOnNavigationEvent.onWarmupCompleted()) == null) {
            unit = null;
        } else {
            this.onNavigationEvent.agt(this.IAuthTabCallback.onExtraCallbackWithResult(), strOnWarmupCompleted).enqueue(new onExtraCallback(function2));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            function2.invoke((Object) null, new ClientError(ClientErrorCause.TokenNotFound, "Access token not found. You must login first."));
        }
    }

    public static final class onExtraCallback implements getSignPrikeyCCFPHFilename<AgtResponse> {
        final /* synthetic */ Function2<String, Throwable, Unit> IAuthTabCallback;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(Function2<? super String, ? super Throwable, Unit> function2) {
            this.IAuthTabCallback = function2;
        }

        public void onFailure(@NotNull getSignPrikeyCCFBPHFilename<AgtResponse> getsignprikeyccfbphfilename, @NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(getsignprikeyccfbphfilename, "");
            Intrinsics.checkNotNullParameter(th, "");
            this.IAuthTabCallback.invoke((Object) null, th);
        }

        public void onResponse(@NotNull getSignPrikeyCCFBPHFilename<AgtResponse> getsignprikeyccfbphfilename, @NotNull Response<AgtResponse> response) {
            Intrinsics.checkNotNullParameter(getsignprikeyccfbphfilename, "");
            Intrinsics.checkNotNullParameter(response, "");
            AgtResponse agtResponse = (AgtResponse) response.onExtraCallback();
            if (agtResponse != null) {
                this.IAuthTabCallback.invoke(agtResponse.IAuthTabCallback(), (Object) null);
            } else {
                this.IAuthTabCallback.invoke((Object) null, LinearLayoutManager.Companion.onExtraCallbackWithResult(new HttpException(response)));
            }
        }
    }

    public final OAuthToken onNavigationEvent(@NotNull OAuthToken oAuthToken) throws Throwable {
        OAuthToken oAuthTokenOnNavigationEvent;
        Intrinsics.checkNotNullParameter(oAuthToken, "");
        Response responseExecute = AuthApi.onExtraCallback.onWarmupCompleted(this.onNavigationEvent, this.IAuthTabCallback.onExtraCallbackWithResult(), this.onExtraCallback.IAuthTabCallbackStub(), oAuthToken.onNavigationEvent(), this.onWarmupCompleted.onExtraCallbackWithResult(), null, 16, null).execute();
        AccessTokenResponse accessTokenResponse = (AccessTokenResponse) responseExecute.onExtraCallback();
        if (accessTokenResponse == null || (oAuthTokenOnNavigationEvent = OAuthToken.Companion.onNavigationEvent(accessTokenResponse, oAuthToken)) == null) {
            throw Companion.onExtraCallbackWithResult(new HttpException(responseExecute));
        }
        this.onTransact.onExtraCallback().onExtraCallback(oAuthTokenOnNavigationEvent);
        return oAuthTokenOnNavigationEvent;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Throwable onExtraCallbackWithResult(@NotNull Throwable th) {
            Object obj;
            ResponseBody responseBodyOnWarmupCompleted;
            Intrinsics.checkNotNullParameter(th, "");
            if (!(th instanceof HttpException)) {
                return th;
            }
            try {
                Response response = ((HttpException) th).response();
                String strString = (response == null || (responseBodyOnWarmupCompleted = response.onWarmupCompleted()) == null) ? null : responseBodyOnWarmupCompleted.string();
                updateLayoutStateToFillEnd updatelayoutstatetofillend = updateLayoutStateToFillEnd.onWarmupCompleted;
                Intrinsics.checkNotNull(strString);
                wie2 wie2VarIAuthTabCallback = updatelayoutstatetofillend.IAuthTabCallback();
                wie2VarIAuthTabCallback.onExtraCallback();
                AuthErrorResponse authErrorResponse = (AuthErrorResponse) wie2VarIAuthTabCallback.onExtraCallback(AuthErrorResponse.Companion.serializer(), strString);
                try {
                    Result.Companion companion = Result.Companion;
                    String strOnExtraCallbackWithResult = authErrorResponse.onExtraCallbackWithResult();
                    wie2 wie2VarIAuthTabCallback2 = updatelayoutstatetofillend.IAuthTabCallback();
                    wie2VarIAuthTabCallback2.onExtraCallback();
                    obj = Result.constructor-impl((AuthErrorCause) wie2VarIAuthTabCallback2.onExtraCallback(AuthErrorCause.Companion.serializer(), strOnExtraCallbackWithResult));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th2));
                }
                AuthErrorCause authErrorCause = AuthErrorCause.Unknown;
                if (Result.onExtraCallback(obj)) {
                    obj = authErrorCause;
                }
                return new AuthError(((HttpException) th).code(), (AuthErrorCause) obj, authErrorResponse);
            } catch (Throwable th3) {
                return th3;
            }
        }

        public final LinearLayoutManager onWarmupCompleted() {
            return (LinearLayoutManager) LinearLayoutManager.onExtraCallbackWithResult.getValue();
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function0<LinearLayoutManager> {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        onWarmupCompleted() {
            super(0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutManager invoke() {
            return new LinearLayoutManager(null, null, null, null, null, 31, null);
        }
    }
}
