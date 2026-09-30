package com.iap.android.mppclient.mpm.action;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.iap.android.mppclient.basic.callback.Callback;
import com.iap.android.mppclient.basic.log.ACLogEvent;
import com.iap.android.mppclient.basic.model.DecodeServiceParams;
import com.iap.android.mppclient.basic.model.DecodeServiceResult;
import com.iap.android.mppclient.mpm.AlipayPlusClientMPM;
import com.iap.android.mppclient.mpm.callback.IActionCallback;
import com.iap.android.mppclient.mpm.request.BaseRequest;
import com.iap.android.mppclient.mpm.request.DecodeRequest;
import com.iap.android.mppclient.mpm.response.BaseResponse;
import com.iap.android.mppclient.mpm.response.DecodeResponse;
import com.iap.android.mppclient.mpm.service.MPMService;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DecodeAction extends BaseAction<DecodeRequest, DecodeResponse> {
    public /* bridge */ /* synthetic */ void handleAction(BaseRequest baseRequest, IActionCallback iActionCallback) {
        handleAction((DecodeRequest) baseRequest, (IActionCallback<DecodeResponse>) iActionCallback);
    }

    public void handleAction(DecodeRequest decodeRequest, final IActionCallback<DecodeResponse> iActionCallback) {
        ACLogEvent.newLogger("mpp_mpm_decode_service_start").addParams("codeValue", decodeRequest.codeValue).event();
        MPMService mPMService = AlipayPlusClientMPM.getInstance().mpmService;
        if (mPMService != null) {
            DecodeServiceParams decodeServiceParams = new DecodeServiceParams();
            decodeServiceParams.codeValue = decodeRequest.codeValue;
            mPMService.decode(decodeServiceParams, new Callback<DecodeServiceResult>() { // from class: com.iap.android.mppclient.mpm.action.DecodeAction.1
                private static int $10 = 0;
                private static int $11 = 1;
                private static long IAuthTabCallback = 8542505254666335237L;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public /* bridge */ /* synthetic */ void onSuccess(Object obj) throws Throwable {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    onSuccess((DecodeServiceResult) obj);
                    if (i4 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i5 = onNavigationEvent + 55;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 70 / 0;
                    }
                }

                public void onSuccess(DecodeServiceResult decodeServiceResult) throws Throwable {
                    int i2 = 2 % 2;
                    DecodeResponse decodeResponse = new DecodeResponse();
                    ((BaseResponse) decodeResponse).isSuccess = true;
                    Object[] objArr = new Object[1];
                    a(new char[]{16855, 16772, 63824, 62988, 46604, 56716, 32182, 48498, 43101, 61652, 62008}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr);
                    ((BaseResponse) decodeResponse).resultCode = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    a(new char[]{16855, 16772, 63824, 62988, 46604, 56716, 32182, 48498, 43101, 61652, 62008}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
                    ((BaseResponse) decodeResponse).resultMessage = ((String) objArr2[0]).intern();
                    decodeResponse.sdkActionPayload = decodeServiceResult.sdkActionPayload;
                    iActionCallback.onResult(decodeResponse);
                    DecodeAction.this.handleDecodeEndLog(null, null);
                    int i3 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                }

                public void onFailure(String str, String str2) {
                    int i2 = 2 % 2;
                    DecodeResponse decodeResponse = new DecodeResponse();
                    ((BaseResponse) decodeResponse).resultCode = str;
                    ((BaseResponse) decodeResponse).resultMessage = str2;
                    iActionCallback.onResult(decodeResponse);
                    DecodeAction.this.handleDecodeEndLog(((BaseResponse) decodeResponse).resultCode, ((BaseResponse) decodeResponse).resultMessage);
                    int i3 = onExtraCallbackWithResult + 69;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                }

                private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                    int i3 = 2 % 2;
                    TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                    char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i2);
                    timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                    while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                        int i4 = $10 + 35;
                        $11 = i4 % 128;
                        int i5 = i4 % 2;
                        timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                        int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45812), 84 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                            }
                            cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14185), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback2).invoke(null, objArr3);
                            int i7 = $11 + 19;
                            $10 = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 5 / 3;
                            }
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
        } else {
            DecodeResponse decodeResponse = new DecodeResponse();
            ((BaseResponse) decodeResponse).resultCode = "1001";
            ((BaseResponse) decodeResponse).resultMessage = "PARAM_ILLEGAL: mpmService is illegal";
            iActionCallback.onResult(decodeResponse);
            handleDecodeEndLog(((BaseResponse) decodeResponse).resultCode, ((BaseResponse) decodeResponse).resultMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDecodeEndLog(String str, String str2) {
        ACLogEvent aCLogEventNewLogger = ACLogEvent.newLogger("mpp_mpm_decode_service_end");
        if (!TextUtils.isEmpty(str)) {
            aCLogEventNewLogger.addParams("errorCode", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aCLogEventNewLogger.addParams("errorMessage", str2);
        }
        aCLogEventNewLogger.event();
    }
}
