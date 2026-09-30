package com.tmoney.c;

import android.content.Context;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.tmoney.dto.AdminResult;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.Callback;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.HashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class t extends C0041b {
    private final String b;
    private com.tmoney.d.a c;
    private O d;

    public t(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyAvailableCheckInstance";
        LogHelper.d("TmoneyAvailableCheckInstance", "TmoneyAvailableCheckInstance");
        this.d = O.getInstance();
        this.c = com.tmoney.d.a.getInstance();
    }

    public final void request() {
        int serverType = TmoneyData.getInstance().getServerType();
        HashMap<String, String> map = new HashMap<>();
        map.put("mdlNm", DeviceInfoHelper.getModel());
        this.d.post(this.c.getTmoneyUsableCheckUrl(serverType), map);
        this.d.setListener(new O.a() { // from class: com.tmoney.c.t.1
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static long onNavigationEvent = 1514695111952935509L;

            /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[Catch: Exception -> 0x00df, TRY_ENTER, TryCatch #0 {Exception -> 0x00df, blocks: (B:8:0x0021, B:12:0x0056, B:17:0x00a7, B:20:0x00b9, B:22:0x00c7, B:15:0x007f, B:24:0x00d1), top: B:31:0x0021 }] */
            @Override // com.tmoney.kscc.sslio.a.O.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onResultType(TmoneyCallback.ResultType resultType) throws Throwable {
                String authRst;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                    t.this.onResult(resultType);
                    int i3 = onExtraCallbackWithResult + 73;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                try {
                    AdminResult adminResult = (AdminResult) new Gson().fromJson(resultType.getData()[0].toString(), AdminResult.class);
                    if (!"200".equals(adminResult.getStatus().trim())) {
                        t.this.onResult(Callback.warning(ResultError.NOT_SUPPORT, ResultDetailCode.NOT_SUPPORT_DEVICE));
                        return;
                    }
                    int i5 = IAuthTabCallback + 11;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        authRst = adminResult.getItem().getAuthRst();
                        Object[] objArr = new Object[1];
                        b(new char[]{49781, 1293, 35409, 37525, 25200, 21015}, 1 / (ViewConfiguration.getMaximumDrawingCacheSize() / 105), objArr);
                        if (!authRst.equals(((String) objArr[0]).intern())) {
                            if (authRst.equals("-")) {
                                t.this.onResult(Callback.warning(ResultError.NOT_SUPPORT, ResultDetailCode.NOT_SUPPORT_DEVICE));
                                return;
                            } else {
                                int i6 = onExtraCallbackWithResult + 51;
                                IAuthTabCallback = i6 % 128;
                                int i7 = i6 % 2;
                            }
                        }
                    } else {
                        authRst = adminResult.getItem().getAuthRst();
                        Object[] objArr2 = new Object[1];
                        b(new char[]{49781, 1293, 35409, 37525, 25200, 21015}, 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                        if (!authRst.equals(((String) objArr2[0]).intern())) {
                            if (authRst.equals("-")) {
                            }
                        }
                    }
                    t.this.onResult(Callback.success());
                } catch (Exception e) {
                    t.this.onResult(Callback.warning(ResultError.EXCEPTION, ResultDetailCode.EXCEPTION_SERVER).setLog(e.getMessage()).setException(e));
                }
            }

            private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
                timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                int i3 = $10 + 31;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                    int i5 = $10 + 29;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                    int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), ExpandableListView.getPackedPositionChild(0L) + 85, KeyEvent.keyCodeFromString("") + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16763031) - Color.rgb(0, 0, 0)), 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 8808 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                int i8 = $11 + 5;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                objArr[0] = str;
            }
        });
    }
}
