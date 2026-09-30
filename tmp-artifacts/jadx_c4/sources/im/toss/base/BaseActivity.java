package im.toss.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzgc;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import com.tmoney.a;
import im.toss.base.BaseActivity$;
import im.toss.base.transition.destination.DestinationScaleTransition;
import im.toss.core.tracker.entry.TrackState;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.splittarget.spec.fsm.CriticalMalwareState;
import im.toss.state.spec.SessionState;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import im.toss.uikit.widget.helper.TdsAdoptionWindow;
import im.toss.uikit.widget.helper.WeedScannerWindow;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.AFj1nSDK5;
import o.AFj1pSDK;
import o.AFj1rSDKExternalSyntheticLambda3;
import o.ALCFaceEmotion;
import o.ALCFaceMask;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.AppLovinBroadcastManagerReceiver;
import o.AppLovinBroadcastManagera;
import o.AppLovinBroadcastManagerb;
import o.AppWithState;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModuleImplExternalSyntheticLambda3;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertFloatArrayToByteArray;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.DERSet;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.EmbeddingAdapterExternalSyntheticLambda2;
import o.EncoderImplExternalSyntheticLambda16;
import o.EventServiceImpl;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.GeckoHubImp;
import o.GetFeatureExtension;
import o.GriverBaseActivity;
import o.IAnimation;
import o.IPostMessageServiceStubProxy;
import o.ITrustedWebActivityCallbackStubProxy;
import o.JFunction2;
import o.JsonReaderUnknownNumberParsing;
import o.M_;
import o.NetConverter3;
import o.O_;
import o.PlayerErrorCode;
import o.ProductDetailsPricingPhase;
import o.ReflectionUtilsExternalSyntheticLambda0;
import o.RememberLottieCompositionKtlottieComposition1;
import o.Response;
import o.SessionTracker;
import o.SessionTrackerb;
import o.SidecarAdapterExternalSyntheticLambda2;
import o.SidecarAdapterExternalSyntheticLambda3;
import o.SidecarCompatExternalSyntheticLambda0;
import o.SidecarCompatTranslatingCallback;
import o.SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.WorkForegroundRunnableExternalSyntheticLambda0;
import o.access8100;
import o.auth;
import o.clearWrite;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.drawTextProgressColor;
import o.filterCreatePageParams;
import o.findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release;
import o.generateInviteUrl;
import o.generateLink;
import o.getAdUnitIds;
import o.getAppEnteredForegroundTimeMillis;
import o.getAxonEventKey;
import o.getBillingPeriod;
import o.getConsentFlowUserGeography;
import o.getCornerRadius;
import o.getEnabledAmazonAdUnitIds;
import o.getForegroundInfosuspendImpl;
import o.getHostnameVerifierokhttp;
import o.getIconPaddingLeft;
import o.getKekid;
import o.getLastTrimMemoryLevel;
import o.getPluginName;
import o.getPreRenderJob;
import o.getPricingPhaseList;
import o.getTags;
import o.getWrite;
import o.handleRemoveKey;
import o.isHidingNavigationBar;
import o.isPreload;
import o.isStopped;
import o.isTestModeEnabled;
import o.mergeParams;
import o.nSetPosition;
import o.onAdViewAdDisplayFailed;
import o.onDeviceStateChanged;
import o.onStopped;
import o.r8lambdaLwnqQT6KESvpJzaipNghlKf5eMg;
import o.readIntokhttp;
import o.resumeForClick;
import o.runOnUiThreadDelayed;
import o.s8ExternalSyntheticLambda2;
import o.setAdUnitIds;
import o.setDurationInForeground;
import o.setEnabledAmazonAdUnitIds;
import o.setForeground;
import o.setMessageBytes;
import o.setRubIn;
import o.setSdkKey;
import o.setShine;
import o.setTid;
import o.startRearDisplaySession;
import o.startWork;
import o.varyFields;
import o.wasLastName;
import o.zzad;
import o.zzag;
import o.zzbd;
import o.zzbq;
import o.zzdj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.LOW)
/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class BaseActivity extends Hilt_BaseActivity implements getHostnameVerifierokhttp, ALCFaceMask, isHidingNavigationBar {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int newSession = 0;
    private static int[] postMessage = null;
    private static int prefetchWithMultipleUrls = 1;
    private static int requestPostMessageChannelWithExtras = 1;
    private static int setEngagementSignalsCallback;
    private long IAuthTabCallbackDefault;
    private deserializeUriNullableCollection IAuthTabCallbackStub;
    private AppWithState IAuthTabCallbackStubProxy;
    private final Runnable IAuthTabCallback_Parcel;
    private final boolean ICustomTabsCallback;
    private final String ICustomTabsCallbackDefault;
    private BrickModuleImplExternalSyntheticLambda3 ICustomTabsCallbackStub;
    private ViewTreeObserver.OnDrawListener ICustomTabsCallbackStubProxy;
    private final Lazy ICustomTabsCallback_Parcel;
    private GriverBaseActivity ICustomTabsService;
    private View access000;
    private Resources access100;
    private final getCornerRadius<Boolean> asBinder;
    private String asInterface;

    @Inject
    public IAuthTabCallback deps;
    private Boolean extraCallback;
    private final boolean extraCallbackWithResult;
    private View extraCommand;
    private final boolean getInterfaceDescriptor;
    private ViewTreeObserver.OnGlobalLayoutListener isEngagementSignalsApiAvailable;
    private final IAnimation<MotionEvent> mayLaunchUrl;
    private WeedScannerWindow newAuthTabSession;
    private final Lazy newSessionWithExtras;
    private Dialog onActivityLayout;
    private final setTid<Boolean> onActivityResized;
    private Dialog onMessageChannelReady;
    private String onMinimized;
    private setSdkKey onPostMessage;
    private setEnabledAmazonAdUnitIds onRelationshipValidationResult;
    private final setRubIn<Boolean> onTransact;
    private TdsAdoptionWindow onUnminimized;
    private final boolean prefetch;
    private final boolean readTypedObject;
    private boolean writeTypedObject;

    public static final /* synthetic */ class IAuthTabCallbackStub implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public IAuthTabCallbackStub(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i2 = onExtraCallbackWithResult + 111;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z = obj instanceof FunctionAdapter;
                    throw null;
                }
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i3 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i3 + 63;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            int i4 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class IAuthTabCallbackStubProxy implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 onNavigationEvent;

        public IAuthTabCallbackStubProxy(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = IAuthTabCallback;
            int i3 = i2 + 37;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i2 + 25;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onNavigationEvent;
            int i5 = i2 + 117;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 57 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = IAuthTabCallback + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.invoke(obj);
            int i4 = IAuthTabCallback + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class IAuthTabCallback_Parcel implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public IAuthTabCallback_Parcel(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i5 = i3 + 81;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }
            boolean z = obj instanceof FunctionAdapter;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.invoke(obj);
                throw null;
            }
            this.onWarmupCompleted.invoke(obj);
            int i3 = onNavigationEvent + 55;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class ICustomTabsCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        public ICustomTabsCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                int i2 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i5 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class ICustomTabsCallbackDefault implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public ICustomTabsCallbackDefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 13;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                throw null;
            }
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i2 + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i6 = onNavigationEvent + 39;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return zAreEqual;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onExtraCallback + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class ICustomTabsCallbackStub implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public ICustomTabsCallbackStub(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) && (obj instanceof FunctionAdapter)) {
                int i2 = onExtraCallback + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            int i4 = IAuthTabCallback + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = IAuthTabCallback + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class ICustomTabsCallbackStubProxy implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public ICustomTabsCallbackStubProxy(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        
            if ((r5 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        
            r5 = kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) r5).getFunctionDelegate());
            r1 = im.toss.base.BaseActivity.ICustomTabsCallbackStubProxy.onExtraCallback + 91;
            im.toss.base.BaseActivity.ICustomTabsCallbackStubProxy.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        
            if ((r5 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i2 = onExtraCallback + 105;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 41 / 0;
                }
            }
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 18 / 0;
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 11 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class ICustomTabsCallback_Parcel implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 IAuthTabCallback;

        public ICustomTabsCallback_Parcel(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            if ((r6 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            if ((r6 instanceof kotlin.jvm.internal.FunctionAdapter) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            r1 = r1 + 31;
            im.toss.base.BaseActivity.ICustomTabsCallback_Parcel.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
            r6 = kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) r6).getFunctionDelegate());
            r1 = im.toss.base.BaseActivity.ICustomTabsCallback_Parcel.onExtraCallbackWithResult + 93;
            im.toss.base.BaseActivity.ICustomTabsCallback_Parcel.onExtraCallback = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if ((r1 % 2) != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
            r6 = null;
            r6.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        
            throw null;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 125;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 88 / 0;
                if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                    int i5 = i2 + 7;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 40 / 0;
                    }
                }
            } else if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.IAuthTabCallback;
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallbackWithResult + 81;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class ICustomTabsService implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        public ICustomTabsService(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onWarmupCompleted + 45;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                boolean z = obj instanceof FunctionAdapter;
                throw null;
            }
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i3 + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i5 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 49;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            Function1 function1 = this.onExtraCallback;
            int i4 = i2 + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onWarmupCompleted + 71;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class ICustomTabsServiceDefault implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public ICustomTabsServiceDefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallbackWithResult;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallbackWithResult.invoke(obj);
        }
    }

    public static final /* synthetic */ class ICustomTabsServiceStub implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallback;

        public ICustomTabsServiceStub(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class ICustomTabsServiceStubProxy implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallback;

        public ICustomTabsServiceStubProxy(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class ICustomTabsService_Parcel implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 IAuthTabCallback;

        public ICustomTabsService_Parcel(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.IAuthTabCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.IAuthTabCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class IEngagementSignalsCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public IEngagementSignalsCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallbackWithResult;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallbackWithResult.invoke(obj);
        }
    }

    public static final /* synthetic */ class IEngagementSignalsCallbackDefault implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onWarmupCompleted;

        public IEngagementSignalsCallbackDefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onWarmupCompleted;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onWarmupCompleted.invoke(obj);
        }
    }

    public static final /* synthetic */ class IEngagementSignalsCallbackStub implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onNavigationEvent;

        public IEngagementSignalsCallbackStub(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onNavigationEvent;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onNavigationEvent.invoke(obj);
        }
    }

    public static final /* synthetic */ class access000 implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 onNavigationEvent;

        public access000(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 85;
            onExtraCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                int i4 = i2 + 25;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = i2 + 49;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i7 == 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.invoke(obj);
            int i4 = onExtraCallbackWithResult + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class access100 implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onNavigationEvent;

        public access100(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i5 = i3 + 11;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z = obj instanceof FunctionAdapter;
                throw null;
            }
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i6 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onNavigationEvent;
            int i5 = i3 + 85;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                this.onNavigationEvent.invoke(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            this.onNavigationEvent.invoke(obj);
            int i3 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final /* synthetic */ class access200 implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onWarmupCompleted;

        public access200(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onWarmupCompleted;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onWarmupCompleted.invoke(obj);
        }
    }

    public static final /* synthetic */ class extraCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallback;

        public extraCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i5 = i3 + 3;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                if (i5 % 2 == 0) {
                    boolean z = obj instanceof FunctionAdapter;
                    throw null;
                }
                if (obj instanceof FunctionAdapter) {
                    int i7 = i6 + 113;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    if (i8 != 0) {
                        int i9 = 58 / 0;
                    }
                    return zAreEqual;
                }
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 93;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallback;
            int i5 = i2 + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onNavigationEvent + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = IAuthTabCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class extraCallbackWithResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public extraCallbackWithResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                throw null;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i3 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            Function1 function1;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                function1 = this.onWarmupCompleted;
                int i4 = 73 / 0;
            } else {
                function1 = this.onWarmupCompleted;
            }
            int i5 = i3 + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            int i4 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class extraCommand implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public extraCommand(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if ((!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 25;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i6 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 97;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i2 + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            if (i3 == 0) {
                int i4 = 36 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = IAuthTabCallback + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class getInterfaceDescriptor implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public getInterfaceDescriptor(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = IAuthTabCallback + 65;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 19;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            FunctionAdapter functionAdapter = (FunctionAdapter) obj;
            if (i6 == 0) {
                return Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            }
            Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i3 + 85;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 43 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = IAuthTabCallback + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class isEngagementSignalsApiAvailable implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public isEngagementSignalsApiAvailable(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 20 / 0;
                if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                    int i5 = i3 + 87;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        boolean z = obj instanceof FunctionAdapter;
                        throw null;
                    }
                    if (obj instanceof FunctionAdapter) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                }
            } else if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 49;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i2 + 67;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onNavigationEvent + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class mayLaunchUrl implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final /* synthetic */ Function1 onNavigationEvent;

        public mayLaunchUrl(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i2 + 35;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i6 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onNavigationEvent;
            int i5 = i3 + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class newAuthTabSession implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 IAuthTabCallback;

        public newAuthTabSession(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 97;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 66 / 0;
                if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                    int i5 = i2 + 43;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    if (obj instanceof FunctionAdapter) {
                        int i7 = i2 + 109;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        clearWrite functionDelegate = getFunctionDelegate();
                        FunctionAdapter functionAdapter = (FunctionAdapter) obj;
                        if (i8 == 0) {
                            return Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
                        }
                        boolean zAreEqual = Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
                        int i9 = 27 / 0;
                        return zAreEqual;
                    }
                }
            } else if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i3 + 11;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class newSession implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 IAuthTabCallback;

        public newSession(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 9;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                int i4 = i2 + 115;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            int i6 = i2 + 121;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallbackWithResult + 73;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class newSessionWithExtras implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public newSessionWithExtras(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i2 = onExtraCallback + 53;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i4 = onNavigationEvent + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i2 + 91;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onNavigationEvent + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 69 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onExtraCallback + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class onActivityLayout implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        public onActivityLayout(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || (!(obj instanceof FunctionAdapter))) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i4 = onNavigationEvent + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = onNavigationEvent + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class onActivityResized implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallback;

        public onActivityResized(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i5 = i3 + 7;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (!(!(obj instanceof FunctionAdapter))) {
                    int i7 = i3 + 43;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    clearWrite functionDelegate = getFunctionDelegate();
                    clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
                    if (i8 != 0) {
                        return Intrinsics.areEqual(functionDelegate, functionDelegate2);
                    }
                    Intrinsics.areEqual(functionDelegate, functionDelegate2);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            int i9 = i3 + 115;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 16 / 0;
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 13 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
        }
    }

    public static final /* synthetic */ class onGreatestScrollPercentageIncreased implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onGreatestScrollPercentageIncreased(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallbackWithResult;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallbackWithResult.invoke(obj);
        }
    }

    public static final /* synthetic */ class onMessageChannelReady implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final /* synthetic */ Function1 onExtraCallback;

        public onMessageChannelReady(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 31;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object obj2 = null;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i5 = i2 + 37;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                int i7 = i5 % 2;
                if (obj instanceof FunctionAdapter) {
                    int i8 = i6 + 35;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    clearWrite functionDelegate = getFunctionDelegate();
                    FunctionAdapter functionAdapter = (FunctionAdapter) obj;
                    if (i9 == 0) {
                        return Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
                    }
                    Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
                    throw null;
                }
            }
            int i10 = i2 + 109;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onExtraCallback;
            int i5 = i3 + 101;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class onMinimized implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 IAuthTabCallback;

        public onMinimized(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i5 = i3 + 23;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z = obj instanceof FunctionAdapter;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i6 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Function1 function1 = this.IAuthTabCallback;
            int i4 = i3 + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            if (i3 == 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ class onPostMessage implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onPostMessage(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i4 = i3 + 23;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (obj instanceof FunctionAdapter) {
                    boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    int i6 = onExtraCallback + 111;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return zAreEqual;
                }
            }
            int i8 = i3 + 57;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function1 function1 = this.onExtraCallbackWithResult;
            int i4 = i3 + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class onRelationshipValidationResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        public onRelationshipValidationResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onWarmupCompleted;
            int i3 = i2 + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i2 + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i7 = onWarmupCompleted + 87;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                return zAreEqual;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallback;
            int i5 = i2 + 31;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = onNavigationEvent + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
        }
    }

    public static final /* synthetic */ class onUnminimized implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public onUnminimized(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 28 / 0;
                if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                    if (obj instanceof FunctionAdapter) {
                        boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                        int i4 = IAuthTabCallback + 75;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 5 / 0;
                        }
                        return zAreEqual;
                    }
                }
            } else if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0))) {
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i3 + 107;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onNavigationEvent + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            int i4 = IAuthTabCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class postMessage implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onExtraCallback;

        public postMessage(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 17;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            int i4 = i2 + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallback;
            int i5 = i2 + 51;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class prefetch implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public prefetch(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i3 + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                throw null;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i5 = onNavigationEvent + 107;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return zAreEqual;
            }
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i3 + 33;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.invoke(obj);
                obj2.hashCode();
                throw null;
            }
            this.onExtraCallbackWithResult.invoke(obj);
            int i3 = IAuthTabCallback + 61;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class prefetchWithMultipleUrls implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public prefetchWithMultipleUrls(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallbackWithResult;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallbackWithResult.invoke(obj);
        }
    }

    public static final /* synthetic */ class readTypedObject implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onNavigationEvent;

        public readTypedObject(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onExtraCallback;
            int i3 = i2 + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i2 + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            FunctionAdapter functionAdapter = (FunctionAdapter) obj;
            if (i6 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            }
            Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onExtraCallback + 93;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.invoke(obj);
            int i4 = onWarmupCompleted + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class receiveFile implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 IAuthTabCallback;

        public receiveFile(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.IAuthTabCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.IAuthTabCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class requestPostMessageChannel implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onNavigationEvent;

        public requestPostMessageChannel(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onNavigationEvent;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onNavigationEvent.invoke(obj);
        }
    }

    public static final /* synthetic */ class requestPostMessageChannelWithExtras implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public requestPostMessageChannelWithExtras(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i3 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return zAreEqual;
            }
            obj2.hashCode();
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i3 + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            if (i3 == 0) {
                int i4 = 52 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class setEngagementSignalsCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallback;

        public setEngagementSignalsCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class updateVisuals implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public updateVisuals(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallbackWithResult;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallbackWithResult.invoke(obj);
        }
    }

    public static final /* synthetic */ class validateRelationship implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallback;

        public validateRelationship(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class warmup implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onNavigationEvent;

        public warmup(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onNavigationEvent;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onNavigationEvent.invoke(obj);
        }
    }

    public static final /* synthetic */ class writeTypedList implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onExtraCallback;

        public writeTypedList(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onExtraCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onExtraCallback.invoke(obj);
        }
    }

    public static final /* synthetic */ class writeTypedObject implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public writeTypedObject(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i4 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i3 + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static {
        bu_();
        Companion = new onExtraCallbackWithResult(null);
        int i = setEngagementSignalsCallback + 75;
        requestPostMessageChannelWithExtras = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 41;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy(baseActivity);
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(baseActivity);
        int i3 = newSession + 17;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseActivity baseActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = newSession + 107;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(baseActivity, dialogInterface);
        int i4 = newSession + 13;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseActivity baseActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 59;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(baseActivity, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseActivity baseActivity, Intent[] intentArr, Bundle bundle, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 67;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(baseActivity, intentArr, bundle, th);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = prefetchWithMultipleUrls + 37;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = newSession + 13;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(th);
        int i4 = newSession + 93;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Boolean bool) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 123;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(bool);
        int i4 = newSession + 73;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 27;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(function1, obj);
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(function1, obj);
        int i3 = newSession + 53;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback$3f564ca8(BaseActivity baseActivity, String str, Object obj, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 11;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult$3f564ca8(baseActivity, str, obj, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallbackWithResult$3f564ca8(baseActivity, str, obj, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallbackDefault(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 7;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            onMessageChannelReady(baseActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnMessageChannelReady = onMessageChannelReady(baseActivity);
        int i3 = prefetchWithMultipleUrls + 103;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        return zOnMessageChannelReady;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 17;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -551135954, new Object[]{baseActivity}, 551135969, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            return null;
        }
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -551135954, new Object[]{baseActivity}, 551135969, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = newSession + 25;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(baseActivity);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
    }

    public static /* synthetic */ Unit a_(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 79;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(th);
        int i4 = newSession + 55;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ int asBinder(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 109;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnActivityResized = onActivityResized(baseActivity);
        int i4 = prefetchWithMultipleUrls + 71;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return iOnActivityResized;
    }

    public static /* synthetic */ setDurationInForeground asInterface(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = newSession + 111;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        setDurationInForeground setdurationinforegroundOnMinimized = onMinimized(baseActivity);
        int i4 = newSession + 111;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return setdurationinforegroundOnMinimized;
    }

    public static /* synthetic */ ALCFaceMask bk_() {
        int i = 2 % 2;
        int i2 = newSession + 115;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceMask aLCFaceMaskAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        int i4 = newSession + 77;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceMaskAudioAttributesImplBaseParcelizer;
    }

    public static /* synthetic */ Window onExtraCallback(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 113;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Window window = (Window) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1718949424, new Object[]{baseActivity}, 1718949447, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = newSession + 59;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return window;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i4)) | i3;
        int i9 = ~i4;
        int i10 = i7 | i3;
        int i11 = (~(i5 | i9 | i3)) | (~(i10 | i4));
        int i12 = (~i10) | (~(i9 | (~i3)));
        int i13 = i3 + i4 + i + (1353909401 * i2) + ((-1351514252) * i6);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i3) + 799145984 + ((-1483212659) * i4) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i) + (337379328 * i2) + ((-1540358144) * i6) + (669122560 * i14);
        int i16 = ((i3 * 521834465) - 1171472169) + (i4 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i * 521834041) + (i2 * 1123214353) + (i6 * (-684621612)) + (i14 * 1028784128);
        switch (i15 + (i16 * i16 * 1635647488)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                BaseActivity baseActivity = (BaseActivity) objArr[0];
                String str = (String) objArr[1];
                int i17 = 2 % 2;
                int i18 = prefetchWithMultipleUrls + 11;
                newSession = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(baseActivity, str);
                int i20 = prefetchWithMultipleUrls + 67;
                newSession = i20 % 128;
                int i21 = i20 % 2;
                return unitOnExtraCallbackWithResult;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return access000(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i22 = 2 % 2;
                int i23 = newSession + 21;
                prefetchWithMultipleUrls = i23 % 128;
                int i24 = i23 % 2;
                function1.invoke(obj);
                int i25 = newSession + 81;
                prefetchWithMultipleUrls = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return access100(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case 16:
                return getInterfaceDescriptor(objArr);
            case 17:
                return extraCallbackWithResult(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return writeTypedObject(objArr);
            case 19:
                BaseActivity baseActivity2 = (BaseActivity) objArr[0];
                Intent[] intentArr = (Intent[]) objArr[1];
                Bundle bundle = (Bundle) objArr[2];
                int i27 = 2 % 2;
                int i28 = newSession + 119;
                prefetchWithMultipleUrls = i28 % 128;
                int i29 = i28 % 2;
                onNavigationEvent(baseActivity2, intentArr, bundle);
                int i30 = prefetchWithMultipleUrls + 87;
                newSession = i30 % 128;
                int i31 = i30 % 2;
                return null;
            case 20:
                return ICustomTabsCallback(objArr);
            case 21:
                return extraCallback(objArr);
            case 22:
                return readTypedObject(objArr);
            case 23:
                getHostnameVerifierokhttp gethostnameverifierokhttp = (BaseActivity) objArr[0];
                int i32 = 2 % 2;
                int i33 = newSession + 41;
                prefetchWithMultipleUrls = i33 % 128;
                int i34 = i33 % 2;
                Window window = gethostnameverifierokhttp.getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "");
                int i35 = newSession + 75;
                prefetchWithMultipleUrls = i35 % 128;
                int i36 = i35 % 2;
                return window;
            case 24:
                return onActivityLayout(objArr);
            case 25:
                return onMessageChannelReady(objArr);
            case 26:
                return onActivityResized(objArr);
            case 27:
                return onPostMessage(objArr);
            case 28:
                return onMinimized(objArr);
            case 29:
                return ICustomTabsCallbackStub(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 91;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(dialogInterface);
        int i4 = prefetchWithMultipleUrls + 91;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(BaseActivity baseActivity, CriticalMalwareState.State state) {
        int i = 2 % 2;
        int i2 = newSession + 13;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1990367737, new Object[]{baseActivity, state}, 1990367757, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = newSession + 11;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(BaseActivity baseActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 111;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(baseActivity, bool);
        int i4 = prefetchWithMultipleUrls + 107;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BaseActivity baseActivity, SessionTracker sessionTracker) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = newSession + 9;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(baseActivity, sessionTracker);
        int i4 = prefetchWithMultipleUrls + 31;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 83;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = prefetchWithMultipleUrls + 87;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 95;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1455459720, new Object[]{baseActivity}, -1455459716, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = prefetchWithMultipleUrls + 13;
        newSession = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 3;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallback(baseActivity);
        }
        extraCallback(baseActivity);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1039769889, new Object[]{function1, obj}, 1039769901, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = newSession + 97;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Ref.ObjectRef objectRef, BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 111;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(objectRef, baseActivity);
        int i4 = newSession + 27;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) throws Throwable {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 77;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(baseActivity, dialogInterface, iIntValue);
        int i4 = newSession + 19;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) throws Throwable {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        Object obj = objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 7;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult$71f6da4b = onExtraCallbackWithResult$71f6da4b(baseActivity, obj, dialogInterface);
        int i4 = prefetchWithMultipleUrls + 49;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult$71f6da4b;
    }

    public static /* synthetic */ Unit onNavigationEvent(BaseActivity baseActivity, getAdUnitIds.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = newSession + 75;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(baseActivity, onextracallback);
        int i4 = newSession + 119;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 75;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(SessionTracker sessionTracker, TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 17;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(sessionTracker, tdsToastV1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(sessionTracker, tdsToastV1);
        int i3 = newSession + 95;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(BaseActivity baseActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 97;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1307265271, new Object[]{baseActivity, dialogInterface}, -1307265250, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = newSession + 125;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(BaseActivity baseActivity, Ref.ObjectRef objectRef) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 57;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 771950130, new Object[]{baseActivity, objectRef}, -771950116, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = prefetchWithMultipleUrls + 37;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 17;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent$3f564ca8(BaseActivity baseActivity, String str, Object obj, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 1;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback$3f564ca8 = onExtraCallback$3f564ca8(baseActivity, str, obj, commonModule_setLeftEdgeTouchEnabled);
        int i4 = newSession + 111;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback$3f564ca8;
        }
        throw null;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 13;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(baseActivity);
        int i4 = prefetchWithMultipleUrls + 65;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BaseActivity baseActivity, String str) {
        int i = 2 % 2;
        int i2 = newSession + 121;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -29157943, new Object[]{baseActivity, str}, 29157946, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = newSession + 53;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = newSession + 95;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 682533857, new Object[]{th}, -682533831, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = newSession + 69;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ isStopped onWarmupCompleted(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = newSession + 51;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            extraCallbackWithResult(baseActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        isStopped isstoppedExtraCallbackWithResult = extraCallbackWithResult(baseActivity);
        int i3 = newSession + 27;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        return isstoppedExtraCallbackWithResult;
    }

    public static /* synthetic */ void onWarmupCompleted(BaseActivity baseActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 93;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -848207807, new Object[]{baseActivity, dialogInterface}, 848207807, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            return;
        }
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -848207807, new Object[]{baseActivity, dialogInterface}, 848207807, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(BaseActivity baseActivity, Intent intent, int i, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = newSession + 61;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {baseActivity, intent, Integer.valueOf(i), bundle};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        if (i4 != 0) {
            onExtraCallback(iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1176039056, objArr, 1176039080, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        } else {
            onExtraCallback(iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1176039056, objArr, 1176039080, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            int i5 = 15 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted$79836cda(BaseActivity baseActivity, Object obj, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 113;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback$79836cda = IAuthTabCallback$79836cda(baseActivity, obj, commonModule_setLeftEdgeTouchEnabled, dialogInterface);
        int i4 = prefetchWithMultipleUrls + 93;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return unitIAuthTabCallback$79836cda;
    }

    public boolean ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = newSession + 79;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return false;
    }

    protected void ICustomTabsService() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 71;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
    }

    protected View access000() {
        int i = 2 % 2;
        int i2 = newSession + 89;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public boolean bg_() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 7;
        newSession = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 83;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return z;
    }

    protected boolean bs_() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 39;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public FragmentActivity getActivity() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 3;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Context getContext() {
        int i = 2 % 2;
        int i2 = newSession + 25;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 117;
        newSession = i2 % 128;
        int i3 = i2 % 2;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 45;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 57;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return false;
    }

    public boolean onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 123;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected boolean postMessage() {
        int i = 2 % 2;
        int i2 = newSession + 75;
        prefetchWithMultipleUrls = i2 % 128;
        return true ^ (i2 % 2 == 0);
    }

    public boolean receiveFile() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 29;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AppWithState IAuthTabCallback_Parcel(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = newSession + 7;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            baseActivity.areNotificationsEnabled();
            throw null;
        }
        AppWithState appWithStateAreNotificationsEnabled = baseActivity.areNotificationsEnabled();
        int i3 = newSession + 87;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        return appWithStateAreNotificationsEnabled;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 3;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            baseActivity.cancelNotification();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View viewCancelNotification = baseActivity.cancelNotification();
        int i3 = newSession + 57;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        return viewCancelNotification;
    }

    public /* bridge */ boolean getAllowTraversingChildFragment() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 79;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        boolean allowTraversingChildFragment = super.getAllowTraversingChildFragment();
        int i4 = newSession + 27;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return allowTraversingChildFragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean getDiscoversCandidatesOnDraw() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 31;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        boolean discoversCandidatesOnDraw = super.getDiscoversCandidatesOnDraw();
        int i4 = newSession + 65;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return discoversCandidatesOnDraw;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean isLcpTrackable() {
        int i = 2 % 2;
        int i2 = newSession + 125;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            return super.isLcpTrackable();
        }
        super.isLcpTrackable();
        throw null;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = postMessage;
        int i6 = -1469660336;
        int i7 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = $11 + 19;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length2) {
                int i11 = $11 + 117;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 72 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.getMode(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i10++;
                    i6 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = postMessage;
        if (iArr6 != null) {
            int i13 = $11 + 109;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i14 = $10 + 65;
                $11 = i14 % 128;
                int i15 = i14 % i4;
                Object[] objArr3 = new Object[1];
                objArr3[i7] = Integer.valueOf(iArr6[i3]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", i7), 73 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 8848 - Color.blue(i7), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i3++;
                i4 = 2;
                i7 = 0;
            }
            i2 = i7;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        int i16 = $10 + 59;
        $11 = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 4 % 5;
        }
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i18];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 40 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 10301 - Color.alpha(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i18++;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 77, 7397 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 101;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = baseActivity.deps;
        if (iAuthTabCallback != null) {
            return iAuthTabCallback;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = newSession + 103;
        prefetchWithMultipleUrls = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final isStopped notifyNotificationWithChannel() {
        int i = 2 % 2;
        int i2 = newSession + 121;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        isStopped isstopped = (isStopped) this.newSessionWithExtras.getValue();
        if (i3 != 0) {
            return isstopped;
        }
        throw null;
    }

    private static final isStopped extraCallbackWithResult(final BaseActivity baseActivity) {
        int i = 2 % 2;
        isStopped isstopped = new isStopped(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(baseActivity), new asBinder(baseActivity), new Function0() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                Window windowOnExtraCallback;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 113;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    windowOnExtraCallback = BaseActivity.onExtraCallback(this.f$0);
                    int i4 = 11 / 0;
                } else {
                    windowOnExtraCallback = BaseActivity.onExtraCallback(this.f$0);
                }
                int i5 = onNavigationEvent + 105;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 52 / 0;
                }
                return windowOnExtraCallback;
            }
        }, new IAuthTabCallbackDefault(baseActivity), new Function0() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda17
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 111;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(BaseActivity.IAuthTabCallbackDefault(this.f$0));
                int i5 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        }, new Function0() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda18
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 123;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Integer.valueOf(BaseActivity.asBinder(this.f$0));
                    throw null;
                }
                Integer numValueOf = Integer.valueOf(BaseActivity.asBinder(this.f$0));
                int i4 = onExtraCallback + 85;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return numValueOf;
            }
        }, new Function0() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                setDurationInForeground setdurationinforegroundAsInterface = BaseActivity.asInterface(this.f$0);
                if (i4 == 0) {
                    int i5 = 56 / 0;
                }
                return setdurationinforegroundAsInterface;
            }
        }, new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda20
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                Unit unitOnWarmupCompleted;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 89;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    unitOnWarmupCompleted = BaseActivity.onWarmupCompleted(this.f$0, (String) obj);
                    int i4 = 72 / 0;
                } else {
                    unitOnWarmupCompleted = BaseActivity.onWarmupCompleted(this.f$0, (String) obj);
                }
                int i5 = onExtraCallbackWithResult + 77;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = newSession + 111;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return isstopped;
    }

    static final /* synthetic */ class asBinder extends FunctionReferenceImpl implements Function0<AppWithState> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        asBinder(Object obj) {
            super(0, obj, BaseActivity.class, "getOrCreateDecorUnderlayViewController", "getOrCreateDecorUnderlayViewController()Lim/toss/uikit/widget/underlay/DecorUnderlayViewController;", 0);
        }

        public final AppWithState IAuthTabCallback() {
            AppWithState appWithStateIAuthTabCallback_Parcel;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                appWithStateIAuthTabCallback_Parcel = BaseActivity.IAuthTabCallback_Parcel((BaseActivity) ((CallableReference) this).receiver);
                int i3 = 7 / 0;
            } else {
                appWithStateIAuthTabCallback_Parcel = BaseActivity.IAuthTabCallback_Parcel((BaseActivity) ((CallableReference) this).receiver);
            }
            int i4 = IAuthTabCallback + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return appWithStateIAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            AppWithState appWithStateIAuthTabCallback = IAuthTabCallback();
            int i3 = onNavigationEvent + 31;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return appWithStateIAuthTabCallback;
            }
            throw null;
        }
    }

    static final /* synthetic */ class IAuthTabCallbackDefault extends FunctionReferenceImpl implements Function0<View> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        IAuthTabCallbackDefault(Object obj) {
            super(0, obj, BaseActivity.class, "getUnderlayRootView", "getUnderlayRootView()Landroid/view/View;", 0);
        }

        public final View IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            View view = (View) BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 661656573, new Object[]{(BaseActivity) ((CallableReference) this).receiver}, -661656551, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            int i3 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return view;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback();
            }
            IAuthTabCallback();
            throw null;
        }
    }

    private static final boolean onMessageChannelReady(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = newSession + 49;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = baseActivity.getLifecycle();
        if (i3 != 0) {
            if (lifecycle.IAuthTabCallback() != TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED) {
                return false;
            }
            int i4 = newSession + 99;
            prefetchWithMultipleUrls = i4 % 128;
            return i4 % 2 != 0;
        }
        lifecycle.IAuthTabCallback();
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int onActivityResized(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = newSession + 109;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = baseActivity.ITrustedWebActivityCallback().onExtraCallback();
        int i4 = newSession + 9;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    private static final setDurationInForeground onMinimized(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 39;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        setDurationInForeground setdurationinforegroundIAuthTabCallback_Parcel = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallback_Parcel();
        int i4 = prefetchWithMultipleUrls + 53;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return setdurationinforegroundIAuthTabCallback_Parcel;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, im.toss.base.BaseActivity] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ?? r2 = (BaseActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        AppWithState appWithState = ((BaseActivity) r2).IAuthTabCallbackStubProxy;
        Object obj = null;
        if (appWithState != null) {
            int i2 = prefetchWithMultipleUrls + 103;
            newSession = i2 % 128;
            if (i2 % 2 != 0) {
                appWithState.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            appWithState.onNavigationEvent();
        }
        SessionTrackerb.IAuthTabCallback(resumeForClick.asBinder, (Activity) r2, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = prefetchWithMultipleUrls + 57;
        newSession = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    protected boolean bq_() {
        int i = 2 % 2;
        int i2 = newSession + 3;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        boolean z = this.ICustomTabsCallback;
        int i5 = i3 + 67;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    protected boolean bp_() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 41;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.getInterfaceDescriptor;
        int i5 = i2 + 1;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final BrickModuleImplExternalSyntheticLambda3 ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 81;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3 = this.ICustomTabsCallbackStub;
        int i5 = i2 + 49;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return brickModuleImplExternalSyntheticLambda3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected boolean ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 95;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.readTypedObject;
        int i5 = i2 + 19;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        setEnabledAmazonAdUnitIds setenabledamazonadunitids = (setEnabledAmazonAdUnitIds) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 111;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setenabledamazonadunitids, "");
        baseActivity.onRelationshipValidationResult = setenabledamazonadunitids;
        int i4 = newSession + 75;
        prefetchWithMultipleUrls = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final setEnabledAmazonAdUnitIds br_() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 89;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setEnabledAmazonAdUnitIds setenabledamazonadunitids = this.onRelationshipValidationResult;
        int i4 = i2 + 9;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return setenabledamazonadunitids;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r2 = r2 + 7;
        im.toss.base.BaseActivity.prefetchWithMultipleUrls = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r7 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r7 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r6 = o.setVisitUrl.onExtraCallbackWithResult();
        r5 = o.setVisitUrl.onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        return java.lang.Boolean.valueOf(((java.lang.Boolean) o.setSdkKey.onExtraCallbackWithResult(1675082423, o.setVisitUrl.onExtraCallbackWithResult(), -1675082421, o.setVisitUrl.onExtraCallbackWithResult(), new java.lang.Object[]{r7}, r5, r6)).booleanValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 61;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        setSdkKey setsdkkey = baseActivity.onPostMessage;
        if (i4 == 0) {
            int i5 = 63 / 0;
        }
    }

    public final setTid<Boolean> writeTypedObject() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 27;
        newSession = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        setTid<Boolean> settid = this.onActivityResized;
        int i4 = i2 + 103;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return settid;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void getInterfaceDescriptor(BaseActivity baseActivity) {
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3;
        int i = 2 % 2;
        int i2 = newSession + 5;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            baseActivity.isFinishing();
            obj.hashCode();
            throw null;
        }
        if ((!baseActivity.isFinishing()) && (brickModuleImplExternalSyntheticLambda3 = baseActivity.ICustomTabsCallbackStub) != null && brickModuleImplExternalSyntheticLambda3.isShowing()) {
            int i3 = prefetchWithMultipleUrls + 117;
            newSession = i3 % 128;
            int i4 = i3 % 2;
            BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda32 = baseActivity.ICustomTabsCallbackStub;
            if (brickModuleImplExternalSyntheticLambda32 != null) {
                brickModuleImplExternalSyntheticLambda32.dismiss();
                int i5 = newSession + 87;
                prefetchWithMultipleUrls = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 4;
                }
            }
            baseActivity.ICustomTabsCallbackStub = null;
            int i7 = newSession + 27;
            prefetchWithMultipleUrls = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = prefetchWithMultipleUrls + 59;
        newSession = i9 % 128;
        int i10 = i9 % 2;
    }

    protected boolean onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 15;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.prefetch;
        int i4 = i2 + 61;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = newSession + 61;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            if (newSessionWithExtras()) {
                return false;
            }
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object[] objArr = {(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())};
            if (!((SidecarCompatExternalSyntheticLambda0) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallback()) {
                return false;
            }
            int i3 = prefetchWithMultipleUrls + 29;
            newSession = i3 % 128;
            int i4 = i3 % 2;
            if (!setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback() || SessionState.Companion.onExtraCallback().onTransact()) {
                return false;
            }
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            if (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onNavigationEvent().IAuthTabCallback()) {
                return false;
            }
            int i5 = prefetchWithMultipleUrls + 51;
            newSession = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        newSessionWithExtras();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setRubIn<Boolean> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = newSession + 67;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        setRubIn<Boolean> setrubin = this.onTransact;
        int i5 = i3 + 89;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    private static final ALCFaceMask AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = newSession + 65;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceMask aLCFaceMaskOnWarmupCompleted = ALCFaceMask.Companion.onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return aLCFaceMaskOnWarmupCompleted;
    }

    private final ALCFaceMask ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 43;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.ICustomTabsCallback_Parcel.getValue();
        if (i3 == 0) {
            return (ALCFaceMask) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseActivity() {
        this.ICustomTabsCallbackDefault = "redirect";
        this.newSessionWithExtras = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new Function0() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                isStopped isstoppedOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    isstoppedOnWarmupCompleted = BaseActivity.onWarmupCompleted(this.f$0);
                    int i3 = 0 / 0;
                } else {
                    isstoppedOnWarmupCompleted = BaseActivity.onWarmupCompleted(this.f$0);
                }
                int i4 = onWarmupCompleted + 9;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return isstoppedOnWarmupCompleted;
            }
        });
        this.ICustomTabsCallback = true;
        this.getInterfaceDescriptor = true;
        this.onRelationshipValidationResult = setEnabledAmazonAdUnitIds.UNDEFINED;
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        this.onActivityResized = settidOnNavigationEvent;
        this.IAuthTabCallback_Parcel = new Runnable() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 115;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                BaseActivity.IAuthTabCallbackStub(this.f$0);
                if (i3 == 0) {
                    int i4 = 38 / 0;
                }
            }
        };
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(Boolean.FALSE);
        this.asBinder = getcornerradiusOnNavigationEvent;
        this.onTransact = getcornerradiusOnNavigationEvent;
        this.ICustomTabsCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 89;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    BaseActivity.bk_();
                    throw null;
                }
                ALCFaceMask aLCFaceMaskBk_ = BaseActivity.bk_();
                int i3 = IAuthTabCallback + 17;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 77 / 0;
                }
                return aLCFaceMaskBk_;
            }
        });
        this.mayLaunchUrl = ITrustedWebActivityCallback_Parcel().extraCallback();
    }

    public BaseActivity(int i) {
        super(i);
        this.ICustomTabsCallbackDefault = "redirect";
        this.newSessionWithExtras = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new Function0() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                isStopped isstoppedOnWarmupCompleted;
                int i2 = 2 % 2;
                int i22 = IAuthTabCallback + 91;
                onWarmupCompleted = i22 % 128;
                if (i22 % 2 != 0) {
                    isstoppedOnWarmupCompleted = BaseActivity.onWarmupCompleted(this.f$0);
                    int i3 = 0 / 0;
                } else {
                    isstoppedOnWarmupCompleted = BaseActivity.onWarmupCompleted(this.f$0);
                }
                int i4 = onWarmupCompleted + 9;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return isstoppedOnWarmupCompleted;
            }
        });
        this.ICustomTabsCallback = true;
        this.getInterfaceDescriptor = true;
        this.onRelationshipValidationResult = setEnabledAmazonAdUnitIds.UNDEFINED;
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        this.onActivityResized = settidOnNavigationEvent;
        this.IAuthTabCallback_Parcel = new Runnable() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i22 = IAuthTabCallback + 115;
                onExtraCallback = i22 % 128;
                int i3 = i22 % 2;
                BaseActivity.IAuthTabCallbackStub(this.f$0);
                if (i3 == 0) {
                    int i4 = 38 / 0;
                }
            }
        };
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(Boolean.FALSE);
        this.asBinder = getcornerradiusOnNavigationEvent;
        this.onTransact = getcornerradiusOnNavigationEvent;
        this.ICustomTabsCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onNavigationEvent + 89;
                IAuthTabCallback = i22 % 128;
                if (i22 % 2 != 0) {
                    BaseActivity.bk_();
                    throw null;
                }
                ALCFaceMask aLCFaceMaskBk_ = BaseActivity.bk_();
                int i3 = IAuthTabCallback + 17;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 77 / 0;
                }
                return aLCFaceMaskBk_;
            }
        });
        this.mayLaunchUrl = ITrustedWebActivityCallback_Parcel().extraCallback();
    }

    public void showLoadingIndicator(@Nullable String str) {
        int i = 2 % 2;
        if (onMinimized()) {
            return;
        }
        int i2 = prefetchWithMultipleUrls + 87;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str == null) {
            IAuthTabCallback(this, (String) null, false, 3, (Object) null);
            return;
        }
        onNavigationEvent(str, false);
        int i3 = newSession + 9;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
    }

    public void dismissLoadingIndicator() {
        int i = 2 % 2;
        int i2 = newSession + 91;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        bo_();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = newSession + 85;
        prefetchWithMultipleUrls = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
    }

    public boolean onMinimized() {
        int i = 2 % 2;
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3 = this.ICustomTabsCallbackStub;
        if (brickModuleImplExternalSyntheticLambda3 != null) {
            int i2 = prefetchWithMultipleUrls + 103;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            if (brickModuleImplExternalSyntheticLambda3.isShowing()) {
                int i4 = newSession + 49;
                int i5 = i4 % 128;
                prefetchWithMultipleUrls = i5;
                z = i4 % 2 != 0;
                int i6 = i5 + 59;
                newSession = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getBiometricTitle() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 109;
        newSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBillingPeriod.onNavigationEvent onnavigationevent = getBillingPeriod.Companion;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            onnavigationevent.IAuthTabCallback(applicationContext).onExtraCallbackWithResult();
            getPricingPhaseList getpricingphaselist = getPricingPhaseList.EU;
            obj.hashCode();
            throw null;
        }
        getBillingPeriod.onNavigationEvent onnavigationevent2 = getBillingPeriod.Companion;
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        if (onnavigationevent2.IAuthTabCallback(applicationContext2).onExtraCallbackWithResult() != getPricingPhaseList.EU) {
            return "";
        }
        int i3 = newSession + 29;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNull(getString(R.string.base_biometric_auth_title_eu));
            obj.hashCode();
            throw null;
        }
        String string = getString(R.string.base_biometric_auth_title_eu);
        Intrinsics.checkNotNull(string);
        return string;
    }

    protected boolean mayLaunchUrl() {
        boolean z;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls;
        int i3 = i2 + 13;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.extraCallbackWithResult;
            int i4 = 24 / 0;
        } else {
            z = this.extraCallbackWithResult;
        }
        int i5 = i2 + 113;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return z;
    }

    private static final Unit onWarmupCompleted(SessionTracker sessionTracker, TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 37;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tdsToastV1, "");
            sessionTracker.onWarmupCompleted();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tdsToastV1, "");
        Function0 function0OnWarmupCompleted = sessionTracker.onWarmupCompleted();
        if (function0OnWarmupCompleted != null) {
            function0OnWarmupCompleted.invoke();
            int i3 = newSession + 47;
            prefetchWithMultipleUrls = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = prefetchWithMultipleUrls + 67;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(BaseActivity baseActivity, SessionTracker sessionTracker) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Object obj = null;
        if (!baseActivity.isFinishing() && !StringsKt.isBlank(sessionTracker.IAuthTabCallbackStub())) {
            TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(baseActivity, sessionTracker.IAuthTabCallbackStub());
            View viewOnNavigationEvent = sessionTracker.onNavigationEvent();
            if (viewOnNavigationEvent == null) {
                viewOnNavigationEvent = baseActivity.RatingCompatApi19Impl();
            }
            if (viewOnNavigationEvent != null && viewOnNavigationEvent.getId() != 16908290) {
                onnavigationevent.onNavigationEvent(viewOnNavigationEvent);
            }
            getEnabledAmazonAdUnitIds.IAuthTabCallback iAuthTabCallbackAsInterface = sessionTracker.asInterface();
            if (iAuthTabCallbackAsInterface instanceof getEnabledAmazonAdUnitIds.onWarmupCompleted) {
                int i2 = prefetchWithMultipleUrls + 29;
                newSession = i2 % 128;
                if (i2 % 2 != 0) {
                    TdsToastV1.onNavigationEvent.onNavigationEvent(onnavigationevent, ((getEnabledAmazonAdUnitIds.onWarmupCompleted) iAuthTabCallbackAsInterface).onExtraCallback(), 0, 5, (Object) null);
                } else {
                    TdsToastV1.onNavigationEvent.onNavigationEvent(onnavigationevent, ((getEnabledAmazonAdUnitIds.onWarmupCompleted) iAuthTabCallbackAsInterface).onExtraCallback(), 0, 2, (Object) null);
                }
            } else {
                if (!(iAuthTabCallbackAsInterface instanceof getEnabledAmazonAdUnitIds.IAuthTabCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                TdsToastV1.onNavigationEvent.onExtraCallback(onnavigationevent, iAuthTabCallbackAsInterface.onExtraCallbackWithResult(), 0, 2, (Object) null);
            }
            String strOnExtraCallbackWithResult = sessionTracker.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                int i3 = prefetchWithMultipleUrls + 71;
                newSession = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 65 / 0;
                    if (!StringsKt.isBlank(strOnExtraCallbackWithResult)) {
                        if (sessionTracker.onWarmupCompleted() != null) {
                            String strOnExtraCallbackWithResult2 = sessionTracker.onExtraCallbackWithResult();
                            if (strOnExtraCallbackWithResult2 == null) {
                                strOnExtraCallbackWithResult2 = "";
                            }
                            Object[] objArr = {onnavigationevent, strOnExtraCallbackWithResult2, new BaseActivity$.ExternalSyntheticLambda15(sessionTracker)};
                            int iOnWarmupCompleted = a.AnonymousClass3.onWarmupCompleted();
                        }
                    }
                } else if (!StringsKt.isBlank(strOnExtraCallbackWithResult)) {
                }
            }
            Object[] objArr2 = {onnavigationevent.IAuthTabCallback(sessionTracker.onExtraCallback())};
            int iOnWarmupCompleted2 = a.AnonymousClass3.onWarmupCompleted();
            TdsToastV1 tdsToastV1 = (TdsToastV1) TdsToastV1.onNavigationEvent.onWarmupCompleted(a.AnonymousClass3.onWarmupCompleted(), -950699249, a.AnonymousClass3.onWarmupCompleted(), a.AnonymousClass3.onWarmupCompleted(), objArr2, 950699257, iOnWarmupCompleted2);
            if (sessionTracker.IAuthTabCallback() != null) {
                Integer numIAuthTabCallback = sessionTracker.IAuthTabCallback();
                tdsToastV1.asBinder(numIAuthTabCallback != null ? numIAuthTabCallback.intValue() : 0);
            }
            tdsToastV1.IAuthTabCallback_Parcel();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = prefetchWithMultipleUrls + 23;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 7;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        String interfaceDescriptor;
        setEnabledAmazonAdUnitIds setenabledamazonadunitids;
        int i = 2 % 2;
        if (ITrustedWebActivityServiceDefault()) {
            overridePendingTransition(0, 0);
        }
        Annotation[] annotations = getClass().getAnnotations();
        AFj1nSDK5.onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), 507432461, handleRemoveKey.onExtraCallbackWithResult(), -507432457, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{AFj1nSDK5.onNavigationEvent, getIntent()}, handleRemoveKey.onExtraCallbackWithResult());
        Intrinsics.checkNotNull(annotations);
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotations) {
            if (annotation instanceof EmbeddingAdapterExternalSyntheticLambda1) {
                arrayList.add(annotation);
            }
        }
        EmbeddingAdapterExternalSyntheticLambda1 embeddingAdapterExternalSyntheticLambda1 = (EmbeddingAdapterExternalSyntheticLambda1) CollectionsKt.firstOrNull(arrayList);
        Object obj = null;
        if (embeddingAdapterExternalSyntheticLambda1 != null) {
            if (embeddingAdapterExternalSyntheticLambda1.IAuthTabCallback()) {
                int i2 = newSession + 101;
                prefetchWithMultipleUrls = i2 % 128;
                if (i2 % 2 == 0) {
                    setEnabledAmazonAdUnitIds setenabledamazonadunitids2 = setEnabledAmazonAdUnitIds.SECURE;
                    obj.hashCode();
                    throw null;
                }
                setenabledamazonadunitids = setEnabledAmazonAdUnitIds.SECURE;
                int i3 = newSession + 61;
                prefetchWithMultipleUrls = i3 % 128;
                int i4 = i3 % 2;
            } else {
                setenabledamazonadunitids = setEnabledAmazonAdUnitIds.NON_SECURE;
            }
            this.onRelationshipValidationResult = setenabledamazonadunitids;
        }
        super.onCreate(bundle);
        if (!(!IAuthTabCallback(annotations)) && !getSmallIconId()) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ForbiddenAccess", new getAxonEventKey("invalid entrypoint access - TossTeamOnly"));
            finish();
        }
        if (onExtraCallbackWithResult(annotations)) {
            int i5 = newSession + 75;
            prefetchWithMultipleUrls = i5 % 128;
            if (i5 % 2 == 0) {
                SessionState.Companion.onExtraCallback().onTransact();
                obj.hashCode();
                throw null;
            }
            if (!SessionState.Companion.onExtraCallback().onTransact()) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ForbiddenAccess", new getAxonEventKey("invalid entrypoint access - RequiresAuth"));
                finish();
            }
        }
        if (bundle == null) {
            if (onExtraCallback.onExtraCallbackWithResult[onExtraCallback(ITrustedWebActivityCallbackStubProxy()).ordinal()] == 1) {
                int i6 = newSession + 69;
                prefetchWithMultipleUrls = i6 % 128;
                if (i6 % 2 == 0) {
                    getActiveNotifications();
                    int i7 = 4 / 0;
                } else {
                    getActiveNotifications();
                }
            }
        }
        if (isFinishing()) {
            return;
        }
        View rootView = getWindow().getDecorView().getRootView();
        Intrinsics.checkNotNull(rootView, "");
        this.onPostMessage = new setSdkKey((ViewGroup) rootView);
        if (bundle != null) {
            int i8 = newSession + 121;
            prefetchWithMultipleUrls = i8 % 128;
            int i9 = i8 % 2;
            interfaceDescriptor = bundle.getString("prevScreenName");
        } else {
            TrackState trackStateOnWarmupCompleted = AppLovinBroadcastManagerReceiver.Companion.IAuthTabCallback().onWarmupCompleted();
            interfaceDescriptor = trackStateOnWarmupCompleted != null ? trackStateOnWarmupCompleted.getInterfaceDescriptor() : null;
        }
        this.onMinimized = interfaceDescriptor;
        if (bundle == null) {
            int i10 = newSession + 17;
            prefetchWithMultipleUrls = i10 % 128;
            if (i10 % 2 == 0) {
                onNavigationEvent(annotations);
                obj.hashCode();
                throw null;
            }
            onNavigationEvent(annotations);
        }
        if (ICustomTabsCallbackStubProxy()) {
            int i11 = newSession + 43;
            prefetchWithMultipleUrls = i11 % 128;
            int i12 = i11 % 2;
            overridePendingTransition(im.toss.core.R.anim.anim_window_in, im.toss.core.R.anim.slide_out_bottom_short);
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onNavigationEvent(true);
                supportActionBar.onNavigationEvent(im.toss.core.R.drawable.icn_navigation_close);
            }
        }
        this.onActivityResized.onExtraCallback(Boolean.valueOf(isInMultiWindowMode()));
        ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackStubProxy().onWarmupCompleted(this);
        IEngagementSignalsCallback_Parcel();
        bn_();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(SessionTracker.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new BaseActivity$.ExternalSyntheticLambda9(), (Function0) null, new BaseActivity$.ExternalSyntheticLambda10(this), 2, (Object) null));
        AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(BaseActivity baseActivity, String str) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 55;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SessionTrackerb.IAuthTabCallback(resumeForClick.asBinder, baseActivity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 17;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityService_Parcel() {
        boolean booleanExtra;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 19;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        if (isPreload.onWarmupCompleted.ICustomTabsCallback()) {
            int i4 = newSession + 19;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
            Intent intent = getIntent();
            if (intent != null) {
                int i6 = newSession + 103;
                prefetchWithMultipleUrls = i6 % 128;
                int i7 = i6 % 2;
                booleanExtra = intent.getBooleanExtra("from_tns", false);
            } else {
                booleanExtra = false;
            }
            if (!(!booleanExtra)) {
                getIntent().putExtra("from_tns", false);
            }
            if (this.ICustomTabsService == null) {
                int i8 = prefetchWithMultipleUrls + 27;
                newSession = i8 % 128;
                int i9 = i8 % 2;
                if (!mayLaunchUrl()) {
                    if (!((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onNavigationEvent((Activity) this)) {
                        this.ICustomTabsService = new GriverBaseActivity(this, new BaseActivity$.ExternalSyntheticLambda32(this));
                        int i10 = newSession + 23;
                        prefetchWithMultipleUrls = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
            }
            GriverBaseActivity griverBaseActivity = this.ICustomTabsService;
            if (griverBaseActivity != null) {
                GriverBaseActivity.IAuthTabCallback(new Object[]{griverBaseActivity, Boolean.valueOf(booleanExtra)}, getKekid.onExtraCallback(), 2028908587, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -2028908587);
            }
        }
    }

    private final boolean IAuthTabCallback(Annotation[] annotationArr) {
        int i = 2 % 2;
        int i2 = newSession + 85;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int length = annotationArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = newSession + 105;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            if (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onNavigationEvent(annotationArr[i4])) {
                return true;
            }
            i4++;
            int i7 = newSession + 51;
            prefetchWithMultipleUrls = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    private final boolean onExtraCallbackWithResult(Annotation[] annotationArr) {
        int i = 2 % 2;
        int i2 = newSession + 49;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        int length = annotationArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = prefetchWithMultipleUrls + 19;
            newSession = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
                if (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onExtraCallbackWithResult(annotationArr[i4])) {
                    return true;
                }
            } else {
                if (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onExtraCallbackWithResult(annotationArr[i4])) {
                    return true;
                }
            }
            i4++;
            int i7 = newSession + 17;
            prefetchWithMultipleUrls = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    private final boolean getSmallIconId() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 11;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        zzad zzadVarIAuthTabCallbackDefault = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackDefault();
        if (zzadVarIAuthTabCallbackDefault.ITrustedWebActivityServiceStubProxy()) {
            int i4 = prefetchWithMultipleUrls + 79;
            newSession = i4 % 128;
            return i4 % 2 != 0;
        }
        if (zzadVarIAuthTabCallbackDefault.onActivityLayout()) {
            int i5 = newSession + 59;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (zzadVarIAuthTabCallbackDefault.RemoteActionCompatParcelizer()) {
            int i7 = prefetchWithMultipleUrls + 19;
            newSession = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (zzadVarIAuthTabCallbackDefault.MediaMetadataCompat()) {
            int i9 = newSession + 87;
            prefetchWithMultipleUrls = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }
        int i11 = newSession + 71;
        prefetchWithMultipleUrls = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public final void bm_() throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 71;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            getSmallIconId();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (getSmallIconId()) {
            return;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ForbiddenAccess", new getAxonEventKey("invalid entrypoint access - TossTeamOnly"));
        finish();
        int i3 = newSession + 29;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.base.BaseActivity] */
    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        ?? r0 = (BaseActivity) objArr[0];
        Intent intent = (Intent) objArr[1];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 91;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        EncoderImplExternalSyntheticLambda16 encoderImplExternalSyntheticLambda16OnWarmupCompleted = EncoderImplExternalSyntheticLambda16.onWarmupCompleted((Context) r0);
        encoderImplExternalSyntheticLambda16OnWarmupCompleted.onWarmupCompleted(intent);
        encoderImplExternalSyntheticLambda16OnWarmupCompleted.onWarmupCompleted();
        r0.finish();
        int i4 = newSession + 75;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Uri ITrustedWebActivityCallbackStubProxy() {
        String stringExtra;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 51;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(this.ICustomTabsCallbackDefault)) != null) {
            return Uri.parse(stringExtra);
        }
        int i4 = newSession + 105;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public onNavigationEvent onExtraCallback(@Nullable Uri uri) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 5;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (uri != null) {
            int i5 = i3 + 53;
            prefetchWithMultipleUrls = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.areEqual(uri, Uri.EMPTY);
                throw null;
            }
            if (!Intrinsics.areEqual(uri, Uri.EMPTY)) {
                return onNavigationEvent.LAZY_REDIRECT;
            }
        }
        onNavigationEvent onnavigationevent = onNavigationEvent.NO_REDIRECT;
        int i6 = prefetchWithMultipleUrls + 13;
        newSession = i6 % 128;
        if (i6 % 2 == 0) {
            return onnavigationevent;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onActivityResized() {
        int i = 2 % 2;
        int i2 = newSession + 67;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallback(ITrustedWebActivityCallbackStubProxy()) == onNavigationEvent.NO_REDIRECT) {
            return false;
        }
        int i4 = prefetchWithMultipleUrls + 73;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getActiveNotifications() throws NoWhenBranchMatchedException {
        String string;
        int i = 2 % 2;
        int i2 = newSession + 5;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        if (intent == null) {
            return false;
        }
        onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(ITrustedWebActivityCallbackStubProxy());
        Uri uriITrustedWebActivityCallbackStubProxy = ITrustedWebActivityCallbackStubProxy();
        if (uriITrustedWebActivityCallbackStubProxy != null) {
            int i4 = prefetchWithMultipleUrls + 9;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            string = uriITrustedWebActivityCallbackStubProxy.toString();
            int i6 = prefetchWithMultipleUrls + 93;
            newSession = i6 % 128;
            int i7 = i6 % 2;
        } else {
            string = null;
        }
        String str = string;
        int i8 = onExtraCallback.onExtraCallbackWithResult[onnavigationeventOnExtraCallback.ordinal()];
        if (i8 == 1) {
            intent.removeExtra(this.ICustomTabsCallbackDefault);
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1257820142, new Object[]{this, intent}, -1257820131, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            SessionTrackerb.IAuthTabCallback(resumeForClick.asBinder, this, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            return true;
        }
        if (i8 == 2) {
            intent.removeExtra(this.ICustomTabsCallbackDefault);
            SessionTrackerb.IAuthTabCallback(resumeForClick.asBinder, this, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            return true;
        }
        int i9 = prefetchWithMultipleUrls + 125;
        int i10 = i9 % 128;
        newSession = i10;
        if (i9 % 2 == 0 ? i8 != 3 : i8 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i11 = i10 + 85;
        prefetchWithMultipleUrls = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 10 / 0;
        }
        return false;
    }

    static final /* synthetic */ class asInterface extends FunctionReferenceImpl implements Function0<Boolean> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        asInterface(Object obj) {
            super(0, obj, BaseActivity.class, "handleUserStateErrorIfNeeded", "handleUserStateErrorIfNeeded()Z", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return boolOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Boolean onWarmupCompleted() {
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                boolValueOf = Boolean.valueOf(((BaseActivity) ((CallableReference) this).receiver).bs_());
                int i3 = 84 / 0;
            } else {
                boolValueOf = Boolean.valueOf(((BaseActivity) ((CallableReference) this).receiver).bs_());
            }
            int i4 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return boolValueOf;
        }
    }

    public void onPostCreate(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        super/*androidx.appcompat.app.AppCompatActivity*/.onPostCreate(bundle);
        if (postMessage()) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onNavigationEvent().onExtraCallbackWithResult(this, new asInterface(this));
        }
        if (bundle == null) {
            int i2 = newSession + 5;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 == 0) {
                if (onExtraCallback.onExtraCallbackWithResult[onExtraCallback(ITrustedWebActivityCallbackStubProxy()).ordinal()] != 5) {
                    return;
                }
            } else {
                if (onExtraCallback.onExtraCallbackWithResult[onExtraCallback(ITrustedWebActivityCallbackStubProxy()).ordinal()] != 2) {
                    return;
                }
            }
            int i3 = newSession + 53;
            prefetchWithMultipleUrls = i3 % 128;
            int i4 = i3 % 2;
            getActiveNotifications();
            if (i4 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r2 = r2 + 87;
        im.toss.base.BaseActivity.newSession = r2 % 128;
        r2 = r2 % 2;
        r4 = r3.access000();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r3 = r3.onNavigationEvent(r4);
        r4 = im.toss.base.BaseActivity.newSession + 15;
        im.toss.base.BaseActivity.prefetchWithMultipleUrls = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canShowSoftInput");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if ((r5 & 1) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ boolean onExtraCallback(BaseActivity baseActivity, View view, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = newSession + 19;
        int i4 = i3 % 128;
        prefetchWithMultipleUrls = i4;
        if (i3 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onNavigationEvent(@Nullable View view) {
        int i = 2 % 2;
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.IAuthTabCallback(configuration)) {
            int i2 = newSession + 119;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            if (!(!((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onNavigationEvent(this, view))) {
                if (!varyFields.onWarmupCompleted(this)) {
                    int i4 = prefetchWithMultipleUrls + 71;
                    newSession = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 50 / 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void onFirstGlobalLayout() {
        int i = 2 % 2;
        int i2 = newSession + 37;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super.onFirstGlobalLayout();
        AudioAttributesImplApi26Parcelizer();
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 2070928528, new Object[]{this}, -2070928527, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = prefetchWithMultipleUrls + 19;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onUiLaunchTime(@NotNull ALCFaceEmotion aLCFaceEmotion) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 77;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceEmotion, "");
        super.onUiLaunchTime(aLCFaceEmotion);
        if (isSplashScreen()) {
            return;
        }
        int i4 = prefetchWithMultipleUrls + 17;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {this};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        if (i5 == 0) {
            ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, objArr, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onWarmupCompleted().IAuthTabCallback();
            return;
        }
        ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, objArr, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onWarmupCompleted().IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        if (!(true ^ onExtraCallback(baseActivity, (View) null, 1, (Object) null))) {
            int i2 = prefetchWithMultipleUrls + 57;
            newSession = i2 % 128;
            if (i2 % 2 != 0) {
                baseActivity.access000();
                throw null;
            }
            View viewAccess000 = baseActivity.access000();
            if (viewAccess000 != null) {
                if ((viewAccess000 instanceof TextView) && !((TextView) viewAccess000).getShowSoftInputOnFocus()) {
                    int i3 = prefetchWithMultipleUrls + 123;
                    newSession = i3 % 128;
                    int i4 = i3 % 2;
                    viewAccess000.requestFocus();
                    return null;
                }
                Object[] objArr2 = {M_.onExtraCallback, viewAccess000};
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                M_.onNavigationEvent(1312897292, objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
                int i5 = prefetchWithMultipleUrls + 19;
                newSession = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return null;
    }

    public void setContentView(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = prefetchWithMultipleUrls + 3;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            super/*androidx.appcompat.app.AppCompatActivity*/.setContentView(i);
            PlaybackStateCompat();
            onSessionEnded();
            int i4 = 79 / 0;
            return;
        }
        super/*androidx.appcompat.app.AppCompatActivity*/.setContentView(i);
        PlaybackStateCompat();
        onSessionEnded();
    }

    public void setContentView(@Nullable View view) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 23;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.appcompat.app.AppCompatActivity*/.setContentView(view);
        PlaybackStateCompat();
        onSessionEnded();
        int i4 = prefetchWithMultipleUrls + 37;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 55;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.appcompat.app.AppCompatActivity*/.setContentView(view, layoutParams);
        PlaybackStateCompat();
        onSessionEnded();
        int i4 = prefetchWithMultipleUrls + 73;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final View cancelNotification() {
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 119;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(android.R.id.content);
        Object obj = null;
        if (viewFindViewById instanceof ViewGroup) {
            int i4 = newSession + 91;
            prefetchWithMultipleUrls = i4 % 128;
            viewGroup = (ViewGroup) viewFindViewById;
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            return viewGroup.getChildAt(0);
        }
        int i6 = prefetchWithMultipleUrls + 67;
        newSession = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final AppWithState.onWarmupCompleted ITrustedWebActivityCallback() {
        int i = 2 % 2;
        AppWithState.onWarmupCompleted onwarmupcompleted = new AppWithState.onWarmupCompleted((String) null, (String) null, 0, 7, (DefaultConstructorMarker) null);
        int i2 = prefetchWithMultipleUrls + 53;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    public final void onWarmupCompleted(@Nullable View view) {
        int i = 2 % 2;
        this.extraCommand = view;
        AppWithState appWithState = this.IAuthTabCallbackStubProxy;
        if (appWithState != null) {
            int i2 = prefetchWithMultipleUrls + 9;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            appWithState.IAuthTabCallback(view);
            if (i3 != 0) {
                throw null;
            }
            int i4 = prefetchWithMultipleUrls + 85;
            newSession = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        onWarmupCompleted(Object obj) {
            super(0, obj, isStopped.class, "cancel", "cancel()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ((isStopped) ((CallableReference) this).receiver).onNavigationEvent();
            int i4 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AppWithState areNotificationsEnabled() {
        int i = 2 % 2;
        View viewCancelNotification = cancelNotification();
        Object obj = null;
        if (viewCancelNotification == null) {
            int i2 = newSession + 103;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        AppWithState appWithState = this.IAuthTabCallbackStubProxy;
        if (appWithState != null && this.access000 == viewCancelNotification) {
            int i3 = newSession + 95;
            prefetchWithMultipleUrls = i3 % 128;
            int i4 = i3 % 2;
            appWithState.IAuthTabCallback(this.extraCommand);
            return appWithState;
        }
        if (appWithState != null) {
            int i5 = prefetchWithMultipleUrls + 93;
            newSession = i5 % 128;
            if (i5 % 2 != 0) {
                appWithState.IAuthTabCallback();
                throw null;
            }
            appWithState.IAuthTabCallback();
        }
        AppWithState appWithState2 = new AppWithState(this, viewCancelNotification, ITrustedWebActivityCallback());
        appWithState2.IAuthTabCallback(this.extraCommand);
        Object[] objArr = {appWithState2, new onWarmupCompleted(notifyNotificationWithChannel())};
        AppWithState.onExtraCallback(1690897580, -1690897573, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        this.IAuthTabCallbackStubProxy = appWithState2;
        this.access000 = viewCancelNotification;
        return appWithState2;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 59;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, "");
            Object[] objArr2 = {baseActivity.notifyNotificationWithChannel(), findexitinfobysessionidbugsnag_plugin_android_exitinfo_release};
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            isStopped.onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr2, -134909464, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 134909465, iOnExtraCallbackWithResult2);
            return null;
        }
        Intrinsics.checkNotNullParameter(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, "");
        Object[] objArr3 = {baseActivity.notifyNotificationWithChannel(), findexitinfobysessionidbugsnag_plugin_android_exitinfo_release};
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        isStopped.onWarmupCompleted(iOnExtraCallbackWithResult3, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr3, -134909464, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 134909465, iOnExtraCallbackWithResult4);
        int i3 = 58 / 0;
        return null;
    }

    private final void IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 57;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        notifyNotificationWithChannel().onNavigationEvent();
        AppWithState appWithState = this.IAuthTabCallbackStubProxy;
        if (appWithState != null) {
            appWithState.IAuthTabCallback();
        }
        this.IAuthTabCallbackStubProxy = null;
        this.access000 = null;
        int i4 = newSession + 37;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getSmallIconBitmap() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 11;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = setForeground.onExtraCallback.IAuthTabCallback((Activity) this);
        int i4 = newSession + 79;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        int i2 = newSession + 25;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        if (getSmallIconBitmap()) {
            int i4 = prefetchWithMultipleUrls + 105;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            setForeground setforeground = setForeground.onExtraCallback;
            if (i5 != 0) {
                int i6 = 84 / 0;
                if (setforeground.onExtraCallbackWithResult(setforeground.onExtraCallback((Activity) this))) {
                    return true;
                }
            } else if (setforeground.onExtraCallbackWithResult(setforeground.onExtraCallback((Activity) this))) {
                return true;
            }
        }
        return false;
    }

    private final startWork IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 25;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        String str = this.asInterface;
        if (str == null) {
            return null;
        }
        startWork startworkOnExtraCallback = setForeground.onExtraCallback.onExtraCallback(str);
        int i4 = prefetchWithMultipleUrls + 75;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return startworkOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSessionEnded() throws Throwable {
        int i = 2 % 2;
        if (!getSmallIconBitmap()) {
            int i2 = newSession + 105;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            this.asInterface = null;
            return;
        }
        setForeground setforeground = setForeground.onExtraCallback;
        String strOnExtraCallback = setforeground.onExtraCallback((Activity) this);
        startWork startworkOnExtraCallback = strOnExtraCallback != null ? setforeground.onExtraCallback(strOnExtraCallback) : setforeground.onExtraCallbackWithResult();
        String strIntern = "pending_end";
        if (startworkOnExtraCallback != null) {
            int i4 = newSession + 37;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
            if (((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startworkOnExtraCallback}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
                int i6 = prefetchWithMultipleUrls + 93;
                newSession = i6 % 128;
                int i7 = i6 % 2;
                setforeground.onExtraCallback("base_attach_destination_skipped", "pending_end", startworkOnExtraCallback, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", getClass().getSimpleName()), getWrite.IAuthTabCallback("intent_session_id", setforeground.onExtraCallback((Activity) this))}));
                this.asInterface = startworkOnExtraCallback.access100();
                return;
            }
        }
        if (startworkOnExtraCallback != null && startworkOnExtraCallback.ICustomTabsService()) {
            setForeground.onExtraCallback(setforeground, "base_attach_destination", null, startworkOnExtraCallback, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", getClass().getSimpleName()), getWrite.IAuthTabCallback("intent_session_id", setforeground.onExtraCallback((Activity) this))}), 2, null);
            this.asInterface = startworkOnExtraCallback.access100();
            new DestinationScaleTransition(this, startworkOnExtraCallback.access100());
            return;
        }
        if (startworkOnExtraCallback == null) {
            strIntern = "entry_missing";
        } else if (startworkOnExtraCallback.ICustomTabsService()) {
            if (!((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startworkOnExtraCallback}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
                Object[] objArr = new Object[1];
                b(new int[]{-341375960, -642710572, 301160019, 1288373281}, 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
            }
        } else {
            strIntern = "invalid_entry";
        }
        setforeground.onExtraCallback("base_attach_destination_skipped", strIntern, startworkOnExtraCallback, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", getClass().getSimpleName()), getWrite.IAuthTabCallback("intent_session_id", setforeground.onExtraCallback((Activity) this))}));
        this.asInterface = null;
        if (startworkOnExtraCallback != null) {
            setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startworkOnExtraCallback, false, false, 4, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            int i8 = newSession + 69;
            prefetchWithMultipleUrls = i8 % 128;
            int i9 = i8 % 2;
        } else {
            setforeground.onExtraCallback();
        }
        Unit unit = Unit.INSTANCE;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        ViewGroup viewGroup;
        KeyEvent.Callback childAt;
        int i = 2 % 2;
        if (onMessageChannelReady()) {
            int i2 = prefetchWithMultipleUrls + 43;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            View view = getView();
            ViewGroup viewGroup2 = null;
            if (view instanceof ViewGroup) {
                int i4 = newSession + 1;
                int i5 = i4 % 128;
                prefetchWithMultipleUrls = i5;
                int i6 = i4 % 2;
                viewGroup = (ViewGroup) view;
                int i7 = i5 + 1;
                newSession = i7 % 128;
                int i8 = i7 % 2;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                childAt = viewGroup.getChildAt(0);
            } else {
                int i9 = newSession + 7;
                prefetchWithMultipleUrls = i9 % 128;
                int i10 = i9 % 2;
                childAt = null;
            }
            if (childAt instanceof ViewGroup) {
                int i11 = newSession + 55;
                prefetchWithMultipleUrls = i11 % 128;
                int i12 = i11 % 2;
                viewGroup2 = (ViewGroup) childAt;
            }
            if (viewGroup2 != null) {
                int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                generateInviteUrl.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -178321738, new Object[]{viewGroup2}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 178321741);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ICustomTabsCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        Intent intent = new Intent((Context) this, (Class<?>) IAuthTabCallbackStubProxy().IAuthTabCallbackDefault().extraCommand());
        intent.setFlags(268468224);
        if (isTestModeEnabled.IAuthTabCallback(getIntent())) {
            int i2 = prefetchWithMultipleUrls + 111;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            isTestModeEnabled.onExtraCallbackWithResult(intent, true);
            int i4 = newSession + 37;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
        }
        startActivity(intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    @Override // im.toss.base.Hilt_BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        int i = 2 % 2;
        int i2 = newSession + 123;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        try {
            super.onResume();
            onStopped.onExtraCallbackWithResult(this);
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 925878756, new Object[]{this}, -925878749, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            newSession();
            if (RemoteActionCompatParcelizer()) {
                int i4 = prefetchWithMultipleUrls + 81;
                newSession = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 96 / 0;
                    if (!SessionState.Companion.onExtraCallback().onTransact()) {
                        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = NetConverter3.onExtraCallback().onNavigationEvent(new BaseActivity$.ExternalSyntheticLambda11(this), 100L, TimeUnit.MILLISECONDS);
                        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
                        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
                    }
                } else if (!SessionState.Companion.onExtraCallback().onTransact()) {
                }
            }
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1634968175, new Object[]{this}, -1634968165, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            int i6 = prefetchWithMultipleUrls + 37;
            newSession = i6 % 128;
            int i7 = i6 % 2;
        } catch (RuntimeException e) {
            int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            long jLongValue = ((Number) ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult3, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).access000().onWarmupCompleted("crash_on_resume_time", 0L)).longValue();
            int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            if (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult4, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallback().IAuthTabCallbackDefault() - jLongValue <= 10000) {
                throw e;
            }
            int iOnExtraCallbackWithResult5 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            JFunction2 jFunction2Access000 = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult5, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).access000();
            int iOnExtraCallbackWithResult6 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            JFunction2.onNavigationEvent(jFunction2Access000, "crash_on_resume_time", Long.valueOf(((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult6, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallback().IAuthTabCallbackDefault()), false, 4, null);
            auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, new AppLovinBroadcastManagerb(e), null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            int iOnExtraCallbackWithResult7 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object[] objArr = {(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult7, onAdViewAdDisplayFailed.onExtraCallbackWithResult())};
            ((zzdj) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1148537227, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1148537228, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).onExtraCallback();
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ComponentActivity componentActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (!componentActivity.isFinishing() && !SessionState.Companion.onExtraCallback().onTransact()) {
            int i2 = newSession + 61;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 == 0) {
                componentActivity.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
                obj.hashCode();
                throw null;
            }
            if (!(!componentActivity.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED))) {
                if (!((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{componentActivity}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallbackWithResult().onNavigationEvent()) {
                    int i3 = newSession + 75;
                    prefetchWithMultipleUrls = i3 % 128;
                    int i4 = i3 % 2;
                    if (!((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{componentActivity}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackStub().onWarmupCompleted(((BaseActivity) componentActivity).onMessageChannelReady)) {
                        SidecarCompatExternalSyntheticLambda0.IAuthTabCallback((SidecarCompatExternalSyntheticLambda0) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{componentActivity}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback()), componentActivity, false, ((BaseActivity) componentActivity).onMessageChannelReady, 2, null);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[PHI: r5
      0x003c: PHI (r5v5 android.view.View) = (r5v4 android.view.View), (r5v23 android.view.View) binds: [B:10:0x003a, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Type inference failed for: r15v2, types: [android.app.Activity, im.toss.base.BaseActivity, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        View decorView;
        ViewGroup viewGroup;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        boolean z = false;
        ?? r15 = (BaseActivity) objArr[0];
        int i = 2 % 2;
        setForeground setforeground = setForeground.onExtraCallback;
        startWork startworkOnExtraCallbackWithResult = setforeground.onExtraCallbackWithResult();
        if (startworkOnExtraCallbackWithResult != null) {
            int i2 = newSession + 105;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 == 0) {
                decorView = r15.getWindow().getDecorView();
                int i3 = 49 / 0;
                viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            } else {
                decorView = r15.getWindow().getDecorView();
                if (decorView instanceof ViewGroup) {
                }
            }
            if (viewGroup != null) {
                WeakReference<ViewGroup> weakReferenceIAuthTabCallback = startworkOnExtraCallbackWithResult.IAuthTabCallback();
                boolean z2 = (weakReferenceIAuthTabCallback != null ? weakReferenceIAuthTabCallback.get() : null) == viewGroup;
                runOnUiThreadDelayed runonuithreaddelayedWriteTypedObject = startworkOnExtraCallbackWithResult.writeTypedObject();
                if ((runonuithreaddelayedWriteTypedObject != null && runonuithreaddelayedWriteTypedObject.postMessage()) || ((runonuithreaddelayedOnWarmupCompleted = startworkOnExtraCallbackWithResult.onWarmupCompleted()) != null && runonuithreaddelayedOnWarmupCompleted.postMessage())) {
                    int i4 = prefetchWithMultipleUrls + 15;
                    newSession = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                }
                if (z2) {
                    int i6 = prefetchWithMultipleUrls + 35;
                    newSession = i6 % 128;
                    int i7 = i6 % 2;
                    if (!((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startworkOnExtraCallbackWithResult}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
                        int i8 = newSession + 81;
                        prefetchWithMultipleUrls = i8 % 128;
                        int i9 = i8 % 2;
                        if (!z && !r15.getSmallIconBitmap()) {
                            setforeground.onExtraCallback("base_clear_stale_entry", "same_host_not_animating", startworkOnExtraCallbackWithResult, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", r15.getClass().getSimpleName())));
                            startworkOnExtraCallbackWithResult.ICustomTabsCallback_Parcel();
                            setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startworkOnExtraCallbackWithResult, false, false, 6, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = newSession + 79;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        MediaDescriptionCompat();
        int i4 = newSession + 87;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void newSession() {
        int i = 2 % 2;
        setEnabledAmazonAdUnitIds setenabledamazonadunitids = this.onRelationshipValidationResult;
        if (setenabledamazonadunitids != setEnabledAmazonAdUnitIds.SECURE) {
            if (setenabledamazonadunitids == setEnabledAmazonAdUnitIds.NON_SECURE) {
                RatingCompatStarStyle();
                Class<?> cls = getClass();
                setEnabledAmazonAdUnitIds setenabledamazonadunitids2 = this.onRelationshipValidationResult;
                Objects.toString(cls);
                Objects.toString(setenabledamazonadunitids2);
                getWindow().clearFlags(8192);
                getConsentFlowUserGeography.onWarmupCompleted(this, false);
                onExtraCallback(false);
            }
            int i2 = newSession + 37;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i3 = prefetchWithMultipleUrls + 25;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            setEnabledAmazonAdUnitIds.Companion.onWarmupCompleted();
            throw null;
        }
        if (setEnabledAmazonAdUnitIds.Companion.onWarmupCompleted()) {
            RatingCompatStarStyle();
            Class<?> cls2 = getClass();
            setEnabledAmazonAdUnitIds setenabledamazonadunitids3 = this.onRelationshipValidationResult;
            Objects.toString(cls2);
            Objects.toString(setenabledamazonadunitids3);
            int i4 = newSession + 69;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
        } else {
            RatingCompatStarStyle();
            Class<?> cls3 = getClass();
            setEnabledAmazonAdUnitIds setenabledamazonadunitids4 = this.onRelationshipValidationResult;
            Objects.toString(cls3);
            Objects.toString(setenabledamazonadunitids4);
            getWindow().addFlags(8192);
        }
        getConsentFlowUserGeography.onWarmupCompleted(this, true);
        onExtraCallback(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = newSession + 63;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            boolean zAreEqual = Intrinsics.areEqual(this.extraCallback, Boolean.valueOf(z));
            this.extraCallback = Boolean.valueOf(z);
            if (zAreEqual) {
                return;
            }
            int i3 = prefetchWithMultipleUrls + 53;
            newSession = i3 % 128;
            if (i3 % 2 != 0) {
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackDefault().IconCompatParcelizer();
                throw null;
            }
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            if (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackDefault().IconCompatParcelizer()) {
                new TdsToastV1.onNavigationEvent(this, getForegroundInfosuspendImpl.onNavigationEvent(z)).onNavigationEvent();
                int i4 = prefetchWithMultipleUrls + 13;
                newSession = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        Intrinsics.areEqual(this.extraCallback, Boolean.valueOf(z));
        this.extraCallback = Boolean.valueOf(z);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 android.view.View) = (r1v4 android.view.View), (r1v12 android.view.View) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // im.toss.base.Hilt_BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy() {
        View view;
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 59;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            view = getView();
            int i3 = 34 / 0;
            if (view != null) {
                view.removeCallbacks(this.IAuthTabCallback_Parcel);
                int i4 = newSession + 97;
                prefetchWithMultipleUrls = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            view = getView();
            if (view != null) {
            }
        }
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda32 = this.ICustomTabsCallbackStub;
        if (brickModuleImplExternalSyntheticLambda32 != null && brickModuleImplExternalSyntheticLambda32.isShowing() && (brickModuleImplExternalSyntheticLambda3 = this.ICustomTabsCallbackStub) != null) {
            brickModuleImplExternalSyntheticLambda3.dismiss();
        }
        if (this.onRelationshipValidationResult == setEnabledAmazonAdUnitIds.SECURE) {
            new AFj1rSDKExternalSyntheticLambda3(this).onExtraCallback();
        }
        ITrustedWebActivityCallbackDefault();
        ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).access100().onExtraCallbackWithResult();
        AppLovinBroadcastManagera.onExtraCallbackWithResult.onExtraCallbackWithResult(this);
        IPostMessageServiceStubProxy();
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBackPressed() {
        int i = 2 % 2;
        if (getTags.IAuthTabCallback.onWarmupCompleted((Activity) this)) {
            return;
        }
        if (ITrustedWebActivityServiceDefault()) {
            int i2 = prefetchWithMultipleUrls + 23;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
            return;
        }
        GriverBaseActivity griverBaseActivity = this.ICustomTabsService;
        if (griverBaseActivity == null || !griverBaseActivity.onExtraCallbackWithResult()) {
            GriverBaseActivity griverBaseActivity2 = this.ICustomTabsService;
            if ((griverBaseActivity2 == null || !griverBaseActivity2.onNavigationEvent()) && !this.writeTypedObject) {
                try {
                    this.writeTypedObject = true;
                    if (!ITrustedWebActivityServiceStubProxy()) {
                        int i4 = prefetchWithMultipleUrls + 37;
                        newSession = i4 % 128;
                        if (i4 % 2 != 0) {
                            bg_();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (!bg_()) {
                            read();
                        }
                    }
                    this.writeTypedObject = false;
                    int i5 = prefetchWithMultipleUrls + 123;
                    newSession = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    this.writeTypedObject = false;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean ITrustedWebActivityServiceStubProxy() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 75;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            RemoteActionCompatParcelizer();
            throw null;
        }
        if (!RemoteActionCompatParcelizer()) {
            return false;
        }
        moveTaskToBack(true);
        int i3 = newSession + 89;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void read() throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 125;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        try {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
            int i4 = newSession + 15;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
        } catch (IllegalStateException e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "OnBackPressedError", e.getMessage() + " (isFinishing=" + isFinishing() + ", onActivityResult=" + (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallback().IAuthTabCallbackDefault() - this.IAuthTabCallbackDefault) + ")", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            if (!isFinishing()) {
                finish();
                int i6 = newSession + 55;
                prefetchWithMultipleUrls = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "android_common_back", (String) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("screen_schema_id", Long.valueOf(getScreenId())), getWrite.IAuthTabCallback("screen_name", getScreenName())}), (String) null, false, (String) null, 58, (Object) null);
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback_Parcel = 0;
        private static int extraCallbackWithResult = 1;
        private final dagger.Lazy<drawTextProgressColor> IAuthTabCallback;
        private final dagger.Lazy<ProductDetailsPricingPhase> IAuthTabCallbackDefault;
        private final dagger.Lazy<SidecarAdapterExternalSyntheticLambda3> IAuthTabCallbackStub;
        private final dagger.Lazy<JFunction2> IAuthTabCallbackStubProxy;
        private final dagger.Lazy<ReflectionUtilsExternalSyntheticLambda0> access000;
        private final dagger.Lazy<SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0> access100;
        private final dagger.Lazy<zzad> asBinder;
        private final dagger.Lazy<zzdj> asInterface;
        private final dagger.Lazy<setDurationInForeground> getInterfaceDescriptor;
        private final dagger.Lazy<SidecarAdapterExternalSyntheticLambda2> onExtraCallback;
        private final dagger.Lazy<SidecarCompatTranslatingCallback> onExtraCallbackWithResult;
        private final dagger.Lazy<zzag> onNavigationEvent;
        private final dagger.Lazy<SidecarCompatExternalSyntheticLambda0> onTransact;
        private final dagger.Lazy<onDeviceStateChanged> onWarmupCompleted;

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = ~i3;
            int i9 = (~(i7 | i8)) | (~(i7 | i5)) | (~(i8 | i5));
            int i10 = ~i5;
            int i11 = (~(i10 | i2)) | (~(i8 | i2));
            int i12 = ~(i8 | i7 | i10);
            int i13 = i5 + i2 + i4 + ((-2109949842) * i6) + (2078889904 * i);
            int i14 = i13 * i13;
            int i15 = ((-1963971821) * i5) + 932184064 + (61854959 * i2) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i4) + (610271232 * i6) + (922746880 * i) + (671350784 * i14);
            int i16 = (i5 * (-573803825)) + 196542130 + (i2 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i4 * (-573803307)) + (i6 * (-843101306)) + (i * (-1524517520)) + (i14 * 458489856);
            return i15 + ((i16 * i16) * 64749568) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
        }

        @Inject
        public IAuthTabCallback(@NotNull dagger.Lazy<JFunction2> lazy, @NotNull dagger.Lazy<SidecarAdapterExternalSyntheticLambda3> lazy2, @NotNull dagger.Lazy<SidecarCompatExternalSyntheticLambda0> lazy3, @NotNull dagger.Lazy<SidecarAdapterExternalSyntheticLambda2> lazy4, @NotNull dagger.Lazy<ReflectionUtilsExternalSyntheticLambda0> lazy5, @NotNull dagger.Lazy<onDeviceStateChanged> lazy6, @NotNull dagger.Lazy<SidecarCompatTranslatingCallback> lazy7, @NotNull dagger.Lazy<SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0> lazy8, @NotNull dagger.Lazy<drawTextProgressColor> lazy9, @NotNull dagger.Lazy<setDurationInForeground> lazy10, @NotNull dagger.Lazy<ProductDetailsPricingPhase> lazy11, @NotNull dagger.Lazy<zzag> lazy12, @NotNull dagger.Lazy<zzad> lazy13, @NotNull dagger.Lazy<zzdj> lazy14) {
            Intrinsics.checkNotNullParameter(lazy, "");
            Intrinsics.checkNotNullParameter(lazy2, "");
            Intrinsics.checkNotNullParameter(lazy3, "");
            Intrinsics.checkNotNullParameter(lazy4, "");
            Intrinsics.checkNotNullParameter(lazy5, "");
            Intrinsics.checkNotNullParameter(lazy6, "");
            Intrinsics.checkNotNullParameter(lazy7, "");
            Intrinsics.checkNotNullParameter(lazy8, "");
            Intrinsics.checkNotNullParameter(lazy9, "");
            Intrinsics.checkNotNullParameter(lazy10, "");
            Intrinsics.checkNotNullParameter(lazy11, "");
            Intrinsics.checkNotNullParameter(lazy12, "");
            Intrinsics.checkNotNullParameter(lazy13, "");
            Intrinsics.checkNotNullParameter(lazy14, "");
            this.IAuthTabCallbackStubProxy = lazy;
            this.IAuthTabCallbackStub = lazy2;
            this.onTransact = lazy3;
            this.onExtraCallback = lazy4;
            this.access000 = lazy5;
            this.onWarmupCompleted = lazy6;
            this.onExtraCallbackWithResult = lazy7;
            this.access100 = lazy8;
            this.IAuthTabCallback = lazy9;
            this.getInterfaceDescriptor = lazy10;
            this.IAuthTabCallbackDefault = lazy11;
            this.onNavigationEvent = lazy12;
            this.asBinder = lazy13;
            this.asInterface = lazy14;
        }

        public final JFunction2 access000() {
            JFunction2 jFunction2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 95;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                JFunction2 jFunction22 = this.IAuthTabCallbackStubProxy.get();
                Intrinsics.checkNotNullExpressionValue(jFunction22, "");
                jFunction2 = jFunction22;
                int i3 = 74 / 0;
            } else {
                JFunction2 jFunction23 = this.IAuthTabCallbackStubProxy.get();
                Intrinsics.checkNotNullExpressionValue(jFunction23, "");
                jFunction2 = jFunction23;
            }
            int i4 = extraCallbackWithResult + 93;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                return jFunction2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final SidecarAdapterExternalSyntheticLambda3 IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 61;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            SidecarAdapterExternalSyntheticLambda3 sidecarAdapterExternalSyntheticLambda3 = this.IAuthTabCallbackStub.get();
            Intrinsics.checkNotNullExpressionValue(sidecarAdapterExternalSyntheticLambda3, "");
            SidecarAdapterExternalSyntheticLambda3 sidecarAdapterExternalSyntheticLambda32 = sidecarAdapterExternalSyntheticLambda3;
            int i4 = extraCallbackWithResult + 81;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                return sidecarAdapterExternalSyntheticLambda32;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 105;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            SidecarCompatExternalSyntheticLambda0 sidecarCompatExternalSyntheticLambda0 = iAuthTabCallback.onTransact.get();
            if (i3 == 0) {
                Intrinsics.checkNotNullExpressionValue(sidecarCompatExternalSyntheticLambda0, "");
                return sidecarCompatExternalSyntheticLambda0;
            }
            Intrinsics.checkNotNullExpressionValue(sidecarCompatExternalSyntheticLambda0, "");
            throw null;
        }

        public final SidecarAdapterExternalSyntheticLambda2 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 39;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            SidecarAdapterExternalSyntheticLambda2 sidecarAdapterExternalSyntheticLambda2 = this.onExtraCallback.get();
            Intrinsics.checkNotNullExpressionValue(sidecarAdapterExternalSyntheticLambda2, "");
            SidecarAdapterExternalSyntheticLambda2 sidecarAdapterExternalSyntheticLambda22 = sidecarAdapterExternalSyntheticLambda2;
            int i4 = extraCallbackWithResult + 43;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return sidecarAdapterExternalSyntheticLambda22;
        }

        public final ReflectionUtilsExternalSyntheticLambda0 IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 107;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ReflectionUtilsExternalSyntheticLambda0 reflectionUtilsExternalSyntheticLambda0 = this.access000.get();
            Intrinsics.checkNotNullExpressionValue(reflectionUtilsExternalSyntheticLambda0, "");
            ReflectionUtilsExternalSyntheticLambda0 reflectionUtilsExternalSyntheticLambda02 = reflectionUtilsExternalSyntheticLambda0;
            int i4 = IAuthTabCallback_Parcel + 55;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return reflectionUtilsExternalSyntheticLambda02;
        }

        public final onDeviceStateChanged onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 113;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onDeviceStateChanged ondevicestatechanged = this.onWarmupCompleted.get();
            Intrinsics.checkNotNullExpressionValue(ondevicestatechanged, "");
            onDeviceStateChanged ondevicestatechanged2 = ondevicestatechanged;
            int i4 = IAuthTabCallback_Parcel + 111;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return ondevicestatechanged2;
        }

        public final SidecarCompatTranslatingCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 61;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback = this.onExtraCallbackWithResult.get();
            Intrinsics.checkNotNullExpressionValue(sidecarCompatTranslatingCallback, "");
            SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback2 = sidecarCompatTranslatingCallback;
            int i4 = IAuthTabCallback_Parcel + 59;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return sidecarCompatTranslatingCallback2;
        }

        public final SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0 access100() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 89;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(this.access100.get(), "");
                throw null;
            }
            SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0 sidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0 = this.access100.get();
            Intrinsics.checkNotNullExpressionValue(sidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0, "");
            return sidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0;
        }

        public final drawTextProgressColor onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 107;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                drawTextProgressColor drawtextprogresscolor = this.IAuthTabCallback.get();
                Intrinsics.checkNotNullExpressionValue(drawtextprogresscolor, "");
                return drawtextprogresscolor;
            }
            Intrinsics.checkNotNullExpressionValue(this.IAuthTabCallback.get(), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final setDurationInForeground IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 123;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(this.getInterfaceDescriptor.get(), "");
                throw null;
            }
            setDurationInForeground setdurationinforeground = this.getInterfaceDescriptor.get();
            Intrinsics.checkNotNullExpressionValue(setdurationinforeground, "");
            return setdurationinforeground;
        }

        public final ProductDetailsPricingPhase asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 17;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ProductDetailsPricingPhase productDetailsPricingPhase = this.IAuthTabCallbackDefault.get();
            Intrinsics.checkNotNullExpressionValue(productDetailsPricingPhase, "");
            ProductDetailsPricingPhase productDetailsPricingPhase2 = productDetailsPricingPhase;
            int i4 = extraCallbackWithResult + 119;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                return productDetailsPricingPhase2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final zzag IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 37;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            zzag zzagVar = this.onNavigationEvent.get();
            Intrinsics.checkNotNullExpressionValue(zzagVar, "");
            zzag zzagVar2 = zzagVar;
            int i4 = extraCallbackWithResult + 41;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                return zzagVar2;
            }
            throw null;
        }

        public final zzad IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 27;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            zzad zzadVar = this.asBinder.get();
            Intrinsics.checkNotNullExpressionValue(zzadVar, "");
            zzad zzadVar2 = zzadVar;
            int i4 = extraCallbackWithResult + 93;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return zzadVar2;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            int i = 2 % 2;
            int i2 = extraCallbackWithResult + 55;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            zzdj zzdjVar = iAuthTabCallback.asInterface.get();
            Intrinsics.checkNotNullExpressionValue(zzdjVar, "");
            zzdj zzdjVar2 = zzdjVar;
            int i4 = extraCallbackWithResult + 61;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                return zzdjVar2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final SidecarCompatExternalSyntheticLambda0 onTransact() {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (SidecarCompatExternalSyntheticLambda0) onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, 1245490858, iIAuthTabCallback3);
        }

        public final zzdj asBinder() {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            return (zzdj) onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1148537227, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, 1148537228, iIAuthTabCallback3);
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = prefetchWithMultipleUrls + 25;
        newSession = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            this.IAuthTabCallbackDefault = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallback().IAuthTabCallbackDefault();
            int i5 = prefetchWithMultipleUrls + 87;
            newSession = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        super.onActivityResult(i, i2, intent);
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        this.IAuthTabCallbackDefault = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallback().IAuthTabCallbackDefault();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(@NotNull Intent intent) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        getClass().getSimpleName();
        Objects.toString(intent);
        Object[] objArr = {AFj1nSDK5.onNavigationEvent, intent};
        AFj1nSDK5.onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), 507432461, handleRemoveKey.onExtraCallbackWithResult(), -507432457, handleRemoveKey.onExtraCallbackWithResult(), objArr, handleRemoveKey.onExtraCallbackWithResult());
        super.onNewIntent(intent);
        setIntent(intent);
        this.asInterface = null;
        ITrustedWebActivityService_Parcel();
        if (onExtraCallback.onExtraCallbackWithResult[onExtraCallback(ITrustedWebActivityCallbackStubProxy()).ordinal()] != 3) {
            int i2 = prefetchWithMultipleUrls + 25;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            getActiveNotifications();
            int i4 = newSession + 81;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 5;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 71;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        if (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallbackWithResult().IAuthTabCallback((RememberLottieCompositionKtlottieComposition1) this)) {
            int i4 = newSession + 33;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        startWork startworkIPostMessageServiceDefault = IPostMessageServiceDefault();
        if (startworkIPostMessageServiceDefault != null && !(!startworkIPostMessageServiceDefault.ICustomTabsService())) {
            int i5 = prefetchWithMultipleUrls + 19;
            newSession = i5 % 128;
            int i6 = i5 % 2;
            if (!((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startworkIPostMessageServiceDefault}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 796467999)).booleanValue()) {
                setForeground.onExtraCallback(setForeground.onExtraCallback, "base_finish_with_transition", null, startworkIPostMessageServiceDefault, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", getClass().getSimpleName()), getWrite.IAuthTabCallback("attached_session_id", this.asInterface)}), 2, null);
                onStopped.onWarmupCompleted((Activity) this, this.asInterface);
                return;
            }
        }
        super/*android.app.Activity*/.finish();
        isEngagementSignalsApiAvailable();
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = newSession + 71;
        int i3 = i2 % 128;
        prefetchWithMultipleUrls = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishWithCertError");
        }
        if ((iIntValue & 2) != 0) {
            int i5 = i3 + 69;
            newSession = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 39;
            newSession = i7 % 128;
            int i8 = i7 % 2;
            bundle = null;
        }
        baseActivity.onExtraCallback(th, bundle);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallback(@NotNull Throwable th, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = newSession + 105;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onNavigationEvent(this, th, bundle);
            return;
        }
        Intrinsics.checkNotNullParameter(th, "");
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onNavigationEvent(this, th, bundle);
        int i3 = 36 / 0;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean zIAuthTabCallback;
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 117;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object[] objArr2 = {(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())};
            zIAuthTabCallback = ((SidecarCompatExternalSyntheticLambda0) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallback();
            int i3 = 10 / 0;
        } else {
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object[] objArr3 = {(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())};
            zIAuthTabCallback = ((SidecarCompatExternalSyntheticLambda0) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr3, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallback();
        }
        return Boolean.valueOf(zIAuthTabCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = newSession + 99;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(menuItem, "");
            menuItem.getItemId();
            throw null;
        }
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() != 16908332) {
            return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        int i3 = newSession + 57;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private final void ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 85;
        newSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.onMessageChannelReady != null) {
            RatingCompatStarStyle();
            getClass().getSimpleName();
            Dialog dialog = this.onMessageChannelReady;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.onMessageChannelReady = null;
        }
        setSdkKey setsdkkey = this.onPostMessage;
        if (setsdkkey != null) {
            setsdkkey.onWarmupCompleted(new BaseActivity$.ExternalSyntheticLambda12(this));
        }
        int i3 = prefetchWithMultipleUrls + 87;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 93 / 0;
        }
    }

    private static final Unit IAuthTabCallbackStubProxy(BaseActivity baseActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = newSession + 39;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            baseActivity.asBinder.onWarmupCompleted(Boolean.FALSE);
            unit = Unit.INSTANCE;
            int i3 = 2 / 0;
        } else {
            baseActivity.asBinder.onWarmupCompleted(Boolean.FALSE);
            unit = Unit.INSTANCE;
        }
        int i4 = prefetchWithMultipleUrls + 73;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        setSdkKey setsdkkey;
        final BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 97;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            setsdkkey = baseActivity.onPostMessage;
            int i3 = 21 / 0;
            if (setsdkkey == null) {
                return null;
            }
        } else {
            setsdkkey = baseActivity.onPostMessage;
            if (setsdkkey == null) {
                return null;
            }
        }
        setsdkkey.onWarmupCompleted(new Function0() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda21
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnExtraCallbackWithResult = BaseActivity.onExtraCallbackWithResult(this.f$0);
                if (i6 != 0) {
                    int i7 = 20 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        int i4 = prefetchWithMultipleUrls + 105;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        int i5 = 4 / 4;
        return null;
    }

    private static final Unit extraCallback(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = newSession + 23;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.asBinder.onWarmupCompleted(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 83;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IconCompatParcelizer() {
        int i = 2 % 2;
        if (isFinishing()) {
            return;
        }
        int i2 = newSession + 19;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        setSdkKey setsdkkey = this.onPostMessage;
        if (setsdkkey != null) {
            setSdkKey.onWarmupCompleted(setsdkkey, false, 1, (Object) null);
        }
        Dialog dialog = this.onMessageChannelReady;
        if (dialog != null) {
            int i4 = newSession;
            int i5 = i4 + 47;
            prefetchWithMultipleUrls = i5 % 128;
            int i6 = i5 % 2;
            if (dialog != null) {
                int i7 = i4 + 25;
                prefetchWithMultipleUrls = i7 % 128;
                if (i7 % 2 != 0 ? dialog.isShowing() : dialog.isShowing()) {
                    int i8 = newSession + 49;
                    prefetchWithMultipleUrls = i8 % 128;
                    int i9 = i8 % 2;
                    return;
                }
            }
        }
        RatingCompatStarStyle();
        getClass().getSimpleName();
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Dialog dialogOnNavigationEvent = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackStub().onNavigationEvent(this);
        this.onMessageChannelReady = dialogOnNavigationEvent;
        if (dialogOnNavigationEvent != null) {
            dialogOnNavigationEvent.setOnDismissListener(new BaseActivity$.ExternalSyntheticLambda38(this));
        }
        Dialog dialog2 = this.onMessageChannelReady;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    private final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = newSession + 125;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Dialog dialog = this.onMessageChannelReady;
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        int i3 = prefetchWithMultipleUrls + 19;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private static final boolean onExtraCallbackWithResult(Boolean bool) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 91;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bool, "");
            zBooleanValue = bool.booleanValue();
            int i3 = 43 / 0;
        } else {
            Intrinsics.checkNotNullParameter(bool, "");
            zBooleanValue = bool.booleanValue();
        }
        int i4 = newSession + 113;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 77;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = prefetchWithMultipleUrls + 85;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final Unit onExtraCallbackWithResult(BaseActivity baseActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = newSession + 55;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.ITrustedWebActivityCallbackDefault();
        baseActivity.ICustomTabsService();
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 5;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AudioAttributesCompatParcelizer() {
        setSdkKey setsdkkey;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 55;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            this.asBinder.onWarmupCompleted(Boolean.valueOf(extraCallbackWithResult()));
            extraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.asBinder.onWarmupCompleted(Boolean.valueOf(extraCallbackWithResult()));
        if (!extraCallbackWithResult()) {
            ITrustedWebActivityCallbackDefault();
            return;
        }
        IconCompatParcelizer();
        deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackStub;
        if (deserializeurinullablecollection == null) {
            this.IAuthTabCallbackStub = SessionState.Companion.onExtraCallback().IAuthTabCallback().onWarmupCompleted(new BaseActivity$.ExternalSyntheticLambda23(new BaseActivity$.ExternalSyntheticLambda22())).IAuthTabCallback(new BaseActivity$.ExternalSyntheticLambda25(new BaseActivity$.ExternalSyntheticLambda24(this)));
        } else if (deserializeurinullablecollection != null) {
            int i3 = newSession + 83;
            prefetchWithMultipleUrls = i3 % 128;
            int i4 = i3 % 2;
            if (deserializeurinullablecollection.isDisposed()) {
            }
        }
        if (!onRelationshipValidationResult() || (!ICustomTabsCallbackDefault())) {
            return;
        }
        int i5 = prefetchWithMultipleUrls + 97;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        if (!receiveFile() || (setsdkkey = this.onPostMessage) == null) {
            return;
        }
        setsdkkey.onExtraCallback(findViewById(android.R.id.content));
        int i7 = newSession + 71;
        prefetchWithMultipleUrls = i7 % 128;
        int i8 = i7 % 2;
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = newSession + 49;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).access100().IAuthTabCallback();
            GriverBaseActivity griverBaseActivity = this.ICustomTabsService;
            if (griverBaseActivity != null) {
                int i3 = prefetchWithMultipleUrls + 67;
                newSession = i3 % 128;
                int i4 = i3 % 2;
                griverBaseActivity.onWarmupCompleted();
                int i5 = newSession + 97;
                prefetchWithMultipleUrls = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 5;
                }
            }
            super.onStop();
            deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackStub;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            this.IAuthTabCallbackStub = null;
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackStub().onExtraCallbackWithResult(this.onMessageChannelReady);
            return;
        }
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult3, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).access100().IAuthTabCallback();
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = newSession + 29;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        AudioAttributesCompatParcelizer();
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).access100().onWarmupCompleted();
        ITrustedWebActivityService_Parcel();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackStub().IAuthTabCallback(this.onMessageChannelReady, 10000L);
        int i4 = newSession + 5;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        ViewGroup viewGroup;
        getHostnameVerifierokhttp gethostnameverifierokhttp = (BaseActivity) objArr[0];
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 21;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            View viewOnExtraCallbackWithResult = ((getAppEnteredForegroundTimeMillis.IAuthTabCallback) CollectionsKt.last(getAppEnteredForegroundTimeMillis.onWarmupCompleted.onExtraCallbackWithResult(gethostnameverifierokhttp))).onExtraCallbackWithResult();
            if (viewOnExtraCallbackWithResult instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewOnExtraCallbackWithResult;
            } else {
                int i3 = newSession + 57;
                prefetchWithMultipleUrls = i3 % 128;
                int i4 = i3 % 2;
                viewGroup = null;
            }
            objectRef.element = viewGroup;
            return null;
        }
        boolean z = ((getAppEnteredForegroundTimeMillis.IAuthTabCallback) CollectionsKt.last(getAppEnteredForegroundTimeMillis.onWarmupCompleted.onExtraCallbackWithResult(gethostnameverifierokhttp))).onExtraCallbackWithResult() instanceof ViewGroup;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(Ref.ObjectRef objectRef, BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 37;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ViewGroup viewGroup = (ViewGroup) objectRef.element;
        if (viewGroup != null) {
            if (getAppEnteredForegroundTimeMillis.onWarmupCompleted.onExtraCallback()) {
                try {
                    O_.onNavigationEvent onnavigationevent = new O_.onNavigationEvent();
                    O_ o_ = O_.IAuthTabCallback;
                    View childAt = viewGroup.getChildAt(0);
                    Intrinsics.checkNotNullExpressionValue(childAt, "");
                    o_.onExtraCallback(childAt, onnavigationevent);
                    TdsAdoptionWindow tdsAdoptionWindow = baseActivity.onUnminimized;
                    if (tdsAdoptionWindow != null) {
                        int i3 = newSession + 75;
                        prefetchWithMultipleUrls = i3 % 128;
                        if (i3 % 2 == 0) {
                            tdsAdoptionWindow.onExtraCallbackWithResult(onnavigationevent);
                            throw null;
                        }
                        tdsAdoptionWindow.onExtraCallbackWithResult(onnavigationevent);
                    }
                } catch (Throwable unused) {
                }
            }
            if (getAppEnteredForegroundTimeMillis.onWarmupCompleted.onExtraCallbackWithResult()) {
                try {
                    r8lambdaLwnqQT6KESvpJzaipNghlKf5eMg.onWarmupCompleted onwarmupcompleted = new r8lambdaLwnqQT6KESvpJzaipNghlKf5eMg.onWarmupCompleted();
                    r8lambdaLwnqQT6KESvpJzaipNghlKf5eMg r8lambdalwnqqt6kesvpjzaipnghlkf5emg = r8lambdaLwnqQT6KESvpJzaipNghlKf5eMg.onWarmupCompleted;
                    View childAt2 = viewGroup.getChildAt(0);
                    Intrinsics.checkNotNullExpressionValue(childAt2, "");
                    r8lambdalwnqqt6kesvpjzaipnghlkf5emg.onExtraCallbackWithResult(childAt2, onwarmupcompleted);
                    WeedScannerWindow weedScannerWindow = baseActivity.newAuthTabSession;
                    if (weedScannerWindow != null) {
                        int i4 = prefetchWithMultipleUrls + 61;
                        newSession = i4 % 128;
                        int i5 = i4 % 2;
                        weedScannerWindow.IAuthTabCallback(onwarmupcompleted);
                        int i6 = prefetchWithMultipleUrls + 69;
                        newSession = i6 % 128;
                        int i7 = i6 % 2;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ViewGroup viewGroup;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        final AppCompatActivity appCompatActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 61;
        prefetchWithMultipleUrls = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getAppEnteredForegroundTimeMillis getappenteredforegroundtimemillis = getAppEnteredForegroundTimeMillis.onWarmupCompleted;
            if (getappenteredforegroundtimemillis.IAuthTabCallback()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                if (getappenteredforegroundtimemillis.onExtraCallback()) {
                    TdsAdoptionWindow tdsAdoptionWindow = new TdsAdoptionWindow(appCompatActivity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    ((BaseActivity) appCompatActivity).onUnminimized = tdsAdoptionWindow;
                    appCompatActivity.addContentView(tdsAdoptionWindow, new ViewGroup.LayoutParams(-1, -1));
                }
                if (getappenteredforegroundtimemillis.onExtraCallbackWithResult()) {
                    WeedScannerWindow weedScannerWindow = new WeedScannerWindow(appCompatActivity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    ((BaseActivity) appCompatActivity).newAuthTabSession = weedScannerWindow;
                    appCompatActivity.addContentView(weedScannerWindow, new ViewGroup.LayoutParams(-1, -1));
                }
                View viewFindViewById = appCompatActivity.findViewById(android.R.id.content);
                if (!(viewFindViewById instanceof ViewGroup)) {
                    viewGroup = null;
                } else {
                    int i3 = newSession + 63;
                    prefetchWithMultipleUrls = i3 % 128;
                    int i4 = i3 % 2;
                    viewGroup = (ViewGroup) viewFindViewById;
                }
                View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
                ((BaseActivity) appCompatActivity).isEngagementSignalsApiAvailable = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 83;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        BaseActivity baseActivity = this.f$0;
                        if (i7 != 0) {
                            BaseActivity.onNavigationEvent(baseActivity, objectRef);
                            return;
                        }
                        BaseActivity.onNavigationEvent(baseActivity, objectRef);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                if (childAt != null && (viewTreeObserver2 = childAt.getViewTreeObserver()) != null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(((BaseActivity) appCompatActivity).isEngagementSignalsApiAvailable);
                }
                ((BaseActivity) appCompatActivity).ICustomTabsCallbackStubProxy = new ViewTreeObserver.OnDrawListener() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // android.view.ViewTreeObserver.OnDrawListener
                    public final void onDraw() {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 119;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        BaseActivity.onExtraCallbackWithResult(objectRef, appCompatActivity);
                        int i8 = IAuthTabCallback + 75;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw null;
                        }
                    }
                };
                if (childAt != null && (viewTreeObserver = childAt.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnDrawListener(((BaseActivity) appCompatActivity).ICustomTabsCallbackStubProxy);
                }
            }
            return null;
        }
        getAppEnteredForegroundTimeMillis.onWarmupCompleted.IAuthTabCallback();
        obj.hashCode();
        throw null;
    }

    private final void MediaDescriptionCompat() {
        View childAt;
        ViewParent parent;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        int i = 2 % 2;
        getAppEnteredForegroundTimeMillis getappenteredforegroundtimemillis = getAppEnteredForegroundTimeMillis.onWarmupCompleted;
        if (getappenteredforegroundtimemillis.IAuthTabCallback()) {
            int i2 = newSession + 7;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            View viewFindViewById = findViewById(android.R.id.content);
            ViewGroup viewGroup = (viewFindViewById instanceof ViewGroup) ^ true ? null : (ViewGroup) viewFindViewById;
            if (viewGroup != null) {
                childAt = viewGroup.getChildAt(0);
            } else {
                int i4 = prefetchWithMultipleUrls + 35;
                newSession = i4 % 128;
                int i5 = i4 % 2;
                childAt = null;
            }
            if (childAt != null && (viewTreeObserver2 = childAt.getViewTreeObserver()) != null) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.isEngagementSignalsApiAvailable);
            }
            if (childAt != null && (viewTreeObserver = childAt.getViewTreeObserver()) != null) {
                int i6 = prefetchWithMultipleUrls + 111;
                newSession = i6 % 128;
                int i7 = i6 % 2;
                viewTreeObserver.removeOnDrawListener(this.ICustomTabsCallbackStubProxy);
            }
            WeedScannerWindow weedScannerWindow = this.onUnminimized;
            if (weedScannerWindow == null) {
                int i8 = prefetchWithMultipleUrls + 89;
                newSession = i8 % 128;
                int i9 = i8 % 2;
                weedScannerWindow = this.newAuthTabSession;
            }
            if (weedScannerWindow != null) {
                int i10 = prefetchWithMultipleUrls + 109;
                newSession = i10 % 128;
                if (i10 % 2 != 0) {
                    parent = weedScannerWindow.getParent();
                    int i11 = 40 / 0;
                } else {
                    parent = weedScannerWindow.getParent();
                }
            } else {
                parent = null;
            }
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (getappenteredforegroundtimemillis.onExtraCallback()) {
                TdsAdoptionWindow tdsAdoptionWindow = this.onUnminimized;
                if (tdsAdoptionWindow != null) {
                    tdsAdoptionWindow.onExtraCallbackWithResult();
                }
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.onUnminimized);
                }
                this.onUnminimized = null;
            }
            if (getappenteredforegroundtimemillis.onExtraCallbackWithResult()) {
                WeedScannerWindow weedScannerWindow2 = this.newAuthTabSession;
                if (weedScannerWindow2 != null) {
                    weedScannerWindow2.onWarmupCompleted();
                }
                if (viewGroup2 != null) {
                    int i12 = prefetchWithMultipleUrls + 65;
                    newSession = i12 % 128;
                    int i13 = i12 % 2;
                    viewGroup2.removeView(this.newAuthTabSession);
                    int i14 = prefetchWithMultipleUrls + 21;
                    newSession = i14 % 128;
                    int i15 = i14 % 2;
                }
                this.newAuthTabSession = null;
            }
        }
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = newSession + 63;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putString("prevScreenName", this.onMinimized);
            super.onSaveInstanceState(bundle);
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putString("prevScreenName", this.onMinimized);
            super.onSaveInstanceState(bundle);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Integer numValueOf;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        getLastTrimMemoryLevel.Companion.onNavigationEvent().IAuthTabCallback(i, strArr, iArr);
        if (!setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback()) {
            return;
        }
        int i3 = newSession + 27;
        prefetchWithMultipleUrls = i3 % 128;
        if (i3 % 2 == 0) {
            numValueOf = Integer.valueOf(ArraysKt.indexOf(strArr, "android.permission.READ_CONTACTS"));
            int i4 = 23 / 0;
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
        } else {
            numValueOf = Integer.valueOf(ArraysKt.indexOf(strArr, "android.permission.READ_CONTACTS"));
            if (numValueOf.intValue() < 0) {
            }
        }
        if (numValueOf != null) {
            if (iArr[numValueOf.intValue()] == 0) {
                int i5 = prefetchWithMultipleUrls + 63;
                newSession = i5 % 128;
                int i6 = i5 % 2;
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onWarmupCompleted(this);
            }
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onExtraCallback();
        }
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        Fragment fragment = (Fragment) objArr[2];
        String str = (String) objArr[3];
        Boolean bool = (Boolean) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 119;
        int i3 = i2 % 128;
        newSession = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceFragment");
        }
        int i4 = i3 + 125;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0 ? (iIntValue2 & 8) != 0 : (iIntValue2 & 85) != 0) {
            bool = Boolean.FALSE;
        }
        baseActivity.IAuthTabCallback(iIntValue, fragment, str, bool);
        return null;
    }

    public final void IAuthTabCallback(int i, @Nullable Fragment fragment, @Nullable String str, @Nullable Boolean bool) {
        int i2 = 2 % 2;
        if (i >= 0) {
            int i3 = newSession + 5;
            prefetchWithMultipleUrls = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (fragment != null) {
                FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallback = getSupportFragmentManager().onExtraCallbackWithResult().onExtraCallback(i, fragment, str);
                Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallback, "");
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallback.onExtraCallback();
                    int i4 = newSession + 37;
                    prefetchWithMultipleUrls = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallback.onExtraCallbackWithResult();
            }
        }
    }

    public final void onNavigationEvent(@Nullable Fragment fragment, boolean z) {
        int i = 2 % 2;
        if (fragment != null && !fragment.isRemoving()) {
            int i2 = newSession + 117;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnNavigationEvent = getSupportFragmentManager().onExtraCallbackWithResult().onNavigationEvent(fragment);
            Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4OnNavigationEvent, "");
            if (z) {
                int i4 = prefetchWithMultipleUrls + 107;
                newSession = i4 % 128;
                if (i4 % 2 == 0) {
                    flowRowOverflowCompanionExternalSyntheticLambda4OnNavigationEvent.onExtraCallback();
                    return;
                } else {
                    flowRowOverflowCompanionExternalSyntheticLambda4OnNavigationEvent.onExtraCallback();
                    int i5 = 40 / 0;
                    return;
                }
            }
            flowRowOverflowCompanionExternalSyntheticLambda4OnNavigationEvent.onExtraCallbackWithResult();
        }
        int i6 = newSession + 95;
        prefetchWithMultipleUrls = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IAuthTabCallback(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = newSession + 107;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        onNavigationEvent(string, z);
        if (i4 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IAuthTabCallback(BaseActivity baseActivity, String str, boolean z, int i, Object obj) {
        String string;
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgressDialog");
        }
        int i3 = newSession;
        int i4 = i3 + 71;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 111;
            prefetchWithMultipleUrls = i5 % 128;
            if (i5 % 2 == 0) {
                string = baseActivity.getString(R.string.base_please_wait);
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i6 = 5 / 0;
            } else {
                string = baseActivity.getString(R.string.base_please_wait);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            str = string;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        baseActivity.onNavigationEvent(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNavigationEvent(@NotNull String str, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        View view = getView();
        if (view != null) {
            int i2 = newSession + 115;
            prefetchWithMultipleUrls = i2 % 128;
            int i3 = i2 % 2;
            view.removeCallbacks(this.IAuthTabCallback_Parcel);
        }
        if (!isFinishing()) {
            if (this.ICustomTabsCallbackStub == null) {
                this.ICustomTabsCallbackStub = new BrickModuleImplExternalSyntheticLambda3(this);
            }
            BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3 = this.ICustomTabsCallbackStub;
            if (brickModuleImplExternalSyntheticLambda3 != null) {
                brickModuleImplExternalSyntheticLambda3.onExtraCallbackWithResult(str);
                brickModuleImplExternalSyntheticLambda3.setCancelable(z);
            }
            BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda32 = this.ICustomTabsCallbackStub;
            Intrinsics.checkNotNull(brickModuleImplExternalSyntheticLambda32);
            if (!brickModuleImplExternalSyntheticLambda32.isShowing()) {
                BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda33 = this.ICustomTabsCallbackStub;
                Intrinsics.checkNotNull(brickModuleImplExternalSyntheticLambda33);
                brickModuleImplExternalSyntheticLambda33.IAuthTabCallback(DERSet.onExtraCallback.AudioAttributesCompatParcelizer());
            }
        }
        int i4 = newSession + 33;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bo_() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 105;
        newSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            isFinishing();
            throw null;
        }
        if (!isFinishing()) {
            View view = getView();
            if (view != null) {
                int i3 = newSession + 103;
                prefetchWithMultipleUrls = i3 % 128;
                if (i3 % 2 == 0) {
                    view.post(this.IAuthTabCallback_Parcel);
                    obj.hashCode();
                    throw null;
                }
                view.post(this.IAuthTabCallback_Parcel);
                return;
            }
            return;
        }
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3 = this.ICustomTabsCallbackStub;
        if (brickModuleImplExternalSyntheticLambda3 != null) {
            int i4 = newSession + 117;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
            brickModuleImplExternalSyntheticLambda3.dismiss();
            int i6 = newSession + 69;
            prefetchWithMultipleUrls = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bt_() {
        int i = 2 % 2;
        int i2 = newSession + 111;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        if (isFinishing()) {
            return;
        }
        int i4 = prefetchWithMultipleUrls + 111;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        Dialog dialog = this.onActivityLayout;
        if (dialog != null && dialog.isShowing()) {
            int i6 = newSession + 119;
            prefetchWithMultipleUrls = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        Object[] objArr = {(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.Companion.onExtraCallback(this).onNavigationEvent(im.toss.uikit.R.string.custom_dialog_title_network), Integer.valueOf(im.toss.uikit.R.string.custom_dialog_message_network)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Object[] objArr2 = {(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -868633265, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 868633269, objArr, iOnExtraCallback), Integer.valueOf(im.toss.core.R.drawable.img_popup_network)};
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        this.onActivityLayout = TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, objArr2, iOnExtraCallback2)).onNavigationEvent(false)).IAuthTabCallback(new BaseActivity$.ExternalSyntheticLambda33(this)), im.toss.uikit.R.string.uikit_confirm, new BaseActivity$.ExternalSyntheticLambda34(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 107;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        baseActivity.onActivityLayout = null;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 113;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static final void onExtraCallbackWithResult(BaseActivity baseActivity, DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = newSession + 95;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        baseActivity.finish();
        int i5 = newSession + 103;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void newAuthTabSession() {
        int i = 2 % 2;
        int i2 = newSession + 75;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        if (!isFinishing()) {
            zzbd.onWarmupCompleted(this, getString(R.string.base_network_error), 0, 2, (Object) null);
            return;
        }
        int i4 = prefetchWithMultipleUrls + 87;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 1;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            M_.onExtraCallback.onExtraCallback(getCurrentFocus());
            int i3 = 75 / 0;
        } else {
            M_.onExtraCallback.onExtraCallback(getCurrentFocus());
        }
        int i4 = prefetchWithMultipleUrls + 35;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = newSession + 119;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(getPluginName.onExtraCallback.IAuthTabCallback(context));
        int i4 = prefetchWithMultipleUrls + 77;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull View view, @NotNull String str) {
        int i = 2 % 2;
        int i2 = newSession + 21;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 5 / 0;
            if (!StringsKt.isBlank(str)) {
                new TdsToastV1.onNavigationEvent(view, str).onNavigationEvent();
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (!StringsKt.isBlank(str)) {
            }
        }
        int i4 = prefetchWithMultipleUrls + 109;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        Object next;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 91;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        if (motionEvent != null) {
            List listOnActivityLayout = getSupportFragmentManager().onActivityLayout();
            Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
            Iterator it = listOnActivityLayout.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Fragment fragment = (Fragment) next;
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                SidecarCompatTranslatingCallback sidecarCompatTranslatingCallbackOnExtraCallback = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback();
                Intrinsics.checkNotNull(fragment);
                if (sidecarCompatTranslatingCallbackOnExtraCallback.onExtraCallback(fragment)) {
                    int i4 = newSession + 23;
                    prefetchWithMultipleUrls = i4 % 128;
                    int i5 = i4 % 2;
                    int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                    if (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().IAuthTabCallback(fragment)) {
                        break;
                    }
                }
            }
            Fragment fragment2 = (Fragment) next;
            if (fragment2 != null) {
                int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult3, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onWarmupCompleted(fragment2, motionEvent);
            }
            ITrustedWebActivityCallback_Parcel().onExtraCallback(motionEvent);
        }
        boolean zDispatchTouchEvent = super/*android.app.Activity*/.dispatchTouchEvent(motionEvent);
        int i6 = newSession + 71;
        prefetchWithMultipleUrls = i6 % 128;
        int i7 = i6 % 2;
        return zDispatchTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onUnminimized() throws Throwable {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 67;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(zzbq.onNavigationEvent(getIntent(), "source", ""), "external")) {
            return true;
        }
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        b(new int[]{-1799802994, -1037823843, 1381444302, -1265321906, -846437630, 1605159455, 1419664342, 1307756278}, 17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        Object[] objArr2 = {zzbq.onNavigationEvent(intent, "schemeUri", ((String) objArr[0]).intern())};
        Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, objArr2);
        if (uri != null) {
            int i4 = prefetchWithMultipleUrls + 105;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            strIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(uri, "source", "");
        } else {
            strIAuthTabCallback = null;
        }
        if (Intrinsics.areEqual(strIAuthTabCallback, "external")) {
            return true;
        }
        int i6 = prefetchWithMultipleUrls + 53;
        newSession = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 59;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.activity.ComponentActivity*/.onMultiWindowModeChanged(z);
        this.onActivityResized.onExtraCallback(Boolean.valueOf(z));
        int i4 = newSession + 79;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyLongPress(int i, @Nullable KeyEvent keyEvent) {
        int i2 = 2 % 2;
        if (i == 4) {
            int i3 = newSession + 51;
            prefetchWithMultipleUrls = i3 % 128;
            if (i3 % 2 != 0) {
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                if (!(!((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackDefault().onActivityLayout()) && getDelegate().IAuthTabCallbackDefault() == -100) {
                    int i4 = prefetchWithMultipleUrls + 11;
                    newSession = i4 % 128;
                    int i5 = i4 % 2;
                    if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{this}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                        ITrustedWebActivityCallbackStubProxy.onWarmupCompleted(1);
                    } else {
                        ITrustedWebActivityCallbackStubProxy.onWarmupCompleted(2);
                    }
                    recreate();
                    return true;
                }
            } else {
                ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackDefault().onActivityLayout();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return super/*android.app.Activity*/.onKeyLongPress(i, keyEvent);
    }

    private static final void ICustomTabsCallback(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 99;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Object[] objArr = {(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())};
        ((SidecarCompatExternalSyntheticLambda0) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallback(null);
        int i4 = newSession + 95;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        getHostnameVerifierokhttp gethostnameverifierokhttp = (BaseActivity) objArr[0];
        Intent intent = (Intent) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Bundle bundle = (Bundle) objArr[3];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 41;
        newSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{gethostnameverifierokhttp}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onWarmupCompleted((Context) gethostnameverifierokhttp, intent);
            super/*androidx.activity.ComponentActivity*/.startActivityForResult(intent, iIntValue, bundle);
            int i3 = newSession + 117;
            prefetchWithMultipleUrls = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{gethostnameverifierokhttp}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onWarmupCompleted((Context) gethostnameverifierokhttp, intent);
        super/*androidx.activity.ComponentActivity*/.startActivityForResult(intent, iIntValue, bundle);
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 105;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
    }

    private static final Unit asBinder(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 49;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ActivityAuthHandler", th);
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 75;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startActivityForResult(@NotNull final Intent intent, final int i, @Nullable final Bundle bundle) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        getHostnameVerifierokhttp gethostnameverifierokhttp = null;
        if (i >= 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            if (!((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackDefault().onActivityLayout() && ITrustedWebActivityServiceStub()) {
                int i3 = newSession + 119;
                prefetchWithMultipleUrls = i3 % 128;
                if (i3 % 2 != 0) {
                    AudioAttributesImplApi21Parcelizer();
                    return;
                } else {
                    AudioAttributesImplApi21Parcelizer();
                    gethostnameverifierokhttp.hashCode();
                    throw null;
                }
            }
        }
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        if (!((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallbackWithResult().onWarmupCompleted(intent)) {
            int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult3, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onWarmupCompleted((Context) this, intent);
            super/*androidx.activity.ComponentActivity*/.startActivityForResult(intent, i, bundle);
            return;
        }
        int i4 = newSession + 9;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
            if (isFinishing()) {
                int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                getHostnameVerifierokhttp gethostnameverifierokhttpOnWarmupCompleted = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult4, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onNavigationEvent().onWarmupCompleted();
                if (gethostnameverifierokhttpOnWarmupCompleted instanceof BaseActivity) {
                    int i6 = newSession + 29;
                    prefetchWithMultipleUrls = i6 % 128;
                    if (i6 % 2 == 0) {
                        gethostnameverifierokhttp.hashCode();
                        throw null;
                    }
                    gethostnameverifierokhttp = (BaseActivity) gethostnameverifierokhttpOnWarmupCompleted;
                }
                if (gethostnameverifierokhttp == null) {
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ActivityAuthHandler", "finishing and base activity is null", (Map) null, (String) null, false, (String) null, 60, (Object) null);
                    int i7 = prefetchWithMultipleUrls + 119;
                    newSession = i7 % 128;
                    int i8 = i7 % 2;
                    gethostnameverifierokhttp = this;
                }
            } else {
                gethostnameverifierokhttp = this;
            }
        } else if (isFinishing()) {
        }
        int iOnExtraCallbackWithResult5 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Object[] objArr = {(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult5, onAdViewAdDisplayFailed.onExtraCallbackWithResult())};
        ((SidecarCompatExternalSyntheticLambda0) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallback(new EventServiceImpl(intent, Integer.valueOf(i), bundle));
        int iOnExtraCallbackWithResult6 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        wasLastName waslastnameOnWarmupCompleted = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult6, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallbackWithResult().onWarmupCompleted(this, gethostnameverifierokhttp, intent).onWarmupCompleted(new deserializeDecimalCollection() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda39
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final void run() {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 19;
                IAuthTabCallback = i10 % 128;
                Object obj = null;
                if (i10 % 2 != 0) {
                    BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 2130996329, new Object[]{this.f$0}, -2130996302, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                    obj.hashCode();
                    throw null;
                }
                BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 2130996329, new Object[]{this.f$0}, -2130996302, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                int i11 = IAuthTabCallback + 105;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        deserializeDecimalCollection deserializedecimalcollection = new deserializeDecimalCollection() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda40
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final void run() {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 117;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                BaseActivity.onWarmupCompleted(this.f$0, intent, i, bundle);
                int i12 = onWarmupCompleted + 23;
                onExtraCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }
        };
        final Function1 function1 = new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda41
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 43;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                Unit unitA_ = BaseActivity.a_((Throwable) obj);
                int i12 = onWarmupCompleted + 87;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    return unitA_;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = waslastnameOnWarmupCompleted.onWarmupCompleted(deserializedecimalcollection, new deserializeFloat() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda42
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void accept(Object obj) {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    BaseActivity.onNavigationEvent(function1, obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                BaseActivity.onNavigationEvent(function1, obj);
                int i11 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted);
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object[] objArr2 = {(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())};
            ((SidecarCompatExternalSyntheticLambda0) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallback(null);
            int i3 = 37 / 0;
        } else {
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object[] objArr3 = {(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())};
            ((SidecarCompatExternalSyntheticLambda0) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr3, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallback(null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(BaseActivity baseActivity, Intent[] intentArr, Bundle bundle) {
        int i = 2 % 2;
        int i2 = newSession + 39;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        super/*android.content.Context*/.startActivities(intentArr, bundle);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = newSession + 117;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 25;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(BaseActivity baseActivity, Intent[] intentArr, Bundle bundle, Throwable th) throws Throwable {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Intent[] intentArrIAuthTabCallback = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallbackWithResult().IAuthTabCallback(intentArr);
        if (intentArrIAuthTabCallback.length != 0) {
            super/*android.content.Context*/.startActivities(intentArrIAuthTabCallback, bundle);
        } else {
            int i2 = newSession + 41;
            prefetchWithMultipleUrls = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 4;
            }
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ActivityAuthHandler", th);
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 61;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startActivities(@Nullable final Intent[] intentArr, @Nullable final Bundle bundle) throws Throwable {
        getHostnameVerifierokhttp gethostnameverifierokhttp;
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 9;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        if (((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallbackWithResult().onExtraCallbackWithResult(intentArr)) {
            if (!isFinishing()) {
                gethostnameverifierokhttp = this;
            } else {
                getHostnameVerifierokhttp gethostnameverifierokhttpOnWarmupCompleted = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onNavigationEvent().onWarmupCompleted();
                getHostnameVerifierokhttp gethostnameverifierokhttp2 = gethostnameverifierokhttpOnWarmupCompleted instanceof BaseActivity ? (BaseActivity) gethostnameverifierokhttpOnWarmupCompleted : null;
                if (gethostnameverifierokhttp2 == null) {
                    int i4 = newSession + 65;
                    prefetchWithMultipleUrls = i4 % 128;
                    if (i4 % 2 == 0) {
                        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ActivityAuthHandler", "finishing and base activity is null", (Map) null, (String) null, false, (String) null, 103, (Object) null);
                    } else {
                        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ActivityAuthHandler", "finishing and base activity is null", (Map) null, (String) null, false, (String) null, 60, (Object) null);
                    }
                    gethostnameverifierokhttp = this;
                } else {
                    gethostnameverifierokhttp = gethostnameverifierokhttp2;
                }
            }
            SidecarCompatExternalSyntheticLambda0 sidecarCompatExternalSyntheticLambda0 = (SidecarCompatExternalSyntheticLambda0) IAuthTabCallback.onExtraCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{(IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1245490858, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "");
            sidecarCompatExternalSyntheticLambda0.IAuthTabCallback(new EventServiceImpl(intent, (Integer) null, bundle, 2, (DefaultConstructorMarker) null));
            wasLastName waslastnameOnWarmupCompleted = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallbackWithResult().onExtraCallbackWithResult(this, gethostnameverifierokhttp, intentArr).onWarmupCompleted(new deserializeDecimalCollection() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda26
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final void run() {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 95;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1749563720, new Object[]{this.f$0}, -1749563711, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                    int i8 = onNavigationEvent + 67;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            deserializeDecimalCollection deserializedecimalcollection = new deserializeDecimalCollection() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda27
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final void run() {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 85;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    BaseActivity baseActivity = this.f$0;
                    if (i7 != 0) {
                        BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 847550788, new Object[]{baseActivity, intentArr, bundle}, -847550769, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                    } else {
                        BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 847550788, new Object[]{baseActivity, intentArr, bundle}, -847550769, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                        throw null;
                    }
                }
            };
            final Function1 function1 = new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda28
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) throws Throwable {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 41;
                    onExtraCallback = i6 % 128;
                    Object obj2 = null;
                    if (i6 % 2 == 0) {
                        BaseActivity.IAuthTabCallback(this.f$0, intentArr, bundle, (Throwable) obj);
                        obj2.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = BaseActivity.IAuthTabCallback(this.f$0, intentArr, bundle, (Throwable) obj);
                    int i7 = onNavigationEvent + 63;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = waslastnameOnWarmupCompleted.onWarmupCompleted(deserializedecimalcollection, new deserializeFloat() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda29
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final void accept(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 1;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    BaseActivity.onExtraCallback(function1, obj);
                    if (i7 == 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
            onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted);
            return;
        }
        super/*android.content.Context*/.startActivities(intentArr, bundle);
    }

    public final IPostMessageServiceStubProxy extraCommand() {
        int i = 2 % 2;
        int i2 = newSession + 43;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        if (getSupportActionBar() == null) {
            throw new IllegalArgumentException("ActionBar is null");
        }
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        Intrinsics.checkNotNull(supportActionBar);
        int i4 = prefetchWithMultipleUrls + 31;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return supportActionBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean ITrustedWebActivityServiceStub() {
        int i = 2 % 2;
        int i2 = newSession + 29;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        if (Settings.Global.getInt(getContentResolver(), "always_finish_activities", 0) == 0) {
            return false;
        }
        int i4 = prefetchWithMultipleUrls + 101;
        newSession = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void AudioAttributesImplApi21Parcelizer() throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "dont_keep_activities_dialog", (String) null, (Map) null, (String) null, false, (String) null, 62, (Object) null);
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = BaseActivity.IAuthTabCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                int i5 = IAuthTabCallback + 49;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        });
        int i2 = newSession + 57;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(BaseActivity baseActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        baseActivity.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS").addFlags(268435456));
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = newSession + 17;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(final BaseActivity baseActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(baseActivity.getString(R.string.base_main___e50113554d));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(baseActivity.getString(R.string.base_main___ded9a2d59e) + baseActivity.getString(R.string.base_main___00ad7f2fd3));
        String string = baseActivity.getString(R.string.base_main___526eb45817);
        Intrinsics.checkNotNullExpressionValue(string, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda37
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 83;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = BaseActivity.IAuthTabCallback(this.f$0, (DialogInterface) obj);
                int i5 = onExtraCallbackWithResult + 23;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 22 / 0;
                }
                return unitIAuthTabCallback;
            }
        }, 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = baseActivity.getString(R.string.base_next_time);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, (Function1) null, 14, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = newSession + 101;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(BaseActivity baseActivity, getAdUnitIds.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 111;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            boolean z = onextracallback instanceof getAdUnitIds.onExtraCallback.onWarmupCompleted;
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        if (onextracallback instanceof getAdUnitIds.onExtraCallback.onWarmupCompleted) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onExtraCallback().onWarmupCompleted((Activity) baseActivity, ((getAdUnitIds.onExtraCallback.onWarmupCompleted) onextracallback).IAuthTabCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = newSession + 93;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private final void IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 41;
        newSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!bp_()) {
                int i3 = newSession + 57;
                prefetchWithMultipleUrls = i3 % 128;
                int i4 = i3 % 2;
                return;
            } else {
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onNavigationEvent().onNavigationEvent().onWarmupCompleted().onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
                Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
                onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new BaseActivity$.ExternalSyntheticLambda35(), (Function0) null, new BaseActivity$.ExternalSyntheticLambda36(this), 2, (Object) null));
                return;
            }
        }
        bp_();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 61;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 93;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback$79836cda(BaseActivity baseActivity, Object obj, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 71;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        try {
            Object[] objArr = {commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted()};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1282337251);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 28 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21965, -2100172659, false, "onWarmupCompleted", new Class[]{Context.class});
            }
            Intent intent = (Intent) ((Method) objOnExtraCallback).invoke(obj, objArr);
            intent.setFlags(268468224);
            Object[] objArr2 = new Object[1];
            b(new int[]{1322488851, 128950686, -2105973589, 1408933047}, ExpandableListView.getPackedPositionGroup(0L) + 8, objArr2);
            intent.putExtra(((String) objArr2[0]).intern(), "base");
            baseActivity.startActivity(intent);
            Unit unit = Unit.INSTANCE;
            int i4 = newSession + 93;
            prefetchWithMultipleUrls = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback$3f564ca8(final BaseActivity baseActivity, String str, final Object obj, final CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(baseActivity.getString(R.string.base_main___3e392d202c));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(baseActivity.getString(R.string.base_main___dc40c2d6f2, str));
        String string = baseActivity.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, new CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda14
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 25;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                BaseActivity baseActivity2 = this.f$0;
                if (i4 != 0) {
                    return BaseActivity.onWarmupCompleted$79836cda(baseActivity2, obj, commonModule_setLeftEdgeTouchEnabled, (DialogInterface) obj2);
                }
                BaseActivity.onWarmupCompleted$79836cda(baseActivity2, obj, commonModule_setLeftEdgeTouchEnabled, (DialogInterface) obj2);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        }, 6, (DefaultConstructorMarker) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = newSession + 81;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult$71f6da4b(BaseActivity baseActivity, Object obj, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 117;
        prefetchWithMultipleUrls = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        try {
            Object[] objArr = {baseActivity};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1282337251);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 21965 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2100172659, false, "onWarmupCompleted", new Class[]{Context.class});
            }
            Intent intent = (Intent) ((Method) objOnExtraCallback).invoke(obj, objArr);
            Object[] objArr2 = new Object[1];
            b(new int[]{1322488851, 128950686, -2105973589, 1408933047}, TextUtils.indexOf((CharSequence) "", '0', 0) + 9, objArr2);
            intent.putExtra(((String) objArr2[0]).intern(), "base");
            baseActivity.startActivity(intent);
            Unit unit = Unit.INSTANCE;
            int i4 = prefetchWithMultipleUrls + 87;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final Unit onNavigationEvent(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 109;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        CriticalMalwareState.Companion.onNavigationEvent().IAuthTabCallback(CriticalMalwareState.Event.OnUserIgnoredSuspiciousMalwareAlert.INSTANCE);
        Unit unit = Unit.INSTANCE;
        int i4 = prefetchWithMultipleUrls + 71;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult$3f564ca8(final BaseActivity baseActivity, String str, final Object obj, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(baseActivity.getString(R.string.base_main___3e392d202c));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(baseActivity.getString(R.string.base_main___b37b181003, str));
        String string = baseActivity.getString(R.string.base_do_delete);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, new CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda30
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 59;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -2031754806, new Object[]{this.f$0, obj, (DialogInterface) obj2}, 2031754834, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                int i5 = onExtraCallback + 91;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }, 6, (DefaultConstructorMarker) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = baseActivity.getString(R.string.base_close);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, new CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda31
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 3;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = BaseActivity.onExtraCallback((DialogInterface) obj2);
                int i5 = onWarmupCompleted + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }, 6, (DefaultConstructorMarker) null)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = prefetchWithMultipleUrls + 119;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13, im.toss.splittarget.spec.fsm.CriticalMalwareState.State.Normal.INSTANCE) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0141, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13, im.toss.splittarget.spec.fsm.CriticalMalwareState.State.Normal.INSTANCE) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0149, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.base.BaseActivity, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) throws Throwable {
        final ?? r1 = (BaseActivity) objArr[0];
        CriticalMalwareState.State state = (CriticalMalwareState.State) objArr[1];
        int i = 2 % 2;
        Response response = Response.onNavigationEvent;
        Context applicationContext = r1.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        final Object objComponentActivityExternalSyntheticLambda3$293635a6 = ((s8ExternalSyntheticLambda2.onExtraCallback) Response.onExtraCallback(applicationContext, s8ExternalSyntheticLambda2.onExtraCallback.class)).ComponentActivityExternalSyntheticLambda3$293635a6();
        if (Intrinsics.areEqual(((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{r1}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).onNavigationEvent().onWarmupCompleted(), r1.getContext())) {
            int i2 = prefetchWithMultipleUrls + 53;
            newSession = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.areEqual(state, CriticalMalwareState.State.CriticalState.INSTANCE);
                throw null;
            }
            if (Intrinsics.areEqual(state, CriticalMalwareState.State.CriticalState.INSTANCE)) {
                GetFeatureExtension.onExtraCallbackWithResult(GetFeatureExtension.onWarmupCompleted, (deserializeDecimalCollection) null, 1, (Object) null);
                String strOnPostMessage = PlayerErrorCode.onPostMessage();
                if (!StringsKt.isBlank(strOnPostMessage)) {
                    int i3 = prefetchWithMultipleUrls + 97;
                    newSession = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    string = strOnPostMessage;
                }
                if (string == null) {
                    string = r1.getString(R.string.base_main___5c50d9e50b);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r1, new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 19;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnNavigationEvent$3f564ca8 = BaseActivity.onNavigationEvent$3f564ca8(this.f$0, string, objComponentActivityExternalSyntheticLambda3$293635a6, (CommonModule_setLeftEdgeTouchEnabled) obj);
                        int i7 = onWarmupCompleted + 55;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return unitOnNavigationEvent$3f564ca8;
                    }
                });
            } else if (Intrinsics.areEqual(state, CriticalMalwareState.State.SuspiciousState.INSTANCE)) {
                int i4 = prefetchWithMultipleUrls + 71;
                newSession = i4 % 128;
                int i5 = i4 % 2;
                GetFeatureExtension.onExtraCallbackWithResult(GetFeatureExtension.onWarmupCompleted, (deserializeDecimalCollection) null, 1, (Object) null);
                String strOnPostMessage2 = PlayerErrorCode.onPostMessage();
                string = StringsKt.isBlank(strOnPostMessage2) ? null : strOnPostMessage2;
                if (string == null) {
                    string = r1.getString(R.string.base_main___5c50d9e50b);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r1, new Function1() { // from class: im.toss.base.BaseActivity$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback + 21;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        BaseActivity baseActivity = this.f$0;
                        if (i8 != 0) {
                            return BaseActivity.IAuthTabCallback$3f564ca8(baseActivity, string, objComponentActivityExternalSyntheticLambda3$293635a6, (CommonModule_setLeftEdgeTouchEnabled) obj);
                        }
                        Unit unitIAuthTabCallback$3f564ca8 = BaseActivity.IAuthTabCallback$3f564ca8(baseActivity, string, objComponentActivityExternalSyntheticLambda3$293635a6, (CommonModule_setLeftEdgeTouchEnabled) obj);
                        int i9 = 77 / 0;
                        return unitIAuthTabCallback$3f564ca8;
                    }
                });
            } else if (Intrinsics.areEqual(state, CriticalMalwareState.State.UserIgnoredSuspiciousState.INSTANCE)) {
                try {
                    Object[] objArr2 = {r1};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1075035853);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 28 - ExpandableListView.getPackedPositionGroup(0L), 21965 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1901281373, false, "onExtraCallback", new Class[]{Context.class});
                    }
                    ((Method) objOnExtraCallback).invoke(objComponentActivityExternalSyntheticLambda3$293635a6, objArr2);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else if (!Intrinsics.areEqual(state, CriticalMalwareState.State.Ready.INSTANCE)) {
                int i6 = prefetchWithMultipleUrls + 13;
                newSession = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 1 / 0;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = newSession + 57;
        prefetchWithMultipleUrls = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            unit = Unit.INSTANCE;
            int i3 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            unit = Unit.INSTANCE;
        }
        int i4 = newSession + 103;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void bn_() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 119;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            if (!bq_()) {
                int i3 = prefetchWithMultipleUrls + 55;
                newSession = i3 % 128;
                int i4 = i3 % 2;
                return;
            } else {
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = CriticalMalwareState.Companion.onNavigationEvent().IAuthTabCallback(true).onExtraCallbackWithResult(1L, TimeUnit.SECONDS);
                Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallbackWithResult, "");
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallbackWithResult.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
                Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
                onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new BaseActivity$.ExternalSyntheticLambda2(), (Function0) null, new BaseActivity$.ExternalSyntheticLambda3(this), 2, (Object) null));
                return;
            }
        }
        bq_();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[PHI: r7
      0x002c: PHI (r7v5 java.lang.annotation.Annotation) = (r7v4 java.lang.annotation.Annotation), (r7v7 java.lang.annotation.Annotation) binds: [B:11:0x002a, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(Annotation[] annotationArr) throws Throwable {
        Annotation annotation;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = annotationArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = newSession + 53;
            prefetchWithMultipleUrls = i3 % 128;
            if (i3 % 2 == 0) {
                annotation = annotationArr[i2];
                int i4 = 88 / 0;
                if (!(true ^ (annotation instanceof EmbeddingAdapterExternalSyntheticLambda2))) {
                    arrayList.add(annotation);
                    int i5 = prefetchWithMultipleUrls + 91;
                    newSession = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 4;
                    }
                }
            } else {
                annotation = annotationArr[i2];
                if (annotation instanceof EmbeddingAdapterExternalSyntheticLambda2) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            JFunction2 jFunction2Access000 = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).access000();
            Object[] objArr = new Object[1];
            b(new int[]{16708621, -1730400169, -1866876182, -1719116769, 27295464, 830954083, 1240849330, 381608848, -956981462, 484802242, -6495430, -186298115, 1418140962, -22559245, -1486767559, -857573510, -506329142, -1558682731}, 33 - (Process.myPid() >> 22), objArr);
            int iIntValue = ((Number) jFunction2Access000.onWarmupCompleted(((String) objArr[0]).intern(), 0)).intValue();
            JFunction2 jFunction2Access0002 = ((IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).access000();
            Object[] objArr2 = new Object[1];
            b(new int[]{16708621, -1730400169, -1866876182, -1719116769, 27295464, 830954083, 1240849330, 381608848, -956981462, 484802242, -6495430, -186298115, 1418140962, -22559245, -1486767559, -857573510, -506329142, -1558682731}, Gravity.getAbsoluteGravity(0, 0) + 33, objArr2);
            jFunction2Access0002.onExtraCallbackWithResult(((String) objArr2[0]).intern(), Integer.valueOf(iIntValue + 1), true);
        }
    }

    @Override // o.ALCFaceMask
    public IAnimation<MotionEvent> extraCallback() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 125;
        prefetchWithMultipleUrls = i3 % 128;
        int i4 = i3 % 2;
        IAnimation<MotionEvent> iAnimation = this.mayLaunchUrl;
        int i5 = i2 + 29;
        prefetchWithMultipleUrls = i5 % 128;
        int i6 = i5 % 2;
        return iAnimation;
    }

    @Override // o.ALCFaceMask
    public void onExtraCallback(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 1;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            ITrustedWebActivityCallback_Parcel().onExtraCallback(motionEvent);
            int i3 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            ITrustedWebActivityCallback_Parcel().onExtraCallback(motionEvent);
        }
        int i4 = newSession + 35;
        prefetchWithMultipleUrls = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onTransact extends Resources {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Locale onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Locale locale, AssetManager assetManager, DisplayMetrics displayMetrics, Configuration configuration) {
            super(assetManager, displayMetrics, configuration);
            this.onExtraCallback = locale;
        }

        @Override // android.content.res.Resources
        public String getString(int i) throws Resources.NotFoundException {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            BaseActivity baseActivity = BaseActivity.this;
            if (baseActivity.deps == null) {
                String string = super.getString(i);
                Intrinsics.checkNotNull(string);
                return string;
            }
            int i5 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ProductDetailsPricingPhase productDetailsPricingPhaseAsInterface = ((IAuthTabCallback) BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).asInterface();
            String smallIconBitmap = ((IAuthTabCallback) BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{BaseActivity.this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackDefault().getSmallIconBitmap();
            Locale locale = this.onExtraCallback;
            Intrinsics.checkNotNull(locale);
            String strOnNavigationEvent = productDetailsPricingPhaseAsInterface.onNavigationEvent(smallIconBitmap, i, locale);
            if (strOnNavigationEvent != null) {
                return strOnNavigationEvent;
            }
            int i7 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            String string2 = super.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }

        @Override // android.content.res.Resources
        public String getString(int i, Object... objArr) throws Resources.NotFoundException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(objArr, "");
            BaseActivity baseActivity = BaseActivity.this;
            if (baseActivity.deps == null) {
                String string = super.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Locale locale = this.onExtraCallback;
                Intrinsics.checkNotNull(locale);
                return WorkForegroundRunnableExternalSyntheticLambda0.onWarmupCompleted(string, locale, Arrays.copyOf(objArr, objArr.length));
            }
            int i3 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                ProductDetailsPricingPhase productDetailsPricingPhaseAsInterface = ((IAuthTabCallback) BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).asInterface();
                String smallIconBitmap = ((IAuthTabCallback) BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{BaseActivity.this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackDefault().getSmallIconBitmap();
                Locale locale2 = this.onExtraCallback;
                Intrinsics.checkNotNull(locale2);
                productDetailsPricingPhaseAsInterface.onNavigationEvent(smallIconBitmap, i, locale2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            ProductDetailsPricingPhase productDetailsPricingPhaseAsInterface2 = ((IAuthTabCallback) BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{baseActivity}, -90803504, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).asInterface();
            String smallIconBitmap2 = ((IAuthTabCallback) BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{BaseActivity.this}, -90803504, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).IAuthTabCallbackDefault().getSmallIconBitmap();
            Locale locale3 = this.onExtraCallback;
            Intrinsics.checkNotNull(locale3);
            String strOnNavigationEvent = productDetailsPricingPhaseAsInterface2.onNavigationEvent(smallIconBitmap2, i, locale3);
            if (strOnNavigationEvent != null) {
                Locale locale4 = this.onExtraCallback;
                Intrinsics.checkNotNull(locale4);
                String strOnWarmupCompleted = WorkForegroundRunnableExternalSyntheticLambda0.onWarmupCompleted(strOnNavigationEvent, locale4, Arrays.copyOf(objArr, objArr.length));
                if (strOnWarmupCompleted != null) {
                    int i4 = onNavigationEvent + 79;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return strOnWarmupCompleted;
                }
            }
            String string2 = super.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Locale locale5 = this.onExtraCallback;
            Intrinsics.checkNotNull(locale5);
            return WorkForegroundRunnableExternalSyntheticLambda0.onWarmupCompleted(string2, locale5, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Resources getResources() {
        int i = 2 % 2;
        Resources resources = getBaseContext().getResources();
        Locale locale = resources.getConfiguration().getLocales().get(0);
        if (!Intrinsics.areEqual(locale, Locale.KOREA)) {
            int i2 = prefetchWithMultipleUrls + 97;
            int i3 = i2 % 128;
            newSession = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Resources resources2 = this.access100;
            if (resources2 == null) {
                onTransact ontransact = new onTransact(locale, resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
                this.access100 = ontransact;
                return ontransact;
            }
            int i4 = i3 + 113;
            prefetchWithMultipleUrls = i4 % 128;
            int i5 = i4 % 2;
            return resources2;
        }
        this.access100 = null;
        Intrinsics.checkNotNull(resources);
        return resources;
    }

    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 31;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(configuration, "");
            this.access100 = null;
            super/*androidx.appcompat.app.AppCompatActivity*/.onConfigurationChanged(configuration);
        } else {
            Intrinsics.checkNotNullParameter(configuration, "");
            this.access100 = null;
            super/*androidx.appcompat.app.AppCompatActivity*/.onConfigurationChanged(configuration);
            int i3 = 56 / 0;
        }
    }

    public Map<String, Object> getScreenMetaData() {
        int i = 2 % 2;
        int i2 = prefetchWithMultipleUrls + 93;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("screenName", AFj1pSDK.onExtraCallbackWithResult(this)));
        int i4 = newSession + 63;
        prefetchWithMultipleUrls = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOnNavigationEvent;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent$71f6da4b(BaseActivity baseActivity, Object obj, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -2031754806, new Object[]{baseActivity, obj, dialogInterface}, 2031754834, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void onExtraCallback(BaseActivity baseActivity, Intent[] intentArr, Bundle bundle) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 847550788, new Object[]{baseActivity, intentArr, bundle}, -847550769, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void onNavigationEvent(BaseActivity baseActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 2130996329, new Object[]{baseActivity}, -2130996302, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(BaseActivity baseActivity, String str) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1544066914, new Object[]{baseActivity, str}, 1544066922, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void onTransact(BaseActivity baseActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1749563720, new Object[]{baseActivity}, -1749563711, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void access100(BaseActivity baseActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1009332078, new Object[]{baseActivity}, 1009332080, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ View access000(BaseActivity baseActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (View) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 661656573, new Object[]{baseActivity}, -661656551, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final void onExtraCallback(Intent intent) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1257820142, new Object[]{this, intent}, -1257820131, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 682533857, new Object[]{th}, -682533831, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(BaseActivity baseActivity, CriticalMalwareState.State state) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1990367737, new Object[]{baseActivity, state}, 1990367757, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final void ITrustedWebActivityCallbackStub() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 925878756, new Object[]{this}, -925878749, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final void readTypedObject(BaseActivity baseActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1455459720, new Object[]{baseActivity}, -1455459716, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final void write() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1634968175, new Object[]{this}, -1634968165, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final void onExtraCallback(BaseActivity baseActivity, Ref.ObjectRef objectRef) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 771950130, new Object[]{baseActivity, objectRef}, -771950116, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final void onExtraCallbackWithResult(BaseActivity baseActivity, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1307265271, new Object[]{baseActivity, dialogInterface}, -1307265250, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1039769889, new Object[]{function1, obj}, 1039769901, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final void IAuthTabCallbackStub(BaseActivity baseActivity, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -848207807, new Object[]{baseActivity, dialogInterface}, 848207807, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final void writeTypedObject(BaseActivity baseActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -551135954, new Object[]{baseActivity}, 551135969, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final void onExtraCallback(BaseActivity baseActivity, Intent intent, int i, Bundle bundle) {
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1176039056, new Object[]{baseActivity, intent, Integer.valueOf(i), bundle}, 1176039080, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final Window onPostMessage(BaseActivity baseActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Window) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1718949424, new Object[]{baseActivity}, 1718949447, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(BaseActivity baseActivity, String str) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -29157943, new Object[]{baseActivity, str}, 29157946, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    protected final void bl_() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 2070928528, new Object[]{this}, -2070928527, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final IAuthTabCallback IAuthTabCallbackStubProxy() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (IAuthTabCallback) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 90803533, new Object[]{this}, -90803504, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final boolean ICustomTabsCallbackStub() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 2144952748, new Object[]{this}, -2144952743, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue();
    }

    public final void onWarmupCompleted(@NotNull setEnabledAmazonAdUnitIds setenabledamazonadunitids) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1566333150, new Object[]{this, setenabledamazonadunitids}, -1566333132, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final void IAuthTabCallback(@NotNull findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -686291483, new Object[]{this, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, 686291499, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final boolean requestPostMessageChannel() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1015300433, new Object[]{this}, 1015300439, iOnExtraCallbackWithResult, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue();
    }

    static void bu_() {
        postMessage = new int[]{-1225772893, 1146514235, -1400332692, -1138495071, -199939682, 331928170, -687096969, -914917913, 1170735654, -1569227531, 761621486, -805833883, -1809413516, -1164533932, -703070044, 1151417763, 446174573, 655281444};
    }
}
