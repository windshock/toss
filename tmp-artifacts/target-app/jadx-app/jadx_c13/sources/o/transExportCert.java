package o;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.runtime.ReactSurfaceView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.getPackageType;
import o.pkcs5PBKDF2;
import o.transExportCert;
import o.transGetKmCert;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import run.granite.DefaultErrorView;
import run.granite.DefaultLoadingView;
import run.granite.ReactHostFactory;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transExportCert implements transGenerateCertNum {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private logicVerifyID IAuthTabCallback;
    private findResAndMsg IAuthTabCallbackDefault;
    private Function2<? super AppCompatActivity, ? super Throwable, ? extends View> IAuthTabCallbackStub;
    private WeakReference<AppCompatActivity> IAuthTabCallbackStubProxy;
    private onExtraCallbackWithResult IAuthTabCallback_Parcel = onExtraCallbackWithResult.BEFORE_CREATE;
    private ReactInstanceEventListener ICustomTabsCallback;
    private Function1<? super AppCompatActivity, ? extends ViewGroup> access000;
    private ReactHost access100;
    private Function1<? super Throwable, Unit> asBinder;
    private Function0<Unit> asInterface;
    private Function1<? super ReactSurfaceView, Unit> extraCallback;
    private ReactSurface extraCallbackWithResult;
    private getPackageType getInterfaceDescriptor;
    private Function0<? extends logicVerifyID> onExtraCallback;
    private ComponentFactory onExtraCallbackWithResult;
    private View onNavigationEvent;
    private Function1<? super AppCompatActivity, ? extends View> onTransact;
    private transGetKmCert onWarmupCompleted;
    private Function2<? super AppCompatActivity, ? super transGetKmCert, ? extends ReactHost> readTypedObject;
    private Function0<? extends List<? extends ReactPackage>> writeTypedObject;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr[onExtraCallbackWithResult.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallbackWithResult.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallbackWithResult.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        public static final onExtraCallbackWithResult BEFORE_CREATE = new onExtraCallbackWithResult("BEFORE_CREATE", 0);
        public static final onExtraCallbackWithResult CREATED = new onExtraCallbackWithResult("CREATED", 1);
        public static final onExtraCallbackWithResult RESUMED = new onExtraCallbackWithResult("RESUMED", 2);
        public static final onExtraCallbackWithResult PAUSED = new onExtraCallbackWithResult("PAUSED", 3);
        public static final onExtraCallbackWithResult DESTROYED = new onExtraCallbackWithResult("DESTROYED", 4);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            return new onExtraCallbackWithResult[]{BEFORE_CREATE, CREATED, RESUMED, PAUSED, DESTROYED};
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            return $ENTRIES;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            return (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
        }

        public static onExtraCallbackWithResult[] values() {
            return (onExtraCallbackWithResult[]) $VALUES.clone();
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatActivity IAuthTabCallbackDefault() {
        WeakReference<AppCompatActivity> weakReference = this.IAuthTabCallbackStubProxy;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // o.transGenerateCertNum
    public void onExtraCallbackWithResult(@NotNull AppCompatActivity appCompatActivity, @Nullable Bundle bundle, @NotNull Bundle bundle2) {
        List<? extends ReactPackage> listEmptyList;
        logicVerifyID logicverifyidInvoke;
        View defaultLoadingView;
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(bundle2, "");
        this.IAuthTabCallback_Parcel = onExtraCallbackWithResult.CREATED;
        this.IAuthTabCallbackStubProxy = new WeakReference<>(appCompatActivity);
        Function0<? extends List<? extends ReactPackage>> function0 = this.writeTypedObject;
        if (function0 == null || (listEmptyList = function0.invoke()) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        listEmptyList.size();
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            ((ReactPackage) it.next()).getClass().getSimpleName();
        }
        Function0<? extends logicVerifyID> function02 = this.onExtraCallback;
        if (function02 == null || (logicverifyidInvoke = function02.invoke()) == null) {
            throw new IllegalStateException("BundleLoader provider not set");
        }
        this.IAuthTabCallback = logicverifyidInvoke;
        Function0<Unit> function03 = this.asInterface;
        if (function03 != null) {
            function03.invoke();
        } else {
            Function1<? super AppCompatActivity, ? extends View> function1 = this.onTransact;
            if (function1 == null || (defaultLoadingView = function1.invoke(appCompatActivity)) == null) {
                defaultLoadingView = new DefaultLoadingView(appCompatActivity);
            }
            this.onNavigationEvent = defaultLoadingView;
            appCompatActivity.setContentView(defaultLoadingView);
        }
        IAuthTabCallback(appCompatActivity, logicverifyidInvoke, bundle2);
    }

    @Override // o.transGenerateCertNum
    public void onExtraCallback(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        this.IAuthTabCallback_Parcel = onExtraCallbackWithResult.RESUMED;
        this.IAuthTabCallbackStubProxy = new WeakReference<>(appCompatActivity);
        getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release getjson_key_attestationcredentials_play_services_auth_release = appCompatActivity instanceof getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release ? (getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release) appCompatActivity : null;
        if (getjson_key_attestationcredentials_play_services_auth_release == null) {
            throw new IllegalStateException("Activity " + appCompatActivity.getClass().getSimpleName() + " must implement DefaultHardwareBackBtnHandler");
        }
        ReactHost reactHost = this.access100;
        if (reactHost != null) {
            reactHost.onExtraCallbackWithResult(appCompatActivity, getjson_key_attestationcredentials_play_services_auth_release);
        }
    }

    @Override // o.transGenerateCertNum
    public void onWarmupCompleted(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        this.IAuthTabCallback_Parcel = onExtraCallbackWithResult.PAUSED;
        this.IAuthTabCallbackStubProxy = new WeakReference<>(appCompatActivity);
        ReactHost reactHost = this.access100;
        if (reactHost != null) {
            reactHost.onExtraCallback(appCompatActivity);
        }
    }

    @Override // o.transGenerateCertNum
    public void IAuthTabCallback(@NotNull AppCompatActivity appCompatActivity) {
        ReactHost reactHost;
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        this.IAuthTabCallback_Parcel = onExtraCallbackWithResult.DESTROYED;
        this.IAuthTabCallbackStubProxy = null;
        onWarmupCompleted();
        ReactSurface reactSurface = this.extraCallbackWithResult;
        if (reactSurface != null) {
            reactSurface.asBinder();
            reactSurface.onWarmupCompleted();
            reactSurface.onExtraCallback();
        }
        this.extraCallbackWithResult = null;
        ReactInstanceEventListener reactInstanceEventListener = this.ICustomTabsCallback;
        if (reactInstanceEventListener != null && (reactHost = this.access100) != null) {
            reactHost.onExtraCallbackWithResult(reactInstanceEventListener);
        }
        this.ICustomTabsCallback = null;
        ReactHost reactHost2 = this.access100;
        if (reactHost2 != null) {
            reactHost2.onNavigationEvent(appCompatActivity);
            reactHost2.IAuthTabCallback("GraniteReactDelegate teardown", (Exception) null);
        }
        this.access100 = null;
        this.onNavigationEvent = null;
        this.onWarmupCompleted = null;
        this.IAuthTabCallback = null;
        this.onExtraCallbackWithResult = null;
        this.writeTypedObject = null;
        this.onExtraCallback = null;
        this.onTransact = null;
        this.IAuthTabCallbackStub = null;
        this.access000 = null;
        this.asInterface = null;
        this.extraCallback = null;
        this.asBinder = null;
    }

    public void onWarmupCompleted() {
        getPackageType getpackagetype = this.getInterfaceDescriptor;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        }
        this.getInterfaceDescriptor = null;
    }

    @Override // o.transGenerateCertNum
    public void onExtraCallback(@NotNull Function0<? extends List<? extends ReactPackage>> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.writeTypedObject = function0;
    }

    @Override // o.transGenerateCertNum
    public void onNavigationEvent(@NotNull Function0<? extends logicVerifyID> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback = function0;
    }

    @Override // o.transGenerateCertNum
    public void IAuthTabCallback(@NotNull Function1<? super AppCompatActivity, ? extends View> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onTransact = function1;
    }

    @Override // o.transGenerateCertNum
    public void onExtraCallbackWithResult(@NotNull Function2<? super AppCompatActivity, ? super Throwable, ? extends View> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.IAuthTabCallbackStub = function2;
    }

    public void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.asInterface = function0;
    }

    public void onWarmupCompleted(@NotNull Function1<? super ReactSurfaceView, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.extraCallback = function1;
    }

    public void onExtraCallback(@NotNull Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.asBinder = function1;
    }

    @Override // o.transGenerateCertNum
    public ReactHost onExtraCallback() {
        return this.access100;
    }

    @Override // o.transGenerateCertNum
    public logicVerifyID onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public boolean IAuthTabCallback() {
        return (this.access100 == null || this.extraCallbackWithResult == null) ? false : true;
    }

    private final String asInterface() {
        String strOnExtraCallbackWithResult;
        transGetKmCert transgetkmcert = this.onWarmupCompleted;
        if (transgetkmcert == null || (strOnExtraCallbackWithResult = transgetkmcert.onExtraCallbackWithResult()) == null) {
            throw new IllegalStateException("mainComponentName is missing. Use a BundleLoader that provides componentName.");
        }
        return strOnExtraCallbackWithResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallback(AppCompatActivity appCompatActivity, Bundle bundle) {
        ReactHost reactHost = this.access100;
        if (reactHost != null) {
            ReactSurface reactSurfaceIAuthTabCallback = reactHost.IAuthTabCallback(appCompatActivity, asInterface(), bundle);
            this.extraCallbackWithResult = reactSurfaceIAuthTabCallback;
            this.onNavigationEvent = reactSurfaceIAuthTabCallback.onNavigationEvent();
            ReactSurfaceView reactSurfaceViewOnNavigationEvent = reactSurfaceIAuthTabCallback.onNavigationEvent();
            ReactSurfaceView reactSurfaceView = reactSurfaceViewOnNavigationEvent instanceof ReactSurfaceView ? reactSurfaceViewOnNavigationEvent : null;
            if (reactSurfaceView != null) {
                Function1<? super ReactSurfaceView, Unit> function1 = this.extraCallback;
                if (function1 != null) {
                    function1.invoke(reactSurfaceView);
                    return;
                }
                reactSurfaceView.setId(-1);
                appCompatActivity.setContentView(reactSurfaceView);
                onNavigationEvent((View) reactSurfaceView);
                onNavigationEvent();
            }
        }
    }

    private final void onNavigationEvent(View view) {
        final int iAsBinder = WindowInsetsCompat.onTransact.asBinder() | WindowInsetsCompat.onTransact.onExtraCallbackWithResult();
        final Function2 function2 = new Function2() { // from class: run.granite.GraniteReactDelegateImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return transExportCert.IAuthTabCallback(iAsBinder, (View) obj, (WindowInsetsCompat) obj2);
            }
        };
        ViewCompat.onWarmupCompleted(view, new RenderInTransitionOverlayNodeElement() { // from class: run.granite.GraniteReactDelegateImpl$$ExternalSyntheticLambda1
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return transExportCert.onExtraCallback(function2, view2, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat IAuthTabCallback(int i, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(i);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        }
        return WindowInsetsCompat.IAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onExtraCallback(Function2 function2, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        return (WindowInsetsCompat) function2.invoke(view, windowInsetsCompat);
    }

    public void onNavigationEvent() {
        ReactSurface reactSurface;
        ReactHost reactHost = this.access100;
        if (reactHost == null || (reactSurface = this.extraCallbackWithResult) == null) {
            return;
        }
        onExtraCallback onextracallback = new onExtraCallback();
        this.ICustomTabsCallback = onextracallback;
        reactHost.onExtraCallback(onextracallback);
        Objects.toString(reactSurface);
        reactSurface.onExtraCallbackWithResult();
        Objects.toString(this.IAuthTabCallback_Parcel);
        int i = onWarmupCompleted.onExtraCallbackWithResult[this.IAuthTabCallback_Parcel.ordinal()];
        if (i == 1) {
            AppCompatActivity appCompatActivityIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            if (appCompatActivityIAuthTabCallbackDefault != null) {
                getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release getjson_key_attestationcredentials_play_services_auth_release = appCompatActivityIAuthTabCallbackDefault instanceof getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release ? (getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release) appCompatActivityIAuthTabCallbackDefault : null;
                if (getjson_key_attestationcredentials_play_services_auth_release == null) {
                    throw new IllegalStateException("Activity " + appCompatActivityIAuthTabCallbackDefault.getClass().getSimpleName() + " must implement DefaultHardwareBackBtnHandler");
                }
                reactHost.onExtraCallbackWithResult(appCompatActivityIAuthTabCallbackDefault, getjson_key_attestationcredentials_play_services_auth_release);
                Integer.valueOf(Log.d("GraniteReactDelegate", "Called onHostResume with activity: " + appCompatActivityIAuthTabCallbackDefault));
                return;
            }
            return;
        }
        if (i == 2) {
            AppCompatActivity appCompatActivityIAuthTabCallbackDefault2 = IAuthTabCallbackDefault();
            if (appCompatActivityIAuthTabCallbackDefault2 != null) {
                reactHost.onExtraCallback(appCompatActivityIAuthTabCallbackDefault2);
                Integer.valueOf(Log.d("GraniteReactDelegate", "Called onHostPause with activity: " + appCompatActivityIAuthTabCallbackDefault2));
                return;
            }
            return;
        }
        if (i == 3) {
            reactSurface.asBinder();
            AppCompatActivity appCompatActivityIAuthTabCallbackDefault3 = IAuthTabCallbackDefault();
            if (appCompatActivityIAuthTabCallbackDefault3 != null) {
                reactHost.onNavigationEvent(appCompatActivityIAuthTabCallbackDefault3);
            }
            reactHost.IAuthTabCallback("GraniteReactDelegate teardown", (Exception) null);
            Integer.valueOf(Log.d("GraniteReactDelegate", "Activity destroyed, cleaned up ReactHost"));
            return;
        }
        Integer.valueOf(Log.d("GraniteReactDelegate", "No lifecycle state to apply"));
    }

    public static final class onExtraCallback implements ReactInstanceEventListener {
        onExtraCallback() {
        }

        public void onNavigationEvent(ReactContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "");
            Objects.toString(reactContext.getCurrentActivity());
            transFinalize transfinalizeIAuthTabCallbackDefault = transExportCert.this.IAuthTabCallbackDefault();
            if (transfinalizeIAuthTabCallbackDefault == null || !(transfinalizeIAuthTabCallbackDefault instanceof transFinalize)) {
                return;
            }
            transfinalizeIAuthTabCallbackDefault.IAuthTabCallback(reactContext);
        }
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ AppCompatActivity $activity;
        final /* synthetic */ logicVerifyID $bundleLoader;
        final /* synthetic */ Bundle $initialProps;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ transExportCert this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(logicVerifyID logicverifyid, transExportCert transexportcert, AppCompatActivity appCompatActivity, Bundle bundle, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$bundleLoader = logicverifyid;
            this.this$0 = transexportcert;
            this.$activity = appCompatActivity;
            this.$initialProps = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$bundleLoader, this.this$0, this.$activity, this.$initialProps, access13800Var);
            iAuthTabCallback.L$0 = obj;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r4, r5, r16) == r3) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x014c, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r4, r6, r16) != r3) goto L52;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x004d, Exception -> 0x0050, CancellationException -> 0x0053, TRY_ENTER, TryCatch #5 {all -> 0x004d, blocks: (B:13:0x0047, B:25:0x0076, B:28:0x0080, B:30:0x009b, B:35:0x00bd, B:34:0x00b1, B:41:0x010f, B:42:0x0114, B:47:0x0119, B:56:0x0153), top: B:64:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
        /* JADX WARN: Type inference failed for: r0v26, types: [T, com.facebook.react.ReactHost] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Object objOnWarmupCompleted;
            ReactHost reactHost;
            final transGetKmCert transgetkmcert;
            ReactHost reactHost2;
            final findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            try {
            } catch (Throwable th) {
                th = th;
                objectRef = 1;
            }
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                objectRef = new Ref.ObjectRef();
                try {
                    this.$bundleLoader.getClass().getSimpleName();
                    logicVerifyID logicverifyid = this.$bundleLoader;
                    this.L$0 = findresandmsg;
                    this.L$1 = objectRef;
                    this.label = 1;
                    objOnWarmupCompleted = logicverifyid.onWarmupCompleted(this);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    e = e2;
                    objectRef2 = objectRef;
                    final AppCompatActivity appCompatActivity = this.$activity;
                    final transExportCert transexportcert = this.this$0;
                    appCompatActivity.runOnUiThread(new Runnable() { // from class: run.granite.GraniteReactDelegateImpl$loadBundleWithLoader$1$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            transExportCert.IAuthTabCallback.IAuthTabCallback(transexportcert, e, findresandmsg, appCompatActivity);
                        }
                    });
                    reactHost = (ReactHost) objectRef2.element;
                    objectRef2.element = null;
                    if (reactHost != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    ReactHost reactHost3 = (ReactHost) objectRef.element;
                    objectRef.element = null;
                    if (reactHost3 != null) {
                        UpdatePackageContent updatePackageContent = UpdatePackageContent.onExtraCallback;
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(reactHost3, null);
                        this.L$0 = access15400.onNavigationEvent(findresandmsg);
                        this.L$1 = access15400.onNavigationEvent(objectRef);
                        this.L$2 = th;
                        this.L$3 = access15400.onNavigationEvent(reactHost3);
                        this.label = 4;
                        if (maybeUpdateAnimatable.onExtraCallback(updatePackageContent, anonymousClass4, this) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                        throw th;
                    }
                    throw th;
                }
                if (objOnWarmupCompleted != objOnExtraCallback) {
                    objectRef2 = objectRef;
                    transgetkmcert = (transGetKmCert) objOnWarmupCompleted;
                    Objects.toString(transgetkmcert);
                    if (!(transgetkmcert instanceof transGetKmCert.onWarmupCompleted)) {
                    }
                    getFullPackage.IAuthTabCallback(findresandmsg.getCoroutineContext());
                    final ReactHostFactory.Result resultIAuthTabCallback = this.this$0.IAuthTabCallback(this.$activity, transgetkmcert);
                    objectRef2.element = resultIAuthTabCallback.IAuthTabCallback();
                    final AppCompatActivity appCompatActivity2 = this.$activity;
                    final transExportCert transexportcert2 = this.this$0;
                    final Bundle bundle = this.$initialProps;
                    final Ref.ObjectRef objectRef3 = objectRef2;
                    appCompatActivity2.runOnUiThread(new Runnable() { // from class: run.granite.GraniteReactDelegateImpl$loadBundleWithLoader$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            transExportCert.IAuthTabCallback.onWarmupCompleted(transexportcert2, transgetkmcert, resultIAuthTabCallback, objectRef3, appCompatActivity2, bundle);
                        }
                    });
                    reactHost2 = (ReactHost) objectRef2.element;
                    objectRef2.element = null;
                    if (reactHost2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                return objOnExtraCallback;
            }
            if (i != 1) {
                if (i == 2 || i == 3) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th3 = (Throwable) this.L$2;
                ResultKt.onNavigationEvent(obj);
                throw th3;
            }
            objectRef2 = (Ref.ObjectRef) this.L$1;
            try {
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = obj;
                transgetkmcert = (transGetKmCert) objOnWarmupCompleted;
                Objects.toString(transgetkmcert);
                if (!(transgetkmcert instanceof transGetKmCert.onWarmupCompleted)) {
                    Objects.toString(((transGetKmCert.onWarmupCompleted) transgetkmcert).onExtraCallback());
                    ((transGetKmCert.onWarmupCompleted) transgetkmcert).onExtraCallbackWithResult();
                    if (((transGetKmCert.onWarmupCompleted) transgetkmcert).onExtraCallback() instanceof pkcs5PBKDF2.onExtraCallbackWithResult) {
                        pkcs5PBKDF2 pkcs5pbkdf2OnExtraCallback = ((transGetKmCert.onWarmupCompleted) transgetkmcert).onExtraCallback();
                        Intrinsics.checkNotNull(pkcs5pbkdf2OnExtraCallback, "");
                        ((pkcs5PBKDF2.onExtraCallbackWithResult) pkcs5pbkdf2OnExtraCallback).onExtraCallbackWithResult();
                    }
                } else {
                    if (!(transgetkmcert instanceof transGetKmCert.onNavigationEvent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((transGetKmCert.onNavigationEvent) transgetkmcert).onExtraCallback();
                    ((transGetKmCert.onNavigationEvent) transgetkmcert).onNavigationEvent();
                }
                getFullPackage.IAuthTabCallback(findresandmsg.getCoroutineContext());
                final ReactHostFactory.Result resultIAuthTabCallback2 = this.this$0.IAuthTabCallback(this.$activity, transgetkmcert);
                objectRef2.element = resultIAuthTabCallback2.IAuthTabCallback();
                final AppCompatActivity appCompatActivity22 = this.$activity;
                final transExportCert transexportcert22 = this.this$0;
                final Bundle bundle2 = this.$initialProps;
                final Ref.ObjectRef objectRef32 = objectRef2;
                appCompatActivity22.runOnUiThread(new Runnable() { // from class: run.granite.GraniteReactDelegateImpl$loadBundleWithLoader$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        transExportCert.IAuthTabCallback.onWarmupCompleted(transexportcert22, transgetkmcert, resultIAuthTabCallback2, objectRef32, appCompatActivity22, bundle2);
                    }
                });
                reactHost2 = (ReactHost) objectRef2.element;
                objectRef2.element = null;
                if (reactHost2 != null) {
                    UpdatePackageContent updatePackageContent2 = UpdatePackageContent.onExtraCallback;
                    AnonymousClass4 anonymousClass42 = new AnonymousClass4(reactHost2, null);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = access15400.onNavigationEvent(objectRef2);
                    this.L$2 = access15400.onNavigationEvent(reactHost2);
                    this.label = 2;
                }
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception e4) {
                e = e4;
                final AppCompatActivity appCompatActivity3 = this.$activity;
                final transExportCert transexportcert3 = this.this$0;
                appCompatActivity3.runOnUiThread(new Runnable() { // from class: run.granite.GraniteReactDelegateImpl$loadBundleWithLoader$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        transExportCert.IAuthTabCallback.IAuthTabCallback(transexportcert3, e, findresandmsg, appCompatActivity3);
                    }
                });
                reactHost = (ReactHost) objectRef2.element;
                objectRef2.element = null;
                if (reactHost != null) {
                    UpdatePackageContent updatePackageContent3 = UpdatePackageContent.onExtraCallback;
                    AnonymousClass4 anonymousClass43 = new AnonymousClass4(reactHost, null);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = access15400.onNavigationEvent(objectRef2);
                    this.L$2 = access15400.onNavigationEvent(reactHost);
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onWarmupCompleted(transExportCert transexportcert, transGetKmCert transgetkmcert, ReactHostFactory.Result result, Ref.ObjectRef objectRef, AppCompatActivity appCompatActivity, Bundle bundle) {
            if (transexportcert.IAuthTabCallback_Parcel != onExtraCallbackWithResult.DESTROYED) {
                transexportcert.onWarmupCompleted = transgetkmcert;
                transexportcert.access100 = result.IAuthTabCallback();
                transexportcert.onExtraCallbackWithResult = result.onExtraCallback();
                objectRef.element = null;
                transexportcert.onExtraCallback(appCompatActivity, bundle);
                return;
            }
            result.IAuthTabCallback().IAuthTabCallback("GraniteReactDelegate teardown", (Exception) null);
            objectRef.element = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IAuthTabCallback(transExportCert transexportcert, Exception exc, findResAndMsg findresandmsg, AppCompatActivity appCompatActivity) {
            View defaultErrorView;
            if (transexportcert.IAuthTabCallback_Parcel != onExtraCallbackWithResult.DESTROYED) {
                Function1 function1 = transexportcert.asBinder;
                if (function1 != null) {
                    function1.invoke(exc);
                    return;
                }
                Function2 function2 = transexportcert.IAuthTabCallbackStub;
                if (function2 == null || (defaultErrorView = (View) function2.invoke(appCompatActivity, exc)) == null) {
                    defaultErrorView = new DefaultErrorView(appCompatActivity, exc);
                }
                transexportcert.onNavigationEvent = defaultErrorView;
                appCompatActivity.setContentView(defaultErrorView);
            }
        }

        /* renamed from: o.transExportCert$IAuthTabCallback$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super getChallenge<Void>>, Object> {
            final /* synthetic */ ReactHost $hostToRecover;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ReactHost reactHost, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$hostToRecover = reactHost;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass4(this.$hostToRecover, access13800Var);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super getChallenge<Void>> access13800Var) {
                return ((AnonymousClass4) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return this.$hostToRecover.IAuthTabCallback("GraniteReactDelegate teardown", (Exception) null);
            }
        }
    }

    private final void IAuthTabCallback(AppCompatActivity appCompatActivity, logicVerifyID logicverifyid, Bundle bundle) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = this.IAuthTabCallbackDefault;
        if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent == null) {
            textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(appCompatActivity);
        }
        this.getInterfaceDescriptor = onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new IAuthTabCallback(logicverifyid, this, appCompatActivity, bundle, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReactHostFactory.Result IAuthTabCallback(AppCompatActivity appCompatActivity, transGetKmCert transgetkmcert) {
        List<? extends ReactPackage> listEmptyList;
        Function2<? super AppCompatActivity, ? super transGetKmCert, ? extends ReactHost> function2 = this.readTypedObject;
        if (function2 != null) {
            return new ReactHostFactory.Result(function2.invoke(appCompatActivity, transgetkmcert), null);
        }
        Function0<? extends List<? extends ReactPackage>> function0 = this.writeTypedObject;
        if (function0 == null || (listEmptyList = function0.invoke()) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        ReactHostFactory reactHostFactory = ReactHostFactory.IAuthTabCallback;
        Context applicationContext = appCompatActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return reactHostFactory.onExtraCallback(applicationContext, transgetkmcert, listEmptyList);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
