package com.alibaba.ariver.integration.resource;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.activity.StartAction;
import com.alibaba.ariver.app.api.activity.StartClientBundle;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.engine.common.track.watchdog.TrackWatchDogProxy;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.integration.proxy.RVClientStarter;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.log.AppLog;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppException;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareCallbackParam;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareData;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.api.prepare.StepType;
import com.alibaba.ariver.resource.content.GlobalPackagePool;
import com.alibaba.ariver.resource.content.ResourceUtils;
import java.lang.reflect.Method;
import java.util.ConcurrentModificationException;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PrepareCallbackImpl implements PrepareCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    protected static final String TAG = "AriverInt:PrepareCallback";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static long onWarmupCompleted = 9200322089149404581L;
    protected boolean mAlreadyStarted;
    protected final RVAppRecord mAppRecord;
    private boolean mDisableLoadingView;
    private boolean mHasShowLoading;
    protected PrepareContext mPrepareContext;

    static /* synthetic */ void access$000(PrepareCallbackImpl prepareCallbackImpl, boolean z, EntryInfo entryInfo) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        prepareCallbackImpl.showLoadingOnInner(z, entryInfo);
        if (i4 != 0) {
            int i5 = 62 / 0;
        }
    }

    static /* synthetic */ void access$100(PrepareCallbackImpl prepareCallbackImpl, PrepareData prepareData, PrepareException prepareException) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        prepareCallbackImpl.prepareFailOnInner(prepareData, prepareException);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PrepareCallbackImpl(RVAppRecord rVAppRecord, PrepareContext prepareContext) {
        this(rVAppRecord, prepareContext, false);
    }

    public PrepareCallbackImpl(RVAppRecord rVAppRecord, PrepareContext prepareContext, boolean z) {
        this.mPrepareContext = prepareContext;
        this.mAppRecord = rVAppRecord;
        this.mAlreadyStarted = z;
        this.mDisableLoadingView = RVParams.DEFAULT_LONG_PRESSO_LOGIN.equalsIgnoreCase(BundleUtils.getString(rVAppRecord.getStartParams(), "disableLoadingView"));
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $10 + 101;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 24 - View.combineMeasuredStates(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19626, 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (onWarmupCompleted - 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 59 - (ViewConfiguration.getJumpTapTimeout() >> 16), 6383 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i8 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), View.MeasureSpec.getSize(0) + 24, 19627 - KeyEvent.normalizeMetaState(0), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 59 - TextUtils.indexOf("", "", 0), 6383 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 59 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.alibaba.ariver.resource.api.prepare.PrepareCallback
    public void showLoading(final boolean z, final EntryInfo entryInfo) {
        int i2 = 2 % 2;
        RVLogger.d(TAG, "showLoading: " + entryInfo + ", disableLoadingView: " + this.mDisableLoadingView);
        this.mHasShowLoading = true;
        if (!this.mDisableLoadingView) {
            if ("yes".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("ta_showLoading_use_main_thread", "no"))) {
                ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.integration.resource.PrepareCallbackImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PrepareCallbackImpl.access$000(PrepareCallbackImpl.this, z, entryInfo);
                    }
                });
                return;
            } else {
                showLoadingOnInner(z, entryInfo);
                return;
            }
        }
        int i3 = onExtraCallback + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(this.mAppRecord.getStartParams(), RVParams.LONG_SHOW_LOADING, "disable");
            int i4 = 97 / 0;
        } else {
            ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(this.mAppRecord.getStartParams(), RVParams.LONG_SHOW_LOADING, "disable");
        }
        int i5 = onExtraCallbackWithResult + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void showLoadingOnInner(boolean z, EntryInfo entryInfo) {
        PrepareCallbackParam prepareCallbackParam;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(this.mAppRecord.getStartParams(), RVParams.LONG_SHOW_LOADING, "enable");
        if (!this.mAlreadyStarted) {
            int i5 = onExtraCallbackWithResult + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ta_prepare_clone_startParams", true)) {
                prepareCallbackParam = new PrepareCallbackParam(new Bundle(this.mPrepareContext.getStartParams()), new Bundle(this.mPrepareContext.getSceneParams()), this.mPrepareContext.getAppModel());
                RVLogger.d(TAG, "showLoading on inner use clone startParams");
            } else {
                prepareCallbackParam = new PrepareCallbackParam(this.mPrepareContext);
            }
            prepareCallbackParam.action = StartAction.SHOW_LOADING;
            prepareCallbackParam.needWaitIpc = true;
            startApp(prepareCallbackParam);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("entryInfo", entryInfo);
        bundle.putBoolean("needWaitLoadingAnim", z);
        IpcServerUtils.sendMsgToClient(this.mAppRecord.getAppId(), this.mAppRecord.getStartToken(), 0, bundle);
    }

    @Override // com.alibaba.ariver.resource.api.prepare.PrepareCallback
    public void updateLoading(EntryInfo entryInfo, AppModel appModel) {
        int i2 = 2 % 2;
        RVLogger.d(TAG, "updateLoading: " + entryInfo + ", disableLoadingView: " + this.mDisableLoadingView);
        this.mHasShowLoading = true;
        if (!this.mDisableLoadingView) {
            ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(this.mAppRecord.getStartParams(), "updateLoading", "enable");
            Bundle bundle = new Bundle();
            bundle.putParcelable("entryInfo", entryInfo);
            bundle.putParcelable("appInfo", appModel);
            IpcServerUtils.sendMsgToClient(this.mAppRecord.getAppId(), this.mAppRecord.getStartToken(), 1, bundle);
            return;
        }
        int i3 = onExtraCallbackWithResult + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(this.mAppRecord.getStartParams(), "updateLoading", "disable");
        int i5 = onExtraCallbackWithResult + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.alibaba.ariver.resource.api.prepare.PrepareCallback
    public void prepareFail(final PrepareData prepareData, final PrepareException prepareException) {
        int i2 = 2 % 2;
        RVLogger.e(TAG, "prepareFail!", prepareException);
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.integration.resource.PrepareCallbackImpl.2
            @Override // java.lang.Runnable
            public void run() {
                ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(PrepareCallbackImpl.this.mAppRecord.getStartParams(), "prepareFail", prepareException.getCode());
                ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(PrepareCallbackImpl.this.mAppRecord.getStartParams(), "prepareFailMsg", prepareException.getMessage());
                PrepareCallbackImpl.access$100(PrepareCallbackImpl.this, prepareData, prepareException);
            }
        });
        int i3 = onExtraCallbackWithResult + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private void prepareFailOnInner(PrepareData prepareData, PrepareException prepareException) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            if (!this.mAlreadyStarted) {
                PrepareCallbackParam prepareCallbackParam = new PrepareCallbackParam(this.mPrepareContext);
                prepareCallbackParam.action = StartAction.SHOW_ERROR;
                prepareCallbackParam.needWaitIpc = false;
                if (prepareCallbackParam.sceneParams == null) {
                    prepareCallbackParam.sceneParams = new Bundle();
                }
                prepareCallbackParam.sceneParams.putString("prepareExceptionCode", prepareException.getCode());
                prepareCallbackParam.sceneParams.putString("prepareExceptionMessage", prepareException.getMessage());
                startApp(prepareCallbackParam);
            }
            sendPrepareFailMsgToClient(prepareData, prepareException);
            int i4 = onExtraCallback + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
                return;
            }
            return;
        }
        throw null;
    }

    protected void sendPrepareFailMsgToClient(PrepareData prepareData, PrepareException prepareException) {
        int i2 = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.setClassLoader(PrepareCallbackImpl.class.getClassLoader());
        if (prepareException != null) {
            int i3 = onExtraCallbackWithResult + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            bundle.putString("prepareExceptionCode", prepareException.getCode());
            bundle.putString("prepareExceptionMessage", prepareException.getMessage());
            if (prepareException.getCause() instanceof UpdateAppException) {
                UpdateAppException cause = prepareException.getCause();
                if (cause.getExtras() != null) {
                    Bundle bundle2 = new Bundle();
                    for (String str : cause.getExtras().keySet()) {
                        int i5 = onExtraCallback + 59;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        if (str != null) {
                            int i7 = onExtraCallback + 77;
                            onExtraCallbackWithResult = i7 % 128;
                            if (i7 % 2 != 0) {
                                bundle2.putString(str, (String) cause.getExtras().get(str));
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            bundle2.putString(str, (String) cause.getExtras().get(str));
                        }
                    }
                    bundle.putBundle("prepareExceptionExtras", bundle2);
                }
            }
        }
        bundle.putParcelable("prepareData", prepareData);
        if (this.mPrepareContext.getAppModel() != null) {
            bundle.putParcelable("appInfo", this.mPrepareContext.getAppModel());
            int i8 = onExtraCallback + 85;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        IpcServerUtils.sendMsgToClient(this.mAppRecord.getAppId(), this.mAppRecord.getStartToken(), 3, bundle);
    }

    @Override // com.alibaba.ariver.resource.api.prepare.PrepareCallback
    public void prepareFinish(PrepareData prepareData, @Nullable AppModel appModel, @Nullable Bundle bundle, @Nullable Bundle bundle2) {
        synchronized (this) {
            RVLogger.d(TAG, "prepareFinish");
            ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(this.mAppRecord.getStartParams(), "prepareFinish");
            IpcServerUtils.addStubToClient(this.mPrepareContext.getAppId(), this.mPrepareContext.getStartToken(), "PrepareStep_Finish", SystemClock.elapsedRealtime());
            onPkgPrepareFinish(bundle);
            if (!this.mAlreadyStarted) {
                PrepareCallbackParam prepareCallbackParam = new PrepareCallbackParam(this.mPrepareContext);
                prepareCallbackParam.needWaitIpc = false;
                prepareCallbackParam.action = StartAction.DIRECT_START;
                prepareCallbackParam.startParams = bundle;
                prepareCallbackParam.sceneParams = bundle2;
                startApp(prepareCallbackParam);
            }
            Bundle bundle3 = new Bundle();
            if (bundle != null) {
                bundle3.putParcelable("startParams", bundle);
            }
            if (bundle2 != null) {
                bundle2.putString(RVParams.APP_TYPE, this.mPrepareContext.appType);
                bundle3.putParcelable("sceneParams", bundle2);
            }
            if (appModel != null) {
                bundle3.putParcelable("appInfo", appModel);
            }
            bundle3.putParcelable("prepareData", prepareData);
            IpcServerUtils.sendMsgToClient(this.mAppRecord.getAppId(), this.mAppRecord.getStartToken(), 2, bundle3);
        }
    }

    @Override // com.alibaba.ariver.resource.api.prepare.PrepareCallback
    public void prepareAbort() {
        int i2 = 2 % 2;
        RVLogger.d(TAG, "forceFinish from stack: " + Log.getStackTraceString(new Throwable("Just Print")));
        ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(this.mAppRecord.getStartParams(), "prepareAbort");
        Bundle bundle = new Bundle();
        bundle.putString("prepareAbortReason", "Finish from mStartToken!");
        IpcServerUtils.sendMsgToClient(this.mAppRecord.getAppId(), this.mAppRecord.getStartToken(), 4, bundle);
        int i3 = onExtraCallbackWithResult + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected StartClientBundle createStartClient(PrepareCallbackParam prepareCallbackParam) throws Throwable {
        int iOrdinal;
        int i2 = 2 % 2;
        Bundle sceneParams = this.mAppRecord.getSceneParams();
        AppModel appModel = prepareCallbackParam.appInfo;
        if (appModel != null) {
            sceneParams.putParcelable("appInfo", appModel);
            this.mAppRecord.setAppModel(prepareCallbackParam.appInfo);
        }
        if (!TextUtils.isEmpty(this.mPrepareContext.appType)) {
            sceneParams.putString(RVParams.APP_TYPE, this.mPrepareContext.appType);
        }
        EntryInfo entryInfo = this.mPrepareContext.getEntryInfo();
        if (entryInfo == null) {
            entryInfo = ResourceUtils.getEntryInfo(prepareCallbackParam.appInfo);
        }
        if (entryInfo != null) {
            sceneParams.putParcelable("entryInfo", entryInfo);
        }
        StepType appCreateStepType = this.mPrepareContext.getAppCreateStepType();
        if (appCreateStepType == null) {
            int i3 = onExtraCallbackWithResult + 39;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iOrdinal = -1;
        } else {
            iOrdinal = appCreateStepType.ordinal();
        }
        sceneParams.putInt("prepareStepType", iOrdinal);
        sceneParams.putLong("ariverStartClientTime", SystemClock.elapsedRealtime());
        sceneParams.putBoolean("needWaitIpc", prepareCallbackParam.needWaitIpc);
        Bundle startParams = this.mPrepareContext.getStartParams();
        Object[] objArr = new Object[1];
        a(new char[]{37095, 13937, 56796}, 42641 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        ParamUtils.unify(startParams, ((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new char[]{37095, 13937, 56796}, 42641 - KeyEvent.normalizeMetaState(0), objArr2);
        ParamUtils.parseMagicOptions(startParams, BundleUtils.getString(startParams, ((String) objArr2[0]).intern()));
        try {
            ParamUtils.unifyAll(this.mAppRecord.getStartParams(), false);
            ParamUtils.unifyAll(startParams, false);
        } catch (ConcurrentModificationException e) {
            RVLogger.e(TAG, "PrepareCallBackImpl unifyAll concurrentModificationException,", e);
        }
        if (this.mHasShowLoading && this.mDisableLoadingView) {
            startParams.putAll(prepareCallbackParam.startParams);
            sceneParams.putAll(prepareCallbackParam.sceneParams);
            int i5 = onExtraCallback + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        StartClientBundle startClientBundle = new StartClientBundle();
        startClientBundle.appId = this.mAppRecord.getAppId();
        startClientBundle.appType = this.mPrepareContext.appType;
        startClientBundle.startToken = this.mAppRecord.getStartToken();
        startClientBundle.startParams = startParams;
        startClientBundle.sceneParams = sceneParams;
        startClientBundle.needWaitIpc = prepareCallbackParam.needWaitIpc;
        StartAction startAction = prepareCallbackParam.action;
        if (startAction != null) {
            int i7 = onExtraCallbackWithResult + 87;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            startClientBundle.startAction = startAction;
        } else {
            startClientBundle.startAction = StartAction.DIRECT_START;
            int i9 = onExtraCallback + 109;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        sceneParams.putLong("setupEndTimeStamp", SystemClock.elapsedRealtime());
        return startClientBundle;
    }

    @Override // com.alibaba.ariver.resource.api.prepare.PrepareCallback
    public void startApp(PrepareCallbackParam prepareCallbackParam) {
        synchronized (this) {
            if (this.mAlreadyStarted) {
                return;
            }
            this.mAlreadyStarted = true;
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_Prepare_StartClient);
            Intent intent = new Intent();
            intent.putExtra("ariverStartBundle", (Parcelable) createStartClient(prepareCallbackParam));
            this.mAppRecord.setLastStartClientTimeStamp(SystemClock.elapsedRealtime());
            Class<? extends Activity> clsStartClient = ((RVClientStarter) RVProxy.get(RVClientStarter.class)).startClient(this.mPrepareContext.getStartContext(), this.mAppRecord, intent);
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Prepare_StartClient);
            this.mAppRecord.setActivityClz(clsStartClient);
            ((TrackWatchDogProxy) RVProxy.get(TrackWatchDogProxy.class)).startAppStep(this.mAppRecord.getStartParams(), "startClient_done");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onPkgPrepareFinish(Bundle bundle) {
        AppInfoModel appInfoModel;
        String str;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (bundle != null) {
            try {
                AppModel appModel = this.mPrepareContext.getAppModel();
                if (appModel != null && (appInfoModel = appModel.getAppInfoModel()) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(appModel.getAppId());
                    sb.append("(name:");
                    sb.append(appInfoModel.getName());
                    sb.append(" version:");
                    sb.append(appModel.getAppVersion());
                    if (!"WEB_H5".equals(this.mPrepareContext.appType)) {
                        ResourcePackage resourcePackage = GlobalPackagePool.getInstance().getPackage("66666692");
                        String strVersion = resourcePackage != null ? resourcePackage.version() : null;
                        if (!TextUtils.isEmpty(strVersion)) {
                            int i4 = onExtraCallback + 61;
                            onExtraCallbackWithResult = i4 % 128;
                            if (i4 % 2 != 0) {
                                sb.append(" appx:");
                                sb.append(strVersion);
                                int i5 = 22 / 0;
                            } else {
                                sb.append(" appx:");
                                sb.append(strVersion);
                            }
                            int i6 = onExtraCallbackWithResult + 57;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    }
                    sb.append(")");
                    TemplateConfigModel templateConfig = appInfoModel.getTemplateConfig();
                    if (templateConfig != null) {
                        int i8 = onExtraCallbackWithResult + 109;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        if (templateConfig.isTemplateValid()) {
                            str = "模版id/" + templateConfig.getTemplateId() + ", ";
                        } else {
                            str = "";
                        }
                    }
                    AppLogger.log(new AppLog.Builder().setState(AppLog.APP_LOG_PREPARE_FINISH).setAppId(sb.toString()).setParentId(BundleUtils.getString(bundle, RVParams.START_APP_SESSION_ID)).setDesc(str + appModel.toString()).build());
                }
            } catch (Exception e) {
                RVLogger.e(TAG, "onPkgPrepareFinish error ", e);
            }
        }
    }
}
