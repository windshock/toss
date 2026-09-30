package im.toss.features.benefit.ui.premium;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Player;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.otaliastudios.cameraview.R$styleable;
import im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView$;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.SafePlayerView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.Address;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BasicSystemInfoExtension5;
import o.Cacheurls1;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.GetBatteryInfoBridgeExtension2;
import o.ParamUtils;
import o.PixelCopyCompatPixelCopyStubExternalSyntheticLambda0;
import o.ScreenBrightnessBridgeExtension11;
import o.access13800;
import o.access14300;
import o.attachAppLovinSdk;
import o.createNavigator;
import o.deprecated_certificatePinner;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getBacktraceNote;
import o.getBacktraceNoteBytes;
import o.getBatteryInfo;
import o.getContentView;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getExtraParameters;
import o.getPackageType;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.isNeedUnzip;
import o.matches;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.pxToDp;
import o.readIntokhttp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setApTextSize;
import o.setHeadersokhttp;
import o.setRandomHost;
import o.setVisitUrl;
import o.transparentBackground;
import o.unRegisterBatteryReceiver;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BenefitPremiumAdCollapsedView extends FrameLayout implements unRegisterBatteryReceiver {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IEngagementSignalsCallbackStubProxy = 43978;
    private static char IEngagementSignalsCallback_Parcel = 18156;
    private static char IPostMessageServiceDefault = 16453;
    private static int IPostMessageService_Parcel = 1;
    private static char ITrustedWebActivityCallback = 2008;
    private static int ITrustedWebActivityCallbackStub;
    private Integer IAuthTabCallback;
    private Integer IAuthTabCallbackDefault;
    private Float IAuthTabCallbackStub;
    private getBatteryInfo.onExtraCallbackWithResult IAuthTabCallbackStubProxy;
    private Float IAuthTabCallback_Parcel;
    private Integer ICustomTabsCallback;
    private Boolean ICustomTabsCallbackDefault;
    private Integer ICustomTabsCallbackStub;
    private Integer ICustomTabsCallbackStubProxy;
    private Integer ICustomTabsCallback_Parcel;
    private boolean ICustomTabsService;
    private long ICustomTabsServiceDefault;
    private Integer ICustomTabsServiceStub;
    private Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> ICustomTabsServiceStubProxy;
    private Function1<? super unRegisterBatteryReceiver, Unit> ICustomTabsService_Parcel;
    private getBacktraceNote<? super unRegisterBatteryReceiver, ? super getBatteryInfo.onExtraCallbackWithResult, ? super Boolean, Unit> IEngagementSignalsCallback;
    private Function0<Unit> IEngagementSignalsCallbackDefault;
    private Function0<Unit> IEngagementSignalsCallbackStub;
    private getPackageType IPostMessageService;
    private float IPostMessageServiceStub;
    private Integer access000;
    private final createNavigator access100;
    private Function0<Unit> access200;
    private Integer asBinder;
    private Integer asInterface;
    private getPackageType extraCallback;
    private final onExtraCallbackWithResult extraCallbackWithResult;
    private Integer extraCommand;
    private Integer getInterfaceDescriptor;
    private boolean isEngagementSignalsApiAvailable;
    private runOnUiThreadDelayed mayLaunchUrl;
    private boolean newAuthTabSession;
    private boolean newSession;
    private boolean newSessionWithExtras;
    private final findResAndMsg onActivityLayout;
    private Integer onActivityResized;
    private Rally onExtraCallback;
    private Integer onExtraCallbackWithResult;
    private int onGreatestScrollPercentageIncreased;
    private int onMessageChannelReady;
    private List<getBatteryInfo.onExtraCallbackWithResult> onMinimized;
    private Float onNavigationEvent;
    private Integer onPostMessage;
    private Integer onRelationshipValidationResult;
    private Function0<Unit> onSessionEnded;
    private Float onTransact;
    private Integer onUnminimized;
    private Integer onVerticalScrollEvent;
    private Float onWarmupCompleted;
    private boolean postMessage;
    private Boolean prefetch;
    private boolean prefetchWithMultipleUrls;
    private long readTypedObject;
    private boolean receiveFile;
    private boolean requestPostMessageChannel;
    private boolean requestPostMessageChannelWithExtras;
    private Integer setEngagementSignalsCallback;
    private Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> updateVisuals;
    private Integer validateRelationship;
    private Integer warmup;
    private Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> writeTypedList;
    private int writeTypedObject;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenefitPremiumAdCollapsedView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenefitPremiumAdCollapsedView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 115;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback(benefitPremiumAdCollapsedView);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = IPostMessageService_Parcel + 23;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return engagementSignalsCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 45;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackDefault(benefitPremiumAdCollapsedView, i, f);
        }
        IAuthTabCallbackDefault(benefitPremiumAdCollapsedView, i, f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 47;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(benefitPremiumAdCollapsedView, i, i2);
        int i6 = ITrustedWebActivityCallbackStub + 99;
        IPostMessageService_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(benefitPremiumAdCollapsedView, motionEvent);
        int i4 = ITrustedWebActivityCallbackStub + 35;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 23;
        IPostMessageService_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackStub(benefitPremiumAdCollapsedView, z);
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(benefitPremiumAdCollapsedView, z);
        int i3 = ITrustedWebActivityCallbackStub + 17;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unitICustomTabsCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(RecyclerView recyclerView, BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 87;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(recyclerView, benefitPremiumAdCollapsedView);
        int i4 = IPostMessageService_Parcel + 53;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 85;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return requestPostMessageChannelWithExtras(benefitPremiumAdCollapsedView);
        }
        requestPostMessageChannelWithExtras(benefitPremiumAdCollapsedView);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 93;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(objArr, 955187860, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -955187843);
        int i4 = IPostMessageService_Parcel + 47;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 97;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitPremiumAdCollapsedView, Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(objArr, 822265678, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -822265670);
        int i4 = IPostMessageService_Parcel + 53;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onMessageChannelReady(benefitPremiumAdCollapsedView, zBooleanValue);
        }
        onMessageChannelReady(benefitPremiumAdCollapsedView, zBooleanValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 77;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitPremiumAdCollapsedView};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 != 0) {
            unit = (Unit) onExtraCallback(objArr, -1762153116, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent4, 1762153120);
            int i4 = 1 / 0;
        } else {
            unit = (Unit) onExtraCallback(objArr, -1762153116, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent4, 1762153120);
        }
        int i5 = IPostMessageService_Parcel + 57;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 19;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityLayout = onActivityLayout(benefitPremiumAdCollapsedView, z);
        int i4 = ITrustedWebActivityCallbackStub + 83;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnActivityLayout;
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 115;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -1657240722, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1657240723);
            throw null;
        }
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -1657240722, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1657240723);
        int i3 = IPostMessageService_Parcel + 67;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 69;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitPremiumAdCollapsedView, Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(objArr, 395698351, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -395698325);
        int i4 = ITrustedWebActivityCallbackStub + 101;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 13;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized(benefitPremiumAdCollapsedView, zBooleanValue);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        int i5 = ITrustedWebActivityCallbackStub + 99;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitOnActivityResized;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 1;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        extraCommand(benefitPremiumAdCollapsedView);
        if (i3 == 0) {
            return null;
        }
        int i4 = 33 / 0;
        return null;
    }

    public static /* synthetic */ Unit access000(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 19;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitReceiveFile = receiveFile(benefitPremiumAdCollapsedView);
        int i4 = ITrustedWebActivityCallbackStub + 29;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitReceiveFile;
    }

    public static /* synthetic */ void access100(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 45;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        requestPostMessageChannel(benefitPremiumAdCollapsedView);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = IPostMessageService_Parcel + 51;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 23;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(benefitPremiumAdCollapsedView, f);
        int i4 = IPostMessageService_Parcel + 13;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit asBinder(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 87;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallback(benefitPremiumAdCollapsedView, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsCallback = ICustomTabsCallback(benefitPremiumAdCollapsedView, z);
        int i3 = ITrustedWebActivityCallbackStub + 11;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ void asBinder(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 71;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        newSessionWithExtras(benefitPremiumAdCollapsedView);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    public static /* synthetic */ Unit asInterface(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 47;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 633255485, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -633255449);
        }
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 55;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            writeTypedObject(benefitPremiumAdCollapsedView, f);
            throw null;
        }
        Unit unitWriteTypedObject = writeTypedObject(benefitPremiumAdCollapsedView, f);
        int i3 = ITrustedWebActivityCallbackStub + 43;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unitWriteTypedObject;
        }
        throw null;
    }

    public static /* synthetic */ Unit asInterface(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 47;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMinimized = onMinimized(benefitPremiumAdCollapsedView, z);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return unitOnMinimized;
    }

    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) {
        BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView = (BenefitPremiumAdCarouselItemView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 33;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(benefitPremiumAdCarouselItemView, fFloatValue);
        }
        onExtraCallbackWithResult(benefitPremiumAdCarouselItemView, fFloatValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object newAuthTabSession(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 25;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {benefitPremiumAdCollapsedView, Float.valueOf(fFloatValue)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(objArr2, 2118442524, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent4, -2118442474);
        int i4 = ITrustedWebActivityCallbackStub + 53;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 23;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(benefitPremiumAdCollapsedView, zBooleanValue, iIntValue, zBooleanValue2);
        int i4 = ITrustedWebActivityCallbackStub + 125;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        float f;
        RecyclerView recyclerView;
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = (~(i7 | i6)) | (~(i7 | i8));
        int i10 = ~i6;
        int i11 = (~(i4 | i10 | i)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i6 + i + i3 + ((-1228711472) * i2) + ((-141981132) * i5);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i6) - 2072313856) + (1118068377 * i) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i3) + ((-287309824) * i2) + ((-1573388288) * i5) + ((-2138374144) * i14);
        int i16 = ((i6 * (-646461497)) - 273503129) + (i * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i3 * (-646461009)) + (i2 * 1623110960) + (i5 * (-2035004020)) + (i14 * 33882112);
        switch (i15 + (i16 * i16 * (-1051394048))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
                int i17 = 2 % 2;
                if (!((Boolean) objArr[1]).booleanValue()) {
                    f = 1.0f;
                } else {
                    int i18 = ITrustedWebActivityCallbackStub + 123;
                    IPostMessageService_Parcel = i18 % 128;
                    int i19 = i18 % 2;
                    f = 0.0f;
                }
                benefitPremiumAdCollapsedView.IAuthTabCallback(f);
                Unit unit = Unit.INSTANCE;
                int i20 = IPostMessageService_Parcel + 81;
                ITrustedWebActivityCallbackStub = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            case 9:
                return onTransact(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallback_Parcel(objArr);
            case 12:
                BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView2 = (BenefitPremiumAdCollapsedView) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i22 = 2 % 2;
                int i23 = IPostMessageService_Parcel + 87;
                ITrustedWebActivityCallbackStub = i23 % 128;
                int i24 = i23 % 2;
                benefitPremiumAdCollapsedView2.onWarmupCompleted(iIntValue, zBooleanValue);
                int i25 = ITrustedWebActivityCallbackStub + 47;
                IPostMessageService_Parcel = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return access100(objArr);
            case 16:
                return access000(objArr);
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return extraCallback(objArr);
            case 19:
                return writeTypedObject(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            case 21:
                return readTypedObject(objArr);
            case 22:
                return onPostMessage(objArr);
            case 23:
                return onMessageChannelReady(objArr);
            case 24:
                return onActivityLayout(objArr);
            case 25:
                return onActivityResized(objArr);
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return onMinimized(objArr);
            case 27:
                return onUnminimized(objArr);
            case 28:
                return onRelationshipValidationResult(objArr);
            case 29:
                return ICustomTabsCallbackStubProxy(objArr);
            case 30:
                return ICustomTabsCallbackDefault(objArr);
            case 31:
                return ICustomTabsCallbackStub(objArr);
            case 32:
                return mayLaunchUrl(objArr);
            case 33:
                return isEngagementSignalsApiAvailable(objArr);
            case 34:
                return ICustomTabsService(objArr);
            case 35:
                return extraCommand(objArr);
            case R$styleable.CameraView_cameraPictureSnapshotMetering /* 36 */:
                return ICustomTabsCallback_Parcel(objArr);
            case R$styleable.CameraView_cameraPlaySounds /* 37 */:
                BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView3 = (BenefitPremiumAdCollapsedView) objArr[0];
                int i27 = 2 % 2;
                int i28 = ITrustedWebActivityCallbackStub + 39;
                IPostMessageService_Parcel = i28 % 128;
                int i29 = i28 % 2;
                benefitPremiumAdCollapsedView3.onExtraCallback(true);
                return Unit.INSTANCE;
            case 38:
                return prefetch(objArr);
            case R$styleable.CameraView_cameraPreviewFrameRate /* 39 */:
                return newSessionWithExtras(objArr);
            case R$styleable.CameraView_cameraPreviewFrameRateExact /* 40 */:
                return postMessage(objArr);
            case R$styleable.CameraView_cameraRequestPermissions /* 41 */:
                return newAuthTabSession(objArr);
            case R$styleable.CameraView_cameraSnapshotMaxHeight /* 42 */:
                return newSession(objArr);
            case R$styleable.CameraView_cameraSnapshotMaxWidth /* 43 */:
                return receiveFile(objArr);
            case R$styleable.CameraView_cameraUseDeviceOrientation /* 44 */:
                return requestPostMessageChannelWithExtras(objArr);
            case R$styleable.CameraView_cameraVideoBitRate /* 45 */:
                return setEngagementSignalsCallback(objArr);
            case 46:
                BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView4 = (BenefitPremiumAdCollapsedView) objArr[0];
                int i30 = 2 % 2;
                ViewPager2 viewPager2 = benefitPremiumAdCollapsedView4.access100.IAuthTabCallbackStub;
                viewPager2.setAdapter(benefitPremiumAdCollapsedView4.extraCallbackWithResult);
                viewPager2.setOrientation(0);
                viewPager2.setOffscreenPageLimit(RangesKt.coerceAtLeast(benefitPremiumAdCollapsedView4.onMinimized.size(), 2) - 1);
                viewPager2.setClipChildren(false);
                viewPager2.setClipToPadding(false);
                benefitPremiumAdCollapsedView4.onExtraCallbackWithResult(false);
                viewPager2.onExtraCallbackWithResult(benefitPremiumAdCollapsedView4.new ICustomTabsCallbackStubProxy());
                RecyclerView childAt = benefitPremiumAdCollapsedView4.access100.IAuthTabCallbackStub.getChildAt(0);
                if (childAt instanceof RecyclerView) {
                    recyclerView = childAt;
                    int i31 = IPostMessageService_Parcel + 115;
                    ITrustedWebActivityCallbackStub = i31 % 128;
                    int i32 = i31 % 2;
                } else {
                    recyclerView = null;
                }
                if (recyclerView != null) {
                    recyclerView.setClipChildren(false);
                    recyclerView.setClipToPadding(false);
                    recyclerView.setOverScrollMode(2);
                }
                int i33 = IPostMessageService_Parcel + 65;
                ITrustedWebActivityCallbackStub = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case R$styleable.CameraView_cameraVideoMaxDuration /* 47 */:
                return prefetchWithMultipleUrls(objArr);
            case R$styleable.CameraView_cameraVideoMaxSize /* 48 */:
                return requestPostMessageChannel(objArr);
            case 49:
                return updateVisuals(objArr);
            case 50:
                return warmup(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 7;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(objArr, 1721758767, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1721758736);
        int i4 = ITrustedWebActivityCallbackStub + 27;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 25;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(benefitPremiumAdCollapsedView, i, f);
        int i5 = ITrustedWebActivityCallbackStub + 41;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel + 43;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(benefitPremiumAdCollapsedView, i, i2);
        int i6 = ITrustedWebActivityCallbackStub + 89;
        IPostMessageService_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, int i2, float f) {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 51;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)}, 1152249378, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1152249367);
        int i6 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 51 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 67;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(benefitPremiumAdCollapsedView, z);
        int i4 = IPostMessageService_Parcel + 103;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitWriteTypedObject;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z, int i, int i2, int i3, float f, float f2, int i4, boolean z2, int i5, int i6, Function0 function0) {
        int i7 = 2 % 2;
        int i8 = ITrustedWebActivityCallbackStub + 65;
        IPostMessageService_Parcel = i8 % 128;
        if (i8 % 2 != 0) {
            return onNavigationEvent(benefitPremiumAdCollapsedView, z, i, i2, i3, f, f2, i4, z2, i5, i6, function0);
        }
        onNavigationEvent(benefitPremiumAdCollapsedView, z, i, i2, i3, f, f2, i4, z2, i5, i6, function0);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z, boolean z2, int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        int i8 = 2 % 2;
        int i9 = IPostMessageService_Parcel + 55;
        ITrustedWebActivityCallbackStub = i9 % 128;
        if (i9 % 2 == 0) {
            return onExtraCallbackWithResult(benefitPremiumAdCollapsedView, z, z2, i, i2, i3, f, f2, i4, i5, i6, i7);
        }
        onExtraCallbackWithResult(benefitPremiumAdCollapsedView, z, z2, i, i2, i3, f, f2, i4, i5, i6, i7);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 9;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(attachapplovinsdk);
        int i4 = IPostMessageService_Parcel + 39;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 85;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {benefitPremiumAdCollapsedView, Float.valueOf(fFloatValue)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(objArr2, 1396063058, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1396063043);
        int i4 = IPostMessageService_Parcel + 1;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 73;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(benefitPremiumAdCollapsedView, f);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return unitAccess100;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 109;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            onTransact(benefitPremiumAdCollapsedView, i, f);
            throw null;
        }
        Unit unitOnTransact = onTransact(benefitPremiumAdCollapsedView, i, f);
        int i4 = ITrustedWebActivityCallbackStub + 103;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 103;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(benefitPremiumAdCollapsedView, onextracallbackwithresult, motionEvent);
        int i4 = IPostMessageService_Parcel + 51;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 29;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallbackStubProxy(benefitPremiumAdCollapsedView, z);
            throw null;
        }
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(benefitPremiumAdCollapsedView, z);
        int i3 = ITrustedWebActivityCallbackStub + 25;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        return unitICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 73;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        warmup(benefitPremiumAdCollapsedView);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 43;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitPremiumAdCollapsedView};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(objArr, 1590307436, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent4, -1590307399);
        int i4 = IPostMessageService_Parcel + 29;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 29;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(benefitPremiumAdCollapsedView, f);
        int i4 = ITrustedWebActivityCallbackStub + 115;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 103;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(benefitPremiumAdCollapsedView, i, f);
        int i5 = ITrustedWebActivityCallbackStub + 1;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 71;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallback = extraCallback(benefitPremiumAdCollapsedView, z);
        int i4 = ITrustedWebActivityCallbackStub + 85;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 45;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(benefitPremiumAdCollapsedView, z, z2);
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        int i5 = ITrustedWebActivityCallbackStub + 19;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 17;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(benefitPremiumAdCollapsedView, i, z);
        int i5 = IPostMessageService_Parcel + 53;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private final float onTransact(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 51;
        int i5 = i4 % 128;
        IPostMessageService_Parcel = i5;
        int i6 = i4 % 2;
        if (i > 0) {
            return i2 / i;
        }
        int i7 = i5 + 31;
        ITrustedWebActivityCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return 1.0f;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 83;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {benefitPremiumAdCollapsedView, Boolean.valueOf(zBooleanValue)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(objArr2, 387508042, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -387508007);
        int i4 = IPostMessageService_Parcel + 83;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 39;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 == 0) {
            return (Unit) onExtraCallback(objArr, 316579509, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent4, -316579462);
        }
        int i4 = 18 / 0;
        return (Unit) onExtraCallback(objArr, 316579509, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent4, -316579462);
    }

    public static /* synthetic */ void onTransact(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 65;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService(benefitPremiumAdCollapsedView);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IPostMessageService_Parcel + 55;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 51;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -355232083, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 355232085);
        }
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 119;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(benefitPremiumAdCollapsedView, f);
        int i4 = ITrustedWebActivityCallbackStub + 75;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return typedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 85;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(benefitPremiumAdCollapsedView, i, f);
        int i5 = IPostMessageService_Parcel + 31;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 77;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(benefitPremiumAdCollapsedView, onextracallbackwithresult, motionEvent);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 109;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject(benefitPremiumAdCollapsedView, z);
            throw null;
        }
        Unit typedObject = readTypedObject(benefitPremiumAdCollapsedView, z);
        int i3 = ITrustedWebActivityCallbackStub + 9;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return typedObject;
    }

    public static /* synthetic */ void onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, View view) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback(benefitPremiumAdCollapsedView, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IPostMessageService_Parcel + 55;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object prefetch(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 29;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {benefitPremiumAdCollapsedView, Integer.valueOf(iIntValue)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 == 0) {
            return (Unit) onExtraCallback(objArr2, -1437431985, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent4, 1437432024);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object requestPostMessageChannelWithExtras(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        MotionEvent motionEvent = (MotionEvent) objArr[1];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 43;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView, motionEvent}, -2083453288, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2083453302);
        int i4 = ITrustedWebActivityCallbackStub + 73;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object updateVisuals(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 35;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(benefitPremiumAdCollapsedView, iIntValue, iIntValue2, fFloatValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(benefitPremiumAdCollapsedView, iIntValue, iIntValue2, fFloatValue);
        int i3 = IPostMessageService_Parcel + 29;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView = (BenefitPremiumAdCarouselItemView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 75;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(benefitPremiumAdCarouselItemView, fFloatValue);
        }
        onWarmupCompleted(benefitPremiumAdCarouselItemView, fFloatValue);
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if ((r2 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            r0 = 17 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IAuthTabCallbackStub.onExtraCallbackWithResult + 67;
            im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IAuthTabCallbackStub.IAuthTabCallback = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class ICustomTabsCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public ICustomTabsCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if (r1 != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r3.onNavigationEvent)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onNavigationEvent) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ICustomTabsCallback.onExtraCallback + 21;
            im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ICustomTabsCallback.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 99 / 0;
            }
        }
    }

    public static final class ICustomTabsCallbackStub implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public ICustomTabsCallbackStub(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class access000 implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public access000(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onNavigationEvent + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 == 0) {
                    int i5 = 74 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public asBinder(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public asInterface(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            obj.hashCode();
            throw null;
        }
    }

    public static final class extraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public extraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onNavigationEvent + 71;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i6 = onNavigationEvent + 95;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i7 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class extraCallbackWithResult implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public extraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i5 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onWarmupCompleted + 81;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            int i5 = onWarmupCompleted + 1;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i6 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onActivityResized implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onActivityResized(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.onActivityResized.onWarmupCompleted + 121;
            im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.onActivityResized.IAuthTabCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            if ((r2 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 36 / 0;
            }
        }
    }

    public static final class onMessageChannelReady implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onMessageChannelReady(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onTransact(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                int i2 = IAuthTabCallback + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onUnminimized implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onUnminimized(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                int i2 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onWarmupCompleted + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onWarmupCompleted + 83;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = onExtraCallback + 41;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class writeTypedObject implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public writeTypedObject(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            if (r1 == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onNavigationEvent) != true) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onNavigationEvent) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            r1 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.writeTypedObject.onExtraCallbackWithResult + 117;
            im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.writeTypedObject.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 76 / 0;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BenefitPremiumAdCollapsedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ITrustedWebActivityCallbackStub + 23;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IPostMessageService_Parcel + 113;
            ITrustedWebActivityCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ float IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 79;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        float fAsInterface = benefitPremiumAdCollapsedView.asInterface(i);
        if (i4 == 0) {
            int i5 = 30 / 0;
        }
        return fAsInterface;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 105;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean z = benefitPremiumAdCollapsedView.requestPostMessageChannel;
        if (i3 != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStubProxy(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 57;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        benefitPremiumAdCollapsedView.IPostMessageServiceStub = f;
        if (i4 != 0) {
            int i5 = 59 / 0;
        }
        int i6 = i2 + 89;
        ITrustedWebActivityCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ Float IAuthTabCallback_Parcel(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 17;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        Float f = benefitPremiumAdCollapsedView.onWarmupCompleted;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 91;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final /* synthetic */ Integer ICustomTabsCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 103;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Integer num = benefitPremiumAdCollapsedView.IAuthTabCallbackDefault;
        int i5 = i2 + 33;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return num;
    }

    public static final /* synthetic */ boolean ICustomTabsCallbackDefault(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 93;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zPrefetchWithMultipleUrls = benefitPremiumAdCollapsedView.prefetchWithMultipleUrls();
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return zPrefetchWithMultipleUrls;
    }

    public static final /* synthetic */ void ICustomTabsCallbackStubProxy(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 95;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.newSessionWithExtras();
        int i4 = IPostMessageService_Parcel + 73;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void ICustomTabsCallback_Parcel(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 71;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.updateVisuals();
        int i4 = ITrustedWebActivityCallbackStub + 17;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ int access100(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 79;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return benefitPremiumAdCollapsedView.asBinder(z);
        }
        benefitPremiumAdCollapsedView.asBinder(z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Float extraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 71;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Float f = benefitPremiumAdCollapsedView.onTransact;
        if (i3 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Float extraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 95;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Float f = benefitPremiumAdCollapsedView.onNavigationEvent;
        if (i3 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 33;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            benefitPremiumAdCollapsedView.ICustomTabsCallbackStub();
            throw null;
        }
        boolean zICustomTabsCallbackStub = benefitPremiumAdCollapsedView.ICustomTabsCallbackStub();
        int i3 = IPostMessageService_Parcel + 25;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zICustomTabsCallbackStub);
        }
        throw null;
    }

    public static final /* synthetic */ int getInterfaceDescriptor(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 23;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = benefitPremiumAdCollapsedView.onWarmupCompleted(z);
        int i4 = ITrustedWebActivityCallbackStub + 41;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    public static final /* synthetic */ void isEngagementSignalsApiAvailable(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 91;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.access200();
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
    }

    public static final /* synthetic */ long onActivityLayout(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 29;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return benefitPremiumAdCollapsedView.readTypedObject;
        }
        long j = benefitPremiumAdCollapsedView.readTypedObject;
        throw null;
    }

    public static final /* synthetic */ int onActivityResized(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 43;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased;
        int i6 = i3 + 75;
        ITrustedWebActivityCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final /* synthetic */ void onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, Integer num, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 87;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.onExtraCallback(num, z);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
    }

    public static final /* synthetic */ List onMinimized(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 31;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        List<getBatteryInfo.onExtraCallbackWithResult> list = benefitPremiumAdCollapsedView.onMinimized;
        int i5 = i3 + 73;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final /* synthetic */ void onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel;
        int i4 = i3 + 59;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        benefitPremiumAdCollapsedView.onMessageChannelReady = i;
        int i6 = i3 + 27;
        ITrustedWebActivityCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ float onPostMessage(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 43;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        Object obj = null;
        float f = benefitPremiumAdCollapsedView.IPostMessageServiceStub;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 45;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 51;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long jOnActivityLayout = benefitPremiumAdCollapsedView.onActivityLayout();
        int i4 = IPostMessageService_Parcel + 121;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(jOnActivityLayout);
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 41;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -996479963, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 996480003);
        int i4 = IPostMessageService_Parcel + 37;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ boolean onUnminimized(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 23;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            benefitPremiumAdCollapsedView.setEngagementSignalsCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean engagementSignalsCallback = benefitPremiumAdCollapsedView.setEngagementSignalsCallback();
        int i3 = IPostMessageService_Parcel + 13;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return engagementSignalsCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 23;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel + 9;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {benefitPremiumAdCollapsedView, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(objArr, 714824239, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -714824191);
        int i6 = ITrustedWebActivityCallbackStub + 11;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, getPackageType getpackagetype) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 13;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.IPostMessageService = getpackagetype;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 99;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = benefitPremiumAdCollapsedView.requestPostMessageChannelWithExtras;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return Boolean.valueOf(z);
    }

    public static final /* synthetic */ createNavigator readTypedObject(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 117;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        createNavigator createnavigator = benefitPremiumAdCollapsedView.access100;
        if (i4 == 0) {
            int i5 = 64 / 0;
        }
        int i6 = i2 + 13;
        IPostMessageService_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return createnavigator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Integer writeTypedObject(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 83;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Integer num = benefitPremiumAdCollapsedView.asBinder;
        int i5 = i2 + 99;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (IEngagementSignalsCallbackStubProxy ^ 1094535280733222934L)));
                int i7 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ITrustedWebActivityCallback);
                    objArr2[2] = Integer.valueOf(i7);
                    objArr2[1] = Integer.valueOf(i6);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int iMyPid = (Process.myPid() >> 22) + 10;
                        int i8 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iMyPid, i8, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (IPostMessageServiceDefault ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IEngagementSignalsCallback_Parcel)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 10 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i9 = $10 + 77;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Color.green(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, 19901 - Color.red(0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $10 + 53;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitPremiumAdCollapsedView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(ScreenBrightnessBridgeExtension11.onWarmupCompleted(context, 1.2f), attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        createNavigator createnavigatorOnWarmupCompleted = createNavigator.onWarmupCompleted(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(createnavigatorOnWarmupCompleted, "");
        this.access100 = createnavigatorOnWarmupCompleted;
        this.extraCallbackWithResult = new onExtraCallbackWithResult(this);
        this.onMinimized = CollectionsKt.emptyList();
        this.newSession = true;
        this.receiveFile = true;
        this.onActivityLayout = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback()));
        setClipChildren(false);
        setClipToPadding(false);
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this}, -165054908, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 165054954);
        requestPostMessageChannel();
        onExtraCallback(false);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 47;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> function1 = benefitPremiumAdCollapsedView.writeTypedList;
        int i5 = i2 + 107;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public final void setOnClick(@Nullable Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> function1) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 41;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        this.writeTypedList = function1;
        int i5 = i3 + 55;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setOnActionClick(@Nullable Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> function1) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 67;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.updateVisuals = function1;
        if (i3 != 0) {
            throw null;
        }
    }

    public final Function0<Unit> asBinder() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 95;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = this.onSessionEnded;
        int i5 = i2 + 55;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return function0;
    }

    public final void setOnCloseClick(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 91;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onSessionEnded = function0;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnExpandedActionClick(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 51;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.IEngagementSignalsCallbackDefault = function0;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 91;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Function1<getBatteryInfo.onExtraCallbackWithResult, Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 97;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsServiceStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnCarouselItemClick(@Nullable Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> function1) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 117;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        this.ICustomTabsServiceStubProxy = function1;
        int i5 = i3 + 95;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnCarouselVideoDisplayChanged(@Nullable getBacktraceNote<? super unRegisterBatteryReceiver, ? super getBatteryInfo.onExtraCallbackWithResult, ? super Boolean, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 107;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        this.IEngagementSignalsCallback = getbacktracenote;
        int i5 = i3 + 43;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Function1<unRegisterBatteryReceiver, Unit> onTransact() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 121;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsService_Parcel;
        }
        throw null;
    }

    public final void setOnCarouselVideoDisplayDetached(@Nullable Function1<? super unRegisterBatteryReceiver, Unit> function1) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 1;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsService_Parcel = function1;
        int i5 = i2 + 71;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final Function0<Unit> asInterface() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 111;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = this.access200;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return function0;
    }

    public final void setOnCarouselScrolled(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 125;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.access200 = function0;
        int i5 = i2 + 55;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object receiveFile(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 11;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        int i4 = i2 % 2;
        Function0<Unit> function0 = benefitPremiumAdCollapsedView.IEngagementSignalsCallbackStub;
        int i5 = i3 + 45;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return function0;
    }

    public final void setOnMuteClick(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 9;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.IEngagementSignalsCallbackStub = function0;
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
    }

    private static final void extraCommand(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 109;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.validateRelationship();
        int i4 = IPostMessageService_Parcel + 37;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@NotNull getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.IAuthTabCallbackStubProxy = onextracallbackwithresult;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this, onextracallbackwithresult}, -930176554, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 930176588);
        IAuthTabCallback(onextracallbackwithresult);
        onWarmupCompleted(onextracallbackwithresult);
        onNavigationEvent(onextracallbackwithresult);
        post(new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda55(this));
        requestLayout();
        int i2 = IPostMessageService_Parcel + 47;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
    }

    public final void setHasActivationIntelligenceBelow(boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 111;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.isEngagementSignalsApiAvailable = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 63;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onWarmupCompleted(@NotNull List<getBatteryInfo.onExtraCallbackWithResult> list) throws NoWhenBranchMatchedException {
        String strIAuthTabCallback_Parcel;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(this.onMinimized, this.onGreatestScrollPercentageIncreased);
        float fAsInterface = this.IPostMessageServiceStub;
        this.onMinimized = list;
        int iCoerceIn = RangesKt.coerceIn(this.onGreatestScrollPercentageIncreased, 0, RangesKt.coerceAtLeast(list.size() - 1, 0));
        this.onGreatestScrollPercentageIncreased = iCoerceIn;
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult2 = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(list, iCoerceIn);
        Object obj = null;
        if (onextracallbackwithresult != null) {
            int i4 = ITrustedWebActivityCallbackStub + 107;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                onextracallbackwithresult.IAuthTabCallback_Parcel();
                obj.hashCode();
                throw null;
            }
            strIAuthTabCallback_Parcel = onextracallbackwithresult.IAuthTabCallback_Parcel();
        } else {
            strIAuthTabCallback_Parcel = null;
        }
        boolean zAreEqual = Intrinsics.areEqual(strIAuthTabCallback_Parcel, onextracallbackwithresult2 != null ? onextracallbackwithresult2.IAuthTabCallback_Parcel() : null);
        this.access100.IAuthTabCallbackStub.setOffscreenPageLimit(RangesKt.coerceAtLeast(list.size() - 1, 1));
        updateVisuals();
        if (!zAreEqual) {
            fAsInterface = asInterface(this.onGreatestScrollPercentageIncreased);
        }
        this.IPostMessageServiceStub = fAsInterface;
        this.extraCallbackWithResult.onNavigationEvent(list);
        this.access100.IAuthTabCallbackStub.setCurrentItem(this.onGreatestScrollPercentageIncreased, false);
        onExtraCallback(new Object[]{this, null, false, 3, null}, 1977697890, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1977697848);
        access200();
        onNavigationEvent(this, 0, false, 3, null);
        requestLayout();
        int i5 = ITrustedWebActivityCallbackStub + 117;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 57;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (this.mayLaunchUrl == null) {
            return false;
        }
        int i5 = i2 + 61;
        ITrustedWebActivityCallbackStub = i5 % 128;
        return true ^ (i5 % 2 != 0);
    }

    public static final class onActivityLayout implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onActivityLayout(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                int i2 = onWarmupCompleted + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 55 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onMinimized implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onMinimized(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onWarmupCompleted + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallback + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class onPostMessage implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onPostMessage(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            throw null;
        }
    }

    public static final class onRelationshipValidationResult implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onRelationshipValidationResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 31;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 49 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallback + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        if (benefitPremiumAdCollapsedView.ICustomTabsCallbackStub()) {
            int i2 = ITrustedWebActivityCallbackStub + 69;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 != 0 ? benefitPremiumAdCollapsedView.onMinimized.size() > 1 : benefitPremiumAdCollapsedView.onMinimized.size() > 0) {
                int i3 = ITrustedWebActivityCallbackStub + 9;
                IPostMessageService_Parcel = i3 % 128;
                int i4 = i3 % 2;
                RecyclerView childAt = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStub.getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? childAt : null;
                if (recyclerView == null) {
                    int i5 = ITrustedWebActivityCallbackStub + 101;
                    IPostMessageService_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    return CollectionsKt.emptyList();
                }
                Rect rect = new Rect();
                benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStub.getGlobalVisibleRect(rect);
                if (rect.isEmpty()) {
                    int i7 = ITrustedWebActivityCallbackStub + 45;
                    IPostMessageService_Parcel = i7 % 128;
                    if (i7 % 2 != 0) {
                        return CollectionsKt.emptyList();
                    }
                    int i8 = 3 / 0;
                    return CollectionsKt.emptyList();
                }
                IntRange intRangeUntil = RangesKt.until(0, recyclerView.getChildCount());
                ArrayList arrayList = new ArrayList();
                IntIterator it = intRangeUntil.iterator();
                int i9 = IPostMessageService_Parcel + 17;
                ITrustedWebActivityCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                while (it.hasNext()) {
                    View childAt2 = recyclerView.getChildAt(it.nextInt());
                    if (childAt2 == null) {
                        onextracallbackwithresult = null;
                    } else {
                        Integer numValueOf = Integer.valueOf(recyclerView.getChildAdapterPosition(childAt2));
                        if (numValueOf.intValue() == -1) {
                            int i11 = ITrustedWebActivityCallbackStub + 105;
                            IPostMessageService_Parcel = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 56 / 0;
                            }
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            Rect rect2 = new Rect();
                            childAt2.getGlobalVisibleRect(rect2);
                            if (rect2.intersect(rect)) {
                                onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(benefitPremiumAdCollapsedView.onMinimized, iIntValue);
                            }
                        }
                    }
                    if (onextracallbackwithresult != null) {
                        arrayList.add(onextracallbackwithresult);
                    }
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 53;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            this.onGreatestScrollPercentageIncreased = 1;
            updateVisuals();
            this.IPostMessageServiceStub = asInterface(this.onGreatestScrollPercentageIncreased);
            onMinimized();
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            onExtraCallback(new Object[]{this, null, true, 5, null}, 1977697890, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1977697848);
            access200();
            onNavigationEvent(this, 1, true, 1, null);
        } else {
            this.onGreatestScrollPercentageIncreased = 0;
            updateVisuals();
            this.IPostMessageServiceStub = asInterface(this.onGreatestScrollPercentageIncreased);
            onMinimized();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            onExtraCallback(new Object[]{this, null, false, 3, null}, 1977697890, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1977697848);
            access200();
            onNavigationEvent(this, 0, false, 1, null);
        }
        int i3 = ITrustedWebActivityCallbackStub + 69;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    public final boolean readTypedObject() {
        int i = 2 % 2;
        if (!(!ICustomTabsCallbackStub())) {
            getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(this.onMinimized, this.onGreatestScrollPercentageIncreased);
            getBatteryInfo.IAuthTabCallback iAuthTabCallbackAsInterface = null;
            if (onextracallbackwithresult != null) {
                int i2 = ITrustedWebActivityCallbackStub + 27;
                IPostMessageService_Parcel = i2 % 128;
                if (i2 % 2 == 0) {
                    onextracallbackwithresult.onNavigationEvent();
                    iAuthTabCallbackAsInterface.hashCode();
                    throw null;
                }
                getBatteryInfo.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
                if (onwarmupcompletedOnNavigationEvent != null) {
                    iAuthTabCallbackAsInterface = onwarmupcompletedOnNavigationEvent.asInterface();
                }
            }
            if (iAuthTabCallbackAsInterface == getBatteryInfo.IAuthTabCallback.VIDEO) {
                int i3 = ITrustedWebActivityCallbackStub + 51;
                IPostMessageService_Parcel = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        int i5 = IPostMessageService_Parcel + 105;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return false;
    }

    public final void setCarouselVideoProgress(float f) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 9;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (readTypedObject()) {
            this.IPostMessageServiceStub = RangesKt.coerceIn(f, 0.0f, 1.0f);
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            onExtraCallback(new Object[]{this}, -996479963, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 996480003);
            int i4 = IPostMessageService_Parcel + 57;
            ITrustedWebActivityCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 57 / 0;
            }
        }
    }

    public final void access100() {
        int i = 2 % 2;
        if (!ICustomTabsCallbackStub()) {
            return;
        }
        int i2 = ITrustedWebActivityCallbackStub + 103;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (this.onMinimized.isEmpty()) {
            return;
        }
        this.IPostMessageServiceStub = 1.0f;
        onExtraCallback(new Object[]{this}, -996479963, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 996480003);
        this.access100.IAuthTabCallbackStub.setCurrentItem((this.onGreatestScrollPercentageIncreased + 1) % this.onMinimized.size(), true);
        int i4 = ITrustedWebActivityCallbackStub + 27;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r4.newSession = r5;
        access200();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.newSession == r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.newSession == r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 71;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCarouselAutoAdvanceEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 87;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 90 / 0;
        }
    }

    @Override // o.unRegisterBatteryReceiver
    public void onExtraCallbackWithResult(@Nullable ExoPlayer exoPlayer) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 53;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.access100.onMinimized.setPlayer(exoPlayer);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.unRegisterBatteryReceiver
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 125;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.access100.onMinimized.setPlayer((Player) null);
        int i4 = IPostMessageService_Parcel + 41;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.unRegisterBatteryReceiver
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 61;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = this.access100.onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        SafePlayerView safePlayerView = this.access100.onMinimized;
        Intrinsics.checkNotNullExpressionValue(safePlayerView, "");
        safePlayerView.setVisibility(0);
        this.access100.onMinimized.setAlpha(0.0f);
        TdsRoundLayout tdsRoundLayout = this.access100.ICustomTabsCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        tdsRoundLayout.setVisibility(0);
        this.access100.onActivityLayout.bringToFront();
        int i4 = ITrustedWebActivityCallbackStub + 87;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setMuted(boolean z) throws Throwable {
        Object obj;
        String strIntern;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 39;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.receiveFile = z;
        TdsImageView tdsImageView = this.access100.onUnminimized;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        if (z) {
            int i4 = ITrustedWebActivityCallbackStub + 61;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{23454, 32284, 24260, 6098, 60296, 6838, 14099, 1012, 38502, 60763, 37437, 4444, 58880, 60276, 47964, 1314, 1912, 3801, 27551, 16890, 30497, 30371, 7963, 58126, 6956, 64909, 58096, 45363, 46511, 49794, 24255, 22495, 59801, 53873, 44342, 33964, 58880, 60276, 63974, 23149, 21489, 56932, 19356, 15950, 25117, 37733, 48357, 26818, 9876, 64703, 61840, 49208, 63974, 23149, 23016, 60464, 18965, 48388, 40273, 30771}, 59 - View.MeasureSpec.getSize(0), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{23454, 32284, 24260, 6098, 60296, 6838, 14099, 1012, 38502, 60763, 37437, 4444, 58880, 60276, 47964, 1314, 1912, 3801, 27551, 16890, 30497, 30371, 7963, 58126, 6956, 64909, 58096, 45363, 46511, 49794, 24255, 22495, 59801, 53873, 44342, 33964, 58880, 60276, 63974, 23149, 21489, 56932, 19356, 15950, 25117, 37733, 48357, 26818, 9876, 64703, 61840, 49208, 63974, 23149, 23016, 60464, 18965, 48388, 40273, 30771}, 123 - View.MeasureSpec.getSize(0), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
                TdsImageView tdsImageView2 = this.access100.onUnminimized;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                tdsImageView2.setImageTintList(ColorStateList.valueOf(new getUrlokhttp(new onUnminimized(configuration)).requestPostMessageChannel().access200()));
                this.extraCallbackWithResult.onNavigationEvent(z);
                ICustomTabsService_Parcel();
            }
        } else {
            Object[] objArr3 = new Object[1];
            a(new char[]{23454, 32284, 24260, 6098, 60296, 6838, 14099, 1012, 38502, 60763, 37437, 4444, 58880, 60276, 47964, 1314, 1912, 3801, 27551, 16890, 30497, 30371, 7963, 58126, 6956, 64909, 58096, 45363, 46511, 49794, 24255, 22495, 59801, 53873, 44342, 33964, 58880, 60276, 63974, 23149, 21489, 56932, 19356, 15950, 25117, 37733, 48357, 26818, 20116, 57421, 12916, 55899, 8418, 6094, 52193, 31662, 24255, 22495}, 59 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
            obj = objArr3[0];
        }
        strIntern = ((String) obj).intern();
        TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
        TdsImageView tdsImageView22 = this.access100.onUnminimized;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsImageView22.setImageTintList(ColorStateList.valueOf(new getUrlokhttp(new onUnminimized(configuration2)).requestPostMessageChannel().access200()));
        this.extraCallbackWithResult.onNavigationEvent(z);
        ICustomTabsService_Parcel();
    }

    public final void setMuteButtonEnabled(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 11;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            TdsRoundLayout tdsRoundLayout = this.access100.ICustomTabsCallbackStubProxy;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.access100.ICustomTabsCallbackStubProxy.setAlpha(z ? 1.0f : 0.4f);
        this.access100.ICustomTabsCallbackStubProxy.setClickable(z);
        this.access100.ICustomTabsCallbackStubProxy.setEnabled(z);
        if (!z) {
            TdsImageView tdsImageView = this.access100.onUnminimized;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            Object[] objArr = new Object[1];
            a(new char[]{23454, 32284, 24260, 6098, 60296, 6838, 14099, 1012, 38502, 60763, 37437, 4444, 58880, 60276, 47964, 1314, 1912, 3801, 27551, 16890, 30497, 30371, 7963, 58126, 6956, 64909, 58096, 45363, 46511, 49794, 24255, 22495, 59801, 53873, 44342, 33964, 58880, 60276, 63974, 23149, 21489, 56932, 19356, 15950, 25117, 37733, 48357, 26818, 9876, 64703, 61840, 49208, 63974, 23149, 23016, 60464, 18965, 48388, 40273, 30771}, ((Process.getThreadPriority(0) + 20) >> 6) + 59, objArr);
            TdsImageView.setImage$default(tdsImageView, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
            TdsImageView tdsImageView2 = this.access100.onUnminimized;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsImageView2.setImageTintList(ColorStateList.valueOf(new getUrlokhttp(new ICustomTabsCallbackStub(configuration)).requestPostMessageChannel().access200()));
        }
        int i3 = IPostMessageService_Parcel + 123;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setMuteButtonVisible(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            TdsRoundLayout tdsRoundLayout = this.access100.ICustomTabsCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            if (!z || (ICustomTabsCallbackStub() && !this.requestPostMessageChannel)) {
                int i4 = IPostMessageService_Parcel + 71;
                int i5 = i4 % 128;
                ITrustedWebActivityCallbackStub = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 61;
                IPostMessageService_Parcel = i7 % 128;
                int i8 = i7 % 2;
                i = 8;
            } else {
                i = 0;
            }
            tdsRoundLayout.setVisibility(i);
            ICustomTabsService_Parcel();
            return;
        }
        Intrinsics.checkNotNullExpressionValue(this.access100.ICustomTabsCallbackStubProxy, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 125;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        view.getLocationOnScreen(iArr2);
        int height = (iArr[1] - iArr2[1]) + getHeight();
        int i4 = ITrustedWebActivityCallbackStub + 29;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return height;
    }

    public final int onNavigationEvent(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 57;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int[] iArr = new int[5];
            int[] iArr2 = new int[2];
            getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            return (iArr[1] / iArr2[0]) >>> this.access100.ICustomTabsCallbackDefault.getBottom();
        }
        Intrinsics.checkNotNullParameter(view, "");
        int[] iArr3 = new int[2];
        int[] iArr4 = new int[2];
        getLocationOnScreen(iArr3);
        view.getLocationOnScreen(iArr4);
        return (iArr3[1] - iArr4[1]) + this.access100.ICustomTabsCallbackDefault.getBottom();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.mayLaunchUrl;
        Object obj = null;
        if (runonuithreaddelayed != null) {
            int i2 = ITrustedWebActivityCallbackStub + 111;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                runonuithreaddelayed.onNavigationEvent();
            } else {
                runonuithreaddelayed.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
        }
        this.mayLaunchUrl = null;
        warmup();
        updateVisuals();
        getPackageType getpackagetype = this.IPostMessageService;
        if (getpackagetype != null) {
            int i3 = ITrustedWebActivityCallbackStub + 15;
            IPostMessageService_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            } else {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        this.IPostMessageService = null;
        this.IAuthTabCallbackStubProxy = null;
        onExtraCallbackWithResult();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        super.onAttachedToWindow();
        post(new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda51(this));
        int i2 = IPostMessageService_Parcel + 59;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void ICustomTabsService(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 15;
        ITrustedWebActivityCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            benefitPremiumAdCollapsedView.validateRelationship();
            benefitPremiumAdCollapsedView.access200();
            int i3 = IPostMessageService_Parcel + 83;
            ITrustedWebActivityCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        benefitPremiumAdCollapsedView.validateRelationship();
        benefitPremiumAdCollapsedView.access200();
        obj.hashCode();
        throw null;
    }

    private static final void newSessionWithExtras(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 81;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        benefitPremiumAdCollapsedView.validateRelationship();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IPostMessageService_Parcel + 61;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NotNull View view, int i) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 11;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onVisibilityChanged(view, i);
            Intrinsics.areEqual(view, this);
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onVisibilityChanged(view, i);
        if (Intrinsics.areEqual(view, this)) {
            if (i == 0) {
                post(new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda53(this));
                return;
            } else {
                warmup();
                return;
            }
        }
        int i4 = ITrustedWebActivityCallbackStub + 67;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 9;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.validateRelationship();
        int i4 = ITrustedWebActivityCallbackStub + 115;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        warmup();
        r4 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ITrustedWebActivityCallbackStub + 19;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if ((r4 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r4 = 12 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r4 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        post(new im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda52(r3));
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onWindowVisibilityChanged(int i) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 103;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            super.onWindowVisibilityChanged(i);
            int i4 = 10 / 0;
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int iPrefetch;
        int iIntValue;
        int iIAuthTabCallbackStub;
        int iIntValue2;
        int iAsInterface;
        int iIntValue3;
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel + 41;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            View.MeasureSpec.getSize(i);
            throw null;
        }
        int size = View.MeasureSpec.getSize(i);
        if (size > 0) {
            int i5 = IPostMessageService_Parcel + 51;
            ITrustedWebActivityCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
                if (setEngagementSignalsCallback()) {
                    int iOnTransact = onTransact(size);
                    if (ICustomTabsCallbackStub() || this.requestPostMessageChannel) {
                        int iICustomTabsService = ICustomTabsService();
                        int i7 = IPostMessageService_Parcel + 47;
                        ITrustedWebActivityCallbackStub = i7 % 128;
                        int i8 = i7 % 2;
                        iIntValue2 = iICustomTabsService;
                    } else {
                        iIntValue2 = ((Integer) onExtraCallback(new Object[]{this, Integer.valueOf(iOnTransact)}, 2059244095, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2059244050)).intValue();
                    }
                    Integer num = this.getInterfaceDescriptor;
                    if (num != null) {
                        iOnTransact = num.intValue();
                    } else {
                        if (ICustomTabsCallbackStub() || this.requestPostMessageChannel) {
                            iAsInterface = asInterface(size, iIntValue2);
                        }
                        int iIAuthTabCallback = IAuthTabCallback(iIntValue2);
                        int iAsBinder = asBinder(iAsInterface);
                        this.validateRelationship = Integer.valueOf(iAsInterface);
                        onExtraCallback(size, iAsBinder, iIAuthTabCallback, iAsInterface, iIntValue2);
                    }
                    iAsInterface = iOnTransact;
                    int iIAuthTabCallback2 = IAuthTabCallback(iIntValue2);
                    int iAsBinder2 = asBinder(iAsInterface);
                    this.validateRelationship = Integer.valueOf(iAsInterface);
                    onExtraCallback(size, iAsBinder2, iIAuthTabCallback2, iAsInterface, iIntValue2);
                } else {
                    Integer num2 = this.getInterfaceDescriptor;
                    if (num2 != null) {
                        int i9 = IPostMessageService_Parcel + 15;
                        ITrustedWebActivityCallbackStub = i9 % 128;
                        int i10 = i9 % 2;
                        iIntValue3 = num2.intValue();
                    } else {
                        int iOnTransact2 = onTransact(size);
                        int i11 = ITrustedWebActivityCallbackStub + 13;
                        IPostMessageService_Parcel = i11 % 128;
                        int i12 = i11 % 2;
                        iIntValue3 = iOnTransact2;
                    }
                    this.validateRelationship = Integer.valueOf(iIntValue3);
                    onExtraCallback(iIntValue3, ((Integer) onExtraCallback(new Object[]{this, Integer.valueOf(iIntValue3)}, 2059244095, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2059244050)).intValue());
                }
            } else if (!(!setEngagementSignalsCallback())) {
            }
        }
        Integer num3 = this.validateRelationship;
        if (num3 == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (!setEngagementSignalsCallback()) {
            iPrefetch = prefetch();
            iIntValue = ((Integer) onExtraCallback(new Object[]{this, Integer.valueOf(num3.intValue())}, 2059244095, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2059244050)).intValue();
        } else if (ICustomTabsCallbackStub() || this.requestPostMessageChannel) {
            iIAuthTabCallbackStub = IAuthTabCallbackStub(ICustomTabsService());
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iIAuthTabCallbackStub, 1073741824));
            setMeasuredDimension(getMeasuredWidth(), iIAuthTabCallbackStub);
        } else {
            iPrefetch = prefetch();
            iIntValue = ((Integer) onExtraCallback(new Object[]{this, Integer.valueOf(num3.intValue())}, 2059244095, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2059244050)).intValue();
        }
        iIAuthTabCallbackStub = iPrefetch + iIntValue;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iIAuthTabCallbackStub, 1073741824));
        setMeasuredDimension(getMeasuredWidth(), iIAuthTabCallbackStub);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setExpanded$default(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z, Integer num, boolean z2, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 123;
        int i4 = i3 % 128;
        ITrustedWebActivityCallbackStub = i4;
        if (i3 % 2 == 0 ? (i & 8) != 0 : (i & 121) != 0) {
            int i5 = i4 + 23;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            function0 = null;
        }
        benefitPremiumAdCollapsedView.setExpanded(z, num, z2, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setExpanded(boolean z, @Nullable Integer num, boolean z2, @Nullable Function0<Unit> function0) {
        int iIntValue;
        int iIntValue2;
        Float f;
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        boolean z3;
        int iIntValue3;
        int i;
        int iIntValue4;
        int iIntValue5;
        int i2;
        int iIntValue6;
        int iOnNavigationEvent3;
        int iOnNavigationEvent4;
        boolean z4;
        runOnUiThreadDelayed runonuithreaddelayed;
        int i3;
        float f2;
        DisplayMetrics displayMetrics;
        int i4;
        int i5 = 2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        int iValueOf = 0;
        if (IAuthTabCallbackStubProxy()) {
            return;
        }
        boolean zICustomTabsCallbackStub = ICustomTabsCallbackStub();
        Integer numValueOf = Integer.valueOf(getMeasuredWidth());
        if (numValueOf.intValue() <= 0) {
            int i6 = IPostMessageService_Parcel + 91;
            ITrustedWebActivityCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            numValueOf = null;
        }
        Integer numValueOf2 = numValueOf != null ? Integer.valueOf(onTransact(numValueOf.intValue())) : null;
        Integer num2 = this.validateRelationship;
        if (num2 == null) {
            num2 = numValueOf2;
        }
        if (num2 == null) {
            if (z) {
                ICustomTabsCallbackStubProxy();
            }
            this.requestPostMessageChannelWithExtras = z;
            this.extraCommand = num;
            IAuthTabCallback(z);
            extraCallbackWithResult();
            requestLayout();
            return;
        }
        if (zICustomTabsCallbackStub) {
            Integer numValueOf3 = Integer.valueOf(getHeight() - onMessageChannelReady());
            if (numValueOf3.intValue() <= 0) {
                numValueOf3 = null;
            }
            iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : ICustomTabsService();
        } else {
            Integer numValueOf4 = Integer.valueOf(getHeight());
            if (numValueOf4.intValue() <= 0) {
                numValueOf4 = null;
            }
            if (numValueOf4 != null) {
                int i8 = IPostMessageService_Parcel + 29;
                ITrustedWebActivityCallbackStub = i8 % 128;
                if (i8 % 2 != 0) {
                    numValueOf4.intValue();
                    throw null;
                }
                iIntValue2 = numValueOf4.intValue();
            } else {
                iIntValue = ((Integer) onExtraCallback(new Object[]{this, Integer.valueOf(num2.intValue())}, 2059244095, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2059244050)).intValue();
                int iIntValue7 = (zICustomTabsCallbackStub || numValueOf == null) ? num2.intValue() : asInterface(numValueOf.intValue(), iIntValue);
                if (zICustomTabsCallbackStub) {
                    f = fValueOf;
                    iOnNavigationEvent = 0;
                } else {
                    int i9 = IPostMessageService_Parcel + 55;
                    f = fValueOf;
                    ITrustedWebActivityCallbackStub = i9 % 128;
                    if (i9 % 2 != 0) {
                        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                        varyMatches.onNavigationEvent(10, displayMetrics2);
                        throw null;
                    }
                    DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                    iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics3);
                }
                if (zICustomTabsCallbackStub) {
                    DisplayMetrics displayMetrics4 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                    iOnNavigationEvent2 = varyMatches.onNavigationEvent(0, displayMetrics4);
                } else {
                    DisplayMetrics displayMetrics5 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                    iOnNavigationEvent2 = varyMatches.onNavigationEvent(28, displayMetrics5);
                }
                float f3 = iOnNavigationEvent2;
                z3 = (z ^ true) && setEngagementSignalsCallback();
                if (z3) {
                    if (!z) {
                        iIntValue3 = numValueOf2 != null ? numValueOf2.intValue() : num2.intValue();
                    } else if (num != null) {
                        iIntValue5 = num.intValue();
                    } else {
                        if (numValueOf2 != null) {
                            int i10 = ITrustedWebActivityCallbackStub + 115;
                            IPostMessageService_Parcel = i10 % 128;
                            int i11 = i10 % 2;
                            iIntValue4 = numValueOf2.intValue();
                        } else {
                            iIntValue4 = num2.intValue();
                        }
                        iIntValue3 = ((Integer) onExtraCallback(new Object[]{this, Integer.valueOf(iIntValue4)}, 2059244095, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2059244050)).intValue();
                    }
                    i = iIntValue3;
                    if (z3) {
                        int i12 = IPostMessageService_Parcel + 33;
                        i2 = iIntValue;
                        int i13 = i12 % 128;
                        ITrustedWebActivityCallbackStub = i13;
                        int i14 = i12 % 2;
                        if (numValueOf != null) {
                            int i15 = i13 + 67;
                            IPostMessageService_Parcel = i15 % 128;
                            int i16 = i15 % 2;
                            iIntValue6 = asInterface(numValueOf.intValue(), i);
                        }
                        int i17 = iIntValue6;
                        if (z3) {
                            iOnNavigationEvent3 = 0;
                        } else {
                            int i18 = ITrustedWebActivityCallbackStub + 61;
                            IPostMessageService_Parcel = i18 % 128;
                            if (i18 % 2 == 0) {
                                DisplayMetrics displayMetrics6 = getResources().getDisplayMetrics();
                                Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                                varyMatches.onNavigationEvent(10, displayMetrics6);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            DisplayMetrics displayMetrics7 = getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
                            iOnNavigationEvent3 = varyMatches.onNavigationEvent(10, displayMetrics7);
                        }
                        if (z3) {
                            DisplayMetrics displayMetrics8 = getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
                            iOnNavigationEvent4 = varyMatches.onNavigationEvent(0, displayMetrics8);
                        } else {
                            int i19 = IPostMessageService_Parcel + 73;
                            ITrustedWebActivityCallbackStub = i19 % 128;
                            int i20 = i19 % 2;
                            DisplayMetrics displayMetrics9 = getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
                            iOnNavigationEvent4 = varyMatches.onNavigationEvent(28, displayMetrics9);
                        }
                        float f4 = iOnNavigationEvent4;
                        z4 = !zICustomTabsCallbackStub || z3;
                        if (z4) {
                            this.requestPostMessageChannel = true;
                            this.postMessage = z;
                            this.getInterfaceDescriptor = Integer.valueOf(iIntValue7);
                            this.access000 = Integer.valueOf(iOnNavigationEvent);
                            this.IAuthTabCallback_Parcel = Float.valueOf(f3);
                            this.IAuthTabCallbackStub = zICustomTabsCallbackStub ? fValueOf2 : f;
                            this.IAuthTabCallback = zICustomTabsCallbackStub ? Integer.valueOf(onPostMessage() + iOnNavigationEvent) : 0;
                            if (!z) {
                                int i21 = IPostMessageService_Parcel + 73;
                                ITrustedWebActivityCallbackStub = i21 % 128;
                                if (i21 % 2 != 0) {
                                    displayMetrics = getResources().getDisplayMetrics();
                                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                                    i4 = 3;
                                } else {
                                    displayMetrics = getResources().getDisplayMetrics();
                                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                                    i4 = 4;
                                }
                                iValueOf = Integer.valueOf(varyMatches.onNavigationEvent(i4, displayMetrics));
                            }
                            this.onExtraCallbackWithResult = iValueOf;
                            this.onWarmupCompleted = !z ? f : fValueOf2;
                            this.onTransact = z ? fValueOf2 : f;
                            this.onNavigationEvent = !z ? f : fValueOf2;
                            this.onRelationshipValidationResult = null;
                            this.ICustomTabsCallbackStubProxy = Integer.valueOf(i);
                            this.ICustomTabsCallback_Parcel = Integer.valueOf(iOnNavigationEvent3);
                            this.newAuthTabSession = false;
                            this.IAuthTabCallbackDefault = Integer.valueOf(onWarmupCompleted(zICustomTabsCallbackStub));
                            this.asBinder = Integer.valueOf(asBinder(zICustomTabsCallbackStub));
                        }
                        this.asInterface = Integer.valueOf(i2);
                        if (!(!z)) {
                            ICustomTabsCallbackStubProxy();
                        }
                        this.requestPostMessageChannelWithExtras = z;
                        this.extraCommand = num;
                        if (!z2 && ((i3 = i2) != i || iIntValue7 != i17 || iOnNavigationEvent != iOnNavigationEvent3 || f3 != f4)) {
                            float f5 = zICustomTabsCallbackStub ? 0.0f : 1.0f;
                            if (z) {
                                int i22 = IPostMessageService_Parcel + 3;
                                ITrustedWebActivityCallbackStub = i22 % 128;
                                int i23 = i22 % 2;
                                f2 = 0.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            onNavigationEvent(z, i3, i, iIntValue7, i17, iOnNavigationEvent, iOnNavigationEvent3, f3, f4, f5, f2, z4, function0);
                            return;
                        }
                        runonuithreaddelayed = this.mayLaunchUrl;
                        if (runonuithreaddelayed != null) {
                            runonuithreaddelayed.onNavigationEvent();
                        }
                        this.mayLaunchUrl = null;
                        onActivityResized();
                        this.asInterface = null;
                        IAuthTabCallback(z);
                        extraCallbackWithResult();
                        onWarmupCompleted(i);
                        if (function0 == null) {
                            function0.invoke();
                            return;
                        }
                        return;
                    }
                    i2 = iIntValue;
                    iIntValue6 = numValueOf2 != null ? numValueOf2.intValue() : num2.intValue();
                    int i172 = iIntValue6;
                    if (z3) {
                    }
                    if (z3) {
                    }
                    float f42 = iOnNavigationEvent4;
                    if (zICustomTabsCallbackStub) {
                    }
                    if (z4) {
                    }
                    this.asInterface = Integer.valueOf(i2);
                    if (!(!z)) {
                    }
                    this.requestPostMessageChannelWithExtras = z;
                    this.extraCommand = num;
                    if (!z2) {
                    }
                    runonuithreaddelayed = this.mayLaunchUrl;
                    if (runonuithreaddelayed != null) {
                    }
                    this.mayLaunchUrl = null;
                    onActivityResized();
                    this.asInterface = null;
                    IAuthTabCallback(z);
                    extraCallbackWithResult();
                    onWarmupCompleted(i);
                    if (function0 == null) {
                    }
                } else {
                    iIntValue5 = num != null ? num.intValue() : ICustomTabsService();
                }
                i = iIntValue5;
                if (z3) {
                }
                if (numValueOf2 != null) {
                }
                int i1722 = iIntValue6;
                if (z3) {
                }
                if (z3) {
                }
                float f422 = iOnNavigationEvent4;
                if (zICustomTabsCallbackStub) {
                }
                if (z4) {
                }
                this.asInterface = Integer.valueOf(i2);
                if (!(!z)) {
                }
                this.requestPostMessageChannelWithExtras = z;
                this.extraCommand = num;
                if (!z2) {
                }
                runonuithreaddelayed = this.mayLaunchUrl;
                if (runonuithreaddelayed != null) {
                }
                this.mayLaunchUrl = null;
                onActivityResized();
                this.asInterface = null;
                IAuthTabCallback(z);
                extraCallbackWithResult();
                onWarmupCompleted(i);
                if (function0 == null) {
                }
            }
        }
        iIntValue = iIntValue2;
        if (zICustomTabsCallbackStub) {
        }
        if (zICustomTabsCallbackStub) {
        }
        if (zICustomTabsCallbackStub) {
        }
        float f32 = iOnNavigationEvent2;
        if (z ^ true) {
        }
        if (z3) {
        }
        i = iIntValue5;
        if (z3) {
        }
        if (numValueOf2 != null) {
        }
        int i17222 = iIntValue6;
        if (z3) {
        }
        if (z3) {
        }
        float f4222 = iOnNavigationEvent4;
        if (zICustomTabsCallbackStub) {
        }
        if (z4) {
        }
        this.asInterface = Integer.valueOf(i2);
        if (!(!z)) {
        }
        this.requestPostMessageChannelWithExtras = z;
        this.extraCommand = num;
        if (!z2) {
        }
        runonuithreaddelayed = this.mayLaunchUrl;
        if (runonuithreaddelayed != null) {
        }
        this.mayLaunchUrl = null;
        onActivityResized();
        this.asInterface = null;
        IAuthTabCallback(z);
        extraCallbackWithResult();
        onWarmupCompleted(i);
        if (function0 == null) {
        }
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        TdsImageView tdsImageView = benefitPremiumAdCollapsedView.access100.onActivityLayout;
        Intrinsics.checkNotNull(tdsImageView);
        TdsImageView.setImage$default(tdsImageView, (String) null, (Function1) null, (Function1) null, 6, (Object) null);
        getBatteryInfo.onWarmupCompleted onwarmupcompletedExtraCallback = onextracallbackwithresult.extraCallback();
        Context context = tdsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        GetBatteryInfoBridgeExtension2.IAuthTabCallback(tdsImageView, (String) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView, onwarmupcompletedExtraCallback, context}, -639321583, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 639321588));
        tdsImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Object obj = null;
        if (onextracallbackwithresult.extraCallback().asInterface() == getBatteryInfo.IAuthTabCallback.IMAGE) {
            int i2 = ITrustedWebActivityCallbackStub + 125;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            benefitPremiumAdCollapsedView.onNavigationEvent();
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = ITrustedWebActivityCallbackStub + 75;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void asBinder(getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult) {
        Spanned spannedIAuthTabCallback;
        int i = 2 % 2;
        boolean z = true;
        int i2 = ITrustedWebActivityCallbackStub + 1;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Typography4 typography4 = this.access100.extraCallbackWithResult;
        typography4.setText(onextracallbackwithresult.IAuthTabCallbackDefault());
        Intrinsics.checkNotNull(typography4);
        int i4 = 8;
        typography4.setVisibility(!StringsKt.isBlank(onextracallbackwithresult.IAuthTabCallbackDefault()) ? 0 : 8);
        typography4.onNavigationEvent(response.Bold);
        typography4.setLineSpacing(0.0f, 1.0f);
        Typography6 typography6 = this.access100.extraCallback;
        String strOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
        Object obj = null;
        if (strOnExtraCallbackWithResult == null) {
            int i5 = IPostMessageService_Parcel + 15;
            ITrustedWebActivityCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            strOnExtraCallbackWithResult = "";
        }
        typography6.setText(strOnExtraCallbackWithResult);
        Intrinsics.checkNotNull(typography6);
        String strOnExtraCallbackWithResult2 = onextracallbackwithresult.onExtraCallbackWithResult();
        typography6.setVisibility((strOnExtraCallbackWithResult2 == null || StringsKt.isBlank(strOnExtraCallbackWithResult2)) ? 8 : 0);
        typography6.onNavigationEvent(response.Regular);
        typography6.setLineSpacing(0.0f, 1.0f);
        String strOnExtraCallback = onextracallbackwithresult.onExtraCallback();
        if (strOnExtraCallback == null || StringsKt.isBlank(strOnExtraCallback)) {
            strOnExtraCallback = null;
        }
        Typography7 typography7 = this.access100.readTypedObject;
        if (strOnExtraCallback != null) {
            spannedIAuthTabCallback = IAuthTabCallback(strOnExtraCallback);
            int i6 = ITrustedWebActivityCallbackStub + 35;
            IPostMessageService_Parcel = i6 % 128;
            int i7 = i6 % 2;
        } else {
            spannedIAuthTabCallback = null;
        }
        typography7.setText(spannedIAuthTabCallback);
        Intrinsics.checkNotNull(typography7);
        if (strOnExtraCallback != null) {
            int i8 = IPostMessageService_Parcel + 61;
            ITrustedWebActivityCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            i4 = 0;
        }
        typography7.setVisibility(i4);
        typography7.setLineSpacing(0.0f, 1.0f);
        Typography4 typography42 = this.access100.extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(typography42, "");
        if (typography42.getVisibility() != 0) {
            Typography6 typography62 = this.access100.extraCallback;
            Intrinsics.checkNotNullExpressionValue(typography62, "");
            if (typography62.getVisibility() != 0) {
                int i10 = IPostMessageService_Parcel + 79;
                ITrustedWebActivityCallbackStub = i10 % 128;
                if (i10 % 2 != 0) {
                    Typography7 typography72 = this.access100.readTypedObject;
                    Intrinsics.checkNotNullExpressionValue(typography72, "");
                    typography72.getVisibility();
                    throw null;
                }
                Typography7 typography73 = this.access100.readTypedObject;
                Intrinsics.checkNotNullExpressionValue(typography73, "");
                if (typography73.getVisibility() != 0) {
                    z = false;
                }
            }
        }
        this.ICustomTabsService = z;
    }

    private static final Unit IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 111;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> function1 = benefitPremiumAdCollapsedView.updateVisuals;
        if (function1 != null) {
            int i5 = i2 + 5;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            function1.invoke(onextracallbackwithresult);
            int i7 = ITrustedWebActivityCallbackStub + 85;
            IPostMessageService_Parcel = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 4;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, View view) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 125;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = benefitPremiumAdCollapsedView.onSessionEnded;
        if (i3 == 0) {
            int i4 = 53 / 0;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (function0 != null) {
        }
        int i5 = ITrustedWebActivityCallbackStub + 19;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult, MotionEvent motionEvent) {
        int i = 2 % 2;
        Function0<Unit> function0 = benefitPremiumAdCollapsedView.IEngagementSignalsCallbackDefault;
        if (function0 != null) {
            int i2 = ITrustedWebActivityCallbackStub + 113;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = ITrustedWebActivityCallbackStub + 117;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> function1 = benefitPremiumAdCollapsedView.updateVisuals;
            if (function1 != null) {
                int i6 = IPostMessageService_Parcel + 15;
                ITrustedWebActivityCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    function1.invoke(onextracallbackwithresult);
                    int i7 = 75 / 0;
                } else {
                    function1.invoke(onextracallbackwithresult);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        FrameLayout frameLayout = this.access100.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        transparentBackground.onWarmupCompleted(frameLayout, false, (Integer) null, varyMatches.onNavigationEvent(28, displayMetrics), (View) null, (List) null, 0.0f, 0.0f, (Function2) null, false, 0L, (String) null, (getContentView) null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda56(this, onextracallbackwithresult), 4090, (Object) null);
        this.access100.access000.setOnClickListener(new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda57(this));
        TdsImageView tdsImageView = this.access100.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        getContentView getcontentview = getContentView.BOUNCE;
        transparentBackground.onWarmupCompleted(tdsImageView, false, (Integer) null, 0, (View) null, (List) null, 0.0f, 0.0f, (Function2) null, false, 0L, (String) null, getcontentview, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda58(this, onextracallbackwithresult), 2044, (Object) null);
        TdsRoundLayout tdsRoundLayout = this.access100.ICustomTabsCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        transparentBackground.onWarmupCompleted(tdsRoundLayout, false, Integer.valueOf(new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration)).requestPostMessageChannel().IEngagementSignalsCallbackDefault()), 0, (View) null, (List) null, 0.0f, 0.0f, (Function2) null, false, 0L, (String) null, getcontentview, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda59(this), 2044, (Object) null);
        int i2 = IPostMessageService_Parcel + 15;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 103;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Function0<Unit> function0 = benefitPremiumAdCollapsedView.IEngagementSignalsCallbackStub;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function0<Unit> function02 = benefitPremiumAdCollapsedView.IEngagementSignalsCallbackStub;
        if (function02 != null) {
            function02.invoke();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ITrustedWebActivityCallbackStub + 25;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return unit;
    }

    private final void onNavigationEvent(getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        this.access100.onMessageChannelReady.setGradientBaseColor(Integer.valueOf(newAuthTabSession()));
        this.access100.ICustomTabsService.setBackgroundColor(newAuthTabSession());
        TdsRoundLayout tdsRoundLayout = this.access100.ICustomTabsCallbackStubProxy;
        Context context = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsRoundLayout.setBackgroundColor(new getUrlokhttp(new asBinder(configuration)).requestPostMessageChannel().ICustomTabsService());
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout.getResources().getDisplayMetrics(), "");
        tdsRoundLayout.setStrokeWidth(varyMatches.onNavigationEvent(1, r5));
        Context context2 = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsRoundLayout.setStrokeColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(934680695, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onTransact(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), -934680692, matches.onExtraCallback())).intValue());
        Intrinsics.checkNotNull(tdsRoundLayout);
        Cacheurls1.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult2 = Cacheurls1.onWarmupCompleted.onExtraCallbackWithResult.onExtraCallback;
        Object obj = null;
        TdsRoundLayout.setShadow$default(tdsRoundLayout, new Cacheurls1.onExtraCallback(onextracallbackwithresult2.onExtraCallback(), onextracallbackwithresult2.onExtraCallbackWithResult(), onextracallbackwithresult2.onWarmupCompleted(), onextracallbackwithresult2.onWarmupCompleted()), (AppLovinSdkSettings) null, 2, (Object) null);
        TdsImageView tdsImageView = this.access100.onUnminimized;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsImageView.setImageTintList(ColorStateList.valueOf(new getUrlokhttp(new onWarmupCompleted(configuration3)).requestPostMessageChannel().access200()));
        TdsRoundLayout tdsRoundLayout2 = this.access100.access000;
        Context context4 = tdsRoundLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration4 = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        tdsRoundLayout2.setBackgroundColor(new getUrlokhttp(new asInterface(configuration4)).requestPostMessageChannel().ICustomTabsService());
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2.getResources().getDisplayMetrics(), "");
        tdsRoundLayout2.setStrokeWidth(varyMatches.onNavigationEvent(1, r7));
        Context context5 = tdsRoundLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration5 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        tdsRoundLayout2.setStrokeColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(934680695, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallbackStub(configuration5)).requestPostMessageChannel()}, matches.onExtraCallback(), -934680692, matches.onExtraCallback())).intValue());
        Intrinsics.checkNotNull(tdsRoundLayout2);
        TdsRoundLayout.setShadow$default(tdsRoundLayout2, new Cacheurls1.onExtraCallback(onextracallbackwithresult2.onExtraCallback(), onextracallbackwithresult2.onExtraCallbackWithResult(), onextracallbackwithresult2.onWarmupCompleted(), onextracallbackwithresult2.onWarmupCompleted()), (AppLovinSdkSettings) null, 2, (Object) null);
        TdsImageView tdsImageView2 = this.access100.IAuthTabCallback_Parcel;
        tdsImageView2.setImageResource(R.drawable.ic_x_mono);
        Context context6 = tdsImageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        Configuration configuration6 = context6.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration6, "");
        tdsImageView2.setColorFilter(new getUrlokhttp(new access000(configuration6)).requestPostMessageChannel().access200());
        TdsRoundLayout tdsRoundLayout3 = this.access100.onExtraCallbackWithResult;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Configuration configuration7 = context7.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration7, "");
        tdsRoundLayout3.setBackgroundColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallbackDefault(configuration7))}, -1252317281, 1252317293, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        TdsRoundLayout tdsRoundLayout4 = this.access100.onExtraCallback;
        Context context8 = tdsRoundLayout4.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        Configuration configuration8 = context8.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration8, "");
        tdsRoundLayout4.setBackgroundColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(13523551, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new getInterfaceDescriptor(configuration8)).requestPostMessageChannel()}, matches.onExtraCallback(), -13523543, matches.onExtraCallback())).intValue());
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout4.getResources().getDisplayMetrics(), "");
        tdsRoundLayout4.setStrokeWidth(varyMatches.onNavigationEvent(1, r5));
        tdsRoundLayout4.setStrokeColor(-1);
        extraCallback();
        onExtraCallbackWithResult(onextracallbackwithresult);
        int i2 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final int newAuthTabSession() {
        getBatteryInfo.IAuthTabCallbackDefault iAuthTabCallbackDefaultIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 125;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0 ? this.onMinimized.size() <= 1 : this.onMinimized.size() <= 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            return new getDEFAULT_CONNECTION_SPECSokhttp(new onMinimized(configuration)).onExtraCallbackWithResult();
        }
        if (this.requestPostMessageChannel) {
            int i3 = ITrustedWebActivityCallbackStub + 105;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            if (this.postMessage) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Resources resources2 = context2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "");
                Configuration configuration2 = resources2.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                return new getDEFAULT_CONNECTION_SPECSokhttp(new onPostMessage(configuration2)).onExtraCallbackWithResult();
            }
        }
        if (!this.requestPostMessageChannelWithExtras) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Resources resources3 = context3.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "");
            Configuration configuration3 = resources3.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            return new getDEFAULT_CONNECTION_SPECSokhttp(new onRelationshipValidationResult(configuration3)).onExtraCallbackWithResult();
        }
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Resources resources4 = context4.getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "");
        Configuration configuration4 = resources4.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        int iOnWarmupCompleted = new getDEFAULT_CONNECTION_SPECSokhttp(new onActivityLayout(configuration4)).onWarmupCompleted();
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallbackStubProxy;
        if (onextracallbackwithresult == null || (iAuthTabCallbackDefaultIAuthTabCallbackStub = onextracallbackwithresult.IAuthTabCallbackStub()) == null) {
            return iOnWarmupCompleted;
        }
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        return onWarmupCompleted(iAuthTabCallbackDefaultIAuthTabCallbackStub, context5, iOnWarmupCompleted);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        r5.access100.onMessageChannelReady.bringToFront();
        r5.access100.ICustomTabsService.bringToFront();
        r5.access100.IAuthTabCallbackStub.bringToFront();
        r5.access100.IAuthTabCallbackDefault.bringToFront();
        r5.access100.asBinder.bringToFront();
        r5.access100.asInterface.bringToFront();
        r5.access100.onRelationshipValidationResult.bringToFront();
        r5.access100.ICustomTabsCallbackStub.bringToFront();
        r5.access100.onTransact.bringToFront();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r5.requestPostMessageChannel != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5.requestPostMessageChannel != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r5.access100.IAuthTabCallbackStub.bringToFront();
        r5.access100.IAuthTabCallbackDefault.bringToFront();
        r5.access100.asBinder.bringToFront();
        r5.access100.onMessageChannelReady.bringToFront();
        r5.access100.ICustomTabsService.bringToFront();
        r5.access100.asInterface.bringToFront();
        r5.access100.onTransact.bringToFront();
        r5.access100.ICustomTabsCallbackStub.bringToFront();
        r5 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ITrustedWebActivityCallbackStub + 9;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 39;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
    }

    private final int IAuthTabCallbackDefault(int i, int i2) {
        int i3;
        DisplayMetrics displayMetrics;
        int i4;
        int i5 = 2 % 2;
        int i6 = ITrustedWebActivityCallbackStub + 83;
        IPostMessageService_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            i3 = (i + i2) / 5;
            displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            i4 = 63;
        } else {
            i3 = (i - i2) / 2;
            displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            i4 = 16;
        }
        return RangesKt.coerceAtLeast(i3, varyMatches.onNavigationEvent(Integer.valueOf(i4), displayMetrics));
    }

    private final boolean onRelationshipValidationResult() {
        int i = 2 % 2;
        if (getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            int i2 = IPostMessageService_Parcel + 117;
            ITrustedWebActivityCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IPostMessageService_Parcel + 13;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        Integer num;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 105;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
            if (benefitPremiumAdCollapsedView.onMessageChannelReady != 0) {
                return null;
            }
        } else if (benefitPremiumAdCollapsedView.onMessageChannelReady != 0) {
            return null;
        }
        Integer num2 = benefitPremiumAdCollapsedView.warmup;
        int i4 = benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased;
        if (num2 != null && num2.intValue() == i4) {
            int i5 = IPostMessageService_Parcel + 83;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            Integer num3 = benefitPremiumAdCollapsedView.ICustomTabsServiceStub;
            if (num3 != null && num3.intValue() == iIntValue && (num = benefitPremiumAdCollapsedView.setEngagementSignalsCallback) != null) {
                int i7 = IPostMessageService_Parcel + 93;
                ITrustedWebActivityCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                if (num.intValue() == iIntValue2) {
                    return null;
                }
            }
        }
        benefitPremiumAdCollapsedView.warmup = Integer.valueOf(benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased);
        benefitPremiumAdCollapsedView.ICustomTabsServiceStub = Integer.valueOf(iIntValue);
        benefitPremiumAdCollapsedView.setEngagementSignalsCallback = Integer.valueOf(iIntValue2);
        ViewTreeObserver viewTreeObserver = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStub.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return null;
        }
        viewTreeObserver.addOnPreDrawListener(new IAuthTabCallback_Parcel(benefitPremiumAdCollapsedView));
        return null;
    }

    private final void newSessionWithExtras() {
        int i = 2 % 2;
        RecyclerView childAt = this.access100.IAuthTabCallbackStub.getChildAt(0);
        RecyclerView recyclerView = !(childAt instanceof RecyclerView) ? null : childAt;
        if (recyclerView != null) {
            int i2 = IPostMessageService_Parcel + 37;
            ITrustedWebActivityCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            recyclerView.stopScroll();
        }
        this.access100.IAuthTabCallbackStub.setCurrentItem(this.onGreatestScrollPercentageIncreased, false);
        if (recyclerView != null) {
            int i4 = IPostMessageService_Parcel + 61;
            ITrustedWebActivityCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            recyclerView.scrollToPosition(this.onGreatestScrollPercentageIncreased);
            if (i5 != 0) {
                throw null;
            }
        }
    }

    private final void ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 99;
        int i3 = i2 % 128;
        ITrustedWebActivityCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.warmup = null;
            this.ICustomTabsServiceStub = null;
            this.setEngagementSignalsCallback = null;
            int i4 = i3 + 19;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 34 / 0;
                return;
            }
            return;
        }
        this.warmup = null;
        this.ICustomTabsServiceStub = null;
        this.setEngagementSignalsCallback = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 7;
        IPostMessageService_Parcel = i4 % 128;
        this.access100.ICustomTabsCallbackStub.setPaddingRelative(i, i2, i, i4 % 2 == 0 ? 1 : 0);
    }

    private final int onWarmupCompleted(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel;
        int i4 = i3 + 33;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (z) {
            int i5 = i3 + 53;
            ITrustedWebActivityCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            }
            i = 12;
        } else {
            i = 22;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        return varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
    }

    private final int asBinder(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 67;
        int i4 = i3 % 128;
        IPostMessageService_Parcel = i4;
        int i5 = i3 % 2;
        if (z) {
            int i6 = i4 + 111;
            ITrustedWebActivityCallbackStub = i6 % 128;
            i = i6 % 2 != 0 ? 29 : 12;
        } else {
            i = 22;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
        int i7 = ITrustedWebActivityCallbackStub + 43;
        IPostMessageService_Parcel = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 60 / 0;
        }
        return iOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0cf3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0e07  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0e0a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0e0e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0e11  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0eac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0ec2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0fa0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0fad  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0fb2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x096e A[PHI: r0
      0x096e: PHI (r0v109 o.AppLovinSdkSettings) = (r0v108 o.AppLovinSdkSettings), (r0v124 o.AppLovinSdkSettings) binds: [B:91:0x096c, B:88:0x0945] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0973 A[PHI: r0
      0x0973: PHI (r0v120 o.AppLovinSdkSettings) = (r0v108 o.AppLovinSdkSettings), (r0v124 o.AppLovinSdkSettings) binds: [B:91:0x096c, B:88:0x0945] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0a41  */
    /* JADX WARN: Type inference failed for: r60v1 */
    /* JADX WARN: Type inference failed for: r60v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r60v3 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(boolean z, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, boolean z2, Function0<Unit> function0) {
        int iOnPostMessage;
        int iOnPostMessage2;
        boolean z3;
        boolean z4;
        Rally rally;
        boolean z5;
        Rally rally2;
        int i7;
        int i8;
        Rally rally3;
        Rally rally4;
        int i9;
        Rally rally5;
        Rally rally6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Rally rally7;
        boolean z6;
        String str;
        Rally rally8;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Rally rally9;
        int i20;
        Rally rally10;
        boolean z7;
        ?? r7;
        Rally rally11;
        char c;
        char c2;
        char c3;
        int i21;
        boolean z8;
        Rally rally12;
        boolean z9;
        int i22;
        Rally rally13;
        Rally rally14;
        Rally rally15;
        int i23;
        boolean z10;
        Rally rally16;
        boolean z11;
        Rally rally17;
        String str2;
        Rally rally18;
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent;
        float f5;
        AppLovinSdkSettings appLovinSdkSettings;
        AppLovinSdkSettings appLovinSdkSettings2;
        float f6;
        int i24 = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        runOnUiThreadDelayed runonuithreaddelayed = this.mayLaunchUrl;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        if (z2 && !(!z)) {
            int i25 = ITrustedWebActivityCallbackStub + 63;
            IPostMessageService_Parcel = i25 % 128;
            if (i25 % 2 == 0) {
                this.access100.IAuthTabCallbackStub.setAlpha(2.0f);
                this.access100.asInterface.setAlpha(2.0f);
            } else {
                this.access100.IAuthTabCallbackStub.setAlpha(1.0f);
                this.access100.asInterface.setAlpha(0.0f);
            }
        }
        if (!(!z2)) {
            int i26 = IPostMessageService_Parcel + 97;
            ITrustedWebActivityCallbackStub = i26 % 128;
            int i27 = i26 % 2;
            iOnPostMessage = onPostMessage() + i5;
        } else {
            iOnPostMessage = 0;
        }
        if (z2) {
            int i28 = IPostMessageService_Parcel;
            int i29 = i28 + 95;
            ITrustedWebActivityCallbackStub = i29 % 128;
            int i30 = i29 % 2;
            if (z) {
                int i31 = i28 + 125;
                ITrustedWebActivityCallbackStub = i31 % 128;
                iOnPostMessage2 = i31 % 2 != 0 ? i6 << onPostMessage() : onPostMessage() + i6;
            } else {
                iOnPostMessage2 = 0;
            }
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(4, displayMetrics);
        int iOnWarmupCompleted = z2 ^ true ? onWarmupCompleted(false) : onWarmupCompleted(!z);
        if (z2 && z) {
            int i32 = IPostMessageService_Parcel + 105;
            ITrustedWebActivityCallbackStub = i32 % 128;
            if (i32 % 2 == 0) {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        int iOnWarmupCompleted2 = onWarmupCompleted(z3);
        int iAsBinder = z2 ? asBinder(!z) : asBinder(false);
        int iAsBinder2 = asBinder(z2 && z);
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        AppLovinSdkSettings appLovinSdkSettings3 = new AppLovinSdkSettings();
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        int i33 = iAsBinder;
        int i34 = iOnPostMessage2;
        int i35 = iOnPostMessage;
        Rally rally19 = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettings3.onWarmupCompleted(deprecated_certificatepinner.onExtraCallback()), Float.valueOf(i), Float.valueOf(i2), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda7(this, i2), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        if (z2) {
            Rally rally20 = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{new AppLovinSdkSettings(), Float.valueOf(i3), Float.valueOf(i4), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda18(this, i2), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(f), Float.valueOf(f2), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda29(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            int i36 = IPostMessageService_Parcel + 51;
            ITrustedWebActivityCallbackStub = i36 % 128;
            int i37 = i36 % 2;
            rally = rally20;
            z4 = z2;
        } else {
            z4 = z2;
            rally = null;
        }
        if (z4) {
            z5 = z4;
            rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(i5), Float.valueOf(i6), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda40(this, i2), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        } else {
            z5 = z4;
            rally2 = null;
        }
        if (z5) {
            i8 = i34;
            i7 = i35;
            rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(i35), Float.valueOf(i34), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda44(this, i2), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        } else {
            i7 = i35;
            i8 = i34;
            rally3 = null;
        }
        if (z5) {
            rally4 = null;
            i9 = 1;
            rally5 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(f3), Float.valueOf(f4), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda45(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda46(this, f3), 1, (Object) null), null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda47(this, f4), 1, null}, 2128644226);
        } else {
            rally4 = null;
            i9 = 1;
            rally5 = null;
        }
        if (z5) {
            i13 = iOnWarmupCompleted2;
            Object[] objArr = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(iOnWarmupCompleted), Float.valueOf(iOnWarmupCompleted2), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda48(this, iOnWarmupCompleted2, iAsBinder2), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(i33), Float.valueOf(iAsBinder2), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda49(this, i13, iAsBinder2), null, 8, null};
            i11 = i33;
            i12 = iOnWarmupCompleted;
            rally6 = null;
            i10 = 1;
            i14 = iAsBinder2;
            rally7 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda8(this, i12, i11), 1, (Object) null), null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda9(this, i13, i14), 1, null}, 2128644226);
        } else {
            rally6 = rally4;
            i10 = i9;
            i11 = i33;
            i12 = iOnWarmupCompleted;
            i13 = iOnWarmupCompleted2;
            i14 = iAsBinder2;
            rally7 = rally6;
        }
        if (z5) {
            int i38 = IPostMessageService_Parcel + 107;
            ITrustedWebActivityCallbackStub = i38 % 128;
            int i39 = i38 % 2;
            z6 = z;
            if (z6) {
                LinearLayout linearLayout = this.access100.asInterface;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                str = "";
                rally8 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally6, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda10(this), i10, rally6), rally6, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda11(this), Integer.valueOf(i10), rally6}, 2128644226);
            }
            if (z5 || z6) {
                i15 = i11;
                i16 = i12;
                i17 = i13;
                i18 = iOnNavigationEvent;
                i19 = i14;
                rally9 = rally6;
                i20 = i10;
                rally10 = rally9;
            } else {
                i17 = i13;
                i18 = iOnNavigationEvent;
                i19 = i14;
                i15 = i11;
                i16 = i12;
                rally9 = null;
                i20 = 1;
                rally10 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(iOnNavigationEvent), Float.valueOf(0.0f), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda12(this, iOnNavigationEvent), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(1.0f), Float.valueOf(0.0f), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda13(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda14(this, i18), 1, (Object) null), null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda15(this), 1, null}, 2128644226);
            }
            if (z5) {
                z7 = z;
                r7 = 0;
                rally11 = rally9;
            } else {
                int i40 = IPostMessageService_Parcel + 123;
                ITrustedWebActivityCallbackStub = i40 % 128;
                int i41 = i40 % 2;
                AppLovinSdkSettings appLovinSdkSettings4 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                z7 = z;
                float f7 = z7 ? 0.0f : 1.0f;
                float f8 = z7 ^ true ? 0.0f : 1.0f;
                BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda16(this);
                Object[] objArr2 = new Object[7];
                r7 = 0;
                objArr2[0] = appLovinSdkSettings4;
                objArr2[i20] = Float.valueOf(f7);
                objArr2[2] = Float.valueOf(f8);
                objArr2[3] = externalSyntheticLambda16;
                objArr2[4] = rally9;
                objArr2[5] = 8;
                objArr2[6] = rally9;
                AppLovinSdkSettings appLovinSdkSettings5 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr2, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                Object[] objArr3 = new Object[13];
                objArr3[0] = this;
                objArr3[i20] = appLovinSdkSettings5;
                objArr3[2] = 0;
                objArr3[3] = rally9;
                objArr3[4] = 0;
                objArr3[5] = rally9;
                objArr3[6] = rally9;
                objArr3[7] = rally9;
                objArr3[8] = 0;
                objArr3[9] = 0L;
                objArr3[10] = false;
                objArr3[11] = 2044;
                objArr3[12] = rally9;
                Rally rallyOnTransact = Rally.onTransact((Rally) RallysKt.onWarmupCompleted(objArr3, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally9, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda17(this, z7), i20, rally9);
                BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda19 externalSyntheticLambda19 = new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda19(this, z7);
                Object[] objArr4 = new Object[5];
                objArr4[0] = rallyOnTransact;
                objArr4[i20] = rally9;
                objArr4[2] = externalSyntheticLambda19;
                objArr4[3] = Integer.valueOf(i20);
                objArr4[4] = rally9;
                rally11 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr4, 2128644226);
            }
            if (z5) {
                c = r7;
                c2 = 7;
                c3 = 5;
                int i42 = i20;
                i21 = i18;
                z8 = z7;
                rally12 = rally9;
                z9 = z2;
                i22 = i42;
                rally13 = rally12;
            } else {
                int i43 = ITrustedWebActivityCallbackStub + 7;
                IPostMessageService_Parcel = i43 % 128;
                if (i43 % 2 == 0) {
                    appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    int i44 = 96 / r7;
                    if (z7) {
                        appLovinSdkSettings2 = appLovinSdkSettings;
                        f6 = 0.0f;
                    } else {
                        appLovinSdkSettings2 = appLovinSdkSettings;
                        f6 = 1.0f;
                    }
                } else {
                    appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                    if (z7) {
                    }
                }
                c = r7;
                i21 = i18;
                z8 = z7;
                c2 = 7;
                c3 = 5;
                int i45 = i20;
                rally12 = null;
                z9 = z2;
                i22 = i45;
                rally13 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettings2, Float.valueOf(f6), Float.valueOf(z7 ? 1.0f : 0.0f), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda20(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Integer.valueOf((int) r7), null, Integer.valueOf((int) r7), null, null, null, Integer.valueOf((int) r7), 0L, Boolean.valueOf((boolean) r7), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda21(this, z8), i45, (Object) null), null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda22(this, z8), Integer.valueOf(i45), null}, 2128644226);
            }
            if (z9) {
                rally14 = rally13;
                rally15 = rally12;
                i23 = i22;
                z10 = z2;
                rally16 = rally15;
            } else {
                rally14 = rally13;
                rally15 = rally12;
                i23 = 1;
                z10 = z2;
                rally16 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(z8 ? 0.0f : 1.0f), Float.valueOf(z8 ? 1.0f : 0.0f), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda23(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda24(this, z8), 1, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda25(this, z8), 1, rally15}, 2128644226);
            }
            if (z10 || !onRelationshipValidationResult() || this.onMinimized.size() <= i23) {
                z11 = z2;
                rally17 = rally15;
            } else {
                i23 = 1;
                z11 = z2;
                rally17 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(z8 ? 0.0f : 1.0f), Float.valueOf(z8 ? 1.0f : 0.0f), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda26(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda27(this, z8), 1, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda28(this), 1, rally15}, 2128644226);
            }
            if (z11) {
                str2 = str;
                i23 = 1;
                rally18 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(z8 ? 0.0f : 1.0f), Float.valueOf(z8 ? 1.0f : 0.0f), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda32(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda33(this, z8), 1, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda34(this, z8), 1, rally15}, 2128644226);
            } else {
                FrameLayout frameLayout = this.access100.IAuthTabCallbackStubProxy;
                String str3 = str;
                Intrinsics.checkNotNullExpressionValue(frameLayout, str3);
                rally18 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(z8 ? 1.0f : 0.0f), Float.valueOf(z8 ? 0.0f : 1.0f), (Function1) null, 4, (Object) null), Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda30(this, z8), i23, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda31(this, z8), Integer.valueOf(i23), rally15}, 2128644226);
                str2 = str3;
            }
            TdsRoundLayout tdsRoundLayout = this.access100.access000;
            String str4 = str2;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, str4);
            Rally rally21 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(!z8 ? 0.0f : 1.0f), Float.valueOf(!z8 ? 1.0f : 0.0f), (Function1) null, 4, (Object) null), Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda35(this), i23, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda36(this, z8, z2), Integer.valueOf(i23), rally15}, 2128644226);
            FrameLayout frameLayout2 = this.access100.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, str4);
            if (z8) {
                appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{RallysKt.onExtraCallback(Address.onNavigationEvent.asInterface(), 300), 200}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), fValueOf, fValueOf2, (Function1) null, 4, (Object) null);
            } else {
                appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.asInterface(), 300), fValueOf2, fValueOf, (Function1) null, 4, (Object) null);
            }
            Rally rally22 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout2, appLovinSdkSettingsOnNavigationEvent, Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda37(this), i23, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda38(this, z8), Integer.valueOf(i23), rally15}, 2128644226);
            TdsImageView tdsImageView = this.access100.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, str4);
            AppLovinSdkSettings appLovinSdkSettings6 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
            if (z8) {
                f5 = 1.0f;
            } else {
                int i46 = ITrustedWebActivityCallbackStub + 33;
                IPostMessageService_Parcel = i46 % 128;
                int i47 = i46 % 2;
                f5 = 0.0f;
            }
            Rally rally23 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent(appLovinSdkSettings6, Float.valueOf(f5), Float.valueOf(z8 ? 1.0f : 0.0f), (Function1) null, 4, (Object) null), Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda39(this), i23, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda41(this, z8), Integer.valueOf(i23), rally15}, 2128644226);
            Rally[] rallyArr = new Rally[17];
            rallyArr[c] = rally19;
            rallyArr[i23] = rally;
            rallyArr[2] = rally2;
            rallyArr[3] = rally3;
            rallyArr[4] = rally5;
            rallyArr[c3] = rally7;
            rallyArr[6] = rally15;
            rallyArr[c2] = rally8;
            rallyArr[8] = rally10;
            rallyArr[9] = rally11;
            rallyArr[10] = rally14;
            rallyArr[11] = rally16;
            rallyArr[12] = rally17;
            rallyArr[13] = rally18;
            rallyArr[14] = rally21;
            rallyArr[15] = rally22;
            rallyArr[16] = rally23;
            Rally rally24 = rally15;
            runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(this, iAuthTabCallback, CollectionsKt.listOfNotNull(rallyArr), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4088, (Object) null), rally24, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda42(this, z2, z, i3, i, i5, f, f3, i7, i21, i16, i15), 1, rally24), rally24, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda43(this, z2, i4, i2, i6, f2, f4, i8, z, i17, i19, function0), 1, rally24);
            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, rally24);
            this.mayLaunchUrl = runonuithreaddelayedOnWarmupCompleted;
        }
        z6 = z;
        str = "";
        rally8 = rally6;
        if (z5) {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = iOnNavigationEvent;
            i19 = i14;
            rally9 = rally6;
            i20 = i10;
            rally10 = rally9;
        }
        if (z5) {
        }
        if (z5) {
        }
        if (z9) {
        }
        if (z10) {
            z11 = z2;
            rally17 = rally15;
        }
        if (z11) {
        }
        TdsRoundLayout tdsRoundLayout2 = this.access100.access000;
        String str42 = str2;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, str42);
        Rally rally212 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout2, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(!z8 ? 0.0f : 1.0f), Float.valueOf(!z8 ? 1.0f : 0.0f), (Function1) null, 4, (Object) null), Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda35(this), i23, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda36(this, z8, z2), Integer.valueOf(i23), rally15}, 2128644226);
        FrameLayout frameLayout22 = this.access100.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(frameLayout22, str42);
        if (z8) {
        }
        Rally rally222 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{frameLayout22, appLovinSdkSettingsOnNavigationEvent, Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda37(this), i23, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda38(this, z8), Integer.valueOf(i23), rally15}, 2128644226);
        TdsImageView tdsImageView2 = this.access100.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, str42);
        AppLovinSdkSettings appLovinSdkSettings62 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        if (z8) {
        }
        Rally rally232 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView2, isMuted.onNavigationEvent(appLovinSdkSettings62, Float.valueOf(f5), Float.valueOf(z8 ? 1.0f : 0.0f), (Function1) null, 4, (Object) null), Integer.valueOf(c), null, Integer.valueOf(c), null, null, null, Integer.valueOf(c), 0L, Boolean.valueOf((boolean) c), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda39(this), i23, rally15), rally15, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda41(this, z8), Integer.valueOf(i23), rally15}, 2128644226);
        Rally[] rallyArr2 = new Rally[17];
        rallyArr2[c] = rally19;
        rallyArr2[i23] = rally;
        rallyArr2[2] = rally2;
        rallyArr2[3] = rally3;
        rallyArr2[4] = rally5;
        rallyArr2[c3] = rally7;
        rallyArr2[6] = rally15;
        rallyArr2[c2] = rally8;
        rallyArr2[8] = rally10;
        rallyArr2[9] = rally11;
        rallyArr2[10] = rally14;
        rallyArr2[11] = rally16;
        rallyArr2[12] = rally17;
        rallyArr2[13] = rally18;
        rallyArr2[14] = rally212;
        rallyArr2[15] = rally222;
        rallyArr2[16] = rally232;
        Rally rally242 = rally15;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(this, iAuthTabCallback, CollectionsKt.listOfNotNull(rallyArr2), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4088, (Object) null), rally242, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda42(this, z2, z, i3, i, i5, f, f3, i7, i21, i16, i15), 1, rally242), rally242, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda43(this, z2, i4, i2, i6, f2, f4, i8, z, i17, i19, function0), 1, rally242);
        isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted2, false, 1, rally242);
        this.mayLaunchUrl = runonuithreaddelayedOnWarmupCompleted2;
    }

    private static final Unit asBinder(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 89;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Integer numValueOf = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(f));
            benefitPremiumAdCollapsedView.asInterface = numValueOf;
            benefitPremiumAdCollapsedView.onWarmupCompleted(numValueOf.intValue());
            return Unit.INSTANCE;
        }
        Integer numValueOf2 = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(f));
        benefitPremiumAdCollapsedView.asInterface = numValueOf2;
        benefitPremiumAdCollapsedView.onWarmupCompleted(numValueOf2.intValue());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onTransact(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 5;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            benefitPremiumAdCollapsedView.getInterfaceDescriptor = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(f));
            Integer num = benefitPremiumAdCollapsedView.asInterface;
            if (num != null) {
                i = num.intValue();
            }
            benefitPremiumAdCollapsedView.onWarmupCompleted(i);
            Unit unit = Unit.INSTANCE;
            int i4 = ITrustedWebActivityCallbackStub + 85;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
        benefitPremiumAdCollapsedView.getInterfaceDescriptor = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(f));
        Integer num2 = benefitPremiumAdCollapsedView.asInterface;
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 21;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.IAuthTabCallback_Parcel = Float.valueOf(fFloatValue);
        benefitPremiumAdCollapsedView.ICustomTabsCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 41;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        benefitPremiumAdCollapsedView.access000 = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(f));
        Integer num = benefitPremiumAdCollapsedView.asInterface;
        if (num != null) {
            int i3 = ITrustedWebActivityCallbackStub + 47;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            i = num.intValue();
            int i5 = IPostMessageService_Parcel + 1;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        benefitPremiumAdCollapsedView.onWarmupCompleted(i);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        benefitPremiumAdCollapsedView.IAuthTabCallback = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(f));
        Integer num = benefitPremiumAdCollapsedView.asInterface;
        Object obj = null;
        if (num != null) {
            int i3 = IPostMessageService_Parcel + 99;
            ITrustedWebActivityCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                num.intValue();
                obj.hashCode();
                throw null;
            }
            i = num.intValue();
        }
        benefitPremiumAdCollapsedView.onWarmupCompleted(i);
        Unit unit = Unit.INSTANCE;
        int i4 = IPostMessageService_Parcel + 45;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit extraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 83;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            benefitPremiumAdCollapsedView.IAuthTabCallbackStub = Float.valueOf(f);
            benefitPremiumAdCollapsedView.access100.onMessageChannelReady.setAlpha(f);
            benefitPremiumAdCollapsedView.access100.ICustomTabsService.setAlpha(f);
            benefitPremiumAdCollapsedView.IEngagementSignalsCallback();
            int i3 = 98 / 0;
            return Unit.INSTANCE;
        }
        benefitPremiumAdCollapsedView.IAuthTabCallbackStub = Float.valueOf(f);
        benefitPremiumAdCollapsedView.access100.onMessageChannelReady.setAlpha(f);
        benefitPremiumAdCollapsedView.access100.ICustomTabsService.setAlpha(f);
        benefitPremiumAdCollapsedView.IEngagementSignalsCallback();
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 121;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            benefitPremiumAdCollapsedView.IAuthTabCallbackStub = Float.valueOf(f);
            benefitPremiumAdCollapsedView.access100.onMessageChannelReady.setAlpha(f);
            benefitPremiumAdCollapsedView.access100.ICustomTabsService.setAlpha(f);
            benefitPremiumAdCollapsedView.IEngagementSignalsCallback();
            unit = Unit.INSTANCE;
            int i3 = 49 / 0;
        } else {
            benefitPremiumAdCollapsedView.IAuthTabCallbackStub = Float.valueOf(f);
            benefitPremiumAdCollapsedView.access100.onMessageChannelReady.setAlpha(f);
            benefitPremiumAdCollapsedView.access100.ICustomTabsService.setAlpha(f);
            benefitPremiumAdCollapsedView.IEngagementSignalsCallback();
            unit = Unit.INSTANCE;
        }
        int i4 = IPostMessageService_Parcel + 1;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object prefetchWithMultipleUrls(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 5;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.IAuthTabCallbackStub = Float.valueOf(fFloatValue);
        benefitPremiumAdCollapsedView.access100.onMessageChannelReady.setAlpha(fFloatValue);
        benefitPremiumAdCollapsedView.access100.ICustomTabsService.setAlpha(fFloatValue);
        benefitPremiumAdCollapsedView.IEngagementSignalsCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 19;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        ((Number) objArr[1]).intValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 19;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Integer numValueOf = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(fFloatValue));
            benefitPremiumAdCollapsedView.IAuthTabCallbackDefault = numValueOf;
            int iIntValue2 = numValueOf.intValue();
            Integer num = benefitPremiumAdCollapsedView.asBinder;
            if (num != null) {
                iIntValue = num.intValue();
            }
            benefitPremiumAdCollapsedView.onWarmupCompleted(iIntValue2, iIntValue);
            benefitPremiumAdCollapsedView.ICustomTabsService_Parcel();
            Unit unit = Unit.INSTANCE;
            int i3 = IPostMessageService_Parcel + 107;
            ITrustedWebActivityCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        Integer numValueOf2 = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(fFloatValue));
        benefitPremiumAdCollapsedView.IAuthTabCallbackDefault = numValueOf2;
        numValueOf2.intValue();
        Integer num2 = benefitPremiumAdCollapsedView.asBinder;
        throw null;
    }

    private static final Unit onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, int i2, float f) {
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel + 95;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        benefitPremiumAdCollapsedView.asBinder = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(f));
        Integer num = benefitPremiumAdCollapsedView.IAuthTabCallbackDefault;
        if (num != null) {
            i = num.intValue();
            int i6 = ITrustedWebActivityCallbackStub + 91;
            IPostMessageService_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        Integer num2 = benefitPremiumAdCollapsedView.asBinder;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        benefitPremiumAdCollapsedView.onWarmupCompleted(i, i2);
        benefitPremiumAdCollapsedView.ICustomTabsService_Parcel();
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel + 39;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            benefitPremiumAdCollapsedView.IAuthTabCallbackDefault = Integer.valueOf(i);
            benefitPremiumAdCollapsedView.asBinder = Integer.valueOf(i2);
            benefitPremiumAdCollapsedView.onWarmupCompleted(i, i2);
            benefitPremiumAdCollapsedView.ICustomTabsService_Parcel();
            return Unit.INSTANCE;
        }
        benefitPremiumAdCollapsedView.IAuthTabCallbackDefault = Integer.valueOf(i);
        benefitPremiumAdCollapsedView.asBinder = Integer.valueOf(i2);
        benefitPremiumAdCollapsedView.onWarmupCompleted(i, i2);
        benefitPremiumAdCollapsedView.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 29;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        benefitPremiumAdCollapsedView.IAuthTabCallbackDefault = Integer.valueOf(i);
        benefitPremiumAdCollapsedView.asBinder = Integer.valueOf(i2);
        benefitPremiumAdCollapsedView.onWarmupCompleted(i, i2);
        benefitPremiumAdCollapsedView.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i6 = ITrustedWebActivityCallbackStub + 85;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[PHI: r2
      0x0046: PHI (r2v8 android.widget.LinearLayout) = (r2v7 android.widget.LinearLayout), (r2v14 android.widget.LinearLayout) binds: [B:8:0x0044, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LinearLayout linearLayout;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 47;
        ITrustedWebActivityCallbackStub = i2 % 128;
        boolean z = true;
        if (i2 % 2 != 0) {
            benefitPremiumAdCollapsedView.access100.asInterface.setAlpha(2.0f);
            linearLayout = benefitPremiumAdCollapsedView.access100.asInterface;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            if (benefitPremiumAdCollapsedView.onMinimized.size() <= 1) {
                z = false;
            }
        } else {
            benefitPremiumAdCollapsedView.access100.asInterface.setAlpha(0.0f);
            linearLayout = benefitPremiumAdCollapsedView.access100.asInterface;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            if (benefitPremiumAdCollapsedView.onMinimized.size() <= 1) {
            }
        }
        linearLayout.setVisibility(z ? 0 : 8);
        Unit unit = Unit.INSTANCE;
        int i3 = ITrustedWebActivityCallbackStub + 7;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 0;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i2 = 2 % 2;
        benefitPremiumAdCollapsedView.access100.asInterface.setAlpha(1.0f);
        LinearLayout linearLayout = benefitPremiumAdCollapsedView.access100.asInterface;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (benefitPremiumAdCollapsedView.ICustomTabsCallbackStub()) {
            int i3 = ITrustedWebActivityCallbackStub + 115;
            IPostMessageService_Parcel = i3 % 128;
            if (i3 % 2 != 0 ? benefitPremiumAdCollapsedView.onMinimized.size() > 1 : benefitPremiumAdCollapsedView.onMinimized.size() > 1) {
                int i4 = ITrustedWebActivityCallbackStub + 77;
                IPostMessageService_Parcel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                i = 8;
            }
        }
        linearLayout.setVisibility(i);
        Unit unit = Unit.INSTANCE;
        int i6 = IPostMessageService_Parcel + 43;
        ITrustedWebActivityCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit access100(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 115;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.access100.asInterface.setAlpha(f);
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 55;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object newSessionWithExtras(Object[] objArr) {
        int i = 0;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        LinearLayout linearLayout = benefitPremiumAdCollapsedView.access100.asInterface;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (!(!(benefitPremiumAdCollapsedView.onMinimized.size() > 1))) {
            int i3 = ITrustedWebActivityCallbackStub + 73;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        benefitPremiumAdCollapsedView.access100.asInterface.setAlpha(1.0f);
        benefitPremiumAdCollapsedView.onExtraCallbackWithResult = Integer.valueOf(iIntValue);
        Unit unit = Unit.INSTANCE;
        int i5 = ITrustedWebActivityCallbackStub + 33;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        int i;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 115;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            benefitPremiumAdCollapsedView.access100.asInterface.setAlpha(2.0f);
            i = 1;
        } else {
            benefitPremiumAdCollapsedView.access100.asInterface.setAlpha(0.0f);
            i = 0;
        }
        benefitPremiumAdCollapsedView.onExtraCallbackWithResult = i;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object warmup(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 67;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.onWarmupCompleted = Float.valueOf(fFloatValue);
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 2091244214, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2091244182);
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 51;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit readTypedObject(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        float f;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 125;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i4 = i2 + 17;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 5;
            }
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        benefitPremiumAdCollapsedView.onWarmupCompleted = Float.valueOf(f);
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 2091244214, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2091244182);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        float f;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 57;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (zBooleanValue) {
            int i4 = i2 + 59;
            ITrustedWebActivityCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        benefitPremiumAdCollapsedView.onWarmupCompleted = Float.valueOf(f);
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 2091244214, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2091244182);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 9;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.onTransact = Float.valueOf(fFloatValue);
        benefitPremiumAdCollapsedView.IEngagementSignalsCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 25;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return unit;
    }

    private static final Unit extraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        float f;
        int i = 2 % 2;
        if (z) {
            int i2 = ITrustedWebActivityCallbackStub + 3;
            int i3 = i2 % 128;
            IPostMessageService_Parcel = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 21;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        benefitPremiumAdCollapsedView.onTransact = Float.valueOf(f);
        benefitPremiumAdCollapsedView.IEngagementSignalsCallback();
        return Unit.INSTANCE;
    }

    private static final Unit writeTypedObject(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        if (!(!z)) {
            int i2 = ITrustedWebActivityCallbackStub;
            int i3 = i2 + 71;
            IPostMessageService_Parcel = i3 % 128;
            f = i3 % 2 != 0 ? 1.0f : 0.0f;
            int i4 = i2 + 15;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        benefitPremiumAdCollapsedView.onTransact = Float.valueOf(f);
        benefitPremiumAdCollapsedView.IEngagementSignalsCallback();
        return Unit.INSTANCE;
    }

    private static final Unit writeTypedObject(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 77;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.onNavigationEvent = Float.valueOf(f);
        benefitPremiumAdCollapsedView.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 105;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 125;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.onNavigationEvent = Float.valueOf(z ? 0.0f : 1.0f);
        benefitPremiumAdCollapsedView.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = IPostMessageService_Parcel + 19;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onActivityLayout(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 55;
        IPostMessageService_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        benefitPremiumAdCollapsedView.onNavigationEvent = Float.valueOf(!z ? 0.0f : 1.0f);
        benefitPremiumAdCollapsedView.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i3 = IPostMessageService_Parcel + 15;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit readTypedObject(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 45;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            benefitPremiumAdCollapsedView.access100.IAuthTabCallbackDefault.setAlpha(f);
            benefitPremiumAdCollapsedView.access100.asBinder.setAlpha(f);
            return Unit.INSTANCE;
        }
        benefitPremiumAdCollapsedView.access100.IAuthTabCallbackDefault.setAlpha(f);
        benefitPremiumAdCollapsedView.access100.asBinder.setAlpha(f);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e A[PHI: r1
      0x004e: PHI (r1v10 android.view.View) = (r1v9 android.view.View), (r1v19 android.view.View) binds: [B:8:0x004a, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c A[PHI: r1
      0x004c: PHI (r1v13 android.view.View) = (r1v9 android.view.View), (r1v19 android.view.View) binds: [B:8:0x004a, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onMinimized(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        View view;
        float f;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 107;
        ITrustedWebActivityCallbackStub = i2 % 128;
        float f2 = 1.0f;
        if (i2 % 2 != 0) {
            View view2 = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(0);
            View view3 = benefitPremiumAdCollapsedView.access100.asBinder;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            view3.setVisibility(1);
            view = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackDefault;
            if (z) {
                int i3 = IPostMessageService_Parcel + 39;
                ITrustedWebActivityCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                f = 0.0f;
            } else {
                f = 1.0f;
            }
        } else {
            View view4 = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            view4.setVisibility(0);
            View view5 = benefitPremiumAdCollapsedView.access100.asBinder;
            Intrinsics.checkNotNullExpressionValue(view5, "");
            view5.setVisibility(0);
            view = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackDefault;
            if (!z) {
            }
        }
        view.setAlpha(f);
        View view6 = benefitPremiumAdCollapsedView.access100.asBinder;
        if (!(!z)) {
            int i5 = IPostMessageService_Parcel + 119;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            f2 = 0.0f;
        }
        view6.setAlpha(f2);
        return Unit.INSTANCE;
    }

    private static final Unit requestPostMessageChannelWithExtras(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        View view;
        float f;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 63;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            view = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackDefault;
            f = 0.0f;
        } else {
            view = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackDefault;
            f = 1.0f;
        }
        view.setAlpha(f);
        benefitPremiumAdCollapsedView.access100.asBinder.setAlpha(f);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[PHI: r0
      0x0042: PHI (r0v8 android.widget.FrameLayout) = (r0v2 android.widget.FrameLayout), (r0v10 android.widget.FrameLayout) binds: [B:8:0x003d, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r0
      0x003f: PHI (r0v3 android.widget.FrameLayout) = (r0v2 android.widget.FrameLayout), (r0v10 android.widget.FrameLayout) binds: [B:8:0x003d, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        FrameLayout frameLayout;
        float f;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 47;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            FrameLayout frameLayout2 = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(0);
            frameLayout = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy;
            f = zBooleanValue ? 1.0f : 0.0f;
        } else {
            FrameLayout frameLayout3 = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
            frameLayout3.setVisibility(0);
            frameLayout = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy;
            if (zBooleanValue) {
            }
        }
        frameLayout.setAlpha(f);
        Unit unit = Unit.INSTANCE;
        int i3 = ITrustedWebActivityCallbackStub + 59;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onActivityResized(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        float f;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 77;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy;
        if (!(!z)) {
            int i4 = IPostMessageService_Parcel + 109;
            ITrustedWebActivityCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        frameLayout.setAlpha(f);
        FrameLayout frameLayout2 = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setVisibility(!z ? 0 : 8);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 39;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.onWarmupCompleted(fFloatValue);
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 85;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onMessageChannelReady(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 45;
        ITrustedWebActivityCallbackStub = i2 % 128;
        float f = 1.0f;
        if (i2 % 2 != 0) {
            benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy.setAlpha(1.0f);
            FrameLayout frameLayout = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            if (z) {
                f = 0.0f;
            }
        } else {
            benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy.setAlpha(1.0f);
            FrameLayout frameLayout2 = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(0);
            if (z) {
            }
        }
        benefitPremiumAdCollapsedView.onWarmupCompleted(f);
        Unit unit = Unit.INSTANCE;
        int i3 = IPostMessageService_Parcel + 45;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsCallbackStubProxy(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 17;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        benefitPremiumAdCollapsedView.onWarmupCompleted(z ? 1.0f : 0.0f);
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 115;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 49;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        boolean z3 = false;
        if (i2 % 2 == 0) {
            int i4 = 83 / 0;
            if (z) {
                if (!z2) {
                    int i5 = i3 + 97;
                    ITrustedWebActivityCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    z3 = true;
                }
            }
        } else if (z) {
        }
        benefitPremiumAdCollapsedView.onExtraCallback(z3);
        Unit unit = Unit.INSTANCE;
        int i7 = IPostMessageService_Parcel + 101;
        ITrustedWebActivityCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit receiveFile(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        FrameLayout frameLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 117;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            frameLayout = benefitPremiumAdCollapsedView.access100.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            i = 1;
        } else {
            frameLayout = benefitPremiumAdCollapsedView.access100.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            i = 0;
        }
        frameLayout.setVisibility(i);
        Unit unit = Unit.INSTANCE;
        int i4 = IPostMessageService_Parcel + 99;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit setEngagementSignalsCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        TdsImageView tdsImageView;
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 107;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            tdsImageView = benefitPremiumAdCollapsedView.access100.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            i = 1;
        } else {
            tdsImageView = benefitPremiumAdCollapsedView.access100.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            i = 0;
        }
        tdsImageView.setVisibility(i);
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 99;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallbackStub(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 85;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            TdsImageView tdsImageView = benefitPremiumAdCollapsedView.access100.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            if (z) {
                int i4 = ITrustedWebActivityCallbackStub + 103;
                IPostMessageService_Parcel = i4 % 128;
                int i5 = i4 % 2;
                i = 0;
            } else {
                i = 8;
            }
            tdsImageView.setVisibility(i);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullExpressionValue(benefitPremiumAdCollapsedView.access100.ICustomTabsCallback, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z, boolean z2, int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        Float fValueOf;
        Float fValueOf2;
        Integer numValueOf;
        Integer numValueOf2;
        Float fValueOf3;
        float f3;
        Float fValueOf4;
        int i8 = 2 % 2;
        benefitPremiumAdCollapsedView.requestPostMessageChannel = z;
        benefitPremiumAdCollapsedView.postMessage = z2;
        Float fValueOf5 = null;
        benefitPremiumAdCollapsedView.getInterfaceDescriptor = z ? Integer.valueOf(i) : null;
        benefitPremiumAdCollapsedView.asInterface = Integer.valueOf(i2);
        benefitPremiumAdCollapsedView.access000 = z ? Integer.valueOf(i3) : null;
        if (z) {
            int i9 = ITrustedWebActivityCallbackStub + 63;
            IPostMessageService_Parcel = i9 % 128;
            if (i9 % 2 == 0) {
                Float.valueOf(f);
                throw null;
            }
            fValueOf = Float.valueOf(f);
        } else {
            fValueOf = null;
        }
        benefitPremiumAdCollapsedView.IAuthTabCallback_Parcel = fValueOf;
        if (z) {
            int i10 = IPostMessageService_Parcel + 117;
            ITrustedWebActivityCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            fValueOf2 = Float.valueOf(f2);
        } else {
            int i12 = ITrustedWebActivityCallbackStub + 79;
            IPostMessageService_Parcel = i12 % 128;
            int i13 = i12 % 2;
            fValueOf2 = null;
        }
        benefitPremiumAdCollapsedView.IAuthTabCallbackStub = fValueOf2;
        if (z) {
            int i14 = IPostMessageService_Parcel + 73;
            ITrustedWebActivityCallbackStub = i14 % 128;
            if (i14 % 2 != 0) {
                numValueOf = Integer.valueOf(i4);
                int i15 = 93 / 0;
            } else {
                numValueOf = Integer.valueOf(i4);
            }
        } else {
            numValueOf = null;
        }
        benefitPremiumAdCollapsedView.IAuthTabCallback = numValueOf;
        if (!z || z2) {
            numValueOf2 = null;
        } else {
            int i16 = ITrustedWebActivityCallbackStub + 67;
            IPostMessageService_Parcel = i16 % 128;
            if (i16 % 2 == 0) {
                Integer.valueOf(i5);
                throw null;
            }
            numValueOf2 = Integer.valueOf(i5);
        }
        benefitPremiumAdCollapsedView.onExtraCallbackWithResult = numValueOf2;
        benefitPremiumAdCollapsedView.IAuthTabCallbackDefault = z ? Integer.valueOf(i6) : null;
        benefitPremiumAdCollapsedView.asBinder = z ? Integer.valueOf(i7) : null;
        if (z) {
            fValueOf3 = Float.valueOf(z2 ? 0.0f : 1.0f);
        } else {
            fValueOf3 = null;
        }
        benefitPremiumAdCollapsedView.onNavigationEvent = fValueOf3;
        if (!z) {
            fValueOf4 = null;
        } else {
            if (z2) {
                int i17 = ITrustedWebActivityCallbackStub + 67;
                IPostMessageService_Parcel = i17 % 128;
                f3 = i17 % 2 == 0 ? 2.0f : 0.0f;
            } else {
                f3 = 1.0f;
            }
            fValueOf4 = Float.valueOf(f3);
        }
        benefitPremiumAdCollapsedView.onTransact = fValueOf4;
        if (z) {
            fValueOf5 = Float.valueOf(z2 ? 0.0f : 1.0f);
        }
        benefitPremiumAdCollapsedView.onWarmupCompleted = fValueOf5;
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -1313563103, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1313563128);
        benefitPremiumAdCollapsedView.ICustomTabsCallback();
        benefitPremiumAdCollapsedView.onNavigationEvent(z2);
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z, int i, boolean z2) {
        int i2 = 2 % 2;
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -1313563103, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1313563128);
        benefitPremiumAdCollapsedView.IAuthTabCallback(z);
        benefitPremiumAdCollapsedView.extraCallbackWithResult();
        benefitPremiumAdCollapsedView.onWarmupCompleted(i);
        Object obj = null;
        if ((!z) && z2) {
            int i3 = IPostMessageService_Parcel + 123;
            ITrustedWebActivityCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                onNavigationEvent(benefitPremiumAdCollapsedView, 1, true, 0, null);
            } else {
                onNavigationEvent(benefitPremiumAdCollapsedView, 0, false, 1, null);
            }
        }
        int i4 = IPostMessageService_Parcel + 21;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void requestPostMessageChannel(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 91;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStub.setCurrentItem(benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased, true);
            onNavigationEvent(benefitPremiumAdCollapsedView, 0, true, 1, null);
        } else {
            benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStub.setCurrentItem(benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased, false);
            onNavigationEvent(benefitPremiumAdCollapsedView, 0, false, 1, null);
        }
        benefitPremiumAdCollapsedView.access200();
    }

    private static final Unit onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z, int i, int i2, int i3, float f, float f2, int i4, boolean z2, int i5, int i6, Function0 function0) {
        Integer numValueOf;
        Integer numValueOf2;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        int i7 = 2 % 2;
        Object obj = null;
        benefitPremiumAdCollapsedView.getInterfaceDescriptor = z ? Integer.valueOf(i) : null;
        benefitPremiumAdCollapsedView.asInterface = Integer.valueOf(i2);
        benefitPremiumAdCollapsedView.access000 = z ? Integer.valueOf(i3) : null;
        benefitPremiumAdCollapsedView.IAuthTabCallback_Parcel = z ? Float.valueOf(f) : null;
        benefitPremiumAdCollapsedView.IAuthTabCallbackStub = z ? Float.valueOf(f2) : null;
        if (z) {
            int i8 = ITrustedWebActivityCallbackStub + 61;
            IPostMessageService_Parcel = i8 % 128;
            if (i8 % 2 == 0) {
                Integer.valueOf(i4);
                obj.hashCode();
                throw null;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = null;
        }
        benefitPremiumAdCollapsedView.IAuthTabCallback = numValueOf;
        benefitPremiumAdCollapsedView.onExtraCallbackWithResult = (!z || z2) ? null : 0;
        benefitPremiumAdCollapsedView.IAuthTabCallbackDefault = !z ? null : Integer.valueOf(i5);
        if (z) {
            int i9 = IPostMessageService_Parcel + 119;
            ITrustedWebActivityCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            numValueOf2 = Integer.valueOf(i6);
        } else {
            numValueOf2 = null;
        }
        benefitPremiumAdCollapsedView.asBinder = numValueOf2;
        if (z) {
            fValueOf = Float.valueOf(z2 ? 1.0f : 0.0f);
        } else {
            fValueOf = null;
        }
        benefitPremiumAdCollapsedView.onNavigationEvent = fValueOf;
        if (z) {
            int i11 = ITrustedWebActivityCallbackStub + 83;
            IPostMessageService_Parcel = i11 % 128;
            int i12 = i11 % 2;
            fValueOf2 = Float.valueOf(!(z2 ^ true) ? 1.0f : 0.0f);
        } else {
            int i13 = ITrustedWebActivityCallbackStub + 73;
            IPostMessageService_Parcel = i13 % 128;
            int i14 = i13 % 2;
            fValueOf2 = null;
        }
        benefitPremiumAdCollapsedView.onTransact = fValueOf2;
        if (z) {
            fValueOf3 = Float.valueOf(z2 ? 1.0f : 0.0f);
        } else {
            fValueOf3 = null;
        }
        benefitPremiumAdCollapsedView.onWarmupCompleted = fValueOf3;
        benefitPremiumAdCollapsedView.onActivityResized();
        View childAt = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStub.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            int i15 = IPostMessageService_Parcel + 61;
            ITrustedWebActivityCallbackStub = i15 % 128;
            if (i15 % 2 != 0) {
                benefitPremiumAdCollapsedView.onNavigationEvent(recyclerView, 0.0f, 0.0f, 0.0f, i, i2);
            } else {
                benefitPremiumAdCollapsedView.onNavigationEvent(recyclerView, 1.0f, 1.0f, 0.0f, i, i2);
            }
        }
        benefitPremiumAdCollapsedView.ICustomTabsService_Parcel();
        benefitPremiumAdCollapsedView.onWarmupCompleted(i2);
        benefitPremiumAdCollapsedView.post(new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda3(benefitPremiumAdCollapsedView, z2, i2, z));
        if (benefitPremiumAdCollapsedView.ICustomTabsCallbackStub()) {
            benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStub.post(new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda4(benefitPremiumAdCollapsedView));
        }
        benefitPremiumAdCollapsedView.mayLaunchUrl = null;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.INSTANCE;
        int i16 = ITrustedWebActivityCallbackStub + 79;
        IPostMessageService_Parcel = i16 % 128;
        int i17 = i16 % 2;
        return unit;
    }

    private final void onNavigationEvent(boolean z) {
        boolean z2;
        float f;
        int i = 2 % 2;
        extraCallbackWithResult();
        this.access100.access000.setAlpha(!(z ^ true) ? 0.0f : 1.0f);
        if (this.requestPostMessageChannel || !(setEngagementSignalsCallback() || ICustomTabsCallbackStub())) {
            z2 = true;
        } else {
            int i2 = IPostMessageService_Parcel + 95;
            ITrustedWebActivityCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            z2 = false;
        }
        onExtraCallback(z2);
        TdsImageView tdsImageView = this.access100.ICustomTabsCallback;
        if (z) {
            int i4 = ITrustedWebActivityCallbackStub + 37;
            int i5 = i4 % 128;
            IPostMessageService_Parcel = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 71;
            ITrustedWebActivityCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        tdsImageView.setAlpha(f);
        Intrinsics.checkNotNull(tdsImageView);
        tdsImageView.setVisibility(0);
        FrameLayout frameLayout = this.access100.onNavigationEvent;
        Intrinsics.checkNotNull(frameLayout);
        frameLayout.setVisibility(0);
        IAuthTabCallback(z ^ true ? 0.0f : 1.0f);
        extraCallback();
        validateRelationship();
    }

    private final void onActivityResized() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 69;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.requestPostMessageChannel = false;
        this.postMessage = false;
        Object obj = null;
        this.getInterfaceDescriptor = null;
        this.asInterface = null;
        this.access000 = null;
        this.IAuthTabCallback_Parcel = null;
        this.IAuthTabCallbackStub = null;
        this.IAuthTabCallback = null;
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallbackDefault = null;
        this.asBinder = null;
        this.onNavigationEvent = null;
        this.onTransact = null;
        this.onWarmupCompleted = null;
        this.onRelationshipValidationResult = null;
        this.ICustomTabsCallbackStubProxy = null;
        this.ICustomTabsCallback_Parcel = null;
        this.newAuthTabSession = false;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this}, 2091244214, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2091244182);
        int i4 = ITrustedWebActivityCallbackStub + 11;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(boolean z) {
        boolean z2;
        int i = 2 % 2;
        boolean zICustomTabsCallbackStub = ICustomTabsCallbackStub();
        float f = 1.0f;
        this.access100.access000.setAlpha((!z || zICustomTabsCallbackStub) ? 0.0f : 1.0f);
        int i2 = 1;
        if (!z || zICustomTabsCallbackStub) {
            int i3 = ITrustedWebActivityCallbackStub + 5;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z2 = false;
        } else {
            int i5 = IPostMessageService_Parcel + 73;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        }
        onExtraCallback(z2);
        TdsImageView tdsImageView = this.access100.ICustomTabsCallback;
        tdsImageView.setAlpha((!z || zICustomTabsCallbackStub) ? 0.0f : 1.0f);
        Intrinsics.checkNotNull(tdsImageView);
        if (!z || zICustomTabsCallbackStub) {
            int i7 = IPostMessageService_Parcel + 87;
            ITrustedWebActivityCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            i2 = 8;
        } else {
            int i9 = IPostMessageService_Parcel + 41;
            ITrustedWebActivityCallbackStub = i9 % 128;
            if (i9 % 2 == 0) {
                i2 = 0;
            }
        }
        tdsImageView.setVisibility(i2);
        FrameLayout frameLayout = this.access100.onNavigationEvent;
        Intrinsics.checkNotNull(frameLayout);
        frameLayout.setVisibility(0);
        if (z) {
            int i10 = ITrustedWebActivityCallbackStub + 39;
            IPostMessageService_Parcel = i10 % 128;
            int i11 = i10 % 2;
            f = 0.0f;
        }
        IAuthTabCallback(f);
        extraCallback();
        validateRelationship();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void extraCallbackWithResult() {
        int i;
        int i2;
        float f;
        int i3 = 2 % 2;
        boolean zICustomTabsCallbackStub = ICustomTabsCallbackStub();
        boolean engagementSignalsCallback = setEngagementSignalsCallback();
        FrameLayout frameLayout = this.access100.onTransact;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        int i4 = 8;
        if (engagementSignalsCallback) {
            i = 8;
        } else {
            int i5 = IPostMessageService_Parcel + 87;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        frameLayout.setVisibility(i);
        float f2 = 1.0f;
        this.access100.IAuthTabCallbackStubProxy.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.access100.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        Object obj = null;
        if (!engagementSignalsCallback) {
            int i7 = ITrustedWebActivityCallbackStub;
            int i8 = i7 + 15;
            IPostMessageService_Parcel = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (!zICustomTabsCallbackStub || this.requestPostMessageChannel) {
                int i9 = i7 + 77;
                IPostMessageService_Parcel = i9 % 128;
                i2 = i9 % 2 == 0 ? 1 : 0;
            } else {
                i2 = 8;
            }
        }
        frameLayout2.setVisibility(i2);
        FrameLayout frameLayout3 = this.access100.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
        frameLayout3.setVisibility(0);
        if (this.requestPostMessageChannelWithExtras) {
            int i10 = IPostMessageService_Parcel + 1;
            ITrustedWebActivityCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        IAuthTabCallback(f);
        TdsImageView tdsImageView = this.access100.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility((!this.requestPostMessageChannelWithExtras || zICustomTabsCallbackStub) ? 8 : 0);
        if (!engagementSignalsCallback) {
            if (this.requestPostMessageChannelWithExtras) {
                int i12 = IPostMessageService_Parcel + 89;
                ITrustedWebActivityCallbackStub = i12 % 128;
                int i13 = i12 % 2;
            } else {
                f2 = 0.0f;
            }
            onWarmupCompleted(f2);
        }
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallbackStubProxy;
        if (onextracallbackwithresult != null) {
            int i14 = IPostMessageService_Parcel + 25;
            ITrustedWebActivityCallbackStub = i14 % 128;
            if (i14 % 2 != 0) {
                onExtraCallbackWithResult(onextracallbackwithresult);
                throw null;
            }
            onExtraCallbackWithResult(onextracallbackwithresult);
        }
        FrameLayout frameLayout4 = this.access100.ICustomTabsCallbackStub;
        Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
        if (engagementSignalsCallback || (zICustomTabsCallbackStub && !this.requestPostMessageChannel)) {
            int i15 = IPostMessageService_Parcel + 107;
            ITrustedWebActivityCallbackStub = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = IPostMessageService_Parcel + 63;
            ITrustedWebActivityCallbackStub = i17 % 128;
            int i18 = i17 % 2;
            i4 = 0;
        }
        frameLayout4.setVisibility(i4);
        ICustomTabsService_Parcel();
        access200();
        validateRelationship();
    }

    private final void extraCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 25;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = this.access100.IAuthTabCallback;
        Intrinsics.checkNotNull(tdsImageView);
        tdsImageView.setVisibility(0);
        tdsImageView.setAlpha(1.0f);
        tdsImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tdsImageView.setImageResource(im.toss.tds.R.drawable.icon_arrow_right_mono);
        int color = Color.parseColor("#181F2B");
        tdsImageView.setImageTintList(ColorStateList.valueOf(color));
        tdsImageView.setColorFilter(color);
        int i4 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    private final void onExtraCallback(boolean z) {
        int i;
        int i2 = 2 % 2;
        TdsRoundLayout tdsRoundLayout = this.access100.access000;
        Intrinsics.checkNotNull(tdsRoundLayout);
        int i3 = 0;
        if (z) {
            int i4 = IPostMessageService_Parcel + 95;
            ITrustedWebActivityCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        } else {
            i = 8;
        }
        tdsRoundLayout.setVisibility(i);
        tdsRoundLayout.setEnabled(z);
        if (z) {
            int i6 = IPostMessageService_Parcel + 115;
            ITrustedWebActivityCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                i3 = 1;
            }
        } else {
            int i7 = IPostMessageService_Parcel + 83;
            ITrustedWebActivityCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            i3 = 4;
        }
        tdsRoundLayout.setImportantForAccessibility(i3);
    }

    private final void IAuthTabCallback(float f) {
        int i;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 67;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        FrameLayout frameLayout = this.access100.onNavigationEvent;
        frameLayout.setAlpha(fCoerceIn);
        frameLayout.setEnabled(fCoerceIn > 0.0f);
        if (fCoerceIn <= 0.0f) {
            int i5 = ITrustedWebActivityCallbackStub + 71;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            i = 4;
        } else {
            i = 0;
        }
        frameLayout.setImportantForAccessibility(i);
        int i7 = ITrustedWebActivityCallbackStub + 63;
        IPostMessageService_Parcel = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 97 / 0;
        }
    }

    private final void validateRelationship() {
        int i = 2 % 2;
        if (!this.requestPostMessageChannelWithExtras) {
            FrameLayout frameLayout = this.access100.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            if (frameLayout.getVisibility() == 0) {
                int i2 = ITrustedWebActivityCallbackStub + 73;
                IPostMessageService_Parcel = i2 % 128;
                int i3 = i2 % 2;
                if (this.access100.onNavigationEvent.getAlpha() > 0.0f) {
                    ICustomTabsServiceStub();
                    return;
                }
            }
        }
        warmup();
        int i4 = ITrustedWebActivityCallbackStub + 113;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = r25.access100.onExtraCallbackWithResult;
        r1.setAlpha(0.0f);
        r1.setScaleX(1.0f);
        r1.setScaleY(1.0f);
        r1 = r25.access100.onExtraCallbackWithResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r1 = (im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r1, o.isMuted.onTransact(o.isMuted.onNavigationEvent(new o.AppLovinSdkSettings(), java.lang.Float.valueOf(0.0f), r2, (kotlin.jvm.functions.Function1) null, 4, (java.lang.Object) null), r2, java.lang.Float.valueOf(1.2f), new im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda5()), -1, o.getExtraParameters.Alternate, 0, o.Address.onNavigationEvent.asBinder(), 1000, null, 0, 0L, false, 1936, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025);
        o.isFireOS.onExtraCallbackWithResult(r1, false, 1, (java.lang.Object) null);
        r25.onExtraCallback = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r25.onExtraCallback != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r25.onExtraCallback != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r2 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ITrustedWebActivityCallbackStub + 115;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i2 % 128;
        Float fValueOf = i2 % 2 != 0 ? Float.valueOf(0.0f) : Float.valueOf(1.0f);
    }

    private static final Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 57;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(0);
        Unit unit = Unit.INSTANCE;
        int i4 = IPostMessageService_Parcel + 43;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void warmup() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 117;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = this.onExtraCallback;
        if (rally != null) {
            int i5 = i2 + 113;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            rally.ICustomTabsServiceStub();
        }
        this.onExtraCallback = null;
        TdsRoundLayout tdsRoundLayout = this.access100.onExtraCallbackWithResult;
        tdsRoundLayout.setAlpha(0.0f);
        tdsRoundLayout.setScaleX(1.0f);
        tdsRoundLayout.setScaleY(1.0f);
    }

    private final void onExtraCallbackWithResult(getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 87;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        getBatteryInfo.IAuthTabCallbackDefault iAuthTabCallbackDefault = (getBatteryInfo.IAuthTabCallbackDefault) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -941077906, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 941077906, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOnWarmupCompleted = onWarmupCompleted(iAuthTabCallbackDefault, context, mayLaunchUrl());
        getBatteryInfo.IAuthTabCallbackDefault iAuthTabCallbackDefaultOnTransact = onextracallbackwithresult.onTransact();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOnWarmupCompleted2 = onWarmupCompleted(iAuthTabCallbackDefaultOnTransact, context2, postMessage());
        this.access100.ICustomTabsCallback_Parcel.setTextColor(onExtraCallbackWithResult(iOnWarmupCompleted, 1.0f));
        this.access100.getInterfaceDescriptor.setTextColor(onExtraCallbackWithResult(iOnWarmupCompleted, 0.6f));
        Typography7 typography7 = this.access100.onWarmupCompleted;
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        getBatteryInfo.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = (getBatteryInfo.IAuthTabCallbackDefault) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -941077906, iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 941077906, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        typography7.setTextColor(IAuthTabCallback(iAuthTabCallbackDefault2, context3));
        this.access100.extraCallbackWithResult.setTextColor(onExtraCallbackWithResult(iOnWarmupCompleted2, 1.0f));
        this.access100.extraCallback.setTextColor(onExtraCallbackWithResult(iOnWarmupCompleted2, 0.6f));
        Typography7 typography72 = this.access100.readTypedObject;
        getBatteryInfo.IAuthTabCallbackDefault iAuthTabCallbackDefaultOnTransact2 = onextracallbackwithresult.onTransact();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        typography72.setTextColor(IAuthTabCallback(iAuthTabCallbackDefaultOnTransact2, context4));
        this.access100.ICustomTabsCallback.setImageTintList(ColorStateList.valueOf(onExtraCallbackWithResult(iOnWarmupCompleted2, 0.4f)));
        int i4 = ITrustedWebActivityCallbackStub + 83;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final int mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 77;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            Object[] objArr = {new getUrlokhttp(new extraCallbackWithResult(configuration2))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            return ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        int iOnRelationshipValidationResult = new getUrlokhttp(new onMessageChannelReady(configuration3)).onRelationshipValidationResult();
        int i4 = ITrustedWebActivityCallbackStub + 3;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return iOnRelationshipValidationResult;
    }

    private final int postMessage() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new onActivityResized(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        int i2 = IPostMessageService_Parcel + 53;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return iIntValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return java.lang.Integer.valueOf(r4.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r1.requestPostMessageChannelWithExtras == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r3 = r3 + 99;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel = r3 % 128;
        r3 = r3 % 2;
        r1 = r1.extraCommand;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r6 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r1 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel + 117;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ITrustedWebActivityCallbackStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        r1 = 33 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        return java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r4 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object setEngagementSignalsCallback(Object[] objArr) {
        Integer num;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 39;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            num = benefitPremiumAdCollapsedView.asInterface;
            int i4 = 55 / 0;
        } else {
            num = benefitPremiumAdCollapsedView.asInterface;
        }
    }

    private final int ICustomTabsService() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub;
        int i3 = i2 + 63;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.asInterface;
        if (num != null) {
            int i5 = i2 + 41;
            IPostMessageService_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return num.intValue();
            }
            int i6 = 22 / 0;
            return num.intValue();
        }
        Integer num2 = this.extraCommand;
        if (num2 != null) {
            int i7 = i2 + 53;
            IPostMessageService_Parcel = i7 % 128;
            int i8 = i7 % 2;
            return num2.intValue();
        }
        Integer numValueOf = Integer.valueOf(getMeasuredWidth());
        Integer num3 = null;
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i9 = ITrustedWebActivityCallbackStub + 55;
            IPostMessageService_Parcel = i9 % 128;
            int i10 = i9 % 2;
            int iIntValue = numValueOf.intValue();
            int i11 = ITrustedWebActivityCallbackStub + 101;
            IPostMessageService_Parcel = i11 % 128;
            int i12 = i11 % 2;
            return iIntValue;
        }
        Integer numValueOf2 = Integer.valueOf(this.writeTypedObject);
        if (numValueOf2.intValue() > 0) {
            int i13 = IPostMessageService_Parcel + 15;
            ITrustedWebActivityCallbackStub = i13 % 128;
            int i14 = i13 % 2;
            num3 = numValueOf2;
        }
        if (num3 != null) {
            return num3.intValue();
        }
        return 0;
    }

    private final int IAuthTabCallback(int i) {
        Integer num;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 31;
        int i4 = i3 % 128;
        IPostMessageService_Parcel = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (this.requestPostMessageChannel && (num = this.ICustomTabsCallbackStubProxy) != null) {
                int i5 = i4 + 53;
                ITrustedWebActivityCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    num.intValue();
                    obj.hashCode();
                    throw null;
                }
                i = num.intValue();
            }
            int i6 = IPostMessageService_Parcel + 81;
            ITrustedWebActivityCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }
        throw null;
    }

    private final int asBinder(int i) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 69;
        int i4 = i3 % 128;
        ITrustedWebActivityCallbackStub = i4;
        int i5 = i3 % 2;
        if (!this.requestPostMessageChannel) {
            return i;
        }
        int i6 = i4 + 7;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        Integer num = this.onRelationshipValidationResult;
        return num != null ? num.intValue() : i;
    }

    private final int asInterface(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 3;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(i2 * 0.5625f);
        int iOnTransact = onTransact(i);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(iOnExtraCallback, RangesKt.coerceAtLeast(Math.min(iOnTransact, i - (varyMatches.onNavigationEvent(16, displayMetrics) << 1)), 1)), 1);
        int i6 = ITrustedWebActivityCallbackStub + 93;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return iCoerceAtLeast;
    }

    private final int IAuthTabCallbackStub(int i) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 59;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int iIsEngagementSignalsApiAvailable = i + isEngagementSignalsApiAvailable();
        int i5 = IPostMessageService_Parcel + 19;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return iIsEngagementSignalsApiAvailable;
    }

    private final int onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 77;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iExtraCommand = extraCommand() + onPostMessage();
        int i4 = IPostMessageService_Parcel + 49;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iExtraCommand;
    }

    private final int isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 35;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.IAuthTabCallback;
        if (num == null) {
            int iOnMessageChannelReady = onMessageChannelReady();
            int i5 = IPostMessageService_Parcel + 31;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return iOnMessageChannelReady;
        }
        int i7 = i2 + 105;
        ITrustedWebActivityCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        int iIntValue = num.intValue();
        if (i8 != 0) {
            int i9 = 16 / 0;
        }
        return iIntValue;
    }

    private final int extraCommand() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 27;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        Integer num = this.access000;
        if (num == null) {
            if (!ICustomTabsCallbackStub() && !this.requestPostMessageChannel) {
                return 0;
            }
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
            int i5 = IPostMessageService_Parcel + 39;
            ITrustedWebActivityCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 14 / 0;
            }
            return iOnNavigationEvent;
        }
        int i7 = i3 + 33;
        ITrustedWebActivityCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return num.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r1 = extraCommand();
        r2 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ITrustedWebActivityCallbackStub + 121;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if ((r2 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int ICustomTabsCallback_Parcel() {
        Integer num;
        int i = 2 % 2;
        if (this.requestPostMessageChannel) {
            int i2 = IPostMessageService_Parcel + 65;
            ITrustedWebActivityCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                num = this.ICustomTabsCallback_Parcel;
                int i3 = 62 / 0;
            } else {
                num = this.ICustomTabsCallback_Parcel;
            }
        } else {
            return extraCommand();
        }
    }

    private final int prefetch() {
        int i = 2 % 2;
        Integer num = this.access000;
        if (num == null) {
            return 0;
        }
        int i2 = IPostMessageService_Parcel + 5;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        int i4 = IPostMessageService_Parcel + 89;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private final float newSession() {
        int i = 2 % 2;
        Float f = this.IAuthTabCallbackStub;
        if (f == null) {
            int i2 = ITrustedWebActivityCallbackStub + 9;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return 1.0f;
        }
        float fFloatValue = f.floatValue();
        int i4 = IPostMessageService_Parcel + 63;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return fFloatValue;
    }

    public static final class access100 extends ViewOutlineProvider {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ float onExtraCallback;

        access100(float f) {
            this.onExtraCallback = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.onExtraCallback);
            int i4 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void ICustomTabsCallback() {
        int iOnNavigationEvent;
        float fFloatValue;
        int i = 2 % 2;
        Float f = this.IAuthTabCallback_Parcel;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            if (!(!ICustomTabsCallbackStub())) {
                int i2 = ITrustedWebActivityCallbackStub + 105;
                IPostMessageService_Parcel = i2 % 128;
                int i3 = i2 % 2;
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(28, displayMetrics);
            } else {
                DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(0, displayMetrics2);
            }
            fFloatValue = iOnNavigationEvent;
        }
        this.access100.ICustomTabsCallbackDefault.setClipToOutline(fFloatValue > 0.0f);
        this.access100.ICustomTabsCallbackDefault.setOutlineProvider(new access100(fFloatValue));
        this.access100.ICustomTabsCallbackDefault.invalidateOutline();
        int i4 = IPostMessageService_Parcel + 29;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final int onPostMessage() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 43;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(4, displayMetrics2);
        int iICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = iOnNavigationEvent + iOnNavigationEvent2 + varyMatches.onNavigationEvent(Integer.valueOf(iICustomTabsCallbackDefault), displayMetrics3);
        int i4 = ITrustedWebActivityCallbackStub + 61;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return iOnNavigationEvent3;
    }

    private final int ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        if (!this.isEngagementSignalsApiAvailable) {
            int i2 = ITrustedWebActivityCallbackStub + 53;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return 10;
        }
        int i4 = IPostMessageService_Parcel + 3;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int onTransact(int i) {
        int iIntValue;
        Integer interfaceDescriptor;
        int i2 = 2 % 2;
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallbackStubProxy;
        if (onextracallbackwithresult == null || (interfaceDescriptor = onextracallbackwithresult.getInterfaceDescriptor()) == null) {
            iIntValue = 430;
        } else {
            if (interfaceDescriptor.intValue() <= 0) {
                int i3 = IPostMessageService_Parcel + 39;
                ITrustedWebActivityCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                interfaceDescriptor = null;
            }
            if (interfaceDescriptor != null) {
                int i5 = ITrustedWebActivityCallbackStub + 89;
                IPostMessageService_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    interfaceDescriptor.intValue();
                    throw null;
                }
                iIntValue = interfaceDescriptor.intValue();
            }
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iCoerceAtMost = RangesKt.coerceAtMost(i, varyMatches.onNavigationEvent(Integer.valueOf(iIntValue), displayMetrics));
        int i6 = ITrustedWebActivityCallbackStub + 93;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return iCoerceAtMost;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[PHI: r1
      0x001d: PHI (r1v6 java.lang.Integer) = (r1v5 java.lang.Integer), (r1v10 java.lang.Integer) binds: [B:8:0x001b, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void warmup(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        Integer num;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 47;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            benefitPremiumAdCollapsedView.prefetchWithMultipleUrls = true;
            num = benefitPremiumAdCollapsedView.onVerticalScrollEvent;
            if (num != null) {
                int iIntValue = num.intValue();
                benefitPremiumAdCollapsedView.onVerticalScrollEvent = null;
                benefitPremiumAdCollapsedView.onNavigationEvent(iIntValue);
            }
        } else {
            benefitPremiumAdCollapsedView.prefetchWithMultipleUrls = false;
            num = benefitPremiumAdCollapsedView.onVerticalScrollEvent;
            if (num != null) {
            }
        }
        int i3 = ITrustedWebActivityCallbackStub + 93;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r4.prefetchWithMultipleUrls != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r4.prefetchWithMultipleUrls = true;
        postOnAnimation(new im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda50(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r5 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel + 63;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ITrustedWebActivityCallbackStub = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if ((r5 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        onNavigationEvent(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.mayLaunchUrl != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.mayLaunchUrl != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 11;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel = r1 % 128;
        r1 = r1 % 2;
        r4.onVerticalScrollEvent = java.lang.Integer.valueOf(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub;
        int i4 = i3 + 57;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access000(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - benefitPremiumAdCollapsedView.ICustomTabsServiceDefault >= ParamUtils.NORMAL.getDelay()) {
            benefitPremiumAdCollapsedView.ICustomTabsServiceDefault = jElapsedRealtime;
            getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = benefitPremiumAdCollapsedView.IAuthTabCallbackStubProxy;
            if (onextracallbackwithresult != null) {
                int i2 = ITrustedWebActivityCallbackStub + 85;
                int i3 = i2 % 128;
                IPostMessageService_Parcel = i3;
                int i4 = i2 % 2;
                Function1<? super getBatteryInfo.onExtraCallbackWithResult, Unit> function1 = benefitPremiumAdCollapsedView.writeTypedList;
                if (i4 == 0) {
                    int i5 = 2 / 0;
                    if (function1 != null) {
                        int i6 = i3 + 33;
                        ITrustedWebActivityCallbackStub = i6 % 128;
                        int i7 = i6 % 2;
                        function1.invoke(onextracallbackwithresult);
                    }
                } else if (function1 != null) {
                }
            }
        }
        int i8 = IPostMessageService_Parcel + 55;
        ITrustedWebActivityCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private final void requestPostMessageChannel() {
        int i = 2 % 2;
        View view = this.access100.onRelationshipValidationResult;
        Intrinsics.checkNotNullExpressionValue(view, "");
        FrameLayout frameLayout = this.access100.onTransact;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        transparentBackground.onWarmupCompleted(view, false, (Integer) null, 0, frameLayout, (List) null, 0.0f, 0.0f, (Function2) null, false, 0L, (String) null, (getContentView) null, new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda54(this), 4084, (Object) null);
        int i2 = ITrustedWebActivityCallbackStub + 59;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 103;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -2089550736, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2089550752);
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallbackStub + 5;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r4 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r4 = 76 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r3.prefetch = java.lang.Boolean.valueOf(r4);
        r0 = r3.access100.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r4 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r4 = getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
        r1 = new o.SearchBarKtSearchBarImplwrappedContent1ExternalSyntheticLambda0(o.varyMatches.onNavigationEvent(9, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        r0.setPageTransformer(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3.prefetch, java.lang.Boolean.valueOf(r4)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3.prefetch, java.lang.Boolean.valueOf(r4)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r4 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ITrustedWebActivityCallbackStub + 27;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 63;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
    }

    private final void onMinimized() {
        int i = 2 % 2;
        this.onGreatestScrollPercentageIncreased = 0;
        View childAt = this.access100.IAuthTabCallbackStub.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.stopScroll();
        }
        if (this.access100.IAuthTabCallbackStub.onNavigationEvent() != 0) {
            int i2 = IPostMessageService_Parcel + 67;
            ITrustedWebActivityCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.access100.IAuthTabCallbackStub.setCurrentItem(0, false);
        }
        if (recyclerView != null) {
            IAuthTabCallback(recyclerView);
        }
        ICustomTabsCallbackStubProxy();
        if (recyclerView != null) {
            int i4 = ITrustedWebActivityCallbackStub + 89;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallback(new Object[]{this, recyclerView}, -1287852533, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1287852555);
        }
    }

    private final void IAuthTabCallback(RecyclerView recyclerView) {
        int i = 2 % 2;
        recyclerView.stopScroll();
        recyclerView.scrollBy(-recyclerView.computeHorizontalScrollOffset(), 0);
        recyclerView.scrollToPosition(0);
        recyclerView.post(new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda2(recyclerView, this));
        int i2 = ITrustedWebActivityCallbackStub + 23;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onWarmupCompleted(RecyclerView recyclerView, BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 53;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            recyclerView.stopScroll();
            recyclerView.scrollBy(-recyclerView.computeHorizontalScrollOffset(), 0);
            recyclerView.scrollToPosition(0);
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            onExtraCallback(new Object[]{benefitPremiumAdCollapsedView, recyclerView}, -1287852533, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1287852555);
            return;
        }
        recyclerView.stopScroll();
        recyclerView.scrollBy(-recyclerView.computeHorizontalScrollOffset(), 0);
        recyclerView.scrollToPosition(0);
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView, recyclerView}, -1287852533, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1287852555);
    }

    public static final class ICustomTabsCallbackStubProxy extends ViewPager2.OnPageChangeCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        ICustomTabsCallbackStubProxy() {
        }

        public void onPageScrollStateChanged(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                BenefitPremiumAdCollapsedView.onNavigationEvent(BenefitPremiumAdCollapsedView.this, i);
                throw null;
            }
            BenefitPremiumAdCollapsedView.onNavigationEvent(BenefitPremiumAdCollapsedView.this, i);
            int i4 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                BenefitPremiumAdCollapsedView.this.asInterface();
                throw null;
            }
            Function0<Unit> function0AsInterface = BenefitPremiumAdCollapsedView.this.asInterface();
            if (function0AsInterface != null) {
                function0AsInterface.invoke();
                int i5 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPageSelected(int i) {
            boolean z;
            int i2 = 2 % 2;
            int iOnActivityResized = BenefitPremiumAdCollapsedView.onActivityResized(BenefitPremiumAdCollapsedView.this);
            BenefitPremiumAdCollapsedView.onWarmupCompleted(BenefitPremiumAdCollapsedView.this, i);
            BenefitPremiumAdCollapsedView.ICustomTabsCallback_Parcel(BenefitPremiumAdCollapsedView.this);
            BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = BenefitPremiumAdCollapsedView.this;
            BenefitPremiumAdCollapsedView.IAuthTabCallbackStubProxy(benefitPremiumAdCollapsedView, BenefitPremiumAdCollapsedView.IAuthTabCallback(benefitPremiumAdCollapsedView, i));
            BenefitPremiumAdCollapsedView.onExtraCallback(BenefitPremiumAdCollapsedView.this, Integer.valueOf(iOnActivityResized), iOnActivityResized != i);
            BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView2 = BenefitPremiumAdCollapsedView.this;
            if (((Boolean) BenefitPremiumAdCollapsedView.onExtraCallback(new Object[]{benefitPremiumAdCollapsedView2}, -1947698859, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1947698879)).booleanValue()) {
                int i3 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (iOnActivityResized != i) {
                    z = true;
                } else {
                    int i4 = onWarmupCompleted + 115;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 4 % 4;
                    }
                    z = false;
                }
            }
            BenefitPremiumAdCollapsedView.onNavigationEvent(benefitPremiumAdCollapsedView2, 0, z, 1, null);
            BenefitPremiumAdCollapsedView.isEngagementSignalsApiAvailable(BenefitPremiumAdCollapsedView.this);
            if (((Boolean) BenefitPremiumAdCollapsedView.onExtraCallback(new Object[]{BenefitPremiumAdCollapsedView.this}, -1947698859, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1947698879)).booleanValue()) {
                int i6 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    if (BenefitPremiumAdCollapsedView.onMinimized(BenefitPremiumAdCollapsedView.this).size() <= 1) {
                        return;
                    }
                } else if (BenefitPremiumAdCollapsedView.onMinimized(BenefitPremiumAdCollapsedView.this).size() <= 1) {
                    return;
                }
                if (iOnActivityResized != i) {
                    BenefitPremiumAdCollapsedView.onWarmupCompleted(BenefitPremiumAdCollapsedView.this, iOnActivityResized, i);
                }
            }
        }
    }

    static /* synthetic */ void onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = ITrustedWebActivityCallbackStub + 79;
            IPostMessageService_Parcel = i4 % 128;
            i = i4 % 2 == 0 ? 1 : 0;
        }
        if ((i2 & 2) != 0) {
            int i5 = ITrustedWebActivityCallbackStub + 79;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        benefitPremiumAdCollapsedView.onWarmupCompleted(i, z);
    }

    private final void onWarmupCompleted(int i, boolean z) {
        int i2 = 2 % 2;
        if (setEngagementSignalsCallback()) {
            this.access100.IAuthTabCallbackStub.post(new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda6(this, i, z));
            return;
        }
        getBacktraceNote<? super unRegisterBatteryReceiver, ? super getBatteryInfo.onExtraCallbackWithResult, ? super Boolean, Unit> getbacktracenote = this.IEngagementSignalsCallback;
        if (getbacktracenote != null) {
            int i3 = IPostMessageService_Parcel + 115;
            ITrustedWebActivityCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            getbacktracenote.invoke((Object) null, (Object) null, Boolean.FALSE);
        }
        int i5 = IPostMessageService_Parcel + 85;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ boolean $resetPlayback;
        final /* synthetic */ int $retryCount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        readTypedObject(int i, boolean z, access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$retryCount = i;
            this.$resetPlayback = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            readTypedObject readtypedobject = BenefitPremiumAdCollapsedView.this.new readTypedObject(this.$retryCount, this.$resetPlayback, access13800Var);
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return readtypedobject;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            readTypedObject readtypedobjectCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return readtypedobjectCreate.invokeSuspend(Unit.INSTANCE);
            }
            readtypedobjectCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(16L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallback + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
                int i6 = onExtraCallback + 11;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            BenefitPremiumAdCollapsedView.onWarmupCompleted(BenefitPremiumAdCollapsedView.this, (getPackageType) null);
            Object[] objArr = {BenefitPremiumAdCollapsedView.this, Integer.valueOf(this.$retryCount + 1), Boolean.valueOf(this.$resetPlayback)};
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            BenefitPremiumAdCollapsedView.onExtraCallback(objArr, -627113180, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 627113192);
            return Unit.INSTANCE;
        }
    }

    private static final void IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, boolean z) {
        int i2 = 2 % 2;
        if (benefitPremiumAdCollapsedView.isAttachedToWindow()) {
            getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(benefitPremiumAdCollapsedView.onMinimized, benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased);
            BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemViewOnExtraCallback = benefitPremiumAdCollapsedView.onExtraCallback(benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased);
            if (benefitPremiumAdCarouselItemViewOnExtraCallback == null) {
                if (i < 5) {
                    int i3 = ITrustedWebActivityCallbackStub + 89;
                    int i4 = i3 % 128;
                    IPostMessageService_Parcel = i4;
                    if (i3 % 2 == 0) {
                        getPackageType getpackagetype = benefitPremiumAdCollapsedView.IPostMessageService;
                        throw null;
                    }
                    getPackageType getpackagetype2 = benefitPremiumAdCollapsedView.IPostMessageService;
                    if (getpackagetype2 != null) {
                        int i5 = i4 + 111;
                        ITrustedWebActivityCallbackStub = i5 % 128;
                        int i6 = i5 % 2;
                        getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
                    }
                    benefitPremiumAdCollapsedView.IPostMessageService = maybeUpdateAnimatable.onNavigationEvent(benefitPremiumAdCollapsedView.onActivityLayout, (CoroutineContext) null, (setRandomHost) null, benefitPremiumAdCollapsedView.new readTypedObject(i, z, null), 3, (Object) null);
                    return;
                }
                return;
            }
            getPackageType getpackagetype3 = benefitPremiumAdCollapsedView.IPostMessageService;
            if (getpackagetype3 != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype3, (CancellationException) null, 1, (Object) null);
            }
            benefitPremiumAdCollapsedView.IPostMessageService = null;
            getBacktraceNote<? super unRegisterBatteryReceiver, ? super getBatteryInfo.onExtraCallbackWithResult, ? super Boolean, Unit> getbacktracenote = benefitPremiumAdCollapsedView.IEngagementSignalsCallback;
            if (getbacktracenote != null) {
                if (onextracallbackwithresultOnExtraCallback == null) {
                    onextracallbackwithresultOnExtraCallback = null;
                } else if (benefitPremiumAdCollapsedView.ICustomTabsCallbackStub()) {
                    onextracallbackwithresultOnExtraCallback = getBatteryInfo.onExtraCallbackWithResult.onExtraCallback(onextracallbackwithresultOnExtraCallback, null, 0, onextracallbackwithresultOnExtraCallback.onNavigationEvent(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131067, null);
                    int i7 = ITrustedWebActivityCallbackStub + 93;
                    IPostMessageService_Parcel = i7 % 128;
                    int i8 = i7 % 2;
                }
                getbacktracenote.invoke(benefitPremiumAdCarouselItemViewOnExtraCallback, onextracallbackwithresultOnExtraCallback, Boolean.valueOf(z));
            }
        }
    }

    private final BenefitPremiumAdCarouselItemView onExtraCallback(int i) {
        View view;
        int i2 = 2 % 2;
        RecyclerView childAt = this.access100.IAuthTabCallbackStub.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? childAt : null;
        if (recyclerView == null) {
            int i3 = ITrustedWebActivityCallbackStub + 51;
            IPostMessageService_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            int i4 = IPostMessageService_Parcel + 3;
            ITrustedWebActivityCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            view = viewHolderFindViewHolderForAdapterPosition.onNavigationEvent;
            if (i5 != 0) {
                throw null;
            }
        } else {
            int i6 = IPostMessageService_Parcel + 95;
            ITrustedWebActivityCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            view = null;
        }
        if (!(view instanceof BenefitPremiumAdCarouselItemView)) {
            return null;
        }
        int i8 = IPostMessageService_Parcel + 57;
        int i9 = i8 % 128;
        ITrustedWebActivityCallbackStub = i9;
        int i10 = i8 % 2;
        BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView = (BenefitPremiumAdCarouselItemView) view;
        int i11 = i9 + 87;
        IPostMessageService_Parcel = i11 % 128;
        if (i11 % 2 != 0) {
            return benefitPremiumAdCarouselItemView;
        }
        throw null;
    }

    private final void onNavigationEvent(RecyclerView recyclerView, int i, int i2, float f) {
        BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView;
        int i3 = 2 % 2;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            BenefitPremiumAdCarouselItemView childAt = recyclerView.getChildAt(i4);
            if (childAt instanceof BenefitPremiumAdCarouselItemView) {
                int i5 = ITrustedWebActivityCallbackStub + 33;
                IPostMessageService_Parcel = i5 % 128;
                int i6 = i5 % 2;
                benefitPremiumAdCarouselItemView = childAt;
            } else {
                int i7 = ITrustedWebActivityCallbackStub + 33;
                IPostMessageService_Parcel = i7 % 128;
                int i8 = i7 % 2;
                benefitPremiumAdCarouselItemView = null;
            }
            if (benefitPremiumAdCarouselItemView != null) {
                benefitPremiumAdCarouselItemView.setCardSize(i, i2, f);
                int i9 = ITrustedWebActivityCallbackStub + 27;
                IPostMessageService_Parcel = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    private final void onNavigationEvent(RecyclerView recyclerView, float f, float f2, float f3, int i, int i2) {
        int i3;
        int iIntValue;
        int iIntValue2;
        int i4 = 2 % 2;
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            Integer num = null;
            View view = childAt instanceof BenefitPremiumAdCarouselItemView ? (BenefitPremiumAdCarouselItemView) childAt : null;
            if (view != null) {
                if (recyclerView.getChildAdapterPosition(view) == this.onGreatestScrollPercentageIncreased || this.requestPostMessageChannel) {
                    int i6 = IPostMessageService_Parcel + 85;
                    ITrustedWebActivityCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    view.setCardTransform(f, f2, f3, i, i2);
                } else {
                    Integer numValueOf = Integer.valueOf(view.getWidth());
                    if (numValueOf.intValue() <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int i8 = ITrustedWebActivityCallbackStub + 1;
                        IPostMessageService_Parcel = i8 % 128;
                        if (i8 % 2 == 0) {
                            iIntValue2 = numValueOf.intValue();
                            int i9 = 7 / 0;
                        } else {
                            iIntValue2 = numValueOf.intValue();
                        }
                        i3 = iIntValue2;
                    } else {
                        int i10 = IPostMessageService_Parcel + 13;
                        ITrustedWebActivityCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = i;
                    }
                    Integer numValueOf2 = Integer.valueOf(view.getHeight());
                    if (numValueOf2.intValue() > 0) {
                        int i12 = IPostMessageService_Parcel + 35;
                        ITrustedWebActivityCallbackStub = i12 % 128;
                        int i13 = i12 % 2;
                        num = numValueOf2;
                    }
                    if (num != null) {
                        int i14 = ITrustedWebActivityCallbackStub + 93;
                        IPostMessageService_Parcel = i14 % 128;
                        int i15 = i14 % 2;
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = i2;
                    }
                    view.setCardTransform(1.0f, 1.0f, 0.0f, i3, iIntValue);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(RecyclerView recyclerView) {
        float fFloatValue;
        BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView;
        int i = 2 % 2;
        Float f = this.onTransact;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else if (ICustomTabsCallbackStub()) {
            int i2 = ITrustedWebActivityCallbackStub + 39;
            IPostMessageService_Parcel = i2 % 128;
            fFloatValue = i2 % 2 == 0 ? 0.0f : 1.0f;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            int i4 = ITrustedWebActivityCallbackStub + 87;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            BenefitPremiumAdCarouselItemView childAt = recyclerView.getChildAt(i3);
            if (childAt instanceof BenefitPremiumAdCarouselItemView) {
                benefitPremiumAdCarouselItemView = childAt;
                int i6 = ITrustedWebActivityCallbackStub + 73;
                IPostMessageService_Parcel = i6 % 128;
                int i7 = i6 % 2;
            } else {
                benefitPremiumAdCarouselItemView = null;
            }
            if (benefitPremiumAdCarouselItemView != null) {
                benefitPremiumAdCarouselItemView.setOverlayContentAlpha(fFloatValue);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        float fFloatValue;
        float f;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        RecyclerView recyclerView = (RecyclerView) objArr[1];
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 55;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Float f2 = benefitPremiumAdCollapsedView.onWarmupCompleted;
            throw null;
        }
        Float f3 = benefitPremiumAdCollapsedView.onWarmupCompleted;
        if (f3 != null) {
            fFloatValue = f3.floatValue();
        } else if (benefitPremiumAdCollapsedView.ICustomTabsCallbackStub()) {
            int i3 = ITrustedWebActivityCallbackStub + 43;
            IPostMessageService_Parcel = i3 % 128;
            fFloatValue = i3 % 2 == 0 ? 0.0f : 1.0f;
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5 = IPostMessageService_Parcel + 29;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            View childAt = recyclerView.getChildAt(i4);
            if (childAt != null) {
                int i7 = IPostMessageService_Parcel + 43;
                ITrustedWebActivityCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    int i9 = ITrustedWebActivityCallbackStub + 19;
                    IPostMessageService_Parcel = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 68 / 0;
                        f = childAdapterPosition != 0 ? fFloatValue : 1.0f;
                    } else if (childAdapterPosition != 0) {
                    }
                    childAt.setAlpha(f);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1
      0x0029: PHI (r1v7 android.view.View) = (r1v6 android.view.View), (r1v16 android.view.View) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IEngagementSignalsCallback() {
        View childAt;
        RecyclerView recyclerView;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 3;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            childAt = this.access100.IAuthTabCallbackStub.getChildAt(0);
            recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        } else {
            childAt = this.access100.IAuthTabCallbackStub.getChildAt(0);
            if (childAt instanceof RecyclerView) {
            }
        }
        if (recyclerView != null) {
            int i3 = ITrustedWebActivityCallbackStub + 1;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent(recyclerView);
            if (i4 == 0) {
                throw null;
            }
        }
        int i5 = ITrustedWebActivityCallbackStub + 115;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) {
        RecyclerView recyclerView;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        RecyclerView childAt = benefitPremiumAdCollapsedView.access100.IAuthTabCallbackStub.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            recyclerView = childAt;
            int i2 = ITrustedWebActivityCallbackStub + 29;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            int i4 = ITrustedWebActivityCallbackStub + 69;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = {benefitPremiumAdCollapsedView, recyclerView};
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            if (i5 == 0) {
                onExtraCallback(objArr2, -1287852533, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent4, 1287852555);
                int i6 = 26 / 0;
            } else {
                onExtraCallback(objArr2, -1287852533, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent4, 1287852555);
            }
        }
        int i7 = IPostMessageService_Parcel + 13;
        ITrustedWebActivityCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void ICustomTabsService_Parcel() {
        BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView childAt = this.access100.IAuthTabCallbackStub.getChildAt(0);
        Object obj = null;
        RecyclerView recyclerView = childAt instanceof RecyclerView ? childAt : null;
        if (recyclerView != null) {
            int i4 = ITrustedWebActivityCallbackStub + 105;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            int childCount = recyclerView.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = recyclerView.getChildAt(i6);
                if (childAt2 instanceof BenefitPremiumAdCarouselItemView) {
                    int i7 = ITrustedWebActivityCallbackStub + 67;
                    int i8 = i7 % 128;
                    IPostMessageService_Parcel = i8;
                    int i9 = i7 % 2;
                    benefitPremiumAdCarouselItemView = (BenefitPremiumAdCarouselItemView) childAt2;
                    int i10 = i8 + 101;
                    ITrustedWebActivityCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    benefitPremiumAdCarouselItemView = null;
                }
                if (benefitPremiumAdCarouselItemView != null) {
                    int i12 = ITrustedWebActivityCallbackStub + 19;
                    IPostMessageService_Parcel = i12 % 128;
                    if (i12 % 2 == 0) {
                        recyclerView.getChildAdapterPosition(benefitPremiumAdCarouselItemView);
                        obj.hashCode();
                        throw null;
                    }
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(benefitPremiumAdCarouselItemView);
                    if (childAdapterPosition != -1) {
                        this.extraCallbackWithResult.onExtraCallback(benefitPremiumAdCarouselItemView, childAdapterPosition);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object requestPostMessageChannel(Object[] objArr) throws Throwable {
        int i;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView;
        Throwable th;
        Object objAsInterface;
        boolean zOnWarmupCompleted;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView2 = (BenefitPremiumAdCollapsedView) objArr[0];
        boolean z = true;
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 81;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemViewOnExtraCallback = benefitPremiumAdCollapsedView2.onExtraCallback(iIntValue);
        if (benefitPremiumAdCarouselItemViewOnExtraCallback != null) {
            i = iIntValue2;
            benefitPremiumAdCollapsedView = benefitPremiumAdCollapsedView2;
            z = true;
            th = null;
            isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{benefitPremiumAdCarouselItemViewOnExtraCallback, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback()), Float.valueOf(1.0f), Float.valueOf(0.0f), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda0(benefitPremiumAdCarouselItemViewOnExtraCallback), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
            int i5 = IPostMessageService_Parcel + 93;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i = iIntValue2;
            benefitPremiumAdCollapsedView = benefitPremiumAdCollapsedView2;
            th = null;
        }
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView3 = benefitPremiumAdCollapsedView;
        int i7 = i;
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(benefitPremiumAdCollapsedView3.onMinimized, i7);
        getBatteryInfo.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onextracallbackwithresult != null ? onextracallbackwithresult.onNavigationEvent() : th;
        BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemViewOnExtraCallback2 = benefitPremiumAdCollapsedView3.onExtraCallback(i7);
        if (benefitPremiumAdCarouselItemViewOnExtraCallback2 == null) {
            return th;
        }
        if (onwarmupcompletedOnNavigationEvent != 0) {
            int i8 = IPostMessageService_Parcel + 7;
            ITrustedWebActivityCallbackStub = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 25 / 0;
                objAsInterface = onwarmupcompletedOnNavigationEvent.asInterface();
            } else {
                objAsInterface = onwarmupcompletedOnNavigationEvent.asInterface();
            }
        } else {
            objAsInterface = th;
        }
        benefitPremiumAdCarouselItemViewOnExtraCallback2.setControlButtonsVisible((objAsInterface == getBatteryInfo.IAuthTabCallback.VIDEO ? false : z) ^ z, z);
        if (onwarmupcompletedOnNavigationEvent != 0) {
            int i10 = ITrustedWebActivityCallbackStub + 79;
            IPostMessageService_Parcel = i10 % 128;
            if (i10 % 2 == 0) {
                onwarmupcompletedOnNavigationEvent.onWarmupCompleted();
                th.hashCode();
                throw th;
            }
            zOnWarmupCompleted = onwarmupcompletedOnNavigationEvent.onWarmupCompleted();
        } else {
            zOnWarmupCompleted = z;
        }
        benefitPremiumAdCarouselItemViewOnExtraCallback2.setMuteButtonEnabled(zOnWarmupCompleted);
        benefitPremiumAdCarouselItemViewOnExtraCallback2.setControlButtonsAlpha(0.0f);
        Throwable th2 = th;
        isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{benefitPremiumAdCarouselItemViewOnExtraCallback2, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback()), Float.valueOf(0.0f), Float.valueOf(1.0f), new BenefitPremiumAdCollapsedView$.ExternalSyntheticLambda1(benefitPremiumAdCarouselItemViewOnExtraCallback2), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, z ? 1 : 0, th2);
        return th2;
    }

    private static final Unit onExtraCallbackWithResult(BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView, float f) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 45;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            benefitPremiumAdCarouselItemView.setControlButtonsAlpha(f);
            unit = Unit.INSTANCE;
            int i3 = 99 / 0;
        } else {
            benefitPremiumAdCarouselItemView.setControlButtonsAlpha(f);
            unit = Unit.INSTANCE;
        }
        int i4 = IPostMessageService_Parcel + 3;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView, float f) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 19;
        ITrustedWebActivityCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            benefitPremiumAdCarouselItemView.setControlButtonsAlpha(f);
            return Unit.INSTANCE;
        }
        benefitPremiumAdCarouselItemView.setControlButtonsAlpha(f);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object newSession(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        Integer num = (Integer) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            int i2 = IPostMessageService_Parcel;
            int i3 = i2 + 5;
            ITrustedWebActivityCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            num = null;
        }
        benefitPremiumAdCollapsedView.onExtraCallback(num, (iIntValue & 2) == 0 ? zBooleanValue : false);
        return null;
    }

    private final void onExtraCallback(Integer num, boolean z) {
        int i = 2 % 2;
        this.access100.asInterface.removeAllViews();
        if (this.onMinimized.size() > 1) {
            int i2 = 0;
            for (Object obj : this.onMinimized) {
                if (i2 < 0) {
                    int i3 = IPostMessageService_Parcel + 17;
                    ITrustedWebActivityCallbackStub = i3 % 128;
                    int i4 = i3 % 2;
                    CollectionsKt.throwIndexOverflow();
                    int i5 = IPostMessageService_Parcel + 55;
                    ITrustedWebActivityCallbackStub = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 5 % 5;
                    }
                }
                FrameLayout frameLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, num, z);
                LinearLayout linearLayout = this.access100.asInterface;
                Object[] objArr = {this, Integer.valueOf(i2), num, Boolean.valueOf(z)};
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iIntValue = ((Integer) onExtraCallback(objArr, -1925791770, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1925791788)).intValue();
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iIntValue, varyMatches.onNavigationEvent(4, displayMetrics));
                DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                layoutParams.setMarginStart(varyMatches.onNavigationEvent(2, displayMetrics2));
                DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                layoutParams.setMarginEnd(varyMatches.onNavigationEvent(2, displayMetrics3));
                Unit unit = Unit.INSTANCE;
                linearLayout.addView(frameLayoutOnExtraCallbackWithResult, layoutParams);
                i2++;
            }
            if (z && num != null) {
                IAuthTabCallback(num.intValue(), this.onGreatestScrollPercentageIncreased);
            }
        }
        int i7 = IPostMessageService_Parcel + 65;
        ITrustedWebActivityCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    private final FrameLayout onExtraCallbackWithResult(int i, Integer num, boolean z) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 7;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z2 = i == this.onGreatestScrollPercentageIncreased;
        int iIntValue = ((Integer) onExtraCallback(new Object[]{this, Integer.valueOf(i), num, Boolean.valueOf(z)}, -1925791770, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1925791788)).intValue();
        FrameLayout frameLayout = new FrameLayout(getContext());
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        frameLayout.setBackground(onExtraCallbackWithResult(new getUrlokhttp(new ICustomTabsCallback(configuration)).isEngagementSignalsApiAvailable()));
        frameLayout.setClipToOutline(true);
        if (z2) {
            View view = new View(frameLayout.getContext());
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            view.setBackground(new ColorDrawable(new getUrlokhttp(new writeTypedObject(configuration2)).newSession()));
            int iCoerceIn = RangesKt.coerceIn(getBacktraceNoteBytes.onExtraCallback(iIntValue * receiveFile()), 0, iIntValue);
            DisplayMetrics displayMetrics = frameLayout.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            frameLayout.addView(view, new FrameLayout.LayoutParams(iCoerceIn, varyMatches.onNavigationEvent(4, displayMetrics)));
            int i4 = IPostMessageService_Parcel + 119;
            ITrustedWebActivityCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        Integer num = (Integer) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        DisplayMetrics displayMetrics = benefitPremiumAdCollapsedView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(48, displayMetrics);
        DisplayMetrics displayMetrics2 = benefitPremiumAdCollapsedView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(4, displayMetrics2);
        if (zBooleanValue) {
            int i2 = ITrustedWebActivityCallbackStub + 91;
            int i3 = i2 % 128;
            IPostMessageService_Parcel = i3;
            int i4 = i2 % 2;
            if (num != null) {
                int i5 = i3 + 117;
                ITrustedWebActivityCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 22 / 0;
                    if (iIntValue != num.intValue()) {
                        if ((zBooleanValue && iIntValue == benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased) || iIntValue != benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased) {
                            return Integer.valueOf(iOnNavigationEvent2);
                        }
                    }
                } else if (iIntValue != num.intValue()) {
                }
            }
        }
        int i7 = IPostMessageService_Parcel + 53;
        ITrustedWebActivityCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.valueOf(iOnNavigationEvent);
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    private final void IAuthTabCallback(int i, int i2) {
        ?? r1;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        int i5 = IPostMessageService_Parcel + 101;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        View childAt = this.access100.asInterface.getChildAt(i);
        View childAt2 = this.access100.asInterface.getChildAt(i2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(48, displayMetrics);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(4, displayMetrics2);
        if (childAt != null) {
            obj = null;
            i3 = 1;
            isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{childAt, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1115090779, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Integer.valueOf(iOnNavigationEvent), Integer.valueOf(iOnNavigationEvent2), null, 4, null}, -1115090763, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
            int i7 = IPostMessageService_Parcel + 65;
            ITrustedWebActivityCallbackStub = i7 % 128;
            r1 = false;
            if (i7 % 2 != 0) {
                int i8 = 5 % 4;
                r1 = false;
            }
        } else {
            r1 = 0;
            obj = null;
            i3 = 1;
        }
        if (childAt2 != null) {
            int i9 = IPostMessageService_Parcel + 119;
            ITrustedWebActivityCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{childAt2, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1115090779, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(iOnNavigationEvent), null, 4, null}, -1115090763, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Integer.valueOf((int) r1), null, Integer.valueOf((int) r1), null, null, null, Integer.valueOf((int) r1), 0L, Boolean.valueOf((boolean) r1), 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (boolean) r1, i3, obj);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float receiveFile() throws NoWhenBranchMatchedException {
        getBatteryInfo.IAuthTabCallback iAuthTabCallbackAsInterface;
        int i = 2 % 2;
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(this.onMinimized, this.onGreatestScrollPercentageIncreased);
        if (onextracallbackwithresult != null) {
            int i2 = ITrustedWebActivityCallbackStub + 117;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            getBatteryInfo.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
            if (onwarmupcompletedOnNavigationEvent != null) {
                iAuthTabCallbackAsInterface = onwarmupcompletedOnNavigationEvent.asInterface();
            } else {
                int i4 = IPostMessageService_Parcel + 79;
                ITrustedWebActivityCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                iAuthTabCallbackAsInterface = null;
            }
        }
        int i6 = iAuthTabCallbackAsInterface == null ? -1 : IAuthTabCallback.onNavigationEvent[iAuthTabCallbackAsInterface.ordinal()];
        if (i6 != -1 && i6 != 1) {
            int i7 = IPostMessageService_Parcel + 99;
            ITrustedWebActivityCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return RangesKt.coerceIn(this.IPostMessageServiceStub, 0.0f, 1.0f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final float asInterface(int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(this.onMinimized, i);
        getBatteryInfo.IAuthTabCallback iAuthTabCallbackAsInterface = null;
        if (onextracallbackwithresult != null) {
            int i4 = ITrustedWebActivityCallbackStub + 79;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                onextracallbackwithresult.onNavigationEvent();
                throw null;
            }
            getBatteryInfo.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
            if (onwarmupcompletedOnNavigationEvent != null) {
                iAuthTabCallbackAsInterface = onwarmupcompletedOnNavigationEvent.asInterface();
            }
        }
        if (iAuthTabCallbackAsInterface == null) {
            int i5 = IPostMessageService_Parcel + 19;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            i2 = -1;
        } else {
            i2 = IAuthTabCallback.onNavigationEvent[iAuthTabCallbackAsInterface.ordinal()];
        }
        if (i2 == -1 || i2 == 1 || i2 == 2) {
            return 0.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[PHI: r1
      0x0035: PHI (r1v9 o.getBatteryInfo$onExtraCallbackWithResult) = (r1v8 o.getBatteryInfo$onExtraCallbackWithResult), (r1v19 o.getBatteryInfo$onExtraCallbackWithResult) binds: [B:12:0x0033, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean prefetchWithMultipleUrls() {
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult;
        getBatteryInfo.IAuthTabCallback iAuthTabCallbackAsInterface;
        int i = 2 % 2;
        if (!this.newSession || !ICustomTabsCallbackStub()) {
            return false;
        }
        int i2 = ITrustedWebActivityCallbackStub + 45;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(this.onMinimized, this.onGreatestScrollPercentageIncreased);
            int i3 = 81 / 0;
            if (onextracallbackwithresult != null) {
                getBatteryInfo.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
                iAuthTabCallbackAsInterface = onwarmupcompletedOnNavigationEvent != null ? onwarmupcompletedOnNavigationEvent.asInterface() : null;
            }
        } else {
            onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(this.onMinimized, this.onGreatestScrollPercentageIncreased);
            if (onextracallbackwithresult != null) {
            }
        }
        if (iAuthTabCallbackAsInterface != getBatteryInfo.IAuthTabCallback.IMAGE) {
            return false;
        }
        int i4 = ITrustedWebActivityCallbackStub + 61;
        IPostMessageService_Parcel = i4 % 128;
        return i4 % 2 != 0;
    }

    private final long onActivityLayout() {
        getBatteryInfo.onWarmupCompleted onwarmupcompletedOnNavigationEvent;
        int i = 2 % 2;
        getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult = (getBatteryInfo.onExtraCallbackWithResult) CollectionsKt.getOrNull(this.onMinimized, this.onGreatestScrollPercentageIncreased);
        if (onextracallbackwithresult != null && (onwarmupcompletedOnNavigationEvent = onextracallbackwithresult.onNavigationEvent()) != null) {
            int i2 = IPostMessageService_Parcel + 87;
            ITrustedWebActivityCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                onwarmupcompletedOnNavigationEvent.onExtraCallbackWithResult();
                l.hashCode();
                throw null;
            }
            Long lOnExtraCallbackWithResult = onwarmupcompletedOnNavigationEvent.onExtraCallbackWithResult();
            if (lOnExtraCallbackWithResult != null) {
                int i3 = IPostMessageService_Parcel + 51;
                ITrustedWebActivityCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                l = lOnExtraCallbackWithResult.longValue() > 0 ? lOnExtraCallbackWithResult : null;
                if (l != null) {
                    return l.longValue();
                }
            }
        }
        int i5 = ITrustedWebActivityCallbackStub + 1;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return 5000L;
    }

    private final void access200() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 43;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (prefetchWithMultipleUrls()) {
            int i4 = IPostMessageService_Parcel + 83;
            ITrustedWebActivityCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            ICustomTabsServiceDefault();
            return;
        }
        updateVisuals();
    }

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        Integer num = this.ICustomTabsCallback;
        int i2 = this.onGreatestScrollPercentageIncreased;
        if (num == null || num.intValue() != i2) {
            this.ICustomTabsCallback = Integer.valueOf(this.onGreatestScrollPercentageIncreased);
            getPackageType getpackagetype = this.extraCallback;
            if (getpackagetype != null) {
                int i3 = ITrustedWebActivityCallbackStub + 61;
                IPostMessageService_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
            }
            this.readTypedObject = SystemClock.elapsedRealtime() - ((long) (this.IPostMessageServiceStub * onActivityLayout()));
            onExtraCallback(new Object[]{this}, -996479963, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 996480003);
            this.extraCallback = maybeUpdateAnimatable.onNavigationEvent(this.onActivityLayout, (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallbackDefault(null), 3, (Object) null);
            return;
        }
        int i4 = ITrustedWebActivityCallbackStub + 89;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class ICustomTabsCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        ICustomTabsCallbackDefault(access13800<? super ICustomTabsCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackDefault iCustomTabsCallbackDefault = BenefitPremiumAdCollapsedView.this.new ICustomTabsCallbackDefault(access13800Var);
            iCustomTabsCallbackDefault.L$0 = obj;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ICustomTabsCallbackDefault iCustomTabsCallbackDefaultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iCustomTabsCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            iCustomTabsCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 27;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.onNavigationEvent(obj);
            while (findRes.onWarmupCompleted(findresandmsg)) {
                int i5 = onExtraCallback + 63;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 67 / 0;
                    if (!BenefitPremiumAdCollapsedView.ICustomTabsCallbackDefault(BenefitPremiumAdCollapsedView.this)) {
                        BenefitPremiumAdCollapsedView.ICustomTabsCallback_Parcel(BenefitPremiumAdCollapsedView.this);
                        return Unit.INSTANCE;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - BenefitPremiumAdCollapsedView.onActivityLayout(BenefitPremiumAdCollapsedView.this);
                    BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = BenefitPremiumAdCollapsedView.this;
                    int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                    BenefitPremiumAdCollapsedView.IAuthTabCallbackStubProxy(benefitPremiumAdCollapsedView, RangesKt.coerceIn(jElapsedRealtime / ((Long) BenefitPremiumAdCollapsedView.onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 1938569155, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1938569127)).longValue(), 0.0f, 1.0f));
                    BenefitPremiumAdCollapsedView.onExtraCallback(new Object[]{BenefitPremiumAdCollapsedView.this}, 767271920, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -767271893);
                    if (BenefitPremiumAdCollapsedView.onPostMessage(BenefitPremiumAdCollapsedView.this) < 1.0f) {
                        int i7 = onWarmupCompleted + 17;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        BenefitPremiumAdCollapsedView.this.access100();
                        return Unit.INSTANCE;
                    }
                    this.L$0 = findresandmsg;
                    this.J$0 = jElapsedRealtime;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(100L, this) == objOnWarmupCompleted) {
                        int i9 = onWarmupCompleted + 15;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (!BenefitPremiumAdCollapsedView.ICustomTabsCallbackDefault(BenefitPremiumAdCollapsedView.this)) {
                        BenefitPremiumAdCollapsedView.ICustomTabsCallback_Parcel(BenefitPremiumAdCollapsedView.this);
                        return Unit.INSTANCE;
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - BenefitPremiumAdCollapsedView.onActivityLayout(BenefitPremiumAdCollapsedView.this);
                    BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView2 = BenefitPremiumAdCollapsedView.this;
                    int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                    BenefitPremiumAdCollapsedView.IAuthTabCallbackStubProxy(benefitPremiumAdCollapsedView2, RangesKt.coerceIn(jElapsedRealtime2 / ((Long) BenefitPremiumAdCollapsedView.onExtraCallback(new Object[]{benefitPremiumAdCollapsedView2}, 1938569155, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1938569127)).longValue(), 0.0f, 1.0f));
                    BenefitPremiumAdCollapsedView.onExtraCallback(new Object[]{BenefitPremiumAdCollapsedView.this}, 767271920, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -767271893);
                    if (BenefitPremiumAdCollapsedView.onPostMessage(BenefitPremiumAdCollapsedView.this) < 1.0f) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 21;
        ITrustedWebActivityCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getPackageType getpackagetype = this.extraCallback;
            if (getpackagetype != null) {
                int i4 = i2 + 123;
                ITrustedWebActivityCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
            }
            this.extraCallback = null;
            this.ICustomTabsCallback = null;
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final GradientDrawable onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        gradientDrawable.setCornerRadius(varyMatches.onNavigationEvent(4, r2));
        gradientDrawable.setColor(i);
        int i3 = ITrustedWebActivityCallbackStub + 113;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return gradientDrawable;
    }

    private final boolean ICustomTabsCallbackStub() {
        int i = 2 % 2;
        if (this.requestPostMessageChannelWithExtras && this.onMinimized.size() > 1) {
            int i2 = IPostMessageService_Parcel + 69;
            ITrustedWebActivityCallbackStub = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = ITrustedWebActivityCallbackStub + 45;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private final boolean setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 107;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.onMinimized.size() <= 1) {
                return false;
            }
        } else if (this.onMinimized.size() <= 1) {
            return false;
        }
        int i3 = ITrustedWebActivityCallbackStub + 31;
        IPostMessageService_Parcel = i3 % 128;
        return i3 % 2 != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        r5 = im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.IPostMessageService_Parcel + 37;
        im.toss.features.benefit.ui.premium.BenefitPremiumAdCollapsedView.ITrustedWebActivityCallbackStub = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if ((r5 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r1 = 82 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r2.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        return r2.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r2.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r5 != 2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        getBatteryInfo.onWarmupCompleted onwarmupcompleted = (getBatteryInfo.onWarmupCompleted) objArr[1];
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 101;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            i = IAuthTabCallback.onNavigationEvent[onwarmupcompleted.asInterface().ordinal()];
        } else {
            i = IAuthTabCallback.onNavigationEvent[onwarmupcompleted.asInterface().ordinal()];
        }
    }

    private final String onExtraCallbackWithResult(getBatteryInfo.onNavigationEvent onnavigationevent, Context context) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 69;
        ITrustedWebActivityCallbackStub = i2 % 128;
        String str = null;
        if (i2 % 2 == 0) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onExtraCallback(configuration)) {
                String strOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult != null) {
                    int i3 = IPostMessageService_Parcel + 13;
                    ITrustedWebActivityCallbackStub = i3 % 128;
                    int i4 = i3 % 2;
                    if (StringsKt.isBlank(strOnExtraCallbackWithResult)) {
                        int i5 = ITrustedWebActivityCallbackStub + 63;
                        IPostMessageService_Parcel = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 5 / 4;
                        }
                    } else {
                        str = strOnExtraCallbackWithResult;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                return onnavigationevent.onExtraCallback();
            }
            return onnavigationevent.onExtraCallback();
        }
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        readIntokhttp.onExtraCallback(configuration2);
        throw null;
    }

    private final int onWarmupCompleted(getBatteryInfo.IAuthTabCallbackDefault iAuthTabCallbackDefault, Context context, int i) {
        String strOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Intrinsics.checkNotNullExpressionValue(resources.getConfiguration(), "");
        if (!(!readIntokhttp.onExtraCallback(r4))) {
            int i3 = ITrustedWebActivityCallbackStub + 115;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            strOnExtraCallbackWithResult = iAuthTabCallbackDefault.onWarmupCompleted();
        } else {
            strOnExtraCallbackWithResult = iAuthTabCallbackDefault.onExtraCallbackWithResult();
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(strOnExtraCallbackWithResult, i);
        int i5 = ITrustedWebActivityCallbackStub + 59;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return iOnExtraCallbackWithResult;
    }

    private final int IAuthTabCallback(getBatteryInfo.IAuthTabCallbackDefault iAuthTabCallbackDefault, Context context) {
        Object obj;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 115;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        String strOnExtraCallbackWithResult = !readIntokhttp.onExtraCallback(configuration) ? iAuthTabCallbackDefault.onExtraCallbackWithResult() : iAuthTabCallbackDefault.onWarmupCompleted();
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Integer.valueOf(Color.parseColor(strOnExtraCallbackWithResult)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return onExtraCallbackWithResult(num.intValue(), 0.4f);
        }
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        int iOnActivityResized = new getUrlokhttp(new extraCallback(configuration2)).onActivityResized();
        int i4 = ITrustedWebActivityCallbackStub + 115;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return iOnActivityResized;
    }

    private final Spanned IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 31;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Spanned spannedIAuthTabCallback = PixelCopyCompatPixelCopyStubExternalSyntheticLambda0.IAuthTabCallback(str, 0);
        Intrinsics.checkNotNullExpressionValue(spannedIAuthTabCallback, "");
        int i4 = IPostMessageService_Parcel + 13;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return spannedIAuthTabCallback;
    }

    private final int onExtraCallbackWithResult(String str, int i) {
        Object objValueOf;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 113;
        IPostMessageService_Parcel = i3 % 128;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            objValueOf = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i3 % 2 == 0) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(Integer.valueOf(Color.parseColor(str)));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        objValueOf = Result.constructor-impl(Integer.valueOf(Color.parseColor(str)));
        if (Result.onExtraCallback(objValueOf)) {
            int i4 = ITrustedWebActivityCallbackStub + 125;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            objValueOf = Integer.valueOf(i);
        }
        int iIntValue = ((Number) objValueOf).intValue();
        int i6 = IPostMessageService_Parcel + 83;
        ITrustedWebActivityCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return iIntValue;
    }

    private final int onExtraCallbackWithResult(int i, float f) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 27;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int iArgb = Color.argb(getBacktraceNoteBytes.onExtraCallback(RangesKt.coerceIn(f, 0.0f, 1.0f) * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        int i5 = ITrustedWebActivityCallbackStub + 103;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return iArgb;
    }

    @Override // o.unRegisterBatteryReceiver
    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 113;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        SafePlayerView safePlayerView = this.access100.onMinimized;
        Intrinsics.checkNotNullExpressionValue(safePlayerView, "");
        safePlayerView.setVisibility(0);
        this.access100.onMinimized.setAlpha(1.0f);
        TdsImageView tdsImageView = this.access100.onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        TdsRoundLayout tdsRoundLayout = this.access100.ICustomTabsCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        tdsRoundLayout.setVisibility(0);
        int i4 = IPostMessageService_Parcel + 7;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.unRegisterBatteryReceiver
    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 79;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        SafePlayerView safePlayerView = this.access100.onMinimized;
        Intrinsics.checkNotNullExpressionValue(safePlayerView, "");
        safePlayerView.setVisibility(8);
        this.access100.onMinimized.setAlpha(0.0f);
        TdsImageView tdsImageView = this.access100.onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        TdsRoundLayout tdsRoundLayout = this.access100.ICustomTabsCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        tdsRoundLayout.setVisibility(0);
        int i4 = IPostMessageService_Parcel + 27;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.unRegisterBatteryReceiver
    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallbackStub + 117;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SafePlayerView safePlayerView = this.access100.onMinimized;
        Intrinsics.checkNotNullExpressionValue(safePlayerView, "");
        safePlayerView.setVisibility(8);
        this.access100.onMinimized.setAlpha(0.0f);
        TdsImageView tdsImageView = this.access100.onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        TdsRoundLayout tdsRoundLayout = this.access100.ICustomTabsCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        tdsRoundLayout.setVisibility(8);
        int i4 = IPostMessageService_Parcel + 115;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034e A[PHI: r2
      0x034e: PHI (r2v17 int) = (r2v16 int), (r2v21 int) binds: [B:137:0x034c, B:134:0x0348] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        Object[] objArr;
        int i;
        Object[] objArr2;
        String strAsInterface;
        Object[] objArr3;
        String str;
        Size sizeOnExtraCallback;
        int i2;
        String str2;
        ViewGroup.LayoutParams layoutParams;
        int iOnNavigationEvent;
        boolean z;
        boolean z2;
        int i3;
        String str3;
        int iOnNavigationEvent2;
        int i4;
        boolean z3;
        String strIAuthTabCallback;
        int i5 = 2 % 2;
        getBatteryInfo.onExtraCallback onextracallback = (getBatteryInfo.onExtraCallback) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -780876855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        int[] iArr = IAuthTabCallback.onExtraCallbackWithResult;
        int i6 = iArr[onextracallback.ordinal()];
        if (i6 == 1 || i6 == 2) {
            if (!StringsKt.isBlank(onextracallbackwithresult.access000().onExtraCallback())) {
                objArr = true;
            }
            i = iArr[((getBatteryInfo.onExtraCallback) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -780876855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent())).ordinal()];
            if (i == 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (StringsKt.isBlank(onextracallbackwithresult.extraCallbackWithResult())) {
                            String strIAuthTabCallback2 = onextracallbackwithresult.IAuthTabCallback();
                            if (strIAuthTabCallback2 != null) {
                                int i7 = ITrustedWebActivityCallbackStub + 55;
                                IPostMessageService_Parcel = i7 % 128;
                                int i8 = i7 % 2;
                                if (StringsKt.isBlank(strIAuthTabCallback2)) {
                                }
                            }
                        }
                    } else if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                objArr2 = !StringsKt.isBlank(onextracallbackwithresult.extraCallbackWithResult());
            }
            strAsInterface = onextracallbackwithresult.asInterface();
            if (strAsInterface == null) {
                int i9 = IPostMessageService_Parcel + 57;
                ITrustedWebActivityCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                if (!(!StringsKt.isBlank(strAsInterface))) {
                    strAsInterface = null;
                }
            }
            if (((getBatteryInfo.onExtraCallback) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -780876855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent())) == getBatteryInfo.onExtraCallback.NONE) {
                int i11 = IPostMessageService_Parcel + 107;
                ITrustedWebActivityCallbackStub = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 89 / 0;
                    objArr3 = strAsInterface != null;
                } else if (strAsInterface != null) {
                }
            }
            if (objArr == true) {
                str = "";
                sizeOnExtraCallback = null;
            } else {
                getBatteryInfo.onNavigationEvent onnavigationeventAccess000 = onextracallbackwithresult.access000();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                str = "";
                sizeOnExtraCallback = BasicSystemInfoExtension5.onExtraCallback(onnavigationeventAccess000, resources, (getBatteryInfo.onExtraCallback) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -780876855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent()));
                int i13 = IPostMessageService_Parcel + 53;
                ITrustedWebActivityCallbackStub = i13 % 128;
                int i14 = i13 % 2;
            }
            boolean z4 = !objArr2 == true || objArr3 == true;
            Integer numValueOf = sizeOnExtraCallback == null ? Integer.valueOf(sizeOnExtraCallback.getHeight()) : null;
            if (objArr3 != false) {
                numValueOf = null;
            }
            IAuthTabCallback(onextracallbackwithresult, z4, numValueOf);
            TdsImageView tdsImageView = this.access100.onActivityResized;
            Intrinsics.checkNotNull(tdsImageView);
            if (objArr == true) {
                i2 = 8;
            } else {
                int i15 = IPostMessageService_Parcel + 125;
                ITrustedWebActivityCallbackStub = i15 % 128;
                int i16 = i15 % 2;
                i2 = 0;
            }
            tdsImageView.setVisibility(i2);
            tdsImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            tdsImageView.setImageTintList((ColorStateList) null);
            if (objArr == true) {
                str2 = str;
                TdsImageView.setImage$default(tdsImageView, (String) null, (Function1) null, (Function1) null, 6, (Object) null);
            } else {
                TdsImageView.setImage$default(tdsImageView, (String) null, (Function1) null, (Function1) null, 6, (Object) null);
                getBatteryInfo.onNavigationEvent onnavigationeventAccess0002 = onextracallbackwithresult.access000();
                Context context = tdsImageView.getContext();
                str2 = str;
                Intrinsics.checkNotNullExpressionValue(context, str2);
                GetBatteryInfoBridgeExtension2.IAuthTabCallback(tdsImageView, onExtraCallbackWithResult(onnavigationeventAccess0002, context));
                if (sizeOnExtraCallback != null) {
                    ViewGroup.LayoutParams layoutParams2 = tdsImageView.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.width = RangesKt.coerceAtLeast(sizeOnExtraCallback.getWidth(), 1);
                    layoutParams3.height = RangesKt.coerceAtLeast(sizeOnExtraCallback.getHeight(), 1);
                    tdsImageView.setLayoutParams(layoutParams3);
                }
            }
            LinearLayout linearLayout = this.access100.access100;
            Intrinsics.checkNotNullExpressionValue(linearLayout, str2);
            linearLayout.setVisibility((!objArr == true || objArr2 == true || objArr3 == true) ? 0 : 8);
            Typography4 typography4 = this.access100.ICustomTabsCallback_Parcel;
            typography4.setText(onextracallbackwithresult.extraCallbackWithResult());
            Intrinsics.checkNotNull(typography4);
            typography4.setVisibility((objArr2 == true || StringsKt.isBlank(onextracallbackwithresult.extraCallbackWithResult())) ? 8 : 0);
            typography4.onNavigationEvent(response.Bold);
            typography4.setLineSpacing(0.0f, 1.0f);
            layoutParams = typography4.getLayoutParams();
            if (layoutParams != null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams;
            if (objArr == true && typography4.getVisibility() == 0) {
                int i17 = ITrustedWebActivityCallbackStub + 107;
                IPostMessageService_Parcel = i17 % 128;
                int i18 = i17 % 2;
                DisplayMetrics displayMetrics = typography4.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, str2);
                iOnNavigationEvent = varyMatches.onNavigationEvent(6, displayMetrics);
            } else {
                iOnNavigationEvent = 0;
            }
            layoutParams4.topMargin = iOnNavigationEvent;
            typography4.setLayoutParams(layoutParams4);
            Typography6 typography6 = this.access100.getInterfaceDescriptor;
            String strIAuthTabCallback3 = onextracallbackwithresult.IAuthTabCallback();
            if (strIAuthTabCallback3 == null) {
                int i19 = ITrustedWebActivityCallbackStub + 83;
                IPostMessageService_Parcel = i19 % 128;
                int i20 = i19 % 2;
                strIAuthTabCallback3 = str2;
            }
            typography6.setText(strIAuthTabCallback3);
            Intrinsics.checkNotNull(typography6);
            String str4 = str2;
            if (((getBatteryInfo.onExtraCallback) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -780876855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent())) != getBatteryInfo.onExtraCallback.TITLE_ONLY || !objArr2 == true || (strIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback()) == null || StringsKt.isBlank(strIAuthTabCallback)) {
                z = true;
                z2 = false;
            } else {
                int i21 = ITrustedWebActivityCallbackStub + 17;
                IPostMessageService_Parcel = i21 % 128;
                int i22 = i21 % 2;
                z = true;
                z2 = true;
            }
            if ((!z2) != z) {
                int i23 = ITrustedWebActivityCallbackStub + 5;
                IPostMessageService_Parcel = i23 % 128;
                int i24 = i23 % 2;
                i3 = 0;
            } else {
                i3 = 8;
            }
            typography6.setVisibility(i3);
            typography6.onNavigationEvent(response.Regular);
            typography6.setLineSpacing(0.0f, 1.0f);
            Typography7 typography7 = this.access100.onWarmupCompleted;
            typography7.setText(strAsInterface != null ? IAuthTabCallback(strAsInterface) : null);
            Intrinsics.checkNotNull(typography7);
            typography7.setVisibility(objArr3 != false ? 0 : 8);
            typography7.setLineSpacing(0.0f, 1.0f);
            ViewGroup.LayoutParams layoutParams5 = typography7.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
            if (objArr2 == true) {
                DisplayMetrics displayMetrics2 = typography7.getResources().getDisplayMetrics();
                str3 = str4;
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, str3);
                iOnNavigationEvent2 = varyMatches.onNavigationEvent(6, displayMetrics2);
            } else {
                str3 = str4;
                if (objArr == true) {
                    DisplayMetrics displayMetrics3 = typography7.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics3, str3);
                    iOnNavigationEvent2 = varyMatches.onNavigationEvent(8, displayMetrics3);
                } else {
                    iOnNavigationEvent2 = 0;
                }
            }
            layoutParams6.topMargin = iOnNavigationEvent2;
            typography7.setLayoutParams(layoutParams6);
            if (objArr != true) {
                int i25 = IPostMessageService_Parcel + 31;
                ITrustedWebActivityCallbackStub = i25 % 128;
                if (i25 % 2 != 0) {
                    i4 = 0;
                    i4 = 0;
                    int i26 = 76 / 0;
                    if (objArr2 == false) {
                        if (objArr3 == false) {
                            z3 = i4 == true ? 1 : 0;
                        }
                    }
                } else {
                    i4 = 0;
                    i4 = 0;
                    if (objArr2 == false) {
                    }
                }
                this.newSessionWithExtras = z3;
                asBinder(onextracallbackwithresult);
                LinearLayout linearLayout2 = this.access100.access100;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, str3);
                linearLayout2.setVisibility(!this.newSessionWithExtras ? i4 == true ? 1 : 0 : 8);
                LinearLayout linearLayout3 = this.access100.writeTypedObject;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, str3);
                if (!this.ICustomTabsService) {
                    i4 = 8;
                }
                linearLayout3.setVisibility(i4);
                onExtraCallbackWithResult(onextracallbackwithresult);
                onWarmupCompleted(this.requestPostMessageChannelWithExtras ? 1.0f : 0.0f);
                return;
            }
            i4 = 0;
            z3 = z;
            this.newSessionWithExtras = z3;
            asBinder(onextracallbackwithresult);
            LinearLayout linearLayout22 = this.access100.access100;
            Intrinsics.checkNotNullExpressionValue(linearLayout22, str3);
            linearLayout22.setVisibility(!this.newSessionWithExtras ? i4 == true ? 1 : 0 : 8);
            LinearLayout linearLayout32 = this.access100.writeTypedObject;
            Intrinsics.checkNotNullExpressionValue(linearLayout32, str3);
            if (!this.ICustomTabsService) {
            }
            linearLayout32.setVisibility(i4);
            onExtraCallbackWithResult(onextracallbackwithresult);
            onWarmupCompleted(this.requestPostMessageChannelWithExtras ? 1.0f : 0.0f);
            return;
        }
        if (i6 != 3 && i6 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        objArr = false;
        i = iArr[((getBatteryInfo.onExtraCallback) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -780876855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent())).ordinal()];
        if (i == 1) {
        }
        strAsInterface = onextracallbackwithresult.asInterface();
        if (strAsInterface == null) {
        }
        if (((getBatteryInfo.onExtraCallback) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -780876855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent())) == getBatteryInfo.onExtraCallback.NONE) {
        }
        if (objArr == true) {
        }
        if (objArr2 == true) {
        }
        if (sizeOnExtraCallback == null) {
        }
        if (objArr3 != false) {
        }
        IAuthTabCallback(onextracallbackwithresult, z4, numValueOf);
        TdsImageView tdsImageView2 = this.access100.onActivityResized;
        Intrinsics.checkNotNull(tdsImageView2);
        if (objArr == true) {
        }
        tdsImageView2.setVisibility(i2);
        tdsImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tdsImageView2.setImageTintList((ColorStateList) null);
        if (objArr == true) {
        }
        LinearLayout linearLayout4 = this.access100.access100;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, str2);
        linearLayout4.setVisibility((!objArr == true || objArr2 == true || objArr3 == true) ? 0 : 8);
        Typography4 typography42 = this.access100.ICustomTabsCallback_Parcel;
        typography42.setText(onextracallbackwithresult.extraCallbackWithResult());
        Intrinsics.checkNotNull(typography42);
        typography42.setVisibility((objArr2 == true || StringsKt.isBlank(onextracallbackwithresult.extraCallbackWithResult())) ? 8 : 0);
        typography42.onNavigationEvent(response.Bold);
        typography42.setLineSpacing(0.0f, 1.0f);
        layoutParams = typography42.getLayoutParams();
        if (layoutParams != null) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult, boolean z, Integer num) throws NoWhenBranchMatchedException {
        int i;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        if (!z) {
            int i3 = IPostMessageService_Parcel + 101;
            ITrustedWebActivityCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            if (((getBatteryInfo.onExtraCallback) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -780876855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent())) == getBatteryInfo.onExtraCallback.LOGO_ONLY) {
                int i5 = IAuthTabCallback.onExtraCallback[BasicSystemInfoExtension5.onExtraCallbackWithResult(onextracallbackwithresult.access000()).ordinal()];
                if (i5 == 1) {
                    i = 24;
                } else if (i5 == 2) {
                    int i6 = ITrustedWebActivityCallbackStub + 79;
                    IPostMessageService_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    i = 28;
                } else if (i5 == 3) {
                    i = 38;
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i8 = ITrustedWebActivityCallbackStub + 5;
                    IPostMessageService_Parcel = i8 % 128;
                    i = i8 % 2 == 0 ? 49 : 43;
                }
            } else {
                i = 20;
            }
        }
        if (this.isEngagementSignalsApiAvailable) {
            i -= 10;
        }
        if (((getBatteryInfo.onExtraCallback) getBatteryInfo.onExtraCallbackWithResult.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{onextracallbackwithresult}, -780876855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent())) == getBatteryInfo.onExtraCallback.LOGO_ONLY) {
            int i9 = IPostMessageService_Parcel + 91;
            ITrustedWebActivityCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            if (num != null) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iCoerceAtLeast = RangesKt.coerceAtLeast(varyMatches.onNavigationEvent(56, displayMetrics) - num.intValue(), 0) / 2;
                DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics2) - iCoerceAtLeast;
            } else {
                DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics3);
            }
        }
        FrameLayout frameLayout = this.access100.onTransact;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = RangesKt.coerceAtLeast(iOnNavigationEvent, 0);
        frameLayout.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4 A[PHI: r2
      0x00f4: PHI (r2v21 java.lang.Integer) = (r2v20 java.lang.Integer), (r2v45 java.lang.Integer) binds: [B:12:0x00f2, B:9:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(int i, int i2) {
        Integer num;
        int iIntValue;
        int iOnNavigationEvent;
        int i3;
        int i4 = 2 % 2;
        int i5 = ITrustedWebActivityCallbackStub + 101;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        FrameLayout frameLayout = this.access100.ICustomTabsCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(0);
        BenefitPremiumGradientOverlayView benefitPremiumGradientOverlayView = this.access100.onMessageChannelReady;
        Intrinsics.checkNotNullExpressionValue(benefitPremiumGradientOverlayView, "");
        benefitPremiumGradientOverlayView.setVisibility(0);
        View view = this.access100.ICustomTabsService;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        ViewPager2 viewPager2 = this.access100.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        viewPager2.setVisibility(8);
        LinearLayout linearLayout = this.access100.asInterface;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        onExtraCallback(new Object[]{this}, -1313563103, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1313563128);
        onNavigationEvent(false, 0, i2, prefetch());
        View view2 = this.access100.onRelationshipValidationResult;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(0);
        FrameLayout frameLayout2 = this.access100.ICustomTabsCallbackStub;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setVisibility(0);
        FrameLayout frameLayout3 = this.access100.ICustomTabsCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
        ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        int i7 = ITrustedWebActivityCallbackStub + 45;
        IPostMessageService_Parcel = i7 % 128;
        int i8 = i7 % 2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = i;
        layoutParams2.height = i2;
        layoutParams2.gravity = 49;
        layoutParams2.topMargin = prefetch();
        frameLayout3.setLayoutParams(layoutParams2);
        ICustomTabsCallback();
        FrameLayout frameLayout4 = this.access100.ICustomTabsCallbackStub;
        Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
        ViewGroup.LayoutParams layoutParams3 = frameLayout4.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        int i9 = ITrustedWebActivityCallbackStub + 5;
        IPostMessageService_Parcel = i9 % 128;
        if (i9 % 2 == 0) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.width = i;
            layoutParams4.height = i2;
            layoutParams4.gravity = 62;
            layoutParams4.topMargin = prefetch();
            frameLayout4.setLayoutParams(layoutParams4);
            num = this.IAuthTabCallbackDefault;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                iIntValue = varyMatches.onNavigationEvent(22, displayMetrics);
            }
        } else {
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams5.width = i;
            layoutParams5.height = i2;
            layoutParams5.gravity = 49;
            layoutParams5.topMargin = prefetch();
            frameLayout4.setLayoutParams(layoutParams5);
            num = this.IAuthTabCallbackDefault;
            if (num != null) {
            }
        }
        Integer num2 = this.asBinder;
        if (num2 != null) {
            iOnNavigationEvent = num2.intValue();
        } else {
            DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(22, displayMetrics2);
        }
        onWarmupCompleted(iIntValue, iOnNavigationEvent);
        View view3 = this.access100.onRelationshipValidationResult;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        ViewGroup.LayoutParams layoutParams6 = view3.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        int i10 = IPostMessageService_Parcel + 61;
        ITrustedWebActivityCallbackStub = i10 % 128;
        int i11 = i10 % 2;
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
        layoutParams7.width = i;
        layoutParams7.height = i2;
        layoutParams7.gravity = 49;
        layoutParams7.topMargin = prefetch();
        view3.setLayoutParams(layoutParams7);
        FrameLayout frameLayout5 = this.access100.onTransact;
        Intrinsics.checkNotNullExpressionValue(frameLayout5, "");
        ViewGroup.LayoutParams layoutParams8 = frameLayout5.getLayoutParams();
        if (layoutParams8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams8;
        layoutParams9.width = i;
        layoutParams9.height = -2;
        layoutParams9.gravity = 81;
        layoutParams9.topMargin = 0;
        frameLayout5.setLayoutParams(layoutParams9);
        if (this.requestPostMessageChannelWithExtras) {
            int i12 = ITrustedWebActivityCallbackStub + 119;
            IPostMessageService_Parcel = i12 % 128;
            i3 = (int) (i12 % 2 == 0 ? i2 % 0.33f : i2 * 0.33f);
        } else {
            i3 = i2 / 2;
        }
        int iCoerceIn = RangesKt.coerceIn(i3, 0, i2);
        BenefitPremiumGradientOverlayView benefitPremiumGradientOverlayView2 = this.access100.onMessageChannelReady;
        Intrinsics.checkNotNullExpressionValue(benefitPremiumGradientOverlayView2, "");
        ViewGroup.LayoutParams layoutParams10 = benefitPremiumGradientOverlayView2.getLayoutParams();
        if (layoutParams10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        int i13 = ITrustedWebActivityCallbackStub + 83;
        IPostMessageService_Parcel = i13 % 128;
        int i14 = i13 % 2;
        FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) layoutParams10;
        layoutParams11.width = i;
        layoutParams11.height = iCoerceIn;
        layoutParams11.gravity = 49;
        layoutParams11.topMargin = (prefetch() + i2) - iCoerceIn;
        benefitPremiumGradientOverlayView2.setLayoutParams(layoutParams11);
        this.access100.onMessageChannelReady.setAlpha(newSession());
        this.access100.onMessageChannelReady.setStageWidth(i);
        this.access100.onMessageChannelReady.setGradientBaseColor(Integer.valueOf(newAuthTabSession()));
        this.access100.onMessageChannelReady.setGradientArea(0, iCoerceIn);
        DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iCoerceAtMost = RangesKt.coerceAtMost(varyMatches.onNavigationEvent(2, displayMetrics3), i2);
        View view4 = this.access100.ICustomTabsService;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        ViewGroup.LayoutParams layoutParams12 = view4.getLayoutParams();
        if (layoutParams12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) layoutParams12;
        layoutParams13.width = i;
        layoutParams13.height = iCoerceAtMost;
        layoutParams13.gravity = 49;
        layoutParams13.topMargin = (prefetch() + i2) - iCoerceAtMost;
        view4.setLayoutParams(layoutParams13);
        this.access100.ICustomTabsService.setAlpha(newSession());
        this.access100.ICustomTabsService.setBackgroundColor(newAuthTabSession());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int iOnNavigationEvent;
        float fFloatValue;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        String str;
        int i8;
        int iOnNavigationEvent2;
        int i9;
        int i10;
        int i11 = 2 % 2;
        int iICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        int iExtraCommand = extraCommand();
        boolean z4 = this.requestPostMessageChannelWithExtras;
        Object obj = null;
        if (!z4) {
            int i12 = IPostMessageService_Parcel + 83;
            ITrustedWebActivityCallbackStub = i12 % 128;
            if (i12 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            z = this.requestPostMessageChannel;
        }
        if (this.requestPostMessageChannel) {
            z4 = false;
        }
        boolean engagementSignalsCallback = setEngagementSignalsCallback();
        Float f = this.IAuthTabCallback_Parcel;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            if (z) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(28, displayMetrics);
            } else {
                DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(0, displayMetrics2);
            }
            fFloatValue = iOnNavigationEvent;
        }
        float f2 = fFloatValue;
        this.writeTypedObject = i3;
        FrameLayout frameLayout = this.access100.ICustomTabsCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(!engagementSignalsCallback ? 0 : 8);
        BenefitPremiumGradientOverlayView benefitPremiumGradientOverlayView = this.access100.onMessageChannelReady;
        Intrinsics.checkNotNullExpressionValue(benefitPremiumGradientOverlayView, "");
        benefitPremiumGradientOverlayView.setVisibility(!engagementSignalsCallback ? 0 : 8);
        View view = this.access100.ICustomTabsService;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(!engagementSignalsCallback ? 0 : 8);
        View view2 = this.access100.onRelationshipValidationResult;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        if (!engagementSignalsCallback) {
            int i13 = ITrustedWebActivityCallbackStub;
            int i14 = i13 + 105;
            IPostMessageService_Parcel = i14 % 128;
            int i15 = i14 % 2;
            if (!z) {
                int i16 = i13 + 33;
                IPostMessageService_Parcel = i16 % 128;
                int i17 = i16 % 2;
                i6 = 0;
            } else {
                i6 = 8;
            }
        }
        view2.setVisibility(i6);
        ViewPager2 viewPager2 = this.access100.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        viewPager2.setVisibility(engagementSignalsCallback ? 0 : 8);
        LinearLayout linearLayout = this.access100.asInterface;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility((this.onMinimized.size() <= 1 || !(z || this.requestPostMessageChannel)) ? 8 : 0);
        FrameLayout frameLayout2 = this.access100.ICustomTabsCallbackStub;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setVisibility(!engagementSignalsCallback ? 0 : 8);
        boolean z5 = !z;
        setClipChildren(z5);
        setClipToPadding(z5);
        if (engagementSignalsCallback) {
            i7 = iExtraCommand;
        } else {
            FrameLayout frameLayout3 = this.access100.ICustomTabsCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
            ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            int i18 = ITrustedWebActivityCallbackStub + 77;
            i7 = iExtraCommand;
            IPostMessageService_Parcel = i18 % 128;
            int i19 = i18 % 2;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = i2;
            layoutParams2.height = i3;
            layoutParams2.gravity = 49;
            layoutParams2.topMargin = iICustomTabsCallback_Parcel;
            frameLayout3.setLayoutParams(layoutParams2);
            ICustomTabsCallback();
        }
        int i20 = (!z || this.requestPostMessageChannel) ? i2 : -1;
        ViewGroup.LayoutParams layoutParams3 = this.access100.IAuthTabCallbackStub.getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 == null || layoutParams4.width != i20 || layoutParams4.height != i3 || layoutParams4.gravity != 49 || layoutParams4.topMargin != iICustomTabsCallback_Parcel) {
            ViewPager2 viewPager22 = this.access100.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(viewPager22, "");
            ViewGroup.LayoutParams layoutParams5 = viewPager22.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.width = i20;
            layoutParams6.height = i3;
            layoutParams6.gravity = 49;
            layoutParams6.topMargin = iICustomTabsCallback_Parcel;
            viewPager22.setLayoutParams(layoutParams6);
        }
        int iIAuthTabCallbackDefault = (!this.requestPostMessageChannel && z) ? IAuthTabCallbackDefault(i, i2) : 0;
        this.access100.IAuthTabCallbackStub.setUserInputEnabled(z);
        onExtraCallbackWithResult(z);
        this.access100.IAuthTabCallbackStub.setClipChildren(z5);
        this.access100.IAuthTabCallbackStub.setClipToPadding(z5);
        this.access100.IAuthTabCallbackStub.setPadding(0, 0, 0, 0);
        View childAt = this.access100.IAuthTabCallbackStub.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setClipChildren(z5);
            recyclerView.setClipToPadding(z5);
            recyclerView.setPadding(iIAuthTabCallbackDefault, 0, iIAuthTabCallbackDefault, 0);
        }
        if (!z) {
            int i21 = IPostMessageService_Parcel + 125;
            ITrustedWebActivityCallbackStub = i21 % 128;
            if (i21 % 2 != 0) {
                onMinimized();
                int i22 = 34 / 0;
            } else {
                onMinimized();
            }
        }
        int iIAuthTabCallbackDefault2 = z ? IAuthTabCallbackDefault(i, i2) : 0;
        if (!z || this.onMinimized.size() <= 1 || iIAuthTabCallbackDefault2 <= 0 || !onRelationshipValidationResult()) {
            z2 = false;
        } else {
            int i23 = ITrustedWebActivityCallbackStub + 35;
            IPostMessageService_Parcel = i23 % 128;
            int i24 = i23 % 2;
            z2 = true;
        }
        onNavigationEvent(z2, iIAuthTabCallbackDefault2, i3, iICustomTabsCallback_Parcel);
        this.extraCallbackWithResult.onWarmupCompleted(!z4);
        onExtraCallbackWithResult.onExtraCallback(868975645, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -868975644, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this.extraCallbackWithResult, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        float f3 = i7 - iICustomTabsCallback_Parcel;
        boolean z6 = z;
        this.extraCallbackWithResult.IAuthTabCallback(onTransact(i2, i4), onTransact(i3, i5), f3, i4, i5);
        if (recyclerView != null) {
            onNavigationEvent(recyclerView, i2, i3, f2);
        }
        if (recyclerView != null) {
            onNavigationEvent(recyclerView, onTransact(i2, i4), onTransact(i3, i5), f3, i4, i5);
        }
        if (recyclerView != null) {
            onNavigationEvent(recyclerView);
        }
        if (recyclerView != null) {
            onExtraCallback(new Object[]{this, recyclerView}, -1287852533, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1287852555);
        }
        if (z6 && this.requestPostMessageChannel && this.postMessage && !this.newAuthTabSession) {
            newSessionWithExtras();
            z3 = true;
            this.newAuthTabSession = true;
        } else {
            z3 = true;
        }
        if (z6 && (this.requestPostMessageChannel ^ z3) == z3) {
            onExtraCallback(new Object[]{this, Integer.valueOf(i2), Integer.valueOf(i3)}, -617399428, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 617399451);
        } else if (!z6) {
            int i25 = IPostMessageService_Parcel + 63;
            ITrustedWebActivityCallbackStub = i25 % 128;
            int i26 = i25 % 2;
            ICustomTabsCallbackStubProxy();
        }
        if (engagementSignalsCallback) {
            str = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams";
            i8 = iICustomTabsCallback_Parcel;
        } else {
            FrameLayout frameLayout4 = this.access100.ICustomTabsCallbackStub;
            Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
            ViewGroup.LayoutParams layoutParams7 = frameLayout4.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
            layoutParams8.width = i2;
            layoutParams8.height = i3;
            layoutParams8.gravity = 49;
            i8 = iICustomTabsCallback_Parcel;
            layoutParams8.topMargin = i8;
            frameLayout4.setLayoutParams(layoutParams8);
            Integer num = this.IAuthTabCallbackDefault;
            int iIntValue = num != null ? num.intValue() : onWarmupCompleted(z6);
            Integer num2 = this.asBinder;
            onWarmupCompleted(iIntValue, num2 != null ? num2.intValue() : asBinder(z6));
            str = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams";
        }
        LinearLayout linearLayout2 = this.access100.asInterface;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        ViewGroup.LayoutParams layoutParams9 = linearLayout2.getLayoutParams();
        if (layoutParams9 == null) {
            throw new NullPointerException(str);
        }
        FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
        layoutParams10.width = -2;
        Integer num3 = this.onExtraCallbackWithResult;
        if (num3 != null) {
            iOnNavigationEvent2 = num3.intValue();
        } else {
            DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            iOnNavigationEvent2 = varyMatches.onNavigationEvent(4, displayMetrics3);
        }
        layoutParams10.height = iOnNavigationEvent2;
        layoutParams10.gravity = 49;
        DisplayMetrics displayMetrics4 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        layoutParams10.topMargin = i7 + i5 + varyMatches.onNavigationEvent(10, displayMetrics4);
        linearLayout2.setLayoutParams(layoutParams10);
        if (z6) {
            i9 = i3 / 2;
            i10 = 2;
        } else {
            i9 = i2 / 2;
            int i27 = ITrustedWebActivityCallbackStub + 59;
            IPostMessageService_Parcel = i27 % 128;
            i10 = 2;
            int i28 = i27 % 2;
        }
        int iCoerceAtMost = RangesKt.coerceAtMost(i9, i3);
        if (!engagementSignalsCallback) {
            int i29 = ITrustedWebActivityCallbackStub + 17;
            IPostMessageService_Parcel = i29 % 128;
            int i30 = i29 % i10;
            BenefitPremiumGradientOverlayView benefitPremiumGradientOverlayView2 = this.access100.onMessageChannelReady;
            Intrinsics.checkNotNullExpressionValue(benefitPremiumGradientOverlayView2, "");
            ViewGroup.LayoutParams layoutParams11 = benefitPremiumGradientOverlayView2.getLayoutParams();
            if (layoutParams11 == null) {
                throw new NullPointerException(str);
            }
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
            layoutParams12.width = i2;
            layoutParams12.height = iCoerceAtMost;
            layoutParams12.gravity = 49;
            int i31 = i8 + i3;
            layoutParams12.topMargin = i31 - iCoerceAtMost;
            benefitPremiumGradientOverlayView2.setLayoutParams(layoutParams12);
            this.access100.onMessageChannelReady.setAlpha(newSession());
            this.access100.onMessageChannelReady.setStageWidth(i2);
            this.access100.onMessageChannelReady.setGradientBaseColor(Integer.valueOf(newAuthTabSession()));
            this.access100.onMessageChannelReady.setGradientArea(0, iCoerceAtMost);
            DisplayMetrics displayMetrics5 = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            int iCoerceAtMost2 = RangesKt.coerceAtMost(varyMatches.onNavigationEvent(2, displayMetrics5), i3);
            View view3 = this.access100.ICustomTabsService;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            ViewGroup.LayoutParams layoutParams13 = view3.getLayoutParams();
            if (layoutParams13 == null) {
                throw new NullPointerException(str);
            }
            FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) layoutParams13;
            layoutParams14.width = i2;
            layoutParams14.height = iCoerceAtMost2;
            layoutParams14.gravity = 49;
            layoutParams14.topMargin = i31 - iCoerceAtMost2;
            view3.setLayoutParams(layoutParams14);
            this.access100.ICustomTabsService.setAlpha(newSession());
            this.access100.ICustomTabsService.setBackgroundColor(newAuthTabSession());
        }
        FrameLayout frameLayout5 = this.access100.onTransact;
        Intrinsics.checkNotNullExpressionValue(frameLayout5, "");
        frameLayout5.setVisibility(!engagementSignalsCallback ? 0 : 8);
        if (!engagementSignalsCallback) {
            int i32 = ITrustedWebActivityCallbackStub + 55;
            IPostMessageService_Parcel = i32 % 128;
            int i33 = i32 % 2;
            FrameLayout frameLayout6 = this.access100.onTransact;
            Intrinsics.checkNotNullExpressionValue(frameLayout6, "");
            ViewGroup.LayoutParams layoutParams15 = frameLayout6.getLayoutParams();
            if (layoutParams15 == null) {
                throw new NullPointerException(str);
            }
            FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) layoutParams15;
            layoutParams16.width = i2;
            layoutParams16.height = -2;
            layoutParams16.gravity = 81;
            layoutParams16.topMargin = 0;
            frameLayout6.setLayoutParams(layoutParams16);
        }
        extraCallbackWithResult();
        onExtraCallback(new Object[]{this}, -1313563103, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1313563128);
        ICustomTabsService_Parcel();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b A[PHI: r3
      0x006b: PHI (r3v18 java.lang.Integer) = (r3v17 java.lang.Integer), (r3v29 java.lang.Integer) binds: [B:10:0x0069, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(boolean z, int i, int i2, int i3) {
        Integer num;
        Integer num2;
        Integer num3;
        int i4 = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnExtraCallbackWithResult = new getDEFAULT_CONNECTION_SPECSokhttp(new onNavigationEvent(configuration)).onExtraCallbackWithResult();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iCoerceAtMost = RangesKt.coerceAtMost(varyMatches.onNavigationEvent(180, displayMetrics), RangesKt.coerceAtLeast(i - 1, 0));
        if (Intrinsics.areEqual(this.ICustomTabsCallbackDefault, Boolean.valueOf(z))) {
            int i5 = IPostMessageService_Parcel + 77;
            ITrustedWebActivityCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                num = this.onUnminimized;
                int i6 = 12 / 0;
                if (num != null) {
                    if (num.intValue() == iCoerceAtMost) {
                        int i7 = ITrustedWebActivityCallbackStub + 7;
                        IPostMessageService_Parcel = i7 % 128;
                        int i8 = i7 % 2;
                        Integer num4 = this.onActivityResized;
                        if (num4 != null && num4.intValue() == i2 && (num2 = this.ICustomTabsCallbackStub) != null && num2.intValue() == i3 && (num3 = this.onPostMessage) != null) {
                            int i9 = ITrustedWebActivityCallbackStub + 67;
                            IPostMessageService_Parcel = i9 % 128;
                            int i10 = i9 % 2;
                            if (num3.intValue() == iOnExtraCallbackWithResult) {
                                return;
                            }
                        }
                    }
                }
            } else {
                num = this.onUnminimized;
                if (num != null) {
                }
            }
        }
        this.ICustomTabsCallbackDefault = Boolean.valueOf(z);
        this.onUnminimized = Integer.valueOf(iCoerceAtMost);
        this.onActivityResized = Integer.valueOf(i2);
        this.ICustomTabsCallbackStub = Integer.valueOf(i3);
        this.onPostMessage = Integer.valueOf(iOnExtraCallbackWithResult);
        if (!z || iCoerceAtMost <= 0) {
            View view = this.access100.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            View view2 = this.access100.asBinder;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
            int i11 = ITrustedWebActivityCallbackStub + 105;
            IPostMessageService_Parcel = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iOnExtraCallbackWithResult, 1.0f);
        int iOnExtraCallbackWithResult3 = onExtraCallbackWithResult(iOnExtraCallbackWithResult, 0.0f);
        View view3 = this.access100.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(view3);
        view3.setVisibility(0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view3.setBackground(new GradientDrawable(orientation, new int[]{iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3}));
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = iCoerceAtMost;
        layoutParams2.height = i2;
        layoutParams2.gravity = 8388659;
        layoutParams2.topMargin = i3;
        view3.setLayoutParams(layoutParams2);
        View view4 = this.access100.asBinder;
        Intrinsics.checkNotNull(view4);
        view4.setVisibility(0);
        view4.setBackground(new GradientDrawable(orientation, new int[]{iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2}));
        ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = iCoerceAtMost;
        layoutParams4.height = i2;
        layoutParams4.gravity = 8388661;
        layoutParams4.topMargin = i3;
        view4.setLayoutParams(layoutParams4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(float f) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 111;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        this.access100.IAuthTabCallbackStubProxy.setAlpha(1.0f);
        LinearLayout linearLayout = this.access100.access100;
        linearLayout.setAlpha(1.0f - fCoerceIn);
        Intrinsics.checkNotNull(linearLayout);
        if (this.newSessionWithExtras) {
            int i5 = ITrustedWebActivityCallbackStub + 47;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        LinearLayout linearLayout2 = this.access100.writeTypedObject;
        linearLayout2.setAlpha(fCoerceIn);
        Intrinsics.checkNotNull(linearLayout2);
        linearLayout2.setVisibility(this.ICustomTabsService ? 0 : 8);
        FrameLayout frameLayout = this.access100.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        LinearLayout linearLayout3 = this.access100.access100;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        if (linearLayout3.getVisibility() != 0) {
            int i7 = IPostMessageService_Parcel + 31;
            ITrustedWebActivityCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                LinearLayout linearLayout4 = this.access100.writeTypedObject;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                linearLayout4.getVisibility();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            LinearLayout linearLayout5 = this.access100.writeTypedObject;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
            if (linearLayout5.getVisibility() != 0) {
                TdsImageView tdsImageView = this.access100.ICustomTabsCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                z = tdsImageView.getVisibility() == 0;
            }
        }
        frameLayout.setVisibility(z ? 0 : 8);
        int i8 = ITrustedWebActivityCallbackStub + 125;
        IPostMessageService_Parcel = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 68 / 0;
        }
    }

    private final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        if (setEngagementSignalsCallback() && ICustomTabsCallbackStub()) {
            i = IAuthTabCallbackStub(i);
            int i3 = ITrustedWebActivityCallbackStub + 57;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
        } else if (setEngagementSignalsCallback() && this.requestPostMessageChannel) {
            if (this.postMessage) {
                int i5 = ITrustedWebActivityCallbackStub + 107;
                IPostMessageService_Parcel = i5 % 128;
                int i6 = i5 % 2;
                i = IAuthTabCallbackStub(i);
                int i7 = ITrustedWebActivityCallbackStub + 45;
                IPostMessageService_Parcel = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i += isEngagementSignalsApiAvailable();
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i9 = ITrustedWebActivityCallbackStub + 117;
            IPostMessageService_Parcel = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = layoutParams.height;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (layoutParams.height != i) {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = i;
                setLayoutParams(layoutParams2);
                int i11 = ITrustedWebActivityCallbackStub + 41;
                IPostMessageService_Parcel = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 70 / 0;
                }
            }
        }
    }

    private static /* synthetic */ Object postMessage(Object[] objArr) {
        FrameLayout frameLayout;
        BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView = (BenefitPremiumAdCollapsedView) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 89;
        ITrustedWebActivityCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        View childAt = benefitPremiumAdCollapsedView.access100.asInterface.getChildAt(benefitPremiumAdCollapsedView.onGreatestScrollPercentageIncreased);
        if (childAt instanceof FrameLayout) {
            int i4 = ITrustedWebActivityCallbackStub + 71;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            frameLayout = (FrameLayout) childAt;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            int i5 = IPostMessageService_Parcel + 87;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            View childAt2 = frameLayout.getChildAt(0);
            if (childAt2 != null) {
                DisplayMetrics displayMetrics = benefitPremiumAdCollapsedView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(48, displayMetrics);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = RangesKt.coerceIn(getBacktraceNoteBytes.onExtraCallback(iOnNavigationEvent * benefitPremiumAdCollapsedView.receiveFile()), 0, iOnNavigationEvent);
                DisplayMetrics displayMetrics2 = benefitPremiumAdCollapsedView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                layoutParams2.height = varyMatches.onNavigationEvent(4, displayMetrics2);
                childAt2.setLayoutParams(layoutParams2);
                int i7 = ITrustedWebActivityCallbackStub + 41;
                IPostMessageService_Parcel = i7 % 128;
                int i8 = i7 % 2;
                return null;
            }
        }
        return null;
    }

    private static final Unit IAuthTabCallbackStub(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 107;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        benefitPremiumAdCollapsedView.onExtraCallbackWithResult = Integer.valueOf(RangesKt.coerceAtLeast(getBacktraceNoteBytes.onExtraCallback(f), 0));
        LinearLayout linearLayout = benefitPremiumAdCollapsedView.access100.asInterface;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        int i5 = ITrustedWebActivityCallbackStub;
        int i6 = i5 + 29;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        Integer num = benefitPremiumAdCollapsedView.onExtraCallbackWithResult;
        if (num != null) {
            int i8 = i5 + 23;
            IPostMessageService_Parcel = i8 % 128;
            int i9 = i8 % 2;
            i = num.intValue();
            int i10 = IPostMessageService_Parcel + 105;
            ITrustedWebActivityCallbackStub = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 / 3;
            }
        }
        layoutParams2.height = i;
        linearLayout.setLayoutParams(layoutParams2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView, float f) {
        Object[] objArr = {benefitPremiumAdCarouselItemView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, -281114638, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 281114671);
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 1176378950, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1176378944);
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, -1689557020, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1689557023);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 2105851481, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2105851440);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Integer.valueOf(i)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, -396383416, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 396383454);
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -260057133, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 260057162);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, int i2, float f) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, -1074517688, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1074517737);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 502826637, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -502826628);
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, MotionEvent motionEvent) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView, motionEvent}, 2113330220, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2113330176);
    }

    public static /* synthetic */ Unit onTransact(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 1769340058, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1769340051);
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitPremiumAdCarouselItemView benefitPremiumAdCarouselItemView, float f) {
        Object[] objArr = {benefitPremiumAdCarouselItemView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, -2083741209, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2083741228);
    }

    public static /* synthetic */ Unit access000(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 1272692060, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1272692030);
    }

    public static /* synthetic */ void onNavigationEvent(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z, int i, boolean z2) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(objArr, -1039693792, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1039693816);
    }

    public static final /* synthetic */ long getInterfaceDescriptor(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Long) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 1938569155, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1938569127)).longValue();
    }

    public static final /* synthetic */ boolean onMessageChannelReady(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -1947698859, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1947698879)).booleanValue();
    }

    public static final /* synthetic */ boolean onRelationshipValidationResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 2121522030, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2121522009)).booleanValue();
    }

    public static final /* synthetic */ boolean ICustomTabsCallbackStub(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 402786274, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -402786261)).booleanValue();
    }

    public static final /* synthetic */ void onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, boolean z) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Integer.valueOf(i), Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(objArr, -627113180, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 627113192);
    }

    public static final /* synthetic */ void mayLaunchUrl(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 767271920, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -767271893);
    }

    private final void onExtraCallbackWithResult(int i, int i2) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(objArr, 714824239, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -714824191);
    }

    private final void writeTypedObject() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this}, -1313563103, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1313563128);
    }

    private static final Unit onExtraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, MotionEvent motionEvent) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView, motionEvent}, -2083453288, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2083453302);
    }

    private final void IAuthTabCallbackDefault(getBatteryInfo.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this, onextracallbackwithresult}, -930176554, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 930176588);
    }

    private final void onNavigationEvent(int i, int i2) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(objArr, -617399428, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 617399451);
    }

    private static final void newSession(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -1657240722, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1657240723);
    }

    private final void onUnminimized() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this}, -2089550736, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2089550752);
    }

    private static final Unit newAuthTabSession(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -1762153116, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1762153120);
    }

    private static final Unit postMessage(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, -355232083, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 355232085);
    }

    private static final Unit onExtraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Integer.valueOf(i)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, -1437431985, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1437432024);
    }

    private static final Unit prefetch(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 633255485, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -633255449);
    }

    private static final Unit access000(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 2118442524, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2118442474);
    }

    private static final Unit getInterfaceDescriptor(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 955187860, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -955187843);
    }

    private static final Unit extraCallbackWithResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 395698351, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -395698325);
    }

    private static final Unit IAuthTabCallback_Parcel(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 1396063058, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1396063043);
    }

    private static final Unit onPostMessage(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 387508042, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -387508007);
    }

    private static final Unit extraCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 1721758767, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1721758736);
    }

    private static final Unit prefetchWithMultipleUrls(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(new Object[]{benefitPremiumAdCollapsedView}, 1590307436, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1590307399);
    }

    private static final Unit onRelationshipValidationResult(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, boolean z) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 822265678, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -822265670);
    }

    private static final Unit onActivityLayout(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, float f) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 316579509, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -316579462);
    }

    private static final Unit IAuthTabCallback(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, int i, int i2, float f) {
        Object[] objArr = {benefitPremiumAdCollapsedView, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, 1152249378, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1152249367);
    }

    private final int IAuthTabCallback(int i, Integer num, boolean z) {
        Object[] objArr = {this, Integer.valueOf(i), num, Boolean.valueOf(z)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Integer) onExtraCallback(objArr, -1925791770, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1925791788)).intValue();
    }

    private final String onExtraCallbackWithResult(getBatteryInfo.onWarmupCompleted onwarmupcompleted, Context context) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) onExtraCallback(new Object[]{this, onwarmupcompleted, context}, -639321583, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 639321588);
    }

    private final int IAuthTabCallbackDefault(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Integer) onExtraCallback(objArr, 2059244095, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2059244050)).intValue();
    }

    private final void requestPostMessageChannelWithExtras() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this}, -165054908, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 165054954);
    }

    static /* synthetic */ void onWarmupCompleted(BenefitPremiumAdCollapsedView benefitPremiumAdCollapsedView, Integer num, boolean z, int i, Object obj) {
        Object[] objArr = {benefitPremiumAdCollapsedView, num, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(objArr, 1977697890, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1977697848);
    }

    private final void ICustomTabsServiceStubProxy() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this}, -996479963, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 996480003);
    }

    private final void writeTypedList() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this}, 2091244214, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -2091244182);
    }

    private final void onExtraCallback(RecyclerView recyclerView) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(new Object[]{this, recyclerView}, -1287852533, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1287852555);
    }

    public final Function1<getBatteryInfo.onExtraCallbackWithResult, Unit> IAuthTabCallbackStub() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Function1) onExtraCallback(new Object[]{this}, -1013499148, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1013499148);
    }

    public final Function0<Unit> IAuthTabCallback_Parcel() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Function0) onExtraCallback(new Object[]{this}, 1528908946, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1528908903);
    }

    public final List<getBatteryInfo.onExtraCallbackWithResult> access000() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (List) onExtraCallback(new Object[]{this}, -137275369, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 137275379);
    }
}
