package viva.republica.toss.password;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.core.biometric.RxBiometric;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.features.tosscert.ui.R;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.uikit.widget.AuthPinDotView;
import im.toss.uikit.widget.GradientButtonView;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import im.toss.uikit.widget.gl.AnimateMaskedImageView;
import im.toss.uikit.widget.gl.AuthPinBackgroundView;
import im.toss.uikit.widget.gl.AuthPinDotRotationView;
import im.toss.uikit.widget.gl.KeyBlurImageSurfaceView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import kotlin.text.StringsKt;
import o.AFj1rSDK;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.Address;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.C_;
import o.CatalystInstanceImplPendingJSCall;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.GeckoHubImp;
import o.GraniteBrownfieldModule_closeView;
import o.IPostMessageServiceStubProxy;
import o.IndicatorView;
import o.M_;
import o.PageRenderReadyListener;
import o.ReactNativeFeatureFlagsExternalSyntheticLambda0;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UTF8Decoder;
import o._get_isNull_lambda0;
import o._string;
import o.access13800;
import o.access14300;
import o.access8100;
import o.accessMapSafely;
import o.addAllCommandLine;
import o.asDouble;
import o.asMaplambda6;
import o.attachAppLovinSdk;
import o.certificatePinner;
import o.createPaints;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.deprecated_proxy;
import o.deprecated_proxySelector;
import o.disableImageViewPreallocationAndroid;
import o.enableFabricRenderer;
import o.findResAndMsg;
import o.formatMsgs;
import o.generateInviteUrl;
import o.generateLink;
import o.getExtraParameters;
import o.getIconPaddingLeft;
import o.getPackageType;
import o.getVersionCode;
import o.getWrite;
import o.isFireOS;
import o.isJSONTypeIgnore;
import o.isMuted;
import o.isNullSentinel;
import o.isNumber;
import o.isOneShot;
import o.maybeUpdateAnimatable;
import o.nSetPosition;
import o.noStore;
import o.onRenderReady;
import o.preFillDefault;
import o.processDeepLink;
import o.putChannelInfo;
import o.pxToDp;
import o.runOnUiThreadDelayed;
import o.setCACert;
import o.setHasUserConsent;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setPatch;
import o.setRandomHost;
import o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import o.startRearDisplaySession;
import o.transparentBackground;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;
import viva.republica.toss.password.PasswordFragment;
import viva.republica.toss.password.PasswordNeo4D1AFragment;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordNeo4D1AFragment extends PasswordFragment {
    public static final onExtraCallback Companion;
    private static long MediaSessionCompatQueueItem;
    private static int ParcelableVolumeInfo;
    private static char[] RatingCompatStyle;
    public static final int onExtraCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult;
    private static final String onTransact;
    public ScrollView IAuthTabCallback;
    public View IAuthTabCallbackDefault;
    private ValueAnimator ICustomTabsCallbackStub;
    private getPackageType ICustomTabsCallbackStubProxy;
    private runOnUiThreadDelayed ICustomTabsCallback_Parcel;
    private getPackageType ICustomTabsServiceStub;
    private boolean IEngagementSignalsCallback_Parcel;
    private boolean IPostMessageService;
    private boolean IPostMessageServiceDefault;
    private float IPostMessageServiceStub;
    private ValueAnimator ITrustedWebActivityCallbackDefault;
    private PasswordFragment.onExtraCallback ITrustedWebActivityCallbackStubProxy;
    private String ITrustedWebActivityCallback_Parcel;
    private float ITrustedWebActivityService;
    private ValueAnimator ITrustedWebActivityServiceDefault;
    private ValueAnimator ITrustedWebActivityService_Parcel;
    private getPackageType RatingCompat;
    private ValueAnimator RemoteActionCompatParcelizer;
    private boolean access200;
    private runOnUiThreadDelayed cancelNotification;
    private ValueAnimator getSmallIconBitmap;
    private runOnUiThreadDelayed getSmallIconId;
    private getPackageType isEngagementSignalsApiAvailable;
    private runOnUiThreadDelayed newAuthTabSession;
    private ValueAnimator newSession;
    public ViewGroup onNavigationEvent;
    public TextView onWarmupCompleted;
    private ValueAnimator prefetchWithMultipleUrls;
    private ValueAnimator receiveFile;
    private ValueAnimator requestPostMessageChannel;
    private boolean requestPostMessageChannelWithExtras;
    private ValueAnimator setEngagementSignalsCallback;
    private runOnUiThreadDelayed updateVisuals;
    private ValueAnimator warmup;
    private static final byte[] $$d = {10, 80, 9, 70};
    private static final int $$e = 91;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int PlaybackStateCompat = 1;
    private static int RatingCompat1 = 0;
    private static int RatingCompatStarStyle = 1;
    private final PageRenderReadyListener onRelationshipValidationResult = preFillDefault.IAuthTabCallback(this, onExtraCallbackWithResult.onNavigationEvent);
    private String prefetch = "";
    private final int[] onGreatestScrollPercentageIncreased = {R.id.password_btnKey0, R.id.password_btnKey1, R.id.password_btnKey2, R.id.password_btnKey3, R.id.password_btnKey4, R.id.password_btnKey5, R.id.password_btnKey6, R.id.password_btnKey7, R.id.password_btnKey8, R.id.password_btnKey9, R.id.password_btnKey10, R.id.password_btnKey11, R.id.password_btnKey12, R.id.password_btnKey13, R.id.password_btnKey14, R.id.password_btnKey15, R.id.password_btnKey16, R.id.password_btnKey17, R.id.password_btnKey18, R.id.password_btnKey19, R.id.password_btnKey20, R.id.password_btnKey21, R.id.password_btnKey22, R.id.password_btnKey23, R.id.password_btnKey24, R.id.password_btnKey25};
    private final ArrayList<String> onSessionEnded = new ArrayList<>();
    private final List<TextView> onVerticalScrollEvent = new ArrayList();
    private final List<View> IPostMessageService_Parcel = new ArrayList();
    private final List<TextView> IPostMessageServiceStubProxy = new ArrayList();
    private final List<String> ITrustedWebActivityCallback = new ArrayList();
    private final List<AuthPinDotView> validateRelationship = new ArrayList();
    private final List<AuthPinDotView> IEngagementSignalsCallbackStubProxy = new ArrayList();
    private final List<View> ICustomTabsServiceStubProxy = new ArrayList();
    private final List<View> ITrustedWebActivityCallbackStub = new ArrayList();
    private char[] postMessage = new char[IPostMessageServiceStub()];
    private final Lazy ICustomTabsCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda91
        public final Object invoke() {
            return PasswordNeo4D1AFragment.setEngagementSignalsCallback();
        }
    });
    private final Lazy AudioAttributesCompatParcelizer = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda101
        public final Object invoke() {
            return PasswordNeo4D1AFragment.access000();
        }
    });
    private final Lazy ITrustedWebActivityServiceStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda102
        public final Object invoke() {
            return PasswordNeo4D1AFragment.receiveFile();
        }
    });
    private final Lazy read = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda103
        public final Object invoke() {
            return PasswordNeo4D1AFragment.requestPostMessageChannelWithExtras();
        }
    });
    private final Lazy ITrustedWebActivityServiceStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda104
        public final Object invoke() {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            return (deprecated_dns) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 107361454, iIAuthTabCallback2, -107361397, new Object[0], iIAuthTabCallback);
        }
    });
    private final Lazy areNotificationsEnabled = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda105
        public final Object invoke() {
            return PasswordNeo4D1AFragment.requestPostMessageChannel();
        }
    });
    private float MediaMetadataCompat = 1.0f;
    private float ICustomTabsService = 0.3f;
    private float mayLaunchUrl = 0.8f;
    private float extraCommand = 0.15f;
    private final Lazy IEngagementSignalsCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda106
        public final Object invoke() {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            return (isNullSentinel) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 40415631, iIAuthTabCallback2, -40415583, new Object[0], iIAuthTabCallback);
        }
    });
    private final Lazy writeTypedList = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda107
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo4D1AFragment.getInterfaceDescriptor(this.f$0));
        }
    });
    private final Lazy ICustomTabsService_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda108
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo4D1AFragment.onWarmupCompleted(this.f$0));
        }
    });
    private final Lazy IEngagementSignalsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda109
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            return Boolean.valueOf(((Boolean) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1451841440, iIAuthTabCallback2, -1451841397, objArr, iIAuthTabCallback)).booleanValue());
        }
    });
    private final Lazy IconCompatParcelizer = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda92
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo4D1AFragment.access000(this.f$0));
        }
    });
    private final Lazy AudioAttributesImplApi26Parcelizer = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda93
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo4D1AFragment.IAuthTabCallbackStubProxy(this.f$0));
        }
    });
    private int MediaDescriptionCompat = -1;
    private final Lazy onUnminimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda94
        public final Object invoke() {
            return Float.valueOf(PasswordNeo4D1AFragment.IAuthTabCallbackDefault(this.f$0));
        }
    });
    private final float newSessionWithExtras = 0.11f;
    private boolean RatingCompatApi19Impl = true;
    private final ObservableProperty ICustomTabsServiceDefault = ReactNativeFeatureFlagsExternalSyntheticLambda0.IAuthTabCallback(new GraniteBrownfieldModule_closeView((char[]) null, 1, (DefaultConstructorMarker) null));
    private boolean IEngagementSignalsCallbackDefault = true;
    private final Lazy MediaBrowserCompatMediaItem = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda95
        public final Object invoke() {
            return PasswordNeo4D1AFragment.access100(this.f$0);
        }
    });
    private final Lazy AudioAttributesImplApi21Parcelizer = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda96
        public final Object invoke() {
            return PasswordNeo4D1AFragment.asInterface(this.f$0);
        }
    });
    private final Lazy write = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda97
        public final Object invoke() {
            return PasswordNeo4D1AFragment.onNavigationEvent(this.f$0);
        }
    });
    private final Lazy AudioAttributesImplBaseParcelizer = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda98
        public final Object invoke() {
            return PasswordNeo4D1AFragment.IAuthTabCallback_Parcel(this.f$0);
        }
    });
    private final Lazy getActiveNotifications = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda99
        public final Object invoke() {
            return Integer.valueOf(PasswordNeo4D1AFragment.onExtraCallback(this.f$0));
        }
    });
    private final Lazy notifyNotificationWithChannel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda100
        public final Object invoke() {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            return Integer.valueOf(((Integer) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1801907738, iIAuthTabCallback2, 1801907796, new Object[0], iIAuthTabCallback)).intValue());
        }
    });

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[PasswordFragment.onNavigationEvent.values().length];
            try {
                iArr[PasswordFragment.onNavigationEvent.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PasswordFragment.onNavigationEvent.CONFIRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = 97 - r6
            byte[] r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.$$d
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.$$f(byte, short, short):java.lang.String");
    }

    static {
        ParcelableVolumeInfo = 0;
        validateRelationship();
        Object[] objArr = new Object[1];
        b(TextUtils.indexOf("", "", 0, 0) + 23, (char) (View.getDefaultSize(0, 0) + 17426), View.resolveSizeAndState(0, 0, 0), objArr);
        onTransact = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getPressedStateDuration() >> 16) + 7, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0) + 24, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 76, (char) ((-16735874) - Color.rgb(0, 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 30, objArr3);
        addAllCommandLine<Object> propertyReference1Impl = new PropertyReference1Impl<>(PasswordNeo4D1AFragment.class, strIntern, ((String) objArr3[0]).intern(), 0);
        Object[] objArr4 = new Object[1];
        b(13 - View.resolveSize(0, 0), (char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 106, objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b(AndroidCharacter.getMirror('0') + 4, (char) ((Process.myPid() >> 22) + 45443), (ViewConfiguration.getScrollBarSize() >> 8) + 119, objArr5);
        onExtraCallbackWithResult = new addAllCommandLine[]{propertyReference1Impl, new MutablePropertyReference1Impl<>(PasswordNeo4D1AFragment.class, strIntern2, ((String) objArr5[0]).intern(), 0)};
        Companion = new onExtraCallback(null);
        onExtraCallback = 8;
        int i = PlaybackStateCompat + 13;
        ParcelableVolumeInfo = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 125;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(setcacert);
        int i4 = RatingCompat1 + 101;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 101;
        RatingCompatStarStyle = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(setcacert, passwordNeo4D1AFragment);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(setcacert, passwordNeo4D1AFragment);
        int i3 = RatingCompat1 + 75;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 93;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 55;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIEngagementSignalsCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 109;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(passwordNeo4D1AFragment, setcacert, f);
        }
        onTransact(passwordNeo4D1AFragment, setcacert, f);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, boolean z) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 5;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {passwordNeo4D1AFragment, setcacert, Boolean.valueOf(z)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iIAuthTabCallback4, iIAuthTabCallback3, -1147100298, iIAuthTabCallback2, 1147100335, objArr, iIAuthTabCallback);
        int i4 = RatingCompat1 + 41;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(setCACert setcacert, Function0 function0) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 109;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(setcacert, function0);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = RatingCompatStarStyle + 35;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 51;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 759937800, iIAuthTabCallback2, -759937800, new Object[]{setcacert, passwordNeo4D1AFragment, view}, iIAuthTabCallback);
            int i3 = 20 / 0;
        } else {
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 759937800, iIAuthTabCallback5, -759937800, new Object[]{setcacert, passwordNeo4D1AFragment, view}, iIAuthTabCallback4);
        }
        int i4 = RatingCompat1 + 79;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 99;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(passwordNeo4D1AFragment);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        int i5 = RatingCompat1 + 89;
        RatingCompatStarStyle = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 121;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(passwordNeo4D1AFragment, valueAnimator);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        int i5 = RatingCompatStarStyle + 89;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
    }

    public static /* synthetic */ float IAuthTabCallbackDefault(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 13;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback(passwordNeo4D1AFragment);
        }
        extraCallback(passwordNeo4D1AFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 125;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnSessionEnded = onSessionEnded(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 115;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnSessionEnded;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 19;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(setcacert);
        int i4 = RatingCompat1 + 47;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 95;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub(passwordNeo4D1AFragment, attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return unitIEngagementSignalsCallbackStub;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 93;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(baseActivity, passwordNeo4D1AFragment, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = RatingCompat1 + 39;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 105;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return onPostMessage(passwordNeo4D1AFragment);
        }
        onPostMessage(passwordNeo4D1AFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 111;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedList = writeTypedList(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 35;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitWriteTypedList;
    }

    public static /* synthetic */ int IAuthTabCallbackStubProxy(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 65;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            mayLaunchUrl(passwordNeo4D1AFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iMayLaunchUrl = mayLaunchUrl(passwordNeo4D1AFragment);
        int i3 = RatingCompat1 + 105;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        return iMayLaunchUrl;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 89;
        RatingCompatStarStyle = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IEngagementSignalsCallbackDefault(passwordNeo4D1AFragment, attachapplovinsdk);
            throw null;
        }
        Unit unitIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault(passwordNeo4D1AFragment, attachapplovinsdk);
        int i3 = RatingCompat1 + 111;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIEngagementSignalsCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Pair IAuthTabCallback_Parcel(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 107;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(passwordNeo4D1AFragment);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        int i5 = RatingCompatStarStyle + 31;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 == 0) {
            return pairIsEngagementSignalsApiAvailable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 17;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitResultReceiver = ResultReceiver();
        int i4 = RatingCompatStarStyle + 3;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unitResultReceiver;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 125;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPostMessage = postMessage(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 79;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unitPostMessage;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 59;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitReceiveFile = receiveFile(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 37;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitReceiveFile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 43;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCommand(passwordNeo4D1AFragment, attachapplovinsdk);
        }
        extraCommand(passwordNeo4D1AFragment, attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackDefault(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 13;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewAuthTabSession = newAuthTabSession(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 21;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitNewAuthTabSession;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 23;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return access200(passwordNeo4D1AFragment, attachapplovinsdk);
        }
        access200(passwordNeo4D1AFragment, attachapplovinsdk);
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        setCACert setcacert = (setCACert) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 55;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(setcacert, fFloatValue);
        int i4 = RatingCompat1 + 9;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    private static /* synthetic */ Object ICustomTabsServiceStubProxy(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 7;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(attachapplovinsdk);
        int i4 = RatingCompat1 + 57;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ int access000(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 5;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        int iICustomTabsCallbackStub = ICustomTabsCallbackStub(passwordNeo4D1AFragment);
        int i4 = RatingCompatStarStyle + 27;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iICustomTabsCallbackStub;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 61;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(passwordNeo4D1AFragment, str);
        int i4 = RatingCompatStarStyle + 87;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return strOnWarmupCompleted;
    }

    public static /* synthetic */ deprecated_dns access000() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 97;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        int i4 = RatingCompatStarStyle + 95;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_dnsVarMediaSessionCompatResultReceiverWrapper;
        }
        throw null;
    }

    public static /* synthetic */ Pair access100(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 1;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Pair pairICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(passwordNeo4D1AFragment);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = RatingCompatStarStyle + 47;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 == 0) {
            return pairICustomTabsCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit access100(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 37;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 9;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallback_Parcel;
    }

    private static /* synthetic */ Object access200(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 29;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnVerticalScrollEvent = onVerticalScrollEvent(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 111;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return unitOnVerticalScrollEvent;
    }

    public static /* synthetic */ Unit asBinder(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 67;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 == 0) {
            return getInterfaceDescriptor(setcacert);
        }
        getInterfaceDescriptor(setcacert);
        throw null;
    }

    public static /* synthetic */ Unit asBinder(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 21;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -2041347218, iIAuthTabCallback2, 2041347225, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
        int i4 = RatingCompatStarStyle + 15;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 125;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(passwordNeo4D1AFragment, attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = RatingCompatStarStyle + 45;
        RatingCompat1 = i5 % 128;
        int i6 = i5 % 2;
        return unitIsEngagementSignalsApiAvailable;
    }

    public static /* synthetic */ Pair asInterface(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 115;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            return (Pair) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1642245734, iIAuthTabCallback2, -1642245730, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback);
        }
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 103;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 == 0) {
            return setEngagementSignalsCallback(passwordNeo4D1AFragment, attachapplovinsdk);
        }
        setEngagementSignalsCallback(passwordNeo4D1AFragment, attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 97;
        RatingCompat1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsService_Parcel(passwordNeo4D1AFragment, attachapplovinsdk);
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsService_Parcel = ICustomTabsService_Parcel(passwordNeo4D1AFragment, attachapplovinsdk);
        int i3 = RatingCompatStarStyle + 73;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitICustomTabsService_Parcel;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        setCACert setcacert = (setCACert) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = RatingCompat1 + 23;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(passwordNeo4D1AFragment, setcacert, fFloatValue);
        int i4 = RatingCompat1 + 89;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ int getInterfaceDescriptor(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 89;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            onActivityResized(passwordNeo4D1AFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnActivityResized = onActivityResized(passwordNeo4D1AFragment);
        int i3 = RatingCompatStarStyle + 61;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
        return iOnActivityResized;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 81;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 278769267, iIAuthTabCallback2, -278769262, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
        int i4 = RatingCompat1 + 47;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 99;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 73;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAccess000;
        }
        throw null;
    }

    private static /* synthetic */ Object newAuthTabSession(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        TextView textView = (TextView) objArr[1];
        setCACert setcacert = (setCACert) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 23;
        RatingCompatStarStyle = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 517013822, iIAuthTabCallback2, -517013806, new Object[]{passwordNeo4D1AFragment, textView, setcacert, view}, iIAuthTabCallback);
            return null;
        }
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 517013822, iIAuthTabCallback5, -517013806, new Object[]{passwordNeo4D1AFragment, textView, setcacert, view}, iIAuthTabCallback4);
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object newSession(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 31;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnMessageChannelReady = onMessageChannelReady(passwordNeo4D1AFragment);
        int i4 = RatingCompatStarStyle + 5;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnMessageChannelReady);
        }
        throw null;
    }

    private static /* synthetic */ Object newSessionWithExtras(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 61;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(attachapplovinsdk);
        }
        onTransact(attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onActivityLayout(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 37;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 109;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnGreatestScrollPercentageIncreased;
        }
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 13;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(th);
        int i4 = RatingCompatStarStyle + 23;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onActivityResized(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 7;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSession = newSession(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 105;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitNewSession;
    }

    public static /* synthetic */ int onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 9;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        int iIntValue = ((Integer) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 951280190, iIAuthTabCallback2, -951280159, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).intValue();
        int i4 = RatingCompatStarStyle + 49;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 91;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(setcacert);
        int i4 = RatingCompat1 + 87;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 25;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setcacert, passwordNeo4D1AFragment, f);
        int i4 = RatingCompatStarStyle + 93;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 103;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setcacert, passwordNeo4D1AFragment, motionEvent);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 111;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 303580120, iIAuthTabCallback2, -303580070, new Object[]{passwordNeo4D1AFragment, setDetectableSize}, iIAuthTabCallback);
            int i3 = 31 / 0;
        } else {
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 303580120, iIAuthTabCallback5, -303580070, new Object[]{passwordNeo4D1AFragment, setDetectableSize}, iIAuthTabCallback4);
        }
        int i4 = RatingCompatStarStyle + 47;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 97;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsService = ICustomTabsService(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 125;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(float f, setCACert setcacert, float f2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 37;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Float.valueOf(f), setcacert, Float.valueOf(f2), valueAnimator};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        if (i3 == 0) {
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 81186306, iIAuthTabCallback2, -81186254, objArr, iIAuthTabCallback);
        } else {
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 81186306, iIAuthTabCallback2, -81186254, objArr, iIAuthTabCallback);
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 73;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -323183765, iIAuthTabCallback2, 323183816, new Object[]{function1, obj}, iIAuthTabCallback);
            return;
        }
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, -323183765, iIAuthTabCallback5, 323183816, new Object[]{function1, obj}, iIAuthTabCallback4);
        int i3 = 42 / 0;
    }

    public static /* synthetic */ void onExtraCallback(deprecated_dns deprecated_dnsVar, float f, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f2, setCACert setcacert, float f3, float f4, float f5, float f6, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 25;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(deprecated_dnsVar, f, passwordNeo4D1AFragment, f2, setcacert, f3, f4, f5, f6, valueAnimator);
        int i4 = RatingCompat1 + 15;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(setCACert setcacert, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 49;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(setcacert, valueAnimator);
        int i4 = RatingCompatStarStyle + 99;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 11;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 307423128, iIAuthTabCallback2, -307423086, new Object[]{setcacert, passwordNeo4D1AFragment, view}, iIAuthTabCallback);
            return;
        }
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 307423128, iIAuthTabCallback5, -307423086, new Object[]{setcacert, passwordNeo4D1AFragment, view}, iIAuthTabCallback4);
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 103;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(passwordNeo4D1AFragment, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setHasUserConsent sethasuserconsent, setHasUserConsent sethasuserconsent2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 61;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(passwordNeo4D1AFragment, sethasuserconsent, sethasuserconsent2, valueAnimator);
        int i4 = RatingCompatStarStyle + 27;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        ValueAnimator valueAnimator;
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i5 | i6);
        int i11 = i9 | i10;
        int i12 = ~i5;
        int i13 = i9 | (~(i12 | i3)) | i10;
        int i14 = (~(i6 | i5 | i3)) | (~(i7 | i12 | i8));
        int i15 = i5 + i3 + i4 + (1322235619 * i2) + (440487356 * i);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i5) - 2100690944) + ((-281430247) * i3) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i4) + ((-942931968) * i2) + ((-1410334720) * i) + (1251606528 * i16);
        int i18 = (i5 * 157034417) + 1376579869 + (i3 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i4 * 157035401) + (i2 * (-982187909)) + (i * (-1869533796)) + (i16 * (-899022848));
        switch (i17 + (i18 * i18 * (-511311872))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
                int i19 = 2 % 2;
                final setCACert setcacertIEngagementSignalsCallback = passwordNeo4D1AFragment.IEngagementSignalsCallback();
                if (setcacertIEngagementSignalsCallback == null) {
                    return null;
                }
                int i20 = RatingCompat1 + 27;
                RatingCompatStarStyle = i20 % 128;
                int i21 = i20 % 2;
                if (setcacertIEngagementSignalsCallback.asInterface.getAlpha() != 1.0f && ((valueAnimator = passwordNeo4D1AFragment.ITrustedWebActivityServiceDefault) == null || !valueAnimator.isRunning())) {
                    final float scaleX = setcacertIEngagementSignalsCallback.asInterface.getScaleX();
                    final float alpha = setcacertIEngagementSignalsCallback.asInterface.getAlpha();
                    TdsImageView tdsImageView = setcacertIEngagementSignalsCallback.asInterface;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                    tdsImageView.setVisibility(0);
                    ValueAnimator valueAnimator2 = passwordNeo4D1AFragment.receiveFile;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ValueAnimator valueAnimator3 = passwordNeo4D1AFragment.ITrustedWebActivityServiceDefault;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                        int i22 = RatingCompat1 + 55;
                        RatingCompatStarStyle = i22 % 128;
                        int i23 = i22 % 2;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                    valueAnimatorOfFloat.setInterpolator((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1707222315, _string.onNavigationEvent.IAuthTabCallback(), -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
                    valueAnimatorOfFloat.setDuration(400L);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda42
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                            PasswordNeo4D1AFragment.onWarmupCompleted(scaleX, setcacertIEngagementSignalsCallback, alpha, valueAnimator4);
                        }
                    });
                    valueAnimatorOfFloat.start();
                    passwordNeo4D1AFragment.ITrustedWebActivityServiceDefault = valueAnimatorOfFloat;
                }
                return Unit.INSTANCE;
            case 3:
                PasswordNeo4D1AFragment passwordNeo4D1AFragment2 = (PasswordNeo4D1AFragment) objArr[0];
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
                int i24 = 2 % 2;
                int i25 = RatingCompat1 + 61;
                RatingCompatStarStyle = i25 % 128;
                int i26 = i25 % 2;
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                Unit unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1833095356, _string.onNavigationEvent.IAuthTabCallback(), -1833095324, new Object[]{passwordNeo4D1AFragment2, attachapplovinsdk}, iIAuthTabCallback2);
                int i27 = RatingCompat1 + 23;
                RatingCompatStarStyle = i27 % 128;
                int i28 = i27 % 2;
                return unit;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return IAuthTabCallbackStubProxy(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return access000(objArr);
            case 16:
                return access100(objArr);
            case 17:
                return readTypedObject(objArr);
            case 18:
                return ICustomTabsCallback(objArr);
            case 19:
                return extraCallback(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            case 21:
                return writeTypedObject(objArr);
            case 22:
                return onActivityResized(objArr);
            case 23:
                return onMessageChannelReady(objArr);
            case 24:
                return onMinimized(objArr);
            case 25:
                return onPostMessage(objArr);
            case 26:
                return onActivityLayout(objArr);
            case 27:
                return onRelationshipValidationResult(objArr);
            case 28:
                return ICustomTabsCallbackStubProxy(objArr);
            case 29:
                attachAppLovinSdk attachapplovinsdk2 = (attachAppLovinSdk) objArr[0];
                int i29 = 2 % 2;
                int i30 = RatingCompat1 + 103;
                RatingCompatStarStyle = i30 % 128;
                int i31 = i30 % 2;
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                Unit unit2 = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 2063851798, _string.onNavigationEvent.IAuthTabCallback(), -2063851788, new Object[]{attachapplovinsdk2}, iIAuthTabCallback3);
                int i32 = RatingCompatStarStyle + 93;
                RatingCompat1 = i32 % 128;
                int i33 = i32 % 2;
                return unit2;
            case 30:
                return onUnminimized(objArr);
            case 31:
                return ICustomTabsCallbackStub(objArr);
            case 32:
                return ICustomTabsCallbackDefault(objArr);
            case 33:
                return extraCommand(objArr);
            case 34:
                return ICustomTabsCallback_Parcel(objArr);
            case 35:
                return mayLaunchUrl(objArr);
            case 36:
                PasswordNeo4D1AFragment passwordNeo4D1AFragment3 = (PasswordNeo4D1AFragment) objArr[0];
                attachAppLovinSdk attachapplovinsdk3 = (attachAppLovinSdk) objArr[1];
                int i34 = 2 % 2;
                int i35 = RatingCompat1 + 3;
                RatingCompatStarStyle = i35 % 128;
                int i36 = i35 % 2;
                int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
                Unit unit3 = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -616115617, _string.onNavigationEvent.IAuthTabCallback(), 616115643, new Object[]{passwordNeo4D1AFragment3, attachapplovinsdk3}, iIAuthTabCallback4);
                int i37 = RatingCompatStarStyle + 67;
                RatingCompat1 = i37 % 128;
                int i38 = i37 % 2;
                return unit3;
            case 37:
                return isEngagementSignalsApiAvailable(objArr);
            case 38:
                return ICustomTabsService(objArr);
            case 39:
                return newSessionWithExtras(objArr);
            case 40:
                return postMessage(objArr);
            case 41:
                return prefetch(objArr);
            case 42:
                setCACert setcacert = (setCACert) objArr[0];
                PasswordNeo4D1AFragment passwordNeo4D1AFragment4 = (PasswordNeo4D1AFragment) objArr[1];
                int i39 = 2 % 2;
                int i40 = RatingCompatStarStyle + 65;
                RatingCompat1 = i40 % 128;
                int i41 = i40 % 2;
                int[] iArr = new int[2];
                setcacert.asInterface.getLocationOnScreen(iArr);
                KeyBlurImageSurfaceView keyBlurImageSurfaceView = setcacert.onWarmupCompleted;
                int i42 = passwordNeo4D1AFragment4.MediaDescriptionCompat;
                passwordNeo4D1AFragment4.MediaDescriptionCompat = i42 + 1;
                float f = iArr[0];
                TdsImageView tdsImageView2 = setcacert.asInterface;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                float fOnExtraCallback = generateInviteUrl.onExtraCallback(tdsImageView2);
                float f2 = iArr[1];
                TdsImageView tdsImageView3 = setcacert.asInterface;
                Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
                keyBlurImageSurfaceView.setTouchPoint(String.valueOf(i42), f + fOnExtraCallback, f2 + generateInviteUrl.IAuthTabCallback(tdsImageView3));
                passwordNeo4D1AFragment4.AudioAttributesImplApi21Parcelizer();
                int i43 = RatingCompat1 + 69;
                RatingCompatStarStyle = i43 % 128;
                int i44 = i43 % 2;
                return null;
            case 43:
                return newSession(objArr);
            case 44:
                return newAuthTabSession(objArr);
            case 45:
                PasswordNeo4D1AFragment passwordNeo4D1AFragment5 = (PasswordNeo4D1AFragment) objArr[0];
                DialogInterface dialogInterface = (DialogInterface) objArr[1];
                ((Number) objArr[2]).intValue();
                int i45 = 2 % 2;
                int i46 = RatingCompat1 + 105;
                RatingCompatStarStyle = i46 % 128;
                int i47 = i46 % 2;
                passwordNeo4D1AFragment5.IPostMessageService = true;
                dialogInterface.dismiss();
                int i48 = RatingCompatStarStyle + 45;
                RatingCompat1 = i48 % 128;
                int i49 = i48 % 2;
                return null;
            case 46:
                return setEngagementSignalsCallback(objArr);
            case 47:
                return requestPostMessageChannelWithExtras(objArr);
            case 48:
                return requestPostMessageChannel(objArr);
            case 49:
                return prefetchWithMultipleUrls(objArr);
            case 50:
                return receiveFile(objArr);
            case 51:
                return ICustomTabsServiceStub(objArr);
            case 52:
                return updateVisuals(objArr);
            case 53:
                return warmup(objArr);
            case 54:
                return ICustomTabsServiceDefault(objArr);
            case 55:
                Function0 function0 = (Function0) objArr[0];
                int i50 = 2 % 2;
                int i51 = RatingCompat1 + 77;
                RatingCompatStarStyle = i51 % 128;
                int i52 = i51 % 2;
                function0.invoke();
                Unit unit4 = Unit.INSTANCE;
                int i53 = RatingCompat1 + 23;
                RatingCompatStarStyle = i53 % 128;
                int i54 = i53 % 2;
                return unit4;
            case 56:
                setCACert setcacert2 = (setCACert) objArr[0];
                int i55 = 2 % 2;
                int i56 = RatingCompat1 + 25;
                RatingCompatStarStyle = i56 % 128;
                if (i56 % 2 == 0) {
                    TdsImageView tdsImageView4 = setcacert2.notifyNotificationWithChannel;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
                    tdsImageView4.setVisibility(23);
                } else {
                    TdsImageView tdsImageView5 = setcacert2.notifyNotificationWithChannel;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView5, "");
                    tdsImageView5.setVisibility(8);
                }
                Unit unit5 = Unit.INSTANCE;
                int i57 = RatingCompat1 + 115;
                RatingCompatStarStyle = i57 % 128;
                int i58 = i57 % 2;
                return unit5;
            case 57:
                int i59 = 2 % 2;
                int i60 = RatingCompatStarStyle + 107;
                RatingCompat1 = i60 % 128;
                int i61 = i60 % 2;
                deprecated_dns deprecated_dnsVarRatingCompat1 = RatingCompat1();
                int i62 = RatingCompat1 + 125;
                RatingCompatStarStyle = i62 % 128;
                int i63 = i62 % 2;
                return deprecated_dnsVarRatingCompat1;
            case 58:
                int i64 = 2 % 2;
                int i65 = RatingCompatStarStyle + 97;
                RatingCompat1 = i65 % 128;
                int i66 = i65 % 2;
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
                int i67 = RatingCompatStarStyle + 125;
                RatingCompat1 = i67 % 128;
                int i68 = i67 % 2;
                return Integer.valueOf(iMediaBrowserCompatMediaItem);
            case 59:
                return validateRelationship(objArr);
            case 60:
                return IEngagementSignalsCallback(objArr);
            case 61:
                return access200(objArr);
            case 62:
                return ICustomTabsServiceStubProxy(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 29;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -12143258, iIAuthTabCallback2, 12143264, new Object[]{passwordNeo4D1AFragment, commonModule_setLeftEdgeTouchEnabled}, iIAuthTabCallback);
        int i4 = RatingCompatStarStyle + 111;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 105;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1392744394, iIAuthTabCallback2, 1392744449, new Object[]{function0}, iIAuthTabCallback);
        int i4 = RatingCompatStarStyle + 89;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 63;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 61;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 97;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(setcacert);
        int i4 = RatingCompatStarStyle + 5;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 95;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(setcacert, f);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(setcacert, f);
        int i3 = RatingCompat1 + 89;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 77;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setcacert, passwordNeo4D1AFragment, f, f2, f3);
        int i4 = RatingCompat1 + 87;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 83;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackStubProxy(passwordNeo4D1AFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(passwordNeo4D1AFragment);
        int i3 = RatingCompatStarStyle + 69;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return unitICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, Function0 function0) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 105;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(passwordNeo4D1AFragment, function0);
        int i4 = RatingCompat1 + 51;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 83;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(passwordNeo4D1AFragment, commonModule_setLeftEdgeTouchEnabled, dialogInterface);
        int i4 = RatingCompatStarStyle + 31;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = RatingCompat1 + 89;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1988367551, iIAuthTabCallback2, -1988367502, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
            int i3 = 58 / 0;
        } else {
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 1988367551, iIAuthTabCallback5, -1988367502, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback4);
        }
        int i4 = RatingCompat1 + 17;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 103;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(passwordNeo4D1AFragment, setcacert);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(passwordNeo4D1AFragment, setcacert);
        int i3 = RatingCompat1 + 117;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 25;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(passwordNeo4D1AFragment, setcacert, f);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = RatingCompatStarStyle + 67;
        RatingCompat1 = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 23;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(passwordNeo4D1AFragment, setcacert, bitmap);
        int i4 = RatingCompat1 + 53;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 33;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 105;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(setcacert, passwordNeo4D1AFragment);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, float f2, setCACert setcacert, ValueAnimator valueAnimator) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 31;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(passwordNeo4D1AFragment, f, f2, setcacert, valueAnimator);
        int i4 = RatingCompat1 + 97;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = RatingCompat1 + 115;
        RatingCompatStarStyle = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        onNavigationEvent(passwordNeo4D1AFragment, setcacert, view, i, i2, i3, i4);
        if (i7 == 0) {
            obj.hashCode();
            throw null;
        }
        int i8 = RatingCompat1 + 97;
        RatingCompatStarStyle = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onMessageChannelReady(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 79;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceDefault = ICustomTabsServiceDefault(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 113;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsServiceDefault;
    }

    public static /* synthetic */ Unit onMinimized(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 21;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPrefetch = prefetch(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 39;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitPrefetch;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 17;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 958392890, iIAuthTabCallback2, -958392834, new Object[]{setcacert}, iIAuthTabCallback);
        }
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 51;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(setcacert, f);
        }
        IAuthTabCallback(setcacert, f);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCACert setcacert, Function0 function0) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 13;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setcacert, function0);
        int i4 = RatingCompat1 + 83;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 77;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(setcacert, passwordNeo4D1AFragment, f, f2, f3);
        }
        onWarmupCompleted(setcacert, passwordNeo4D1AFragment, f, f2, f3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, int i, float f) throws Throwable {
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 93;
        RatingCompat1 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setcacert, passwordNeo4D1AFragment, i, f);
        int i5 = RatingCompatStarStyle + 1;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 117;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(passwordNeo4D1AFragment, setDetectableSize);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 17;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordNeo4D1AFragment, isjsontypeignore);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = RatingCompat1 + 9;
        RatingCompatStarStyle = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 63;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(passwordNeo4D1AFragment, setcacert, f);
        int i4 = RatingCompatStarStyle + 121;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ setHasUserConsent onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 47;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            onRelationshipValidationResult(passwordNeo4D1AFragment);
            throw null;
        }
        setHasUserConsent sethasuserconsentOnRelationshipValidationResult = onRelationshipValidationResult(passwordNeo4D1AFragment);
        int i3 = RatingCompat1 + 39;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
        return sethasuserconsentOnRelationshipValidationResult;
    }

    public static /* synthetic */ Unit onPostMessage(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 63;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitUpdateVisuals = updateVisuals(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 93;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unitUpdateVisuals;
        }
        throw null;
    }

    public static /* synthetic */ Unit onRelationshipValidationResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 23;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 21;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsServiceStub;
    }

    public static /* synthetic */ Unit onTransact(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 37;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(passwordNeo4D1AFragment);
        int i4 = RatingCompat1 + 1;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallbackDefault;
    }

    public static /* synthetic */ Unit onTransact(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 71;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitMayLaunchUrl = mayLaunchUrl(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompatStarStyle + 43;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unitMayLaunchUrl;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        float fFloatValue3 = ((Number) objArr[3]).floatValue();
        float fFloatValue4 = ((Number) objArr[4]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[5];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 85;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(passwordNeo4D1AFragment, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, valueAnimator);
        int i4 = RatingCompatStarStyle + 101;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final float onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat1 + 75;
        int i4 = i3 % 128;
        RatingCompatStarStyle = i4;
        int i5 = i3 % 2;
        if (i == 0) {
            return 0.0f;
        }
        switch (i) {
            case 2:
                return 0.33333334f;
            case 3:
                int i6 = i4 + 55;
                RatingCompat1 = i6 % 128;
                if (i6 % 2 == 0) {
                    return 0.041666668f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 4:
                return 0.20833334f;
            case 5:
                return 0.375f;
            case 6:
                return 0.083333336f;
            case 7:
                return 0.25f;
            case 8:
                return 0.4166667f;
            case 9:
                return 0.2916667f;
            case 10:
                int i7 = i4 + 115;
                RatingCompat1 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 27 / 0;
                }
                return 0.45833334f;
            default:
                return 0.16666667f;
        }
    }

    public static /* synthetic */ int onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 59;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iOnMinimized = onMinimized(passwordNeo4D1AFragment);
        int i4 = RatingCompatStarStyle + 37;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return iOnMinimized;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 47;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        int i5 = RatingCompatStarStyle + 89;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setCACert setcacert) {
        Unit unit;
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 25;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {setcacert};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        if (i3 != 0) {
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1816669716, iIAuthTabCallback2, 1816669763, objArr, iIAuthTabCallback);
            int i4 = 94 / 0;
        } else {
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            unit = (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1816669716, iIAuthTabCallback3, 1816669763, objArr, iIAuthTabCallback);
        }
        int i5 = RatingCompat1 + 91;
        RatingCompatStarStyle = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, int i, View view) throws Throwable {
        int i2 = 2 % 2;
        int i3 = RatingCompat1 + 121;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(passwordNeo4D1AFragment, i, view);
        int i5 = RatingCompatStarStyle + 65;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 83;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 85;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsServiceStubProxy;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, List list) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 91;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(passwordNeo4D1AFragment, setcacert, list);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = RatingCompatStarStyle + 1;
        RatingCompat1 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(float f, float f2, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f3, setCACert setcacert, float f4, float f5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 89;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(f, f2, passwordNeo4D1AFragment, f3, setcacert, f4, f5, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(float f, setCACert setcacert, float f2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 115;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(f, setcacert, f2, valueAnimator);
        int i4 = RatingCompatStarStyle + 119;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, Interpolator interpolator, float f2, float f3, float f4, View[] viewArr, float f5, String str, float f6, float f7, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 89;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {passwordNeo4D1AFragment, Float.valueOf(f), interpolator, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), viewArr, Float.valueOf(f5), str, Float.valueOf(f6), Float.valueOf(f7), valueAnimator};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -513801093, iIAuthTabCallback2, 513801114, objArr, iIAuthTabCallback);
        int i4 = RatingCompat1 + 55;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, Interpolator interpolator, setCACert setcacert, Interpolator interpolator2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 7;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(passwordNeo4D1AFragment, f, interpolator, setcacert, interpolator2, valueAnimator);
        int i4 = RatingCompat1 + 71;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 101;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 5039234, iIAuthTabCallback2, -5039207, new Object[]{passwordNeo4D1AFragment, view}, iIAuthTabCallback);
            return;
        }
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 5039234, iIAuthTabCallback5, -5039207, new Object[]{passwordNeo4D1AFragment, view}, iIAuthTabCallback4);
        int i3 = 43 / 0;
    }

    public static /* synthetic */ void onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 75;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(passwordNeo4D1AFragment, setcacert, valueAnimator);
        int i4 = RatingCompat1 + 1;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 7;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {passwordNeo4D1AFragment, dialogInterface, Integer.valueOf(iIntValue)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        if (i3 != 0) {
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1832499762, iIAuthTabCallback2, 1832499807, objArr2, iIAuthTabCallback);
            int i4 = 66 / 0;
        } else {
            onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1832499762, iIAuthTabCallback2, 1832499807, objArr2, iIAuthTabCallback);
        }
        int i5 = RatingCompat1 + 81;
        RatingCompatStarStyle = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ deprecated_dns receiveFile() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 67;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return RatingCompatStarStyle();
        }
        RatingCompatStarStyle();
        throw null;
    }

    public static /* synthetic */ Interpolator requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 45;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            return (Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1043652653, iIAuthTabCallback2, 1043652665, new Object[0], iIAuthTabCallback);
        }
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        throw null;
    }

    private static /* synthetic */ Object requestPostMessageChannel(Object[] objArr) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 21;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer();
            throw null;
        }
        isNullSentinel isnullsentinelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i3 = RatingCompat1 + 111;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        return isnullsentinelRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ deprecated_dns requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 79;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            return (deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -190449062, iIAuthTabCallback2, 190449086, new Object[0], iIAuthTabCallback);
        }
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        int i3 = 5 / 0;
        return (deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, -190449062, iIAuthTabCallback5, 190449086, new Object[0], iIAuthTabCallback4);
    }

    public static /* synthetic */ Interpolator setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 39;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        Interpolator interpolator = (Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1080095086, iIAuthTabCallback2, 1080095140, new Object[0], iIAuthTabCallback);
        int i4 = RatingCompatStarStyle + 81;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return interpolator;
    }

    public static /* synthetic */ Unit writeTypedObject(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 57;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls(passwordNeo4D1AFragment, attachapplovinsdk);
        int i4 = RatingCompat1 + 39;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unitPrefetchWithMultipleUrls;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ setCACert $this_run;
        int label;
        final /* synthetic */ PasswordNeo4D1AFragment this$0;
        private static final byte[] $$a = {66, 42, 112, 97};
        private static final int $$b = 107;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onExtraCallback = 478309101;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, byte r7, byte r8) {
            /*
                int r6 = r6 * 3
                int r0 = 1 - r6
                int r7 = r7 * 4
                int r7 = 105 - r7
                byte[] r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.onWarmupCompleted.$$a
                int r8 = r8 * 4
                int r8 = 3 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L19
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2f
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                int r8 = r8 + 1
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2f:
                int r8 = -r8
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onWarmupCompleted.$$c(short, byte, byte):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$this_run = setcacert;
            this.this$0 = passwordNeo4D1AFragment;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$this_run, this.this$0, access13800Var);
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = 93 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            }
            int i4 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* renamed from: viva.republica.toss.password.PasswordNeo4D1AFragment$onWarmupCompleted$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 1;
            private static int[] onExtraCallbackWithResult = {1132397113, 1228958757, -281068595, 719425205, -168163114, 1933652157, -78510677, -1970332780, -304239375, -694213071, -1587406750, 2023550810, 1284087183, 599372615, -212567740, 1016863527, -984108807, 344714196};
            private static int onWarmupCompleted;
            final /* synthetic */ setCACert $this_run;
            int label;
            final /* synthetic */ PasswordNeo4D1AFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$this_run = setcacert;
                this.this$0 = passwordNeo4D1AFragment;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$this_run, this.this$0, access13800Var);
                int i2 = onWarmupCompleted + 1;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    onExtraCallbackWithResult(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = onExtraCallback + 85;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 55;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: viva.republica.toss.password.PasswordNeo4D1AFragment$onWarmupCompleted$5$onWarmupCompleted, reason: collision with other inner class name */
            public static final class ViewOnLayoutChangeListenerC0030onWarmupCompleted implements View.OnLayoutChangeListener {
                private static int $10 = 0;
                private static int $11 = 1;
                private static int IAuthTabCallbackDefault = 1;
                private static int onNavigationEvent;
                final /* synthetic */ setCACert onExtraCallback;
                final /* synthetic */ PasswordNeo4D1AFragment onWarmupCompleted;
                private static char[] IAuthTabCallback = {51245, 64977, 64896, 51244, 51240, 64907, 64906, 64903, 64981, 64897, 64899, 64900, 51242, 64912, 51243, 64898};
                private static char onExtraCallbackWithResult = 51245;

                public ViewOnLayoutChangeListenerC0030onWarmupCompleted(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
                    this.onExtraCallback = setcacert;
                    this.onWarmupCompleted = passwordNeo4D1AFragment;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
                    String strIntern;
                    int i9 = 2 % 2;
                    view.removeOnLayoutChangeListener(this);
                    if (this.onExtraCallback.ICustomTabsService_Parcel.getWidth() != 0 && this.onExtraCallback.ICustomTabsService_Parcel.getHeight() != 0) {
                        setCACert setcacert = this.onExtraCallback;
                        View view2 = setcacert.onExtraCallbackWithResult;
                        ConstraintLayout constraintLayout = setcacert.ICustomTabsService_Parcel;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                        BitmapDrawable bitmapDrawable = null;
                        Bitmap bitmapIAuthTabCallback = C_.IAuthTabCallback(constraintLayout, (Bitmap.Config) null, 1, (Object) null);
                        if (bitmapIAuthTabCallback != null) {
                            Resources resources = this.onExtraCallback.onExtraCallbackWithResult.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "");
                            bitmapDrawable = new BitmapDrawable(resources, bitmapIAuthTabCallback);
                        }
                        view2.setBackground(bitmapDrawable);
                        View view3 = this.onExtraCallback.onExtraCallbackWithResult;
                        if (!PasswordNeo4D1AFragment.extraCallbackWithResult(this.onWarmupCompleted)) {
                            Object[] objArr = new Object[1];
                            a(new char[]{14, 5, 6, 11, 11, 14, 1, '\n', 13929}, (byte) (114 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), View.getDefaultSize(0, 0) + 9, objArr);
                            strIntern = ((String) objArr[0]).intern();
                        } else {
                            int i10 = IAuthTabCallbackDefault + 5;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 != 0) {
                                Object[] objArr2 = new Object[1];
                                a(new char[]{15, '\t', 4, '\t', '\n', '\t', '\n', '\t', 13939}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 29) + 112), 24 % Color.alpha(0), objArr2);
                                strIntern = ((String) objArr2[0]).intern();
                            } else {
                                Object[] objArr3 = new Object[1];
                                a(new char[]{15, '\t', 4, '\t', '\n', '\t', '\n', '\t', 13939}, (byte) (119 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.alpha(0) + 9, objArr3);
                                strIntern = ((String) objArr3[0]).intern();
                            }
                            int i11 = IAuthTabCallbackDefault + 99;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                        }
                        view3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(strIntern)));
                        PasswordNeo4D1AFragment.onWarmupCompleted(this.onWarmupCompleted, true);
                    }
                    int i13 = IAuthTabCallbackDefault + 9;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                }

                private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
                    int i2;
                    Object obj;
                    int i3 = 2 % 2;
                    DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
                    char[] cArr2 = IAuthTabCallback;
                    char c = '0';
                    Object obj2 = null;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i4 = 0;
                        while (i4 < length) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (Process.myTid() >> 22) + 26, AndroidCharacter.getMirror(c) + 23091, -2137011959, false, "z", new Class[]{Integer.TYPE});
                                }
                                cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                                i4++;
                                c = '0';
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr2 = cArr3;
                    }
                    Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 26 - TextUtils.indexOf("", "", 0, 0), 23139 - View.getDefaultSize(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                        while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                            defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                                int i5 = $11 + 91;
                                $10 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback + b);
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >>> b);
                                } else {
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                                }
                                obj = obj2;
                            } else {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16802040), 74 - TextUtils.indexOf("", ""), (ViewConfiguration.getTapTimeout() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    int i6 = $11 + 39;
                                    $10 = i6 % 128;
                                    int i7 = i6 % 2;
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 29 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        int i9 = $11 + 31;
                                        $10 = i9 % 128;
                                        int i10 = i9 % 2;
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                                    } else {
                                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                    }
                                }
                            }
                            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                            obj2 = obj;
                        }
                    }
                    for (int i15 = 0; i15 < i; i15++) {
                        cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                    }
                    objArr[0] = new String(cArr4);
                }
            }

            private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = onExtraCallbackWithResult;
                int i4 = -1469660336;
                int i5 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), View.MeasureSpec.getSize(0) + 72, 8848 - View.MeasureSpec.getMode(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i6++;
                            i4 = -1469660336;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = onExtraCallbackWithResult;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i7 = 0;
                    while (i7 < length3) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(iArr5[i7]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i5, i5), (ViewConfiguration.getTapTimeout() >> 16) + 72, 8849 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i7++;
                        i5 = 0;
                    }
                    i2 = i5;
                    iArr5 = iArr6;
                } else {
                    i2 = 0;
                }
                System.arraycopy(iArr5, i2, iArr4, i2, length2);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
                int i8 = $11 + 11;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 / 4;
                }
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                    int i10 = $10 + 119;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                    cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                    cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                    cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                    int i12 = 0;
                    for (int i13 = 16; i12 < i13; i13 = 16) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 38, 10301 - Color.green(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i12++;
                        int i14 = $11 + 19;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15 = 4 / 4;
                        }
                    }
                    int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                    int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                    cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                    cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4033), (ViewConfiguration.getTapTimeout() >> 16) + 78, 7398 - TextUtils.getTrimmedLength(""), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i19 = $11 + 11;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 530
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onWarmupCompleted.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0161  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onWarmupCompleted.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(ExpandableListView.getPackedPositionGroup(0L) + 47, 2 - View.resolveSizeAndState(0, 0, 0), new char[]{5, 7, '\t', 18, '\r', 24, 25, 19, 22, 19, 7, 65476, '\f', 24, '\r', 27, 65476, 65483, '\t', 15, 19, 26, 18, '\r', 65483, 65476, '\t', 22, 19, '\n', '\t', 6, 65476, 65483, '\t', 17, 25, 23, '\t', 22, 65483, 65476, 19, 24, 65476, 16, 16}, true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 288, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$this_run, this.this$0, null);
                this.label = 1;
                if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass5, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int[] onWarmupCompleted = {-89936751, 621180126, -9503627, -444271984, -483772588, -766668396, 389316204, 644164370, 1214389605, 1962394378, 55796543, -544266666, 1689696005, 114393390, -306451241, 1989391240, -1530491685, 202953417};
        final /* synthetic */ setCACert $this_run;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(setCACert setcacert, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$this_run = setcacert;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$this_run, access13800Var);
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 43 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = 94 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static long IAuthTabCallback = 3044215920364274465L;
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ setCACert $this_run;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(setCACert setcacert, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$this_run = setcacert;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.$this_run, access13800Var);
                int i2 = onExtraCallback + 71;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onextracallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 89;
                onExtraCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Bitmap> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onExtraCallback(findresandmsg, access13800Var);
                }
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) throws Throwable {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                    int i4 = 11 / 0;
                } else {
                    objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = onExtraCallback + 99;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 23 / 0;
                }
                return objInvokeSuspend;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
                timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                int i3 = $10 + 81;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                    int i5 = $11 + 19;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                    int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Color.blue(0)), 84 - View.resolveSize(0, 0), 21234 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 14185), 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
                objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                if (this.label != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{9700, 9607, 46925, 5209, 3841, 10768, 25711, 763, 50544, 12248, 17720, 8971, 58539, 52906, 9726, 50060, 34701, 60777, 1610, 57492, 42772, 36306, 59158, 33057, 17935, 44174, 51170, 42555, 25083, 19265, 41125, 18137, 359, 27199, 33146, 26436, 8292, 2807, 25034, 1091, 50136, 10732, 17044, 9380, 58014, 51223, 9038, 50667, 33329, 59594, 3114}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = i3 + 103;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                AuthPinBackgroundView authPinBackgroundView = this.$this_run.getSmallIconBitmap;
                Intrinsics.checkNotNullExpressionValue(authPinBackgroundView, "");
                return C_.IAuthTabCallback(authPinBackgroundView, (Bitmap.Config) null, 1, (Object) null);
            }
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onWarmupCompleted;
            int i4 = -1469660336;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int i7 = $10 + 63;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $11 + 107;
                    $10 = i10 % 128;
                    if (i10 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 72 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.red(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr3[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.blue(0) + 72, 8847 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    }
                    i9++;
                    i2 = 2;
                    i4 = -1469660336;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onWarmupCompleted;
            char c = '0';
            if (iArr5 != null) {
                int i11 = $11 + 111;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i13 = 0;
                while (i13 < length3) {
                    Object[] objArr4 = new Object[i5];
                    objArr4[i6] = Integer.valueOf(iArr5[i13]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i6) == 0L ? 0 : -1)) + 72, 8847 - TextUtils.lastIndexOf("", c, i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i13++;
                    c = '0';
                    i5 = 1;
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            int i14 = i6;
            System.arraycopy(iArr5, i14, iArr4, i14, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i14;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i14] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i15 = 0;
                for (int i16 = 16; i15 < i16; i16 = 16) {
                    int i17 = $10 + 27;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.combineMeasuredStates(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 40, View.resolveSizeAndState(0, 0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i15++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 4033), 78 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0') + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i14 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 115;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{1479572701, 1288474361, 438380684, -1772782703, -1487030939, -1825753902, -1141203719, -615650447, -1917325487, -2086069120, -1313648901, 2078023672, 723873774, 1124159345, 288579731, 560469286, -715019936, -1989550686, 75620070, -645114400, -1425381363, 642518770, -1813423686, 841244124}, View.MeasureSpec.makeMeasureSpec(0, 0) + 47, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = i4 + 19;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallback onextracallback = new onExtraCallback(this.$this_run, null);
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                if (obj == objOnWarmupCompleted) {
                    int i7 = IAuthTabCallback + 55;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            this.$this_run.notifyNotificationWithChannel.setImageBitmap((Bitmap) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallbackStub implements Animator.AnimatorListener {
        final /* synthetic */ setCACert IAuthTabCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public IAuthTabCallbackStub(setCACert setcacert) {
            this.IAuthTabCallback = setcacert;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(PasswordNeo4D1AFragment.this);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(this.IAuthTabCallback, null), 3, (Object) null);
            }
        }
    }

    public static final class access100 implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public access100() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PasswordNeo4D1AFragment passwordNeo4D1AFragment = PasswordNeo4D1AFragment.this;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(passwordNeo4D1AFragment);
            getPackageType getpackagetypeOnNavigationEvent = textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null ? maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, PasswordNeo4D1AFragment.this.new access000(null), 3, (Object) null) : null;
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1068546701, iIAuthTabCallback2, 1068546715, new Object[]{passwordNeo4D1AFragment, getpackagetypeOnNavigationEvent}, iIAuthTabCallback);
        }
    }

    public static final class extraCallbackWithResult implements Animator.AnimatorListener {
        final /* synthetic */ setCACert IAuthTabCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        public extraCallbackWithResult(setCACert setcacert) {
            this.IAuthTabCallback = setcacert;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Iterator it = PasswordNeo4D1AFragment.readTypedObject(PasswordNeo4D1AFragment.this).iterator();
            while (it.hasNext()) {
                ((AuthPinDotView) it.next()).asBinder();
            }
            this.IAuthTabCallback.read.setState(GradientButtonView.onExtraCallback.ERROR);
        }
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, setCACert> {
        private static long onExtraCallback;
        private static int onExtraCallbackWithResult;
        public static final onExtraCallbackWithResult onNavigationEvent;
        private static char[] onWarmupCompleted;
        private static final byte[] $$a = {15, -112, -70, -94};
        private static final int $$b = 231;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        private static int IAuthTabCallback = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, byte r7, short r8) {
            /*
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r7 = r7 * 2
                int r0 = 1 - r7
                byte[] r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.onExtraCallbackWithResult.$$a
                int r6 = r6 * 4
                int r6 = r6 + 97
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L19
                r4 = r7
                r6 = r8
                r3 = r2
                goto L2c
            L19:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1d:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L28:
                int r3 = r3 + 1
                r4 = r1[r6]
            L2c:
                int r4 = -r4
                int r8 = r8 + r4
                int r6 = r6 + 1
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onExtraCallbackWithResult.$$c(int, byte, short):java.lang.String");
        }

        static {
            onExtraCallbackWithResult = 1;
            onNavigationEvent();
            onNavigationEvent = new onExtraCallbackWithResult();
            int i = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        onExtraCallbackWithResult() throws Throwable {
            Object[] objArr = new Object[1];
            a(ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 5, (char) (TextUtils.getCapsMode("", 0, 0) + 36651), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(3 - ImageFormat.getBitsPerPixel(0), 90 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (40915 - AndroidCharacter.getMirror('0')), objArr2);
            super(1, setCACert.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x019e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r28, int r29, char r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 423
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onExtraCallbackWithResult.a(int, int, char, java.lang.Object[]):void");
        }

        public final setCACert IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 5;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return setCACert.onExtraCallbackWithResult(view);
            }
            Intrinsics.checkNotNullParameter(view, "");
            setCACert.onExtraCallbackWithResult(view);
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 7;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            setCACert setcacertIAuthTabCallback = IAuthTabCallback((View) obj);
            int i4 = IAuthTabCallbackStub + 75;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 55 / 0;
            }
            return setcacertIAuthTabCallback;
        }

        static void onNavigationEvent() {
            onWarmupCompleted = new char[]{25245, 25883, 28043, 29756, 29205, 30099, 32003, 25780, 27755, 22522, 24408, 18114, 20091, 12784, 14746, 8465, 10383, 4209, 7095, 861, 2754, 62045, 62898, 64854, 58650, 60547, 54302, 57319, 51046, 52990, 46675, 47553, 41325, 43247, 37086, 38934, 33714, 35626, 29368, 31314, 32207, 25983, 27898, 21613, 23632, 18326, 20282, 13995, 15928, 8593, 10565, 4341, 6259, 1003, 2975, 62217, 64189, 57890, 58784, 60754, 54472, 56381, 51139, 53114, 46874, 48777, 42556, 43425, 37209, 39118, 32893, 35825, 29552, 31493, 25230, 27139, 28077, 21798, 23803, 17501, 20420, 14122, 16101, 9925, 11782, 4520, 6452, 174, 2135, 62415, 64327, 58107, 59956};
            onExtraCallback = 2884101450124356185L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r28, char r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.b(int, char, int, java.lang.Object[]):void");
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 52149;
        private static int IAuthTabCallbackStub = 1;
        private static char onExtraCallback = 64133;
        private static char onExtraCallbackWithResult = 63346;
        private static char onNavigationEvent = 59502;
        private static int onWarmupCompleted;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 111;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = PasswordNeo4D1AFragment.this.new asInterface(access13800Var);
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return asinterface;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallbackStub + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
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
                int i4 = $10 + 77;
                $11 = i4 % 128;
                int i5 = 58224;
                if (i4 % 2 == 0) {
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >> 1];
                } else {
                    cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                }
                int i6 = i3;
                while (i6 < 16) {
                    int i7 = $10 + 1;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i10 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallback);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[1] = Integer.valueOf(i9);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char c3 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                            int iKeyCodeFromString = 12434 - KeyEvent.keyCodeFromString("");
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, trimmedLength, iKeyCodeFromString, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6++;
                        int i11 = $10 + 121;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Drawable.resolveOpacity(0, 0)), 14 - ExpandableListView.getPackedPositionType(0L), 19902 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(2000L, this) == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallbackStub + 89;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{51727, 6817, 31311, 36361, 597, 2086, 50092, 60096, 37552, 24998, 8021, 61101, 3509, 46952, 36205, 52109, 53017, 51565, 2685, 16576, 9515, 21705, 10190, 53033, 51804, 16714, 11157, 45455, 619, 7386, 36205, 52109, 55332, 52788, 63465, 7985, 39961, 31765, 14878, 3687, 34790, 37911, 37381, 57644, 52863, 45396, 28416, 33512}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 48, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            setCACert setcacertWriteTypedObject = PasswordNeo4D1AFragment.writeTypedObject(PasswordNeo4D1AFragment.this);
            if (setcacertWriteTypedObject != null) {
                int i5 = onWarmupCompleted + 113;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                GradientButtonView gradientButtonView = setcacertWriteTypedObject.read;
                if (gradientButtonView != null) {
                    gradientButtonView.IAuthTabCallbackStub();
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 83;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 74 / 0;
            }
            return unit;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        getPackageType getpackagetype = (getPackageType) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle;
        int i3 = i2 + 105;
        RatingCompat1 = i3 % 128;
        int i4 = i3 % 2;
        passwordNeo4D1AFragment.RatingCompat = getpackagetype;
        int i5 = i2 + 11;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ boolean extraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 59;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {passwordNeo4D1AFragment};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        if (i3 != 0) {
            ((Boolean) onExtraCallbackWithResult(iIAuthTabCallback4, iIAuthTabCallback3, -1112973365, iIAuthTabCallback2, 1112973424, objArr, iIAuthTabCallback)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(iIAuthTabCallback4, iIAuthTabCallback3, -1112973365, iIAuthTabCallback2, 1112973424, objArr, iIAuthTabCallback)).booleanValue();
        int i4 = RatingCompat1 + 13;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static final /* synthetic */ void onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, boolean z) {
        int i = 2 % 2;
        int i2 = RatingCompat1;
        int i3 = i2 + 73;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        passwordNeo4D1AFragment.IPostMessageServiceDefault = z;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 11;
        RatingCompatStarStyle = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ List readTypedObject(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 5;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            passwordNeo4D1AFragment.onVerticalScrollEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<AuthPinDotView> listOnVerticalScrollEvent = passwordNeo4D1AFragment.onVerticalScrollEvent();
        int i3 = RatingCompat1 + 75;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        return listOnVerticalScrollEvent;
    }

    public static final /* synthetic */ setCACert writeTypedObject(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 79;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        setCACert setcacertIEngagementSignalsCallback = passwordNeo4D1AFragment.IEngagementSignalsCallback();
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = RatingCompat1 + 55;
        RatingCompatStarStyle = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return setcacertIEngagementSignalsCallback;
    }

    private final setCACert IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 51;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        setCACert setcacert = (setCACert) this.onRelationshipValidationResult.onNavigationEvent(this, onExtraCallbackWithResult[0]);
        int i4 = RatingCompat1 + 109;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return setcacert;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $myManual;
        int label;
        final /* synthetic */ PasswordNeo4D1AFragment this$0;
        private static final byte[] $$a = {62, 54, 60, 44};
        private static final int $$b = 182;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int IAuthTabCallback = 1;
        private static long onExtraCallbackWithResult = 7798559133331975163L;
        private static int onExtraCallback = -1776194565;
        private static char onWarmupCompleted = 12738;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, short r7, byte r8) {
            /*
                byte[] r0 = viva.republica.toss.password.PasswordNeo4D1AFragment.IAuthTabCallbackStubProxy.$$a
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r6 = 110 - r6
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r6
                r6 = r7
                r4 = r2
                goto L25
            L13:
                r3 = r2
            L14:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                int r8 = r8 + 1
                if (r4 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r3 = r0[r8]
            L25:
                int r6 = r6 + r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.IAuthTabCallbackStubProxy.$$c(byte, short, byte):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(boolean z, PasswordNeo4D1AFragment passwordNeo4D1AFragment, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$myManual = z;
            this.this$0 = passwordNeo4D1AFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(this.$myManual, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackStubProxy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 117;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i3 = $10 + 5;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 4;
            }
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i5 = $10 + 99;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 42 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 44, Color.red(0) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 50 - TextUtils.getCapsMode("", 0, 0), 22939 - (ViewConfiguration.getLongPressTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, 12577 - ExpandableListView.getPackedPositionType(0L), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallback ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                long j = !this.$myManual ? 200L : 0L;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 37;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1256083293 - TextUtils.lastIndexOf("", '0'), new char[]{20769, 61619, 4353, 60644, 55831, 11939, 56225, 14548, 58631, 50393, 50677, 38701, 56757, 23119, 19908, 57067, 47946, 59810, 37071, 41041, 44993, 40609, 42408, 12889, 13164, 42732, 25484, 18022, 4055, 56978, 54886, 20094, 14540, 22288, 3042, 62450, 11821, 16197, 60998, 63726, 57643, 15564, 57770, 17658, 8241, 21048, 39052}, new char[]{0, 0, 0, 0}, new char[]{24182, 56911, 6474, 20184}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            Iterator it = PasswordNeo4D1AFragment.readTypedObject(this.this$0).iterator();
            while (it.hasNext()) {
                int i5 = IAuthTabCallback + 89;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                ((AuthPinDotView) it.next()).onExtraCallback();
            }
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 31;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;
        private static final byte[] $$a = {35, -11, -97, -73};
        private static final int $$b = 3;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult = 8315471965130727649L;
        private static int onWarmupCompleted = -1776194565;
        private static char onNavigationEvent = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, short r7, byte r8) {
            /*
                byte[] r0 = viva.republica.toss.password.PasswordNeo4D1AFragment.getInterfaceDescriptor.$$a
                int r8 = r8 * 3
                int r1 = 1 - r8
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r6 = r6 + 109
                byte[] r1 = new byte[r1]
                r2 = 0
                int r8 = 0 - r8
                if (r0 != 0) goto L17
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                r5 = r7
                r7 = r6
                r6 = r5
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                r4 = r0[r6]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r5
            L2d:
                int r4 = -r4
                int r7 = r7 + 1
                int r6 = r6 + r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.getInterfaceDescriptor.$$c(int, short, byte):java.lang.String");
        }

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getInterfaceDescriptor getinterfacedescriptorCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = getinterfacedescriptorCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 50 / 0;
            } else {
                objInvokeSuspend = getinterfacedescriptorCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = IAuthTabCallback + 19;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = PasswordNeo4D1AFragment.this.new getInterfaceDescriptor(access13800Var);
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return getinterfacedescriptor;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 59 / 0;
            }
            int i5 = IAuthTabCallback + 69;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $10 + 31;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) ($$b - 2);
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 43 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1452, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char cCombineMeasuredStates = (char) (49123 - View.combineMeasuredStates(0, 0));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 44;
                        int i5 = 1495 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        byte b3 = (byte) ($$b - 3);
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cCombineMeasuredStates, tapTimeout, i5, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23972), 49 - ImageFormat.getBitsPerPixel(0), 22939 - TextUtils.getTrimmedLength(""), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 45848), AndroidCharacter.getMirror('0') - 19, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i6 = $10 + 7;
            $11 = i6 % 128;
            if (i6 % 2 != 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 25;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((char) View.resolveSize(0, 0), (-1762728860) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{58492, 47851, 31334, 21725, 63266, 37329, 37495, 62095, 2187, 11442, 20461, 8176, 3219, 29925, 4940, 23613, 37966, 56698, 58952, 48530, 17038, 14882, 49360, 41813, 55391, 51705, 36255, 36160, 32055, 6540, 42236, 44732, 40398, '~', 931, 44117, 9515, 7216, 42012, 1402, 54680, 10132, 55313, 61587, 53778, 33067, 6068}, new char[]{19226, 31607, 29063, 8028}, new char[]{26018, 61156, 58262, 17862}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallback + 125;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Object[] objArr2 = {PasswordNeo4D1AFragment.this, null, 1, null};
            PasswordFragment.onNavigationEvent(1882857528, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1882857521, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2);
            PasswordNeo4D1AFragment passwordNeo4D1AFragment = PasswordNeo4D1AFragment.this;
            onRenderReady.onExtraCallbackWithResult(passwordNeo4D1AFragment, passwordNeo4D1AFragment.getString(R.string.password_timeout));
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 87;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;
        private static final byte[] $$a = {1, -9, -86, 35};
        private static final int $$b = 71;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int IAuthTabCallback = 478309034;

        private static String $$c(short s, short s2, int i) {
            int i2 = (s * 3) + 105;
            int i3 = s2 * 4;
            byte[] bArr = $$a;
            int i4 = (i * 3) + 4;
            byte[] bArr2 = new byte[i3 + 1];
            int i5 = -1;
            if (bArr == null) {
                i4++;
                i2 += i4;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i3) {
                    return new String(bArr2, 0);
                }
                byte b = bArr[i4];
                i4++;
                i2 += b;
            }
        }

        access000(access13800<? super access000> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = PasswordNeo4D1AFragment.this.new access000(access13800Var);
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 50 / 0;
            }
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01c3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r25, int r26, char[] r27, boolean r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.access000.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    Object[] objArr = new Object[1];
                    a(View.getDefaultSize(0, 0) + 47, 5 - (Process.myPid() >> 22), new char[]{25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19}, false, 222 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1500L, this) == objOnWarmupCompleted) {
                    int i6 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            }
            PasswordNeo4D1AFragment.onWarmupCompleted(PasswordNeo4D1AFragment.this, false, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r1;
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
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = r2 + 121;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r2 % 128;
     */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.ScrollView IAuthTabCallbackDefault() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r1 = r1 + 73
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L18
            android.widget.ScrollView r1 = r5.IAuthTabCallback
            r4 = 66
            int r4 = r4 / 0
            if (r1 == 0) goto L27
            goto L1c
        L18:
            android.widget.ScrollView r1 = r5.IAuthTabCallback
            if (r1 == 0) goto L27
        L1c:
            int r2 = r2 + 121
            int r4 = r2 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L26
            return r1
        L26:
            throw r3
        L27:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.IAuthTabCallbackDefault():android.widget.ScrollView");
    }

    public void onExtraCallback(@NotNull ScrollView scrollView) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 29;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(scrollView, "");
        this.IAuthTabCallback = scrollView;
        int i4 = RatingCompatStarStyle + 13;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull TextView textView) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 35;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        this.onWarmupCompleted = textView;
        int i4 = RatingCompat1 + 23;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public TextView onTransact() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 77;
        int i3 = i2 % 128;
        RatingCompat1 = i3;
        int i4 = i2 % 2;
        TextView textView = this.onWarmupCompleted;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 91;
        RatingCompatStarStyle = i5 % 128;
        if (i5 % 2 != 0) {
            return textView;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 + 69;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r1 % 128;
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
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.ViewGroup onExtraCallbackWithResult() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle
            int r1 = r1 + 63
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            android.view.ViewGroup r1 = r3.onNavigationEvent
            r2 = 10
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L1b
        L17:
            android.view.ViewGroup r1 = r3.onNavigationEvent
            if (r1 == 0) goto L1c
        L1b:
            return r1
        L1c:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onExtraCallbackWithResult():android.view.ViewGroup");
    }

    public void onNavigationEvent(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 107;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.onNavigationEvent = viewGroup;
        } else {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.onNavigationEvent = viewGroup;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public View asBinder() {
        int i = 2 % 2;
        View view = this.IAuthTabCallbackDefault;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = RatingCompatStarStyle;
        int i3 = i2 + 49;
        RatingCompat1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return view;
    }

    public void onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 57;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            this.IAuthTabCallbackDefault = view;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        this.IAuthTabCallbackDefault = view;
        int i3 = RatingCompatStarStyle + 5;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 82 / 0;
        }
    }

    private static /* synthetic */ Object ICustomTabsServiceDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 43;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        int i4 = RatingCompatStarStyle + 59;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return interpolatorAsBinder;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 11;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) passwordNeo4D1AFragment.ICustomTabsCallbackDefault.getValue();
        int i4 = RatingCompatStarStyle + 11;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return interpolator;
    }

    private final deprecated_dns ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 97;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVar = (deprecated_dns) this.AudioAttributesCompatParcelizer.getValue();
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return deprecated_dnsVar;
    }

    private static final deprecated_dns MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 77;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        if (i3 == 0) {
            return deprecated_certificatepinner.asBinder();
        }
        deprecated_certificatepinner.asBinder();
        throw null;
    }

    private final deprecated_dns ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 53;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        deprecated_dns deprecated_dnsVar = (deprecated_dns) this.ITrustedWebActivityServiceStubProxy.getValue();
        int i3 = RatingCompat1 + 85;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_dnsVar;
    }

    private static final deprecated_dns RatingCompatStarStyle() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 65;
        RatingCompatStarStyle = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        deprecated_dns deprecated_dnsVarIAuthTabCallback = deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback();
        int i3 = RatingCompatStarStyle + 3;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 == 0) {
            return deprecated_dnsVarIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final deprecated_dns IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 5;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVar = (deprecated_dns) this.read.getValue();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return deprecated_dnsVar;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 11;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarIAuthTabCallbackStub = deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub();
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return deprecated_dnsVarIAuthTabCallbackStub;
    }

    private static final deprecated_dns RatingCompat1() {
        int i = 2 % 2;
        deprecated_dns deprecated_dnsVar = new deprecated_dns(250.0d, 40.0d);
        int i2 = RatingCompat1 + 85;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        return deprecated_dnsVar;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 75;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVar = (deprecated_dns) passwordNeo4D1AFragment.ITrustedWebActivityServiceStub.getValue();
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        int i5 = RatingCompat1 + 99;
        RatingCompatStarStyle = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_dnsVar;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 107;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.12f), Float.valueOf(0.0f), Float.valueOf(0.39f), Float.valueOf(0.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = RatingCompat1 + 61;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return interpolator;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 23;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) passwordNeo4D1AFragment.areNotificationsEnabled.getValue();
        if (i3 == 0) {
            return interpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final isNullSentinel IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 5;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        isNullSentinel isnullsentinel = (isNullSentinel) this.IEngagementSignalsCallbackStub.getValue();
        if (i3 != 0) {
            return isnullsentinel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final isNullSentinel RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        isNullSentinel isnullsentinel = new isNullSentinel();
        int i2 = RatingCompat1 + 105;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        return isnullsentinel;
    }

    private final int onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 109;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) this.writeTypedList.getValue();
        if (i3 == 0) {
            return number.intValue();
        }
        number.intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int onActivityResized(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 89;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = passwordNeo4D1AFragment.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(214, displayMetrics);
        int i4 = RatingCompatStarStyle + 13;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    private final int IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 15;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) this.ICustomTabsService_Parcel.getValue();
        if (i3 != 0) {
            return number.intValue();
        }
        number.intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int onMinimized(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 13;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = passwordNeo4D1AFragment.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(20, displayMetrics);
        int i4 = RatingCompat1 + 71;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    private static /* synthetic */ Object validateRelationship(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 55;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Object value = passwordNeo4D1AFragment.IEngagementSignalsCallback.getValue();
        if (i3 != 0) {
            ((Boolean) value).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) value).booleanValue();
        int i4 = RatingCompat1 + 31;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final boolean onMessageChannelReady(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 97;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = passwordNeo4D1AFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (i3 == 0) {
            generateLink.IAuthTabCallback(resources);
            throw null;
        }
        boolean zIAuthTabCallback = generateLink.IAuthTabCallback(resources);
        int i4 = RatingCompatStarStyle + 119;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return zIAuthTabCallback;
    }

    private final int ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 77;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.IconCompatParcelizer.getValue()).intValue();
        int i4 = RatingCompat1 + 83;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    private final int ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 71;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.AudioAttributesImplApi26Parcelizer.getValue()).intValue();
        int i4 = RatingCompat1 + 27;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final int mayLaunchUrl(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 79;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        if (((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1112973365, iIAuthTabCallback2, 1112973424, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).booleanValue()) {
            int i4 = RatingCompat1 + 103;
            RatingCompatStarStyle = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b((Process.myPid() >> 22) + 9, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17473), TextUtils.indexOf((CharSequence) "", '0') + 611, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            b(6 - MotionEvent.axisFromString(""), (char) (48165 - TextUtils.lastIndexOf("", '0', 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 619, objArr2);
            obj = objArr2[0];
        }
        return Color.parseColor(((String) obj).intern());
    }

    private static /* synthetic */ Object setEngagementSignalsCallback(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 105;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Object value = passwordNeo4D1AFragment.onUnminimized.getValue();
        if (i3 != 0) {
            return Float.valueOf(((Number) value).floatValue());
        }
        ((Number) value).floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float extraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        if (!((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1112973365, iIAuthTabCallback2, 1112973424, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).booleanValue()) {
            int i2 = RatingCompat1 + 81;
            RatingCompatStarStyle = i2 % 128;
            int i3 = i2 % 2;
            return 1.0f;
        }
        int i4 = RatingCompatStarStyle;
        int i5 = i4 + 103;
        RatingCompat1 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 15;
        RatingCompat1 = i7 % 128;
        int i8 = i7 % 2;
        return 0.06f;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] onNavigationEvent;
        final /* synthetic */ setCACert $this_run;
        int label;
        final /* synthetic */ PasswordNeo4D1AFragment this$0;
        private static final byte[] $$a = {68, -127, 122, -15};
        private static final int $$b = 208;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private static int IAuthTabCallback = -166499244;
        private static int onExtraCallback = -1538795407;
        private static int onExtraCallbackWithResult = -920563492;
        private static byte[] onWarmupCompleted = {-66, -111, 99, -109, -103, 96, -101, 109, 106, 45, -58, -110, 85, -100, 49, -121, -84, -124, -102, -121, 86, 99, 44, 97, -59, -99, 109, 87, 111, 109, 44, -121, -84, -122, -122, 108, 104, -99, 21, 97, -33, -123, 50, -46, 110, 85, -104, -104, -65, 79, -72, 75, -85, 79, -69, -85};

        private static String $$c(byte b, int i, short s) {
            int i2 = i + 4;
            int i3 = (b * 2) + 115;
            int i4 = s * 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i3 = i5 + (-i2);
                i2 = i2;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                int i8 = i2 + 1;
                bArr2[i7] = (byte) i3;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                i3 += -bArr[i8];
                i2 = i8;
                i6 = i7;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$this_run = setcacert;
            this.this$0 = passwordNeo4D1AFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(this.$this_run, this.this$0, access13800Var);
            int i2 = asBinder + 75;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 87 / 0;
            }
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 21;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 37 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 123;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_ParcelCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[PHI: r4
          0x008b: PHI (r4v17 int) = (r4v3 int), (r4v9 int) binds: [B:16:0x0089, B:35:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0190  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r27, byte r28, int r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 660
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.IAuthTabCallback_Parcel.a(short, byte, int, int, int, java.lang.Object[]):void");
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = asBinder + 49;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((short) (4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 106), (-1381282907) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-1835436145) - (ViewConfiguration.getTapTimeout() >> 16), Process.getGidForName("") - 121, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.$this_run.read.setState(GradientButtonView.onExtraCallback.NORMAL);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(200L, this) == objOnWarmupCompleted) {
                    int i4 = asBinder + 117;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            if (this.this$0.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
                AuthPinDotRotationView authPinDotRotationView = this.$this_run.getSmallIconId;
                Object[] objArr2 = new Object[1];
                a((short) ((-125) - Color.argb(0, 0, 0, 0)), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 55), (-1381282861) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) - 1835436209, (-122) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
                authPinDotRotationView.IAuthTabCallback(Color.parseColor(((String) objArr2[0]).intern()));
            }
            return Unit.INSTANCE;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] onExtraCallback;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ setCACert $this_run;
        private /* synthetic */ Object L$0;
        int label;
        private static final byte[] $$a = {80, -19, -87, -22};
        private static final int $$b = 98;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        private static int onNavigationEvent = 580632190;
        private static int onExtraCallbackWithResult = -1538795445;
        private static int onWarmupCompleted = -665569793;
        private static byte[] IAuthTabCallback = {-36, -1, -16, 1, -1, -1, 22, -43, -4, -23, 20, -23, 60, -13, -18, 19, 11, -6, 1, -3, -7, -21, -24, -17, -8, -8, -16, -38, -33, 31, -7, -29, 84, -6, -10, 13, 0, -14, -2, -69, 69, 15, 0, -1, 4, -14, 5, -15, -5, 6, -69, 69, -6, 11, -6, -75, 72, 2, -83, 69, 6, 0, -6, -15, -30, -32, -27, -20, 31, -19, 1, 32, -11, 19, 9, -66, 16, 28, -25, -22, 24, 20, 81, -81, -27, -22, 21, -18, 24, -17, 27, 17, -20, 81, -81, 16, -31, 16, 95, -94, -24, 71, -81, -20, -22, 16, 27, 8, -28, -89, 85, -91, -81, 86, -83, 83, 92, 19, -24, -92, 91, -94, 7, -87, -110, -86, -84, -87, 88, 85, 18, 87, -21, -93, 83, 89, 81, 83, 18, -87, -110, -88, -88, 82, 94, -93, 27, 87, -31, -85, 4, -28, 80, 91, -82};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, short r8) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r6 = r6 * 3
                int r6 = r6 + 115
                int r8 = r8 * 4
                int r8 = 1 - r8
                byte[] r0 = viva.republica.toss.password.PasswordNeo4D1AFragment.onTransact.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r4 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2b:
                int r6 = r6 + r7
                int r7 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onTransact.$$c(byte, int, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(setCACert setcacert, Function0<Unit> function0, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$this_run = setcacert;
            this.$onComplete = function0;
        }

        public static /* synthetic */ Unit IAuthTabCallback(setCACert setcacert, findResAndMsg findresandmsg, Function0 function0) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 51;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(setcacert, findresandmsg, function0);
            int i4 = onTransact + 123;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 63;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(function0);
                throw null;
            }
            Unit unitIAuthTabCallback = IAuthTabCallback(function0);
            int i3 = IAuthTabCallbackDefault + 35;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return unitIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$this_run, this.$onComplete, access13800Var);
            ontransact.L$0 = obj;
            int i2 = IAuthTabCallbackDefault + 25;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 71 / 0;
            }
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 67;
            onTransact = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 19;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = ontransactCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 17 / 0;
            } else {
                objInvokeSuspend = ontransactCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = IAuthTabCallbackDefault + 71;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            long j;
            boolean z;
            int length;
            byte[] bArr;
            int i5;
            int length2;
            byte[] bArr2;
            int i6;
            int i7 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43425), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i8 = $11 + 61;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 5 / 5;
                    }
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    int i10 = $11 + 69;
                    int i11 = i10 % 128;
                    $10 = i11;
                    int i12 = i10 % 2;
                    byte[] bArr3 = IAuthTabCallback;
                    if (bArr3 != null) {
                        int i13 = i11 + 37;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            length2 = bArr3.length;
                            bArr2 = new byte[length2];
                            i6 = 1;
                        } else {
                            length2 = bArr3.length;
                            bArr2 = new byte[length2];
                            i6 = 0;
                        }
                        while (i6 < length2) {
                            int i14 = $10 + 39;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            Object[] objArr3 = {Integer.valueOf(bArr3[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), 55 - KeyEvent.normalizeMetaState(0), 2167 - TextUtils.indexOf("", ""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i6++;
                        }
                        bArr3 = bArr2;
                    }
                    if (bArr3 != null) {
                        byte[] bArr4 = IAuthTabCallback;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 42 - Gravity.getAbsoluteGravity(0, 0), 22439 - TextUtils.indexOf("", "", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j)) + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 86 - (Process.myPid() >> 22), 9567 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = IAuthTabCallback;
                    if (bArr5 != null) {
                        int i16 = $11 + 49;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 0;
                        }
                        while (i5 < length) {
                            bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                            i5++;
                        }
                        bArr5 = bArr;
                    }
                    if (bArr5 != null) {
                        int i17 = $11 + 53;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i19 = $11 + 45;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        if (!z) {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr6 = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 17;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            final findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((short) TextUtils.getTrimmedLength(""), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 88), 2032376310 - TextUtils.getCapsMode("", 0, 0), (-2081680788) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-68) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            final setCACert setcacert = this.$this_run;
            AuthPinBackgroundView authPinBackgroundView = setcacert.getSmallIconBitmap;
            final Function0<Unit> function0 = this.$onComplete;
            authPinBackgroundView.onNavigationEvent(findresandmsg, function0, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$loadBackgroundBitmaps$1$1$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.onTransact.IAuthTabCallback(setcacert, findresandmsg, function0);
                }
            });
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 95;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return unit;
        }

        private static final Unit IAuthTabCallback(Function0 function0) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 37;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) - 14), 2032376202 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-2081680807) - View.getDefaultSize(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 69, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (Color.blue(0) + 27), 2032376268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') - 2081680816, (-67) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 113;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onWarmupCompleted(setCACert setcacert, findResAndMsg findresandmsg, final Function0 function0) throws Throwable {
            int i = 2 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((-15) - KeyEvent.normalizeMetaState(0)), 2032376202 + (ViewConfiguration.getTapTimeout() >> 16), AndroidCharacter.getMirror('0') - 60887, (-68) - TextUtils.getOffsetBefore("", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((-15) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 39377 - AndroidCharacter.getMirror('0'), (-2081680817) - ((Process.getThreadPriority(0) + 20) >> 6), (-68) - Drawable.resolveOpacity(0, 0), objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            setcacert.getSmallIconBitmap.onNavigationEvent(findresandmsg, function0, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$loadBackgroundBitmaps$1$1$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.onTransact.onExtraCallbackWithResult(function0);
                }
            });
            Unit unit = Unit.INSTANCE;
            int i2 = onTransact + 91;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private final GraniteBrownfieldModule_closeView IEngagementSignalsCallbackStub() {
        ObservableProperty observableProperty;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 59;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            observableProperty = this.ICustomTabsServiceDefault;
            addallcommandline = onExtraCallbackWithResult[0];
        } else {
            observableProperty = this.ICustomTabsServiceDefault;
            addallcommandline = onExtraCallbackWithResult[1];
        }
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) observableProperty.getValue(this, addallcommandline);
        int i3 = RatingCompatStarStyle + 83;
        RatingCompat1 = i3 % 128;
        int i4 = i3 % 2;
        return graniteBrownfieldModule_closeView;
    }

    private final void onWarmupCompleted(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 75;
        RatingCompatStarStyle = i2 % 128;
        this.ICustomTabsServiceDefault.setValue(this, i2 % 2 == 0 ? onExtraCallbackWithResult[0] : onExtraCallbackWithResult[1], graniteBrownfieldModule_closeView);
    }

    private final Pair<Integer, Integer> areNotificationsEnabled() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 41;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Pair<Integer, Integer> pair = (Pair) this.MediaBrowserCompatMediaItem.getValue();
        int i4 = RatingCompat1 + 3;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return pair;
    }

    private static final Pair ICustomTabsCallback_Parcel(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 17;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        if (((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1112973365, iIAuthTabCallback2, 1112973424, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).booleanValue()) {
            int i4 = RatingCompatStarStyle + 17;
            RatingCompat1 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(7 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (8190 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 626 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            return getWrite.IAuthTabCallback(Integer.valueOf(Color.parseColor(((String) objArr[0]).intern())), Integer.valueOf(Color.rgb(147, 190, 255)));
        }
        Object[] objArr2 = new Object[1];
        b(Process.getGidForName("") + 10, (char) (61604 - View.MeasureSpec.makeMeasureSpec(0, 0)), 633 - Color.red(0), objArr2);
        return getWrite.IAuthTabCallback(Integer.valueOf(Color.parseColor(((String) objArr2[0]).intern())), Integer.valueOf(Color.rgb(27, 100, 218)));
    }

    private final Pair<Integer, Integer> ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 95;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Pair<Integer, Integer> pair = (Pair) this.AudioAttributesImplApi21Parcelizer.getValue();
        if (i3 == 0) {
            return pair;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        Object[] objArr2 = {(PasswordNeo4D1AFragment) objArr[0]};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        if (!((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1112973365, iIAuthTabCallback2, 1112973424, objArr2, iIAuthTabCallback)).booleanValue()) {
            Object[] objArr3 = new Object[1];
            b(KeyEvent.normalizeMetaState(0) + 9, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22663), 578 - TextUtils.indexOf("", "", 0, 0), objArr3);
            int color = Color.parseColor(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7, (char) TextUtils.getTrimmedLength(""), 586 - ImageFormat.getBitsPerPixel(0), objArr4);
            return getWrite.IAuthTabCallback(Integer.valueOf(color), Integer.valueOf(Color.parseColor(((String) objArr4[0]).intern())));
        }
        int i2 = RatingCompatStarStyle + 95;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr5 = new Object[1];
        b(9 - KeyEvent.getDeadChar(0, 0), (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 562, objArr5);
        int color2 = Color.parseColor(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((byte) KeyEvent.getModifierMetaStateMask()) + 572, objArr6);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(color2), Integer.valueOf(Color.parseColor(((String) objArr6[0]).intern())));
        int i4 = RatingCompatStarStyle + 103;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return pairIAuthTabCallback;
    }

    private final setHasUserConsent cancelNotification() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 17;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        setHasUserConsent sethasuserconsent = (setHasUserConsent) this.write.getValue();
        int i4 = RatingCompat1 + 109;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return sethasuserconsent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final setHasUserConsent onRelationshipValidationResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        setHasUserConsent sethasuserconsent = new setHasUserConsent(((Number) passwordNeo4D1AFragment.ITrustedWebActivityCallbackStubProxy().getFirst()).intValue(), ((Number) passwordNeo4D1AFragment.ITrustedWebActivityCallbackStubProxy().getSecond()).intValue());
        int i2 = RatingCompat1 + 99;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            return sethasuserconsent;
        }
        throw null;
    }

    private static /* synthetic */ Object IEngagementSignalsCallback(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 97;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Pair pair = (Pair) passwordNeo4D1AFragment.AudioAttributesImplBaseParcelizer.getValue();
        if (i3 != 0) {
            return pair;
        }
        throw null;
    }

    private static final Pair isEngagementSignalsApiAvailable(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 45;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            if (!((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1112973365, iIAuthTabCallback2, 1112973424, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).booleanValue()) {
                return getWrite.IAuthTabCallback(Integer.valueOf(Color.argb(204, 40, 3, 3)), Integer.valueOf(Color.argb(204, 165, 25, 38)));
            }
            Object[] objArr = new Object[1];
            b(7 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 8190), 625 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(Color.parseColor(((String) objArr[0]).intern())), Integer.valueOf(Color.rgb(254, 175, 180)));
            int i3 = RatingCompatStarStyle + 123;
            RatingCompat1 = i3 % 128;
            int i4 = i3 % 2;
            return pairIAuthTabCallback;
        }
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        ((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, -1112973365, iIAuthTabCallback5, 1112973424, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4)).booleanValue();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static char[] onExtraCallbackWithResult = {64976, 64961, 65065, 64984, 64989, 64987, 64991, 64967, 64988, 64983, 64990, 64977, 64915, 64982, 64966, 65064, 64978, 64986, 64916, 64964, 64981, 64965, 64980, 64979, 64960};
        private static char onNavigationEvent = 51244;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0<Unit> $onEnd;
        int label;
        final /* synthetic */ PasswordNeo4D1AFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Function0<Unit> function0, PasswordNeo4D1AFragment passwordNeo4D1AFragment, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$onEnd = function0;
            this.this$0 = passwordNeo4D1AFragment;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 52 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$onEnd, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            boolean z;
            Object obj;
            int length;
            char[] cArr2;
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = onExtraCallbackWithResult;
            Object obj2 = null;
            if (cArr3 != null) {
                int i5 = $11 + 113;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 73;
                    $10 = i7 % 128;
                    if (i7 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.blue(0) + 26, (ViewConfiguration.getFadingEdgeLength() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), View.resolveSize(0, 0) + 26, (ViewConfiguration.getJumpTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6++;
                    }
                    i3 = 2;
                }
                cArr3 = cArr2;
            }
            Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            boolean z2 = false;
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - TextUtils.getOffsetAfter("", 0), 23140 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i8 = $11 + 41;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        z = z2;
                        obj = obj2;
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 24824), MotionEvent.axisFromString("") + 75, View.resolveSizeAndState(0, 0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                z = false;
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, 19488 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                z = false;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                        } else {
                            z = false;
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                            } else {
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    z2 = z;
                    obj2 = obj;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Intent intent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{1, 15, 13842, 13842, 17, '\f', 7, '\r', 16, 3, 14, 23, '\n', 11, 18, 23, '\r', '\f', '\n', 23, 6, 3, 14, '\r', 19, 18, 1, 24, '\r', '\b', 18, 23, 14, 17, 22, '\f', 7, '\n', 3, 5, 3, 6, '\f', '\t', 19, 2, 13851}, (byte) (28 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Process.getGidForName("") + 48, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            Function0<Unit> function0 = this.$onEnd;
            if (function0 != null) {
                function0.invoke();
                int i4 = IAuthTabCallback + 81;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                }
            } else {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    FragmentActivity activity2 = this.this$0.getActivity();
                    if (activity2 != null) {
                        int i6 = IAuthTabCallback + 35;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        intent = activity2.getIntent();
                    } else {
                        intent = null;
                    }
                    activity.setResult(0, intent);
                }
                FragmentActivity activity3 = this.this$0.getActivity();
                if (activity3 != null) {
                    int i8 = IAuthTabCallback + 91;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        activity3.finish();
                        throw null;
                    }
                    activity3.finish();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final int IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 29;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            ((Number) this.getActiveNotifications.getValue()).intValue();
            throw null;
        }
        int iIntValue = ((Number) this.getActiveNotifications.getValue()).intValue();
        int i3 = RatingCompatStarStyle + 55;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        WindowManager windowManager;
        int i = 2 % 2;
        FragmentActivity activity = ((PasswordNeo4D1AFragment) objArr[0]).getActivity();
        if (activity != null) {
            int i2 = RatingCompatStarStyle + 21;
            RatingCompat1 = i2 % 128;
            int i3 = i2 % 2;
            windowManager = activity.getWindowManager();
        } else {
            windowManager = null;
        }
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT < 30) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                return Integer.valueOf(displayMetrics.heightPixels);
            }
            int i4 = RatingCompatStarStyle + 1;
            RatingCompat1 = i4 % 128;
            if (i4 % 2 == 0) {
                return Integer.valueOf(windowManager.getCurrentWindowMetrics().getBounds().height());
            }
            int i5 = 82 / 0;
            return Integer.valueOf(windowManager.getCurrentWindowMetrics().getBounds().height());
        }
        M_ m_ = M_.onExtraCallback;
        return Integer.valueOf(m_.IAuthTabCallbackDefault() + m_.onWarmupCompleted() + m_.IAuthTabCallbackStub());
    }

    private final int ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 37;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.notifyNotificationWithChannel.getValue()).intValue();
        int i4 = RatingCompat1 + 89;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    private static final int MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 23;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = M_.onExtraCallback.asInterface();
        int i4 = RatingCompat1 + 97;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return iAsInterface;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 99;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = RatingCompatStarStyle + 79;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsServiceStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 29;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = RatingCompat1 + 49;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 15;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new asDouble(isNumber.BIOMETRIC, isjsontypeignore.onNavigationEvent(), null, null, false, false, false, false, false, null, 1020, null));
        FragmentActivity activity = passwordNeo4D1AFragment.getActivity();
        if (activity != null) {
            int i2 = RatingCompat1 + 11;
            RatingCompatStarStyle = i2 % 128;
            if (i2 % 2 == 0) {
                activity.finish();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            activity.finish();
            int i3 = RatingCompatStarStyle + 1;
            RatingCompat1 = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x070a  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r1v92, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.lang.Integer] */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onCreate(android.os.Bundle):void");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Throwable thOnExtraCallback;
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 63;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        accessMapSafely accessmapsafely = accessMapSafely.onNavigationEvent;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        if (accessmapsafely.IAuthTabCallback(contextRequireContext) && (thOnExtraCallback = enableFabricRenderer.onExtraCallback.onExtraCallback()) != null) {
            int i4 = RatingCompat1 + 115;
            RatingCompatStarStyle = i4 % 128;
            if (i4 % 2 == 0) {
                RxBiometric.Companion.onExtraCallbackWithResult(thOnExtraCallback);
                throw null;
            }
            if (RxBiometric.Companion.onExtraCallbackWithResult(thOnExtraCallback)) {
                TdsDialogV1.onExtraCallbackWithResult onextracallbackwithresult = TdsDialogV1.Companion;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onextracallbackwithresult.onExtraCallback(context).onNavigationEvent(false);
                String string = getString(R.string.app_password___b2387d7b1d);
                Intrinsics.checkNotNullExpressionValue(string, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, new Object[]{(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onNavigationEvent(string), Integer.valueOf(R.drawable.image_popup_fingerprint_add)}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
                String string2 = getString(R.string.app_password___df8739daab);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted3 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted2.onExtraCallbackWithResult(string2);
                String string3 = getString(im.toss.uikit.R.string.uikit_ok);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted3, string3, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda45
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        Object[] objArr = {this.f$0, dialogInterface, Integer.valueOf(i5)};
                        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                        PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1391270727, iIAuthTabCallback2, 1391270744, objArr, iIAuthTabCallback);
                    }
                }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
                int i5 = RatingCompat1 + 79;
                RatingCompatStarStyle = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        getSmallIconId();
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 59;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
        } else {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_password_neo_4d1a, viewGroup, false);
        int i3 = RatingCompatStarStyle + 3;
        RatingCompat1 = i3 % 128;
        int i4 = i3 % 2;
        return viewInflate;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 65;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        PasswordFragment.onWarmupCompleted(passwordNeo4D1AFragment, (Function0) null, 1, (Object) null);
        int i4 = RatingCompatStarStyle + 17;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, Bitmap bitmap) {
        boolean z;
        int i = 2 % 2;
        if (bitmap != null) {
            z = true;
        } else {
            int i2 = RatingCompatStarStyle + 65;
            RatingCompat1 = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        passwordNeo4D1AFragment.requestPostMessageChannelWithExtras = z;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(passwordNeo4D1AFragment);
        if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null) {
            int i4 = RatingCompatStarStyle + 105;
            RatingCompat1 = i4 % 128;
            int i5 = i4 % 2;
            setcacert.getSmallIconBitmap.setAppImage(bitmap, passwordNeo4D1AFragment.onRelationshipValidationResult(), textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted);
        }
        if (!passwordNeo4D1AFragment.requestPostMessageChannelWithExtras) {
            int i6 = RatingCompat1 + 27;
            RatingCompatStarStyle = i6 % 128;
            int i7 = i6 % 2;
            ConstraintLayout constraintLayout = setcacert.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), M_.onExtraCallback.IAuthTabCallbackStub(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
            TdsImageView tdsImageView = setcacert.onTransact;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(8);
            Toolbar toolbar = setcacert.AudioAttributesImplApi21Parcelizer;
            Intrinsics.checkNotNullExpressionValue(toolbar, "");
            toolbar.setVisibility(0);
            View view = setcacert.ITrustedWebActivityService_Parcel;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object receiveFile(Object[] objArr) throws Throwable {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 109;
        RatingCompatStarStyle = i2 % 128;
        String strUpdateVisuals = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback();
            PasswordFragment.onExtraCallback onextracallback = passwordNeo4D1AFragment.ITrustedWebActivityCallbackStubProxy;
            strUpdateVisuals.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallback onextracallback2 = passwordNeo4D1AFragment.ITrustedWebActivityCallbackStubProxy;
        String strIEngagementSignalsCallbackDefault = onextracallback2 != null ? onextracallback2.IEngagementSignalsCallbackDefault() : null;
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 348 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
        mapOnExtraCallback.put(((String) objArr2[0]).intern(), strIEngagementSignalsCallbackDefault);
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr3 = new Object[1];
        b(20 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 356, objArr3);
        mapOnExtraCallback2.put(((String) objArr3[0]).intern(), CatalystInstanceImplPendingJSCall.onNavigationEvent(CatalystInstanceImplPendingJSCall.onWarmupCompleted(passwordNeo4D1AFragment.ITrustedWebActivityCallbackStubProxy)));
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        Object[] objArr4 = new Object[1];
        b((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, (char) (KeyEvent.normalizeMetaState(0) + 20101), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 376, objArr4);
        mapOnExtraCallback3.put(((String) objArr4[0]).intern(), _get_isNull_lambda0.onExtraCallbackWithResult.onWarmupCompleted());
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        Object[] objArr5 = new Object[1];
        b(TextUtils.lastIndexOf("", '0') + 13, (char) (28556 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 389, objArr5);
        mapOnExtraCallback4.put(((String) objArr5[0]).intern(), passwordNeo4D1AFragment.getString(R.string.password_reset));
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        Object[] objArr6 = new Object[1];
        b(5 - View.resolveSize(0, 0), (char) (Color.blue(0) + 6242), 401 - KeyEvent.normalizeMetaState(0), objArr6);
        mapOnExtraCallback5.put(((String) objArr6[0]).intern(), passwordNeo4D1AFragment.prefetch);
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr7 = new Object[1];
        b(11 - TextUtils.getTrimmedLength(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37595), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 406, objArr7);
        mapOnExtraCallback6.put(((String) objArr7[0]).intern(), passwordNeo4D1AFragment.onTransact().getText().toString());
        Map mapOnExtraCallback7 = setDetectableSize.onExtraCallback();
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        String loginYN = indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null;
        Object[] objArr8 = new Object[1];
        b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7, (char) (36272 - (Process.myTid() >> 22)), (Process.myTid() >> 22) + 417, objArr8);
        mapOnExtraCallback7.put(((String) objArr8[0]).intern(), loginYN);
        Map mapOnExtraCallback8 = setDetectableSize.onExtraCallback();
        IndicatorView indicatorViewAccess1002 = createpaints.access100();
        String logValue = indicatorViewAccess1002 != null ? indicatorViewAccess1002.getLogValue() : null;
        Object[] objArr9 = new Object[1];
        b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 425 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr9);
        mapOnExtraCallback8.put(((String) objArr9[0]).intern(), logValue);
        Map mapOnExtraCallback9 = setDetectableSize.onExtraCallback();
        Object[] objArr10 = new Object[1];
        b(ExpandableListView.getPackedPositionType(0L) + 11, (char) TextUtils.indexOf("", "", 0, 0), 435 - ExpandableListView.getPackedPositionChild(0L), objArr10);
        String strIntern = ((String) objArr10[0]).intern();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.getCapsMode("", 0, 0) + 30, 24887 - TextUtils.indexOf("", "", 0), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, 24887 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            mapOnExtraCallback9.put(strIntern, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue() + 1));
            Map mapOnExtraCallback10 = setDetectableSize.onExtraCallback();
            Object[] objArr11 = new Object[1];
            b(TextUtils.getTrimmedLength("") + 11, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 447 - (ViewConfiguration.getEdgeSlop() >> 16), objArr11);
            mapOnExtraCallback10.put(((String) objArr11[0]).intern(), passwordNeo4D1AFragment.onSessionEnded());
            Map mapOnExtraCallback11 = setDetectableSize.onExtraCallback();
            Object[] objArr12 = new Object[1];
            b(Process.getGidForName("") + 18, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 5192), 457 - ExpandableListView.getPackedPositionChild(0L), objArr12);
            mapOnExtraCallback11.put(((String) objArr12[0]).intern(), passwordNeo4D1AFragment.writeTypedList());
            Map mapOnExtraCallback12 = setDetectableSize.onExtraCallback();
            Object[] objArr13 = new Object[1];
            b(View.combineMeasuredStates(0, 0) + 9, (char) Color.red(0), 475 - TextUtils.indexOf("", "", 0), objArr13);
            mapOnExtraCallback12.put(((String) objArr13[0]).intern(), Long.valueOf(passwordNeo4D1AFragment.readTypedObject()));
            Map mapOnExtraCallback13 = setDetectableSize.onExtraCallback();
            Object[] objArr14 = new Object[1];
            b(7 - Color.green(0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 33191), 485 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr14);
            String strIntern2 = ((String) objArr14[0]).intern();
            Object[] objArr15 = new Object[1];
            b(1 - (ViewConfiguration.getScrollBarSize() >> 8), (char) TextUtils.getOffsetBefore("", 0), 172 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr15);
            mapOnExtraCallback13.put(strIntern2, ((String) objArr15[0]).intern());
            Map mapOnExtraCallback14 = setDetectableSize.onExtraCallback();
            PasswordFragment.onExtraCallback onextracallback3 = passwordNeo4D1AFragment.ITrustedWebActivityCallbackStubProxy;
            if (onextracallback3 != null) {
                int i3 = RatingCompat1 + 87;
                RatingCompatStarStyle = i3 % 128;
                int i4 = i3 % 2;
                strUpdateVisuals = onextracallback3.updateVisuals();
                int i5 = RatingCompatStarStyle + 39;
                RatingCompat1 = i5 % 128;
                int i6 = i5 % 2;
            }
            Object[] objArr16 = new Object[1];
            b(10 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (62181 - ExpandableListView.getPackedPositionChild(0L)), 492 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr16);
            mapOnExtraCallback14.put(((String) objArr16[0]).intern(), strUpdateVisuals);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final Unit onPostMessage(final PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1520731L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda44
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        PasswordFragment.IAuthTabCallback iAuthTabCallbackExtraCallbackWithResult = passwordNeo4D1AFragment.extraCallbackWithResult();
        if (iAuthTabCallbackExtraCallbackWithResult != null) {
            int i2 = RatingCompatStarStyle + 49;
            RatingCompat1 = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallbackExtraCallbackWithResult.IAuthTabCallback();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 9;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setCACert setcacert = (setCACert) objArr[0];
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 87;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = new int[2];
        setcacert.IAuthTabCallbackDefault.getLocationOnScreen(iArr);
        KeyBlurImageSurfaceView keyBlurImageSurfaceView = setcacert.onWarmupCompleted;
        int i4 = passwordNeo4D1AFragment.MediaDescriptionCompat;
        passwordNeo4D1AFragment.MediaDescriptionCompat = i4 + 1;
        float f = iArr[0];
        TdsImageView tdsImageView = setcacert.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        float fOnExtraCallback = generateInviteUrl.onExtraCallback(tdsImageView);
        float f2 = iArr[1];
        TdsImageView tdsImageView2 = setcacert.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        keyBlurImageSurfaceView.setTouchPoint(String.valueOf(i4), f + fOnExtraCallback, f2 + generateInviteUrl.IAuthTabCallback(tdsImageView2));
        passwordNeo4D1AFragment.AudioAttributesImplApi21Parcelizer();
        int i5 = RatingCompatStarStyle + 1;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(o.setCACert r10, viva.republica.toss.password.PasswordNeo4D1AFragment r11, android.view.MotionEvent r12) {
        /*
            r12 = 2
            int r0 = r12 % r12
            int r0 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle
            int r0 = r0 + 33
            int r1 = r0 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r1
            int r0 = r0 % r12
            java.lang.String r1 = ""
            if (r0 == 0) goto L20
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.RatingCompatStarStyle
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r0 = r0.getVisibility()
            r2 = 28
            int r2 = r2 / 0
            if (r0 != 0) goto L60
            goto L2b
        L20:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.RatingCompatStarStyle
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L60
        L2b:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.RatingCompatStarStyle
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View r2 = r10.MediaMetadataCompat
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            im.toss.tds.view.component.atom.text.Typography6 r10 = r10.RatingCompatApi19Impl
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            java.lang.Object[] r8 = new java.lang.Object[]{r11, r0, r2, r10}
            int r9 = o._string.onNavigationEvent.IAuthTabCallback()
            int r6 = o._string.onNavigationEvent.IAuthTabCallback()
            int r4 = o._string.onNavigationEvent.IAuthTabCallback()
            int r3 = o._string.onNavigationEvent.IAuthTabCallback()
            r7 = -510599601(0xffffffffe190de4f, float:-3.3404377E20)
            r5 = 510599629(0x1e6f21cd, float:1.26595445E-20)
            onExtraCallbackWithResult(r3, r4, r5, r6, r7, r8, r9)
            int r10 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r10 = r10 + 79
            int r11 = r10 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r11
            int r10 = r10 % r12
        L60:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onExtraCallbackWithResult(o.setCACert, viva.republica.toss.password.PasswordNeo4D1AFragment, android.view.MotionEvent):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object ICustomTabsService(java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.ICustomTabsService(java.lang.Object[]):java.lang.Object");
    }

    private static final void ICustomTabsCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 23;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        passwordNeo4D1AFragment.MediaDescriptionCompat();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = RatingCompatStarStyle + 85;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(setCACert setcacert, final PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 19;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            if (setcacert.access000.getHeight() > 0 && passwordNeo4D1AFragment.requestPostMessageChannelWithExtras) {
                passwordNeo4D1AFragment.MediaDescriptionCompat();
                int i3 = RatingCompat1 + 55;
                RatingCompatStarStyle = i3 % 128;
                int i4 = i3 % 2;
            } else {
                setcacert.AudioAttributesCompatParcelizer.post(new Runnable() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda80
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        PasswordNeo4D1AFragment.IAuthTabCallback(this.f$0);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        setcacert.access000.getHeight();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, int i, View view) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (!passwordNeo4D1AFragment.IEngagementSignalsCallbackDefault) {
            int i3 = RatingCompatStarStyle + 105;
            RatingCompat1 = i3 % 128;
            int i4 = i3 % 2;
            return Unit.INSTANCE;
        }
        passwordNeo4D1AFragment.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallback.get(i));
        Unit unit = Unit.INSTANCE;
        int i5 = RatingCompat1 + 43;
        RatingCompatStarStyle = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, List list) {
        int i = 2 % 2;
        if (!passwordNeo4D1AFragment.IEngagementSignalsCallbackDefault) {
            int i2 = RatingCompatStarStyle + 71;
            RatingCompat1 = i2 % 128;
            if (i2 % 2 == 0) {
                return Unit.INSTANCE;
            }
            int i3 = 78 / 0;
            return Unit.INSTANCE;
        }
        if (list != null) {
            int i4 = RatingCompatStarStyle + 3;
            RatingCompat1 = i4 % 128;
            int i5 = i4 % 2;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TextView textView = passwordNeo4D1AFragment.IPostMessageServiceStubProxy.get(((Number) it.next()).intValue());
                textView.getLocationOnScreen(new int[2]);
                KeyBlurImageSurfaceView keyBlurImageSurfaceView = setcacert.onWarmupCompleted;
                int i6 = passwordNeo4D1AFragment.MediaDescriptionCompat;
                passwordNeo4D1AFragment.MediaDescriptionCompat = i6 + 1;
                keyBlurImageSurfaceView.setTouchPoint(String.valueOf(i6), r3[0] + generateInviteUrl.onExtraCallback(textView), r3[1] + generateInviteUrl.IAuthTabCallback(textView));
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = RatingCompatStarStyle + 5;
        RatingCompat1 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 94 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        TextView textView = (TextView) objArr[1];
        setCACert setcacert = (setCACert) objArr[2];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 71;
        int i3 = i2 % 128;
        RatingCompatStarStyle = i3;
        int i4 = i2 % 2;
        if (passwordNeo4D1AFragment.IEngagementSignalsCallbackDefault) {
            int i5 = i3 + 77;
            RatingCompat1 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        passwordNeo4D1AFragment.IAuthTabCallback(textView.getText().toString());
        textView.getLocationOnScreen(new int[2]);
        KeyBlurImageSurfaceView keyBlurImageSurfaceView = setcacert.onWarmupCompleted;
        int i7 = passwordNeo4D1AFragment.MediaDescriptionCompat;
        passwordNeo4D1AFragment.MediaDescriptionCompat = i7 + 1;
        keyBlurImageSurfaceView.setTouchPoint(String.valueOf(i7), r8[0] + generateInviteUrl.onExtraCallback(textView), r8[1] + generateInviteUrl.IAuthTabCallback(textView));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r4.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r5 >= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        r5 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle + 101;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if ((r5 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        kotlin.collections.CollectionsKt.throwIndexOverflow();
        r5 = 70 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        kotlin.collections.CollectionsKt.throwIndexOverflow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        ((android.view.View) r6).setContentDescription(getString(viva.republica.toss.R.string.app_password___e445d6d193, new java.lang.Object[]{java.lang.String.valueOf(r7)}));
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r4 = r12.IPostMessageServiceStubProxy.iterator();
        r5 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle + 69;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r5 % 128;
        r5 = r5 % 2;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r4.hasNext() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r6 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 + 23;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r6 % 128;
        r6 = r6 % 2;
        ((android.widget.TextView) r4.next()).setText(r12.ITrustedWebActivityCallback.get(r5));
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        IEngagementSignalsCallbackStubProxy().onExtraCallback(r12.ITrustedWebActivityCallback);
        IEngagementSignalsCallbackStubProxy().IAuthTabCallback(r12.IPostMessageServiceStubProxy, new viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda83(r12), new viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda84(r12, r1));
        java.util.Collections.shuffle(r12.onSessionEnded);
        r4 = r12.onVerticalScrollEvent.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (r4.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ce, code lost:
    
        if (r3 >= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        r6 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle + 105;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        if ((r6 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        kotlin.collections.CollectionsKt.throwIndexOverflow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        kotlin.collections.CollectionsKt.throwIndexOverflow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
    
        r5 = (android.widget.TextView) r5;
        r6 = r12.onSessionEnded.get(r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        r5.setText(r6);
        r5.setOnClickListener(new viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda85(r12, r5, r1));
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        r11 = o._string.onNavigationEvent.IAuthTabCallback();
        r8 = o._string.onNavigationEvent.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0120, code lost:
    
        return (o.getPackageType) onExtraCallbackWithResult(o._string.onNavigationEvent.IAuthTabCallback(), o._string.onNavigationEvent.IAuthTabCallback(), -631920335, r8, 631920360, new java.lang.Object[]{r12}, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0121, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        java.util.Collections.shuffle(r12.ITrustedWebActivityCallback);
        r4 = r12.ICustomTabsServiceStubProxy.iterator();
        r5 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final o.getPackageType ResultReceiverMyResultReceiver() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.ResultReceiverMyResultReceiver():o.getPackageType");
    }

    private final Unit getActiveNotifications() {
        final BaseActivity baseActivity;
        int i = 2 % 2;
        setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback != null) {
            BaseActivity activity = getActivity();
            if (activity instanceof BaseActivity) {
                int i2 = RatingCompat1 + 49;
                RatingCompatStarStyle = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                baseActivity = activity;
            } else {
                baseActivity = null;
            }
            if (baseActivity != null) {
                int i3 = RatingCompat1 + 125;
                RatingCompatStarStyle = i3 % 128;
                if (i3 % 2 == 0) {
                    baseActivity.setSupportActionBar(setcacertIEngagementSignalsCallback.AudioAttributesImplApi21Parcelizer);
                    baseActivity.getSupportActionBar();
                    throw null;
                }
                baseActivity.setSupportActionBar(setcacertIEngagementSignalsCallback.AudioAttributesImplApi21Parcelizer);
                IPostMessageServiceStubProxy supportActionBar = baseActivity.getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.onNavigationEvent(true);
                }
                IPostMessageServiceStubProxy supportActionBar2 = baseActivity.getSupportActionBar();
                if (supportActionBar2 != null) {
                    supportActionBar2.IAuthTabCallbackStub(false);
                }
                setcacertIEngagementSignalsCallback.AudioAttributesImplApi21Parcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda56
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr = {baseActivity, this, view};
                        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                        PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -2085849228, iIAuthTabCallback2, 2085849237, objArr, iIAuthTabCallback);
                    }
                });
                return Unit.INSTANCE;
            }
        }
        return null;
    }

    private static final void onExtraCallback(BaseActivity baseActivity, PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) throws Throwable {
        int i = 2 % 2;
        if (baseActivity instanceof PasswordSettingActivity) {
            ((PasswordSettingActivity) baseActivity).onGreatestScrollPercentageIncreased();
            return;
        }
        boolean z = baseActivity instanceof PasswordActivity;
        if (!z || passwordNeo4D1AFragment.onActivityLayout() != UTF8Decoder.LOCK_SCREEN) {
            if (!z) {
                baseActivity.bg_();
                return;
            }
            int i2 = RatingCompatStarStyle + 33;
            RatingCompat1 = i2 % 128;
            PasswordFragment.onWarmupCompleted(passwordNeo4D1AFragment, (Function0) null, i2 % 2 != 0 ? 0 : 1, (Object) null);
            return;
        }
        int i3 = RatingCompat1 + 51;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        ((PasswordActivity) baseActivity).ICustomTabsServiceDefault();
        int i5 = RatingCompatStarStyle + 33;
        RatingCompat1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onExtraCallback(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        Typography6 typography6;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        onNavigationEvent(charSequence.toString());
        setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback != null) {
            int i2 = RatingCompat1 + 79;
            RatingCompatStarStyle = i2 % 128;
            int i3 = i2 % 2;
            Typography6 typography62 = setcacertIEngagementSignalsCallback.MediaDescriptionCompat;
            if (typography62 != null) {
                typography62.setText(charSequence2);
            }
        }
        setCACert setcacertIEngagementSignalsCallback2 = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback2 != null && (typography6 = setcacertIEngagementSignalsCallback2.RatingCompat) != null) {
            typography6.setText(charSequence2);
        }
        Object[] objArr = {this, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda110
            public final Object invoke() {
                return PasswordNeo4D1AFragment.onTransact(this.f$0);
            }
        }};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int i4 = RatingCompat1 + 35;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit ICustomTabsCallbackDefault(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 117;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        passwordNeo4D1AFragment.RatingCompat();
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 27;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(final setCACert setcacert, final PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        setcacert.access000.fullScroll(130);
        passwordNeo4D1AFragment.IPostMessageServiceStub = setcacert.access000.getHeight() - setcacert.AudioAttributesCompatParcelizer.getHeight();
        setcacert.access000.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda82
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                PasswordNeo4D1AFragment.onExtraCallbackWithResult(this.f$0, setcacert, view, i2, i3, i4, i5);
            }
        });
        int i2 = RatingCompatStarStyle + 95;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = RatingCompatStarStyle + 29;
        RatingCompat1 = i6 % 128;
        int i7 = i6 % 2;
        float f = -i2;
        passwordNeo4D1AFragment.IPostMessageServiceStub = f;
        setcacert.onVerticalScrollEvent.setTranslationY(f);
        int i8 = RatingCompat1 + 21;
        RatingCompatStarStyle = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[PHI: r1
      0x002f: PHI (r1v7 o.setCACert) = (r1v6 o.setCACert), (r1v25 o.setCACert) binds: [B:10:0x002d, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2 A[PHI: r1
      0x00c2: PHI (r1v17 im.toss.tds.view.component.anim.text.AnimateText) = (r1v16 im.toss.tds.view.component.anim.text.AnimateText), (r1v18 im.toss.tds.view.component.anim.text.AnimateText) binds: [B:31:0x00c0, B:28:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onNavigationEvent(java.lang.String):void");
    }

    private static final String onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, String str) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 125;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String string = passwordNeo4D1AFragment.getString(R.string.help_text);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = RatingCompat1 + 43;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private final void onExtraCallbackWithResult(Typography6 typography6) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        b(2 - View.getDefaultSize(0, 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 551, objArr);
        typography6.setText(((String) objArr[0]).intern());
        transparentBackground.onWarmupCompleted(NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{typography6, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda70
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.f$0, (String) obj};
                int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                return (String) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1375450431, iIAuthTabCallback2, 1375450446, objArr2, iIAuthTabCallback);
            }
        }, null, false, 6, null}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -2039764647, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 2039764661, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted());
        typography6.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                PasswordNeo4D1AFragment.onExtraCallback(this.f$0, view);
            }
        });
        int i2 = RatingCompat1 + 85;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onNavigationEvent(final PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) throws Throwable {
        String loginYN;
        int i = 2 % 2;
        String logValue = null;
        if (passwordNeo4D1AFragment.isEngagementSignalsApiAvailable()) {
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            String strValueOf = String.valueOf(indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null);
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                int i2 = RatingCompatStarStyle + 123;
                RatingCompat1 = i2 % 128;
                if (i2 % 2 != 0) {
                    indicatorViewAccess1002.getLogValue();
                    logValue.hashCode();
                    throw null;
                }
                logValue = indicatorViewAccess1002.getLogValue();
            }
            asmaplambda6.onExtraCallback(strValueOf, String.valueOf(logValue), passwordNeo4D1AFragment.prefetch, passwordNeo4D1AFragment.onTransact().getText().toString(), passwordNeo4D1AFragment.onSessionEnded(), passwordNeo4D1AFragment.writeTypedList());
        } else {
            asMaplambda6 asmaplambda62 = asMaplambda6.onExtraCallback;
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            if (indicatorViewAccess1003 != null) {
                int i3 = RatingCompat1 + 107;
                RatingCompatStarStyle = i3 % 128;
                int i4 = i3 % 2;
                loginYN = indicatorViewAccess1003.getLoginYN();
            } else {
                loginYN = null;
            }
            String strValueOf2 = String.valueOf(loginYN);
            IndicatorView indicatorViewAccess1004 = createpaints2.access100();
            String strValueOf3 = String.valueOf(indicatorViewAccess1004 != null ? indicatorViewAccess1004.getLogValue() : null);
            String str = passwordNeo4D1AFragment.prefetch;
            String string = passwordNeo4D1AFragment.onTransact().getText().toString();
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 30 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionType(0L) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 30 - View.getDefaultSize(0, 0), MotionEvent.axisFromString("") + 24888, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                asMaplambda6.onExtraCallbackWithResult(1721522975, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1721522972, new Object[]{asmaplambda62, strValueOf2, strValueOf3, str, string, String.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue()), passwordNeo4D1AFragment.onSessionEnded(), passwordNeo4D1AFragment.writeTypedList(), Long.valueOf(passwordNeo4D1AFragment.readTypedObject()), null, 256, null});
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Context contextRequireContext = passwordNeo4D1AFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda78
            public final Object invoke(Object obj2) {
                Object[] objArr = {this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2};
                int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 768513885, iIAuthTabCallback2, -768513884, objArr, iIAuthTabCallback);
            }
        });
    }

    private static final Unit onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        String logValue = null;
        if (passwordNeo4D1AFragment.isEngagementSignalsApiAvailable()) {
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            String strValueOf = String.valueOf(indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null);
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                logValue = indicatorViewAccess1002.getLogValue();
                int i2 = RatingCompat1 + 37;
                RatingCompatStarStyle = i2 % 128;
                int i3 = i2 % 2;
            }
            String strValueOf2 = String.valueOf(logValue);
            String strValueOf3 = String.valueOf((CharSequence) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1303993273, new Object[]{commonModule_setLeftEdgeTouchEnabled}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1303993264, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()));
            String strValueOf4 = String.valueOf(commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
            String string = passwordNeo4D1AFragment.getString(im.toss.uikit.R.string.uikit_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            asmaplambda6.IAuthTabCallback(strValueOf, strValueOf2, strValueOf3, strValueOf4, string, passwordNeo4D1AFragment.onSessionEnded(), passwordNeo4D1AFragment.writeTypedList());
        } else {
            asMaplambda6 asmaplambda62 = asMaplambda6.onExtraCallback;
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            String strValueOf5 = String.valueOf(indicatorViewAccess1003 != null ? indicatorViewAccess1003.getLoginYN() : null);
            IndicatorView indicatorViewAccess1004 = createpaints2.access100();
            String strValueOf6 = String.valueOf(indicatorViewAccess1004 != null ? indicatorViewAccess1004.getLogValue() : null);
            String strValueOf7 = String.valueOf((CharSequence) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1303993273, new Object[]{commonModule_setLeftEdgeTouchEnabled}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1303993264, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()));
            String strValueOf8 = String.valueOf(commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
            String string2 = passwordNeo4D1AFragment.getString(im.toss.uikit.R.string.uikit_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 30, 24887 - View.resolveSizeAndState(0, 0, 0), -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 30, Process.getGidForName("") + 24888, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                asMaplambda6.onNavigationEvent(asmaplambda62, strValueOf5, strValueOf6, strValueOf7, strValueOf8, string2, String.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue()), passwordNeo4D1AFragment.onSessionEnded(), passwordNeo4D1AFragment.writeTypedList(), passwordNeo4D1AFragment.readTypedObject(), null, 512, null);
                int i4 = RatingCompat1 + 71;
                RatingCompatStarStyle = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        dialogInterface.dismiss();
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        final CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(passwordNeo4D1AFragment.IAuthTabCallbackStubProxy());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(passwordNeo4D1AFragment.getString(R.string.password_use_biometric_dialog_message));
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda72
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onExtraCallbackWithResult(this.f$0, commonModule_setLeftEdgeTouchEnabled, (DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = RatingCompat1 + 113;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return unit;
    }

    private final String onSessionEnded() throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 25;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0 ? !(!PasswordFragment.onWarmupCompleted(this, (UTF8Decoder) null, 1, (Object) null)) : PasswordFragment.onWarmupCompleted(this, (UTF8Decoder) null, 1, (Object) null)) {
            Object[] objArr = new Object[1];
            b(-TextUtils.lastIndexOf("", '0'), (char) ('0' - AndroidCharacter.getMirror('0')), 171 - TextUtils.lastIndexOf("", '0'), objArr);
            return ((String) objArr[0]).intern();
        }
        Object[] objArr2 = new Object[1];
        b(1 - TextUtils.getCapsMode("", 0, 0), (char) View.resolveSizeAndState(0, 0, 0), 171 - ExpandableListView.getPackedPositionType(0L), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i3 = RatingCompatStarStyle + 1;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    private final String writeTypedList() throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 113;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        if (IEngagementSignalsCallback() == null) {
            Object[] objArr = new Object[1];
            b(1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 171, objArr);
            return ((String) objArr[0]).intern();
        }
        if (!r1.MediaMetadataCompat.isChecked()) {
            Object[] objArr2 = new Object[1];
            b(1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), View.MeasureSpec.getSize(0) + 171, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            int i4 = RatingCompatStarStyle + 121;
            RatingCompat1 = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }
        Object[] objArr3 = new Object[1];
        b((ViewConfiguration.getJumpTapTimeout() >> 16) + 1, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 172, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        int i6 = RatingCompat1 + 123;
        RatingCompatStarStyle = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return strIntern2;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) throws Throwable {
        String loginYN;
        String logValue;
        Context context;
        int i;
        String logValue2;
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        View view = (View) objArr[1];
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[2];
        TextView textView = (TextView) objArr[3];
        int i2 = 2 % 2;
        if (!(!passwordNeo4D1AFragment.isEngagementSignalsApiAvailable())) {
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            String strValueOf = String.valueOf(indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null);
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                int i3 = RatingCompat1 + 47;
                RatingCompatStarStyle = i3 % 128;
                int i4 = i3 % 2;
                logValue2 = indicatorViewAccess1002.getLogValue();
            } else {
                logValue2 = null;
            }
            asMaplambda6.onExtraCallbackWithResult(254313752, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -254313751, new Object[]{asmaplambda6, strValueOf, String.valueOf(logValue2), passwordNeo4D1AFragment.prefetch, passwordNeo4D1AFragment.onTransact().getText().toString(), passwordNeo4D1AFragment.access100(), passwordNeo4D1AFragment.onSessionEnded(), passwordNeo4D1AFragment.writeTypedList()});
        } else {
            asMaplambda6 asmaplambda62 = asMaplambda6.onExtraCallback;
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            if (indicatorViewAccess1003 != null) {
                int i5 = RatingCompatStarStyle + 63;
                RatingCompat1 = i5 % 128;
                int i6 = i5 % 2;
                loginYN = indicatorViewAccess1003.getLoginYN();
                int i7 = RatingCompatStarStyle + 123;
                RatingCompat1 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                loginYN = null;
            }
            String strValueOf2 = String.valueOf(loginYN);
            IndicatorView indicatorViewAccess1004 = createpaints2.access100();
            if (indicatorViewAccess1004 != null) {
                logValue = indicatorViewAccess1004.getLogValue();
                int i9 = RatingCompatStarStyle + 71;
                RatingCompat1 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                logValue = null;
            }
            String strValueOf3 = String.valueOf(logValue);
            String str = passwordNeo4D1AFragment.prefetch;
            String string = passwordNeo4D1AFragment.onTransact().getText().toString();
            String strAccess100 = passwordNeo4D1AFragment.access100();
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 31, TextUtils.lastIndexOf("", '0', 0, 0) + 24888, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 30 - View.getDefaultSize(0, 0), 24887 - Color.alpha(0), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                asMaplambda6.IAuthTabCallback(asmaplambda62, strValueOf2, strValueOf3, str, string, strAccess100, String.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue()), passwordNeo4D1AFragment.onSessionEnded(), passwordNeo4D1AFragment.writeTypedList(), passwordNeo4D1AFragment.readTypedObject(), (Map) null, 512, (Object) null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        tdsCheckBoxV2View.setChecked(!tdsCheckBoxV2View.isChecked());
        if (tdsCheckBoxV2View.isChecked()) {
            context = tdsCheckBoxV2View.getContext();
            i = R.string.app_password_check_done;
        } else {
            context = tdsCheckBoxV2View.getContext();
            i = R.string.app_password_check_not_done;
        }
        String string2 = context.getString(i);
        int i11 = RatingCompat1 + 111;
        RatingCompatStarStyle = i11 % 128;
        if (i11 % 2 == 0) {
            tdsCheckBoxV2View.announceForAccessibility(string2);
            textView.getText();
            tdsCheckBoxV2View.isChecked();
            throw null;
        }
        tdsCheckBoxV2View.announceForAccessibility(string2);
        CharSequence text = textView.getText();
        String string3 = passwordNeo4D1AFragment.getString(tdsCheckBoxV2View.isChecked() ? R.string.app_password_check_done : R.string.app_password_check_not_done);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        Object[] objArr2 = new Object[1];
        b(KeyEvent.keyCodeFromString("") + 1, (char) (AndroidCharacter.getMirror('0') - '0'), 346 - ExpandableListView.getPackedPositionChild(0L), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(string3);
        view.setContentDescription(sb.toString());
        return null;
    }

    private final Unit getSmallIconId() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 121;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        int i4 = RatingCompat1 + 17;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        if (requireActivity() instanceof PasswordActivity) {
            int i6 = RatingCompatStarStyle + 121;
            RatingCompat1 = i6 % 128;
            int i7 = i6 % 2;
            View view = setcacertIEngagementSignalsCallback.RemoteActionCompatParcelizer;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            Space space = setcacertIEngagementSignalsCallback.ITrustedWebActivityServiceStub;
            Intrinsics.checkNotNullExpressionValue(space, "");
            space.setVisibility(0);
        } else {
            View view2 = setcacertIEngagementSignalsCallback.RemoteActionCompatParcelizer;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
            Space space2 = setcacertIEngagementSignalsCallback.ITrustedWebActivityServiceStub;
            Intrinsics.checkNotNullExpressionValue(space2, "");
            space2.setVisibility(8);
        }
        ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        disableImageViewPreallocationAndroid.IAuthTabCallback(constraintLayout, 0, false, 2, (Object) null);
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 57;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = onExtraCallback(this.postMessage);
        int i4 = iOnExtraCallback - 1;
        AuthPinDotView authPinDotView = onVerticalScrollEvent().get(i4);
        View view = IEngagementSignalsCallbackDefault().get(i4);
        authPinDotView.IAuthTabCallbackDefault();
        view.setContentDescription(getString(R.string.app_password___64098e62fc, new Object[]{String.valueOf(iOnExtraCallback)}));
        onExtraCallbackWithResult().announceForAccessibility(getString(R.string.app_password___49003299c7, new Object[]{str, String.valueOf(onExtraCallback(this.postMessage))}));
        int i5 = RatingCompatStarStyle + 111;
        RatingCompat1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void asInterface() {
        int i = 2 % 2;
        onWarmupCompleted(true);
        int i2 = 0;
        for (Object obj : this.ICustomTabsServiceStubProxy) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                int i4 = RatingCompatStarStyle + 29;
                RatingCompat1 = i4 % 128;
                if (i4 % 2 != 0) {
                    CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CollectionsKt.throwIndexOverflow();
            }
            ((View) obj).setContentDescription(AFj1rSDK.onExtraCallback.onExtraCallback(R.string.app_password___e445d6d193, new Object[]{Integer.valueOf(i3)}));
            int i5 = RatingCompatStarStyle + 65;
            RatingCompat1 = i5 % 128;
            int i6 = i5 % 2;
            i2 = i3;
        }
        onExtraCallbackWithResult(this.postMessage);
        onExtraCallbackWithResult().announceForAccessibility(AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_password___6bb9cb3c1f));
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 101;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroyView();
            onExtraCallbackWithResult(this.postMessage);
            IEngagementSignalsCallbackStub().destroy();
            ICustomTabsServiceStub();
            int i3 = 96 / 0;
        } else {
            super.onDestroyView();
            onExtraCallbackWithResult(this.postMessage);
            IEngagementSignalsCallbackStub().destroy();
            ICustomTabsServiceStub();
        }
        int i4 = RatingCompatStarStyle + 95;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ICustomTabsServiceStub() {
        int i = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.getSmallIconId;
        if (runonuithreaddelayed != null) {
            int i2 = RatingCompat1 + 51;
            RatingCompatStarStyle = i2 % 128;
            int i3 = i2 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        ValueAnimator valueAnimator = this.ICustomTabsCallbackStub;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.ITrustedWebActivityService_Parcel;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.ITrustedWebActivityCallbackDefault;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.getSmallIconBitmap;
        if (valueAnimator4 != null) {
            int i4 = RatingCompat1 + 83;
            RatingCompatStarStyle = i4 % 128;
            if (i4 % 2 == 0) {
                valueAnimator4.cancel();
                throw null;
            }
            valueAnimator4.cancel();
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.ICustomTabsCallback_Parcel;
        if (runonuithreaddelayed2 != null) {
            runonuithreaddelayed2.onNavigationEvent();
            int i5 = RatingCompatStarStyle + 27;
            RatingCompat1 = i5 % 128;
            int i6 = i5 % 2;
        }
        ValueAnimator valueAnimator5 = this.RemoteActionCompatParcelizer;
        if (valueAnimator5 != null) {
            int i7 = RatingCompat1 + 59;
            RatingCompatStarStyle = i7 % 128;
            if (i7 % 2 == 0) {
                valueAnimator5.cancel();
                throw null;
            }
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.requestPostMessageChannel;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        ValueAnimator valueAnimator7 = this.ITrustedWebActivityServiceDefault;
        if (valueAnimator7 != null) {
            int i8 = RatingCompat1 + 125;
            RatingCompatStarStyle = i8 % 128;
            if (i8 % 2 == 0) {
                valueAnimator7.cancel();
                int i9 = 85 / 0;
            } else {
                valueAnimator7.cancel();
            }
        }
        ValueAnimator valueAnimator8 = this.receiveFile;
        if (valueAnimator8 != null) {
            valueAnimator8.cancel();
        }
        ValueAnimator valueAnimator9 = this.newSession;
        if (valueAnimator9 != null) {
            valueAnimator9.cancel();
        }
        ValueAnimator valueAnimator10 = this.prefetchWithMultipleUrls;
        if (valueAnimator10 != null) {
            int i10 = RatingCompat1 + 9;
            RatingCompatStarStyle = i10 % 128;
            int i11 = i10 % 2;
            valueAnimator10.cancel();
        }
        ValueAnimator valueAnimator11 = this.setEngagementSignalsCallback;
        if (valueAnimator11 != null) {
            valueAnimator11.cancel();
        }
        ValueAnimator valueAnimator12 = this.warmup;
        if (valueAnimator12 != null) {
            int i12 = RatingCompat1 + 95;
            RatingCompatStarStyle = i12 % 128;
            if (i12 % 2 != 0) {
                valueAnimator12.cancel();
            } else {
                valueAnimator12.cancel();
                int i13 = 6 / 0;
            }
        }
    }

    public long getScreenId() {
        Long lIAuthTabCallback;
        int i = 2 % 2;
        if (!isEngagementSignalsApiAvailable()) {
            if (onActivityResized() == PasswordFragment.onNavigationEvent.INPUT) {
                return 1222813L;
            }
            if (onActivityResized() == PasswordFragment.onNavigationEvent.CONFIRM) {
                int i2 = RatingCompat1 + 59;
                RatingCompatStarStyle = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 12 / 0;
                }
                return 1223321L;
            }
            PasswordFragment.onExtraCallback onextracallback = this.ITrustedWebActivityCallbackStubProxy;
            if (onextracallback == null || (lIAuthTabCallback = onextracallback.IAuthTabCallback()) == null) {
                return -1L;
            }
            return lIAuthTabCallback.longValue();
        }
        int i4 = RatingCompatStarStyle + 57;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return 1223321L;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        Map mapIAuthTabCallback;
        Map mapOnNavigationEvent;
        int i = 2 % 2;
        boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        Object[] objArr = new Object[1];
        b(21 - ExpandableListView.getPackedPositionChild(0L), (char) (57007 - Color.green(0)), KeyEvent.getDeadChar(0, 0) + 651, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (zIsEngagementSignalsApiAvailable) {
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            String loginYN = indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null;
            Object[] objArr2 = new Object[1];
            b(8 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (36272 - View.MeasureSpec.getMode(0)), 417 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), loginYN);
            PasswordFragment.onNavigationEvent onnavigationeventOnActivityResized = onActivityResized();
            if (onnavigationeventOnActivityResized == null || !onnavigationeventOnActivityResized.isChangingPassword()) {
                IndicatorView indicatorViewAccess1002 = createpaints.access100();
                strIntern = indicatorViewAccess1002 != null ? indicatorViewAccess1002.getLogValue() : null;
            }
            Object[] objArr3 = new Object[1];
            b(Color.argb(0, 0, 0, 0) + 11, (char) (TextUtils.lastIndexOf("", '0') + 1), 424 - TextUtils.lastIndexOf("", '0'), objArr3);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), strIntern);
            Object[] objArr4 = new Object[1];
            b(TextUtils.getOffsetBefore("", 0) + 11, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 447 - View.MeasureSpec.getSize(0), objArr4);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), onSessionEnded());
            Object[] objArr5 = new Object[1];
            b(17 - (Process.myTid() >> 22), (char) (5192 - TextUtils.indexOf("", "")), 506 - AndroidCharacter.getMirror('0'), objArr5);
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), writeTypedList());
            Object[] objArr6 = new Object[1];
            b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 475 - TextUtils.indexOf("", "", 0), objArr6);
            mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), Long.valueOf(readTypedObject()))});
        } else {
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            String loginYN2 = indicatorViewAccess1003 != null ? indicatorViewAccess1003.getLoginYN() : null;
            Object[] objArr7 = new Object[1];
            b(9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (36272 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 416 - ExpandableListView.getPackedPositionChild(0L), objArr7);
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), loginYN2);
            PasswordFragment.onNavigationEvent onnavigationeventOnActivityResized2 = onActivityResized();
            if (onnavigationeventOnActivityResized2 == null || !onnavigationeventOnActivityResized2.isChangingPassword()) {
                IndicatorView indicatorViewAccess1004 = createpaints2.access100();
                strIntern = indicatorViewAccess1004 != null ? indicatorViewAccess1004.getLogValue() : null;
            }
            Object[] objArr8 = new Object[1];
            b(Color.rgb(0, 0, 0) + 16777227, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 425, objArr8);
            Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), strIntern);
            Object[] objArr9 = new Object[1];
            b(11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getSize(0) + 447, objArr9);
            Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), onSessionEnded());
            Object[] objArr10 = new Object[1];
            b(View.resolveSizeAndState(0, 0, 0) + 17, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5192), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 458, objArr10);
            Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), writeTypedList());
            Object[] objArr11 = new Object[1];
            b((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0') + 476, objArr11);
            mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), Long.valueOf(readTypedObject()))});
            int i2 = RatingCompatStarStyle + 9;
            RatingCompat1 = i2 % 128;
            int i3 = i2 % 2;
        }
        PasswordFragment.onExtraCallback onextracallback = this.ITrustedWebActivityCallbackStubProxy;
        if (onextracallback != null) {
            int i4 = RatingCompat1 + 111;
            RatingCompatStarStyle = i4 % 128;
            if (i4 % 2 == 0) {
                onextracallback.ICustomTabsServiceStub();
                throw null;
            }
            Map<String, Object> mapICustomTabsServiceStub = onextracallback.ICustomTabsServiceStub();
            mapOnNavigationEvent = mapICustomTabsServiceStub != null ? access8100.onWarmupCompleted(mapICustomTabsServiceStub) : null;
        } else {
            mapOnNavigationEvent = null;
        }
        if (mapOnNavigationEvent == null) {
            mapOnNavigationEvent = access8100.onNavigationEvent();
        }
        Map<String, Object> mapOnWarmupCompleted = access8100.onWarmupCompleted(access8100.onWarmupCompleted(mapIAuthTabCallback, mapOnNavigationEvent));
        Object[] objArr12 = new Object[1];
        b(TextUtils.indexOf("", "") + 7, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 33191), ((Process.getThreadPriority(0) + 20) >> 6) + 484, objArr12);
        String strIntern2 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        b(1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (Color.rgb(0, 0, 0) + 16777216), 170 - Process.getGidForName(""), objArr13);
        mapOnWarmupCompleted.put(strIntern2, ((String) objArr13[0]).intern());
        return mapOnWarmupCompleted;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = RatingCompat1;
        int i3 = i2 + 37;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = i2 + 121;
        RatingCompatStarStyle = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    private final int onExtraCallback(char[] cArr) {
        int i = 2 % 2;
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = RatingCompatStarStyle + 107;
            int i5 = i4 % 128;
            RatingCompat1 = i5;
            int i6 = i4 % 2;
            if (cArr[i2] == 9679) {
                int i7 = i5 + 25;
                RatingCompatStarStyle = i7 % 128;
                int i8 = i7 % 2;
                return i3;
            }
            i2++;
            i3++;
        }
        return IPostMessageServiceStub();
    }

    private final void onNavigationEvent(char[] cArr, String str) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 43;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        cArr[onExtraCallback(cArr)] = StringsKt.single(str);
        int i4 = RatingCompat1 + 13;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallback(char[] cArr, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat1;
        int i4 = i3 + 67;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        cArr[i] = 9679;
        int i6 = i3 + 107;
        RatingCompatStarStyle = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void onExtraCallbackWithResult(char[] cArr) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 41;
        RatingCompatStarStyle = i2 % 128;
        Arrays.fill(cArr, i2 % 2 == 0 ? (char) 6586 : (char) 9679);
    }

    private static final Unit onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 29;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 447 - View.combineMeasuredStates(0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), passwordNeo4D1AFragment.onSessionEnded());
        Object[] objArr2 = new Object[1];
        b(17 - KeyEvent.getDeadChar(0, 0), (char) (5192 - View.MeasureSpec.makeMeasureSpec(0, 0)), 458 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), passwordNeo4D1AFragment.writeTypedList());
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 61;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Unit IAuthTabCallback(java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.IAuthTabCallback(java.lang.String):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private final Unit MediaSessionCompatQueueItem() {
        ?? r2;
        String str;
        List list;
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        int i2 = RatingCompatStarStyle + 19;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.IEngagementSignalsCallbackDefault) {
            this.IEngagementSignalsCallbackDefault = true;
            LinearLayout linearLayout = setcacertIEngagementSignalsCallback.getActiveNotifications;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback.ITrustedWebActivityServiceDefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            List listMutableListOf = CollectionsKt.mutableListOf(new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 100}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)});
            if (onExtraCallback(this.postMessage) > 0) {
                int i4 = RatingCompatStarStyle + 23;
                RatingCompat1 = i4 % 128;
                int i5 = i4 % 2;
                TdsImageView tdsImageView = setcacertIEngagementSignalsCallback.asInterface;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                r2 = 0;
                str = "";
                list = listMutableListOf;
                list.add((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 100}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            } else {
                r2 = 0;
                str = "";
                list = listMutableListOf;
            }
            runOnUiThreadDelayed runonuithreaddelayed = this.updateVisuals;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.onNavigationEvent();
            }
            this.updateVisuals = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, list, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda114
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.asBinder(setcacertIEngagementSignalsCallback);
                }
            }, 1, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda115
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.IAuthTabCallback(setcacertIEngagementSignalsCallback);
                }
            }, 1, (Object) null), (boolean) r2, 1, (Object) null);
            ConstraintLayout constraintLayout2 = setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, str);
            constraintLayout2.setVisibility(r2);
            setcacertIEngagementSignalsCallback.ITrustedWebActivityServiceDefault.announceForAccessibility(AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(viva.republica.toss.R.string.app_password___1d4c0c654f));
        }
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 73;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        setcacert.ITrustedWebActivityServiceDefault.setAlpha(0.0f);
        ConstraintLayout constraintLayout = setcacert.ITrustedWebActivityServiceDefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        setcacert.asInterface.setAlpha(0.0f);
        TdsImageView tdsImageView = setcacert.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 99;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStubProxy(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 67;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = setcacert.getActiveNotifications;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 85;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final Unit RatingCompatApi19Impl() {
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        int i2 = RatingCompatStarStyle + 53;
        int i3 = i2 % 128;
        RatingCompat1 = i3;
        int i4 = i2 % 2;
        if (!(!this.IEngagementSignalsCallbackDefault)) {
            int i5 = i3 + 39;
            int i6 = i5 % 128;
            RatingCompatStarStyle = i6;
            int i7 = i5 % 2;
            this.IEngagementSignalsCallbackDefault = false;
            runOnUiThreadDelayed runonuithreaddelayed = this.updateVisuals;
            if (runonuithreaddelayed != null) {
                int i8 = i6 + 9;
                RatingCompat1 = i8 % 128;
                int i9 = i8 % 2;
                runonuithreaddelayed.onNavigationEvent();
            }
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback.ITrustedWebActivityServiceDefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            TdsImageView tdsImageView = setcacertIEngagementSignalsCallback.asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            LinearLayout linearLayout = setcacertIEngagementSignalsCallback.getActiveNotifications;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            this.updateVisuals = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 100}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda76
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.onExtraCallbackWithResult(setcacertIEngagementSignalsCallback);
                }
            }, 1, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda77
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.onWarmupCompleted(setcacertIEngagementSignalsCallback);
                }
            }, 1, (Object) null), false, 1, (Object) null);
            setcacertIEngagementSignalsCallback.getActiveNotifications.announceForAccessibility(getString(viva.republica.toss.R.string.app_password___14bc8c3a26));
        }
        return Unit.INSTANCE;
    }

    private static final Unit access000(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 103;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        setcacert.getActiveNotifications.setAlpha(0.0f);
        LinearLayout linearLayout = setcacert.getActiveNotifications;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 105;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object requestPostMessageChannelWithExtras(Object[] objArr) {
        setCACert setcacert = (setCACert) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 49;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = setcacert.ITrustedWebActivityServiceDefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        TdsImageView tdsImageView = setcacert.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 105;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final Unit MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 121;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            IEngagementSignalsCallback();
            getpackagetype.hashCode();
            throw null;
        }
        if (IEngagementSignalsCallback() != null) {
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(this);
            this.ICustomTabsCallbackStubProxy = textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null ? maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(null), 3, (Object) null) : null;
            return Unit.INSTANCE;
        }
        int i3 = RatingCompat1 + 63;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        getpackagetype.hashCode();
        throw null;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        if (onExtraCallback(this.postMessage) == IPostMessageServiceStub()) {
            return;
        }
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.asBinder());
        if (onExtraCallback(this.postMessage) != 0) {
            int i2 = RatingCompatStarStyle + 27;
            RatingCompat1 = i2 % 128;
            int i3 = i2 % 2;
            if (!this.IEngagementSignalsCallbackDefault) {
                MediaSessionCompatQueueItem();
            }
            int iOnExtraCallback = onExtraCallback(this.postMessage);
            int i4 = iOnExtraCallback - 1;
            View view = IEngagementSignalsCallbackDefault().get(i4);
            onVerticalScrollEvent().get(i4).IAuthTabCallbackStub();
            view.setContentDescription(getString(viva.republica.toss.R.string.app_password___e445d6d193, new Object[]{String.valueOf(iOnExtraCallback)}));
            onExtraCallback(this.postMessage, i4);
            int i5 = RatingCompat1 + 121;
            RatingCompatStarStyle = i5 % 128;
            int i6 = i5 % 2;
        }
        if (onExtraCallback(this.postMessage) == 0) {
            RatingCompat();
            getSmallIconBitmap();
        }
        onExtraCallbackWithResult().announceForAccessibility(getString(viva.republica.toss.R.string.app_password___1b56688847, new Object[]{String.valueOf(onExtraCallback(this.postMessage))}));
    }

    private final Unit RatingCompat() {
        final setCACert setcacertIEngagementSignalsCallback;
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 33;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
            int i3 = 88 / 0;
            if (setcacertIEngagementSignalsCallback == null) {
                return null;
            }
        } else {
            setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
            if (setcacertIEngagementSignalsCallback == null) {
                return null;
            }
        }
        ValueAnimator valueAnimator = this.RemoteActionCompatParcelizer;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            final float f = this.MediaMetadataCompat;
            if (f != 1.0f) {
                final float translationY = setcacertIEngagementSignalsCallback.MediaBrowserCompatMediaItem.getTranslationY();
                ValueAnimator valueAnimator2 = this.requestPostMessageChannel;
                if (valueAnimator2 != null) {
                    int i4 = RatingCompatStarStyle + 25;
                    RatingCompat1 = i4 % 128;
                    int i5 = i4 % 2;
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = this.RemoteActionCompatParcelizer;
                if (valueAnimator3 != null) {
                    int i6 = RatingCompatStarStyle + 65;
                    RatingCompat1 = i6 % 128;
                    int i7 = i6 % 2;
                    valueAnimator3.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                valueAnimatorOfFloat.setInterpolator((deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1675654661, iIAuthTabCallback2, 1675654680, new Object[]{this}, iIAuthTabCallback));
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
                valueAnimatorOfFloat.setDuration(((deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback5, -1675654661, iIAuthTabCallback4, 1675654680, new Object[]{this}, iIAuthTabCallback3)).IAuthTabCallback());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda43
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) throws Throwable {
                        PasswordNeo4D1AFragment.onExtraCallbackWithResult(this.f$0, f, translationY, setcacertIEngagementSignalsCallback, valueAnimator4);
                    }
                });
                valueAnimatorOfFloat.start();
                this.RemoteActionCompatParcelizer = valueAnimatorOfFloat;
            }
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, float f2, setCACert setcacert, ValueAnimator valueAnimator) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 79;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f3 = f + ((1.0f - f) * fFloatValue);
        passwordNeo4D1AFragment.MediaMetadataCompat = f3;
        float f4 = f2 - (fFloatValue * f2);
        setcacert.AudioAttributesImplBaseParcelizer.setAlpha(passwordNeo4D1AFragment.ITrustedWebActivityService * f3);
        setcacert.MediaBrowserCompatMediaItem.setAlpha((1.0f - passwordNeo4D1AFragment.ITrustedWebActivityService) * passwordNeo4D1AFragment.MediaMetadataCompat);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0) + 31, 24887 - View.combineMeasuredStates(0, 0), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 29 - MotionEvent.axisFromString(""), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24886, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            if (((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue() < 4) {
                int i4 = RatingCompatStarStyle + 95;
                RatingCompat1 = i4 % 128;
                if (i4 % 2 != 0) {
                    setcacert.MediaDescriptionCompat.setAlpha(passwordNeo4D1AFragment.MediaMetadataCompat);
                    int i5 = 58 / 0;
                } else {
                    setcacert.MediaDescriptionCompat.setAlpha(passwordNeo4D1AFragment.MediaMetadataCompat);
                }
            }
            setcacert.MediaBrowserCompatMediaItem.setTranslationY(f4);
            setcacert.AudioAttributesImplBaseParcelizer.setTranslationY(f4);
            setcacert.MediaDescriptionCompat.setTranslationY(f4);
            setcacert.onVerticalScrollEvent.setTranslationY(f4 + passwordNeo4D1AFragment.IPostMessageServiceStub);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final Unit ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        Object obj = null;
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        ValueAnimator valueAnimator = this.requestPostMessageChannel;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            final float f = this.MediaMetadataCompat;
            if (f != 0.0f) {
                int i2 = RatingCompatStarStyle + 65;
                RatingCompat1 = i2 % 128;
                int i3 = i2 % 2;
                final float alpha = setcacertIEngagementSignalsCallback.AudioAttributesImplBaseParcelizer.getAlpha();
                final float alpha2 = setcacertIEngagementSignalsCallback.MediaDescriptionCompat.getAlpha();
                final float translationY = setcacertIEngagementSignalsCallback.MediaBrowserCompatMediaItem.getTranslationY();
                Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
                final float f2 = -varyMatches.onNavigationEvent(20, r3);
                ValueAnimator valueAnimator2 = this.RemoteActionCompatParcelizer;
                if (valueAnimator2 != null) {
                    int i4 = RatingCompat1 + 27;
                    RatingCompatStarStyle = i4 % 128;
                    if (i4 % 2 == 0) {
                        valueAnimator2.cancel();
                        obj.hashCode();
                        throw null;
                    }
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = this.requestPostMessageChannel;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                valueAnimatorOfFloat.setInterpolator((deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1675654661, iIAuthTabCallback2, 1675654680, new Object[]{this}, iIAuthTabCallback));
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
                valueAnimatorOfFloat.setDuration(((deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback5, -1675654661, iIAuthTabCallback4, 1675654680, new Object[]{this}, iIAuthTabCallback3)).IAuthTabCallback());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda118
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        PasswordNeo4D1AFragment.onWarmupCompleted(translationY, f2, this, f, setcacertIEngagementSignalsCallback, alpha, alpha2, valueAnimator4);
                    }
                });
                valueAnimatorOfFloat.start();
                this.requestPostMessageChannel = valueAnimatorOfFloat;
            }
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(float f, float f2, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f3, setCACert setcacert, float f4, float f5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 99;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f6 = f + ((f2 - f) * fFloatValue);
        float f7 = f3 - (fFloatValue * f3);
        passwordNeo4D1AFragment.MediaMetadataCompat = f7;
        setcacert.MediaBrowserCompatMediaItem.setAlpha(f3 * f7);
        setcacert.AudioAttributesImplBaseParcelizer.setAlpha(f4 * passwordNeo4D1AFragment.MediaMetadataCompat);
        setcacert.MediaDescriptionCompat.setAlpha(f5 * passwordNeo4D1AFragment.MediaMetadataCompat);
        setcacert.MediaBrowserCompatMediaItem.setTranslationY(f6);
        setcacert.AudioAttributesImplBaseParcelizer.setTranslationY(f6);
        setcacert.MediaDescriptionCompat.setTranslationY(f6);
        setcacert.onVerticalScrollEvent.setTranslationY(f6 + passwordNeo4D1AFragment.IPostMessageServiceStub);
        int i4 = RatingCompatStarStyle + 101;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final Unit getSmallIconBitmap() {
        int i = 2 % 2;
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            int i2 = RatingCompat1 + 117;
            RatingCompatStarStyle = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (setcacertIEngagementSignalsCallback.asInterface.getAlpha() != 0.0f) {
            int i3 = RatingCompat1 + 17;
            RatingCompatStarStyle = i3 % 128;
            int i4 = i3 % 2;
            ValueAnimator valueAnimator = this.receiveFile;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                final float scaleX = setcacertIEngagementSignalsCallback.asInterface.getScaleX();
                final float alpha = setcacertIEngagementSignalsCallback.asInterface.getAlpha();
                ValueAnimator valueAnimator2 = this.ITrustedWebActivityServiceDefault;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    int i5 = RatingCompatStarStyle + 9;
                    RatingCompat1 = i5 % 128;
                    int i6 = i5 % 2;
                }
                ValueAnimator valueAnimator3 = this.receiveFile;
                if (valueAnimator3 != null) {
                    int i7 = RatingCompatStarStyle + 73;
                    RatingCompat1 = i7 % 128;
                    if (i7 % 2 != 0) {
                        valueAnimator3.cancel();
                        int i8 = 86 / 0;
                    } else {
                        valueAnimator3.cancel();
                    }
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                valueAnimatorOfFloat.setInterpolator((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{this}, iIAuthTabCallback));
                valueAnimatorOfFloat.setDuration(400L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda74
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        PasswordNeo4D1AFragment.onExtraCallback(scaleX, setcacertIEngagementSignalsCallback, alpha, valueAnimator4);
                    }
                });
                valueAnimatorOfFloat.start();
                this.receiveFile = valueAnimatorOfFloat;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object updateVisuals(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        setCACert setcacert = (setCACert) objArr[1];
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[3];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 77;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue3 = ((Float) animatedValue).floatValue();
        float f = fFloatValue + ((0.8f - fFloatValue) * fFloatValue3);
        setcacert.asInterface.setAlpha(fFloatValue2 - (fFloatValue3 * fFloatValue2));
        setcacert.asInterface.setScaleX(f);
        setcacert.asInterface.setScaleY(f);
        int i4 = RatingCompat1 + 85;
        RatingCompatStarStyle = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(float f, setCACert setcacert, float f2, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 51;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f3 = f + ((1.0f - f) * fFloatValue);
        setcacert.asInterface.setAlpha(f2 + (fFloatValue * (1.0f - f2)));
        setcacert.asInterface.setScaleX(f3);
        setcacert.asInterface.setScaleY(f3);
        int i4 = RatingCompatStarStyle + 31;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onNavigationEvent(@NotNull Function0<Unit> function0) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 97;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            super.onNavigationEvent(function0);
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        super.onNavigationEvent(function0);
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        int i3 = RatingCompatStarStyle + 53;
        RatingCompat1 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onNavigationEvent(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 27;
        RatingCompat1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            IEngagementSignalsCallback();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            return;
        }
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.access100());
        ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(constraintLayout, deprecated_proxy.onNavigationEvent.onExtraCallbackWithResult(deprecated_proxySelector.BIG, certificatePinner.X).onNavigationEvent(), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 1L, false, 1404, (Object) null), false, 1, (Object) null);
        onExtraCallbackWithResult(this.postMessage);
        Iterator<T> it = onVerticalScrollEvent().iterator();
        while (it.hasNext()) {
            ((AuthPinDotView) it.next()).IAuthTabCallbackStub();
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 29 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.green(0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 24888 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue();
            if (iIntValue == 0 || iIntValue == 1) {
                setcacertIEngagementSignalsCallback.read.IAuthTabCallbackStub();
                setcacertIEngagementSignalsCallback.MediaDescriptionCompat.setText(charSequence2);
                setcacertIEngagementSignalsCallback.RatingCompat.setText(charSequence2);
                Object[] objArr = {this, Integer.valueOf(iIntValue)};
                int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1068795694, _string.onNavigationEvent.IAuthTabCallback(), 1068795735, objArr, iIAuthTabCallback);
                onNavigationEvent(charSequence.toString());
                Unit unit = Unit.INSTANCE;
            } else {
                int i3 = RatingCompatStarStyle + 29;
                RatingCompat1 = i3 % 128;
                int i4 = i3 % 2;
                if (iIntValue == 2 || iIntValue == 3) {
                    setcacertIEngagementSignalsCallback.read.IAuthTabCallbackStub();
                    setcacertIEngagementSignalsCallback.MediaDescriptionCompat.setText(charSequence2);
                    setcacertIEngagementSignalsCallback.RatingCompat.setText(charSequence2);
                    Object[] objArr2 = {this, Integer.valueOf(iIntValue)};
                    int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                    onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1068795694, _string.onNavigationEvent.IAuthTabCallback(), 1068795735, objArr2, iIAuthTabCallback2);
                    onNavigationEvent(charSequence.toString());
                    ComponentActivity();
                } else {
                    setcacertIEngagementSignalsCallback.read.IAuthTabCallbackStub();
                    if (StringsKt.isBlank(charSequence2)) {
                        setcacertIEngagementSignalsCallback.MediaDescriptionCompat.setAlpha(0.0f);
                    } else {
                        setcacertIEngagementSignalsCallback.MediaDescriptionCompat.setText(charSequence2);
                        setcacertIEngagementSignalsCallback.RatingCompat.setText(charSequence2);
                    }
                    Object[] objArr3 = {this, Integer.valueOf(iIntValue)};
                    int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                    onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1068795694, _string.onNavigationEvent.IAuthTabCallback(), 1068795735, objArr3, iIAuthTabCallback3);
                    onNavigationEvent(charSequence.toString());
                    ComponentActivity();
                }
            }
            MediaSessionCompatQueueItem();
            onExtraCallback(this, (Function0) null, 1, (Object) null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Unit write() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r1 = r1 + 49
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r2
            int r1 = r1 % r0
            o.setCACert r1 = r10.IEngagementSignalsCallback()
            r2 = 0
            if (r1 == 0) goto L91
            androidx.constraintlayout.widget.ConstraintLayout r3 = r1.RatingCompatStarStyle
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            int r3 = r3.getVisibility()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L3d
            int r3 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r3 = r3 + 45
            int r6 = r3 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r6
            int r3 = r3 % r0
            if (r3 == 0) goto L37
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View r1 = r1.MediaMetadataCompat
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L3d
            r1 = r5
            goto L3e
        L37:
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View r0 = r1.MediaMetadataCompat
            r0.isChecked()
            throw r2
        L3d:
            r1 = r4
        L3e:
            boolean r3 = r10.mayLaunchUrl()
            if (r3 == 0) goto L58
            int r3 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r3 = r3 + 9
            int r5 = r3 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L55
            r10.IEngagementSignalsCallback_Parcel = r1
            r1 = 70
            int r1 = r1 / r4
            goto L62
        L55:
            r10.IEngagementSignalsCallback_Parcel = r1
            goto L62
        L58:
            boolean r3 = r10.IPostMessageService
            if (r3 != 0) goto L5f
            r1 = r1 ^ r5
            if (r1 == r5) goto L60
        L5f:
            r4 = r5
        L60:
            r10.IPostMessageService = r4
        L62:
            o.GraniteBrownfieldModule_closeView r1 = new o.GraniteBrownfieldModule_closeView
            char[] r3 = r10.postMessage
            r1.<init>(r3)
            r10.onWarmupCompleted(r1)
            viva.republica.toss.password.PasswordFragment$onWarmupCompleted r4 = r10.extraCallback()
            if (r4 == 0) goto L91
            o.GraniteBrownfieldModule_closeView r5 = r10.IEngagementSignalsCallbackStub()
            boolean r6 = r10.IPostMessageService
            java.lang.String r7 = r10.onSessionEnded()
            java.lang.String r8 = r10.writeTypedList()
            boolean r9 = r10.IEngagementSignalsCallback_Parcel
            r4.onWarmupCompleted(r5, r6, r7, r8, r9)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            int r2 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r2 = r2 + 69
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r3
            int r2 = r2 % r0
            return r1
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.write():kotlin.Unit");
    }

    private static /* synthetic */ Object prefetch(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if (passwordNeo4D1AFragment.onExtraCallback(passwordNeo4D1AFragment.postMessage) > 0 && iIntValue < 4) {
            passwordNeo4D1AFragment.ITrustedWebActivityServiceDefault();
            return null;
        }
        if (passwordNeo4D1AFragment.onExtraCallback(passwordNeo4D1AFragment.postMessage) == 0) {
            passwordNeo4D1AFragment.RatingCompat();
            int i2 = RatingCompatStarStyle + 93;
            RatingCompat1 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = RatingCompat1 + 121;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = RatingCompat1 + 77;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            Object[] objArr = new Object[1];
            b(106 >> Color.red(0), (char) TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionGroup(0L) + 3403, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
            Object[] objArr2 = new Object[1];
            b(14 - Color.red(0), (char) TextUtils.getOffsetBefore("", 0), 729 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
            obj = objArr2[0];
        }
        bundle.putString(((String) obj).intern(), this.ITrustedWebActivityCallback_Parcel);
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
        int i3 = RatingCompat1 + 125;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        final setHasUserConsent sethasuserconsent = new setHasUserConsent(ITrustedWebActivityService(), ITrustedWebActivityCallback_Parcel());
        final setHasUserConsent sethasuserconsent2 = new setHasUserConsent(ITrustedWebActivityCallback_Parcel(), ITrustedWebActivityService());
        ValueAnimator valueAnimator = this.ITrustedWebActivityCallbackDefault;
        if (valueAnimator != null) {
            int i2 = RatingCompat1 + 77;
            RatingCompatStarStyle = i2 % 128;
            if (i2 % 2 == 0) {
                valueAnimator.cancel();
                int i3 = 19 / 0;
            } else {
                valueAnimator.cancel();
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(4800L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda117
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PasswordNeo4D1AFragment.onExtraCallback(this.f$0, sethasuserconsent, sethasuserconsent2, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.ITrustedWebActivityCallbackDefault = valueAnimatorOfFloat;
        int i4 = RatingCompatStarStyle + 71;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[PHI: r7
      0x00d5: PHI (r7v4 java.lang.Object) = (r7v3 java.lang.Object), (r7v8 java.lang.Object) binds: [B:35:0x00d3, B:32:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onNavigationEvent(viva.republica.toss.password.PasswordNeo4D1AFragment r19, o.setHasUserConsent r20, o.setHasUserConsent r21, android.animation.ValueAnimator r22) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onNavigationEvent(viva.republica.toss.password.PasswordNeo4D1AFragment, o.setHasUserConsent, o.setHasUserConsent, android.animation.ValueAnimator):void");
    }

    private final void IconCompatParcelizer() {
        int i = 2 % 2;
        ValueAnimator valueAnimator = this.ITrustedWebActivityService_Parcel;
        if (valueAnimator != null) {
            int i2 = RatingCompat1 + 109;
            RatingCompatStarStyle = i2 % 128;
            int i3 = i2 % 2;
            valueAnimator.cancel();
            int i4 = RatingCompat1 + 17;
            RatingCompatStarStyle = i4 % 128;
            int i5 = i4 % 2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(2000L);
        final float f = 0.1f;
        final float f2 = 1.0f;
        final float f3 = 0.25f;
        final float f4 = 0.75f;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda46
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Object[] objArr = {this.f$0, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), valueAnimator2};
                int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1093237021, iIAuthTabCallback2, -1093236991, objArr, iIAuthTabCallback);
            }
        });
        valueAnimatorOfFloat.setStartDelay(100L);
        valueAnimatorOfFloat.start();
        this.ITrustedWebActivityService_Parcel = valueAnimatorOfFloat;
    }

    private static final void onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float fFloatValue;
        float interpolation;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        int i2 = 0;
        for (Object obj : passwordNeo4D1AFragment.onVerticalScrollEvent()) {
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AuthPinDotView authPinDotView = (AuthPinDotView) obj;
            if (valueAnimator.getCurrentPlayTime() == 0) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "");
                fFloatValue = Math.max(((Float) animatedValue).floatValue() - (i2 * f), 0.0f);
            } else {
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue2, "");
                fFloatValue = ((Float) animatedValue2).floatValue() - (i2 * f);
            }
            if (fFloatValue < 0.0f) {
                int i3 = RatingCompat1 + 9;
                RatingCompatStarStyle = i3 % 128;
                int i4 = i3 % 2;
                fFloatValue += 1.0f;
            }
            if (fFloatValue < 0.5f) {
                int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                interpolation = f2 - (((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).getInterpolation(fFloatValue * 2.0f) * f3);
            } else {
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
                interpolation = (((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1707222315, iIAuthTabCallback4, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback3)).getInterpolation((fFloatValue - 0.5f) * 2.0f) * f3) + f4;
                int i5 = RatingCompat1 + 99;
                RatingCompatStarStyle = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 % 5;
                }
            }
            authPinDotView.setSmallOpacity(interpolation);
            i2++;
        }
    }

    private final Unit MediaMetadataCompat() throws Throwable {
        ValueAnimator valueAnimatorOnExtraCallbackWithResult;
        setCACert setcacertIEngagementSignalsCallback;
        int i = 2 % 2;
        final setCACert setcacertIEngagementSignalsCallback2 = IEngagementSignalsCallback();
        Object obj = null;
        if (setcacertIEngagementSignalsCallback2 == null) {
            int i2 = RatingCompatStarStyle + 3;
            RatingCompat1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 29 / 0;
            }
            return null;
        }
        if (!this.access200) {
            ScrollView scrollView = setcacertIEngagementSignalsCallback2.access000;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            processDeepLink.onWarmupCompleted(scrollView, getVersionCode.STRONG);
            PlaybackStateCompat();
            RatingCompatStyle();
            AnimateText animateText = setcacertIEngagementSignalsCallback2.MediaBrowserCompatMediaItem;
            Intrinsics.checkNotNullExpressionValue(animateText, "");
            Typography6 typography6 = setcacertIEngagementSignalsCallback2.MediaDescriptionCompat;
            Intrinsics.checkNotNullExpressionValue(typography6, "");
            Object[] objArr = new Object[1];
            b(4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (6242 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 401 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            this.prefetchWithMultipleUrls = onExtraCallbackWithResult(100L, ((String) objArr[0]).intern(), animateText, typography6);
            ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback2.onVerticalScrollEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            Object[] objArr2 = new Object[1];
            b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ImageFormat.getBitsPerPixel(0) + 525, objArr2);
            this.setEngagementSignalsCallback = onExtraCallbackWithResult(140L, ((String) objArr2[0]).intern(), constraintLayout);
            ConstraintLayout constraintLayout2 = setcacertIEngagementSignalsCallback2.RatingCompatStarStyle;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            if (constraintLayout2.getVisibility() == 0) {
                int i4 = RatingCompatStarStyle + 9;
                RatingCompat1 = i4 % 128;
                int i5 = i4 % 2;
                ConstraintLayout constraintLayout3 = setcacertIEngagementSignalsCallback2.RatingCompatStarStyle;
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                Object[] objArr3 = new Object[1];
                b(13 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (61489 - MotionEvent.axisFromString("")), 537 - TextUtils.getOffsetAfter("", 0), objArr3);
                valueAnimatorOnExtraCallbackWithResult = onExtraCallbackWithResult(180L, ((String) objArr3[0]).intern(), constraintLayout3);
            } else {
                valueAnimatorOnExtraCallbackWithResult = null;
            }
            this.warmup = valueAnimatorOnExtraCallbackWithResult;
            if (!ICustomTabsCallbackStubProxy() && (setcacertIEngagementSignalsCallback = IEngagementSignalsCallback()) != null) {
                int i6 = RatingCompat1 + 43;
                RatingCompatStarStyle = i6 % 128;
                if (i6 % 2 == 0) {
                    GradientButtonView gradientButtonView = setcacertIEngagementSignalsCallback.read;
                    obj.hashCode();
                    throw null;
                }
                GradientButtonView gradientButtonView2 = setcacertIEngagementSignalsCallback.read;
                if (gradientButtonView2 != null) {
                    gradientButtonView2.IAuthTabCallbackStub();
                }
            }
            runOnUiThreadDelayed runonuithreaddelayed = this.getSmallIconId;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.onNavigationEvent();
            }
            this.getSmallIconId = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(IAuthTabCallbackStub(setcacertIEngagementSignalsCallback2), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda34
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.onExtraCallbackWithResult(this.f$0, setcacertIEngagementSignalsCallback2);
                }
            }, 1, (Object) null), false, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 65;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            passwordNeo4D1AFragment.AudioAttributesImplApi26Parcelizer();
            passwordNeo4D1AFragment.IconCompatParcelizer();
            passwordNeo4D1AFragment.AudioAttributesCompatParcelizer();
            setcacert.onNavigationEvent.setClipChildren(false);
            setcacert.access000.setClipChildren(true);
            setcacert.AudioAttributesCompatParcelizer.setClipChildren(false);
        } else {
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            passwordNeo4D1AFragment.AudioAttributesImplApi26Parcelizer();
            passwordNeo4D1AFragment.IconCompatParcelizer();
            passwordNeo4D1AFragment.AudioAttributesCompatParcelizer();
            setcacert.onNavigationEvent.setClipChildren(true);
            setcacert.access000.setClipChildren(true);
            setcacert.AudioAttributesCompatParcelizer.setClipChildren(true);
        }
        return Unit.INSTANCE;
    }

    private final Unit PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 23;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            IEngagementSignalsCallback();
            throw null;
        }
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        valueAnimatorOfFloat.setInterpolator((deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1675654661, iIAuthTabCallback2, 1675654680, new Object[]{this}, iIAuthTabCallback));
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        valueAnimatorOfFloat.setDuration(((deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback5, -1675654661, iIAuthTabCallback4, 1675654680, new Object[]{this}, iIAuthTabCallback3)).IAuthTabCallback());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda75
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PasswordNeo4D1AFragment.onExtraCallback(setcacertIEngagementSignalsCallback, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.newSession = valueAnimatorOfFloat;
        Unit unit = Unit.INSTANCE;
        int i3 = RatingCompat1 + 119;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(setCACert setcacert, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 107;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        setcacert.onTransact.setAlpha(fFloatValue);
        setcacert.onTransact.setScaleX(fFloatValue);
        setcacert.onTransact.setScaleY(fFloatValue);
        setcacert.IAuthTabCallbackStub.setAlpha(fFloatValue);
        setcacert.IAuthTabCallbackStub.setScaleX(fFloatValue);
        setcacert.IAuthTabCallbackStub.setScaleY(fFloatValue);
        setcacert.AudioAttributesImplApi21Parcelizer.setAlpha(fFloatValue);
        int i4 = RatingCompatStarStyle + 29;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 67;
        RatingCompat1 = i2 % 128;
        getPackageType getpackagetypeOnNavigationEvent = null;
        if (i2 % 2 == 0) {
            if (ICustomTabsCallbackStubProxy()) {
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(this);
                if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null) {
                    getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new asInterface(null), 3, (Object) null);
                    int i3 = RatingCompat1 + 61;
                    RatingCompatStarStyle = i3 % 128;
                    int i4 = i3 % 2;
                }
                this.ICustomTabsServiceStub = getpackagetypeOnNavigationEvent;
                return;
            }
            return;
        }
        ICustomTabsCallbackStubProxy();
        throw null;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted;
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        setCACert setcacertIEngagementSignalsCallback = passwordNeo4D1AFragment.IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(passwordNeo4D1AFragment)) == null) {
            int i2 = RatingCompatStarStyle + 101;
            RatingCompat1 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(setcacertIEngagementSignalsCallback, passwordNeo4D1AFragment, null), 3, (Object) null);
        int i4 = RatingCompatStarStyle + 47;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return getpackagetypeOnNavigationEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return o.maybeUpdateAnimatable.onNavigationEvent(r3, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new viva.republica.toss.password.PasswordNeo4D1AFragment.onTransact(r1, r11, null), 3, (java.lang.Object) null);
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 o.setCACert) = (r1v4 o.setCACert), (r1v7 o.setCACert) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final o.getPackageType onExtraCallback(kotlin.jvm.functions.Function0<kotlin.Unit> r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle
            int r1 = r1 + 89
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            o.setCACert r1 = r10.IEngagementSignalsCallback()
            r3 = 2
            int r3 = r3 / 0
            if (r1 == 0) goto L4a
            goto L1f
        L19:
            o.setCACert r1 = r10.IEngagementSignalsCallback()
            if (r1 == 0) goto L4a
        L1f:
            int r3 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle
            int r3 = r3 + 115
            int r4 = r3 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L35
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r3 = o.onRenderReady.onWarmupCompleted(r10)
            r4 = 95
            int r4 = r4 / 0
            if (r3 == 0) goto L4a
            goto L3b
        L35:
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r3 = o.onRenderReady.onWarmupCompleted(r10)
            if (r3 == 0) goto L4a
        L3b:
            r4 = r3
            r5 = 0
            r6 = 0
            viva.republica.toss.password.PasswordNeo4D1AFragment$onTransact r7 = new viva.republica.toss.password.PasswordNeo4D1AFragment$onTransact
            r7.<init>(r1, r11, r2)
            r8 = 3
            r9 = 0
            o.getPackageType r11 = o.maybeUpdateAnimatable.onNavigationEvent(r4, r5, r6, r7, r8, r9)
            return r11
        L4a:
            int r11 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle
            int r11 = r11 + 117
            int r1 = r11 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r1
            int r11 = r11 % r0
            if (r11 == 0) goto L59
            r11 = 66
            int r11 = r11 / 0
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onExtraCallback(kotlin.jvm.functions.Function0):o.getPackageType");
    }

    private final runOnUiThreadDelayed IAuthTabCallbackStub(setCACert setcacert) {
        int i = 2 % 2;
        pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(40);
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        deprecated_dns deprecated_dnsVar = (deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1675654661, _string.onNavigationEvent.IAuthTabCallback(), 1675654680, new Object[]{this}, iIAuthTabCallback);
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        View view = this.IPostMessageService_Parcel.get(0);
        Float fValueOf = Float.valueOf(0.0f);
        AppLovinSdkSettings interfaceDescriptor = isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageServiceDefault() / 2.0f), fValueOf, (Function1) null, 4, (Object) null);
        Float fValueOf2 = Float.valueOf(1.0f);
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = isMuted.onExtraCallback(interfaceDescriptor, fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onTransact(this.f$0, (attachAppLovinSdk) obj);
            }
        });
        Float fValueOf3 = Float.valueOf(1.5f);
        AppLovinSdkSettings appLovinSdkSettingsOnTransact = isMuted.onTransact(appLovinSdkSettingsOnExtraCallback, fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda24
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onExtraCallback(this.f$0, (attachAppLovinSdk) obj);
            }
        });
        Float fValueOf4 = Float.valueOf(90.0f);
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent(appLovinSdkSettingsOnTransact, fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda26
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (attachAppLovinSdk) obj};
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -888882442, iIAuthTabCallback3, 888882460, objArr, iIAuthTabCallback2);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        View view2 = (View) CollectionsKt.first(this.IPostMessageServiceStubProxy);
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Float fValueOf5 = Float.valueOf(40.0f);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings, fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null);
        Float fValueOf6 = Float.valueOf(10.0f);
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{view2, isMuted.onWarmupCompleted(appLovinSdkSettingsOnNavigationEvent, fValueOf6, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda27
            public final Object invoke(Object obj) {
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
                return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback4, 732775792, iIAuthTabCallback3, -732775753, new Object[]{(attachAppLovinSdk) obj}, iIAuthTabCallback2);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TextView textView = this.IPostMessageServiceStubProxy.get(2);
        AppLovinSdkSettings appLovinSdkSettings2 = new AppLovinSdkSettings();
        Float fValueOf7 = Float.valueOf(-40.0f);
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent2 = isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(appLovinSdkSettings2, fValueOf7, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null);
        Float fValueOf8 = Float.valueOf(-10.0f);
        isFireOS isfireosOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, (Rally) RallysKt.onWarmupCompleted(new Object[]{textView, isMuted.onWarmupCompleted(appLovinSdkSettingsOnNavigationEvent2, fValueOf8, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda28
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onWarmupCompleted((attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null);
        isFireOS isfireosOnWarmupCompleted2 = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageService_Parcel.get(1), isMuted.onNavigationEvent(isMuted.onTransact(isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageServiceDefault() / 2.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda29
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.getInterfaceDescriptor(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda30
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onRelationshipValidationResult(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda31
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onPostMessage(this.f$0, (attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageServiceStubProxy.get(3), isMuted.onWarmupCompleted(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf6, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda32
            public final Object invoke(Object obj) {
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
                return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback4, 70318500, iIAuthTabCallback3, -70318471, new Object[]{(attachAppLovinSdk) obj}, iIAuthTabCallback2);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageServiceStubProxy.get(5), isMuted.onWarmupCompleted(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), fValueOf7, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf8, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda33
            public final Object invoke(Object obj) {
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
                return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback4, 1428466924, iIAuthTabCallback3, -1428466889, new Object[]{(attachAppLovinSdk) obj}, iIAuthTabCallback2);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null);
        isFireOS isfireosOnWarmupCompleted3 = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageService_Parcel.get(2), isMuted.onNavigationEvent(isMuted.onTransact(isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageServiceDefault() / 2.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda14
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onActivityResized(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.IAuthTabCallback_Parcel(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda16
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (attachAppLovinSdk) obj};
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1655421908, iIAuthTabCallback3, 1655421944, objArr, iIAuthTabCallback2);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageServiceStubProxy.get(6), isMuted.onWarmupCompleted(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf6, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
                return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback4, -362377650, iIAuthTabCallback3, 362377712, new Object[]{(attachAppLovinSdk) obj}, iIAuthTabCallback2);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageServiceStubProxy.get(8), isMuted.onWarmupCompleted(isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), fValueOf7, fValueOf, (Function1) null, 4, (Object) null), fValueOf5, fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), fValueOf8, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onExtraCallbackWithResult((attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null);
        isFireOS isfireosOnWarmupCompleted4 = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{this.IPostMessageService_Parcel.get(3), isMuted.onNavigationEvent(isMuted.onTransact(isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageServiceDefault() / 2.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.ICustomTabsCallbackDefault(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda20
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onMinimized(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda21
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.onExtraCallbackWithResult(this.f$0, (attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null);
        GradientButtonView gradientButtonView = setcacert.read;
        Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, onnavigationevent, CollectionsKt.listOf(new isFireOS[]{isfireosOnWarmupCompleted, isfireosOnWarmupCompleted2, isfireosOnWarmupCompleted3, isfireosOnWarmupCompleted4, (Rally) RallysKt.onWarmupCompleted(new Object[]{gradientButtonView, isMuted.onNavigationEvent(isMuted.onTransact(isMuted.onExtraCallback(isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), Float.valueOf(IPostMessageServiceDefault() / 2.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda22
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.writeTypedObject(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf3, fValueOf2, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda23
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.asBinder(this.f$0, (attachAppLovinSdk) obj);
            }
        }), fValueOf4, fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda25
            public final Object invoke(Object obj) {
                return PasswordNeo4D1AFragment.asInterface(this.f$0, (attachAppLovinSdk) obj);
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVar, (Integer) null, (Boolean) null, 180, 1000L, true, 441, (Object) null);
        int i2 = RatingCompatStarStyle + 35;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        return runonuithreaddelayedOnWarmupCompleted;
    }

    private static final Unit mayLaunchUrl(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat1 + 97;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -314652079, iIAuthTabCallback2, 314652092, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
            i = 7015;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, -314652079, iIAuthTabCallback5, 314652092, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4));
            i = 600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 43;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsService(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 109;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackDefault());
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 69;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit receiveFile(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        Unit unit;
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 39;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackStub());
            unit = Unit.INSTANCE;
            int i3 = 60 / 0;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackStub());
            unit = Unit.INSTANCE;
        }
        int i4 = RatingCompat1 + 25;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 45;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 81;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 100;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 121;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat1 + 39;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 122;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 100;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 37;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 115;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -314652079, iIAuthTabCallback2, 314652092, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
            i = 16240;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, -314652079, iIAuthTabCallback5, 314652092, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4));
            i = 600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 67;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsServiceStub(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 59;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackDefault());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackDefault());
        Unit unit2 = Unit.INSTANCE;
        int i3 = RatingCompatStarStyle + 87;
        RatingCompat1 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit updateVisuals(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 39;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 3;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i2 = 2 % 2;
        int i3 = RatingCompat1 + 29;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 81;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 100;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 67;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access000(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 11;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 86;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 100;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 59;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit newSession(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 9;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -314652079, iIAuthTabCallback2, 314652092, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
            i = 1645;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, -314652079, iIAuthTabCallback5, 314652092, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4));
            i = 600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static final Unit postMessage(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 79;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackDefault());
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 77;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 115;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackStub());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackStub());
        Unit unit2 = Unit.INSTANCE;
        int i3 = RatingCompat1 + 37;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 123;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(100);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 11;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 115;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 121;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 100;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 51;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit newAuthTabSession(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat1 + 83;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -314652079, iIAuthTabCallback2, 314652092, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
            i = 24745;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, -314652079, iIAuthTabCallback5, 314652092, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4));
            i = 600;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 19;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit prefetch(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 47;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackDefault());
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 41;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object prefetchWithMultipleUrls(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 99;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackStub());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackStub());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit prefetchWithMultipleUrls(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 121;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -314652079, iIAuthTabCallback2, 314652092, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(600);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 1;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 75;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackDefault());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackDefault());
        Unit unit2 = Unit.INSTANCE;
        int i3 = RatingCompatStarStyle + 67;
        RatingCompat1 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit setEngagementSignalsCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 113;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(passwordNeo4D1AFragment.ITrustedWebActivityCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 101;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return unit;
    }

    private final ValueAnimator onExtraCallbackWithResult(long j, final String str, final View... viewArr) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 77;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        long jIAuthTabCallback = ((deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1675654661, _string.onNavigationEvent.IAuthTabCallback(), 1675654680, new Object[]{this}, iIAuthTabCallback)).IAuthTabCallback();
        final Interpolator interpolator = (Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.12f), Float.valueOf(0.0f), Float.valueOf(0.39f), Float.valueOf(0.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        float f = jIAuthTabCallback;
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        final float fIAuthTabCallback = f / ((deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback4, -1675654661, iIAuthTabCallback3, 1675654680, new Object[]{this}, iIAuthTabCallback2)).IAuthTabCallback();
        final float f2 = f / 600.0f;
        final float fIAuthTabCallback2 = f / ITrustedWebActivityCallbackStub().IAuthTabCallback();
        final float fIAuthTabCallback3 = f / ITrustedWebActivityCallbackDefault().IAuthTabCallback();
        final float fIPostMessageServiceDefault = IPostMessageServiceDefault() / 2.0f;
        for (View view : viewArr) {
            int i4 = RatingCompat1 + 9;
            RatingCompatStarStyle = i4 % 128;
            int i5 = i4 % 2;
            view.setAlpha(0.0f);
            view.setTranslationY(fIPostMessageServiceDefault);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float f3 = 90.0f;
        final float f4 = 1.5f;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda81
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PasswordNeo4D1AFragment.onWarmupCompleted(this.f$0, fIAuthTabCallback, interpolator, f2, fIAuthTabCallback2, fIAuthTabCallback3, viewArr, fIPostMessageServiceDefault, str, f3, f4, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(jIAuthTabCallback);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        int i6 = RatingCompatStarStyle + 29;
        RatingCompat1 = i6 % 128;
        if (i6 % 2 == 0) {
            return valueAnimatorOfFloat;
        }
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws Throwable {
        int i;
        int i2;
        float f;
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i3 = 2;
        Interpolator interpolator = (Interpolator) objArr[2];
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        float fFloatValue3 = ((Number) objArr[4]).floatValue();
        float fFloatValue4 = ((Number) objArr[5]).floatValue();
        View[] viewArr = (View[]) objArr[6];
        float fFloatValue5 = ((Number) objArr[7]).floatValue();
        String str = (String) objArr[8];
        float fFloatValue6 = ((Number) objArr[9]).floatValue();
        float fFloatValue7 = ((Number) objArr[10]).floatValue();
        int i4 = 11;
        ValueAnimator valueAnimator = (ValueAnimator) objArr[11];
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue8 = ((Float) animatedValue).floatValue();
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        float interpolation = ((deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1675654661, iIAuthTabCallback2, 1675654680, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).getInterpolation(Math.min(1.0f, fFloatValue * fFloatValue8));
        float interpolation2 = interpolator.getInterpolation(Math.min(1.0f, fFloatValue2 * fFloatValue8));
        float interpolation3 = passwordNeo4D1AFragment.ITrustedWebActivityCallbackStub().getInterpolation(Math.min(1.0f, fFloatValue3 * fFloatValue8));
        float interpolation4 = passwordNeo4D1AFragment.ITrustedWebActivityCallbackDefault().getInterpolation(Math.min(1.0f, fFloatValue8 * fFloatValue4));
        int length = viewArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = RatingCompatStarStyle + i4;
            RatingCompat1 = i7 % 128;
            int i8 = i7 % i3;
            View view = viewArr[i6];
            if (view.getVisibility() != 0) {
                i = 0;
                view.setVisibility(0);
            } else {
                i = 0;
            }
            int i9 = length;
            View[] viewArr2 = viewArr;
            Object[] objArr2 = new Object[1];
            b(12 - ImageFormat.getBitsPerPixel(i), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 524 - Gravity.getAbsoluteGravity(i, i), objArr2);
            if (Intrinsics.areEqual(str, ((String) objArr2[0]).intern())) {
                int i10 = RatingCompat1;
                int i11 = i10 + 11;
                RatingCompatStarStyle = i11 % 128;
                i2 = 2;
                if (i11 % 2 == 0) {
                    float f2 = passwordNeo4D1AFragment.IPostMessageServiceStub;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                f = passwordNeo4D1AFragment.IPostMessageServiceStub;
                int i12 = i10 + 95;
                RatingCompatStarStyle = i12 % 128;
                int i13 = i12 % 2;
            } else {
                i2 = 2;
                f = 0.0f;
            }
            view.setTranslationY((fFloatValue5 - (fFloatValue5 * interpolation)) + f);
            view.setAlpha(interpolation2);
            view.setRotationX(fFloatValue6 - (fFloatValue6 * interpolation3));
            float f3 = fFloatValue7 - (0.5f * interpolation4);
            view.setScaleX(f3);
            view.setScaleY(f3);
            i6++;
            i3 = i2;
            viewArr = viewArr2;
            length = i9;
            i4 = 11;
        }
        return null;
    }

    private static final void onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 121;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        if (onRenderReady.IAuthTabCallback(passwordNeo4D1AFragment)) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            setcacert.getSmallIconBitmap.onWarmupCompleted(AuthPinBackgroundView.onNavigationEvent.SPREAD, ((Float) animatedValue).floatValue());
            return;
        }
        int i4 = RatingCompatStarStyle + 59;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r7 = r12.getAnimatedValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7, "");
        r7 = ((java.lang.Float) r7).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r7 > r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r11 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle + 33;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if ((r11 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r2 = new java.lang.Object[]{r10.getSmallIconBitmap, im.toss.uikit.widget.gl.AuthPinBackgroundView.onNavigationEvent.SPREAD, java.lang.Float.valueOf(r9.getInterpolation(r7 - r8))};
        im.toss.uikit.widget.gl.AuthPinBackgroundView.onExtraCallbackWithResult(com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, r2, com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        r2 = new java.lang.Object[]{r10.getSmallIconBitmap, im.toss.uikit.widget.gl.AuthPinBackgroundView.onNavigationEvent.SPREAD, java.lang.Float.valueOf(r9.getInterpolation(r7 / r8))};
        im.toss.uikit.widget.gl.AuthPinBackgroundView.onExtraCallbackWithResult(com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, r2, com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        r2 = new java.lang.Object[]{r10.getSmallIconBitmap, im.toss.uikit.widget.gl.AuthPinBackgroundView.onNavigationEvent.SPREAD, java.lang.Float.valueOf(1.0f - r11.getInterpolation((r7 - r8) / (1.0f - r8)))};
        im.toss.uikit.widget.gl.AuthPinBackgroundView.onExtraCallbackWithResult(com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, r2, com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (o.onRenderReady.IAuthTabCallback(r7) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (o.onRenderReady.IAuthTabCallback(r7) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r7 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 + 71;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r7 % 128;
        r7 = r7 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onExtraCallback(viva.republica.toss.password.PasswordNeo4D1AFragment r7, float r8, android.view.animation.Interpolator r9, o.setCACert r10, android.view.animation.Interpolator r11, android.animation.ValueAnimator r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r1 = r1 + 37
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            boolean r7 = o.onRenderReady.IAuthTabCallback(r7)
            r1 = 69
            int r1 = r1 / 0
            if (r7 != 0) goto L31
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            boolean r7 = o.onRenderReady.IAuthTabCallback(r7)
            if (r7 != 0) goto L31
        L27:
            int r7 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r7 = r7 + 71
            int r8 = r7 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r8
            int r7 = r7 % r0
            return
        L31:
            java.lang.Object r7 = r12.getAnimatedValue()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r2)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            int r12 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r12 > 0) goto La3
            int r11 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle
            int r11 = r11 + 33
            int r12 = r11 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r12
            int r11 = r11 % r0
            if (r11 == 0) goto L78
            float r7 = r7 - r8
            float r7 = r9.getInterpolation(r7)
            im.toss.uikit.widget.gl.AuthPinBackgroundView r8 = r10.getSmallIconBitmap
            im.toss.uikit.widget.gl.AuthPinBackgroundView$onNavigationEvent r9 = im.toss.uikit.widget.gl.AuthPinBackgroundView.onNavigationEvent.SPREAD
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r9, r7}
            int r0 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            int r3 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            int r6 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            int r4 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            r1 = 1302876685(0x4da8520d, float:3.529937E8)
            r5 = -1302876684(0xffffffffb257adf4, float:-1.25541995E-8)
            im.toss.uikit.widget.gl.AuthPinBackgroundView.onExtraCallbackWithResult(r0, r1, r2, r3, r4, r5, r6)
            return
        L78:
            float r7 = r7 / r8
            float r7 = r9.getInterpolation(r7)
            im.toss.uikit.widget.gl.AuthPinBackgroundView r8 = r10.getSmallIconBitmap
            im.toss.uikit.widget.gl.AuthPinBackgroundView$onNavigationEvent r9 = im.toss.uikit.widget.gl.AuthPinBackgroundView.onNavigationEvent.SPREAD
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r9, r7}
            int r0 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            int r3 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            int r6 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            int r4 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            r1 = 1302876685(0x4da8520d, float:3.529937E8)
            r5 = -1302876684(0xffffffffb257adf4, float:-1.25541995E-8)
            im.toss.uikit.widget.gl.AuthPinBackgroundView.onExtraCallbackWithResult(r0, r1, r2, r3, r4, r5, r6)
            return
        La3:
            float r7 = r7 - r8
            r9 = 1065353216(0x3f800000, float:1.0)
            float r8 = r9 - r8
            float r7 = r7 / r8
            float r7 = r11.getInterpolation(r7)
            im.toss.uikit.widget.gl.AuthPinBackgroundView r8 = r10.getSmallIconBitmap
            im.toss.uikit.widget.gl.AuthPinBackgroundView$onNavigationEvent r10 = im.toss.uikit.widget.gl.AuthPinBackgroundView.onNavigationEvent.SPREAD
            float r9 = r9 - r7
            java.lang.Float r7 = java.lang.Float.valueOf(r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r10, r7}
            int r0 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            int r3 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            int r6 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            int r4 = com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()
            r1 = 1302876685(0x4da8520d, float:3.529937E8)
            r5 = -1302876684(0xffffffffb257adf4, float:-1.25541995E-8)
            im.toss.uikit.widget.gl.AuthPinBackgroundView.onExtraCallbackWithResult(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onExtraCallback(viva.republica.toss.password.PasswordNeo4D1AFragment, float, android.view.animation.Interpolator, o.setCACert, android.view.animation.Interpolator, android.animation.ValueAnimator):void");
    }

    private final ValueAnimator RatingCompatStyle() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 121;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.4f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda68
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PasswordNeo4D1AFragment.onWarmupCompleted(this.f$0, setcacertIEngagementSignalsCallback, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(IPostMessageServiceStubProxy().IAuthTabCallback());
        valueAnimatorOfFloat.setInterpolator(IPostMessageServiceStubProxy());
        valueAnimatorOfFloat.start();
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        final Interpolator interpolator = (Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{this}, iIAuthTabCallback);
        final Interpolator interpolator2 = (Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(0.89f), Float.valueOf(1.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float f = 0.21052632f;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda69
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PasswordNeo4D1AFragment.onWarmupCompleted(this.f$0, f, interpolator, setcacertIEngagementSignalsCallback, interpolator2, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.setDuration(3800L);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        Intrinsics.checkNotNull(valueAnimatorOfFloat2);
        valueAnimatorOfFloat2.addListener(new IAuthTabCallbackStub(setcacertIEngagementSignalsCallback));
        valueAnimatorOfFloat2.start();
        int i4 = RatingCompatStarStyle + 7;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return valueAnimatorOfFloat2;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        final PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 11;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        final setCACert setcacertIEngagementSignalsCallback = passwordNeo4D1AFragment.IEngagementSignalsCallback();
        Object obj = null;
        if (setcacertIEngagementSignalsCallback == null) {
            int i4 = RatingCompatStarStyle + 7;
            RatingCompat1 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        final deprecated_dns deprecated_dnsVar = new deprecated_dns(200.0d, 40.0d);
        long jMax = Math.max(deprecated_dnsVar.IAuthTabCallback(), 600);
        float f = jMax;
        final float fIAuthTabCallback = f / deprecated_dnsVar.IAuthTabCallback();
        final float f2 = f / 600.0f;
        Intrinsics.checkNotNullExpressionValue(passwordNeo4D1AFragment.getResources().getDisplayMetrics(), "");
        final float fOnNavigationEvent = varyMatches.onNavigationEvent(10, r4) / passwordNeo4D1AFragment.ITrustedWebActivityCallback();
        float fIPostMessageServiceDefault = (passwordNeo4D1AFragment.IPostMessageServiceDefault() * 0.14999998f) / 2.0f;
        float fITrustedWebActivityCallback = (passwordNeo4D1AFragment.ITrustedWebActivityCallback() * 0.14999998f) / 2.0f;
        ValueAnimator valueAnimator = passwordNeo4D1AFragment.ICustomTabsCallbackStub;
        if (valueAnimator != null) {
            int i6 = RatingCompatStarStyle + 53;
            RatingCompat1 = i6 % 128;
            if (i6 % 2 != 0) {
                valueAnimator.cancel();
                obj.hashCode();
                throw null;
            }
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ValueAnimator.setFrameDelay(16L);
        final float f3 = 0.85f;
        final float f4 = 0.4f;
        final float f5 = fIPostMessageServiceDefault - fITrustedWebActivityCallback;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda47
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PasswordNeo4D1AFragment.onExtraCallback(deprecated_dnsVar, fIAuthTabCallback, passwordNeo4D1AFragment, f2, setcacertIEngagementSignalsCallback, f3, f4, f5, fOnNavigationEvent, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.setDuration(jMax);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        passwordNeo4D1AFragment.ICustomTabsCallbackStub = valueAnimatorOfFloat;
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(deprecated_dns deprecated_dnsVar, float f, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f2, setCACert setcacert, float f3, float f4, float f5, float f6, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 115;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float interpolation = deprecated_dnsVar.getInterpolation(Math.min(1.0f, f * fFloatValue));
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        float interpolation2 = ((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).getInterpolation(Math.min(1.0f, f2 * fFloatValue));
        Object[] objArr = {setcacert.getSmallIconBitmap, Float.valueOf(interpolation2)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 792103246, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -792103239, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        setcacert.getSmallIconBitmap.IAuthTabCallback(passwordNeo4D1AFragment.newSessionWithExtras * interpolation2);
        AuthPinBackgroundView authPinBackgroundView = setcacert.getSmallIconBitmap;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent = AuthPinBackgroundView.onNavigationEvent.FRAME;
        int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
        Object[] objArr2 = {authPinBackgroundView, onnavigationevent, Float.valueOf(((Float) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 1142841783, iIAuthTabCallback5, -1142841737, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4)).floatValue() * interpolation2)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr3 = {setcacert.getSmallIconBitmap, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf(interpolation2)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        float f7 = ((1.0f - f3) * (1.0f - interpolation)) + f3;
        AuthPinBackgroundView authPinBackgroundView2 = setcacert.getSmallIconBitmap;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent2 = AuthPinBackgroundView.onNavigationEvent.APP;
        Object[] objArr4 = {authPinBackgroundView2, onnavigationevent2, Float.valueOf(((1.0f - f4) * (1.0f - interpolation2)) + f4)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr4, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        setcacert.getSmallIconBitmap.onWarmupCompleted(onnavigationevent2, f7);
        setcacert.getSmallIconBitmap.onExtraCallbackWithResult(onnavigationevent, f5);
        float f8 = f7 + f6;
        setcacert.getSmallIconBitmap.onWarmupCompleted(onnavigationevent, f8);
        setcacert.getSmallIconBitmap.onWarmupCompleted(onnavigationevent, f8);
        if (setcacert.getSmallIconBitmap.onNavigationEvent() == null) {
            setcacert.getSmallIconBitmap.onWarmupCompleted(fFloatValue);
            return;
        }
        int i4 = RatingCompat1 + 89;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        setcacert.getSmallIconBitmap.onWarmupCompleted(interpolation2);
        int i6 = RatingCompat1 + 35;
        RatingCompatStarStyle = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Unit ComponentActivity() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.ComponentActivity():kotlin.Unit");
    }

    private static final void onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 81;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            passwordNeo4D1AFragment.ITrustedWebActivityService = ((Float) animatedValue).floatValue();
            passwordNeo4D1AFragment.ResultReceiver1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        passwordNeo4D1AFragment.ITrustedWebActivityService = ((Float) animatedValue2).floatValue();
        passwordNeo4D1AFragment.ResultReceiver1();
        int i3 = RatingCompat1 + 97;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
        }
    }

    private final Unit ResultReceiver1() {
        int i = 2 % 2;
        setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        int i2 = RatingCompat1 + 5;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        setcacertIEngagementSignalsCallback.MediaDescriptionCompat.setTextColor(cancelNotification().IAuthTabCallback(this.ITrustedWebActivityService).intValue());
        setcacertIEngagementSignalsCallback.MediaBrowserCompatMediaItem.setAlpha((1.0f - this.ITrustedWebActivityService) * this.MediaMetadataCompat);
        setcacertIEngagementSignalsCallback.AudioAttributesImplBaseParcelizer.setAlpha(this.ITrustedWebActivityService * this.MediaMetadataCompat);
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        if (((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1112973365, iIAuthTabCallback2, 1112973424, new Object[]{this}, iIAuthTabCallback)).booleanValue()) {
            Object[] objArr = {setcacertIEngagementSignalsCallback.getSmallIconBitmap, AuthPinBackgroundView.onNavigationEvent.ERROR, Float.valueOf(Math.max(this.ITrustedWebActivityService, this.extraCommand * 2.0f))};
            AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            float f = this.ITrustedWebActivityService;
            float f2 = this.mayLaunchUrl;
            if (f < f2) {
                int i4 = RatingCompatStarStyle + 67;
                RatingCompat1 = i4 % 128;
                if (i4 % 2 != 0) {
                    Object[] objArr2 = {setcacertIEngagementSignalsCallback.getSmallIconBitmap, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf(2.0f)};
                    AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                } else {
                    Object[] objArr3 = {setcacertIEngagementSignalsCallback.getSmallIconBitmap, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf(1.0f)};
                    AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                }
                int i5 = RatingCompat1 + 73;
                RatingCompatStarStyle = i5 % 128;
                int i6 = i5 % 2;
            } else {
                Object[] objArr4 = {setcacertIEngagementSignalsCallback.getSmallIconBitmap, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf((1.0f - f) * (1.0f / (1.0f - f2)))};
                AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr4, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            }
        } else {
            setcacertIEngagementSignalsCallback.getSmallIconBitmap.onExtraCallback(AuthPinBackgroundView.onNavigationEvent.BACKGROUND, 1.0f - this.ITrustedWebActivityService);
        }
        if (this.IPostMessageServiceDefault) {
            setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.setAlpha(1.0f - this.ITrustedWebActivityService);
            setcacertIEngagementSignalsCallback.onExtraCallbackWithResult.setAlpha(this.ITrustedWebActivityService);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Unit onNavigationEvent(final boolean r38) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onNavigationEvent(boolean):kotlin.Unit");
    }

    static /* synthetic */ Unit onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = RatingCompat1;
        int i4 = i3 + 37;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 103;
            RatingCompatStarStyle = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        return passwordNeo4D1AFragment.onNavigationEvent(z);
    }

    private static final Unit onExtraCallbackWithResult(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f) {
        AnimateText animateText;
        float f2;
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 103;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            setcacert.MediaDescriptionCompat.setTextColor(passwordNeo4D1AFragment.cancelNotification().IAuthTabCallback(f).intValue());
            setcacert.MediaBrowserCompatMediaItem.setAlpha((2.0f - f) * passwordNeo4D1AFragment.MediaMetadataCompat);
            animateText = setcacert.AudioAttributesImplBaseParcelizer;
            f2 = f % passwordNeo4D1AFragment.MediaMetadataCompat;
        } else {
            setcacert.MediaDescriptionCompat.setTextColor(passwordNeo4D1AFragment.cancelNotification().IAuthTabCallback(f).intValue());
            setcacert.MediaBrowserCompatMediaItem.setAlpha((1.0f - f) * passwordNeo4D1AFragment.MediaMetadataCompat);
            animateText = setcacert.AudioAttributesImplBaseParcelizer;
            f2 = f * passwordNeo4D1AFragment.MediaMetadataCompat;
        }
        animateText.setAlpha(f2);
        Unit unit = Unit.INSTANCE;
        int i3 = RatingCompat1 + 65;
        RatingCompatStarStyle = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onSessionEnded(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 61;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(600);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 29;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onTransact(viva.republica.toss.password.PasswordNeo4D1AFragment r21, o.setCACert r22, float r23) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.onTransact(viva.republica.toss.password.PasswordNeo4D1AFragment, o.setCACert, float):kotlin.Unit");
    }

    private static final Unit onVerticalScrollEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 7;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(1200);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 41;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallbackDefault(viva.republica.toss.password.PasswordNeo4D1AFragment r3, o.setCACert r4, float r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1
            int r1 = r1 + 73
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            boolean r3 = r3.IPostMessageServiceDefault
            r1 = 75
            int r1 = r1 / 0
            if (r3 == 0) goto L28
            goto L1b
        L17:
            boolean r3 = r3.IPostMessageServiceDefault
            if (r3 == 0) goto L28
        L1b:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r4.ICustomTabsService_Parcel
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r5
            r3.setAlpha(r1)
            android.view.View r3 = r4.onExtraCallbackWithResult
            r3.setAlpha(r5)
        L28:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            int r4 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle
            int r4 = r4 + 11
            int r5 = r4 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L36
            return r3
        L36:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.IAuthTabCallbackDefault(viva.republica.toss.password.PasswordNeo4D1AFragment, o.setCACert, float):kotlin.Unit");
    }

    private static final Unit IEngagementSignalsCallbackDefault(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 49;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(1200);
        attachapplovinsdk.onExtraCallback(200);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 115;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[PHI: r6
      0x0031: PHI (r6v5 o.TextFieldPressGestureFilterKtExternalSyntheticLambda0) = 
      (r6v4 o.TextFieldPressGestureFilterKtExternalSyntheticLambda0)
      (r6v6 o.TextFieldPressGestureFilterKtExternalSyntheticLambda0)
     binds: [B:8:0x002f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object isEngagementSignalsApiAvailable(java.lang.Object[] r21) {
        /*
            r0 = 0
            r1 = r21[r0]
            viva.republica.toss.password.PasswordNeo4D1AFragment r1 = (viva.republica.toss.password.PasswordNeo4D1AFragment) r1
            r2 = 1
            r3 = r21[r2]
            o.setCACert r3 = (o.setCACert) r3
            r4 = 2
            r5 = r21[r4]
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            int r6 = r4 % r4
            int r6 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle
            int r6 = r6 + 83
            int r7 = r6 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r7
            int r6 = r6 % r4
            r7 = 0
            if (r6 == 0) goto L2b
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r6 = o.onRenderReady.onWarmupCompleted(r1)
            r8 = 32
            int r8 = r8 / r0
            if (r6 == 0) goto L3e
            goto L31
        L2b:
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r6 = o.onRenderReady.onWarmupCompleted(r1)
            if (r6 == 0) goto L3e
        L31:
            r8 = r6
            r9 = 0
            r10 = 0
            viva.republica.toss.password.PasswordNeo4D1AFragment$IAuthTabCallbackStubProxy r11 = new viva.republica.toss.password.PasswordNeo4D1AFragment$IAuthTabCallbackStubProxy
            r11.<init>(r5, r1, r7)
            r12 = 3
            r13 = 0
            o.maybeUpdateAnimatable.onNavigationEvent(r8, r9, r10, r11, r12, r13)
        L3e:
            java.lang.Object[] r19 = new java.lang.Object[]{r1}
            int r20 = o._string.onNavigationEvent.IAuthTabCallback()
            int r17 = o._string.onNavigationEvent.IAuthTabCallback()
            int r15 = o._string.onNavigationEvent.IAuthTabCallback()
            int r14 = o._string.onNavigationEvent.IAuthTabCallback()
            r18 = 1112973424(0x4256a070, float:53.656677)
            r16 = -1112973365(0xffffffffbda95fcb, float:-0.08270224)
            java.lang.Object r0 = onExtraCallbackWithResult(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ r2
            if (r0 == 0) goto L80
            int r0 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle
            int r0 = r0 + 53
            int r1 = r0 % 128
            viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 = r1
            int r0 = r0 % r4
            if (r0 != 0) goto L78
            im.toss.uikit.widget.GradientButtonView r0 = r3.read
            im.toss.uikit.widget.GradientButtonView$onExtraCallback r1 = im.toss.uikit.widget.GradientButtonView.onExtraCallback.NORMAL
            r0.setState(r1)
            goto L80
        L78:
            im.toss.uikit.widget.GradientButtonView r0 = r3.read
            im.toss.uikit.widget.GradientButtonView$onExtraCallback r1 = im.toss.uikit.widget.GradientButtonView.onExtraCallback.NORMAL
            r0.setState(r1)
            throw r7
        L80:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.isEngagementSignalsApiAvailable(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit writeTypedList(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 75;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(200);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 3;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 37;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        setcacert.access000.setAlpha(f);
        setcacert.asInterface.setAlpha(f);
        setcacert.onTransact.setAlpha(f);
        setcacert.IAuthTabCallbackStub.setAlpha(f);
        setcacert.RatingCompatStarStyle.setAlpha(f);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 75;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IEngagementSignalsCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 75;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
            i = 73;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 1707222315, iIAuthTabCallback5, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4));
            i = 50;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 57;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(setCACert setcacert, Function0 function0) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 93;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = setcacert.ICustomTabsService_Parcel;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        AuthPinBackgroundView authPinBackgroundView = setcacert.getSmallIconBitmap;
        Intrinsics.checkNotNullExpressionValue(authPinBackgroundView, "");
        authPinBackgroundView.setVisibility(8);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 105;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallbackStubProxy(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 123;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = passwordNeo4D1AFragment.getActivity();
        if (activity != null) {
            int i4 = RatingCompatStarStyle + 19;
            RatingCompat1 = i4 % 128;
            int i5 = i4 % 2;
            activity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = RatingCompatStarStyle + 123;
        RatingCompat1 = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[PHI: r1
      0x0095: PHI (r1v54 o.runOnUiThreadDelayed) = (r1v53 o.runOnUiThreadDelayed), (r1v64 o.runOnUiThreadDelayed) binds: [B:14:0x0093, B:11:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object warmup(java.lang.Object[] r63) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.warmup(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit IAuthTabCallback(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 123;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        setcacert.getSmallIconBitmap.IAuthTabCallback(passwordNeo4D1AFragment.newSessionWithExtras * f3);
        AuthPinBackgroundView authPinBackgroundView = setcacert.getSmallIconBitmap;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent = AuthPinBackgroundView.onNavigationEvent.APP;
        authPinBackgroundView.onWarmupCompleted(onnavigationevent, 1.0f - (0.15f * f3));
        Object[] objArr = {setcacert.getSmallIconBitmap, onnavigationevent, Float.valueOf(1.0f - (f * f3))};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr2 = {setcacert.getSmallIconBitmap, AuthPinBackgroundView.onNavigationEvent.ERROR, Float.valueOf(passwordNeo4D1AFragment.ITrustedWebActivityService * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr3 = {setcacert.getSmallIconBitmap, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf((1.0f - passwordNeo4D1AFragment.ITrustedWebActivityService) * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        AuthPinBackgroundView authPinBackgroundView2 = setcacert.getSmallIconBitmap;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent2 = AuthPinBackgroundView.onNavigationEvent.FRAME;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        Object[] objArr4 = {authPinBackgroundView2, onnavigationevent2, Float.valueOf(((Float) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1142841783, iIAuthTabCallback2, -1142841737, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).floatValue() * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr4, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        setcacert.getSmallIconBitmap.onExtraCallbackWithResult(onnavigationevent2, f2 * f3);
        Object[] objArr5 = {setcacert.getSmallIconBitmap, Float.valueOf(f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 792103246, objArr5, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -792103239, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr6 = {setcacert.getSmallIconId, Float.valueOf(f3)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, iOnWarmupCompleted, 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr6);
        setcacert.getSmallIconBitmap.onWarmupCompleted(f3);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 111;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onGreatestScrollPercentageIncreased(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 45;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 65;
        RatingCompatStarStyle = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 61;
        RatingCompat1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            for (TextView textView : passwordNeo4D1AFragment.IPostMessageServiceStubProxy) {
                int i3 = RatingCompat1 + 85;
                RatingCompatStarStyle = i3 % 128;
                int i4 = i3 % 2;
                textView.setScaleX(f);
                textView.setScaleY(f);
            }
            setcacert.read.setAlpha(f);
            setcacert.read.setScaleX(f);
            setcacert.read.setScaleY(f);
            Unit unit = Unit.INSTANCE;
            int i5 = RatingCompat1 + 89;
            RatingCompatStarStyle = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        passwordNeo4D1AFragment.IPostMessageServiceStubProxy.iterator();
        obj.hashCode();
        throw null;
    }

    private static final Unit IEngagementSignalsCallbackStub(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 103;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
            i = 24525;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 1707222315, iIAuthTabCallback5, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4));
            i = 200;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 29;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 69;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        setcacert.access000.setAlpha(f);
        setcacert.ICustomTabsService_Parcel.setAlpha(f);
        setcacert.asInterface.setAlpha(f);
        setcacert.onTransact.setAlpha(f);
        setcacert.IAuthTabCallbackStub.setAlpha(f);
        setcacert.MediaDescriptionCompat.setAlpha(f);
        setcacert.RatingCompatStarStyle.setAlpha(f);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 3;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsServiceStubProxy(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 109;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(50);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 77;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback_Parcel(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 103;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        setcacert.getActiveNotifications.setAlpha(0.0f);
        setcacert.ITrustedWebActivityServiceDefault.setAlpha(0.0f);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 63;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void IAuthTabCallback(@Nullable final Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 37;
        RatingCompat1 = i2 % 128;
        if (i2 % 2 != 0) {
            IEngagementSignalsCallback();
            throw null;
        }
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback != null && !this.access200) {
            this.access200 = true;
            View view = setcacertIEngagementSignalsCallback.RatingCompat1;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback.RatingCompatStarStyle;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            GradientButtonView gradientButtonView = setcacertIEngagementSignalsCallback.read;
            Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
            gradientButtonView.setVisibility(8);
            Toolbar toolbar = setcacertIEngagementSignalsCallback.AudioAttributesImplApi21Parcelizer;
            Intrinsics.checkNotNullExpressionValue(toolbar, "");
            toolbar.setVisibility(8);
            float fIPostMessageServiceDefault = (IPostMessageServiceDefault() * 0.14999998f) / 2.0f;
            float fITrustedWebActivityCallback = (ITrustedWebActivityCallback() * 0.14999998f) / 2.0f;
            setcacertIEngagementSignalsCallback.onWarmupCompleted.onWarmupCompleted();
            setcacertIEngagementSignalsCallback.IconCompatParcelizer.setAlpha(0.0f);
            ICustomTabsServiceStub();
            runOnUiThreadDelayed runonuithreaddelayed = this.newAuthTabSession;
            if (runonuithreaddelayed != null) {
                int i3 = RatingCompatStarStyle + 45;
                RatingCompat1 = i3 % 128;
                int i4 = i3 % 2;
                runonuithreaddelayed.onNavigationEvent();
            }
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            AuthPinDotRotationView authPinDotRotationView = setcacertIEngagementSignalsCallback.getSmallIconId;
            Intrinsics.checkNotNullExpressionValue(authPinDotRotationView, "");
            final float f = 0.4f;
            final float f2 = fIPostMessageServiceDefault - fITrustedWebActivityCallback;
            Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{authPinDotRotationView, isMuted.onNavigationEvent(isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda61
                public final Object invoke(Object obj) {
                    return PasswordNeo4D1AFragment.onNavigationEvent(setcacertIEngagementSignalsCallback, this, f, f2, ((Float) obj).floatValue());
                }
            }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda62
                public final Object invoke(Object obj) {
                    Object[] objArr = {this.f$0, (attachAppLovinSdk) obj};
                    int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                    int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                    return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1625122673, iIAuthTabCallback2, 1625122684, objArr, iIAuthTabCallback);
                }
            }), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            ConstraintLayout constraintLayout2 = setcacertIEngagementSignalsCallback.onVerticalScrollEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout2, isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda63
                public final Object invoke(Object obj) {
                    return PasswordNeo4D1AFragment.onExtraCallbackWithResult(setcacertIEngagementSignalsCallback, ((Float) obj).floatValue());
                }
            }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda64
                public final Object invoke(Object obj) {
                    return PasswordNeo4D1AFragment.ICustomTabsCallback(this.f$0, (attachAppLovinSdk) obj);
                }
            }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            ConstraintLayout constraintLayout3 = setcacertIEngagementSignalsCallback.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            this.newAuthTabSession = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout3, isMuted.onNavigationEvent(new AppLovinSdkSettings(), 1.0f, 0.7f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda65
                public final Object invoke(Object obj) {
                    Object[] objArr = {this.f$0, setcacertIEngagementSignalsCallback, Float.valueOf(((Float) obj).floatValue())};
                    int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                    int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                    return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1555387362, iIAuthTabCallback2, -1555387329, objArr, iIAuthTabCallback);
                }
            }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda66
                public final Object invoke(Object obj) {
                    return PasswordNeo4D1AFragment.access100(this.f$0, (attachAppLovinSdk) obj);
                }
            }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda67
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.onExtraCallbackWithResult(this.f$0, function0);
                }
            }, 1, (Object) null), false, 1, (Object) null);
        }
        int i5 = RatingCompatStarStyle + 71;
        RatingCompat1 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onWarmupCompleted(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 17;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        setcacert.getSmallIconBitmap.IAuthTabCallback(passwordNeo4D1AFragment.newSessionWithExtras * f3);
        AuthPinBackgroundView authPinBackgroundView = setcacert.getSmallIconBitmap;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent = AuthPinBackgroundView.onNavigationEvent.APP;
        authPinBackgroundView.onWarmupCompleted(onnavigationevent, 1.0f - (0.15f * f3));
        Object[] objArr = {setcacert.getSmallIconBitmap, onnavigationevent, Float.valueOf(1.0f - (f * f3))};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr2 = {setcacert.getSmallIconBitmap, AuthPinBackgroundView.onNavigationEvent.ERROR, Float.valueOf(passwordNeo4D1AFragment.ITrustedWebActivityService * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr3 = {setcacert.getSmallIconBitmap, AuthPinBackgroundView.onNavigationEvent.BACKGROUND, Float.valueOf((1.0f - passwordNeo4D1AFragment.ITrustedWebActivityService) * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        AuthPinBackgroundView authPinBackgroundView2 = setcacert.getSmallIconBitmap;
        AuthPinBackgroundView.onNavigationEvent onnavigationevent2 = AuthPinBackgroundView.onNavigationEvent.FRAME;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        Object[] objArr4 = {authPinBackgroundView2, onnavigationevent2, Float.valueOf(((Float) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1142841783, iIAuthTabCallback2, -1142841737, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).floatValue() * f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr4, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        setcacert.getSmallIconBitmap.onExtraCallbackWithResult(onnavigationevent2, f2 * f3);
        Object[] objArr5 = {setcacert.getSmallIconBitmap, Float.valueOf(f3)};
        AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 792103246, objArr5, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -792103239, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object[] objArr6 = {setcacert.getSmallIconId, Float.valueOf(f3)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, iOnWarmupCompleted, 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr6);
        setcacert.getSmallIconBitmap.onWarmupCompleted(f3);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 39;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit isEngagementSignalsApiAvailable(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 17;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
            i = 18866;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 1707222315, iIAuthTabCallback5, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4));
            i = 300;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 57;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 63;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        setcacert.MediaDescriptionCompat.setAlpha(f);
        setcacert.onNavigationEvent.setAlpha(f);
        setcacert.onVerticalScrollEvent.setAlpha(f);
        setcacert.onTransact.setAlpha(f);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 71;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit extraCommand(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat1 + 101;
        RatingCompatStarStyle = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
            i = 28048;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 1707222315, iIAuthTabCallback5, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4));
            i = 200;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 77;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, float f) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 125;
        RatingCompatStarStyle = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            for (TextView textView : passwordNeo4D1AFragment.IPostMessageServiceStubProxy) {
                textView.setScaleX(f);
                textView.setScaleY(f);
            }
            setcacert.read.setAlpha(f);
            setcacert.read.setScaleX(f);
            setcacert.read.setScaleY(f);
            Unit unit = Unit.INSTANCE;
            int i3 = RatingCompatStarStyle + 37;
            RatingCompat1 = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        passwordNeo4D1AFragment.IPostMessageServiceStubProxy.iterator();
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsCallback_Parcel(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 71;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 21;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, Function0 function0) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 89;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted = onRenderReady.onWarmupCompleted(passwordNeo4D1AFragment);
        if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted != null) {
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(function0, passwordNeo4D1AFragment, null), 3, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 117;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsServiceDefault(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 57;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 45;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 57;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 17;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(setCACert setcacert) {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 119;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        GradientButtonView gradientButtonView = setcacert.read;
        Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
        gradientButtonView.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 9;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onNavigationEvent(@Nullable PasswordFragment.onNavigationEvent onnavigationevent, @Nullable UTF8Decoder uTF8Decoder) {
        int i;
        Typography6 typography6;
        int i2 = 2 % 2;
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback != null) {
            if (onnavigationevent == PasswordFragment.onNavigationEvent.INPUT) {
                ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1222813L, false, null, getScreenParams(), null, 22, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
            }
            if (onnavigationevent == PasswordFragment.onNavigationEvent.CONFIRM) {
                ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1223321L, false, null, getScreenParams(), null, 22, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
            }
            if (uTF8Decoder != null) {
                IAuthTabCallback(uTF8Decoder);
            }
            onWarmupCompleted(onnavigationevent);
            if (read()) {
                this.postMessage = new char[6];
                Iterator<T> it = this.validateRelationship.iterator();
                while (!(!it.hasNext())) {
                    int i3 = RatingCompatStarStyle + 117;
                    RatingCompat1 = i3 % 128;
                    int i4 = i3 % 2;
                    ((AuthPinDotView) it.next()).setVisibility(8);
                }
                ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback.AudioAttributesImplApi26Parcelizer;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(8);
                Iterator<T> it2 = this.IEngagementSignalsCallbackStubProxy.iterator();
                while (it2.hasNext()) {
                    int i5 = RatingCompat1 + 25;
                    RatingCompatStarStyle = i5 % 128;
                    ((AuthPinDotView) (i5 % 2 == 0 ? it2.next() : it2.next())).setVisibility(0);
                }
            }
            ConstraintLayout constraintLayout2 = setcacertIEngagementSignalsCallback.RatingCompatStarStyle;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            if (constraintLayout2.getVisibility() == 0) {
                setcacertIEngagementSignalsCallback.RatingCompatStarStyle.setVisibility(4);
            }
            onExtraCallbackWithResult(this.postMessage);
            Iterator<T> it3 = onVerticalScrollEvent().iterator();
            while (it3.hasNext()) {
                int i6 = RatingCompat1 + 55;
                RatingCompatStarStyle = i6 % 128;
                int i7 = i6 % 2;
                ((AuthPinDotView) it3.next()).IAuthTabCallbackStub();
            }
            setCACert setcacertIEngagementSignalsCallback2 = IEngagementSignalsCallback();
            if (setcacertIEngagementSignalsCallback2 != null && (typography6 = setcacertIEngagementSignalsCallback2.MediaDescriptionCompat) != null) {
                int i8 = RatingCompatStarStyle + 105;
                RatingCompat1 = i8 % 128;
                int i9 = i8 % 2;
                typography6.setText("");
            }
            asInterface();
            MediaSessionCompatQueueItem();
            GradientButtonView gradientButtonView = setcacertIEngagementSignalsCallback.read;
            Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
            if (gradientButtonView.getVisibility() == 0 || setcacertIEngagementSignalsCallback.read.getAlpha() == 1.0f) {
                final int height = setcacertIEngagementSignalsCallback.read.getHeight();
                runOnUiThreadDelayed runonuithreaddelayed = this.cancelNotification;
                if (runonuithreaddelayed != null) {
                    runonuithreaddelayed.onNavigationEvent();
                }
                pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
                GradientButtonView gradientButtonView2 = setcacertIEngagementSignalsCallback.read;
                Intrinsics.checkNotNullExpressionValue(gradientButtonView2, "");
                this.cancelNotification = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{gradientButtonView2, isMuted.onNavigationEvent(isMuted.onNavigationEvent(new AppLovinSdkSettings(), 0.0f, 1.0f, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda86
                    public final Object invoke(Object obj) {
                        return PasswordNeo4D1AFragment.onNavigationEvent(setcacertIEngagementSignalsCallback, this, height, ((Float) obj).floatValue());
                    }
                }, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda87
                    public final Object invoke(Object obj) {
                        return PasswordNeo4D1AFragment.onMessageChannelReady(this.f$0, (attachAppLovinSdk) obj);
                    }
                }), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda88
                    public final Object invoke(Object obj) {
                        Object[] objArr = {this.f$0, (attachAppLovinSdk) obj};
                        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                        return (Unit) PasswordNeo4D1AFragment.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -963332883, iIAuthTabCallback2, 963332886, objArr, iIAuthTabCallback);
                    }
                }, 1, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda89
                    public final Object invoke() {
                        return PasswordNeo4D1AFragment.onExtraCallback(setcacertIEngagementSignalsCallback);
                    }
                }, 1, (Object) null), false, 1, (Object) null);
            }
            PasswordFragment.onNavigationEvent onnavigationeventOnActivityResized = onActivityResized();
            if (onnavigationeventOnActivityResized == null) {
                int i10 = RatingCompatStarStyle + 25;
                RatingCompat1 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                i = -1;
            } else {
                i = onNavigationEvent.onExtraCallback[onnavigationeventOnActivityResized.ordinal()];
            }
            if (i != 1) {
                int i11 = RatingCompatStarStyle + 67;
                RatingCompat1 = i11 % 128;
                int i12 = i11 % 2;
                if (i != 2) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    onNavigationEvent(onExtraCallback(onnavigationevent, uTF8Decoder));
                    RatingCompat();
                }
            } else {
                onNavigationEvent(onExtraCallback(onnavigationevent, uTF8Decoder));
                RatingCompat();
            }
            ResultReceiverMyResultReceiver();
        }
    }

    private final Unit ResultReceiverMyRunnable() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 41;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        int i4 = RatingCompatStarStyle + 83;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        if (this.requestPostMessageChannelWithExtras) {
            ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback.onVerticalScrollEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) ((((setcacertIEngagementSignalsCallback.IconCompatParcelizer.getY() + setcacertIEngagementSignalsCallback.ITrustedWebActivityCallback.getY()) + setcacertIEngagementSignalsCallback.access000.getY()) - (onGreatestScrollPercentageIncreased() / 2.0f)) + (IEngagementSignalsCallback_Parcel() / 2.0f)), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        } else {
            ConstraintLayout constraintLayout2 = setcacertIEngagementSignalsCallback.onVerticalScrollEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), ((int) ((((setcacertIEngagementSignalsCallback.IconCompatParcelizer.getY() + setcacertIEngagementSignalsCallback.ITrustedWebActivityCallback.getY()) + setcacertIEngagementSignalsCallback.access000.getY()) - (onGreatestScrollPercentageIncreased() / 2.0f)) + (IEngagementSignalsCallback_Parcel() / 2.0f))) - M_.onExtraCallback.IAuthTabCallbackStub(), constraintLayout2.getPaddingRight(), constraintLayout2.getPaddingBottom());
        }
        return Unit.INSTANCE;
    }

    public static final class asBinder implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        final /* synthetic */ setCACert onWarmupCompleted;

        asBinder(setCACert setcacert) {
            this.onWarmupCompleted = setcacert;
        }

        public /* bridge */ void IAuthTabCallback(float f) {
            super.IAuthTabCallback(f);
        }

        public /* bridge */ void onExtraCallback(float f) {
            super.onExtraCallback(f);
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            super.onExtraCallbackWithResult(obj);
        }

        public /* bridge */ void onNavigationEvent(float f) {
            super.onNavigationEvent(f);
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            super.onWarmupCompleted(f);
        }

        public void onExtraCallbackWithResult(float f) {
            this.onWarmupCompleted.access000.setTranslationX(f);
            this.onWarmupCompleted.ICustomTabsService_Parcel.setTranslationX(f);
            this.onWarmupCompleted.onVerticalScrollEvent.setTranslationX(f);
            this.onWarmupCompleted.notifyNotificationWithChannel.setTranslationX(f);
            this.onWarmupCompleted.getSmallIconBitmap.requestRender();
        }
    }

    private static final Unit access200(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 27;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
            i = 6258;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            int iIAuthTabCallback4 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = _string.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = _string.onNavigationEvent.IAuthTabCallback();
            attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback6, 1707222315, iIAuthTabCallback5, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback4));
            i = 400;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompat1 + 35;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit ICustomTabsService_Parcel(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 5;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(100);
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback((Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback));
        attachapplovinsdk.IAuthTabCallback(500);
        Unit unit = Unit.INSTANCE;
        int i4 = RatingCompatStarStyle + 69;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onExtraCallbackWithResult(@Nullable PasswordFragment.onNavigationEvent onnavigationevent, @Nullable UTF8Decoder uTF8Decoder) {
        int i;
        Typography6 typography6;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 69;
        RatingCompat1 = i3 % 128;
        int i4 = i3 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback != null) {
            if (onnavigationevent == PasswordFragment.onNavigationEvent.INPUT) {
                int i5 = RatingCompat1 + 101;
                RatingCompatStarStyle = i5 % 128;
                ((Boolean) (i5 % 2 == 0 ? ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1222813L, true, null, getScreenParams(), null, 40, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult()) : ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1222813L, false, null, getScreenParams(), null, 22, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult()))).booleanValue();
            }
            if (onnavigationevent == PasswordFragment.onNavigationEvent.CONFIRM) {
                ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1223321L, false, null, getScreenParams(), null, 22, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
            }
            if (uTF8Decoder != null) {
                int i6 = RatingCompatStarStyle + 77;
                RatingCompat1 = i6 % 128;
                int i7 = i6 % 2;
                IAuthTabCallback(uTF8Decoder);
            }
            onWarmupCompleted(onnavigationevent);
            onExtraCallbackWithResult(this.postMessage);
            Iterator<T> it = onVerticalScrollEvent().iterator();
            while (it.hasNext()) {
                int i8 = RatingCompatStarStyle + 69;
                RatingCompat1 = i8 % 128;
                int i9 = i8 % 2;
                ((AuthPinDotView) it.next()).IAuthTabCallbackStub();
            }
            setCACert setcacertIEngagementSignalsCallback2 = IEngagementSignalsCallback();
            if (setcacertIEngagementSignalsCallback2 != null && (typography6 = setcacertIEngagementSignalsCallback2.MediaDescriptionCompat) != null) {
                typography6.setText("");
            }
            asInterface();
            TdsImageView tdsImageView = setcacertIEngagementSignalsCallback.notifyNotificationWithChannel;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(0);
            runOnUiThreadDelayed runonuithreaddelayed = this.cancelNotification;
            if (runonuithreaddelayed != null) {
                int i10 = RatingCompatStarStyle + 113;
                RatingCompat1 = i10 % 128;
                if (i10 % 2 != 0) {
                    runonuithreaddelayed.onNavigationEvent();
                    throw null;
                }
                runonuithreaddelayed.onNavigationEvent();
            }
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            Rally rallyIAuthTabCallback = RallysKt.IAuthTabCallback(new asBinder(setcacertIEngagementSignalsCallback), isMuted.IAuthTabCallback_Parcel(new AppLovinSdkSettings(), Float.valueOf((-ITrustedWebActivityCallback()) / 1.5f), fValueOf, new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda111
                public final Object invoke(Object obj) {
                    return PasswordNeo4D1AFragment.ICustomTabsCallbackStub(this.f$0, (attachAppLovinSdk) obj);
                }
            }), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
            ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            this.cancelNotification = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rallyIAuthTabCallback, (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, isMuted.onExtraCallback(new AppLovinSdkSettings(), fValueOf, Float.valueOf(1.0f), new Function1() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda112
                public final Object invoke(Object obj) {
                    return PasswordNeo4D1AFragment.extraCallback(this.f$0, (attachAppLovinSdk) obj);
                }
            }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda113
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.onNavigationEvent(setcacertIEngagementSignalsCallback);
                }
            }, 1, (Object) null), false, 1, (Object) null);
            PasswordFragment.onNavigationEvent onnavigationeventOnActivityResized = onActivityResized();
            if (onnavigationeventOnActivityResized == null) {
                i = -1;
            } else {
                i = onNavigationEvent.onExtraCallback[onnavigationeventOnActivityResized.ordinal()];
                int i11 = RatingCompat1 + 69;
                RatingCompatStarStyle = i11 % 128;
                int i12 = i11 % 2;
            }
            if (i != 1) {
                int i13 = RatingCompatStarStyle + 13;
                RatingCompat1 = i13 % 128;
                if (i13 % 2 == 0 ? i == 2 : i == 3) {
                    onNavigationEvent(onExtraCallback(onnavigationevent, uTF8Decoder));
                    RatingCompat();
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                onNavigationEvent(onExtraCallback(onnavigationevent, uTF8Decoder));
                RatingCompat();
            }
            ResultReceiverMyResultReceiver();
        }
    }

    private final boolean read() throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 9;
        RatingCompatStarStyle = i2 % 128;
        if (i2 % 2 != 0) {
            PasswordFragment.onNavigationEvent onnavigationeventOnActivityResized = onActivityResized();
            if (onnavigationeventOnActivityResized != null && onnavigationeventOnActivityResized.isChangingPassword()) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    int i3 = RatingCompat1 + 107;
                    RatingCompatStarStyle = i3 % 128;
                    int i4 = i3 % 2;
                    Object[] objArr = new Object[1];
                    b(24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16838672), ExpandableListView.getPackedPositionChild(0L) + 502, objArr);
                    if (!arguments.getBoolean(((String) objArr[0]).intern(), false)) {
                    }
                }
                return true;
            }
            return false;
        }
        onActivityResized();
        throw null;
    }

    private final int IPostMessageServiceStub() {
        int i = 2 % 2;
        if (!read()) {
            return 5;
        }
        int i2 = RatingCompat1 + 45;
        int i3 = i2 % 128;
        RatingCompatStarStyle = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        RatingCompat1 = i5 % 128;
        int i6 = i5 % 2;
        return 6;
    }

    private final List<AuthPinDotView> onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = RatingCompat1 + 23;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        if (read()) {
            int i4 = RatingCompat1 + 71;
            RatingCompatStarStyle = i4 % 128;
            int i5 = i4 % 2;
            return this.IEngagementSignalsCallbackStubProxy;
        }
        List<AuthPinDotView> list = this.validateRelationship;
        int i6 = RatingCompatStarStyle + 69;
        RatingCompat1 = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    private final List<View> IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 121;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        if (!read()) {
            return this.ICustomTabsServiceStubProxy;
        }
        List<View> list = this.ITrustedWebActivityCallbackStub;
        int i4 = RatingCompatStarStyle + 71;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return list;
    }

    private static final Unit ResultReceiver() {
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 33;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Boolean onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 121;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            function0 = new Function0() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda55
                public final Object invoke() {
                    return PasswordNeo4D1AFragment.IAuthTabCallback_Parcel();
                }
            };
            int i4 = RatingCompatStarStyle + 57;
            RatingCompat1 = i4 % 128;
            int i5 = i4 % 2;
        }
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 737881933, iIAuthTabCallback2, -737881893, new Object[]{passwordNeo4D1AFragment, function0}, iIAuthTabCallback);
    }

    private static final void onWarmupCompleted(setCACert setcacert, Function0 function0) {
        Typography6 typography6;
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompatStarStyle + 77;
        RatingCompat1 = i3 % 128;
        if (i3 % 2 != 0) {
            int[] iArr = new int[4];
            setcacert.RatingCompat.getLocationOnScreen(iArr);
            typography6 = setcacert.MediaDescriptionCompat;
            Intrinsics.checkNotNullExpressionValue(typography6, "");
            i = iArr[1];
        } else {
            int[] iArr2 = new int[2];
            setcacert.RatingCompat.getLocationOnScreen(iArr2);
            typography6 = setcacert.MediaDescriptionCompat;
            Intrinsics.checkNotNullExpressionValue(typography6, "");
            i = iArr2[1];
        }
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(typography6, i);
        function0.invoke();
        int i4 = RatingCompatStarStyle + 41;
        RatingCompat1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    private static /* synthetic */ Object postMessage(Object[] objArr) {
        PasswordNeo4D1AFragment passwordNeo4D1AFragment = (PasswordNeo4D1AFragment) objArr[0];
        final Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat1 + 3;
        RatingCompatStarStyle = i2 % 128;
        int i3 = i2 % 2;
        final setCACert setcacertIEngagementSignalsCallback = passwordNeo4D1AFragment.IEngagementSignalsCallback();
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        Boolean boolValueOf = Boolean.valueOf(setcacertIEngagementSignalsCallback.MediaDescriptionCompat.post(new Runnable() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda116
            @Override // java.lang.Runnable
            public final void run() {
                PasswordNeo4D1AFragment.IAuthTabCallback(setcacertIEngagementSignalsCallback, function0);
            }
        }));
        int i4 = RatingCompatStarStyle + 65;
        RatingCompat1 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    private final String onExtraCallback(PasswordFragment.onNavigationEvent onnavigationevent, UTF8Decoder uTF8Decoder) {
        int i;
        Integer numValueOf;
        int i2 = 2 % 2;
        if (uTF8Decoder != null) {
            String string = getString(PasswordFragment.Companion.onExtraCallbackWithResult(uTF8Decoder));
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (onnavigationevent == null) {
            int i3 = RatingCompatStarStyle + 25;
            RatingCompat1 = i3 % 128;
            i = -1;
            if (i3 % 2 != 0) {
                int i4 = 86 / 0;
            }
        } else {
            i = onNavigationEvent.onExtraCallback[onnavigationevent.ordinal()];
        }
        String string2 = null;
        if (i != 1) {
            int i5 = RatingCompat1 + 111;
            RatingCompatStarStyle = i5 % 128;
            numValueOf = (i5 % 2 != 0 ? i == 2 : i == 5) ? Integer.valueOf(viva.republica.toss.R.string.app_password_guide_neo_confirm_new_password) : null;
        } else {
            numValueOf = Integer.valueOf(viva.republica.toss.R.string.app_password_guide_neo_input_new_password);
        }
        if (numValueOf != null) {
            int i6 = RatingCompat1 + 43;
            RatingCompatStarStyle = i6 % 128;
            int i7 = i6 % 2;
            string2 = getString(numValueOf.intValue());
        }
        return string2 == null ? "" : string2;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    @Override // viva.republica.toss.password.Hilt_PasswordFragment
    public void onAttach(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        boolean z = context instanceof PasswordFragment.onExtraCallback;
        Object obj = context;
        if (!z) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null && !(parentFragment instanceof PasswordFragment.onExtraCallback)) {
                Object[] objArr = new Object[1];
                b(56 - (ViewConfiguration.getEdgeSlop() >> 16), (char) Color.alpha(0), 673 - TextUtils.indexOf("", "", 0, 0), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i2 = RatingCompatStarStyle + 25;
            RatingCompat1 = i2 % 128;
            if (i2 % 2 != 0) {
                getParentFragment();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            PasswordFragment.onExtraCallback parentFragment2 = getParentFragment();
            int i3 = RatingCompatStarStyle + 27;
            RatingCompat1 = i3 % 128;
            int i4 = i3 % 2;
            obj = parentFragment2;
        }
        this.ITrustedWebActivityCallbackStubProxy = (PasswordFragment.onExtraCallback) obj;
    }

    private final Boolean MediaDescriptionCompat() throws Throwable {
        int i = 2 % 2;
        final setCACert setcacertIEngagementSignalsCallback = IEngagementSignalsCallback();
        Object obj = null;
        if (setcacertIEngagementSignalsCallback == null) {
            return null;
        }
        GradientButtonView gradientButtonView = setcacertIEngagementSignalsCallback.read;
        Intrinsics.checkNotNullExpressionValue(gradientButtonView, "");
        if (gradientButtonView.getVisibility() == 0) {
            int i2 = RatingCompatStarStyle + 9;
            RatingCompat1 = i2 % 128;
            int i3 = i2 % 2;
            setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.setY(setcacertIEngagementSignalsCallback.read.getY() - setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.getHeight());
        } else {
            setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.setY((setcacertIEngagementSignalsCallback.getRoot().getBottom() - setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.getHeight()) - setcacertIEngagementSignalsCallback.onNavigationEvent.getPaddingBottom());
        }
        TdsImageView tdsImageView = setcacertIEngagementSignalsCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        ViewGroup.LayoutParams layoutParams = tdsImageView.getLayoutParams();
        if (layoutParams == null) {
            Object[] objArr = new Object[1];
            b((ViewConfiguration.getWindowTouchSlop() >> 8) + 72, (char) (37986 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 275, objArr);
            throw new NullPointerException(((String) objArr[0]).intern());
        }
        layoutParams.width = setcacertIEngagementSignalsCallback.asBinder.getWidth();
        layoutParams.height = setcacertIEngagementSignalsCallback.asBinder.getHeight();
        tdsImageView.setLayoutParams(layoutParams);
        TdsImageView tdsImageView2 = setcacertIEngagementSignalsCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(tdsImageView2, (int) (setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.getX() + setcacertIEngagementSignalsCallback.asBinder.getX() + setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.getPaddingLeft()), ((int) (setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.getY() + setcacertIEngagementSignalsCallback.ITrustedWebActivityCallbackStubProxy.getY())) + (!this.requestPostMessageChannelWithExtras ? -M_.onExtraCallback.IAuthTabCallbackStub() : 0), 0, 0);
        setcacertIEngagementSignalsCallback.asInterface.setPivotX(setcacertIEngagementSignalsCallback.asBinder.getWidth() / 2.0f);
        setcacertIEngagementSignalsCallback.asInterface.setPivotY(setcacertIEngagementSignalsCallback.asBinder.getHeight() / 2.0f);
        setcacertIEngagementSignalsCallback.onExtraCallbackWithResult.setY(setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.getY());
        setcacertIEngagementSignalsCallback.access000.setY(setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.getY() - setcacertIEngagementSignalsCallback.access000.getHeight());
        if (!this.requestPostMessageChannelWithExtras) {
            float height = (setcacertIEngagementSignalsCallback.AudioAttributesImplApi21Parcelizer.getHeight() + setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.getY()) / 2.0f;
            float y = setcacertIEngagementSignalsCallback.access000.getY();
            float y2 = setcacertIEngagementSignalsCallback.IconCompatParcelizer.getY();
            ScrollView scrollView = setcacertIEngagementSignalsCallback.access000;
            scrollView.setY(scrollView.getY() + (((height - y) - (setcacertIEngagementSignalsCallback.IconCompatParcelizer.getHeight() / 2.0f)) - y2));
        }
        setcacertIEngagementSignalsCallback.getSmallIconBitmap.setSpreadHeight(setcacertIEngagementSignalsCallback.ICustomTabsService_Parcel.getHeight() + M_.onExtraCallback.onWarmupCompleted());
        setcacertIEngagementSignalsCallback.IEngagementSignalsCallback.getLocationOnScreen(new int[2]);
        setcacertIEngagementSignalsCallback.getSmallIconId.onNavigationEvent(r4[1]);
        ResultReceiverMyRunnable();
        int i4 = 0;
        for (Object obj2 : this.ICustomTabsServiceStubProxy) {
            if (i4 < 0) {
                int i5 = RatingCompatStarStyle + 23;
                RatingCompat1 = i5 % 128;
                int i6 = i5 % 2;
                CollectionsKt.throwIndexOverflow();
            }
            this.validateRelationship.get(i4).setX((((View) obj2).getX() - (onGreatestScrollPercentageIncreased() / 2.0f)) + (IEngagementSignalsCallback_Parcel() / 2.0f));
            processDeepLink.onWarmupCompleted(this.validateRelationship.get(i4), getVersionCode.STRONG);
            i4++;
        }
        int i7 = 0;
        for (Object obj3 : this.ITrustedWebActivityCallbackStub) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
                int i8 = RatingCompat1 + 63;
                RatingCompatStarStyle = i8 % 128;
                int i9 = i8 % 2;
            }
            this.IEngagementSignalsCallbackStubProxy.get(i7).setX((((View) obj3).getX() - (onGreatestScrollPercentageIncreased() / 2.0f)) + (IEngagementSignalsCallback_Parcel() / 2.0f));
            processDeepLink.onWarmupCompleted(this.IEngagementSignalsCallbackStubProxy.get(i7), getVersionCode.STRONG);
            i7++;
        }
        ConstraintLayout constraintLayout = setcacertIEngagementSignalsCallback.AudioAttributesImplApi26Parcelizer;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        processDeepLink.onWarmupCompleted(constraintLayout, getVersionCode.STRONG);
        setcacertIEngagementSignalsCallback.AudioAttributesImplApi26Parcelizer.setX(setcacertIEngagementSignalsCallback.write.getX());
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        if (((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1112973365, _string.onNavigationEvent.IAuthTabCallback(), 1112973424, new Object[]{this}, iIAuthTabCallback)).booleanValue()) {
            AuthPinDotRotationView authPinDotRotationView = setcacertIEngagementSignalsCallback.getSmallIconId;
            Object[] objArr2 = new Object[1];
            b(TextUtils.lastIndexOf("", '0', 0) + 10, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Color.rgb(0, 0, 0) + 16777769, objArr2);
            authPinDotRotationView.IAuthTabCallback(Color.parseColor(((String) objArr2[0]).intern()));
        }
        onExtraCallback(this, (Function0) null, 1, (Object) null);
        MediaMetadataCompat();
        int i10 = 0;
        for (Object obj4 : this.validateRelationship) {
            int i11 = RatingCompatStarStyle + 97;
            RatingCompat1 = i11 % 128;
            int i12 = i11 % 2;
            if (i10 < 0) {
                int i13 = RatingCompat1 + 3;
                RatingCompatStarStyle = i13 % 128;
                if (i13 % 2 == 0) {
                    CollectionsKt.throwIndexOverflow();
                    obj.hashCode();
                    throw null;
                }
                CollectionsKt.throwIndexOverflow();
            }
            ((AuthPinDotView) obj4).onExtraCallback((i10 * 100) + 100);
            i10++;
        }
        for (AuthPinDotView authPinDotView : this.IEngagementSignalsCallbackStubProxy) {
            int i14 = RatingCompatStarStyle + 25;
            RatingCompat1 = i14 % 128;
            int i15 = i14 % 2;
            authPinDotView.setAlpha(0.7f);
            authPinDotView.setScaleX(1.0f);
            authPinDotView.setScaleY(1.0f);
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 30, Color.red(0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj5 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 24888 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            if (((Integer) ((Method) objOnExtraCallback2).invoke(obj5, null)).intValue() >= 2) {
                setcacertIEngagementSignalsCallback.read.IAuthTabCallbackStub();
            }
            if (ICustomTabsCallback_Parcel()) {
                int i16 = RatingCompatStarStyle + 17;
                RatingCompat1 = i16 % 128;
                if (i16 % 2 != 0) {
                    setcacertIEngagementSignalsCallback.MediaDescriptionCompat.setAlpha(1.0f);
                } else {
                    setcacertIEngagementSignalsCallback.MediaDescriptionCompat.setAlpha(0.0f);
                }
                String string = getString(viva.republica.toss.R.string.password_last_change_error_message);
                Intrinsics.checkNotNullExpressionValue(string, "");
                onNavigationEvent(string);
            }
            return Boolean.valueOf(setcacertIEngagementSignalsCallback.access000.post(new Runnable() { // from class: viva.republica.toss.password.PasswordNeo4D1AFragment$$ExternalSyntheticLambda90
                @Override // java.lang.Runnable
                public final void run() {
                    PasswordNeo4D1AFragment.onExtraCallbackWithResult(setcacertIEngagementSignalsCallback, this);
                }
            }));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final int ICustomTabsCallbackStub(PasswordNeo4D1AFragment passwordNeo4D1AFragment) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = RatingCompatStarStyle + 9;
        RatingCompat1 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        if (!((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1112973365, iIAuthTabCallback2, 1112973424, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).booleanValue()) {
            Object[] objArr = new Object[1];
            b(9 - TextUtils.getOffsetBefore("", 0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 601 - Color.green(0), objArr);
            return Color.parseColor(((String) objArr[0]).intern());
        }
        int i4 = RatingCompat1 + 33;
        RatingCompatStarStyle = i4 % 128;
        if (i4 % 2 == 0) {
            TextUtils.indexOf("", "", 1, 1);
            Object[] objArr2 = new Object[1];
            b(0, (char) (ViewConfiguration.getMaximumFlingVelocity() / 126), Color.alpha(0) + 14010, objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            b(7 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 594 - Color.alpha(0), objArr3);
            obj = objArr3[0];
        }
        int color = Color.parseColor(((String) obj).intern());
        int i5 = RatingCompat1 + 23;
        RatingCompatStarStyle = i5 % 128;
        int i6 = i5 % 2;
        return color;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0085, code lost:
    
        if (r8.requestPostMessageChannelWithExtras != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0087, code lost:
    
        r8 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 + 93;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0090, code lost:
    
        if ((r8 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        r8 = -o.M_.onExtraCallback.IAuthTabCallbackStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009a, code lost:
    
        o.M_.onExtraCallback.IAuthTabCallbackStub();
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        o.setMinWebSocketMessageToCompressokhttp.onExtraCallback(r9, r10, r7 + r8, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r0 = new java.lang.Object[1];
        b(73 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), (char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 37987), android.view.View.MeasureSpec.getMode(0) + 275, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00da, code lost:
    
        throw new java.lang.NullPointerException(((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r5 = viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompat1 + 87;
        viva.republica.toss.password.PasswordNeo4D1AFragment.RatingCompatStarStyle = r5 % 128;
        r5 = r5 % 2;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8.getResources().getDisplayMetrics(), "");
        r4.height = (int) ((r9 * (1.0f - r10)) + (o.varyMatches.onNavigationEvent(10, r5) * r10));
        r1.setLayoutParams(r4);
        r8.ResultReceiverMyRunnable();
        r9 = r7.asInterface;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
        r10 = (int) ((r7.ICustomTabsService_Parcel.getX() + r7.asBinder.getX()) + r7.ICustomTabsService_Parcel.getPaddingLeft());
        r7 = (int) (r7.ICustomTabsService_Parcel.getY() + r7.ITrustedWebActivityCallbackStubProxy.getY());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(o.setCACert r7, viva.republica.toss.password.PasswordNeo4D1AFragment r8, int r9, float r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordNeo4D1AFragment.IAuthTabCallback(o.setCACert, viva.republica.toss.password.PasswordNeo4D1AFragment, int, float):kotlin.Unit");
    }

    public static /* synthetic */ void onNavigationEvent(BaseActivity baseActivity, PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -2085849228, iIAuthTabCallback2, 2085849237, new Object[]{baseActivity, passwordNeo4D1AFragment, view}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 2043057276, iIAuthTabCallback2, -2043057268, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(setCACert setcacert, float f) {
        Object[] objArr = {setcacert, Float.valueOf(f)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 380373752, iIAuthTabCallback2, -380373718, objArr, iIAuthTabCallback);
    }

    public static /* synthetic */ String onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, String str) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (String) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1375450431, iIAuthTabCallback2, 1375450446, new Object[]{passwordNeo4D1AFragment, str}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1290906640, iIAuthTabCallback2, -1290906618, new Object[]{th}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 732775792, iIAuthTabCallback2, -732775753, new Object[]{attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ void onExtraCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        Object[] objArr = {passwordNeo4D1AFragment, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), valueAnimator};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1093237021, iIAuthTabCallback2, -1093236991, objArr, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 70318500, iIAuthTabCallback2, -70318471, new Object[]{attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -362377650, iIAuthTabCallback2, 362377712, new Object[]{attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 768513885, iIAuthTabCallback2, -768513884, new Object[]{passwordNeo4D1AFragment, commonModule_setLeftEdgeTouchEnabled}, iIAuthTabCallback);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, DialogInterface dialogInterface, int i) {
        Object[] objArr = {passwordNeo4D1AFragment, dialogInterface, Integer.valueOf(i)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1391270727, iIAuthTabCallback2, 1391270744, objArr, iIAuthTabCallback);
    }

    public static /* synthetic */ deprecated_dns newSession() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 107361454, iIAuthTabCallback2, -107361397, new Object[0], iIAuthTabCallback);
    }

    public static /* synthetic */ Unit access000(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1625122673, iIAuthTabCallback2, 1625122684, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit readTypedObject(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -888882442, iIAuthTabCallback2, 888882460, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit extraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1655421908, iIAuthTabCallback2, 1655421944, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ boolean asBinder(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1451841440, iIAuthTabCallback2, -1451841397, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).booleanValue();
    }

    public static /* synthetic */ void onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, TextView textView, setCACert setcacert, View view) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -2118307378, iIAuthTabCallback2, 2118307422, new Object[]{passwordNeo4D1AFragment, textView, setcacert, view}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, float f) {
        Object[] objArr = {passwordNeo4D1AFragment, setcacert, Float.valueOf(f)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1555387362, iIAuthTabCallback2, -1555387329, objArr, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1428466924, iIAuthTabCallback2, -1428466889, new Object[]{attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ int prefetchWithMultipleUrls() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return ((Integer) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1801907738, iIAuthTabCallback2, 1801907796, new Object[0], iIAuthTabCallback)).intValue();
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1337453542, iIAuthTabCallback2, 1337453603, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onUnminimized(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -963332883, iIAuthTabCallback2, 963332886, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    public static /* synthetic */ isNullSentinel ICustomTabsServiceDefault() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (isNullSentinel) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 40415631, iIAuthTabCallback2, -40415583, new Object[0], iIAuthTabCallback);
    }

    public static final /* synthetic */ void IAuthTabCallback(PasswordNeo4D1AFragment passwordNeo4D1AFragment, getPackageType getpackagetype) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1068546701, iIAuthTabCallback2, 1068546715, new Object[]{passwordNeo4D1AFragment, getpackagetype}, iIAuthTabCallback);
    }

    private static final Interpolator updateVisuals() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1080095086, iIAuthTabCallback2, 1080095140, new Object[0], iIAuthTabCallback);
    }

    private final getPackageType warmup() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (getPackageType) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -631920335, iIAuthTabCallback2, 631920360, new Object[]{this}, iIAuthTabCallback);
    }

    private final float access200() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return ((Float) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1142841783, iIAuthTabCallback2, -1142841737, new Object[]{this}, iIAuthTabCallback)).floatValue();
    }

    private final Interpolator ICustomTabsServiceStubProxy() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1707222315, iIAuthTabCallback2, -1707222292, new Object[]{this}, iIAuthTabCallback);
    }

    private final Interpolator IPostMessageService() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -314652079, iIAuthTabCallback2, 314652092, new Object[]{this}, iIAuthTabCallback);
    }

    private final deprecated_dns IPostMessageService_Parcel() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1675654661, iIAuthTabCallback2, 1675654680, new Object[]{this}, iIAuthTabCallback);
    }

    private final Pair<Integer, Integer> notifyNotificationWithChannel() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Pair) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -493510340, iIAuthTabCallback2, 493510400, new Object[]{this}, iIAuthTabCallback);
    }

    private static final void IAuthTabCallback(float f, setCACert setcacert, float f2, ValueAnimator valueAnimator) {
        Object[] objArr = {Float.valueOf(f), setcacert, Float.valueOf(f2), valueAnimator};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 81186306, iIAuthTabCallback2, -81186254, objArr, iIAuthTabCallback);
    }

    private final getPackageType ITrustedWebActivityService_Parcel() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (getPackageType) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1178383565, iIAuthTabCallback2, -1178383527, new Object[]{this}, iIAuthTabCallback);
    }

    private static final void onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 5039234, iIAuthTabCallback2, -5039207, new Object[]{passwordNeo4D1AFragment, view}, iIAuthTabCallback);
    }

    private static final Unit onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 303580120, iIAuthTabCallback2, -303580070, new Object[]{passwordNeo4D1AFragment, setDetectableSize}, iIAuthTabCallback);
    }

    private static final void onExtraCallbackWithResult(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 307423128, iIAuthTabCallback2, -307423086, new Object[]{setcacert, passwordNeo4D1AFragment, view}, iIAuthTabCallback);
    }

    private static final void onWarmupCompleted(setCACert setcacert, PasswordNeo4D1AFragment passwordNeo4D1AFragment, View view) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 759937800, iIAuthTabCallback2, -759937800, new Object[]{setcacert, passwordNeo4D1AFragment, view}, iIAuthTabCallback);
    }

    private final boolean ITrustedWebActivityServiceStubProxy() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1112973365, iIAuthTabCallback2, 1112973424, new Object[]{this}, iIAuthTabCallback)).booleanValue();
    }

    private static final Unit newSessionWithExtras(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -616115617, iIAuthTabCallback2, 616115643, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    private static final Unit requestPostMessageChannelWithExtras(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1988367551, iIAuthTabCallback2, -1988367502, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    private static final Unit requestPostMessageChannel(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -2041347218, iIAuthTabCallback2, 2041347225, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    private static final Unit warmup(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 278769267, iIAuthTabCallback2, -278769262, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 2063851798, iIAuthTabCallback2, -2063851788, new Object[]{attachapplovinsdk}, iIAuthTabCallback);
    }

    private static final Interpolator ITrustedWebActivityServiceStub() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Interpolator) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1043652653, iIAuthTabCallback2, 1043652665, new Object[0], iIAuthTabCallback);
    }

    private final void onExtraCallbackWithResult(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1068795694, iIAuthTabCallback2, 1068795735, objArr, iIAuthTabCallback);
    }

    private final void onExtraCallbackWithResult(View view, TdsCheckBoxV2View tdsCheckBoxV2View, TextView textView) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 510599629, iIAuthTabCallback2, -510599601, new Object[]{this, view, tdsCheckBoxV2View, textView}, iIAuthTabCallback);
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -323183765, iIAuthTabCallback2, 323183816, new Object[]{function1, obj}, iIAuthTabCallback);
    }

    private static final void onWarmupCompleted(PasswordNeo4D1AFragment passwordNeo4D1AFragment, DialogInterface dialogInterface, int i) {
        Object[] objArr = {passwordNeo4D1AFragment, dialogInterface, Integer.valueOf(i)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1832499762, iIAuthTabCallback2, 1832499807, objArr, iIAuthTabCallback);
    }

    private static final Unit validateRelationship(PasswordNeo4D1AFragment passwordNeo4D1AFragment, attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1833095356, iIAuthTabCallback2, -1833095324, new Object[]{passwordNeo4D1AFragment, attachapplovinsdk}, iIAuthTabCallback);
    }

    private static final Unit onTransact(setCACert setcacert) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 958392890, iIAuthTabCallback2, -958392834, new Object[]{setcacert}, iIAuthTabCallback);
    }

    private static final int onActivityLayout(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return ((Integer) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 951280190, iIAuthTabCallback2, -951280159, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback)).intValue();
    }

    private static final Unit onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -12143258, iIAuthTabCallback2, 12143264, new Object[]{passwordNeo4D1AFragment, commonModule_setLeftEdgeTouchEnabled}, iIAuthTabCallback);
    }

    private final Unit AudioAttributesImplBaseParcelizer() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1431784204, iIAuthTabCallback2, 1431784206, new Object[]{this}, iIAuthTabCallback);
    }

    private static final Unit access100(setCACert setcacert) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1816669716, iIAuthTabCallback2, 1816669763, new Object[]{setcacert}, iIAuthTabCallback);
    }

    private static final deprecated_dns PlaybackStateCompatCustomAction() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (deprecated_dns) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -190449062, iIAuthTabCallback2, 190449086, new Object[0], iIAuthTabCallback);
    }

    private final Unit ParcelableVolumeInfo() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1767635957, iIAuthTabCallback2, 1767635977, new Object[]{this}, iIAuthTabCallback);
    }

    private static final void onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, float f, Interpolator interpolator, float f2, float f3, float f4, View[] viewArr, float f5, String str, float f6, float f7, ValueAnimator valueAnimator) {
        Object[] objArr = {passwordNeo4D1AFragment, Float.valueOf(f), interpolator, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), viewArr, Float.valueOf(f5), str, Float.valueOf(f6), Float.valueOf(f7), valueAnimator};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -513801093, iIAuthTabCallback2, 513801114, objArr, iIAuthTabCallback);
    }

    private static final Pair onUnminimized(PasswordNeo4D1AFragment passwordNeo4D1AFragment) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Pair) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 1642245734, iIAuthTabCallback2, -1642245730, new Object[]{passwordNeo4D1AFragment}, iIAuthTabCallback);
    }

    private final Unit onWarmupCompleted(Function0<Unit> function0) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1682369958, iIAuthTabCallback2, 1682370011, new Object[]{this, function0}, iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallbackStub(Function0 function0) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -1392744394, iIAuthTabCallback2, 1392744449, new Object[]{function0}, iIAuthTabCallback);
    }

    private final Boolean IAuthTabCallbackDefault(Function0<Unit> function0) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (Boolean) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 737881933, iIAuthTabCallback2, -737881893, new Object[]{this, function0}, iIAuthTabCallback);
    }

    private static final Unit onNavigationEvent(PasswordNeo4D1AFragment passwordNeo4D1AFragment, setCACert setcacert, boolean z) {
        Object[] objArr = {passwordNeo4D1AFragment, setcacert, Boolean.valueOf(z)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1147100298, iIAuthTabCallback2, 1147100335, objArr, iIAuthTabCallback);
    }

    private static final void onExtraCallbackWithResult(PasswordNeo4D1AFragment passwordNeo4D1AFragment, TextView textView, setCACert setcacert, View view) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, 517013822, iIAuthTabCallback2, -517013806, new Object[]{passwordNeo4D1AFragment, textView, setcacert, view}, iIAuthTabCallback);
    }

    static void validateRelationship() {
        char[] cArr = new char[774];
        ByteBuffer.wrap("©\u0096óË\u001dm¦ñÀ\u0001mµ·<ÑVzè\u0084o!\u0091KV\u0094\u0092>\u008bXoåÔ\u000ft¨\u008bò9\u001f¯¹ÓÃtlúí¶·ÑYbâô\u0084\r)¦ó;LÍ\u0016£ø\u0006C¬%s\u0088ØRF47\u009f¤a\u0001Äº®'qöÛ ½+\u0000\u0088ê\u000bM©\u0017@úË\\ª&\u0003\u0089\u0080Sr6ã\u0098Eb3Åá¯\u000erùÔq¿Í\u0001\u0005ë\"N\u0093\u0010\u001aûû]T Ë\u008a°l.7\u008f\u0099||éÆ\u0015¨\u0010s°Õ\u001f¸\u008d\u0002kå×O@\u0011.ô¦^\u0003!í\u008bynÑ0½\u009a<}\u009eÇXªç\fQ×\u009e¹¢\u0003Cæ\u008fHX\u0013ßõL_:\"£\u0084\boõ15í½·ÖY|âå\u0084\u0010)\u0098ó=\u0095S>ÇÀoe\u0083\u000f\u0002Ð \\0\u0006^èûSZ5\u0089\u0098;Bª$×\u008fgqúÔ\u001c¾\u0080a0ËD\u00adÍ\u0010gú¿]R\u0007\u0083ê:LJ6¤\u0099kC\u008c&\u0004\u0088¨r\u0080ÕF¿îb\u0000Ä\u0096¯7\u0011øûÎ^{\u0000úë\u000bM¸0p\u009ap|Ò'x\u0089\u009al\u0001Ö¢¸øcKÅñ¨~\u0012\u0095õ(_èí\u009aí\u008dÂ¡\u0098¨v\u001eÍ\u0080«v\u0006ØÜLí¼·ÌYxâà\u0084\u0017)òós\u0095\u000f>ÇÀle\u008d\u000f\u0004Ð\u00adzË\u001c\u0012¡ôK{ì\u008b¶?[þýÍ\u0087e(³ò\t\u0097\u008c9wÃ\\dÙ\u000ejÓÇu\u0018\u001e¡ &JSï¡±sZ\u0088ü'\u0081¯+ÅÍ\u0019\u0096ú8\u000bÝÞg4\tFÒÛ\u0011fK\u0016¥¢\u001e:xÍÕ(\u000f©iÕÂ\u001d<¶\u0099WóÞ,w\u0086\u0011àÈ].·¡\u0010QJå§$\u0001\u0017{¿Ôi\u000eÓkVÅ\u00ad?\u0086\u0098\u0003ò°/\u001d\u0089Êâs\\é¶\u008a\u0013\"Mç¦]\u0000þ}i×\t1\u008bjoÄÔ!M\u009b°õ\u0082.\b\u0088½yØ#¯Í\u0002v\u009e\u0010&½Ég_\u0001,ª¸T\u0015ñú\u009b2DÄî¯\u0088~5\u0081ß\u0017xé\"ZÏ\u0092i²\u0013\u0005¼Þfl\u0003ù\u00adTWcð¼\u009a\u0013Gæár\u008a\u00824BÞ#{\u009e%\u0017Î¦hK\u0015Ð¿¦Y$\u0002\u0095¬gIöó\b\u009d<F·à\u0007\u008d\u008174Ðøz[$#Á\u009dk9\u0014ð¾y[Ï\u0005¾¯|Hªòk\u009fç9MâÃ\u008c®6>Ó\u0093}t&ËÀSj1íôí¤·ÑYbâÏ\u0084\u0011)½ó5\u0095Díµ·ÎYmâù\u0084\b)©ó>\u0095L>ÑÀGe\u0081\u000f\u0015Ð°zÀ\u001cS¡äKKì\u0094¶%[£ýÐ£'ù\\\u0017à¬gÊ\u0080g#½\u00adÛúpE\u008eä+\u0019A\u0090\u0082:ØA6ô\u008dhë\u0087F*\u009c\u008fúØQQ¯à\n\f`\u0099õÂ¯³A\u001aú\u009e\u009cc\u007fj%\u0007Ë¥p)\u0016Ì»{aö\u0007\u008e¬\u0007R\u00ad÷X`\b:gÔÛoI\tº¤'~\u0095\u0018þí½·ÖYjâü\u0084\u000b)¿ó\u0003\u0095T>ÍÀhe\u0089íµ·ÌYxâõ\u0084\t)¸ó(\u0095\u007f>×Àve\u0098í¶·ÑYcâÏ\u0084\u0005)½ó(\u0095H>ëÀae\u0082ùþ£\u0099M+ö\u0087\u0090M=õç`\u0081\u0000*£Ô3qÌ\u001b]Äïn\u008b\b+µ±_2í²·ÍYbâþ\u0084\u0001)¤ó\u0003\u0095I>ÐlE6oØÂcY\u0005\u009c¨\u0016r\u0095\u001fWE&«\u009e\u0010\u0004vãÛq\u0001Óg¨Ì42\u0091\u001d\u0081Gð©H\u0012Òt5Ù\u0087\u0003\u001feuÎð0W\u0095¿ÿ% \u0086\u008aììsQÀ»E\u001c»F\u000f«\u0097\rûwJØÈí¤·ÙY\u007fâã\u0084\u0013)§ó.\u0095D>ýÀve\u009c\u000f\u0005Ð°\u001d\u0093Gù©[\u0012ät?Ù\u0094\u0003\tewÎô0Z\u0095¬ÿ+ \u0098\u008aîíôW\u009dí÷·\u008cY9â¢\u0084')üód\u0095\u0015>öí÷·ÚYjâö\u0084\u0000)®ó8\u0095F>Òí÷·þY:â¦\u0084Q)ÿólµ\u007fï\u0007\u0001±º(Üßqq«ìÍ\u009bf\u000eí÷·üY>â¢\u0084T)ûólí÷·\u0081Y?âò\u0084\u0001)®ó:í÷·ÚY?â \u0084T)ûón\u0095\u0016>Ò©·ó\u009d\u001d\u007f¦¶À@mî·xÑ\u0006z\u0091QÑ\u000b¯åH^\u00808v\u0095\u008aO\u001bò\t¨ F\u0094ý\b\u009bü6PìÄ\u001dSG%©\u009c\u0012\u0004tðÙ]\u0003Ëe¶Îr¦Uü,\u0012\u0099©\u0000ÏõbZ¸\u009fÞ³u#3\tir\u0087Ð<ZZ¿÷8-\u0083Kîàh\u001eÄ»4Ñ°\u000e\u0019¤cÂÌ\u007f@\u0095É20h\u0082\u0085\u0011#bYÄí\u0099·ÍY\u007fâä\u0084D)¡ó1\u0095P>ØÀ}e\u0081\u000f\u0015ÐªzÜ\u001c\u001c¡ãKuì\u0094¶ [²ýÅ\u0087k(÷ò@\u0097\u00929*ÃCdÝ\u000e$Ó\u0098u\u001d\u001e² 1JVïø±0Z¥ü+\u0081¨+ÉÍB\u0096ñ8\u0018Ý\u0089gd\tGÒÎt \u0019Ò£\nD\u00adî7°IUíÿr\u0080\u0094í¤·ÊYiâæ\u00847)«ó.\u0095E>ÑÀve¢\u000f\u0011Ð©zÍ=³gÂ\u0089z2àT\u0007ùµ#=EMîÛ\u0010jµ\u008fß\u001c\u0000¿\u001c~íô·ÑY\u007fâ°\u0084\n)§ó(\u0095\u0000>ÇÀme\u009c\u000f\u0000Ð«zÚ\u001cH¡åKp".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 774);
        RatingCompatStyle = cArr;
        MediaSessionCompatQueueItem = 5678303956875392952L;
    }
}
