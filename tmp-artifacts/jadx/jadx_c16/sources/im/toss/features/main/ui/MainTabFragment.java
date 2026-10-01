package im.toss.features.main.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.otaliastudios.cameraview.R$styleable;
import com.tmoney.a;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.devtool.domain.usecase.RunDevToolActionUseCase;
import im.toss.features.benefit.ui.component.StreamPointComponentOverlayView;
import im.toss.features.main.ui.MainTabFragment$;
import im.toss.features.main.ui.MainTabFragment$generateTabs$2$;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.uikit.widget.TabBar;
import im.toss.uikit.widget.TabBarItemView;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import o.ACPayResult;
import o.AFLogger5;
import o.AFd1gSDK;
import o.AFd1mSDK;
import o.AFg1tSDK4;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CacheStrategy;
import o.ConvertFloatArrayToByteArray;
import o.ExtHubContext;
import o.ExtHubEventContext;
import o.ExtHubExtensionManager;
import o.ExtHubLoggerImpl;
import o.ExtHubPage;
import o.ExtHubPageContext;
import o.ExtHubPageContext$IAuthTabCallback$IAuthTabCallback;
import o.ExtHubRVEngine;
import o.ExtHubRender;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.JsonReaderUnknownNumberParsing;
import o.MySubscribeProxySubscriptionsSetting;
import o.PageRenderReadyListener;
import o.RVWebSocketManagerHolder;
import o.RVWebSocketManagerHolder$onExtraCallback;
import o.RotationProvider1;
import o.SDKInstallCallBack;
import o.SessionTrackerb;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackGroupExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.WebSocketSession;
import o.access13800;
import o.access14300;
import o.access8100;
import o.adOpenedFullscreen;
import o.addAllCommandLine;
import o.allowAdditionalDecoder;
import o.checkDetectionItem;
import o.clearFaultAdjacentMetadata;
import o.clearWrite;
import o.closeAllSocket;
import o.createClient;
import o.createJSONObject;
import o.deserializeUriNullableCollection;
import o.drawTextProgressSize;
import o.filterCreatePageParams;
import o.findResAndMsg;
import o.generatorFDId;
import o.getApiName;
import o.getBillingPeriod;
import o.getByteBuffer;
import o.getClosedokhttp;
import o.getContentPaddingRight;
import o.getDirectory;
import o.getErrMsg;
import o.getEventInstanceId;
import o.getIconPaddingLeft;
import o.getNumberOfCores;
import o.getPackageType;
import o.getPricingPhaseList;
import o.getProgressText;
import o.getTextProgressMargin;
import o.getTileModeY;
import o.getWrite;
import o.isUserSubjectToGDPR;
import o.makeExtension;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.nSetPosition;
import o.onPageExit;
import o.onRenderInit;
import o.openFd;
import o.preFillDefault;
import o.putChannelInfo;
import o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc;
import o.removeTabBarModel;
import o.removeTaskIdOnSocketError;
import o.setBitmapDecoderClass;
import o.setDisableNetworkData;
import o.setRandomHost;
import o.setRubIn;
import o.startSocketConnect;
import o.varyMatches;
import o.ycxycx;
import o.zzad;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.FragmentSwitcher;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MainTabFragment extends Hilt_MainTabFragment implements setBitmapDecoderClass, removeTaskIdOnSocketError {
    public static final onExtraCallback Companion;
    private static char[] ICustomTabsCallbackDefault;
    private static byte[] ICustomTabsCallbackStub;
    private static short[] ICustomTabsCallbackStubProxy;
    private static int ICustomTabsService;
    private static int onActivityResized;
    public static final int onExtraCallback;
    private static int onMinimized;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static int onPostMessage;
    private deserializeUriNullableCollection IAuthTabCallback;
    private float IAuthTabCallbackDefault;
    private Set<Integer> IAuthTabCallbackStub;
    private View IAuthTabCallbackStubProxy;
    private AFg1tSDK4 IAuthTabCallback_Parcel;
    private getPackageType ICustomTabsCallback;
    private final Lazy access000;
    private long access100;

    @Inject
    public r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc agreedToAnyTermsUseCase;

    @Inject
    public removeTabBarModel airdropTermsManager;
    private TdsToastV1 asBinder;
    private final IEngagementSignalsCallback_Parcel<Intent> asInterface;

    @Inject
    public createJSONObject bleScanManager;

    @Inject
    public zzad environments;
    private getPackageType extraCallback;
    private Map<Integer, Boolean> extraCallbackWithResult;

    @Inject
    public onRenderInit feedFragmentNavigation;
    private makeExtension getInterfaceDescriptor;

    @Inject
    public MySubscribeProxySubscriptionsSetting homeFragmentNavigation;

    @Inject
    public adOpenedFullscreen lcpSessionRegistry;

    @Inject
    public AFd1gSDK mainTabBarTrace;

    @Inject
    public openFd mainTabManager;
    private final Lazy onActivityLayout;
    private final Lazy onExtraCallbackWithResult;
    private final Lazy onMessageChannelReady;
    private long onTransact;
    private final PageRenderReadyListener onWarmupCompleted;
    private drawTextProgressSize readTypedObject;

    @Inject
    public getBillingPeriod regionManager;

    @Inject
    public RunDevToolActionUseCase runDevToolAction;

    @Inject
    public CacheStrategy securitiesHealthCheckManager;

    @Inject
    public ExtHubRVEngine tabBarBubbleHelper;

    @Inject
    public ExtHubPage tabFragmentProvider;

    @Inject
    public getTextProgressMargin tabSwitchTracer;

    @Inject
    public generatorFDId teensMainTabProvider;

    @Inject
    public zzag tossClock;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public getClosedokhttp tossSecTabController;
    private final Lazy writeTypedObject;
    private static final byte[] $$a = {4, -80, 45, 109};
    private static final int $$b = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int mayLaunchUrl = 1;
    private static int onRelationshipValidationResult = 0;
    private static int onUnminimized = 1;

    static final /* synthetic */ class IAuthTabCallback_Parcel implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final /* synthetic */ Function1 IAuthTabCallback;

        IAuthTabCallback_Parcel(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(!(obj instanceof TextLinkScopeExternalSyntheticLambda0))) {
                int i2 = onExtraCallback + 7;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z = obj instanceof FunctionAdapter;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i3 = onExtraCallbackWithResult + 17;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i3 + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallbackWithResult + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onExtraCallbackWithResult + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 56 / 0;
            }
        }
    }

    static final class getInterfaceDescriptor extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        int label;
        /* synthetic */ Object result;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = MainTabFragment.onWarmupCompleted(-287048566, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 287048593, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{MainTabFragment.this, false, null, false, false, false, null, this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
            int i4 = onWarmupCompleted + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3;
        int i4 = 1 - (s * 3);
        int i5 = (i * 2) + 115;
        int i6 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            i3 = 0;
            int i9 = i6 + i8;
            i2 = i3;
            i6 = i7;
            i5 = i9;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            int i10 = i6 + 1;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i10];
            i6 = i5;
            i7 = i10;
            int i92 = i6 + i8;
            i2 = i3;
            i6 = i7;
            i5 = i92;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            int i102 = i6 + 1;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            int i1022 = i6 + 1;
            if (i3 == i4) {
            }
        }
    }

    static {
        ICustomTabsService = 0;
        onUnminimized();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(MainTabFragment.class, "binding", "getBinding()Lim/toss/features/main/ui/databinding/FragmentMainTabBinding;", 0)};
        Companion = new onExtraCallback(null);
        onExtraCallback = 8;
        int i = mayLaunchUrl + 69;
        ICustomTabsService = i % 128;
        if (i % 2 != 0) {
            int i2 = 54 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 47;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(-872289233, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 872289249, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i3 = onRelationshipValidationResult + 71;
        onUnminimized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 97;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        int i4 = onUnminimized + 37;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(Boolean bool) {
        int i = 2 % 2;
        int i2 = onUnminimized + 1;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(bool);
        int i4 = onRelationshipValidationResult + 1;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 97;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        int i4 = onRelationshipValidationResult + 1;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ ViewModelProvider.onWarmupCompleted IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 45;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedUpdateVisuals = updateVisuals();
        int i4 = onUnminimized + 55;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onwarmupcompletedUpdateVisuals;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 71;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(function1, obj);
        int i4 = onUnminimized + 5;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(MainTabFragment mainTabFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 55;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject(mainTabFragment);
        }
        writeTypedObject(mainTabFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 23;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onActivityLayout(function1, obj);
        int i4 = onUnminimized + 121;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 11;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject(function1, obj);
        }
        writeTypedObject(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 115;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(th);
        }
        IAuthTabCallback(th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 43;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = onRelationshipValidationResult + 33;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 21;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mainTabFragment, map);
        int i4 = onUnminimized + 23;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 85;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        int i4 = onUnminimized + 25;
        onRelationshipValidationResult = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(MainTabFragment mainTabFragment, closeAllSocket closeallsocket) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 7;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mainTabFragment, closeallsocket);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = onUnminimized + 81;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(MainTabFragment mainTabFragment, startSocketConnect startsocketconnect) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 37;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mainTabFragment, startsocketconnect);
        int i4 = onUnminimized + 57;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ ExtHubEventContext onExtraCallback(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 1;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        ExtHubEventContext extHubEventContext = (ExtHubEventContext) onWarmupCompleted(462558252, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -462558227, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i4 = onRelationshipValidationResult + 97;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return extHubEventContext;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 5;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        int i4 = onRelationshipValidationResult + 61;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 75;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(obj);
        }
        IAuthTabCallback(obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onUnminimized + 101;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMinimized = onMinimized(mainTabFragment);
        int i4 = onUnminimized + 51;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnMinimized;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MainTabFragment mainTabFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 43;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mainTabFragment, th);
        int i4 = onUnminimized + 123;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MainTabFragment mainTabFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onUnminimized + 7;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(mainTabFragment, iEngagementSignalsCallbackDefault);
        int i4 = onRelationshipValidationResult + 47;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = onUnminimized + 65;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i4 = onRelationshipValidationResult + 35;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(MainTabFragment mainTabFragment, getContentPaddingRight getcontentpaddingright, Fragment fragment) {
        int i = 2 % 2;
        int i2 = onUnminimized + 35;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(-624342776, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 624342788, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, getcontentpaddingright, fragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i4 = onUnminimized + 125;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 59;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onUnminimized + 91;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Boolean bool) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 75;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(bool);
            throw null;
        }
        boolean zOnNavigationEvent = onNavigationEvent(bool);
        int i3 = onRelationshipValidationResult + 61;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Object obj) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 1;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {obj};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        if (i3 == 0) {
            zBooleanValue = ((Boolean) onWarmupCompleted(119101295, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -119101273, iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).booleanValue();
            int i4 = 86 / 0;
        } else {
            zBooleanValue = ((Boolean) onWarmupCompleted(119101295, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -119101273, iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).booleanValue();
        }
        int i5 = onUnminimized + 83;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Map onNavigationEvent(Fragment fragment) {
        int i = 2 % 2;
        int i2 = onUnminimized + 15;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Map mapOnWarmupCompleted = onWarmupCompleted(fragment);
        int i4 = onUnminimized + 41;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(MainTabFragment mainTabFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 79;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mainTabFragment, bool);
        int i4 = onRelationshipValidationResult + 7;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(MainTabFragment mainTabFragment, WebSocketSession webSocketSession) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 95;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(mainTabFragment, webSocketSession);
        int i4 = onRelationshipValidationResult + 13;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ getApiName onNavigationEvent(MainTabFragment mainTabFragment) {
        getApiName getapiname;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 61;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {mainTabFragment};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        if (i3 == 0) {
            getapiname = (getApiName) onWarmupCompleted(-171395117, iOnExtraCallbackWithResult3, 171395138, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult4);
            int i4 = 67 / 0;
        } else {
            getapiname = (getApiName) onWarmupCompleted(-171395117, iOnExtraCallbackWithResult3, 171395138, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult4);
        }
        int i5 = onRelationshipValidationResult + 49;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            return getapiname;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(ExtHubLoggerImpl extHubLoggerImpl, MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onUnminimized + 51;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(extHubLoggerImpl, mainTabFragment);
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        int i5 = onUnminimized + 27;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 75;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(-282747973, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 282748002, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, bool}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(-282747973, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 282748002, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, new Object[]{mainTabFragment, bool}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i3 = 48 / 0;
        return unit;
    }

    public static /* synthetic */ onMessageChannelReady onTransact(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 87;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady onmessagechannelreadyOnActivityLayout = onActivityLayout(mainTabFragment);
        int i4 = onRelationshipValidationResult + 37;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return onmessagechannelreadyOnActivityLayout;
    }

    public static /* synthetic */ boolean onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 11;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess000 = access000(function1, obj);
        int i4 = onUnminimized + 79;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return zAccess000;
    }

    public static /* synthetic */ Integer onWarmupCompleted(MainTabFragment mainTabFragment, Fragment fragment) {
        int i = 2 % 2;
        int i2 = onUnminimized + 75;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Integer num = (Integer) onWarmupCompleted(299085077, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -299085057, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, fragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i4 = onRelationshipValidationResult + 111;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        getInterfaceDescriptor getinterfacedescriptor;
        boolean z;
        getContentPaddingRight<Fragment> getcontentpaddingright;
        boolean z2;
        Bundle bundle;
        boolean z3;
        int i7;
        Fragment fragment;
        int i8 = ~i3;
        int i9 = ~i;
        int i10 = (~(i8 | i9 | i4)) | (~(i3 | i | i4));
        int i11 = ~i4;
        int i12 = (~(i9 | i3)) | (~(i9 | i11));
        int i13 = (~(i4 | i)) | (~(i8 | i11));
        int i14 = i3 + i + i5 + ((-564018846) * i2) + (483938512 * i6);
        int i15 = i14 * i14;
        int i16 = ((i3 * 1456092922) - 824780772) + (i * 1456095553) + (i10 * (-877)) + (i12 * (-1754)) + (i13 * 877) + (1456093799 * i5) + (578355822 * i2) + (1098359728 * i6) + (i15 * 1868693504);
        switch ((1473915126 * i3) + 752877568 + ((-1516524009) * i) + (996813045 * i10) + (1993626090 * i12) + ((-996813045) * i13) + (477102080 * i5) + (1390411776 * i2) + (452984832 * i6) + ((-1135738880) * i15) + (i16 * i16 * 2110914560)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i17 = 2 % 2;
                int i18 = onUnminimized + 117;
                onRelationshipValidationResult = i18 % 128;
                int i19 = i18 % 2;
                onActivityResized(function1, obj);
                int i20 = onRelationshipValidationResult + 123;
                onUnminimized = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
                getPackageType getpackagetype = (getPackageType) objArr[1];
                int i22 = 2 % 2;
                int i23 = onRelationshipValidationResult;
                int i24 = i23 + 93;
                onUnminimized = i24 % 128;
                int i25 = i24 % 2;
                mainTabFragment.extraCallback = getpackagetype;
                int i26 = i23 + 83;
                onUnminimized = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                return onTransact(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case 16:
                return access000(objArr);
            case 17:
                return access100(objArr);
            case 18:
                return readTypedObject(objArr);
            case 19:
                return extraCallbackWithResult(objArr);
            case 20:
                return writeTypedObject(objArr);
            case 21:
                return extraCallback(objArr);
            case 22:
                return ICustomTabsCallback(objArr);
            case 23:
                return onActivityResized(objArr);
            case 24:
                return onPostMessage(objArr);
            case 25:
                MainTabFragment mainTabFragment2 = (MainTabFragment) objArr[0];
                int i28 = 2 % 2;
                FragmentActivity fragmentActivityRequireActivity = mainTabFragment2.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                ExtHubEventContext extHubEventContext = new ExtHubEventContext(fragmentActivityRequireActivity, mainTabFragment2.onPostMessage(), mainTabFragment2.onActivityLayout());
                int i29 = onUnminimized + 77;
                onRelationshipValidationResult = i29 % 128;
                int i30 = i29 % 2;
                return extHubEventContext;
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                MainTabFragment mainTabFragment3 = (MainTabFragment) objArr[0];
                int i31 = 2 % 2;
                int i32 = onUnminimized;
                int i33 = i32 + 7;
                onRelationshipValidationResult = i33 % 128;
                int i34 = i33 % 2;
                CacheStrategy cacheStrategy = mainTabFragment3.securitiesHealthCheckManager;
                if (cacheStrategy != null) {
                    int i35 = i32 + 49;
                    onRelationshipValidationResult = i35 % 128;
                    int i36 = i35 % 2;
                    return cacheStrategy;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i37 = onRelationshipValidationResult + 11;
                onUnminimized = i37 % 128;
                int i38 = i37 % 2;
                return null;
            case 27:
                MainTabFragment mainTabFragment4 = (MainTabFragment) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                Bundle bundle2 = (Bundle) objArr[2];
                boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[4]).booleanValue();
                boolean zBooleanValue4 = ((Boolean) objArr[5]).booleanValue();
                getContentPaddingRight getcontentpaddingright2 = (getContentPaddingRight) objArr[6];
                access13800 access13800Var = (access13800) objArr[7];
                int i39 = 2 % 2;
                int i40 = onRelationshipValidationResult + 75;
                onUnminimized = i40 % 128;
                int i41 = i40 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted(1392686684, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1392686684, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{mainTabFragment4, Boolean.valueOf(zBooleanValue), bundle2, Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), Boolean.valueOf(zBooleanValue4), getcontentpaddingright2, access13800Var}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                int i42 = onUnminimized + 119;
                onRelationshipValidationResult = i42 % 128;
                int i43 = i42 % 2;
                return objOnWarmupCompleted;
            case 28:
                return onActivityLayout(objArr);
            case 29:
                return onMessageChannelReady(objArr);
            default:
                MainTabFragment mainTabFragment5 = (MainTabFragment) objArr[0];
                boolean zBooleanValue5 = ((Boolean) objArr[1]).booleanValue();
                Bundle bundle3 = (Bundle) objArr[2];
                boolean zBooleanValue6 = ((Boolean) objArr[3]).booleanValue();
                boolean zBooleanValue7 = ((Boolean) objArr[4]).booleanValue();
                boolean zBooleanValue8 = ((Boolean) objArr[5]).booleanValue();
                getContentPaddingRight<Fragment> getcontentpaddingright3 = (getContentPaddingRight) objArr[6];
                getInterfaceDescriptor getinterfacedescriptor2 = (access13800) objArr[7];
                int i44 = 2 % 2;
                if (getinterfacedescriptor2 instanceof getInterfaceDescriptor) {
                    getinterfacedescriptor = getinterfacedescriptor2;
                    int i45 = getinterfacedescriptor.label;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        int i46 = onUnminimized + 9;
                        onRelationshipValidationResult = i46 % 128;
                        if (i46 % 2 != 0) {
                            getinterfacedescriptor.label = i45 >> Integer.MIN_VALUE;
                        } else {
                            getinterfacedescriptor.label = i45 - 2147483648;
                        }
                    } else {
                        getinterfacedescriptor = mainTabFragment5.new getInterfaceDescriptor(getinterfacedescriptor2);
                    }
                }
                Object obj2 = getinterfacedescriptor.result;
                Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
                int i47 = getinterfacedescriptor.label;
                if (i47 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    int iOnExtraCallbackWithResult = mainTabFragment5.access000().onExtraCallbackWithResult(13);
                    Fragment fragmentOnExtraCallbackWithResult = mainTabFragment5.onExtraCallbackWithResult(13);
                    isUserSubjectToGDPR isusersubjecttogdpr = isUserSubjectToGDPR.onWarmupCompleted;
                    getinterfacedescriptor.L$0 = bundle3;
                    getinterfacedescriptor.L$1 = getcontentpaddingright3;
                    getinterfacedescriptor.L$2 = fragmentOnExtraCallbackWithResult;
                    getinterfacedescriptor.Z$0 = zBooleanValue5;
                    getinterfacedescriptor.Z$1 = zBooleanValue6;
                    getinterfacedescriptor.Z$2 = zBooleanValue7;
                    getinterfacedescriptor.Z$3 = zBooleanValue8;
                    getinterfacedescriptor.I$0 = iOnExtraCallbackWithResult;
                    getinterfacedescriptor.label = 1;
                    if (isusersubjecttogdpr.IAuthTabCallback(getinterfacedescriptor) == objOnWarmupCompleted2) {
                        return objOnWarmupCompleted2;
                    }
                    z = zBooleanValue5;
                    getcontentpaddingright = getcontentpaddingright3;
                    z2 = zBooleanValue8;
                    bundle = bundle3;
                    z3 = zBooleanValue7;
                    i7 = iOnExtraCallbackWithResult;
                    fragment = fragmentOnExtraCallbackWithResult;
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i48 = onUnminimized + 33;
                    onRelationshipValidationResult = i48 % 128;
                    int i49 = i48 % 2;
                    int i50 = getinterfacedescriptor.I$0;
                    boolean z4 = getinterfacedescriptor.Z$3;
                    boolean z5 = getinterfacedescriptor.Z$2;
                    zBooleanValue6 = getinterfacedescriptor.Z$1;
                    boolean z6 = getinterfacedescriptor.Z$0;
                    fragment = (Fragment) getinterfacedescriptor.L$2;
                    getContentPaddingRight<Fragment> getcontentpaddingright4 = (getContentPaddingRight) getinterfacedescriptor.L$1;
                    Bundle bundle4 = (Bundle) getinterfacedescriptor.L$0;
                    ResultKt.onNavigationEvent(obj2);
                    i7 = i50;
                    z2 = z4;
                    z3 = z5;
                    z = z6;
                    bundle = bundle4;
                    getcontentpaddingright = getcontentpaddingright4;
                }
                if (mainTabFragment5.mayLaunchUrl()) {
                    ((CacheStrategy) onWarmupCompleted(-433573469, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 433573495, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{mainTabFragment5}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).onWarmupCompleted();
                }
                mainTabFragment5.onExtraCallback(13, i7, z, !(zBooleanValue6 ^ true) || (fragment != null && !(fragment instanceof setDisableNetworkData)), bundle, z3, z2, getcontentpaddingright);
                return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = onUnminimized + 63;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        int i4 = onUnminimized + 95;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ExtHubExtensionManager onWarmupCompleted(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 97;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        ExtHubExtensionManager typedObject = readTypedObject(mainTabFragment);
        int i4 = onUnminimized + 27;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return typedObject;
    }

    public static /* synthetic */ boolean onWarmupCompleted(MainTabFragment mainTabFragment, View view) {
        int i = 2 % 2;
        int i2 = onUnminimized + 101;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(mainTabFragment, view);
        int i4 = onRelationshipValidationResult + 33;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return zOnNavigationEvent;
    }

    public static /* synthetic */ boolean onWarmupCompleted(Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 33;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = onTransact(obj);
        int i4 = onRelationshipValidationResult + 115;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnTransact;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 47;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = onRelationshipValidationResult + 107;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 51;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final class ICustomTabsCallback extends Lambda implements Function0<Fragment> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallback(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return fragmentOnExtraCallbackWithResult;
        }

        public final Fragment onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            if (i3 == 0) {
                int i4 = 92 / 0;
            }
            return fragment;
        }
    }

    public static final class extraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCallbackWithResult(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            if (i3 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback();
            int i3 = onWarmupCompleted + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback;
        }
    }

    public static final class extraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCallback(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent = onNavigationEvent();
            int i4 = IAuthTabCallback + 91;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onNavigationEvent() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i5 = i2 + 79;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i7 = onWarmupCompleted + 63;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null) {
                return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            }
            int i9 = IAuthTabCallback + 45;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
        }
    }

    public static final class writeTypedObject extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public writeTypedObject(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
            int i4 = IAuthTabCallback + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final /* synthetic */ Fragment IAuthTabCallback(MainTabFragment mainTabFragment, int i) {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 35;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        Fragment fragmentOnExtraCallbackWithResult = mainTabFragment.onExtraCallbackWithResult(i);
        int i5 = onUnminimized + 123;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return fragmentOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ View IAuthTabCallbackDefault(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 43;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        View view = mainTabFragment.IAuthTabCallbackStubProxy;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 27;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        Set<Integer> set = (Set) objArr[1];
        int i = 2 % 2;
        int i2 = onUnminimized + 23;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.onExtraCallbackWithResult(set);
        int i4 = onRelationshipValidationResult + 53;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return null;
    }

    public static final /* synthetic */ AFg1tSDK4 IAuthTabCallbackStubProxy(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onUnminimized + 109;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        AFg1tSDK4 aFg1tSDK4 = mainTabFragment.IAuthTabCallback_Parcel;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 71;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return aFg1tSDK4;
    }

    public static final /* synthetic */ getNumberOfCores IAuthTabCallback_Parcel(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 61;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return mainTabFragment.newSessionWithExtras();
        }
        mainTabFragment.newSessionWithExtras();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ makeExtension access000(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 67;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        makeExtension makeextension = mainTabFragment.getInterfaceDescriptor;
        int i5 = i2 + 85;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return makeextension;
    }

    public static final /* synthetic */ getPackageType access100(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onUnminimized + 41;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = mainTabFragment.extraCallback;
        if (i3 == 0) {
            return getpackagetype;
        }
        throw null;
    }

    public static final /* synthetic */ Set asBinder(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onUnminimized + 119;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        Set<Integer> set = mainTabFragment.IAuthTabCallbackStub;
        int i5 = i3 + 45;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return set;
    }

    public static final /* synthetic */ ExtHubExtensionManager getInterfaceDescriptor(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 61;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        ExtHubExtensionManager extHubExtensionManagerIsEngagementSignalsApiAvailable = mainTabFragment.isEngagementSignalsApiAvailable();
        int i4 = onRelationshipValidationResult + 85;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return extHubExtensionManagerIsEngagementSignalsApiAvailable;
    }

    public static final /* synthetic */ void onExtraCallback(MainTabFragment mainTabFragment, View view) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 121;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        mainTabFragment.IAuthTabCallbackStubProxy = view;
        int i5 = i2 + 113;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(MainTabFragment mainTabFragment, Set set) {
        int i = 2 % 2;
        int i2 = onUnminimized + 89;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.IAuthTabCallbackStub = set;
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 103;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = mainTabFragment.ICustomTabsCallback_Parcel();
        int i4 = onRelationshipValidationResult + 27;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return extHubLoggerImplICustomTabsCallback_Parcel;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        drawTextProgressSize drawtextprogresssize = (drawTextProgressSize) objArr[1];
        int i = 2 % 2;
        int i2 = onUnminimized + 55;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        mainTabFragment.readTypedObject = drawtextprogresssize;
        int i5 = i3 + 117;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ void onWarmupCompleted(MainTabFragment mainTabFragment, TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 87;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.onExtraCallbackWithResult(tabBarItemView);
        int i4 = onUnminimized + 59;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public MainTabFragment() {
        super(R.layout.fragment_main_tab);
        this.onWarmupCompleted = preFillDefault.IAuthTabCallback(this, onExtraCallbackWithResult.IAuthTabCallback);
        this.IAuthTabCallbackDefault = 1.0f;
        this.onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new MainTabFragment$.ExternalSyntheticLambda31(this));
        MainTabFragment$.ExternalSyntheticLambda32 externalSyntheticLambda32 = new MainTabFragment$.ExternalSyntheticLambda32();
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new extraCallbackWithResult(new ICustomTabsCallback(this)));
        this.onActivityLayout = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(getNumberOfCores.class), new writeTypedObject(lazyOnNavigationEvent), new extraCallback(null, lazyOnNavigationEvent), externalSyntheticLambda32);
        this.extraCallbackWithResult = access8100.onNavigationEvent();
        this.IAuthTabCallbackStub = clearFaultAdjacentMetadata.onExtraCallback();
        this.asInterface = onPageExit.onNavigationEvent(this, new MainTabFragment$.ExternalSyntheticLambda33(this));
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new MainTabFragment$.ExternalSyntheticLambda34(this));
        this.writeTypedObject = LazyKt.onExtraCallbackWithResult(new MainTabFragment$.ExternalSyntheticLambda35(this));
        this.access000 = LazyKt.onExtraCallbackWithResult(new MainTabFragment$.ExternalSyntheticLambda36(this));
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, ExtHubLoggerImpl> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 59;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        onExtraCallbackWithResult() {
            super(1, ExtHubLoggerImpl.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/main/ui/databinding/FragmentMainTabBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ExtHubLoggerImpl extHubLoggerImplOnWarmupCompleted = onWarmupCompleted((View) obj);
            if (i3 == 0) {
                int i4 = 77 / 0;
            }
            int i5 = onExtraCallback + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return extHubLoggerImplOnWarmupCompleted;
        }

        public final ExtHubLoggerImpl onWarmupCompleted(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return ExtHubLoggerImpl.onWarmupCompleted(view);
            }
            Intrinsics.checkNotNullParameter(view, "");
            int i3 = 14 / 0;
            return ExtHubLoggerImpl.onWarmupCompleted(view);
        }
    }

    private final ExtHubLoggerImpl ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onUnminimized + 9;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ExtHubLoggerImpl extHubLoggerImplOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent(this, onNavigationEvent[0]);
        int i4 = onUnminimized + 23;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return extHubLoggerImplOnNavigationEvent;
        }
        throw null;
    }

    public static final class onMessageChannelReady implements makeExtension.onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        onMessageChannelReady() {
        }

        public void IAuthTabCallback(boolean z, boolean z2) {
            AFg1tSDK4 aFg1tSDK4IAuthTabCallbackStubProxy;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                aFg1tSDK4IAuthTabCallbackStubProxy = MainTabFragment.IAuthTabCallbackStubProxy(MainTabFragment.this);
                int i3 = 5 / 0;
                if (aFg1tSDK4IAuthTabCallbackStubProxy == null) {
                    return;
                }
            } else {
                aFg1tSDK4IAuthTabCallbackStubProxy = MainTabFragment.IAuthTabCallbackStubProxy(MainTabFragment.this);
                if (aFg1tSDK4IAuthTabCallbackStubProxy == null) {
                    return;
                }
            }
            AFg1tSDK4.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2045702474, new Object[]{aFg1tSDK4IAuthTabCallbackStubProxy, Boolean.valueOf(z), Boolean.valueOf(z2)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -2045702473, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            int i4 = onWarmupCompleted + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onWarmupCompleted(String str, Map<String, ? extends Object> map) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            AFg1tSDK4 aFg1tSDK4IAuthTabCallbackStubProxy = MainTabFragment.IAuthTabCallbackStubProxy(MainTabFragment.this);
            if (aFg1tSDK4IAuthTabCallbackStubProxy != null) {
                int i2 = onExtraCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                aFg1tSDK4IAuthTabCallbackStubProxy.onWarmupCompleted(str, map);
                if (i3 == 0) {
                    throw null;
                }
            }
            int i4 = onWarmupCompleted + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 31;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady onmessagechannelready = (onMessageChannelReady) mainTabFragment.onMessageChannelReady.getValue();
        if (i3 == 0) {
            return onmessagechannelready;
        }
        throw null;
    }

    private static final onMessageChannelReady onActivityLayout(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        onMessageChannelReady onmessagechannelready = mainTabFragment.new onMessageChannelReady();
        int i2 = onRelationshipValidationResult + 73;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        return onmessagechannelready;
    }

    private final getNumberOfCores newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 41;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onActivityLayout.getValue();
        if (i3 != 0) {
            return (getNumberOfCores) value;
        }
        int i4 = 60 / 0;
        return (getNumberOfCores) value;
    }

    private static final ViewModelProvider.onWarmupCompleted updateVisuals() {
        int i = 2 % 2;
        getNumberOfCores.onExtraCallback onextracallback = new getNumberOfCores.onExtraCallback(allowAdditionalDecoder.onNavigationEvent);
        int i2 = onRelationshipValidationResult + 11;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return onextracallback;
        }
        throw null;
    }

    public final AFd1gSDK getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 71;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        AFd1gSDK aFd1gSDK = this.mainTabBarTrace;
        if (aFd1gSDK != null) {
            return aFd1gSDK;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onRelationshipValidationResult + 27;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final RunDevToolActionUseCase extraCallbackWithResult() {
        int i = 2 % 2;
        RunDevToolActionUseCase runDevToolActionUseCase = this.runDevToolAction;
        if (runDevToolActionUseCase != null) {
            int i2 = onUnminimized + 13;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 == 0) {
                return runDevToolActionUseCase;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = onUnminimized + 5;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 105;
        im.toss.features.main.ui.MainTabFragment.onRelationshipValidationResult = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzad IAuthTabCallback_Parcel() {
        zzad zzadVar;
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 125;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            zzadVar = this.environments;
            int i4 = 50 / 0;
        } else {
            zzadVar = this.environments;
        }
    }

    public final SessionTrackerb onActivityLayout() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 83;
        onUnminimized = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 77;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return sessionTrackerb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 119;
        im.toss.features.main.ui.MainTabFragment.onRelationshipValidationResult = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzag onPostMessage() {
        zzag zzagVar;
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 89;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            zzagVar = this.tossClock;
            int i4 = 11 / 0;
        } else {
            zzagVar = this.tossClock;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.features.main.ui.MainTabFragment.onRelationshipValidationResult + 73;
        im.toss.features.main.ui.MainTabFragment.onUnminimized = r1 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final createJSONObject access100() {
        createJSONObject createjsonobject;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 119;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            createjsonobject = this.bleScanManager;
            int i3 = 80 / 0;
        } else {
            createjsonobject = this.bleScanManager;
        }
    }

    public final removeTabBarModel asInterface() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 91;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        removeTabBarModel removetabbarmodel = this.airdropTermsManager;
        if (removetabbarmodel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 111;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 85;
        onUnminimized = i7 % 128;
        int i8 = i7 % 2;
        return removetabbarmodel;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 37;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc r8lambdacnf1cf_vta0zlqakxgouxmsc = mainTabFragment.agreedToAnyTermsUseCase;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        if (r8lambdacnf1cf_vta0zlqakxgouxmsc != null) {
            return r8lambdacnf1cf_vta0zlqakxgouxmsc;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onRelationshipValidationResult + 23;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return null;
    }

    public final openFd access000() {
        int i = 2 % 2;
        int i2 = onUnminimized + 21;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        openFd openfd = this.mainTabManager;
        if (openfd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 53;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return openfd;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.features.main.ui.MainTabFragment.onUnminimized + 43;
        im.toss.features.main.ui.MainTabFragment.onRelationshipValidationResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getClosedokhttp onActivityResized() {
        getClosedokhttp getclosedokhttp;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 79;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            getclosedokhttp = this.tossSecTabController;
            int i3 = 83 / 0;
        } else {
            getclosedokhttp = this.tossSecTabController;
        }
    }

    public final ExtHubPage writeTypedObject() {
        int i = 2 % 2;
        ExtHubPage extHubPage = this.tabFragmentProvider;
        if (extHubPage != null) {
            int i2 = onUnminimized + 11;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            return extHubPage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onRelationshipValidationResult + 95;
        onUnminimized = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements TabBar.onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static char[] onExtraCallback = {27352, 27518, 27519, 27490, 27492, 27492, 27489};
        private static int onWarmupCompleted;
        final /* synthetic */ ExtHubLoggerImpl onExtraCallbackWithResult;

        public static /* synthetic */ void onNavigationEvent(MainTabFragment mainTabFragment) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(mainTabFragment);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onExtraCallback;
            float f = 0.0f;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 36 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), 14239 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i7 = $11 + 91;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 65 - Drawable.resolveOpacity(0, 0), 16718 - TextUtils.indexOf("", ""), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i10 = $11 + 107;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 3 / 3;
                        }
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - (ViewConfiguration.getLongPressTimeout() >> 16), 17657 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49467), MotionEvent.axisFromString("") + 71, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                int i13 = $11 + 23;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i15 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i15, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i15);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i16 = $10 + 61;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        IAuthTabCallback(ExtHubLoggerImpl extHubLoggerImpl) {
            this.onExtraCallbackWithResult = extHubLoggerImpl;
        }

        private static final void onExtraCallback(MainTabFragment mainTabFragment) {
            int i = 2 % 2;
            if (mainTabFragment.isAdded()) {
                int i2 = IAuthTabCallback + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (mainTabFragment.getView() != null) {
                    View view = mainTabFragment.getView();
                    ViewParent parent = view != null ? view.getParent() : null;
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 != null) {
                        view2.requestApplyInsets();
                        int i4 = IAuthTabCallback + 37;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 3 % 5;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onExtraCallbackWithResult(final int i, boolean z) throws Throwable {
            TabBar tabBar;
            int i2 = 2 % 2;
            if (MainTabFragment.this.isAdded()) {
                MainTabFragment.this.ICustomTabsCallback().onExtraCallbackWithResult(i);
                int iOnExtraCallbackWithResult = MainTabFragment.this.access000().onExtraCallbackWithResult(i);
                int iOnExtraCallbackWithResult2 = this.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult();
                if (iOnExtraCallbackWithResult == iOnExtraCallbackWithResult2) {
                    getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new RVWebSocketManagerHolder(i) { // from class: o.RVWebSocketManagerHolder$IAuthTabCallback
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;
                        private final int onExtraCallback;

                        public boolean equals(@Nullable Object obj) {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 117;
                            int i5 = i4 % 128;
                            onWarmupCompleted = i5;
                            if (i4 % 2 == 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof RVWebSocketManagerHolder$IAuthTabCallback)) {
                                return false;
                            }
                            if (this.onExtraCallback == ((RVWebSocketManagerHolder$IAuthTabCallback) obj).onExtraCallback) {
                                return true;
                            }
                            int i6 = i5 + 123;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            int i8 = i5 + 53;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            return false;
                        }

                        public int hashCode() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 29;
                            onWarmupCompleted = i4 % 128;
                            int i5 = i4 % 2;
                            int iHashCode = Integer.hashCode(this.onExtraCallback);
                            int i6 = onNavigationEvent + 65;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            return iHashCode;
                        }

                        public String toString() {
                            int i3 = 2 % 2;
                            String str = "ReselectTabEvent(tabId=" + this.onExtraCallback + ")";
                            int i4 = onNavigationEvent + 85;
                            onWarmupCompleted = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 31 / 0;
                            }
                            return str;
                        }

                        {
                            this.onExtraCallback = i;
                        }

                        public /* bridge */ boolean IAuthTabCallback() {
                            int i3 = 2 % 2;
                            int i4 = onWarmupCompleted + 91;
                            onNavigationEvent = i4 % 128;
                            int i5 = i4 % 2;
                            boolean zIAuthTabCallback = super.IAuthTabCallback();
                            int i6 = onNavigationEvent + 87;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            return zIAuthTabCallback;
                        }

                        public /* bridge */ boolean onExtraCallback() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 9;
                            onWarmupCompleted = i4 % 128;
                            int i5 = i4 % 2;
                            boolean zOnExtraCallback = super.onExtraCallback();
                            int i6 = onWarmupCompleted + 57;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                return zOnExtraCallback;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public int onWarmupCompleted() {
                            int i3 = 2 % 2;
                            int i4 = onWarmupCompleted + 19;
                            int i5 = i4 % 128;
                            onNavigationEvent = i5;
                            if (i4 % 2 != 0) {
                                throw null;
                            }
                            int i6 = this.onExtraCallback;
                            int i7 = i5 + 3;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                            return i6;
                        }
                    });
                    int i3 = onWarmupCompleted + 71;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                MainTabFragment.this.ICustomTabsCallbackDefault();
                if (!z) {
                    int i5 = onWarmupCompleted + 25;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 86 / 0;
                        if (iOnExtraCallbackWithResult2 >= 0) {
                            int iOnExtraCallback = MainTabFragment.this.access000().onExtraCallback(iOnExtraCallbackWithResult2);
                            createClient createclient = createClient.onExtraCallback;
                            String strOnExtraCallback = createclient.onExtraCallback(iOnExtraCallback);
                            Object[] objArr = new Object[1];
                            a(new int[]{0, 7, 190, 0}, true, new byte[]{0, 1, 0, 1, 1, 1, 1}, objArr);
                            String strIntern = ((String) objArr[0]).intern();
                            if (strOnExtraCallback == null) {
                                Object[] objArr2 = new Object[1];
                                a(new int[]{0, 7, 190, 0}, true, new byte[]{0, 1, 0, 1, 1, 1, 1}, objArr2);
                                strOnExtraCallback = ((String) objArr2[0]).intern();
                            }
                            String strOnExtraCallback2 = createclient.onExtraCallback(i);
                            if (strOnExtraCallback2 != null) {
                                strIntern = strOnExtraCallback2;
                            }
                            MainTabFragment mainTabFragment = MainTabFragment.this;
                            MainTabFragment.onWarmupCompleted(827821497, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -827821496, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{mainTabFragment, ((getTextProgressMargin) MainTabFragment.onWarmupCompleted(1215747073, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1215747065, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).onExtraCallback(i, strOnExtraCallback, strIntern)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                            MainTabFragment.getInterfaceDescriptor(MainTabFragment.this).onNavigationEvent(i);
                        } else if (iOnExtraCallbackWithResult2 < 0) {
                            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "MainTabFragment", "onTabSelect called before FragmentSwitcher initialized (lastPosition=" + iOnExtraCallbackWithResult2 + ", tabId=" + i + ")", (Throwable) null, (Map) null, 12, (Object) null);
                            int i7 = onWarmupCompleted + 27;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 5 / 2;
                            }
                        }
                    } else if (iOnExtraCallbackWithResult2 >= 0) {
                    }
                }
                MainTabFragment.onWarmupCompleted(-933651327, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 933651332, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{MainTabFragment.this, Integer.valueOf(i), Boolean.valueOf(!z), MainTabFragment.this.getArguments(), false, false, true, null, 64, null}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                ExtHubLoggerImpl extHubLoggerImpl = this.onExtraCallbackWithResult;
                if (extHubLoggerImpl != null && (tabBar = extHubLoggerImpl.IAuthTabCallback) != null) {
                    tabBar.post(new MainTabFragment$generateTabs$2$.ExternalSyntheticLambda0(MainTabFragment.this));
                    int i9 = IAuthTabCallback + 19;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                }
                getNumberOfCores.onExtraCallback(MainTabFragment.IAuthTabCallback_Parcel(MainTabFragment.this), i, 0L, 2, (Object) null);
            }
        }
    }

    public final generatorFDId onMinimized() {
        int i = 2 % 2;
        generatorFDId generatorfdid = this.teensMainTabProvider;
        if (generatorfdid != null) {
            int i2 = onRelationshipValidationResult + 99;
            onUnminimized = i2 % 128;
            if (i2 % 2 != 0) {
                return generatorfdid;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = onUnminimized + 13;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = ICustomTabsCallbackDefault;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 35;
                $11 = i8 % 128;
                if (i8 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 35283), 35 - TextUtils.indexOf("", ""), 14238 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16741933) - Color.rgb(0, 0, 0)), Process.getGidForName("") + 36, KeyEvent.getDeadChar(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i = 2;
                f = 0.0f;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i9 = $11 + 53;
                $10 = i9 % 128;
                if (i9 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 29 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf("", "", 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = $11 + 109;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 10935), 64 - Process.getGidForName(""), View.getDefaultSize(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 70, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i15 = $10 + 109;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final getBillingPeriod extraCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 99;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        getBillingPeriod getbillingperiod = this.regionManager;
        if (getbillingperiod == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 99;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return getbillingperiod;
    }

    private final boolean mayLaunchUrl() {
        int i = 2 % 2;
        if (((Boolean) isUserSubjectToGDPR.onNavigationEvent(new Object[]{isUserSubjectToGDPR.onWarmupCompleted}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 655245496, -655245488, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).booleanValue()) {
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            if (((CacheStrategy) onWarmupCompleted(-433573469, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 433573495, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).onExtraCallback()) {
                int i2 = onUnminimized + 37;
                onRelationshipValidationResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
        }
        int i4 = onUnminimized + 59;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return false;
    }

    private static final Unit onNavigationEvent(MainTabFragment mainTabFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 27;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Object[] objArr = {mainTabFragment.extraCommand()};
        getApiName.onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -21584734, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 21584734, objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = onRelationshipValidationResult + 63;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final getApiName extraCommand() {
        getApiName getapiname;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 81;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            getapiname = (getApiName) this.onExtraCallbackWithResult.getValue();
            int i3 = 7 / 0;
        } else {
            getapiname = (getApiName) this.onExtraCallbackWithResult.getValue();
        }
        int i4 = onUnminimized + 43;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return getapiname;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        removeTabBarModel removetabbarmodelAsInterface = mainTabFragment.asInterface();
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        getApiName getapiname = new getApiName(mainTabFragment, removetabbarmodelAsInterface, (r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc) onWarmupCompleted(1635099486, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1635099473, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()), mainTabFragment.access100(), mainTabFragment.IAuthTabCallback_Parcel(), mainTabFragment.asInterface);
        int i2 = onUnminimized + 107;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        return getapiname;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[PHI: r11
      0x0081: PHI (r11v7 byte[] A[IMMUTABLE_TYPE]) = (r11v6 byte[]), (r11v11 byte[]) binds: [B:18:0x007f, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        char c;
        byte[] bArr;
        int length;
        byte[] bArr2;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onMinimized)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getTouchSlop() >> 8) + 42, 22439 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $11;
                int i7 = i6 + 35;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    bArr = ICustomTabsCallbackStub;
                    int i8 = 30 / 0;
                    if (bArr != null) {
                        int i9 = i6 + 59;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            length = bArr.length;
                            bArr2 = new byte[length];
                        } else {
                            length = bArr.length;
                            bArr2 = new byte[length];
                        }
                        for (int i10 = 0; i10 < length; i10++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = (byte) (b2 - 1);
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12843), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 55, 2167 - View.combineMeasuredStates(0, 0), -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        byte[] bArr3 = ICustomTabsCallbackStub;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onPostMessage)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43423), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onMinimized ^ (-4629411779493505016L))));
                        int i11 = $11 + 105;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (ICustomTabsCallbackStubProxy[i + ((int) (onPostMessage ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onMinimized ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = ICustomTabsCallbackStub;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onPostMessage ^ j)) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onActivityResized), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), Color.alpha(0) + 86, (ViewConfiguration.getTapTimeout() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = ICustomTabsCallbackStub;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i14 = $10 + 83;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            byte[] bArr6 = ICustomTabsCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent % 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback >>> (((byte) (((byte) (bArr6[r8] * (-4629411779493505016L))) / s)) ^ b));
                        } else {
                            byte[] bArr7 = ICustomTabsCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                    } else {
                        short[] sArr = ICustomTabsCallbackStubProxy;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private final ExtHubEventContext ICustomTabsService() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 97;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        ExtHubEventContext extHubEventContext = (ExtHubEventContext) this.writeTypedObject.getValue();
        int i4 = onUnminimized + 37;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return extHubEventContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = 67 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 13;
        im.toss.features.main.ui.MainTabFragment.onRelationshipValidationResult = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExtHubRVEngine ICustomTabsCallback() {
        ExtHubRVEngine extHubRVEngine;
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 117;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            extHubRVEngine = this.tabBarBubbleHelper;
            int i4 = 70 / 0;
        } else {
            extHubRVEngine = this.tabBarBubbleHelper;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 123;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        getTextProgressMargin gettextprogressmargin = mainTabFragment.tabSwitchTracer;
        if (gettextprogressmargin != null) {
            int i5 = i2 + 121;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            return gettextprogressmargin;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = onRelationshipValidationResult + 113;
        onUnminimized = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r4 = im.toss.features.main.ui.MainTabFragment.onUnminimized + 7;
        im.toss.features.main.ui.MainTabFragment.onRelationshipValidationResult = r4 % 128;
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 123;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        adOpenedFullscreen adopenedfullscreen = mainTabFragment.lcpSessionRegistry;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
    }

    private final ExtHubExtensionManager isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = onUnminimized + 87;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ExtHubExtensionManager extHubExtensionManager = (ExtHubExtensionManager) this.access000.getValue();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return extHubExtensionManager;
    }

    private static final ExtHubExtensionManager readTypedObject(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        getTextProgressMargin gettextprogressmargin = (getTextProgressMargin) onWarmupCompleted(1215747073, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1215747065, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        ExtHubExtensionManager extHubExtensionManager = new ExtHubExtensionManager(gettextprogressmargin, (adOpenedFullscreen) onWarmupCompleted(839820304, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -839820302, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()), new MainTabFragment$.ExternalSyntheticLambda37(mainTabFragment));
        int i2 = onRelationshipValidationResult + 13;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        return extHubExtensionManager;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Integer intOrNull;
        Object obj;
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        Fragment fragment = (Fragment) objArr[1];
        int i = 2 % 2;
        int i2 = onUnminimized + 49;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            fragment.getTag();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        String tag = fragment.getTag();
        if (tag == null || (intOrNull = StringsKt.toIntOrNull(tag)) == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Integer.valueOf(mainTabFragment.access000().onExtraCallback(iIntValue)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Integer num = (Integer) (Result.onExtraCallback(obj) ? null : obj);
        int i3 = onUnminimized + 77;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        return num;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        if (bundle != null) {
            int i2 = onUnminimized + 69;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 == 0) {
                bundle.remove("android:support:fragments");
                int i3 = onUnminimized + 71;
                onRelationshipValidationResult = i3 % 128;
                int i4 = i3 % 2;
            } else {
                bundle.remove("android:support:fragments");
                throw null;
            }
        } else {
            bundle = null;
        }
        super.onCreate(bundle);
        getApiName.onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -21584734, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 21584734, new Object[]{extraCommand()}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static final class asInterface implements AFg1tSDK4.onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        asInterface() {
        }

        public /* bridge */ void onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback();
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            FragmentActivity activity = MainTabFragment.this.getActivity();
            if (activity != null) {
                int i2 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Window window = activity.getWindow();
                if (window != null) {
                    int i4 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    window.setSoftInputMode(48);
                    int i6 = onExtraCallbackWithResult + 93;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }

        public void onWarmupCompleted() {
            int i = 2 % 2;
            FragmentActivity activity = MainTabFragment.this.getActivity();
            if (activity != null) {
                int i2 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Window window = activity.getWindow();
                if (window != null) {
                    int i4 = IAuthTabCallback + 73;
                    onExtraCallbackWithResult = i4 % 128;
                    window.setSoftInputMode(i4 % 2 != 0 ? 105 : 16);
                }
            }
            int i5 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements AFg1tSDK4.onWarmupCompleted {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        IAuthTabCallbackStubProxy() {
        }

        public void IAuthTabCallback(String str, Map<String, ? extends Object> map) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                if (MainTabFragment.this.access000().onExtraCallback() != 47) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                if (MainTabFragment.this.access000().onExtraCallback() != 13) {
                    return;
                }
            }
            AFd1mSDK.onWarmupCompleted("main_tab_bar_visibility", access8100.onWarmupCompleted(map, access8100.onNavigationEvent(getWrite.IAuthTabCallback("event", str))), false, (Function1) null, 12, (Object) null);
            int i3 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }

        public void onNavigationEvent(String str, Map<String, ? extends Object> map) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            MainTabFragment.this.getInterfaceDescriptor().onNavigationEvent(str, map);
            int i4 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        TabBar tabBar;
        FrameLayout frameLayout;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ExtHubExtensionManager extHubExtensionManagerIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        extHubExtensionManagerIsEngagementSignalsApiAvailable.IAuthTabCallback(childFragmentManager, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner));
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel != null) {
            int i2 = onRelationshipValidationResult + 43;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback;
        } else {
            tabBar = null;
        }
        if (tabBar == null) {
            if (IAuthTabCallback_Parcel().onActivityLayout() || IAuthTabCallback_Parcel().RemoteActionCompatParcelizer()) {
                throw new IllegalStateException("bottomBar must not be null in onViewCreated");
            }
            return;
        }
        this.IAuthTabCallback_Parcel = new AFg1tSDK4(tabBar, new asInterface(), new IAuthTabCallbackStubProxy());
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel2 = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel2 != null && (frameLayout = extHubLoggerImplICustomTabsCallback_Parcel2.onNavigationEvent) != null) {
            ICustomTabsCallback().IAuthTabCallback(frameLayout, tabBar);
        }
        this.getInterfaceDescriptor = new makeExtension(this, (onMessageChannelReady) onWarmupCompleted(-66948778, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 66948795, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()), getInterfaceDescriptor(), false, 8, (DefaultConstructorMarker) null);
        prefetchWithMultipleUrls();
        onWarmupCompleted(-806058834, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 806058853, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, bundle}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        onWarmupCompleted(-279034121, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 279034130, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        requestPostMessageChannelWithExtras();
        postMessage();
        onWarmupCompleted(-923176973, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 923176987, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        newSession();
        ICustomTabsService().onNavigationEvent();
        int i4 = onUnminimized + 15;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 27;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStart();
            ICustomTabsCallback().onExtraCallbackWithResult();
            ExtHubRVEngine.onNavigationEvent(ICustomTabsCallback(), access000().onExtraCallback(), true, 3, (Object) null);
        } else {
            super.onStart();
            ICustomTabsCallback().onExtraCallbackWithResult();
            ExtHubRVEngine.onNavigationEvent(ICustomTabsCallback(), access000().onExtraCallback(), false, 2, (Object) null);
        }
        int i3 = onUnminimized + 97;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = onUnminimized + 79;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStop();
            ICustomTabsCallback().onNavigationEvent();
            int i3 = 96 / 0;
        } else {
            super.onStop();
            ICustomTabsCallback().onNavigationEvent();
        }
    }

    public void onDestroyView() {
        TabBar tabBar;
        FragmentSwitcher fragmentSwitcher;
        int i = 2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel != null && (fragmentSwitcher = extHubLoggerImplICustomTabsCallback_Parcel.onExtraCallbackWithResult) != null) {
            int i2 = onUnminimized + 7;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            fragmentSwitcher.onExtraCallback();
        }
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel2 = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel2 != null && (tabBar = extHubLoggerImplICustomTabsCallback_Parcel2.IAuthTabCallback) != null) {
            tabBar.extraCallback();
        }
        AFg1tSDK4 aFg1tSDK4 = this.IAuthTabCallback_Parcel;
        if (aFg1tSDK4 != null) {
            int i4 = onRelationshipValidationResult + 123;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            aFg1tSDK4.onNavigationEvent();
        }
        this.IAuthTabCallback_Parcel = null;
        this.getInterfaceDescriptor = null;
        ((CacheStrategy) onWarmupCompleted(-433573469, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 433573495, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).onExtraCallbackWithResult();
        isUserSubjectToGDPR.onWarmupCompleted.access000();
        ICustomTabsService().onExtraCallbackWithResult();
        ICustomTabsCallback().onWarmupCompleted();
        this.IAuthTabCallbackStubProxy = null;
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[PHI: r2
      0x002e: PHI (r2v6 im.toss.uikit.widget.TabBar) = (r2v5 im.toss.uikit.widget.TabBar), (r2v17 im.toss.uikit.widget.TabBar) binds: [B:10:0x002c, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access000(Object[] objArr) {
        TabBar tabBar;
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 59;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = mainTabFragment.ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel != null) {
            int i4 = onRelationshipValidationResult + 97;
            onUnminimized = i4 % 128;
            if (i4 % 2 == 0) {
                tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback;
                int i5 = 40 / 0;
                if (tabBar != null) {
                    int i6 = onRelationshipValidationResult + 43;
                    onUnminimized = i6 % 128;
                    Object obj = null;
                    if (i6 % 2 == 0) {
                        Integer.valueOf(tabBar.getInterfaceDescriptor()).intValue();
                        obj.hashCode();
                        throw null;
                    }
                    Integer numValueOf = Integer.valueOf(tabBar.getInterfaceDescriptor());
                    if (numValueOf.intValue() == -1) {
                        int i7 = onRelationshipValidationResult + 91;
                        onUnminimized = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 4 / 4;
                        }
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        ExtHubRVEngine.onNavigationEvent(mainTabFragment.ICustomTabsCallback(), numValueOf.intValue(), false, 2, (Object) null);
                    }
                }
            } else {
                tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback;
                if (tabBar != null) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onBackPressed() {
        TabBar tabBar;
        BaseFragment baseFragment;
        boolean zOnExtraCallback;
        FragmentActivity activity;
        int i = 2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel == null || (tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback) == null) {
            return false;
        }
        int interfaceDescriptor = tabBar.getInterfaceDescriptor();
        BaseFragment baseFragmentOnExtraCallback = onExtraCallback();
        Object obj = null;
        if (baseFragmentOnExtraCallback instanceof BaseFragment) {
            int i2 = onUnminimized + 93;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            baseFragment = baseFragmentOnExtraCallback;
        } else {
            baseFragment = null;
        }
        if (baseFragment != null) {
            int i3 = onUnminimized + 95;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            if (baseFragment.onBackPressed()) {
                zOnExtraCallback = true;
            } else if (interfaceDescriptor != 17 || (activity = getActivity()) == null || !StreamPointComponentOverlayView.Companion.onWarmupCompleted(activity)) {
                if (access000().onExtraCallback() == 13 && (onExtraCallbackWithResult(13) instanceof setDisableNetworkData) && interfaceDescriptor == 13) {
                    int i5 = onUnminimized + 63;
                    onRelationshipValidationResult = i5 % 128;
                    int i6 = i5 % 2;
                    AFg1tSDK4 aFg1tSDK4 = this.IAuthTabCallback_Parcel;
                    if (aFg1tSDK4 != null) {
                        zOnExtraCallback = AFg1tSDK4.onExtraCallback(aFg1tSDK4, (Integer) null, new MainTabFragment$.ExternalSyntheticLambda28(this), 1, (Object) null);
                    }
                } else {
                    zOnExtraCallback = false;
                }
            }
        }
        if (!zOnExtraCallback) {
            int i7 = onUnminimized + 19;
            onRelationshipValidationResult = i7 % 128;
            if (i7 % 2 != 0) {
                ((Boolean) onWarmupCompleted(-1089017799, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1089017814, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).booleanValue();
                obj.hashCode();
                throw null;
            }
            zOnExtraCallback = ((Boolean) onWarmupCompleted(-1089017799, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1089017814, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).booleanValue();
        }
        if (!zOnExtraCallback) {
            int i8 = onRelationshipValidationResult + 5;
            onUnminimized = i8 % 128;
            int i9 = i8 % 2;
            if (!super.onBackPressed()) {
                int i10 = onRelationshipValidationResult + 69;
                onUnminimized = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
        }
        return true;
    }

    public final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 79;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        TdsToastV1 tdsToastV1 = this.asBinder;
        if (tdsToastV1 == null || !tdsToastV1.asInterface()) {
            return;
        }
        int i4 = onRelationshipValidationResult + 35;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        tdsToastV1.onExtraCallback();
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        Object obj;
        long jCurrentTimeMillis;
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        TdsToastV1 tdsToastV1 = mainTabFragment.asBinder;
        Object obj2 = null;
        if (tdsToastV1 != null) {
            int i2 = onUnminimized + 81;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            if (tdsToastV1 == null || tdsToastV1.asInterface()) {
                if (mainTabFragment.access100 > 0) {
                    int i4 = onRelationshipValidationResult + 67;
                    onUnminimized = i4 % 128;
                    if (i4 % 2 == 0) {
                        jCurrentTimeMillis = (System.currentTimeMillis() / mainTabFragment.access100) & 1000;
                        obj = "hash";
                    } else {
                        obj = "hash";
                        jCurrentTimeMillis = (System.currentTimeMillis() - mainTabFragment.access100) / 1000;
                    }
                } else {
                    obj = "hash";
                    jCurrentTimeMillis = 0;
                }
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                a((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 75), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 278387858, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 119341801, (-97) - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a((short) ((-56) - TextUtils.indexOf("", "", 0)), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 278387944, TextUtils.indexOf("", "", 0) - 119341807, (-96) - (Process.myTid() >> 22), objArr3);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "ExitEventually", String.valueOf(jCurrentTimeMillis), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(strIntern, ((String) objArr3[0]).intern()), getWrite.IAuthTabCallback("backPressedTimeMillis", Long.valueOf(mainTabFragment.onTransact)), getWrite.IAuthTabCallback(obj, Integer.valueOf(mainTabFragment.hashCode())), getWrite.IAuthTabCallback("increasedAppUsageTime", Long.valueOf(jCurrentTimeMillis))}), (String) null, false, (String) null, 56, (Object) null);
                int i5 = onRelationshipValidationResult + 61;
                onUnminimized = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        mainTabFragment.onTransact = jCurrentTimeMillis2;
        if (mainTabFragment.access100 == 0) {
            mainTabFragment.access100 = jCurrentTimeMillis2;
        }
        FragmentActivity fragmentActivityRequireActivity = mainTabFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        String string = mainTabFragment.getString(R$string.main_ui_toast_handle_back_key);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsToastV1.onNavigationEvent onNavigationEvent2 = TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(fragmentActivityRequireActivity, string), R.drawable.icn_success_color, 0, 2, (Object) null);
        DisplayMetrics displayMetrics = mainTabFragment.requireActivity().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        TdsToastV1 tdsToastV12 = (TdsToastV1) TdsToastV1.onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), -950699249, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{onNavigationEvent2.IAuthTabCallback(varyMatches.onNavigationEvent(78, displayMetrics))}, 950699257, a.3.onWarmupCompleted());
        tdsToastV12.IAuthTabCallback(1);
        tdsToastV12.asBinder(2000);
        tdsToastV12.IAuthTabCallback_Parcel();
        mainTabFragment.asBinder = tdsToastV12;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr4 = new Object[1];
        a((short) (Gravity.getAbsoluteGravity(0, 0) + 75), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (Process.myTid() >> 22) + 278387859, (-119341800) - (ViewConfiguration.getEdgeSlop() >> 16), (-96) - TextUtils.indexOf("", "", 0), objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a((short) ((-56) - TextUtils.getOffsetAfter("", 0)), (byte) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 278387943, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 119341808, (-97) - TextUtils.lastIndexOf("", '0'), objArr5);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "ExitBlocked", (String) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(strIntern2, ((String) objArr5[0]).intern()), getWrite.IAuthTabCallback("backPressedTimeMillis", Long.valueOf(mainTabFragment.onTransact)), getWrite.IAuthTabCallback("hash", Integer.valueOf(mainTabFragment.hashCode()))}), (String) null, false, (String) null, 58, (Object) null);
        return true;
    }

    private final Fragment onExtraCallbackWithResult(int i) {
        int iOnExtraCallbackWithResult;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel;
        int i2 = 2 % 2;
        int i3 = onUnminimized + 51;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            iOnExtraCallbackWithResult = access000().onExtraCallbackWithResult(i);
            extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
            int i4 = 90 / 0;
            if (extHubLoggerImplICustomTabsCallback_Parcel == null) {
                return null;
            }
        } else {
            iOnExtraCallbackWithResult = access000().onExtraCallbackWithResult(i);
            extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
            if (extHubLoggerImplICustomTabsCallback_Parcel == null) {
                return null;
            }
        }
        FragmentSwitcher fragmentSwitcher = extHubLoggerImplICustomTabsCallback_Parcel.onExtraCallbackWithResult;
        if (fragmentSwitcher == null) {
            return null;
        }
        int i5 = onRelationshipValidationResult + 69;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return fragmentSwitcher.onWarmupCompleted(childFragmentManager, iOnExtraCallbackWithResult);
    }

    public Fragment onExtraCallback() {
        int i = 2 % 2;
        int i2 = onUnminimized + 25;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel == null) {
            return null;
        }
        Fragment fragmentOnExtraCallbackWithResult = onExtraCallbackWithResult(extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback.getInterfaceDescriptor());
        int i4 = onRelationshipValidationResult + 97;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return fragmentOnExtraCallbackWithResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return r1.getInterfaceDescriptor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onTransact() {
        int i = 2 % 2;
        int i2 = onUnminimized + 55;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel != null) {
            int i4 = onUnminimized + 67;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            TabBar tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback;
            if (i5 != 0) {
                int i6 = 2 / 0;
            }
        }
        int i7 = onUnminimized + 61;
        onRelationshipValidationResult = i7 % 128;
        if (i7 % 2 == 0) {
            return -1;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        if (((MainTabFragment) objArr[0]).access000().onExtraCallback() == 55) {
            int i2 = onRelationshipValidationResult + 75;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onUnminimized + 63;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int IAuthTabCallback() {
        int i = 2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel != null) {
            int i2 = onRelationshipValidationResult + 121;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            TabBar tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback;
            if (tabBar != null) {
                int i4 = onUnminimized + 113;
                onRelationshipValidationResult = i4 % 128;
                int i5 = i4 % 2;
                return tabBar.getId();
            }
        }
        int i6 = R.id.bottomBar;
        int i7 = onUnminimized + 75;
        onRelationshipValidationResult = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final void onNavigationEvent(int i) {
        TabBar tabBar;
        int i2 = 2 % 2;
        int i3 = onUnminimized + 83;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel == null || (tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback) == null) {
            return;
        }
        int i5 = onUnminimized + 99;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            boolean z = tabBar.getLayoutParams() instanceof ViewGroup.MarginLayoutParams;
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = tabBar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null || marginLayoutParams.bottomMargin == i) {
            return;
        }
        int i6 = onUnminimized + 39;
        onRelationshipValidationResult = i6 % 128;
        int i7 = i6 % 2;
        marginLayoutParams.bottomMargin = i;
        tabBar.setLayoutParams(marginLayoutParams);
    }

    public final void onExtraCallback(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 49;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        setArguments(bundle);
        deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallback;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
        }
        IAuthTabCallback(getArguments());
        int i4 = onUnminimized + 9;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(MainTabFragment mainTabFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 19;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        int iOnNavigationEvent = mainTabFragment.access000().onNavigationEvent();
        Object[] objArr = {mainTabFragment, Integer.valueOf(iOnNavigationEvent), false, mainTabFragment.getArguments(), false, false, false, null, 120, null};
        onWarmupCompleted(-933651327, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 933651332, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 55;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final boolean access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 55;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ((Boolean) function1.invoke(obj)).booleanValue();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final boolean onExtraCallback(Boolean bool) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 3;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onRelationshipValidationResult + 73;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return zBooleanValue;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 69;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onRelationshipValidationResult + 99;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final boolean writeTypedObject(MainTabFragment mainTabFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 23;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (mainTabFragment.isAdded()) {
            mainTabFragment.IAuthTabCallback(mainTabFragment.getArguments());
        }
        int i4 = onRelationshipValidationResult + 97;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static final Unit IAuthTabCallback(MainTabFragment mainTabFragment, Boolean bool) {
        int i = 2 % 2;
        Looper.myQueue().addIdleHandler(new MainTabFragment$.ExternalSyntheticLambda38(mainTabFragment));
        Unit unit = Unit.INSTANCE;
        int i2 = onUnminimized + 29;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 89;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onRelationshipValidationResult + 35;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean onNavigationEvent(Boolean bool) {
        int i = 2 % 2;
        int i2 = onUnminimized + 9;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bool, "");
            bool.booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bool, "");
        boolean zBooleanValue = bool.booleanValue();
        int i3 = onRelationshipValidationResult + 7;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    private static final boolean writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 105;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = onRelationshipValidationResult + 79;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 47;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onRelationshipValidationResult + 43;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 7;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onRelationshipValidationResult + 111;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) throws Throwable {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 37;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.IAuthTabCallback(mainTabFragment.getArguments());
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private final void newSession() throws Throwable {
        boolean z;
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult;
        int i = 2 % 2;
        Bundle arguments = getArguments();
        boolean z2 = false;
        if (arguments == null || !arguments.getBoolean("im.toss.is_parent_activity_flag")) {
            z = false;
        } else {
            int i2 = onRelationshipValidationResult + 19;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        BaseActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
        if (baseActivity != null) {
            int i4 = onRelationshipValidationResult + 11;
            onUnminimized = i4 % 128;
            if (i4 % 2 == 0) {
                baseActivity.onActivityResized();
            } else if (baseActivity.onActivityResized()) {
            }
            z2 = true;
        }
        if (!z && !z2) {
            int i5 = onUnminimized + 73;
            onRelationshipValidationResult = i5 % 128;
            int i6 = i5 % 2;
            IAuthTabCallback(getArguments());
            return;
        }
        MainTabFragment$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new MainTabFragment$.ExternalSyntheticLambda1(this);
        if (z2) {
            getByteBuffer getbytebufferOnExtraCallback = getVisibleState().onWarmupCompleted(new MainTabFragment$.ExternalSyntheticLambda4(new MainTabFragment$.ExternalSyntheticLambda3())).onExtraCallback(1L);
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
            getByteBuffer getbytebufferOnExtraCallback2 = getbytebufferOnExtraCallback.onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback2, "");
            deserializeurinullablecollectionOnExtraCallbackWithResult = getbytebufferOnExtraCallback2.onExtraCallbackWithResult(new MainTabFragment$.ExternalSyntheticLambda6(new MainTabFragment$.ExternalSyntheticLambda5(this)), new MainTabFragment$.ExternalSyntheticLambda7(externalSyntheticLambda1));
        } else {
            getByteBuffer getbytebufferOnExtraCallback3 = getVisibleState().onExtraCallback(500L, TimeUnit.MILLISECONDS).onWarmupCompleted(new MainTabFragment$.ExternalSyntheticLambda9(new MainTabFragment$.ExternalSyntheticLambda8())).onExtraCallback(1L);
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback3, "");
            getByteBuffer getbytebufferOnExtraCallback4 = getbytebufferOnExtraCallback3.onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback4, "");
            deserializeurinullablecollectionOnExtraCallbackWithResult = getbytebufferOnExtraCallback4.onExtraCallbackWithResult(new MainTabFragment$.ExternalSyntheticLambda11(new MainTabFragment$.ExternalSyntheticLambda10(this)), new MainTabFragment$.ExternalSyntheticLambda2(externalSyntheticLambda1));
        }
        this.IAuthTabCallback = deserializeurinullablecollectionOnExtraCallbackWithResult;
        if (deserializeurinullablecollectionOnExtraCallbackWithResult != null) {
            int i7 = onRelationshipValidationResult + 27;
            onUnminimized = i7 % 128;
            int i8 = i7 % 2;
            autoDisposable(deserializeurinullablecollectionOnExtraCallbackWithResult);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void IAuthTabCallback(Bundle bundle) throws Throwable {
        String strIAuthTabCallback;
        int i = 2 % 2;
        getEventInstanceId.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = access000().onExtraCallbackWithResult(getContext(), bundle);
        if (!(onwarmupcompletedOnExtraCallbackWithResult instanceof getEventInstanceId.onWarmupCompleted)) {
            if (!(onwarmupcompletedOnExtraCallbackWithResult instanceof getEventInstanceId.onExtraCallbackWithResult)) {
                int i2 = onUnminimized + 27;
                onRelationshipValidationResult = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z = onwarmupcompletedOnExtraCallbackWithResult instanceof getEventInstanceId.onExtraCallback;
                    throw null;
                }
                if (!(onwarmupcompletedOnExtraCallbackWithResult instanceof getEventInstanceId.onExtraCallback) && !(onwarmupcompletedOnExtraCallbackWithResult instanceof getEventInstanceId.IAuthTabCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            openFd.onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 926495754, ACPayResult.onWarmupCompleted(), -926495747, new Object[]{access000(), Integer.valueOf(onwarmupcompletedOnExtraCallbackWithResult.onNavigationEvent())}, ACPayResult.onWarmupCompleted());
            onExtraCallback(access000().onExtraCallback());
            onWarmupCompleted(-933651327, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 933651332, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, Integer.valueOf(access000().onExtraCallback()), false, getArguments(), false, false, false, null, 120, null}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        } else if (bundle != null) {
            int i3 = onRelationshipValidationResult + 49;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
            Uri uriIAuthTabCallback = Companion.IAuthTabCallback(bundle);
            getEventInstanceId.onWarmupCompleted onwarmupcompleted = onwarmupcompletedOnExtraCallbackWithResult;
            onwarmupcompleted.asInterface().invoke();
            if (onwarmupcompleted.onNavigationEvent() != -1) {
                openFd.onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 926495754, ACPayResult.onWarmupCompleted(), -926495747, new Object[]{access000(), Integer.valueOf(onwarmupcompleted.onNavigationEvent())}, ACPayResult.onWarmupCompleted());
                boolean z2 = (uriIAuthTabCallback == null || (strIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(uriIAuthTabCallback, "scrollToTop", "false")) == null) ? false : Boolean.parseBoolean(strIAuthTabCallback);
                onWarmupCompleted(-933651327, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 933651332, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, Integer.valueOf(onwarmupcompleted.onNavigationEvent()), false, getArguments(), Boolean.valueOf(onwarmupcompleted.onWarmupCompleted()), Boolean.valueOf(z2), false, onwarmupcompleted.IAuthTabCallbackStub(), 32, null}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
            }
            if (createClient.onExtraCallback.onWarmupCompleted(access000().onExtraCallback())) {
                int i5 = onRelationshipValidationResult + 7;
                onUnminimized = i5 % 128;
                int i6 = i5 % 2;
                onNavigationEvent(uriIAuthTabCallback, bundle);
            }
        } else {
            openFd.onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 926495754, ACPayResult.onWarmupCompleted(), -926495747, new Object[]{access000(), Integer.valueOf(onwarmupcompletedOnExtraCallbackWithResult.onNavigationEvent())}, ACPayResult.onWarmupCompleted());
            onWarmupCompleted(-933651327, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 933651332, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, Integer.valueOf(access000().onExtraCallback()), false, getArguments(), false, false, false, null, 120, null}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        }
        ExtHubContext extHubContext = ExtHubContext.IAuthTabCallback;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        extHubContext.IAuthTabCallback(contextRequireContext, access000());
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r2
      0x0021: PHI (r2v5 o.ExtHubLoggerImpl) = (r2v4 o.ExtHubLoggerImpl), (r2v17 o.ExtHubLoggerImpl) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(int i) throws Throwable {
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel;
        int i2 = 2 % 2;
        int i3 = onUnminimized + 113;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
            int i4 = 27 / 0;
            if (extHubLoggerImplICustomTabsCallback_Parcel != null) {
                FragmentSwitcher fragmentSwitcher = extHubLoggerImplICustomTabsCallback_Parcel.onExtraCallbackWithResult;
                if (fragmentSwitcher != null && fragmentSwitcher.onExtraCallbackWithResult() >= 0) {
                    int i5 = onRelationshipValidationResult + 43;
                    onUnminimized = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 54 / 0;
                        return;
                    }
                    return;
                }
            }
        } else {
            extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
            if (extHubLoggerImplICustomTabsCallback_Parcel != null) {
            }
        }
        String strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i);
        if (strOnExtraCallback == null) {
            int i7 = onRelationshipValidationResult + 71;
            onUnminimized = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr = new Object[1];
            b(false, new byte[]{1, 1, 1, 1, 1, 0, 1}, new int[]{32, 7, 0, 0}, objArr);
            strOnExtraCallback = ((String) objArr[0]).intern();
        }
        getTextProgressMargin gettextprogressmargin = (getTextProgressMargin) onWarmupCompleted(1215747073, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1215747065, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        getProgressText getprogresstext = getProgressText.AppLaunch;
        Object[] objArr2 = new Object[1];
        a((short) ((-27) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 278387947 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.rgb(0, 0, 0) - 102564590, (-97) - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
        gettextprogressmargin.onNavigationEvent(i, ((String) objArr2[0]).intern(), strOnExtraCallback, getprogresstext);
        isEngagementSignalsApiAvailable().onNavigationEvent(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r4
      0x0028: PHI (r4v5 o.openFd) = (r4v4 o.openFd), (r4v7 o.openFd) binds: [B:8:0x0026, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        openFd openfdAccess000;
        boolean z = false;
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 113;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            openfdAccess000 = mainTabFragment.access000();
            int i3 = 73 / 0;
            if (bundle != null) {
                int i4 = onUnminimized;
                int i5 = i4 + 125;
                onRelationshipValidationResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 113;
                onRelationshipValidationResult = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            }
        } else {
            openfdAccess000 = mainTabFragment.access000();
            if (bundle != null) {
            }
        }
        openfdAccess000.onNavigationEvent(z);
        mainTabFragment.ICustomTabsCallbackStubProxy();
        return null;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<TabBarItemView, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        onNavigationEvent(Object obj) {
            super(1, obj, MainTabFragment.class, "setDevToolDispatcher", "setDevToolDispatcher(Lim/toss/uikit/widget/TabBarItemView;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((TabBarItemView) obj);
            if (i3 != 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 26 / 0;
            }
            return unit2;
        }

        public final void onExtraCallback(TabBarItemView tabBarItemView) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tabBarItemView, "");
            MainTabFragment.onWarmupCompleted((MainTabFragment) ((CallableReference) this).receiver, tabBarItemView);
            int i4 = IAuthTabCallback + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void ICustomTabsCallbackStubProxy() throws NoWhenBranchMatchedException {
        int iNextIndex;
        TabBarItemView.IAuthTabCallback IAuthTabCallback2;
        boolean z;
        int i = 2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel == null) {
            return;
        }
        extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback.extraCallback();
        Object[] objArr = {access000()};
        List list = (List) openFd.onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, objArr, ACPayResult.onWarmupCompleted());
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            int i2 = onRelationshipValidationResult + 57;
            onUnminimized = i2 % 128;
            if (i2 % 2 != 0) {
                if (!((ExtHubPageContext) listIterator.previous()).IAuthTabCallback()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                int i3 = 10 / 0;
                if (!((ExtHubPageContext) listIterator.previous()).IAuthTabCallback()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
        }
        iNextIndex = -1;
        Object[] objArr2 = {access000()};
        boolean z2 = false;
        int i4 = 0;
        for (Object obj : (List) openFd.onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, objArr2, ACPayResult.onWarmupCompleted())) {
            int i5 = onUnminimized + 91;
            onRelationshipValidationResult = i5 % 128;
            int i6 = i5 % 2;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ExtHubPageContext extHubPageContext = (ExtHubPageContext) obj;
            if (!extHubPageContext.IAuthTabCallback()) {
                Context context = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                String strOnExtraCallbackWithResult = extHubPageContext.onExtraCallbackWithResult(context);
                ExtHubPageContext.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = extHubPageContext.onNavigationEvent();
                if (!(!(iAuthTabCallbackOnNavigationEvent instanceof ExtHubPageContext$IAuthTabCallback$IAuthTabCallback))) {
                    IAuthTabCallback2 = TabBarItemView.IAuthTabCallback.onNavigationEvent.onNavigationEvent(TabBarItemView.IAuthTabCallback.Companion, extHubPageContext.onWarmupCompleted(), ((ExtHubPageContext$IAuthTabCallback$IAuthTabCallback) extHubPageContext.onNavigationEvent()).onExtraCallbackWithResult(), ((ExtHubPageContext$IAuthTabCallback$IAuthTabCallback) extHubPageContext.onNavigationEvent()).onWarmupCompleted(), (Integer) null, strOnExtraCallbackWithResult, 8, (Object) null);
                    int i7 = onRelationshipValidationResult + 71;
                    onUnminimized = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 / 3;
                    }
                } else {
                    if (!(iAuthTabCallbackOnNavigationEvent instanceof ExtHubPageContext.IAuthTabCallback.onWarmupCompleted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IAuthTabCallback2 = TabBarItemView.IAuthTabCallback.Companion.IAuthTabCallback(extHubPageContext.onWarmupCompleted(), Integer.valueOf(extHubPageContext.onNavigationEvent().onExtraCallbackWithResult()), strOnExtraCallbackWithResult, Integer.valueOf(extHubPageContext.onNavigationEvent().IAuthTabCallback()));
                }
                TabBarItemView.IAuthTabCallback iAuthTabCallback = IAuthTabCallback2;
                if (!z2) {
                    int i9 = onRelationshipValidationResult + 79;
                    onUnminimized = i9 % 128;
                    int i10 = i9 % 2;
                    if (iAuthTabCallback.onExtraCallback() == 13) {
                        z2 = true;
                    }
                }
                TabBar tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tabBar, "");
                onNavigationEvent onnavigationevent = new onNavigationEvent(this);
                if (i4 == iNextIndex) {
                    int i11 = onRelationshipValidationResult + 73;
                    onUnminimized = i11 % 128;
                    int i12 = i11 % 2;
                    z = true;
                } else {
                    int i13 = onUnminimized + 103;
                    onRelationshipValidationResult = i13 % 128;
                    int i14 = i13 % 2;
                    z = false;
                }
                TabBar.onExtraCallbackWithResult(tabBar, iAuthTabCallback, onnavigationevent, false, z, 4, (Object) null);
            }
            i4++;
        }
        if (!(!z2)) {
            requestPostMessageChannel();
        }
        ExtHubContext extHubContext = ExtHubContext.IAuthTabCallback;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        extHubContext.IAuthTabCallback(contextRequireContext, access000());
        extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback.setOnTabSelectListener(new IAuthTabCallback(extHubLoggerImplICustomTabsCallback_Parcel));
        extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback.setOnFloatingTabSelectListener(new onTransact(this, extHubLoggerImplICustomTabsCallback_Parcel));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void requestPostMessageChannel() {
        TabBar tabBar;
        boolean z;
        Set setOnExtraCallback;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 77;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallback = getClosedokhttp.Companion.onExtraCallback();
        boolean z2 = IAuthTabCallback_Parcel().onActivityResized() != 0;
        boolean zOnNavigationEvent = AFLogger5.onNavigationEvent(IAuthTabCallback_Parcel());
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel == null || (tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback) == null) {
            return;
        }
        int id = getDirectory.HOME.getId();
        if (!z2) {
            int i4 = onRelationshipValidationResult + 35;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            z = zOnNavigationEvent;
        }
        if (!z2) {
            setOnExtraCallback = new LinkedHashSet();
            Iterator it = listOnExtraCallback.iterator();
            while (it.hasNext()) {
                int i6 = onRelationshipValidationResult + 89;
                onUnminimized = i6 % 128;
                if (i6 % 2 == 0) {
                    setOnExtraCallback.add(Integer.valueOf(((TabBarItemView.IAuthTabCallback) it.next()).onExtraCallback()));
                    int i7 = 81 / 0;
                } else {
                    setOnExtraCallback.add(Integer.valueOf(((TabBarItemView.IAuthTabCallback) it.next()).onExtraCallback()));
                }
            }
            setOnExtraCallback.remove(Integer.valueOf(getDirectory.FEED.getId()));
            Unit unit = Unit.INSTANCE;
        } else {
            setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(Integer.valueOf(getDirectory.DISCOVERY.getId()));
        }
        tabBar.setFloatingTabView(listOnExtraCallback, id, z, setOnExtraCallback);
        int i8 = onRelationshipValidationResult + 39;
        onUnminimized = i8 % 128;
        int i9 = i8 % 2;
    }

    private static final void onExtraCallback(ExtHubLoggerImpl extHubLoggerImpl, MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        int i2 = onUnminimized + 103;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        TabBar tabBar = extHubLoggerImpl.IAuthTabCallback;
        float f = mainTabFragment.IAuthTabCallbackDefault;
        if (i3 == 0) {
            tabBar.setAlpha(f);
        } else {
            tabBar.setAlpha(f);
            int i4 = 80 / 0;
        }
    }

    private final void prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = onUnminimized + 29;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel == null) {
            return;
        }
        FragmentSwitcher fragmentSwitcher = extHubLoggerImplICustomTabsCallback_Parcel.onExtraCallbackWithResult;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        fragmentSwitcher.setFragmentFactory(new ExtHubRender(childFragmentManager, access000(), writeTypedObject()));
        extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback.post(new MainTabFragment$.ExternalSyntheticLambda0(extHubLoggerImplICustomTabsCallback_Parcel, this));
        extHubLoggerImplICustomTabsCallback_Parcel.onExtraCallbackWithResult.setOnPageChangeListener(new IAuthTabCallbackDefault(this, extHubLoggerImplICustomTabsCallback_Parcel));
        int i4 = onRelationshipValidationResult + 91;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        boolean z;
        Object obj = objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 13;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            z = obj instanceof WebSocketSession;
            int i3 = 62 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            z = obj instanceof WebSocketSession;
        }
        return Boolean.valueOf(z);
    }

    private static final void onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 25;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onUnminimized + 5;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(MainTabFragment mainTabFragment, WebSocketSession webSocketSession) throws Throwable {
        int i = 2 % 2;
        onExtraCallback onextracallback = Companion;
        Intent intent = new Intent();
        intent.setData(webSocketSession.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        mainTabFragment.IAuthTabCallback(onextracallback.onNavigationEvent(intent));
        int i2 = onRelationshipValidationResult + 65;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 93;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 99;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("MainTabFragment", th);
            int i3 = 11 / 0;
            return Unit.INSTANCE;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("MainTabFragment", th);
        return Unit.INSTANCE;
    }

    private static final boolean onTransact(Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 107;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return obj instanceof closeAllSocket;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean z = obj instanceof closeAllSocket;
        throw null;
    }

    private static final void onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 113;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onRelationshipValidationResult + 125;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(MainTabFragment mainTabFragment, closeAllSocket closeallsocket) {
        int i = 2 % 2;
        int i2 = onUnminimized + 87;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = closeallsocket.onExtraCallbackWithResult();
        boolean zOnExtraCallback = closeallsocket.onExtraCallback();
        boolean zOnNavigationEvent = closeallsocket.onNavigationEvent();
        Object[] objArr = {mainTabFragment, Integer.valueOf(iOnExtraCallbackWithResult), true, mainTabFragment.getArguments(), Boolean.valueOf(zOnNavigationEvent), Boolean.valueOf(zOnExtraCallback), false, null, 96, null};
        onWarmupCompleted(-933651327, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 933651332, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 1;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 57;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = onUnminimized + 91;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = onUnminimized + 15;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("MainTabFragment", th);
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 39;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final boolean IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onUnminimized + 33;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean z = obj instanceof startSocketConnect;
        int i4 = onUnminimized + 87;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 103;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onRelationshipValidationResult + 5;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }

    private static final Unit IAuthTabCallback(MainTabFragment mainTabFragment, startSocketConnect startsocketconnect) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 125;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(startsocketconnect);
            mainTabFragment.onExtraCallbackWithResult(startsocketconnect);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(startsocketconnect);
        mainTabFragment.onExtraCallbackWithResult(startsocketconnect);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 41;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onRelationshipValidationResult + 125;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = onUnminimized + 95;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("MainTabFragment", th);
            int i3 = 97 / 0;
            return Unit.INSTANCE;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("MainTabFragment", th);
        return Unit.INSTANCE;
    }

    private final void requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        getIconPaddingLeft geticonpaddingleft = getIconPaddingLeft.IAuthTabCallback;
        Object obj = null;
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = geticonpaddingleft.onWarmupCompleted().onWarmupCompleted(viva.republica.toss.util.RxUtils.IAuthTabCallback((Object) null, 1, (Object) null)).onWarmupCompleted(new MainTabFragment$.ExternalSyntheticLambda13()).IAuthTabCallback(WebSocketSession.class).onWarmupCompleted(new MainTabFragment$.ExternalSyntheticLambda20(new MainTabFragment$.ExternalSyntheticLambda19(this)), new MainTabFragment$.ExternalSyntheticLambda22(new MainTabFragment$.ExternalSyntheticLambda21()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        autoDisposable(deserializeurinullablecollectionOnWarmupCompleted);
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted2 = geticonpaddingleft.onWarmupCompleted().onWarmupCompleted(viva.republica.toss.util.RxUtils.IAuthTabCallback((Object) null, 1, (Object) null)).onWarmupCompleted(new MainTabFragment$.ExternalSyntheticLambda23()).IAuthTabCallback(closeAllSocket.class).onWarmupCompleted(new MainTabFragment$.ExternalSyntheticLambda25(new MainTabFragment$.ExternalSyntheticLambda24(this)), new MainTabFragment$.ExternalSyntheticLambda27(new MainTabFragment$.ExternalSyntheticLambda26()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted2, "");
        autoDisposable(deserializeurinullablecollectionOnWarmupCompleted2);
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted3 = geticonpaddingleft.onWarmupCompleted().onWarmupCompleted(viva.republica.toss.util.RxUtils.IAuthTabCallback((Object) null, 1, (Object) null)).onWarmupCompleted(new MainTabFragment$.ExternalSyntheticLambda14()).IAuthTabCallback(startSocketConnect.class).onWarmupCompleted(new MainTabFragment$.ExternalSyntheticLambda16(new MainTabFragment$.ExternalSyntheticLambda15(this)), new MainTabFragment$.ExternalSyntheticLambda18(new MainTabFragment$.ExternalSyntheticLambda17()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted3, "");
        autoDisposable(deserializeurinullablecollectionOnWarmupCompleted3);
        int i2 = onRelationshipValidationResult + 83;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r6 = im.toss.features.main.ui.MainTabFragment.onRelationshipValidationResult + 61;
        im.toss.features.main.ui.MainTabFragment.onUnminimized = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if ((r6 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r8 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r41.onNavigationEvent() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r41.onNavigationEvent() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r10 = new java.util.ArrayList();
        r11 = r4.IAuthTabCallback;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "");
        r6 = o.deprecated_certificatePinner.onExtraCallbackWithResult;
        r12 = (o.AppLovinSdkSettings) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r6.onExtraCallbackWithResult()}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -26725365, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 26725368);
        r9 = r5.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
        r10.add((im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r11, o.isMuted.onExtraCallback(r12, (java.lang.Integer) null, java.lang.Integer.valueOf(o.varyMatches.onNavigationEvent(r2, r9)), (kotlin.jvm.functions.Function1) null, 5, (java.lang.Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025));
        r11 = r40.IAuthTabCallbackStubProxy;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ef, code lost:
    
        if (r11 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f1, code lost:
    
        r12 = im.toss.features.main.ui.MainTabFragment.onUnminimized + 71;
        im.toss.features.main.ui.MainTabFragment.onRelationshipValidationResult = r12 % 128;
        r12 = r12 % 2;
        r18 = (o.AppLovinSdkSettings) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r6.onExtraCallbackWithResult()}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -26725365, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 26725368);
        r1 = r5.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r10.add((im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r11, o.isMuted.onExtraCallback(r18, (java.lang.Integer) null, java.lang.Integer.valueOf(o.varyMatches.onNavigationEvent(r2, r1)), (kotlin.jvm.functions.Function1) null, 5, (java.lang.Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x017c, code lost:
    
        o.isFireOS.onExtraCallbackWithResult(o.runOnUiThreadDelayed.onWarmupCompleted(im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted((android.view.View) null, o.pxToDp.IAuthTabCallback.onExtraCallback, r10, 0, (o.getExtraParameters) null, 0, (android.view.animation.Interpolator) null, (java.lang.Integer) null, java.lang.Boolean.FALSE, 0, 0, false, 3833, (java.lang.Object) null), (java.lang.Object) null, new im.toss.features.main.ui.MainTabFragment$.ExternalSyntheticLambda39(r40), 1, (java.lang.Object) null), false, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a2, code lost:
    
        r2 = r40.IAuthTabCallbackStubProxy;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01a4, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01a6, code lost:
    
        r3 = im.toss.features.main.ui.MainTabFragment.onRelationshipValidationResult + 27;
        im.toss.features.main.ui.MainTabFragment.onUnminimized = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01af, code lost:
    
        if ((r3 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01b1, code lost:
    
        r1 = 98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b3, code lost:
    
        r2.setVisibility(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b7, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ba, code lost:
    
        r4.IAuthTabCallback.setTranslationY(r1.access000());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c6, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01c7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r5 = r4.onExtraCallbackWithResult().getContext();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Unit onExtraCallbackWithResult(startSocketConnect startsocketconnect) {
        int i;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel;
        int i2 = 2 % 2;
        int i3 = onUnminimized + 65;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            i = 107;
            extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        } else {
            i = 82;
            extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        }
    }

    private static final Unit onMinimized(MainTabFragment mainTabFragment) {
        int i = 2 % 2;
        View view = mainTabFragment.IAuthTabCallbackStubProxy;
        if (view != null) {
            int i2 = onUnminimized + 93;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            view.setVisibility(8);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 69;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(MainTabFragment mainTabFragment, Map map) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            Integer num = (Integer) entry.getKey();
            if (num != null) {
                int i2 = onUnminimized + 43;
                onRelationshipValidationResult = i2 % 128;
                int i3 = i2 % 2;
                pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(num.intValue()), entry.getValue());
            } else {
                pairIAuthTabCallback = null;
            }
            if (pairIAuthTabCallback != null) {
                int i4 = onRelationshipValidationResult + 63;
                onUnminimized = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(pairIAuthTabCallback);
                    throw null;
                }
                arrayList.add(pairIAuthTabCallback);
            }
        }
        mainTabFragment.extraCallbackWithResult = access8100.onExtraCallbackWithResult(arrayList);
        for (Map.Entry entry2 : map.entrySet()) {
            Integer num2 = (Integer) entry2.getKey();
            if (num2 != null && !(!((Boolean) entry2.getValue()).booleanValue())) {
                int i5 = onRelationshipValidationResult + 43;
                onUnminimized = i5 % 128;
                int i6 = i5 % 2;
                if (num2.intValue() == mainTabFragment.access000().onExtraCallback()) {
                    int i7 = onUnminimized + 69;
                    onRelationshipValidationResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        getNumberOfCores.onExtraCallbackWithResult(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1165561327, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1165561328, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{mainTabFragment.newSessionWithExtras(), Integer.valueOf(num2.intValue()), 400L}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
                        throw null;
                    }
                    getNumberOfCores.onExtraCallbackWithResult(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1165561327, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1165561328, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{mainTabFragment.newSessionWithExtras(), Integer.valueOf(num2.intValue()), 400L}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
                } else {
                    continue;
                }
            }
        }
        onWarmupCompleted(mainTabFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    private final void postMessage() {
        int i = 2 % 2;
        newSessionWithExtras().onNavigationEvent().observe(getViewLifecycleOwner(), new IAuthTabCallback_Parcel(new MainTabFragment$.ExternalSyntheticLambda40(this)));
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(this, (access13800) null), 3, (Object) null);
        int i2 = onUnminimized + 99;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onWarmupCompleted(MainTabFragment mainTabFragment, Set set, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult;
        int i4 = i3 + 27;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 51;
            onUnminimized = i6 % 128;
            if (i6 % 2 == 0) {
                set = clearFaultAdjacentMetadata.onExtraCallback();
                int i7 = 94 / 0;
            } else {
                set = clearFaultAdjacentMetadata.onExtraCallback();
            }
        }
        mainTabFragment.onExtraCallbackWithResult((Set<Integer>) set);
        int i8 = onRelationshipValidationResult + 107;
        onUnminimized = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 16 / 0;
        }
    }

    private final void onExtraCallbackWithResult(Set<Integer> set) {
        TabBar tabBar;
        int i = 2 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel != null) {
            int i2 = onRelationshipValidationResult + 79;
            onUnminimized = i2 % 128;
            if (i2 % 2 == 0) {
                tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback;
                int i3 = 14 / 0;
                if (tabBar == null) {
                    return;
                }
            } else {
                tabBar = extHubLoggerImplICustomTabsCallback_Parcel.IAuthTabCallback;
                if (tabBar == null) {
                    return;
                }
            }
            int i4 = onRelationshipValidationResult + 11;
            onUnminimized = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                Iterator it = clearFaultAdjacentMetadata.onWarmupCompleted(clearFaultAdjacentMetadata.onWarmupCompleted(this.extraCallbackWithResult.keySet(), this.IAuthTabCallbackStub), set).iterator();
                while (!(!it.hasNext())) {
                    int i5 = onRelationshipValidationResult + 75;
                    onUnminimized = i5 % 128;
                    int i6 = i5 % 2;
                    int iIntValue = ((Number) it.next()).intValue();
                    if (this.IAuthTabCallbackStub.contains(Integer.valueOf(iIntValue))) {
                        tabBar.onExtraCallback(iIntValue, true);
                    } else if (Intrinsics.areEqual(this.extraCallbackWithResult.get(Integer.valueOf(iIntValue)), Boolean.TRUE)) {
                        TabBar.IAuthTabCallback(tabBar, iIntValue, false, 2, (Object) null);
                    } else {
                        tabBar.onExtraCallbackWithResult(iIntValue);
                        int i7 = onRelationshipValidationResult + 77;
                        onUnminimized = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 4 / 2;
                        }
                    }
                }
                return;
            }
            clearFaultAdjacentMetadata.onWarmupCompleted(clearFaultAdjacentMetadata.onWarmupCompleted(this.extraCallbackWithResult.keySet(), this.IAuthTabCallbackStub), set).iterator();
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = mainTabFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new asBinder(mainTabFragment, (access13800) null), 3, (Object) null);
        int i2 = onRelationshipValidationResult + 123;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        Bundle bundle = (Bundle) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue4 = ((Boolean) objArr[6]).booleanValue();
        getContentPaddingRight<Fragment> getcontentpaddingright = (getContentPaddingRight) objArr[7];
        int iIntValue2 = ((Number) objArr[8]).intValue();
        Object obj = objArr[9];
        int i = 2 % 2;
        int i2 = onUnminimized + 67;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue2 & 8) != 0) {
            zBooleanValue2 = false;
        }
        if ((iIntValue2 & 16) != 0) {
            zBooleanValue3 = false;
        }
        if ((iIntValue2 & 32) != 0) {
            zBooleanValue4 = false;
        }
        if ((iIntValue2 & 64) != 0) {
            getcontentpaddingright = null;
        }
        mainTabFragment.onWarmupCompleted(iIntValue, zBooleanValue, bundle, zBooleanValue2, zBooleanValue3, zBooleanValue4, getcontentpaddingright);
        int i4 = onUnminimized + 107;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Bundle $arguments;
        final /* synthetic */ boolean $forceNewInstance;
        final /* synthetic */ boolean $fromUser;
        final /* synthetic */ boolean $needLogging;
        final /* synthetic */ getContentPaddingRight<Fragment> $onInitialize;
        final /* synthetic */ boolean $scrollToTop;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(boolean z, Bundle bundle, boolean z2, boolean z3, boolean z4, getContentPaddingRight<Fragment> getcontentpaddingright, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$needLogging = z;
            this.$arguments = bundle;
            this.$forceNewInstance = z2;
            this.$scrollToTop = z3;
            this.$fromUser = z4;
            this.$onInitialize = getcontentpaddingright;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = MainTabFragment.this.new access100(this.$needLogging, this.$arguments, this.$forceNewInstance, this.$scrollToTop, this.$fromUser, this.$onInitialize, access13800Var);
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                MainTabFragment mainTabFragment = MainTabFragment.this;
                boolean z = this.$needLogging;
                Bundle bundle = this.$arguments;
                boolean z2 = this.$forceNewInstance;
                boolean z3 = this.$scrollToTop;
                boolean z4 = this.$fromUser;
                getContentPaddingRight<Fragment> getcontentpaddingright = this.$onInitialize;
                this.label = 1;
                Object[] objArr = {mainTabFragment, Boolean.valueOf(z), bundle, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), getcontentpaddingright, this};
                if (MainTabFragment.onWarmupCompleted(-287048566, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 287048593, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult()) == objOnWarmupCompleted) {
                    int i6 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onWarmupCompleted(int i, boolean z, @Nullable Bundle bundle, boolean z2, boolean z3, boolean z4, @Nullable getContentPaddingRight<Fragment> getcontentpaddingright) {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 9;
        onRelationshipValidationResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            int iOnExtraCallbackWithResult = access000().onExtraCallbackWithResult(i);
            getPackageType getpackagetype = this.ICustomTabsCallback;
            if (getpackagetype != null) {
                int i4 = onUnminimized + 57;
                onRelationshipValidationResult = i4 % 128;
                int i5 = i4 % 2;
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
            if (i == 13) {
                TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                this.ICustomTabsCallback = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), putChannelInfo.onExtraCallback().onExtraCallback(), (setRandomHost) null, new access100(z, bundle, z2, z3, z4, getcontentpaddingright, null), 2, (Object) null);
                return;
            }
            onExtraCallback(i, iOnExtraCallbackWithResult, z, z2, bundle, z3, z4, getcontentpaddingright);
            return;
        }
        access000().onExtraCallbackWithResult(i);
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(Fragment fragment) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 35;
        onRelationshipValidationResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            drawTextProgressSize drawtextprogresssize = this.readTypedObject;
            if (drawtextprogresssize != null) {
                int i4 = i2 + 111;
                onRelationshipValidationResult = i4 % 128;
                int i5 = i4 % 2;
                this.readTypedObject = null;
                if (fragment.isAdded()) {
                    return;
                }
                Bundle arguments = fragment.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                    int i6 = onUnminimized + 33;
                    onRelationshipValidationResult = i6 % 128;
                    int i7 = i6 % 2;
                }
                drawtextprogresssize.onExtraCallback(arguments);
                fragment.setArguments(arguments);
                return;
            }
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        getContentPaddingRight getcontentpaddingright = (getContentPaddingRight) objArr[1];
        Fragment fragment = (Fragment) objArr[2];
        int i = 2 % 2;
        int i2 = onUnminimized + 69;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        mainTabFragment.onExtraCallbackWithResult(fragment);
        if (getcontentpaddingright == null) {
            return null;
        }
        int i4 = onUnminimized + 15;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        getcontentpaddingright.accept(fragment);
        if (i5 == 0) {
            return null;
        }
        int i6 = 35 / 0;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(int i, int i2, boolean z, boolean z2, Bundle bundle, boolean z3, boolean z4, getContentPaddingRight<Fragment> getcontentpaddingright) {
        TabBar tabBar;
        AFg1tSDK4 aFg1tSDK4;
        TabBar tabBar2;
        int i3 = 2 % 2;
        int i4 = onUnminimized + 1;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel != null) {
            int i6 = onRelationshipValidationResult + 113;
            onUnminimized = i6 % 128;
            int i7 = i6 % 2;
            FragmentSwitcher fragmentSwitcher = extHubLoggerImplICustomTabsCallback_Parcel.onExtraCallbackWithResult;
            if (fragmentSwitcher != null) {
                FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                fragmentSwitcher.setCurrentItem(childFragmentManager, i2, bundle, z2, new MainTabFragment$.ExternalSyntheticLambda30(this, getcontentpaddingright), z4);
            }
        }
        Object[] objArr = {access000()};
        if (((List) openFd.onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, objArr, ACPayResult.onWarmupCompleted())).size() > i2) {
            getIconPaddingLeft geticonpaddingleft = getIconPaddingLeft.IAuthTabCallback;
            geticonpaddingleft.onExtraCallbackWithResult(new getErrMsg(access000().onExtraCallback(i2), i2));
            if (z3) {
                geticonpaddingleft.onExtraCallbackWithResult(RVWebSocketManagerHolder$onExtraCallback.IAuthTabCallback(RVWebSocketManagerHolder$onExtraCallback.onExtraCallback(i)));
            }
        }
        if (z) {
            ExtHubContext extHubContext = ExtHubContext.IAuthTabCallback;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            extHubContext.IAuthTabCallback(contextRequireContext, access000(), i);
        }
        ExtHubRVEngine.onNavigationEvent(ICustomTabsCallback(), i, false, 2, (Object) null);
        if (i != 13) {
            AFg1tSDK4 aFg1tSDK42 = this.IAuthTabCallback_Parcel;
            if (aFg1tSDK42 != null) {
                AFg1tSDK4.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -717676270, new Object[]{aFg1tSDK42}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 717676272, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                int i8 = onUnminimized + 15;
                onRelationshipValidationResult = i8 % 128;
                int i9 = i8 % 2;
            }
            ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel2 = ICustomTabsCallback_Parcel();
            if (extHubLoggerImplICustomTabsCallback_Parcel2 != null && (tabBar = extHubLoggerImplICustomTabsCallback_Parcel2.IAuthTabCallback) != null) {
                int i10 = onRelationshipValidationResult + 101;
                onUnminimized = i10 % 128;
                if (i10 % 2 == 0) {
                    int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                    if (((Boolean) TabBar.onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, new Object[]{tabBar}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue()) {
                        AFg1tSDK4 aFg1tSDK43 = this.IAuthTabCallback_Parcel;
                        if (aFg1tSDK43 != null) {
                            AFg1tSDK4.onExtraCallback(aFg1tSDK43, Integer.valueOf(i), (Function0) null, 2, (Object) null);
                            int i11 = onUnminimized + 119;
                            onRelationshipValidationResult = i11 % 128;
                            int i12 = i11 % 2;
                        }
                    }
                } else {
                    int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                    if (((Boolean) TabBar.onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, new Object[]{tabBar}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3)).booleanValue()) {
                    }
                }
            }
            ((CacheStrategy) onWarmupCompleted(-433573469, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 433573495, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).onExtraCallbackWithResult();
            isUserSubjectToGDPR.onWarmupCompleted.access000();
            ICustomTabsService().IAuthTabCallback();
            return;
        }
        if (!mayLaunchUrl()) {
            ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel3 = ICustomTabsCallback_Parcel();
            if (extHubLoggerImplICustomTabsCallback_Parcel3 != null) {
                int i13 = onRelationshipValidationResult + 57;
                onUnminimized = i13 % 128;
                int i14 = i13 % 2;
                TabBar tabBar3 = extHubLoggerImplICustomTabsCallback_Parcel3.IAuthTabCallback;
                if (tabBar3 != null) {
                    int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
                    if (!((Boolean) TabBar.onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, new Object[]{tabBar3}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5)).booleanValue() || (aFg1tSDK4 = this.IAuthTabCallback_Parcel) == null) {
                        return;
                    }
                    AFg1tSDK4.onExtraCallback(aFg1tSDK4, Integer.valueOf(i), (Function0) null, 2, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        int iIAuthTabCallback = onActivityResized().IAuthTabCallback();
        getClosedokhttp.IAuthTabCallback(onActivityResized(), iIAuthTabCallback, false, (Function1) null, 4, (Object) null);
        ExtHubLoggerImpl extHubLoggerImplICustomTabsCallback_Parcel4 = ICustomTabsCallback_Parcel();
        if (extHubLoggerImplICustomTabsCallback_Parcel4 != null && (tabBar2 = extHubLoggerImplICustomTabsCallback_Parcel4.IAuthTabCallback) != null) {
            int i15 = onUnminimized + 95;
            onRelationshipValidationResult = i15 % 128;
            int i16 = i15 % 2;
            tabBar2.onNavigationEvent(iIAuthTabCallback);
        }
        AFg1tSDK4 aFg1tSDK44 = this.IAuthTabCallback_Parcel;
        if (aFg1tSDK44 != null) {
            int i17 = onRelationshipValidationResult + 15;
            onUnminimized = i17 % 128;
            if (i17 % 2 == 0) {
                AFg1tSDK4.onExtraCallbackWithResult(aFg1tSDK44, 67, getDirectory.HOME.getId(), 1L, 4, (Object) null);
            } else {
                AFg1tSDK4.onExtraCallbackWithResult(aFg1tSDK44, 13, getDirectory.HOME.getId(), 0L, 4, (Object) null);
            }
        }
    }

    private final void onNavigationEvent(Uri uri, Bundle bundle) throws Throwable {
        String queryParameter;
        int i = 2 % 2;
        int i2 = onUnminimized + 25;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) (Gravity.getAbsoluteGravity(0, 0) + 75), (byte) ((-1) - Process.getGidForName("")), 278387859 + TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", '0', 0) - 119341799, Process.getGidForName("") - 95, objArr);
        if (!bundle.containsKey(((String) objArr[0]).intern())) {
            int i4 = onRelationshipValidationResult + 7;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = new Object[1];
            b(true, new byte[]{0, 0, 0, 1}, new int[]{0, 4, 53, 0}, objArr2);
            if (!bundle.containsKey(((String) objArr2[0]).intern())) {
                return;
            }
        }
        String strIntern = null;
        if (uri != null) {
            int i6 = onUnminimized + 39;
            onRelationshipValidationResult = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr3 = new Object[1];
            a((short) ((-37) - Process.getGidForName("")), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 278387862, (-119341800) - TextUtils.getOffsetAfter("", 0), View.resolveSize(0, 0) - 95, objArr3);
            queryParameter = uri.getQueryParameter(((String) objArr3[0]).intern());
        } else {
            queryParameter = null;
        }
        if (queryParameter == null) {
            int i8 = onRelationshipValidationResult + 59;
            onUnminimized = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 96 / 0;
            }
            queryParameter = "";
        }
        ArrayList arrayList = new ArrayList();
        Object[] objArr4 = new Object[1];
        a((short) ((ViewConfiguration.getPressedStateDuration() >> 16) + 75), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf("", '0') + 278387860, MotionEvent.axisFromString("") - 119341799, (-96) - (Process.myPid() >> 22), objArr4);
        String string = bundle.getString(((String) objArr4[0]).intern());
        if (string == null) {
            string = "INVALID_TYPE";
        }
        arrayList.add(string);
        Object[] objArr5 = new Object[1];
        b(true, new byte[]{0, 0, 0, 1}, new int[]{0, 4, 53, 0}, objArr5);
        String string2 = bundle.getString(((String) objArr5[0]).intern());
        if (string2 == null) {
            string2 = "INVALID_PAGE";
        }
        arrayList.add(string2);
        if (arrayList.contains("account")) {
            int i10 = onRelationshipValidationResult + 81;
            onUnminimized = i10 % 128;
            int i11 = i10 % 2;
            Object[] objArr6 = new Object[1];
            a((short) ((-85) - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getTrimmedLength("") + 278387866, (ViewConfiguration.getLongPressTimeout() >> 16) - 119341801, (-71) - (ViewConfiguration.getTapTimeout() >> 16), objArr6);
            strIntern = ((String) objArr6[0]).intern();
        } else if (arrayList.contains("card")) {
            Object[] objArr7 = new Object[1];
            a((short) (19 - Color.alpha(0)), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), 278387894 - Color.blue(0), (-119341800) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-73) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr7);
            strIntern = ((String) objArr7[0]).intern();
        } else if (arrayList.contains("loan")) {
            int i12 = onUnminimized + 7;
            onRelationshipValidationResult = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr8 = new Object[1];
            a((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 53), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), ImageFormat.getBitsPerPixel(0) + 278387920, ExpandableListView.getPackedPositionGroup(0L) - 119341801, TextUtils.getCapsMode("", 0, 0) - 74, objArr8);
            strIntern = ((String) objArr8[0]).intern();
            int i14 = onRelationshipValidationResult + 51;
            onUnminimized = i14 % 128;
            int i15 = i14 % 2;
        } else if (arrayList.contains("credit")) {
            Object[] objArr9 = new Object[1];
            b(false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1}, new int[]{4, 28, 0, 0}, objArr9);
            strIntern = ((String) objArr9[0]).intern();
        }
        if (strIntern != null) {
            int i16 = onRelationshipValidationResult + 91;
            onUnminimized = i16 % 128;
            int i17 = i16 % 2;
            SessionTrackerb.onExtraCallbackWithResult(onActivityLayout(), requireContext(), (String) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1614695604, nSetPosition.onExtraCallbackWithResult(), 1614695607, new Object[]{strIntern, queryParameter}), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
    }

    private final void onExtraCallbackWithResult(TabBarItemView tabBarItemView) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 13;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallback_Parcel().onActivityResized() != 0) {
            tabBarItemView.setOnTouchListener(null);
            tabBarItemView.setOnLongClickListener(new MainTabFragment$.ExternalSyntheticLambda12(this));
            int i4 = onRelationshipValidationResult + 79;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onUnminimized + 19;
        onRelationshipValidationResult = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final boolean onNavigationEvent(MainTabFragment mainTabFragment, View view) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 27;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            setDisableNetworkData setdisablenetworkdataOnExtraCallback = mainTabFragment.onExtraCallback();
            setDisableNetworkData setdisablenetworkdata = setdisablenetworkdataOnExtraCallback instanceof setDisableNetworkData ? setdisablenetworkdataOnExtraCallback : null;
            if (setdisablenetworkdata != null) {
                int i3 = onRelationshipValidationResult + 69;
                onUnminimized = i3 % 128;
                if (i3 % 2 == 0) {
                    setdisablenetworkdata.prepareSameAppActivityTransition();
                    int i4 = 5 / 0;
                } else {
                    setdisablenetworkdata.prepareSameAppActivityTransition();
                }
            }
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = mainTabFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, mainTabFragment.new access000(null), 3, (Object) null);
            return true;
        }
        boolean z = mainTabFragment.onExtraCallback() instanceof setDisableNetworkData;
        throw null;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        access000(access13800<? super access000> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = MainTabFragment.this.new access000(access13800Var);
            int i2 = IAuthTabCallback + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return access000Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                RunDevToolActionUseCase runDevToolActionUseCaseExtraCallbackWithResult = MainTabFragment.this.extraCallbackWithResult();
                this.label = 1;
                if (RunDevToolActionUseCase.IAuthTabCallback(runDevToolActionUseCaseExtraCallbackWithResult, "SHOW_QUICK_ACTION", (Map) null, this, 2, (Object) null) == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 55;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 85;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 51;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = createClient.onExtraCallback.onWarmupCompleted(access000().onExtraCallback());
        int i4 = onRelationshipValidationResult + 69;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onUnminimized + 73;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = access000().onExtraCallback();
        int i4 = onRelationshipValidationResult + 41;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    public TextFieldScrollKtExternalSyntheticLambda0 onNavigationEvent(@NotNull Fragment fragment, int i) {
        boolean z;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(getErrMsg.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(ReactiveFlowKt.onWarmupCompleted(jsonReaderUnknownNumberParsingOnExtraCallback), this, i);
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragment);
        getTileModeY gettilemodeyOnNavigationEvent = getTileModeY.Companion.onNavigationEvent();
        if (access000().onExtraCallback() == i) {
            z = true;
        } else {
            int i3 = onUnminimized + 77;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        setRubIn setrubinIAuthTabCallback = ycxycx.IAuthTabCallback(onwarmupcompleted, textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, gettilemodeyOnNavigationEvent, Boolean.valueOf(z));
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = fragment.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        SDKInstallCallBack sDKInstallCallBack = new SDKInstallCallBack(lifecycle, setrubinIAuthTabCallback, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragment));
        if (IAuthTabCallback_Parcel().onActivityLayout()) {
            checkDetectionItem checkdetectionitem = checkDetectionItem.onWarmupCompleted;
            String strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i);
            if (strOnExtraCallback == null) {
                int i5 = onUnminimized + 69;
                onRelationshipValidationResult = i5 % 128;
                int i6 = i5 % 2;
                str = "tab" + i;
            } else {
                str = strOnExtraCallback;
            }
            checkDetectionItem.onNavigationEvent(checkdetectionitem, str, sDKInstallCallBack, new MainTabFragment$.ExternalSyntheticLambda29(fragment), (Function0) null, 8, (Object) null);
        }
        int i7 = onRelationshipValidationResult + 67;
        onUnminimized = i7 % 128;
        if (i7 % 2 != 0) {
            return sDKInstallCallBack;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Map onWarmupCompleted(Fragment fragment) {
        Map mapOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onUnminimized + 107;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(fragment.isHidden());
        if (i3 != 0) {
            mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("hidden", boolValueOf));
            int i4 = 54 / 0;
        } else {
            mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("hidden", boolValueOf));
        }
        int i5 = onRelationshipValidationResult + 31;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return mapOnNavigationEvent;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 109;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (mainTabFragment.extraCallback().onExtraCallbackWithResult() != getPricingPhaseList.KR) {
            int i4 = onRelationshipValidationResult + 103;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = mainTabFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new readTypedObject(mainTabFragment, (access13800) null), 3, (Object) null);
        int i6 = onRelationshipValidationResult + 107;
        onUnminimized = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Bundle onNavigationEvent(@Nullable Intent intent) {
            Bundle extras;
            Uri data;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i2 % 128;
            String string = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (intent != null && (data = intent.getData()) != null) {
                int i3 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                string = data.toString();
            }
            Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("intentData", string)});
            if (intent != null && (extras = intent.getExtras()) != null) {
                int i5 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                bundleOnNavigationEvent.putAll(extras);
            }
            return bundleOnNavigationEvent;
        }

        public final Uri IAuthTabCallback(@NotNull Bundle bundle) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(bundle, "");
            Object[] objArr = {bundle.getString("intentData")};
            Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, objArr);
            int i4 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return uri;
            }
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(254005520, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -254005516, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(-1110830652, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1110830675, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-828864614, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 828864621, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{th}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(668289194, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -668289176, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MainTabFragment mainTabFragment, Map map) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-644933475, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 644933503, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, map}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MainTabFragment mainTabFragment, Boolean bool) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(2116846314, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -2116846290, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, bool}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ ExtHubLoggerImpl asInterface(MainTabFragment mainTabFragment) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (ExtHubLoggerImpl) onWarmupCompleted(-2029982219, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 2029982225, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void IAuthTabCallback(MainTabFragment mainTabFragment, Set set) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(2098233284, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -2098233273, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, set}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ Object onNavigationEvent(MainTabFragment mainTabFragment, boolean z, Bundle bundle, boolean z2, boolean z3, boolean z4, getContentPaddingRight getcontentpaddingright, access13800 access13800Var) {
        Object[] objArr = {mainTabFragment, Boolean.valueOf(z), bundle, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), getcontentpaddingright, access13800Var};
        return onWarmupCompleted(-287048566, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 287048593, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void onNavigationEvent(MainTabFragment mainTabFragment, drawTextProgressSize drawtextprogresssize) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(827821497, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -827821496, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, drawtextprogresssize}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void IAuthTabCallback(MainTabFragment mainTabFragment, getPackageType getpackagetype) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(1320021726, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1320021716, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, getpackagetype}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final getApiName extraCallbackWithResult(MainTabFragment mainTabFragment) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (getApiName) onWarmupCompleted(-171395117, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 171395138, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private final onMessageChannelReady prefetch() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (onMessageChannelReady) onWarmupCompleted(-66948778, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 66948795, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(MainTabFragment mainTabFragment, Boolean bool) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-282747973, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 282748002, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, bool}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private final boolean newAuthTabSession() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(-1089017799, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1089017814, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).booleanValue();
    }

    private static final Integer onExtraCallbackWithResult(MainTabFragment mainTabFragment, Fragment fragment) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Integer) onWarmupCompleted(299085077, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -299085057, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, fragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private final void setEngagementSignalsCallback() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(-279034121, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 279034130, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final Unit extraCallback(MainTabFragment mainTabFragment) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-872289233, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 872289249, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final ExtHubEventContext ICustomTabsCallback(MainTabFragment mainTabFragment) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (ExtHubEventContext) onWarmupCompleted(462558252, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -462558227, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private final Object IAuthTabCallback(boolean z, Bundle bundle, boolean z2, boolean z3, boolean z4, getContentPaddingRight<Fragment> getcontentpaddingright, access13800<? super Unit> access13800Var) {
        Object[] objArr = {this, Boolean.valueOf(z), bundle, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), getcontentpaddingright, access13800Var};
        return onWarmupCompleted(1392686684, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1392686684, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void IAuthTabCallback(MainTabFragment mainTabFragment, int i, boolean z, Bundle bundle, boolean z2, boolean z3, boolean z4, getContentPaddingRight getcontentpaddingright, int i2, Object obj) {
        Object[] objArr = {mainTabFragment, Integer.valueOf(i), Boolean.valueOf(z), bundle, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), getcontentpaddingright, Integer.valueOf(i2), obj};
        onWarmupCompleted(-933651327, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 933651332, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final void onNavigationEvent(MainTabFragment mainTabFragment, getContentPaddingRight getcontentpaddingright, Fragment fragment) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(-624342776, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 624342788, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{mainTabFragment, getcontentpaddingright, fragment}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private final void onNavigationEvent(Bundle bundle) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(-806058834, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 806058853, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this, bundle}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final boolean onNavigationEvent(Object obj) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(119101295, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -119101273, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{obj}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).booleanValue();
    }

    private final void receiveFile() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onWarmupCompleted(-923176973, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 923176987, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public final r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc asBinder() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc) onWarmupCompleted(1635099486, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1635099473, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public final adOpenedFullscreen IAuthTabCallbackStubProxy() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (adOpenedFullscreen) onWarmupCompleted(839820304, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -839820302, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public final CacheStrategy readTypedObject() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (CacheStrategy) onWarmupCompleted(-433573469, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 433573495, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public final getTextProgressMargin onMessageChannelReady() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (getTextProgressMargin) onWarmupCompleted(1215747073, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1215747065, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public final boolean onRelationshipValidationResult() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(185259211, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -185259208, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())).booleanValue();
    }

    static void onUnminimized() {
        onPostMessage = 1261435749;
        onMinimized = -1538795412;
        onActivityResized = -1554326700;
        ICustomTabsCallbackStub = new byte[]{-94, -92, -78, 21, 20, 39, 17, 82, 69, 82, 104, 92, 94, -114, 23, 78, 109, 78, 105, 70, 65, 110, 89, -127, 92, 65, 19, 92, 80, 71, 94, 105, 65, 71, 94, -41, -10, -29, 41, -80, -41, -10, -41, -14, -17, -22, -9, -30, 42, -27, -22, -68, -27, -7, -32, -25, -14, -22, -32, -25, -48, -75, -58, 0, -98, -75, -44, -75, -48, -51, -56, -43, -64, 8, -61, -56, -102, -61, -57, -50, -59, -48, -56, -50, -59, 53, 72, 36, 27, 19, 21, 8, 8, 8, 8, 8, 8, 8};
        ICustomTabsCallbackDefault = new char[]{27139, 27349, 27351, 27347, 27255, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27143, 27180, 27172, 27171, 27179, 27174, 27174, 27175, 27173, 27143, 27143, 27172, 27173, 27178, 27176, 27168, 27252, 27199, 27170, 27170, 27168, 27197, 27196};
    }
}
