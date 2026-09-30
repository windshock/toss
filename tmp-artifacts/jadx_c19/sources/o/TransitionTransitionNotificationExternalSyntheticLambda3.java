package o;

import android.content.Context;
import android.os.AsyncTask;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.service.model.ServiceException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TransitionTransitionNotificationExternalSyntheticLambda3<ResponseType, ReturnType> extends AsyncTask<Void, Void, RememberUtilsKtMapEntrySaver21<ReturnType>> {
    private Context IAuthTabCallback;
    private TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType> IAuthTabCallbackDefault;
    private ReturnType IAuthTabCallbackStub;
    private String asBinder;
    private ResponseCode asInterface;
    private final int onExtraCallback;
    private Function1<? super notifyListener<ReturnType>, Unit> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private Response<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType>> onTransact;
    private final Function1<Retrofit, getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType>>> onWarmupCompleted;

    public TransitionTransitionNotificationExternalSyntheticLambda3(@NotNull String str, int i2, @NotNull Function1<? super Retrofit, ? extends getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType>>> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = str;
        this.onExtraCallback = i2;
        this.onWarmupCompleted = function1;
        this.IAuthTabCallback = computeVerticalScrollRange.onWarmupCompleted.IAuthTabCallback();
        this.asInterface = ResponseCode.UNKNOWN_ERROR;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        ApmHelper11.IAuthTabCallback("%s Request is generated", new Object[]{simpleName});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransitionTransitionNotificationExternalSyntheticLambda3 onExtraCallback(TransitionTransitionNotificationExternalSyntheticLambda3 transitionTransitionNotificationExternalSyntheticLambda3, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        return transitionTransitionNotificationExternalSyntheticLambda3.IAuthTabCallback(function1);
    }

    private final void onExtraCallback(ResponseCode responseCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" Fail : [");
        sb.append(responseCode.getCode());
        sb.append("] ");
        sb.append(str == null ? responseCode.getMessage() : str);
        ApmHelper11.onWarmupCompleted(sb.toString(), new Object[0]);
        onWarmupCompleted(responseCode, null, str);
    }

    public static /* synthetic */ ServiceException onExtraCallbackWithResult(TransitionTransitionNotificationExternalSyntheticLambda3 transitionTransitionNotificationExternalSyntheticLambda3, ResponseCode responseCode, int i2, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFail");
        }
        if ((i3 & 1) != 0) {
            responseCode = ResponseCode.UNKNOWN_ERROR;
        }
        return transitionTransitionNotificationExternalSyntheticLambda3.onExtraCallback(responseCode, i2, str);
    }

    private final void onNavigationEvent(ReturnType returntype) {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        ApmHelper11.IAuthTabCallback("%s Success : [%s]", new Object[]{simpleName, String.valueOf(returntype)});
        onWarmupCompleted(ResponseCode.OK, returntype, null);
    }

    private final void onWarmupCompleted(ResponseCode responseCode, ReturnType returntype, String str) {
        this.IAuthTabCallbackStub = returntype;
        this.asInterface = responseCode;
        this.asBinder = str;
        Function1<? super notifyListener<ReturnType>, Unit> function1 = this.onExtraCallbackWithResult;
        if (function1 != null) {
            boolean z = this.onTransact != null;
            TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 = this.IAuthTabCallbackDefault;
            String strAsBinder = twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 != null ? twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.asBinder() : null;
            TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda12 = this.IAuthTabCallbackDefault;
            function1.invoke(new notifyListener(responseCode, z, strAsBinder, returntype, str, twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda12 != null ? twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda12.IAuthTabCallback() : null));
        }
    }

    public final TransitionTransitionNotificationExternalSyntheticLambda3<ResponseType, ReturnType> IAuthTabCallback(@Nullable Function1<? super notifyListener<ReturnType>, Unit> function1) {
        this.onExtraCallbackWithResult = function1;
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return this;
    }

    protected abstract ServiceException onExtraCallback(@Nullable ResponseCode responseCode, int i2, @NotNull String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(@NotNull RememberUtilsKtMapEntrySaver21<ReturnType> rememberUtilsKtMapEntrySaver21) {
        ResponseCode code;
        String message;
        Intrinsics.checkNotNullParameter(rememberUtilsKtMapEntrySaver21, "");
        if (rememberUtilsKtMapEntrySaver21.onExtraCallback() != null) {
            onNavigationEvent((TransitionTransitionNotificationExternalSyntheticLambda3<ResponseType, ReturnType>) rememberUtilsKtMapEntrySaver21.onExtraCallback());
            return;
        }
        if (rememberUtilsKtMapEntrySaver21.onWarmupCompleted() != null) {
            Exception excOnWarmupCompleted = rememberUtilsKtMapEntrySaver21.onWarmupCompleted();
            if (excOnWarmupCompleted instanceof SocketTimeoutException) {
                ApmHelper11.onWarmupCompleted("Connection Timeout\n" + excOnWarmupCompleted, new Object[0]);
                code = ResponseCode.TIMEOUT;
                message = "Timeout Error";
            } else if (excOnWarmupCompleted instanceof ServiceException) {
                ApmHelper11.onWarmupCompleted("Error during networking processing\n" + excOnWarmupCompleted, new Object[0]);
                code = ((ServiceException) excOnWarmupCompleted).getCode();
                message = excOnWarmupCompleted.getMessage();
            } else {
                ApmHelper11.onWarmupCompleted("Unexpected error - [" + rememberUtilsKtMapEntrySaver21 + ']');
                code = ResponseCode.UNKNOWN_ERROR;
                message = "Unexpected error\n" + excOnWarmupCompleted.getMessage();
            }
        } else {
            ApmHelper11.onWarmupCompleted("Unexpected error - [" + rememberUtilsKtMapEntrySaver21 + ']');
            code = ResponseCode.UNKNOWN_ERROR;
            message = "Unexpected error";
        }
        onExtraCallback(code, message);
    }

    public final void onExtraCallbackWithResult(@NotNull TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<?> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1, "");
        twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallbackWithResult();
    }

    public final ServiceException onNavigationEvent(int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i2 == 401) {
            return new ServiceException(ResponseCode.SECURITY_UNAUTHORIZED, "[401] Auth Failed (" + str + ')', null, 4, null);
        }
        if (i2 == 500) {
            return new ServiceException(ResponseCode.UNKNOWN_ERROR, "[500] Server is challenging to unknown error.", null, 4, null);
        }
        return new ServiceException(ResponseCode.UNKNOWN_ERROR, '[' + i2 + "] " + str, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public final RememberUtilsKtMapEntrySaver21<ReturnType> doInBackground(@NotNull Void... voidArr) throws ServiceException {
        Intrinsics.checkNotNullParameter(voidArr, "");
        try {
            Response<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType>> responseExecute = ((getSignPrikeyCCFBPHFilename) this.onWarmupCompleted.invoke(removeTarget.onExtraCallbackWithResult.onExtraCallback(this.onNavigationEvent, this.onExtraCallback))).execute();
            this.onTransact = responseExecute;
            if (responseExecute.onExtraCallbackWithResult()) {
                TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 = (TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) responseExecute.onExtraCallback();
                this.IAuthTabCallbackDefault = twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1;
                if (twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 == null) {
                    throw new ServiceException(ResponseCode.UNKNOWN_PROTOCOL, "Response body is null", null, 4, null);
                }
                ReturnType returntypeOnWarmupCompleted = onWarmupCompleted(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
                if (returntypeOnWarmupCompleted != null) {
                    return new RememberUtilsKtMapEntrySaver21<>(returntypeOnWarmupCompleted, null, 2, null);
                }
                throw new ServiceException(ResponseCode.UNKNOWN_PROTOCOL, "CardService result should not be null.", null, 4, null);
            }
            ResponseBody responseBodyOnWarmupCompleted = responseExecute.onWarmupCompleted();
            if (responseBodyOnWarmupCompleted == null) {
                int iOnNavigationEvent = responseExecute.onNavigationEvent();
                String strAsBinder = responseExecute.asBinder();
                return new RememberUtilsKtMapEntrySaver21<>(null, onExtraCallbackWithResult(this, null, iOnNavigationEvent, strAsBinder == null ? "Unexpected error" : strAsBinder, 1, null), 1, null);
            }
            Object objFromJson = new GsonBuilder().create().fromJson(responseBodyOnWarmupCompleted.charStream(), new TypeToken<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType>>() { // from class: i.b$a
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            ResponseCode responseCodeOnExtraCallbackWithResult = ResponseCode.Companion.onExtraCallbackWithResult(((TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) objFromJson).onExtraCallbackWithResult());
            int iOnNavigationEvent2 = responseExecute.onNavigationEvent();
            String strAsBinder2 = responseExecute.asBinder();
            return new RememberUtilsKtMapEntrySaver21<>(null, onExtraCallback(responseCodeOnExtraCallbackWithResult, iOnNavigationEvent2, strAsBinder2 != null ? strAsBinder2 : "Unexpected error"), 1, null);
        } catch (IOException e) {
            return new RememberUtilsKtMapEntrySaver21<>(null, e, 1, null);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
    }

    protected abstract ReturnType onWarmupCompleted(@NotNull TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<ResponseType> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);

    public final RememberUtilsKtMapEntrySaver21<ReturnType> onWarmupCompleted(long j) throws ExecutionException, InterruptedException, TimeoutException {
        RememberUtilsKtMapEntrySaver21<ReturnType> rememberUtilsKtMapEntrySaver21;
        String str;
        if (j == 0) {
            rememberUtilsKtMapEntrySaver21 = get();
            str = "this.get()";
        } else {
            rememberUtilsKtMapEntrySaver21 = get(j, TimeUnit.MILLISECONDS);
            str = "this.get(timeout, TimeUnit.MILLISECONDS)";
        }
        Intrinsics.checkNotNullExpressionValue(rememberUtilsKtMapEntrySaver21, str);
        return rememberUtilsKtMapEntrySaver21;
    }
}
