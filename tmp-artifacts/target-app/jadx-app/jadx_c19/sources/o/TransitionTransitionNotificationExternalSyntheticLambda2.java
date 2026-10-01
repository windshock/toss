package o;

import android.content.Context;
import android.nfc.TagLostException;
import android.os.AsyncTask;
import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.exceptions.ApduException;
import com.krc.pl_card.exceptions.EpTagException;
import com.krc.pl_card.model.KRCEpCardResponse;
import com.krc.pl_card.model.dto.result.ChargeResult;
import com.krc.pl_card.service.model.ServiceException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CarouselKtExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TransitionTransitionNotificationExternalSyntheticLambda2<EpType extends CarouselKtExternalSyntheticLambda1, ReturnType> extends AsyncTask<Void, Void, RememberUtilsKtMapEntrySaver21<ReturnType>> {
    private ReturnType IAuthTabCallback;
    private String asInterface;
    private final EpType onExtraCallback;
    private Function1<? super KRCEpCardResponse<ReturnType>, Unit> onExtraCallbackWithResult;
    private Context onNavigationEvent;
    private ResponseCode onWarmupCompleted;

    public TransitionTransitionNotificationExternalSyntheticLambda2(@NotNull EpType eptype) {
        Intrinsics.checkNotNullParameter(eptype, "");
        this.onExtraCallback = eptype;
        this.onNavigationEvent = computeVerticalScrollRange.onWarmupCompleted.IAuthTabCallback();
        this.onWarmupCompleted = ResponseCode.UNKNOWN_ERROR;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        ApmHelper11.IAuthTabCallback("%s Request is generated", new Object[]{simpleName});
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(ReturnType returntype) {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        ApmHelper11.IAuthTabCallback("%s Success : [%s]", new Object[]{simpleName, String.valueOf(returntype)});
        if (returntype instanceof ChargeResult) {
            ChargeResult chargeResult = (ChargeResult) returntype;
            if (chargeResult.getException() != null) {
                if (chargeResult.getException() instanceof EpTagException) {
                    Exception exception = chargeResult.getException();
                    if (exception == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.krc.pl_card.exceptions.EpTagException");
                    }
                    EpTagException epTagException = (EpTagException) exception;
                    onNavigationEvent(epTagException.getCode(), returntype, epTagException.getMessage(), null);
                }
                if (chargeResult.getException() instanceof ApduException) {
                    Exception exception2 = chargeResult.getException();
                    if (exception2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.krc.pl_card.exceptions.ApduException");
                    }
                    ApduException apduException = (ApduException) exception2;
                    onNavigationEvent(apduException.getCode(), returntype, apduException.getMessage(), null);
                }
                if (chargeResult.getException() instanceof SocketTimeoutException) {
                    Exception exception3 = chargeResult.getException();
                    if (exception3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.SocketTimeoutException");
                    }
                    onNavigationEvent(ResponseCode.TIMEOUT, returntype, "Timeout Error", null);
                }
                if (chargeResult.getException() instanceof TagLostException) {
                    Exception exception4 = chargeResult.getException();
                    if (exception4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.nfc.TagLostException");
                    }
                    onNavigationEvent(ResponseCode.ERROR_TAG_LOST, returntype, "통신 중 카드가 분리되었습니다.", null);
                }
                if (!(chargeResult.getException() instanceof IOException)) {
                    ResponseCode responseCode = ResponseCode.UNKNOWN_ERROR;
                    onNavigationEvent(responseCode, returntype, responseCode.getMessage(), null);
                    return;
                }
                Exception exception5 = chargeResult.getException();
                if (exception5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.io.IOException");
                }
                onNavigationEvent(ResponseCode.ERROR_UNRECOGNIZED_CARD, returntype, "카드와 통신을 할 수 없습니다.", null);
                return;
            }
        }
        onNavigationEvent(ResponseCode.OK, returntype, null, null);
    }

    private final void onNavigationEvent(ResponseCode responseCode, ReturnType returntype, String str, String str2) {
        this.IAuthTabCallback = returntype;
        this.onWarmupCompleted = responseCode;
        this.asInterface = str;
        Function1<? super KRCEpCardResponse<ReturnType>, Unit> function1 = this.onExtraCallbackWithResult;
        if (function1 != null) {
            boolean z = responseCode == ResponseCode.OK;
            if (str == null) {
                str = responseCode.getMessage();
            }
            function1.invoke(new KRCEpCardResponse(z, returntype, str, responseCode, str2));
        }
    }

    private final void onNavigationEvent(ResponseCode responseCode, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" Fail : [");
        sb.append(responseCode.getCode());
        sb.append("] ");
        sb.append(str == null ? responseCode.getMessage() : str);
        ApmHelper11.onWarmupCompleted(sb.toString(), new Object[0]);
        onNavigationEvent(responseCode, null, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final RememberUtilsKtMapEntrySaver21<ReturnType> doInBackground(@NotNull Void... voidArr) {
        Intrinsics.checkNotNullParameter(voidArr, "");
        try {
            EpType eptype = this.onExtraCallback;
            try {
                RememberUtilsKtMapEntrySaver21<ReturnType> rememberUtilsKtMapEntrySaver21 = new RememberUtilsKtMapEntrySaver21<>(onWarmupCompleted(), null, 2, null);
                CloseableKt.closeFinally(eptype, (Throwable) null);
                return rememberUtilsKtMapEntrySaver21;
            } finally {
            }
        } catch (Exception e) {
            return new RememberUtilsKtMapEntrySaver21<>(null, e, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(@NotNull RememberUtilsKtMapEntrySaver21<ReturnType> rememberUtilsKtMapEntrySaver21) {
        ResponseCode code;
        String message;
        Intrinsics.checkNotNullParameter(rememberUtilsKtMapEntrySaver21, "");
        if (rememberUtilsKtMapEntrySaver21.onExtraCallback() != null) {
            onExtraCallbackWithResult(rememberUtilsKtMapEntrySaver21.onExtraCallback());
            return;
        }
        if (rememberUtilsKtMapEntrySaver21.onWarmupCompleted() != null) {
            Exception excOnWarmupCompleted = rememberUtilsKtMapEntrySaver21.onWarmupCompleted();
            if (excOnWarmupCompleted instanceof SocketTimeoutException) {
                ApmHelper11.onWarmupCompleted("Connection Timeout\n" + excOnWarmupCompleted, new Object[0]);
                code = ResponseCode.TIMEOUT;
                message = "Timeout Error";
            } else {
                if (excOnWarmupCompleted instanceof ServiceException) {
                    ApmHelper11.onWarmupCompleted("Error during networking processing\n" + excOnWarmupCompleted, new Object[0]);
                    ServiceException serviceException = (ServiceException) excOnWarmupCompleted;
                    onNavigationEvent(serviceException.getCode(), excOnWarmupCompleted.getMessage(), serviceException.getAdditionalCode());
                    return;
                }
                if (excOnWarmupCompleted instanceof TagLostException) {
                    ApmHelper11.onWarmupCompleted("Tag Lost\n" + excOnWarmupCompleted, new Object[0]);
                    code = ResponseCode.ERROR_TAG_LOST;
                    message = "통신 중 카드가 분리되었습니다.";
                } else if (excOnWarmupCompleted instanceof IOException) {
                    ApmHelper11.onWarmupCompleted("Tag Lost\n" + excOnWarmupCompleted, new Object[0]);
                    code = ResponseCode.ERROR_UNRECOGNIZED_CARD;
                    message = "카드와 통신을 할 수 없습니다.";
                } else if (excOnWarmupCompleted instanceof EpTagException) {
                    ApmHelper11.onWarmupCompleted("EP Error\n" + excOnWarmupCompleted, new Object[0]);
                    code = ((EpTagException) excOnWarmupCompleted).getCode();
                    message = excOnWarmupCompleted.getMessage();
                } else {
                    if (excOnWarmupCompleted instanceof ApduException) {
                        ApmHelper11.onWarmupCompleted("APDU Error\n" + excOnWarmupCompleted, new Object[0]);
                        ApduException apduException = (ApduException) excOnWarmupCompleted;
                        onNavigationEvent(apduException.getCode(), apduException.getMessage(), apduException.getStatusWord());
                        return;
                    }
                    ApmHelper11.onWarmupCompleted("Unexpected error - [" + rememberUtilsKtMapEntrySaver21 + ']');
                    code = ResponseCode.UNKNOWN_ERROR;
                    message = "Unexpected error\n" + excOnWarmupCompleted.getMessage();
                }
            }
        } else {
            ApmHelper11.onWarmupCompleted("Unexpected error - [" + rememberUtilsKtMapEntrySaver21 + ']');
            code = ResponseCode.UNKNOWN_ERROR;
            message = "Unexpected error";
        }
        onNavigationEvent(code, message, null);
    }

    public final TransitionTransitionNotificationExternalSyntheticLambda2<EpType, ReturnType> onNavigationEvent(@Nullable Function1<? super KRCEpCardResponse<ReturnType>, Unit> function1) {
        this.onExtraCallbackWithResult = function1;
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return this;
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() throws EpTagException, IOException {
        this.onExtraCallback.onTransact();
    }

    protected abstract ReturnType onWarmupCompleted();
}
