package com.iap.ac.android.biz.common.internal.quote;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.callback.InquireQuoteCallback;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.QuoteCurrency;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentInquireQuoteResult;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class QuoteManager {
    /* JADX INFO: Access modifiers changed from: private */
    public static ForeignExchangeQuote convertQuoteModel(MobilePaymentInquireQuoteResult mobilePaymentInquireQuoteResult) {
        ForeignExchangeQuote foreignExchangeQuote = new ForeignExchangeQuote();
        foreignExchangeQuote.baseCurrency = mobilePaymentInquireQuoteResult.baseCurrency;
        foreignExchangeQuote.quoteCurrencyPair = mobilePaymentInquireQuoteResult.quoteCurrencyPair;
        foreignExchangeQuote.quoteExpiryTime = Utils.stringToLong(mobilePaymentInquireQuoteResult.quoteExpiryTime, 0L);
        foreignExchangeQuote.quoteStartTime = Utils.stringToLong(mobilePaymentInquireQuoteResult.quoteStartTime, 0L);
        foreignExchangeQuote.quoteId = mobilePaymentInquireQuoteResult.quoteId;
        foreignExchangeQuote.quotePrice = mobilePaymentInquireQuoteResult.quotePrice;
        foreignExchangeQuote.quoteUnit = mobilePaymentInquireQuoteResult.quoteUnit;
        return foreignExchangeQuote;
    }

    public static void inquireQuote(@NonNull final QuoteCurrency quoteCurrency, @NonNull final InquireQuoteCallback inquireQuoteCallback) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final LogResult logResult = new LogResult();
        if (quoteCurrency != null && inquireQuoteCallback != null) {
            IAPAsyncTask.asyncTask(new Runnable() { // from class: com.iap.ac.android.biz.common.internal.quote.QuoteManager.1
                private static int $10 = 0;
                private static int $11 = 1;
                private static long onExtraCallback = -7323050995388330930L;
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // java.lang.Runnable
                public void run() {
                    MobilePaymentInquireQuoteResult mobilePaymentInquireQuoteResultInquireQuote;
                    int i = 2 % 2;
                    try {
                        mobilePaymentInquireQuoteResultInquireQuote = new InquireQuoteProcessor().inquireQuote(quoteCurrency);
                        if (mobilePaymentInquireQuoteResultInquireQuote != null) {
                            int i2 = onNavigationEvent + 17;
                            onWarmupCompleted = i2 % 128;
                            int i3 = i2 % 2;
                            if (((BaseRpcResult) mobilePaymentInquireQuoteResultInquireQuote).success) {
                                ForeignExchangeQuote foreignExchangeQuoteConvertQuoteModel = QuoteManager.convertQuoteModel(mobilePaymentInquireQuoteResultInquireQuote);
                                InquireQuoteCallback inquireQuoteCallback2 = inquireQuoteCallback;
                                Object[] objArr = new Object[1];
                                a(new char[]{39229, 39278, 4471, 27590, 31295, 42592, 1281, 24506, 17520, 34158, 8217}, KeyEvent.getDeadChar(0, 0), objArr);
                                inquireQuoteCallback2.onResult(((String) objArr[0]).intern(), foreignExchangeQuoteConvertQuoteModel);
                                LogResult logResult2 = logResult;
                                Object[] objArr2 = new Object[1];
                                a(new char[]{39229, 39278, 4471, 27590, 31295, 42592, 1281, 24506, 17520, 34158, 8217}, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
                                logResult2.resultCode = ((String) objArr2[0]).intern();
                                logResult2.traceId = ((BaseRpcResult) mobilePaymentInquireQuoteResultInquireQuote).traceId;
                                ACLogEvent.commonEvent("ac_inquire_quote", jElapsedRealtime, logResult2);
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        LogResult logResult3 = logResult;
                        logResult3.resultCode = "INVALID_NETWORK";
                        logResult3.resultMessage = "inquireQuote exception: " + th;
                    }
                    if (((BaseRpcResult) mobilePaymentInquireQuoteResultInquireQuote).success) {
                        LogResult logResult4 = logResult;
                        logResult4.resultCode = "INVALID_NETWORK";
                        logResult4.resultMessage = "server return null result";
                        inquireQuoteCallback.onResult("INVALID_NETWORK", null);
                        ACLog.e("IAPConnect", logResult.resultMessage);
                        ACLogEvent.commonEvent("ac_inquire_quote", jElapsedRealtime, logResult);
                        return;
                    }
                    int i4 = onNavigationEvent + 31;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    inquireQuoteCallback.onResult(((BaseRpcResult) mobilePaymentInquireQuoteResultInquireQuote).errorCode, null);
                    LogResult logResult5 = logResult;
                    logResult5.traceId = ((BaseRpcResult) mobilePaymentInquireQuoteResultInquireQuote).traceId;
                    logResult5.resultCode = ((BaseRpcResult) mobilePaymentInquireQuoteResultInquireQuote).errorCode;
                    logResult5.resultMessage = ((BaseRpcResult) mobilePaymentInquireQuoteResultInquireQuote).errorMessage;
                    ACLogEvent.commonEvent("ac_inquire_quote", jElapsedRealtime, logResult5);
                }

                private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                    int i2 = 2 % 2;
                    TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                    char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
                    timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                    int i3 = $11 + 57;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                        timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                        int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 83 - ExpandableListView.getPackedPositionChild(0L), Color.green(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                            }
                            cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, 8808 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback2).invoke(null, objArr3);
                            int i6 = $11 + 97;
                            $10 = i6 % 128;
                            int i7 = i6 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                }
            });
            return;
        }
        String str = "inquireQuote with invalid paramters, quoteCurrency: " + quoteCurrency + ", callback: " + inquireQuoteCallback;
        ACLog.e("IAPConnect", str);
        if (inquireQuoteCallback != null) {
            inquireQuoteCallback.onResult("PARAM_ILLEGAL", null);
        }
        logResult.resultCode = "PARAM_ILLEGAL";
        logResult.resultMessage = str;
        ACLogEvent.commonEvent("ac_inquire_quote", jElapsedRealtime, logResult);
    }
}
