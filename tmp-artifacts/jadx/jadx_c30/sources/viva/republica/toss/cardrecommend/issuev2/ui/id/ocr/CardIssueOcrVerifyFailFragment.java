package viva.republica.toss.cardrecommend.issuev2.ui.id.ocr;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.AppLovinStarRatingView;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.HighSpeedResolverExternalSyntheticLambda2;
import o.IDEACBCPar;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RequestOptionConfigBuilderExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.access5300;
import o.addFixedPosition;
import o.component5;
import o.extraCommand;
import o.getAwbState;
import o.getBacktraceNote;
import o.getSalt;
import o.immediateFailedFuture;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.setPositionProvider;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u4;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1ExternalSyntheticLambda6;
import o.y1a;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueOcrVerifyFailFragment extends CardIssueBaseFragment<getSalt> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 2327145950162599242L;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private final boolean onExtraCallback;
    private boolean onNavigationEvent;
    private final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment$$ExternalSyntheticLambda0
        public final Object invoke() {
            return CardIssueOcrVerifyFailFragment.IAuthTabCallback(this.f$0);
        }
    });
    private final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment$$ExternalSyntheticLambda1
        public final Object invoke() {
            return Boolean.valueOf(CardIssueOcrVerifyFailFragment.onNavigationEvent(this.f$0));
        }
    });

    public static /* synthetic */ String IAuthTabCallback(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(cardIssueOcrVerifyFailFragment);
        int i4 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ComposeView composeView, CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(composeView, cardIssueOcrVerifyFailFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, ComposeView composeView, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(highSpeedResolverExternalSyntheticLambda2, composeView, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 50 / 0;
        }
        int i6 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueOcrVerifyFailFragment, onBackPressedCallback);
        int i4 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment = (CardIssueOcrVerifyFailFragment) objArr[0];
        ComposeView composeView = (ComposeView) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(cardIssueOcrVerifyFailFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallback(cardIssueOcrVerifyFailFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = asInterface(cardIssueOcrVerifyFailFragment);
        int i4 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return zAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = i7 | i6;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i6));
        int i11 = (~(i2 | i6)) | (~(i7 | i2));
        int i12 = i9 | i8;
        int i13 = i6 + i3 + i4 + (988256597 * i5) + ((-695401848) * i);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i6) - 1270611968) + ((-1462879173) * i3) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i4) + (479985664 * i5) + (1063256064 * i) + (1273561088 * i14);
        int i16 = (i6 * (-1367684995)) + 376186498 + (i3 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i4 * (-1367684709)) + (i5 * 1512018807) + (i * 1127043160) + (i14 * (-418185216));
        int i17 = i15 + (i16 * i16 * 1903099904);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(ComposeView composeView, CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(composeView, cardIssueOcrVerifyFailFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cardIssueOcrVerifyFailFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        if (i4 != 0) {
            return (Unit) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1592804565, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1592804568);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        cardIssueOcrVerifyFailFragment.IAuthTabCallback();
        int i4 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment = (CardIssueOcrVerifyFailFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        cardIssueOcrVerifyFailFragment.IAuthTabCallbackStub();
        if (i3 != 0) {
            return null;
        }
        int i4 = 3 / 0;
        return null;
    }

    public boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    private final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onExtraCallbackWithResult.getValue();
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    private static final String onWarmupCompleted(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleRequireArguments = cardIssueOcrVerifyFailFragment.requireArguments();
        if (i3 != 0) {
            return bundleRequireArguments.getString("manualInputDisclaimer");
        }
        bundleRequireArguments.getString("manualInputDisclaimer");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment = (CardIssueOcrVerifyFailFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cardIssueOcrVerifyFailFragment.onWarmupCompleted.getValue()).booleanValue();
        int i4 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    private static final boolean asInterface(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = cardIssueOcrVerifyFailFragment.requireArguments().getBoolean("pendingOcrImageRequired");
        int i4 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        extraCommand.IAuthTabCallback(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return CardIssueOcrVerifyFailFragment.onExtraCallbackWithResult(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, (Object) null);
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, BuildConfig.FLAVOR);
        cardIssueOcrVerifyFailFragment.onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = false;
        super/*im.toss.base.BaseFragment*/.onDestroyView();
        int i4 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        final ComposeView composeView = new ComposeView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1183141186, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2) {
                Object[] objArr = {this.f$0, composeView, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                return (Unit) CardIssueOcrVerifyFailFragment.onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 858893726, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -858893722);
            }
        })));
        int i2 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return composeView;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 67;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16731404) - Color.rgb(0, 0, 0)), 84 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 21234 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 14185), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, Color.green(0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 61;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, ComposeView composeView, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, BuildConfig.FLAVOR);
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackDefault + 85;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallbackDefault + 91;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 12 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(877276148, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueOcrVerifyFailFragment.kt:63)");
                    int i7 = IAuthTabCallbackDefault + 37;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, QuirkSettingsLoader.Companion.IAuthTabCallback_Parcel());
                String string = composeView.getContext().getString(R.string.card_issue_ocr_verify_fail_title);
                Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, quirksExternalSyntheticBackport0OnWarmupCompleted, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, QuirkSettingsLoader.Companion.IAuthTabCallback_Parcel());
                String string2 = composeView.getContext().getString(R.string.card_issue_ocr_verify_fail_title);
                Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string2, quirksExternalSyntheticBackport0OnWarmupCompleted2, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, BuildConfig.FLAVOR);
            if ((i & 47) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
                int i5 = IAuthTabCallbackStub + 99;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, BuildConfig.FLAVOR);
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i7 = IAuthTabCallbackDefault + 51;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = IAuthTabCallbackStub + 13;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1457451497, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueOcrVerifyFailFragment.kt:72)");
            }
            Object[] objArr = {y1externalsyntheticlambda3, str, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 15) & 458752), 30};
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function0<Unit> {
        onExtraCallbackWithResult(Object obj) {
            super(0, obj, CardIssueOcrVerifyFailFragment.class, "moveManualInput", "moveManualInput()V", 0);
        }

        public /* synthetic */ Object invoke() {
            onWarmupCompleted();
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted() {
            CardIssueOcrVerifyFailFragment.onExtraCallbackWithResult((CardIssueOcrVerifyFailFragment) ((CallableReference) this).receiver);
        }
    }

    private static final Unit IAuthTabCallback(ComposeView composeView, CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ^ true ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = IAuthTabCallbackDefault + 117;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 2;
            }
            z = true;
        } else {
            int i6 = IAuthTabCallbackDefault + 109;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = IAuthTabCallbackStub + 121;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i10 = IAuthTabCallbackStub + 35;
                IAuthTabCallbackDefault = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1483580541, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueOcrVerifyFailFragment.kt:88)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1483580541, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueOcrVerifyFailFragment.kt:88)");
            }
            String string = composeView.getContext().getString(R.string.card_issue_ocr_verify_fail_cta);
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(cardIssueOcrVerifyFailFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallbackWithResult(cardIssueOcrVerifyFailFragment);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            u4Var.onNavigationEvent(string, (QuirksExternalSyntheticBackport0) null, (Function0) null, (access5300) objOnMinimized, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<Unit> {
        IAuthTabCallback(Object obj) {
            super(0, obj, CardIssueOcrVerifyFailFragment.class, "retryOcr", "retryOcr()V", 0);
        }

        public /* synthetic */ Object invoke() {
            onWarmupCompleted();
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted() {
            Object[] objArr = {(CardIssueOcrVerifyFailFragment) ((CallableReference) this).receiver};
            CardIssueOcrVerifyFailFragment.onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -247743882, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 247743882);
        }
    }

    private static final Unit onNavigationEvent(ComposeView composeView, CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = IAuthTabCallbackStub + 95;
                IAuthTabCallbackDefault = i5 % 128;
                i3 = i5 % 2 == 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = IAuthTabCallbackStub + 105;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-27951105, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueOcrVerifyFailFragment.kt:94)");
            }
            String string = composeView.getContext().getString(R.string.card_issue_ocr_verify_fail_cta_secondary);
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(cardIssueOcrVerifyFailFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new IAuthTabCallback(cardIssueOcrVerifyFailFragment);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            u4Var.onNavigationEvent(string, (QuirksExternalSyntheticBackport0) null, (Function0) null, (access5300) objOnMinimized, onextracallback, onwarmupcompleted, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 221184, i2 & 14, 966);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        getBacktraceNote getbacktracenote;
        final CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment = (CardIssueOcrVerifyFailFragment) objArr[0];
        final ComposeView composeView = (ComposeView) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            Object obj = null;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = IAuthTabCallbackDefault + 55;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-229837078, iIntValue, -1, "viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CardIssueOcrVerifyFailFragment.kt:60)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-229837078, iIntValue, -1, "viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CardIssueOcrVerifyFailFragment.kt:60)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i5 = IAuthTabCallbackStub + 9;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            final HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(877276148, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment$$ExternalSyntheticLambda3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return CardIssueOcrVerifyFailFragment.onExtraCallback(highSpeedResolverExternalSyntheticLambda1, composeView, (y1a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            final String strOnExtraCallback = cardIssueOcrVerifyFailFragment.onExtraCallback();
            if (strOnExtraCallback == null) {
                int i6 = IAuthTabCallbackDefault + 115;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(626985969);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(626985969);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                getbacktracenote = null;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(626985970);
                getBacktraceNote getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(1457451497, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        Object[] objArr2 = {strOnExtraCallback, (y1ExternalSyntheticLambda3) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                        return (Unit) CardIssueOcrVerifyFailFragment.onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 779951513, objArr2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -779951511);
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i7 = IAuthTabCallbackDefault + 109;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                getbacktracenote = getbacktracenoteOnExtraCallback;
            }
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, getbacktracenote, y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent(), (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 0, 16286);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f)), onextracallbackwithresult.onExtraCallback());
            Object[] objArr2 = new Object[1];
            a(new char[]{14840, 14736, 11968, 26866, 24880, 54475, 60872, 1641, 8339, 14230, 50363, 16142, 3003, 4336, 57325, 53693, 29401, 63775, 46794, 51877, 24055, 49703, 37295, 58327, 17641, 43809, 27419, 34029, 44807, 46160, 16984, 48576, 38453, 40303, 23851, 22232, 61788, 26585, 13343, 20280, 55378, 16520, 3961, 24582, 50029, 10666, 58921, 6523, 11665, 13008, 49545, 12914, 5300, 7153, 55549, 11095, 32749, 58558, 46042, 52651, 26331, 52491, 35458}, View.combineMeasuredStates(0, 0), objArr2);
            AppLovinStarRatingView.IAuthTabCallback(((String) objArr2[0]).intern(), quirksExternalSyntheticBackport0OnWarmupCompleted2, false, false, 0, 0.0f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 8188);
            u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), (u2) null, ForwardingCameraControl.onExtraCallback(1483580541, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment$$ExternalSyntheticLambda5
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return CardIssueOcrVerifyFailFragment.onExtraCallback(composeView, cardIssueOcrVerifyFailFragment, (u4) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-27951105, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment$$ExternalSyntheticLambda6
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return CardIssueOcrVerifyFailFragment.onWarmupCompleted(composeView, cardIssueOcrVerifyFailFragment, (u4) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 24960, 0, 4074);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, final ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 5;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i4 + 37;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallbackStub + 45;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1183141186, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment.onCreateView.<anonymous>.<anonymous> (CardIssueOcrVerifyFailFragment.kt:59)");
                    int i9 = 28 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1183141186, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment.onCreateView.<anonymous>.<anonymous> (CardIssueOcrVerifyFailFragment.kt:59)");
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-229837078, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFailFragment$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2) {
                    return CardIssueOcrVerifyFailFragment.onWarmupCompleted(this.f$0, composeView, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = IAuthTabCallbackDefault + 33;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = IAuthTabCallbackStub + 9;
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        if (this.onNavigationEvent) {
            return;
        }
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        if (((Boolean) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1704653266, new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1704653267)).booleanValue()) {
            if (extraCallback().ICustomTabsCallback() == null) {
                IAuthTabCallbackStub();
                return;
            }
            this.onNavigationEvent = true;
            onExtraCallbackWithResult();
            int i2 = IAuthTabCallbackStub + 83;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i3 = IAuthTabCallbackDefault + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = true;
        onExtraCallbackWithResult();
    }

    private final void onExtraCallbackWithResult() {
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i;
        Bundle bundleRequireArguments;
        setPositionProvider setpositionprovider;
        PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            View viewRequireView = requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, BuildConfig.FLAVOR);
            typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult = PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(viewRequireView);
            i = R.id.card_issue_action_manual;
            bundleRequireArguments = requireArguments();
            setpositionprovider = null;
            iAuthTabCallback = null;
            i2 = 64;
        } else {
            View viewRequireView2 = requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView2, BuildConfig.FLAVOR);
            typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult = PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(viewRequireView2);
            i = R.id.card_issue_action_manual;
            bundleRequireArguments = requireArguments();
            setpositionprovider = null;
            iAuthTabCallback = null;
            i2 = 12;
        }
        IDEACBCPar.onExtraCallback(typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult, i, bundleRequireArguments, setpositionprovider, iAuthTabCallback, i2, (Object) null);
        int i5 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
            if (this.onNavigationEvent) {
                return;
            }
        } else if (this.onNavigationEvent) {
            return;
        }
        extraCallback().IAuthTabCallback();
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, BuildConfig.FLAVOR);
        PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(viewRequireView).getInterfaceDescriptor();
        int i4 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (!this.onNavigationEvent) {
            extraCallback().IAuthTabCallback();
            onPostMessage();
        } else {
            int i5 = i3 + 119;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cardIssueOcrVerifyFailFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 858893726, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -858893722);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 779951513, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -779951511);
    }

    public static final /* synthetic */ void onExtraCallback(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -247743882, new Object[]{cardIssueOcrVerifyFailFragment}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 247743882);
    }

    private final boolean onNavigationEvent() {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1704653266, new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1704653267)).booleanValue();
    }

    private static final Unit IAuthTabCallback(CardIssueOcrVerifyFailFragment cardIssueOcrVerifyFailFragment, ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cardIssueOcrVerifyFailFragment, composeView, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1592804565, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1592804568);
    }
}
