package com.alibaba.ariver.engine.api.common;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.extensions.back.BackInterceptPoint;
import com.alibaba.ariver.engine.api.point.PageBackInterceptPoint;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class CommonBackPerform {
    private static int $10 = 0;
    private static int $11 = 1;
    public static int BACK = 1;
    public static final String DEFAULT_PREVENTED = "defaultPrevented";
    public static int FINISHED = 4;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static int NONE = 0;
    public static int POP = 0;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    public int backBehavior;
    private PageBackInterceptPoint mInterceptPoint;
    private Render mRender;
    private String TAG = "AriverEngine:BackPerform";
    private Boolean mEnableIntercept = null;
    private int mPageStatus = NONE;
    private BackHandler mBackHandler = new BackHandler();

    static {
        onExtraCallback();
        int i2 = onExtraCallback + 109;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    protected abstract void performBack(GoBackCallback goBackCallback);

    static /* synthetic */ String access$000(CommonBackPerform commonBackPerform) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        String str = commonBackPerform.TAG;
        int i6 = i3 + 1;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 39 / 0;
        }
        return str;
    }

    static /* synthetic */ BackHandler access$100(CommonBackPerform commonBackPerform) {
        int i2 = 2 % 2;
        int i3 = onTransact + 97;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        BackHandler backHandler = commonBackPerform.mBackHandler;
        int i6 = i4 + 15;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return backHandler;
    }

    static /* synthetic */ Boolean access$200(CommonBackPerform commonBackPerform) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 23;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        Boolean bool = commonBackPerform.mEnableIntercept;
        int i6 = i4 + 85;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return bool;
    }

    static /* synthetic */ Boolean access$202(CommonBackPerform commonBackPerform, Boolean bool) {
        int i2 = 2 % 2;
        int i3 = onTransact + 101;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        commonBackPerform.mEnableIntercept = bool;
        int i6 = i4 + 49;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Render access$300(CommonBackPerform commonBackPerform) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 71;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Render render = commonBackPerform.mRender;
        if (i4 != 0) {
            int i5 = 82 / 0;
        }
        return render;
    }

    public CommonBackPerform(Render render) {
        this.mRender = render;
        this.mInterceptPoint = ExtensionPoint.as(PageBackInterceptPoint.class).node(this.mRender.getPage()).create();
    }

    public boolean enableInterceptBack(Render render) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 39;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return isAppIdInWhiteList(this.mRender.getAppId(), JSONUtils.getJSONArray(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONObject("h5_eventThroughWorker"), RVParams.DEFAULT_LONG_BACK_BEHAVIOR, (JSONArray) null));
        }
        isAppIdInWhiteList(this.mRender.getAppId(), JSONUtils.getJSONArray(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONObject("h5_eventThroughWorker"), RVParams.DEFAULT_LONG_BACK_BEHAVIOR, (JSONArray) null));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[PHI: r4
      0x0065: PHI (r4v7 java.lang.String) = (r4v6 java.lang.String), (r4v12 java.lang.String) binds: [B:17:0x0063, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean isAppIdInWhiteList(String str, JSONArray jSONArray) {
        String string;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if (jSONArray == null) {
            int i6 = i3 + 109;
            onTransact = i6 % 128;
            return i6 % 2 != 0;
        }
        RVLogger.d(this.TAG, "isAppIdInWhiteList, appId = " + str + ", appIdWhiteList = " + jSONArray);
        int i7 = 0;
        while (i7 < jSONArray.size()) {
            int i8 = IAuthTabCallbackDefault + 17;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
                string = jSONArray.getString(i7);
                int i9 = 19 / 0;
                if (!TextUtils.equals(string, ".*")) {
                    int i10 = IAuthTabCallbackDefault + 55;
                    onTransact = i10 % 128;
                    int i11 = i10 % 2;
                    if (!TextUtils.equals(string, str)) {
                        int i12 = IAuthTabCallbackDefault + 39;
                        onTransact = i12 % 128;
                        i7 = i12 % 2 != 0 ? i7 + 76 : i7 + 1;
                    }
                }
            } else {
                string = jSONArray.getString(i7);
                if (!TextUtils.equals(string, ".*")) {
                }
            }
            return true;
        }
        int i13 = IAuthTabCallbackDefault + 79;
        onTransact = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 23 / 0;
        }
        return false;
    }

    public void setBackBehavior(String str) {
        int i2 = 2 % 2;
        RVLogger.d(this.TAG, "setBackBehavior " + str);
        if ("pop".equals(str)) {
            int i3 = onTransact + 87;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                this.backBehavior = POP;
                return;
            } else {
                this.backBehavior = POP;
                throw null;
            }
        }
        this.backBehavior = BACK;
        int i4 = IAuthTabCallbackDefault + 21;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void updatePageStatus(int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact;
        int i5 = i4 + 119;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        this.mPageStatus = i2;
        if (i6 == 0) {
            int i7 = 99 / 0;
        }
        int i8 = i4 + 89;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i7 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i8 = $11 + 57;
            $10 = i8 % 128;
            int i9 = 58224;
            if (i8 % i5 != 0) {
                cArr3[i7] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % i7];
                i3 = 1;
            } else {
                cArr3[i7] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i3 = i7;
            }
            while (i3 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i7];
                char[] cArr4 = cArr3;
                int i10 = (c2 + i9) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[i5] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i5] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, threadPriority, keyRepeatTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - (KeyEvent.getMaxKeyCode() >> 16), 12434 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i3++;
                    int i12 = $11 + 71;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i5 = 2;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                i4 = 2;
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 16015), (ViewConfiguration.getWindowTouchSlop() >> 8) + 14, 19900 - TextUtils.lastIndexOf("", '0', 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            } else {
                i4 = 2;
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i5 = i4;
            cArr3 = cArr5;
            i7 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public void goBack(GoBackCallback goBackCallback) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        BackInterceptPoint backInterceptPoint = (BackInterceptPoint) ExtensionPoint.as(BackInterceptPoint.class).node(this.mRender.getPage()).create();
        if (backInterceptPoint != null && backInterceptPoint.intercepted(this.mRender, this.mPageStatus, this.mBackHandler, goBackCallback)) {
            RVLogger.d(this.TAG, "goBack has been intercepted by " + backInterceptPoint.getClass().getName());
            return;
        }
        boolean z2 = false;
        if (this.mPageStatus != FINISHED || this.mBackHandler.waiting) {
            int i3 = onTransact + 101;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 % 3;
            }
            z = false;
        } else {
            z = true;
        }
        if (jCurrentTimeMillis - this.mBackHandler.lastBack > 500) {
            int i5 = onTransact + 109;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        }
        if (z) {
            int i7 = IAuthTabCallbackDefault + 91;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (z2) {
                RVLogger.d(this.TAG, "send back event to bridge!");
                BackHandler backHandler = this.mBackHandler;
                backHandler.waiting = true;
                backHandler.lastBack = jCurrentTimeMillis;
                backHandler.setGoBackCallback(goBackCallback);
                sendBackEvent(goBackCallback);
                return;
            }
        }
        RVLogger.d(this.TAG, "ignore bridge, perform goBack!");
        performBack(goBackCallback);
    }

    private void sendBackEvent(final GoBackCallback goBackCallback) throws Throwable {
        boolean booleanValue;
        int i2 = 2 % 2;
        if (this.mInterceptPoint.interceptBackEvent(new GoBackCallback() { // from class: com.alibaba.ariver.engine.api.common.CommonBackPerform.1
            public void afterProcess(boolean z) {
                if (!z) {
                    CommonBackPerform.this.performBack(goBackCallback);
                } else {
                    RVLogger.d(CommonBackPerform.access$000(CommonBackPerform.this), "sendBackEvent prevented!");
                }
            }
        })) {
            this.mBackHandler.waiting = false;
            return;
        }
        if (this.mRender.getPage() instanceof Page) {
            int i3 = IAuthTabCallbackDefault + 41;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                booleanValue = this.mRender.getPage().getBooleanValue(DEFAULT_PREVENTED);
            } else {
                this.mRender.getPage().getBooleanValue(DEFAULT_PREVENTED);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            booleanValue = false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DEFAULT_PREVENTED, Boolean.valueOf(booleanValue));
        JSONObject jSONObject2 = new JSONObject();
        Object[] objArr = new Object[1];
        a(new char[]{23941, 48831, 17969, 32011}, 3 - MotionEvent.axisFromString(""), objArr);
        jSONObject2.put(((String) objArr[0]).intern(), jSONObject);
        RVLogger.d(this.TAG, " sendBackEvent back status defaultPrevented:" + booleanValue + " node:" + this.mRender.getPage());
        EngineUtils.sendToRender(this.mRender, RVParams.DEFAULT_LONG_BACK_BEHAVIOR, jSONObject2, new SendToRenderCallback() { // from class: com.alibaba.ariver.engine.api.common.CommonBackPerform.2
            @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
            public void onCallBack(JSONObject jSONObject3) {
                if (CommonBackPerform.access$100(CommonBackPerform.this) != null) {
                    RVLogger.d(CommonBackPerform.access$000(CommonBackPerform.this), "sendToRender back render jsonObject:" + jSONObject3);
                    CommonBackPerform.access$100(CommonBackPerform.this).onCallBack(jSONObject3);
                }
            }
        });
        int i4 = onTransact + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    public class BackHandler implements SendToRenderCallback {
        public GoBackCallback callback;
        public boolean waiting = false;
        public long lastBack = 0;

        public BackHandler() {
        }

        public void setGoBackCallback(GoBackCallback goBackCallback) {
            this.callback = goBackCallback;
        }

        @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
        public void onCallBack(JSONObject jSONObject) {
            this.waiting = false;
            if (CommonBackPerform.access$200(CommonBackPerform.this) == null) {
                CommonBackPerform commonBackPerform = CommonBackPerform.this;
                CommonBackPerform.access$202(commonBackPerform, Boolean.valueOf(commonBackPerform.enableInterceptBack(CommonBackPerform.access$300(commonBackPerform))));
            }
            boolean z = JSONUtils.getBoolean(jSONObject, "prevent", false) || JSONUtils.getBoolean(jSONObject, "prevented", false);
            boolean booleanValue = CommonBackPerform.access$300(CommonBackPerform.this).getPage() instanceof Page ? CommonBackPerform.access$300(CommonBackPerform.this).getPage().getBooleanValue(CommonBackPerform.DEFAULT_PREVENTED) : false;
            RVLogger.d(CommonBackPerform.access$000(CommonBackPerform.this), "goBack event prevent " + z + " with cfgOpen: " + CommonBackPerform.access$200(CommonBackPerform.this) + " " + CommonBackPerform.DEFAULT_PREVENTED + ":" + booleanValue + " node: " + CommonBackPerform.access$300(CommonBackPerform.this).getPage());
            if (booleanValue) {
                return;
            }
            if (z && CommonBackPerform.access$200(CommonBackPerform.this).booleanValue()) {
                return;
            }
            ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.engine.api.common.CommonBackPerform.BackHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    BackHandler backHandler = BackHandler.this;
                    CommonBackPerform.this.performBack(backHandler.callback);
                }
            });
        }
    }

    public int getBackBehavior() {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault;
        int i5 = i4 + 89;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            i2 = this.backBehavior;
            int i6 = 68 / 0;
        } else {
            i2 = this.backBehavior;
        }
        int i7 = i4 + 111;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    static void onExtraCallback() {
        onWarmupCompleted = (char) 30070;
        onExtraCallbackWithResult = (char) 23997;
        onNavigationEvent = (char) 48616;
        IAuthTabCallback = (char) 2210;
    }
}
