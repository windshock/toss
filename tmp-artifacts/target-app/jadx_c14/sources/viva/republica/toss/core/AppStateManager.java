package viva.republica.toss.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.components.tuba.variable.TubaVarV1SyncState;
import im.toss.features.ble.service.AdvertisingBLEGattService;
import im.toss.features.ble.service.AdvertisingBLEService;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.state.spec.SessionState;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import o.ALCCamera;
import o.ALCDetectionMode;
import o.ALCOcclusion;
import o.AppSetIdAndScope1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.IconRoundCornerProgressBarSavedState;
import o.JsonReaderUnknownNumberParsing;
import o.NetConverter3;
import o.ReactJsExceptionHandlerProcessedErrorImpl;
import o.SessionTrackerb;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda3;
import o.UST_CERT_GetPublicKeyInfo;
import o.UST_CERT_GetSubjectAltName_RealName;
import o.UST_CERT_SetCertVerifyEnv;
import o.access8100;
import o.addAllCommandLine;
import o.auth;
import o.clearPid;
import o.clearTid;
import o.deserializeFloatNullableCollection;
import o.deserializeUriNullableCollection;
import o.ea10;
import o.enableModuleArgumentNSNullConversionIOS;
import o.filterCreatePageParams;
import o.getAdUnitIds;
import o.getByteBuffer;
import o.getCornerRadius;
import o.getIconPaddingLeft;
import o.getMemoryDumpCount;
import o.getNavigationBar;
import o.getNoticeNumbers;
import o.getPluginVersion;
import o.getSdkKey;
import o.getSegmentCollection;
import o.getWrite;
import o.mergeParams;
import o.nSetPosition;
import o.onVisit;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.resumeForClick;
import o.setCommandLine;
import o.setLogBuffers;
import o.setRevision;
import o.setRubIn;
import o.setShine;
import o.setTid;
import o.verifySignEX;
import o.ycxycx;
import o.zzaj;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.core.AppStateManager$;
import viva.republica.toss.core.AppStateManager$activityLifecycleCallback$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AppStateManager {
    private static final boolean IAuthTabCallback;
    private static final onExtraCallbackWithResult IAuthTabCallbackDefault;
    private static final getCornerRadius<WeakReference<Activity>> IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static final Lazy IAuthTabCallback_Parcel;
    private static final AppSetIdAndScope1 ICustomTabsCallback;
    private static final Lazy access000;
    private static long access100;
    private static final setTid<Boolean> asBinder;
    private static ALCOcclusion asInterface;
    private static final ReadWriteProperty extraCallback;
    private static final Lazy extraCallbackWithResult;
    private static final setRubIn<WeakReference<Activity>> getInterfaceDescriptor;
    public static final int onExtraCallback;
    public static final AppStateManager onExtraCallbackWithResult;
    private static final Lazy onMessageChannelReady;
    private static final long onNavigationEvent;
    private static Context onTransact;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted = {new MutablePropertyReference1Impl<>(AppStateManager.class, "lastStart", "getLastStart()Ljava/lang/ref/WeakReference;", 0)};
    private static List<Pair<WeakReference<Activity>, Long>> readTypedObject;
    private static final Lazy writeTypedObject;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ICustomTabsCallbackDefault() {
        return true;
    }

    public static final class onExtraCallback<T1, T2, R> implements deserializeFloatNullableCollection<T1, T2, R> {
        /* JADX WARN: Multi-variable type inference failed */
        public final R apply(@NotNull T1 t1, @NotNull T2 t2) {
            Intrinsics.checkParameterIsNotNull(t1, "");
            Intrinsics.checkParameterIsNotNull(t2, "");
            return (R) Boolean.valueOf(((Boolean) t1).booleanValue() || ((Boolean) t2).booleanValue());
        }
    }

    public static final class onNavigationEvent<T1, T2, R> implements deserializeFloatNullableCollection<T1, T2, R> {
        /* JADX WARN: Multi-variable type inference failed */
        public final R apply(@NotNull T1 t1, @NotNull T2 t2) {
            Intrinsics.checkParameterIsNotNull(t1, "");
            Intrinsics.checkParameterIsNotNull(t2, "");
            return (R) Boolean.valueOf((((Boolean) t1).booleanValue() || ((Boolean) t2).booleanValue()) ? false : true);
        }
    }

    public static final class IAuthTabCallback extends ObservableProperty<WeakReference<Activity>> {
        public IAuthTabCallback(Object obj) {
            super(obj);
        }

        public void afterChange(addAllCommandLine<?> addallcommandline, WeakReference<Activity> weakReference, WeakReference<Activity> weakReference2) {
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            AppStateManager.IAuthTabCallbackStub.onNavigationEvent(weakReference2);
        }
    }

    private AppStateManager() {
    }

    private final WeakReference<Activity> ICustomTabsService() {
        return (WeakReference) extraCallback.getValue(this, onWarmupCompleted[0]);
    }

    private final void onExtraCallbackWithResult(WeakReference<Activity> weakReference) {
        extraCallback.setValue(this, onWarmupCompleted[0], weakReference);
    }

    public final int ICustomTabsCallback() {
        return IAuthTabCallbackStubProxy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getPluginVersion extraCommand() {
        return getPluginVersion.Companion.onWarmupCompleted();
    }

    public final getPluginVersion writeTypedObject() {
        return (getPluginVersion) writeTypedObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getSdkKey ICustomTabsCallbackStubProxy() {
        return getSdkKey.Companion.onExtraCallback();
    }

    public final getSdkKey extraCallbackWithResult() {
        return (getSdkKey) access000.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getSegmentCollection newAuthTabSession() {
        return getSegmentCollection.Companion.onNavigationEvent();
    }

    public final getSegmentCollection onActivityLayout() {
        return (getSegmentCollection) onMessageChannelReady.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TubaVarV1SyncState postMessage() {
        return TubaVarV1SyncState.Companion.onNavigationEvent();
    }

    public final TubaVarV1SyncState onMinimized() {
        return (TubaVarV1SyncState) extraCallbackWithResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getAdUnitIds onUnminimized() {
        return getAdUnitIds.Companion.onExtraCallback();
    }

    public final getAdUnitIds IAuthTabCallback_Parcel() {
        return (getAdUnitIds) IAuthTabCallback_Parcel.getValue();
    }

    public final ALCOcclusion IAuthTabCallbackStubProxy() {
        return asInterface;
    }

    public final List<Pair<WeakReference<Activity>, Long>> onMessageChannelReady() {
        return readTypedObject;
    }

    public final void IAuthTabCallback(@NotNull ALCOcclusion aLCOcclusion) {
        Intrinsics.checkNotNullParameter(aLCOcclusion, "");
        asInterface = aLCOcclusion;
    }

    public final boolean onPostMessage() {
        setTid<Boolean> settid = asBinder;
        return settid.ICustomTabsCallback() && Intrinsics.areEqual(settid.onWarmupCompleted(), Boolean.TRUE);
    }

    public final boolean onActivityResized() {
        return IAuthTabCallbackStubProxy > 0;
    }

    public final Activity readTypedObject() {
        WeakReference<Activity> weakReferenceICustomTabsService = ICustomTabsService();
        if (weakReferenceICustomTabsService != null) {
            return weakReferenceICustomTabsService.get();
        }
        return null;
    }

    public final setRubIn<WeakReference<Activity>> extraCallback() {
        return getInterfaceDescriptor;
    }

    public final void onNavigationEvent(@Nullable Activity activity) throws Throwable {
        if (Intrinsics.areEqual(readTypedObject(), activity)) {
            return;
        }
        if (activity != null) {
            onVisit.IAuthTabCallback(activity);
        }
        WeakReference<Activity> weakReference = null;
        if (activity != null) {
            try {
                Object[] objArr = {auth.onNavigationEvent, activity instanceof ComponentActivity ? (ComponentActivity) activity : null};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1652393382);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 31476), 22 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22792, -1396538166, false, "onExtraCallback", new Class[]{auth.class, ComponentActivity.class});
                }
                ((Method) objOnExtraCallback).invoke(null, objArr);
                weakReference = new WeakReference<>(activity);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        onExtraCallbackWithResult(weakReference);
    }

    public static final class onExtraCallbackWithResult implements Application.ActivityLifecycleCallbacks {
        private deserializeUriNullableCollection IAuthTabCallback;

        onExtraCallbackWithResult() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
            activity.getClass().getSimpleName();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) throws Throwable {
            Intrinsics.checkNotNullParameter(activity, "");
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
            activity.getClass().getSimpleName();
            activity.isTaskRoot();
            AppStateManager.onExtraCallbackWithResult.onNavigationEvent(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) throws Throwable {
            Intrinsics.checkNotNullParameter(activity, "");
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
            activity.getClass().getSimpleName();
            AppStateManager.onExtraCallbackWithResult.onNavigationEvent(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            AppStateManager appStateManager = AppStateManager.onExtraCallbackWithResult;
            CollectionsKt.removeAll(appStateManager.onMessageChannelReady(), new AppStateManager$activityLifecycleCallback$1$.ExternalSyntheticLambda0(activity));
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
            activity.getClass().getSimpleName();
            AppStateManager.IAuthTabCallbackStubProxy = appStateManager.ICustomTabsCallback() - 1;
            if (appStateManager.onActivityResized()) {
                return;
            }
            if (AppStateManager.IAuthTabCallback) {
                AppSetIdAndScope1 unused2 = AppStateManager.ICustomTabsCallback;
            }
            this.IAuthTabCallback = NetConverter3.onExtraCallback().onNavigationEvent(new AppStateManager$activityLifecycleCallback$1$.ExternalSyntheticLambda1(), 700L, TimeUnit.MILLISECONDS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onExtraCallbackWithResult(Activity activity, Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            return Intrinsics.areEqual(((WeakReference) pair.getFirst()).get(), activity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onNavigationEvent() {
            if (AppStateManager.onExtraCallbackWithResult.onActivityResized()) {
                return;
            }
            AppState.Companion.onExtraCallbackWithResult().onNavigationEvent(AppState.Event.OnAllActivityDestroyed.onNavigationEvent);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
            activity.getClass().getSimpleName();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) throws Throwable {
            Intrinsics.checkNotNullParameter(activity, "");
            AppStateManager appStateManager = AppStateManager.onExtraCallbackWithResult;
            if (Intrinsics.areEqual(appStateManager.readTypedObject(), activity) && activity.isFinishing()) {
                appStateManager.onNavigationEvent((Activity) null);
            }
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
            activity.getClass().getSimpleName();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
            activity.getClass().getSimpleName();
            activity.isTaskRoot();
            deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallback;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            AppStateManager appStateManager = AppStateManager.onExtraCallbackWithResult;
            AppStateManager.IAuthTabCallbackStubProxy = appStateManager.ICustomTabsCallback() + 1;
            appStateManager.onMessageChannelReady().add(new Pair<>(new WeakReference(activity), Long.valueOf(zzaj.onWarmupCompleted().onExtraCallbackWithResult())));
        }
    }

    public final void onNavigationEvent(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        onTransact = application;
        NetConverter3.onExtraCallback().onExtraCallback(new AppStateManager$.ExternalSyntheticLambda12());
        application.registerActivityLifecycleCallbacks(IAuthTabCallbackDefault);
        JsonReaderUnknownNumberParsing.onNavigationEvent(new AppStateManager$.ExternalSyntheticLambda23()).onExtraCallback(clearTid.onExtraCallback()).IAuthTabCallback(new AppStateManager$.ExternalSyntheticLambda42(new AppStateManager$.ExternalSyntheticLambda34())).onWarmupCompleted(new AppStateManager$.ExternalSyntheticLambda44(new AppStateManager$.ExternalSyntheticLambda43())).IAuthTabCallback(new AppStateManager$.ExternalSyntheticLambda46(new AppStateManager$.ExternalSyntheticLambda45(application)));
        getByteBuffer getbytebufferAsBinder = ALCCamera.onWarmupCompleted.asBinder();
        setTid<Boolean> settid = asBinder;
        clearPid clearpid = clearPid.onWarmupCompleted;
        getByteBuffer getbytebufferOnExtraCallback = getbytebufferAsBinder.onExtraCallback(new AppStateManager$.ExternalSyntheticLambda48(new AppStateManager$.ExternalSyntheticLambda47()));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        getByteBuffer getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(settid, getbytebufferOnExtraCallback, new onExtraCallback());
        Intrinsics.checkExpressionValueIsNotNull(getbytebufferOnWarmupCompleted, "");
        getbytebufferOnWarmupCompleted.asBinder().onExtraCallback(new AppStateManager$.ExternalSyntheticLambda14(new AppStateManager$.ExternalSyntheticLambda13())).onExtraCallbackWithResult(clearTid.onExtraCallback()).IAuthTabCallback(new AppStateManager$.ExternalSyntheticLambda16(new AppStateManager$.ExternalSyntheticLambda15(application)));
        getByteBuffer getbytebufferOnExtraCallback2 = getbytebufferAsBinder.onExtraCallback(new AppStateManager$.ExternalSyntheticLambda18(new AppStateManager$.ExternalSyntheticLambda17()));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback2, "");
        getByteBuffer getbytebufferOnWarmupCompleted2 = getByteBuffer.onWarmupCompleted(settid, getbytebufferOnExtraCallback2, new onNavigationEvent());
        Intrinsics.checkExpressionValueIsNotNull(getbytebufferOnWarmupCompleted2, "");
        getbytebufferOnWarmupCompleted2.asBinder().onExtraCallback(new AppStateManager$.ExternalSyntheticLambda20(new AppStateManager$.ExternalSyntheticLambda19())).onExtraCallbackWithResult(clearTid.onExtraCallback()).IAuthTabCallback(new AppStateManager$.ExternalSyntheticLambda22(new AppStateManager$.ExternalSyntheticLambda21(application)));
        getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(verifySignEX.class).onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new AppStateManager$.ExternalSyntheticLambda25(new AppStateManager$.ExternalSyntheticLambda24()), new AppStateManager$.ExternalSyntheticLambda27(new AppStateManager$.ExternalSyntheticLambda26()));
        settid.onWarmupCompleted(new AppStateManager$.ExternalSyntheticLambda37(new AppStateManager$.ExternalSyntheticLambda36())).asBinder(JsonReaderUnknownNumberParsing.onNavigationEvent(new AppStateManager$.ExternalSyntheticLambda28()).onExtraCallback(clearTid.onExtraCallback()).IAuthTabCallback(new AppStateManager$.ExternalSyntheticLambda30(new AppStateManager$.ExternalSyntheticLambda29())).onWarmupCompleted(new AppStateManager$.ExternalSyntheticLambda32(new AppStateManager$.ExternalSyntheticLambda31())).extraCallback().asInterface(new AppStateManager$.ExternalSyntheticLambda35(new AppStateManager$.ExternalSyntheticLambda33()))).onTransact(5L, TimeUnit.SECONDS).onExtraCallbackWithResult(clearTid.onExtraCallback()).onExtraCallbackWithResult(new AppStateManager$.ExternalSyntheticLambda39(new AppStateManager$.ExternalSyntheticLambda38()), new AppStateManager$.ExternalSyntheticLambda41(new AppStateManager$.ExternalSyntheticLambda40()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mayLaunchUrl() {
        TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().IAuthTabCallback(new AppLifecycleObserver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppState ICustomTabsCallback_Parcel() {
        return AppState.Companion.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(AppState appState) {
        Intrinsics.checkNotNullParameter(appState, "");
        return appState.onNavigationEvent(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk mayLaunchUrl(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInterfaceDescriptor(Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newSession(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean prefetch(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(Application application, Boolean bool) {
        try {
            Result.Companion companion = Result.Companion;
            ReactJsExceptionHandlerProcessedErrorImpl.onNavigationEvent.IAuthTabCallback(application);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit access000(Boolean bool) {
        Objects.toString(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newAuthTabSession(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMinimized(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(Boolean bool) {
        if (!Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("Check failed.");
        }
        if (bool.booleanValue()) {
            AppState.Companion.onExtraCallbackWithResult().onNavigationEvent(AppState.Event.OnAppForeground.onExtraCallbackWithResult);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPostMessage(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(Application application, Boolean bool) {
        if (bool.booleanValue()) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "airdrop", "willEnterForeground", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            AdvertisingBLEGattService.Companion.onExtraCallback(application, true);
            AdvertisingBLEService.Companion.onNavigationEvent(application);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(Boolean bool) {
        Objects.toString(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ICustomTabsCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ICustomTabsCallbackStubProxy(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackDefault(Boolean bool) {
        if (bool.booleanValue()) {
            AppState.onExtraCallbackWithResult onextracallbackwithresult = AppState.Companion;
            onextracallbackwithresult.onExtraCallbackWithResult().onNavigationEvent(AppState.Event.OnAppBackground.onExtraCallback);
            getNoticeNumbers.Companion.onExtraCallbackWithResult(false);
            if (!onExtraCallbackWithResult.onActivityResized()) {
                onextracallbackwithresult.onExtraCallbackWithResult().onNavigationEvent(AppState.Event.OnAllActivityDestroyed.onNavigationEvent);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRelationshipValidationResult(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Application application, Boolean bool) {
        if (bool.booleanValue()) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "airdrop", "didEnterBackground", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            AdvertisingBLEGattService.Companion.onExtraCallback(application, false);
            getNoticeNumbers.Companion.onExtraCallbackWithResult(false);
            AdvertisingBLEService.Companion.IAuthTabCallback(application);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ICustomTabsCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(verifySignEX verifysignex) {
        Intent intentIAuthTabCallback;
        AppStateManager appStateManager = onExtraCallbackWithResult;
        Activity typedObject = appStateManager.readTypedObject();
        Objects.toString(verifysignex);
        Objects.toString(typedObject);
        Activity typedObject2 = appStateManager.readTypedObject();
        if (typedObject2 != null) {
            typedObject2.finish();
            String strOnNavigationEvent = verifysignex.onNavigationEvent();
            if (strOnNavigationEvent != null && strOnNavigationEvent.length() > 0) {
                if (enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(verifysignex.onNavigationEvent())) {
                    SessionTrackerb.IAuthTabCallback(resumeForClick.asBinder, typedObject2, verifysignex.onNavigationEvent(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                } else {
                    try {
                        Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{verifysignex.onNavigationEvent()});
                        if (uri != null && (intentIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(uri, (String) null, (Bundle) null, 3, (Object) null)) != null) {
                            getNavigationBar.IAuthTabCallback(intentIAuthTabCallback, typedObject2);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Throwable th) {
                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AppStateManager", th);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnminimized(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionState isEngagementSignalsApiAvailable() {
        return SessionState.Companion.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk ICustomTabsService(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(SessionState sessionState) {
        Intrinsics.checkNotNullParameter(sessionState, "");
        return sessionState.onExtraCallbackWithResult(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean extraCommand(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallback(SessionState.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        return Intrinsics.areEqual(state, SessionState.State.LoginSession.onExtraCallbackWithResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isEngagementSignalsApiAvailable(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean onWarmupCompleted(SessionState.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallbackStubProxy(Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ICustomTabsCallback_Parcel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postMessage(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback_Parcel(Boolean bool) {
        AppStateManager appStateManager = onExtraCallbackWithResult;
        Context context = onTransact;
        Intrinsics.checkNotNull(context);
        appStateManager.onNavigationEvent(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newSessionWithExtras(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Throwable th) {
        Intrinsics.checkNotNull(th);
        ALCDetectionMode.onExtraCallbackWithResult(th, (Map) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public final void onNavigationEvent(@NotNull Context context) {
        NetworkInfo activeNetworkInfo;
        String typeName;
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object systemService2 = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService2 instanceof ConnectivityManager ? (ConnectivityManager) systemService2 : null;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && (typeName = activeNetworkInfo.getTypeName()) != null) {
            str = typeName;
        }
        linkedHashMap.put("connection", str);
        Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.getMode()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            linkedHashMap.put("status", "connected");
            linkedHashMap.put("call_type", "cellular");
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            linkedHashMap.put("status", "connected");
            linkedHashMap.put("call_type", "voip");
        } else {
            linkedHashMap.put("status", "idle");
            linkedHashMap.put("call_type", "idle");
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ads_callinfo", "", linkedHashMap, null, false, null, 48, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }

    public final void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Function0<Boolean> function0) {
        UST_CERT_SetCertVerifyEnv uST_CERT_SetCertVerifyEnvOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Activity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (onActivityLayout().onWarmupCompleted()) {
            getSegmentCollection.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = onActivityLayout().onExtraCallbackWithResult();
            getSegmentCollection.IAuthTabCallback iAuthTabCallback = iAuthTabCallbackOnExtraCallbackWithResult instanceof getSegmentCollection.IAuthTabCallback ? iAuthTabCallbackOnExtraCallbackWithResult : null;
            if (iAuthTabCallback == null || (uST_CERT_SetCertVerifyEnvOnExtraCallbackWithResult = UST_CERT_GetSubjectAltName_RealName.onExtraCallbackWithResult(iAuthTabCallback)) == null) {
                uST_CERT_SetCertVerifyEnvOnExtraCallbackWithResult = UST_CERT_SetCertVerifyEnv.INVALID;
            }
            UST_CERT_GetPublicKeyInfo.onWarmupCompleted.onWarmupCompleted(activity, uST_CERT_SetCertVerifyEnvOnExtraCallbackWithResult);
            return;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = onActivityLayout().IAuthTabCallback(true).onExtraCallback(getSegmentCollection.IAuthTabCallback.class).onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new AppStateManager$.ExternalSyntheticLambda2(new AppStateManager$.ExternalSyntheticLambda1(function0, activity))).onNavigationEvent(new AppStateManager$.ExternalSyntheticLambda4(new AppStateManager$.ExternalSyntheticLambda3())).IAuthTabCallback(new AppStateManager$.ExternalSyntheticLambda6(new AppStateManager$.ExternalSyntheticLambda5()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionIAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
    }

    private static final boolean onExtraCallback(FragmentActivity fragmentActivity) {
        return fragmentActivity.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onActivityResized(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallback(Function0 function0, FragmentActivity fragmentActivity, getSegmentCollection.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        return onExtraCallback(fragmentActivity) && ((Boolean) function0.invoke()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UST_CERT_SetCertVerifyEnv onMessageChannelReady(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (UST_CERT_SetCertVerifyEnv) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UST_CERT_SetCertVerifyEnv onWarmupCompleted(getSegmentCollection.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        return UST_CERT_GetSubjectAltName_RealName.onExtraCallbackWithResult(iAuthTabCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityLayout(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(UST_CERT_SetCertVerifyEnv uST_CERT_SetCertVerifyEnv) {
        if (uST_CERT_SetCertVerifyEnv != null) {
            UST_CERT_GetPublicKeyInfo.onWarmupCompleted.onWarmupCompleted(onExtraCallbackWithResult.readTypedObject(), uST_CERT_SetCertVerifyEnv);
        }
        return Unit.INSTANCE;
    }

    public static final class FragmentLifecycleObserver implements DefaultLifecycleObserver {
        private final String IAuthTabCallback;

        public FragmentLifecycleObserver(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public /* bridge */ void onPause(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        }

        public /* bridge */ void onResume(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            super.onResume(textFieldScrollKtExternalSyntheticLambda0);
        }

        public void onCreate(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
        }

        public void onStart(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
        }

        public void onStop(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
        }

        public void onDestroy(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            AppSetIdAndScope1 unused = AppStateManager.ICustomTabsCallback;
        }
    }

    public final void onExtraCallback(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        if (IAuthTabCallback) {
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = fragment.getLifecycle();
            String simpleName = fragment.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            lifecycle.IAuthTabCallback(new FragmentLifecycleObserver(simpleName));
        }
    }

    public final void onRelationshipValidationResult() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = readTypedObject.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Activity activity = (Activity) ((WeakReference) pair.getFirst()).get();
            if (activity != null) {
                if (((Number) pair.getSecond()).longValue() + 20000 < zzaj.onWarmupCompleted().onExtraCallbackWithResult()) {
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "UnNormalLifeCycleAction", "activity not destroyed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("class_name", activity.getClass().getName()), getWrite.IAuthTabCallback("created_before", String.valueOf(zzaj.onWarmupCompleted().onExtraCallbackWithResult() - ((Number) pair.getSecond()).longValue())), getWrite.IAuthTabCallback("is_finishing", zzaz.onExtraCallbackWithResult(activity.isFinishing())), getWrite.IAuthTabCallback("is_destroyed", zzaz.onExtraCallbackWithResult(activity.isDestroyed()))}), (String) null, false, (String) null, 56, (Object) null);
                } else {
                    arrayList.add(pair);
                }
            }
        }
        readTypedObject = arrayList;
    }

    public final boolean ICustomTabsCallbackStub() {
        if (access100 == -1) {
            return false;
        }
        return access100 + setLogBuffers.asBinder(onNavigationEvent) < zzaj.onWarmupCompleted().onExtraCallbackWithResult();
    }

    static {
        AppStateManager appStateManager = new AppStateManager();
        onExtraCallbackWithResult = appStateManager;
        IAuthTabCallback = zzaj.onNavigationEvent().onActivityLayout();
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        onNavigationEvent = setCommandLine.onWarmupCompleted(15, setRevision.MINUTES);
        access100 = -1L;
        getMemoryDumpCount getmemorydumpcount = getMemoryDumpCount.onNavigationEvent;
        extraCallback = new IAuthTabCallback(null);
        ICustomTabsCallback = ea10.onExtraCallbackWithResult(appStateManager.getClass().getSimpleName());
        writeTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateManager$$ExternalSyntheticLambda7
            public final Object invoke() {
                return AppStateManager.extraCommand();
            }
        });
        access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateManager$$ExternalSyntheticLambda8
            public final Object invoke() {
                return AppStateManager.ICustomTabsCallbackStubProxy();
            }
        });
        onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateManager$$ExternalSyntheticLambda9
            public final Object invoke() {
                return AppStateManager.newAuthTabSession();
            }
        });
        extraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateManager$$ExternalSyntheticLambda10
            public final Object invoke() {
                return AppStateManager.postMessage();
            }
        });
        IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateManager$$ExternalSyntheticLambda11
            public final Object invoke() {
                return AppStateManager.onUnminimized();
            }
        });
        asInterface = ALCOcclusion.Companion.onNavigationEvent();
        readTypedObject = new ArrayList();
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        asBinder = settidOnNavigationEvent;
        getCornerRadius<WeakReference<Activity>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(new WeakReference(null));
        IAuthTabCallbackStub = getcornerradiusOnNavigationEvent;
        getInterfaceDescriptor = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        IAuthTabCallbackDefault = new onExtraCallbackWithResult();
        onExtraCallback = 8;
    }
}
